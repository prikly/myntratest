package com.bytedance.sdk.component.adexpress.dynamic.animation.a;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.b.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SwingAnimation */
public class j extends d {
    public j(View view, a aVar) {
        super(view, aVar);
    }

    /* access modifiers changed from: package-private */
    public List<ObjectAnimator> a() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f18456c, "rotation", new float[]{0.0f, (float) this.f18455b.d(), 0.0f, (float) this.f18455b.d(), 0.0f}).setDuration((long) ((int) (this.f18455b.i() * 1000.0d)));
        ArrayList arrayList = new ArrayList();
        arrayList.add(a(duration));
        return arrayList;
    }
}
