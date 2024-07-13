package com.explorestack.iab.vast.tags;

import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

public class AdVerificationsExtensionTag extends ExtensionTag {

    /* renamed from: d  reason: collision with root package name */
    public final List<VerificationTag> f3272d = new ArrayList();

    public AdVerificationsExtensionTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        xmlPullParser.require(2, (String) null, "AdVerifications");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (VastXmlTag.a(xmlPullParser.getName(), "Verification")) {
                    this.f3272d.add(new VerificationTag(xmlPullParser));
                } else {
                    VastXmlTag.d(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, (String) null, "AdVerifications");
    }

    public List<VerificationTag> getVerificationTagList() {
        return this.f3272d;
    }
}
