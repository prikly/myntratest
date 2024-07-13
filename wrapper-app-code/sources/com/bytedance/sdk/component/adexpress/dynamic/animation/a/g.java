package com.bytedance.sdk.component.adexpress.dynamic.animation.a;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import io.bidmachine.utils.IabUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: RubInAnimation */
public class g extends d {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public a f18466d;

    public g(View view, com.bytedance.sdk.component.adexpress.dynamic.b.a aVar) {
        super(view, aVar);
    }

    /* access modifiers changed from: package-private */
    public List<ObjectAnimator> a() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f18456c, "alpha", new float[]{0.0f, 1.0f}).setDuration((long) ((int) (this.f18455b.i() * 1000.0d)));
        this.f18466d = new a(this.f18456c);
        final int i = this.f18456c.getLayoutParams().height;
        ObjectAnimator duration2 = ObjectAnimator.ofInt(this.f18466d, IabUtils.KEY_HEIGHT, new int[]{0, i}).setDuration((long) ((int) (this.f18455b.i() * 1000.0d)));
        ArrayList arrayList = new ArrayList();
        arrayList.add(a(duration));
        arrayList.add(a(duration2));
        ((ObjectAnimator) arrayList.get(0)).addListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator, boolean z) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            public void onAnimationStart(Animator animator, boolean z) {
            }

            public void onAnimationEnd(Animator animator) {
                g.this.f18466d.a(i);
            }
        });
        return arrayList;
    }

    /* compiled from: RubInAnimation */
    private class a {

        /* renamed from: b  reason: collision with root package name */
        private View f18470b;

        public a(View view) {
            this.f18470b = view;
        }

        public void a(int i) {
            ViewGroup.LayoutParams layoutParams = this.f18470b.getLayoutParams();
            layoutParams.height = i;
            this.f18470b.setLayoutParams(layoutParams);
            this.f18470b.requestLayout();
        }
    }
}
