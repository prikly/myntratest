package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import android.text.TextUtils;
import com.yandex.metrica.impl.ac.CrashpadServiceHelper;

public class T4 extends X4 {

    /* renamed from: b  reason: collision with root package name */
    private final C0564mm<String> f5012b;

    class a implements C0564mm<String> {
        a() {
        }

        public void b(Object obj) {
            String str = (String) obj;
            if (A2.a(21)) {
                CrashpadServiceHelper.a(str);
            }
        }
    }

    public T4(L3 l3) {
        this(l3, new a());
    }

    public boolean a(C0293c0 c0Var) {
        Bundle l = c0Var.l();
        if (l == null) {
            return true;
        }
        String string = l.getString("payload_crash_id");
        if (TextUtils.isEmpty(string)) {
            return true;
        }
        this.f5012b.b(string);
        return true;
    }

    public T4(L3 l3, C0564mm<String> mmVar) {
        super(l3);
        this.f5012b = mmVar;
    }
}
