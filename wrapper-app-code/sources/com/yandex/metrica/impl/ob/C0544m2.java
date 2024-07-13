package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.SparseArray;
import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.coreutils.io.FileUtils;
import com.yandex.metrica.impl.ob.C0378fa;
import com.yandex.metrica.impl.ob.C0635pi;
import com.yandex.metrica.impl.ob.C0659qi;
import com.yandex.metrica.impl.ob.C0687s;
import com.yandex.metrica.impl.ob.C0763v3;
import com.yandex.metrica.impl.ob.D1;
import com.yandex.metrica.impl.ob.Ud;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.m2  reason: case insensitive filesystem */
public class C0544m2 extends D1 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C0352e9 f6168a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Context f6169b;

    /* renamed from: c  reason: collision with root package name */
    private final C0251a8 f6170c;

    /* renamed from: com.yandex.metrica.impl.ob.m2$a */
    class a extends SparseArray<D1.a> {
        a() {
            put(29, new j(C0544m2.this.f6169b));
            put(39, new k());
            put(47, new l(C0544m2.this.f6168a));
            put(60, new m(C0544m2.this.f6168a));
            put(62, new n());
            put(66, new o());
            put(67, new g(C0378fa.b.a(C0659qi.class).b(C0544m2.this.f6169b), new C0377f9(C0477ja.a(C0544m2.this.f6169b).q(), C0544m2.this.f6169b.getPackageName())));
            put(68, new u());
            put(72, new f(C0378fa.b.b(Bd.class).b(C0544m2.this.f6169b), C0378fa.b.a(C0659qi.class).b(C0544m2.this.f6169b)));
            put(82, new h(C0378fa.b.b(Bd.class).b(C0544m2.this.f6169b), C0378fa.b.a(C0725td.class).b(C0544m2.this.f6169b)));
            put(87, new i(C0378fa.b.a(C0659qi.class).b(C0544m2.this.f6169b)));
            put(92, new c(C0378fa.b.a(C0659qi.class).b(C0544m2.this.f6169b)));
            put(93, new e(C0544m2.this.f6169b, C0378fa.b.a(C0357ee.class).b(C0544m2.this.f6169b), C0378fa.b.a(Ud.class).b(C0544m2.this.f6169b)));
            put(94, new p(C0544m2.this.f6169b, C0378fa.b.a(C0659qi.class).b(C0544m2.this.f6169b)));
            put(98, new t(C0544m2.this.f6168a));
            put(100, new b(new C0377f9(C0477ja.a(C0544m2.this.f6169b).q(), C0544m2.this.f6169b.getPackageName())));
            put(101, new q(C0544m2.this.f6168a, C0378fa.b.a(C0659qi.class).b(C0544m2.this.f6169b)));
            put(102, new r(C0378fa.b.a(Ud.class).b(C0544m2.this.f6169b)));
            put(103, new d(C0378fa.b.a(Z1.class).b(C0544m2.this.f6169b), C0378fa.b.a(C0763v3.class).b(C0544m2.this.f6169b), C0544m2.this.f6168a));
            put(104, new s(C0477ja.a(C0544m2.this.f6169b).o()));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$b */
    static class b implements D1.a {

        /* renamed from: a  reason: collision with root package name */
        private final C0377f9 f6172a;

        public b(C0377f9 f9Var) {
            this.f6172a = f9Var;
        }

        public void a(Context context) {
            this.f6172a.f();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$c */
    static class c implements D1.a {

        /* renamed from: a  reason: collision with root package name */
        private final ProtobufStateStorage<C0659qi> f6173a;

        c(ProtobufStateStorage<C0659qi> protobufStateStorage) {
            this.f6173a = protobufStateStorage;
        }

        public void a(Context context) {
            C0659qi qiVar = (C0659qi) this.f6173a.read();
            this.f6173a.save(qiVar.a(qiVar.r).g(qiVar.p).a());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$d */
    static class d implements D1.a {

        /* renamed from: a  reason: collision with root package name */
        private final ProtobufStateStorage<Z1> f6174a;

        /* renamed from: b  reason: collision with root package name */
        private final ProtobufStateStorage<C0763v3> f6175b;

        /* renamed from: c  reason: collision with root package name */
        private final C0352e9 f6176c;

        public d(ProtobufStateStorage<Z1> protobufStateStorage, ProtobufStateStorage<C0763v3> protobufStateStorage2, C0352e9 e9Var) {
            this.f6174a = protobufStateStorage;
            this.f6175b = protobufStateStorage2;
            this.f6176c = e9Var;
        }

        public void a(Context context) {
            Z1 z1 = (Z1) this.f6174a.read();
            this.f6174a.delete();
            if (z1.f5394b) {
                if (!A2.b((Map) z1.f5393a)) {
                    C0763v3.a aVar = new C0763v3.a(z1.f5393a, C0736u0.SATELLITE);
                    this.f6175b.save(new C0763v3(aVar, Collections.singletonList(aVar)));
                }
                this.f6176c.h();
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$e */
    static class e implements D1.a {

        /* renamed from: a  reason: collision with root package name */
        private final C0257ae f6177a;

        /* renamed from: b  reason: collision with root package name */
        private final ProtobufStateStorage<C0357ee> f6178b;

        /* renamed from: c  reason: collision with root package name */
        private final ProtobufStateStorage<Ud> f6179c;

        e(Context context, ProtobufStateStorage<C0357ee> protobufStateStorage, ProtobufStateStorage<Ud> protobufStateStorage2) {
            this(protobufStateStorage, protobufStateStorage2, new C0257ae(context));
        }

        public void a(Context context) {
            C0357ee a2;
            C0357ee eeVar = (C0357ee) this.f6178b.read();
            ArrayList arrayList = new ArrayList();
            C0736u0 u0Var = eeVar.f5747e;
            if (u0Var != C0736u0.UNDEFINED) {
                arrayList.add(new Ud.a(eeVar.f5743a, eeVar.f5744b, u0Var));
            }
            if (eeVar.f5747e == C0736u0.RETAIL && (a2 = this.f6177a.invoke()) != null) {
                arrayList.add(new Ud.a(a2.f5743a, a2.f5744b, a2.f5747e));
            }
            this.f6179c.save(new Ud(eeVar, arrayList));
            this.f6178b.delete();
        }

        e(ProtobufStateStorage<C0357ee> protobufStateStorage, ProtobufStateStorage<Ud> protobufStateStorage2, C0257ae aeVar) {
            this.f6178b = protobufStateStorage;
            this.f6179c = protobufStateStorage2;
            this.f6177a = aeVar;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$f */
    static class f implements D1.a {

        /* renamed from: a  reason: collision with root package name */
        private final ProtobufStateStorage<Collection<Bd>> f6180a;

        /* renamed from: b  reason: collision with root package name */
        private final ProtobufStateStorage<C0659qi> f6181b;

        /* renamed from: c  reason: collision with root package name */
        private final B0 f6182c;

        public f(ProtobufStateStorage<Collection<Bd>> protobufStateStorage, ProtobufStateStorage<C0659qi> protobufStateStorage2) {
            this(protobufStateStorage, protobufStateStorage2, new B0());
        }

        public void a(Context context) {
            JSONObject jSONObject;
            String str;
            V7 h2 = C0477ja.a(context).h();
            List<Bd> b2 = h2.b();
            if (b2 != null) {
                this.f6180a.save(b2);
                h2.a();
            }
            C0659qi qiVar = (C0659qi) this.f6181b.read();
            C0659qi.b a2 = qiVar.a(qiVar.r);
            String str2 = null;
            try {
                jSONObject = new JSONObject(L0.a(this.f6182c.b(context.getFilesDir(), "credentials.dat")));
            } catch (Throwable unused) {
                jSONObject = null;
            }
            if (jSONObject == null && FileUtils.needToUseNoBackup()) {
                try {
                    jSONObject = new JSONObject(L0.a(this.f6182c.b(context.getNoBackupFilesDir(), "credentials.dat")));
                } catch (Throwable unused2) {
                }
            }
            if (jSONObject != null) {
                str2 = jSONObject.optString("device_id", (String) null);
                str = jSONObject.optString("device_id_hash", (String) null);
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                a2.c(str2);
            }
            if (!TextUtils.isEmpty(str)) {
                a2.d(str);
            }
            a2.b(true);
            this.f6181b.save(a2.a());
            context.getSharedPreferences("com.yandex.metrica.configuration", 0).edit().clear().apply();
        }

        f(ProtobufStateStorage<Collection<Bd>> protobufStateStorage, ProtobufStateStorage<C0659qi> protobufStateStorage2, B0 b0) {
            this.f6180a = protobufStateStorage;
            this.f6181b = protobufStateStorage2;
            this.f6182c = b0;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$g */
    static class g implements D1.a {

        /* renamed from: a  reason: collision with root package name */
        private ProtobufStateStorage f6183a;

        /* renamed from: b  reason: collision with root package name */
        private C0377f9 f6184b;

        public g(ProtobufStateStorage protobufStateStorage, C0377f9 f9Var) {
            this.f6183a = protobufStateStorage;
            this.f6184b = f9Var;
        }

        public void a(Context context) {
            this.f6183a.save(this.f6184b.g());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$h */
    static class h implements D1.a {

        /* renamed from: a  reason: collision with root package name */
        private final ProtobufStateStorage<Collection<Bd>> f6185a;

        /* renamed from: b  reason: collision with root package name */
        private final ProtobufStateStorage<C0725td> f6186b;

        h(ProtobufStateStorage<Collection<Bd>> protobufStateStorage, ProtobufStateStorage<C0725td> protobufStateStorage2) {
            this.f6185a = protobufStateStorage;
            this.f6186b = protobufStateStorage2;
        }

        public void a(Context context) {
            this.f6186b.save(new C0725td(new ArrayList((Collection) this.f6185a.read()), (C0855z) null, new ArrayList()));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$i */
    static class i implements D1.a {

        /* renamed from: a  reason: collision with root package name */
        private final ProtobufStateStorage<C0659qi> f6187a;

        i(ProtobufStateStorage<C0659qi> protobufStateStorage) {
            this.f6187a = protobufStateStorage;
        }

        public void a(Context context) {
            ProtobufStateStorage<C0659qi> protobufStateStorage = this.f6187a;
            C0659qi qiVar = (C0659qi) protobufStateStorage.read();
            protobufStateStorage.save(qiVar.a(qiVar.r).b(true).a());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$j */
    static class j implements D1.a {

        /* renamed from: a  reason: collision with root package name */
        private Pd f6188a;

        /* renamed from: b  reason: collision with root package name */
        private C0377f9 f6189b;

        j(Context context) {
            this.f6188a = new Pd(context);
            this.f6189b = new C0377f9(C0477ja.a(context).p(), context.getPackageName());
        }

        public void a(Context context) {
            String b2 = this.f6188a.b((String) null);
            if (!TextUtils.isEmpty(b2)) {
                this.f6189b.i(b2).d();
                Pd.b(context);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$k */
    static class k implements D1.a {
        k() {
        }

        public void a(Context context) {
            Md md = new Md(context, context.getPackageName());
            SharedPreferences a2 = C0267b.a(context, "_boundentrypreferences");
            Rd rd = Md.H;
            String string = a2.getString(rd.b(), (String) null);
            Rd rd2 = Md.I;
            long j = a2.getLong(rd2.b(), -1);
            if (string != null && j != -1) {
                md.a(new C0687s.a(string, j)).b();
                a2.edit().remove(rd.b()).remove(rd2.b()).apply();
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$l */
    static class l implements D1.a {

        /* renamed from: a  reason: collision with root package name */
        private final C0352e9 f6190a;

        l(C0352e9 e9Var) {
            this.f6190a = e9Var;
        }

        public void a(Context context) {
            C0352e9 e9Var = this.f6190a;
            Qd qd = new Qd(context, (String) null);
            if (qd.f()) {
                e9Var.d(true);
                qd.g();
            }
            C0352e9 e9Var2 = this.f6190a;
            Od od = new Od(context, context.getPackageName());
            long a2 = od.a(0);
            if (a2 != 0) {
                e9Var2.l(a2);
            }
            od.f();
            new Md(context, new W3(context.getPackageName(), (String) null).b()).i().b();
            this.f6190a.d();
            Hd hd = new Hd(context);
            hd.a();
            hd.b();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$m */
    static class m implements D1.a {

        /* renamed from: a  reason: collision with root package name */
        private final C0352e9 f6191a;

        m(C0352e9 e9Var) {
            this.f6191a = e9Var;
        }

        public void a(Context context) {
            long j = new C0377f9(C0477ja.a(context).q(), context.getPackageName()).g().u;
            boolean z = true;
            boolean z2 = j > 0;
            if (this.f6191a.b(-1) <= 0) {
                z = false;
            }
            if (z2 || z) {
                this.f6191a.c(false).d();
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$n */
    static class n implements D1.a {
        n() {
        }

        public void a(Context context) {
            C0377f9 f9Var = new C0377f9(C0477ja.a(context).q(), context.getPackageName());
            String h2 = f9Var.h((String) null);
            if (h2 != null) {
                f9Var.b((List<String>) Collections.singletonList(h2));
            }
            String g2 = f9Var.g((String) null);
            if (g2 != null) {
                f9Var.a((List<String>) Collections.singletonList(g2));
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$o */
    static class o implements D1.a {

        /* renamed from: a  reason: collision with root package name */
        private final B0 f6192a;

        /* renamed from: com.yandex.metrica.impl.ob.m2$o$a */
        static class a implements FilenameFilter {

            /* renamed from: a  reason: collision with root package name */
            final Iterable<FilenameFilter> f6193a;

            a(Iterable<FilenameFilter> iterable) {
                this.f6193a = iterable;
            }

            public boolean accept(File file, String str) {
                for (FilenameFilter accept : this.f6193a) {
                    if (accept.accept(file, str)) {
                        return true;
                    }
                }
                return false;
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.m2$o$b */
        static class b implements FilenameFilter {

            /* renamed from: a  reason: collision with root package name */
            private final FilenameFilter f6194a;

            b(FilenameFilter filenameFilter) {
                this.f6194a = filenameFilter;
            }

            public boolean accept(File file, String str) {
                if (!str.startsWith("db_metrica_")) {
                    return false;
                }
                try {
                    FilenameFilter filenameFilter = this.f6194a;
                    if (str.endsWith("-journal")) {
                        str = str.replace("-journal", "");
                    }
                    return filenameFilter.accept(file, str);
                } catch (Throwable unused) {
                    return false;
                }
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.m2$o$c */
        static class c implements FilenameFilter {
            c() {
            }

            public boolean accept(File file, String str) {
                return str.endsWith("null");
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.m2$o$d */
        static class d implements FilenameFilter {

            /* renamed from: a  reason: collision with root package name */
            private final String f6195a;

            d(String str) {
                this.f6195a = str;
            }

            public boolean accept(File file, String str) {
                return !str.contains(this.f6195a);
            }
        }

        o() {
            this(new B0());
        }

        public void a(Context context) {
            File[] fileArr;
            if (b(context) == null) {
                fileArr = new File[0];
            } else {
                fileArr = b(context).listFiles(new a(Arrays.asList(new FilenameFilter[]{new b(new d(context.getPackageName())), new b(new c())})));
            }
            for (File file : fileArr) {
                try {
                    if (!file.delete()) {
                        ((C0584nh) C0609oh.a()).reportEvent("Can not delete file", new JSONObject().put("fileName", file.getName()).toString());
                    }
                } catch (Throwable th) {
                    ((C0584nh) C0609oh.a()).reportError("Can not delete file", th);
                }
            }
            new C0377f9(C0477ja.a(context).q(), context.getPackageName()).f(new Rd("LAST_STARTUP_CLIDS_SAVE_TIME", (String) null).a()).d();
        }

        /* access modifiers changed from: package-private */
        public File b(Context context) {
            if (A2.a(21)) {
                return context.getNoBackupFilesDir();
            }
            File filesDir = context.getFilesDir();
            if (filesDir != null) {
                return this.f6192a.b(filesDir.getParentFile(), "databases");
            }
            return null;
        }

        o(B0 b0) {
            this.f6192a = b0;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$r */
    static class r implements D1.a {

        /* renamed from: a  reason: collision with root package name */
        private final ProtobufStateStorage<Ud> f6206a;

        public r(ProtobufStateStorage<Ud> protobufStateStorage) {
            this.f6206a = protobufStateStorage;
        }

        public void a(Context context) {
            Ud ud = (Ud) this.f6206a.read();
            ArrayList arrayList = new ArrayList();
            Ud.a aVar = null;
            for (Ud.a next : ud.f5098b) {
                if (next.f5101c != C0736u0.APP) {
                    arrayList.add(next);
                } else if (aVar == null) {
                    arrayList.add(next);
                    aVar = next;
                }
            }
            this.f6206a.save(new Ud(ud.f5097a, arrayList));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$s */
    static class s implements D1.a {

        /* renamed from: a  reason: collision with root package name */
        private final R7 f6207a;

        public s(R7 r7) {
            this.f6207a = r7;
        }

        public void a(Context context) {
            this.f6207a.b("notification_cache_state");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$t */
    static class t implements D1.a {

        /* renamed from: a  reason: collision with root package name */
        private final C0352e9 f6208a;

        public t(C0352e9 e9Var) {
            this.f6208a = e9Var;
        }

        public void a(Context context) {
            this.f6208a.f(new Rd("REFERRER", (String) null).a()).f(new Rd("REFERRER_HOLDER_STATE", (String) null).a()).d();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$u */
    static class u implements D1.a {
        u() {
        }

        public void a(Context context) {
            ProtobufStateStorage<C0659qi> b2 = C0378fa.b.a(C0659qi.class).b(context);
            C0659qi qiVar = (C0659qi) b2.read();
            b2.save(qiVar.a(qiVar.r).a(qiVar.u > 0).b(true).a());
        }
    }

    C0544m2(Context context, C0352e9 e9Var, C0251a8 a8Var) {
        this.f6169b = context;
        this.f6168a = e9Var;
        this.f6170c = a8Var;
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$q */
    static class q implements D1.a {

        /* renamed from: a  reason: collision with root package name */
        private final C0352e9 f6198a;

        /* renamed from: b  reason: collision with root package name */
        private final ProtobufStateStorage<C0659qi> f6199b;

        /* renamed from: c  reason: collision with root package name */
        private final C0251a8 f6200c;

        /* renamed from: d  reason: collision with root package name */
        private final String f6201d;

        /* renamed from: e  reason: collision with root package name */
        private final String f6202e;

        /* renamed from: f  reason: collision with root package name */
        private final String f6203f;

        /* renamed from: g  reason: collision with root package name */
        private final String f6204g;

        /* renamed from: h  reason: collision with root package name */
        private final String f6205h;

        public q(C0352e9 e9Var, ProtobufStateStorage<C0659qi> protobufStateStorage) {
            this(e9Var, protobufStateStorage, F0.g().w().b());
        }

        public void a(Context context) {
            Integer num;
            C0659qi qiVar = (C0659qi) this.f6199b.read();
            Nd nd = new Nd(context);
            int f2 = nd.f();
            if (f2 == -1) {
                f2 = this.f6198a.a(-1);
            }
            C0251a8 a8Var = this.f6200c;
            String str = qiVar.f6647b;
            String str2 = qiVar.f6648c;
            String a2 = this.f6198a.a(this.f6201d, (String) null);
            Boolean valueOf = this.f6198a.c(this.f6202e) ? Boolean.valueOf(this.f6198a.a(this.f6202e, false)) : null;
            Long valueOf2 = this.f6198a.c(this.f6203f) ? Long.valueOf(this.f6198a.a(this.f6203f, -1)) : null;
            Long valueOf3 = this.f6198a.c(this.f6204g) ? Long.valueOf(this.f6198a.a(this.f6204g, -1)) : null;
            Long valueOf4 = this.f6198a.c(this.f6205h) ? Long.valueOf(this.f6198a.a(this.f6205h, -1)) : null;
            if (f2 == -1) {
                num = null;
            } else {
                num = Integer.valueOf(f2);
            }
            a8Var.a(str, str2, a2, valueOf, valueOf2, valueOf3, valueOf4, num);
            this.f6198a.j().f(this.f6201d).f(this.f6202e).f(this.f6203f).f(this.f6204g).f(this.f6205h).d();
            nd.h().b();
        }

        q(C0352e9 e9Var, ProtobufStateStorage<C0659qi> protobufStateStorage, C0251a8 a8Var) {
            this.f6201d = new Rd("REFERRER_FROM_PLAY_SERVICES").a();
            this.f6202e = new Rd("REFERRER_CHECKED").a();
            this.f6203f = new Rd("L_ID").a();
            this.f6204g = new Rd("LBS_ID").a();
            this.f6205h = new Rd("L_REQ_NUM").a();
            this.f6198a = e9Var;
            this.f6199b = protobufStateStorage;
            this.f6200c = a8Var;
        }
    }

    /* access modifiers changed from: package-private */
    public SparseArray<D1.a> a() {
        return new a();
    }

    /* renamed from: com.yandex.metrica.impl.ob.m2$p */
    static class p implements D1.a {

        /* renamed from: a  reason: collision with root package name */
        private final ProtobufStateStorage<C0659qi> f6196a;

        /* renamed from: b  reason: collision with root package name */
        private final C0337dj f6197b;

        public p(Context context, ProtobufStateStorage<C0659qi> protobufStateStorage) {
            this(protobufStateStorage, C0362ej.a(context).b(context, new C0461ij(new C0635pi.b(context))));
        }

        public void a(Context context) {
            String str = this.f6197b.a().f5240a;
            if (!TextUtils.isEmpty(str)) {
                C0659qi qiVar = (C0659qi) this.f6196a.read();
                if (!str.equals(qiVar.f6646a)) {
                    this.f6196a.save(qiVar.a(qiVar.r).k(str).a());
                }
            }
        }

        public p(ProtobufStateStorage<C0659qi> protobufStateStorage, C0337dj djVar) {
            this.f6196a = protobufStateStorage;
            this.f6197b = djVar;
        }
    }

    /* access modifiers changed from: protected */
    public int a(Nd nd) {
        int f2 = nd.f();
        if (f2 == -1) {
            f2 = this.f6168a.a(-1);
        }
        return f2 == -1 ? this.f6170c.c() : f2;
    }

    /* access modifiers changed from: protected */
    public void a(Nd nd, int i2) {
        this.f6170c.a(i2);
    }
}
