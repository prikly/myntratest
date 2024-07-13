package com.applovin.impl.mediation.debugger.ui.d;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public TextView f14852a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f14853b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f14854c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f14855d;

    /* renamed from: e  reason: collision with root package name */
    private c f14856e;

    /* renamed from: f  reason: collision with root package name */
    private int f14857f;

    public int a() {
        return this.f14857f;
    }

    public void a(int i) {
        this.f14857f = i;
    }

    public void a(c cVar) {
        this.f14856e = cVar;
        this.f14852a.setText(cVar.k());
        this.f14852a.setTextColor(cVar.n());
        if (this.f14853b != null) {
            if (!TextUtils.isEmpty(cVar.i_())) {
                this.f14853b.setTypeface((Typeface) null, 0);
                this.f14853b.setVisibility(0);
                this.f14853b.setText(cVar.i_());
                this.f14853b.setTextColor(cVar.e());
                if (cVar.j_()) {
                    this.f14853b.setTypeface((Typeface) null, 1);
                }
            } else {
                this.f14853b.setVisibility(8);
            }
        }
        if (this.f14854c != null) {
            if (cVar.g() > 0) {
                this.f14854c.setImageResource(cVar.g());
                this.f14854c.setColorFilter(cVar.o());
                this.f14854c.setVisibility(0);
            } else {
                this.f14854c.setVisibility(8);
            }
        }
        if (this.f14855d == null) {
            return;
        }
        if (cVar.a() > 0) {
            this.f14855d.setImageResource(cVar.a());
            this.f14855d.setColorFilter(cVar.b());
            this.f14855d.setVisibility(0);
            return;
        }
        this.f14855d.setVisibility(8);
    }

    public c b() {
        return this.f14856e;
    }
}
