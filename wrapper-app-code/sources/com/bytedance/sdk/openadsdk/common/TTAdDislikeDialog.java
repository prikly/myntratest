package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.dislike.TTDislikeListView;
import com.bytedance.sdk.openadsdk.dislike.c;
import com.bytedance.sdk.openadsdk.utils.v;
import java.util.ArrayList;

public class TTAdDislikeDialog extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private View f422a;

    /* renamed from: b  reason: collision with root package name */
    private TTDislikeListView f423b;

    /* renamed from: c  reason: collision with root package name */
    private TTDislikeListView f424c;

    /* renamed from: d  reason: collision with root package name */
    private RelativeLayout f425d;

    /* renamed from: e  reason: collision with root package name */
    private View f426e;

    /* renamed from: f  reason: collision with root package name */
    private c.b f427f;

    /* renamed from: g  reason: collision with root package name */
    private c.b f428g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public n f429h;
    /* access modifiers changed from: private */
    public a i;
    private boolean j;

    public interface a {
        void a(int i, FilterWord filterWord);

        void a(View view);

        void b(View view);

        void c(View view);
    }

    public TTAdDislikeDialog(Context context, n nVar) {
        this(context.getApplicationContext());
        this.f429h = nVar;
        c();
    }

    public TTAdDislikeDialog(Context context) {
        this(context, (AttributeSet) null);
    }

    public TTAdDislikeDialog(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTAdDislikeDialog(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.j = false;
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        setClickable(true);
        setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTAdDislikeDialog.this.b();
            }
        });
        setBackgroundColor(Color.parseColor("#80000000"));
        this.f422a = LayoutInflater.from(context).inflate(t.f(context, "tt_dislike_dialog_layout"), this, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = v.e(getContext(), 20.0f);
        layoutParams.rightMargin = v.e(getContext(), 20.0f);
        this.f422a.setLayoutParams(layoutParams);
        this.f422a.setClickable(true);
        d();
        c();
    }

    private void c() {
        if (this.f429h != null) {
            LayoutInflater from = LayoutInflater.from(getContext());
            c.b bVar = new c.b(from, this.f429h.ae());
            this.f427f = bVar;
            this.f423b.setAdapter(bVar);
            c.b bVar2 = new c.b(from, new ArrayList());
            this.f428g = bVar2;
            bVar2.a(false);
            this.f424c.setAdapter(this.f428g);
            this.f423b.setMaterialMeta(this.f429h);
            this.f424c.setMaterialMeta(this.f429h);
        }
    }

    private void d() {
        this.f425d = (RelativeLayout) this.f422a.findViewById(t.e(getContext(), "tt_dislike_title_content"));
        this.f426e = this.f422a.findViewById(t.e(getContext(), "tt_dislike_line1"));
        TextView textView = (TextView) this.f422a.findViewById(t.e(getContext(), "tt_dislike_header_back"));
        textView.setText(t.a(getContext(), "tt_dislike_header_tv_back"));
        ((TextView) this.f422a.findViewById(t.e(getContext(), "tt_dislike_header_tv"))).setText(t.a(getContext(), "tt_dislike_header_tv_title"));
        textView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTAdDislikeDialog.this.e();
                if (TTAdDislikeDialog.this.i != null) {
                    TTAdDislikeDialog.this.i.c(view);
                }
            }
        });
        TTDislikeListView tTDislikeListView = (TTDislikeListView) this.f422a.findViewById(t.e(getContext(), "tt_filer_words_lv"));
        this.f423b = tTDislikeListView;
        tTDislikeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* JADX WARNING: type inference failed for: r1v0, types: [android.widget.AdapterView<?>, android.widget.AdapterView] */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                /*
                    r0 = this;
                    android.widget.Adapter r1 = r1.getAdapter()     // Catch:{ all -> 0x0027 }
                    java.lang.Object r1 = r1.getItem(r3)     // Catch:{ all -> 0x0027 }
                    com.bytedance.sdk.openadsdk.FilterWord r1 = (com.bytedance.sdk.openadsdk.FilterWord) r1     // Catch:{ all -> 0x0027 }
                    boolean r2 = r1.hasSecondOptions()     // Catch:{ all -> 0x0027 }
                    if (r2 == 0) goto L_0x0028
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r2 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this     // Catch:{ all -> 0x0027 }
                    r2.a((com.bytedance.sdk.openadsdk.FilterWord) r1)     // Catch:{ all -> 0x0027 }
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r2 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this     // Catch:{ all -> 0x0027 }
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog$a r2 = r2.i     // Catch:{ all -> 0x0027 }
                    if (r2 == 0) goto L_0x0026
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r2 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this     // Catch:{ all -> 0x0027 }
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog$a r2 = r2.i     // Catch:{ all -> 0x0027 }
                    r2.a(r3, r1)     // Catch:{ all -> 0x0027 }
                L_0x0026:
                    return
                L_0x0027:
                L_0x0028:
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r1 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog$a r1 = r1.i
                    if (r1 == 0) goto L_0x0049
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r1 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this     // Catch:{ all -> 0x0049 }
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog$a r1 = r1.i     // Catch:{ all -> 0x0049 }
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r2 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this     // Catch:{ all -> 0x0049 }
                    com.bytedance.sdk.openadsdk.core.e.n r2 = r2.f429h     // Catch:{ all -> 0x0049 }
                    java.util.List r2 = r2.ae()     // Catch:{ all -> 0x0049 }
                    java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0049 }
                    com.bytedance.sdk.openadsdk.FilterWord r2 = (com.bytedance.sdk.openadsdk.FilterWord) r2     // Catch:{ all -> 0x0049 }
                    r1.a(r3, r2)     // Catch:{ all -> 0x0049 }
                L_0x0049:
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r1 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this
                    r1.b()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.AnonymousClass3.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
            }
        });
        TTDislikeListView tTDislikeListView2 = (TTDislikeListView) this.f422a.findViewById(t.e(getContext(), "tt_filer_words_lv_second"));
        this.f424c = tTDislikeListView2;
        tTDislikeListView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* JADX WARNING: type inference failed for: r1v0, types: [android.widget.AdapterView<?>, android.widget.AdapterView] */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                /*
                    r0 = this;
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r2 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog$a r2 = r2.i
                    if (r2 == 0) goto L_0x001b
                    android.widget.Adapter r1 = r1.getAdapter()     // Catch:{ all -> 0x001b }
                    java.lang.Object r1 = r1.getItem(r3)     // Catch:{ all -> 0x001b }
                    com.bytedance.sdk.openadsdk.FilterWord r1 = (com.bytedance.sdk.openadsdk.FilterWord) r1     // Catch:{ all -> 0x001b }
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r2 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this     // Catch:{ all -> 0x001b }
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog$a r2 = r2.i     // Catch:{ all -> 0x001b }
                    r2.a(r3, r1)     // Catch:{ all -> 0x001b }
                L_0x001b:
                    com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog r1 = com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.this
                    r1.b()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.AnonymousClass4.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
            }
        });
    }

    public void a() {
        if (this.f422a.getParent() == null) {
            addView(this.f422a);
        }
        e();
        setVisibility(0);
        this.j = true;
        a aVar = this.i;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void b() {
        setVisibility(8);
        this.j = false;
        a aVar = this.i;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void setCallback(a aVar) {
        this.i = aVar;
    }

    /* access modifiers changed from: private */
    public void e() {
        RelativeLayout relativeLayout = this.f425d;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        View view = this.f426e;
        if (view != null) {
            view.setVisibility(8);
        }
        TTDislikeListView tTDislikeListView = this.f423b;
        if (tTDislikeListView != null) {
            tTDislikeListView.setVisibility(0);
        }
        c.b bVar = this.f428g;
        if (bVar != null) {
            bVar.a();
        }
        TTDislikeListView tTDislikeListView2 = this.f424c;
        if (tTDislikeListView2 != null) {
            tTDislikeListView2.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public void a(FilterWord filterWord) {
        if (filterWord != null) {
            c.b bVar = this.f428g;
            if (bVar != null) {
                bVar.a(filterWord.getOptions());
            }
            RelativeLayout relativeLayout = this.f425d;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            View view = this.f426e;
            if (view != null) {
                view.setVisibility(0);
            }
            TTDislikeListView tTDislikeListView = this.f423b;
            if (tTDislikeListView != null) {
                tTDislikeListView.setVisibility(8);
            }
            TTDislikeListView tTDislikeListView2 = this.f424c;
            if (tTDislikeListView2 != null) {
                tTDislikeListView2.setVisibility(0);
            }
        }
    }
}
