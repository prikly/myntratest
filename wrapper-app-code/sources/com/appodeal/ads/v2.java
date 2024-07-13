package com.appodeal.ads;

import com.appodeal.ads.l;
import com.appodeal.ads.r;

public abstract class v2<AdObjectType extends l, AdRequestType extends r<AdObjectType>> extends b0<AdObjectType, AdRequestType, Object> {
    public v2(g<AdRequestType, AdObjectType, Object> gVar) {
        super(gVar);
    }

    public final void f(r rVar, l lVar, l2 l2Var) {
    }

    public final void g(r rVar, l lVar, l2 l2Var) {
    }

    public final void h(r rVar, l lVar, l2 l2Var) {
        r(rVar, lVar);
    }

    public abstract void r(AdRequestType adrequesttype, AdObjectType adobjecttype);
}
