package com.bytedance.sdk.openadsdk.core.j.a.a;

import android.content.Context;
import android.text.TextUtils;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.bytedance.sdk.openadsdk.core.j.a;
import com.bytedance.sdk.openadsdk.core.j.b.c;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: InLineParser */
public class b {
    public static a a(Context context, XmlPullParser xmlPullParser, List<c> list, int i, double d2) throws IOException, XmlPullParserException {
        xmlPullParser.require(2, d.f1281f, "InLine");
        a aVar = new a();
        while (true) {
            if (xmlPullParser.next() == 3 && "InLine".equals(xmlPullParser.getName())) {
                aVar.a().j(list);
                if (!TextUtils.isEmpty(aVar.g())) {
                    return aVar;
                }
                return null;
            } else if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                char c2 = 65535;
                switch (name.hashCode()) {
                    case -1692490108:
                        if (name.equals("Creatives")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case -56677412:
                        if (name.equals("Description")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 67232232:
                        if (name.equals(LogConstants.EVENT_ERROR)) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 501930965:
                        if (name.equals("AdTitle")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 2114088489:
                        if (name.equals("Impression")) {
                            c2 = 3;
                            break;
                        }
                        break;
                }
                if (c2 == 0) {
                    aVar.a(d.b(xmlPullParser, name));
                } else if (c2 == 1) {
                    aVar.b(d.b(xmlPullParser, name));
                } else if (c2 == 2) {
                    list.addAll(d.a(xmlPullParser, name));
                } else if (c2 == 3) {
                    aVar.a().a(d.a(xmlPullParser, name));
                } else if (c2 != 4) {
                    d.a(xmlPullParser);
                } else if (TextUtils.isEmpty(aVar.g()) || aVar.c() == null) {
                    while (xmlPullParser.next() != 3) {
                        if (xmlPullParser.getEventType() == 2) {
                            if ("Creative".equals(xmlPullParser.getName())) {
                                a(context, xmlPullParser, aVar, i, d2);
                            } else {
                                d.a(xmlPullParser);
                            }
                        }
                    }
                } else {
                    d.a(xmlPullParser);
                }
            }
        }
    }

    public static void a(Context context, XmlPullParser xmlPullParser, a aVar, int i, double d2) throws IOException, XmlPullParserException {
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Linear".equals(xmlPullParser.getName()) && TextUtils.isEmpty(aVar.g())) {
                    c.a(xmlPullParser, aVar, i, d2);
                } else if (!"CompanionAds".equals(xmlPullParser.getName()) || aVar.c() != null) {
                    d.a(xmlPullParser);
                } else {
                    aVar.a(a.a(context, xmlPullParser));
                }
            }
        }
    }
}
