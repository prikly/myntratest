package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzmt implements zzmx {
    public static final zzfyu zza = zzmr.zza;
    private static final Random zzb = new Random();
    /* access modifiers changed from: private */
    public final zzcm zzc;
    /* access modifiers changed from: private */
    public final zzck zzd;
    private final HashMap zze;
    private final zzfyu zzf;
    private zzmw zzg;
    private zzcn zzh;
    private String zzi;

    public zzmt() {
        throw null;
    }

    private final zzms zzk(int i, zzsh zzsh) {
        int i2;
        zzms zzms = null;
        long j = Long.MAX_VALUE;
        for (zzms zzms2 : this.zze.values()) {
            zzms2.zzg(i, zzsh);
            if (zzms2.zzj(i, zzsh)) {
                long zzb2 = zzms2.zzd;
                if (zzb2 == -1 || zzb2 < j) {
                    zzms = zzms2;
                    j = zzb2;
                } else if (i2 == 0) {
                    int i3 = zzen.zza;
                    if (!(zzms.zze == null || zzms2.zze == null)) {
                        zzms = zzms2;
                    }
                }
            }
        }
        if (zzms != null) {
            return zzms;
        }
        String zzl = zzl();
        zzms zzms3 = new zzms(this, zzl, i, zzsh);
        this.zze.put(zzl, zzms3);
        return zzms3;
    }

    /* access modifiers changed from: private */
    public static String zzl() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private final void zzm(zzkn zzkn) {
        if (zzkn.zzb.zzo()) {
            this.zzi = null;
            return;
        }
        zzms zzms = (zzms) this.zze.get(this.zzi);
        zzms zzk = zzk(zzkn.zzc, zzkn.zzd);
        this.zzi = zzk.zzb;
        zzh(zzkn);
        zzsh zzsh = zzkn.zzd;
        if (zzsh != null && zzsh.zzb()) {
            if (zzms == null || zzms.zzd != zzkn.zzd.zzd || zzms.zze == null || zzms.zze.zzb != zzkn.zzd.zzb || zzms.zze.zzc != zzkn.zzd.zzc) {
                zzsh zzsh2 = zzkn.zzd;
                String unused = zzk(zzkn.zzc, new zzsh(zzsh2.zza, zzsh2.zzd)).zzb;
                String unused2 = zzk.zzb;
            }
        }
    }

    public final synchronized String zzd() {
        return this.zzi;
    }

    public final synchronized String zze(zzcn zzcn, zzsh zzsh) {
        return zzk(zzcn.zzn(zzsh.zza, this.zzd).zzd, zzsh).zzb;
    }

    public final synchronized void zzf(zzkn zzkn) {
        zzmw zzmw;
        this.zzi = null;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzms zzms = (zzms) it.next();
            it.remove();
            if (zzms.zzf && (zzmw = this.zzg) != null) {
                zzmw.zzd(zzkn, zzms.zzb, false);
            }
        }
    }

    public final void zzg(zzmw zzmw) {
        this.zzg = zzmw;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if (r10.zzd.zzd < com.google.android.gms.internal.ads.zzms.zzb(r0)) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c9, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzh(com.google.android.gms.internal.ads.zzkn r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zzmw r0 = r9.zzg     // Catch:{ all -> 0x00cc }
            if (r0 == 0) goto L_0x00ca
            com.google.android.gms.internal.ads.zzcn r0 = r10.zzb     // Catch:{ all -> 0x00cc }
            boolean r0 = r0.zzo()     // Catch:{ all -> 0x00cc }
            if (r0 == 0) goto L_0x000f
            monitor-exit(r9)
            return
        L_0x000f:
            java.util.HashMap r0 = r9.zze     // Catch:{ all -> 0x00cc }
            java.lang.String r1 = r9.zzi     // Catch:{ all -> 0x00cc }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.zzms r0 = (com.google.android.gms.internal.ads.zzms) r0     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.zzsh r1 = r10.zzd     // Catch:{ all -> 0x00cc }
            if (r1 == 0) goto L_0x0040
            if (r0 == 0) goto L_0x0040
            long r1 = r0.zzd     // Catch:{ all -> 0x00cc }
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0032
            int r0 = r0.zzc     // Catch:{ all -> 0x00cc }
            int r1 = r10.zzc     // Catch:{ all -> 0x00cc }
            if (r0 != r1) goto L_0x003e
            goto L_0x0040
        L_0x0032:
            com.google.android.gms.internal.ads.zzsh r1 = r10.zzd     // Catch:{ all -> 0x00cc }
            long r1 = r1.zzd     // Catch:{ all -> 0x00cc }
            long r3 = r0.zzd     // Catch:{ all -> 0x00cc }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0040
        L_0x003e:
            monitor-exit(r9)
            return
        L_0x0040:
            int r0 = r10.zzc     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.zzsh r1 = r10.zzd     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.zzms r0 = r9.zzk(r0, r1)     // Catch:{ all -> 0x00cc }
            java.lang.String r1 = r9.zzi     // Catch:{ all -> 0x00cc }
            if (r1 != 0) goto L_0x0052
            java.lang.String r1 = r0.zzb     // Catch:{ all -> 0x00cc }
            r9.zzi = r1     // Catch:{ all -> 0x00cc }
        L_0x0052:
            com.google.android.gms.internal.ads.zzsh r1 = r10.zzd     // Catch:{ all -> 0x00cc }
            r2 = 1
            if (r1 == 0) goto L_0x009c
            boolean r3 = r1.zzb()     // Catch:{ all -> 0x00cc }
            if (r3 == 0) goto L_0x009c
            com.google.android.gms.internal.ads.zzsh r3 = new com.google.android.gms.internal.ads.zzsh     // Catch:{ all -> 0x00cc }
            java.lang.Object r4 = r1.zza     // Catch:{ all -> 0x00cc }
            long r5 = r1.zzd     // Catch:{ all -> 0x00cc }
            int r1 = r1.zzb     // Catch:{ all -> 0x00cc }
            r3.<init>(r4, r5, r1)     // Catch:{ all -> 0x00cc }
            int r1 = r10.zzc     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.zzms r1 = r9.zzk(r1, r3)     // Catch:{ all -> 0x00cc }
            boolean r3 = r1.zzf     // Catch:{ all -> 0x00cc }
            if (r3 != 0) goto L_0x009c
            r1.zzf = true     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.zzcn r3 = r10.zzb     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.zzsh r4 = r10.zzd     // Catch:{ all -> 0x00cc }
            java.lang.Object r4 = r4.zza     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.zzck r5 = r9.zzd     // Catch:{ all -> 0x00cc }
            r3.zzn(r4, r5)     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.zzck r3 = r9.zzd     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.zzsh r4 = r10.zzd     // Catch:{ all -> 0x00cc }
            int r4 = r4.zzb     // Catch:{ all -> 0x00cc }
            r3.zzh(r4)     // Catch:{ all -> 0x00cc }
            r3 = 0
            long r5 = com.google.android.gms.internal.ads.zzen.zzz(r3)     // Catch:{ all -> 0x00cc }
            long r7 = com.google.android.gms.internal.ads.zzen.zzz(r3)     // Catch:{ all -> 0x00cc }
            long r5 = r5 + r7
            java.lang.Math.max(r3, r5)     // Catch:{ all -> 0x00cc }
            java.lang.String unused = r1.zzb     // Catch:{ all -> 0x00cc }
        L_0x009c:
            boolean r1 = r0.zzf     // Catch:{ all -> 0x00cc }
            if (r1 != 0) goto L_0x00a8
            r0.zzf = true     // Catch:{ all -> 0x00cc }
            java.lang.String unused = r0.zzb     // Catch:{ all -> 0x00cc }
        L_0x00a8:
            java.lang.String r1 = r0.zzb     // Catch:{ all -> 0x00cc }
            java.lang.String r3 = r9.zzi     // Catch:{ all -> 0x00cc }
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x00cc }
            if (r1 == 0) goto L_0x00c8
            boolean r1 = r0.zzg     // Catch:{ all -> 0x00cc }
            if (r1 != 0) goto L_0x00c8
            r0.zzg = true     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.zzmw r1 = r9.zzg     // Catch:{ all -> 0x00cc }
            java.lang.String r0 = r0.zzb     // Catch:{ all -> 0x00cc }
            r1.zzc(r10, r0)     // Catch:{ all -> 0x00cc }
            monitor-exit(r9)
            return
        L_0x00c8:
            monitor-exit(r9)
            return
        L_0x00ca:
            r10 = 0
            throw r10     // Catch:{ all -> 0x00cc }
        L_0x00cc:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmt.zzh(com.google.android.gms.internal.ads.zzkn):void");
    }

    public final synchronized void zzi(zzkn zzkn, int i) {
        if (this.zzg != null) {
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzms zzms = (zzms) it.next();
                if (zzms.zzk(zzkn)) {
                    it.remove();
                    if (zzms.zzf) {
                        boolean equals = zzms.zzb.equals(this.zzi);
                        boolean z = false;
                        if (i == 0 && equals && zzms.zzg) {
                            z = true;
                        }
                        if (equals) {
                            this.zzi = null;
                        }
                        this.zzg.zzd(zzkn, zzms.zzb, z);
                    }
                }
            }
            zzm(zzkn);
        } else {
            throw null;
        }
    }

    public final synchronized void zzj(zzkn zzkn) {
        if (this.zzg != null) {
            zzcn zzcn = this.zzh;
            this.zzh = zzkn.zzb;
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzms zzms = (zzms) it.next();
                if (!zzms.zzl(zzcn, this.zzh) || zzms.zzk(zzkn)) {
                    it.remove();
                    if (zzms.zzf) {
                        if (zzms.zzb.equals(this.zzi)) {
                            this.zzi = null;
                        }
                        this.zzg.zzd(zzkn, zzms.zzb, false);
                    }
                }
            }
            zzm(zzkn);
        } else {
            throw null;
        }
    }

    public zzmt(zzfyu zzfyu) {
        this.zzf = zzfyu;
        this.zzc = new zzcm();
        this.zzd = new zzck();
        this.zze = new HashMap();
        this.zzh = zzcn.zza;
    }
}
