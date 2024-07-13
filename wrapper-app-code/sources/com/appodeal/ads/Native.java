package com.appodeal.ads;

import android.content.Context;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.segments.g;
import com.appodeal.ads.segments.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

public final class Native {

    /* renamed from: a  reason: collision with root package name */
    public static int f16125a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static NativeAdType f16126b = NativeAdType.Auto;

    /* renamed from: c  reason: collision with root package name */
    public static MediaAssetType f16127c = MediaAssetType.ALL;

    /* renamed from: d  reason: collision with root package name */
    public static String f16128d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f16129e = false;

    /* renamed from: f  reason: collision with root package name */
    public static n2 f16130f;

    /* renamed from: g  reason: collision with root package name */
    public static b f16131g;

    /* renamed from: h  reason: collision with root package name */
    public static a f16132h;

    public enum MediaAssetType {
        ICON,
        IMAGE,
        ALL
    }

    public enum NativeAdType {
        Auto("auto"),
        NoVideo("static"),
        Video("video");
        
        public final String name;

        private NativeAdType(String str) {
            this.name = str;
        }
    }

    public static class b extends b0<s2, t2, l2> {
        public b() {
            super(Native.c());
        }

        public final /* bridge */ /* synthetic */ boolean a(r rVar, l lVar) {
            t2 t2Var = (t2) rVar;
            s2 s2Var = (s2) lVar;
            return false;
        }

        public final boolean a(r rVar, l lVar, l2 l2Var) {
            s2 s2Var = (s2) lVar;
            return ((t2) rVar).L.contains(Integer.valueOf(l2Var.a()));
        }

        public final boolean b(r rVar, l lVar, l2 l2Var) {
            s2 s2Var = (s2) lVar;
            return ((t2) rVar).M.contains(Integer.valueOf(l2Var.a()));
        }

        public final /* bridge */ /* synthetic */ boolean b(r rVar, l lVar, boolean z) {
            t2 t2Var = (t2) rVar;
            s2 s2Var = (s2) lVar;
            return true;
        }

        public final boolean c(r rVar, l lVar, l2 l2Var) {
            s2 s2Var = (s2) lVar;
            return ((t2) rVar).K.contains(Integer.valueOf(l2Var.a()));
        }

        public final g e(r rVar, l lVar, l2 l2Var) {
            t2 t2Var = (t2) rVar;
            s2 s2Var = (s2) lVar;
            g gVar = l2Var.u;
            return gVar == null ? h.a(RewardedVideo.VIDEO_MODE_DEFAULT) : gVar;
        }

        public final void f(r rVar, l lVar, l2 l2Var) {
            t2 t2Var = (t2) rVar;
            s2 s2Var = (s2) lVar;
            if (t2Var != null && l2Var != null) {
                t2Var.L.add(Integer.valueOf(l2Var.a()));
            }
        }

        public final void g(r rVar, l lVar, l2 l2Var) {
            t2 t2Var = (t2) rVar;
            s2 s2Var = (s2) lVar;
            if (t2Var != null && l2Var != null) {
                t2Var.M.add(Integer.valueOf(l2Var.a()));
            }
        }

        public final void h(r rVar, l lVar) {
            t2 t2Var = (t2) rVar;
            s2 s2Var = (s2) lVar;
            if (s2Var != null) {
                Native.c().f16836d.removeAll(s2Var.o());
            }
            if (this.f16300a.k()) {
                Native.c().c();
            }
        }

        public final boolean k(r rVar, l lVar, l2 l2Var) {
            s2 s2Var = (s2) lVar;
            return !((t2) rVar).M.contains(Integer.valueOf(l2Var.a())) && this.f16300a.q > 0;
        }

        public final void l(r rVar, l lVar) {
            t2 t2Var = (t2) rVar;
            s2 s2Var = (s2) lVar;
            t2Var.t = s2Var.f16570c.getEcpm();
            ArrayList arrayList = s2Var.s;
            t2Var.J = arrayList != null ? arrayList.size() : 0;
        }

        public final boolean p(r rVar, l lVar) {
            t2 t2Var = (t2) rVar;
            s2 s2Var = (s2) lVar;
            if (!s2Var.f16570c.isPrecache()) {
                this.f16300a.getClass();
                return u.b((r) t2Var, (l) s2Var);
            }
        }

        public final void a(r rVar) {
            HashSet hashSet = new HashSet();
            for (r rVar2 = (t2) rVar; rVar2 != null; rVar2 = rVar2.H) {
                hashSet.addAll(rVar2.f17082f);
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((s2) it.next()).j();
            }
        }

        public final boolean b(r rVar, l lVar) {
            s2 s2Var = (s2) lVar;
            return ((t2) rVar).u;
        }

        public final void h(r rVar, l lVar, l2 l2Var) {
            t2 t2Var = (t2) rVar;
            s2 s2Var = (s2) lVar;
            if (t2Var != null && l2Var != null) {
                t2Var.K.add(Integer.valueOf(l2Var.a()));
            }
        }

        public final boolean l(r rVar, l lVar, l2 l2Var) {
            s2 s2Var = (s2) lVar;
            return !((t2) rVar).K.contains(Integer.valueOf(l2Var.a()));
        }
    }

    public static class c extends s<c> {
        public c() {
            super("native", Constants.DEBUG_NATIVE);
        }
    }

    public static a a() {
        a aVar = f16132h;
        if (aVar == null) {
            synchronized (u.class) {
                aVar = f16132h;
                if (aVar == null) {
                    aVar = new a(b());
                    f16132h = aVar;
                }
            }
        }
        return aVar;
    }

    public static b b() {
        if (f16131g == null) {
            f16131g = new b();
        }
        return f16131g;
    }

    public static n2 c() {
        if (f16130f == null) {
            f16130f = new n2();
        }
        return f16130f;
    }

    public static class a extends u<s2, t2, c> {
        public a(b bVar) {
            super(bVar, AdType.Native, (g) null);
        }

        public final void a(JSONObject jSONObject) {
            if (jSONObject.has("video_native_autostart")) {
                Native.f16129e = jSONObject.optBoolean("video_native_autostart", false);
            }
            if (jSONObject.has("diu")) {
                Native.f16128d = jSONObject.optString("diu");
            }
        }

        public final boolean a(r rVar) {
            if (!(!((t2) rVar).f17078b.isEmpty()) || Native.c().b()) {
                return false;
            }
            return true;
        }

        public final /* bridge */ /* synthetic */ boolean a(r rVar, l lVar) {
            t2 t2Var = (t2) rVar;
            s2 s2Var = (s2) lVar;
            return true;
        }

        public final void b() {
            int i = 0;
            while (i < this.f17436g.size() - 3) {
                t2 t2Var = (t2) ((this.f17436g.size() <= i || i == -1) ? null : (r) this.f17436g.get(i));
                if (t2Var != null && !t2Var.E) {
                    t2Var.c();
                }
                i++;
            }
        }

        public final void b(Context context) {
            b(context, new c());
        }

        public final String i() {
            return "native_disabled";
        }

        public final void s() {
            Native.c().c();
        }

        public final l a(r rVar, AdNetwork adNetwork, d0 d0Var) {
            return new s2((t2) rVar, adNetwork, d0Var);
        }

        public final r a(s sVar) {
            return new t2((c) sVar);
        }

        public final int a(r rVar, l lVar, boolean z) {
            t2 t2Var = (t2) rVar;
            s2 s2Var = (s2) lVar;
            if (z) {
                return 1;
            }
            return Native.f16125a;
        }
    }
}
