package com.bytedance.sdk.component.adexpress.dynamic.animation.a;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.b.a;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.utils.t;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ScaleAnimation */
public class h extends d {
    public h(View view, a aVar) {
        super(view, aVar);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 != null && (viewGroup2 instanceof DynamicBaseWidget)) {
                viewGroup2.setClipChildren(false);
                viewGroup2.setClipToPadding(false);
                ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
                if (viewGroup3 != null && (viewGroup3 instanceof DynamicBaseWidget)) {
                    viewGroup3.setClipChildren(false);
                    viewGroup3.setClipToPadding(false);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public List<ObjectAnimator> a() {
        this.f18456c.setTag(t.e(this.f18456c.getContext(), "tt_id_direction"), this.f18455b.a());
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f18456c, "scaleX", new float[]{1.0f, (float) this.f18455b.j()}).setDuration((long) ((int) (this.f18455b.i() * 1000.0d)));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f18456c, "scaleY", new float[]{1.0f, (float) this.f18455b.k()}).setDuration((long) ((int) (this.f18455b.i() * 1000.0d)));
        ArrayList arrayList = new ArrayList();
        arrayList.add(a(duration));
        arrayList.add(a(duration2));
        return arrayList;
    }
}
