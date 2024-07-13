package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzoy extends zzqp implements zzjg {
    private final Context zzb;
    /* access modifiers changed from: private */
    public final zznp zzc;
    private final zznw zzd;
    private int zze;
    private boolean zzf;
    private zzaf zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    /* access modifiers changed from: private */
    public zzjx zzl;

    public zzoy(Context context, zzqi zzqi, zzqr zzqr, boolean z, Handler handler, zznq zznq, zznw zznw) {
        super(1, zzqi, zzqr, false, 44100.0f);
        this.zzb = context.getApplicationContext();
        this.zzd = zznw;
        this.zzc = new zznp(handler, zznq);
        zznw.zzn(new zzox(this, (zzow) null));
    }

    private final int zzaw(zzqm zzqm, zzaf zzaf) {
        if (!"OMX.google.raw.decoder".equals(zzqm.zza) || zzen.zza >= 24 || (zzen.zza == 23 && zzen.zzX(this.zzb))) {
            return zzaf.zzn;
        }
        return -1;
    }

    private static List zzax(zzqr zzqr, zzaf zzaf, boolean z, zznw zznw) throws zzqy {
        zzqm zzd2;
        String str = zzaf.zzm;
        if (str == null) {
            return zzgau.zzo();
        }
        if (zznw.zzv(zzaf) && (zzd2 = zzre.zzd()) != null) {
            return zzgau.zzp(zzd2);
        }
        List zzf2 = zzre.zzf(str, false, false);
        String zze2 = zzre.zze(zzaf);
        if (zze2 == null) {
            return zzgau.zzm(zzf2);
        }
        List zzf3 = zzre.zzf(zze2, false, false);
        zzgar zzi2 = zzgau.zzi();
        zzi2.zzf(zzf2);
        zzi2.zzf(zzf3);
        return zzi2.zzg();
    }

    private final void zzay() {
        long zzb2 = this.zzd.zzb(zzM());
        if (zzb2 != Long.MIN_VALUE) {
            if (!this.zzj) {
                zzb2 = Math.max(this.zzh, zzb2);
            }
            this.zzh = zzb2;
            this.zzj = false;
        }
    }

    public final String zzK() {
        return "MediaCodecAudioRenderer";
    }

    public final boolean zzM() {
        return super.zzM() && this.zzd.zzu();
    }

    public final boolean zzN() {
        return this.zzd.zzt() || super.zzN();
    }

    /* access modifiers changed from: protected */
    public final float zzP(float f2, zzaf zzaf, zzaf[] zzafArr) {
        int i = -1;
        for (zzaf zzaf2 : zzafArr) {
            int i2 = zzaf2.zzA;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return ((float) i) * f2;
    }

    /* access modifiers changed from: protected */
    public final int zzQ(zzqr zzqr, zzaf zzaf) throws zzqy {
        boolean z;
        int i = 128;
        if (!zzbt.zzg(zzaf.zzm)) {
            return 128;
        }
        int i2 = zzen.zza >= 21 ? 32 : 0;
        int i3 = zzaf.zzF;
        boolean zzav = zzav(zzaf);
        if (zzav && this.zzd.zzv(zzaf) && (i3 == 0 || zzre.zzd() != null)) {
            return i2 | IronSourceConstants.USING_CACHE_FOR_INIT_EVENT;
        }
        if (("audio/raw".equals(zzaf.zzm) && !this.zzd.zzv(zzaf)) || !this.zzd.zzv(zzen.zzF(2, zzaf.zzz, zzaf.zzA))) {
            return 129;
        }
        List zzax = zzax(zzqr, zzaf, false, this.zzd);
        if (zzax.isEmpty()) {
            return 129;
        }
        if (!zzav) {
            return 130;
        }
        zzqm zzqm = (zzqm) zzax.get(0);
        boolean zzd2 = zzqm.zzd(zzaf);
        if (!zzd2) {
            int i4 = 1;
            while (true) {
                if (i4 >= zzax.size()) {
                    break;
                }
                zzqm zzqm2 = (zzqm) zzax.get(i4);
                if (zzqm2.zzd(zzaf)) {
                    zzqm = zzqm2;
                    z = false;
                    zzd2 = true;
                    break;
                }
                i4++;
            }
        }
        z = true;
        int i5 = true != zzd2 ? 3 : 4;
        int i6 = 8;
        if (zzd2 && zzqm.zze(zzaf)) {
            i6 = 16;
        }
        int i7 = true != zzqm.zzg ? 0 : 64;
        if (true != z) {
            i = 0;
        }
        return i5 | i6 | i2 | i7 | i;
    }

    /* access modifiers changed from: protected */
    public final zzgt zzR(zzqm zzqm, zzaf zzaf, zzaf zzaf2) {
        int i;
        int i2;
        zzgt zzb2 = zzqm.zzb(zzaf, zzaf2);
        int i3 = zzb2.zze;
        if (zzaw(zzqm, zzaf2) > this.zze) {
            i3 |= 64;
        }
        String str = zzqm.zza;
        if (i3 != 0) {
            i = i3;
            i2 = 0;
        } else {
            i2 = zzb2.zzd;
            i = 0;
        }
        return new zzgt(str, zzaf, zzaf2, i2, i);
    }

    /* access modifiers changed from: protected */
    public final zzgt zzS(zzje zzje) throws zzha {
        zzgt zzS = super.zzS(zzje);
        this.zzc.zzg(zzje.zza, zzS);
        return zzS;
    }

    /* access modifiers changed from: protected */
    public final zzqh zzV(zzqm zzqm, zzaf zzaf, MediaCrypto mediaCrypto, float f2) {
        zzaf[] zzJ = zzJ();
        int zzaw = zzaw(zzqm, zzaf);
        if (r1 != 1) {
            for (zzaf zzaf2 : zzJ) {
                if (zzqm.zzb(zzaf, zzaf2).zzd != 0) {
                    zzaw = Math.max(zzaw, zzaw(zzqm, zzaf2));
                }
            }
        }
        this.zze = zzaw;
        this.zzf = zzen.zza < 24 && "OMX.SEC.aac.dec".equals(zzqm.zza) && "samsung".equals(zzen.zzc) && (zzen.zzb.startsWith("zeroflte") || zzen.zzb.startsWith("herolte") || zzen.zzb.startsWith("heroqlte"));
        String str = zzqm.zzc;
        int i = this.zze;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", zzaf.zzz);
        mediaFormat.setInteger("sample-rate", zzaf.zzA);
        zzdy.zzb(mediaFormat, zzaf.zzo);
        zzdy.zza(mediaFormat, "max-input-size", i);
        if (zzen.zza >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f2 != -1.0f && (zzen.zza != 23 || (!"ZTE B2017G".equals(zzen.zzd) && !"AXON 7 mini".equals(zzen.zzd)))) {
                mediaFormat.setFloat("operating-rate", f2);
            }
        }
        if (zzen.zza <= 28 && "audio/ac4".equals(zzaf.zzm)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (zzen.zza >= 24 && this.zzd.zza(zzen.zzF(4, zzaf.zzz, zzaf.zzA)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (zzen.zza >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        this.zzg = (!"audio/raw".equals(zzqm.zzb) || "audio/raw".equals(zzaf.zzm)) ? null : zzaf;
        return zzqh.zza(zzqm, mediaFormat, zzaf, (MediaCrypto) null);
    }

    /* access modifiers changed from: protected */
    public final List zzW(zzqr zzqr, zzaf zzaf, boolean z) throws zzqy {
        return zzre.zzg(zzax(zzqr, zzaf, false, this.zzd), zzaf);
    }

    /* access modifiers changed from: protected */
    public final void zzX(Exception exc) {
        zzdw.zzc("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zza(exc);
    }

    /* access modifiers changed from: protected */
    public final void zzY(String str, zzqh zzqh, long j, long j2) {
        this.zzc.zzc(str, j, j2);
    }

    /* access modifiers changed from: protected */
    public final void zzZ(String str) {
        this.zzc.zzd(str);
    }

    public final long zza() {
        if (zzbe() == 2) {
            zzay();
        }
        return this.zzh;
    }

    /* access modifiers changed from: protected */
    public final void zzab() {
        this.zzj = true;
    }

    /* access modifiers changed from: protected */
    public final void zzac() {
        this.zzd.zzf();
    }

    /* access modifiers changed from: protected */
    public final void zzad(zzgi zzgi) {
        if (this.zzi && !zzgi.zzf()) {
            if (Math.abs(zzgi.zzd - this.zzh) > 500000) {
                this.zzh = zzgi.zzd;
            }
            this.zzi = false;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zzag(zzaf zzaf) {
        return this.zzd.zzv(zzaf);
    }

    public final zzby zzc() {
        return this.zzd.zzc();
    }

    public final void zzg(zzby zzby) {
        this.zzd.zzo(zzby);
    }

    public final zzjg zzi() {
        return this;
    }

    public final void zzp(int i, Object obj) throws zzha {
        if (i == 2) {
            this.zzd.zzr(((Float) obj).floatValue());
        } else if (i == 3) {
            this.zzd.zzk((zzk) obj);
        } else if (i != 6) {
            switch (i) {
                case 9:
                    this.zzd.zzq(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    this.zzd.zzl(((Integer) obj).intValue());
                    return;
                case 11:
                    this.zzl = (zzjx) obj;
                    return;
                default:
                    return;
            }
        } else {
            this.zzd.zzm((zzl) obj);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzs() {
        this.zzk = true;
        try {
            this.zzd.zze();
            try {
                super.zzs();
            } finally {
                this.zzc.zze(this.zza);
            }
        } catch (Throwable th) {
            super.zzs();
            throw th;
        } finally {
            this.zzc.zze(this.zza);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzt(boolean z, boolean z2) throws zzha {
        super.zzt(z, z2);
        this.zzc.zzf(this.zza);
        zzk();
        this.zzd.zzp(zzl());
    }

    /* access modifiers changed from: protected */
    public final void zzu(long j, boolean z) throws zzha {
        super.zzu(j, z);
        this.zzd.zze();
        this.zzh = j;
        this.zzi = true;
        this.zzj = true;
    }

    /* access modifiers changed from: protected */
    public final void zzv() {
        try {
            super.zzv();
            if (this.zzk) {
                this.zzk = false;
                this.zzd.zzj();
            }
        } catch (Throwable th) {
            if (this.zzk) {
                this.zzk = false;
                this.zzd.zzj();
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzw() {
        this.zzd.zzh();
    }

    /* access modifiers changed from: protected */
    public final void zzx() {
        zzay();
        this.zzd.zzg();
    }

    /* access modifiers changed from: protected */
    public final void zzae() throws zzha {
        try {
            this.zzd.zzi();
        } catch (zznv e2) {
            throw zzbg(e2, e2.zzc, e2.zzb, IronSourceConstants.errorCode_isReadyException);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zzaf(long j, long j2, zzqj zzqj, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzaf zzaf) throws zzha {
        if (byteBuffer == null) {
            throw null;
        } else if (this.zzg == null || (i2 & 2) == 0) {
            if (z) {
                if (zzqj != null) {
                    zzqj.zzn(i, false);
                }
                this.zza.zzf += i3;
                this.zzd.zzf();
                return true;
            }
            try {
                if (!this.zzd.zzs(byteBuffer, j3, i3)) {
                    return false;
                }
                if (zzqj != null) {
                    zzqj.zzn(i, false);
                }
                this.zza.zze += i3;
                return true;
            } catch (zzns e2) {
                throw zzbg(e2, e2.zzc, e2.zzb, IronSourceConstants.errorCode_biddingDataException);
            } catch (zznv e3) {
                throw zzbg(e3, zzaf, e3.zzb, IronSourceConstants.errorCode_isReadyException);
            }
        } else if (zzqj != null) {
            zzqj.zzn(i, false);
            return true;
        } else {
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzaa(zzaf zzaf, MediaFormat mediaFormat) throws zzha {
        int i;
        int i2;
        zzaf zzaf2 = this.zzg;
        int[] iArr = null;
        if (zzaf2 != null) {
            zzaf = zzaf2;
        } else if (zzaj() != null) {
            if ("audio/raw".equals(zzaf.zzm)) {
                i = zzaf.zzB;
            } else if (zzen.zza < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                i = mediaFormat.containsKey("v-bits-per-sample") ? zzen.zzn(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                i = mediaFormat.getInteger("pcm-encoding");
            }
            zzad zzad = new zzad();
            zzad.zzS("audio/raw");
            zzad.zzN(i);
            zzad.zzC(zzaf.zzC);
            zzad.zzD(zzaf.zzD);
            zzad.zzw(mediaFormat.getInteger("channel-count"));
            zzad.zzT(mediaFormat.getInteger("sample-rate"));
            zzaf zzY = zzad.zzY();
            if (this.zzf && zzY.zzz == 6 && (i2 = zzaf.zzz) < 6) {
                iArr = new int[i2];
                for (int i3 = 0; i3 < zzaf.zzz; i3++) {
                    iArr[i3] = i3;
                }
            }
            zzaf = zzY;
        }
        try {
            this.zzd.zzd(zzaf, 0, iArr);
        } catch (zznr e2) {
            throw zzbg(e2, e2.zza, false, IronSourceConstants.errorCode_biddingDataException);
        }
    }
}
