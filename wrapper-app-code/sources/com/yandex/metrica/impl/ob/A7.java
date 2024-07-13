package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.ac.CrashpadHelper;
import java.util.Objects;
import org.json.JSONObject;

public class A7 implements C0499k7 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3687a;

    /* renamed from: b  reason: collision with root package name */
    private final A3 f3688b;

    /* renamed from: c  reason: collision with root package name */
    private C0839y7 f3689c;

    /* renamed from: d  reason: collision with root package name */
    private final C0564mm<Bundle> f3690d;

    /* renamed from: e  reason: collision with root package name */
    private final E7 f3691e;

    /* renamed from: f  reason: collision with root package name */
    private final I7 f3692f;

    /* renamed from: g  reason: collision with root package name */
    private final C0589nm<Void, String> f3693g;

    class a implements C0564mm<Bundle> {
        a() {
        }

        public void b(Object obj) {
            CrashpadHelper.setUpNativeUncaughtExceptionHandler((Bundle) obj);
        }
    }

    class b implements C0589nm<Void, String> {
        b() {
        }

        public Object a(Object obj) {
            Void voidR = (Void) obj;
            return CrashpadHelper.getLibraryVersion();
        }
    }

    public A7(Context context, A3 a3) {
        this(context, a3, new B0(), new a());
    }

    public String a() {
        return "appmetrica_native_crashes";
    }

    public void a(String str, String str2, String str3) {
        C7 b2 = this.f3689c.b();
        if (b2 == null) {
            return;
        }
        if (!TextUtils.isEmpty(b2.f3809a) || b2.f3812d != null) {
            this.f3692f.a(str3);
            String str4 = null;
            this.f3692f.b(this.f3693g.a(null));
            C0564mm<Bundle> mmVar = this.f3690d;
            String a2 = this.f3692f.a();
            Bundle bundle = new Bundle();
            E7 e7 = this.f3691e;
            A3 a3 = this.f3688b;
            e7.getClass();
            try {
                str4 = Base64.encodeToString(new JSONObject().put("arg_cd", new JSONObject().put("arg_ak", str).put("arg_pn", a3.f()).put("arg_pd", a3.g()).put("arg_ps", a3.h()).put("arg_rt", CounterConfiguration.b.MAIN.a())).toString().getBytes(), 0);
            } catch (Throwable unused) {
            }
            bundle.putString("arg_cd", str4);
            bundle.putString("arg_rc", a2);
            bundle.putString("arg_dd", str2);
            bundle.putString("arg_hp", b2.f3809a);
            bundle.putBoolean("arg_i64", b2.f3810b);
            bundle.putBoolean("arg_ul", b2.f3811c);
            Context context = this.f3687a;
            bundle.putString("arg_sn", context.getPackageName() + "-crashpad_new_crash_socket");
            if (b2.f3812d == null) {
                bundle.putBoolean("arg_ap", false);
            } else {
                bundle.putBoolean("arg_ap", true);
                Objects.requireNonNull(b2.f3812d);
                bundle.putString("arg_mc", "com.yandex.metrica.impl.ac.HandlerRunner");
                bundle.putString("arg_akp", b2.f3812d.f6436a);
                bundle.putString("arg_lp", b2.f3812d.f6437b);
                bundle.putString("arg_dp", b2.f3812d.f6438c);
            }
            mmVar.b(bundle);
        }
    }

    public void b() {
        CrashpadHelper.cancelSetUpNativeUncaughtExceptionHandler();
    }

    public String c() {
        return "appmetrica-native";
    }

    private A7(Context context, A3 a3, B0 b0, C0564mm<Bundle> mmVar) {
        this(context, a3, new C0839y7(context, b0, P.g().d().b()), mmVar, new E7(), new I7(), new b());
    }

    A7(Context context, A3 a3, C0839y7 y7Var, C0564mm<Bundle> mmVar, E7 e7, I7 i7, C0589nm<Void, String> nmVar) {
        this.f3687a = context;
        this.f3688b = a3;
        this.f3689c = y7Var;
        this.f3690d = mmVar;
        this.f3691e = e7;
        this.f3692f = i7;
        this.f3693g = nmVar;
    }

    public void a(boolean z) {
        CrashpadHelper.logsEnabled(z);
    }

    public void a(String str) {
        this.f3692f.a(str);
        CrashpadHelper.updateRuntimeConfig(this.f3692f.a());
    }
}
