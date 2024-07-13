package com.applovin.impl.mediation.debugger.ui.a;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.mediation.debugger.b.a.e;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

class b extends d {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.mediation.debugger.b.a.a f14758a;

    /* renamed from: b  reason: collision with root package name */
    private final com.applovin.impl.mediation.debugger.b.a.b f14759b;

    /* renamed from: d  reason: collision with root package name */
    private final List<c> f14760d = b();

    /* renamed from: e  reason: collision with root package name */
    private final List<c> f14761e = c();

    /* renamed from: f  reason: collision with root package name */
    private final List<c> f14762f = d();

    class a extends com.applovin.impl.mediation.debugger.ui.b.a.a {
        private final com.applovin.impl.mediation.debugger.b.a.b o;

        a(com.applovin.impl.mediation.debugger.b.a.b bVar, String str, boolean z) {
            super(bVar.a().c(), b.this.f14883c);
            this.o = bVar;
            this.f14860d = StringUtils.createSpannedString(bVar.a().b(), -16777216, 18, 1);
            this.f14861e = !TextUtils.isEmpty(str) ? new SpannedString(str) : null;
            this.f14859c = z;
        }

        public boolean c() {
            return this.f14859c;
        }

        public com.applovin.impl.mediation.debugger.b.a.b d() {
            return this.o;
        }

        public int e() {
            return -12303292;
        }
    }

    /* renamed from: com.applovin.impl.mediation.debugger.ui.a.b$b  reason: collision with other inner class name */
    enum C0148b {
        INFO,
        BIDDERS,
        WATERFALL,
        f14767d
    }

    b(com.applovin.impl.mediation.debugger.b.a.a aVar, com.applovin.impl.mediation.debugger.b.a.b bVar, Context context) {
        super(context);
        this.f14758a = aVar;
        this.f14759b = bVar;
        notifyDataSetChanged();
    }

    private List<c> b() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(f());
        arrayList.add(g());
        if (this.f14759b != null) {
            arrayList.add(h());
        }
        return arrayList;
    }

    private List<c> c() {
        com.applovin.impl.mediation.debugger.b.a.b bVar = this.f14759b;
        if (bVar != null && !bVar.c()) {
            return new ArrayList();
        }
        List<com.applovin.impl.mediation.debugger.b.a.b> a2 = this.f14758a.e().a();
        ArrayList arrayList = new ArrayList(a2.size());
        for (com.applovin.impl.mediation.debugger.b.a.b next : a2) {
            com.applovin.impl.mediation.debugger.b.a.b bVar2 = this.f14759b;
            if (bVar2 == null || bVar2.a().a().equals(next.a().a())) {
                arrayList.add(new a(next, next.b() != null ? next.b().a() : "", this.f14759b == null));
            }
        }
        return arrayList;
    }

    private List<c> d() {
        com.applovin.impl.mediation.debugger.b.a.b bVar = this.f14759b;
        if (bVar != null && bVar.c()) {
            return new ArrayList();
        }
        List<com.applovin.impl.mediation.debugger.b.a.b> b2 = this.f14758a.e().b();
        ArrayList arrayList = new ArrayList(b2.size());
        for (com.applovin.impl.mediation.debugger.b.a.b next : b2) {
            com.applovin.impl.mediation.debugger.b.a.b bVar2 = this.f14759b;
            if (bVar2 == null || bVar2.a().a().equals(next.a().a())) {
                arrayList.add(new a(next, (String) null, this.f14759b == null));
                for (e next2 : next.d()) {
                    arrayList.add(c.p().a(next2.a()).b(next2.b()).b(true).a());
                }
            }
        }
        return arrayList;
    }

    private c f() {
        return c.p().a("ID").b(this.f14758a.a()).a();
    }

    private c g() {
        return c.p().a("Ad Format").b(this.f14758a.c()).a();
    }

    private c h() {
        return c.p().a("Selected Network").b(this.f14759b.a().b()).a();
    }

    /* access modifiers changed from: protected */
    public int a(int i) {
        return (i == C0148b.INFO.ordinal() ? this.f14760d : i == C0148b.BIDDERS.ordinal() ? this.f14761e : this.f14762f).size();
    }

    public String a() {
        return this.f14758a.b();
    }

    /* access modifiers changed from: protected */
    public c b(int i) {
        return i == C0148b.INFO.ordinal() ? new com.applovin.impl.mediation.debugger.ui.d.e("INFO") : i == C0148b.BIDDERS.ordinal() ? new com.applovin.impl.mediation.debugger.ui.d.e("BIDDERS") : new com.applovin.impl.mediation.debugger.ui.d.e("WATERFALL");
    }

    /* access modifiers changed from: protected */
    public List<c> c(int i) {
        return i == C0148b.INFO.ordinal() ? this.f14760d : i == C0148b.BIDDERS.ordinal() ? this.f14761e : this.f14762f;
    }

    /* access modifiers changed from: protected */
    public int e() {
        return C0148b.f14767d.ordinal();
    }
}
