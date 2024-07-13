package com.explorestack.iab.vast.tags;

import com.onesignal.outcomes.OSOutcomeConstants;
import org.xmlpull.v1.XmlPullParser;

public class CreativeTag extends VastXmlTag {

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f3285d = {OSOutcomeConstants.OUTCOME_ID, "adID"};

    /* renamed from: c  reason: collision with root package name */
    public CreativeContentTag f3286c;

    public CreativeTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        CreativeContentTag companionAdsCreativeTag;
        xmlPullParser.require(2, (String) null, "Creative");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (VastXmlTag.a(name, "Linear")) {
                    companionAdsCreativeTag = new LinearCreativeTag(xmlPullParser);
                } else if (VastXmlTag.a(name, "CompanionAds")) {
                    companionAdsCreativeTag = new CompanionAdsCreativeTag(xmlPullParser);
                } else {
                    VastXmlTag.d(xmlPullParser);
                }
                this.f3286c = companionAdsCreativeTag;
            }
        }
        xmlPullParser.require(3, (String) null, "Creative");
    }

    public CreativeContentTag getCreativeContentTag() {
        return this.f3286c;
    }

    public String[] getSupportedAttributes() {
        return f3285d;
    }
}
