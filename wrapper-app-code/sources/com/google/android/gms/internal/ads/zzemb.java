package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.zzb;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzemb implements zzekx {
    private final Context zza;
    private final zzczi zzb;
    private final Executor zzc;

    public zzemb(Context context, zzczi zzczi, Executor executor) {
        this.zza = context;
        this.zzb = zzczi;
        this.zzc = executor;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object zza(com.google.android.gms.internal.ads.zzfix r7, com.google.android.gms.internal.ads.zzfil r8, com.google.android.gms.internal.ads.zzekt r9) throws com.google.android.gms.internal.ads.zzfjl, com.google.android.gms.internal.ads.zzeom {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzbjb r0 = com.google.android.gms.internal.ads.zzbjj.zzgZ
            com.google.android.gms.internal.ads.zzbjh r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x0077
            boolean r0 = r8.zzai
            if (r0 == 0) goto L_0x0077
            java.lang.Object r0 = r9.zzb
            com.google.android.gms.internal.ads.zzfkb r0 = (com.google.android.gms.internal.ads.zzfkb) r0
            com.google.android.gms.internal.ads.zzbwc r0 = r0.zzc()
            if (r0 == 0) goto L_0x0067
            com.google.android.gms.dynamic.IObjectWrapper r2 = r0.zze()     // Catch:{ RemoteException -> 0x0060 }
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)     // Catch:{ RemoteException -> 0x0060 }
            android.view.View r2 = (android.view.View) r2     // Catch:{ RemoteException -> 0x0060 }
            boolean r0 = r0.zzf()     // Catch:{ RemoteException -> 0x0060 }
            if (r2 == 0) goto L_0x0053
            if (r0 == 0) goto L_0x007f
            com.google.android.gms.internal.ads.zzgfb r0 = com.google.android.gms.internal.ads.zzger.zzi(r1)
            com.google.android.gms.internal.ads.zzema r3 = new com.google.android.gms.internal.ads.zzema
            r3.<init>(r6, r2, r8)
            com.google.android.gms.internal.ads.zzgfc r2 = com.google.android.gms.internal.ads.zzcib.zze
            com.google.android.gms.internal.ads.zzgfb r0 = com.google.android.gms.internal.ads.zzger.zzn(r0, r3, r2)
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException -> 0x004c, ExecutionException -> 0x004a }
            r2 = r0
            android.view.View r2 = (android.view.View) r2     // Catch:{ InterruptedException -> 0x004c, ExecutionException -> 0x004a }
            goto L_0x007f
        L_0x004a:
            r7 = move-exception
            goto L_0x004d
        L_0x004c:
            r7 = move-exception
        L_0x004d:
            com.google.android.gms.internal.ads.zzfjl r8 = new com.google.android.gms.internal.ads.zzfjl
            r8.<init>(r7)
            throw r8
        L_0x0053:
            com.google.android.gms.internal.ads.zzfjl r7 = new com.google.android.gms.internal.ads.zzfjl
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r9 = "BannerAdapterWrapper interscrollerView should not be null"
            r8.<init>(r9)
            r7.<init>(r8)
            throw r7
        L_0x0060:
            r7 = move-exception
            com.google.android.gms.internal.ads.zzfjl r8 = new com.google.android.gms.internal.ads.zzfjl
            r8.<init>(r7)
            throw r8
        L_0x0067:
            java.lang.String r7 = "getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."
            com.google.android.gms.ads.internal.util.zze.zzg(r7)
            com.google.android.gms.internal.ads.zzfjl r8 = new com.google.android.gms.internal.ads.zzfjl
            java.lang.Exception r9 = new java.lang.Exception
            r9.<init>(r7)
            r8.<init>(r9)
            throw r8
        L_0x0077:
            java.lang.Object r0 = r9.zzb
            com.google.android.gms.internal.ads.zzfkb r0 = (com.google.android.gms.internal.ads.zzfkb) r0
            android.view.View r2 = r0.zza()
        L_0x007f:
            com.google.android.gms.internal.ads.zzczi r0 = r6.zzb
            com.google.android.gms.internal.ads.zzdbc r3 = new com.google.android.gms.internal.ads.zzdbc
            java.lang.String r4 = r9.zza
            r3.<init>(r7, r8, r4)
            com.google.android.gms.internal.ads.zzcys r7 = new com.google.android.gms.internal.ads.zzcys
            java.lang.Object r4 = r9.zzb
            com.google.android.gms.internal.ads.zzfkb r4 = (com.google.android.gms.internal.ads.zzfkb) r4
            com.google.android.gms.internal.ads.zzelz r5 = new com.google.android.gms.internal.ads.zzelz
            r5.<init>(r4)
            java.util.List r8 = r8.zzv
            r4 = 0
            java.lang.Object r8 = r8.get(r4)
            com.google.android.gms.internal.ads.zzfim r8 = (com.google.android.gms.internal.ads.zzfim) r8
            r7.<init>(r2, r1, r5, r8)
            com.google.android.gms.internal.ads.zzcym r7 = r0.zza(r3, r7)
            com.google.android.gms.internal.ads.zzdlw r8 = r7.zzg()
            r8.zza(r2)
            com.google.android.gms.internal.ads.zzdfm r8 = r7.zzd()
            com.google.android.gms.internal.ads.zzcvy r0 = new com.google.android.gms.internal.ads.zzcvy
            java.lang.Object r1 = r9.zzb
            com.google.android.gms.internal.ads.zzfkb r1 = (com.google.android.gms.internal.ads.zzfkb) r1
            r0.<init>(r1)
            java.util.concurrent.Executor r1 = r6.zzc
            r8.zzj(r0, r1)
            com.google.android.gms.internal.ads.zzdfx r8 = r9.zzc
            com.google.android.gms.internal.ads.zzems r8 = (com.google.android.gms.internal.ads.zzems) r8
            com.google.android.gms.internal.ads.zzepy r9 = r7.zzi()
            r8.zzc(r9)
            com.google.android.gms.internal.ads.zzcyl r7 = r7.zza()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzemb.zza(com.google.android.gms.internal.ads.zzfix, com.google.android.gms.internal.ads.zzfil, com.google.android.gms.internal.ads.zzekt):java.lang.Object");
    }

    public final void zzb(zzfix zzfix, zzfil zzfil, zzekt zzekt) throws zzfjl {
        zzq zza2;
        zzq zzq = zzfix.zza.zza.zze;
        if (zzq.zzn) {
            zza2 = new zzq(this.zza, zzb.zzd(zzq.zze, zzq.zzb));
        } else {
            if (!((Boolean) zzba.zzc().zzb(zzbjj.zzgZ)).booleanValue() || !zzfil.zzai) {
                zza2 = zzfjk.zza(this.zza, zzfil.zzv);
            } else {
                zza2 = new zzq(this.zza, zzb.zze(zzq.zze, zzq.zzb));
            }
        }
        zzq zzq2 = zza2;
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zzgZ)).booleanValue() || !zzfil.zzai) {
            ((zzfkb) zzekt.zzb).zzm(this.zza, zzq2, zzfix.zza.zza.zzd, zzfil.zzw.toString(), zzbu.zzl(zzfil.zzt), (zzbvz) zzekt.zzc);
        } else {
            ((zzfkb) zzekt.zzb).zzn(this.zza, zzq2, zzfix.zza.zza.zzd, zzfil.zzw.toString(), zzbu.zzl(zzfil.zzt), (zzbvz) zzekt.zzc);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zzc(View view, zzfil zzfil, Object obj) throws Exception {
        return zzger.zzi(zzczz.zza(this.zza, view, zzfil));
    }
}
