package com.explorestack.iab.vast.tags;

import org.xmlpull.v1.XmlPullParser;

public class TrackingTag extends VastXmlTag {

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f3304c = {"event"};

    public TrackingTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    public String[] getSupportedAttributes() {
        return f3304c;
    }
}
