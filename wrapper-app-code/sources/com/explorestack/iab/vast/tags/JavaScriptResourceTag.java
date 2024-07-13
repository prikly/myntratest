package com.explorestack.iab.vast.tags;

import org.xmlpull.v1.XmlPullParser;

public class JavaScriptResourceTag extends VastXmlTag {

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f3288c = {"apiFramework"};

    public JavaScriptResourceTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    public String[] getSupportedAttributes() {
        return f3288c;
    }

    public boolean isTextSupported() {
        return true;
    }
}
