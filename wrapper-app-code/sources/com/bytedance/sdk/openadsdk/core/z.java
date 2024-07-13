package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.utils.m;
import java.util.HashSet;

/* compiled from: WebViewTweaker */
public class z {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f1860a = (Build.VERSION.SDK_INT >= 16 && m.e());

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f1861b = a();

    /* renamed from: c  reason: collision with root package name */
    private static int f1862c = -1;

    /* renamed from: d  reason: collision with root package name */
    private static int f1863d = -1;

    /* renamed from: e  reason: collision with root package name */
    private static int f1864e = -1;

    /* renamed from: f  reason: collision with root package name */
    private static Handler f1865f = null;

    /* renamed from: g  reason: collision with root package name */
    private static final HashSet<String> f1866g;

    /* renamed from: h  reason: collision with root package name */
    private static final HashSet<String> f1867h;

    static {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("HUAWEI C8812");
        hashSet.add("HUAWEI C8812E");
        hashSet.add("HUAWEI C8825D");
        hashSet.add("HUAWEI U8825D");
        hashSet.add("HUAWEI C8950D");
        hashSet.add("HUAWEI U8950D");
        f1866g = hashSet;
        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.add("ZTE V955");
        hashSet2.add("ZTE N881E");
        hashSet2.add("ZTE N881F");
        hashSet2.add("ZTE N880G");
        hashSet2.add("ZTE N880F");
        hashSet2.add("ZTE V889F");
        f1867h = hashSet2;
    }

    public static void a(Context context, WebView webView) {
        if (context != null && webView != null && (context instanceof Activity)) {
            Activity activity = (Activity) context;
            if (activity.isFinishing()) {
                try {
                    webView.loadUrl("about:blank");
                    if (f1864e > 0) {
                        View rootView = webView.getRootView();
                        if (rootView instanceof ViewGroup) {
                            View childAt = ((ViewGroup) rootView).getChildAt(0);
                            childAt.setDrawingCacheEnabled(true);
                            Bitmap createBitmap = Bitmap.createBitmap(childAt.getDrawingCache());
                            childAt.setDrawingCacheEnabled(false);
                            ImageView imageView = new ImageView(activity);
                            imageView.setImageBitmap(createBitmap);
                            imageView.setVisibility(0);
                            ((ViewGroup) rootView).addView(imageView, new ViewGroup.LayoutParams(-1, -1));
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    private static boolean a() {
        return f1860a || (Build.VERSION.SDK_INT == 16 && "ZTE N5".equals(Build.MODEL));
    }

    public static void a(WebView webView) {
        if (webView != null) {
            webView.setWebChromeClient((WebChromeClient) null);
            webView.setWebViewClient((WebViewClient) null);
            ViewParent parent = webView.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(webView);
            }
            webView.removeAllViews();
            try {
                webView.destroy();
            } catch (Throwable unused) {
            }
        }
    }
}
