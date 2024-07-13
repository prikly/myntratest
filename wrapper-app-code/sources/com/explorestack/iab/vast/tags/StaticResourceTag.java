package com.explorestack.iab.vast.tags;

import android.text.TextUtils;
import org.xmlpull.v1.XmlPullParser;

public class StaticResourceTag extends VastXmlTag {

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f3302c = {"creativeType"};

    public StaticResourceTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    public String[] getSupportedAttributes() {
        return f3302c;
    }

    public boolean isTextSupported() {
        return true;
    }

    public boolean isValidTag() {
        String a2 = a("creativeType");
        if (!TextUtils.isEmpty(a2)) {
            return a2.matches("image/.*(?i)(gif|jpeg|jpg|bmp|png)");
        }
        return false;
    }
}
