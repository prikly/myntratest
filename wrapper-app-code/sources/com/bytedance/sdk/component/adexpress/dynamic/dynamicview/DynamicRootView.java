package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.b.j;
import com.bytedance.sdk.component.adexpress.b.l;
import com.bytedance.sdk.component.adexpress.b.m;
import com.bytedance.sdk.component.adexpress.dynamic.b;
import com.bytedance.sdk.component.adexpress.dynamic.b.e;
import com.bytedance.sdk.component.adexpress.dynamic.b.f;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;
import com.bytedance.sdk.component.adexpress.dynamic.c;
import com.bytedance.sdk.component.adexpress.dynamic.d;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.adexpress.theme.a;
import java.util.ArrayList;
import java.util.List;

public class DynamicRootView extends FrameLayout implements c, a {

    /* renamed from: a  reason: collision with root package name */
    protected final m f18607a;

    /* renamed from: b  reason: collision with root package name */
    boolean f18608b;

    /* renamed from: c  reason: collision with root package name */
    private j f18609c;

    /* renamed from: d  reason: collision with root package name */
    private DynamicBaseWidget f18610d;

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.d.a f18611e;

    /* renamed from: f  reason: collision with root package name */
    private ThemeStatusBroadcastReceiver f18612f;

    /* renamed from: g  reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.a f18613g;

    /* renamed from: h  reason: collision with root package name */
    private ViewGroup f18614h = null;
    private int i = 0;
    private List<b> j = new ArrayList();
    private d k;
    private int l = 0;
    private int m = 0;
    private l n;
    private Context o;
    private String p;

    public DynamicRootView(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z, l lVar, com.bytedance.sdk.component.adexpress.dynamic.d.a aVar) {
        super(context);
        this.o = context;
        m mVar = new m();
        this.f18607a = mVar;
        mVar.a(2);
        this.f18611e = aVar;
        aVar.a((View) this);
        this.f18612f = themeStatusBroadcastReceiver;
        themeStatusBroadcastReceiver.a(this);
        this.f18608b = z;
        this.n = lVar;
    }

    public String getBgColor() {
        return this.p;
    }

    public void setBgColor(String str) {
        this.p = str;
    }

    public void setRenderListener(j jVar) {
        this.f18609c = jVar;
        this.f18611e.a(jVar);
    }

    public void a(h hVar, int i2) {
        this.f18610d = a(hVar, (ViewGroup) this, i2);
        this.f18607a.a(true);
        this.f18607a.a((double) this.f18610d.f18590e);
        this.f18607a.b((double) this.f18610d.f18591f);
        this.f18609c.a(this.f18607a);
    }

    public DynamicBaseWidget a(h hVar, ViewGroup viewGroup, int i2) {
        if (hVar == null) {
            return null;
        }
        DynamicBaseWidget a2 = com.bytedance.sdk.component.adexpress.dynamic.a.b.a(this.o, this, hVar);
        if (a2 instanceof DynamicUnKnowView) {
            a(i2 == 3 ? 128 : 118);
            return null;
        }
        a(hVar);
        a2.c();
        if (viewGroup != null) {
            viewGroup.addView(a2);
            a(viewGroup, hVar);
        }
        List<h> j2 = hVar.j();
        if (j2 == null || j2.size() <= 0) {
            return null;
        }
        for (h a3 : j2) {
            a(a3, (ViewGroup) a2, i2);
        }
        return a2;
    }

    private void a(h hVar) {
        f e2;
        e i2 = hVar.i();
        if (i2 != null && (e2 = i2.e()) != null) {
            this.f18607a.b(e2.ak());
        }
    }

    private void a(ViewGroup viewGroup, h hVar) {
        ViewGroup viewGroup2;
        if (viewGroup != null && (viewGroup2 = (ViewGroup) viewGroup.getParent()) != null && hVar.t()) {
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
            if (viewGroup3 != null) {
                viewGroup3.setClipChildren(false);
                viewGroup3.setClipToPadding(false);
            }
        }
    }

    public void a(double d2, double d3, double d4, double d5, float f2) {
        this.f18607a.c(d2);
        this.f18607a.d(d3);
        this.f18607a.e(d4);
        this.f18607a.f(d5);
        this.f18607a.a(f2);
        this.f18607a.b(f2);
        this.f18607a.c(f2);
        this.f18607a.d(f2);
    }

    public void a(int i2) {
        this.f18607a.a(false);
        this.f18607a.b(i2);
        this.f18609c.a(this.f18607a);
    }

    public void setMuteListener(com.bytedance.sdk.component.adexpress.dynamic.a aVar) {
        this.f18613g = aVar;
    }

    public void setDislikeView(View view) {
        this.f18611e.b(view);
    }

    public j getRenderListener() {
        return this.f18609c;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.d.a getDynamicClickListener() {
        return this.f18611e;
    }

    public void b(int i2) {
        DynamicBaseWidget dynamicBaseWidget = this.f18610d;
        if (dynamicBaseWidget != null) {
            dynamicBaseWidget.a(i2);
        }
    }

    public void a(CharSequence charSequence, int i2, int i3) {
        for (int i4 = 0; i4 < this.j.size(); i4++) {
            if (this.j.get(i4) != null) {
                b bVar = this.j.get(i4);
                boolean z = true;
                if (i2 != 1) {
                    z = false;
                }
                bVar.a(charSequence, z, i3);
            }
        }
    }

    public void setSoundMute(boolean z) {
        com.bytedance.sdk.component.adexpress.dynamic.a aVar = this.f18613g;
        if (aVar != null) {
            aVar.setSoundMute(z);
        }
    }

    public void setTimeUpdate(int i2) {
        this.k.setTimeUpdate(i2);
    }

    public void f() {
        this.k.a();
    }

    public ViewGroup getTimeOut() {
        return this.f18614h;
    }

    public void setTimeOut(ViewGroup viewGroup) {
        this.f18614h = viewGroup;
    }

    public int getTimedown() {
        return this.i;
    }

    public void setTimedown(int i2) {
        this.i = i2;
    }

    public List<b> getTimeOutListener() {
        return this.j;
    }

    public void setTimeOutListener(b bVar) {
        this.j.add(bVar);
    }

    public void setVideoListener(d dVar) {
        this.k = dVar;
    }

    public int getScoreCountWithIcon() {
        return this.m;
    }

    public void setScoreCountWithIcon(int i2) {
        this.m = i2;
    }

    public int getLogoUnionHeight() {
        return this.l;
    }

    public void setLogoUnionHeight(int i2) {
        this.l = i2;
    }

    public l getRenderRequest() {
        return this.n;
    }
}
