package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzaup extends zzaxb implements zzban {
    /* access modifiers changed from: private */
    public final zzatz zzb;
    private final zzaul zzc = new zzaul((zzatq) null, new zzats[0], new zzauo(this, (zzaun) null));
    private boolean zzd;
    private int zze;
    private int zzf;
    private long zzg;
    /* access modifiers changed from: private */
    public boolean zzh;

    public zzaup(zzaxd zzaxd, zzavd zzavd, boolean z, Handler handler, zzaua zzaua) {
        super(1, zzaxd, (zzavd) null, true);
        this.zzb = new zzatz(handler, zzaua);
    }

    public final boolean zzE() {
        return super.zzE() && this.zzc.zzo();
    }

    public final boolean zzF() {
        return this.zzc.zzn() || super.zzF();
    }

    /* access modifiers changed from: protected */
    public final int zzH(zzaxd zzaxd, zzatd zzatd) throws zzaxg {
        int i;
        int i2;
        String str = zzatd.zzf;
        if (!zzbao.zza(str)) {
            return 0;
        }
        int i3 = zzbay.zza >= 21 ? 16 : 0;
        zzawz zzc2 = zzaxl.zzc(str, false);
        if (zzc2 == null) {
            return 1;
        }
        int i4 = 2;
        if (zzbay.zza < 21 || (((i = zzatd.zzs) == -1 || zzc2.zzd(i)) && ((i2 = zzatd.zzr) == -1 || zzc2.zzc(i2)))) {
            i4 = 3;
        }
        return i3 | 4 | i4;
    }

    public final long zzI() {
        long zza = this.zzc.zza(zzE());
        if (zza != Long.MIN_VALUE) {
            if (!this.zzh) {
                zza = Math.max(this.zzg, zza);
            }
            this.zzg = zza;
            this.zzh = false;
        }
        return this.zzg;
    }

    public final zzath zzJ() {
        return this.zzc.zzc();
    }

    public final zzath zzK(zzath zzath) {
        return this.zzc.zzd(zzath);
    }

    /* access modifiers changed from: protected */
    public final zzawz zzM(zzaxd zzaxd, zzatd zzatd, boolean z) throws zzaxg {
        return super.zzM(zzaxd, zzatd, false);
    }

    /* access modifiers changed from: protected */
    public final void zzO(zzawz zzawz, MediaCodec mediaCodec, zzatd zzatd, MediaCrypto mediaCrypto) {
        String str = zzawz.zza;
        boolean z = true;
        if (zzbay.zza >= 24 || !"OMX.SEC.aac.dec".equals(str) || !"samsung".equals(zzbay.zzc) || (!zzbay.zzb.startsWith("zeroflte") && !zzbay.zzb.startsWith("herolte") && !zzbay.zzb.startsWith("heroqlte"))) {
            z = false;
        }
        this.zzd = z;
        mediaCodec.configure(zzatd.zzb(), (Surface) null, (MediaCrypto) null, 0);
    }

    /* access modifiers changed from: protected */
    public final void zzP(String str, long j, long j2) {
        this.zzb.zzd(str, j, j2);
    }

    /* access modifiers changed from: protected */
    public final void zzQ(zzatd zzatd) throws zzasp {
        super.zzQ(zzatd);
        this.zzb.zzg(zzatd);
        this.zze = "audio/raw".equals(zzatd.zzf) ? zzatd.zzt : 2;
        this.zzf = zzatd.zzr;
    }

    /* access modifiers changed from: protected */
    public final void zzR(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzasp {
        int[] iArr;
        int i;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (!this.zzd || integer != 6) {
            i = integer;
            iArr = null;
        } else {
            int i2 = this.zzf;
            if (i2 < 6) {
                int[] iArr2 = new int[i2];
                for (int i3 = 0; i3 < this.zzf; i3++) {
                    iArr2[i3] = i3;
                }
                iArr = iArr2;
            } else {
                iArr = null;
            }
            i = 6;
        }
        try {
            this.zzc.zze("audio/raw", i, integer2, this.zze, 0, iArr);
        } catch (zzauf e2) {
            throw zzasp.zza(e2, zza());
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zzT(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws zzasp {
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.zza.zze++;
            this.zzc.zzf();
            return true;
        }
        try {
            if (!this.zzc.zzm(byteBuffer, j3)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i, false);
            this.zza.zzd++;
            return true;
        } catch (zzaug | zzauk e2) {
            throw zzasp.zza(e2, zza());
        }
    }

    public final zzban zzi() {
        return this;
    }

    public final void zzl(int i, Object obj) throws zzasp {
        if (i == 2) {
            this.zzc.zzl(((Float) obj).floatValue());
        }
    }

    /* access modifiers changed from: protected */
    public final void zzn() {
        try {
            this.zzc.zzj();
            try {
                super.zzn();
            } finally {
                this.zza.zza();
                this.zzb.zze(this.zza);
            }
        } catch (Throwable th) {
            super.zzn();
            throw th;
        } finally {
            this.zza.zza();
            this.zzb.zze(this.zza);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzo(boolean z) throws zzasp {
        super.zzo(z);
        this.zzb.zzf(this.zza);
        int i = zzg().zzb;
    }

    /* access modifiers changed from: protected */
    public final void zzp(long j, boolean z) throws zzasp {
        super.zzp(j, z);
        this.zzc.zzk();
        this.zzg = j;
        this.zzh = true;
    }

    /* access modifiers changed from: protected */
    public final void zzq() {
        this.zzc.zzh();
    }

    /* access modifiers changed from: protected */
    public final void zzr() {
        this.zzc.zzg();
    }

    /* access modifiers changed from: protected */
    public final void zzS() throws zzasp {
        try {
            this.zzc.zzi();
        } catch (zzauk e2) {
            throw zzasp.zza(e2, zza());
        }
    }
}
