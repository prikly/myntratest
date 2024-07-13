package com.bytedance.sdk.component.adexpress.dynamic.animation.a;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.b.a;
import com.bytedance.sdk.component.utils.t;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShineAnimation */
public class i extends d {
    public i(View view, a aVar) {
        super(view, aVar);
    }

    /* access modifiers changed from: package-private */
    public List<ObjectAnimator> a() {
        this.f18456c.setTag(t.e(this.f18456c.getContext(), "tt_id_shine_width"), Integer.valueOf(this.f18455b.c()));
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f18456c, "shineValue", new float[]{0.0f, 1.0f}).setDuration((long) ((int) (this.f18455b.i() * 1000.0d)));
        ArrayList arrayList = new ArrayList();
        arrayList.add(a(duration));
        return arrayList;
    }
}
