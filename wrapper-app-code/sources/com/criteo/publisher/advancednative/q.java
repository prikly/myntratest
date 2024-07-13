package com.criteo.publisher.advancednative;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: VisibilityTracker */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private final o f2350a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<View, a> f2351b = new WeakHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Object f2352c = new Object();

    public q(o oVar) {
        this.f2350a = oVar;
    }

    /* access modifiers changed from: package-private */
    public void a(View view, p pVar) {
        a aVar;
        synchronized (this.f2352c) {
            aVar = this.f2351b.get(view);
            if (aVar == null) {
                aVar = a(view);
                this.f2351b.put(view, aVar);
            }
        }
        aVar.a(pVar);
    }

    private a a(View view) {
        return new a(new WeakReference(view), this.f2350a);
    }

    /* compiled from: VisibilityTracker */
    static class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        private final Reference<View> f2353a;

        /* renamed from: b  reason: collision with root package name */
        private final o f2354b;

        /* renamed from: c  reason: collision with root package name */
        private volatile p f2355c = null;

        a(Reference<View> reference, o oVar) {
            this.f2353a = reference;
            this.f2354b = oVar;
            a();
        }

        private void a() {
            View view = this.f2353a.get();
            if (view != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnPreDrawListener(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(p pVar) {
            this.f2355c = pVar;
        }

        public boolean onPreDraw() {
            if (!b()) {
                return true;
            }
            c();
            return true;
        }

        private boolean b() {
            View view = this.f2353a.get();
            if (view == null) {
                return false;
            }
            return this.f2354b.a(view);
        }

        private void c() {
            p pVar = this.f2355c;
            if (pVar != null) {
                pVar.a();
            }
        }
    }
}
