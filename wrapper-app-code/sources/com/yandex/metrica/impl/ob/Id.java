package com.yandex.metrica.impl.ob;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Id {

    /* renamed from: b  reason: collision with root package name */
    public static final Map<String, String> f4136b = Collections.unmodifiableMap(new a());

    /* renamed from: a  reason: collision with root package name */
    private Jd f4137a;

    class a extends HashMap<String, String> {
        a() {
            put("20799a27-fa80-4b36-b2db-0f8141f24180", "13");
            put("01528cc0-dd34-494d-9218-24af1317e1ee", "17233");
            put("4e610cd2-753f-4bfc-9b05-772ce8905c5e", "21952");
            put("67bb016b-be40-4c08-a190-96a3f3b503d3", "22675");
            put("e4250327-8d3c-4d35-b9e8-3c1720a64b91", "22678");
            put("6c5f504e-8928-47b5-bfb5-73af8d8bf4b4", "30404");
            put("7d962ba4-a392-449a-a02d-6c5be5613928", "30407");
        }
    }

    public Id(Jd jd) {
        this.f4137a = jd;
    }

    public void a() {
        if (this.f4137a.b((String) null) != null) {
            this.f4137a.j();
            this.f4137a.f();
        }
    }

    public void b() {
        Map<String, ?> all = this.f4137a.f4434b.getAll();
        for (String rd : f4136b.values()) {
            int i = Jd.j;
            all.remove(new Rd("init_event_pref_key", rd).a());
        }
        LinkedList linkedList = new LinkedList();
        for (String next : all.keySet()) {
            try {
                int i2 = Jd.j;
                linkedList.add(Integer.valueOf(Integer.parseInt(next.replace("init_event_pref_key", ""))));
            } catch (Throwable unused) {
            }
        }
        a(linkedList.size() == 1 ? ((Integer) linkedList.getFirst()).toString() : null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c() {
        /*
            r4 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = f4136b
            com.yandex.metrica.impl.ob.Jd r1 = r4.f4137a
            java.lang.String r1 = r1.f4433a
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0035
            com.yandex.metrica.impl.ob.Jd r1 = r4.f4137a
            android.content.SharedPreferences r1 = r1.f4434b
            java.util.Map r1 = r1.getAll()
            int r2 = com.yandex.metrica.impl.ob.Jd.j
            com.yandex.metrica.impl.ob.Rd r2 = new com.yandex.metrica.impl.ob.Rd
            java.lang.String r3 = "init_event_pref_key"
            r2.<init>(r3, r0)
            java.lang.String r2 = r2.a()
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r2 = "DONE"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0035
            r1 = 1
            goto L_0x0036
        L_0x0035:
            r1 = 0
        L_0x0036:
            if (r1 == 0) goto L_0x003b
            r4.a(r0)
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Id.c():void");
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        if (str != null) {
            Jd jd = this.f4137a;
            jd.getClass();
            jd.f4434b.edit().remove(new Rd("init_event_pref_key", str).a()).apply();
            this.f4137a.j();
        }
    }
}
