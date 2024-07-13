package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzgdf<V> extends zzgfu implements zzgfb<V> {
    private static final Logger zzaX;
    /* access modifiers changed from: private */
    public static final zza zzaY;
    private static final Object zzbb = new Object();
    static final boolean zzd;
    /* access modifiers changed from: private */
    public volatile zzd listeners;
    /* access modifiers changed from: private */
    public volatile Object value;
    /* access modifiers changed from: private */
    public volatile zzk waiters;

    /* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
    abstract class zza {
        /* synthetic */ zza(zzgde zzgde) {
        }

        /* access modifiers changed from: package-private */
        public abstract zzd zza(zzgdf zzgdf, zzd zzd);

        /* access modifiers changed from: package-private */
        public abstract zzk zzb(zzgdf zzgdf, zzk zzk);

        /* access modifiers changed from: package-private */
        public abstract void zzc(zzk zzk, zzk zzk2);

        /* access modifiers changed from: package-private */
        public abstract void zzd(zzk zzk, Thread thread);

        /* access modifiers changed from: package-private */
        public abstract boolean zze(zzgdf zzgdf, zzd zzd, zzd zzd2);

        /* access modifiers changed from: package-private */
        public abstract boolean zzf(zzgdf zzgdf, Object obj, Object obj2);

        /* access modifiers changed from: package-private */
        public abstract boolean zzg(zzgdf zzgdf, zzk zzk, zzk zzk2);
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
    final class zzb {
        static final zzb zza;
        static final zzb zzb;
        final boolean zzc;
        final Throwable zzd;

        static {
            if (zzgdf.zzd) {
                zzb = null;
                zza = null;
                return;
            }
            zzb = new zzb(false, (Throwable) null);
            zza = new zzb(true, (Throwable) null);
        }

        zzb(boolean z, Throwable th) {
            this.zzc = z;
            this.zzd = th;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
    final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") {
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable zzb;

        zzc(Throwable th) {
            if (th != null) {
                this.zzb = th;
                return;
            }
            throw null;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
    final class zzd {
        static final zzd zza = new zzd();
        zzd next;
        final Runnable zzb;
        final Executor zzc;

        zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
    final class zze extends zza {
        final AtomicReferenceFieldUpdater<zzk, Thread> zza;
        final AtomicReferenceFieldUpdater<zzk, zzk> zzb;
        final AtomicReferenceFieldUpdater<zzgdf, zzk> zzc;
        final AtomicReferenceFieldUpdater<zzgdf, zzd> zzd;
        final AtomicReferenceFieldUpdater<zzgdf, Object> zze;

        zze(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super((zzgde) null);
            this.zza = atomicReferenceFieldUpdater;
            this.zzb = atomicReferenceFieldUpdater2;
            this.zzc = atomicReferenceFieldUpdater3;
            this.zzd = atomicReferenceFieldUpdater4;
            this.zze = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        public final zzd zza(zzgdf zzgdf, zzd zzd2) {
            return this.zzd.getAndSet(zzgdf, zzd2);
        }

        /* access modifiers changed from: package-private */
        public final zzk zzb(zzgdf zzgdf, zzk zzk) {
            return this.zzc.getAndSet(zzgdf, zzk);
        }

        /* access modifiers changed from: package-private */
        public final void zzc(zzk zzk, zzk zzk2) {
            this.zzb.lazySet(zzk, zzk2);
        }

        /* access modifiers changed from: package-private */
        public final void zzd(zzk zzk, Thread thread) {
            this.zza.lazySet(zzk, thread);
        }

        /* access modifiers changed from: package-private */
        public final boolean zze(zzgdf zzgdf, zzd zzd2, zzd zzd3) {
            return zzgdg.zza(this.zzd, zzgdf, zzd2, zzd3);
        }

        /* access modifiers changed from: package-private */
        public final boolean zzf(zzgdf zzgdf, Object obj, Object obj2) {
            return zzgdg.zza(this.zze, zzgdf, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        public final boolean zzg(zzgdf zzgdf, zzk zzk, zzk zzk2) {
            return zzgdg.zza(this.zzc, zzgdf, zzk, zzk2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
    final class zzf<V> implements Runnable {
        final zzgdf<V> zza;
        final zzgfb<? extends V> zzb;

        zzf(zzgdf zzgdf, zzgfb zzgfb) {
            this.zza = zzgdf;
            this.zzb = zzgfb;
        }

        public final void run() {
            if (this.zza.value == this) {
                if (zzgdf.zzaY.zzf(this.zza, this, zzgdf.zzf(this.zzb))) {
                    zzgdf.zzy(this.zza, false);
                }
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
    final class zzg extends zza {
        private zzg() {
            super((zzgde) null);
        }

        /* synthetic */ zzg(zzgdh zzgdh) {
            super((zzgde) null);
        }

        /* access modifiers changed from: package-private */
        public final zzd zza(zzgdf zzgdf, zzd zzd) {
            zzd zzi;
            synchronized (zzgdf) {
                zzi = zzgdf.listeners;
                if (zzi != zzd) {
                    zzgdf.listeners = zzd;
                }
            }
            return zzi;
        }

        /* access modifiers changed from: package-private */
        public final zzk zzb(zzgdf zzgdf, zzk zzk) {
            zzk zzj;
            synchronized (zzgdf) {
                zzj = zzgdf.waiters;
                if (zzj != zzk) {
                    zzgdf.waiters = zzk;
                }
            }
            return zzj;
        }

        /* access modifiers changed from: package-private */
        public final void zzc(zzk zzk, zzk zzk2) {
            zzk.next = zzk2;
        }

        /* access modifiers changed from: package-private */
        public final void zzd(zzk zzk, Thread thread) {
            zzk.thread = thread;
        }

        /* access modifiers changed from: package-private */
        public final boolean zze(zzgdf zzgdf, zzd zzd, zzd zzd2) {
            synchronized (zzgdf) {
                if (zzgdf.listeners != zzd) {
                    return false;
                }
                zzgdf.listeners = zzd2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean zzf(zzgdf zzgdf, Object obj, Object obj2) {
            synchronized (zzgdf) {
                if (zzgdf.value != obj) {
                    return false;
                }
                zzgdf.value = obj2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean zzg(zzgdf zzgdf, zzk zzk, zzk zzk2) {
            synchronized (zzgdf) {
                if (zzgdf.waiters != zzk) {
                    return false;
                }
                zzgdf.waiters = zzk2;
                return true;
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
    interface zzh<V> extends zzgfb<V> {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
    abstract class zzi<V> extends zzgdf<V> implements zzh<V> {
        zzi() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
    final class zzj extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x005e, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x006a, code lost:
            throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:?, code lost:
            r0 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.ads.zzgdf.zzj.AnonymousClass1());
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0005 */
        static {
            /*
                sun.misc.Unsafe r0 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0005 }
                goto L_0x0010
            L_0x0005:
                com.google.android.gms.internal.ads.zzgdf$zzj$1 r0 = new com.google.android.gms.internal.ads.zzgdf$zzj$1     // Catch:{ PrivilegedActionException -> 0x005e }
                r0.<init>()     // Catch:{ PrivilegedActionException -> 0x005e }
                java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch:{ PrivilegedActionException -> 0x005e }
                sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch:{ PrivilegedActionException -> 0x005e }
            L_0x0010:
                java.lang.Class<com.google.android.gms.internal.ads.zzgdf> r1 = com.google.android.gms.internal.ads.zzgdf.class
                java.lang.String r2 = "waiters"
                java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                long r2 = r0.objectFieldOffset(r2)     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                zzc = r2     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                java.lang.String r2 = "listeners"
                java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                long r2 = r0.objectFieldOffset(r2)     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                zzb = r2     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                java.lang.String r2 = "value"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                long r1 = r0.objectFieldOffset(r1)     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                zzd = r1     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                java.lang.Class<com.google.android.gms.internal.ads.zzgdf$zzk> r1 = com.google.android.gms.internal.ads.zzgdf.zzk.class
                java.lang.String r2 = "thread"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                long r1 = r0.objectFieldOffset(r1)     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                zze = r1     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                java.lang.Class<com.google.android.gms.internal.ads.zzgdf$zzk> r1 = com.google.android.gms.internal.ads.zzgdf.zzk.class
                java.lang.String r2 = "next"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                long r1 = r0.objectFieldOffset(r1)     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                zzf = r1     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                zza = r0     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                return
            L_0x0055:
                r0 = move-exception
                throw r0
            L_0x0057:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            L_0x005e:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.Throwable r0 = r0.getCause()
                java.lang.String r2 = "Could not initialize intrinsics"
                r1.<init>(r2, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgdf.zzj.<clinit>():void");
        }

        private zzj() {
            super((zzgde) null);
        }

        /* synthetic */ zzj(zzgdj zzgdj) {
            super((zzgde) null);
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        final com.google.android.gms.internal.ads.zzgdf.zzd zza(com.google.android.gms.internal.ads.zzgdf r3, com.google.android.gms.internal.ads.zzgdf.zzd r4) {
            /*
                r2 = this;
            L_0x0000:
                com.google.android.gms.internal.ads.zzgdf$zzd r0 = r3.listeners
                if (r4 != r0) goto L_0x0007
                return r0
            L_0x0007:
                boolean r1 = r2.zze(r3, r0, r4)
                if (r1 == 0) goto L_0x0000
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgdf.zzj.zza(com.google.android.gms.internal.ads.zzgdf, com.google.android.gms.internal.ads.zzgdf$zzd):com.google.android.gms.internal.ads.zzgdf$zzd");
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        final com.google.android.gms.internal.ads.zzgdf.zzk zzb(com.google.android.gms.internal.ads.zzgdf r3, com.google.android.gms.internal.ads.zzgdf.zzk r4) {
            /*
                r2 = this;
            L_0x0000:
                com.google.android.gms.internal.ads.zzgdf$zzk r0 = r3.waiters
                if (r4 != r0) goto L_0x0007
                return r0
            L_0x0007:
                boolean r1 = r2.zzg(r3, r0, r4)
                if (r1 == 0) goto L_0x0000
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgdf.zzj.zzb(com.google.android.gms.internal.ads.zzgdf, com.google.android.gms.internal.ads.zzgdf$zzk):com.google.android.gms.internal.ads.zzgdf$zzk");
        }

        /* access modifiers changed from: package-private */
        public final void zzc(zzk zzk, zzk zzk2) {
            zza.putObject(zzk, zzf, zzk2);
        }

        /* access modifiers changed from: package-private */
        public final void zzd(zzk zzk, Thread thread) {
            zza.putObject(zzk, zze, thread);
        }

        /* access modifiers changed from: package-private */
        public final boolean zze(zzgdf zzgdf, zzd zzd2, zzd zzd3) {
            return zzgdi.zza(zza, zzgdf, zzb, zzd2, zzd3);
        }

        /* access modifiers changed from: package-private */
        public final boolean zzf(zzgdf zzgdf, Object obj, Object obj2) {
            return zzgdi.zza(zza, zzgdf, zzd, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        public final boolean zzg(zzgdf zzgdf, zzk zzk, zzk zzk2) {
            return zzgdi.zza(zza, zzgdf, zzc, zzk, zzk2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
    final class zzk {
        static final zzk zza = new zzk(false);
        volatile zzk next;
        volatile Thread thread;

        zzk() {
            zzgdf.zzaY.zzd(this, Thread.currentThread());
        }

        zzk(boolean z) {
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        zza zza2;
        Class<zzgdf> cls = zzgdf.class;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        zzd = z;
        zzaX = Logger.getLogger(cls.getName());
        try {
            zza2 = new zzj((zzgdj) null);
            th2 = null;
            th = null;
        } catch (Error | RuntimeException e2) {
            try {
                th2 = e2;
                zza2 = new zze(AtomicReferenceFieldUpdater.newUpdater(zzk.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(zzk.class, zzk.class, "next"), AtomicReferenceFieldUpdater.newUpdater(cls, zzk.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(cls, zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, AppMeasurementSdk.ConditionalUserProperty.VALUE));
                th = null;
            } catch (Error | RuntimeException e3) {
                th = e3;
                th2 = e2;
                zza2 = new zzg((zzgdh) null);
            }
        }
        zzaY = zza2;
        if (th != null) {
            zzaX.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            zzaX.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    protected zzgdf() {
    }

    private final void zzA(zzk zzk2) {
        zzk2.thread = null;
        while (true) {
            zzk zzk3 = this.waiters;
            if (zzk3 != zzk.zza) {
                zzk zzk4 = null;
                while (zzk3 != null) {
                    zzk zzk5 = zzk3.next;
                    if (zzk3.thread != null) {
                        zzk4 = zzk3;
                    } else if (zzk4 != null) {
                        zzk4.next = zzk5;
                        if (zzk4.thread == null) {
                        }
                    } else if (!zzaY.zzg(this, zzk3, zzk5)) {
                    }
                    zzk3 = zzk5;
                }
                return;
            }
            return;
        }
    }

    private static final Object zzB(Object obj) throws ExecutionException {
        if (obj instanceof zzb) {
            Throwable th = ((zzb) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        } else if (obj == zzbb) {
            return null;
        } else {
            return obj;
        }
    }

    /* access modifiers changed from: private */
    public static Object zzf(zzgfb zzgfb) {
        Throwable zzm;
        if (zzgfb instanceof zzh) {
            Object obj = ((zzgdf) zzgfb).value;
            if (obj instanceof zzb) {
                zzb zzb2 = (zzb) obj;
                if (zzb2.zzc) {
                    Throwable th = zzb2.zzd;
                    obj = th != null ? new zzb(false, th) : zzb.zzb;
                }
            }
            obj.getClass();
            return obj;
        } else if ((zzgfb instanceof zzgfu) && (zzm = ((zzgfu) zzgfb).zzm()) != null) {
            return new zzc(zzm);
        } else {
            boolean isCancelled = zzgfb.isCancelled();
            if ((!zzd) && isCancelled) {
                zzb zzb3 = zzb.zzb;
                zzb3.getClass();
                return zzb3;
            }
            try {
                Object zzg2 = zzg(zzgfb);
                if (!isCancelled) {
                    return zzg2 == null ? zzbb : zzg2;
                }
                String valueOf = String.valueOf(zzgfb);
                return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + valueOf));
            } catch (ExecutionException e2) {
                if (isCancelled) {
                    return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(String.valueOf(zzgfb))), e2));
                }
                return new zzc(e2.getCause());
            } catch (CancellationException e3) {
                if (!isCancelled) {
                    return new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(String.valueOf(zzgfb))), e3));
                }
                return new zzb(false, e3);
            } catch (Error | RuntimeException e4) {
                return new zzc(e4);
            }
        }
    }

    private static Object zzg(Future future) throws ExecutionException {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final void zzv(StringBuilder sb) {
        try {
            Object zzg2 = zzg(this);
            sb.append("SUCCESS, result=[");
            if (zzg2 == null) {
                sb.append("null");
            } else if (zzg2 == this) {
                sb.append("this future");
            } else {
                sb.append(zzg2.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(zzg2)));
            }
            sb.append("]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private final void zzw(StringBuilder sb) {
        String str;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof zzf) {
            sb.append(", setFuture=[");
            zzx(sb, ((zzf) obj).zzb);
            sb.append("]");
        } else {
            try {
                str = zzfyt.zza(zza());
            } catch (RuntimeException | StackOverflowError e2) {
                str = "Exception thrown from implementation: ".concat(String.valueOf(String.valueOf(e2.getClass())));
            }
            if (str != null) {
                sb.append(", info=[");
                sb.append(str);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            zzv(sb);
        }
    }

    private final void zzx(StringBuilder sb, Object obj) {
        if (obj == this) {
            try {
                sb.append("this future");
            } catch (RuntimeException | StackOverflowError e2) {
                sb.append("Exception thrown from implementation: ");
                sb.append(e2.getClass());
            }
        } else {
            sb.append(obj);
        }
    }

    /* access modifiers changed from: private */
    public static void zzy(zzgdf<V> zzgdf, boolean z) {
        zzd zzd2 = null;
        while (true) {
            for (zzk zzb2 = zzaY.zzb(zzgdf, zzk.zza); zzb2 != null; zzb2 = zzb2.next) {
                Thread thread = zzb2.thread;
                if (thread != null) {
                    zzb2.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                zzgdf.zzr();
            }
            zzgdf.zzb();
            zzd zzd3 = zzd2;
            zzd zza2 = zzaY.zza(zzgdf, zzd.zza);
            zzd zzd4 = zzd3;
            while (zza2 != null) {
                zzd zzd5 = zza2.next;
                zza2.next = zzd4;
                zzd4 = zza2;
                zza2 = zzd5;
            }
            while (zzd4 != null) {
                zzd2 = zzd4.next;
                Runnable runnable = zzd4.zzb;
                runnable.getClass();
                if (runnable instanceof zzf) {
                    zzf zzf2 = (zzf) runnable;
                    zzgdf = zzf2.zza;
                    if (zzgdf.value == zzf2) {
                        if (zzaY.zzf(zzgdf, zzf2, zzf(zzf2.zzb))) {
                            z = false;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = zzd4.zzc;
                    executor.getClass();
                    zzz(runnable, executor);
                }
                zzd4 = zzd2;
            }
            return;
        }
    }

    private static void zzz(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = zzaX;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + valueOf + " with executor " + valueOf2, e2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [com.google.android.gms.internal.ads.zzgfb, com.google.android.gms.internal.ads.zzgfb<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.value
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzgdf.zzf
            r3 = r3 | r4
            if (r3 == 0) goto L_0x005f
            boolean r3 = zzd
            if (r3 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.zzgdf$zzb r3 = new com.google.android.gms.internal.ads.zzgdf$zzb
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0029
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzgdf$zzb r3 = com.google.android.gms.internal.ads.zzgdf.zzb.zza
            goto L_0x0026
        L_0x0024:
            com.google.android.gms.internal.ads.zzgdf$zzb r3 = com.google.android.gms.internal.ads.zzgdf.zzb.zzb
        L_0x0026:
            r3.getClass()
        L_0x0029:
            r5 = 0
            r4 = r7
        L_0x002b:
            com.google.android.gms.internal.ads.zzgdf$zza r6 = zzaY
            boolean r6 = r6.zzf(r4, r0, r3)
            if (r6 == 0) goto L_0x0058
            zzy(r4, r8)
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzgdf.zzf
            if (r4 == 0) goto L_0x0056
            com.google.android.gms.internal.ads.zzgdf$zzf r0 = (com.google.android.gms.internal.ads.zzgdf.zzf) r0
            com.google.android.gms.internal.ads.zzgfb<? extends V> r0 = r0.zzb
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzgdf.zzh
            if (r4 == 0) goto L_0x0053
            r4 = r0
            com.google.android.gms.internal.ads.zzgdf r4 = (com.google.android.gms.internal.ads.zzgdf) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L_0x004b
            r5 = 1
            goto L_0x004c
        L_0x004b:
            r5 = 0
        L_0x004c:
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.zzgdf.zzf
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0056
            r5 = 1
            goto L_0x002b
        L_0x0053:
            r0.cancel(r8)
        L_0x0056:
            r1 = 1
            goto L_0x005f
        L_0x0058:
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.zzgdf.zzf
            if (r6 != 0) goto L_0x002b
            r1 = r5
        L_0x005f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgdf.cancel(boolean):boolean");
    }

    public Object get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) && (!(obj2 instanceof zzf))) {
                return zzB(obj2);
            }
            zzk zzk2 = this.waiters;
            if (zzk2 != zzk.zza) {
                zzk zzk3 = new zzk();
                do {
                    zzaY.zzc(zzk3, zzk2);
                    if (zzaY.zzg(this, zzk2, zzk3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                zzA(zzk3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof zzf))));
                        return zzB(obj);
                    }
                    zzk2 = this.waiters;
                } while (zzk2 != zzk.zza);
            }
            Object obj3 = this.value;
            obj3.getClass();
            return zzB(obj3);
        }
        throw new InterruptedException();
    }

    public boolean isCancelled() {
        return this.value instanceof zzb;
    }

    public boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof zzf)) & (obj != null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zzv(sb);
        } else {
            zzw(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public String zza() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        return "remaining delay=[" + delay + " ms]";
    }

    /* access modifiers changed from: protected */
    public void zzb() {
    }

    public void zzc(Runnable runnable, Executor executor) {
        zzd zzd2;
        zzfye.zzc(runnable, "Runnable was null.");
        zzfye.zzc(executor, "Executor was null.");
        if (isDone() || (zzd2 = this.listeners) == zzd.zza) {
            zzz(runnable, executor);
        }
        zzd zzd3 = new zzd(runnable, executor);
        do {
            zzd3.next = zzd2;
            if (!zzaY.zze(this, zzd2, zzd3)) {
                zzd2 = this.listeners;
            } else {
                return;
            }
        } while (zzd2 != zzd.zza);
        zzz(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public boolean zzd(Object obj) {
        if (obj == null) {
            obj = zzbb;
        }
        if (!zzaY.zzf(this, (Object) null, obj)) {
            return false;
        }
        zzy(this, false);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean zze(Throwable th) {
        if (th != null) {
            if (!zzaY.zzf(this, (Object) null, new zzc(th))) {
                return false;
            }
            zzy(this, false);
            return true;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final Throwable zzm() {
        if (!(this instanceof zzh)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof zzc) {
            return ((zzc) obj).zzb;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void zzr() {
    }

    /* access modifiers changed from: package-private */
    public final void zzs(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(zzu());
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zzt(zzgfb zzgfb) {
        zzc zzc2;
        if (zzgfb != null) {
            Object obj = this.value;
            if (obj == null) {
                if (zzgfb.isDone()) {
                    if (!zzaY.zzf(this, (Object) null, zzf(zzgfb))) {
                        return false;
                    }
                    zzy(this, false);
                    return true;
                }
                zzf zzf2 = new zzf(this, zzgfb);
                if (zzaY.zzf(this, (Object) null, zzf2)) {
                    try {
                        zzgfb.zzc(zzf2, zzgef.INSTANCE);
                    } catch (Error | RuntimeException e2) {
                        try {
                            zzc2 = new zzc(e2);
                        } catch (Error | RuntimeException unused) {
                            zzc2 = zzc.zza;
                        }
                        zzaY.zzf(this, zzf2, zzc2);
                    }
                    return true;
                }
                obj = this.value;
            }
            if (obj instanceof zzb) {
                zzgfb.cancel(((zzb) obj).zzc);
            }
            return false;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final boolean zzu() {
        Object obj = this.value;
        return (obj instanceof zzb) && ((zzb) obj).zzc;
    }

    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z = true;
            if ((obj != null) && (!(obj instanceof zzf))) {
                return zzB(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                zzk zzk2 = this.waiters;
                if (zzk2 != zzk.zza) {
                    zzk zzk3 = new zzk();
                    do {
                        zzaY.zzc(zzk3, zzk2);
                        if (zzaY.zzg(this, zzk2, zzk3)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) && (!(obj2 instanceof zzf))) {
                                        return zzB(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    zzA(zzk3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            zzA(zzk3);
                        } else {
                            zzk2 = this.waiters;
                        }
                    } while (zzk2 != zzk.zza);
                }
                Object obj3 = this.value;
                obj3.getClass();
                return zzB(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.value;
                if ((obj4 != null) && (!(obj4 instanceof zzf))) {
                    return zzB(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String zzgdf = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j3 = -nanos;
                long convert = timeUnit2.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit2.toNanos(convert);
                int i = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                if (i != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (i > 0) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(str + " for " + zzgdf);
        }
        throw new InterruptedException();
    }
}
