package com.explorestack.iab.vast.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.explorestack.iab.measurer.VastAdMeasurer;
import com.explorestack.iab.utils.IabClickCallback;
import com.explorestack.iab.utils.Utils;
import com.explorestack.iab.vast.VastActivityListener;
import com.explorestack.iab.vast.VastLog;
import com.explorestack.iab.vast.VastPlaybackListener;
import com.explorestack.iab.vast.VastRequest;
import com.explorestack.iab.vast.activity.VastView;
import com.explorestack.iab.vast.c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class VastActivity extends Activity {

    /* renamed from: g  reason: collision with root package name */
    public static final Map<String, WeakReference<VastActivityListener>> f3168g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public static WeakReference<VastPlaybackListener> f3169h;
    public static WeakReference<VastAdMeasurer> i;
    public static final String j = VastActivity.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public VastRequest f3170a;

    /* renamed from: b  reason: collision with root package name */
    public VastView f3171b;

    /* renamed from: c  reason: collision with root package name */
    public VastActivityListener f3172c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3173d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3174e;

    /* renamed from: f  reason: collision with root package name */
    public final VastView.VastViewListener f3175f = new a();

    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        public VastRequest f3176a;

        /* renamed from: b  reason: collision with root package name */
        public VastActivityListener f3177b;

        /* renamed from: c  reason: collision with root package name */
        public VastPlaybackListener f3178c;

        /* renamed from: d  reason: collision with root package name */
        public VastAdMeasurer f3179d;

        public Intent a(Context context) {
            Intent intent = new Intent(context, VastActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            return intent;
        }

        public boolean display(Context context) {
            VastRequest vastRequest = this.f3176a;
            if (vastRequest == null) {
                VastLog.a("VastRequest not provided");
                return false;
            }
            try {
                c.b(vastRequest);
                Intent a2 = a(context);
                a2.putExtra("vast_request_id", this.f3176a.getId());
                VastActivityListener vastActivityListener = this.f3177b;
                if (vastActivityListener != null) {
                    VastActivity.b(this.f3176a, vastActivityListener);
                }
                if (this.f3178c != null) {
                    WeakReference unused = VastActivity.f3169h = new WeakReference(this.f3178c);
                } else {
                    WeakReference unused2 = VastActivity.f3169h = null;
                }
                if (this.f3179d != null) {
                    WeakReference unused3 = VastActivity.i = new WeakReference(this.f3179d);
                } else {
                    WeakReference unused4 = VastActivity.i = null;
                }
                context.startActivity(a2);
                return true;
            } catch (Throwable th) {
                VastLog.a(VastActivity.j, th);
                VastActivity.d(this.f3176a);
                WeakReference unused5 = VastActivity.f3169h = null;
                WeakReference unused6 = VastActivity.i = null;
                return false;
            }
        }

        public Builder setAdMeasurer(VastAdMeasurer vastAdMeasurer) {
            this.f3179d = vastAdMeasurer;
            return this;
        }

        public Builder setListener(VastActivityListener vastActivityListener) {
            this.f3177b = vastActivityListener;
            return this;
        }

        public Builder setPlaybackListener(VastPlaybackListener vastPlaybackListener) {
            this.f3178c = vastPlaybackListener;
            return this;
        }

        public Builder setRequest(VastRequest vastRequest) {
            this.f3176a = vastRequest;
            return this;
        }
    }

    public class a implements VastView.VastViewListener {
        public a() {
        }

        public void onClick(VastView vastView, VastRequest vastRequest, IabClickCallback iabClickCallback, String str) {
            if (VastActivity.this.f3172c != null) {
                VastActivity.this.f3172c.onVastClick(VastActivity.this, vastRequest, iabClickCallback, str);
            }
        }

        public void onComplete(VastView vastView, VastRequest vastRequest) {
            if (VastActivity.this.f3172c != null) {
                VastActivity.this.f3172c.onVastComplete(VastActivity.this, vastRequest);
            }
        }

        public void onError(VastView vastView, VastRequest vastRequest, int i) {
            VastActivity.this.a(vastRequest, i);
        }

        public void onFinish(VastView vastView, VastRequest vastRequest, boolean z) {
            VastActivity.this.a(vastRequest, z);
        }

        public void onOrientationRequested(VastView vastView, VastRequest vastRequest, int i) {
            int forceOrientation = vastRequest.getForceOrientation();
            if (forceOrientation > -1) {
                i = forceOrientation;
            }
            VastActivity.this.a(i);
        }

        public void onShown(VastView vastView, VastRequest vastRequest) {
            if (VastActivity.this.f3172c != null) {
                VastActivity.this.f3172c.onVastShown(VastActivity.this, vastRequest);
            }
        }
    }

    public static void b(VastRequest vastRequest, VastActivityListener vastActivityListener) {
        f3168g.put(vastRequest.getId(), new WeakReference(vastActivityListener));
    }

    public static VastActivityListener c(VastRequest vastRequest) {
        Map<String, WeakReference<VastActivityListener>> map = f3168g;
        WeakReference weakReference = map.get(vastRequest.getId());
        if (weakReference != null && weakReference.get() != null) {
            return (VastActivityListener) weakReference.get();
        }
        map.remove(vastRequest.getId());
        return null;
    }

    public static void d(VastRequest vastRequest) {
        f3168g.remove(vastRequest.getId());
    }

    public final void a(int i2) {
        setRequestedOrientation(i2 == 1 ? 7 : i2 == 2 ? 6 : 4);
    }

    public final void a(VastRequest vastRequest, int i2) {
        VastActivityListener vastActivityListener = this.f3172c;
        if (vastActivityListener != null) {
            vastActivityListener.onVastError(this, vastRequest, i2);
        }
    }

    public final void a(VastRequest vastRequest, boolean z) {
        VastActivityListener vastActivityListener = this.f3172c;
        if (vastActivityListener != null && !this.f3174e) {
            vastActivityListener.onVastDismiss(this, vastRequest, z);
        }
        this.f3174e = true;
        try {
            getWindow().clearFlags(128);
        } catch (Exception e2) {
            VastLog.a(e2.getMessage());
        }
        if (vastRequest != null) {
            a(vastRequest.getRequestedOrientation());
        }
        finish();
        overridePendingTransition(0, 0);
    }

    public final void a(VastView vastView) {
        Utils.applyFullscreenActivityFlags(this);
        setContentView(vastView);
    }

    public final Integer b(VastRequest vastRequest) {
        int forceOrientation = vastRequest.getForceOrientation();
        if (forceOrientation > -1) {
            return Integer.valueOf(forceOrientation);
        }
        int preferredVideoOrientation = vastRequest.getPreferredVideoOrientation();
        if (preferredVideoOrientation == 0 || preferredVideoOrientation == getResources().getConfiguration().orientation) {
            return null;
        }
        return Integer.valueOf(preferredVideoOrientation);
    }

    public void onBackPressed() {
        VastView vastView = this.f3171b;
        if (vastView != null) {
            vastView.handleBackPress();
        }
    }

    public void onCreate(Bundle bundle) {
        Integer b2;
        getWindow().setBackgroundDrawable(new ColorDrawable(-16777216));
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        this.f3170a = c.a(getIntent().getStringExtra("vast_request_id"));
        if (bundle == null || !bundle.getBoolean("isFinishedPerformed")) {
            VastRequest vastRequest = this.f3170a;
            if (vastRequest == null) {
                a((VastRequest) null, (int) TTAdConstant.DEEPLINK_FALLBACK_TYPE_CODE);
                a((VastRequest) null, false);
                return;
            }
            if (bundle == null && (b2 = b(vastRequest)) != null) {
                a(b2.intValue());
                try {
                    if ((getPackageManager().getActivityInfo(getComponentName(), 65536).configChanges & 128) == 0) {
                        return;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            this.f3172c = c(this.f3170a);
            VastView vastView = new VastView(this);
            this.f3171b = vastView;
            vastView.setId(1);
            this.f3171b.setListener(this.f3175f);
            WeakReference<VastPlaybackListener> weakReference = f3169h;
            if (weakReference != null) {
                this.f3171b.setPlaybackListener((VastPlaybackListener) weakReference.get());
            }
            WeakReference<VastAdMeasurer> weakReference2 = i;
            if (weakReference2 != null) {
                this.f3171b.setAdMeasurer((VastAdMeasurer) weakReference2.get());
            }
            if (bundle == null || !bundle.getBoolean("isLoadPerformed")) {
                this.f3173d = true;
                if (!this.f3171b.display(this.f3170a, Boolean.TRUE)) {
                    return;
                }
            }
            a(this.f3171b);
            return;
        }
        finish();
    }

    public void onDestroy() {
        VastRequest vastRequest;
        super.onDestroy();
        if (!isChangingConfigurations() && (vastRequest = this.f3170a) != null) {
            VastView vastView = this.f3171b;
            a(vastRequest, vastView != null && vastView.isFinished());
            VastView vastView2 = this.f3171b;
            if (vastView2 != null) {
                vastView2.destroy();
            }
            d(this.f3170a);
            f3169h = null;
            i = null;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("isLoadPerformed", this.f3173d);
        bundle.putBoolean("isFinishedPerformed", this.f3174e);
    }
}
