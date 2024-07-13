package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.D3;
import com.yandex.metrica.impl.ob.Eg;
import com.yandex.metrica.impl.ob.Hg;
import java.util.List;

public class D4 extends Hg {
    private List<String> o;
    private String p;
    private Boolean q;

    public String B() {
        return this.p;
    }

    public List<String> C() {
        return this.o;
    }

    public Boolean D() {
        return this.q;
    }

    public void a(List<String> list) {
        this.o = list;
    }

    public void h(String str) {
        this.p = str;
    }

    public String toString() {
        return "DiagnosticRequestConfig{mDiagnosticHosts=" + this.o + ", mApiKey='" + this.p + '\'' + ", statisticsSending=" + this.q + "} " + super.toString();
    }

    public void a(Boolean bool) {
        this.q = bool;
    }

    public static final class a extends Eg.a<D3.a, a> {

        /* renamed from: d  reason: collision with root package name */
        public final String f3858d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f3859e;

        public a(String str, String str2, String str3, String str4, Boolean bool) {
            super(str, str2, str3);
            this.f3858d = str4;
            this.f3859e = ((Boolean) Tl.a(bool, Boolean.TRUE)).booleanValue();
        }

        public Object a(Object obj) {
            D3.a aVar = (D3.a) obj;
            String str = aVar.f3850a;
            String str2 = this.f3952a;
            if (str != null) {
                str2 = str;
            }
            String str3 = aVar.f3851b;
            String str4 = this.f3953b;
            if (str3 != null) {
                str4 = str3;
            }
            String str5 = aVar.f3852c;
            String str6 = this.f3954c;
            if (str5 != null) {
                str6 = str5;
            }
            String str7 = aVar.f3853d;
            String str8 = this.f3858d;
            if (str7 != null) {
                str8 = str7;
            }
            Boolean bool = aVar.l;
            return new a(str2, str4, str6, str8, bool == null ? Boolean.valueOf(this.f3859e) : bool);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
            r3 = r3.f3853d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r0 = r3.f3851b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
            r0 = r3.f3852c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean b(java.lang.Object r3) {
            /*
                r2 = this;
                com.yandex.metrica.impl.ob.D3$a r3 = (com.yandex.metrica.impl.ob.D3.a) r3
                java.lang.String r0 = r3.f3850a
                if (r0 == 0) goto L_0x000f
                java.lang.String r1 = r2.f3952a
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x000f
                goto L_0x0036
            L_0x000f:
                java.lang.String r0 = r3.f3851b
                if (r0 == 0) goto L_0x001c
                java.lang.String r1 = r2.f3953b
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x001c
                goto L_0x0036
            L_0x001c:
                java.lang.String r0 = r3.f3852c
                if (r0 == 0) goto L_0x0029
                java.lang.String r1 = r2.f3954c
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0029
                goto L_0x0036
            L_0x0029:
                java.lang.String r3 = r3.f3853d
                if (r3 == 0) goto L_0x0038
                java.lang.String r0 = r2.f3858d
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x0036
                goto L_0x0038
            L_0x0036:
                r3 = 0
                goto L_0x0039
            L_0x0038:
                r3 = 1
            L_0x0039:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.D4.a.b(java.lang.Object):boolean");
        }

        public a(D3.a aVar) {
            this(aVar.f3850a, aVar.f3851b, aVar.f3852c, aVar.f3853d, aVar.l);
        }
    }

    public static class b extends Hg.a<D4, a> {
        public b(Context context, String str) {
            super(context, str);
        }

        public Eg a(Object obj) {
            Eg.c cVar = (Eg.c) obj;
            D4 d4 = (D4) a(cVar);
            d4.a(cVar.f3957a.k());
            d4.h(((a) cVar.f3958b).f3858d);
            d4.a(Boolean.valueOf(((a) cVar.f3958b).f3859e));
            return d4;
        }

        /* access modifiers changed from: protected */
        public Eg a() {
            return new D4();
        }
    }
}
