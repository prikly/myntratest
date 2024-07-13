package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeua implements zzezm {
    private final zzgfc zza;
    private final zzdxc zzb;
    private final zzebj zzc;
    private final zzeud zzd;

    public zzeua(zzgfc zzgfc, zzdxc zzdxc, zzebj zzebj, zzeud zzeud) {
        this.zza = zzgfc;
        this.zzb = zzdxc;
        this.zzc = zzebj;
        this.zzd = zzeud;
    }

    public final int zza() {
        return 1;
    }

    public final zzgfb zzb() {
        if (zzfyt.zzd((String) zzba.zzc().zzb(zzbjj.zzbk)) || this.zzd.zzb() || !this.zzc.zzt()) {
            return zzger.zzi(new zzeuc(new Bundle(), (zzeub) null));
        }
        this.zzd.zza(true);
        return this.zza.zzb(new zzetz(this));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(14:3|4|5|6|7|(1:9)|10|11|(1:13)|14|15|21|19|1) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x004d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x005c */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0053 A[Catch:{ zzfjl -> 0x005c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzeuc zzc() throws java.lang.Exception {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzbjb r0 = com.google.android.gms.internal.ads.zzbjj.zzbk
            com.google.android.gms.internal.ads.zzbjh r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = ";"
            java.lang.String[] r0 = r0.split(r1)
            java.util.List r0 = java.util.Arrays.asList(r0)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x001f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0062
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.gms.internal.ads.zzdxc r3 = r7.zzb     // Catch:{ zzfjl -> 0x0060 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ zzfjl -> 0x0060 }
            r4.<init>()     // Catch:{ zzfjl -> 0x0060 }
            com.google.android.gms.internal.ads.zzfkb r3 = r3.zzc(r2, r4)     // Catch:{ zzfjl -> 0x0060 }
            r3.zzC()     // Catch:{ zzfjl -> 0x0060 }
            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ zzfjl -> 0x0060 }
            r4.<init>()     // Catch:{ zzfjl -> 0x0060 }
            com.google.android.gms.internal.ads.zzbye r5 = r3.zzf()     // Catch:{ zzfjl -> 0x004d }
            if (r5 == 0) goto L_0x004d
            java.lang.String r6 = "sdk_version"
            java.lang.String r5 = r5.toString()     // Catch:{ zzfjl -> 0x004d }
            r4.putString(r6, r5)     // Catch:{ zzfjl -> 0x004d }
        L_0x004d:
            com.google.android.gms.internal.ads.zzbye r3 = r3.zze()     // Catch:{ zzfjl -> 0x005c }
            if (r3 == 0) goto L_0x005c
            java.lang.String r5 = "adapter_version"
            java.lang.String r3 = r3.toString()     // Catch:{ zzfjl -> 0x005c }
            r4.putString(r5, r3)     // Catch:{ zzfjl -> 0x005c }
        L_0x005c:
            r1.putBundle(r2, r4)     // Catch:{ zzfjl -> 0x0060 }
            goto L_0x001f
        L_0x0060:
            goto L_0x001f
        L_0x0062:
            com.google.android.gms.internal.ads.zzeuc r0 = new com.google.android.gms.internal.ads.zzeuc
            r2 = 0
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeua.zzc():com.google.android.gms.internal.ads.zzeuc");
    }
}
