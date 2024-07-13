package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzpc implements zzne {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zznc zze = zznc.zza;
    private zznc zzf;
    private zznc zzg;
    private zznc zzh;
    private boolean zzi;
    private zzpb zzj;
    private ByteBuffer zzk;
    private ShortBuffer zzl;
    private ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzpc() {
        zznc zznc = zznc.zza;
        this.zzf = zznc;
        this.zzg = zznc;
        this.zzh = zznc;
        ByteBuffer byteBuffer = zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = zza;
        this.zzb = -1;
    }

    public final zznc zza(zznc zznc) throws zznd {
        if (zznc.zzd == 2) {
            int i = this.zzb;
            if (i == -1) {
                i = zznc.zzb;
            }
            this.zze = zznc;
            zznc zznc2 = new zznc(i, zznc.zzc, 2);
            this.zzf = zznc2;
            this.zzi = true;
            return zznc2;
        }
        throw new zznd(zznc);
    }

    public final ByteBuffer zzb() {
        int zza;
        zzpb zzpb = this.zzj;
        if (zzpb != null && (zza = zzpb.zza()) > 0) {
            if (this.zzk.capacity() < zza) {
                ByteBuffer order = ByteBuffer.allocateDirect(zza).order(ByteOrder.nativeOrder());
                this.zzk = order;
                this.zzl = order.asShortBuffer();
            } else {
                this.zzk.clear();
                this.zzl.clear();
            }
            zzpb.zzd(this.zzl);
            this.zzo += (long) zza;
            this.zzk.limit(zza);
            this.zzm = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzm;
        this.zzm = zza;
        return byteBuffer;
    }

    public final void zzc() {
        if (zzg()) {
            zznc zznc = this.zze;
            this.zzg = zznc;
            this.zzh = this.zzf;
            if (this.zzi) {
                this.zzj = new zzpb(zznc.zzb, zznc.zzc, this.zzc, this.zzd, this.zzh.zzb);
            } else {
                zzpb zzpb = this.zzj;
                if (zzpb != null) {
                    zzpb.zzc();
                }
            }
        }
        this.zzm = zza;
        this.zzn = 0;
        this.zzo = 0;
        this.zzp = false;
    }

    public final void zzd() {
        zzpb zzpb = this.zzj;
        if (zzpb != null) {
            zzpb.zze();
        }
        this.zzp = true;
    }

    public final void zze(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            zzpb zzpb = this.zzj;
            if (zzpb != null) {
                ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
                int remaining = byteBuffer.remaining();
                this.zzn += (long) remaining;
                zzpb.zzf(asShortBuffer);
                byteBuffer.position(byteBuffer.position() + remaining);
                return;
            }
            throw null;
        }
    }

    public final void zzf() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        this.zze = zznc.zza;
        zznc zznc = zznc.zza;
        this.zzf = zznc;
        this.zzg = zznc;
        this.zzh = zznc;
        ByteBuffer byteBuffer = zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = zza;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzn = 0;
        this.zzo = 0;
        this.zzp = false;
    }

    public final boolean zzg() {
        if (this.zzf.zzb != -1) {
            return Math.abs(this.zzc + -1.0f) >= 1.0E-4f || Math.abs(this.zzd + -1.0f) >= 1.0E-4f || this.zzf.zzb != this.zze.zzb;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r3.zzj;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzh() {
        /*
            r3 = this;
            boolean r0 = r3.zzp
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0012
            com.google.android.gms.internal.ads.zzpb r0 = r3.zzj
            if (r0 == 0) goto L_0x0013
            int r0 = r0.zza()
            if (r0 == 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            return r1
        L_0x0012:
            r1 = 0
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpc.zzh():boolean");
    }

    public final long zzi(long j) {
        long j2 = this.zzo;
        if (j2 < 1024) {
            return (long) (((double) this.zzc) * ((double) j));
        }
        long j3 = this.zzn;
        zzpb zzpb = this.zzj;
        if (zzpb != null) {
            long zzb2 = j3 - ((long) zzpb.zzb());
            int i = this.zzh.zzb;
            int i2 = this.zzg.zzb;
            if (i == i2) {
                return zzen.zzw(j, zzb2, j2);
            }
            return zzen.zzw(j, zzb2 * ((long) i), j2 * ((long) i2));
        }
        throw null;
    }

    public final void zzj(float f2) {
        if (this.zzd != f2) {
            this.zzd = f2;
            this.zzi = true;
        }
    }

    public final void zzk(float f2) {
        if (this.zzc != f2) {
            this.zzc = f2;
            this.zzi = true;
        }
    }
}
