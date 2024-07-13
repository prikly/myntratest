package com.explorestack.iab.vast.tags;

import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

public class VastTag extends VastXmlTag {

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f3305d = {MediationMetaData.KEY_VERSION};

    /* renamed from: c  reason: collision with root package name */
    public final List<AdTag> f3306c = new ArrayList();

    public VastTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        xmlPullParser.require(2, (String) null, "VAST");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (VastXmlTag.a(xmlPullParser.getName(), "Ad")) {
                    this.f3306c.add(new AdTag(xmlPullParser));
                } else {
                    VastXmlTag.d(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, (String) null, "VAST");
    }

    public List<AdTag> getAdTagList() {
        return this.f3306c;
    }

    public String[] getSupportedAttributes() {
        return f3305d;
    }

    public boolean hasAd() {
        List<AdTag> list = this.f3306c;
        return list != null && list.size() > 0;
    }
}
