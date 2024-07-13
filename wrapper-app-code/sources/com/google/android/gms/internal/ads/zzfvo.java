package com.google.android.gms.internal.ads;

import android.os.IBinder;
import com.applovin.exoplayer2.common.base.Ascii;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfvo extends zzfwi {
    private IBinder zza;
    private String zzb;
    private int zzc;
    private float zzd;
    private int zze;
    private String zzf;
    private byte zzg;

    zzfvo() {
    }

    public final zzfwi zza(String str) {
        this.zzf = str;
        return this;
    }

    public final zzfwi zzb(String str) {
        this.zzb = str;
        return this;
    }

    public final zzfwi zzc(int i) {
        this.zzg = (byte) (this.zzg | 8);
        return this;
    }

    public final zzfwi zzd(int i) {
        this.zzc = i;
        this.zzg = (byte) (this.zzg | 2);
        return this;
    }

    public final zzfwi zze(float f2) {
        this.zzd = f2;
        this.zzg = (byte) (this.zzg | 4);
        return this;
    }

    public final zzfwi zzf(boolean z) {
        this.zzg = (byte) (this.zzg | 1);
        return this;
    }

    public final zzfwi zzg(IBinder iBinder) {
        if (iBinder != null) {
            this.zza = iBinder;
            return this;
        }
        throw new NullPointerException("Null windowToken");
    }

    public final zzfwi zzh(int i) {
        this.zze = i;
        this.zzg = (byte) (this.zzg | Ascii.DLE);
        return this;
    }

    public final zzfwj zzi() {
        IBinder iBinder;
        if (this.zzg == 31 && (iBinder = this.zza) != null) {
            return new zzfvq(iBinder, false, this.zzb, this.zzc, this.zzd, 0, (String) null, this.zze, this.zzf, (zzfvp) null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" windowToken");
        }
        if ((this.zzg & 1) == 0) {
            sb.append(" stableSessionToken");
        }
        if ((this.zzg & 2) == 0) {
            sb.append(" layoutGravity");
        }
        if ((this.zzg & 4) == 0) {
            sb.append(" layoutVerticalMargin");
        }
        if ((this.zzg & 8) == 0) {
            sb.append(" displayMode");
        }
        if ((this.zzg & Ascii.DLE) == 0) {
            sb.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
