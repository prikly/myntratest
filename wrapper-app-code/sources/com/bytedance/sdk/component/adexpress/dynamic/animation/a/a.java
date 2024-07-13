package com.bytedance.sdk.component.adexpress.dynamic.animation.a;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AlphaAnimation */
public class a extends d {
    public a(View view, com.bytedance.sdk.component.adexpress.dynamic.b.a aVar) {
        super(view, aVar);
    }

    /* access modifiers changed from: package-private */
    public List<ObjectAnimator> a() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f18456c, "alpha", new float[]{((float) this.f18455b.q()) / 100.0f, ((float) this.f18455b.r()) / 100.0f}).setDuration((long) ((int) (this.f18455b.i() * 1000.0d)));
        ArrayList arrayList = new ArrayList();
        arrayList.add(a(duration));
        return arrayList;
    }
}
