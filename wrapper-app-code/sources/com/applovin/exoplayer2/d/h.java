package com.applovin.exoplayer2.d;

import android.os.Looper;
import com.applovin.exoplayer2.d.f;
import com.applovin.exoplayer2.d.g;
import com.applovin.exoplayer2.v;
import com.facebook.ads.AdError;

public interface h {

    /* renamed from: b  reason: collision with root package name */
    public static final h f11769b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public static final h f11770c;

    /* renamed from: com.applovin.exoplayer2.d.h$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static a $default$a(h hVar, Looper looper, g.a aVar, v vVar) {
            return a.f11771b;
        }

        public static void $default$a(h hVar) {
        }

        public static void $default$b(h hVar) {
        }
    }

    public interface a {

        /* renamed from: b  reason: collision with root package name */
        public static final a f11771b = $$Lambda$h$a$WekmMZBCOPnaK1rR9s28oPGmUM.INSTANCE;

        /* renamed from: com.applovin.exoplayer2.d.h$a$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            public static /* synthetic */ void a() {
            }
        }

        void release();
    }

    static {
        AnonymousClass1 r0 = new h() {
            public int a(v vVar) {
                return vVar.o != null ? 1 : 0;
            }

            public /* synthetic */ a a(Looper looper, g.a aVar, v vVar) {
                return CC.$default$a(this, looper, aVar, vVar);
            }

            public /* synthetic */ void a() {
                CC.$default$a(this);
            }

            public f b(Looper looper, g.a aVar, v vVar) {
                if (vVar.o == null) {
                    return null;
                }
                return new l(new f.a(new t(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
            }

            public /* synthetic */ void b() {
                CC.$default$b(this);
            }
        };
        f11769b = r0;
        f11770c = r0;
    }

    int a(v vVar);

    a a(Looper looper, g.a aVar, v vVar);

    void a();

    f b(Looper looper, g.a aVar, v vVar);

    void b();
}
