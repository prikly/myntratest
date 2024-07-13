package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.xh  reason: case insensitive filesystem */
public class C0825xh {

    /* renamed from: a  reason: collision with root package name */
    private final C0810x2 f7122a;

    /* renamed from: b  reason: collision with root package name */
    private final C0801wh f7123b;

    public C0825xh(C0801wh whVar) {
        this(whVar, new C0810x2());
    }

    public long a(int i) {
        return a().optLong(String.valueOf(i));
    }

    C0825xh(C0801wh whVar, C0810x2 x2Var) {
        this.f7123b = whVar;
        this.f7122a = x2Var;
    }

    public void a(int i, long j) {
        JSONObject a2 = a();
        try {
            a2.put(String.valueOf(i), j);
        } catch (Throwable unused) {
        }
        this.f7123b.a(a2.toString());
    }

    public void a(long j) {
        ArrayList arrayList = new ArrayList();
        JSONObject a2 = a();
        Iterator<String> keys = a2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            long optLong = a2.optLong(next);
            C0810x2 x2Var = this.f7122a;
            if (x2Var.b(optLong, j, "last socket open on " + next)) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a2.remove((String) it.next());
            }
            this.f7123b.a(a2.toString());
        }
    }

    private JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        String a2 = this.f7123b.a();
        if (TextUtils.isEmpty(a2)) {
            return jSONObject;
        }
        try {
            return new JSONObject(a2);
        } catch (Throwable unused) {
            return jSONObject;
        }
    }
}
