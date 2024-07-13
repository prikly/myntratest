package io.bidmachine.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.media.MediaMetadataRetriever;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.View;
import com.applovin.exoplayer2.common.base.Ascii;
import io.bidmachine.utils.DeviceUtils;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class Utils {
    private static final Handler BACKGROUND_HANDLER;
    private static final Integer CURRENT_YEAR = Integer.valueOf(Calendar.getInstance().get(1));
    private static final char[] HEX_ARRAY = "0123456789abcdef".toCharArray();
    private static final Handler UI_HANDLER = new Handler(Looper.getMainLooper());
    private static String appName;
    private static String appVersion;

    public static float getOrDefault(float f2, float f3, float f4) {
        return f2 == f3 ? f4 : f2;
    }

    public static long getOrDefault(long j, long j2, long j3) {
        return j == j2 ? j3 : j;
    }

    public static <T> T oneOf(T t, T t2, T t3) {
        return t != null ? t : t2 != null ? t2 : t3;
    }

    static {
        HandlerThread handlerThread = new HandlerThread("BackgroundHandlerThread");
        handlerThread.start();
        BACKGROUND_HANDLER = new Handler(handlerThread.getLooper());
    }

    public static boolean isUiThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static void onUiThread(Runnable runnable) {
        if (isUiThread()) {
            runnable.run();
        } else {
            UI_HANDLER.post(runnable);
        }
    }

    public static void onUiThread(Runnable runnable, long j) {
        UI_HANDLER.postDelayed(runnable, j);
    }

    public static void cancelUiThreadTask(Runnable runnable) {
        UI_HANDLER.removeCallbacks(runnable);
    }

    public static void onBackgroundThread(Runnable runnable) {
        if (isUiThread()) {
            BACKGROUND_HANDLER.post(runnable);
        } else {
            runnable.run();
        }
    }

    public static void onBackgroundThread(Runnable runnable, long j) {
        BACKGROUND_HANDLER.postDelayed(runnable, j);
    }

    public static void cancelBackgroundThreadTask(Runnable runnable) {
        BACKGROUND_HANDLER.removeCallbacks(runnable);
    }

    public static String streamToString(InputStream inputStream) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toString("UTF-8");
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static NetworkInfo getActiveNetworkInfo(Context context) {
        if (!isPermissionGranted(context, "android.permission.ACCESS_NETWORK_STATE")) {
            Logger.logError(String.format("Manifest permission not found: %s. Check the integration.", new Object[]{"android.permission.ACCESS_NETWORK_STATE"}));
            return null;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                return connectivityManager.getActiveNetworkInfo();
            }
            return null;
        } catch (Throwable th) {
            Logger.log(th);
            return null;
        }
    }

    public static boolean isNetworkAvailable(Context context) {
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static Location getBestLocation(Context context, Location location, Location location2) {
        Location location3 = (Location) oneOf(location, location2);
        Location location4 = getLocation(context);
        if (location4 != null) {
            return (location3 == null || location4.getTime() >= location3.getTime()) ? location4 : location3;
        }
        return location3;
    }

    public static Location getLocation(Context context) {
        String bestProvider;
        Location lastKnownLocation;
        try {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            if (locationManager == null || (bestProvider = locationManager.getBestProvider(new Criteria(), false)) == null) {
                return null;
            }
            Location lastKnownLocation2 = locationManager.getLastKnownLocation(bestProvider);
            if (lastKnownLocation2 != null) {
                return lastKnownLocation2;
            }
            List<String> allProviders = locationManager.getAllProviders();
            if (allProviders != null) {
                if (allProviders.size() > 1) {
                    for (String next : allProviders) {
                        if (next != null && !next.equals(bestProvider) && (lastKnownLocation = locationManager.getLastKnownLocation(next)) != null) {
                            return lastKnownLocation;
                        }
                    }
                    return null;
                }
            }
            return null;
        } catch (Exception e2) {
            Logger.log((Throwable) e2);
        }
    }

    public static int getUtcOffsetMinutes() {
        return (int) TimeUnit.MILLISECONDS.toMinutes((long) TimeZone.getDefault().getOffset(System.currentTimeMillis()));
    }

    public static Point getScreenSize(Context context) {
        DisplayMetrics displayMetrics = DeviceUtils.getDisplayMetrics(context);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static float getScreenDensity(Context context) {
        return DeviceUtils.getDisplayMetrics(context).density;
    }

    public static boolean canUseExternalFilesDir(Context context) {
        return (Build.VERSION.SDK_INT >= 19 || writePermissionGranted(context)) && isExternalMemoryAvailable();
    }

    public static boolean isPermissionGranted(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (context.checkPermission(str, Process.myPid(), Process.myUid()) == 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    static boolean writePermissionGranted(Context context) {
        return isPermissionGranted(context, "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    public static boolean isExternalMemoryAvailable() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public static byte[] getMD5(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            return instance.digest();
        } catch (NoSuchAlgorithmException e2) {
            Logger.log((Throwable) e2);
            return null;
        }
    }

    public static File getCacheDir(Context context, String str) {
        File externalFilesDir = context.getExternalFilesDir((String) null);
        if (externalFilesDir != null) {
            File file = new File(externalFilesDir.getPath() + "/" + str + "/");
            if (file.exists() || file.mkdirs()) {
                return file;
            }
        }
        return null;
    }

    public static boolean isUrlValid(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            new URL(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isHttpUrl(String str) {
        return str.startsWith("http://") || str.startsWith("https://");
    }

    public static String generateFileName(String str) {
        return new BigInteger(getMD5(str.getBytes())).abs().toString(36);
    }

    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e2) {
                Logger.log((Throwable) e2);
            }
        }
    }

    public static void flush(Flushable flushable) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (Exception e2) {
                Logger.log((Throwable) e2);
            }
        }
    }

    public static Rect getViewRectangle(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new Rect(iArr[0], iArr[1], view.getWidth() + iArr[0], view.getHeight() + iArr[1]);
    }

    public static boolean isViewTransparent(View view) {
        return view.getAlpha() == 0.0f;
    }

    public static void httpGetURL(final String str, Executor executor) {
        if (!TextUtils.isEmpty(str) && executor != null) {
            executor.execute(new Runnable() {
                /* JADX WARNING: Removed duplicated region for block: B:17:0x0043 A[SYNTHETIC, Splitter:B:17:0x0043] */
                /* JADX WARNING: Removed duplicated region for block: B:23:0x0056 A[SYNTHETIC, Splitter:B:23:0x0056] */
                /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                        r4 = this;
                        r0 = 0
                        java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x003a, all -> 0x0035 }
                        java.lang.String r2 = r1     // Catch:{ Exception -> 0x003a, all -> 0x0035 }
                        r1.<init>(r2)     // Catch:{ Exception -> 0x003a, all -> 0x0035 }
                        java.net.URLConnection r1 = r1.openConnection()     // Catch:{ Exception -> 0x003a, all -> 0x0035 }
                        java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Exception -> 0x003a, all -> 0x0035 }
                        r0 = 5000(0x1388, float:7.006E-42)
                        r1.setConnectTimeout(r0)     // Catch:{ Exception -> 0x0033 }
                        r0 = 1
                        r1.setInstanceFollowRedirects(r0)     // Catch:{ Exception -> 0x0033 }
                        java.lang.String r0 = "Connection"
                        java.lang.String r2 = "close"
                        r1.setRequestProperty(r0, r2)     // Catch:{ Exception -> 0x0033 }
                        java.lang.String r0 = "GET"
                        r1.setRequestMethod(r0)     // Catch:{ Exception -> 0x0033 }
                        r1.getResponseCode()     // Catch:{ Exception -> 0x0033 }
                        if (r1 == 0) goto L_0x0052
                        java.io.InputStream r0 = r1.getInputStream()     // Catch:{ Exception -> 0x004e }
                        io.bidmachine.core.Utils.close(r0)     // Catch:{ Exception -> 0x004e }
                        r1.disconnect()     // Catch:{ Exception -> 0x004e }
                        goto L_0x0052
                    L_0x0033:
                        r0 = move-exception
                        goto L_0x003e
                    L_0x0035:
                        r1 = move-exception
                        r3 = r1
                        r1 = r0
                        r0 = r3
                        goto L_0x0054
                    L_0x003a:
                        r1 = move-exception
                        r3 = r1
                        r1 = r0
                        r0 = r3
                    L_0x003e:
                        io.bidmachine.core.Logger.log((java.lang.Throwable) r0)     // Catch:{ all -> 0x0053 }
                        if (r1 == 0) goto L_0x0052
                        java.io.InputStream r0 = r1.getInputStream()     // Catch:{ Exception -> 0x004e }
                        io.bidmachine.core.Utils.close(r0)     // Catch:{ Exception -> 0x004e }
                        r1.disconnect()     // Catch:{ Exception -> 0x004e }
                        goto L_0x0052
                    L_0x004e:
                        r0 = move-exception
                        io.bidmachine.core.Logger.log((java.lang.Throwable) r0)
                    L_0x0052:
                        return
                    L_0x0053:
                        r0 = move-exception
                    L_0x0054:
                        if (r1 == 0) goto L_0x0065
                        java.io.InputStream r2 = r1.getInputStream()     // Catch:{ Exception -> 0x0061 }
                        io.bidmachine.core.Utils.close(r2)     // Catch:{ Exception -> 0x0061 }
                        r1.disconnect()     // Catch:{ Exception -> 0x0061 }
                        goto L_0x0065
                    L_0x0061:
                        r1 = move-exception
                        io.bidmachine.core.Logger.log((java.lang.Throwable) r1)
                    L_0x0065:
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.core.Utils.AnonymousClass1.run():void");
                }
            });
        }
    }

    public static boolean canAddWindowToActivity(Activity activity) {
        return (activity == null || activity.getWindow() == null || !activity.getWindow().isActive() || activity.getWindow().getDecorView().getWindowToken() == null) ? false : true;
    }

    public static String retrieveAndSaveFrame(Context context, Uri uri, String str) {
        FileOutputStream fileOutputStream;
        File file;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(context, uri);
        Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(Long.parseLong(mediaMetadataRetriever.extractMetadata(9)), 2);
        FileOutputStream fileOutputStream2 = null;
        if (frameAtTime != null) {
            try {
                file = new File(getCacheDir(context, str), generateFileName(uri.toString()));
                fileOutputStream = new FileOutputStream(file);
            } catch (Exception e2) {
                e = e2;
                fileOutputStream = null;
                try {
                    Logger.log((Throwable) e);
                    flush(fileOutputStream);
                    close(fileOutputStream);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream2 = fileOutputStream;
                    flush(fileOutputStream2);
                    close(fileOutputStream2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                flush(fileOutputStream2);
                close(fileOutputStream2);
                throw th;
            }
            try {
                frameAtTime.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                String absolutePath = file.getAbsolutePath();
                flush(fileOutputStream);
                close(fileOutputStream);
                return absolutePath;
            } catch (Exception e3) {
                e = e3;
                Logger.log((Throwable) e);
                flush(fileOutputStream);
                close(fileOutputStream);
                return null;
            }
        }
        return null;
    }

    public static boolean isYearValid(int i) {
        return i >= 1900 && i <= CURRENT_YEAR.intValue();
    }

    @SafeVarargs
    public static Object invokeMethodByName(Object obj, String str, Pair<Class<?>, Object>... pairArr) throws Exception {
        return invokeMethodByName(obj, obj.getClass(), str, pairArr);
    }

    @SafeVarargs
    public static Object invokeMethodByName(Object obj, Class<?> cls, String str, Pair<Class<?>, Object>... pairArr) throws Exception {
        Object[] objArr;
        Class[] clsArr;
        if (pairArr != null) {
            clsArr = new Class[pairArr.length];
            objArr = new Object[pairArr.length];
            for (int i = 0; i < pairArr.length; i++) {
                clsArr[i] = (Class) pairArr[i].first;
                objArr[i] = pairArr[i].second;
            }
        } else {
            clsArr = null;
            objArr = null;
        }
        int i2 = 10;
        Class<? super Object> cls2 = cls;
        while (i2 > 0 && cls2 != null) {
            try {
                Method declaredMethod = cls2.getDeclaredMethod(str, clsArr);
                declaredMethod.setAccessible(true);
                return declaredMethod.invoke(obj, objArr);
            } catch (NoSuchMethodException unused) {
                i2--;
                cls2 = cls2.getSuperclass();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return null;
    }

    public static <T> T oneOf(T t, T t2) {
        return oneOf(t, t2, (T) null);
    }

    public static String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    public static String getAppName(Context context) {
        if (appName == null) {
            appName = (String) context.getPackageManager().getApplicationLabel(context.getApplicationInfo());
        }
        return appName;
    }

    public static String getAppVersion(Context context) {
        if (appVersion == null) {
            try {
                String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                if (str != null) {
                    appVersion = str;
                }
            } catch (Exception e2) {
                Logger.log((Throwable) e2);
            }
        }
        return appVersion;
    }

    public static boolean canUseCleartextTraffic() {
        return Build.VERSION.SDK_INT < 23 || NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    public static Map<String, String> toMap(JSONObject jSONObject) throws Exception {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt != null) {
                hashMap.put(next, opt.toString());
            }
        }
        return hashMap;
    }

    public static void startActivity(Context context, Intent intent) {
        try {
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        } catch (Throwable th) {
            Logger.log(th);
        }
    }

    public static String generateTag(String str, Object obj) {
        return String.format("%s @%s", new Object[]{str, Integer.toHexString(obj.hashCode())});
    }

    public static String toHexString(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = HEX_ARRAY;
            cArr[i2] = cArr2[b2 >>> 4];
            cArr[i2 + 1] = cArr2[b2 & Ascii.SI];
        }
        return new String(cArr);
    }

    public static <T> void sort(CopyOnWriteArrayList<T> copyOnWriteArrayList, Comparator<? super T> comparator) {
        Object[] array = copyOnWriteArrayList.toArray();
        Arrays.sort(array, comparator);
        for (int i = 0; i < array.length; i++) {
            copyOnWriteArrayList.set(i, array[i]);
        }
    }
}
