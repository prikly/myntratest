package com.appodeal.ads;

import com.appodeal.ads.context.b;
import com.appodeal.ads.r5;
import com.appodeal.ads.z5;

public abstract class b6<AdObjectType extends r5<AdRequestType, ?, ?, ?>, AdRequestType extends z5<AdObjectType>> extends v2<AdObjectType, AdRequestType> {
    public b6(g<AdRequestType, AdObjectType, Object> gVar) {
        super(gVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.appodeal.ads.r r7, com.appodeal.ads.l r8, boolean r9) {
        /*
            r6 = this;
            com.appodeal.ads.z5 r7 = (com.appodeal.ads.z5) r7
            com.appodeal.ads.r5 r8 = (com.appodeal.ads.r5) r8
            super.a(r7, r8, (boolean) r9)
            android.app.Activity r7 = com.appodeal.ads.n5.b()
            if (r7 == 0) goto L_0x006f
            com.appodeal.ads.x5 r9 = r6.c()
            com.appodeal.ads.u<AdObjectType, AdRequestType, ?> r0 = r6.f16300a
            com.appodeal.ads.x5$d r1 = r9.a((android.app.Activity) r7)
            com.appodeal.ads.f0 r2 = r1.f17695b
            com.appodeal.ads.f0 r3 = com.appodeal.ads.f0.VISIBLE
            r4 = 0
            r5 = 1
            if (r2 == r3) goto L_0x0026
            com.appodeal.ads.a r1 = r1.f17694a
            if (r1 == 0) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            r1 = 0
            goto L_0x0027
        L_0x0026:
            r1 = 1
        L_0x0027:
            if (r1 == 0) goto L_0x004a
            boolean r1 = r0.k()
            if (r1 == 0) goto L_0x004a
            boolean r8 = r8.f()
            if (r8 != 0) goto L_0x004a
            AdRequestType r8 = r0.y
            com.appodeal.ads.z5 r8 = (com.appodeal.ads.z5) r8
            long r8 = r9.a(r0, r8)
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0045
            r8 = 1
            goto L_0x0046
        L_0x0045:
            r8 = 0
        L_0x0046:
            if (r8 == 0) goto L_0x004a
            r8 = 1
            goto L_0x004b
        L_0x004a:
            r8 = 0
        L_0x004b:
            if (r8 == 0) goto L_0x006f
            boolean r8 = com.appodeal.ads.utils.c.a((android.app.Activity) r7)
            if (r8 != 0) goto L_0x006f
            com.appodeal.ads.x5 r8 = r6.c()
            com.appodeal.ads.a r8 = r8.b(r7)
            com.appodeal.ads.y5 r9 = new com.appodeal.ads.y5
            com.appodeal.ads.u<AdObjectType, AdRequestType, ?> r0 = r6.f16300a
            com.appodeal.ads.segments.g r0 = r0.e()
            r9.<init>(r0, r8, r5, r4)
            com.appodeal.ads.x5 r8 = r6.c()
            com.appodeal.ads.u<AdObjectType, AdRequestType, ?> r0 = r6.f16300a
            r8.a((android.app.Activity) r7, (com.appodeal.ads.y5) r9, r0)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.b6.a(com.appodeal.ads.r, com.appodeal.ads.l, boolean):void");
    }

    public abstract x5<AdRequestType, AdObjectType> c();

    public final void h(r rVar, l lVar) {
        z5 z5Var = (z5) rVar;
        r5 r5Var = (r5) lVar;
        if (this.f16300a.k()) {
            this.f16300a.c(b.f16327b.f16328a.getApplicationContext());
        }
    }

    public final boolean k(r rVar, l lVar, l2 l2Var) {
        r5 r5Var = (r5) lVar;
        if (!(!((z5) rVar).z) || this.f16300a.q <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean p(com.appodeal.ads.r r7, com.appodeal.ads.l r8) {
        /*
            r6 = this;
            com.appodeal.ads.z5 r7 = (com.appodeal.ads.z5) r7
            com.appodeal.ads.r5 r8 = (com.appodeal.ads.r5) r8
            boolean r7 = super.p(r7, r8)
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L_0x004f
            com.appodeal.ads.x5 r7 = r6.c()
            android.app.Activity r2 = com.appodeal.ads.n5.b()
            com.appodeal.ads.u<AdObjectType, AdRequestType, ?> r3 = r6.f16300a
            com.appodeal.ads.x5$d r2 = r7.a((android.app.Activity) r2)
            com.appodeal.ads.f0 r4 = r2.f17695b
            com.appodeal.ads.f0 r5 = com.appodeal.ads.f0.VISIBLE
            if (r4 == r5) goto L_0x0027
            com.appodeal.ads.a r2 = r2.f17694a
            if (r2 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r2 = 0
            goto L_0x0028
        L_0x0027:
            r2 = 1
        L_0x0028:
            if (r2 == 0) goto L_0x004b
            boolean r2 = r3.k()
            if (r2 == 0) goto L_0x004b
            boolean r8 = r8.f()
            if (r8 != 0) goto L_0x004b
            AdRequestType r8 = r3.y
            com.appodeal.ads.z5 r8 = (com.appodeal.ads.z5) r8
            long r7 = r7.a(r3, r8)
            r2 = 0
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0046
            r7 = 1
            goto L_0x0047
        L_0x0046:
            r7 = 0
        L_0x0047:
            if (r7 == 0) goto L_0x004b
            r7 = 1
            goto L_0x004c
        L_0x004b:
            r7 = 0
        L_0x004c:
            if (r7 != 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.b6.p(com.appodeal.ads.r, com.appodeal.ads.l):boolean");
    }

    public final void r(r rVar, l lVar) {
        z5 z5Var;
        z5 z5Var2 = (z5) rVar;
        r5 r5Var = (r5) lVar;
        if (this.f16300a.k()) {
            if (!z5Var2.f17084h && ((z5Var = (z5) this.f16300a.f()) == null || z5Var.b())) {
                this.f16300a.c(b.f16327b.f16328a.getApplicationContext());
            }
            c().a(n5.b(), this.f16300a, z5Var2);
        }
    }
}
