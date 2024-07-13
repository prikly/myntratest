package com.bytedance.sdk.component.adexpress.dynamic.animation.a;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.c;
import com.bytedance.sdk.component.f.e;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: BaseAnimation */
public abstract class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public List<ObjectAnimator> f18454a = a();

    /* renamed from: b  reason: collision with root package name */
    com.bytedance.sdk.component.adexpress.dynamic.b.a f18455b;

    /* renamed from: c  reason: collision with root package name */
    public View f18456c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Set<ScheduledFuture<?>> f18457d = new HashSet();

    /* access modifiers changed from: package-private */
    public abstract List<ObjectAnimator> a();

    public d(View view, com.bytedance.sdk.component.adexpress.dynamic.b.a aVar) {
        this.f18456c = view;
        this.f18455b = aVar;
    }

    public void c() {
        if ("translate".equals(this.f18455b.h()) || "fade".equals(this.f18455b.h())) {
            this.f18456c.setVisibility(4);
        }
        List<ObjectAnimator> list = this.f18454a;
        if (list != null) {
            for (final ObjectAnimator next : list) {
                next.start();
                if (this.f18455b.p() > 0.0d && Build.VERSION.SDK_INT >= 19) {
                    next.addListener(new Animator.AnimatorListener() {
                        public void onAnimationCancel(Animator animator) {
                        }

                        public void onAnimationEnd(Animator animator) {
                        }

                        public void onAnimationStart(Animator animator) {
                        }

                        public void onAnimationRepeat(Animator animator) {
                            next.pause();
                            a aVar = new a(next);
                            ScheduledFuture<?> schedule = e.d().schedule(aVar, (long) (d.this.f18455b.p() * 1000.0d), TimeUnit.MILLISECONDS);
                            aVar.a(schedule);
                            d.this.f18457d.add(schedule);
                        }
                    });
                }
            }
        }
    }

    public void b() {
        List<ObjectAnimator> list = this.f18454a;
        if (list != null) {
            for (ObjectAnimator next : list) {
                next.cancel();
                next.removeAllUpdateListeners();
            }
            for (ScheduledFuture<?> cancel : this.f18457d) {
                cancel.cancel(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ObjectAnimator a(final ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay((long) (this.f18455b.m() * 1000.0d));
        if (this.f18455b.n() > 0) {
            objectAnimator.setRepeatCount(this.f18455b.n() - 1);
        } else {
            objectAnimator.setRepeatCount(-1);
        }
        if (!"normal".equals(this.f18455b.o())) {
            if ("reverse".equals(this.f18455b.o()) || "alternate".equals(this.f18455b.o())) {
                objectAnimator.setRepeatMode(2);
            } else {
                objectAnimator.setRepeatMode(1);
            }
        }
        if ("ease-in-out".equals(this.f18455b.l())) {
            objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        } else if ("ease-in".equals(this.f18455b.o())) {
            objectAnimator.setInterpolator(new AccelerateInterpolator());
        } else if ("ease-out".equals(this.f18455b.o())) {
            objectAnimator.setInterpolator(new DecelerateInterpolator());
        } else {
            objectAnimator.setInterpolator(new LinearInterpolator());
        }
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (valueAnimator.getCurrentPlayTime() > 0) {
                    d.this.f18456c.setVisibility(0);
                    objectAnimator.removeAllUpdateListeners();
                }
            }
        });
        return objectAnimator;
    }

    /* compiled from: BaseAnimation */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        ObjectAnimator f18462a;

        /* renamed from: b  reason: collision with root package name */
        ScheduledFuture<?> f18463b;

        a(ObjectAnimator objectAnimator) {
            this.f18462a = objectAnimator;
        }

        public void a(ScheduledFuture<?> scheduledFuture) {
            this.f18463b = scheduledFuture;
        }

        public void run() {
            if (Build.VERSION.SDK_INT >= 19 && com.bytedance.sdk.component.adexpress.a.a.a.a().c() != null) {
                com.bytedance.sdk.component.adexpress.a.a.a.a().c().c().post(new Runnable() {
                    public void run() {
                        a.this.f18462a.resume();
                    }
                });
                if (this.f18463b != null) {
                    d.this.f18457d.remove(this.f18463b);
                }
            }
        }
    }
}
