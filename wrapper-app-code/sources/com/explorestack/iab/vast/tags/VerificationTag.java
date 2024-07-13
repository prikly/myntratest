package com.explorestack.iab.vast.tags;

import org.xmlpull.v1.XmlPullParser;

public class VerificationTag extends VastXmlTag {

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f3309e = {"vendor"};

    /* renamed from: c  reason: collision with root package name */
    public JavaScriptResourceTag f3310c;

    /* renamed from: d  reason: collision with root package name */
    public String f3311d;

    public VerificationTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        xmlPullParser.require(2, (String) null, "Verification");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (VastXmlTag.a(name, "JavaScriptResource")) {
                    this.f3310c = new JavaScriptResourceTag(xmlPullParser);
                } else if (VastXmlTag.a(name, "VerificationParameters")) {
                    this.f3311d = VastXmlTag.c(xmlPullParser);
                } else {
                    VastXmlTag.d(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, (String) null, "Verification");
    }

    public JavaScriptResourceTag getJavaScriptResourceTag() {
        return this.f3310c;
    }

    public String[] getSupportedAttributes() {
        return f3309e;
    }

    public String getVendor() {
        return a("vendor");
    }

    public String getVerificationParameters() {
        return this.f3311d;
    }
}
