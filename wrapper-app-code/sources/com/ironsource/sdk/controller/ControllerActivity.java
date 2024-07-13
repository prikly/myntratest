package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ironsource.environment.h;
import com.ironsource.sdk.a.f;
import com.ironsource.sdk.controller.x;
import com.ironsource.sdk.g.b;
import com.ironsource.sdk.g.d;
import com.ironsource.sdk.i.a;
import com.ironsource.sdk.j.g;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.services.core.device.MimeTypes;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import java.util.Map;

public class ControllerActivity extends Activity implements w, g {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9068a = ControllerActivity.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private static String f9069b = "removeWebViewContainerView | mContainer is null";

    /* renamed from: c  reason: collision with root package name */
    private static String f9070c = "removeWebViewContainerView | view is null";
    public int currentRequestedRotation = -1;

    /* renamed from: d  reason: collision with root package name */
    private String f9071d;

    /* renamed from: e  reason: collision with root package name */
    private x f9072e;

    /* renamed from: f  reason: collision with root package name */
    private RelativeLayout f9073f;

    /* renamed from: g  reason: collision with root package name */
    private FrameLayout f9074g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public boolean f9075h = false;
    private String i;
    /* access modifiers changed from: private */
    public Handler j = new Handler();
    /* access modifiers changed from: private */
    public final Runnable k = new Runnable() {
        public final void run() {
            ControllerActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(ControllerActivity.this.f9075h));
        }
    };
    private RelativeLayout.LayoutParams l = new RelativeLayout.LayoutParams(-1, -1);
    private b m;
    private boolean n;
    private boolean o;

    private void a() {
        Logger.i(f9068a, "clearWebviewController");
        x xVar = this.f9072e;
        if (xVar == null) {
            Logger.i(f9068a, "clearWebviewController, null");
            return;
        }
        xVar.j = x.g.Gone;
        this.f9072e.l = null;
        this.f9072e.v = null;
        this.f9072e.a(this.i, "onDestroy");
    }

    private void a(String str) {
        if (str == null) {
            return;
        }
        if ("landscape".equalsIgnoreCase(str)) {
            b();
        } else if ("portrait".equalsIgnoreCase(str)) {
            c();
        } else if ("device".equalsIgnoreCase(str)) {
            if (h.q(this)) {
                setRequestedOrientation(1);
            }
        } else if (getRequestedOrientation() == -1) {
            setRequestedOrientation(4);
        }
    }

    private void b() {
        int k2 = h.k(this);
        Logger.i(f9068a, "setInitiateLandscapeOrientation");
        if (k2 == 0) {
            Logger.i(f9068a, "ROTATION_0");
            setRequestedOrientation(0);
        } else if (k2 == 2) {
            Logger.i(f9068a, "ROTATION_180");
            setRequestedOrientation(8);
        } else if (k2 == 3) {
            Logger.i(f9068a, "ROTATION_270 Right Landscape");
            setRequestedOrientation(8);
        } else if (k2 == 1) {
            Logger.i(f9068a, "ROTATION_90 Left Landscape");
            setRequestedOrientation(0);
        } else {
            Logger.i(f9068a, "No Rotation");
        }
    }

    private void c() {
        int k2 = h.k(this);
        Logger.i(f9068a, "setInitiatePortraitOrientation");
        if (k2 == 0) {
            Logger.i(f9068a, "ROTATION_0");
            setRequestedOrientation(1);
        } else if (k2 == 2) {
            Logger.i(f9068a, "ROTATION_180");
            setRequestedOrientation(9);
        } else if (k2 == 1) {
            Logger.i(f9068a, "ROTATION_270 Right Landscape");
            setRequestedOrientation(1);
        } else if (k2 == 3) {
            Logger.i(f9068a, "ROTATION_90 Left Landscape");
            setRequestedOrientation(1);
        } else {
            Logger.i(f9068a, "No Rotation");
        }
    }

    public boolean onBackButtonPressed() {
        onBackPressed();
        return true;
    }

    public void onBackPressed() {
        Logger.i(f9068a, "onBackPressed");
        new a();
        if (!a.a(this)) {
            super.onBackPressed();
        }
    }

    public void onCloseRequested() {
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Logger.i(f9068a, "onCreate");
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            x xVar = (x) com.ironsource.sdk.d.b.a((Context) this).f9426a.f9133a;
            this.f9072e = xVar;
            xVar.i.setId(1);
            this.f9072e.v = this;
            this.f9072e.l = this;
            Intent intent = getIntent();
            this.i = intent.getStringExtra("productType");
            this.f9075h = intent.getBooleanExtra("immersive", false);
            this.f9071d = intent.getStringExtra("adViewId");
            this.n = false;
            this.o = intent.getBooleanExtra("ctrWVPauseResume", false);
            if (this.f9075h) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
                    public final void onSystemUiVisibilityChange(int i) {
                        if ((i & 4098) == 0) {
                            ControllerActivity.this.j.removeCallbacks(ControllerActivity.this.k);
                            ControllerActivity.this.j.postDelayed(ControllerActivity.this.k, 500);
                        }
                    }
                });
                runOnUiThread(this.k);
            }
            if (!TextUtils.isEmpty(this.i) && d.e.OfferWall.toString().equalsIgnoreCase(this.i)) {
                if (bundle != null) {
                    b bVar = (b) bundle.getParcelable(AdOperationMetric.INIT_STATE);
                    if (bVar != null) {
                        this.m = bVar;
                        this.f9072e.a(bVar);
                    }
                    finish();
                } else {
                    this.m = this.f9072e.m;
                }
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f9073f = relativeLayout;
            setContentView(relativeLayout, this.l);
            String str = this.f9071d;
            this.f9074g = !(!TextUtils.isEmpty(str) && !str.equals(Integer.toString(1))) ? this.f9072e.i : com.ironsource.sdk.utils.d.a(getApplicationContext(), com.ironsource.sdk.c.d.a().a(str).b());
            if (this.f9073f.findViewById(1) == null && this.f9074g.getParent() != null) {
                finish();
            }
            Intent intent2 = getIntent();
            String stringExtra = intent2.getStringExtra("orientation_set_flag");
            intent2.getIntExtra("rotation_set_flag", 0);
            a(stringExtra);
            this.f9073f.addView(this.f9074g, this.l);
        } catch (Exception e2) {
            e2.printStackTrace();
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        ViewGroup viewGroup;
        super.onDestroy();
        Logger.i(f9068a, "onDestroy");
        try {
            if (this.f9073f != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f9074g.getParent();
                View findViewById = this.f9071d == null ? viewGroup2.findViewById(1) : com.ironsource.sdk.c.d.a().a(this.f9071d).b();
                if (findViewById != null) {
                    if (isFinishing() && (viewGroup = (ViewGroup) findViewById.getParent()) != null) {
                        viewGroup.removeView(findViewById);
                    }
                    viewGroup2.removeView(this.f9074g);
                    if (!this.n) {
                        Logger.i(f9068a, "onDestroy | destroyedFromBackground");
                        a();
                        return;
                    }
                    return;
                }
                throw new Exception(f9070c);
            }
            throw new Exception(f9069b);
        } catch (Exception e2) {
            com.ironsource.sdk.a.d.a(f.p, (Map<String, Object>) new com.ironsource.sdk.a.a().a("callfailreason", e2.getMessage()).f8990a);
            String str = f9068a;
            Logger.i(str, "removeWebViewContainerView fail " + e2.getMessage());
        }
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            if (this.f9072e.f9300h != null) {
                this.f9072e.f9299g.onHideCustomView();
                return true;
            }
        }
        if (this.f9075h && (i2 == 25 || i2 == 24)) {
            this.j.removeCallbacks(this.k);
            this.j.postDelayed(this.k, 500);
        }
        return super.onKeyDown(i2, keyEvent);
    }

    public void onOrientationChanged(String str, int i2) {
        a(str);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        String str = f9068a;
        Logger.i(str, "onPause, isFinishing=" + isFinishing());
        com.ironsource.environment.e.a.f8069a.b(new Runnable((AudioManager) getSystemService(MimeTypes.BASE_TYPE_AUDIO)) {

            /* renamed from: a  reason: collision with root package name */
            private /* synthetic */ AudioManager f9281a;

            {
                this.f9281a = r1;
            }

            public final void run() {
                try {
                    this.f9281a.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) null);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
        x xVar = this.f9072e;
        if (xVar != null) {
            xVar.b((Context) this);
            if (!this.o) {
                this.f9072e.k();
            }
            this.f9072e.a(false, "main");
            this.f9072e.a(this.i, "onPause");
        }
        if (isFinishing()) {
            this.n = true;
            a();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        Logger.i(f9068a, "onResume");
        x xVar = this.f9072e;
        if (xVar != null) {
            xVar.a((Context) this);
            if (!this.o) {
                this.f9072e.l();
            }
            this.f9072e.a(true, "main");
            this.f9072e.a(this.i, "onResume");
        }
        com.ironsource.environment.e.a.f8069a.b(new Runnable((AudioManager) getSystemService(MimeTypes.BASE_TYPE_AUDIO)) {

            /* renamed from: a  reason: collision with root package name */
            private /* synthetic */ AudioManager f9282a;

            {
                this.f9282a = r1;
            }

            public final void run() {
                try {
                    this.f9282a.requestAudioFocus((AudioManager.OnAudioFocusChangeListener) null, 3, 2);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!TextUtils.isEmpty(this.i) && d.e.OfferWall.toString().equalsIgnoreCase(this.i)) {
            this.m.f9510d = true;
            bundle.putParcelable(AdOperationMetric.INIT_STATE, this.m);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        Logger.i(f9068a, "onStart");
        x xVar = this.f9072e;
        if (xVar != null) {
            xVar.a(this.i, "onStart");
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        Logger.i(f9068a, "onStop");
        x xVar = this.f9072e;
        if (xVar != null) {
            xVar.a(this.i, "onStop");
        }
    }

    /* access modifiers changed from: protected */
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Logger.i(f9068a, "onUserLeaveHint");
        x xVar = this.f9072e;
        if (xVar != null) {
            xVar.a(this.i, "onUserLeaveHint");
        }
    }

    public void onVideoEnded() {
        toggleKeepScreen(false);
    }

    public void onVideoPaused() {
        toggleKeepScreen(false);
    }

    public void onVideoResumed() {
        toggleKeepScreen(true);
    }

    public void onVideoStarted() {
        toggleKeepScreen(true);
    }

    public void onVideoStopped() {
        toggleKeepScreen(false);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f9075h && z) {
            runOnUiThread(this.k);
        }
    }

    public void setRequestedOrientation(int i2) {
        if (this.currentRequestedRotation != i2) {
            String str = f9068a;
            Logger.i(str, "Rotation: Req = " + i2 + " Curr = " + this.currentRequestedRotation);
            this.currentRequestedRotation = i2;
            super.setRequestedOrientation(i2);
        }
    }

    public void toggleKeepScreen(boolean z) {
        runOnUiThread(z ? new Runnable() {
            public final void run() {
                ControllerActivity.this.getWindow().addFlags(128);
            }
        } : new Runnable() {
            public final void run() {
                ControllerActivity.this.getWindow().clearFlags(128);
            }
        });
    }
}
