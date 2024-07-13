package com.appodeal.ads;

import com.appodeal.ads.l;
import com.appodeal.ads.r;

public abstract class g<AdRequestType extends r<AdObjectType>, AdObjectType extends l, ReferenceObjectType> {
    public void a(AdRequestType adrequesttype, AdObjectType adobjecttype) {
    }

    public abstract void a(AdRequestType adrequesttype, AdObjectType adobjecttype, ReferenceObjectType referenceobjecttype);

    public abstract void b(AdRequestType adrequesttype, AdObjectType adobjecttype);

    public abstract void b(r rVar, l lVar, Object obj);

    public void c(r rVar, l lVar) {
    }

    public abstract void c(AdRequestType adrequesttype, AdObjectType adobjecttype, ReferenceObjectType referenceobjecttype);

    public abstract void d(r rVar, l lVar);

    public abstract void e(AdRequestType adrequesttype, AdObjectType adobjecttype);
}
