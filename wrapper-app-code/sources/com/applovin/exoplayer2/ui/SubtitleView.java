package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.ak;
import com.applovin.exoplayer2.am;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.h.ad;
import com.applovin.exoplayer2.i.a;
import com.applovin.exoplayer2.j.h;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.m.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SubtitleView extends FrameLayout implements an.d {

    /* renamed from: a  reason: collision with root package name */
    private List<com.applovin.exoplayer2.i.a> f13842a;

    /* renamed from: b  reason: collision with root package name */
    private c f13843b;

    /* renamed from: c  reason: collision with root package name */
    private int f13844c;

    /* renamed from: d  reason: collision with root package name */
    private float f13845d;

    /* renamed from: e  reason: collision with root package name */
    private float f13846e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f13847f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f13848g;

    /* renamed from: h  reason: collision with root package name */
    private int f13849h;
    private a i;
    private View j;

    interface a {
        void a(List<com.applovin.exoplayer2.i.a> list, c cVar, float f2, int i, float f3);
    }

    public SubtitleView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13842a = Collections.emptyList();
        this.f13843b = c.f13859a;
        this.f13844c = 0;
        this.f13845d = 0.0533f;
        this.f13846e = 0.08f;
        this.f13847f = true;
        this.f13848g = true;
        b bVar = new b(context);
        this.i = bVar;
        this.j = bVar;
        addView(bVar);
        this.f13849h = 1;
    }

    private com.applovin.exoplayer2.i.a a(com.applovin.exoplayer2.i.a aVar) {
        a.C0125a a2 = aVar.a();
        if (!this.f13847f) {
            j.a(a2);
        } else if (!this.f13848g) {
            j.b(a2);
        }
        return a2.e();
    }

    private void a(int i2, float f2) {
        this.f13844c = i2;
        this.f13845d = f2;
        e();
    }

    private void e() {
        this.i.a(getCuesWithStylingPreferencesApplied(), this.f13843b, this.f13845d, this.f13844c, this.f13846e);
    }

    private List<com.applovin.exoplayer2.i.a> getCuesWithStylingPreferencesApplied() {
        if (this.f13847f && this.f13848g) {
            return this.f13842a;
        }
        ArrayList arrayList = new ArrayList(this.f13842a.size());
        for (int i2 = 0; i2 < this.f13842a.size(); i2++) {
            arrayList.add(a(this.f13842a.get(i2)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (ai.f13525a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private c getUserCaptionStyle() {
        if (ai.f13525a < 19 || isInEditMode()) {
            return c.f13859a;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        return (captioningManager == null || !captioningManager.isEnabled()) ? c.f13859a : c.a(captioningManager.getUserStyle());
    }

    private <T extends View & a> void setView(T t) {
        removeView(this.j);
        View view = this.j;
        if (view instanceof l) {
            ((l) view).a();
        }
        this.j = t;
        this.i = (a) t;
        addView(t);
    }

    public /* synthetic */ void a() {
        an.d.CC.$default$a(this);
    }

    public /* synthetic */ void a(float f2) {
        an.d.CC.$default$a((an.d) this, f2);
    }

    public void a(float f2, boolean z) {
        a(z ? 1 : 0, f2);
    }

    public /* synthetic */ void a(int i2, int i3) {
        an.d.CC.$default$a((an.d) this, i2, i3);
    }

    public /* synthetic */ void a(int i2, boolean z) {
        an.d.CC.$default$a((an.d) this, i2, z);
    }

    public /* synthetic */ void a(ab abVar, int i2) {
        an.d.CC.$default$a((an.d) this, abVar, i2);
    }

    public /* synthetic */ void a(ac acVar) {
        an.d.CC.$default$a((an.d) this, acVar);
    }

    public /* synthetic */ void a(ak akVar) {
        an.d.CC.$default$a((an.d) this, akVar);
    }

    public /* synthetic */ void a(am amVar) {
        an.d.CC.$default$a((an.d) this, amVar);
    }

    public /* synthetic */ void a(an.a aVar) {
        an.d.CC.$default$a((an.d) this, aVar);
    }

    public /* synthetic */ void a(an.e eVar, an.e eVar2, int i2) {
        an.d.CC.$default$a(this, eVar, eVar2, i2);
    }

    public /* synthetic */ void a(an anVar, an.c cVar) {
        an.d.CC.$default$a((an.d) this, anVar, cVar);
    }

    public /* synthetic */ void a(ba baVar, int i2) {
        an.d.CC.$default$a((an.d) this, baVar, i2);
    }

    public /* synthetic */ void a(com.applovin.exoplayer2.g.a aVar) {
        an.d.CC.$default$a((an.d) this, aVar);
    }

    public /* synthetic */ void a(ad adVar, h hVar) {
        an.d.CC.$default$a((an.d) this, adVar, hVar);
    }

    public /* synthetic */ void a(o oVar) {
        an.d.CC.$default$a((an.d) this, oVar);
    }

    public /* synthetic */ void a(com.applovin.exoplayer2.o oVar) {
        an.d.CC.$default$a((an.d) this, oVar);
    }

    public void a(List<com.applovin.exoplayer2.i.a> list) {
        setCues(list);
    }

    @Deprecated
    public /* synthetic */ void a(boolean z, int i2) {
        an.b.CC.$default$a((an.b) this, z, i2);
    }

    public /* synthetic */ void a_(boolean z) {
        an.d.CC.$default$a_(this, z);
    }

    @Deprecated
    public /* synthetic */ void b() {
        an.b.CC.$default$b(this);
    }

    public /* synthetic */ void b(int i2) {
        an.d.CC.$default$b((an.d) this, i2);
    }

    public /* synthetic */ void b(ak akVar) {
        an.d.CC.$default$b((an.d) this, akVar);
    }

    public /* synthetic */ void b(boolean z, int i2) {
        an.d.CC.$default$b(this, z, i2);
    }

    public /* synthetic */ void b_(boolean z) {
        an.d.CC.$default$b_(this, z);
    }

    public void c() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public /* synthetic */ void c(int i2) {
        an.d.CC.$default$c(this, i2);
    }

    @Deprecated
    public /* synthetic */ void c(boolean z) {
        an.b.CC.$default$c((an.b) this, z);
    }

    public void d() {
        setStyle(getUserCaptionStyle());
    }

    public /* synthetic */ void d(int i2) {
        an.d.CC.$default$d((an.d) this, i2);
    }

    public /* synthetic */ void d(boolean z) {
        an.d.CC.$default$d((an.d) this, z);
    }

    @Deprecated
    public /* synthetic */ void e(int i2) {
        an.b.CC.$default$e((an.b) this, i2);
    }

    public /* synthetic */ void e(boolean z) {
        an.d.CC.$default$e(this, z);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.f13848g = z;
        e();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.f13847f = z;
        e();
    }

    public void setBottomPaddingFraction(float f2) {
        this.f13846e = f2;
        e();
    }

    public void setCues(List<com.applovin.exoplayer2.i.a> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f13842a = list;
        e();
    }

    public void setFractionalTextSize(float f2) {
        a(f2, false);
    }

    public void setStyle(c cVar) {
        this.f13843b = cVar;
        e();
    }

    public void setViewType(int i2) {
        View view;
        if (this.f13849h != i2) {
            if (i2 == 1) {
                view = new b(getContext());
            } else if (i2 == 2) {
                view = new l(getContext());
            } else {
                throw new IllegalArgumentException();
            }
            setView(view);
            this.f13849h = i2;
        }
    }
}
