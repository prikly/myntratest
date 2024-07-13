package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.g;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.l5  reason: case insensitive filesystem */
public class C0522l5 extends X4 {
    public C0522l5(L3 l3) {
        super(l3);
    }

    public boolean a(C0293c0 c0Var) {
        String p = c0Var.p();
        g a2 = C0267b.a(p);
        String h2 = a().h();
        g a3 = C0267b.a(h2);
        if (!a2.equals(a3)) {
            boolean z = false;
            if (TextUtils.isEmpty(a2.c()) && !TextUtils.isEmpty(a3.c())) {
                c0Var.e(h2);
                a(c0Var, C0464im.LOGOUT);
            } else {
                if (!TextUtils.isEmpty(a2.c()) && TextUtils.isEmpty(a3.c())) {
                    a(c0Var, C0464im.LOGIN);
                } else {
                    if (!TextUtils.isEmpty(a2.c()) && !a2.c().equals(a3.c())) {
                        z = true;
                    }
                    if (z) {
                        a(c0Var, C0464im.SWITCH);
                    } else {
                        a(c0Var, C0464im.UPDATE);
                    }
                }
            }
            a().a(p);
        }
        return true;
    }

    private void a(C0293c0 c0Var, C0464im imVar) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("action", imVar.toString());
            str = jSONObject.toString();
        } catch (Throwable unused) {
            str = null;
        }
        c0Var.f(str);
        a().r().b(c0Var);
    }
}
