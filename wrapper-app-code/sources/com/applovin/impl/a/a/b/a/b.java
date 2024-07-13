package com.applovin.impl.a.a.b.a;

import android.app.Activity;
import android.content.Context;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.mediation.debugger.ui.d.e;
import com.applovin.impl.sdk.n;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class b extends d {

    /* renamed from: a  reason: collision with root package name */
    private n f13978a;

    /* renamed from: b  reason: collision with root package name */
    private List<com.applovin.impl.a.a.a.a> f13979b;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f13980d = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    private List<c> f13981e = new ArrayList();

    public enum a {
        RECENT_ADS,
        f13984b
    }

    public b(Context context) {
        super(context);
    }

    private List<c> a(List<com.applovin.impl.a.a.a.a> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (com.applovin.impl.a.a.a.a aVar : list) {
            arrayList.add(new com.applovin.impl.a.a.b.a.a.a(aVar, this.f14883c));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public int a(int i) {
        return this.f13981e.size();
    }

    public void a() {
        this.f13980d.compareAndSet(true, false);
    }

    public void a(List<com.applovin.impl.a.a.a.a> list, n nVar) {
        Activity ar;
        this.f13978a = nVar;
        this.f13979b = list;
        if (!(this.f14883c instanceof Activity) && (ar = nVar.ar()) != null) {
            this.f14883c = ar;
        }
        if (list != null && this.f13980d.compareAndSet(false, true)) {
            this.f13981e = a(this.f13979b);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                b.this.notifyDataSetChanged();
            }
        });
    }

    /* access modifiers changed from: protected */
    public c b(int i) {
        return new e("RECENT ADS");
    }

    public boolean b() {
        return this.f13981e.size() == 0;
    }

    public n c() {
        return this.f13978a;
    }

    /* access modifiers changed from: protected */
    public List<c> c(int i) {
        return this.f13981e;
    }

    public List<com.applovin.impl.a.a.a.a> d() {
        return this.f13979b;
    }

    /* access modifiers changed from: protected */
    public int e() {
        return a.f13984b.ordinal();
    }

    public String toString() {
        return "CreativeDebuggerListAdapter{isInitialized=" + this.f13980d.get() + "}";
    }
}
