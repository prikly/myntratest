package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ac.CrashpadHelper;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: com.yandex.metrica.impl.ob.y7  reason: case insensitive filesystem */
public class C0839y7 {
    private static final Set<String> m;

    /* renamed from: a  reason: collision with root package name */
    private final Context f7140a;

    /* renamed from: b  reason: collision with root package name */
    private final ICommonExecutor f7141b;

    /* renamed from: c  reason: collision with root package name */
    private final File f7142c;

    /* renamed from: d  reason: collision with root package name */
    private final List<String> f7143d;

    /* renamed from: e  reason: collision with root package name */
    private final File f7144e;

    /* renamed from: f  reason: collision with root package name */
    private final File f7145f;

    /* renamed from: g  reason: collision with root package name */
    private final C0589nm<Void, String> f7146g;

    /* renamed from: h  reason: collision with root package name */
    private final Jl f7147h;
    private final C0815x7 i;
    private final Callable<String> j;
    private final C0648q7 k;
    private final B0 l;

    /* renamed from: com.yandex.metrica.impl.ob.y7$a */
    class a implements C0589nm<Void, String> {
        a() {
        }

        public Object a(Object obj) {
            Void voidR = (Void) obj;
            return CrashpadHelper.getLibraryVersion();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.y7$b */
    class b implements Callable<String> {
        b() {
        }

        public Object call() throws Exception {
            return CrashpadHelper.getLibDirInsideApk();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.y7$c */
    static class c implements C0589nm<File, Boolean> {
        c() {
        }

        public /* bridge */ /* synthetic */ Object a(Object obj) {
            File file = (File) obj;
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.y7$d */
    static class d implements C0589nm<File, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final String f7148a;

        public d(String str) {
            this.f7148a = str;
        }

        public Object a(Object obj) {
            return Boolean.valueOf(!((File) obj).getName().endsWith(this.f7148a));
        }
    }

    static {
        HashSet hashSet = new HashSet();
        m = hashSet;
        hashSet.add("armeabi-v7a");
        hashSet.add("arm64-v8a");
        hashSet.add("x86");
        hashSet.add("x86_64");
    }

    public C0839y7(Context context, B0 b0, ICommonExecutor iCommonExecutor) {
        this(context, b0, iCommonExecutor, Arrays.asList(new String[]{"libappmetrica_crashpad_handler.so", "libappmetrica_handler.so"}));
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.yandex.metrica.impl.ob.C7 a() {
        /*
            r10 = this;
            java.io.File r0 = r10.f7142c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000f
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r0 = 0
            goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            r3 = 0
            if (r0 == 0) goto L_0x00b1
            android.os.SystemClock.elapsedRealtime()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "-"
            r0.append(r4)
            com.yandex.metrica.impl.ob.nm<java.lang.Void, java.lang.String> r4 = r10.f7146g
            java.lang.Object r4 = r4.a(r3)
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.yandex.metrica.impl.ob.Jl r4 = r10.f7147h
            java.lang.String r4 = r4.a()
            if (r4 == 0) goto L_0x00b0
            java.io.File r5 = r10.f7145f
            if (r5 != 0) goto L_0x003c
            goto L_0x005d
        L_0x003c:
            boolean r5 = r5.exists()
            if (r5 != 0) goto L_0x005f
            java.io.File r5 = r10.f7145f
            boolean r5 = r5.mkdirs()
            if (r5 != 0) goto L_0x004b
            goto L_0x005d
        L_0x004b:
            java.io.File r5 = r10.f7144e
            if (r5 == 0) goto L_0x005d
            boolean r5 = r5.setExecutable(r1, r2)
            if (r5 != 0) goto L_0x0056
            goto L_0x005d
        L_0x0056:
            java.io.File r5 = r10.f7145f
            boolean r5 = r5.setExecutable(r1, r2)
            goto L_0x0060
        L_0x005d:
            r5 = 0
            goto L_0x0060
        L_0x005f:
            r5 = 1
        L_0x0060:
            if (r5 == 0) goto L_0x00b0
            com.yandex.metrica.impl.ob.y7$d r5 = new com.yandex.metrica.impl.ob.y7$d
            r5.<init>(r0)
            com.yandex.metrica.core.api.executors.ICommonExecutor r6 = r10.f7141b
            com.yandex.metrica.impl.ob.z7 r7 = new com.yandex.metrica.impl.ob.z7
            r7.<init>(r10, r5)
            r6.execute(r7)
            java.util.List<java.lang.String> r5 = r10.f7143d
            java.util.Iterator r5 = r5.iterator()
        L_0x0077:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00b0
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            com.yandex.metrica.impl.ob.x7 r7 = r10.i
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r2] = r4
            r8[r1] = r6
            java.lang.String r9 = "lib/%s/%s"
            java.lang.String r8 = java.lang.String.format(r9, r8)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            r9.append(r0)
            java.lang.String r6 = r9.toString()
            java.lang.String r6 = r7.a(r8, r6)
            android.os.SystemClock.elapsedRealtime()
            if (r6 == 0) goto L_0x0077
            com.yandex.metrica.impl.ob.C7 r0 = new com.yandex.metrica.impl.ob.C7
            r0.<init>(r6, r2, r3)
            r3 = r0
        L_0x00b0:
            return r3
        L_0x00b1:
            java.io.File r0 = r10.f7142c
            java.lang.String r0 = r0.getAbsolutePath()
            com.yandex.metrica.impl.ob.C7 r1 = new com.yandex.metrica.impl.ob.C7
            r1.<init>(r0, r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0839y7.a():com.yandex.metrica.impl.ob.C7");
    }

    private File c() {
        String str;
        try {
            str = this.j.call();
        } catch (Throwable unused) {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.l.getClass();
        return new File(str);
    }

    public C7 b() {
        C0624p7 p7Var;
        C7 c7 = null;
        if (A2.a(29)) {
            File c2 = c();
            if (c2 == null) {
                return null;
            }
            for (String file : this.f7143d) {
                this.l.getClass();
                File file2 = new File(c2, file);
                if (file2.exists()) {
                    return new C7(file2.getAbsolutePath(), true, (C0624p7) null);
                }
            }
            return null;
        } else if (!A2.a(23)) {
            return a();
        } else {
            C0648q7 q7Var = this.k;
            Context context = this.f7140a;
            String a2 = this.f7147h.a();
            q7Var.getClass();
            try {
                String[] a3 = D7.a(context, a2);
                p7Var = new C0624p7(a3[0], a3[1], Environment.getDataDirectory().getAbsolutePath());
            } catch (Throwable unused) {
                p7Var = null;
            }
            if (p7Var != null) {
                File c3 = c();
                if (c3 != null) {
                    Iterator<String> it = this.f7143d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        this.l.getClass();
                        File file3 = new File(c3, it.next());
                        if (file3.exists()) {
                            c7 = new C7(file3.getAbsolutePath(), false, p7Var);
                            break;
                        }
                    }
                } else {
                    c7 = new C7("stub", false, p7Var);
                }
            }
            if (c7 == null || c7.f3812d == null) {
                return a();
            }
            this.f7141b.execute(new C0863z7(this, new c()));
            return c7;
        }
    }

    private C0839y7(Context context, B0 b0, ICommonExecutor iCommonExecutor, List<String> list) {
        this(context, iCommonExecutor, list, b0, b0.a(b0.a(context), list.get(0)), b0.b(context.getCacheDir(), "appmetrica_crashpad_handler_extracted"), new a(), new b(), new Jl(m));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C0839y7(android.content.Context r13, com.yandex.metrica.core.api.executors.ICommonExecutor r14, java.util.List<java.lang.String> r15, com.yandex.metrica.impl.ob.B0 r16, java.io.File r17, java.io.File r18, com.yandex.metrica.impl.ob.C0589nm<java.lang.Void, java.lang.String> r19, java.util.concurrent.Callable<java.lang.String> r20, com.yandex.metrica.impl.ob.Jl r21) {
        /*
            r12 = this;
            com.yandex.metrica.impl.ob.x7 r9 = new com.yandex.metrica.impl.ob.x7
            r1 = r13
            r5 = r18
            r9.<init>(r13, r5)
            com.yandex.metrica.impl.ob.q7 r10 = new com.yandex.metrica.impl.ob.q7
            r10.<init>()
            r0 = r12
            r2 = r14
            r3 = r15
            r4 = r17
            r6 = r19
            r7 = r20
            r8 = r21
            r11 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0839y7.<init>(android.content.Context, com.yandex.metrica.core.api.executors.ICommonExecutor, java.util.List, com.yandex.metrica.impl.ob.B0, java.io.File, java.io.File, com.yandex.metrica.impl.ob.nm, java.util.concurrent.Callable, com.yandex.metrica.impl.ob.Jl):void");
    }

    C0839y7(Context context, ICommonExecutor iCommonExecutor, List<String> list, File file, File file2, C0589nm<Void, String> nmVar, Callable<String> callable, Jl jl, C0815x7 x7Var, C0648q7 q7Var, B0 b0) {
        this.f7140a = context;
        this.f7141b = iCommonExecutor;
        this.f7143d = list;
        this.f7142c = file;
        this.f7144e = context.getCacheDir();
        this.f7145f = file2;
        this.f7146g = nmVar;
        this.j = callable;
        this.f7147h = jl;
        this.i = x7Var;
        this.k = q7Var;
        this.l = b0;
    }

    /* access modifiers changed from: package-private */
    public void a(C0589nm<File, Boolean> nmVar) {
        File[] listFiles;
        File file = this.f7145f;
        if (file != null && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (nmVar.a(file2).booleanValue()) {
                    file2.delete();
                }
            }
        }
    }
}
