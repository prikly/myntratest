package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdaa implements zzdfh, zzdgb {
    private final Context zza;
    private final zzcno zzb;
    private final zzfil zzc;
    private final zzchu zzd;
    private IObjectWrapper zze;
    private boolean zzf;

    public zzdaa(Context context, zzcno zzcno, zzfil zzfil, zzchu zzchu) {
        this.zza = context;
        this.zzb = zzcno;
        this.zzc = zzfil;
        this.zzd = zzchu;
    }

    private final synchronized void zza() {
        zzeko zzeko;
        zzekp zzekp;
        if (this.zzc.zzU) {
            if (this.zzb != null) {
                if (zzt.zzA().zze(this.zza)) {
                    zzchu zzchu = this.zzd;
                    String str = zzchu.zzb + "." + zzchu.zzc;
                    String zza2 = this.zzc.zzW.zza();
                    if (this.zzc.zzW.zzb() == 1) {
                        zzeko = zzeko.VIDEO;
                        zzekp = zzekp.DEFINED_BY_JAVASCRIPT;
                    } else {
                        zzeko = zzeko.HTML_DISPLAY;
                        if (this.zzc.zzf == 1) {
                            zzekp = zzekp.ONE_PIXEL;
                        } else {
                            zzekp = zzekp.BEGIN_TO_RENDER;
                        }
                    }
                    IObjectWrapper zza3 = zzt.zzA().zza(str, this.zzb.zzI(), "", "javascript", zza2, zzekp, zzeko, this.zzc.zzan);
                    this.zze = zza3;
                    zzcno zzcno = this.zzb;
                    if (zza3 != null) {
                        zzt.zzA().zzc(this.zze, (View) zzcno);
                        this.zzb.zzar(this.zze);
                        zzt.zzA().zzd(this.zze);
                        this.zzf = true;
                        this.zzb.zzd("onSdkLoaded", new ArrayMap());
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzl() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzf     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0008
            r3.zza()     // Catch:{ all -> 0x0024 }
        L_0x0008:
            com.google.android.gms.internal.ads.zzfil r0 = r3.zzc     // Catch:{ all -> 0x0024 }
            boolean r0 = r0.zzU     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.dynamic.IObjectWrapper r0 = r3.zze     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.internal.ads.zzcno r0 = r3.zzb     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap     // Catch:{ all -> 0x0024 }
            r1.<init>()     // Catch:{ all -> 0x0024 }
            java.lang.String r2 = "onSdkImpression"
            r0.zzd(r2, r1)     // Catch:{ all -> 0x0024 }
            monitor-exit(r3)
            return
        L_0x0022:
            monitor-exit(r3)
            return
        L_0x0024:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdaa.zzl():void");
    }

    public final synchronized void zzn() {
        if (!this.zzf) {
            zza();
        }
    }
}
