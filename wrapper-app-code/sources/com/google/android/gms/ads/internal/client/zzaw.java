package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.zzbmp;
import com.google.android.gms.internal.ads.zzbmv;
import com.google.android.gms.internal.ads.zzbok;
import com.google.android.gms.internal.ads.zzbol;
import com.google.android.gms.internal.ads.zzbrd;
import com.google.android.gms.internal.ads.zzbvt;
import com.google.android.gms.internal.ads.zzbzj;
import com.google.android.gms.internal.ads.zzbzn;
import com.google.android.gms.internal.ads.zzbzq;
import com.google.android.gms.internal.ads.zzcav;
import com.google.android.gms.internal.ads.zzcdk;
import com.google.android.gms.internal.ads.zzcdw;
import com.google.android.gms.internal.ads.zzcgf;
import com.google.android.gms.internal.ads.zzcho;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzaw {
    /* access modifiers changed from: private */
    public final zzk zza;
    /* access modifiers changed from: private */
    public final zzi zzb;
    /* access modifiers changed from: private */
    public final zzeq zzc;
    /* access modifiers changed from: private */
    public final zzbok zzd;
    private final zzcdw zze;
    /* access modifiers changed from: private */
    public final zzbzn zzf;
    /* access modifiers changed from: private */
    public final zzbol zzg;
    /* access modifiers changed from: private */
    public zzcav zzh;

    public zzaw(zzk zzk, zzi zzi, zzeq zzeq, zzbok zzbok, zzcdw zzcdw, zzbzn zzbzn, zzbol zzbol) {
        this.zza = zzk;
        this.zzb = zzi;
        this.zzc = zzeq;
        this.zzd = zzbok;
        this.zze = zzcdw;
        this.zzf = zzbzn;
        this.zzg = zzbol;
    }

    static /* bridge */ /* synthetic */ void zzt(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzay.zzb().zzo(context, zzay.zzc().zza, "gmob-apps", bundle, true);
    }

    public final zzbq zzc(Context context, String str, zzbvt zzbvt) {
        return (zzbq) new zzao(this, context, str, zzbvt).zzd(context, false);
    }

    public final zzbu zzd(Context context, zzq zzq, String str, zzbvt zzbvt) {
        return (zzbu) new zzak(this, context, zzq, str, zzbvt).zzd(context, false);
    }

    public final zzbu zze(Context context, zzq zzq, String str, zzbvt zzbvt) {
        return (zzbu) new zzam(this, context, zzq, str, zzbvt).zzd(context, false);
    }

    public final zzdj zzf(Context context, zzbvt zzbvt) {
        return (zzdj) new zzac(this, context, zzbvt).zzd(context, false);
    }

    public final zzbmp zzh(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzbmp) new zzas(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final zzbmv zzi(View view, HashMap hashMap, HashMap hashMap2) {
        return (zzbmv) new zzau(this, view, hashMap, hashMap2).zzd(view.getContext(), false);
    }

    public final zzbrd zzl(Context context, zzbvt zzbvt, OnH5AdsEventListener onH5AdsEventListener) {
        return (zzbrd) new zzai(this, context, zzbvt, onH5AdsEventListener).zzd(context, false);
    }

    public final zzbzj zzm(Context context, zzbvt zzbvt) {
        return (zzbzj) new zzag(this, context, zzbvt).zzd(context, false);
    }

    public final zzbzq zzo(Activity activity) {
        zzaa zzaa = new zzaa(this, activity);
        Intent intent = activity.getIntent();
        boolean z = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            zzcho.zzg("useClientJar flag not found in activity intent extras.");
        } else {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return (zzbzq) zzaa.zzd(activity, z);
    }

    public final zzcdk zzq(Context context, String str, zzbvt zzbvt) {
        return (zzcdk) new zzav(this, context, str, zzbvt).zzd(context, false);
    }

    public final zzcgf zzr(Context context, zzbvt zzbvt) {
        return (zzcgf) new zzae(this, context, zzbvt).zzd(context, false);
    }
}
