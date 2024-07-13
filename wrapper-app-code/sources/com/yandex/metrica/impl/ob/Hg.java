package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.yandex.metrica.impl.ob.Eg;
import java.util.List;

public class Hg extends Eg {
    private String m;
    private String n;

    protected static abstract class a<T extends Hg, A extends Eg.a> extends Eg.b<T, A> {

        /* renamed from: c  reason: collision with root package name */
        private final C0565mn f4117c;

        protected a(Context context, String str) {
            this(context, str, new C0565mn());
        }

        public T a(Eg.c<A> cVar) {
            T a2 = a();
            a2.a(U.a());
            C0295c2 a3 = F0.g().n().a();
            a2.a(a3);
            a2.a(cVar.f3957a);
            String str = ((Eg.a) cVar.f3958b).f3952a;
            String str2 = null;
            if (str == null) {
                str = a3.a() != null ? a3.a().a() : null;
            }
            a2.c(str);
            String str3 = this.f3956b;
            String str4 = ((Eg.a) cVar.f3958b).f3953b;
            Context context = this.f3955a;
            if (TextUtils.isEmpty(str4)) {
                str4 = A2.a(context, str3);
            }
            a2.b(str4);
            String str5 = this.f3956b;
            String str6 = ((Eg.a) cVar.f3958b).f3954c;
            Context context2 = this.f3955a;
            if (TextUtils.isEmpty(str6)) {
                str6 = String.valueOf(A2.b(context2, str5));
            }
            a2.a(str6);
            a2.e(this.f3956b);
            a2.a(F0.g().r().a(this.f3955a));
            a2.a(F0.g().a().a());
            List<String> a4 = C0394g1.a(this.f3955a).a();
            if (!a4.isEmpty()) {
                str2 = a4.get(0);
            }
            a2.d(str2);
            T t = (Hg) a2;
            String packageName = this.f3955a.getPackageName();
            ApplicationInfo a5 = this.f4117c.a(this.f3955a, this.f3956b, 0);
            String str7 = "1";
            if (a5 != null) {
                t.f((a5.flags & 2) != 0 ? str7 : BuildConfig.ADAPTER_VERSION);
                if ((a5.flags & 1) == 0) {
                    str7 = BuildConfig.ADAPTER_VERSION;
                }
                t.g(str7);
            } else if (TextUtils.equals(packageName, this.f3956b)) {
                t.f((this.f3955a.getApplicationInfo().flags & 2) != 0 ? str7 : BuildConfig.ADAPTER_VERSION);
                if ((this.f3955a.getApplicationInfo().flags & 1) == 0) {
                    str7 = BuildConfig.ADAPTER_VERSION;
                }
                t.g(str7);
            } else {
                t.f(BuildConfig.ADAPTER_VERSION);
                t.g(BuildConfig.ADAPTER_VERSION);
            }
            return t;
        }

        protected a(Context context, String str, C0565mn mnVar) {
            super(context, str);
            this.f4117c = mnVar;
        }
    }

    public String A() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public void f(String str) {
        this.m = str;
    }

    /* access modifiers changed from: package-private */
    public void g(String str) {
        this.n = str;
    }

    public String toString() {
        return "CoreRequestConfig{mAppDebuggable='" + this.m + '\'' + ", mAppSystem='" + this.n + '\'' + "} " + super.toString();
    }

    public String z() {
        return this.m;
    }
}
