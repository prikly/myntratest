package com.bytedance.sdk.component.adexpress.dynamic.animation.a;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.b.a;
import com.bytedance.sdk.component.utils.t;
import java.util.ArrayList;
import java.util.List;

/* compiled from: RippleAnimation */
public class f extends d {
    public f(View view, a aVar) {
        super(view, aVar);
    }

    /* access modifiers changed from: package-private */
    public List<ObjectAnimator> a() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f18456c, "rippleValue", new float[]{0.0f, 1.0f}).setDuration((long) ((int) (this.f18455b.i() * 1000.0d)));
        this.f18456c.setTag(t.e(this.f18456c.getContext(), "tt_id_ripple_bg"), this.f18455b.g());
        ArrayList arrayList = new ArrayList();
        arrayList.add(a(duration));
        return arrayList;
    }
}
