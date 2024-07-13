package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.coreutils.services.ActivationBarrier;
import com.yandex.metrica.impl.ob.C0286bi;
import com.yandex.metrica.impl.ob.H1;
import com.yandex.metrica.network.NetworkClient;
import com.yandex.metrica.network.Request;
import com.yandex.metrica.network.Response;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;

public class Jf {
    private static final Map<C0286bi.a, H1.d> i = Collections.unmodifiableMap(new a());
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f4329a;

    /* renamed from: b  reason: collision with root package name */
    private final ProtobufStateStorage<e> f4330b;

    /* renamed from: c  reason: collision with root package name */
    private final ICommonExecutor f4331c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C0509kh f4332d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C0690s2 f4333e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final Rl f4334f;

    /* renamed from: g  reason: collision with root package name */
    private e f4335g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f4336h = false;

    class a extends HashMap<C0286bi.a, H1.d> {
        a() {
            put(C0286bi.a.CELL, H1.d.CELL);
            put(C0286bi.a.WIFI, H1.d.WIFI);
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            Jf.a(Jf.this);
        }
    }

    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f4338a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C0635pi f4339b;

        c(List list, C0635pi piVar) {
            this.f4338a = list;
            this.f4339b = piVar;
        }

        public void run() {
            Jf.a(Jf.this, this.f4338a, this.f4339b.C());
        }
    }

    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e.a f4341a;

        d(e.a aVar) {
            this.f4341a = aVar;
        }

        public void run() {
            if (!Jf.this.f4333e.e()) {
                Jf.this.f4332d.b(this.f4341a);
                e.b bVar = new e.b(this.f4341a);
                Rl e2 = Jf.this.f4334f;
                Context d2 = Jf.this.f4329a;
                ((Ml) e2).getClass();
                H1.d a2 = H1.a(d2);
                bVar.a(a2);
                if (a2 == H1.d.OFFLINE) {
                    bVar.a(e.b.a.OFFLINE);
                } else if (!this.f4341a.f4350f.contains(a2)) {
                    bVar.a(e.b.a.INCOMPATIBLE_NETWORK_TYPE);
                } else {
                    Request.Builder withMethod = new Request.Builder(this.f4341a.f4346b).withMethod(this.f4341a.f4347c);
                    for (Map.Entry entry : this.f4341a.f4348d.a()) {
                        withMethod.addHeader((String) entry.getKey(), TextUtils.join(",", (Iterable) entry.getValue()));
                    }
                    NetworkClient.Builder builder = new NetworkClient.Builder();
                    F0.g().t().getClass();
                    NetworkClient.Builder withInstanceFollowRedirects = builder.withSslSocketFactory((SSLSocketFactory) null).withInstanceFollowRedirects(true);
                    int i = C0555md.f6218a;
                    Response execute = withInstanceFollowRedirects.withConnectTimeout(i).withReadTimeout(i).withMaxResponseSize(102400).build().newCall(withMethod.build()).execute();
                    int code = execute.getCode();
                    if (execute.isCompleted()) {
                        bVar.a(e.b.a.COMPLETE);
                    } else {
                        bVar.a(e.b.a.ERROR);
                        bVar.a(execute.getException());
                    }
                    bVar.a(Integer.valueOf(code));
                    bVar.f4355e = execute.getResponseData();
                    bVar.f4356f = execute.getErrorData();
                    bVar.a((Map<String, List<String>>) execute.getHeaders());
                }
                Jf.a(Jf.this, bVar);
            }
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        private final List<a> f4343a;

        /* renamed from: b  reason: collision with root package name */
        private final LinkedHashMap<String, Object> f4344b = new LinkedHashMap<>();

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final String f4345a;

            /* renamed from: b  reason: collision with root package name */
            public final String f4346b;

            /* renamed from: c  reason: collision with root package name */
            public final String f4347c;

            /* renamed from: d  reason: collision with root package name */
            public final C0686rm<String, String> f4348d;

            /* renamed from: e  reason: collision with root package name */
            public final long f4349e;

            /* renamed from: f  reason: collision with root package name */
            public final List<H1.d> f4350f;

            public a(String str, String str2, String str3, C0686rm<String, String> rmVar, long j, List<H1.d> list) {
                this.f4345a = str;
                this.f4346b = str2;
                this.f4347c = str3;
                this.f4349e = j;
                this.f4350f = list;
                this.f4348d = rmVar;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || a.class != obj.getClass()) {
                    return false;
                }
                return this.f4345a.equals(((a) obj).f4345a);
            }

            public int hashCode() {
                return this.f4345a.hashCode();
            }
        }

        public static class b {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public final a f4351a;

            /* renamed from: b  reason: collision with root package name */
            private a f4352b;

            /* renamed from: c  reason: collision with root package name */
            private H1.d f4353c;

            /* renamed from: d  reason: collision with root package name */
            private Integer f4354d;

            /* renamed from: e  reason: collision with root package name */
            byte[] f4355e;

            /* renamed from: f  reason: collision with root package name */
            byte[] f4356f;

            /* renamed from: g  reason: collision with root package name */
            private Map<String, List<String>> f4357g;

            /* renamed from: h  reason: collision with root package name */
            private Throwable f4358h;

            public enum a {
                OFFLINE,
                INCOMPATIBLE_NETWORK_TYPE,
                COMPLETE,
                ERROR
            }

            public b(a aVar) {
                this.f4351a = aVar;
            }

            public byte[] b() {
                return this.f4356f;
            }

            public Throwable c() {
                return this.f4358h;
            }

            public a d() {
                return this.f4351a;
            }

            public byte[] e() {
                return this.f4355e;
            }

            public Integer f() {
                return this.f4354d;
            }

            public Map<String, List<String>> g() {
                return this.f4357g;
            }

            public a h() {
                return this.f4352b;
            }

            public void a(a aVar) {
                this.f4352b = aVar;
            }

            public H1.d a() {
                return this.f4353c;
            }

            public void a(H1.d dVar) {
                this.f4353c = dVar;
            }

            public void a(Integer num) {
                this.f4354d = num;
            }

            public void a(Map<String, List<String>> map) {
                this.f4357g = map;
            }

            public void a(Throwable th) {
                this.f4358h = th;
            }
        }

        public e(List<a> list, List<String> list2) {
            this.f4343a = list;
            if (!A2.b((Collection) list2)) {
                for (String put : list2) {
                    this.f4344b.put(put, new Object());
                }
            }
        }

        public boolean a(a aVar) {
            if (this.f4344b.get(aVar.f4345a) != null || this.f4343a.contains(aVar)) {
                return false;
            }
            this.f4343a.add(aVar);
            return true;
        }

        public List<a> b() {
            return this.f4343a;
        }

        public void b(a aVar) {
            this.f4344b.put(aVar.f4345a, new Object());
            this.f4343a.remove(aVar);
        }

        public Set<String> a() {
            HashSet hashSet = new HashSet();
            int i = 0;
            for (String add : this.f4344b.keySet()) {
                hashSet.add(add);
                i++;
                if (i > 1000) {
                    break;
                }
            }
            return hashSet;
        }
    }

    public Jf(Context context, ProtobufStateStorage<e> protobufStateStorage, C0690s2 s2Var, C0509kh khVar, ICommonExecutor iCommonExecutor, Rl rl) {
        this.f4329a = context;
        this.f4330b = protobufStateStorage;
        this.f4333e = s2Var;
        this.f4332d = khVar;
        this.f4335g = (e) protobufStateStorage.read();
        this.f4331c = iCommonExecutor;
        this.f4334f = rl;
    }

    static void a(Jf jf, List list, long j) {
        Long l;
        jf.getClass();
        if (!A2.b((Collection) list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C0286bi biVar = (C0286bi) it.next();
                if (!(biVar.f5550a == null || biVar.f5551b == null || biVar.f5552c == null || (l = biVar.f5554e) == null || l.longValue() < 0 || A2.b((Collection) biVar.f5555f))) {
                    String str = biVar.f5550a;
                    String str2 = biVar.f5551b;
                    String str3 = biVar.f5552c;
                    List<Pair<String, String>> list2 = biVar.f5553d;
                    C0686rm rmVar = new C0686rm(false);
                    for (Pair next : list2) {
                        rmVar.a(next.first, next.second);
                    }
                    long millis = TimeUnit.SECONDS.toMillis(biVar.f5554e.longValue() + j);
                    List<C0286bi.a> list3 = biVar.f5555f;
                    ArrayList arrayList = new ArrayList(list3.size());
                    for (C0286bi.a aVar : list3) {
                        arrayList.add(i.get(aVar));
                    }
                    jf.a(new e.a(str, str2, str3, rmVar, millis, arrayList));
                }
            }
        }
    }

    private void b(e.a aVar) {
        this.f4331c.executeDelayed(new d(aVar), Math.max(ActivationBarrier.ACTIVATION_DELAY, Math.max(aVar.f4349e - System.currentTimeMillis(), 0)));
    }

    public synchronized void a() {
        this.f4331c.execute(new b());
    }

    static void a(Jf jf) {
        if (!jf.f4336h) {
            e eVar = (e) jf.f4330b.read();
            jf.f4335g = eVar;
            for (e.a b2 : eVar.b()) {
                jf.b(b2);
            }
            jf.f4336h = true;
        }
    }

    public synchronized void a(C0635pi piVar) {
        this.f4331c.execute(new c(piVar.I(), piVar));
    }

    private boolean a(e.a aVar) {
        boolean a2 = this.f4335g.a(aVar);
        if (a2) {
            b(aVar);
            this.f4332d.a(aVar);
        }
        this.f4330b.save(this.f4335g);
        return a2;
    }

    static void a(Jf jf, e.b bVar) {
        synchronized (jf) {
            jf.f4335g.b(bVar.f4351a);
            jf.f4330b.save(jf.f4335g);
            jf.f4332d.a(bVar);
        }
    }
}
