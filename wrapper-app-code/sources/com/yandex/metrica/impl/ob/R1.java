package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.yandex.metrica.e;
import com.yandex.metrica.i;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class R1 implements N0 {

    /* renamed from: a  reason: collision with root package name */
    private Context f4833a;

    /* renamed from: b  reason: collision with root package name */
    private A3 f4834b;

    /* renamed from: c  reason: collision with root package name */
    private T1 f4835c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f4836d;

    /* renamed from: e  reason: collision with root package name */
    private C0436hi f4837e;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, M0> f4838f;

    /* renamed from: g  reason: collision with root package name */
    private final Kn<String> f4839g;

    /* renamed from: h  reason: collision with root package name */
    private final List<String> f4840h = Arrays.asList(new String[]{"20799a27-fa80-4b36-b2db-0f8141f24180", "0e5e9c33-f8c3-4568-86c5-2e4f57523f72"});

    public R1(Context context, A3 a3, T1 t1, Handler handler, C0436hi hiVar) {
        HashMap hashMap = new HashMap();
        this.f4838f = hashMap;
        this.f4839g = new Hn(new Mn(hashMap));
        this.f4833a = context;
        this.f4834b = a3;
        this.f4835c = t1;
        this.f4836d = handler;
        this.f4837e = hiVar;
    }

    public C0468j1 a(i iVar, boolean z, C0277b9 b9Var) {
        i iVar2 = iVar;
        this.f4839g.a(iVar2.apiKey);
        Context context = this.f4833a;
        A3 a3 = this.f4834b;
        i iVar3 = iVar;
        C0468j1 j1Var = new C0468j1(context, a3, iVar3, this.f4835c, new C0474j7(context, a3), this.f4837e, new C0834y2(this, "20799a27-fa80-4b36-b2db-0f8141f24180"), new C0834y2(this, "0e5e9c33-f8c3-4568-86c5-2e4f57523f72"), b9Var, P.g(), new A0(context));
        a((B) j1Var);
        if (z) {
            j1Var.i.c(j1Var.f3721b);
        }
        Map<String, String> map = iVar2.f3634h;
        if (!A2.b((Map) map)) {
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                String str2 = (String) next.getValue();
                if (!TextUtils.isEmpty(str)) {
                    j1Var.i.a(str, str2, j1Var.f3721b);
                } else if (j1Var.f3722c.isEnabled()) {
                    j1Var.f3722c.fw("Invalid App Environment (key,value) pair: (%s,%s).", str, str2);
                }
            }
        }
        j1Var.a(iVar2.errorEnvironment);
        j1Var.f();
        this.f4835c.a(j1Var);
        this.f4838f.put(iVar2.apiKey, j1Var);
        return j1Var;
    }

    public synchronized M0 b(e eVar) {
        C0518l1 l1Var;
        M0 m0 = this.f4838f.get(eVar.apiKey);
        l1Var = m0;
        if (m0 == null) {
            if (!this.f4840h.contains(eVar.apiKey)) {
                this.f4837e.g();
            }
            C0518l1 l1Var2 = new C0518l1(this.f4833a, this.f4834b, eVar, this.f4835c);
            a((B) l1Var2);
            l1Var2.f();
            this.f4838f.put(eVar.apiKey, l1Var2);
            l1Var = l1Var2;
        }
        return l1Var;
    }

    public N0 b() {
        return this;
    }

    public synchronized void c(e eVar) {
        if (this.f4838f.containsKey(eVar.apiKey)) {
            C0315cm b2 = Ul.b(eVar.apiKey);
            if (b2.isEnabled()) {
                b2.fw("Reporter with apiKey=%s already exists.", eVar.apiKey);
            }
        } else {
            b(eVar);
            Log.i("AppMetrica", "Activate reporter with APIKey " + A2.a(eVar.apiKey));
        }
    }

    public synchronized R0 a(i iVar) {
        C0318d0 d0Var;
        M0 m0 = this.f4838f.get(iVar.apiKey);
        d0Var = m0;
        if (m0 == null) {
            C0318d0 d0Var2 = new C0318d0(this.f4833a, this.f4834b, iVar, this.f4835c);
            a((B) d0Var2);
            d0Var2.a(iVar.errorEnvironment);
            d0Var2.f();
            d0Var = d0Var2;
        }
        return d0Var;
    }

    private void a(B b2) {
        b2.a(new C0269b1(this.f4836d, b2));
        b2.f3721b.a((C0485ji) this.f4837e);
    }
}
