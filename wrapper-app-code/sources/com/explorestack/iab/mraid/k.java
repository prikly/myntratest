package com.explorestack.iab.mraid;

import android.view.View;
import android.view.ViewTreeObserver;
import com.explorestack.iab.utils.Utils;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public a f3039a;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final View[] f3040a;

        /* renamed from: b  reason: collision with root package name */
        public Runnable f3041b;

        /* renamed from: c  reason: collision with root package name */
        public int f3042c;

        /* renamed from: d  reason: collision with root package name */
        public final Runnable f3043d = new C0031a();

        /* renamed from: com.explorestack.iab.mraid.k$a$a  reason: collision with other inner class name */
        public class C0031a implements Runnable {

            /* renamed from: com.explorestack.iab.mraid.k$a$a$a  reason: collision with other inner class name */
            public class C0032a implements ViewTreeObserver.OnPreDrawListener {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ View f3045a;

                public C0032a(View view) {
                    this.f3045a = view;
                }

                public boolean onPreDraw() {
                    this.f3045a.getViewTreeObserver().removeOnPreDrawListener(this);
                    a.this.b();
                    return true;
                }
            }

            public C0031a() {
            }

            public void run() {
                for (View view : a.this.f3040a) {
                    if (view.getHeight() > 0 || view.getWidth() > 0) {
                        a.this.b();
                    } else {
                        view.getViewTreeObserver().addOnPreDrawListener(new C0032a(view));
                    }
                }
            }
        }

        public a(View[] viewArr) {
            this.f3040a = viewArr;
        }

        public void a() {
            Utils.cancelOnUiThread(this.f3043d);
            this.f3041b = null;
        }

        public void a(Runnable runnable) {
            this.f3041b = runnable;
            this.f3042c = this.f3040a.length;
            Utils.postOnUiThread(this.f3043d);
        }

        public void b() {
            Runnable runnable;
            int i = this.f3042c - 1;
            this.f3042c = i;
            if (i == 0 && (runnable = this.f3041b) != null) {
                runnable.run();
                this.f3041b = null;
            }
        }
    }

    public a a(View... viewArr) {
        a();
        a aVar = new a(viewArr);
        this.f3039a = aVar;
        return aVar;
    }

    public void a() {
        a aVar = this.f3039a;
        if (aVar != null) {
            aVar.a();
            this.f3039a = null;
        }
    }
}
