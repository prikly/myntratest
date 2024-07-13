package com.yandex.metrica.impl.ob;

import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class A1 implements B1 {

    /* renamed from: a  reason: collision with root package name */
    private final C0686rm<String, Integer> f3677a = new C0686rm<>();

    /* renamed from: b  reason: collision with root package name */
    private final Map<e, d> f3678b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<e, d> f3679c = new LinkedHashMap();

    class a implements d {
        a() {
        }

        public boolean a(Intent intent, A1 a1) {
            return A1.a(A1.this, intent);
        }
    }

    class b implements d {
        b() {
        }

        public boolean a(Intent intent, A1 a1) {
            return A1.this.e(intent);
        }
    }

    class c implements d {
        c() {
        }

        public boolean a(Intent intent, A1 a1) {
            return A1.this.e(intent) && A1.a(A1.this);
        }
    }

    interface d {
        boolean a(Intent intent, A1 a1);
    }

    interface e {
        void a(Intent intent);
    }

    private int d(Intent intent) {
        Uri data = intent.getData();
        if (data != null && data.getPath().equals("/client")) {
            try {
                return Integer.parseInt(data.getQueryParameter("pid"));
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    public boolean e(Intent intent) {
        boolean z = false;
        if (!"com.yandex.metrica.IMetricaService".equals(intent.getAction())) {
            return false;
        }
        if (d(intent) == Process.myPid()) {
            z = true;
        }
        return !z;
    }

    public void a(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f3677a.a(action, Integer.valueOf(d(intent)));
            }
            a(intent, this.f3678b);
        }
    }

    public void c(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f3677a.a(action, Integer.valueOf(d(intent)));
            }
            a(intent, this.f3678b);
        }
    }

    public void b(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f3677a.b(action, Integer.valueOf(d(intent)));
            }
            a(intent, this.f3679c);
        }
    }

    private void a(Intent intent, Map<e, d> map) {
        for (Map.Entry next : map.entrySet()) {
            if (((d) next.getValue()).a(intent, this)) {
                ((e) next.getKey()).a(intent);
            }
        }
    }

    public void c(e eVar) {
        this.f3678b.put(eVar, new b());
    }

    private int c() {
        Collection<Integer> a2 = this.f3677a.a("com.yandex.metrica.IMetricaService");
        if (A2.b((Collection) a2)) {
            return 0;
        }
        int i = 0;
        for (Integer intValue : a2) {
            if (!(intValue.intValue() == Process.myPid())) {
                i++;
            }
        }
        return i;
    }

    public void b(e eVar) {
        this.f3678b.put(eVar, new a());
    }

    public void a(e eVar) {
        this.f3679c.put(eVar, new c());
    }

    static boolean a(A1 a1, Intent intent) {
        if (!a1.e(intent)) {
            return false;
        }
        if (a1.c() == 1) {
            return true;
        }
        return false;
    }

    static boolean a(A1 a1) {
        return a1.c() == 0;
    }
}
