package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzasw implements zzast {
    private final zzati[] zza;
    private final zzazo zzb;
    private final zzazm zzc;
    private final Handler zzd;
    private final zzatb zze;
    private final CopyOnWriteArraySet zzf;
    private final zzatn zzg;
    private final zzatm zzh;
    private boolean zzi;
    private boolean zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private zzato zzo;
    private Object zzp;
    private zzaza zzq;
    private zzazm zzr;
    private zzath zzs;
    private zzasy zzt;
    private long zzu;

    public zzasw(zzati[] zzatiArr, zzazo zzazo, zzcku zzcku, byte[] bArr) {
        zzazo zzazo2 = zzazo;
        String str = zzbay.zze;
        Log.i("ExoPlayerImpl", "Init ExoPlayerLib/2.4.2 [" + str + "]");
        this.zza = zzatiArr;
        if (zzazo2 != null) {
            this.zzb = zzazo2;
            this.zzj = false;
            this.zzk = 1;
            this.zzf = new CopyOnWriteArraySet();
            this.zzc = new zzazm(new zzaze[2], (byte[]) null);
            this.zzo = zzato.zza;
            this.zzg = new zzatn();
            this.zzh = new zzatm();
            this.zzq = zzaza.zza;
            this.zzr = this.zzc;
            this.zzs = zzath.zza;
            this.zzd = new zzasv(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
            zzasy zzasy = new zzasy(0, 0);
            this.zzt = zzasy;
            this.zze = new zzatb(zzatiArr, zzazo, zzcku, this.zzj, 0, this.zzd, zzasy, this, (byte[]) null);
            return;
        }
        throw null;
    }

    public final int zza() {
        return this.zzk;
    }

    public final long zzb() {
        if (this.zzo.zzh() || this.zzl > 0) {
            return this.zzu;
        }
        this.zzo.zzd(this.zzt.zza, this.zzh, false);
        return zzaso.zzb(0) + zzaso.zzb(this.zzt.zzd);
    }

    public final long zzc() {
        if (this.zzo.zzh() || this.zzl > 0) {
            return this.zzu;
        }
        this.zzo.zzd(this.zzt.zza, this.zzh, false);
        return zzaso.zzb(0) + zzaso.zzb(this.zzt.zzc);
    }

    public final long zzd() {
        if (this.zzo.zzh()) {
            return -9223372036854775807L;
        }
        zzato zzato = this.zzo;
        zzs();
        return zzaso.zzb(zzato.zzg(0, this.zzg, false).zza);
    }

    public final void zze(zzasq zzasq) {
        this.zzf.add(zzasq);
    }

    public final void zzf(zzass... zzassArr) {
        if (!this.zze.zzr()) {
            this.zze.zza(zzassArr);
        } else if (!this.zze.zzq(zzassArr)) {
            Iterator it = this.zzf.iterator();
            while (it.hasNext()) {
                ((zzasq) it.next()).zzc(zzasp.zzc(new RuntimeException(new TimeoutException("ExoPlayer3 blockingSendMessages timeout"))));
            }
        }
    }

    public final void zzg() {
        this.zze.zzb();
    }

    public final void zzh(int i) {
        this.zze.zzc(i);
    }

    public final void zzi() {
        this.zze.zzd();
    }

    public final void zzj(zzayl zzayl) {
        if (!this.zzo.zzh() || this.zzp != null) {
            this.zzo = zzato.zza;
            this.zzp = null;
            Iterator it = this.zzf.iterator();
            while (it.hasNext()) {
                ((zzasq) it.next()).zzf(this.zzo, this.zzp);
            }
        }
        if (this.zzi) {
            this.zzi = false;
            this.zzq = zzaza.zza;
            this.zzr = this.zzc;
            this.zzb.zzd((Object) null);
            Iterator it2 = this.zzf.iterator();
            while (it2.hasNext()) {
                ((zzasq) it2.next()).zzg(this.zzq, this.zzr);
            }
        }
        this.zzm++;
        this.zze.zzi(zzayl, true);
    }

    public final void zzk() {
        if (this.zze.zzr()) {
            if (!this.zze.zzs()) {
                Iterator it = this.zzf.iterator();
                while (it.hasNext()) {
                    ((zzasq) it.next()).zzc(zzasp.zzc(new RuntimeException(new TimeoutException("ExoPlayer3 release timeout"))));
                }
            }
            this.zzd.removeCallbacksAndMessages((Object) null);
            return;
        }
        this.zze.zzj();
        this.zzd.removeCallbacksAndMessages((Object) null);
    }

    public final void zzl(zzasq zzasq) {
        this.zzf.remove(zzasq);
    }

    public final void zzm(long j) {
        zzs();
        if (this.zzo.zzh() || this.zzo.zzc() > 0) {
            this.zzl++;
            if (!this.zzo.zzh()) {
                this.zzo.zzg(0, this.zzg, false);
                long zza2 = zzaso.zza(j);
                long j2 = this.zzo.zzd(0, this.zzh, false).zzc;
                if (j2 != -9223372036854775807L) {
                    int i = (zza2 > j2 ? 1 : (zza2 == j2 ? 0 : -1));
                }
            }
            this.zzu = j;
            this.zze.zzk(this.zzo, 0, zzaso.zza(j));
            Iterator it = this.zzf.iterator();
            while (it.hasNext()) {
                ((zzasq) it.next()).zze();
            }
            return;
        }
        throw new zzatf(this.zzo, 0, j);
    }

    public final void zzn(zzass... zzassArr) {
        this.zze.zzl(zzassArr);
    }

    public final void zzo(int i) {
        this.zze.zzm(i);
    }

    public final void zzp(int i) {
        this.zze.zzn(i);
    }

    public final void zzq(boolean z) {
        if (this.zzj != z) {
            this.zzj = z;
            this.zze.zzo(z);
            Iterator it = this.zzf.iterator();
            while (it.hasNext()) {
                ((zzasq) it.next()).zzd(z, this.zzk);
            }
        }
    }

    public final void zzr() {
        this.zze.zzp();
    }

    public final int zzs() {
        if (!this.zzo.zzh() && this.zzl <= 0) {
            this.zzo.zzd(this.zzt.zza, this.zzh, false);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final void zzt(Message message) {
        boolean z = true;
        switch (message.what) {
            case 0:
                this.zzm--;
                return;
            case 1:
                this.zzk = message.arg1;
                Iterator it = this.zzf.iterator();
                while (it.hasNext()) {
                    ((zzasq) it.next()).zzd(this.zzj, this.zzk);
                }
                return;
            case 2:
                if (message.arg1 == 0) {
                    z = false;
                }
                this.zzn = z;
                Iterator it2 = this.zzf.iterator();
                while (it2.hasNext()) {
                    ((zzasq) it2.next()).zza(this.zzn);
                }
                return;
            case 3:
                if (this.zzm == 0) {
                    zzazp zzazp = (zzazp) message.obj;
                    this.zzi = true;
                    this.zzq = zzazp.zza;
                    this.zzr = zzazp.zzb;
                    this.zzb.zzd(zzazp.zzc);
                    Iterator it3 = this.zzf.iterator();
                    while (it3.hasNext()) {
                        ((zzasq) it3.next()).zzg(this.zzq, this.zzr);
                    }
                    return;
                }
                return;
            case 4:
                int i = this.zzl - 1;
                this.zzl = i;
                if (i == 0) {
                    this.zzt = (zzasy) message.obj;
                    if (message.arg1 != 0) {
                        Iterator it4 = this.zzf.iterator();
                        while (it4.hasNext()) {
                            ((zzasq) it4.next()).zze();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.zzl == 0) {
                    this.zzt = (zzasy) message.obj;
                    Iterator it5 = this.zzf.iterator();
                    while (it5.hasNext()) {
                        ((zzasq) it5.next()).zze();
                    }
                    return;
                }
                return;
            case 6:
                zzata zzata = (zzata) message.obj;
                this.zzl -= zzata.zzd;
                if (this.zzm == 0) {
                    this.zzo = zzata.zza;
                    this.zzp = zzata.zzb;
                    this.zzt = zzata.zzc;
                    Iterator it6 = this.zzf.iterator();
                    while (it6.hasNext()) {
                        ((zzasq) it6.next()).zzf(this.zzo, this.zzp);
                    }
                    return;
                }
                return;
            case 7:
                zzath zzath = (zzath) message.obj;
                if (!this.zzs.equals(zzath)) {
                    this.zzs = zzath;
                    Iterator it7 = this.zzf.iterator();
                    while (it7.hasNext()) {
                        ((zzasq) it7.next()).zzb(zzath);
                    }
                    return;
                }
                return;
            case 8:
                zzasp zzasp = (zzasp) message.obj;
                Iterator it8 = this.zzf.iterator();
                while (it8.hasNext()) {
                    ((zzasq) it8.next()).zzc(zzasp);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }
}
