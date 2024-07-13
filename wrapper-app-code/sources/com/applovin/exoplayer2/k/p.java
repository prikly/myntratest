package com.applovin.exoplayer2.k;

import android.content.Context;
import com.applovin.exoplayer2.k.i;
import com.applovin.exoplayer2.k.q;

@Deprecated
public final class p implements i.a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f13418a;

    /* renamed from: b  reason: collision with root package name */
    private final aa f13419b;

    /* renamed from: c  reason: collision with root package name */
    private final i.a f13420c;

    public p(Context context, aa aaVar, i.a aVar) {
        this.f13418a = context.getApplicationContext();
        this.f13419b = aaVar;
        this.f13420c = aVar;
    }

    public p(Context context, String str) {
        this(context, str, (aa) null);
    }

    public p(Context context, String str, aa aaVar) {
        this(context, aaVar, (i.a) new q.a().a(str));
    }

    /* renamed from: b */
    public o a() {
        o oVar = new o(this.f13418a, this.f13420c.a());
        aa aaVar = this.f13419b;
        if (aaVar != null) {
            oVar.a(aaVar);
        }
        return oVar;
    }
}
