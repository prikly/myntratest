package com.applovin.impl.mediation.debugger.ui.d;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.g;
import com.applovin.sdk.R;

public class c {

    /* renamed from: b  reason: collision with root package name */
    protected b f14858b;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f14859c;

    /* renamed from: d  reason: collision with root package name */
    protected SpannedString f14860d;

    /* renamed from: e  reason: collision with root package name */
    protected SpannedString f14861e;

    /* renamed from: f  reason: collision with root package name */
    protected String f14862f;

    /* renamed from: g  reason: collision with root package name */
    protected String f14863g;

    /* renamed from: h  reason: collision with root package name */
    protected int f14864h;
    protected int i;
    protected int j;
    protected int k;
    protected int l;
    protected int m;
    protected boolean n;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final b f14865a;

        /* renamed from: b  reason: collision with root package name */
        boolean f14866b;

        /* renamed from: c  reason: collision with root package name */
        SpannedString f14867c;

        /* renamed from: d  reason: collision with root package name */
        SpannedString f14868d;

        /* renamed from: e  reason: collision with root package name */
        String f14869e;

        /* renamed from: f  reason: collision with root package name */
        String f14870f;

        /* renamed from: g  reason: collision with root package name */
        int f14871g = 0;

        /* renamed from: h  reason: collision with root package name */
        int f14872h = 0;
        int i = -16777216;
        int j = -16777216;
        int k = 0;
        int l = 0;
        boolean m;

        public a(b bVar) {
            this.f14865a = bVar;
        }

        public a a(int i2) {
            this.f14872h = i2;
            return this;
        }

        public a a(Context context) {
            this.f14872h = R.drawable.applovin_ic_disclosure_arrow;
            this.l = g.a(R.color.applovin_sdk_disclosureButtonColor, context);
            return this;
        }

        public a a(SpannedString spannedString) {
            this.f14867c = spannedString;
            return this;
        }

        public a a(String str) {
            return a(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public a a(boolean z) {
            this.f14866b = z;
            return this;
        }

        public c a() {
            return new c(this);
        }

        public a b(int i2) {
            this.j = i2;
            return this;
        }

        public a b(SpannedString spannedString) {
            this.f14868d = spannedString;
            return this;
        }

        public a b(String str) {
            return b(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public a b(boolean z) {
            this.m = z;
            return this;
        }

        public a c(int i2) {
            this.l = i2;
            return this;
        }

        public a c(String str) {
            this.f14869e = str;
            return this;
        }

        public a d(String str) {
            this.f14870f = str;
            return this;
        }
    }

    public enum b {
        SECTION(0),
        SECTION_CENTERED(1),
        SIMPLE(2),
        DETAIL(3),
        RIGHT_DETAIL(4),
        f14878f(5);
        

        /* renamed from: g  reason: collision with root package name */
        private final int f14880g;

        private b(int i) {
            this.f14880g = i;
        }

        public int a() {
            return this.f14880g;
        }

        public int b() {
            if (this == SECTION) {
                return R.layout.mediation_debugger_list_section;
            }
            if (this == SECTION_CENTERED) {
                return R.layout.mediation_debugger_list_section_centered;
            }
            if (this == SIMPLE) {
                return 17367043;
            }
            return this == DETAIL ? R.layout.applovin_debugger_list_item_detail : R.layout.mediation_debugger_list_item_right_detail;
        }
    }

    private c(a aVar) {
        this.f14864h = 0;
        this.i = 0;
        this.j = -16777216;
        this.k = -16777216;
        this.l = 0;
        this.m = 0;
        this.f14858b = aVar.f14865a;
        this.f14859c = aVar.f14866b;
        this.f14860d = aVar.f14867c;
        this.f14861e = aVar.f14868d;
        this.f14862f = aVar.f14869e;
        this.f14863g = aVar.f14870f;
        this.f14864h = aVar.f14871g;
        this.i = aVar.f14872h;
        this.j = aVar.i;
        this.k = aVar.j;
        this.l = aVar.k;
        this.m = aVar.l;
        this.n = aVar.m;
    }

    protected c(b bVar) {
        this.f14864h = 0;
        this.i = 0;
        this.j = -16777216;
        this.k = -16777216;
        this.l = 0;
        this.m = 0;
        this.f14858b = bVar;
    }

    public static a a(b bVar) {
        return new a(bVar);
    }

    public static int h() {
        return b.f14878f.a();
    }

    public static a p() {
        return a(b.RIGHT_DETAIL);
    }

    public int a() {
        return this.i;
    }

    public int b() {
        return this.m;
    }

    public boolean c() {
        return this.f14859c;
    }

    public int e() {
        return this.k;
    }

    public int g() {
        return this.f14864h;
    }

    public int i() {
        return this.f14858b.a();
    }

    public SpannedString i_() {
        return this.f14861e;
    }

    public int j() {
        return this.f14858b.b();
    }

    public boolean j_() {
        return this.n;
    }

    public SpannedString k() {
        return this.f14860d;
    }

    public String l() {
        return this.f14862f;
    }

    public String m() {
        return this.f14863g;
    }

    public int n() {
        return this.j;
    }

    public int o() {
        return this.l;
    }
}
