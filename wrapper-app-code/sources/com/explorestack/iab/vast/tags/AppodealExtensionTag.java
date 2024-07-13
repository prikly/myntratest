package com.explorestack.iab.vast.tags;

import com.explorestack.iab.utils.IabElementStyle;
import com.explorestack.iab.vast.a;
import org.xmlpull.v1.XmlPullParser;

public class AppodealExtensionTag extends ExtensionTag implements a {

    /* renamed from: d  reason: collision with root package name */
    public final IabElementStyle f3273d = new IabElementStyle();

    /* renamed from: e  reason: collision with root package name */
    public final IabElementStyle f3274e = new IabElementStyle();

    /* renamed from: f  reason: collision with root package name */
    public final IabElementStyle f3275f = new IabElementStyle();

    /* renamed from: g  reason: collision with root package name */
    public final IabElementStyle f3276g = new IabElementStyle();

    /* renamed from: h  reason: collision with root package name */
    public final IabElementStyle f3277h = new IabElementStyle();
    public final IabElementStyle i = new IabElementStyle();
    public final IabElementStyle j = new IabElementStyle();
    public final IabElementStyle k = new IabElementStyle();
    public final PostBannerTag l = new PostBannerTag();
    public Integer m;
    public Integer n;
    public CompanionTag o;
    public Boolean p;
    public Float q;
    public boolean r = false;
    public boolean s = false;
    public boolean t = false;
    public boolean u = false;
    public Integer v;

    public AppodealExtensionTag(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        IabElementStyle iabElementStyle;
        IabElementStyle iabElementStyle2;
        IabElementStyle iabElementStyle3;
        IabElementStyle iabElementStyle4;
        xmlPullParser.require(2, (String) null, "Extension");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (VastXmlTag.a(name, "Video")) {
                    iabElementStyle4 = this.f3273d;
                } else if (VastXmlTag.a(name, "LoadingView")) {
                    iabElementStyle4 = this.j;
                } else if (VastXmlTag.a(name, "Countdown")) {
                    iabElementStyle4 = this.k;
                } else if (VastXmlTag.a(name, "Progress")) {
                    iabElementStyle4 = this.f3277h;
                } else if (VastXmlTag.a(name, "ClosableView")) {
                    iabElementStyle4 = this.f3276g;
                } else if (VastXmlTag.a(name, "Mute")) {
                    iabElementStyle4 = this.f3275f;
                } else if (VastXmlTag.a(name, "CTA")) {
                    iabElementStyle4 = this.f3274e;
                } else if (VastXmlTag.a(name, "RepeatView")) {
                    iabElementStyle4 = this.i;
                } else if (VastXmlTag.a(name, "Postbanner")) {
                    this.l.parse(xmlPullParser);
                } else if (VastXmlTag.a(name, "Autorotate")) {
                    this.p = Boolean.valueOf(VastXmlTag.b(xmlPullParser));
                } else if (VastXmlTag.a(name, "R1")) {
                    this.t = VastXmlTag.b(xmlPullParser);
                } else if (VastXmlTag.a(name, "R2")) {
                    this.u = VastXmlTag.b(xmlPullParser);
                } else if (VastXmlTag.a(name, "ForceOrientation")) {
                    this.v = VastXmlTag.g(VastXmlTag.c(xmlPullParser));
                } else if (VastXmlTag.a(name, "CtaText")) {
                    this.f3274e.setContent(VastXmlTag.c(xmlPullParser));
                } else {
                    if (VastXmlTag.a(name, "ShowCta")) {
                        iabElementStyle = this.f3274e;
                    } else if (VastXmlTag.a(name, "ShowMute")) {
                        iabElementStyle = this.f3275f;
                    } else if (VastXmlTag.a(name, "ShowCompanion")) {
                        this.l.setVisible(VastXmlTag.b(xmlPullParser));
                    } else if (VastXmlTag.a(name, "CompanionCloseTime")) {
                        int f2 = VastXmlTag.f(VastXmlTag.c(xmlPullParser));
                        if (f2 > -1) {
                            this.l.setCloseTimeSec(f2);
                        }
                    } else if (VastXmlTag.a(name, "Muted")) {
                        this.r = VastXmlTag.b(xmlPullParser);
                    } else if (VastXmlTag.a(name, "VideoClickable")) {
                        this.s = VastXmlTag.b(xmlPullParser);
                    } else {
                        if (VastXmlTag.a(name, "CtaXPosition")) {
                            iabElementStyle3 = this.f3274e;
                        } else {
                            if (VastXmlTag.a(name, "CtaYPosition")) {
                                iabElementStyle2 = this.f3274e;
                            } else if (VastXmlTag.a(name, "CloseXPosition")) {
                                iabElementStyle3 = this.f3276g;
                            } else if (VastXmlTag.a(name, "CloseYPosition")) {
                                iabElementStyle2 = this.f3276g;
                            } else if (VastXmlTag.a(name, "MuteXPosition")) {
                                iabElementStyle3 = this.f3275f;
                            } else if (VastXmlTag.a(name, "MuteYPosition")) {
                                iabElementStyle2 = this.f3275f;
                            } else if (VastXmlTag.a(name, "AssetsColor")) {
                                Integer c2 = VastXmlTag.c(VastXmlTag.c(xmlPullParser));
                                if (c2 != null) {
                                    this.m = c2;
                                }
                            } else if (VastXmlTag.a(name, "AssetsBackgroundColor")) {
                                Integer c3 = VastXmlTag.c(VastXmlTag.c(xmlPullParser));
                                if (c3 != null) {
                                    this.n = c3;
                                }
                            } else if (VastXmlTag.a(name, "Companion")) {
                                CompanionTag companionTag = new CompanionTag(xmlPullParser);
                                if (companionTag.isValidTag() && companionTag.hasCreative()) {
                                    this.o = companionTag;
                                }
                            } else if (VastXmlTag.a(name, "CloseTime")) {
                                String c4 = VastXmlTag.c(xmlPullParser);
                                if (c4 != null) {
                                    this.q = Float.valueOf(Float.parseFloat(c4));
                                }
                            } else if (VastXmlTag.a(name, "ShowProgress")) {
                                iabElementStyle = this.f3277h;
                            } else {
                                VastXmlTag.d(xmlPullParser);
                            }
                            iabElementStyle2.setVerticalPosition(VastXmlTag.i(VastXmlTag.c(xmlPullParser)));
                        }
                        iabElementStyle3.setHorizontalPosition(VastXmlTag.h(VastXmlTag.c(xmlPullParser)));
                    }
                    iabElementStyle.setVisible(Boolean.valueOf(VastXmlTag.b(xmlPullParser)));
                }
                VastXmlTag.a(xmlPullParser, iabElementStyle4);
            }
        }
        xmlPullParser.require(3, (String) null, "Extension");
    }

    public Integer getAssetsBackgroundColor() {
        return this.n;
    }

    public Integer getAssetsColor() {
        return this.m;
    }

    public IabElementStyle getCloseStyle() {
        return this.f3276g;
    }

    public Float getCloseTimeSec() {
        return this.q;
    }

    public CompanionTag getCompanionTag() {
        return this.o;
    }

    public IabElementStyle getCountDownStyle() {
        return this.k;
    }

    public IabElementStyle getCtaStyle() {
        return this.f3274e;
    }

    public Integer getForceOrientation() {
        return this.v;
    }

    public IabElementStyle getLoadingStyle() {
        return this.j;
    }

    public IabElementStyle getMuteStyle() {
        return this.f3275f;
    }

    public PostBannerTag getPostBannerTag() {
        return this.l;
    }

    public IabElementStyle getProgressStyle() {
        return this.f3277h;
    }

    public IabElementStyle getRepeatStyle() {
        return this.i;
    }

    public IabElementStyle getVideoStyle() {
        return this.f3273d;
    }

    public Boolean isAutoRotate() {
        return this.p;
    }

    public boolean isMuted() {
        return this.r;
    }

    public boolean isR1() {
        return this.t;
    }

    public boolean isR2() {
        return this.u;
    }

    public boolean isVideoClickable() {
        return this.s;
    }
}
