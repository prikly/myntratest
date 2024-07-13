package com.apm.insight.g;

import android.os.Looper;
import android.os.SystemClock;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.ICrashFilter;
import com.apm.insight.IOOMCallback;
import com.apm.insight.b;
import com.apm.insight.h;
import com.apm.insight.k.d;
import com.apm.insight.l.e;
import com.apm.insight.l.i;
import com.apm.insight.l.k;
import com.apm.insight.l.q;
import com.apm.insight.l.r;
import com.apm.insight.l.v;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.a.f;
import com.apm.insight.runtime.o;
import com.apm.insight.runtime.p;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private static a f10598a = null;
    private static volatile boolean i = false;
    private static volatile ThreadLocal<Boolean> j = new ThreadLocal<>();
    private static ArrayList<b> k = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f10599b;

    /* renamed from: c  reason: collision with root package name */
    private c f10600c;

    /* renamed from: d  reason: collision with root package name */
    private c f10601d;

    /* renamed from: e  reason: collision with root package name */
    private volatile int f10602e = 0;

    /* renamed from: f  reason: collision with root package name */
    private volatile int f10603f = 0;

    /* renamed from: g  reason: collision with root package name */
    private ConcurrentHashMap<String, Object> f10604g = new ConcurrentHashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private ConcurrentHashMap<String, Object> f10605h = new ConcurrentHashMap<>();

    private a() {
        d();
    }

    private static int a(Throwable th, Thread thread) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < k.size()) {
            try {
                try {
                    i3 |= k.get(i2).a(th, thread);
                } catch (Throwable th2) {
                    b.a().a("NPTH_CATCH", th2);
                }
                i2++;
            } catch (Throwable unused) {
            }
        }
        return i3;
    }

    public static a a() {
        if (f10598a == null) {
            f10598a = new a();
        }
        return f10598a;
    }

    private String a(File file, boolean z, Throwable th, String str, Thread thread, boolean z2) {
        String absolutePath = file.getAbsolutePath();
        this.f10605h.put(file.getName(), file);
        try {
            file.getParentFile().mkdirs();
            file.createNewFile();
            NativeImpl.c(absolutePath);
        } catch (Throwable unused) {
        }
        String str2 = null;
        if (z2) {
            int h2 = NativeImpl.h(absolutePath);
            if (h2 > 0) {
                try {
                    NativeImpl.a(h2, com.apm.insight.l.a.c(h.g()));
                    NativeImpl.a(h2, "\n");
                    NativeImpl.a(h2, th.getMessage());
                    NativeImpl.a(h2, "\n");
                    NativeImpl.a(h2, th.getClass().getName());
                    if (th.getMessage() != null) {
                        NativeImpl.a(h2, ": ");
                        NativeImpl.a(h2, th.getMessage());
                    }
                    NativeImpl.a(h2, "\n");
                    NativeImpl.a(h2, thread.getName());
                    NativeImpl.a(h2, "\n");
                } catch (Throwable unused2) {
                }
                try {
                    NativeImpl.a(h2, "stack:");
                    NativeImpl.a(h2, "\n");
                } catch (Throwable unused3) {
                }
                v.a(th, h2);
                NativeImpl.b(h2);
            }
        } else {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                try {
                    if (!r.a(32768)) {
                        fileOutputStream.write((com.apm.insight.l.a.c(h.g()) + "\n").getBytes());
                        fileOutputStream.write((th.getMessage() + "\n").getBytes());
                        fileOutputStream.write((th + "\n").getBytes());
                        fileOutputStream.write((thread.getName() + "\n").getBytes());
                        try {
                            fileOutputStream.write("stack:\n".getBytes());
                        } catch (Throwable unused4) {
                        }
                        try {
                            if (!r.a(8192)) {
                                str2 = v.a(th, thread, new PrintStream(fileOutputStream), Looper.getMainLooper() == Looper.myLooper() ? new e.a() {

                                    /* renamed from: a  reason: collision with root package name */
                                    boolean f10606a = false;

                                    public boolean a(String str) {
                                        if (!this.f10606a && str.contains("android.os.Looper.loop")) {
                                            this.f10606a = true;
                                        }
                                        return !this.f10606a;
                                    }
                                } : new e.a());
                                k.a((Closeable) fileOutputStream);
                                k.a((Closeable) fileOutputStream);
                            } else {
                                throw new RuntimeException("test exception npth write stack");
                            }
                        } catch (Throwable th2) {
                            try {
                                fileOutputStream.write("err:\n".getBytes());
                                fileOutputStream.write((th + "\n").getBytes());
                                fileOutputStream.write((th2 + "\n").getBytes());
                            } catch (Throwable unused5) {
                            }
                        }
                    } else {
                        throw new RuntimeException("test exception before write stack");
                    }
                } catch (Throwable unused6) {
                }
            } catch (Throwable unused7) {
            }
        }
        return str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01fa A[Catch:{ all -> 0x0225, all -> 0x023e }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01ff A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0050 A[SYNTHETIC, Splitter:B:23:0x0050] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053 A[Catch:{ all -> 0x01ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0088 A[ADDED_TO_REGION, Catch:{ all -> 0x01ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a0 A[Catch:{ all -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a2 A[Catch:{ all -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a5 A[Catch:{ all -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ad A[Catch:{ all -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b0 A[Catch:{ all -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f2 A[Catch:{ all -> 0x01da }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f9 A[Catch:{ all -> 0x01da }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00fc A[Catch:{ all -> 0x01da }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x011f A[SYNTHETIC, Splitter:B:60:0x011f] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0166 A[SYNTHETIC, Splitter:B:75:0x0166] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Throwable a(java.lang.Thread r23, java.lang.Throwable r24) {
        /*
            r22 = this;
            r8 = r22
            r15 = r23
            r14 = r24
            int r0 = r8.f10602e
            r18 = 0
            r1 = 3
            if (r0 < r1) goto L_0x0016
            r0 = 65536(0x10000, float:9.18355E-41)
            boolean r0 = com.apm.insight.l.r.a((int) r0)
            if (r0 != 0) goto L_0x0016
            return r18
        L_0x0016:
            int r0 = r8.f10602e
            r13 = 1
            int r0 = r0 + r13
            r8.f10602e = r0
            int r0 = r8.f10603f
            int r0 = r0 + r13
            r8.f10603f = r0
            boolean r0 = i
            if (r0 == 0) goto L_0x002e
            java.lang.ThreadLocal<java.lang.Boolean> r0 = j
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r13)
            r0.set(r1)
        L_0x002e:
            i = r13
            long r10 = java.lang.System.currentTimeMillis()
            boolean r12 = a((long) r10)
            r9 = 0
            boolean r0 = com.apm.insight.l.v.c((java.lang.Throwable) r24)     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0047
            boolean r1 = com.apm.insight.l.v.d(r24)     // Catch:{ all -> 0x004c }
            if (r1 == 0) goto L_0x0047
            r1 = 1
            goto L_0x0048
        L_0x0047:
            r1 = 0
        L_0x0048:
            r19 = r1
            goto L_0x004e
        L_0x004b:
            r0 = 0
        L_0x004c:
            r19 = 0
        L_0x004e:
            if (r12 == 0) goto L_0x0053
            com.apm.insight.CrashType r1 = com.apm.insight.CrashType.LAUNCH     // Catch:{ all -> 0x01ea }
            goto L_0x0055
        L_0x0053:
            com.apm.insight.CrashType r1 = com.apm.insight.CrashType.JAVA     // Catch:{ all -> 0x01ea }
        L_0x0055:
            java.lang.String r7 = com.apm.insight.h.a(r10, r1, r0, r9)     // Catch:{ all -> 0x01ea }
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x01ea }
            android.content.Context r1 = com.apm.insight.h.g()     // Catch:{ all -> 0x01ea }
            java.io.File r1 = com.apm.insight.l.o.a((android.content.Context) r1)     // Catch:{ all -> 0x01ea }
            r6.<init>(r1, r7)     // Catch:{ all -> 0x01ea }
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x01ea }
            java.lang.String r1 = "logEventStack"
            r5.<init>(r6, r1)     // Catch:{ all -> 0x01ea }
            r1 = r22
            r2 = r5
            r3 = r0
            r4 = r24
            r16 = r5
            r5 = r7
            r9 = r6
            r6 = r23
            r20 = r7
            r7 = r19
            java.lang.String r7 = r1.a(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x01ea }
            int r1 = a((java.lang.Throwable) r14, (java.lang.Thread) r15)     // Catch:{ all -> 0x01ea }
            r1 = r1 & r13
            if (r1 != 0) goto L_0x0098
            if (r7 == 0) goto L_0x0095
            com.apm.insight.runtime.ConfigManager r1 = com.apm.insight.h.i()     // Catch:{ all -> 0x01ea }
            boolean r1 = r1.isCrashIgnored(r7)     // Catch:{ all -> 0x01ea }
            if (r1 == 0) goto L_0x0095
            goto L_0x0098
        L_0x0095:
            r21 = 0
            goto L_0x009a
        L_0x0098:
            r21 = 1
        L_0x009a:
            org.json.JSONArray r1 = com.apm.insight.entity.b.a((java.lang.Throwable) r14, (java.lang.Thread) r15, (java.io.File) r9)     // Catch:{ all -> 0x01e1 }
            if (r1 != 0) goto L_0x00a2
            r1 = 1
            goto L_0x00a3
        L_0x00a2:
            r1 = 0
        L_0x00a3:
            if (r1 != 0) goto L_0x00ab
            if (r21 == 0) goto L_0x00a8
            goto L_0x00ab
        L_0x00a8:
            r0 = r20
            goto L_0x00cf
        L_0x00ab:
            if (r12 == 0) goto L_0x00b0
            com.apm.insight.CrashType r1 = com.apm.insight.CrashType.LAUNCH     // Catch:{ all -> 0x01e1 }
            goto L_0x00b2
        L_0x00b0:
            com.apm.insight.CrashType r1 = com.apm.insight.CrashType.JAVA     // Catch:{ all -> 0x01e1 }
        L_0x00b2:
            java.lang.String r0 = com.apm.insight.h.a(r10, r1, r0, r13)     // Catch:{ all -> 0x01e1 }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x01e1 }
            android.content.Context r2 = com.apm.insight.h.g()     // Catch:{ all -> 0x01e1 }
            java.io.File r2 = com.apm.insight.l.o.a((android.content.Context) r2)     // Catch:{ all -> 0x01e1 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x01e1 }
            r9.renameTo(r1)     // Catch:{ all -> 0x01e1 }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x01e1 }
            java.lang.String r3 = "logEventStack"
            r2.<init>(r1, r3)     // Catch:{ all -> 0x01e1 }
            r16 = r2
        L_0x00cf:
            com.apm.insight.l.f.a()     // Catch:{ all -> 0x01e1 }
            com.apm.insight.k.b r1 = com.apm.insight.k.b.a()     // Catch:{ all -> 0x01e1 }
            r1.b()     // Catch:{ all -> 0x01e1 }
            boolean r20 = r22.g()     // Catch:{ all -> 0x01e1 }
            if (r19 == 0) goto L_0x00ec
            if (r20 == 0) goto L_0x00ec
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r12
            r5 = r10
            r1.a((java.lang.Thread) r2, (java.lang.Throwable) r3, (boolean) r4, (long) r5)     // Catch:{ all -> 0x01da }
        L_0x00ec:
            boolean r1 = com.apm.insight.l.r.a((int) r13)     // Catch:{ all -> 0x01da }
            if (r1 == 0) goto L_0x00f7
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r1 = r8.f10605h     // Catch:{ all -> 0x01da }
            r1.clear()     // Catch:{ all -> 0x01da }
        L_0x00f7:
            if (r12 == 0) goto L_0x00fc
            com.apm.insight.CrashType r1 = com.apm.insight.CrashType.LAUNCH     // Catch:{ all -> 0x01da }
            goto L_0x00fe
        L_0x00fc:
            com.apm.insight.CrashType r1 = com.apm.insight.CrashType.JAVA     // Catch:{ all -> 0x01da }
        L_0x00fe:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01da }
            r2.<init>()     // Catch:{ all -> 0x01da }
            java.lang.String r3 = "[uncaughtException] isLaunchCrash="
            r2.append(r3)     // Catch:{ all -> 0x01da }
            r2.append(r12)     // Catch:{ all -> 0x01da }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01da }
            com.apm.insight.l.q.a((java.lang.Object) r2)     // Catch:{ all -> 0x01da }
            com.apm.insight.a.a r2 = com.apm.insight.a.a.a()     // Catch:{ all -> 0x01da }
            r2.a((com.apm.insight.CrashType) r1, (long) r10, (java.lang.String) r0)     // Catch:{ all -> 0x01da }
            boolean r1 = r22.b((java.lang.Thread) r23, (java.lang.Throwable) r24)     // Catch:{ all -> 0x01da }
            if (r1 == 0) goto L_0x0160
            com.apm.insight.g.c r2 = r8.f10600c     // Catch:{ all -> 0x0158 }
            if (r2 == 0) goto L_0x0160
            if (r12 == 0) goto L_0x0160
            com.apm.insight.g.c r2 = r8.f10600c     // Catch:{ all -> 0x0158 }
            boolean r2 = r2.a(r14)     // Catch:{ all -> 0x0158 }
            if (r2 == 0) goto L_0x0160
            com.apm.insight.g.c r9 = r8.f10600c     // Catch:{ all -> 0x0158 }
            r5 = r10
            r4 = r12
            r12 = r23
            r2 = 1
            r13 = r24
            r3 = r14
            r14 = r0
            r1 = r15
            r15 = r16
            r16 = r7
            r17 = r21
            r9.a(r10, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x019e }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x019e }
            r0.<init>()     // Catch:{ all -> 0x019e }
            java.lang.String r7 = "[uncaughtException] mLaunchCrashDisposer "
            r0.append(r7)     // Catch:{ all -> 0x019e }
            java.lang.String r7 = r24.toString()     // Catch:{ all -> 0x019e }
            r0.append(r7)     // Catch:{ all -> 0x019e }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x019e }
            goto L_0x0199
        L_0x0158:
            r0 = move-exception
            r5 = r10
            r4 = r12
            r2 = 1
            r9 = r14
        L_0x015d:
            r7 = r15
            goto L_0x01f4
        L_0x0160:
            r5 = r10
            r4 = r12
            r3 = r14
            r2 = 1
            if (r1 == 0) goto L_0x01a8
            com.apm.insight.g.c r9 = r8.f10601d     // Catch:{ all -> 0x01a4 }
            if (r9 == 0) goto L_0x01a8
            com.apm.insight.g.c r9 = r8.f10601d     // Catch:{ all -> 0x01a4 }
            boolean r9 = r9.a(r3)     // Catch:{ all -> 0x01a4 }
            if (r9 == 0) goto L_0x01a8
            com.apm.insight.g.c r9 = r8.f10601d     // Catch:{ all -> 0x01a1 }
            r10 = r5
            r12 = r23
            r13 = r24
            r14 = r0
            r1 = r15
            r15 = r16
            r16 = r7
            r17 = r21
            r9.a(r10, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x019e }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x019e }
            r0.<init>()     // Catch:{ all -> 0x019e }
            java.lang.String r7 = "[uncaughtException] mLaunchCrashDisposer "
            r0.append(r7)     // Catch:{ all -> 0x019e }
            java.lang.String r7 = r24.toString()     // Catch:{ all -> 0x019e }
            r0.append(r7)     // Catch:{ all -> 0x019e }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x019e }
        L_0x0199:
            com.apm.insight.l.q.a((java.lang.Object) r0)     // Catch:{ all -> 0x019e }
            r7 = r1
            goto L_0x01a9
        L_0x019e:
            r0 = move-exception
            r7 = r1
            goto L_0x01a6
        L_0x01a1:
            r0 = move-exception
            r9 = r3
            goto L_0x015d
        L_0x01a4:
            r0 = move-exception
            r7 = r15
        L_0x01a6:
            r9 = r3
            goto L_0x01f4
        L_0x01a8:
            r7 = r15
        L_0x01a9:
            if (r21 != 0) goto L_0x01c5
            if (r19 == 0) goto L_0x01ba
            if (r20 != 0) goto L_0x01ba
            r1 = r22
            r2 = r23
            r9 = r3
            r3 = r24
            r1.a((java.lang.Thread) r2, (java.lang.Throwable) r3, (boolean) r4, (long) r5)     // Catch:{ all -> 0x0210 }
            goto L_0x01bb
        L_0x01ba:
            r9 = r3
        L_0x01bb:
            r22.f()     // Catch:{ all -> 0x0210 }
        L_0x01be:
            r22.e()     // Catch:{ all -> 0x0210 }
            r22.c(r23, r24)     // Catch:{ all -> 0x0210 }
            goto L_0x0210
        L_0x01c5:
            r9 = r3
            monitor-enter(r22)
            int r0 = r8.f10603f     // Catch:{ all -> 0x01d7 }
            int r0 = r0 - r2
            r8.f10603f = r0     // Catch:{ all -> 0x01d7 }
            int r0 = r8.f10602e     // Catch:{ all -> 0x01d7 }
            int r0 = r0 - r2
            r8.f10602e = r0     // Catch:{ all -> 0x01d7 }
            monitor-exit(r22)     // Catch:{ all -> 0x01d7 }
            java.lang.Throwable r0 = b((java.lang.Throwable) r9, (java.lang.Thread) r7)
            return r0
        L_0x01d7:
            r0 = move-exception
            monitor-exit(r22)     // Catch:{ all -> 0x01d7 }
            throw r0
        L_0x01da:
            r0 = move-exception
            r5 = r10
            r4 = r12
            r9 = r14
            r7 = r15
            r2 = 1
            goto L_0x01f4
        L_0x01e1:
            r0 = move-exception
            r5 = r10
            r4 = r12
            r9 = r14
            r7 = r15
            r2 = 1
            r20 = 0
            goto L_0x01f4
        L_0x01ea:
            r0 = move-exception
            r5 = r10
            r4 = r12
            r9 = r14
            r7 = r15
            r2 = 1
            r20 = 0
            r21 = 0
        L_0x01f4:
            boolean r1 = com.apm.insight.l.v.c((java.lang.Throwable) r0)     // Catch:{ all -> 0x0225 }
            if (r1 != 0) goto L_0x01fd
            com.apm.insight.l.q.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x0225 }
        L_0x01fd:
            if (r21 != 0) goto L_0x0211
            if (r19 == 0) goto L_0x020c
            if (r20 != 0) goto L_0x020c
            r1 = r22
            r2 = r23
            r3 = r24
            r1.a((java.lang.Thread) r2, (java.lang.Throwable) r3, (boolean) r4, (long) r5)     // Catch:{ all -> 0x0210 }
        L_0x020c:
            r22.f()     // Catch:{ all -> 0x0210 }
            goto L_0x01be
        L_0x0210:
            return r18
        L_0x0211:
            monitor-enter(r22)
            int r0 = r8.f10603f     // Catch:{ all -> 0x0222 }
            int r0 = r0 - r2
            r8.f10603f = r0     // Catch:{ all -> 0x0222 }
            int r0 = r8.f10602e     // Catch:{ all -> 0x0222 }
            int r0 = r0 - r2
            r8.f10602e = r0     // Catch:{ all -> 0x0222 }
            monitor-exit(r22)     // Catch:{ all -> 0x0222 }
            java.lang.Throwable r0 = b((java.lang.Throwable) r9, (java.lang.Thread) r7)
            return r0
        L_0x0222:
            r0 = move-exception
            monitor-exit(r22)     // Catch:{ all -> 0x0222 }
            throw r0
        L_0x0225:
            r0 = move-exception
            if (r21 != 0) goto L_0x023f
            if (r19 == 0) goto L_0x0235
            if (r20 != 0) goto L_0x0235
            r1 = r22
            r2 = r23
            r3 = r24
            r1.a((java.lang.Thread) r2, (java.lang.Throwable) r3, (boolean) r4, (long) r5)     // Catch:{ all -> 0x023e }
        L_0x0235:
            r22.f()     // Catch:{ all -> 0x023e }
            r22.e()     // Catch:{ all -> 0x023e }
            r22.c(r23, r24)     // Catch:{ all -> 0x023e }
        L_0x023e:
            throw r0
        L_0x023f:
            monitor-enter(r22)
            int r0 = r8.f10603f     // Catch:{ all -> 0x0250 }
            int r0 = r0 - r2
            r8.f10603f = r0     // Catch:{ all -> 0x0250 }
            int r0 = r8.f10602e     // Catch:{ all -> 0x0250 }
            int r0 = r0 - r2
            r8.f10602e = r0     // Catch:{ all -> 0x0250 }
            monitor-exit(r22)     // Catch:{ all -> 0x0250 }
            java.lang.Throwable r0 = b((java.lang.Throwable) r9, (java.lang.Thread) r7)
            return r0
        L_0x0250:
            r0 = move-exception
            monitor-exit(r22)     // Catch:{ all -> 0x0250 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.g.a.a(java.lang.Thread, java.lang.Throwable):java.lang.Throwable");
    }

    private void a(Thread thread, Throwable th, boolean z, long j2) {
        List<IOOMCallback> a2 = o.a().a();
        CrashType crashType = z ? CrashType.LAUNCH : CrashType.JAVA;
        for (IOOMCallback onCrash : a2) {
            try {
                onCrash.onCrash(crashType, th, thread, j2);
            } catch (Throwable th2) {
                q.b(th2);
            }
        }
    }

    public static void a(final Throwable th) {
        if (th != null) {
            try {
                p.b().a((Runnable) new Runnable() {
                    public void run() {
                        try {
                            com.apm.insight.entity.a a2 = com.apm.insight.entity.a.a(System.currentTimeMillis(), h.g(), (Thread) null, th);
                            a2.a("userdefine", (Object) 1);
                            com.apm.insight.entity.a a3 = f.a().a(CrashType.CUSTOM_JAVA, a2);
                            if (a3 != null) {
                                d.a().b(a3.h());
                            }
                        } catch (Throwable unused) {
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean a(long j2) {
        return e.a(j2);
    }

    private static Throwable b(Throwable th, Thread thread) {
        int i2 = 0;
        while (i2 < k.size()) {
            try {
                try {
                    k.get(i2).b(th, thread);
                    i2++;
                } catch (Throwable th2) {
                    return th2;
                }
            } catch (Throwable unused) {
            }
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return null;
        }
        try {
            Looper.loop();
            return null;
        } catch (Throwable th3) {
            return th3;
        }
    }

    public static boolean b() {
        return i;
    }

    private boolean b(Thread thread, Throwable th) {
        ICrashFilter b2 = h.b().b();
        if (b2 == null) {
            return true;
        }
        try {
            return b2.onJavaCrashFilter(th, thread);
        } catch (Throwable unused) {
            return true;
        }
    }

    public static void c(final String str) {
        if (str != null) {
            try {
                p.b().a((Runnable) new Runnable() {
                    public void run() {
                        try {
                            com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
                            aVar.a("data", (Object) str);
                            aVar.a("userdefine", (Object) 1);
                            com.apm.insight.entity.a a2 = f.a().a(CrashType.CUSTOM_JAVA, aVar);
                            if (a2 != null) {
                                d.a().b(a2.h());
                            }
                        } catch (Throwable unused) {
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    private void c(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f10599b;
        if (uncaughtExceptionHandler != null && uncaughtExceptionHandler != this && !r.a(512)) {
            this.f10599b.uncaughtException(thread, th);
        }
    }

    public static boolean c() {
        Boolean bool = j.get();
        return bool != null && bool.booleanValue();
    }

    private void d() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != this) {
            this.f10599b = defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    private void e() {
        synchronized (this) {
            this.f10603f--;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        while (this.f10603f != 0 && SystemClock.uptimeMillis() - uptimeMillis < 10000) {
            SystemClock.sleep(50);
        }
    }

    private void f() {
        File a2 = com.apm.insight.l.o.a(h.g());
        File a3 = com.apm.insight.l.o.a();
        if (!i.b(a2) || !i.b(a3)) {
            long uptimeMillis = SystemClock.uptimeMillis();
            while (!com.apm.insight.k.i.a() && SystemClock.uptimeMillis() - uptimeMillis < 10000) {
                try {
                    SystemClock.sleep(500);
                } catch (Throwable unused) {
                }
            }
        }
    }

    private boolean g() {
        return com.apm.insight.runtime.a.a("exception_modules", "oom_callback") == 1;
    }

    public void a(c cVar) {
        this.f10600c = cVar;
    }

    public void a(String str) {
        this.f10604g.put(str, new Object());
    }

    public void a(Thread thread, Throwable th, boolean z, com.apm.insight.entity.a aVar) {
        List<ICrashCallback> list;
        CrashType crashType;
        if (z) {
            list = o.a().b();
            crashType = CrashType.LAUNCH;
        } else {
            list = o.a().c();
            crashType = CrashType.JAVA;
        }
        for (ICrashCallback next : list) {
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                next.onCrash(crashType, v.a(th), thread);
                aVar.b("callback_cost_" + next.getClass().getName(), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            } catch (Throwable th2) {
                q.b(th2);
                aVar.b("callback_err_" + next.getClass().getName(), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            }
        }
    }

    public void b(c cVar) {
        this.f10601d = cVar;
    }

    public boolean b(String str) {
        return this.f10604g.containsKey(str);
    }

    public void uncaughtException(Thread thread, Throwable th) {
        do {
            th = a(thread, th);
        } while (th != null);
    }
}
