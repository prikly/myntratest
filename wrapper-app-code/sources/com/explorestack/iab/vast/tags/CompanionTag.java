package com.explorestack.iab.vast.tags;

import android.text.TextUtils;
import com.explorestack.iab.mraid.g;
import com.explorestack.iab.vast.TrackingEvent;
import com.onesignal.outcomes.OSOutcomeConstants;
import io.bidmachine.utils.IabUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

public class CompanionTag extends VastXmlTag {
    public static final String[] j = {IabUtils.KEY_WIDTH, IabUtils.KEY_HEIGHT, OSOutcomeConstants.OUTCOME_ID, "assetWidth", "assetHeight", "expandedWidth", "expandedHeight", "apiFramework", "adSlotID", "required"};

    /* renamed from: c  reason: collision with root package name */
    public StaticResourceTag f3279c;

    /* renamed from: d  reason: collision with root package name */
    public String f3280d;

    /* renamed from: e  reason: collision with root package name */
    public String f3281e;

    /* renamed from: f  reason: collision with root package name */
    public String f3282f;

    /* renamed from: g  reason: collision with root package name */
    public List<String> f3283g;

    /* renamed from: h  reason: collision with root package name */
    public Map<TrackingEvent, List<String>> f3284h;
    public String i;

    public CompanionTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        xmlPullParser.require(2, (String) null, "Companion");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (VastXmlTag.a(name, "StaticResource")) {
                    StaticResourceTag staticResourceTag = new StaticResourceTag(xmlPullParser);
                    if (staticResourceTag.isValidTag()) {
                        a(staticResourceTag);
                    }
                } else if (VastXmlTag.a(name, "IFrameResource")) {
                    n(VastXmlTag.c(xmlPullParser));
                } else if (VastXmlTag.a(name, "HTMLResource")) {
                    setHtmlResource(VastXmlTag.c(xmlPullParser));
                } else if (VastXmlTag.a(name, "CompanionClickThrough")) {
                    m(VastXmlTag.c(xmlPullParser));
                } else if (VastXmlTag.a(name, "CompanionClickTracking")) {
                    l(VastXmlTag.c(xmlPullParser));
                } else if (VastXmlTag.a(name, "TrackingEvents")) {
                    a((Map<TrackingEvent, List<String>>) new TrackingEventsTag(xmlPullParser).b());
                } else if (VastXmlTag.a(name, "AdParameters")) {
                    setAdParameters(VastXmlTag.c(xmlPullParser));
                } else {
                    VastXmlTag.d(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, (String) null, "Companion");
    }

    public final void a(StaticResourceTag staticResourceTag) {
        this.f3279c = staticResourceTag;
    }

    public final void a(Map<TrackingEvent, List<String>> map) {
        this.f3284h = map;
    }

    public List<String> getCompanionClickTrackingList() {
        return this.f3283g;
    }

    public int getHeight() {
        return b(IabUtils.KEY_HEIGHT);
    }

    public String getHtml() {
        String htmlForMraid = getHtmlForMraid();
        if (htmlForMraid != null) {
            return g.d(htmlForMraid);
        }
        return null;
    }

    public String getHtmlForMraid() {
        String str = this.f3281e;
        if (str != null) {
            return str;
        }
        StaticResourceTag staticResourceTag = this.f3279c;
        if (staticResourceTag != null) {
            return String.format("<script type='text/javascript'>document.write('<a style=\"display: flex; width: 100%%; height: 100%%; justify-content: center; align-items: center\" href=\"%s\" target=\"_blank\"><img style=\"border-style: none; height: 100%%; width: 100%%; object-fit: contain;\" src=\"%s\"/></a>');</script>", new Object[]{this.f3282f, staticResourceTag.getText()});
        } else if (this.f3280d == null) {
            return null;
        } else {
            return String.format("<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"%s\" height=\"%s\" src=\"%s\"></iframe>", new Object[]{Integer.valueOf(getWidth()), Integer.valueOf(getHeight()), this.f3280d});
        }
    }

    public String[] getSupportedAttributes() {
        return j;
    }

    public Map<TrackingEvent, List<String>> getTrackingEventListMap() {
        return this.f3284h;
    }

    public int getWidth() {
        return b(IabUtils.KEY_WIDTH);
    }

    public boolean hasCreative() {
        return (this.f3281e == null && this.f3279c == null && this.f3280d == null) ? false : true;
    }

    public boolean isValidTag() {
        return !TextUtils.isEmpty(a(IabUtils.KEY_WIDTH)) && !TextUtils.isEmpty(a(IabUtils.KEY_HEIGHT));
    }

    public final void l(String str) {
        if (this.f3283g == null) {
            this.f3283g = new ArrayList();
        }
        this.f3283g.add(str);
    }

    public final void m(String str) {
        this.f3282f = str;
    }

    public final void n(String str) {
        this.f3280d = str;
    }

    public void setAdParameters(String str) {
        this.i = str;
    }

    public void setHtmlResource(String str) {
        this.f3281e = str;
    }
}
