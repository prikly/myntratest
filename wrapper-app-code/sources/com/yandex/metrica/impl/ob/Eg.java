package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import com.yandex.metrica.networktasks.api.RetryPolicyConfig;

public class Eg {

    /* renamed from: a  reason: collision with root package name */
    private String f3944a;

    /* renamed from: b  reason: collision with root package name */
    private U f3945b;

    /* renamed from: c  reason: collision with root package name */
    private C0295c2 f3946c;

    /* renamed from: d  reason: collision with root package name */
    private final String f3947d = y();

    /* renamed from: e  reason: collision with root package name */
    private String f3948e = C0420h2.a();

    /* renamed from: f  reason: collision with root package name */
    private String f3949f;

    /* renamed from: g  reason: collision with root package name */
    private String f3950g;

    /* renamed from: h  reason: collision with root package name */
    private Ab f3951h;
    private C0867zb i;
    private String j;
    private String k;
    private C0635pi l;

    public static abstract class a<I, O> implements Dg<I, O> {

        /* renamed from: a  reason: collision with root package name */
        public final String f3952a;

        /* renamed from: b  reason: collision with root package name */
        public final String f3953b;

        /* renamed from: c  reason: collision with root package name */
        public final String f3954c;

        public a(String str, String str2, String str3) {
            this.f3952a = str;
            this.f3953b = str2;
            this.f3954c = str3;
        }
    }

    protected static abstract class b<T extends Eg, A extends a> implements d<T, c<A>> {

        /* renamed from: a  reason: collision with root package name */
        final Context f3955a;

        /* renamed from: b  reason: collision with root package name */
        final String f3956b;

        protected b(Context context, String str) {
            this.f3955a = context;
            this.f3956b = str;
        }

        /* access modifiers changed from: protected */
        public abstract T a();
    }

    public static class c<A> {

        /* renamed from: a  reason: collision with root package name */
        public final C0635pi f3957a;

        /* renamed from: b  reason: collision with root package name */
        public final A f3958b;

        public c(C0635pi piVar, A a2) {
            this.f3957a = piVar;
            this.f3958b = a2;
        }
    }

    public interface d<T extends Eg, D> {
        T a(D d2);
    }

    private static String y() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty("public")) {
            sb.append("public");
        }
        if (!TextUtils.isEmpty("binary")) {
            sb.append("_binary");
        }
        if (!TextUtils.isEmpty("")) {
            sb.append("_");
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public void a(U u) {
        this.f3945b = u;
    }

    public String b() {
        String str = this.f3950g;
        return str == null ? "" : str;
    }

    public String c() {
        return this.f3948e;
    }

    public synchronized String d() {
        String a2;
        Ab ab = this.f3951h;
        a2 = ab == null ? null : ab.a();
        if (a2 == null) {
            a2 = "";
        }
        return a2;
    }

    /* access modifiers changed from: protected */
    public void e(String str) {
        this.f3944a = str;
    }

    public String f() {
        String str = this.f3949f;
        return str == null ? "" : str;
    }

    public synchronized String g() {
        String i2;
        i2 = this.l.i();
        if (i2 == null) {
            i2 = "";
        }
        return i2;
    }

    public String h() {
        return this.f3945b.f5056e;
    }

    public String i() {
        String str = this.j;
        return str == null ? com.yandex.metrica.b.PHONE.a() : str;
    }

    public String j() {
        return this.f3947d;
    }

    public String k() {
        String str = this.k;
        return str == null ? "" : str;
    }

    public String l() {
        String str = this.f3945b.f5052a;
        return str == null ? "" : str;
    }

    public String m() {
        return this.f3945b.f5053b;
    }

    public int n() {
        return this.f3945b.f5055d;
    }

    public String o() {
        return this.f3945b.f5054c;
    }

    public String p() {
        return this.f3944a;
    }

    public RetryPolicyConfig q() {
        return this.l.J();
    }

    public float r() {
        return this.f3946c.d();
    }

    public int s() {
        return this.f3946c.b();
    }

    public int t() {
        return this.f3946c.c();
    }

    public String toString() {
        return "BaseRequestConfig{mPackageName='" + this.f3944a + '\'' + ", mConstantDeviceInfo=" + this.f3945b + ", screenInfo=" + this.f3946c + ", mSdkVersionName='" + "5.3.0" + '\'' + ", mSdkBuildNumber='" + "45003240" + '\'' + ", mSdkBuildType='" + this.f3947d + '\'' + ", mAppPlatform='" + MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID + '\'' + ", mProtocolVersion='" + "2" + '\'' + ", mAppFramework='" + this.f3948e + '\'' + ", mCommitHash='" + "a72bf6f57701ed3c2b8ed570054febbff4e58c12" + '\'' + ", mAppVersion='" + this.f3949f + '\'' + ", mAppBuildNumber='" + this.f3950g + '\'' + ", appSetId=" + this.f3951h + ", mAdvertisingIdsHolder=" + this.i + ", mDeviceType='" + this.j + '\'' + ", mLocale='" + this.k + '\'' + ", mStartupState=" + this.l + '}';
    }

    public int u() {
        return this.f3946c.e();
    }

    /* access modifiers changed from: protected */
    public C0635pi v() {
        return this.l;
    }

    public synchronized String w() {
        String V;
        V = this.l.V();
        if (V == null) {
            V = "";
        }
        return V;
    }

    public synchronized boolean x() {
        return C0585ni.a(this.l);
    }

    /* access modifiers changed from: protected */
    public void a(C0295c2 c2Var) {
        this.f3946c = c2Var;
    }

    /* access modifiers changed from: protected */
    public void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f3949f = str;
        }
    }

    /* access modifiers changed from: package-private */
    public void c(String str) {
        this.j = str;
    }

    /* access modifiers changed from: package-private */
    public final void d(String str) {
        this.k = str;
    }

    public synchronized String e() {
        String a2;
        Ab ab = this.f3951h;
        a2 = ab == null ? null : ab.b().a();
        if (a2 == null) {
            a2 = "";
        }
        return a2;
    }

    /* access modifiers changed from: protected */
    public void a(C0635pi piVar) {
        this.l = piVar;
    }

    /* access modifiers changed from: protected */
    public void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f3950g = str;
        }
    }

    public synchronized void a(Ab ab) {
        this.f3951h = ab;
    }

    public C0867zb a() {
        return this.i;
    }

    /* access modifiers changed from: protected */
    public void a(C0867zb zbVar) {
        this.i = zbVar;
    }
}
