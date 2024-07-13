package com.explorestack.iab.vast.tags;

import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

public class AdContentTag extends VastXmlTag {

    /* renamed from: c  reason: collision with root package name */
    public AdSystemTag f3264c;

    /* renamed from: d  reason: collision with root package name */
    public List<CreativeTag> f3265d;

    /* renamed from: e  reason: collision with root package name */
    public List<ExtensionTag> f3266e;

    /* renamed from: f  reason: collision with root package name */
    public List<String> f3267f;

    /* renamed from: g  reason: collision with root package name */
    public List<String> f3268g;

    public AdContentTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    public void a(AdSystemTag adSystemTag) {
        this.f3264c = adSystemTag;
    }

    public void a(List<CreativeTag> list) {
        this.f3265d = list;
    }

    public void b(List<ExtensionTag> list) {
        this.f3266e = list;
    }

    public List<CreativeTag> e(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, (String) null, "Creatives");
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (VastXmlTag.a(xmlPullParser.getName(), "Creative")) {
                    arrayList.add(new CreativeTag(xmlPullParser));
                } else {
                    VastXmlTag.d(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, (String) null, "Creatives");
        return arrayList;
    }

    public final ExtensionTag f(XmlPullParser xmlPullParser) {
        ExtensionTag extensionTag;
        xmlPullParser.require(2, (String) null, "Extension");
        String a2 = new ExtensionTag(xmlPullParser).a("type");
        if (VastXmlTag.a(a2, "appodeal")) {
            extensionTag = new AppodealExtensionTag(xmlPullParser);
        } else if (VastXmlTag.a(a2, "AdVerifications")) {
            AdVerificationsExtensionTag adVerificationsExtensionTag = null;
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (VastXmlTag.a(xmlPullParser.getName(), "AdVerifications")) {
                        adVerificationsExtensionTag = new AdVerificationsExtensionTag(xmlPullParser);
                    } else {
                        VastXmlTag.d(xmlPullParser);
                    }
                }
            }
            extensionTag = adVerificationsExtensionTag;
        } else {
            VastXmlTag.d(xmlPullParser);
            extensionTag = null;
        }
        xmlPullParser.require(3, (String) null, "Extension");
        return extensionTag;
    }

    public List<ExtensionTag> g(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, (String) null, "Extensions");
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (VastXmlTag.a(xmlPullParser.getName(), "Extension")) {
                    ExtensionTag f2 = f(xmlPullParser);
                    if (f2 != null) {
                        arrayList.add(f2);
                    }
                } else {
                    VastXmlTag.d(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, (String) null, "Extensions");
        return arrayList;
    }

    public List<CreativeTag> getCreativeTagList() {
        return this.f3265d;
    }

    public List<String> getErrorUrlList() {
        return this.f3268g;
    }

    public List<ExtensionTag> getExtensionTagList() {
        return this.f3266e;
    }

    public List<String> getImpressionUrlList() {
        return this.f3267f;
    }

    public void l(String str) {
        if (this.f3268g == null) {
            this.f3268g = new ArrayList();
        }
        this.f3268g.add(str);
    }

    public void m(String str) {
        if (this.f3267f == null) {
            this.f3267f = new ArrayList();
        }
        this.f3267f.add(str);
    }
}
