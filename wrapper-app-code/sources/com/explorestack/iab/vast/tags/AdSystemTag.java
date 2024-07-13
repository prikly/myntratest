package com.explorestack.iab.vast.tags;

import com.unity3d.ads.metadata.MediationMetaData;
import org.xmlpull.v1.XmlPullParser;

public class AdSystemTag extends VastXmlTag {

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f3269c = {MediationMetaData.KEY_VERSION};

    public AdSystemTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    public String[] getSupportedAttributes() {
        return f3269c;
    }

    public boolean isTextSupported() {
        return true;
    }
}
