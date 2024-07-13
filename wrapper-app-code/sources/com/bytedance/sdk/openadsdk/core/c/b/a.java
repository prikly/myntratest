package com.bytedance.sdk.openadsdk.core.c.b;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.adexpress.b.j;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.core.b.c;
import com.bytedance.sdk.openadsdk.core.e.j;
import com.bytedance.sdk.openadsdk.utils.v;
import java.lang.ref.WeakReference;

/* compiled from: DynamicClickListener */
public class a extends c implements com.bytedance.sdk.component.adexpress.dynamic.d.a {

    /* renamed from: a  reason: collision with root package name */
    protected WeakReference<View> f1015a;

    /* renamed from: b  reason: collision with root package name */
    protected WeakReference<View> f1016b;

    /* renamed from: c  reason: collision with root package name */
    private j f1017c;

    public void a(j jVar) {
        this.f1017c = jVar;
    }

    public void a(View view) {
        this.f1015a = new WeakReference<>(view);
    }

    public void b(View view) {
        this.f1016b = new WeakReference<>(view);
    }

    public void a(View view, float f2, float f3, float f4, float f5, SparseArray<c.a> sparseArray, boolean z) {
        a(view, ((Integer) view.getTag()).intValue(), f2, f3, f4, f5, sparseArray);
    }

    private void a(View view, int i, float f2, float f3, float f4, float f5, SparseArray<c.a> sparseArray) {
        if (this.f1017c != null) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            WeakReference<View> weakReference = this.f1016b;
            if (weakReference != null) {
                int[] a2 = v.a((View) weakReference.get());
                if (a2 != null) {
                    iArr = a2;
                }
                int[] c2 = v.c((View) this.f1016b.get());
                if (c2 != null) {
                    iArr2 = c2;
                }
            }
            String str = "";
            try {
                if (view.getTag(t.e(view.getContext(), "tt_id_click_area_type")) != null) {
                    str = String.valueOf(view.getTag(t.e(view.getContext(), "tt_id_click_area_type")));
                }
            } catch (Exception unused) {
            }
            this.f1017c.a(view, i, new j.a().d(f2).c(f3).b(f4).a(f5).b(this.w).a(this.x).c(iArr[0]).d(iArr[1]).e(iArr2[0]).f(iArr2[1]).a(sparseArray).a(this.C).a(str).a());
        }
    }
}
