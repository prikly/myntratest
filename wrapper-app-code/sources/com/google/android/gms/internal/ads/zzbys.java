package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbys extends zzbyt implements zzbqd {
    DisplayMetrics zza;
    int zzb = -1;
    int zzc = -1;
    int zzd = -1;
    int zze = -1;
    int zzf = -1;
    int zzg = -1;
    private final zzcno zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbit zzk;
    private float zzl;
    private int zzm;

    public zzbys(zzcno zzcno, Context context, zzbit zzbit) {
        super(zzcno, "");
        this.zzh = zzcno;
        this.zzi = context;
        this.zzk = zzbit;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObject;
        zzcno zzcno = (zzcno) obj;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        zzay.zzb();
        DisplayMetrics displayMetrics = this.zza;
        this.zzb = zzchh.zzw(displayMetrics, displayMetrics.widthPixels);
        zzay.zzb();
        DisplayMetrics displayMetrics2 = this.zza;
        this.zzc = zzchh.zzw(displayMetrics2, displayMetrics2.heightPixels);
        Activity zzk2 = this.zzh.zzk();
        if (zzk2 == null || zzk2.getWindow() == null) {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        } else {
            zzt.zzp();
            int[] zzN = zzs.zzN(zzk2);
            zzay.zzb();
            this.zzd = zzchh.zzw(this.zza, zzN[0]);
            zzay.zzb();
            this.zze = zzchh.zzw(this.zza, zzN[1]);
        }
        if (this.zzh.zzQ().zzi()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            this.zzh.measure(0, 0);
        }
        zzi(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbyr zzbyr = new zzbyr();
        zzbit zzbit = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbyr.zze(zzbit.zza(intent));
        zzbit zzbit2 = this.zzk;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbyr.zzc(zzbit2.zza(intent2));
        zzbyr.zza(this.zzk.zzb());
        zzbyr.zzd(this.zzk.zzc());
        zzbyr.zzb(true);
        boolean zzh2 = zzbyr.zza;
        boolean zzj2 = zzbyr.zzb;
        boolean zzf2 = zzbyr.zzc;
        boolean zzi2 = zzbyr.zzd;
        boolean zzg2 = zzbyr.zze;
        zzcno zzcno2 = this.zzh;
        try {
            jSONObject = new JSONObject().put("sms", zzh2).put("tel", zzj2).put("calendar", zzf2).put("storePicture", zzi2).put("inlineVideo", zzg2);
        } catch (JSONException e2) {
            zze.zzh("Error occurred while obtaining the MRAID capabilities.", e2);
            jSONObject = null;
        }
        zzcno2.zze("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        this.zzh.getLocationOnScreen(iArr);
        zzb(zzay.zzb().zzb(this.zzi, iArr[0]), zzay.zzb().zzb(this.zzi, iArr[1]));
        if (zze.zzm(2)) {
            zze.zzi("Dispatching Ready Event.");
        }
        zzh(this.zzh.zzp().zza);
    }

    public final void zzb(int i, int i2) {
        int i3;
        int i4 = 0;
        if (this.zzi instanceof Activity) {
            zzt.zzp();
            i3 = zzs.zzO((Activity) this.zzi)[0];
        } else {
            i3 = 0;
        }
        if (this.zzh.zzQ() == null || !this.zzh.zzQ().zzi()) {
            int width = this.zzh.getWidth();
            int height = this.zzh.getHeight();
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzP)).booleanValue()) {
                if (width == 0) {
                    width = this.zzh.zzQ() != null ? this.zzh.zzQ().zzb : 0;
                }
                if (height == 0) {
                    if (this.zzh.zzQ() != null) {
                        i4 = this.zzh.zzQ().zza;
                    }
                    this.zzf = zzay.zzb().zzb(this.zzi, width);
                    this.zzg = zzay.zzb().zzb(this.zzi, i4);
                }
            }
            i4 = height;
            this.zzf = zzay.zzb().zzb(this.zzi, width);
            this.zzg = zzay.zzb().zzb(this.zzi, i4);
        }
        zzf(i, i2 - i3, this.zzf, this.zzg);
        this.zzh.zzP().zzB(i, i2);
    }
}
