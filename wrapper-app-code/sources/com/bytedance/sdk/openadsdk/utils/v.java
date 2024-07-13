package com.bytedance.sdk.openadsdk.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.TextView;
import com.bytedance.sdk.component.f.e;
import com.bytedance.sdk.component.utils.d;
import com.bytedance.sdk.component.utils.g;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.e.p;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.video.b.a;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.KotlinVersion;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UIUtils */
public class v {

    /* renamed from: a  reason: collision with root package name */
    private static float f2252a = -1.0f;

    /* renamed from: b  reason: collision with root package name */
    private static int f2253b = -1;

    /* renamed from: c  reason: collision with root package name */
    private static float f2254c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    private static int f2255d = -1;

    /* renamed from: e  reason: collision with root package name */
    private static int f2256e = -1;

    /* renamed from: f  reason: collision with root package name */
    private static WindowManager f2257f;

    public static void a(Context context, n nVar, String str, WebView webView) {
    }

    private static boolean a(int i) {
        return i == 0 || i == 8 || i == 4;
    }

    static {
        a(m.a());
    }

    private static boolean a() {
        return f2252a < 0.0f || f2253b < 0 || f2254c < 0.0f || f2255d < 0 || f2256e < 0;
    }

    public static void a(Context context) {
        a(context, false);
    }

    public static void a(Context context, boolean z) {
        Context a2 = context == null ? m.a() : context;
        if (a2 != null) {
            f2257f = (WindowManager) a2.getSystemService("window");
            if (a() || z) {
                DisplayMetrics displayMetrics = a2.getResources().getDisplayMetrics();
                f2252a = displayMetrics.density;
                f2253b = displayMetrics.densityDpi;
                f2254c = displayMetrics.scaledDensity;
                f2255d = displayMetrics.widthPixels;
                f2256e = displayMetrics.heightPixels;
            }
            if (context != null && context.getResources() != null && context.getResources().getConfiguration() != null) {
                if (context.getResources().getConfiguration().orientation == 1) {
                    int i = f2255d;
                    int i2 = f2256e;
                    if (i > i2) {
                        f2255d = i2;
                        f2256e = i;
                        return;
                    }
                    return;
                }
                int i3 = f2255d;
                int i4 = f2256e;
                if (i3 < i4) {
                    f2255d = i4;
                    f2256e = i3;
                }
            }
        }
    }

    public static int a(Context context, float f2) {
        a(context);
        float f3 = f(context);
        if (f3 <= 0.0f) {
            f3 = 1.0f;
        }
        return (int) ((f2 / f3) + 0.5f);
    }

    public static float b(Context context, float f2) {
        a(context);
        return (f2 * e(context)) + 0.5f;
    }

    public static float c(Context context, float f2) {
        a(context);
        return f2 * e(context);
    }

    public static int d(Context context, float f2) {
        a(context, true);
        float e2 = e(context);
        if (e2 <= 0.0f) {
            e2 = 1.0f;
        }
        return (int) ((f2 / e2) + 0.5f);
    }

    public static int[] b(Context context) {
        if (context == null) {
            return null;
        }
        if (f2257f == null) {
            f2257f = (WindowManager) m.a().getSystemService("window");
        }
        int[] iArr = new int[2];
        WindowManager windowManager = f2257f;
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            if (Build.VERSION.SDK_INT >= 14 && Build.VERSION.SDK_INT < 17) {
                try {
                    i = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                    i2 = ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                } catch (Exception unused) {
                }
            }
            if (Build.VERSION.SDK_INT >= 17) {
                try {
                    Point point = new Point();
                    Display.class.getMethod("getRealSize", new Class[]{Point.class}).invoke(defaultDisplay, new Object[]{point});
                    i = point.x;
                    i2 = point.y;
                } catch (Exception unused2) {
                }
            }
            iArr[0] = i;
            iArr[1] = i2;
        }
        if (iArr[0] <= 0 || iArr[1] <= 0) {
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            iArr[0] = displayMetrics2.widthPixels;
            iArr[1] = displayMetrics2.heightPixels;
        }
        return iArr;
    }

    public static int c(Context context) {
        a(context);
        return f2255d;
    }

    public static int d(Context context) {
        a(context);
        return f2256e;
    }

    public static float e(Context context) {
        a(context);
        return f2252a;
    }

    public static float f(Context context) {
        a(context);
        return f2254c;
    }

    public static int g(Context context) {
        a(context);
        return f2253b;
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        Rect rect = new Rect();
        view.getHitRect(rect);
        rect.top -= i;
        rect.bottom += i2;
        rect.left -= i3;
        rect.right += i4;
        ((View) view.getParent()).setTouchDelegate(new g(rect, view));
    }

    public static int[] a(View view) {
        if (view == null || view.getVisibility() != 0) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static int[] b(View view) {
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static int[] c(View view) {
        if (view == null) {
            return null;
        }
        return new int[]{view.getWidth(), view.getHeight()};
    }

    public static void a(View view, int i) {
        if (view != null && view.getVisibility() != i && a(i)) {
            view.setVisibility(i);
        }
    }

    public static boolean d(View view) {
        return view != null && view.getVisibility() == 0;
    }

    public static void a(TextView textView, CharSequence charSequence) {
        if (textView != null && !TextUtils.isEmpty(charSequence)) {
            textView.setText(charSequence);
        }
    }

    public static void b(View view, int i, int i2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams;
        if (view != null && (layoutParams = view.getLayoutParams()) != null && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            a(view, (ViewGroup.MarginLayoutParams) layoutParams, i, i2, i3, i4);
        }
    }

    private static void a(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4) {
        if (view != null && marginLayoutParams != null) {
            if (marginLayoutParams.leftMargin != i || marginLayoutParams.topMargin != i2 || marginLayoutParams.rightMargin != i3 || marginLayoutParams.bottomMargin != i4) {
                if (i != -3) {
                    marginLayoutParams.leftMargin = i;
                }
                if (i2 != -3) {
                    marginLayoutParams.topMargin = i2;
                }
                if (i3 != -3) {
                    marginLayoutParams.rightMargin = i3;
                }
                if (i4 != -3) {
                    marginLayoutParams.bottomMargin = i4;
                }
                view.setLayoutParams(marginLayoutParams);
            }
        }
    }

    private static Bitmap a(WebView webView) {
        Bitmap bitmap = null;
        try {
            Picture capturePicture = webView.capturePicture();
            bitmap = Bitmap.createBitmap(capturePicture.getWidth(), capturePicture.getHeight(), Bitmap.Config.ARGB_8888);
            capturePicture.draw(new Canvas(bitmap));
            return bitmap;
        } catch (Throwable th) {
            th.printStackTrace();
            return bitmap;
        }
    }

    public static void e(final View view) {
        if (view != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f});
            ofFloat.addListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    v.a(view, 8);
                    ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f}).setDuration(0).start();
                }
            });
            ofFloat.setDuration(800);
            ofFloat.start();
        }
    }

    public static void f(View view) {
        if (view != null) {
            a(view, 0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f});
            ofFloat.addListener(new AnimatorListenerAdapter() {
                public void onAnimationStart(Animator animator) {
                    super.onAnimationEnd(animator);
                }
            });
            ofFloat.setDuration(300);
            ofFloat.start();
        }
    }

    public static int e(Context context, float f2) {
        return (int) ((f2 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int h(Context context) {
        if (context == null) {
            context = m.a();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealMetrics(displayMetrics);
        } else {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics.heightPixels;
    }

    public static int i(Context context) {
        if (context == null) {
            context = m.a();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealMetrics(displayMetrics);
        } else {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics.widthPixels;
    }

    public static float j(Context context) {
        if (context == null) {
            context = m.a();
        }
        int identifier = context.getApplicationContext().getResources().getIdentifier("status_bar_height", "dimen", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        if (identifier > 0) {
            return (float) context.getApplicationContext().getResources().getDimensionPixelSize(identifier);
        }
        return 0.0f;
    }

    public static void a(Activity activity) {
        if (activity != null) {
            try {
                if (Build.VERSION.SDK_INT > 11 && Build.VERSION.SDK_INT < 19) {
                    activity.getWindow().getDecorView().setSystemUiVisibility(8);
                } else if (Build.VERSION.SDK_INT >= 19) {
                    activity.getWindow().getDecorView().setSystemUiVisibility(3846);
                    activity.getWindow().addFlags(1792);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void b(Activity activity) {
        if (activity != null) {
            try {
                activity.getWindow().getDecorView().setSystemUiVisibility(1792);
                activity.getWindow().clearFlags(1792);
            } catch (Exception unused) {
            }
        }
    }

    public static boolean c(Activity activity) {
        if (d(activity) || a("ro.miui.notch", activity) == 1 || k(activity) || o(activity) || l(activity) || m(activity) || n(activity)) {
            return true;
        }
        return false;
    }

    public static boolean d(Activity activity) {
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        DisplayCutout displayCutout = null;
        try {
            WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
            if (rootWindowInsets != null) {
                displayCutout = rootWindowInsets.getDisplayCutout();
            }
            if (displayCutout != null) {
                return true;
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static int a(String str, Activity activity) {
        if (!m.e()) {
            return 0;
        }
        try {
            Class<?> loadClass = activity.getClassLoader().loadClass("android.os.SystemProperties");
            return ((Integer) loadClass.getMethod("getInt", new Class[]{String.class, Integer.TYPE}).invoke(loadClass, new Object[]{new String(str), new Integer(0)})).intValue();
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
            return 0;
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
            return 0;
        } catch (IllegalAccessException e4) {
            e4.printStackTrace();
            return 0;
        } catch (IllegalArgumentException e5) {
            e5.printStackTrace();
            return 0;
        } catch (InvocationTargetException e6) {
            e6.printStackTrace();
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean k(android.content.Context r3) {
        /*
            r0 = 0
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x0022, all -> 0x0020 }
            java.lang.String r1 = "com.huawei.android.util.HwNotchSizeUtil"
            java.lang.Class r3 = r3.loadClass(r1)     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x0022, all -> 0x0020 }
            java.lang.String r1 = "hasNotchInScreen"
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x0022, all -> 0x0020 }
            java.lang.reflect.Method r1 = r3.getMethod(r1, r2)     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x0022, all -> 0x0020 }
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x0022, all -> 0x0020 }
            java.lang.Object r3 = r1.invoke(r3, r2)     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x0022, all -> 0x0020 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x0022, all -> 0x0020 }
            boolean r0 = r3.booleanValue()     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x0022, all -> 0x0020 }
            goto L_0x0022
        L_0x0020:
            r3 = move-exception
            throw r3
        L_0x0022:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.v.k(android.content.Context):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean l(android.content.Context r5) {
        /*
            r0 = 0
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x002f, all -> 0x002d }
            java.lang.String r1 = "android.util.FtFeature"
            java.lang.Class r5 = r5.loadClass(r1)     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x002f, all -> 0x002d }
            java.lang.String r1 = "isFeatureSupport"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x002f, all -> 0x002d }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x002f, all -> 0x002d }
            r3[r0] = r4     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x002f, all -> 0x002d }
            java.lang.reflect.Method r1 = r5.getMethod(r1, r3)     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x002f, all -> 0x002d }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x002f, all -> 0x002d }
            r3 = 32
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x002f, all -> 0x002d }
            r2[r0] = r3     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x002f, all -> 0x002d }
            java.lang.Object r5 = r1.invoke(r5, r2)     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x002f, all -> 0x002d }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x002f, all -> 0x002d }
            boolean r0 = r5.booleanValue()     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x002f, all -> 0x002d }
            goto L_0x002f
        L_0x002d:
            r5 = move-exception
            throw r5
        L_0x002f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.v.l(android.content.Context):boolean");
    }

    public static boolean m(Context context) {
        return Build.MODEL.equals("IN2010") || Build.MODEL.equals("IN2020") || Build.MODEL.equals("KB2000") || Build.MODEL.startsWith("ONEPLUS");
    }

    public static boolean n(Context context) {
        try {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_mainBuiltInDisplayCutout", "string", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
            String string = identifier > 0 ? resources.getString(identifier) : null;
            if (string == null || TextUtils.isEmpty(string)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean o(Context context) {
        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    public static void a(View view, View.OnClickListener onClickListener, String str) {
        if (view == null) {
            l.e("OnclickListener ", str + " is null , can not set OnClickListener !!!");
            return;
        }
        view.setOnClickListener(onClickListener);
    }

    public static void a(View view, View.OnTouchListener onTouchListener, String str) {
        if (view == null) {
            l.e("OnTouchListener ", str + " is null , can not set OnTouchListener !!!");
            return;
        }
        view.setOnTouchListener(onTouchListener);
    }

    public static void a(View view, float f2) {
        if (view != null) {
            view.setAlpha(f2);
        }
    }

    public static void a(TextView textView, TTRatingBar2 tTRatingBar2, n nVar, Context context) {
        a(textView, tTRatingBar2, (nVar == null || nVar.aa() == null) ? -1.0d : nVar.aa().d(), context);
    }

    public static void a(TextView textView, TTRatingBar2 tTRatingBar2, double d2, Context context) {
        if (d2 == -1.0d) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            tTRatingBar2.setVisibility(8);
            return;
        }
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%.1f", new Object[]{Double.valueOf(d2)}));
        }
        a(tTRatingBar2, d2, 0, 14);
    }

    public static void a(TTRatingBar2 tTRatingBar2, double d2, int i, int i2) {
        if (d2 < 0.0d) {
            tTRatingBar2.setVisibility(8);
            return;
        }
        tTRatingBar2.setVisibility(0);
        tTRatingBar2.a(d2, i, i2);
    }

    public static void a(TextView textView, n nVar, Context context, String str) {
        a(textView, nVar.aa() != null ? nVar.aa().e() : -1, context, str);
    }

    public static void a(TextView textView, int i, Context context, String str) {
        StringBuilder sb;
        String str2;
        String a2 = t.a(context, str);
        if (i > 10000) {
            sb = new StringBuilder();
            sb.append(i / 1000);
            str2 = "k";
        } else {
            sb = new StringBuilder();
            sb.append(i);
            str2 = "";
        }
        sb.append(str2);
        textView.setText(String.format(a2, new Object[]{sb.toString()}));
        if (i == -1) {
            textView.setVisibility(8);
        }
    }

    public static Bitmap a(SSWebView sSWebView) {
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        WebView webView = sSWebView.getWebView();
        int layerType = webView.getLayerType();
        webView.setLayerType(1, (Paint) null);
        Bitmap b2 = b(sSWebView);
        if (b2 == null) {
            b2 = a(webView);
        }
        webView.setLayerType(layerType, (Paint) null);
        if (b2 == null) {
            return null;
        }
        return d.a(b2, b2.getWidth() / 6, b2.getHeight() / 6);
    }

    public static void a(n nVar, String str, String str2, Bitmap bitmap, String str3, long j) {
        final n nVar2 = nVar;
        final String str4 = str;
        final String str5 = str2;
        final Bitmap bitmap2 = bitmap;
        final String str6 = str3;
        final long j2 = j;
        e.b(new com.bytedance.sdk.component.f.g("startCheckPlayableStatusPercentage") {
            public void run() {
                v.c(nVar2, str4, str5, bitmap2, str6, j2);
            }
        }, 5);
    }

    /* access modifiers changed from: private */
    public static void c(n nVar, String str, String str2, Bitmap bitmap, String str3, long j) {
        JSONObject jSONObject;
        if (bitmap != null) {
            try {
                if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
                    if (!bitmap.isRecycled()) {
                        int a2 = a(bitmap);
                        JSONObject jSONObject2 = null;
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("url", str3);
                            if (j != -1) {
                                jSONObject3.put("page_id", j);
                            }
                            jSONObject3.put("render_type", "h5");
                            int i = 0;
                            jSONObject3.put("render_type_2", 0);
                            jSONObject3.put("is_blank", a2 == 100 ? 1 : 0);
                            jSONObject3.put("is_playable", p.a(nVar) ? 1 : 0);
                            if (a.a().a(nVar)) {
                                i = 1;
                            }
                            jSONObject3.put("usecache", i);
                            jSONObject = new JSONObject();
                            try {
                                jSONObject.put("ad_extra_data", jSONObject3.toString());
                            } catch (JSONException unused) {
                                jSONObject2 = jSONObject;
                            }
                        } catch (JSONException unused2) {
                            jSONObject = jSONObject2;
                            com.bytedance.sdk.openadsdk.b.e.c(m.a(), nVar, str, str2, jSONObject);
                        }
                        com.bytedance.sdk.openadsdk.b.e.c(m.a(), nVar, str, str2, jSONObject);
                    }
                }
            } catch (Throwable th) {
                l.e("UIUtils", "(Developers can ignore this detection exception)checkWebViewIsTransparent->throwable ex>>>" + th.toString());
            }
        }
    }

    private static Bitmap b(SSWebView sSWebView) {
        if (sSWebView == null) {
            return null;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(sSWebView.getWidth(), sSWebView.getHeight(), Bitmap.Config.RGB_565);
            sSWebView.draw(new Canvas(createBitmap));
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int a(Bitmap bitmap) {
        try {
            ArrayList<Integer> b2 = b(bitmap);
            if (b2 == null) {
                return -1;
            }
            HashMap hashMap = new HashMap();
            Iterator<Integer> it = b2.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                if (hashMap.containsKey(next)) {
                    Integer valueOf = Integer.valueOf(((Integer) hashMap.get(next)).intValue() + 1);
                    hashMap.remove(next);
                    hashMap.put(next, valueOf);
                } else {
                    hashMap.put(next, 1);
                }
            }
            int i = 0;
            int i2 = 0;
            for (Map.Entry entry : hashMap.entrySet()) {
                int intValue = ((Integer) entry.getValue()).intValue();
                if (i2 < intValue) {
                    i = ((Integer) entry.getKey()).intValue();
                    i2 = intValue;
                }
            }
            if (i == 0) {
                return -1;
            }
            return (int) ((((float) i2) / (((float) (bitmap.getWidth() * bitmap.getHeight())) * 1.0f)) * 100.0f);
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static ArrayList<Integer> b(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i = width * height;
            int[] iArr = new int[i];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = iArr[i2];
                arrayList.add(Integer.valueOf(Color.rgb((16711680 & i3) >> 16, (65280 & i3) >> 8, i3 & KotlinVersion.MAX_COMPONENT_VALUE)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }
}
