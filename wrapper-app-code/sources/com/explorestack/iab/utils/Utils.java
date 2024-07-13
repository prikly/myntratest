package com.explorestack.iab.utils;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import java.io.Closeable;
import java.io.Flushable;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Utils {

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f3071a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicInteger f3072b = new AtomicInteger(1);

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3073a;

        public a(String str) {
            this.f3073a = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0082 A[SYNTHETIC, Splitter:B:19:0x0082] */
        /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r10 = this;
                java.lang.String r0 = "Utils"
                r1 = 2
                r2 = 0
                r3 = 1
                r4 = 0
                java.util.Locale r5 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
                java.lang.String r6 = "Connection to URL: %s"
                java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
                java.lang.String r8 = r10.f3073a     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
                r7[r2] = r8     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
                java.lang.String r6 = java.lang.String.format(r5, r6, r7)     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
                com.explorestack.iab.utils.c.a((java.lang.String) r0, (java.lang.String) r6)     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
                java.net.URL r6 = new java.net.URL     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
                java.lang.String r7 = r10.f3073a     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
                r6.<init>(r7)     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
                java.net.HttpURLConnection.setFollowRedirects(r3)     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
                java.net.URLConnection r6 = r6.openConnection()     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
                java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
                r4 = 5000(0x1388, float:7.006E-42)
                r6.setConnectTimeout(r4)     // Catch:{ Exception -> 0x0055 }
                java.lang.String r4 = "Connection"
                java.lang.String r7 = "close"
                r6.setRequestProperty(r4, r7)     // Catch:{ Exception -> 0x0055 }
                java.lang.String r4 = "GET"
                r6.setRequestMethod(r4)     // Catch:{ Exception -> 0x0055 }
                int r4 = r6.getResponseCode()     // Catch:{ Exception -> 0x0055 }
                java.lang.String r7 = "Response code: %d, for URL: %s"
                java.lang.Object[] r8 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0055 }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0055 }
                r8[r2] = r4     // Catch:{ Exception -> 0x0055 }
                java.lang.String r4 = r10.f3073a     // Catch:{ Exception -> 0x0055 }
                r8[r3] = r4     // Catch:{ Exception -> 0x0055 }
                java.lang.String r4 = java.lang.String.format(r5, r7, r8)     // Catch:{ Exception -> 0x0055 }
                com.explorestack.iab.utils.c.a((java.lang.String) r0, (java.lang.String) r4)     // Catch:{ Exception -> 0x0055 }
            L_0x0051:
                r6.disconnect()     // Catch:{ Exception -> 0x007d }
                goto L_0x007d
            L_0x0055:
                r4 = move-exception
                goto L_0x005c
            L_0x0057:
                r0 = move-exception
                goto L_0x0080
            L_0x0059:
                r5 = move-exception
                r6 = r4
                r4 = r5
            L_0x005c:
                java.util.Locale r5 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x007e }
                java.lang.String r7 = "%s: %s: %s"
                r8 = 3
                java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x007e }
                java.lang.String r9 = r10.f3073a     // Catch:{ all -> 0x007e }
                r8[r2] = r9     // Catch:{ all -> 0x007e }
                java.lang.String r2 = r4.getMessage()     // Catch:{ all -> 0x007e }
                r8[r3] = r2     // Catch:{ all -> 0x007e }
                java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x007e }
                r8[r1] = r2     // Catch:{ all -> 0x007e }
                java.lang.String r1 = java.lang.String.format(r5, r7, r8)     // Catch:{ all -> 0x007e }
                com.explorestack.iab.utils.c.b(r0, r1)     // Catch:{ all -> 0x007e }
                if (r6 == 0) goto L_0x007d
                goto L_0x0051
            L_0x007d:
                return
            L_0x007e:
                r0 = move-exception
                r4 = r6
            L_0x0080:
                if (r4 == 0) goto L_0x0085
                r4.disconnect()     // Catch:{ Exception -> 0x0085 }
            L_0x0085:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.iab.utils.Utils.a.run():void");
        }
    }

    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f3074a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f3075b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Runnable f3076c;

        public b(Context context, String str, Runnable runnable) {
            this.f3074a = context;
            this.f3075b = str;
            this.f3076c = runnable;
        }

        public void run() {
            boolean unused = Utils.b(this.f3074a, Utils.a(this.f3075b));
            Runnable runnable = this.f3076c;
            if (runnable != null) {
                Utils.onUiThread(runnable);
            }
        }
    }

    public static double a(Random random, float f2, float f3) {
        double sqrt = Math.sqrt(Math.log(Math.abs(((double) ((random.nextLong() % 100000) + 1)) / 100000.0d)) * -2.0d) * Math.sin(Math.abs(((double) ((random.nextLong() % 100000) + 1)) / 100000.0d) * 6.283185307179586d);
        double d2 = (double) f3;
        return Math.min(1.0d, Math.max(0.0d, (d2 < 0.4d || d2 > 0.6d) ? d2 < 0.4d ? d2 + (((double) f2) / (sqrt * sqrt)) : d2 - (((double) f2) / (sqrt * sqrt)) : (sqrt * ((double) f2)) + d2));
    }

    public static float a(float f2, float f3) {
        return f2 / f3;
    }

    public static float a(int i) {
        if (i == 1) {
            return 0.5f;
        }
        if (i != 3) {
            return i != 17 ? 1.0f : 0.5f;
        }
        return 0.0f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        com.explorestack.iab.utils.c.a("Utils", (java.lang.Throwable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r4.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0082, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0083, code lost:
        com.explorestack.iab.utils.c.a("Utils", (java.lang.Throwable) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0086, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00a6, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00a7, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r2.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00c3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00c4, code lost:
        com.explorestack.iab.utils.c.a("Utils", (java.lang.Throwable) r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00a6 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:4:0x0011] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00b4 A[SYNTHETIC, Splitter:B:70:0x00b4] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00bf A[SYNTHETIC, Splitter:B:76:0x00bf] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r6) {
        /*
            java.lang.String r0 = "Location"
            java.lang.String r1 = "Utils"
            r2 = 0
            java.net.URL r3 = new java.net.URL     // Catch:{ Exception -> 0x00ae }
            r3.<init>(r6)     // Catch:{ Exception -> 0x00ae }
            java.net.URLConnection r4 = r3.openConnection()     // Catch:{ Exception -> 0x00ae }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ Exception -> 0x00ae }
            r2 = 0
            r4.setInstanceFollowRedirects(r2)     // Catch:{ Exception -> 0x00a9, all -> 0x00a6 }
            r2 = 500(0x1f4, float:7.0E-43)
            r4.setConnectTimeout(r2)     // Catch:{ Exception -> 0x00a9, all -> 0x00a6 }
            r4.setReadTimeout(r2)     // Catch:{ Exception -> 0x00a9, all -> 0x00a6 }
            int r2 = r4.getResponseCode()     // Catch:{ Exception -> 0x00a9, all -> 0x00a6 }
            switch(r2) {
                case 301: goto L_0x0029;
                case 302: goto L_0x0029;
                case 303: goto L_0x0029;
                case 304: goto L_0x0023;
                case 305: goto L_0x0029;
                case 306: goto L_0x0023;
                case 307: goto L_0x0029;
                default: goto L_0x0023;
            }     // Catch:{ Exception -> 0x00a9, all -> 0x00a6 }
        L_0x0023:
            java.lang.String r6 = r3.toString()     // Catch:{ Exception -> 0x00a9, all -> 0x00a6 }
            goto L_0x009d
        L_0x0029:
            java.lang.String r2 = r4.getHeaderField(r0)     // Catch:{ Exception -> 0x00a9, all -> 0x00a6 }
            if (r2 == 0) goto L_0x0090
            boolean r5 = isHttpUrl(r2)     // Catch:{ Exception -> 0x00a9, all -> 0x00a6 }
            if (r5 == 0) goto L_0x0046
            java.lang.String r0 = r4.getHeaderField(r0)     // Catch:{ Exception -> 0x00a9, all -> 0x00a6 }
            java.lang.String r6 = a((java.lang.String) r0)     // Catch:{ Exception -> 0x00a9, all -> 0x00a6 }
            r4.disconnect()     // Catch:{ Exception -> 0x0041 }
            goto L_0x0045
        L_0x0041:
            r0 = move-exception
            com.explorestack.iab.utils.c.a((java.lang.String) r1, (java.lang.Throwable) r0)
        L_0x0045:
            return r6
        L_0x0046:
            java.net.URI r0 = new java.net.URI     // Catch:{ Exception -> 0x00a9, all -> 0x00a6 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x00a9, all -> 0x00a6 }
            java.lang.String r0 = r0.getScheme()     // Catch:{ Exception -> 0x00a9, all -> 0x00a6 }
            if (r0 != 0) goto L_0x0087
            java.net.URL r0 = new java.net.URL     // Catch:{ Exception -> 0x007a, all -> 0x00a6 }
            r0.<init>(r3, r2)     // Catch:{ Exception -> 0x007a, all -> 0x00a6 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x007a, all -> 0x00a6 }
            java.lang.String r3 = r0.trim()     // Catch:{ Exception -> 0x007a, all -> 0x00a6 }
            int r3 = r3.length()     // Catch:{ Exception -> 0x007a, all -> 0x00a6 }
            if (r3 <= 0) goto L_0x0071
            java.lang.String r6 = a((java.lang.String) r0)     // Catch:{ Exception -> 0x00a9, all -> 0x00a6 }
            r4.disconnect()     // Catch:{ Exception -> 0x006c }
            goto L_0x0070
        L_0x006c:
            r0 = move-exception
            com.explorestack.iab.utils.c.a((java.lang.String) r1, (java.lang.Throwable) r0)
        L_0x0070:
            return r6
        L_0x0071:
            r4.disconnect()     // Catch:{ Exception -> 0x0075 }
            goto L_0x0079
        L_0x0075:
            r6 = move-exception
            com.explorestack.iab.utils.c.a((java.lang.String) r1, (java.lang.Throwable) r6)
        L_0x0079:
            return r2
        L_0x007a:
            r0 = move-exception
            com.explorestack.iab.utils.c.a((java.lang.String) r1, (java.lang.Throwable) r0)     // Catch:{ Exception -> 0x00a9, all -> 0x00a6 }
            r4.disconnect()     // Catch:{ Exception -> 0x0082 }
            goto L_0x0086
        L_0x0082:
            r6 = move-exception
            com.explorestack.iab.utils.c.a((java.lang.String) r1, (java.lang.Throwable) r6)
        L_0x0086:
            return r2
        L_0x0087:
            r4.disconnect()     // Catch:{ Exception -> 0x008b }
            goto L_0x008f
        L_0x008b:
            r6 = move-exception
            com.explorestack.iab.utils.c.a((java.lang.String) r1, (java.lang.Throwable) r6)
        L_0x008f:
            return r2
        L_0x0090:
            java.lang.String r6 = r3.toString()     // Catch:{ Exception -> 0x00a9, all -> 0x00a6 }
            r4.disconnect()     // Catch:{ Exception -> 0x0098 }
            goto L_0x009c
        L_0x0098:
            r0 = move-exception
            com.explorestack.iab.utils.c.a((java.lang.String) r1, (java.lang.Throwable) r0)
        L_0x009c:
            return r6
        L_0x009d:
            r4.disconnect()     // Catch:{ Exception -> 0x00a1 }
            goto L_0x00a5
        L_0x00a1:
            r0 = move-exception
            com.explorestack.iab.utils.c.a((java.lang.String) r1, (java.lang.Throwable) r0)
        L_0x00a5:
            return r6
        L_0x00a6:
            r6 = move-exception
            r2 = r4
            goto L_0x00bd
        L_0x00a9:
            r0 = move-exception
            r2 = r4
            goto L_0x00af
        L_0x00ac:
            r6 = move-exception
            goto L_0x00bd
        L_0x00ae:
            r0 = move-exception
        L_0x00af:
            com.explorestack.iab.utils.c.a((java.lang.String) r1, (java.lang.Throwable) r0)     // Catch:{ all -> 0x00ac }
            if (r2 == 0) goto L_0x00bc
            r2.disconnect()     // Catch:{ Exception -> 0x00b8 }
            goto L_0x00bc
        L_0x00b8:
            r0 = move-exception
            com.explorestack.iab.utils.c.a((java.lang.String) r1, (java.lang.Throwable) r0)
        L_0x00bc:
            return r6
        L_0x00bd:
            if (r2 == 0) goto L_0x00c7
            r2.disconnect()     // Catch:{ Exception -> 0x00c3 }
            goto L_0x00c7
        L_0x00c3:
            r0 = move-exception
            com.explorestack.iab.utils.c.a((java.lang.String) r1, (java.lang.Throwable) r0)
        L_0x00c7:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.iab.utils.Utils.a(java.lang.String):java.lang.String");
    }

    public static void a(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity);
        }
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    public static void a(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            WindowInsetsController windowInsetsController = window.getDecorView().getWindowInsetsController();
            if (windowInsetsController != null) {
                windowInsetsController.setSystemBarsBehavior(2);
                if (z) {
                    windowInsetsController.hide(WindowInsets.Type.statusBars());
                    return;
                }
                return;
            }
            return;
        }
        int i = 0;
        if (z) {
            window.setFlags(1024, 1024);
            i = 4;
        }
        if (i > 0) {
            window.getDecorView().setSystemUiVisibility(i);
        }
    }

    public static void applyFullscreenActivityFlags(Activity activity) {
        applyFullscreenActivityFlags(activity, true);
    }

    public static void applyFullscreenActivityFlags(Activity activity, boolean z) {
        activity.requestWindowFeature(1);
        Window window = activity.getWindow();
        if (window != null) {
            window.addFlags(128);
            a(window, z);
        }
        a(activity);
    }

    public static float b(int i) {
        if (i == 16 || i == 17) {
            return 0.5f;
        }
        return i != 80 ? 0.0f : 1.0f;
    }

    public static boolean b(Context context, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setFlags(268435456);
            ComponentName pickBrowser = pickBrowser(context, intent);
            if (pickBrowser == null) {
                String decode = URLDecoder.decode(str, "UTF-8");
                intent = new Intent("android.intent.action.VIEW", Uri.parse(decode));
                intent.setFlags(268435456);
                pickBrowser = pickBrowser(context, intent);
                if (pickBrowser == null) {
                    c.b("Utils", String.format("Component not found to handle intent: %s", new Object[]{decode}));
                    context.startActivity(intent);
                    return true;
                }
            }
            intent.setComponent(pickBrowser);
            context.startActivity(intent);
            return true;
        } catch (Exception e2) {
            c.a("Utils", (Throwable) e2);
            return false;
        }
    }

    public static void cancelOnUiThread(Runnable runnable) {
        f3071a.removeCallbacks(runnable);
    }

    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                c.a("Utils", th);
            }
        }
    }

    public static Float convertCssSizeToPx(String str) {
        return Float.valueOf(str.replace("px", ""));
    }

    public static int dpToPx(Context context, float f2) {
        return (int) TypedValue.applyDimension(1, f2, context.getResources().getDisplayMetrics());
    }

    public static void finishActivityWithoutAnimation(Activity activity) {
        activity.finish();
        activity.overridePendingTransition(0, 0);
    }

    public static void flush(Flushable flushable) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (Throwable th) {
                c.a("Utils", th);
            }
        }
    }

    public static int generateViewId() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        if (Build.VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            atomicInteger = f3072b;
            i = atomicInteger.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return i;
    }

    public static Point getClickPoint(Rect rect, int i, int i2) {
        Random random = new Random();
        double a2 = a(random, 0.1f, a(i));
        double a3 = a(random, 0.1f, b(i2));
        return new Point((int) (((double) rect.width()) * a2), (int) (((double) rect.height()) * a3));
    }

    public static Point getDefaultClickPoint(Rect rect) {
        return new Point(Math.round(((float) rect.width()) * 0.5f), Math.round(((float) rect.height()) * 0.7f));
    }

    public static int getScreenOrientation(Context context) {
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        int i = context.getResources().getConfiguration().orientation;
        if (i == 1) {
            return (rotation == 2 || rotation == 3) ? 9 : 1;
        }
        if (i == 2) {
            return (rotation == 2 || rotation == 3) ? 8 : 0;
        }
        return 9;
    }

    public static String getValidUrl(String str) {
        try {
            new URL(str);
            return str;
        } catch (MalformedURLException unused) {
            try {
                return URLDecoder.decode(str, "UTF-8");
            } catch (UnsupportedEncodingException | IllegalArgumentException unused2) {
                return str;
            }
        }
    }

    public static void httpGetURL(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                Executors.newSingleThreadExecutor().execute(new a(str));
            } catch (Exception e2) {
                c.b("Utils", e2.getMessage());
            }
        } else {
            c.a("Utils", "url is null or empty");
        }
    }

    public static boolean isHttpUrl(String str) {
        return str.startsWith("http://") || str.startsWith("https://");
    }

    public static boolean isLandscapeOrientation(Context context) {
        int screenOrientation = getScreenOrientation(context);
        return screenOrientation == 0 || screenOrientation == 8 || screenOrientation == 6 || (Build.VERSION.SDK_INT >= 18 && screenOrientation == 11);
    }

    public static boolean isNetworkAvailable(Context context) {
        NetworkInfo activeNetworkInfo;
        c.a("Utils", "Testing connectivity:");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            c.a("Utils", "No Internet connection");
            return false;
        }
        c.a("Utils", "Connected to Internet");
        return true;
    }

    public static boolean isTablet(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        double d2 = (double) (((float) displayMetrics.widthPixels) / displayMetrics.xdpi);
        double d3 = (double) (((float) displayMetrics.heightPixels) / displayMetrics.ydpi);
        return Math.sqrt((d2 * d2) + (d3 * d3)) >= 6.6d;
    }

    public static boolean isViewTransparent(View view) {
        return view.getAlpha() == 0.0f;
    }

    public static void onUiThread(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            f3071a.post(runnable);
        }
    }

    public static void onUiThread(Runnable runnable, long j) {
        f3071a.postDelayed(runnable, j);
    }

    public static boolean openBrowser(Context context, String str, Runnable runnable) {
        Context applicationContext = context.getApplicationContext();
        String validUrl = getValidUrl(str);
        if (isHttpUrl(validUrl)) {
            Executors.newSingleThreadExecutor().execute(new b(applicationContext, validUrl, runnable));
            return true;
        }
        if (runnable != null) {
            onUiThread(runnable);
        }
        return b(applicationContext, validUrl);
    }

    public static int orientationBySize(int i, int i2) {
        return i > i2 ? 2 : 1;
    }

    public static String orientationToString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "UNKNOWN" : "LANDSCAPE" : "PORTRAIT" : "UNDEFINED";
    }

    public static ComponentName pickBrowser(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities.isEmpty()) {
            return null;
        }
        for (ResolveInfo next : queryIntentActivities) {
            if (next.activityInfo.packageName.equals("com.android.vending")) {
                ActivityInfo activityInfo = next.activityInfo;
                return new ComponentName(activityInfo.packageName, activityInfo.name);
            }
        }
        return new ComponentName(queryIntentActivities.get(0).activityInfo.packageName, queryIntentActivities.get(0).activityInfo.name);
    }

    public static int pixelsToIntDips(float f2, float f3) {
        return (int) (a(f2, f3) + 0.5f);
    }

    public static void postOnUiThread(Runnable runnable) {
        f3071a.post(runnable);
    }

    public static void removeFromParent(View view) {
        if (view != null && view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    public static String stringifyRect(Rect rect) {
        return rect.left + "," + rect.top + "," + rect.width() + "," + rect.height();
    }

    public static String stringifySize(Rect rect) {
        return rect.width() + "," + rect.height();
    }
}
