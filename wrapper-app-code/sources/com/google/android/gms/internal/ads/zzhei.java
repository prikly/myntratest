package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzhei {
    public static final zzhei zza = new zzhei(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final zzhei zzb = new zzhei(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final zzhei zzc = new zzhei(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final zzhei zzd = new zzhei(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double zze;
    public final double zzf;
    public final double zzg;
    public final double zzh;
    public final double zzi;
    public final double zzj;
    public final double zzk;
    public final double zzl;
    public final double zzm;

    public zzhei(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        this.zze = d6;
        this.zzf = d7;
        this.zzg = d8;
        this.zzh = d2;
        this.zzi = d3;
        this.zzj = d4;
        this.zzk = d5;
        this.zzl = d9;
        this.zzm = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzhei zzhei = (zzhei) obj;
        return Double.compare(zzhei.zzh, this.zzh) == 0 && Double.compare(zzhei.zzi, this.zzi) == 0 && Double.compare(zzhei.zzj, this.zzj) == 0 && Double.compare(zzhei.zzk, this.zzk) == 0 && Double.compare(zzhei.zzl, this.zzl) == 0 && Double.compare(zzhei.zzm, this.zzm) == 0 && Double.compare(zzhei.zze, this.zze) == 0 && Double.compare(zzhei.zzf, this.zzf) == 0 && Double.compare(zzhei.zzg, this.zzg) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.zze);
        long doubleToLongBits2 = Double.doubleToLongBits(this.zzf);
        long doubleToLongBits3 = Double.doubleToLongBits(this.zzg);
        long doubleToLongBits4 = Double.doubleToLongBits(this.zzh);
        long doubleToLongBits5 = Double.doubleToLongBits(this.zzi);
        long doubleToLongBits6 = Double.doubleToLongBits(this.zzj);
        long doubleToLongBits7 = Double.doubleToLongBits(this.zzk);
        long doubleToLongBits8 = Double.doubleToLongBits(this.zzl);
        long doubleToLongBits9 = Double.doubleToLongBits(this.zzm);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3))) * 31) + ((int) ((doubleToLongBits4 >>> 32) ^ doubleToLongBits4))) * 31) + ((int) ((doubleToLongBits5 >>> 32) ^ doubleToLongBits5))) * 31) + ((int) ((doubleToLongBits6 >>> 32) ^ doubleToLongBits6))) * 31) + ((int) ((doubleToLongBits7 >>> 32) ^ doubleToLongBits7))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(zza)) {
            return "Rotate 0°";
        }
        if (equals(zzb)) {
            return "Rotate 90°";
        }
        if (equals(zzc)) {
            return "Rotate 180°";
        }
        if (equals(zzd)) {
            return "Rotate 270°";
        }
        double d2 = this.zze;
        double d3 = this.zzf;
        double d4 = this.zzg;
        double d5 = this.zzh;
        double d6 = this.zzi;
        double d7 = this.zzj;
        double d8 = this.zzk;
        double d9 = this.zzl;
        double d10 = this.zzm;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d2);
        sb.append(", v=");
        sb.append(d3);
        sb.append(", w=");
        sb.append(d4);
        sb.append(", a=");
        sb.append(d5);
        sb.append(", b=");
        sb.append(d6);
        sb.append(", c=");
        sb.append(d7);
        sb.append(", d=");
        sb.append(d8);
        sb.append(", tx=");
        sb.append(d9);
        sb.append(", ty=");
        sb.append(d10);
        sb.append("}");
        return sb.toString();
    }
}
