package com.bytedance.sdk.component.adexpress.dynamic.animation.a;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.sdk.component.adexpress.c;
import com.bytedance.sdk.component.adexpress.c.b;
import com.bytedance.sdk.component.adexpress.dynamic.b.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TranslateAnimation */
public class k extends d {
    public k(View view, a aVar) {
        super(view, aVar);
    }

    /* access modifiers changed from: package-private */
    public List<ObjectAnimator> a() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f18456c, "translationX", new float[]{b.a(c.a(), (float) this.f18455b.e()), 0.0f}).setDuration((long) ((int) (this.f18455b.i() * 1000.0d)));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f18456c, "translationY", new float[]{b.a(c.a(), (float) this.f18455b.f()), 0.0f}).setDuration((long) ((int) (this.f18455b.i() * 1000.0d)));
        ArrayList arrayList = new ArrayList();
        arrayList.add(a(duration));
        arrayList.add(a(duration2));
        return arrayList;
    }
}
