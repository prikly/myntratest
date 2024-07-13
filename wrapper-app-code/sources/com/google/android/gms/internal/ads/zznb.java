package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zznb {
    public static final zznb zza = new zznb(new int[]{2}, 8);
    private static final zznb zzb = new zznb(new int[]{2, 5, 6}, 8);
    /* access modifiers changed from: private */
    public static final zzgax zzc;
    private final int[] zzd;
    private final int zze = 8;

    static {
        zzgaw zzgaw = new zzgaw();
        zzgaw.zza(5, 6);
        zzgaw.zza(17, 6);
        zzgaw.zza(7, 6);
        zzgaw.zza(18, 6);
        zzgaw.zza(6, 8);
        zzgaw.zza(8, 8);
        zzgaw.zza(14, 8);
        zzc = zzgaw.zzc();
    }

    public zznb(int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.zzd = copyOf;
        Arrays.sort(copyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zznb)) {
            return false;
        }
        zznb zznb = (zznb) obj;
        if (!Arrays.equals(this.zzd, zznb.zzd)) {
            return false;
        }
        int i = zznb.zze;
        return true;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zzd) * 31) + 8;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.zzd);
        return "AudioCapabilities[maxChannelCount=8, supportedEncodings=" + arrays + "]";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0080, code lost:
        if (r6 != 5) goto L_0x0083;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x009e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair zza(com.google.android.gms.internal.ads.zzaf r9) {
        /*
            r8 = this;
            java.lang.String r0 = r9.zzm
            r1 = 0
            if (r0 == 0) goto L_0x00ad
            java.lang.String r2 = r9.zzj
            int r0 = com.google.android.gms.internal.ads.zzbt.zza(r0, r2)
            com.google.android.gms.internal.ads.zzgax r2 = zzc
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            boolean r2 = r2.containsKey(r3)
            if (r2 != 0) goto L_0x0018
            return r1
        L_0x0018:
            r2 = 7
            r3 = 6
            r4 = 8
            r5 = 18
            if (r0 != r5) goto L_0x002a
            boolean r0 = r8.zzc(r5)
            if (r0 != 0) goto L_0x0028
            r0 = 6
            goto L_0x0033
        L_0x0028:
            r0 = 18
        L_0x002a:
            if (r0 != r4) goto L_0x0033
            boolean r6 = r8.zzc(r4)
            if (r6 != 0) goto L_0x0033
            r0 = 7
        L_0x0033:
            boolean r6 = r8.zzc(r0)
            if (r6 != 0) goto L_0x003a
            return r1
        L_0x003a:
            int r6 = r9.zzz
            r7 = -1
            if (r6 == r7) goto L_0x0045
            if (r0 != r5) goto L_0x0042
            goto L_0x0045
        L_0x0042:
            if (r6 <= r4) goto L_0x006e
            return r1
        L_0x0045:
            int r9 = r9.zzA
            if (r9 != r7) goto L_0x004c
            r9 = 48000(0xbb80, float:6.7262E-41)
        L_0x004c:
            int r5 = com.google.android.gms.internal.ads.zzen.zza
            r6 = 29
            if (r5 < r6) goto L_0x0057
            int r6 = com.google.android.gms.internal.ads.zzna.zza(r0, r9)
            goto L_0x006e
        L_0x0057:
            com.google.android.gms.internal.ads.zzgax r9 = zzc
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r9 = r9.getOrDefault(r5, r6)
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 == 0) goto L_0x00ac
            int r6 = r9.intValue()
        L_0x006e:
            int r9 = com.google.android.gms.internal.ads.zzen.zza
            r5 = 28
            if (r9 > r5) goto L_0x0083
            if (r6 != r2) goto L_0x0079
            r3 = 8
            goto L_0x0084
        L_0x0079:
            r9 = 3
            if (r6 == r9) goto L_0x0084
            r9 = 4
            if (r6 == r9) goto L_0x0084
            r9 = 5
            if (r6 != r9) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r3 = r6
        L_0x0084:
            int r9 = com.google.android.gms.internal.ads.zzen.zza
            r2 = 26
            if (r9 > r2) goto L_0x0098
            java.lang.String r9 = com.google.android.gms.internal.ads.zzen.zzb
            java.lang.String r2 = "fugu"
            boolean r9 = r2.equals(r9)
            if (r9 == 0) goto L_0x0098
            r9 = 1
            if (r3 != r9) goto L_0x0098
            r3 = 2
        L_0x0098:
            int r9 = com.google.android.gms.internal.ads.zzen.zzj(r3)
            if (r9 != 0) goto L_0x009f
            return r1
        L_0x009f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            android.util.Pair r9 = android.util.Pair.create(r0, r9)
            return r9
        L_0x00ac:
            throw r1
        L_0x00ad:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zznb.zza(com.google.android.gms.internal.ads.zzaf):android.util.Pair");
    }

    public final boolean zzc(int i) {
        return Arrays.binarySearch(this.zzd, i) >= 0;
    }
}
