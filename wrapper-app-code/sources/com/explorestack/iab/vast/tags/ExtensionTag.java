package com.explorestack.iab.vast.tags;

import org.xmlpull.v1.XmlPullParser;

public class ExtensionTag extends VastXmlTag {

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f3287c = {"type"};

    public ExtensionTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    public String[] getSupportedAttributes() {
        return f3287c;
    }
}
