package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.i.a;
import com.applovin.exoplayer2.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class b extends View implements SubtitleView.a {

    /* renamed from: a  reason: collision with root package name */
    private final List<i> f13853a;

    /* renamed from: b  reason: collision with root package name */
    private List<a> f13854b;

    /* renamed from: c  reason: collision with root package name */
    private int f13855c;

    /* renamed from: d  reason: collision with root package name */
    private float f13856d;

    /* renamed from: e  reason: collision with root package name */
    private c f13857e;

    /* renamed from: f  reason: collision with root package name */
    private float f13858f;

    public b(Context context) {
        this(context, (AttributeSet) null);
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13853a = new ArrayList();
        this.f13854b = Collections.emptyList();
        this.f13855c = 0;
        this.f13856d = 0.0533f;
        this.f13857e = c.f13859a;
        this.f13858f = 0.08f;
    }

    private static a a(a aVar) {
        a.C0125a a2 = aVar.a().a(-3.4028235E38f).b((int) RecyclerView.UNDEFINED_DURATION).a((Layout.Alignment) null);
        if (aVar.f12913g == 0) {
            a2.a(1.0f - aVar.f12912f, 0);
        } else {
            a2.a((-aVar.f12912f) - 1.0f, 1);
        }
        int i = aVar.f12914h;
        if (i == 0) {
            a2.a(2);
        } else if (i == 2) {
            a2.a(0);
        }
        return a2.e();
    }

    public void a(List<a> list, c cVar, float f2, int i, float f3) {
        this.f13854b = list;
        this.f13857e = cVar;
        this.f13856d = f2;
        this.f13855c = i;
        this.f13858f = f3;
        while (this.f13853a.size() < list.size()) {
            this.f13853a.add(new i(getContext()));
        }
        invalidate();
    }

    public void dispatchDraw(Canvas canvas) {
        List<a> list = this.f13854b;
        if (!list.isEmpty()) {
            int height = getHeight();
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int paddingBottom = height - getPaddingBottom();
            if (paddingBottom > paddingTop && width > paddingLeft) {
                int i = paddingBottom - paddingTop;
                float a2 = j.a(this.f13855c, this.f13856d, height, i);
                if (a2 > 0.0f) {
                    int size = list.size();
                    int i2 = 0;
                    while (i2 < size) {
                        a aVar = list.get(i2);
                        if (aVar.q != Integer.MIN_VALUE) {
                            aVar = a(aVar);
                        }
                        a aVar2 = aVar;
                        float f2 = a2;
                        int i3 = paddingBottom;
                        this.f13853a.get(i2).a(aVar2, this.f13857e, f2, j.a(aVar2.o, aVar2.p, height, i), this.f13858f, canvas, paddingLeft, paddingTop, width, i3);
                        i2++;
                        size = size;
                        i = i;
                        paddingBottom = i3;
                        width = width;
                    }
                }
            }
        }
    }
}
