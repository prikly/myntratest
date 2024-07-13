package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgae extends AbstractMap implements Serializable {
    /* access modifiers changed from: private */
    public static final Object zzd = new Object();
    transient int[] zza;
    transient Object[] zzb;
    transient Object[] zzc;
    private transient Object zze;
    /* access modifiers changed from: private */
    public transient int zzf;
    private transient int zzg;
    private transient Set zzh;
    private transient Set zzi;
    private transient Collection zzj;

    zzgae() {
        zzo(3);
    }

    /* access modifiers changed from: private */
    public final Object[] zzA() {
        Object[] objArr = this.zzb;
        objArr.getClass();
        return objArr;
    }

    /* access modifiers changed from: private */
    public final Object[] zzB() {
        Object[] objArr = this.zzc;
        objArr.getClass();
        return objArr;
    }

    static /* synthetic */ int zzb(zzgae zzgae) {
        int i = zzgae.zzg;
        zzgae.zzg = i - 1;
        return i;
    }

    static /* synthetic */ Object zzg(zzgae zzgae, int i) {
        return zzgae.zzA()[i];
    }

    static /* synthetic */ Object zzj(zzgae zzgae, int i) {
        return zzgae.zzB()[i];
    }

    static /* synthetic */ Object zzk(zzgae zzgae) {
        Object obj = zzgae.zze;
        obj.getClass();
        return obj;
    }

    static /* synthetic */ void zzm(zzgae zzgae, int i, Object obj) {
        zzgae.zzB()[i] = obj;
    }

    /* access modifiers changed from: private */
    public final int zzu() {
        return (1 << (this.zzf & 31)) - 1;
    }

    /* access modifiers changed from: private */
    public final int zzv(Object obj) {
        if (zzq()) {
            return -1;
        }
        int zzb2 = zzgam.zzb(obj);
        int zzu = zzu();
        Object obj2 = this.zze;
        obj2.getClass();
        int zzc2 = zzgaf.zzc(obj2, zzb2 & zzu);
        if (zzc2 != 0) {
            int i = ~zzu;
            int i2 = zzb2 & i;
            do {
                int i3 = zzc2 - 1;
                int i4 = zzz()[i3];
                if ((i4 & i) == i2 && zzfxz.zza(obj, zzA()[i3])) {
                    return i3;
                }
                zzc2 = i4 & zzu;
            } while (zzc2 != 0);
        }
        return -1;
    }

    private final int zzw(int i, int i2, int i3, int i4) {
        Object zzd2 = zzgaf.zzd(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            zzgaf.zze(zzd2, i3 & i5, i4 + 1);
        }
        Object obj = this.zze;
        obj.getClass();
        int[] zzz = zzz();
        for (int i6 = 0; i6 <= i; i6++) {
            int zzc2 = zzgaf.zzc(obj, i6);
            while (zzc2 != 0) {
                int i7 = zzc2 - 1;
                int i8 = zzz[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int zzc3 = zzgaf.zzc(zzd2, i10);
                zzgaf.zze(zzd2, i10, zzc2);
                zzz[i7] = ((~i5) & i9) | (zzc3 & i5);
                zzc2 = i8 & i;
            }
        }
        this.zze = zzd2;
        zzy(i5);
        return i5;
    }

    /* access modifiers changed from: private */
    public final Object zzx(Object obj) {
        if (zzq()) {
            return zzd;
        }
        int zzu = zzu();
        Object obj2 = this.zze;
        obj2.getClass();
        int zzb2 = zzgaf.zzb(obj, (Object) null, zzu, obj2, zzz(), zzA(), (Object[]) null);
        if (zzb2 == -1) {
            return zzd;
        }
        Object obj3 = zzB()[zzb2];
        zzp(zzb2, zzu);
        this.zzg--;
        zzn();
        return obj3;
    }

    private final void zzy(int i) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.zzf & -32);
    }

    /* access modifiers changed from: private */
    public final int[] zzz() {
        int[] iArr = this.zza;
        iArr.getClass();
        return iArr;
    }

    public final void clear() {
        if (!zzq()) {
            zzn();
            Map zzl = zzl();
            if (zzl != null) {
                this.zzf = zzgcz.zzb(size(), 3, 1073741823);
                zzl.clear();
                this.zze = null;
                this.zzg = 0;
                return;
            }
            Arrays.fill(zzA(), 0, this.zzg, (Object) null);
            Arrays.fill(zzB(), 0, this.zzg, (Object) null);
            Object obj = this.zze;
            obj.getClass();
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            Arrays.fill(zzz(), 0, this.zzg, 0);
            this.zzg = 0;
        }
    }

    public final boolean containsKey(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.containsKey(obj);
        }
        return zzv(obj) != -1;
    }

    public final boolean containsValue(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.containsValue(obj);
        }
        for (int i = 0; i < this.zzg; i++) {
            if (zzfxz.zza(obj, zzB()[i])) {
                return true;
            }
        }
        return false;
    }

    public final Set entrySet() {
        Set set = this.zzi;
        if (set != null) {
            return set;
        }
        zzfzz zzfzz = new zzfzz(this);
        this.zzi = zzfzz;
        return zzfzz;
    }

    public final Object get(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.get(obj);
        }
        int zzv = zzv(obj);
        if (zzv == -1) {
            return null;
        }
        return zzB()[zzv];
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Set keySet() {
        Set set = this.zzh;
        if (set != null) {
            return set;
        }
        zzgab zzgab = new zzgab(this);
        this.zzh = zzgab;
        return zzgab;
    }

    public final Object put(Object obj, Object obj2) {
        int min;
        Object obj3 = obj;
        Object obj4 = obj2;
        if (zzq()) {
            zzfye.zzi(zzq(), "Arrays already allocated");
            int i = this.zzf;
            int max = Math.max(i + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) ((double) highestOneBit)) && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.zze = zzgaf.zzd(max2);
            zzy(max2 - 1);
            this.zza = new int[i];
            this.zzb = new Object[i];
            this.zzc = new Object[i];
        }
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.put(obj3, obj4);
        }
        int[] zzz = zzz();
        Object[] zzA = zzA();
        Object[] zzB = zzB();
        int i2 = this.zzg;
        int i3 = i2 + 1;
        int zzb2 = zzgam.zzb(obj);
        int zzu = zzu();
        int i4 = zzb2 & zzu;
        Object obj5 = this.zze;
        obj5.getClass();
        int zzc2 = zzgaf.zzc(obj5, i4);
        if (zzc2 != 0) {
            int i5 = ~zzu;
            int i6 = zzb2 & i5;
            int i7 = 0;
            while (true) {
                int i8 = zzc2 - 1;
                int i9 = zzz[i8];
                int i10 = i9 & i5;
                if (i10 != i6 || !zzfxz.zza(obj3, zzA[i8])) {
                    int i11 = i9 & zzu;
                    i7++;
                    if (i11 != 0) {
                        zzc2 = i11;
                    } else if (i7 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(zzu() + 1, 1.0f);
                        for (int zze2 = zze(); zze2 >= 0; zze2 = zzf(zze2)) {
                            linkedHashMap.put(zzA()[zze2], zzB()[zze2]);
                        }
                        this.zze = linkedHashMap;
                        this.zza = null;
                        this.zzb = null;
                        this.zzc = null;
                        zzn();
                        return linkedHashMap.put(obj3, obj4);
                    } else if (i3 > zzu) {
                        zzu = zzw(zzu, zzgaf.zza(zzu), zzb2, i2);
                    } else {
                        zzz[i8] = (i3 & zzu) | i10;
                    }
                } else {
                    Object obj6 = zzB[i8];
                    zzB[i8] = obj4;
                    return obj6;
                }
            }
        } else if (i3 > zzu) {
            zzu = zzw(zzu, zzgaf.zza(zzu), zzb2, i2);
        } else {
            Object obj7 = this.zze;
            obj7.getClass();
            zzgaf.zze(obj7, i4, i3);
        }
        int length = zzz().length;
        if (i3 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.zza = Arrays.copyOf(zzz(), min);
            this.zzb = Arrays.copyOf(zzA(), min);
            this.zzc = Arrays.copyOf(zzB(), min);
        }
        zzz()[i2] = (~zzu) & zzb2;
        zzA()[i2] = obj3;
        zzB()[i2] = obj4;
        this.zzg = i3;
        zzn();
        return null;
    }

    public final Object remove(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.remove(obj);
        }
        Object zzx = zzx(obj);
        if (zzx == zzd) {
            return null;
        }
        return zzx;
    }

    public final int size() {
        Map zzl = zzl();
        return zzl != null ? zzl.size() : this.zzg;
    }

    public final Collection values() {
        Collection collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        zzgad zzgad = new zzgad(this);
        this.zzj = zzgad;
        return zzgad;
    }

    /* access modifiers changed from: package-private */
    public final int zze() {
        return isEmpty() ? -1 : 0;
    }

    /* access modifiers changed from: package-private */
    public final int zzf(int i) {
        int i2 = i + 1;
        if (i2 < this.zzg) {
            return i2;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public final Map zzl() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void zzn() {
        this.zzf += 32;
    }

    /* access modifiers changed from: package-private */
    public final void zzo(int i) {
        this.zzf = zzgcz.zzb(8, 1, 1073741823);
    }

    /* access modifiers changed from: package-private */
    public final void zzp(int i, int i2) {
        Object obj = this.zze;
        obj.getClass();
        int[] zzz = zzz();
        Object[] zzA = zzA();
        Object[] zzB = zzB();
        int size = size() - 1;
        if (i < size) {
            Object obj2 = zzA[size];
            zzA[i] = obj2;
            zzB[i] = zzB[size];
            zzA[size] = null;
            zzB[size] = null;
            zzz[i] = zzz[size];
            zzz[size] = 0;
            int zzb2 = zzgam.zzb(obj2) & i2;
            int zzc2 = zzgaf.zzc(obj, zzb2);
            int i3 = size + 1;
            if (zzc2 != i3) {
                while (true) {
                    int i4 = zzc2 - 1;
                    int i5 = zzz[i4];
                    int i6 = i5 & i2;
                    if (i6 != i3) {
                        zzc2 = i6;
                    } else {
                        zzz[i4] = ((i + 1) & i2) | (i5 & (~i2));
                        return;
                    }
                }
            } else {
                zzgaf.zze(obj, zzb2, i + 1);
            }
        } else {
            zzA[i] = null;
            zzB[i] = null;
            zzz[i] = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zzq() {
        return this.zze == null;
    }

    zzgae(int i) {
        zzo(8);
    }
}
