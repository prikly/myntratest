package com.bytedance.sdk.component.adexpress.b;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.b.i;

/* compiled from: NativeRenderInterceptor */
public class e implements i {

    /* renamed from: a  reason: collision with root package name */
    private Context f18365a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public a f18366b;

    /* renamed from: c  reason: collision with root package name */
    private l f18367c;

    public void a() {
    }

    public void b() {
    }

    public void c() {
    }

    public e(Context context, l lVar, a aVar) {
        this.f18365a = context;
        this.f18366b = aVar;
        this.f18367c = lVar;
    }

    public boolean a(final i.a aVar) {
        this.f18367c.c().d();
        this.f18366b.a(new f() {
            public void a(View view, m mVar) {
                if (!aVar.c()) {
                    n b2 = aVar.b();
                    if (b2 != null) {
                        b2.a(e.this.f18366b, mVar);
                    }
                    aVar.a(true);
                }
            }

            public void a(int i) {
                n b2 = aVar.b();
                if (b2 != null) {
                    b2.a_(i);
                }
            }
        });
        return true;
    }

    public void a(c cVar) {
        this.f18366b.a(cVar);
    }
}
