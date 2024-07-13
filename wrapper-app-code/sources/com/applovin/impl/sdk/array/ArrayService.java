package com.applovin.impl.sdk.array;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback;
import com.applovin.array.apphub.aidl.IAppHubService;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.a;
import com.applovin.impl.sdk.v;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class ArrayService extends IAppHubDirectDownloadServiceCallback.Stub {
    private static final int MAX_RECONNECT_RETRY_COUNT = 3;
    private static final String SERVICE_INTENT_CLASS_NAME = "com.applovin.oem.am.android.external.AppHubService";
    private static final String SERVICE_INTENT_FILTER_ACTION = "com.applovin.am.intent.action.APPHUB_SERVICE";
    private static final String TAG = "ArrayService";
    /* access modifiers changed from: private */
    public IAppHubService appHubService;
    private final Intent appHubServiceIntent;
    private long appHubVersionCode = -1;
    /* access modifiers changed from: private */
    public DirectDownloadState currentDownloadState;
    private int currentRetryCount;
    private final ArrayDataCollector dataCollector;
    private boolean isDirectDownloadEnabled;
    /* access modifiers changed from: private */
    public final v logger;
    private String randomUserToken;
    private final n sdk;

    public interface DirectDownloadListener {
        void onAppDetailsDismissed();

        void onAppDetailsDisplayed();

        void onFailure();
    }

    private static class DirectDownloadState {
        /* access modifiers changed from: private */
        public final String adToken;
        /* access modifiers changed from: private */
        public final AtomicBoolean errorCallbackInvoked = new AtomicBoolean();
        /* access modifiers changed from: private */
        public final DirectDownloadListener listener;
        /* access modifiers changed from: private */
        public final Bundle parameters;

        public DirectDownloadState(String str, Bundle bundle, DirectDownloadListener directDownloadListener) {
            this.adToken = str;
            this.parameters = bundle;
            this.listener = directDownloadListener;
        }

        /* access modifiers changed from: protected */
        public boolean canEqual(Object obj) {
            return obj instanceof DirectDownloadState;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DirectDownloadState)) {
                return false;
            }
            DirectDownloadState directDownloadState = (DirectDownloadState) obj;
            if (!directDownloadState.canEqual(this)) {
                return false;
            }
            AtomicBoolean errorCallbackInvoked2 = getErrorCallbackInvoked();
            AtomicBoolean errorCallbackInvoked3 = directDownloadState.getErrorCallbackInvoked();
            if (errorCallbackInvoked2 != null ? !errorCallbackInvoked2.equals(errorCallbackInvoked3) : errorCallbackInvoked3 != null) {
                return false;
            }
            String adToken2 = getAdToken();
            String adToken3 = directDownloadState.getAdToken();
            if (adToken2 != null ? !adToken2.equals(adToken3) : adToken3 != null) {
                return false;
            }
            Bundle parameters2 = getParameters();
            Bundle parameters3 = directDownloadState.getParameters();
            if (parameters2 != null ? !parameters2.equals(parameters3) : parameters3 != null) {
                return false;
            }
            DirectDownloadListener listener2 = getListener();
            DirectDownloadListener listener3 = directDownloadState.getListener();
            return listener2 != null ? listener2.equals(listener3) : listener3 == null;
        }

        public String getAdToken() {
            return this.adToken;
        }

        public AtomicBoolean getErrorCallbackInvoked() {
            return this.errorCallbackInvoked;
        }

        public DirectDownloadListener getListener() {
            return this.listener;
        }

        public Bundle getParameters() {
            return this.parameters;
        }

        public int hashCode() {
            AtomicBoolean errorCallbackInvoked2 = getErrorCallbackInvoked();
            int i = 43;
            int hashCode = errorCallbackInvoked2 == null ? 43 : errorCallbackInvoked2.hashCode();
            String adToken2 = getAdToken();
            int hashCode2 = ((hashCode + 59) * 59) + (adToken2 == null ? 43 : adToken2.hashCode());
            Bundle parameters2 = getParameters();
            int hashCode3 = (hashCode2 * 59) + (parameters2 == null ? 43 : parameters2.hashCode());
            DirectDownloadListener listener2 = getListener();
            int i2 = hashCode3 * 59;
            if (listener2 != null) {
                i = listener2.hashCode();
            }
            return i2 + i;
        }

        public String toString() {
            return "ArrayService.DirectDownloadState(errorCallbackInvoked=" + getErrorCallbackInvoked() + ", adToken=" + getAdToken() + ", parameters=" + getParameters() + ", listener=" + getListener() + ")";
        }
    }

    public ArrayService(n nVar) {
        this.sdk = nVar;
        this.logger = nVar.D();
        this.dataCollector = new ArrayDataCollector(nVar);
        Intent createAppHubServiceIntent = createAppHubServiceIntent();
        this.appHubServiceIntent = createAppHubServiceIntent;
        if (createAppHubServiceIntent != null) {
            bindAppHubService();
        }
        nVar.ai().a(new a() {
            public void onActivityStopped(Activity activity) {
                DirectDownloadState access$000 = ArrayService.this.currentDownloadState;
                if (ArrayService.this.isAppHubInstalled() && access$000 != null) {
                    try {
                        v unused = ArrayService.this.logger;
                        if (v.a()) {
                            ArrayService.this.logger.b(ArrayService.TAG, "Dismissing Direct Download Activity");
                        }
                        ArrayService.this.appHubService.dismissDirectDownloadAppDetails(access$000.adToken);
                        access$000.listener.onAppDetailsDismissed();
                        DirectDownloadState unused2 = ArrayService.this.currentDownloadState = null;
                    } catch (RemoteException e2) {
                        v unused3 = ArrayService.this.logger;
                        if (v.a()) {
                            ArrayService.this.logger.b(ArrayService.TAG, "Failed dismiss Direct Download Activity", e2);
                        }
                    }
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void bindAppHubService() {
        if (this.currentRetryCount <= 3) {
            if (v.a()) {
                this.logger.b(TAG, "Attempting connection to App Hub service...");
            }
            this.currentRetryCount++;
            try {
                if (!this.sdk.P().bindService(this.appHubServiceIntent, new ServiceConnection() {
                    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                        v unused = ArrayService.this.logger;
                        if (v.a()) {
                            v access$100 = ArrayService.this.logger;
                            access$100.b(ArrayService.TAG, "Connection successful: " + componentName);
                        }
                        IAppHubService unused2 = ArrayService.this.appHubService = IAppHubService.Stub.asInterface(iBinder);
                    }

                    public void onServiceDisconnected(ComponentName componentName) {
                        v unused = ArrayService.this.logger;
                        if (v.a()) {
                            v access$100 = ArrayService.this.logger;
                            access$100.e(ArrayService.TAG, "Service disconnected: " + componentName);
                        }
                        IAppHubService unused2 = ArrayService.this.appHubService = null;
                        v unused3 = ArrayService.this.logger;
                        if (v.a()) {
                            ArrayService.this.logger.e(ArrayService.TAG, "Retrying...");
                        }
                        ArrayService.this.bindAppHubService();
                    }
                }, 1) && v.a()) {
                    this.logger.e(TAG, "App Hub not available");
                }
            } catch (Throwable th) {
                if (v.a()) {
                    this.logger.b(TAG, "Failed to bind to service", th);
                }
            }
        } else if (v.a()) {
            this.logger.d(TAG, "Exceeded maximum retry count");
        }
    }

    private Intent createAppHubServiceIntent() {
        Intent intent = new Intent(SERVICE_INTENT_FILTER_ACTION);
        List<ResolveInfo> queryIntentServices = this.sdk.P().getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            intent.setClassName(queryIntentServices.get(0).serviceInfo.packageName, SERVICE_INTENT_CLASS_NAME);
            return intent;
        } else if (!v.a()) {
            return null;
        } else {
            this.logger.e(TAG, "App Hub not available");
            return null;
        }
    }

    public void collectAppHubData() {
        if (isAppHubInstalled()) {
            if (v.a()) {
                this.logger.b(TAG, "Collecting data...");
            }
            this.appHubVersionCode = this.dataCollector.maybeCollectAppHubVersionCode(this.appHubService);
            this.isDirectDownloadEnabled = this.dataCollector.maybeCollectDirectDownloadEnabled(this.appHubService);
            this.randomUserToken = this.dataCollector.maybeCollectRandomUserToken(this.appHubService);
        }
    }

    public long getAppHubVersionCode() {
        return this.appHubVersionCode;
    }

    public String getRandomUserToken() {
        return this.randomUserToken;
    }

    public boolean isAppHubInstalled() {
        return this.appHubService != null;
    }

    public boolean isDirectDownloadEnabled() {
        return this.isDirectDownloadEnabled;
    }

    public void onAppDetailsDismissed(String str) {
        if (v.a()) {
            this.logger.b(TAG, "App details dismissed");
        }
        DirectDownloadState directDownloadState = this.currentDownloadState;
        if (directDownloadState != null) {
            directDownloadState.listener.onAppDetailsDismissed();
            this.currentDownloadState = null;
        }
    }

    public void onAppDetailsShown(String str) {
        if (v.a()) {
            this.logger.b(TAG, "App details shown");
        }
        DirectDownloadState directDownloadState = this.currentDownloadState;
        if (directDownloadState != null) {
            directDownloadState.listener.onAppDetailsDisplayed();
        }
    }

    public void onDownloadStarted(String str) {
        if (v.a()) {
            this.logger.b(TAG, "Download started");
        }
    }

    public void onError(String str, String str2) {
        if (v.a()) {
            v vVar = this.logger;
            vVar.e(TAG, "Encountered error: " + str2);
        }
        DirectDownloadState directDownloadState = this.currentDownloadState;
        if (directDownloadState != null && directDownloadState.errorCallbackInvoked.compareAndSet(false, true)) {
            directDownloadState.listener.onFailure();
            this.currentDownloadState = null;
        }
    }

    public void startDirectDownloadActivity(ArrayDirectDownloadAd arrayDirectDownloadAd, DirectDownloadListener directDownloadListener) {
        if (!isAppHubInstalled()) {
            if (v.a()) {
                this.logger.e(TAG, "Cannot begin Direct Download process - service disconnected");
            }
            directDownloadListener.onFailure();
        } else if (!arrayDirectDownloadAd.isDirectDownloadEnabled()) {
            if (v.a()) {
                this.logger.e(TAG, "Cannot begin Direct Download process - missing token");
            }
            directDownloadListener.onFailure();
        } else {
            try {
                this.currentDownloadState = new DirectDownloadState(arrayDirectDownloadAd.getDirectDownloadToken(), arrayDirectDownloadAd.getDirectDownloadParameters(), directDownloadListener);
                if (v.a()) {
                    this.logger.b(TAG, "Starting Direct Download Activity");
                }
                if (this.appHubVersionCode >= 21) {
                    this.appHubService.showDirectDownloadAppDetailsWithExtra(this.currentDownloadState.adToken, this.currentDownloadState.parameters, this);
                } else {
                    this.appHubService.showDirectDownloadAppDetails(this.currentDownloadState.adToken, this);
                }
                if (v.a()) {
                    this.logger.b(TAG, "Activity started");
                }
            } catch (Throwable th) {
                if (v.a()) {
                    this.logger.b(TAG, "Failed start Direct Download Activity", th);
                }
                this.currentDownloadState = null;
                directDownloadListener.onFailure();
            }
        }
    }
}
