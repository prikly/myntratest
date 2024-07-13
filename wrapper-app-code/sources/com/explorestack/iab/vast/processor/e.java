package com.explorestack.iab.vast.processor;

import com.explorestack.iab.vast.tags.VastXmlTag;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3261a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3262b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3263c;

    public e() {
        this(true, true, true);
    }

    public e(VastXmlTag vastXmlTag) {
        this(vastXmlTag.getBooleanAttributeValueByName("followAdditionalWrappers", true), vastXmlTag.getBooleanAttributeValueByName("allowMultipleAds", true), vastXmlTag.getBooleanAttributeValueByName("fallbackOnNoAd", true));
    }

    private e(boolean z, boolean z2, boolean z3) {
        this.f3261a = z;
        this.f3262b = z2;
        this.f3263c = z3;
    }

    public boolean a() {
        return this.f3262b;
    }

    public boolean b() {
        return this.f3263c;
    }

    public boolean c() {
        return this.f3261a;
    }
}
