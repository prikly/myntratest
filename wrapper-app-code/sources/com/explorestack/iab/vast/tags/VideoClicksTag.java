package com.explorestack.iab.vast.tags;

import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

public class VideoClicksTag extends VastXmlTag {

    /* renamed from: c  reason: collision with root package name */
    public String f3312c;

    /* renamed from: d  reason: collision with root package name */
    public List<String> f3313d;

    /* renamed from: e  reason: collision with root package name */
    public List<String> f3314e;

    public VideoClicksTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        xmlPullParser.require(2, (String) null, "VideoClicks");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (VastXmlTag.a(name, "ClickThrough")) {
                    n(VastXmlTag.c(xmlPullParser));
                } else if (VastXmlTag.a(name, "ClickTracking")) {
                    l(VastXmlTag.c(xmlPullParser));
                } else if (VastXmlTag.a(name, "CustomClick")) {
                    m(VastXmlTag.c(xmlPullParser));
                } else {
                    VastXmlTag.d(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, (String) null, "VideoClicks");
    }

    public String getClickThroughUrl() {
        return this.f3312c;
    }

    public List<String> getClickTrackingUrlList() {
        return this.f3313d;
    }

    public final void l(String str) {
        if (this.f3313d == null) {
            this.f3313d = new ArrayList();
        }
        this.f3313d.add(str);
    }

    public final void m(String str) {
        if (this.f3314e == null) {
            this.f3314e = new ArrayList();
        }
        this.f3314e.add(str);
    }

    public final void n(String str) {
        this.f3312c = str;
    }
}
