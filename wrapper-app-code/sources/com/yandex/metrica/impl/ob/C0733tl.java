package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.yandex.metrica.impl.ob.tl  reason: case insensitive filesystem */
public class C0733tl {

    /* renamed from: a  reason: collision with root package name */
    private final b f6849a;

    /* renamed from: b  reason: collision with root package name */
    private final a f6850b;

    /* renamed from: com.yandex.metrica.impl.ob.tl$a */
    static class a {
        a() {
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.tl$b */
    static class b {
        b() {
        }
    }

    public C0733tl() {
        this(new b(), new a());
    }

    public C0339dl a(Activity activity, Hk hk, C0805wl wlVar, Ak ak, C0853yl ylVar, C0709sl slVar) {
        ViewGroup viewGroup;
        C0805wl wlVar2 = wlVar;
        C0853yl ylVar2 = ylVar;
        C0339dl dlVar = new C0339dl();
        try {
            viewGroup = (ViewGroup) activity.findViewById(16908290);
        } catch (Throwable th) {
            ylVar2.a("ui_parsing_root", th);
            viewGroup = null;
        }
        if (viewGroup != null) {
            this.f6849a.getClass();
            C0805wl wlVar3 = wlVar;
            Ak ak2 = ak;
            C0853yl ylVar3 = ylVar;
            C0709sl slVar2 = slVar;
            Rk rk = new Rk(wlVar3, new Fl(ylVar2), new C0708sk(wlVar2.f7067c), ak2, Collections.singletonList(new Mk()), Arrays.asList(new C0661qk[]{new C0264al(wlVar2.f7066b)}), ylVar3, slVar2, new Hl());
            dlVar.a(rk, (View) viewGroup, hk);
            if (wlVar2.f7069e) {
                this.f6850b.getClass();
                C0684rk rkVar = new C0684rk(rk.a());
                for (C0289bl a2 : rk.b()) {
                    rkVar.a(a2);
                }
            }
        }
        return dlVar;
    }

    C0733tl(b bVar, a aVar) {
        this.f6849a = bVar;
        this.f6850b = aVar;
    }
}
