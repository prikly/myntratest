package com.applovin.exoplayer2.k;

import com.applovin.exoplayer2.k.i;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.ai;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class e implements i {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f13349a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<aa> f13350b = new ArrayList<>(1);

    /* renamed from: c  reason: collision with root package name */
    private int f13351c;

    /* renamed from: d  reason: collision with root package name */
    private l f13352d;

    protected e(boolean z) {
        this.f13349a = z;
    }

    /* access modifiers changed from: protected */
    public final void a(int i) {
        l lVar = (l) ai.a(this.f13352d);
        for (int i2 = 0; i2 < this.f13351c; i2++) {
            this.f13350b.get(i2).a(this, lVar, this.f13349a, i);
        }
    }

    public final void a(aa aaVar) {
        a.b(aaVar);
        if (!this.f13350b.contains(aaVar)) {
            this.f13350b.add(aaVar);
            this.f13351c++;
        }
    }

    public /* synthetic */ Map<String, List<String>> b() {
        return i.CC.$default$b(this);
    }

    /* access modifiers changed from: protected */
    public final void b(l lVar) {
        for (int i = 0; i < this.f13351c; i++) {
            this.f13350b.get(i).a(this, lVar, this.f13349a);
        }
    }

    /* access modifiers changed from: protected */
    public final void c(l lVar) {
        this.f13352d = lVar;
        for (int i = 0; i < this.f13351c; i++) {
            this.f13350b.get(i).b(this, lVar, this.f13349a);
        }
    }

    /* access modifiers changed from: protected */
    public final void d() {
        l lVar = (l) ai.a(this.f13352d);
        for (int i = 0; i < this.f13351c; i++) {
            this.f13350b.get(i).c(this, lVar, this.f13349a);
        }
        this.f13352d = null;
    }
}
