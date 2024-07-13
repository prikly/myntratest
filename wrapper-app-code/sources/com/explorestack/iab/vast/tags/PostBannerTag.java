package com.explorestack.iab.vast.tags;

import android.text.TextUtils;
import com.explorestack.iab.utils.IabElementStyle;
import com.explorestack.iab.vast.VastLog;
import org.xmlpull.v1.XmlPullParser;

public class PostBannerTag extends VastXmlTag {
    public static final /* synthetic */ boolean o = (!PostBannerTag.class.desiredAssertionStatus());

    /* renamed from: c  reason: collision with root package name */
    public final IabElementStyle f3296c = new IabElementStyle();

    /* renamed from: d  reason: collision with root package name */
    public final IabElementStyle f3297d = new IabElementStyle();

    /* renamed from: e  reason: collision with root package name */
    public final IabElementStyle f3298e = new IabElementStyle();

    /* renamed from: f  reason: collision with root package name */
    public final IabElementStyle f3299f = new IabElementStyle();

    /* renamed from: g  reason: collision with root package name */
    public String f3300g;

    /* renamed from: h  reason: collision with root package name */
    public float f3301h = 0.0f;
    public float i = 0.0f;
    public boolean j = true;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;

    public void a(XmlPullParser xmlPullParser) {
        IabElementStyle iabElementStyle;
        xmlPullParser.require(2, (String) null, "Postbanner");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                try {
                    String name = xmlPullParser.getName();
                    if (VastXmlTag.a(name, "CloseTime")) {
                        String c2 = VastXmlTag.c(xmlPullParser);
                        if (TextUtils.isEmpty(c2)) {
                            continue;
                        } else {
                            if (!o) {
                                if (c2 == null) {
                                    throw new AssertionError();
                                }
                            }
                            this.f3301h = Float.parseFloat(c2);
                        }
                    } else if (VastXmlTag.a(name, "Duration")) {
                        String c3 = VastXmlTag.c(xmlPullParser);
                        if (TextUtils.isEmpty(c3)) {
                            continue;
                        } else {
                            if (!o) {
                                if (c3 == null) {
                                    throw new AssertionError();
                                }
                            }
                            this.i = Float.parseFloat(c3);
                        }
                    } else {
                        if (VastXmlTag.a(name, "ClosableView")) {
                            iabElementStyle = this.f3296c;
                        } else if (VastXmlTag.a(name, "Countdown")) {
                            iabElementStyle = this.f3297d;
                        } else if (VastXmlTag.a(name, "LoadingView")) {
                            iabElementStyle = this.f3298e;
                        } else if (VastXmlTag.a(name, "Progress")) {
                            iabElementStyle = this.f3299f;
                        } else if (VastXmlTag.a(name, "UseNativeClose")) {
                            this.l = VastXmlTag.b(xmlPullParser);
                        } else if (VastXmlTag.a(name, "IgnoresSafeAreaLayoutGuide")) {
                            this.k = VastXmlTag.b(xmlPullParser);
                        } else if (VastXmlTag.a(name, "ProductLink")) {
                            this.f3300g = VastXmlTag.c(xmlPullParser);
                        } else if (VastXmlTag.a(name, "R1")) {
                            this.m = VastXmlTag.b(xmlPullParser);
                        } else if (VastXmlTag.a(name, "R2")) {
                            this.n = VastXmlTag.b(xmlPullParser);
                        } else {
                            VastXmlTag.d(xmlPullParser);
                        }
                        VastXmlTag.a(xmlPullParser, iabElementStyle);
                    }
                } catch (Throwable th) {
                    VastLog.a("VastXmlTag", th);
                }
            }
        }
        xmlPullParser.require(3, (String) null, "Postbanner");
    }

    public IabElementStyle getCloseStyle() {
        return this.f3296c;
    }

    public float getCloseTimeSec() {
        return this.f3301h;
    }

    public IabElementStyle getCountDownStyle() {
        return this.f3297d;
    }

    public float getDurationSec() {
        return this.i;
    }

    public IabElementStyle getLoadingStyle() {
        return this.f3298e;
    }

    public String getProductLink() {
        return this.f3300g;
    }

    public IabElementStyle getProgressStyle() {
        return this.f3299f;
    }

    public boolean isForceUseNativeClose() {
        return this.l;
    }

    public boolean isR1() {
        return this.m;
    }

    public boolean isR2() {
        return this.n;
    }

    public boolean isVisible() {
        return this.j;
    }

    public void setCloseTimeSec(int i2) {
        this.f3301h = (float) i2;
    }

    public void setVisible(boolean z) {
        this.j = z;
    }
}
