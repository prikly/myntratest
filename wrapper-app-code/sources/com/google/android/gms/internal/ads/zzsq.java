package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzsq {
    public final int zza;
    public final zzsh zzb;
    private final CopyOnWriteArrayList zzc;

    public zzsq() {
        this(new CopyOnWriteArrayList(), 0, (zzsh) null, 0);
    }

    private zzsq(CopyOnWriteArrayList copyOnWriteArrayList, int i, zzsh zzsh, long j) {
        this.zzc = copyOnWriteArrayList;
        this.zza = i;
        this.zzb = zzsh;
    }

    private static final long zzn(long j) {
        long zzz = zzen.zzz(j);
        if (zzz == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzz;
    }

    public final zzsq zza(int i, zzsh zzsh, long j) {
        return new zzsq(this.zzc, i, zzsh, 0);
    }

    public final void zzc(zzsd zzsd) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsp zzsp = (zzsp) it.next();
            zzen.zzY(zzsp.zza, new zzsk(this, zzsp.zzb, zzsd));
        }
    }

    public final void zzd(int i, zzaf zzaf, int i2, Object obj, long j) {
        zzc(new zzsd(1, i, zzaf, 0, (Object) null, zzn(j), -9223372036854775807L));
    }

    public final void zze(zzry zzry, zzsd zzsd) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsp zzsp = (zzsp) it.next();
            zzen.zzY(zzsp.zza, new zzsl(this, zzsp.zzb, zzry, zzsd));
        }
    }

    public final void zzf(zzry zzry, int i, int i2, zzaf zzaf, int i3, Object obj, long j, long j2) {
        zzry zzry2 = zzry;
        zze(zzry, new zzsd(1, -1, (zzaf) null, 0, (Object) null, zzn(j), zzn(j2)));
    }

    public final void zzg(zzry zzry, zzsd zzsd) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsp zzsp = (zzsp) it.next();
            zzen.zzY(zzsp.zza, new zzso(this, zzsp.zzb, zzry, zzsd));
        }
    }

    public final void zzh(zzry zzry, int i, int i2, zzaf zzaf, int i3, Object obj, long j, long j2) {
        zzry zzry2 = zzry;
        zzg(zzry, new zzsd(1, -1, (zzaf) null, 0, (Object) null, zzn(j), zzn(j2)));
    }

    public final void zzi(zzry zzry, zzsd zzsd, IOException iOException, boolean z) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsp zzsp = (zzsp) it.next();
            zzen.zzY(zzsp.zza, new zzsm(this, zzsp.zzb, zzry, zzsd, iOException, z));
        }
    }

    public final void zzj(zzry zzry, int i, int i2, zzaf zzaf, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        zzry zzry2 = zzry;
        zzi(zzry, new zzsd(1, -1, (zzaf) null, 0, (Object) null, zzn(j), zzn(j2)), iOException, z);
    }

    public final void zzk(zzry zzry, zzsd zzsd) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsp zzsp = (zzsp) it.next();
            zzen.zzY(zzsp.zza, new zzsn(this, zzsp.zzb, zzry, zzsd));
        }
    }

    public final void zzl(zzry zzry, int i, int i2, zzaf zzaf, int i3, Object obj, long j, long j2) {
        zzry zzry2 = zzry;
        zzk(zzry, new zzsd(1, -1, (zzaf) null, 0, (Object) null, zzn(j), zzn(j2)));
    }

    public final void zzm(zzsr zzsr) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsp zzsp = (zzsp) it.next();
            if (zzsp.zzb == zzsr) {
                this.zzc.remove(zzsp);
            }
        }
    }

    public final void zzb(Handler handler, zzsr zzsr) {
        if (zzsr != null) {
            this.zzc.add(new zzsp(handler, zzsr));
            return;
        }
        throw null;
    }
}
