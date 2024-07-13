package com.explorestack.iab.vast.tags;

import com.onesignal.outcomes.OSOutcomeConstants;
import org.xmlpull.v1.XmlPullParser;

public class AdTag extends VastXmlTag {

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f3270d = {OSOutcomeConstants.OUTCOME_ID};

    /* renamed from: c  reason: collision with root package name */
    public AdContentTag f3271c;

    public AdTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        AdContentTag wrapperAdTag;
        xmlPullParser.require(2, (String) null, "Ad");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (VastXmlTag.a(name, "InLine")) {
                    wrapperAdTag = new InLineAdTag(xmlPullParser);
                } else if (VastXmlTag.a(name, "Wrapper")) {
                    wrapperAdTag = new WrapperAdTag(xmlPullParser);
                } else {
                    VastXmlTag.d(xmlPullParser);
                }
                this.f3271c = wrapperAdTag;
            }
        }
        xmlPullParser.require(3, (String) null, "Ad");
    }

    public AdContentTag getAdContentTag() {
        return this.f3271c;
    }

    public String[] getSupportedAttributes() {
        return f3270d;
    }
}
