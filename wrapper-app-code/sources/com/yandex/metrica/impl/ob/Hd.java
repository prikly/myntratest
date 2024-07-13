package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Hd {

    /* renamed from: a  reason: collision with root package name */
    private Context f4112a;

    public Hd(Context context) {
        this.f4112a = context;
    }

    public void a() {
        SharedPreferences a2 = C0267b.a(this.f4112a, "_bidoptpreferences");
        if (a2.getAll().size() > 0) {
            Rd rd = Pd.p;
            String string = a2.getString(rd.b(), (String) null);
            Pd pd = new Pd(this.f4112a, (String) null);
            if (!TextUtils.isEmpty(string) && TextUtils.isEmpty(pd.b((String) null))) {
                pd.i(string).b();
                a2.edit().remove(rd.b()).apply();
            }
            Map<String, ?> all = a2.getAll();
            if (all.size() > 0) {
                Iterator it = ((ArrayList) a(all, Pd.q.b())).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String string2 = a2.getString(new Rd(Pd.q.b(), str).a(), (String) null);
                    Pd pd2 = new Pd(this.f4112a, str);
                    if (!TextUtils.isEmpty(string2) && TextUtils.isEmpty(pd2.h((String) null))) {
                        pd2.j(string2).b();
                    }
                }
            }
            a2.edit().clear().apply();
        }
    }

    public void b() {
        S7 p = C0477ja.a(this.f4112a).p();
        SharedPreferences a2 = C0267b.a(this.f4112a, "_startupserviceinfopreferences");
        C0377f9 f9Var = new C0377f9(p, (String) null);
        Rd rd = Pd.p;
        String string = a2.getString(rd.b(), (String) null);
        if (!TextUtils.isEmpty(string) && TextUtils.isEmpty(f9Var.g().f6647b)) {
            f9Var.i(string).d();
            a2.edit().remove(rd.b()).apply();
        }
        C0377f9 f9Var2 = new C0377f9(p, this.f4112a.getPackageName());
        boolean z = a2.getBoolean(Pd.y.b(), false);
        if (z) {
            f9Var2.a(z).d();
        }
        a(p, this.f4112a.getPackageName());
        Iterator it = ((ArrayList) a(a2.getAll(), Pd.q.b())).iterator();
        while (it.hasNext()) {
            a(p, (String) it.next());
        }
    }

    private List<String> a(Map<String, ?> map, String str) {
        ArrayList arrayList = new ArrayList();
        for (String next : map.keySet()) {
            if (next.startsWith(str)) {
                arrayList.add(next.replace(str, ""));
            }
        }
        return arrayList;
    }

    private void a(S7 s7, String str) {
        C0377f9 f9Var = new C0377f9(s7, str);
        Pd pd = new Pd(this.f4112a, str);
        String h2 = pd.h((String) null);
        if (!TextUtils.isEmpty(h2)) {
            f9Var.o(h2);
        }
        String c2 = pd.c((String) null);
        if (!TextUtils.isEmpty(c2)) {
            f9Var.j(c2);
        }
        String d2 = pd.d((String) null);
        if (!TextUtils.isEmpty(d2)) {
            f9Var.k(d2);
        }
        String f2 = pd.f((String) null);
        if (!TextUtils.isEmpty(f2)) {
            f9Var.m(f2);
        }
        String e2 = pd.e((String) null);
        if (!TextUtils.isEmpty(e2)) {
            f9Var.l(e2);
        }
        long a2 = pd.a(-1);
        if (a2 != -1) {
            f9Var.b(a2);
        }
        String g2 = pd.g((String) null);
        if (!TextUtils.isEmpty(g2)) {
            f9Var.n(g2);
        }
        f9Var.d();
        pd.f();
    }
}
