package com.applovin.exoplayer2.ui;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import com.applovin.exoplayer2.l.ai;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f13859a = new c(-1, -16777216, 0, 0, -1, (Typeface) null);

    /* renamed from: b  reason: collision with root package name */
    public final int f13860b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13861c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13862d;

    /* renamed from: e  reason: collision with root package name */
    public final int f13863e;

    /* renamed from: f  reason: collision with root package name */
    public final int f13864f;

    /* renamed from: g  reason: collision with root package name */
    public final Typeface f13865g;

    public c(int i, int i2, int i3, int i4, int i5, Typeface typeface) {
        this.f13860b = i;
        this.f13861c = i2;
        this.f13862d = i3;
        this.f13863e = i4;
        this.f13864f = i5;
        this.f13865g = typeface;
    }

    public static c a(CaptioningManager.CaptionStyle captionStyle) {
        return ai.f13525a >= 21 ? c(captionStyle) : b(captionStyle);
    }

    private static c b(CaptioningManager.CaptionStyle captionStyle) {
        return new c(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    private static c c(CaptioningManager.CaptionStyle captionStyle) {
        return new c(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f13859a.f13860b, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f13859a.f13861c, captionStyle.hasWindowColor() ? captionStyle.windowColor : f13859a.f13862d, captionStyle.hasEdgeType() ? captionStyle.edgeType : f13859a.f13863e, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f13859a.f13864f, captionStyle.getTypeface());
    }
}
