package com.bytedance.sdk.component.adexpress.dynamic.animation.a;

import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.b.a;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AnimationSets */
public class b implements c {

    /* renamed from: a  reason: collision with root package name */
    List<d> f18452a = new ArrayList();

    public b(View view, List<a> list) {
        for (a a2 : list) {
            d a3 = c.a().a(view, a2);
            if (a3 != null) {
                this.f18452a.add(a3);
            }
        }
    }

    public void a() {
        for (d c2 : this.f18452a) {
            try {
                c2.c();
            } catch (Exception unused) {
            }
        }
    }

    public void b() {
        for (d b2 : this.f18452a) {
            try {
                b2.b();
            } catch (Exception unused) {
            }
        }
    }
}
