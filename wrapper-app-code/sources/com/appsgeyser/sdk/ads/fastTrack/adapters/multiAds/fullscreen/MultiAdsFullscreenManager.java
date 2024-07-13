package com.appsgeyser.sdk.ads.fastTrack.adapters.multiAds.fullscreen;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.appsgeyser.sdk.AppsgeyserSDK;
import com.appsgeyser.sdk.InternalEntryPoint;
import com.appsgeyser.sdk.ads.FullScreenBanner;
import com.appsgeyser.sdk.ads.IFullScreenBannerListener;
import com.appsgeyser.sdk.ads.fastTrack.adapters.multiAds.fullscreen.MultiAdsFullscreenInterface;
import com.appsgeyser.sdk.ads.fastTrack.adapters.multiAds.fullscreen.MultiAdsFullscreenManager;
import com.appsgeyser.sdk.configuration.models.AdNetworkSdkModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MultiAdsFullscreenManager {
    private Context context;
    /* access modifiers changed from: private */
    public int currentlyLoadingAdapterIndex = 0;
    /* access modifiers changed from: private */
    public final ArrayList<MultiAdsFullscreenBaseAdapter> fullscreenAdaptersArrayList;
    private final Map<String, AdNetworkSdkModel> fullscreenPlacementIdMap;
    /* access modifiers changed from: private */
    public Handler handler;
    /* access modifiers changed from: private */
    public int indexOfLoadedAdapter = -1;
    /* access modifiers changed from: private */
    public boolean loadingProcess = false;
    /* access modifiers changed from: private */
    public boolean noFullscreenAvailable = false;
    /* access modifiers changed from: private */
    public MultiAdsFullscreenInterface.FullscreenListener pendingListener;
    /* access modifiers changed from: private */
    public boolean reloadRequired = false;

    static /* synthetic */ int access$108(MultiAdsFullscreenManager multiAdsFullscreenManager) {
        int i = multiAdsFullscreenManager.currentlyLoadingAdapterIndex;
        multiAdsFullscreenManager.currentlyLoadingAdapterIndex = i + 1;
        return i;
    }

    public MultiAdsFullscreenManager(Map<String, AdNetworkSdkModel> map, Context context2, HashMap<String, String> hashMap) {
        this.fullscreenPlacementIdMap = map;
        this.context = context2;
        this.handler = new Handler(context2.getMainLooper());
        this.fullscreenAdaptersArrayList = new ArrayList<>(3);
        init(hashMap);
    }

    private void init(HashMap<String, String> hashMap) {
        for (Map.Entry next : this.fullscreenPlacementIdMap.entrySet()) {
            if (((AdNetworkSdkModel) next.getValue()).isActive()) {
                String str = (String) next.getKey();
                char c2 = 65535;
                switch (str.hashCode()) {
                    case -1892803072:
                        if (str.equals("appodealSdk")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -963943683:
                        if (str.equals("admobSdk")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case -291586939:
                        if (str.equals("unitySdk")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 958098324:
                        if (str.equals("facebookSdk")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 1314914054:
                        if (str.equals("appnextSdk")) {
                            c2 = 2;
                            break;
                        }
                        break;
                }
                if (c2 == 0) {
                    this.fullscreenAdaptersArrayList.add(new MultiAdsFullscreenAppodealAdapter(this.context, (AdNetworkSdkModel) next.getValue(), hashMap));
                } else if (c2 == 1) {
                    this.fullscreenAdaptersArrayList.add(new MultiAdsFullscreenAdmobAdapter(this.context, (AdNetworkSdkModel) next.getValue(), hashMap));
                } else if (c2 == 2) {
                    this.fullscreenAdaptersArrayList.add(new MultiAdsFullscreenAppnextAdapter(this.context, (AdNetworkSdkModel) next.getValue(), hashMap));
                } else if (c2 == 3) {
                    this.fullscreenAdaptersArrayList.add(new MultiAdsFullscreenFacebookAdapter(this.context, (AdNetworkSdkModel) next.getValue(), hashMap));
                } else if (c2 == 4) {
                    this.fullscreenAdaptersArrayList.add(new MultiAdsFullscreenUnityAdapter(this.context, (AdNetworkSdkModel) next.getValue(), hashMap));
                }
            }
        }
        if (this.fullscreenAdaptersArrayList.size() > 1) {
            Collections.sort(this.fullscreenAdaptersArrayList, $$Lambda$MultiAdsFullscreenManager$INjPyYrQSGmMxvdbvFjVyxSDuCg.INSTANCE);
        }
        loadFullscreen();
    }

    static /* synthetic */ int lambda$init$0(MultiAdsFullscreenBaseAdapter multiAdsFullscreenBaseAdapter, MultiAdsFullscreenBaseAdapter multiAdsFullscreenBaseAdapter2) {
        return multiAdsFullscreenBaseAdapter2.getPriority() - multiAdsFullscreenBaseAdapter.getPriority();
    }

    /* access modifiers changed from: private */
    public void loadFullscreen() {
        if (this.fullscreenAdaptersArrayList.size() > 0) {
            this.loadingProcess = true;
            final MultiAdsFullscreenInterface multiAdsFullscreenInterface = this.fullscreenAdaptersArrayList.get(this.currentlyLoadingAdapterIndex);
            multiAdsFullscreenInterface.setListener(new MultiAdsFullscreenInterface.FullscreenListener() {
                public void onFullscreenClicked() {
                }

                public void onFullscreenOpened() {
                }

                public void onFullscreenLoaded() {
                    MultiAdsFullscreenManager multiAdsFullscreenManager = MultiAdsFullscreenManager.this;
                    int unused = multiAdsFullscreenManager.indexOfLoadedAdapter = multiAdsFullscreenManager.currentlyLoadingAdapterIndex;
                    boolean unused2 = MultiAdsFullscreenManager.this.loadingProcess = false;
                    if (MultiAdsFullscreenManager.this.pendingListener != null) {
                        MultiAdsFullscreenInterface multiAdsFullscreenInterface = multiAdsFullscreenInterface;
                        MultiAdsFullscreenManager multiAdsFullscreenManager2 = MultiAdsFullscreenManager.this;
                        multiAdsFullscreenInterface.setListener(multiAdsFullscreenManager2.createDefaultListener(multiAdsFullscreenManager2.pendingListener));
                        MultiAdsFullscreenManager.this.pendingListener.onFullscreenLoaded();
                    }
                }

                public void onFullscreenClosed() {
                    int unused = MultiAdsFullscreenManager.this.currentlyLoadingAdapterIndex = 0;
                    int unused2 = MultiAdsFullscreenManager.this.indexOfLoadedAdapter = -1;
                    MultiAdsFullscreenInterface.FullscreenListener unused3 = MultiAdsFullscreenManager.this.pendingListener = null;
                    MultiAdsFullscreenManager.this.loadFullscreen();
                }

                public void onFullscreenError(String str) {
                    if (MultiAdsFullscreenManager.this.currentlyLoadingAdapterIndex == MultiAdsFullscreenManager.this.fullscreenAdaptersArrayList.size() - 1) {
                        boolean unused = MultiAdsFullscreenManager.this.noFullscreenAvailable = true;
                        boolean unused2 = MultiAdsFullscreenManager.this.loadingProcess = false;
                        Log.d("multiAdsTag", "No fullscreen available, blocking loads for 2 minutes");
                        if (MultiAdsFullscreenManager.this.pendingListener != null) {
                            MultiAdsFullscreenManager.this.pendingListener.onFullscreenError("No fullscreen available");
                            Log.d("multiAdsTag", "Pending request: no fullscreen available");
                            MultiAdsFullscreenInterface.FullscreenListener unused3 = MultiAdsFullscreenManager.this.pendingListener = null;
                        }
                        int unused4 = MultiAdsFullscreenManager.this.currentlyLoadingAdapterIndex = 0;
                        MultiAdsFullscreenManager.this.handler.postDelayed(new Runnable() {
                            public final void run() {
                                MultiAdsFullscreenManager.AnonymousClass1.this.lambda$onFullscreenError$0$MultiAdsFullscreenManager$1();
                            }
                        }, 120000);
                        return;
                    }
                    MultiAdsFullscreenManager.this.handler.postDelayed(new Runnable() {
                        public final void run() {
                            MultiAdsFullscreenManager.AnonymousClass1.this.lambda$onFullscreenError$1$MultiAdsFullscreenManager$1();
                        }
                    }, 500);
                }

                public /* synthetic */ void lambda$onFullscreenError$0$MultiAdsFullscreenManager$1() {
                    boolean unused = MultiAdsFullscreenManager.this.noFullscreenAvailable = false;
                    boolean unused2 = MultiAdsFullscreenManager.this.reloadRequired = true;
                    Log.d("multiAdsTag", "Fullscreen loading block disabled");
                }

                public /* synthetic */ void lambda$onFullscreenError$1$MultiAdsFullscreenManager$1() {
                    MultiAdsFullscreenManager.access$108(MultiAdsFullscreenManager.this);
                    MultiAdsFullscreenManager.this.loadFullscreen();
                }
            });
            multiAdsFullscreenInterface.loadFullscreen();
        }
    }

    /* access modifiers changed from: private */
    public MultiAdsFullscreenInterface.FullscreenListener createDefaultListener(final MultiAdsFullscreenInterface.FullscreenListener fullscreenListener) {
        return new MultiAdsFullscreenInterface.FullscreenListener() {
            public void onFullscreenLoaded() {
            }

            public void onFullscreenOpened() {
                fullscreenListener.onFullscreenOpened();
            }

            public void onFullscreenClicked() {
                fullscreenListener.onFullscreenClicked();
            }

            public void onFullscreenClosed() {
                int unused = MultiAdsFullscreenManager.this.currentlyLoadingAdapterIndex = 0;
                int unused2 = MultiAdsFullscreenManager.this.indexOfLoadedAdapter = -1;
                MultiAdsFullscreenInterface.FullscreenListener unused3 = MultiAdsFullscreenManager.this.pendingListener = null;
                MultiAdsFullscreenManager.this.loadFullscreen();
                fullscreenListener.onFullscreenClosed();
            }

            public void onFullscreenError(String str) {
                fullscreenListener.onFullscreenError(str);
                MultiAdsFullscreenInterface.FullscreenListener unused = MultiAdsFullscreenManager.this.pendingListener = null;
                MultiAdsFullscreenManager.this.loadFullscreen();
            }
        };
    }

    public void loadFullscreen(final MultiAdsFullscreenInterface.FullscreenListener fullscreenListener, String str) {
        if (this.reloadRequired) {
            this.reloadRequired = false;
            loadFullscreen();
            loadFullscreen(fullscreenListener, str);
            Log.d("multiAdsTag", "Reloading fullscreen");
        } else if (this.noFullscreenAvailable || (this.indexOfLoadedAdapter == -1 && !this.loadingProcess)) {
            Log.d("multiAdsTag", "No SDK fullscreen available at the moment, requesting HTML banner");
            AppsgeyserSDK.getFullScreenBanner(this.context).setListener(new IFullScreenBannerListener() {
                public void onLoadStarted() {
                }

                public void onLoadFinished(FullScreenBanner fullScreenBanner) {
                    MultiAdsFullscreenInterface.FullscreenListener fullscreenListener = fullscreenListener;
                    if (fullscreenListener != null) {
                        fullscreenListener.onFullscreenOpened();
                    }
                }

                public void onAdFailedToLoad(Context context, String str) {
                    MultiAdsFullscreenInterface.FullscreenListener fullscreenListener = fullscreenListener;
                    if (fullscreenListener != null) {
                        fullscreenListener.onFullscreenError("No fullscreen available at the moment");
                    }
                }

                public void onAdHided(Context context, String str) {
                    MultiAdsFullscreenInterface.FullscreenListener fullscreenListener = fullscreenListener;
                    if (fullscreenListener != null) {
                        fullscreenListener.onFullscreenClosed();
                    }
                }
            });
            InternalEntryPoint.getInstance().getFullScreenBanner(this.context).load(str);
        } else if (this.loadingProcess) {
            this.pendingListener = fullscreenListener;
        } else {
            MultiAdsFullscreenInterface multiAdsFullscreenInterface = this.fullscreenAdaptersArrayList.get(this.indexOfLoadedAdapter);
            if (multiAdsFullscreenInterface.isFullscreenLoaded()) {
                multiAdsFullscreenInterface.setListener(createDefaultListener(fullscreenListener));
                fullscreenListener.onFullscreenLoaded();
                return;
            }
            loadFullscreen();
            loadFullscreen(fullscreenListener, str);
        }
    }

    public void showFullscreen(Context context2) {
        Log.d("multiAdsTag", "indexOfLoadedAdapter = " + this.indexOfLoadedAdapter + " fullscreenAdaptersArrayList.get(indexOfLoadedAdapter).isFullscreenLoaded() = " + this.fullscreenAdaptersArrayList.get(this.indexOfLoadedAdapter).isFullscreenLoaded());
        int i = this.indexOfLoadedAdapter;
        if (i != -1 && this.fullscreenAdaptersArrayList.get(i).isFullscreenLoaded()) {
            this.fullscreenAdaptersArrayList.get(this.indexOfLoadedAdapter).showFullscreen(context2);
        }
    }

    public void appodealInitCompleted() {
        Iterator<MultiAdsFullscreenBaseAdapter> it = this.fullscreenAdaptersArrayList.iterator();
        while (it.hasNext()) {
            MultiAdsFullscreenBaseAdapter next = it.next();
            if (next instanceof MultiAdsFullscreenAppodealAdapter) {
                next.initCompleted();
            }
        }
    }

    public void facebookInitCompleted() {
        Iterator<MultiAdsFullscreenBaseAdapter> it = this.fullscreenAdaptersArrayList.iterator();
        while (it.hasNext()) {
            MultiAdsFullscreenBaseAdapter next = it.next();
            if (next instanceof MultiAdsFullscreenFacebookAdapter) {
                next.initCompleted();
            }
        }
    }

    public void unityInitCompleted() {
        Iterator<MultiAdsFullscreenBaseAdapter> it = this.fullscreenAdaptersArrayList.iterator();
        while (it.hasNext()) {
            MultiAdsFullscreenBaseAdapter next = it.next();
            if (next instanceof MultiAdsFullscreenUnityAdapter) {
                next.initCompleted();
            }
        }
    }
}
