package com.bytedance.sdk.component.adexpress.b;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.b.i;
import com.bytedance.sdk.component.adexpress.dynamic.a.a;
import com.bytedance.sdk.component.adexpress.dynamic.c;
import com.bytedance.sdk.component.adexpress.dynamic.c.h;
import com.bytedance.sdk.component.adexpress.dynamic.c.i;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;

/* compiled from: DynamicRenderInterceptor */
public class b implements i {

    /* renamed from: a  reason: collision with root package name */
    private Context f18357a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public a f18358b;

    /* renamed from: c  reason: collision with root package name */
    private ThemeStatusBroadcastReceiver f18359c;

    /* renamed from: d  reason: collision with root package name */
    private g f18360d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public l f18361e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f18362f;

    public void b() {
    }

    public void c() {
    }

    public b(Context context, l lVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z, i iVar, g gVar, com.bytedance.sdk.component.adexpress.dynamic.d.a aVar) {
        this.f18357a = context;
        this.f18361e = lVar;
        this.f18359c = themeStatusBroadcastReceiver;
        this.f18360d = gVar;
        a aVar2 = new a(context, themeStatusBroadcastReceiver, z, iVar, lVar, aVar);
        this.f18358b = aVar2;
        aVar2.a(this.f18360d);
        if (iVar instanceof h) {
            this.f18362f = 3;
        } else {
            this.f18362f = 2;
        }
    }

    public boolean a(final i.a aVar) {
        this.f18361e.c().b(this.f18362f);
        this.f18358b.a((f) new f() {
            public void a(View view, m mVar) {
                if (!aVar.c()) {
                    b.this.f18361e.c().f(b.this.f18362f);
                    b.this.f18361e.c().g(b.this.f18362f);
                    b.this.f18361e.c().h();
                    n b2 = aVar.b();
                    if (b2 != null) {
                        b2.a(b.this.f18358b, mVar);
                        aVar.a(true);
                    }
                }
            }

            public void a(int i) {
                b.this.f18361e.c().a(b.this.f18362f, i, aVar.b(b.this));
                if (aVar.b(b.this)) {
                    aVar.a((i) b.this);
                    return;
                }
                n b2 = aVar.b();
                if (b2 != null) {
                    b2.a_(i);
                }
            }
        });
        return true;
    }

    public void a() {
        a aVar = this.f18358b;
        if (aVar != null) {
            aVar.b();
        }
    }

    public c d() {
        a aVar = this.f18358b;
        if (aVar != null) {
            return aVar.d();
        }
        return null;
    }
}
