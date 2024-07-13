package com.appodeal.ads.utils;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.n5;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.d0;
import java.util.HashMap;

public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f17503a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final Handler f17504b = new Handler(Looper.getMainLooper());

    public interface b {
        void a();

        void b();
    }

    public static void a(Object obj) {
        HashMap hashMap = f17503a;
        synchronized (hashMap) {
            a aVar = (a) hashMap.get(obj);
            if (aVar != null) {
                aVar.b();
                hashMap.remove(obj);
            }
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f17505a = new Rect();

        /* renamed from: b  reason: collision with root package name */
        public final View f17506b;

        /* renamed from: c  reason: collision with root package name */
        public final long f17507c;

        /* renamed from: d  reason: collision with root package name */
        public final float f17508d;

        /* renamed from: e  reason: collision with root package name */
        public final b f17509e;

        /* renamed from: f  reason: collision with root package name */
        public ViewTreeObserver.OnPreDrawListener f17510f;

        /* renamed from: g  reason: collision with root package name */
        public C0208a f17511g;

        /* renamed from: h  reason: collision with root package name */
        public long f17512h;
        public boolean i;
        public boolean j;
        public boolean k;
        public boolean l = true;
        public boolean m = false;
        public final Runnable n = new Runnable() {
            public final void run() {
                d0.a.this.b();
            }
        };

        /* renamed from: com.appodeal.ads.utils.d0$a$a  reason: collision with other inner class name */
        public class C0208a implements View.OnAttachStateChangeListener {
            public C0208a() {
            }

            public final void onViewAttachedToWindow(View view) {
            }

            public final void onViewDetachedFromWindow(View view) {
                a.this.b();
            }
        }

        public a(View view, long j2, b bVar) {
            this.f17506b = view;
            this.f17507c = j2;
            this.f17508d = 0.8f;
            this.f17509e = bVar;
        }

        public static float a(Rect rect, Rect rect2) {
            int height = rect.height() * rect.width();
            if (height == 0) {
                return 0.0f;
            }
            return ((float) (height - (Math.max(0, Math.min(rect.bottom, rect2.bottom) - Math.max(rect.top, rect2.top)) * Math.max(0, Math.min(rect.right, rect2.right) - Math.max(rect.left, rect2.left))))) / ((float) height);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ boolean a() {
            this.l = false;
            a(this.f17506b, this.f17508d);
            return true;
        }

        public final void a(View view, float f2) {
            try {
                ViewGroup viewGroup = view;
                if (!viewGroup.getGlobalVisibleRect(this.f17505a)) {
                    a("Show wasn't tracked: ad not visible globally");
                } else if (!view.isShown()) {
                    a("Show wasn't tracked: ad not shown on view");
                } else if (n5.b(view)) {
                    a("Show wasn't tracked: ad is transparent ");
                } else if (!view.hasWindowFocus()) {
                    a("Show wasn't tracked: ad hasn't window focus");
                } else {
                    Activity activity = com.appodeal.ads.context.b.f16327b.f16328a.getActivity();
                    View findViewById = activity != null ? activity.findViewById(16908290) : null;
                    if (findViewById == null) {
                        a("Activity content layout not found, is your activity running?");
                        return;
                    }
                    Rect rect = new Rect();
                    findViewById.getGlobalVisibleRect(rect);
                    if (!Rect.intersects(this.f17505a, rect)) {
                        a("Ad View is out of current window, show wasn't tracked");
                        return;
                    }
                    float width = (float) (view.getWidth() * view.getHeight());
                    if (width == 0.0f) {
                        a("Ad View width or height is zero, show wasn't tracked");
                        return;
                    }
                    float width2 = ((float) (this.f17505a.width() * this.f17505a.height())) / width;
                    if (width2 < f2) {
                        a("Ad View is not completely visible (" + width2 + "), show wasn't tracked");
                        return;
                    }
                    ViewGroup viewGroup2 = (ViewGroup) view.getRootView();
                    ViewGroup viewGroup3 = (ViewGroup) view.getParent();
                    int i2 = 0;
                    while (viewGroup3 != null) {
                        for (int indexOfChild = viewGroup3.indexOfChild(viewGroup) + 1; indexOfChild < viewGroup3.getChildCount(); indexOfChild++) {
                            View childAt = viewGroup3.getChildAt(indexOfChild);
                            if (childAt.getVisibility() == 0) {
                                childAt.getLocationInWindow(new int[2]);
                                Rect a2 = n5.a(childAt);
                                if (Rect.intersects(this.f17505a, a2)) {
                                    float a3 = a(this.f17505a, a2);
                                    String valueOf = String.valueOf(childAt.getId());
                                    try {
                                        valueOf = viewGroup.getContext().getResources().getResourceEntryName(childAt.getId());
                                    } catch (Exception unused) {
                                    }
                                    Log.log(LogConstants.KEY_SDK, LogConstants.EVENT_VIEWABILITY, String.format("Ad view is overlapped by another visible view (type: %s, id: %s), visible percent: %s", new Object[]{childAt.getClass().getSimpleName(), valueOf, Float.valueOf(a3)}), Log.LogLevel.verbose);
                                    if (a3 < f2) {
                                        a("Ad View is covered by another view, show wasn't tracked");
                                        return;
                                    }
                                    i2++;
                                    if (i2 >= 3) {
                                        a("Ad View is covered by too many views, show wasn't tracked");
                                        return;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        if (viewGroup3 != viewGroup2) {
                            ViewGroup viewGroup4 = viewGroup3;
                            viewGroup3 = (ViewGroup) viewGroup3.getParent();
                            viewGroup = viewGroup4;
                        } else {
                            viewGroup3 = null;
                        }
                    }
                    if (!this.i) {
                        this.f17509e.a();
                        this.i = true;
                    }
                    if (!this.k && !this.j) {
                        d0.f17504b.postDelayed(this.n, this.f17507c);
                        this.f17512h = System.currentTimeMillis();
                        this.k = true;
                    }
                }
            } catch (Exception e2) {
                Log.log(e2);
            }
        }

        public final void b() {
            if (this.i && !this.j && this.f17507c > -1 && this.f17512h > 0 && System.currentTimeMillis() - this.f17512h >= this.f17507c) {
                this.j = true;
                this.f17509e.b();
            }
            this.f17506b.removeOnAttachStateChangeListener(this.f17511g);
            this.f17506b.getViewTreeObserver().removeOnPreDrawListener(this.f17510f);
            d0.f17504b.removeCallbacks(this.n);
            HashMap hashMap = d0.f17503a;
            synchronized (hashMap) {
                hashMap.remove(this);
            }
        }

        public final void c() {
            if (this.f17510f == null) {
                this.f17510f = new ViewTreeObserver.OnPreDrawListener() {
                    public final boolean onPreDraw() {
                        return d0.a.this.a();
                    }
                };
            }
            if (this.f17511g == null) {
                this.f17511g = new C0208a();
            }
            this.f17506b.addOnAttachStateChangeListener(this.f17511g);
            this.f17506b.getViewTreeObserver().addOnPreDrawListener(this.f17510f);
            a(this.f17506b, this.f17508d);
        }

        public final void a(String str) {
            if (this.l) {
                this.l = false;
            } else if (!this.m) {
                this.m = true;
                Log.log(LogConstants.KEY_SDK, LogConstants.EVENT_VIEWABILITY, str, Log.LogLevel.verbose);
            }
            if (!this.j) {
                d0.f17504b.removeCallbacks(this.n);
                this.k = false;
                this.f17512h = 0;
            }
        }
    }
}
