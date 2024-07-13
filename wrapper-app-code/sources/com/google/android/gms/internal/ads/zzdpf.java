package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import com.appodeal.ads.modules.common.internal.Constants;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import io.bidmachine.utils.IabUtils;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdpf implements zzdqo {
    private zzcs zzA;
    private final Context zza;
    private final zzdqr zzb;
    private final JSONObject zzc;
    private final zzdve zzd;
    private final zzdqg zze;
    private final zzapj zzf;
    /* access modifiers changed from: private */
    public final zzdff zzg;
    /* access modifiers changed from: private */
    public final zzdel zzh;
    /* access modifiers changed from: private */
    public final zzdma zzi;
    private final zzfil zzj;
    private final zzchu zzk;
    private final zzfjg zzl;
    private final zzcws zzm;
    private final zzdrk zzn;
    private final Clock zzo;
    private final zzdlw zzp;
    private final zzfpo zzq;
    private final zzfow zzr;
    private boolean zzs = false;
    private boolean zzt;
    private boolean zzu = false;
    private boolean zzv = false;
    private Point zzw = new Point();
    private Point zzx = new Point();
    private long zzy = 0;
    private long zzz = 0;

    public zzdpf(Context context, zzdqr zzdqr, JSONObject jSONObject, zzdve zzdve, zzdqg zzdqg, zzapj zzapj, zzdff zzdff, zzdel zzdel, zzdma zzdma, zzfil zzfil, zzchu zzchu, zzfjg zzfjg, zzcws zzcws, zzdrk zzdrk, Clock clock, zzdlw zzdlw, zzfpo zzfpo, zzfow zzfow) {
        this.zza = context;
        this.zzb = zzdqr;
        this.zzc = jSONObject;
        this.zzd = zzdve;
        this.zze = zzdqg;
        this.zzf = zzapj;
        this.zzg = zzdff;
        this.zzh = zzdel;
        this.zzi = zzdma;
        this.zzj = zzfil;
        this.zzk = zzchu;
        this.zzl = zzfjg;
        this.zzm = zzcws;
        this.zzn = zzdrk;
        this.zzo = clock;
        this.zzp = zzdlw;
        this.zzq = zzfpo;
        this.zzr = zzfow;
    }

    private final String zzD(View view, Map map) {
        if (!(map == null || view == null)) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int zzc2 = this.zze.zzc();
        if (zzc2 == 1) {
            return "1099";
        }
        if (zzc2 == 2) {
            return "2099";
        }
        if (zzc2 != 6) {
            return null;
        }
        return "3099";
    }

    private final boolean zzE(String str) {
        JSONObject optJSONObject = this.zzc.optJSONObject("allow_pub_event_reporting");
        if (optJSONObject == null || !optJSONObject.optBoolean(str, false)) {
            return false;
        }
        return true;
    }

    private final boolean zzF() {
        return this.zzc.optBoolean("allow_custom_click_gesture", false);
    }

    private final boolean zzG(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z) {
        Preconditions.checkMainThread("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.zzc);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzcZ)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            Context context = this.zza;
            JSONObject jSONObject7 = new JSONObject();
            zzt.zzp();
            DisplayMetrics zzr2 = zzs.zzr((WindowManager) context.getSystemService("window"));
            try {
                jSONObject7.put(IabUtils.KEY_WIDTH, zzay.zzb().zzb(context, zzr2.widthPixels));
                jSONObject7.put(IabUtils.KEY_HEIGHT, zzay.zzb().zzb(context, zzr2.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzhE)).booleanValue()) {
                this.zzd.zzi("/clickRecorded", new zzdpc(this, (zzdpb) null));
            } else {
                this.zzd.zzi("/logScionEvent", new zzdpa(this, (zzdoz) null));
            }
            this.zzd.zzi("/nativeImpression", new zzdpe(this, (zzdpd) null));
            zzcie.zza(this.zzd.zzd("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.zzs) {
                return true;
            }
            this.zzs = zzt.zzs().zzn(this.zza, this.zzk.zza, this.zzj.zzD.toString(), this.zzl.zzf);
            return true;
        } catch (JSONException e2) {
            zze.zzh("Unable to create impression JSON.", e2);
            return false;
        }
    }

    public final boolean zzA() {
        if (zza() == 0) {
            return true;
        }
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zzjw)).booleanValue()) {
            return true;
        }
        return this.zzl.zzi.zzj;
    }

    public final boolean zzB() {
        return zzF();
    }

    public final boolean zzC(Bundle bundle) {
        if (!zzE("impression_reporting")) {
            zze.zzg("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        return zzG((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (String) null, zzay.zzb().zzk(bundle, (JSONObject) null), false);
    }

    public final int zza() {
        if (this.zzl.zzi == null) {
            return 0;
        }
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zzjw)).booleanValue()) {
            return 0;
        }
        return this.zzl.zzi.zzi;
    }

    public final JSONObject zze(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject zzd2 = zzbx.zzd(this.zza, map, map2, view, scaleType);
        JSONObject zzg2 = zzbx.zzg(this.zza, view);
        JSONObject zzf2 = zzbx.zzf(view);
        JSONObject zze2 = zzbx.zze(this.zza, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", zzd2);
            jSONObject.put("ad_view_signal", zzg2);
            jSONObject.put("scroll_view_signal", zzf2);
            jSONObject.put("lock_screen_signal", zze2);
            return jSONObject;
        } catch (JSONException e2) {
            zze.zzh("Unable to create native ad view signals JSON.", e2);
            return null;
        }
    }

    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject zze2 = zze(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.zzv && zzF()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (zze2 != null) {
                jSONObject.put("nas", zze2);
            }
        } catch (JSONException e2) {
            zze.zzh("Unable to create native click meta data JSON.", e2);
        }
        return jSONObject;
    }

    public final void zzg() {
        try {
            zzcs zzcs = this.zzA;
            if (zzcs != null) {
                zzcs.zze();
            }
        } catch (RemoteException e2) {
            zze.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void zzh() {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zzb();
        }
    }

    public final void zzi() {
        this.zzd.zzf();
    }

    public final void zzk(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        View view3 = view2;
        Map map3 = map;
        JSONObject zzd2 = zzbx.zzd(this.zza, map, map2, view2, scaleType);
        JSONObject zzg2 = zzbx.zzg(this.zza, view2);
        JSONObject zzf2 = zzbx.zzf(view2);
        JSONObject zze2 = zzbx.zze(this.zza, view2);
        View view4 = view;
        String zzD = zzD(view, map);
        zzn(true == ((Boolean) zzba.zzc().zzb(zzbjj.zzdb)).booleanValue() ? view3 : view4, zzg2, zzd2, zzf2, zze2, zzD, zzbx.zzc(zzD, this.zza, this.zzx, this.zzw), (JSONObject) null, z, false);
    }

    public final void zzl(String str) {
        zzn((View) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, str, (JSONObject) null, (JSONObject) null, false, false);
    }

    public final void zzm(Bundle bundle) {
        if (bundle == null) {
            zze.zze("Click data is null. No click is reported.");
        } else if (!zzE("click_reporting")) {
            zze.zzg("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            zzn((View) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, bundle2 != null ? bundle2.getString("asset_id") : null, (JSONObject) null, zzay.zzb().zzk(bundle, (JSONObject) null), false, false);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzn(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z, boolean z2) {
        String str2;
        Preconditions.checkMainThread("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.zzc);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            boolean z3 = false;
            jSONObject7.put("has_custom_click_handler", this.zzb.zzc(this.zze.zzy()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.zze.zzc());
            jSONObject8.put("view_aware_api_used", z);
            zzblz zzblz = this.zzl.zzi;
            jSONObject8.put("custom_mute_requested", zzblz != null && zzblz.zzg);
            jSONObject8.put("custom_mute_enabled", !this.zze.zzF().isEmpty() && this.zze.zzk() != null);
            if (this.zzn.zza() != null && this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.zzo.currentTimeMillis());
            if (this.zzv && zzF()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            if (this.zzb.zzc(this.zze.zzy()) != null) {
                z3 = true;
            }
            jSONObject8.put("has_custom_click_handler", z3);
            try {
                JSONObject optJSONObject = this.zzc.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                str2 = this.zzf.zzc().zze(this.zza, optJSONObject.optString("click_string"), view);
            } catch (Exception e2) {
                zze.zzh("Exception obtaining click signals", e2);
                str2 = null;
            }
            jSONObject8.put("click_signals", str2);
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzec)).booleanValue()) {
                jSONObject8.put("open_chrome_custom_tab", true);
            }
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzhI)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzhJ)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put(Constants.CLICK, jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long currentTimeMillis = this.zzo.currentTimeMillis();
            jSONObject9.put("time_from_last_touch_down", currentTimeMillis - this.zzy);
            jSONObject9.put("time_from_last_touch", currentTimeMillis - this.zzz);
            jSONObject7.put("touch_signal", jSONObject9);
            zzcie.zza(this.zzd.zzd("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e3) {
            zze.zzh("Unable to create click JSON.", e3);
        }
    }

    public final void zzo(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        JSONObject jSONObject;
        View view3 = view2;
        Map map3 = map;
        boolean z2 = false;
        if (this.zzc.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzjw)).booleanValue()) {
                z2 = true;
            }
        }
        if (!z2) {
            if (!this.zzv) {
                zze.zze("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!zzF()) {
                zze.zze("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        JSONObject zzd2 = zzbx.zzd(this.zza, map3, map2, view3, scaleType);
        JSONObject zzg2 = zzbx.zzg(this.zza, view3);
        JSONObject zzf2 = zzbx.zzf(view2);
        JSONObject zze2 = zzbx.zze(this.zza, view3);
        String zzD = zzD(view, map3);
        JSONObject zzc2 = zzbx.zzc(zzD, this.zza, this.zzx, this.zzw);
        if (z2) {
            try {
                JSONObject jSONObject2 = this.zzc;
                Point point = this.zzx;
                Point point2 = this.zzw;
                try {
                    jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        if (point != null) {
                            jSONObject3.put("x", point.x);
                            jSONObject3.put("y", point.y);
                        }
                        if (point2 != null) {
                            jSONObject4.put("x", point2.x);
                            jSONObject4.put("y", point2.y);
                        }
                        jSONObject.put("start_point", jSONObject3);
                        jSONObject.put("end_point", jSONObject4);
                        jSONObject.put("duration_ms", i);
                    } catch (Exception e2) {
                        e = e2;
                        zze.zzh("Error occurred while grabbing custom click gesture signals.", e);
                        jSONObject2.put("custom_click_gesture_signal", jSONObject);
                        zzn(view2, zzg2, zzd2, zzf2, zze2, zzD, zzc2, (JSONObject) null, z, true);
                    }
                } catch (Exception e3) {
                    e = e3;
                    jSONObject = null;
                    zze.zzh("Error occurred while grabbing custom click gesture signals.", e);
                    jSONObject2.put("custom_click_gesture_signal", jSONObject);
                    zzn(view2, zzg2, zzd2, zzf2, zze2, zzD, zzc2, (JSONObject) null, z, true);
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e4) {
                zze.zzh("Error occurred while adding CustomClickGestureSignals to adJson.", e4);
                zzt.zzo().zzu(e4, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        zzn(view2, zzg2, zzd2, zzf2, zze2, zzD, zzc2, (JSONObject) null, z, true);
    }

    public final void zzp() {
        Preconditions.checkMainThread("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzc);
            zzcie.zza(this.zzd.zzd("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e2) {
            zzcho.zzh("", e2);
        }
    }

    public final void zzq(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        String str;
        JSONObject zzd2 = zzbx.zzd(this.zza, map, map2, view, scaleType);
        JSONObject zzg2 = zzbx.zzg(this.zza, view);
        JSONObject zzf2 = zzbx.zzf(view);
        JSONObject zze2 = zzbx.zze(this.zza, view);
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzcZ)).booleanValue()) {
            try {
                str = this.zzf.zzc().zzh(this.zza, view, (Activity) null);
            } catch (Exception unused) {
                zze.zzg("Exception getting data.");
            }
            zzG(zzg2, zzd2, zzf2, zze2, str, (JSONObject) null, zzbx.zzh(this.zza, this.zzj));
        }
        str = null;
        zzG(zzg2, zzd2, zzf2, zze2, str, (JSONObject) null, zzbx.zzh(this.zza, this.zzj));
    }

    public final void zzr() {
        zzG((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (String) null, (JSONObject) null, false);
    }

    public final void zzs(View view, MotionEvent motionEvent, View view2) {
        this.zzw = zzbx.zza(motionEvent, view2);
        long currentTimeMillis = this.zzo.currentTimeMillis();
        this.zzz = currentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.zzy = currentTimeMillis;
            this.zzx = this.zzw;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation((float) this.zzw.x, (float) this.zzw.y);
        this.zzf.zzd(obtain);
        obtain.recycle();
    }

    public final void zzt(Bundle bundle) {
        if (bundle == null) {
            zze.zze("Touch event data is null. No touch event is reported.");
        } else if (!zzE("touch_reporting")) {
            zze.zzg("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
        } else {
            float f2 = bundle.getFloat("x");
            float f3 = bundle.getFloat("y");
            this.zzf.zzc().zzl((int) f2, (int) f3, bundle.getInt("duration_ms"));
        }
    }

    public final void zzu(View view) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            zze.zzj("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzdrk zzdrk = this.zzn;
        if (view != null) {
            view.setOnClickListener(zzdrk);
            view.setClickable(true);
            zzdrk.zzc = new WeakReference(view);
        }
    }

    public final void zzv() {
        this.zzv = true;
    }

    public final void zzw(zzcs zzcs) {
        this.zzA = zzcs;
    }

    public final void zzx(zzbof zzbof) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            zze.zzj("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        } else {
            this.zzn.zzc(zzbof);
        }
    }

    public final void zzy(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.zzw = new Point();
        this.zzx = new Point();
        if (!this.zzt) {
            this.zzp.zza(view);
            this.zzt = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.zzm.zzi(this);
        boolean zzi2 = zzbx.zzi(this.zzk.zzc);
        if (map != null) {
            for (Map.Entry value : map.entrySet()) {
                View view2 = (View) ((WeakReference) value.getValue()).get();
                if (view2 != null) {
                    if (zzi2) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            for (Map.Entry value2 : map2.entrySet()) {
                View view3 = (View) ((WeakReference) value2.getValue()).get();
                if (view3 != null) {
                    if (zzi2) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    public final void zzz(View view, Map map) {
        this.zzw = new Point();
        this.zzx = new Point();
        if (view != null) {
            this.zzp.zzb(view);
        }
        this.zzt = false;
    }

    public final void zzj(zzcw zzcw) {
        try {
            if (!this.zzu) {
                if (zzcw == null) {
                    zzdqg zzdqg = this.zze;
                    if (zzdqg.zzk() != null) {
                        this.zzu = true;
                        this.zzq.zzc(zzdqg.zzk().zzf(), this.zzr);
                        zzg();
                        return;
                    }
                }
                this.zzu = true;
                this.zzq.zzc(zzcw.zzf(), this.zzr);
                zzg();
            }
        } catch (RemoteException e2) {
            zze.zzl("#007 Could not call remote method.", e2);
        }
    }
}
