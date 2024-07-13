package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.impl.ob.Jf;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.fa  reason: case insensitive filesystem */
public interface C0378fa<T> {

    /* renamed from: com.yandex.metrica.impl.ob.fa$b */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final HashMap<Class<?>, C0378fa<?>> f5803a;

        /* renamed from: b  reason: collision with root package name */
        private final C0378fa<C0659qi> f5804b;

        /* renamed from: c  reason: collision with root package name */
        private final C0378fa<Jf.e> f5805c;

        /* renamed from: d  reason: collision with root package name */
        private final C0378fa<List<Bd>> f5806d;

        /* renamed from: e  reason: collision with root package name */
        private final C0378fa<C0725td> f5807e;

        /* renamed from: f  reason: collision with root package name */
        private final C0378fa<C0360eh> f5808f;
        @Deprecated

        /* renamed from: g  reason: collision with root package name */
        private final C0378fa<C0357ee> f5809g;
        @Deprecated

        /* renamed from: h  reason: collision with root package name */
        private final C0378fa<Z1> f5810h;
        private final C0378fa<Ud> i;
        private final C0378fa<X2> j;
        private final C0378fa<C0763v3> k;

        /* renamed from: com.yandex.metrica.impl.ob.fa$b$a */
        class a extends C0403ga<C0763v3> {
            a(b bVar) {
            }

            /* access modifiers changed from: protected */
            public ProtobufStateStorage<C0763v3> a(Context context, R7 r7) {
                return new C0526l9("clids_info", r7, new C0353ea(new C0782vm(context)).c(), new C0817x9());
            }

            /* access modifiers changed from: protected */
            public R7 c(Context context) {
                return C0477ja.a(context).n();
            }

            /* access modifiers changed from: protected */
            public R7 d(Context context) {
                return C0477ja.a(context).o();
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.fa$b$b  reason: collision with other inner class name */
        class C0051b extends C0403ga<C0659qi> {
            C0051b(b bVar) {
            }

            /* access modifiers changed from: protected */
            public ProtobufStateStorage<C0659qi> a(Context context, R7 r7) {
                return new C0526l9("startup_state", r7, new C0353ea(new C0782vm(context)).i(), new X9());
            }

            /* access modifiers changed from: protected */
            public R7 c(Context context) {
                return C0477ja.a(context).n();
            }

            /* access modifiers changed from: protected */
            public R7 d(Context context) {
                return C0477ja.a(context).o();
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.fa$b$c */
        class c extends C0403ga<Jf.e> {
            c(b bVar) {
            }

            /* access modifiers changed from: protected */
            public ProtobufStateStorage<Jf.e> a(Context context, R7 r7) {
                return new C0526l9("provided_request_state", r7, new C0353ea(new C0782vm(context)).g(), new R9());
            }

            /* access modifiers changed from: protected */
            public R7 c(Context context) {
                return C0477ja.a(context).n();
            }

            /* access modifiers changed from: protected */
            public R7 d(Context context) {
                return C0477ja.a(context).o();
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.fa$b$d */
        class d extends C0403ga<List<Bd>> {
            d(b bVar) {
            }

            /* access modifiers changed from: protected */
            public ProtobufStateStorage<List<Bd>> a(Context context, R7 r7) {
                return new C0526l9("permission_list", r7, new C0353ea(new C0782vm(context)).d(), new P9());
            }

            /* access modifiers changed from: protected */
            public R7 c(Context context) {
                return C0477ja.a(context).n();
            }

            /* access modifiers changed from: protected */
            public R7 d(Context context) {
                return C0477ja.a(context).o();
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.fa$b$e */
        class e extends C0403ga<C0725td> {
            e(b bVar) {
            }

            /* access modifiers changed from: protected */
            public ProtobufStateStorage<C0725td> a(Context context, R7 r7) {
                return new C0526l9("app_permissions_state", r7, new C0353ea(new C0782vm(context)).a(), new C0673r9());
            }

            /* access modifiers changed from: protected */
            public R7 c(Context context) {
                return C0477ja.a(context).n();
            }

            /* access modifiers changed from: protected */
            public R7 d(Context context) {
                return C0477ja.a(context).o();
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.fa$b$f */
        class f extends C0403ga<C0360eh> {
            f(b bVar) {
            }

            /* access modifiers changed from: protected */
            public ProtobufStateStorage<C0360eh> a(Context context, R7 r7) {
                return new C0526l9("sdk_fingerprinting", r7, new C0353ea(new C0782vm(context)).h(), new V9());
            }

            /* access modifiers changed from: protected */
            public R7 c(Context context) {
                return C0477ja.a(context).n();
            }

            /* access modifiers changed from: protected */
            public R7 d(Context context) {
                return C0477ja.a(context).o();
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.fa$b$g */
        class g extends C0403ga<C0357ee> {
            g(b bVar) {
            }

            /* access modifiers changed from: protected */
            public ProtobufStateStorage<C0357ee> a(Context context, R7 r7) {
                return new C0526l9("preload_info", r7, new C0353ea(new C0782vm(context)).f(), new C0382fe());
            }

            /* access modifiers changed from: protected */
            public R7 c(Context context) {
                return C0477ja.a(context).n();
            }

            /* access modifiers changed from: protected */
            public R7 d(Context context) {
                return C0477ja.a(context).o();
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.fa$b$h */
        class h extends C0403ga<Z1> {
            h(b bVar) {
            }

            /* access modifiers changed from: protected */
            public ProtobufStateStorage<Z1> a(Context context, R7 r7) {
                return new C0526l9("satellite_clids_info", r7, new C0576n9(), new T9());
            }

            /* access modifiers changed from: protected */
            public R7 c(Context context) {
                return C0477ja.a(context).n();
            }

            /* access modifiers changed from: protected */
            public R7 d(Context context) {
                return C0477ja.a(context).o();
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.fa$b$i */
        class i extends C0403ga<Ud> {
            i(b bVar) {
            }

            /* access modifiers changed from: protected */
            public ProtobufStateStorage<Ud> a(Context context, R7 r7) {
                return new C0526l9("preload_info_data", r7, new C0353ea(new C0782vm(context)).e(), new Wd());
            }

            /* access modifiers changed from: protected */
            public R7 c(Context context) {
                return C0477ja.a(context).n();
            }

            /* access modifiers changed from: protected */
            public R7 d(Context context) {
                return C0477ja.a(context).o();
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.fa$b$j */
        class j extends C0403ga<X2> {
            j(b bVar) {
            }

            /* access modifiers changed from: protected */
            public ProtobufStateStorage<X2> a(Context context, R7 r7) {
                return new C0526l9("auto_inapp_collecting_info_data", r7, new C0353ea(new C0782vm(context)).b(), new Y2());
            }

            /* access modifiers changed from: protected */
            public R7 c(Context context) {
                return C0477ja.a(context).a();
            }

            /* access modifiers changed from: protected */
            public R7 d(Context context) {
                return C0477ja.a(context).b();
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.fa$b$k */
        private static final class k {

            /* renamed from: a  reason: collision with root package name */
            static final b f5811a = new b();
        }

        public static <T> C0378fa<T> a(Class<T> cls) {
            return k.f5811a.f5803a.get(cls);
        }

        public static <T> C0378fa<Collection<T>> b(Class<T> cls) {
            return k.f5811a.f5803a.get(cls);
        }

        private b() {
            HashMap<Class<?>, C0378fa<?>> hashMap = new HashMap<>();
            this.f5803a = hashMap;
            C0051b bVar = new C0051b(this);
            this.f5804b = bVar;
            c cVar = new c(this);
            this.f5805c = cVar;
            d dVar = new d(this);
            this.f5806d = dVar;
            e eVar = new e(this);
            this.f5807e = eVar;
            f fVar = new f(this);
            this.f5808f = fVar;
            g gVar = new g(this);
            this.f5809g = gVar;
            h hVar = new h(this);
            this.f5810h = hVar;
            i iVar = new i(this);
            this.i = iVar;
            j jVar = new j(this);
            this.j = jVar;
            a aVar = new a(this);
            this.k = aVar;
            hashMap.put(C0659qi.class, bVar);
            hashMap.put(Jf.e.class, cVar);
            hashMap.put(Bd.class, dVar);
            hashMap.put(C0725td.class, eVar);
            hashMap.put(C0360eh.class, fVar);
            hashMap.put(C0357ee.class, gVar);
            hashMap.put(Z1.class, hVar);
            hashMap.put(Ud.class, iVar);
            hashMap.put(X2.class, jVar);
            hashMap.put(C0763v3.class, aVar);
        }
    }

    ProtobufStateStorage<T> a(Context context);

    ProtobufStateStorage<T> b(Context context);
}
