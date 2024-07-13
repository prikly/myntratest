package com.applovin.impl.sdk;

import android.content.Context;
import com.applovin.impl.sdk.c.d;
import com.applovin.impl.sdk.c.e;

public class k {

    /* renamed from: a  reason: collision with root package name */
    private static final a f15563a = new a("Age Restricted User", d.l);

    /* renamed from: b  reason: collision with root package name */
    private static final a f15564b = new a("Has User Consent", d.k);

    /* renamed from: c  reason: collision with root package name */
    private static final a f15565c = new a("\"Do Not Sell\"", d.m);

    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final String f15566a;

        /* renamed from: b  reason: collision with root package name */
        private final d<Boolean> f15567b;

        a(String str, d<Boolean> dVar) {
            this.f15566a = str;
            this.f15567b = dVar;
        }

        public Boolean a(Context context) {
            if (context != null) {
                return (Boolean) e.b(this.f15567b, null, context);
            }
            v.i("AppLovinSdk", "Failed to get value for key: " + this.f15567b);
            return null;
        }

        public String a() {
            return this.f15566a;
        }

        public String b(Context context) {
            Boolean a2 = a(context);
            return a2 != null ? a2.toString() : "No value set";
        }
    }

    public static a a() {
        return f15563a;
    }

    public static String a(Context context) {
        return a(f15563a, context) + a(f15564b, context) + a(f15565c, context);
    }

    private static String a(a aVar, Context context) {
        return "\n" + aVar.f15566a + " - " + aVar.b(context);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.applovin.impl.sdk.c.d, java.lang.Object, com.applovin.impl.sdk.c.d<java.lang.Boolean>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(com.applovin.impl.sdk.c.d<java.lang.Boolean> r2, java.lang.Boolean r3, android.content.Context r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x001a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to update compliance value for key: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "AppLovinSdk"
            com.applovin.impl.sdk.v.i(r3, r2)
            return r0
        L_0x001a:
            r1 = 0
            java.lang.Object r1 = com.applovin.impl.sdk.c.e.b(r2, r1, (android.content.Context) r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            com.applovin.impl.sdk.c.e.a(r2, r3, (android.content.Context) r4)
            r2 = 1
            if (r1 == 0) goto L_0x002b
            if (r1 == r3) goto L_0x002a
            r0 = 1
        L_0x002a:
            return r0
        L_0x002b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.k.a(com.applovin.impl.sdk.c.d, java.lang.Boolean, android.content.Context):boolean");
    }

    public static boolean a(boolean z, Context context) {
        return a(d.l, Boolean.valueOf(z), context);
    }

    public static a b() {
        return f15564b;
    }

    public static boolean b(boolean z, Context context) {
        return a(d.k, Boolean.valueOf(z), context);
    }

    public static a c() {
        return f15565c;
    }

    public static boolean c(boolean z, Context context) {
        return a(d.m, Boolean.valueOf(z), context);
    }
}
