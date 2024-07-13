package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;

public class Kb implements C0771vb {

    /* renamed from: a  reason: collision with root package name */
    private final String f4430a;

    /* renamed from: b  reason: collision with root package name */
    private final Jb f4431b;

    public Kb(String str) {
        this(str, new Jb());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: com.yandex.metrica.impl.ob.tb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Boolean} */
    /* JADX WARNING: type inference failed for: r8v1 */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.yandex.metrica.impl.ob.C0747ub b(android.content.Context r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.String r0 = "com.yandex.metrica.identifiers.AdsIdentifiersProvider"
            java.lang.Class r0 = java.lang.Class.forName(r0)
            r1 = 2
            java.lang.Class[] r2 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r4 = 0
            r2[r4] = r3
            java.lang.Class<android.os.Bundle> r3 = android.os.Bundle.class
            r5 = 1
            r2[r5] = r3
            java.lang.String r3 = "requestIdentifiers"
            java.lang.reflect.Method r0 = r0.getMethod(r3, r2)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = r7.f4430a
            java.lang.String r6 = "com.yandex.metrica.identifiers.extra.PROVIDER"
            r2.putString(r6, r3)
            com.yandex.metrica.impl.ob.Jb r3 = r7.f4431b
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r8
            r1[r5] = r2
            r8 = 0
            java.lang.Object r0 = r0.invoke(r8, r1)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r3.getClass()
            if (r0 == 0) goto L_0x00a6
            java.lang.String r1 = "com.yandex.metrica.identifiers.extra.TRACKING_INFO"
            android.os.Bundle r1 = r0.getBundle(r1)
            if (r1 == 0) goto L_0x0090
            java.util.Map<java.lang.String, com.yandex.metrica.impl.ob.tb$a> r2 = com.yandex.metrica.impl.ob.Ib.f4135a
            java.lang.String r3 = r1.getString(r6)
            java.lang.Object r2 = r2.get(r3)
            if (r2 == 0) goto L_0x006c
            com.yandex.metrica.impl.ob.tb$a r2 = (com.yandex.metrica.impl.ob.C0723tb.a) r2
            java.lang.String r3 = "com.yandex.metrica.identifiers.extra.ID"
            java.lang.String r3 = r1.getString(r3)
            java.lang.String r4 = "com.yandex.metrica.identifiers.extra.LIMITED"
            boolean r5 = r1.containsKey(r4)
            if (r5 == 0) goto L_0x0065
            boolean r8 = r1.getBoolean(r4)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
        L_0x0065:
            com.yandex.metrica.impl.ob.tb r1 = new com.yandex.metrica.impl.ob.tb
            r1.<init>(r2, r3, r8)
            r8 = r1
            goto L_0x0090
        L_0x006c:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Provider "
            r8.append(r0)
            java.lang.String r0 = r1.getString(r6)
            r8.append(r0)
            java.lang.String r0 = " is invalid"
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        L_0x0090:
            java.lang.String r1 = "com.yandex.metrica.identifiers.extra.STATUS"
            java.lang.String r1 = r0.getString(r1)
            com.yandex.metrica.impl.ob.U0 r1 = com.yandex.metrica.impl.ob.U0.a(r1)
            java.lang.String r2 = "com.yandex.metrica.identifiers.extra.ERROR_MESSAGE"
            java.lang.String r0 = r0.getString(r2)
            com.yandex.metrica.impl.ob.ub r2 = new com.yandex.metrica.impl.ob.ub
            r2.<init>(r8, r1, r0)
            r8 = r2
        L_0x00a6:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Kb.b(android.content.Context):com.yandex.metrica.impl.ob.ub");
    }

    public C0747ub a(Context context) {
        return a(context, new Fb());
    }

    Kb(String str, Jb jb) {
        this.f4430a = str;
        this.f4431b = jb;
    }

    public C0747ub a(Context context, Gb gb) {
        C0747ub ubVar;
        gb.c();
        C0747ub ubVar2 = null;
        while (gb.b()) {
            try {
                return b(context);
            } catch (InvocationTargetException e2) {
                String message = e2.getTargetException() != null ? e2.getTargetException().getMessage() : null;
                ubVar = new C0747ub((C0723tb) null, U0.UNKNOWN, "exception while fetching " + this.f4430a + " adv_id: " + message);
                ubVar2 = ubVar;
                try {
                    Thread.sleep((long) gb.a());
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                ubVar = new C0747ub((C0723tb) null, U0.UNKNOWN, "exception while fetching " + this.f4430a + " adv_id: " + th.getMessage());
                ubVar2 = ubVar;
                Thread.sleep((long) gb.a());
            }
        }
        return ubVar2 == null ? new C0747ub() : ubVar2;
    }
}
