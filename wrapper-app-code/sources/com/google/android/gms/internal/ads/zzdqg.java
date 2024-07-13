package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzel;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdqg {
    private int zza;
    private zzdq zzb;
    private zzbmd zzc;
    private View zzd;
    private List zze;
    private List zzf = Collections.emptyList();
    private zzel zzg;
    private Bundle zzh;
    private zzcno zzi;
    private zzcno zzj;
    private zzcno zzk;
    private IObjectWrapper zzl;
    private View zzm;
    private View zzn;
    private IObjectWrapper zzo;
    private double zzp;
    private zzbml zzq;
    private zzbml zzr;
    private String zzs;
    private final SimpleArrayMap zzt = new SimpleArrayMap();
    private final SimpleArrayMap zzu = new SimpleArrayMap();
    private float zzv;
    private String zzw;

    public static zzdqg zzab(zzbwe zzbwe) {
        try {
            zzdqf zzaf = zzaf(zzbwe.zzg(), (zzbwi) null);
            zzbmd zzh2 = zzbwe.zzh();
            String zzo2 = zzbwe.zzo();
            List zzr2 = zzbwe.zzr();
            String zzm2 = zzbwe.zzm();
            Bundle zzf2 = zzbwe.zzf();
            String zzn2 = zzbwe.zzn();
            IObjectWrapper zzl2 = zzbwe.zzl();
            String zzq2 = zzbwe.zzq();
            String zzp2 = zzbwe.zzp();
            double zze2 = zzbwe.zze();
            zzbml zzi2 = zzbwe.zzi();
            zzdqg zzdqg = new zzdqg();
            zzdqg.zza = 2;
            zzdqg.zzb = zzaf;
            zzdqg.zzc = zzh2;
            zzdqg.zzd = (View) zzah(zzbwe.zzj());
            zzdqg.zzU("headline", zzo2);
            zzdqg.zze = zzr2;
            zzdqg.zzU("body", zzm2);
            zzdqg.zzh = zzf2;
            zzdqg.zzU("call_to_action", zzn2);
            zzdqg.zzm = (View) zzah(zzbwe.zzk());
            zzdqg.zzo = zzl2;
            zzdqg.zzU("store", zzq2);
            zzdqg.zzU(InAppPurchaseMetaData.KEY_PRICE, zzp2);
            zzdqg.zzp = zze2;
            zzdqg.zzq = zzi2;
            return zzdqg;
        } catch (RemoteException e2) {
            zze.zzk("Failed to get native ad from app install ad mapper", e2);
            return null;
        }
    }

    public static zzdqg zzac(zzbwf zzbwf) {
        try {
            zzdqf zzaf = zzaf(zzbwf.zzf(), (zzbwi) null);
            zzbmd zzg2 = zzbwf.zzg();
            String zzo2 = zzbwf.zzo();
            List zzp2 = zzbwf.zzp();
            String zzm2 = zzbwf.zzm();
            Bundle zze2 = zzbwf.zze();
            String zzn2 = zzbwf.zzn();
            IObjectWrapper zzk2 = zzbwf.zzk();
            String zzl2 = zzbwf.zzl();
            zzbml zzh2 = zzbwf.zzh();
            zzdqg zzdqg = new zzdqg();
            zzdqg.zza = 1;
            zzdqg.zzb = zzaf;
            zzdqg.zzc = zzg2;
            zzdqg.zzd = (View) zzah(zzbwf.zzi());
            zzdqg.zzU("headline", zzo2);
            zzdqg.zze = zzp2;
            zzdqg.zzU("body", zzm2);
            zzdqg.zzh = zze2;
            zzdqg.zzU("call_to_action", zzn2);
            zzdqg.zzm = (View) zzah(zzbwf.zzj());
            zzdqg.zzo = zzk2;
            zzdqg.zzU("advertiser", zzl2);
            zzdqg.zzr = zzh2;
            return zzdqg;
        } catch (RemoteException e2) {
            zze.zzk("Failed to get native ad from content ad mapper", e2);
            return null;
        }
    }

    public static zzdqg zzad(zzbwe zzbwe) {
        try {
            return zzag(zzaf(zzbwe.zzg(), (zzbwi) null), zzbwe.zzh(), (View) zzah(zzbwe.zzj()), zzbwe.zzo(), zzbwe.zzr(), zzbwe.zzm(), zzbwe.zzf(), zzbwe.zzn(), (View) zzah(zzbwe.zzk()), zzbwe.zzl(), zzbwe.zzq(), zzbwe.zzp(), zzbwe.zze(), zzbwe.zzi(), (String) null, 0.0f);
        } catch (RemoteException e2) {
            zze.zzk("Failed to get native ad assets from app install ad mapper", e2);
            return null;
        }
    }

    public static zzdqg zzae(zzbwf zzbwf) {
        try {
            return zzag(zzaf(zzbwf.zzf(), (zzbwi) null), zzbwf.zzg(), (View) zzah(zzbwf.zzi()), zzbwf.zzo(), zzbwf.zzp(), zzbwf.zzm(), zzbwf.zze(), zzbwf.zzn(), (View) zzah(zzbwf.zzj()), zzbwf.zzk(), (String) null, (String) null, -1.0d, zzbwf.zzh(), zzbwf.zzl(), 0.0f);
        } catch (RemoteException e2) {
            zze.zzk("Failed to get native ad assets from content ad mapper", e2);
            return null;
        }
    }

    private static zzdqf zzaf(zzdq zzdq, zzbwi zzbwi) {
        if (zzdq == null) {
            return null;
        }
        return new zzdqf(zzdq, zzbwi);
    }

    private static zzdqg zzag(zzdq zzdq, zzbmd zzbmd, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d2, zzbml zzbml, String str6, float f2) {
        zzdqg zzdqg = new zzdqg();
        zzdqg.zza = 6;
        zzdqg.zzb = zzdq;
        zzdqg.zzc = zzbmd;
        zzdqg.zzd = view;
        String str7 = str;
        zzdqg.zzU("headline", str);
        zzdqg.zze = list;
        String str8 = str2;
        zzdqg.zzU("body", str2);
        zzdqg.zzh = bundle;
        String str9 = str3;
        zzdqg.zzU("call_to_action", str3);
        zzdqg.zzm = view2;
        zzdqg.zzo = iObjectWrapper;
        String str10 = str4;
        zzdqg.zzU("store", str4);
        String str11 = str5;
        zzdqg.zzU(InAppPurchaseMetaData.KEY_PRICE, str5);
        zzdqg.zzp = d2;
        zzdqg.zzq = zzbml;
        zzdqg.zzU("advertiser", str6);
        zzdqg.zzP(f2);
        return zzdqg;
    }

    private static Object zzah(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.unwrap(iObjectWrapper);
    }

    public static zzdqg zzs(zzbwi zzbwi) {
        try {
            return zzag(zzaf(zzbwi.zzj(), zzbwi), zzbwi.zzk(), (View) zzah(zzbwi.zzm()), zzbwi.zzs(), zzbwi.zzv(), zzbwi.zzq(), zzbwi.zzi(), zzbwi.zzr(), (View) zzah(zzbwi.zzn()), zzbwi.zzo(), zzbwi.zzu(), zzbwi.zzt(), zzbwi.zze(), zzbwi.zzl(), zzbwi.zzp(), zzbwi.zzf());
        } catch (RemoteException e2) {
            zze.zzk("Failed to get native ad assets from unified ad mapper", e2);
            return null;
        }
    }

    public final synchronized String zzA() {
        return this.zzw;
    }

    public final synchronized String zzB() {
        return zzD(InAppPurchaseMetaData.KEY_PRICE);
    }

    public final synchronized String zzC() {
        return zzD("store");
    }

    public final synchronized String zzD(String str) {
        return (String) this.zzu.get(str);
    }

    public final synchronized List zzE() {
        return this.zze;
    }

    public final synchronized List zzF() {
        return this.zzf;
    }

    public final synchronized void zzG() {
        zzcno zzcno = this.zzi;
        if (zzcno != null) {
            zzcno.destroy();
            this.zzi = null;
        }
        zzcno zzcno2 = this.zzj;
        if (zzcno2 != null) {
            zzcno2.destroy();
            this.zzj = null;
        }
        zzcno zzcno3 = this.zzk;
        if (zzcno3 != null) {
            zzcno3.destroy();
            this.zzk = null;
        }
        this.zzl = null;
        this.zzt.clear();
        this.zzu.clear();
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzh = null;
        this.zzm = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
    }

    public final synchronized void zzH(zzbmd zzbmd) {
        this.zzc = zzbmd;
    }

    public final synchronized void zzI(String str) {
        this.zzs = str;
    }

    public final synchronized void zzJ(zzel zzel) {
        this.zzg = zzel;
    }

    public final synchronized void zzK(zzbml zzbml) {
        this.zzq = zzbml;
    }

    public final synchronized void zzL(String str, zzblx zzblx) {
        if (zzblx == null) {
            this.zzt.remove(str);
        } else {
            this.zzt.put(str, zzblx);
        }
    }

    public final synchronized void zzM(zzcno zzcno) {
        this.zzj = zzcno;
    }

    public final synchronized void zzN(List list) {
        this.zze = list;
    }

    public final synchronized void zzO(zzbml zzbml) {
        this.zzr = zzbml;
    }

    public final synchronized void zzP(float f2) {
        this.zzv = f2;
    }

    public final synchronized void zzQ(List list) {
        this.zzf = list;
    }

    public final synchronized void zzR(zzcno zzcno) {
        this.zzk = zzcno;
    }

    public final synchronized void zzS(String str) {
        this.zzw = str;
    }

    public final synchronized void zzT(double d2) {
        this.zzp = d2;
    }

    public final synchronized void zzU(String str, String str2) {
        if (str2 == null) {
            this.zzu.remove(str);
        } else {
            this.zzu.put(str, str2);
        }
    }

    public final synchronized void zzV(int i) {
        this.zza = i;
    }

    public final synchronized void zzW(zzdq zzdq) {
        this.zzb = zzdq;
    }

    public final synchronized void zzX(View view) {
        this.zzm = view;
    }

    public final synchronized void zzY(zzcno zzcno) {
        this.zzi = zzcno;
    }

    public final synchronized void zzZ(View view) {
        this.zzn = view;
    }

    public final synchronized double zza() {
        return this.zzp;
    }

    public final synchronized void zzaa(IObjectWrapper iObjectWrapper) {
        this.zzl = iObjectWrapper;
    }

    public final synchronized float zzb() {
        return this.zzv;
    }

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized Bundle zzd() {
        if (this.zzh == null) {
            this.zzh = new Bundle();
        }
        return this.zzh;
    }

    public final synchronized View zze() {
        return this.zzd;
    }

    public final synchronized View zzf() {
        return this.zzm;
    }

    public final synchronized View zzg() {
        return this.zzn;
    }

    public final synchronized SimpleArrayMap zzh() {
        return this.zzt;
    }

    public final synchronized SimpleArrayMap zzi() {
        return this.zzu;
    }

    public final synchronized zzdq zzj() {
        return this.zzb;
    }

    public final synchronized zzel zzk() {
        return this.zzg;
    }

    public final synchronized zzbmd zzl() {
        return this.zzc;
    }

    public final zzbml zzm() {
        List list = this.zze;
        if (list != null && !list.isEmpty()) {
            Object obj = this.zze.get(0);
            if (obj instanceof IBinder) {
                return zzbmk.zzg((IBinder) obj);
            }
        }
        return null;
    }

    public final synchronized zzbml zzn() {
        return this.zzq;
    }

    public final synchronized zzbml zzo() {
        return this.zzr;
    }

    public final synchronized zzcno zzp() {
        return this.zzj;
    }

    public final synchronized zzcno zzq() {
        return this.zzk;
    }

    public final synchronized zzcno zzr() {
        return this.zzi;
    }

    public final synchronized IObjectWrapper zzt() {
        return this.zzo;
    }

    public final synchronized IObjectWrapper zzu() {
        return this.zzl;
    }

    public final synchronized String zzv() {
        return zzD("advertiser");
    }

    public final synchronized String zzw() {
        return zzD("body");
    }

    public final synchronized String zzx() {
        return zzD("call_to_action");
    }

    public final synchronized String zzy() {
        return this.zzs;
    }

    public final synchronized String zzz() {
        return zzD("headline");
    }
}
