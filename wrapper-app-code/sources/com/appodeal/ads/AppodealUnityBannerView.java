package com.appodeal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.x5;
import ms.bd.o.Pgl.c;

public final class AppodealUnityBannerView {

    /* renamed from: b  reason: collision with root package name */
    public static AppodealUnityBannerView f16112b;

    /* renamed from: a  reason: collision with root package name */
    public b f16113a;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f16114a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f16115b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f16116c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f16117d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ int f16118e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ View f16119f;

        public a(Activity activity, int i, int i2, int i3, int i4, FrameLayout frameLayout) {
            this.f16114a = activity;
            this.f16115b = i;
            this.f16116c = i2;
            this.f16117d = i3;
            this.f16118e = i4;
            this.f16119f = frameLayout;
        }

        public final void run() {
            if (AppodealUnityBannerView.this.f16113a != null) {
                q4.b(this.f16114a, this.f16115b);
                b bVar = AppodealUnityBannerView.this.f16113a;
                if (bVar.getParent() != null && (bVar.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) bVar.getParent()).removeView(bVar);
                }
                AppodealUnityBannerView.this.f16113a = null;
            }
            int i = this.f16116c;
            AppodealUnityBannerView appodealUnityBannerView = AppodealUnityBannerView.this;
            int i2 = this.f16117d;
            int i3 = this.f16118e;
            appodealUnityBannerView.getClass();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, -2, (i2 != -3 ? (i2 == -2 || i2 == -1) ? 1 : 3 : 5) | (i3 != 8 ? 48 : 80));
            AppodealUnityBannerView.this.f16113a = new b(this.f16114a);
            AppodealUnityBannerView appodealUnityBannerView2 = AppodealUnityBannerView.this;
            b bVar2 = appodealUnityBannerView2.f16113a;
            int i4 = this.f16117d;
            if (i4 == -4 || i4 == -3 || i4 == -2 || i4 == -1) {
                i4 = 0;
            }
            int i5 = this.f16118e;
            appodealUnityBannerView2.getClass();
            if (i5 == 8 || i5 == 16) {
                i5 = 0;
            }
            bVar2.f16121c = i4;
            bVar2.f16122d = i5;
            bVar2.requestLayout();
            bVar2.invalidate();
            AppodealUnityBannerView.this.f16113a.setBackgroundColor(0);
            AppodealUnityBannerView.this.f16113a.addView(this.f16119f, layoutParams);
            this.f16114a.addContentView(AppodealUnityBannerView.this.f16113a, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public static class b extends x5.e {

        /* renamed from: c  reason: collision with root package name */
        public int f16121c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f16122d = 0;

        public b(Activity activity) {
            super(activity);
        }

        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            int i7;
            int i8;
            if (this.f16121c == 0 && this.f16122d == 0) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int childCount = getChildCount();
            int paddingLeft = getPaddingLeft();
            int paddingRight = (i3 - i) - getPaddingRight();
            int paddingTop = getPaddingTop();
            int paddingBottom = (i4 - i2) - getPaddingBottom();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                if (childAt.getVisibility() != 8) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    int i10 = layoutParams.gravity;
                    if (i10 == -1) {
                        i10 = 8388659;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i10, getLayoutDirection());
                    int i11 = i10 & 112;
                    int i12 = this.f16121c;
                    if (i12 != 0) {
                        i5 = i12 + paddingLeft;
                        int i13 = (i5 + measuredWidth) - paddingRight;
                        if (i13 > 0) {
                            i5 -= i13;
                        }
                        if (i5 < paddingLeft) {
                            i5 = paddingLeft;
                        }
                    } else {
                        int i14 = absoluteGravity & 7;
                        if (i14 == 1) {
                            i8 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + paddingLeft + layoutParams.leftMargin;
                        } else if (i14 != 5) {
                            i5 = paddingLeft + layoutParams.leftMargin;
                        } else {
                            i8 = paddingRight - measuredWidth;
                        }
                        i5 = i8 - layoutParams.rightMargin;
                    }
                    int i15 = this.f16122d;
                    if (i15 != 0) {
                        i6 = layoutParams.topMargin + paddingTop + i15;
                        int i16 = (i6 + measuredHeight) - paddingBottom;
                        if (i16 > 0) {
                            i6 -= i16;
                        }
                        if (i6 < paddingTop) {
                            i6 = paddingTop;
                        }
                    } else {
                        if (i11 == 16) {
                            i7 = (((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop + layoutParams.topMargin;
                        } else if (i11 == 48 || i11 != 80) {
                            i6 = layoutParams.topMargin + paddingTop;
                        } else {
                            i7 = paddingBottom - measuredHeight;
                        }
                        i6 = i7 - layoutParams.bottomMargin;
                    }
                    childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
                }
            }
        }
    }

    public static AppodealUnityBannerView getInstance() {
        if (f16112b == null) {
            f16112b = new AppodealUnityBannerView();
        }
        return f16112b;
    }

    public final boolean a(Activity activity, int i, int i2, int i3, String str) {
        int i4;
        int i5 = i;
        String str2 = str;
        if (activity == null) {
            Log.log(new com.appodeal.ads.utils.exception_handler.a("Unable to show an ad: activity = null"));
            return false;
        } else if (str2 == null) {
            Log.log(new com.appodeal.ads.utils.exception_handler.a("Unable to show an ad: placement = null"));
            return false;
        } else {
            FrameLayout frameLayout = null;
            int i6 = c.COLLECT_MODE_FINANCE;
            if (i5 == 64) {
                frameLayout = q4.a((Context) activity);
                i6 = 320;
            } else if (i5 == 256) {
                frameLayout = q4.b((Context) activity);
            }
            FrameLayout frameLayout2 = frameLayout;
            if (frameLayout2 == null) {
                Log.log(new com.appodeal.ads.utils.exception_handler.a("Unable to show an ad: adView = null"));
                return false;
            }
            if (i2 == -1) {
                i4 = -1;
            } else {
                i4 = Math.round(f1.l(activity) * ((float) i6));
            }
            activity.runOnUiThread(new a(activity, i, i4, i2, i3, frameLayout2));
            return q4.a(activity, i, str2);
        }
    }

    public void hideBannerView(Activity activity) {
        activity.runOnUiThread(new s0(this, activity, 4));
    }

    public void hideMrecView(Activity activity) {
        activity.runOnUiThread(new s0(this, activity, 256));
    }

    public boolean showBannerView(Activity activity, int i, int i2, String str) {
        return a(activity, 64, i, i2, str);
    }

    public boolean showMrecView(Activity activity, int i, int i2, String str) {
        return a(activity, 256, i, i2, str);
    }
}
