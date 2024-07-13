package com.bytedance.sdk.openadsdk.core.widget;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.core.m;

/* compiled from: CustomCommonDialog */
public class a extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public C0010a f1776a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f1777b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f1778c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f1779d;

    /* renamed from: e  reason: collision with root package name */
    private Button f1780e;

    /* renamed from: f  reason: collision with root package name */
    private Button f1781f;

    /* renamed from: g  reason: collision with root package name */
    private View f1782g;

    /* renamed from: h  reason: collision with root package name */
    private Context f1783h;
    private String i;
    private String j;
    private String k;
    private String l;
    private int m = -1;
    private boolean n = false;

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.a$a  reason: collision with other inner class name */
    /* compiled from: CustomCommonDialog */
    public interface C0010a {
        void a();

        void b();
    }

    public void onBackPressed() {
    }

    public a(Context context) {
        super(context, t.g(context, "tt_custom_dialog"));
        this.f1783h = context;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(t.f(this.f1783h, "tt_custom_dailog_layout"));
        setCanceledOnTouchOutside(false);
        c();
        b();
        a();
    }

    private void a() {
        this.f1781f.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (a.this.f1776a != null) {
                    a.this.f1776a.a();
                }
            }
        });
        this.f1780e.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (a.this.f1776a != null) {
                    a.this.f1776a.b();
                }
            }
        });
    }

    private void b() {
        if (!TextUtils.isEmpty(this.j)) {
            this.f1778c.setText(this.j);
            this.f1778c.setVisibility(0);
        } else {
            this.f1778c.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.i)) {
            this.f1779d.setText(this.i);
        }
        if (!TextUtils.isEmpty(this.k)) {
            this.f1781f.setText(this.k);
        } else {
            this.f1781f.setText(t.a(m.a(), "tt_postive_txt"));
        }
        if (!TextUtils.isEmpty(this.l)) {
            this.f1780e.setText(this.l);
        } else {
            this.f1780e.setText(t.a(m.a(), "tt_negtive_txt"));
        }
        int i2 = this.m;
        if (i2 != -1) {
            this.f1777b.setImageResource(i2);
            this.f1777b.setVisibility(0);
        } else {
            this.f1777b.setVisibility(8);
        }
        if (this.n) {
            this.f1782g.setVisibility(8);
            this.f1780e.setVisibility(8);
            return;
        }
        this.f1780e.setVisibility(0);
        this.f1782g.setVisibility(0);
    }

    public void show() {
        super.show();
        b();
    }

    private void c() {
        this.f1780e = (Button) findViewById(t.e(this.f1783h, "tt_negtive"));
        this.f1781f = (Button) findViewById(t.e(this.f1783h, "tt_positive"));
        this.f1778c = (TextView) findViewById(t.e(this.f1783h, "tt_title"));
        this.f1779d = (TextView) findViewById(t.e(this.f1783h, "tt_message"));
        this.f1777b = (ImageView) findViewById(t.e(this.f1783h, "tt_image"));
        this.f1782g = findViewById(t.e(this.f1783h, "tt_column_line"));
    }

    public a a(C0010a aVar) {
        this.f1776a = aVar;
        return this;
    }

    public a a(String str) {
        this.i = str;
        return this;
    }

    public a b(String str) {
        this.k = str;
        return this;
    }

    public a c(String str) {
        this.l = str;
        return this;
    }
}
