package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zzmy {
    static final long zza = ((long) zzz(byte[].class));
    static final boolean zzb;
    private static final Unsafe zzc = zzg();
    private static final Class zzd = zziq.zza();
    private static final boolean zze = zzv(Long.TYPE);
    private static final zzmx zzf;
    private static final boolean zzg;
    private static final boolean zzh;

    /* JADX WARNING: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0156  */
    static {
        /*
            java.lang.Class<double[]> r0 = double[].class
            java.lang.Class<float[]> r1 = float[].class
            java.lang.Class<long[]> r2 = long[].class
            java.lang.Class<int[]> r3 = int[].class
            java.lang.Class<boolean[]> r4 = boolean[].class
            sun.misc.Unsafe r5 = zzg()
            zzc = r5
            java.lang.Class r5 = com.google.android.gms.internal.measurement.zziq.zza()
            zzd = r5
            java.lang.Class r5 = java.lang.Long.TYPE
            boolean r5 = zzv(r5)
            zze = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            boolean r5 = zzv(r5)
            sun.misc.Unsafe r6 = zzc
            r7 = 0
            if (r6 != 0) goto L_0x002a
            goto L_0x003b
        L_0x002a:
            boolean r8 = zze
            if (r8 == 0) goto L_0x0034
            com.google.android.gms.internal.measurement.zzmw r7 = new com.google.android.gms.internal.measurement.zzmw
            r7.<init>(r6)
            goto L_0x003b
        L_0x0034:
            if (r5 == 0) goto L_0x003b
            com.google.android.gms.internal.measurement.zzmv r7 = new com.google.android.gms.internal.measurement.zzmv
            r7.<init>(r6)
        L_0x003b:
            zzf = r7
            java.lang.String r5 = "getLong"
            java.lang.String r6 = "objectFieldOffset"
            r8 = 2
            r9 = 1
            r10 = 0
            if (r7 != 0) goto L_0x0048
        L_0x0046:
            r7 = 0
            goto L_0x0072
        L_0x0048:
            sun.misc.Unsafe r7 = r7.zza
            java.lang.Class r7 = r7.getClass()     // Catch:{ all -> 0x006d }
            java.lang.Class[] r11 = new java.lang.Class[r9]     // Catch:{ all -> 0x006d }
            java.lang.Class<java.lang.reflect.Field> r12 = java.lang.reflect.Field.class
            r11[r10] = r12     // Catch:{ all -> 0x006d }
            r7.getMethod(r6, r11)     // Catch:{ all -> 0x006d }
            java.lang.Class[] r11 = new java.lang.Class[r8]     // Catch:{ all -> 0x006d }
            java.lang.Class<java.lang.Object> r12 = java.lang.Object.class
            r11[r10] = r12     // Catch:{ all -> 0x006d }
            java.lang.Class r12 = java.lang.Long.TYPE     // Catch:{ all -> 0x006d }
            r11[r9] = r12     // Catch:{ all -> 0x006d }
            r7.getMethod(r5, r11)     // Catch:{ all -> 0x006d }
            java.lang.reflect.Field r7 = zzB()     // Catch:{ all -> 0x006d }
            if (r7 != 0) goto L_0x006b
            goto L_0x0046
        L_0x006b:
            r7 = 1
            goto L_0x0072
        L_0x006d:
            r7 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.measurement.zzmy.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r7.toString()))
            goto L_0x0046
        L_0x0072:
            zzg = r7
            com.google.android.gms.internal.measurement.zzmx r7 = zzf
            if (r7 != 0) goto L_0x007b
        L_0x0078:
            r5 = 0
            goto L_0x010d
        L_0x007b:
            sun.misc.Unsafe r7 = r7.zza
            java.lang.Class r7 = r7.getClass()     // Catch:{ all -> 0x0107 }
            java.lang.Class[] r11 = new java.lang.Class[r9]     // Catch:{ all -> 0x0107 }
            java.lang.Class<java.lang.reflect.Field> r12 = java.lang.reflect.Field.class
            r11[r10] = r12     // Catch:{ all -> 0x0107 }
            r7.getMethod(r6, r11)     // Catch:{ all -> 0x0107 }
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ all -> 0x0107 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r6[r10] = r11     // Catch:{ all -> 0x0107 }
            java.lang.String r11 = "arrayBaseOffset"
            r7.getMethod(r11, r6)     // Catch:{ all -> 0x0107 }
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ all -> 0x0107 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r6[r10] = r11     // Catch:{ all -> 0x0107 }
            java.lang.String r11 = "arrayIndexScale"
            r7.getMethod(r11, r6)     // Catch:{ all -> 0x0107 }
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x0107 }
            java.lang.Class<java.lang.Object> r11 = java.lang.Object.class
            r6[r10] = r11     // Catch:{ all -> 0x0107 }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x0107 }
            r6[r9] = r11     // Catch:{ all -> 0x0107 }
            java.lang.String r11 = "getInt"
            r7.getMethod(r11, r6)     // Catch:{ all -> 0x0107 }
            r6 = 3
            java.lang.Class[] r11 = new java.lang.Class[r6]     // Catch:{ all -> 0x0107 }
            java.lang.Class<java.lang.Object> r12 = java.lang.Object.class
            r11[r10] = r12     // Catch:{ all -> 0x0107 }
            java.lang.Class r12 = java.lang.Long.TYPE     // Catch:{ all -> 0x0107 }
            r11[r9] = r12     // Catch:{ all -> 0x0107 }
            java.lang.Class r12 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0107 }
            r11[r8] = r12     // Catch:{ all -> 0x0107 }
            java.lang.String r12 = "putInt"
            r7.getMethod(r12, r11)     // Catch:{ all -> 0x0107 }
            java.lang.Class[] r11 = new java.lang.Class[r8]     // Catch:{ all -> 0x0107 }
            java.lang.Class<java.lang.Object> r12 = java.lang.Object.class
            r11[r10] = r12     // Catch:{ all -> 0x0107 }
            java.lang.Class r12 = java.lang.Long.TYPE     // Catch:{ all -> 0x0107 }
            r11[r9] = r12     // Catch:{ all -> 0x0107 }
            r7.getMethod(r5, r11)     // Catch:{ all -> 0x0107 }
            java.lang.Class[] r5 = new java.lang.Class[r6]     // Catch:{ all -> 0x0107 }
            java.lang.Class<java.lang.Object> r11 = java.lang.Object.class
            r5[r10] = r11     // Catch:{ all -> 0x0107 }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x0107 }
            r5[r9] = r11     // Catch:{ all -> 0x0107 }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x0107 }
            r5[r8] = r11     // Catch:{ all -> 0x0107 }
            java.lang.String r11 = "putLong"
            r7.getMethod(r11, r5)     // Catch:{ all -> 0x0107 }
            java.lang.Class[] r5 = new java.lang.Class[r8]     // Catch:{ all -> 0x0107 }
            java.lang.Class<java.lang.Object> r11 = java.lang.Object.class
            r5[r10] = r11     // Catch:{ all -> 0x0107 }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x0107 }
            r5[r9] = r11     // Catch:{ all -> 0x0107 }
            java.lang.String r11 = "getObject"
            r7.getMethod(r11, r5)     // Catch:{ all -> 0x0107 }
            java.lang.Class[] r5 = new java.lang.Class[r6]     // Catch:{ all -> 0x0107 }
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            r5[r10] = r6     // Catch:{ all -> 0x0107 }
            java.lang.Class r6 = java.lang.Long.TYPE     // Catch:{ all -> 0x0107 }
            r5[r9] = r6     // Catch:{ all -> 0x0107 }
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            r5[r8] = r6     // Catch:{ all -> 0x0107 }
            java.lang.String r6 = "putObject"
            r7.getMethod(r6, r5)     // Catch:{ all -> 0x0107 }
            r5 = 1
            goto L_0x010d
        L_0x0107:
            r5 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.measurement.zzmy.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r5.toString()))
            goto L_0x0078
        L_0x010d:
            zzh = r5
            java.lang.Class<byte[]> r5 = byte[].class
            int r5 = zzz(r5)
            long r5 = (long) r5
            zza = r5
            zzz(r4)
            zzA(r4)
            zzz(r3)
            zzA(r3)
            zzz(r2)
            zzA(r2)
            zzz(r1)
            zzA(r1)
            zzz(r0)
            zzA(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            zzz(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            zzA(r0)
            java.lang.reflect.Field r0 = zzB()
            if (r0 == 0) goto L_0x014d
            com.google.android.gms.internal.measurement.zzmx r1 = zzf
            if (r1 == 0) goto L_0x014d
            r1.zzl(r0)
        L_0x014d:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0156
            goto L_0x0157
        L_0x0156:
            r9 = 0
        L_0x0157:
            zzb = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzmy.<clinit>():void");
    }

    private zzmy() {
    }

    private static int zzA(Class cls) {
        if (zzh) {
            return zzf.zzi(cls);
        }
        return -1;
    }

    private static Field zzB() {
        int i = zziq.zza;
        Field zzC = zzC(Buffer.class, "effectiveDirectAddress");
        if (zzC != null) {
            return zzC;
        }
        Field zzC2 = zzC(Buffer.class, "address");
        if (zzC2 == null || zzC2.getType() != Long.TYPE) {
            return null;
        }
        return zzC2;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static void zzD(Object obj, long j, byte b2) {
        long j2 = -4 & j;
        int zzj = zzf.zzj(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        zzf.zzn(obj, j2, ((b2 & 255) << i) | (zzj & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    /* access modifiers changed from: private */
    public static void zzE(Object obj, long j, byte b2) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        int i2 = (b2 & 255) << i;
        zzf.zzn(obj, j2, i2 | (zzf.zzj(obj, j2) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    static double zza(Object obj, long j) {
        return zzf.zza(obj, j);
    }

    static float zzb(Object obj, long j) {
        return zzf.zzb(obj, j);
    }

    static int zzc(Object obj, long j) {
        return zzf.zzj(obj, j);
    }

    static long zzd(Object obj, long j) {
        return zzf.zzk(obj, j);
    }

    static Object zze(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    static Object zzf(Object obj, long j) {
        return zzf.zzm(obj, j);
    }

    static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzmu());
        } catch (Throwable unused) {
            return null;
        }
    }

    static void zzm(Object obj, long j, boolean z) {
        zzf.zzc(obj, j, z);
    }

    static void zzn(byte[] bArr, long j, byte b2) {
        zzf.zzd(bArr, zza + j, b2);
    }

    static void zzo(Object obj, long j, double d2) {
        zzf.zze(obj, j, d2);
    }

    static void zzp(Object obj, long j, float f2) {
        zzf.zzf(obj, j, f2);
    }

    static void zzq(Object obj, long j, int i) {
        zzf.zzn(obj, j, i);
    }

    static void zzr(Object obj, long j, long j2) {
        zzf.zzo(obj, j, j2);
    }

    static void zzs(Object obj, long j, Object obj2) {
        zzf.zzp(obj, j, obj2);
    }

    static /* bridge */ /* synthetic */ boolean zzt(Object obj, long j) {
        return ((byte) ((zzf.zzj(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean zzu(Object obj, long j) {
        return ((byte) ((zzf.zzj(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    static boolean zzv(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        int i = zziq.zza;
        try {
            Class cls3 = zzd;
            cls3.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls3.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls3.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean zzw(Object obj, long j) {
        return zzf.zzg(obj, j);
    }

    static boolean zzx() {
        return zzh;
    }

    static boolean zzy() {
        return zzg;
    }

    private static int zzz(Class cls) {
        if (zzh) {
            return zzf.zzh(cls);
        }
        return -1;
    }
}
