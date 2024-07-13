package com.explorestack.iab.vast.tags;

import com.explorestack.iab.vast.TrackingEvent;
import com.explorestack.iab.vast.VastLog;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

public class LinearCreativeTag extends CreativeContentTag {
    public static final String[] i = {"skipoffset"};

    /* renamed from: c  reason: collision with root package name */
    public String f3289c;

    /* renamed from: d  reason: collision with root package name */
    public List<MediaFileTag> f3290d;

    /* renamed from: e  reason: collision with root package name */
    public VideoClicksTag f3291e;

    /* renamed from: f  reason: collision with root package name */
    public String f3292f;

    /* renamed from: g  reason: collision with root package name */
    public EnumMap<TrackingEvent, List<String>> f3293g;

    /* renamed from: h  reason: collision with root package name */
    public int f3294h = -1;

    public LinearCreativeTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        xmlPullParser.require(2, (String) null, "Linear");
        int e2 = VastXmlTag.e(a("skipoffset"));
        if (e2 > -1) {
            a(e2);
        }
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (VastXmlTag.a(name, "Duration")) {
                    setDuration(VastXmlTag.c(xmlPullParser));
                } else if (VastXmlTag.a(name, "MediaFiles")) {
                    a(e(xmlPullParser));
                } else if (VastXmlTag.a(name, "VideoClicks")) {
                    a(new VideoClicksTag(xmlPullParser));
                } else if (VastXmlTag.a(name, "AdParameters")) {
                    setAdParameters(VastXmlTag.c(xmlPullParser));
                } else if (VastXmlTag.a(name, "TrackingEvents")) {
                    a(new TrackingEventsTag(xmlPullParser).b());
                } else {
                    VastXmlTag.d(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, (String) null, "Linear");
    }

    public static List<MediaFileTag> e(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, (String) null, "MediaFiles");
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (VastXmlTag.a(xmlPullParser.getName(), "MediaFile")) {
                    MediaFileTag mediaFileTag = new MediaFileTag(xmlPullParser);
                    if (mediaFileTag.isValidTag()) {
                        arrayList.add(mediaFileTag);
                    } else {
                        VastLog.d("VastXmlTag", "MediaFile: is not valid. Skipping it.");
                    }
                }
                VastXmlTag.d(xmlPullParser);
            }
        }
        xmlPullParser.require(3, (String) null, "MediaFiles");
        return arrayList;
    }

    public final void a(int i2) {
        this.f3294h = i2;
    }

    public final void a(VideoClicksTag videoClicksTag) {
        this.f3291e = videoClicksTag;
    }

    public final void a(EnumMap<TrackingEvent, List<String>> enumMap) {
        this.f3293g = enumMap;
    }

    public final void a(List<MediaFileTag> list) {
        this.f3290d = list;
    }

    public List<MediaFileTag> getMediaFileTagList() {
        return this.f3290d;
    }

    public int getSkipOffsetSec() {
        return this.f3294h;
    }

    public String[] getSupportedAttributes() {
        return i;
    }

    public Map<TrackingEvent, List<String>> getTrackingEventListMap() {
        return this.f3293g;
    }

    public VideoClicksTag getVideoClicksTag() {
        return this.f3291e;
    }

    public void setAdParameters(String str) {
        this.f3292f = str;
    }

    public void setDuration(String str) {
        this.f3289c = str;
    }
}
