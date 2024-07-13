package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.zzgxz;
import com.google.android.gms.internal.ads.zzgyd;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzgyd<MessageType extends zzgyd<MessageType, BuilderType>, BuilderType extends zzgxz<MessageType, BuilderType>> extends zzgwe<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    protected zzhay zzc = zzhay.zzc();
    private int zzd = -1;

    private final int zza(zzhag zzhag) {
        if (zzhag == null) {
            return zzgzv.zza().zzb(getClass()).zza(this);
        }
        return zzhag.zza(this);
    }

    static zzgyd zzaB(Class cls) {
        zzgyd zzgyd = (zzgyd) zzb.get(cls);
        if (zzgyd == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgyd = (zzgyd) zzb.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (zzgyd == null) {
            zzgyd = (zzgyd) ((zzgyd) zzhbh.zzg(cls)).zzb(6, (Object) null, (Object) null);
            if (zzgyd != null) {
                zzb.put(cls, zzgyd);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzgyd;
    }

    protected static zzgyd zzaD(zzgyd zzgyd, zzgwv zzgwv) throws zzgyp {
        zzgxp zzgxp = zzgxp.zza;
        zzgxd zzl = zzgwv.zzl();
        zzgyd zzaC = zzgyd.zzaC();
        try {
            zzhag zzb2 = zzgzv.zza().zzb(zzaC.getClass());
            zzb2.zzh(zzaC, zzgxe.zzq(zzl), zzgxp);
            zzb2.zzf(zzaC);
            try {
                zzl.zzz(0);
                zzc(zzaC);
                zzc(zzaC);
                return zzaC;
            } catch (zzgyp e2) {
                e2.zzh(zzaC);
                throw e2;
            }
        } catch (zzgyp e3) {
            e = e3;
            if (e.zzl()) {
                e = new zzgyp((IOException) e);
            }
            e.zzh(zzaC);
            throw e;
        } catch (zzhaw e4) {
            zzgyp zza = e4.zza();
            zza.zzh(zzaC);
            throw zza;
        } catch (IOException e5) {
            if (e5.getCause() instanceof zzgyp) {
                throw ((zzgyp) e5.getCause());
            }
            zzgyp zzgyp = new zzgyp(e5);
            zzgyp.zzh(zzaC);
            throw zzgyp;
        } catch (RuntimeException e6) {
            if (e6.getCause() instanceof zzgyp) {
                throw ((zzgyp) e6.getCause());
            }
            throw e6;
        }
    }

    protected static zzgyd zzaE(zzgyd zzgyd, byte[] bArr) throws zzgyp {
        zzgyd zzd2 = zzd(zzgyd, bArr, 0, bArr.length, zzgxp.zza);
        zzc(zzd2);
        return zzd2;
    }

    protected static zzgyd zzaF(zzgyd zzgyd, zzgwv zzgwv, zzgxp zzgxp) throws zzgyp {
        zzgxd zzl = zzgwv.zzl();
        zzgyd zzaC = zzgyd.zzaC();
        try {
            zzhag zzb2 = zzgzv.zza().zzb(zzaC.getClass());
            zzb2.zzh(zzaC, zzgxe.zzq(zzl), zzgxp);
            zzb2.zzf(zzaC);
            try {
                zzl.zzz(0);
                zzc(zzaC);
                return zzaC;
            } catch (zzgyp e2) {
                e2.zzh(zzaC);
                throw e2;
            }
        } catch (zzgyp e3) {
            e = e3;
            if (e.zzl()) {
                e = new zzgyp((IOException) e);
            }
            e.zzh(zzaC);
            throw e;
        } catch (zzhaw e4) {
            zzgyp zza = e4.zza();
            zza.zzh(zzaC);
            throw zza;
        } catch (IOException e5) {
            if (e5.getCause() instanceof zzgyp) {
                throw ((zzgyp) e5.getCause());
            }
            zzgyp zzgyp = new zzgyp(e5);
            zzgyp.zzh(zzaC);
            throw zzgyp;
        } catch (RuntimeException e6) {
            if (e6.getCause() instanceof zzgyp) {
                throw ((zzgyp) e6.getCause());
            }
            throw e6;
        }
    }

    protected static zzgyd zzaG(zzgyd zzgyd, InputStream inputStream, zzgxp zzgxp) throws zzgyp {
        zzgxd zzH = zzgxd.zzH(inputStream, 4096);
        zzgyd zzaC = zzgyd.zzaC();
        try {
            zzhag zzb2 = zzgzv.zza().zzb(zzaC.getClass());
            zzb2.zzh(zzaC, zzgxe.zzq(zzH), zzgxp);
            zzb2.zzf(zzaC);
            zzc(zzaC);
            return zzaC;
        } catch (zzgyp e2) {
            e = e2;
            if (e.zzl()) {
                e = new zzgyp((IOException) e);
            }
            e.zzh(zzaC);
            throw e;
        } catch (zzhaw e3) {
            zzgyp zza = e3.zza();
            zza.zzh(zzaC);
            throw zza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzgyp) {
                throw ((zzgyp) e4.getCause());
            }
            zzgyp zzgyp = new zzgyp(e4);
            zzgyp.zzh(zzaC);
            throw zzgyp;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzgyp) {
                throw ((zzgyp) e5.getCause());
            }
            throw e5;
        }
    }

    protected static zzgyd zzaH(zzgyd zzgyd, byte[] bArr, zzgxp zzgxp) throws zzgyp {
        zzgyd zzd2 = zzd(zzgyd, bArr, 0, bArr.length, zzgxp);
        zzc(zzd2);
        return zzd2;
    }

    protected static zzgyi zzaI() {
        return zzgye.zzf();
    }

    protected static zzgyi zzaJ(zzgyi zzgyi) {
        int size = zzgyi.size();
        return zzgyi.zzg(size == 0 ? 10 : size + size);
    }

    protected static zzgyl zzaK() {
        return zzgzc.zzf();
    }

    protected static zzgym zzaL() {
        return zzgzw.zze();
    }

    protected static zzgym zzaM(zzgym zzgym) {
        int size = zzgym.size();
        return zzgym.zzd(size == 0 ? 10 : size + size);
    }

    static Object zzaO(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static Object zzaP(zzgzn zzgzn, String str, Object[] objArr) {
        return new zzgzx(zzgzn, str, objArr);
    }

    protected static void zzaS(Class cls, zzgyd zzgyd) {
        zzgyd.zzaR();
        zzb.put(cls, zzgyd);
    }

    private static zzgyd zzc(zzgyd zzgyd) throws zzgyp {
        if (zzgyd == null || zzgyd.zzaV()) {
            return zzgyd;
        }
        zzgyp zza = new zzhaw(zzgyd).zza();
        zza.zzh(zzgyd);
        throw zza;
    }

    private static zzgyd zzd(zzgyd zzgyd, byte[] bArr, int i, int i2, zzgxp zzgxp) throws zzgyp {
        zzgyd zzaC = zzgyd.zzaC();
        try {
            zzhag zzb2 = zzgzv.zza().zzb(zzaC.getClass());
            zzb2.zzi(zzaC, bArr, 0, i2, new zzgwh(zzgxp));
            zzb2.zzf(zzaC);
            return zzaC;
        } catch (zzgyp e2) {
            e = e2;
            if (e.zzl()) {
                e = new zzgyp((IOException) e);
            }
            e.zzh(zzaC);
            throw e;
        } catch (zzhaw e3) {
            zzgyp zza = e3.zza();
            zza.zzh(zzaC);
            throw zza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzgyp) {
                throw ((zzgyp) e4.getCause());
            }
            zzgyp zzgyp = new zzgyp(e4);
            zzgyp.zzh(zzaC);
            throw zzgyp;
        } catch (IndexOutOfBoundsException unused) {
            zzgyp zzj = zzgyp.zzj();
            zzj.zzh(zzaC);
            throw zzj;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzgzv.zza().zzb(getClass()).zzj(this, (zzgyd) obj);
        }
        return false;
    }

    public final int hashCode() {
        if (zzaW()) {
            return zzax();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzax = zzax();
        this.zza = zzax;
        return zzax;
    }

    public final String toString() {
        return zzgzp.zza(this, super.toString());
    }

    public final zzgxz zzaA() {
        zzgxz zzgxz = (zzgxz) zzb(5, (Object) null, (Object) null);
        zzgxz.zzai(this);
        return zzgxz;
    }

    /* access modifiers changed from: package-private */
    public final zzgyd zzaC() {
        return (zzgyd) zzb(4, (Object) null, (Object) null);
    }

    public final /* synthetic */ zzgzm zzaN() {
        return (zzgxz) zzb(5, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    public final void zzaQ() {
        zzgzv.zza().zzb(getClass()).zzf(this);
        zzaR();
    }

    /* access modifiers changed from: package-private */
    public final void zzaR() {
        this.zzd &= Integer.MAX_VALUE;
    }

    /* access modifiers changed from: package-private */
    public final void zzaT(int i) {
        this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | Integer.MAX_VALUE;
    }

    public final void zzaU(zzgxk zzgxk) throws IOException {
        zzgzv.zza().zzb(getClass()).zzn(this, zzgxl.zza(zzgxk));
    }

    public final boolean zzaV() {
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) zzb(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzgzv.zza().zzb(getClass()).zzk(this);
        if (!booleanValue) {
            return zzk;
        }
        zzb(2, true != zzk ? null : this, (Object) null);
        return zzk;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzaW() {
        return (this.zzd & RecyclerView.UNDEFINED_DURATION) != 0;
    }

    /* access modifiers changed from: package-private */
    public final int zzax() {
        return zzgzv.zza().zzb(getClass()).zzb(this);
    }

    /* access modifiers changed from: protected */
    public final zzgxz zzaz() {
        return (zzgxz) zzb(5, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    public abstract Object zzb(int i, Object obj, Object obj2);

    public final /* synthetic */ zzgzn zzbh() {
        return (zzgyd) zzb(6, (Object) null, (Object) null);
    }

    /* access modifiers changed from: package-private */
    public final int zzas(zzhag zzhag) {
        if (zzaW()) {
            int zza = zza(zzhag);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zza);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int zza2 = zza(zzhag);
        if (zza2 >= 0) {
            this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | zza2;
            return zza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + zza2);
    }

    public final int zzay() {
        int i;
        if (zzaW()) {
            i = zza((zzhag) null);
            if (i < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i);
            }
        } else {
            i = this.zzd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                i = zza((zzhag) null);
                if (i >= 0) {
                    this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | i;
                } else {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i);
                }
            }
        }
        return i;
    }
}
