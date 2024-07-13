package com.explorestack.iab.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

public abstract class g<T extends View> {

    /* renamed from: a  reason: collision with root package name */
    public final View.OnClickListener f3107a;

    /* renamed from: b  reason: collision with root package name */
    public T f3108b;

    /* renamed from: c  reason: collision with root package name */
    public IabElementStyle f3109c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3110d = false;

    /* renamed from: e  reason: collision with root package name */
    public final Runnable f3111e = new a();

    /* renamed from: f  reason: collision with root package name */
    public final Animator.AnimatorListener f3112f = new b();

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            boolean unused = g.this.f3110d = false;
            g gVar = g.this;
            T t = gVar.f3108b;
            if (t != null && gVar.f3109c != null) {
                ViewPropertyAnimator listener = t.animate().alpha(0.0f).setDuration(400).setListener(g.this.f3112f);
                if (Build.VERSION.SDK_INT >= 16) {
                    listener.withLayer();
                }
            }
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            animator.removeAllListeners();
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            T t = g.this.f3108b;
            if (t != null) {
                t.setClickable(t.getAlpha() != 0.0f);
            }
        }
    }

    public g(View.OnClickListener onClickListener) {
        this.f3107a = onClickListener;
    }

    public ViewGroup.MarginLayoutParams a(Context context, IabElementStyle iabElementStyle) {
        return new ViewGroup.MarginLayoutParams(iabElementStyle.getWidth(context).intValue(), iabElementStyle.getHeight(context).intValue());
    }

    public void a() {
        T t = this.f3108b;
        if (t != null) {
            t.bringToFront();
        }
    }

    public void a(int i) {
        T t = this.f3108b;
        if (t != null) {
            t.setVisibility(i);
        }
    }

    public void a(Context context, T t, IabElementStyle iabElementStyle) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.widget.RelativeLayout$LayoutParams} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: android.widget.FrameLayout$LayoutParams} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: android.widget.RelativeLayout$LayoutParams} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: android.widget.RelativeLayout$LayoutParams} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.content.Context r4, android.view.ViewGroup r5, com.explorestack.iab.utils.IabElementStyle r6) {
        /*
            r3 = this;
            com.explorestack.iab.utils.IabElementStyle r0 = r3.c(r4, r6)
            com.explorestack.iab.utils.IabElementStyle r6 = r0.copyWith(r6)
            java.lang.Boolean r0 = r6.isVisible()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0016
            r3.c()
            return
        L_0x0016:
            boolean r0 = r5 instanceof android.widget.FrameLayout
            if (r0 == 0) goto L_0x0027
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            android.view.ViewGroup$MarginLayoutParams r1 = r3.a((android.content.Context) r4, (com.explorestack.iab.utils.IabElementStyle) r6)
            r0.<init>(r1)
            r6.applyAlignment(r0)
            goto L_0x0037
        L_0x0027:
            boolean r0 = r5 instanceof android.widget.RelativeLayout
            if (r0 == 0) goto L_0x0084
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            android.view.ViewGroup$MarginLayoutParams r1 = r3.a((android.content.Context) r4, (com.explorestack.iab.utils.IabElementStyle) r6)
            r0.<init>(r1)
            r6.applyRelativeAlignment(r0)
        L_0x0037:
            r6.applyMargin(r4, r0)
            T r1 = r3.f3108b
            if (r1 == 0) goto L_0x0055
            com.explorestack.iab.utils.IabElementStyle r2 = r3.f3109c
            if (r2 == 0) goto L_0x0055
            boolean r1 = r3.a(r1, (com.explorestack.iab.utils.IabElementStyle) r2, (com.explorestack.iab.utils.IabElementStyle) r6)
            if (r1 == 0) goto L_0x0049
            goto L_0x0055
        L_0x0049:
            T r5 = r3.f3108b
            r5.setLayoutParams(r0)
            T r5 = r3.f3108b
            r0 = 0
            r5.setVisibility(r0)
            goto L_0x005e
        L_0x0055:
            android.view.View r1 = r3.b(r4, r6)
            r3.f3108b = r1
            r5.addView(r1, r0)
        L_0x005e:
            T r5 = r3.f3108b
            java.lang.Float r0 = r6.getOpacity()
            float r0 = r0.floatValue()
            r5.setAlpha(r0)
            T r5 = r3.f3108b
            r6.applyPadding(r4, r5)
            T r5 = r3.f3108b
            android.view.View$OnClickListener r0 = r3.f3107a
            r5.setOnClickListener(r0)
            r3.f3109c = r6
            T r5 = r3.f3108b
            r3.a(r5, (com.explorestack.iab.utils.IabElementStyle) r6)
            T r5 = r3.f3108b
            r3.a((android.content.Context) r4, r5, (com.explorestack.iab.utils.IabElementStyle) r6)
            return
        L_0x0084:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Parent should be instance of FrameLayout or RelativeLayout"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.iab.utils.g.a(android.content.Context, android.view.ViewGroup, com.explorestack.iab.utils.IabElementStyle):void");
    }

    public void a(T t, IabElementStyle iabElementStyle) {
        if (t instanceof IabElement) {
            ((IabElement) t).setStyle(iabElementStyle);
        }
    }

    public boolean a(T t, IabElementStyle iabElementStyle, IabElementStyle iabElementStyle2) {
        return !TextUtils.equals(iabElementStyle.getStyle(), iabElementStyle2.getStyle());
    }

    public abstract T b(Context context, IabElementStyle iabElementStyle);

    public void b() {
        this.f3110d = false;
        T t = this.f3108b;
        if (t != null && this.f3109c != null) {
            t.animate().cancel();
            this.f3108b.removeCallbacks(this.f3111e);
            this.f3108b.setClickable(true);
            this.f3108b.setAlpha(this.f3109c.getOpacity().floatValue());
        }
    }

    public abstract IabElementStyle c(Context context, IabElementStyle iabElementStyle);

    public void c() {
        if (this.f3108b != null) {
            b();
            Utils.removeFromParent(this.f3108b);
            this.f3108b = null;
            this.f3109c = null;
        }
    }

    public void d() {
        if (e()) {
            a(this.f3108b.getContext(), this.f3108b, this.f3109c);
        }
    }

    public boolean e() {
        return this.f3108b != null;
    }

    public void f() {
        IabElementStyle iabElementStyle;
        Float hideAfter;
        if (!this.f3110d && this.f3108b != null && (iabElementStyle = this.f3109c) != null && (hideAfter = iabElementStyle.getHideAfter()) != null && hideAfter.floatValue() != 0.0f) {
            this.f3110d = true;
            this.f3108b.postDelayed(this.f3111e, (long) (hideAfter.floatValue() * 1000.0f));
        }
    }

    public void g() {
        if (this.f3108b != null && this.f3109c != null) {
            b();
            f();
        }
    }
}
