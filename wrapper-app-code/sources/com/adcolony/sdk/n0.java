package com.adcolony.sdk;

import com.appnext.ads.fullscreen.RewardedVideo;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

class n0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f10179a;

    /* renamed from: b  reason: collision with root package name */
    private final List<a> f10180b = new ArrayList();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f10181a;

        /* renamed from: b  reason: collision with root package name */
        private final String f10182b;

        /* renamed from: c  reason: collision with root package name */
        private final int f10183c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final String[] f10184d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public final String[] f10185e;

        /* renamed from: f  reason: collision with root package name */
        private final List<b> f10186f = new ArrayList();

        /* renamed from: g  reason: collision with root package name */
        private final List<c> f10187g = new ArrayList();

        /* renamed from: h  reason: collision with root package name */
        private final d f10188h;
        private final Map<String, String> i;

        a(f1 f1Var) throws JSONException {
            this.f10181a = f1Var.e("stream");
            this.f10182b = f1Var.e("table_name");
            this.f10183c = f1Var.a("max_rows", 10000);
            e1 l = f1Var.l("event_types");
            this.f10184d = l != null ? c0.a(l) : new String[0];
            e1 l2 = f1Var.l("request_types");
            this.f10185e = l2 != null ? c0.a(l2) : new String[0];
            for (f1 bVar : c0.b(f1Var.c("columns"))) {
                this.f10186f.add(new b(bVar));
            }
            for (f1 cVar : c0.b(f1Var.c("indexes"))) {
                this.f10187g.add(new c(cVar, this.f10182b));
            }
            f1 n = f1Var.n("ttl");
            this.f10188h = n != null ? new d(n) : null;
            this.i = f1Var.m("queries").f();
        }

        /* access modifiers changed from: package-private */
        public int c() {
            return this.f10183c;
        }

        /* access modifiers changed from: package-private */
        public String d() {
            return this.f10181a;
        }

        /* access modifiers changed from: package-private */
        public Map<String, String> e() {
            return this.i;
        }

        /* access modifiers changed from: package-private */
        public String f() {
            return this.f10182b;
        }

        /* access modifiers changed from: package-private */
        public d g() {
            return this.f10188h;
        }

        /* access modifiers changed from: package-private */
        public List<b> a() {
            return this.f10186f;
        }

        /* access modifiers changed from: package-private */
        public List<c> b() {
            return this.f10187g;
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f10189a;

        /* renamed from: b  reason: collision with root package name */
        private final String f10190b;

        /* renamed from: c  reason: collision with root package name */
        private final Object f10191c;

        b(f1 f1Var) throws JSONException {
            this.f10189a = f1Var.e("name");
            this.f10190b = f1Var.e("type");
            this.f10191c = f1Var.o(RewardedVideo.VIDEO_MODE_DEFAULT);
        }

        /* access modifiers changed from: package-private */
        public Object a() {
            return this.f10191c;
        }

        /* access modifiers changed from: package-private */
        public String b() {
            return this.f10189a;
        }

        /* access modifiers changed from: package-private */
        public String c() {
            return this.f10190b;
        }
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        private final String f10192a;

        /* renamed from: b  reason: collision with root package name */
        private final String[] f10193b;

        c(f1 f1Var, String str) throws JSONException {
            this.f10192a = str + "_" + f1Var.e("name");
            this.f10193b = c0.a(f1Var.c("columns"));
        }

        /* access modifiers changed from: package-private */
        public String[] a() {
            return this.f10193b;
        }

        /* access modifiers changed from: package-private */
        public String b() {
            return this.f10192a;
        }
    }

    static class d {

        /* renamed from: a  reason: collision with root package name */
        private final long f10194a;

        /* renamed from: b  reason: collision with root package name */
        private final String f10195b;

        d(f1 f1Var) throws JSONException {
            this.f10194a = f1Var.d("seconds");
            this.f10195b = f1Var.e("column");
        }

        /* access modifiers changed from: package-private */
        public String a() {
            return this.f10195b;
        }

        /* access modifiers changed from: package-private */
        public long b() {
            return this.f10194a;
        }
    }

    n0(f1 f1Var) throws JSONException {
        this.f10179a = f1Var.b(MediationMetaData.KEY_VERSION);
        for (f1 aVar : c0.b(f1Var.c("streams"))) {
            this.f10180b.add(new a(aVar));
        }
    }

    static n0 a(f1 f1Var) {
        try {
            return new n0(f1Var);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f10179a;
    }

    /* access modifiers changed from: package-private */
    public List<a> a() {
        return this.f10180b;
    }

    /* access modifiers changed from: package-private */
    public a a(String str) {
        if (str.isEmpty()) {
            return null;
        }
        for (a next : this.f10180b) {
            int i = 0;
            for (String equals : next.f10184d) {
                if (str.equals(equals)) {
                    return next;
                }
            }
            String[] b2 = next.f10185e;
            int length = b2.length;
            while (true) {
                if (i < length) {
                    if (str.equals(b2[i])) {
                        return next;
                    }
                    i++;
                }
            }
        }
        return null;
    }
}
