package com.appodeal.ads;

import android.app.Activity;
import android.media.AudioManager;
import com.appodeal.ads.context.b;
import com.appodeal.ads.j1;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.r;
import com.appodeal.ads.segments.g;
import com.appodeal.ads.unified.UnifiedFullscreenAd;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.w;
import com.appodeal.ads.utils.x;
import com.appodeal.ads.utils.y;
import com.unity3d.services.core.device.MimeTypes;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

public class k1<AdRequestType extends r<AdObjectType>, AdObjectType extends j1> extends p<AdRequestType, AdObjectType, q> {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f16558a = new AtomicBoolean(false);

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f16559a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ g f16560b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ r f16561c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ j1 f16562d;

        public a(Activity activity, g gVar, r rVar, j1 j1Var) {
            this.f16559a = activity;
            this.f16560b = gVar;
            this.f16561c = rVar;
            this.f16562d = j1Var;
        }

        public final void run() {
            k1.this.getClass();
            AudioManager audioManager = (AudioManager) this.f16559a.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            if (audioManager != null && r0.f17089e && audioManager.getStreamVolume(2) == 0) {
                r0.f17090f = audioManager.getStreamVolume(3);
                audioManager.setStreamVolume(3, 0, 0);
            }
            g gVar = this.f16560b;
            AdType n = this.f16561c.n();
            gVar.getClass();
            if (g.a(n)) {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject optJSONObject = gVar.f17250c.optJSONObject("impression_interval");
                int i = -1;
                if (optJSONObject != null) {
                    i = optJSONObject.optInt("fullscreen", -1) * 1000;
                }
                if (i > 0) {
                    gVar.f17253f = currentTimeMillis;
                }
                g.i = currentTimeMillis;
                long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                HashMap hashMap = x.l;
                w wVar = x.a.a().f17589e;
                if (wVar != null) {
                    synchronized (wVar) {
                        wVar.k++;
                    }
                }
                try {
                    JSONArray e2 = gVar.e();
                    e2.put(currentTimeMillis2);
                    gVar.f17254g.c(String.valueOf(gVar.f17248a), e2.toString());
                } catch (Exception e3) {
                    Log.log(e3);
                }
            }
            y.a(this.f16561c.n(), this.f16562d.f16569b);
            j1 j1Var = this.f16562d;
            Activity activity = this.f16559a;
            UnifiedAdType unifiedadtype = j1Var.f16573f;
            if (unifiedadtype != null) {
                UnifiedAdParamsType unifiedadparamstype = j1Var.f16574g;
                if (unifiedadparamstype != null) {
                    unifiedadtype.onPrepareToShow(activity, unifiedadparamstype);
                } else {
                    UnifiedAdCallbackType unifiedadcallbacktype = j1Var.f16575h;
                    if (unifiedadcallbacktype != null) {
                        unifiedadcallbacktype.onAdShowFailed();
                    }
                }
            }
            j1 j1Var2 = this.f16562d;
            Activity activity2 = this.f16559a;
            UnifiedFullscreenAd unifiedFullscreenAd = (UnifiedFullscreenAd) j1Var2.f16573f;
            UnifiedFullscreenAdCallback unifiedFullscreenAdCallback = (UnifiedFullscreenAdCallback) j1Var2.f16575h;
            if (unifiedFullscreenAd != null && unifiedFullscreenAdCallback != null) {
                unifiedFullscreenAd.show(activity2, unifiedFullscreenAdCallback);
            } else if (unifiedFullscreenAdCallback != null) {
                unifiedFullscreenAdCallback.onAdShowFailed();
            }
        }
    }

    public static void a() {
        AtomicBoolean atomicBoolean = f16558a;
        synchronized (atomicBoolean) {
            atomicBoolean.set(false);
        }
    }

    public static void b() {
        int i;
        AudioManager audioManager = (AudioManager) b.f16327b.f16328a.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager != null && r0.f17089e && audioManager.getStreamVolume(3) == 0 && (i = r0.f17090f) != -1) {
            audioManager.setStreamVolume(3, i, 0);
        }
    }

    public final boolean a(Activity activity, q qVar, u<AdObjectType, AdRequestType, ?> uVar) {
        AdRequestType f2 = uVar.f();
        if (f2 == null) {
            return false;
        }
        g gVar = qVar.f17031a;
        uVar.a(LogConstants.EVENT_SHOW, String.format("isDebug: %s, isLoaded: %s, isLoading: %s, placement: '%s'", new Object[]{Boolean.valueOf(qVar.f17032b), Boolean.valueOf(f2.u), Boolean.valueOf(f2.u()), gVar.f17249b}));
        if (!gVar.a(activity, uVar.f17435f, f2.t)) {
            return false;
        }
        if (f2.u || f2.v || f2.q.containsKey(gVar.f17249b)) {
            AdObjectType a2 = f2.a(gVar.f17249b);
            f2.s = a2;
            j1 j1Var = (j1) a2;
            if (j1Var != null) {
                uVar.y = f2;
                h5.f16458a.post(new a(activity, gVar, f2, j1Var));
                return true;
            }
        }
        return false;
    }

    public final boolean b(Activity activity, q qVar, u<AdObjectType, AdRequestType, ?> uVar) {
        AtomicBoolean atomicBoolean = f16558a;
        if (atomicBoolean.getAndSet(true)) {
            Log.log(LogConstants.KEY_SDK, LogConstants.EVENT_SHOW_ERROR, String.format("Can't show %s. Fullscreen ad is already shown", new Object[]{uVar.d().getDisplayName()}));
            return false;
        }
        boolean b2 = super.b(activity, qVar, uVar);
        atomicBoolean.set(b2);
        if (b2) {
            h5.a($$Lambda$IwdAmNOGza8_tznd453ZOQZvpdU.INSTANCE, 15000);
        }
        return b2;
    }
}
