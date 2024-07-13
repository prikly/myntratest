package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfkt implements zzfks {
    private final ConcurrentHashMap zza;
    private final zzfkz zzb;
    private final zzfkv zzc = new zzfkv();

    public zzfkt(zzfkz zzfkz) {
        this.zza = new ConcurrentHashMap(zzfkz.zzd);
        this.zzb = zzfkz;
    }

    private final void zzf() {
        Parcelable.Creator<zzfkz> creator = zzfkz.CREATOR;
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzfN)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.zzb.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzb());
            int i = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzflc) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((zzfkr) entry.getValue()).zzb(); i2++) {
                    sb.append("[O]");
                }
                for (int zzb2 = ((zzfkr) entry.getValue()).zzb(); zzb2 < this.zzb.zzd; zzb2++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zzfkr) entry.getValue()).zzg());
                sb.append("\n");
            }
            while (i < this.zzb.zzc) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            zze.zze(sb.toString());
        }
    }

    public final zzfkz zza() {
        return this.zzb;
    }

    public final synchronized zzflb zzb(zzflc zzflc) {
        zzflb zzflb;
        zzfkr zzfkr = (zzfkr) this.zza.get(zzflc);
        if (zzfkr != null) {
            zzflb = zzfkr.zze();
            if (zzflb == null) {
                this.zzc.zze();
            }
            zzflp zzf = zzfkr.zzf();
            if (zzflb != null) {
                zzbfl zza2 = zzbfr.zza();
                zzbfj zza3 = zzbfk.zza();
                zza3.zzd(2);
                zzbfn zza4 = zzbfo.zza();
                zza4.zza(zzf.zza);
                zza4.zzb(zzf.zzb);
                zza3.zza(zza4);
                zza2.zza(zza3);
                zzflb.zza.zzb().zzc().zze((zzbfr) zza2.zzak());
            }
            zzf();
        } else {
            this.zzc.zzf();
            zzf();
            zzflb = null;
        }
        return zzflb;
    }

    @Deprecated
    public final zzflc zzc(zzl zzl, String str, zzw zzw) {
        return new zzfld(zzl, str, new zzccf(this.zzb.zza).zza().zzk, this.zzb.zzf, zzw);
    }

    public final synchronized boolean zzd(zzflc zzflc, zzflb zzflb) {
        boolean zzh;
        zzfkr zzfkr = (zzfkr) this.zza.get(zzflc);
        zzflb.zzd = zzt.zzB().currentTimeMillis();
        if (zzfkr == null) {
            zzfkz zzfkz = this.zzb;
            zzfkr = new zzfkr(zzfkz.zzd, zzfkz.zze * 1000);
            int size = this.zza.size();
            zzfkz zzfkz2 = this.zzb;
            if (size == zzfkz2.zzc) {
                int i = zzfkz2.zzg;
                int i2 = i - 1;
                zzflc zzflc2 = null;
                if (i != 0) {
                    long j = Long.MAX_VALUE;
                    if (i2 == 0) {
                        for (Map.Entry entry : this.zza.entrySet()) {
                            if (((zzfkr) entry.getValue()).zzc() < j) {
                                j = ((zzfkr) entry.getValue()).zzc();
                                zzflc2 = (zzflc) entry.getKey();
                            }
                        }
                        if (zzflc2 != null) {
                            this.zza.remove(zzflc2);
                        }
                    } else if (i2 == 1) {
                        for (Map.Entry entry2 : this.zza.entrySet()) {
                            if (((zzfkr) entry2.getValue()).zzd() < j) {
                                j = ((zzfkr) entry2.getValue()).zzd();
                                zzflc2 = (zzflc) entry2.getKey();
                            }
                        }
                        if (zzflc2 != null) {
                            this.zza.remove(zzflc2);
                        }
                    } else if (i2 == 2) {
                        int i3 = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : this.zza.entrySet()) {
                            if (((zzfkr) entry3.getValue()).zza() < i3) {
                                i3 = ((zzfkr) entry3.getValue()).zza();
                                zzflc2 = (zzflc) entry3.getKey();
                            }
                        }
                        if (zzflc2 != null) {
                            this.zza.remove(zzflc2);
                        }
                    }
                    this.zzc.zzg();
                } else {
                    throw null;
                }
            }
            this.zza.put(zzflc, zzfkr);
            this.zzc.zzd();
        }
        zzh = zzfkr.zzh(zzflb);
        this.zzc.zzc();
        zzfku zza2 = this.zzc.zza();
        zzflp zzf = zzfkr.zzf();
        if (zzflb != null) {
            zzbfl zza3 = zzbfr.zza();
            zzbfj zza4 = zzbfk.zza();
            zza4.zzd(2);
            zzbfp zza5 = zzbfq.zza();
            zza5.zza(zza2.zza);
            zza5.zzb(zza2.zzb);
            zza5.zzc(zzf.zzb);
            zza4.zzc(zza5);
            zza3.zza(zza4);
            zzflb.zza.zzb().zzc().zzf((zzbfr) zza3.zzak());
        }
        zzf();
        return zzh;
    }

    public final synchronized boolean zze(zzflc zzflc) {
        zzfkr zzfkr = (zzfkr) this.zza.get(zzflc);
        if (zzfkr == null) {
            return true;
        }
        if (zzfkr.zzb() < this.zzb.zzd) {
            return true;
        }
        return false;
    }
}
