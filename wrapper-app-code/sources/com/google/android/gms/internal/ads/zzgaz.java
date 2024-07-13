package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzgaz extends zzgap implements Set {
    private transient zzgau zza;

    zzgaz() {
    }

    static int zzh(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (((double) highestOneBit) * 0.7d < ((double) max));
            return highestOneBit;
        }
        zzfye.zzf(max < 1073741824, "collection too large");
        return 1073741824;
    }

    public static zzgay zzj(int i) {
        return new zzgay(i);
    }

    public static zzgaz zzl(Collection collection) {
        Object[] array = collection.toArray();
        return zzr(array.length, array);
    }

    public static zzgaz zzm() {
        return zzgcj.zza;
    }

    public static zzgaz zzn(Object obj) {
        return new zzgcq(obj);
    }

    @SafeVarargs
    public static zzgaz zzo(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, 6);
        return zzr(12, objArr2);
    }

    /* access modifiers changed from: private */
    public static boolean zzs(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgaz) || !zzq() || !((zzgaz) obj).zzq() || hashCode() == obj.hashCode()) {
            return zzgcp.zzc(this, obj);
        }
        return false;
    }

    public int hashCode() {
        return zzgcp.zza(this);
    }

    public zzgau zzd() {
        zzgau zzgau = this.zza;
        if (zzgau != null) {
            return zzgau;
        }
        zzgau zzi = zzi();
        this.zza = zzi;
        return zzi;
    }

    /* renamed from: zze */
    public abstract zzgct iterator();

    /* access modifiers changed from: package-private */
    public zzgau zzi() {
        return zzgau.zzj(toArray());
    }

    /* access modifiers changed from: package-private */
    public boolean zzq() {
        return false;
    }

    /* access modifiers changed from: private */
    public static zzgaz zzr(int i, Object... objArr) {
        if (i == 0) {
            return zzgcj.zza;
        }
        if (i != 1) {
            int zzh = zzh(i);
            Object[] objArr2 = new Object[zzh];
            int i2 = zzh - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj = objArr[i5];
                zzgcb.zza(obj, i5);
                int hashCode = obj.hashCode();
                int zza2 = zzgam.zza(hashCode);
                while (true) {
                    int i6 = zza2 & i2;
                    Object obj2 = objArr2[i6];
                    if (obj2 == null) {
                        objArr[i4] = obj;
                        objArr2[i6] = obj;
                        i3 += hashCode;
                        i4++;
                        break;
                    } else if (obj2.equals(obj)) {
                        break;
                    } else {
                        zza2++;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                return new zzgcq(obj3);
            } else if (zzh(i4) < zzh / 2) {
                return zzr(i4, objArr);
            } else {
                if (zzs(i4, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new zzgcj(objArr, i3, objArr2, i2, i4);
            }
        } else {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new zzgcq(obj4);
        }
    }
}
