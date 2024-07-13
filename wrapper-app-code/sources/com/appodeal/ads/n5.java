package com.appodeal.ads;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.appodeal.ads.context.b;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.utils.EventsTracker;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.s;
import com.appodeal.ads.utils.x;
import com.appodeal.ads.waterfall_filter.a;
import com.unity3d.services.core.di.ServiceProvider;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public final class n5 {

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f16838a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ boolean f16839b = (!n5.class.desiredAssertionStatus());

    public static ComponentName a(Context context, Intent intent) {
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

    public static Rect a(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new Rect(iArr[0], iArr[1], view.getWidth() + iArr[0], view.getHeight() + iArr[1]);
    }

    public static String a(int i) {
        StringBuilder sb = new StringBuilder();
        if ((i & 1) > 0) {
            sb.append("Interstitial");
        }
        if ((i & 2) > 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("Video");
        }
        if ((i & 128) > 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("Rewarded video");
        }
        if ((i & 3164) > 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("Banner");
        }
        if ((i & 256) > 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("MREC");
        }
        if ((i & 512) > 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("NativeAd");
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c A[SYNTHETIC, Splitter:B:24:0x004c] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005a A[SYNTHETIC, Splitter:B:33:0x005a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.io.InputStream r4) {
        /*
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0045, all -> 0x0043 }
            int r2 = r4.available()     // Catch:{ Exception -> 0x0045, all -> 0x0043 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0045, all -> 0x0043 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0045, all -> 0x0043 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0045, all -> 0x0043 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0045, all -> 0x0043 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0045, all -> 0x0043 }
        L_0x0014:
            java.lang.String r4 = r2.readLine()     // Catch:{ Exception -> 0x0041, all -> 0x003f }
            if (r4 == 0) goto L_0x0023
            r1.append(r4)     // Catch:{ Exception -> 0x0041, all -> 0x003f }
            r4 = 10
            r1.append(r4)     // Catch:{ Exception -> 0x0041, all -> 0x003f }
            goto L_0x0014
        L_0x0023:
            int r4 = r1.length()     // Catch:{ Exception -> 0x0041, all -> 0x003f }
            if (r4 <= 0) goto L_0x0032
            int r4 = r1.length()     // Catch:{ Exception -> 0x0041, all -> 0x003f }
            int r4 = r4 + -1
            r1.setLength(r4)     // Catch:{ Exception -> 0x0041, all -> 0x003f }
        L_0x0032:
            java.lang.String r4 = r1.toString()     // Catch:{ Exception -> 0x0041, all -> 0x003f }
            r2.close()     // Catch:{ Exception -> 0x003a }
            goto L_0x003e
        L_0x003a:
            r0 = move-exception
            com.appodeal.ads.utils.Log.log(r0)
        L_0x003e:
            return r4
        L_0x003f:
            r4 = move-exception
            goto L_0x0058
        L_0x0041:
            r4 = move-exception
            goto L_0x0047
        L_0x0043:
            r4 = move-exception
            goto L_0x0057
        L_0x0045:
            r4 = move-exception
            r2 = r0
        L_0x0047:
            com.appodeal.ads.utils.Log.log(r4)     // Catch:{ all -> 0x0055 }
            if (r2 == 0) goto L_0x0054
            r2.close()     // Catch:{ Exception -> 0x0050 }
            goto L_0x0054
        L_0x0050:
            r4 = move-exception
            com.appodeal.ads.utils.Log.log(r4)
        L_0x0054:
            return r0
        L_0x0055:
            r4 = move-exception
            r0 = r2
        L_0x0057:
            r2 = r0
        L_0x0058:
            if (r2 == 0) goto L_0x0062
            r2.close()     // Catch:{ Exception -> 0x005e }
            goto L_0x0062
        L_0x005e:
            r0 = move-exception
            com.appodeal.ads.utils.Log.log(r0)
        L_0x0062:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.n5.a(java.io.InputStream):java.lang.String");
    }

    public static String a(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        try {
            StringBuffer stringBuffer = new StringBuffer(str.length());
            Matcher matcher = Pattern.compile("_(.)").matcher(str);
            while (matcher.find()) {
                matcher.appendReplacement(stringBuffer, matcher.group(1).toUpperCase(Locale.ENGLISH));
            }
            matcher.appendTail(stringBuffer);
            stringBuffer.setCharAt(0, Character.toUpperCase(str.charAt(0)));
            return stringBuffer.toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    public static String a(JSONObject jSONObject, String str, String str2) {
        return (jSONObject == null || str == null || jSONObject.isNull(str)) ? str2 : jSONObject.optString(str, str2);
    }

    public static JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            x m = q4.m();
            jSONObject.put("session_id", m.g());
            jSONObject.put("session_uptime", m.h());
            jSONObject.put("session_uptime_m", m.i());
            jSONObject.put("app_uptime", m.e());
            jSONObject.put("app_uptime_m", m.f());
            jSONObject.put(ServiceProvider.NAMED_SDK, Constants.SDK_VERSION);
            EventsTracker eventsTracker = EventsTracker.get();
            EventsTracker.EventType eventType = EventsTracker.EventType.Impression;
            jSONObject.put("imp_count", eventsTracker.b(eventType));
            EventsTracker.EventType eventType2 = EventsTracker.EventType.Click;
            jSONObject.put("click_count", eventsTracker.b(eventType2));
            EventsTracker.EventType eventType3 = EventsTracker.EventType.Finish;
            jSONObject.put("finish_count", eventsTracker.b(eventType3));
            jSONObject.put("imp", eventsTracker.c(eventType));
            jSONObject.put(Constants.CLICK, eventsTracker.c(eventType2));
            jSONObject.put(Constants.FINISH, eventsTracker.c(eventType3));
            jSONObject.put("timp", eventsTracker.a(eventType));
            jSONObject.put("tclick", eventsTracker.a(eventType2));
            jSONObject.put("tfinish", eventsTracker.a(eventType3));
            JSONObject jSONObject2 = i0.f16475d;
            if (jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, i0.f16475d.get(next));
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e2) {
                Log.log(e2);
            }
        }
    }

    public static void a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.flush();
            } catch (Exception e2) {
                Log.log(e2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b A[SYNTHETIC, Splitter:B:18:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053 A[SYNTHETIC, Splitter:B:22:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0067 A[SYNTHETIC, Splitter:B:29:0x0067] */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void a(java.lang.String r3, java.lang.Runnable r4) {
        /*
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x0045, all -> 0x0043 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x0045, all -> 0x0043 }
            java.net.URLConnection r3 = r1.openConnection()     // Catch:{ Exception -> 0x0045, all -> 0x0043 }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ Exception -> 0x0045, all -> 0x0043 }
            r0 = 5000(0x1388, float:7.006E-42)
            r3.setConnectTimeout(r0)     // Catch:{ Exception -> 0x0041 }
            r0 = 1
            r3.setInstanceFollowRedirects(r0)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r0 = "Connection"
            java.lang.String r1 = "close"
            r3.setRequestProperty(r0, r1)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r0 = "GET"
            r3.setRequestMethod(r0)     // Catch:{ Exception -> 0x0041 }
            int r0 = r3.getResponseCode()     // Catch:{ Exception -> 0x0041 }
            r1 = 300(0x12c, float:4.2E-43)
            if (r0 >= r1) goto L_0x0031
            int r0 = r3.getResponseCode()     // Catch:{ Exception -> 0x0041 }
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 >= r1) goto L_0x0036
        L_0x0031:
            if (r4 == 0) goto L_0x0036
            r4.run()     // Catch:{ Exception -> 0x0041 }
        L_0x0036:
            java.io.InputStream r4 = r3.getInputStream()     // Catch:{ Exception -> 0x005e }
            r4.close()     // Catch:{ Exception -> 0x005e }
            r3.disconnect()     // Catch:{ Exception -> 0x005e }
            goto L_0x0062
        L_0x0041:
            r0 = move-exception
            goto L_0x0049
        L_0x0043:
            r4 = move-exception
            goto L_0x0065
        L_0x0045:
            r3 = move-exception
            r2 = r0
            r0 = r3
            r3 = r2
        L_0x0049:
            if (r4 == 0) goto L_0x004e
            r4.run()     // Catch:{ all -> 0x0063 }
        L_0x004e:
            com.appodeal.ads.utils.Log.log(r0)     // Catch:{ all -> 0x0063 }
            if (r3 == 0) goto L_0x0062
            java.io.InputStream r4 = r3.getInputStream()     // Catch:{ Exception -> 0x005e }
            r4.close()     // Catch:{ Exception -> 0x005e }
            r3.disconnect()     // Catch:{ Exception -> 0x005e }
            goto L_0x0062
        L_0x005e:
            r3 = move-exception
            com.appodeal.ads.utils.Log.log(r3)
        L_0x0062:
            return
        L_0x0063:
            r4 = move-exception
            r0 = r3
        L_0x0065:
            if (r0 == 0) goto L_0x0076
            java.io.InputStream r3 = r0.getInputStream()     // Catch:{ Exception -> 0x0072 }
            r3.close()     // Catch:{ Exception -> 0x0072 }
            r0.disconnect()     // Catch:{ Exception -> 0x0072 }
            goto L_0x0076
        L_0x0072:
            r3 = move-exception
            com.appodeal.ads.utils.Log.log(r3)
        L_0x0076:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.n5.a(java.lang.String, java.lang.Runnable):void");
    }

    public static boolean a(Context context) {
        if (a(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            HashMap hashMap = f1.f16398a;
            if ("mounted".equals(Environment.getExternalStorageState())) {
                return true;
            }
        }
        return false;
    }

    public static Activity b() {
        return b.f16327b.getTopActivityFlow().getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        com.appodeal.ads.utils.Log.log(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r3.getInputStream().close();
        r3.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a9, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00aa, code lost:
        com.appodeal.ads.utils.Log.log(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ad, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00e2, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00e3, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        r1.getInputStream().close();
        r1.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x010d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x010e, code lost:
        com.appodeal.ads.utils.Log.log(r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e2 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:4:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f0 A[SYNTHETIC, Splitter:B:74:0x00f0] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0102 A[SYNTHETIC, Splitter:B:80:0x0102] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b(java.lang.String r6) {
        /*
            java.lang.String r0 = "Location"
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x00ea }
            r2.<init>(r6)     // Catch:{ Exception -> 0x00ea }
            java.net.URLConnection r3 = r2.openConnection()     // Catch:{ Exception -> 0x00ea }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ Exception -> 0x00ea }
            r1 = 0
            r3.setInstanceFollowRedirects(r1)     // Catch:{ Exception -> 0x00e5, all -> 0x00e2 }
            r4 = 500(0x1f4, float:7.0E-43)
            r3.setConnectTimeout(r4)     // Catch:{ Exception -> 0x00e5, all -> 0x00e2 }
            r3.setReadTimeout(r4)     // Catch:{ Exception -> 0x00e5, all -> 0x00e2 }
            int r4 = r3.getResponseCode()     // Catch:{ Exception -> 0x00e5, all -> 0x00e2 }
            switch(r4) {
                case 301: goto L_0x0027;
                case 302: goto L_0x0027;
                case 303: goto L_0x0027;
                case 304: goto L_0x0021;
                case 305: goto L_0x0027;
                case 306: goto L_0x0021;
                case 307: goto L_0x0027;
                default: goto L_0x0021;
            }     // Catch:{ Exception -> 0x00e5, all -> 0x00e2 }
        L_0x0021:
            java.lang.String r6 = r2.toString()     // Catch:{ Exception -> 0x00e5, all -> 0x00e2 }
            goto L_0x00d2
        L_0x0027:
            java.lang.String r4 = r3.getHeaderField(r0)     // Catch:{ Exception -> 0x00e5, all -> 0x00e2 }
            if (r4 == 0) goto L_0x00be
            java.lang.String r5 = "http://"
            boolean r5 = r4.startsWith(r5)     // Catch:{ Exception -> 0x00e5, all -> 0x00e2 }
            if (r5 != 0) goto L_0x003d
            java.lang.String r5 = "https://"
            boolean r5 = r4.startsWith(r5)     // Catch:{ Exception -> 0x00e5, all -> 0x00e2 }
            if (r5 == 0) goto L_0x003e
        L_0x003d:
            r1 = 1
        L_0x003e:
            if (r1 == 0) goto L_0x0058
            java.lang.String r0 = r3.getHeaderField(r0)     // Catch:{ Exception -> 0x00e5, all -> 0x00e2 }
            java.lang.String r6 = b((java.lang.String) r0)     // Catch:{ Exception -> 0x00e5, all -> 0x00e2 }
            java.io.InputStream r0 = r3.getInputStream()     // Catch:{ Exception -> 0x0053 }
            r0.close()     // Catch:{ Exception -> 0x0053 }
            r3.disconnect()     // Catch:{ Exception -> 0x0053 }
            goto L_0x0057
        L_0x0053:
            r0 = move-exception
            com.appodeal.ads.utils.Log.log(r0)
        L_0x0057:
            return r6
        L_0x0058:
            java.net.URI r0 = new java.net.URI     // Catch:{ Exception -> 0x00e5, all -> 0x00e2 }
            r0.<init>(r4)     // Catch:{ Exception -> 0x00e5, all -> 0x00e2 }
            java.lang.String r0 = r0.getScheme()     // Catch:{ Exception -> 0x00e5, all -> 0x00e2 }
            if (r0 != 0) goto L_0x00ae
            java.net.URL r0 = new java.net.URL     // Catch:{ Exception -> 0x009a, all -> 0x00e2 }
            r0.<init>(r2, r4)     // Catch:{ Exception -> 0x009a, all -> 0x00e2 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x009a, all -> 0x00e2 }
            java.lang.String r1 = r0.trim()     // Catch:{ Exception -> 0x009a, all -> 0x00e2 }
            int r1 = r1.length()     // Catch:{ Exception -> 0x009a, all -> 0x00e2 }
            if (r1 <= 0) goto L_0x008a
            java.lang.String r6 = b((java.lang.String) r0)     // Catch:{ Exception -> 0x00e5, all -> 0x00e2 }
            java.io.InputStream r0 = r3.getInputStream()     // Catch:{ Exception -> 0x0085 }
            r0.close()     // Catch:{ Exception -> 0x0085 }
            r3.disconnect()     // Catch:{ Exception -> 0x0085 }
            goto L_0x0089
        L_0x0085:
            r0 = move-exception
            com.appodeal.ads.utils.Log.log(r0)
        L_0x0089:
            return r6
        L_0x008a:
            java.io.InputStream r6 = r3.getInputStream()     // Catch:{ Exception -> 0x0095 }
            r6.close()     // Catch:{ Exception -> 0x0095 }
            r3.disconnect()     // Catch:{ Exception -> 0x0095 }
            goto L_0x0099
        L_0x0095:
            r6 = move-exception
            com.appodeal.ads.utils.Log.log(r6)
        L_0x0099:
            return r4
        L_0x009a:
            r0 = move-exception
            com.appodeal.ads.utils.Log.log(r0)     // Catch:{ Exception -> 0x00e5, all -> 0x00e2 }
            java.io.InputStream r6 = r3.getInputStream()     // Catch:{ Exception -> 0x00a9 }
            r6.close()     // Catch:{ Exception -> 0x00a9 }
            r3.disconnect()     // Catch:{ Exception -> 0x00a9 }
            goto L_0x00ad
        L_0x00a9:
            r6 = move-exception
            com.appodeal.ads.utils.Log.log(r6)
        L_0x00ad:
            return r4
        L_0x00ae:
            java.io.InputStream r6 = r3.getInputStream()     // Catch:{ Exception -> 0x00b9 }
            r6.close()     // Catch:{ Exception -> 0x00b9 }
            r3.disconnect()     // Catch:{ Exception -> 0x00b9 }
            goto L_0x00bd
        L_0x00b9:
            r6 = move-exception
            com.appodeal.ads.utils.Log.log(r6)
        L_0x00bd:
            return r4
        L_0x00be:
            java.lang.String r6 = r2.toString()     // Catch:{ Exception -> 0x00e5, all -> 0x00e2 }
            java.io.InputStream r0 = r3.getInputStream()     // Catch:{ Exception -> 0x00cd }
            r0.close()     // Catch:{ Exception -> 0x00cd }
            r3.disconnect()     // Catch:{ Exception -> 0x00cd }
            goto L_0x00d1
        L_0x00cd:
            r0 = move-exception
            com.appodeal.ads.utils.Log.log(r0)
        L_0x00d1:
            return r6
        L_0x00d2:
            java.io.InputStream r0 = r3.getInputStream()     // Catch:{ Exception -> 0x00dd }
            r0.close()     // Catch:{ Exception -> 0x00dd }
            r3.disconnect()     // Catch:{ Exception -> 0x00dd }
            goto L_0x00e1
        L_0x00dd:
            r0 = move-exception
            com.appodeal.ads.utils.Log.log(r0)
        L_0x00e1:
            return r6
        L_0x00e2:
            r6 = move-exception
            r1 = r3
            goto L_0x0100
        L_0x00e5:
            r0 = move-exception
            r1 = r3
            goto L_0x00eb
        L_0x00e8:
            r6 = move-exception
            goto L_0x0100
        L_0x00ea:
            r0 = move-exception
        L_0x00eb:
            com.appodeal.ads.utils.Log.log(r0)     // Catch:{ all -> 0x00e8 }
            if (r1 == 0) goto L_0x00ff
            java.io.InputStream r0 = r1.getInputStream()     // Catch:{ Exception -> 0x00fb }
            r0.close()     // Catch:{ Exception -> 0x00fb }
            r1.disconnect()     // Catch:{ Exception -> 0x00fb }
            goto L_0x00ff
        L_0x00fb:
            r0 = move-exception
            com.appodeal.ads.utils.Log.log(r0)
        L_0x00ff:
            return r6
        L_0x0100:
            if (r1 == 0) goto L_0x0111
            java.io.InputStream r0 = r1.getInputStream()     // Catch:{ Exception -> 0x010d }
            r0.close()     // Catch:{ Exception -> 0x010d }
            r1.disconnect()     // Catch:{ Exception -> 0x010d }
            goto L_0x0111
        L_0x010d:
            r0 = move-exception
            com.appodeal.ads.utils.Log.log(r0)
        L_0x0111:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.n5.b(java.lang.String):java.lang.String");
    }

    public static boolean b(Context context) {
        Boolean bool = f16838a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 1024).applicationInfo.sharedLibraryFiles;
            if (strArr != null) {
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    String str = strArr[i];
                    if (!str.equalsIgnoreCase("/system/framework/org.apache.http.legacy.boot.jar")) {
                        if (!str.equalsIgnoreCase("/system/framework/org.apache.http.legacy.jar")) {
                            i++;
                        }
                    }
                    f16838a = Boolean.TRUE;
                    return true;
                }
            }
        } catch (Exception e2) {
            Log.log(e2);
        }
        f16838a = Boolean.FALSE;
        return false;
    }

    public static boolean b(Context context, String str) {
        try {
            Log.log(LogConstants.KEY_SDK, "Launch", String.format("url - %s", new Object[]{str}), Log.LogLevel.verbose);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setFlags(268435456);
            ComponentName a2 = a(context, intent);
            if (a2 == null) {
                String decode = URLDecoder.decode(str, "UTF-8");
                intent = new Intent("android.intent.action.VIEW", Uri.parse(decode));
                intent.setFlags(268435456);
                a2 = a(context, intent);
                if (a2 == null) {
                    Log.log(LogConstants.KEY_SDK, LogConstants.EVENT_LAUNCH_ERROR, String.format("component not found to handle intent: %s", new Object[]{decode}));
                    context.startActivity(intent);
                    return true;
                }
            }
            intent.setComponent(a2);
            context.startActivity(intent);
            return true;
        } catch (Exception e2) {
            Log.log(e2);
            return false;
        }
    }

    public static boolean b(View view) {
        return view.getAlpha() == 0.0f;
    }

    @Deprecated
    public static l5 c() {
        return l5.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f A[SYNTHETIC, Splitter:B:16:0x003f] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0052 A[SYNTHETIC, Splitter:B:22:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void c(java.lang.String r3) {
        /*
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x0036, all -> 0x0031 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x0036, all -> 0x0031 }
            java.net.URLConnection r3 = r1.openConnection()     // Catch:{ Exception -> 0x0036, all -> 0x0031 }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ Exception -> 0x0036, all -> 0x0031 }
            r0 = 5000(0x1388, float:7.006E-42)
            r3.setConnectTimeout(r0)     // Catch:{ Exception -> 0x002f }
            r0 = 1
            r3.setInstanceFollowRedirects(r0)     // Catch:{ Exception -> 0x002f }
            java.lang.String r0 = "Connection"
            java.lang.String r1 = "close"
            r3.setRequestProperty(r0, r1)     // Catch:{ Exception -> 0x002f }
            java.lang.String r0 = "GET"
            r3.setRequestMethod(r0)     // Catch:{ Exception -> 0x002f }
            r3.getResponseCode()     // Catch:{ Exception -> 0x002f }
            java.io.InputStream r0 = r3.getInputStream()     // Catch:{ Exception -> 0x004a }
            r0.close()     // Catch:{ Exception -> 0x004a }
            r3.disconnect()     // Catch:{ Exception -> 0x004a }
            goto L_0x004e
        L_0x002f:
            r0 = move-exception
            goto L_0x003a
        L_0x0031:
            r3 = move-exception
            r2 = r0
            r0 = r3
            r3 = r2
            goto L_0x0050
        L_0x0036:
            r3 = move-exception
            r2 = r0
            r0 = r3
            r3 = r2
        L_0x003a:
            com.appodeal.ads.utils.Log.log(r0)     // Catch:{ all -> 0x004f }
            if (r3 == 0) goto L_0x004e
            java.io.InputStream r0 = r3.getInputStream()     // Catch:{ Exception -> 0x004a }
            r0.close()     // Catch:{ Exception -> 0x004a }
            r3.disconnect()     // Catch:{ Exception -> 0x004a }
            goto L_0x004e
        L_0x004a:
            r3 = move-exception
            com.appodeal.ads.utils.Log.log(r3)
        L_0x004e:
            return
        L_0x004f:
            r0 = move-exception
        L_0x0050:
            if (r3 == 0) goto L_0x0061
            java.io.InputStream r1 = r3.getInputStream()     // Catch:{ Exception -> 0x005d }
            r1.close()     // Catch:{ Exception -> 0x005d }
            r3.disconnect()     // Catch:{ Exception -> 0x005d }
            goto L_0x0061
        L_0x005d:
            r3 = move-exception
            com.appodeal.ads.utils.Log.log(r3)
        L_0x0061:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.n5.c(java.lang.String):void");
    }

    public static BitmapDrawable d(Context context) {
        byte[] decode = Base64.decode("iVBORw0KGgoAAAANSUhEUgAABkEAAAD7CAYAAADdEzMVAAAABmJLR0QA/wD/AP+gvaeTAAAACXBIWXMAAA9hAAAPYQGoP6dpAAAAB3RJTUUH4AcZDAsrA/OsyAAAIABJREFUeAHsvQl24zqQRUlq8JC/zul99P6X08uoyrStgf1uACHTTtspWxOHB5sSxRG4BAMBBAJo/7//9//pGodREli0bbM8LIumPXsquqbba9Ffq7/Fat2s7u+bxXLVNJ22cm9tW97dN+1iUe5ObmJf/HLWOvsj8QWnRyDfnd2uaTYvTffyou9nLdt4l5rcP72UO0UmcH4CFDsUhgt9LOvCO3T+AvL8cfcVTcAETMAETGBOBLJs3qnwftk3zVZLbpsThyGlVfV7VUCahjaAujQ7PRetO5iACXxBQG1gDe+PlnaltjnqIq6DfAHMu4ZGoEr/ZqcyQC1RzT7+okSYTtG83zdqzXYYK4G9BK1Uklhafa7aYog4n4oiAS7h3aZJY79rts9PgavTvcPwcf8YxpF2sdR2jB959/weK13H2wSuRECCOAJKkoyM7XJZ3qKtjCIoU6lQXSk6vo0JjJ4AGhwVj7XKJdYdTMAETMAETMAEhkuAaqOrjgN6Pqr9q/7RYZTCAOJgAibwbwJhQNRhGA83qscvZQhZqyIShhFtt4z7N0MfcXMCSPytMiuGkMyyU6tO2why82z28whEpqSBlCADSPHXyKxaNp/n8zXbd+qt3nVVGdovmt3ypVnIMLLf0Wtd2xUPPEUWash9bX3qxQmF6jyR8lVMYHoEMGTKu6q903smo2N4g2AkiXfr9T2cXsKdIhM4FwGVMF2tcES/AK1nOXmuW/g6JmACJmACJmACJjBFAqp3YABp8M7B+4P1bNydYnqdJhO4BAHavHh3tLS1o7J+XOJOvqYJnESAFqbMmcX4IfGvLbXFd5L9CW0EOSnLDOtkMnA/E18idrQtqYttfRnkf6Ihezb7/w3lKLxDZABZP/6SEeQxvEjSXnKIWEQwX7NLxNDXNIERE6jKUnN3p/dHHiF4Xv35U3phUQHx0FgjfriO+nUJUPHQHVuXN9fl7ruZgAmYgAmYgAmMjkBtROhk/Ohy+CvqJTaAjO5ROsJDIBCNZoqIvuu7NYRYOQ4m8BEBsijDX03dAyTTbiNIkhjxN/oJQ2Pt2v3BPHGp5DA4VgjyegO8QnZy9wtboeKxWO6a3WoZ3iAxXBbugESQwKlqxKVxlxeNEH4hdXfZ4k8TmCmBfE9IPsPLrfWu6P3q8LIiYFHkGFdGCg9/msBHBHLsXb8nH9HxNhMwARMwARMwARP4gAC1cyrlWvAAwRPdutQHnLzJBP5BIBu6OIy6O0bFfJfyNfvHJbzbBC5NILMiUl8tTvL+KEYQfhP62bhsmc6njSAjfpaZMXFV2qiBdL9novSF5gYJU0WoMddLnsYdUY9bDB67Z03uLGHfIuz1FmHoYDvDZK3uHprlvbIdDVXa1mrp6KmrbwcTMIFKIN8HhsaSZ1W31ETpz1q2MohQKbFHiLOKCfxNgDKHydBXWpgThOCipXDwpwmYgAmYgAkMmUAttoccxenHzbrT9J+xU3g1AjRxMa+OhlJpNT9IqZvwjrlycrVn4Bt9SYCcSHd2PEAwhGSYenFsI0g+6RF/Y2Rg2M4YjoqGn7Q0XytN1eiS9sL9dtOwHAKGDi2LleYK0bF8q6WKCJcl3rKpv2oHGl4xgX8TSCMIxo47TZYu4ybu6Y3m5HEwARP4gAB6G8VIGEH03vAj36MPDvcmEzABEzABEzCBARFwmX3bh4Ee9eYZuG5+2wfiu4+eAO9TzLFDvUQ1E0Z64D1zMIGBEIh2ZNqStWRVeg6S30aQgWTA06JRpCkTow8jFKPHeyHfqRDYbp7rnLVq1FXBsFBhsKSRV0NoHWKv5MRr+EYRG0bKHAsTuDqB6N2u9+PhvunQoV5eikcI74c9Qq7+OHzDARKIIlAfbzoAxMYBRtZRMgETMAETMAETeEPgUGRrhQkoD5XCN0f5x7kJBGc+VPOOeUAYhhd96vBAzn1HX88E5kcgjCF6p/AKocNyeqvPj4RTPAACReKXoa/ee4AMIHpXiYKNIFfBfNmbMPgVqkroMZe91ZFXV4xojOpFKFWpnYbz2TOkjwKGjuWqTAC9Cu8QpSMMHzraBpAjWfuwSRPgPWDB2HEvY+FSk6XzbuERwrBY7HvT8DtpGk6cCXxNQK+DgwmYgAmYgAmYwMgI9OqMI4v5NKKrKgXzFpShe6xMTeOhOhWDIFDr6RgZO821w7BY7Ur1ejzX/aoN4hHNMRKI/LlMgv7R87UR5CMqI9s2Bvl50G3VeMsk7ky/Q08fzRyiidWfDj1O0juE+UPCZTCexdsUFi+RkT0kR9cETiWgIbEazRHSrGUAudeyqfODMGG6DSGn0vX5YyaQw0Bm76q3RcaYU+a4m4AJmIAJmMB0CWR5TUWRRkF0XVpnoq443WQPJmVMgE63RHl/hAdI/NamQ8V9MDF1RExg3ASQabxuC33E+4W8q9vGnTLHfkQEyILM/UGXdIbAorglzE3k2whSnvtkPgefgWtjraZwD2/nTg2426enZssQP3oR8WpheKz143/Sg2tqeFszHNYPK7nH3yYwbQK1Qtiu78IzpGOi9D8yIOIVghLlobGm/fydus8JqM2kYcJBJkSfnRr3ORbvMQETMAETMIFREKB+uFY5LpU2hoyJyS61PviK7SjofhxJVR2iXZYhevAutwHkY07eagJnISBhdpBndcXNWWch64scR4Ds1p8End+HLHncJSZzlI0gk3mUJRfjJYGnBROQDzXEUFklumERZxL14t2hV5EeQIr7Qj3eSQEv52GILG3h3AWNvfpmn3sKAcFh8gSqASTSSf5faBg5vQAdQ8vhCVLehsljcAJN4A0BCoEo6vSBESQM57wYb47yDxMwARMwARMwgSEToCynDkgBjlqLMcThcgSCty6PsQkDCPOB0HbAdgcTMIHzE+i/W9TdY6LP89/GVzSBjwiQ/ages1DEshD62bJsmcenjSATeM6ZeWknjcltJFiXUmRWaizNfcNPZo0pupgadrdPvzVMlnq6x9uKiaR4iSzu7prV3WOzXJeJ1MNAooQXQ8nwU+kYmsDZCDCPzuMv9X5fNg1eIWEQ0QsTDcHjefPPxsMXmicByggKipjE0/l+npnAqTYBEzABExg1ARffV358Bn5l4L6dCQQB5gVpNhoQXtV3NdYV42O/s6M5mcCFCKTUj6rzhe4xlsvaCDKWJ3VkPHcSoozzppbQZql1PEIGn9EVx3gp6YGi0O13zfb5XRegKBxk2JGBZ6HG38V+Eenq1HulnJavdVzCHyYwXQKpKGHk1GTpDIMV4/gyLFYEvwvTffhO2V8E3mT3wZd2f0XfG0zABEzABEzABCBAGe5y/Cp5ITHHN4rUG2XqKlHwTUxglgRkBGE4eERdvHVhCBGJfCdnCcWJvgaBzGLku1y/xn2HeA8bQYb4VE6KU/GZ6F8C5+J0eepvH/S6Gnrfe3eQst1m07RPf2IYoOIFojZgzZGwWmvCaIYJyvDB+bnL3yYwGQJYAPEIecAYolRtNLcOE6ZjKOm/D5NJsBNiAu8IoMWxUMj1ioB3R/mnCZiACZiACZjA0AlkmT70eI49fjTEqiNhxzBY1BlsAxn7E3X8x0RAr1y0Y+n9i1dvqc/aGXhMyXBch0+A/EWxmpOg882WuYt8G0GGn3e/GcPqVZFnSaCS1UPByW1j+I6y4LVFizTwK7xEZATZNn/ijW7V0LtSChdreYdQeFTjR4tC52ACUyZAHo+Ki975+wfNibBsOt6BrTxCGN+37psyAqfNBEKL61ccLPqdKUzABEzABEzABEzgbwK0fFF9wAAS9QUrTX9D8hYTuCAB3kEqL6qnx0gOUZ/XMO8rbYvGrgve25eeJQGkPFMmpCFklhDeJdpGkHdAxv4z5KoEK5mdCdJpDGUy8bJ9TKl7G+P+r07D/hQvEFkxF8tm//LS7JcyhSw1wTq9gXXwUg3CGjcrrOrvBwQLdQ82DiYwFQI0Aq/kDbWWAeReC94gGlbOhpCpPGCn40MCVBbI+/SgirlwPjzKG03ABEzABEzABEzABJJAtBGoLsx3vyNJ7ve3CZjA5Qno/aPtql3SgBWVGn27jery4OdzB6ZJUKuQDCBlIeWqNc8+2AgyySygeUEkP1+U6Zk+fC2hiiFkUoH0RJpk1dzK+PF//xuNYBhHFjKIMGH0ikZhjqEsYQFBlCvxMSkcTszMCVCJUWg1NJwsgzIIaqJ0eUw1ejci42ubgwlMigDynCHfGEs33Mj126J9Uo/YiTEBEzABE5gpAZfnF3rwtTLMV4TDSm7wtwmYwLUJRJ3m2jf1/aZMgCyF4aPvAWJp//rEbQR5ZTGptZgcvSqQeNcR+JqETinDRv8ljiGydnUeBDUG7zU/CIaQhbxEaCTD5fcQdCJDaMUV0kAyDSqHJHplZgSqASRSTaPw3V151/OdwCIaebz/1syMkZM7LQJkabIz3h8UcCHLJ1G6Tes5OTUmYAImYAImcAyBLNc5Nsv3KNZdth+D7+hjVGeIakOf99En+0ATMIGzEqD+grzb64P6OusOJnAGArR+0h5sD5CPYdoI8jGXSWxNtTH1HORqbptEAt8ngoJEoZXRY/fyHMaPYucoCh/zhLQaJmup+RNWNBTTYx4g8kMMLvEjLuEPExg3ASZLlzeUrIFyCZNXCB4h+NtiJLGGNe5n69iLgCR255qCs4IJmIAJmIAJTIYAlTEqbnh4LvRjq4WGQbY7/JxAqkuq53b0GaRzIIu5/pypzzSBcxHgPdT72Kmq3uLZvpT8iwYsv6DnQjyX6yDqyTUYPvb6K98lH2UxMBcW/0qnjSD/IjTi/WT2kuGl9GhtyqL0MNyXCo14+TfPzW7zUp5eSAQMIWUCdeYR6Wgk5lgahjnBkmHEOd1RPxBIQx7eTnf3YfSI+XM0j04YQZzRD6i8MmICUbj1hfaUS7cRPydH3QRMwARMwAS+Q4CinQ47GEGoo+nf9bTvAPz82KjyMl/glrqv+NLQ6mACJnBzAt0OWYfMU/3dcxze/HmMOQLUiOnerckCoviMKvOYE3ShuNsIciGwt75sqjXhBhUNozIAaCMDQc0iKM3x6iMJamALk6rjJYJGjeGEBuLwDlGDMcNnQSdO4fzglmf72wRGRoDKDfPjYAwhYBTc1mHjwiOkbPanCYyKAEKa/Ms8N64ojOrRObImYAImYAImcBwBFfaU9w6nE6BOS18oGlp3NLRqsQHkdK6+ggmckwDvKYYQGSnDEBJ1nXPewNeaKgGKStovd/rE+4N5QPjt8DkBG0E+ZzOJPeg5W3X92Ledhk4v1mU1HU3/xZBypyS/aSQLXVr63xYvka0ahIEjDXuZBpA7DR2Exi1eFhxC4TBuArWS097LCLKS99OT8nb0NKEmpBzuCtC4n+8cY58yHVdxhssIoS4QFthzzA1OswmYgAmYwCQJuFA/22MVyvAA2Ur3j2GwdGXr/2fD6wuZwFkI5DspI0jHuyoDSMuchywWh2dBPPWLqInzzSTopDeryVNP+0/SZyPIT6iN7Bya9GnznF2n2SxQ+s8LaSBvkD1ADg3BbbNjeKwawjtEXiELzR9yUBSjAHIplIz8PXAC5G0C70D0JFk3zVpK1Z2KSDxCokuYjvnoHSln+tMEhkWgL37Jt9is2dbfPqwYOzYmYAImYAImYAImcBsC6Er0CKR3eS5uFrvNs/BdTeBYAhhC9FcGeKfDl95f13WOpTfL49IDRC094QkCBJo8HT4n8Nry+/kx3mMC0yMQimEVD2oQ3j79abY5TJbEBpOnLx5+aagsvSLRoFxKHw+RNb2sMPkUVYNIu75Tibhouhe1Hiu/l8nS9Q5gJHEwgVEQQA4jt6kQ8F3XRxF3R9IETMAETMAETMAErkkAPakX3v3s7fGqCZjAUAjEcCYZGdd1koS/XwmkKMfwwfBXGELwBsntr0d67SMCNoJ8RGVy2zQ0lNLkl6I+WBlA+iwwbGyjdzwNa7K8R8/5haZTuNMcKsUGEmIF10TOxYBCW1xtXK5X9ZcJDI9AP4+Sr+/uIu8zN07kX3qGRWbuvxHDS4ZjZAKlEEMiK6+mDH5TSTAjEzABEzABEzABEzCBIKA6QFQDUPXRm97Ufs3IBExgcASiOl7eVeYHaRnLzu/t4B7TECKULTgx/7MihDGEEFmorPrzCwI2gnwBZ4q7yovBJ6+OwxsCoSAWMrvNptn8+V8ZRDSXAgUQw2M9yjtE8yssmF5eE8u1B3srTosK/QbnNxf2DxMYEAHND9I8PhYPELyfthvlXfJ4bWAeUFQdFRM4EFiq3EJGMx9Iju3oYuyAxysmYAImYAImYAImkK1gneqqMRk6HZ7Q80sjgAGZgAkMnQD1G83jyVeb9R433w39qV0lfpkNiudHmQg9ZzO2iD/+EdgIcjyrSRz52maUr9AkknVyIsK7g6ukIaTbNpun2lteRVC7XjXLtQwi9wwppHY4KZNY6ItC+Ur15Ij4AiZwKQJppMOj6U6Tpes7zHd4hYRB71I39nVN4AQCUQPQ+chmJkOnMlDMzidc1KeagAmYgAmYgAkMmoCrVz97POIWKr8aUZutFiZEr/Xbn13QZ5mACVyVgF7gaGeqMpBOuWUYYAvFqz6Hgd6MXIDhY6NF0j2aI20A+d7DshHke7xGeXS+FHs13G/11iylCJW/USbnOpEWp/AAQYukIKKh+Fm95sWu07KXYtlK6kQjsuZZWK3XTbtaq4NymcaKNrrYF1rodaLsu5jAcQQkEZRPNd6bJkuXMUR5NbxBcois4y7io0zgegTIowQ8QLJAy21ljz9NwARMwARMwARMYN4EqLNSB8UAwuJ66Lzzg1M/bgK8vzJidlu13FEHSk/4cafKsf8BAaq/VH1zEvRt/f2DS/kUEbARZCbZgJdmK0G6kyBdqQF0rYb7Q4P9TBh8N5nR1oZRg57z8vroZATZapis2C6gDEePoYTJ09tfv5rVcl0Kp9A+Ic7iYAIDJEAeVd5uNbxbs5SH08tTnSxdFSYMJA4mMCQCIWyJUJWpFq1DejqOiwmYgAmYgAlckACFvnXTfwIGkdT48P7oG0Cs1/8TnQ8wgcERqO/tYUg71dfb8IjXi+560OAe1zUiFOJdDz8nQeeeLhl/Rt5GkJ9xG+VZyEsmAVezffGo029eHMvRTx5nLXxCuLBOT/ntNngFMxrmaDPGw2YjQ4iMIfudhmrRb1lD9FuFVcyzUK9Pw7ODCdyaQOZDMjb5U15MjYx7JWPXPOoK062fku+fBBj9Skb70vsppHHu8bcJmIAJmIAJmMBUCVD+53xg6K6uRn3+pFGPkg+sGAKLYH2+cPCnCYyVAO81yyJf8LEmxPE+hUB6gDCIOQvBteLC4SefNoL8hNpoz2Eyb/6KTsQ8GKU91EL16Ef6RpkUSSnoYVjSBNMbGUkKyU7zqK+b9eN/zWJVX7Ha8MyxDiYwCAJkRSqY5Mn+8iaPDyKmjsRcCVBYhaFOGZV8yW+L0LnmBqfbBEzABExgDgSynI85wFTwMwcjc1u4DvX100dHysUK09esvNcExkaAzrcR9JIfPOTHlgjH9zsEEOcEjB50w04PkNweO/3xIwI2gvwI21hPyleG8ULxCElhOtb0XDnevcbhJJkx2MtDZLelN31hulzvm0XME6KJrAjqkdPSmzka8urZVuYLG3/ehgB5kYolC2OMMkcI6w4mMAQCZEVEJb1Aoyeo1p09h/BkHAcTMAETMAETuDwBdICVPhj8nPXUCy5/5/HdIfQj1e/TVhS8+HAwARMYNwG9x4f3WS96jDjid3vcz/S42Ge1lzZbisHq3xfZ4bgr+KjPCNgI8hmZCW5PcRkuVGrs3Gtm76V62dIZ3OEcBLKQonySUeT5ScNjbauxvlMb832z0hwM7aIaRkKUlacitVUnpag7R1x8DRP4BwHyG9lPxpBWBrvIfRrCrdk8q8sBRW012v3jMt5tApchgEzMUos7sG4ZeRnWvqoJmIAJmIAJDI1ALff7qsDQonjr+CQbjB871SaZC+QwFNatI+f7m4AJnEygvuMdHRU3er/VMaxdqb5exePJ1/cFBkcgH23x/CgGkGgrVExT5A8u0iOLkI0gI3tg54guXiC4VMXgWJKnC3ko5Mt2juvP8ho0JEfC9al/2pe3GiKrYdEP9nb38g7R8FgYnrpo3Htt0CtPY5bknOhbEsgsKC8Q5rTpGHpoLzMplahocC65+pZR9L1nSiCyHsI0039YyQ3+NgETMAETMAETmCyBWu67+P/8CdfOIp10924r/T0MINbdPwfmPSYwUgIygnSMLNLRfVnvOIaQ10rSSBPlaH9GgGIPD5CNFlplkOqW7J/R+v52G0G+z2z0Z/BSsfAiWa+83OOkoMIAgtGp1XBD7W7TbJ//qI1Zw2ZBX+6M+RxaGUcWq7WGvy9eIvFcsKSwOJjApQnUYdpa5cHu/kHZU/mT4d3CGKKb89vBBK5FgOzG8IGMB85QbQ4mYAImYAImYALzJeDq0MfPnnqmdPXwAIl6Yz3MqtPHvLzVBEZOIJqGMIbEoA160V1PGvkTfY0+YpuijlF78ALhEbvoE4QLBBtBLgB1DJfkJSsLnw6XIFDajcW3NiDv1UNnu/9dCyu4YyBRIaZhh5Z3D83dfzKAMC+DpF1bDSSXiJevaQIfEkCrkidI+/DQdAyL9eePSuAn5UcZ89pinPvwPG80gXMSQNtDoV+lEaRe3FrgOSn7WiZgAiZgAiZgAmMlENVIDCBamDQ+PECUGHdaGusTdbxN4GsCvPPRiZZ3njq7FtXXW955nENcT/qa30j24vWxle9HToJOtOPRjyT+Y4mmjSBjeVKO5wgJSGSV/xp3ubNproUouDI1NDyr8MJTZPei4YiyF4++W/WCjvlDUqGNws0lXKLz9xkJkO8IoUhpaCz9dbvqVs/8IJEvS14tB/rTBC5AoC/emAwdDYWhHjJ/XuCWvqQJmIAJmIAJmMBICKAnSC1wqATQj+rIAzaAOFeYwEwI6L2PPooLOipiAXGYAoH0ACnfJUUu7i7zZG0EuQzXUV2VBk9eMInTUcV7jJENwmnUIAF1fa8G583Tn6Z9fi7eITKKrO4em9XjL5VtKtzixPqE3CA4xkc/njiTv/AI0bBYHcOzPcsbhIVKFnmxn3/HkyrHdDQEEHYYPvQVcm80EXdETcAETMAETMAELkag6gcXu/6YLlybxqwnjemhOa4mcF4CIQYQAnYFOS/Y612tSvIYAqvvAZLbrxeTed3JRpB5Pe+3qZXMxPNg33YhOt/u9K9LEAiXxQ8uzPwhWxqaCXomeIC0GoJosb6TpyMTqccOfdAIrS8aostGdjiYwHkIZJ4ij2meGvJhTMeFV0gE17YqCH9dggD5Lif8i3X9VvnkYAImYAImYAImMGMC0cZH3WfGDPpJR1/v6+x1gvT+IV43AROYKgEqSQrIw3j3LRiDxwg/4hEq3gx/ZQ+Q6z1AG0Gux3owd6piM+TmVgoUDfBLNaovtOS+wUR2NhF5W3gxV8h+89Js/vxfs60GDzxCVuqdv1jdyRZCRUDnpAIsTjGU1mx4OaGXJVDzl75aGeK6R628yEj38qJSWkU0eZLFwQTOSQC5xjBYfGf+eisaz3k3X8sETMAETMAETGCoBLL8D92AuemY+0IbWeYYUu1W8mMidOYDiaGwBCP3zZGL02wCcyOQ77tkYbfZaQh1bVCn2ZADMxWPY8sCPEIeVZn7oxhA9rHF4vwaz9JGkGtQHug9GFxpp0Z0pubGwyCNIJadt3hgMkBlgVZX9tuN2ps1HwMCUf+L2jO/Xa6L1AwDSNlXlF+eXF7kFmnwPSdDoGdca/BKepBHCJVQKlssUUg7r03med86ISm6Yh4QKfEo8v08eOv4+f4mYAImYAImYAK3IYC6uaoNfDEJeL/uc5so3fKuzAVQjCCs3DImvrcJmMAtCYQcoFqu9p8YbYT6k4XCLR/Jt+6N+MbwsdHCY6Soc+vKtxD++GAbQX6Mbhon7tXQhLjsv3G8fNapbv988eyIHj56GtEeqAeze3mOiDGR+sHzQzvxElms1uoJoCGMqhEl9seJt0+LYzBiAuQnLa3yVydPpLDWyUDX7ELrKr9HnDxHfUAEKHiq/IoyyQXRgB6Oo2ICJmACJmACNyCQrUJ0lMjRWW8QjZvfknqh0p9eIAePmNSbbh5BR8AETODqBKpcaFp1a6bdJ+bvvHosfMNvEqAVZas2Pro71xaVb17Bh59CwEaQU+hN4Ny+3hQ6Zm5w4/ntn66eBc9EJo7SLqhybashiXY0QPOcDu7gKvRk/Fj/+p9mVY0gGEBkJtGfgwmcgUBVqtqHx6aTR1Lz57fyH5OlK4elzDjDbXyJORNIaZXfc2bhtJuACZiACZiACbwSkG4w57opyVdLWbeVFeQwBFbU3F8Rec0ETGBeBLIOLtkYskEGkHYluYDB2GGQBHgy2PI9CfptH4+NILflf/O708zOy7iXZqWhRRkUK37fPGKOQCFQDSGJo9N8DPutbMa9Qg+teLHS9s262avw61ot1akuJlinRwAh2hbjo/z2pwkcQyArneQ5lCt9Hyph5EX2s2SePOaaPsYE+gQohA7zgPBDwaKqcPCnCZiACZiACZiA9IKqH8yNRSYbXZvOR9EJThtz+9x4OL0mYAJvCVBnknyI9h/JybbRHErIB9el3nIawC+8PjwJ+u0fhI0gt38GN48B8hGLJN4DKzWexyTp1qxu/lw+jUC/sZl1jB5SiLfPzzKQxJPkaTYLTWi9eviltsV8zatnCEq0gwn8hAB5R3muvb/XHCEyrjFZ+rOWYkGNfT+5rM+ZMQGUdMawpdcSecpK+4wzg5NuAiZgAiZgAp8QQD+YZVDC21p3Swb5PUseTrQJmMBnBGJY9ENbkdt8PuN0ze0prjF+MAQWrXXMBZLbrxkX36sQyNZR85g5AeYGYaFBfRE9ct0WNcio9VfRAAAgAElEQVQsQQP0XxErW/ablzJUljxD0JWXMowsmceh1cTWOqTT9i7O14/YwIVcOP6F0xs+JtA3nmlILLyMwqy2wxtEQ7Q5mMB3CSB+EF8YQDCE6N8i6bsQfbwJmIAJmIAJmMBkCaB/v6muoTg5mIAJmEAlgEgITzmN1qD2n5Yh82jPcxgMgeIBwjBYxQBCxPyEbvd4bAS5HfuB3TlbowYWLUfnaAKhH1dFmfW9hs7aPv2RYaQOWSRRu1yvm8XdvQxdam3koGjYjjOLft1v6D76zj5wVgSKRS1K7nZ1p8nSlX8Wz/IKeZFHiPo2sJ/FwQT+SUB5B6UdEYQBBHUQCy6/HUzABEzABEzABExgrgRQpVGJGP5qp45sfFNPs4o91xzhdJvA5wRSLsgA0qnpp43OZdSrdIrEhsP1CSR6vD/w/CjjtZSHkY/r+rHyHSFgI4jzQSXw1sPAL+b4Mka4PxLt2gDd7WUEieGKnsMLpKVHQPdfs9Dk6TGUUSSxp1DPdazd8T3q28a4byiTghWTpaNo0euEJTQtS5DbPqQx3b3mFXRCG0DG9OAcVxMwARMwARO4LoE5NeaRVhYMIFvp1339+7rUfTcTMIExEJCM6GKsJeSFqlVr5gahnjUnwTmMB5UtIZDHALLRkk8h9w0jpvOMhY0g83zun6a6VSOUO3F/imdcO1QQ7qU4I3GZ76Xdt81OQ2a1y2Wz0BBGIYqRxijVksYYR1jYT2BzPZkVBxP4mwDCQsa1ttOwa/cP2q/fDI8lA1zJV9G9/+/zvMUE0ADxSIvhF/nhYAImYAImYAImYAImQP1LoxhH56KOuhxeIFToXEl35jABE/iKQGnAkbhIjxDq6q6Pf4XsEvuQ2IjwMg9IWec+rvFC4fbBRpDbP4NhxaAOTYLXQGkDj89hxdGxOY6AFGU6Voe0ZV3LDuPHn99ViZZhRPsxkKBUr+4fm/UvzR8SJ2ifTvXTPw71rI8i/0i5Kh4hKlLIXy90QyGQg1zcBwp/vBIgW2D8WEkpx4sos4gFzisjr5mACZiACZiACfQIzERJQCdCjZb3RxhAop4GhlSWWHcwARMwgQ8IqE2H0O0kLxmhoVMdfaV15l+ciQj9gMrVNkEfzOn9gRGE35beV3sER93IRpCjMM3nIBrEmSB9p8Uv6wSeey0ID89SczbsmLchA4o1C43YWhYbiQT9ZhMBY1jb0khZr5A7ym5/zp1A5gfyhyZKx9DWkb/ovpZz0XBM5p+583L6i2YIB0QKCjlaSBjfq9Bhn4MJmIAJmIAJmIAJvCGArlkXdMspqg3oRhnw/ohhZrXBenRS8bcJmMAxBFJGLhCULHiDTFFoHgPjuscgxiGNIQRvkAx98Z7b/H0bAjaC3Ib74O6aLyUv6kZCcy+layWFa2Gla3DP6qwR4vlq4fnv5SWyVS/+rYweTL63UA/t1f19s9QwRxhISrkpcU6h6mAC7wmQL8hLyjMdldQXTZb+rAWjCPnHsuQ9sRn/Vl7JOYgsTmacD5x0EzABEzABE/gHgdQTqKyk9+hWG6OX8z/OHfNu0hs1tAQw5sQ47iZgArchgPwIYWJxcuUHUKnHXfvrV46Gb/cBARtBPoAy501hsVRjJn4gi1ZzRwgGL63Vr4nkimrw+Cg19ODfRi9+vIH2zZL5QfAOWa01bJZ6+IfxQzkhpLg+aNS2QeQjlPPblnmDlK/KvDLhS5ZeIal8zY+MU/yeQBQoPaNY6OYuYd5j8m8TMAETMAETMIF3BJi2kI419K99qfUQ9IqphNCJSr07NKPQmaaUwKk8KKfDBIZO4J3ciEmG3m0behJGGL9+jZa2kDrBwAhTMu0o2wgy7ef7o9Tx8r6+wEVY8gK/bvvRZX3S0AmE8YtIIrKLIWRHb34EuOobxTtk2Szv7sMwkkaQMI7YGDL0p3u9+NW80Mp41mmemcg8m5fiEYLhzB4h13sWQ7wTz3+tpe8d5MJliE/KcTIBEzABEzCB4RCIKil65HCidO6YUNdiEvT4zrrVhNN7bn6+ngmYQCVQ5UbYPjYalUFDELdLWZGxIbvedfZsAm6wMqoOncrLXCAGfXbQZ7qgjSBnAjmly/ASF7nJi1teXr/CU3rCn6RFjZPluesTq4fCbruJYbKKoUPl5/pOuzT3g3r7kzXaVNA/uaQ3z5BA5gkNWVAmS8eCpswSwxaQaUoumyGZeSeZQoRHnxOi8+1gAiZgAiZgAiZgAscQCD1CH3xPLaASha4sA4gmRMcQMs2ETu3BOT0mMHACkivdbq82G9p2JGg00ot+WLyc+bFlsYQBZKOFb4fhErARZLjP5iYxy2Yp/D7K5OiaG+LQOH6TKPmmNyTQqeEaAwgLeWOvj214h5RIoa8zd8gihs6iUEWHr0Kfxm7W8/cN0+Fb34AAhjT9tx0eIfclAjFZOhOn66eNITd4KAO4Zejgkg3x/JEPA4iTo2ACJmACJmACJjASAlPVHaQboRRF3Yn+xOhKI3kkjqYJmMAwCdR6VniEqF2nVTW8eOMPM7pjjRWY0wOEb35bfA/3adoIMtxnc9OYoX9tJS33shSv1Ji5Ym4IxajK0ZvGzTe/HoGWhspqzAhBrgywe/7TxDBZVbozefr68X+ig3cZ+5D4lZzi/HK9ZzW8O+npkwEkO9r7B02WruLm6Y/GcH7SRlXu2GdDyPAe20VjVPOES5KLUvbFTcAETMAETMAExkSA+pZ0JCpbUeHqfY8pGY6rCZjAsAiEPOFDDfNbyRi8zFQlb1f0VNR2d1Y96XlBFpP1VnxZivnjVYyfdHGffDECNoJcDO34LxxWzNDHZAipySkidPxpcwq+RyCMIToFwb6P3vyUmTJ5kCH0sVhpzgfti6DtdU27NMRWeARgQlOIHbm3bPLnRAmkUkUmYbJ0GUO6Tt1P9lp2WzLQRBPuZH1IAFnBEFhFaJRDnAU+ROWNJmACJmACJmACMyJA3Yn+QYdhsFCaHEzABEzgjASqnGk1PFb0bo6hiS1rTiGMAYT5P3LJa5lqkhjmd7ZtDzN2jtUgCORMEa82TbdcDeLB3CwSNGSW4bEwcnQyimyffss75NXQkWYQ5hBZaXLsBZMgE5jsL7KP81ABMqNPDGJ3901HI/jzc1kwiPCbxWG6BHi8GjaPSfkOLtgWAdN93k6ZCZiACZiACVyawKE+MWIdMvRf1Y3UQ7vb0VFIiaJVbcRJuvRj9/VNwAR+SqAIljC2xmTpGq2B+pnr4d8CmuIZUY33BwYQOo9nyP3529/DI2AjyPCeyYBilK+wXmparvXz9fUeUDQdlasSKOWkMkMtMDt1Xdo9P73mDfIKPQ20nzlFFqu12j2X2s92RTWzFd/OUFd9dje5Wc0PcW88QpbkBT18Knsb1AeHSRPIdx4DCIo29lC/95N+5E6cCZiACZiACVyOgPSJHDrqUKm43N0ue2XVjuggFl7S0oltALksbl/dBOZMgLYXQsgcmmQkcPAGYXHdrLA54jNRYfhIIwhoE+8Rl/AhNyZgI8iNH8DQb89LjnVzo4ZMTXstGfnqFzL0uDt+VyKgvFGaspVbslTQNgoChs7aag6R/Xajfdqp/LPEKCKPgDYLXG2P09jvMH0CyBAZQ7qHBwkUtYhvlDcYHkvb07A2fQgzTSEGkJAMftdnmgOcbBMwARMwARP4OYFUH6hDrLXstKjD1aH+8fMrX/9M6j/qD3QwgJTKkOKhNDmYgAmYwMUISNh0kjMhc5A3LClcL3bT0V84KdHuhQGk7wECPfY7jIOAjSDjeE43iWW+yHspaRtpaXvN7bBWo+VKjZUWkzd5JMO8KY3aETN9ZqapMcUTZMtk2Mox2DhaeYSsH381axlC2lbihwFwCTaAFA5T/6SiSpA3SPv42HT6jmdPD7jIIO8yUDnan1MgQKERGqJLjyk8TqfBBEzABEzABG5GACNIKx0SjxAm+2UZiwqZ8cR2g1c04/OnakSHIAcTMAETuCgB5KduwJKy56L3m9bFMYBstOQQWJba43u+NoKM75ndIMa85Jr8ut4ZWWmZeYPHMMZbysixp2KiBu7INwsNnbV5KcNjqQEcAxvziiyWKy1UZpSz6rGH5EbhHB+HTV4ZOQGes4yq7XrddPf3Soye7xZDCIt+uhI48gfs6JuACZiACZiACZjAhQiEHimFMaoHY6uVEl+C6kAxLE0kwrpvgeJPEzCBaxCoYpMOq+1OMijnb73GvUd2jyxh6MrZ9wBBcqc0H1mSZh9dG0FmnwX+DaAMbPR6XPED8Sv/SsRrnxJQJQUjB67qkWO0vtfwR5vqEcA4uIv1qlk9/FeMIBzFf60PcN0cbOvTe3jHOAmE54cMIfcPTScPoUbzysQi9cKGkHE+0o9jrZe5SxP6x0d4qwmYgAmYgAmYgAkcT6BWFOKrV2k4/gI3PJL4Rq1IX3yzjC0NN8TnW5uACZxGoIqfmCCdDoh71cdX2riiviZZZHF04FtRBRLm/2ApXXsPUvxwrFfGQ8BGkPE8q5vGFAGA8SN0tVTcbhoj33xUBHq9CzrN/7Ddaw4IGUDw+tjv5QWi4bF2Kw2RhL8RjeO1gAkDijIdw2hFiELZJfOonv1HkY1nrB0IFCZLV/7oGBothgVg/piPTvK2URLgGTNshYMJmIAJmIAJmIAJzJ1Arct00oVZSrCeNPds4fSbwNUJIH6QQ3RA3Ku9RfYQ19n+fgpgYv6PXDjCEvtvTmPaYiPImJ7WUOJKo7Ti8qq4DSVijscoCJB/osBVbEtGanZPT81expGFhkiKwjj2y0tEQ2St7h6axb1EVd3HPCLOe6N40sdHkjxxd6852pQhXp41WfpLGR6LK7DNYZwEeHb0KsKGyftLyPp++eVPEzABEzABEzABE5g+AXQi6jd0ApNHfMcQNKxbzZ3+s3cKTWCIBJA9dYL0bstIDOrwvFR9jc6rM5dLmXxRCe+P/iToQ3yUjtP3CNgI8j1esz86eq24FWv2+eBkAKoIhJdHvdBuS6O3lqggaCOVBBk7FpozgsZTPEXCBpJDJZ0cAV9gEAT0nHnWEfAIkdErht/bylNIKsfsNbBCZnyf9ZE2S6mQuYSiPb6kOMYmYAImYAImYAImcDoBdF79MyTwhp7X+pEtbadf3FcwARMwge8TSBkkeRSdTPW7xYM/22S+f8XRn5FIqM4yBwhDYGEEYXvuG30iZ54AG0FmngGOSX6+7HjIlR78apyWYNTogcec7mNM4GsClDAqWPjDxnEIGEI0PNLu5aWReaQYTagvqKF8ub7rTaRezj40ph8u4JXREZClC8Ur7CJUDj2M0uge4WuEebF5YfUVRQUfbHMwARMwARMwARMwgTkRoE6j9KLbbrXUuRGjF7ar03PKCE6rCQyUgOQS1TSWGdfbsrYKhhz+CkMI4YAmfvljzARsBBnz07ty3LEOb7TsZQBZ0TtfDZQpKK4cFd9uSgRqQRu5KdbfJm4vD5H9lnkiVPRoxvTl+kEN5Zo/BM+ByIF9y8nbc/1rZASYFySes+JNDxSHcRLoFwxFb1Q6DivjTJNjbQImYAImYAImYALfIZCqLOotw83sUs/NHd+5mI81ARMwgUsRkEwKsaQPhsiK9Uvda5jXzSRTY92pZ+5GdVdJ7Ai5r/7018gJ2Agy8gd4zegjEDCEhBDoSQJW3bx1zScxo3spY+2ZLFv5juGxol0cA9zm6TXX6RjGr1wsZRSpDed/5Uca1h2GTSCfEeOQytMnQn32w464Y/cXAd5DhsHqu1P3yoy/jvcGEzABEzABEzABE/gJgVDx9THEhrtDnEr9OYabQd91R5+fPGmfYwImcGkCzL2qppe2Y26Q+VTeSClFCQueH+G4V3/Ph4ISPJNgI8hMHvS5kkkjcy6vJmLEhYMJXICASp3iIaI8ttdQScp/nXpRbZlIXRNox3C62ra6l3fIg7xDNFQWpZeOKqWYzo8KxwWi5kuemUAaQTBmPfxqOn03T781UTqDoSlgHHEYBwGUZiZE55Gl5uhiYhzPzrE0ARMwARMwARM4EwGUHxShqgylrnumq/syJmACJnAWAimiaFxhZAY1qbRMyEr9e+Jyq19Vzfk/cgis3HcWxr7IYAjYCDKYRzGeiDB3w17CkWGxaONyMIHLE2CuiHoX5b3dZhNW+uIdUowjCw2PVSwf+sLbHEOIAnNMRE6NUowPt8YGmKF+oGzJmBVzg+w1OTrjJu/pj+EweAJZ1+ddTU8Q3je/coN/dI6gCZiACZiACYyOAGo9HS/2oeQPM/pqQKRDVtRLVHe2TjTMx+RYmYAJiABGEAKGjwXrWgYsXiOuZ/ggpTkHCN8O0yZgI8i0n+9ZU3eQf5ILWEk7NUwu6YWv1mn2WVycFbcv9hkB5bk2KhMl01Gp2DFnyJ/f6qxQPEGiosExOnZ5d9esmUcEz4LIqMqp7KNwdxguARlDWnn4dDzT5+em2WhBMbNHyHCfWcSM92vgUXT0TMAETMAETMAExksg9QyMCmst9JSK8UtyBPcbJ436BpUO6a2dOvPgxX6YDD323Th+vr0JmIAJfEigCKhoJ9lIbi01HDkjbUxwaKwUxZQafQ+QQ/HyIR9vnAIBG0Gm8BSvnAYEQ/RoYYVO25IgCBGWFBpadTCByxHAEMLVKZQVqGDsNETWlryoTNjpo1PFI+YIkefIUgaQRYeBJHKvM2pQG+gHzyiekx7m+j4Ur1DEdvIKYZBS9lHpdRgegXgs+Wx41xxMwARMwARMwARM4EIE8DylMhqqh3REWrNQP1IVYfctQsSBDlcygBwmRFdEbh2vW7DwPU3ABMZDIGWU6tvdToKMeY0kWFs6JbI6kerdIZlKEp4faQRhe+7TqsNECdgIMtEHe+lkoWNGb/wQjJe+m69vAv8goIJ6T+M4Pa5qAY1hhLEs9xo6a/v8p1ngLRIN6JpEXUNnLVfrV68CCnpuwX6H4RDA2CGlq5U3T+mRome40RwhqlRGr7/hxNQxCa2R56VlpYXffp2cL0zABEzABEzABC5KYHgKR+m8UxsRGdYVfYhoOpiACZjAKAjUSlzIrmkJrywxSFoOgZVzgFhUjyJznhxJG0FORjjPCyA8aJ+clkic57OcSqrD64PE1EwZrpv6sd/tmo0m2MZ3BO+QhbxHVo//yRCyrp4ivUJ+KjAmkQ49FyqO1Bx5VjKGdAuGxFJPP9xz2W6PkGE8aV4hnsVSvTFjWAqXDMN4MI6FCZiACZiACUydAErIAEKqPnSoUg/qGAKLntSE3Fd++dMETMAEBk6gCi19qQVFceX3QGTtCeRSFJOSnTxcNkoTrQqE3Fd++XPKBGwEmfLTddpMYG4EPmwUV+GGKzou6Srx8BBZrJ6bnRpsw7WTjToPo0nMKSJmhyLeniE3zkH1STDW80rPS8+u2z0oTlJTZNzCPdcqy40fUf/2DEvBnC2hJ/Oy9Xd63QRMwARMwARMwAQmSgCdJ1vRqD+o41V4LrMxt0806U6WCZjAxAgcZFbpRNpS78463kiTSpIQ0yx4fmRLAr8PydW6w/QJ2Agy/Wd8pRSm6ECMOJjAsAiUuUGURyObqtDTkEr78DJQPFVRYXis1cOvZnG/0iG05GI0KXnZOXoIz1JPgQchQ1X7qMnSVxqX9M+fpnmRZwg7PFn6jR8Sz0cvF88oDYesO5iACZiACZiACZjAbAjUukZ0yqqKUNQ9ZgPACTUBE5gSAdXrmJIzPujntuaDOt+4Knophok183+w8EfIffHDH7MgYCPILB7zJRMp8YFwtPS4JGRf+xwE1FCe2ZQhsrotE22Tf9W2freO4bH2NLLL6yDG8qWAr0ucN7LC/hzIBnONZI+xI58RPVIYGovF4bYEeE+YC8TBBEzABEzABEzABG5BYAhtcuir/Kfeeqh53AKI72kCJmACZyDAnKuSaxpkPPqJjrXzIUVEzgHCN8G118Awuw8bQWb3yM+T4BQYIUAYXkiNYCs1gtHMXETKee7jq5jApQiQh1WkF0OHGtK3z0/FMMJ27WQy7sXDYwyTtVTh3+LWTogTUQac0wuQG3xi0Lq/13PSw3jRROlMlo5njz1CrvsweAUwfizrkoYQvxrXfQ6+mwmYgAmYgAmYwG0IoItGkPKz1RC8OxoK8SjXxtxVj/CXCZiACYySgOQZc6s2DDG+ULsI80AeZN9wU5QiWLEOAwgeIDkJ+nBj7ZhdmoCNIJcmPPHrIwv3+lvJ/LFQyzFtYAgb9D4HExg0ARXceH3EhOnKsLuN5gnREmP4at9Cc4gsZQhZauglCs6ljB4xdZbyeRaog07fFCOH4SmMT3oC6zspYCs9E63v5NWDMGLfCBSySTwaoY4gHZj5WsIQYuFfofjLBEzABEzABEzgqgRSOc/va908dU/poXiaNxhBUle9Vhx8HxMwARO4FIGUqZJrnQy9bTT4aSOd4AYcMnZUWem4zSTofLM99w04+o7aBQnYCHJBuHO4dGkH61lUowFSW7OBbA4QnMYRE+gVgaq8xJ++ycbdZtPs//wO75CFCn16dhXvDxlIZBhZrmiE19wUhMjyfDjjFyBX+GSydDqhyFDVyWAV3iB6ZjEJJfscrkCA/K6XhdcoXiU+/A5cAbxvYQImYAImYAImkCpHqxUa5Drpf9kpJvddmhINg9QhwgNEN+X+hNCLyqo/TcAETGD0BGjnYLiMqGbrOxpMriVov0cP8UvMWDB8sKQHCNssngVhxsFGkBk//PMlvdczXlKl/KI52cEERkRABTkFYundoEJTvbl2v3+rfP8TniBk6Ghs11Gr+wdN0C1DCPNT6M+5/drPWQ8jJrbXtya1bxe/mg6DFBVPhsbiidkQctmH0tcehb2Ew0pu8LcJmIAJmIAJmIAJXJiAlBKMIBqmpdloYcgWGuz6usq5Y8C1UXu4VXiA6Efc85I3PXcifD0TMAETOJaAZFuIt56MYxU5OKCQsSNaWwnoMgRWiWDuG1B0HZUbELAR5AbQp3bLlH07KX5MmMT8IA4mME4CyruZfWlkV6VGnzWwo/zaKY8v1PheSn22q5jVfBSLBROrlwuEPkBlyOFCBCpbjB0ajqkV6+5Ow2IRqIziHWJZVHhc4pNsHt44WjHnSxD2NU3ABEzABEzABI4hEKp31UcW0gHj9zEnnnIMN0EX1UInnOico5/WiU6B6nNNwASGSiDlqsQd3m8t3m85H+SA4lylslpt8P4orTdsy+gPKKqOyo0I2AhyI/BTuW0Kk70aILG0YgZRv2x1xvFwNFN5xrNNR63ERB7HmBErfMjUp4rO9s8fTaauOUTI9ToW75DFwy+1Cy/VEUzbaJTncM51uCAB8QUxk6U/yiME49TTH02YXud38WTpl2GP0sukeNHzUrdwNr8MZ1/VBEzABEzABEzgawLoIAyJdXVdpNQLvo6c95qACZjAdAjEyBiaG6TZazwMDREe9cGbyN+3TJHGBAwfeH+w5GgduS8O8MfsCdgIMvsscD4AeILwt2g0TJAkTQqbq+uj50uSrzR3AtmbK78zVyuvM4l6mSNEeZ0GeBn+Fqu1iKEU8KlvnReeIZxvY8hlclNyxdjB8GRqnO/2TExZl8vcdb5XRaAj3DGCMCF69ADSRrY7mIAJmIAJmIAJmMDNCFRl5Co6iTT9uE/eLGu+N0u8b2wCJmAClyeAyNOIC13MD1LbOgbS/5mo5RwgfBMsmQODP3oEbATpwfDqqQRQBtUAaUlzKkifP3gCWeFRRFUDwhiy22ouCjkgaLZ0NoZRZHl/3yzv7oshJBvrSZtODyNJfxvbHU4ngEFKzPFKa170TJgjhCEK7BFyOtv+FXgFLOv7RLxuAiZgAiZgAiZwawI9Ff1iUUGPZwgsDQcT3+jz1okuhtsXNgETGBABZF1t8OsYEgvxl6MD3DCa6v74lwHkhtHxrQdMwEaQAT+c8UWNKaL5I0gaWhsMEv6YKIH08oiKj4bIYv6QnawgZH19MGcIHiJLvEP0HV4j1ejhetIF8gRs67No1ndiv5J+JtI7zROCEST3XeDWs71kiPnI8LNF4ISbgAmYgAmYgAnMhEAq8NIpo/EvJ2APfWgmDJxMEzABE0hZKGNwjMAgIgwJriFhalvI9RARFUQwnh8bLdHRVL8ziteLie80FgI2gozlSY0unoidFEmji7wjbALHE6ChnaCG9ih0KYVVOVKze7NjXgrtZqis2MdGrTFkE8aRliWGyirbc3gtfjn8kAD88fqQHtbKGNI9CDoeIWEMYbLMlE0/vP6cTwMdw1/FUFhkbMG269+cc4TTbgImYAImYAIzI4D+E/+9Dk7a4GACJmACcyNAJ0NCfEUlPH/E5kt/vJW83D9NIEVGX/r+vv44CdgIMs7nNrhYV/H3Jl4aGKvIwzdb/cMEJkpAjeuHgrgaRpg3ZL/daHt5G8p7Ii8RzV3RPP7XrGIOEc766A2aKKeLJ0ss8fwghDeOJkuH95/f2i4jCMMXxDwW5RB/HkmALEq+xt15pe+ax48824eZgAmYgAmYgAmYwLgJhC6kJKC6owfxTWcQvh1MwARMYHYEevLvxh3jyog0CGkHE/iagI0gX/Px3iMJvOp+9IDX/Ai4CUs5fN1+5IV8mAmMmkBPEVA69jTG0/AeRg7eBr0XvBtqnF8sX8JtNLxEtA2PEIwjDKFFiCL89SO2+eNYAlUBkgcOk3e3MN9qWCw2M2G6JnNzI/6xLHvHkYXJnhhCIghoRV03+MsETMAETMAETMAEpkuAzjTolfGtZLqyO91n7ZSZgAkcSQCZuI/2jFcD8ZGnnnAY1VAW2h9ZCBbJgcEfXxCwEeQLON71fQKInh1jA7a7ZqkGyJV6XKsJ0u1k30fpMyZAIArhQ0lcCuYomlV5YqisHENTPzU81qpZPfxqlngtYECkgsWbk6dNgMf1k1D5ybDUPjwWj5DnJw2PpWHKwiMkG/OvH7Px3RGWysyRH2umrEI+sOsAACAASURBVF/jS4tjbAImYAImYAImMD0CKN2pnPB9UMJPSypeHwoxbC2ToTMZMHqkgwmYgAnMmUAVsRhAMA43nercMUk6dezLyciU7NyBuUByudwd5/yQp5d2G0Gm90xvniKEUIxGs+iaVXURRlBZKN380TgCtyAQFacsqsO+EbHYa44KhsoKQ4e2dPt7Taa+LkNl6ZwObwVV3mLOkFvEewr3RBkjxBwhxcsmuOINwhJS6fXZxLH++JgAmBhGjPwMVmP7mJO3moAJmIAJmIAJ3I4A+kks51RUpPig+9DRDwMICzpmNY7cLrG+swmYgAkMgADykKaLHG1B7YCXDHn1GIFGwnkbAvqSd/S1p0TARpApPc3BpEUK4kEpPKcCOpgEOiImcDoBKQthAKEnGUaP/bbZvjxp9CwN21QDk6cv7+7Vo0LeIe8D56NwOBxPYCFDiHhq8LEyWfpGE6Z3MoYwbJZb9f/mSPbKhoTo1aMf6TzjrPc3L28xARMwARMwARO4DYHUS+iwoaFQw1Njp41n0JVRFenhVzxAMICQRBQkBxMwARMwgRgtQBiibSOMxJKQS+qNl5GTiOD0/uA7xf9l7ubnOzUCNoJM7YkOIj1lLpAihBBJFkeDeCyOxLAIyPARb0r0lMAIIldODdUU/gmqsDE3SHf3cPAOCYNHvyJ3MDQOK1mDjA3cWGC2vpNStiqGWhmemg3dVhQspgqH/idMEOHY4GhQQJl1MAETMAETMAETMIGhEqDRjSUMINKq6Vv0U/WF81Af1bt5f/AAOeF6Q2XmeJmACZjAKQRSxlLlRlbGcIGMwqAdVY6ecvk8N2+TBpD0AMnteZy/TeArAjaCfEXH+35EIIUQk6NvtdB+xpA+uf1HF/VJJjBVAj1jRkykXhvsGbZpp+Gyts9/qneIejlEez21Mf2rIX/BBOtteonUXhCc7/AxAdDE0FiSRzKGxJwsrbxBGBqLMfxCSFlSvYUHNDIcX5WN89hbRP5lAiZgAiZgAiYwDAKpq7Qn6sOh8lS9h5RV/bwksrd9GKl2LEzABEzg9gRC7J4oez9IBRKXq9IUkkNg2QPkA1DedBQBG0GOwuSDfkIAAfWihsWllNG1rMBMlO5gAibwOYHD/B9U4PS/V+P85s/vMCJyVml7pvhfNKt7DZP163/k2aAJyLQjTCDn1zk+j+wo9whQGjtkQGoXvzRZuorBp98aHgtDCGhdsf3w0Ubecgb7kI03moAJmIAJmIAJDITAmXQVLvOXSvjXhoGk2dEwARMwgSERyA7QKTN/LpfzCnxj+GBGVdoZPxTRQ0LguAyWgI0gg30004iYnIelP2L8SEFYrLjTSJ1TYQIXIJA92Li0Guz3GrIpO95T+MewWDoG99LF5rlYRuoBDKHFQo/9OJZr5MmsO4iAVCa0JjjBi5/Mw4LbbkyWbkgHAmSi4KSVfr48HOAVEzABEzABEzABExggAXS9nwb0HwI6tJZ9DO2i37k9dvrDBEzABEzgDQFkZEe9EdGpdsC9Vk7sYIgoZ3nvAcKtHEzgJwRsBPkJNZ9zFIGie6bxAzGV63XYnqOu4oNMYMYEonR/fW8KCW3UPxOob+Ul0iz+oBVEY/Xq/kEeIppHhIbreAH1rtXvGVP8OOkBRiA16Xz78Nh0mjS90ZwszQuTpQsoDOdc2yXvobQyFwjf/C5C/WOe3moCJmACJmACJmACYyeAvpNKD52RttIJMYKkIWTs6XP8TcAETOCSBKLOqDYIZOZGN1qq0yH1STrUlYaJo+4eolhHUv3MOUD4djCBUwnYCHIqQZ//JYEQXpJV9F7v6tisFl1fIvNOE3hHQG9RvEhFFcgO+Z0qZtsXNdoroGS0NOar4X6xWsfwWfS+CD0hz/2m4vEuEtP7GUqYpBFcVposXcP1BTO8QfT/ym56Sf9nihDS5Js0gkSmQ5D/80wfYAImYAImYAImYALDIpB6zbGxQkfUsmdy9ZzkNxXwY6/h40zABExgzgTUPsHAVdEUQZ0ypzE9kklWO9MDJCdB5/S45pHX8WEm8J6AjSDvifj32QikcKKTOhOk02jL/CALK5FnY+wLzZxA1NH0blFZ0/u1w4tBYReeINqm7+XdfbPQJODhTxJjP6FS8HbW8zhh7gEcYtWKlcxJxRtkI5ZiGoaAOapaZJNDePPjsNUrJmACJmACJmACJjBsAqn3HhfL6L1M4x06IEYQKrKuux4Hz0eZgAmYQBJgWCyF4hEiQaqhsdqlth0pT5HcGEAwfngS9EDpjzMRsBHkTCB9mc8JSI0MI0ixA6unug5lAmg3q33OzHtM4CgCeo/QI9oYe7NVjzVNFfYkv1O9XNhFFmsm/16Gd0i04+OWWj2y4qCjbjLxgwDFAkiMRfKo6VjfM1G6FLbcN3EMnyZPaOZoA/qUh3eYgAmYgAmYgAmMhID0uWNDPbSlrQ7vD5a564DHsvNxJmACJvCeQIpfydFOIy1EewXuIKvc8f6E8jv3YvjAAJIeILn947O81QSOJ2AjyPGsfOQJBGhH2yMAkV40MPKlhe0OJmACpxDQm1ReKV4y9ZgolTbqbWzfafJ0dofhMTbWt46hs5YaOothtOrtY08cc0p8RnouiceDRj1UWhlDUNZCVkUleEYVYTJDzAGileitIzC1J89In6yjbQImYAImYAImMBcCVc0N5TaG9VSjG52A/qnf9rRhjuUcQm4uv/xpAiZgAibwHQIpe6PTZj0RuZqy+t0m1bq1q3h/2AOkwvHXWQnYCHJWnL7YVwSsQ35Fx/tM4AwE9JLFsFd8hnKh3hOa7HvPMFlV2UCp4H+xWjWrx/+aVZ1LJPSTVFI4YHYBLqhdCmLTPv5qOn03T5p3haGx5hB47GQcTWAXBhAaDxxMwARMwARMwARMYGwE0GHWWjBmMLn5Fj1PifiXaoPHNMegD3G8gwmYgAmYwAkE3gnd2iG6L2D7RzAElsa2iKGwUgT3958QEZ9qAkHARhBnhCsSSPF1jAZ6xWj5ViYwKQJ6z/JVU7r2u+2hM1soGxg6+NdwT3iC7OX90DEpOBullCy0rjG0Xut+B8PIpCB9nJhMKx4hWlr97tpnwQJY4fPxiRPbquQ3Kz4IpL2s+dMETMAETMAETMAERkEAXZjGNr7l3PtpSJ05dEDpfaUb8qeHe4cJmIAJmMA3CKSM1SnI15a5lqhmsr3WMfkqy1sPEA7pna5fDiZwOgEbQU5n6Ct8g0ARYhZl30DmQ03gJAK8bUW/KJ94iuCNymTqWw2V1e3rSJvavVivm/XDo4wj8oSIu4ZphINPisP4T55L+klnTz7TG7I6x4z/GToFJmACJmACJmAC8yJwjP5WNV7NA9cxBCrzwaXu01OJ5sXNqTUBEzCB8xKg7SHnWmoZdUBzgzBcN+0MSGqGvsrlvHf21UzgLQEbQd7y8K+LEkDA6U9SrkyMfoxietEI+eImMAMCdWisbNyWrpF1uv1m0+w11FMoJSKx2t/HMFntYiVDid7PMH7k0XzP5J2NdNesEfNjaDzpQ424bp/iF4840quVPoMpptVpMgETMAETMAETmD6Bf6muqLvotzFsFj9sAZl+pnAKTcAErk4AWSxDc1Yx24Xq11Q5tZkhsHIi9IwX1VIHE7gEARtBLkHV1/yQQMi9kHq7ZikfuIUsvxZuH6LyRhO4DgFV9DCAsPAuMnTWTnOIxKTg8a5qeCx5hyw1UXgb80OgqZTjrxPBG90l0q57MyTW3X0MF9Ywr8p2o42SZAwZNpWAYObh0xOHXjlhBKmJY5+DCZiACZiACZiACYyZwFf6DN4f6MMxeTrr0ofQixxMwARMwATORwC5iiym3QGPu03b7Jdts5MtJD1AUlRbBJ8Pu6/0NwEbQf5m4i0XIJCCbCehh6WX/4Wsv7S7EVLglV/+NAETuAoBDJEstdG/k0LCROoNC9vU2L/K4bE0gXpsu0rEBnIT5ga5f2haTZAeMmqnQaU1l8okK8fYdZgHBKeXSSZwIHnK0TABEzABEzABE7gtgax/yvCB7htDtGAEIWSltfzypwmYgAmYwLkIhHzV0NwSu9SpdxK4W7VF7KiHKlj8Fg7+vCwBG0Euy9dXf0cA9RKht5egw/UYX5Cqcr470j9NwASuRiCtkbphJ2+QsInwosoIst8sm93LU3iJFMOIvENkEGkP84a8jWUOrfV260h/4fFRh4dq79RHJXqtyBsEQ0gYiSaiqqUQRgFNL5dqGBvpk3O0TcAETMAETMAETOATAkV/S/W3eIFIGcoNn5zlzSZgAiZgAj8nkDXnndoZVJvWKITyBtEIMZ1kLyNxO5jANQjYCHINyr7HWwIh/YqUs6x7i8a/TODmBFBCiEQbLgFh/Hj5/X9RL6RdHAPI6uFXs8IIIk+JD40eU2lAJx3ZMzCGBFs2HV4yf/5o+7Y8qilUmFMjPQjkw8rNs6MjYAImYAImYAImYALnJYCeI+UH/Sd1oNeV897KVzMBEzABEziIW6TvRt2gNStpdIlmmHx1r4yRCEtPTMMygcsSsBHksnx99Q8IhK4p6bdXAyPth7XJ9YMjvckETOD6BOKlPNwW74c9w0BhENDSaWgovEAWWjrmkGAb+wgYUORJEENsaT22vn6UY0b1SZprhBkOjCH81HMFbxlpbtonbxnSPnpDCInUc4+0ZoJH9aAcWRMwARMwARMwARM4mkDMh0dHF4ZlIUQFtaz60wRMwARM4HwEEK/UMFmY/2Mjtw8MIWxnfpDSdqAfDiZwBQI2glwBsm/xSiD1S4RfpwbE/b5tVmo0ZZJ0BxMwgYETwLChRv/dy7MqjQyXVd5b3mUCniGru4dmpXk0YlJxaTr08eC/frAyzhBpUNQxAj3+kgFIVhC8QjYaHgtDCPOHjDVk2sYaf8fbBEzABEzABEzABI4hINU1+u5oQvQ9k6LvrAQdg83HmIAJmMBPCNBawEJrAYaPjdY0+HZciqEId51aBiWUVyv5hDAMtULI6Fjzhwmcn4CNIOdn6iseQQCxxyTphIUswbjAEayGBgZ/mMCgCNA7Iw0eRGy/lfqi5TXozdX7HPOEyFtisV6XN/ovDYb3fKRveTX04A3S3EliyXjb4SHT85LpM3plM/A1HkksPOOBx9XRMwETMAETMAETMIFjCPTVzdRj0UvZroa3bosBpHTiOeZyPsYETMAETOBnBBC7dIJ+kQGkDINVq53asUMeq55dvEGyVfBn9/FZJnAMARtBjqHkYy5CIHTQw5X55Ra4Aw6vmMCQCagSeRgC6xBPvcPyDsFLJN7k6jXCsFlLzaexkAdFBE2AVrxDeOdHGqhMMzn8/X1M5BbeIAyRhXfMmDxCeFCkhTgv9c3vET+WkeYmR9sETMAETMAETOBSBNBt0HGk5HRbddjREsYPdDaMIuhBDiZgAiZgAmclkJIVUzOeH+kB8qaqWX/QrrCXTN5u2/AGSY+Qs0bIFzOBSsBGEGeFmxJI4XjTSPjmJmAC3yOgCiO9NdBbyjuMWaOs7TcvzctWBgEqlgrLu7sYJutgBKlHvlGA4siRfJAuIo/hQMN+tTLudEyU/iSvkDEF0sAjo2FgpbTgfszv0T6YMcF3XE3ABEzABEzABK5CAN0m9Bx9q8fxnk4reIGEHsROBxMwARMwgXMTyGolHiBP8gBhKCzCG6mrH/l7J7m8Z4QYDYsVc4xSN3W99NyPxdcTARtBnA1uSgChVwRfir+bRsc3NwET+AaB17dWRpF6HhOpdxrb86C1aNSsxYvmzsggI0IrLwo8RFBwDsfV/cV2MnSNJ2rOMiBoaCwMQndKMz0KZQAKbxASMfiehYqjvHLiwYUBhCc4dO6ZifxtAiZgAiZgAiZgAkcQQNeRuhYKT6g60nVkDBm+nnZE2nyICZiACQyMAGKWQGtAGQKrC08QPELYl/u1eghv6v+0FeggWhdi9IjDUV4xgfMQsBHkPBx9lZMIpDh0A9xJGH2yCQyBQG38L4qLmtVV0dw+PWmYLI0AGkpNK++Q+2b9+J/mDllqG+9//93Xev/nENL0URyII4YPAnOgyJDQPauWjVfInsnSq3dFOWK4n2NgPVx6jpkJmIAJmIAJmMCgCaDovGt2e/dz0NF35EzABExgJASyVY8aMp4fzAEi37uo2ue+fyYl5HMR0ny6qvpPYj7gmwRWJY+p8aaY3755ug83gdMIRDui8p6c32TxLcLutCv6bBMwgVsTyHe5vNFds4tJ1PW20/Oueh0sV+tSJ9WmUv4gDWQ6kRxoNdRUXIN9cosdpvbTixceIcwRIlkWk6XLIUQrfESa9DG8gLxNDxDKfx4W0XUwARMwARMwARMwgSkQyKolLXI7KTm170okLfdNIZ1OgwmYgAncmEBWJalO5hwgTIKO2GXsh69EbjQDRsdIVUcR1WozGNM0mzdG79t/kwDjkcQpNDjZEPJNej78JAIhKCXltphAJPRWknRL5cMUoCdd3CebgAkMhsDhnY7ypm32mjNk8/S7aTfPteFdxgPJAt5+5hBZMdeGhsuK4ZqkPIUrLBrRUEPGjSG+Hh6bDqPIs4YAw/jDvqFocSDkYfAcmAtkibdK/T1gvEN97I6XCZiACZiACZjAQAmg76D0oIfhucs8IDkXSChDA423o2UCJmACIyOAuGXB4PHqAVIqlyGKj0lPPXC/w3tEc4PQNkgnQ0ZbyLr2MdfxMSbwDwIrZ6h/EPLuixJANG4l1BYSdK0MIWXIVhtCLgrdFzeBaxMI46Y0m6rcdPtds33uTySOEYS2eZScfbOQl0i7kDTQehhA8sRrx/vY+6Vilh4hUto6KXDNrnqDlMQde7XLHofQRdDmhOjxTLSR7Q4mYAImYAImYAImMBkCVbnBC2SrBY/kumkySXRCTMAETGAABBCtZQ6QvYbBeq3B1+r/0TGkLWC31Vmqr9I2sGxZ0emW3Ucz9IFfE1ht1UgTQ3gogy1Y1HgTw5DU82wk+Rqg956HQJFp+oyJks9zTV/FBExgoARkFHhftoSqJENo8RL50+w2xYtCxZLmDrmLJSdSj3PT8DC0JBLhlbxY7u+Ll8WL0rHTaKj0Qry5RwiSVvGzEjm0XOP4mIAJmIAJmIAJnIMAjWUEuiSjK2IAYWH9oDtqfegdbEiDgwmYgAkMmECK25wEfSPBixcHEvanocwXStVZQ2qrUyH1/mijZhhnBxM4A4HVVsOShEKghhvcjchgDiZwbQKItFexpt7gJ4nOa8fe9zMBE/gWAZU3fWN7OZfhsFB41IdEQ2VFkAbVasgmuSw2a4aaWql8OkWrKle93GdWrkkfRpCVJn5vNFH6U/V6YT9GklsFbk0c6pirJRr8vlWEfF8TMAETMAETMAETuAABdJsNXrlYQ2pAB7POkzT8bQImYAInEYiqpa6AB8hTzwBySm03q8oYP7bbndqnNWy++hcuGSUib3hSrH3y3Ams9vROraHV+k5LP9PaMyTp+PvSBPBQ3jEJEhMh04h46Rv6+iZgAoMhcHjjGQJLcgDFJ2wGe3knLl+ahYwgnebYYBvCgd8t44RmCup2vspBuePK3xHpiGCRY3ekR0YQPFuoiOf+K0er3E7xirlA9B0apmgFsJtExjc1ARMwARMwARMwgTMTSM2w6lxUMLNVje+VNE7plqFPxseZb+/LmYAJmMDECSBlqUK+9wDhN/tSCmv1xyFGftDZeIZkdZX2AneW/jFSn1gJyKb2GjoZQMIzpG4i865kdsNDxMEELkUghShzg8gM16hpU0MAvh2W7VL39nVNwASGRqCqTRhCtYqys5cBYbP/3xJRyYlW5dL68VeUTzGEngwnOiwCNtSbK0ehqdUOBmvmN/mv6Z41CfyTvELS+/IWXpe4EeNNgyHELsVDy/iOjwmYgAmYgAmYwLkIVL2wfzkm2G01vjxtHq+TpPeP8LoJmIAJmMBXBBCtLFR3XydBL79z31fn/2RfXDeN2T+5gM8xgR6BVX9IEjLyPiZyLUewD++QOIZMV3tL9M/pXcurJnASAaZAjs46ugptdAg7QrQnllV/moAJzIEAZU8vnZ3m1NgyrwZlkJbFfh2Tpy8WsuNjTNC2MHxoN0VVzB3CNbRkL5Le5a6wSjzrbXKydDZRvkYaqoHkCjGJW3BPwDDapXpABjN2sN3BBEzABEzABEzABKZCgI4xqDd0SSag/2SIDiD1N71mOJCv3iF5qL9NwARMwAT+JlAlZ8z9wRwgTIJOzZZq5jlFabQ5czMF2ggZwcjt0IWHP08j8MYT5KNLkdk2vYYSJk/HOyQz4G0amD6KqbdNgkA21k0iMU6ECZjA2Qlg2JAmtHt+UgVXI5Bm5Vayg/JoIaPD8u6hWWlOjqI8le03a/DP8hNjyMOjLLz6xitEQ3tFnK7mEeJa/tnzoi9oAiZgAiZgAiYwLAK0xuVk6P/qc1Ib2IaVAMfGBEzABIZLALGKBwgGEOYCuWgNU1YVqtJMkM6NlurMt9B8oRhbsoo9XFKO2VAJ/GUESeNGRrg/ZwjbOjXY4B2y5Dsbn/Jgf5vACQTCcuw8dQJBn2oCEyUgufBWPsgIsnmJ5bXPSTF2LDHSa+K0bq3irWXM514NNzSmKzPK+8v4wRwmeGHEMAzME8LC/qvJPQEIHD0mV8bh25mACZiACZiACZjA2QmkjkcL3VZ6DjrWX/2SU//J77PHwhc0ARMwgUkSiLq4UsboLekBgiTN7ZdLtDxNZAQpdfrSBs3Qhg4m8FMCfxlBPrpQvxEJo8iuDumRk6anMaR/3EfX8TYTMAETMAETOAsBGQ/6ZU5UZ7WNIR13L/K0oLU/jAuaQ0RGkeX6XvYHGSGikvz23LPE55iLEB8ZaRp5qUQ8Xl7Cm0X+va9DVB1zne8cQ3rxNkFZjHEG2aDg+n/h4E8TMAETMAETMIFxE0C1OXQoocewlBz0nKryjDtxjr0JmIAJ3J5AX5wiXvEBUS37amKWToR7RSJGyKZzIXM83R6LYzBCAkcZQTBy9NtLMILQ+MTJDI3lYALnIJC6KsKsCDTyXT/nneMuvoYJmMAkCKhcCtXnoP28qmEYQZhMPeSHxnxOAwieGAyfRfnFaVeXLlTKifedjCDEhdFTn36Xx1H3XeTZYPyQ6/BhsqWrJ/wiqfJFTcAETMAETMAETKAQ+Eu3OSiIJmQCJmACJnAiAUQsUvVVsl7PCJGd7vcaErvTvE8LRWa1klcIHf0cTOCbBI62YLxmdjpXqLctHiE05uAVUgOZMzMom8J4QsOOgwkcQSDzGBMf7SLfqCcPeeqIc32ICZjADAn0hENfUnQaAmHf1YnUdYxGDz14h4T5Q/IFrxCMIlFOCd3hUpI/FzG+ZlkomRbzgiDb7uTau1c8ZbAJb5D+Med4nHG9AFANIKTSZfI50PoaJmACJmACJmACAyGAaoPOE7PnVj3noNgNJI6OhgmYgAmMkEDWHpGszAGyjZpy6VB47eTQDh2dGUO+v07PwDYHEziWwNFGkI8u+NGk6YzHznwhDibwUwIxwZIsvMuubVbKS0saDR1MwARM4DsEkBsYGnTOXkaRzdOfZluHyWLr8l6Tpz/8ionUX+0CRYHinIsqUwx/RViv1YPlv6ZjonTFr9nIIMLNzyHz+rog6yxc28EETMAETMAETMAEpkAg9Rp0HCbO3dahsI5NWyh8xx7s40zABExgXgSiWlqTzBgLL5oRRF339HnbENX820bBdx8xgR8ZQdLbg0aiNxOnq8GaSdNjf1rjaiPUiBk56lcmEHqsjCAaxL5hwJjs4c12BxMwARP4J4H35Y7Kox3eFpRLki24zjIs1mK1PlyqGD2qvJHG12pS9TBGhOA5o/TJspE7yxOFBRnX1bm2wiPkEKsTV9AQmQuE7whnTMeJUfPpJmACJmACJmACJnAyAVQbdKsdC0YQ9J6Tr+oLmIAJmIAJiAAilsnQ8QB5ie8iYm8hZl/bodtw/Gv79Wo/LRM4ksCPjCCfXXsfCkiZLySUER3I5OnLOuQI5120d+1nEfP2URFAoCJsXxXYVzNIbB9VahxZEzCBYRBAemgJjY0J1DfyDvldxhINwaIPyjAZP5bru2YlTxHKLzZFuRVKVhx4vuTE/RQhjCEPj/qW4YXJ0tNgo/v/OORE6MwHEoaQkvwfX88nmoAJmIAJmIAJmMCQCJQxlIsBhPVjA4cWBU8roRgee6aPMwETMIHJE0AqstAtGePHpucBkvtuCYG6+W5b2p2Xqj8vqOsqRHX9lhHzvUdB4GQjSFrjMrV4hvS9Q7gBDUkOJvA9AjJ8hIKqs7RSJjP+3hV8tAmYgAkkgSirDh4RUpKkOG13GoKKEPVmfaA5YfhQObZYrsKrMXahAYZAiqPP95EVcN2zvWeydIwuuqPiJteQEp9enI+6cURYR8qu8joZuhRD4p/7jrqQDzIBEzABEzABEzCBARIo7V0yfihuDIF18ABB3zkivuhWuVg3OgKYDzEBE5gTgRSLzJOJ98ezlqgOC8IxIvbSrKgvb+X9t6DeHHFSxTfqzBnzS8fA1x8zgZONIB8lPhpx2KGMiHfITsN80ABFluSlYSiShX6nAeVwPOc4mIAIkE8QujFBep0fJPOLAZmACZjA6QQkYag09wOKlJZuu2m2z0/NXt/IIXzRGDprqTk8KNeizAod64yKlq6rGzTNnYwhXHYjjxCGyGL+kG91JOBkXat+Ed8QqP10et0ETMAETMAETMAERkug1BRDv0HfYflO0OkLdTwJLRAPktqQ9p1L+FgTMAETmBoBJCsBkUotuHiBFAMI23I/x9w8ILolv/eqz28VM7xB0iPk5nFzBAZN4CJGkDB4SJngJcErpDQY0ZRUvEK4aasJ1B1M4CsCKKadDCD7vRod1ZC30hwhGM/IRw4mYAImcBoBDPG6QnxwpTR3qNzaSeX7838xrDR7FotlmURd5VZ6Nr7Wl88kkbig4tNiBNHwlP6PWAAAIABJREFUWN2TPCj//Ob2CMJePMumrz+Jky52pqh9fS/vNQETMAETMAETMIEbEUCXI+R3+fXxZ9WLQvVblSFUuo3aKuh04mACJmACJhCiVANNyfsjJ0EvgvMYEXtNfFmF38kIspcxZLnSPJsa1todp6/5FMZ5r4tZIvqZDyNIentgFNkpx7Y9ZYNj+8ePE6VjfQkC0UOH/EMeqdotAthte5eg7WuawMwIpPYUyU4Jg81BylR4iYQEkvyRUqXhsRgiax9eGUgg9TZhviv9Dnn0+vF9iBg5CMRHBhe+27taKWeOEMUnDCF5TBz8yUdcg+toOYwpqGPrLT45y5tNwARMwARMwARMYPgEqAim90Z8E2U2fiOooSwCXyzYQNCTvnkZneFgAiZgAqMngOhDBLJgAEkvkG1NWZWY9ddwvrKNmar0IsuDmB9EG0iMgwl8QOBiRpAP7nXYhCFkk40+2krv/lXtYZsZ+XCwV2ZPAPkVOunhwxJt9pnCAEzg0gRC3qDyIW80NN9Go6EyNFWdW2Op4bFWmsx8ubyXzULHhaFCX72y7UdR5DoEXb99lIGFSdOfNXfJpqqhGDm+Cih+6t3YrDiuHmuR+RUx7zMBEzABEzABExgDgVSBaOxiLhC+WXL7GNLgOJqACZjAgAj0aoxh/HipHiDYhocvWomhRiDSV1SR9ZFxdvV3QJlsYFG5mhGk7+lBI1F/8nSNL6L5zPbKuJllB0bJ0bkpgSLa0HE1+ZGzyE2fhW9uAvMgIAXqIGvKSrfdNlstKFrxv9ZcV0yejjdIdCOU54bWohzj5NC8vql+9Q0oeITc49arS8XcINy3Gkg+egjciqhit1lqBY+Vn8Tho2t7mwmYgAmYgAmYgAncmgB6DQuGDzx2UYvQfb4dQkHStV5Hq/j2JXyCCZiACUyEQIhVCVfmAGEidGq8iNYfidcrMol6cldiSRpoZ+5Xp68YFd9qRASuZgT5igmN20wAS6ZdquGGMdfTIHJyr9qvbux9gyeASEOg5QTpTHa0lLR7tfEOPgmOoAmYwGQISBqFZtVquKxdTJ7e7dVPpmpbMXn6/X0Mm9VKIeuXX1LJDscdhwPJJwmIJ4g8TlQ4lsnSt6/3e3sdrs8WnVN0wfId294e6V8mYAImYAImYAImMCoC6DNh/NAKBpAz6DdnuMSoEDqyJmACJpAEqC6yYEsuxg8mGH+1LWd1UpsGHTCEEOhkT3/FaE9WvTlHPTxHWVHu4M+pELiZESSNHAlypwYljCFspyMrjUfvj8lj/T0/AlvlB8YnXGmSdCYpTo8QK6/zywtOsQnchEAaX1G0QvCUIbIYJisq5Sq41vePzUJDOzKvB4dEOaa1H8kpDCssdAqQYQUjSBhV0O7YnhpfH0YogfqIG8ZHf6/XTcAETMAETMAETGCkBKTX7LTQGSQ9QGrj10gT5GibgAmYwM0JMJYBc4Bo4OdRi9ZO5cOOzonLHB6LERV+WA+/+VNxBC5J4GZGkA8TpYad6F2rnanTYAjJhXPY7qYdSMwv0ADIBOkOJmACJnBTAlUMxRwhyCUteH7stpumfX6KcizKKm1PgwWTqOMpwvBZUYbx8dXwVv0EMrQVw2NRAnIec5OwLeUhN6O7i/5jKKzcrp8OJmACJmACJmACJjBaAlXnCv0n9apDS8FoU+WIm4AJmMBNCPRFKh4gGEBYsC1Tzcz9N4nciTelTr6Xx+AOb0GFNkYYOvGiPn1yBAZjBEmvD9yYorFbqPnGnSknTT/QRwFymBWBEMYYxGaVaifWBExgyARSLuGaxnoY8Z9+F4OEfkdJhcFCO1f3D82dyrOF5hGJQM+UY4syhn/gYI7/7CQmQmfILOYDiePKbfxpAiZgAiZgAiZgAuMmgJalEF91vWw58VPXOnQcQXk657VPjJpPNwETMIELEEgphwFEXfdkAMG5Dvk3cgmIONcfbciMMhRtyap2LxkaS3Ke3w4mAIHBGEHycZA1Y46QmkljwnQakRTIvKzR2TWNJmx3mBOBFNtzSrPTagImMEgCteJ8kEry7NhtKaWK621sz7JMx+7kCRLqV/1o5b2BZ8ihAv6pcsYJuhpDba3vNByE1FU2cTzfjA9IXDCA6N/BBEzABEzABEzABCZBAD0HZYcOIaVJ4GzJCpVJ+lOH/qQhl0OvOtvVfSETMAETGA4B5B3iFDGK0QMjSFlKHGljnULA2BFVan207T6qyFHnDoE/hRQ6DacSGJwR5KMEhSUvetMWCx7eIUuGFtF3BDL6Ryd62yQJIL+KEE9RPslkOlEmYAKjJdDzWlPluqWMUo+UjbxE2ucy4irK2OrusVmpLMNVtxRixRPyTbIp3BB1eJvc3TUdx75oHhINu6VuLnUnByjEsVqXl4kLxYLEnyZgAiZgAiZgAiMkUFWbMH5spdcwHwiGEELuK7++/1kvE8qSDCCLdilvXu6h5sFoPfv+JX2GCZiACQyVACIzxWaZ/6NMgp41yaHG+yfxis7yEufFI6TUrZerLtqO3ZH+J0Snd84gjSDxgtKrtQY8QxgmKwN6S4zvhpJC4xK/e8fncf6eHgGEGfmhPG+evIMJmIAJDIWADBWvRddrpLSR+UO2Ml6EfQIZJmMGhhAmUteU52/q3Gwvll5kHOVcvVR/TpGcIJ2deIIcQh582OAVEzABEzABEzABExgXgVRnaAIII4ia6z5Usk5Ilq4XdcqFGsjUNzqaG7hfX6064fI+1QRMwASGQgCRGuJUdUcMIVv9RtRNUtzVRJWpFvQjZH18DeVxOB43JDBII8iXPGhMUgPSwTtE60yWjXcIniFpDOEYh+kRwHVvwzOXlrrQc2dxMAETMIFREFCxFGUT5ZOW/eal2aCXqexi+0KTny/X9027xjtEO+K4krIo0ULeqcIuw0n3+KhGARXhDI2FSotjJOLQRV8B5k8TMAETMAETMIHxEsDrI7wz9J0eIOdOzaEaeVgpd0CXerfp3Lf29UzABEzg0gQQYyyvxo+cA6Rsn7KYoxrdD6pB17bit50P+8d4fR4ERmEEiZez39itHI0RBPctQho+aBDHIDLll7mkeL6fyLKtxt1XP+pmTS9qhJm2vZNx8wXklJuACQyTQJZNlGVoZfrey5tjv2M0VgVtwyuE8oxvDVAd24oCVyUcX5wfQ2jJCIIxZKvfuxcuwFUcTMAETMAETMAETGC8BLJiR6vdRrpNVwdsQf85dwi9invowiwOJmACJjBBArSevWgpgzJP3wDCI6TI6LpSbpTPEPhRDZ/gI3aSvkFgFEaQj9Lz3tMDV6etcjpjr5OzaUjK5aPzvW28BGS7PQivC6jD4wXjmJuACYyDQK3IF68QxipVtPWx1/Yd831g3K3eIQdhJ8+QJcNhLVRsy2MkKus0DOAxwmSeDiZgAiZgAiZgAiYwFQK1Th/6zlXUHFtBppJ1nA4TmDuBFJlINYa9KsNfqa6pdbblfq1OOtQqt4Y6VCd6tReT9kUMIw0By/xJP/wvEjdaI0h6f2TWZXikXbQk4THbxfBYTJ7O4iz+RQ4Y5S49UYxcijsL6++NYqNMliNtAiYwLwJROCHPlGy0NJVd25eXZsd8H7FP2+X5ho4W3iGPv5rVffEWie3sphDMY7XqYAImYAImYAImYAKjJHDQhxT7WJeSU3vyjjI9jrQJmIAJ3IAA4pPAeANPMn2UwZNLy2nuK0fM43PPSDLyLFwuxWBFG7HaD0l6QTIPCE7lgcBojSCZgnyJyb8YP7LXLJa+nDzd80Ykrel8Y/TgeSPYmVS4aMrTSZ9TYgImMBMC1aCbqe00PNZeY2AfpBorknWdlLfFctXsl/IG4WA+mGWdI2OsbH1jSHEwARMwARMwARMwgTESqDpP6DV0WXYwARMwARM4mgA1QcQo4pOFtrKy6IcCU0jOMXSqK0ftWoBajaBAlTm6VLvqPMfs0IzeCPLVU4vJ09V4xKTp4RFSG4jsNfAVteHvS+HOBOl7DQez1NwgS0l05gdB6DuYgAmYwLgJFE+3SAMCTwvejttn9eWRMaR9eGyWDw9NK8GHR2+Lt4hCKndxQmzxhwmYgAmYgAmYgAkMnAC6DoGK3FY6DROi52TouS8OuPBHqFO6tzuVXBi0L28CJnBuAojKFJcMf/UsMwgzKtVZlc59u1Fd7zCKkGT8drtTvRqvENWjaUR0mB2BSRlB4qXvKS3MExKeIWosJ+MvZAxxmA4Bhj8Lo4d6Qy87PVtlAPJAbJtOMp0SEzCBORFQWZUK7GuytUXybrfdaEzTbVHYHu+jTMMQorGyJPeQfKVnS5R79ffrNbxmAiZgAiZgAiZgAgMlgBqD4QMDiBqpYhisvxWiy0WeNgSaCjzP2uUY+8omYAIXJYAYxeiBEYQlDSDXFKUXTeCJF6czfEcZo2+M3UyzSTuxO8mfCHZkp0/KCPIRewQBwybhFRJGEQ5SRsc75GAU4WX46GRvGzwBP7fBPyJH0ARM4BwEqJyrHENnwyukKG/LZr++V5G2jJ/cpsVIstHIr/uq9nIei4MJmIAJmIAJmIAJDJFAGj/y+5oVvHqvTiMLtCu1CRAH9Cz9O5iACZjA0AlQy2NBZDH0lbrM1TlAVF2s+/TlIAKtOk9HXVpgXDueb5aYtBHk4PaEEQRlRgErX2xflcll85j5ZoHxp9wCbPzP0CkwARM4goCM95RZUW5h2NDvbnUX84QUVU5zJG2e1cNFhhD1ZOwOBhCrwEfQ9SEmYAImYAImYALXJEAlDhUlWu/0ET109fsGnTfUn0R61bJpFQfsIBEpq0+AcDABExgBAU393bxoUU0wxCpR9jg4bx9c12Whw/YQ9NE+/PYo/5o6gUkbQfoP7+AFUjfym36yqWTxOhwal+ox/hoPAZ6fgwmYgAlMloAaBBZ3d027XjeL+/sou0J1U89FurKkTtcxefr6LiryYQShu4s8SMIzROsLJhFx35fJZhMnzARMwARMwARGRSArcSg16Cw301EUEeKyUBwyTqMC6ciagAnMiUCKKaRmToDOEFjYlNlmA8jfuQH7ejGEqGosa/dOQy8yL4g7xv/NaspbZmME6WdsBAZGkBj7TcoWDUULLavlMr7DMML2KT/5qaUtSgEmRvdTm9qjdXpMYPYEaBSgfNJk6IvHx6aVMSTLqWQj714FfagXY3f/oM6UEorIRYbQevrTdBoiS34jOs1DQSYzf5uACZiACZiACdySAIqKdJeox9V49NdvETX0qTDG3OLmvqcJmIAJHEcgRSUGkCctxQASFcI3IvW4q83nKAwhhN2O9mBVsVlW1I+1Q+uFYDnGn9MkMBsjSP/xRcZWjmeukFRyWg0rsueN0MJ7EcNm6btvPOlfw+vDIcBjZJL0ZRVow4mZY2ICJmACJxJAwNXhHPECaWUIYRis2Ma+d4ExrWN/aHgMiSUvkJXUYw2RtZeyR68gOgFEOcdn+X93Ff80ARMwARMwARMwgQsTiHGn0HNSn7llZS7jcOE0+/ImYAImcAKBUoeT2NQ1YiTBMIDUUW607ZZS9IRkXfdUiXs6TzNvNAEDCLXjNJBcNzK+27UJzNIIcoDca0BC7aFhKAwjWm+1b0HPWzU2sYTXyOFErwyBQAr4XScrrsa/36sr9AojlqXXEB6P42ACJnAOAiqLwiif3ou6Ziq/X14+6vL6QB7ePTQY+puXl2anOUNy0nS2yQE4Dkl5Gqd9eWHvNAETMAETMAETMIETCUTlWx/qoFHmAkFnOfGaPt0ETMAEJkwAEZliEs+PFzXdb7UNY4jDNwgIYqtRE7qYKF0MBbHVUIhLDY1Vho7+xrV86OgIzNoI0m8sp5EpJk9XgxHrDI+FbsYxNoAMO19jv911GvKlW0hwaWizGl2en4MJmIAJjJqAyqBWBnkWQodXiLZ9HiT5QvgVCaiz5Qmiol5KnU6U/UNaHkNk6a/FI4QyTvv68vKrq39+X+8xARMwARMwARMwgSMIpKKBB8hWeg3fX+o2R1zTh5iACZjAxAlQX2PB6FGMIGrD1DoiNcWqVh2OISBg1JOpWnfqVM10UDl3JsWRmoQdJkpg1kaQ98808nnN7SFctL5VY9ESo0j1CIlz9NvvxHt6N/7Nc0NyKVAAqHkvPvntYAImYAKjI4BMI8iAsWAYLE2GzoToYbzPfeWIf3zqOtGwIJm4VpHfPZbhsjYvMqjs1O6ArFSoX6ygAPKTpcaCIxxMwARMwARMwARM4AwEehqGFY0z8PQlTMAEpkwg62UYP5gDZCMzyEbr/EaEst/hpwQYdaGcG5wDJh8unH5KdOjn2QjSe0J9zxA2h3cIPWb1VsQwS9rm16EHbCCrRU6VRjuiZHE1kAfjaJiACZxMAA+Qxa9fMSH6oZdkamrHXp0uLoSlDCoPmjg9vEIkKV9Uvqn3JXMqxSW1iSlFmGQ9esLwW6fpy8EETMAETMAETMAEzkcgPT9C0Yja3PmufeqVBhadU5Pj803ABKZBQIPAawisrnnWkvWzHAVlGim8fipy5B+IwrRTB0EXAdd/Dte8o40gX9DOYbD4zolkOZyXg+Gy3htNvriUd12YAM+E+Vy2NOZpXR2ZLbwuzNyXNwETuAIByhqGw5JHCLKt+uz+/MbyamxXd5onpBj4OwZBlZGkSE4JTt0E5W8n4wjGEEIX5Z1laqHhTxMwARMwARMwgZMI0DmD/hkMgzXEENHiw01hQ3w8jpMJzI1AiEtV0ooXiIfAOvfzD7OHRH62+TIKkMX/uSkP53o2gnzxLNLIkR4hvBSpDvFirOihywuikAaTLy7nXRckgIpK4bDRM9qrwW7F86HhTttCj73gvX1pEzABE7gYAcmxkGEy8IY80/dJgfORjZosvVnIsPL0p2metdTtXBvPkFYClZGyuCfLssrT90L1xNhwOwcTMAETMAETMIGpE0CZQIlA39iyoGhoE0vsY/9QAvEkLoOM3FAgOR4mYAIXJpCiMef/wAjCzI65/cK3n8/lEfkqm3YqlzomSFcrOZOkp5fIfEDMI6U2ghz5nHkpcslTaGyP4UlQ5hTSaJL7/X19AjKBSILJCBJFg4uH6z8B39EETOAsBGq5kp4fYWinzDkl5DWRj/IsaTHia14Q5gZp8QipI8tyGKUa39wRUz/re35gba7RYBtekQ4mYAImYAImYAIm8CUBFAu0i50UiVhiw0Gn+PLcK+6kA0jU76Ojo+JYo3nFKPhWJmACJvAXAeYBobYWIuqvvd5wKoFs643hsOj8J9CLGCf61Cv7/KERsBHkG08kGqHq8axv5XXQ6puFsJRnCEuG/vG5zd/XIOBGuWtQ9j1MwAQuRyDLjyxfzn8nlVsoeOt7NLyme37RHCFPapjYVe26yFFKN+JCe0XYO9iQIlbrNBYsGX/w7eb47Q8TMAETMAETMAETCAIMfbVjkUIxxGGw0G8UQqNZqfuH/ruMb9nlTxMwARO4KoGscpWb8qsKqqvGYh4363t97FROUf9dLrtmUT1C5kFhHqm0EeQbz7nv6cFL0dFYRMAIEtbCNobHsngqWG7zyRBYLhxuw953NQETOBeB8NKgXGE+kLA+nOvKXEcyEo8Oqvp4hMRE6ZKcuzI/CHsIqXgjUcMok6I1v7UdL5FWlhDsIHFc7zytOpiACZiACZiACcyZQFaMURIYAit7VaSSMTQ26F4YQFp1bOxU16e6T9yHGt+h8XN8TMAEzkYg61YpgiyGzob2wwtlnTumQShugVEenL0q/uHdvfFaBGwEOYF0NAr1zt+lUURvCfuYLyQmUNd3CCwMJ73jvXohAofSIVdM/UKkfVkTMIFzE8CozhAMMk4s7u6a9v4+JkUPY/u570WJhFan2n67WjfNw0PTYRDZbGQkkUEE0UlLQC+8l6aUdTvmy0pxq9IOBRKjSG56f07vcl41ARMwARMwAROYNAEUgneaQOgXA010KC/oMiXO72I+0Eg7WiZgAlMikHUo5gBhCCyGwiqzE7/Wr6aU3iGmhSo5gWdRjCNMjxCb/DFyAjaCnPAA01KYl9jrrcA7JI0jOXk6E8pGQ1Me6O/LEkA4sYTyKiW2/rzsTX11EzABEziRAJpV1a4wgCz/+08TmN+9lh+X0LxkwIiAq+/DI+M6ljLsRV0fO+2rcjRTlkp5/g5dUPFixIhY1wEMCum5QpKQv03ABEzABEzABF4JUC9+/TXMtaqPXULvGmaCHSsTMIGBEEA8slBDwwjyR4sNINd+OBjC6z3rN3OF1NrutSPj+52ZgI0gZwaKISQbsTCG4ErFG5TvEOtuHDoz9HeXoyGO57DT0u+N/O4w/zQBEzCBwREIQwLzTVFurNfhBRKG9TRWXCzGKqXwWlzJ6LLGmK8bbfEIQQXXj4Mm+HcEODTirW/mMGGd0S7wIYntWqEUPJSD2u5gAiZgAiZgAiYwAwLM/xHzgaBPjCu8ermOK96OrQmYwDgJZDM7o/CpNiYPkGIAQXq+9c0fZ/rGEuus9saIB1RqVYy1dQ7MsaTB8fycgI0gn7P50Z5o5KlvTbw0akAKw0i9Gt4hjPHOdzRs/eguPukzAllwbNSDGX1bo92rV7Ia31KSfXait5uACZjArQkgpzCAKB4YDygjWE/DwsWjh+VDcWjvH+TOsWq6lz9N80eTpYdHCHcnNh+H/h7MIHiGHJo7pMkzeTrJC1FM4nrh3c/eHq+agAmYgAmYgAmMkkAW+CgEGykCoRRova8wjDJhjrQJmIAJnJ8AopEFUfmsTwwgGEKoJ1lsCsINQswNstUzWGiS9NVSAyYUU5TbcW/wMM54SxtBzgjzo0vxguSS+/c0MoVimFv8fW4CFB4djYkaz36J4anewI1t5ybt65mACZyTQBsTlct0WydEv5qShQEkgqQlcZDcxPjRbdVwsWU0WvYfp4aXSxWlnTNQF/e6VpR76laZd8rrpXzWYQ4mYAImYAImYAJTIIAyEB4g+qZbM79d4E/hyToNJmACFyBA/YiFIbAwgLDw2x4gF4B95CV5Al0d8xlPkBipweXYkfSGe5iNIFd4Nv1GLNa3dd6QmDidBnoMItqOkHM4M4GDkGLFhM9M15czARM4FwEaB/ASZCJ0TVC+0FBYEdh+1cD9JC8x1jM0lqYJ6V6em4YFd2BE6TeN+FwxPCJpBHk/OarkcpSF5a76tKQOCP74/9s7F8XGVV4Lx0l6mdn/+7/p2bud3M76BEo9mbaTtIlj7EXrG3ZsWIAkJARGwAgYASNgBJpFQJwfxZFG0IYhpNU+GAJMBE6Oncoa54MRMAJG4PsIJGVJ4wdHPEAIee/7X/EbvoKAesMqCf2pP77TwMCDDPt4g9B3deF8BdFx/MZGkAHKoe/1QQOKdUJ0/C1+gHTM8ROFcRQmcpRj5wiE82wEjMB4EcDQwYZRXEaQ1c+fYRCJ9TiIHzqwDgiGjvBKQciTACjjfVkf5LLEpPBONljU74/s6IGY7utCw8plqfDTRsAIGAEjYASMwM0RSKaPSz4GkC0nNeS9vB75MaQv0ox8wgVbY3kYOcROnhEwAkIgyQtjxV51hRGEYHITMNx9lzrbnQYD7vFuVMEwYwIGklJ6d0+iE3AhAjaCXAjYdx9Pr5BYuFuKppSn4igha6UtpiHRh/LZ735zjr+HJLGxODrEaaU9roRJxHTqYASMgBEYBwKiU9D7LqbwE+VCsNIWPOAPq8FASea7LACnKQW7tbxSnn5oPlRR0VgsXdNjQVqhqhDaM0Ohxr8/jGNIESjjhbopHshn4YVxZfHyd8R8ZQSMgBEwAkZgzAhUwSDYunasLl6jxpzqY9qqOBJJjvnfJaPFQmc9g87xYZ8YASNgBL6GADQGcoPXR3qBxIAxxbVEMr+W+7Z/VfqqKr/KL9rOzfRTH+2p7igyG0EGLvO+En6nkbXpFYLWh7UrlpoOhdaUCiC3q68XUDAVYSmUFw9iJQ9S5mEIIRjXgoP3RsAIjAABJKlK90Oa0vkojOB4hBAwyvzQvFhaEO7w3/9paiyNVYrF0qGkl4np7z1NXtEv8Cqd8rkYEJD0miQ4GAEjYASMgBEwAo0gkOIBBpBWA4MxYjCIMtCxRpoyhbDScJZaLQqn2whMDQHICBukEgPIi7b+FFgmM+MucfqrxRCi2RK4cBg9AtKwH9ucjSB3Lq4wgpAGNR6I3U6tqa/4CWMILczhSwigwmN09V4GkAPuIA5GwAgYgbEhgAFca4B0j1qDQ1NQRRiTQFWkvLJGyINE9ZDY8Qa5zqjIFB3jvdqFpzEGGH03OwicmRWOreI6PUbACBgBI2AEegjA0JENwnNCF813YZUB/rUd7Tnksfl89crMp0bACAyKAOQDMsL0Vxg+fmnDEEIcekCTF4EwylBKhnVB9ntKT4ME3TkdZUmRqGxnOdhSpaa4MsW3jSB3LrZ+wykLx+609uybYmktz5CVtnzOlsbLCixIFTttcR4/5ww242AEjIARuDMCUvp3MoCwDgjrgYQRBGtAjw/cOYVvn4eOPj7LTWO9OLyyWPp/b+m8ghAYNLqS59P1Q2THlutqMYq8JaicmZqfIuJrI2AEjIARMAIDIhAMXN9DL8Q6IBhBYmTDgGm42aeUl8zfzb7hFxsBIzAHBCAlbGj7XrXfSCfV9wCZAwat5jG7ugxiP2xYIJ0u8UozGFCizOLQas6mle5g1yqsOCprrOWy0QxMRY+uWJWfjSAjK/MwhKgFRSFReLkxP0htWWkQGVnSR5mcQpJwUwM+2f+iQZhCjbKwnCgjMDcE0tDBdFMygCyfn4t5NuPHgkchoJLaRVHxWGGO7J3GLG0Yr4TGI8WM6yU4PlmN1VDspXoLe31uqTScUvDrf/16+fCbjIARMAJGwAhMHoEcv4f8IoVDmTZqCty5ShyngsfkC9QZNAJG4BYIQErY8PzAAMJGmAK1jIzMYBdrWUY+5VkgA0jHSD2H0SDAjBJ4pKIzR/+7U8RWsonbihIAAAAgAElEQVSNIKMpoj8TEmQQ7Y8CxBBLoyYdkQKoFpwKM9YOQWmGQkqhFGicevcOAqCEg+FGuC4POy2SviwL0Ef8Oz9wlBEwAkZgAASSdneV5mNkCHoFbc+4AdJx0SdIYGw1jaSz8qKL3nPmw4Ub6mF9B73KnpXUTwK8cFWx49afT5z8wJdGwAgYASNgBIzA9RBA6xBMWscwiCAoOBgBI2AEjAAIJEXsT3+VHiBGqC0E6K3T1zxI0a4xgaGLXTK1dXiEtJWXqaS2qCI6iSEqE8ki4VhAo0MkQT6JAiO3nDC7hMOoEAgC2VMohfVK7juMtUUJhLKn05zxNLQSVQoyLrz7EAFQ2ohQMZoYi60mGPvwWd8wAkbACAyBQFfpeBi0Rd8PYtxhUMCwMMZAuvobvKrHr26R5KTUIBJGowoN8XGqE7ghHiIORsAIGAEjYASMwIAIJDNGycA0WBhAiDNLHrAQ/CkjYARaQIB+C4ObX9WDwROEYFIZMLS1U6FRbnSJUbhz7NaKCa+QEt9WhiaQWpUBg94xeGxVJnh+EOrw0nKeugIVmI0gAcm4d0EiaV01hHfIdhsGEaJohCjTbBipAH14YJox0HIwAkbACIwAAU0tFQuiayosjNshRY0gWZ8mIXhRMcYvnjR911YmCPEj5te8tUGEdL1xwnpehR5GfhTvSCI65NC4huL3f/Np3nzTCBgBI2AEjIARuACBymVhtMFs2bmvdQGAftQIGIEJI5D9EIweOQUWHiCmlNModAbo5cwOb7wvmOE0MjjiXBSbhlqYygDjx05H9AG5vARJj5LQI6dSiY0gIy7YTFoUWlquFHks3PoAI2DX9f5bI8xf+/iGQLEFvl37zAgYASMwMAIYEdi0mtry8XGx+t//YmH0owGBe2MOmb6Hx2K4eV0pO/8yFKakuserbpGNvhCT5yRJ43BC0oEHRhK003p1IfUwg9bIUb0FVH6nETACRsAIGIEBEKjcmMNUB5ulwDEAmv6EETAC00AAshFkUUfW/sADJKfAynvTyKlzAQI37gIb5A8QQOxAP87i56z/QSgDIz/4gaJtBPkYm1HfwRvkGOQFQsHT8jwlyBEVnxgBI2AERolAsGeU9TKE4AHSySMkpsLq0/VRpryXKBaB09Y9KDcskh6WCPEhTTuoG70Hhznl8zGuqoBbHFNIoj7PvehsWDodpjD8FSNgBIyAEZgHAsgtKB1gtFMORciYcg6dNyNgBK6IQPQ/9D6GiGH4wAiCJwiUkml8h+8p6aMOV0cgp1vasz7ITlfqa7q7eXWY44XZZmhDeH7wB/4c0YVjAAl9BGXwlyTYCPIXgMZ6u2/dorB3snxxXEmpxsLpx/uKm7hYenER0Shig0IZn4vx8w+MgBH4BgLQHTHqWAy90p88/8Zb7/BTOIvyshK/ef4Rni2HlxcNdXotypC63smQCYOup9QTfBF7jAIjRJZK7lKuIbEeFA/2GGPvNJ73zggYASNgBIyAEfgAgWS2kmEWW22xILqehZnGvQ9+13I0ggT5PQoPU81oy4XktBuBcSAAdWCjG/KqPQaQ8Fiv8To4TAWByhp2WhPrICX8ai1dLH1j9fdDIT+VfN45H0fdttKxZ80P6b5Z9yMcAMSaYwos0niGAYTHbAQBhQkECp6RxFQQNizMqeDvV5oJZPXbWUCG3YtgheLx22/zC4yAETAClyGQHiBayKnQ6ehYX/aOuz+dygDxmwVTY+EZwuJw4kOLPcv+3TeEqqLiyoHrToR/r2S+Nz0WnRUHI2AEjIARMAJG4C8IwFAJ8HsMIBhCCFNmpOQNOYcRFS3KbFFA3hkBIzAEAlBEtlwDBCMIYcokMjI44114Jog3FF2sWMUdBgNOFf5oT8gbtCB14mN9bKa+Et47BiiU/8j+uW3MRpAJ1Ja+lTGnyYrZ2WtDxDuk3xD7z08g+2dngUYRDEnuarQj1lGJxXPNks7G0A8aASPwDQToONe1QDothr5kQfRqCPnGW+/70yp8hEFHC6Uj/B02vxaLX9qguBhJ7hig+RnKYIFemrjJpiSutPWnk+z/Ln/voxEwAkbACBiB2SPA9FcYP9g4n3LI7KnD2D0w2KMMOpx8vqdcps6bEbgRAtnjKdNfsQ6IpuhRRwMykvdu9Gm/diQIMC3TQWMB1d1X17gMTh9J0ppJRlEdlBYTMztI1oilH8iBovG4CdZ83F3eumwEaaY6fJzQvqcHRpA0hPALjB8o2fB6COUUSriZhy1YMG+9Wtgj2NR2Y2RmXjGcfSNwSwSgvdAe0Zzl8/Ni+fOnLLFiwVhkm6bLyldVgrC2Scw5JaJ60DohsVg6eUsie0t8P3h3XyxCkILOcyQ+YcczpMN1WXH95z94paONgBEwAkbACMwPgWCcyrbEFs1DEQaB2TBOyTHdeqnpNZVvPF+mbvyZX+12jo3AVRCgn4E/fE6DxUtlPnWYOALZ1UVBHwp7+poPmoQ5b0w8/9fMHm2oBLw+tJYOU18x6IIb2VnX+XewtREkMZ7Qse/pwdQke1Wco7aHuoMgpy29Q/rPTwiGv2RFDamTibbfkv7yC982AkbACHwZARTwaN3ZZAjBAIJB5Bj35ReP6IcIehgTMIbsf2gkjLxBtpuiLBiBEIjshAAVx3J6BA8hS4xRW7mLjIVnCEdC/qZceW8EjIARMAJGYG4IJI8URwymyJG4GeBQ84iYcJQHOJlD3mdQvM6iEfgOApAByAHTX+H58UtbLoJuEvEdZNv7Ld18Rgocqukru78lvr38DJXixGknb8uYuUEIEsdY0TLVGCkRuIHvW//8q+mzEeSryI34d32rGPUEa+SbC1EXC6czRVYo47LGjTg/t0maWhXgmDPdBl6/1QgYgd8RgNZKAgqSgyQkunyYGv1FUiGsH2TgEY/ZrBaH/xSHVwhDR5lPewQhyX4eSRLGqB1CK1nQjTCRhxvzCBLsJBgBI2AEjIARGBMCwUC16zPSMaXvJmmR7Ebf0cEIGAEjUBGABLJBGlj7Aw+QmJa+xs+KRCrPDqoP6t/HX/TzSw3oNMjOhpDPakdZSB6dNZ4fGD469cMDM+2KyuR6rclGkM/KYiL3UO7EaOOaH6oPI1x3pTZFbHqHTCTLn2aD/LPBrLA0EnpQxLV3RsAIGIGrIsA0WPKQKFNGVWNApT9X/c4YXoaxI6aXEn3daiwUI0XxSByx9gBOULxyCoB7MQWmkSSUfQq15b73RsAIGAEjYARmhQAek/DF2GaV87fM0oE8SgVv0T4zAkZgfgikPokeTi6CzrAv+g309IJc6OgwHwRSpwib3DGFk0J/gPp8kDgvp9mGMHrsNRIxjCA6p0/eVWtiYnreG897ykaQ83Bq/ql+46NSYWE7EmbVrJUUdHiHHJ/TMxDwqQbytlND46hcLzQxzXHqkynne6rl6XwZgVEjACOXAYR1QFgMPVZLU1z4eI464V9NHFRUHEbGkO75R+T38PqixdJfa89gHB4hp7kLnlgZI3wS2St0PmRFWdKAFPFKGUd4Rtfk0sEIGAEjYASMwKQRgOmFzCKutxVnhDES4IUORsAIGIEZIgD5Y0PNnet/FM2SSeMMq8MfWWaN5oPWj0K5v9Z6UisNDqRmxIC7P56eX0QxbOAvgzqk6KYxGqGfDdFCD8TxRtDYCHIjYMf8WhpfNkCO6QWy5FwJR7Rlu2XFGwM+MK0Dc59olHIYgMaQKKfBCBiBaSFQp4jqZGRePj7KKPBc8pdTR00rtyU3KEvgIkg4D8ozniGa4/PAQqoHxki1EYJXKqlkB34o0VXnDBaI3M2CT7ZRUk6lETACRsAI3AyBytLh47Hi79y5H3g4GAEjMHsE+h4gTIVV+gqzh8UAVAT28MyDpnZCoa/RdPQfHQoCRQ1SMMFgxMLnWx3pa9PjvjVUNoK4JgYCUfmqQSSqnlop3iFTXzwdfxdYluVZNwQjYARugoDoatAXNOmiqeltF+uBEDeHoHwv5AETxoONFktnI++NSYMYzvHe2ctwniXH1JKrdyS1vD+H4nUejYARMAJGYKoIiJsxpQfKnFDowN3E9N7he1NF4N18hfw2dxDeRcaRRmDSCGSrZwH0jXK6iTVAal9P13l/0iA4c2cioHqhPuNOM/BQQ9CrsjXW/T0zrx8/Fm0iMy0Roqz5Ufym0IuUqbCQLVAPYDD6+F3XumMjyLWQbPQ9qZALly3VuPQQiQaqPIWXSKN5+1uyaV9psx+grf0tOb5vBIzAFBEQXQ06C0dXpzlpLOezCGWoR10LRcuNw2dYKJ01QhoxhCR/ILmIbPzxT/ySRduY9msWhelMGgEjYASMwCwQSKYWQ53F8PDkJGR8uZrnHnkOHASLgxEwAvNDgKaPX/uLegWsBUIY50S/kTTv7oRA6ll3GkCw3+8W64fSb9Qk/Ko182Ig5Ba2Get+aCaejabWZGZNppou+tiyH0rGsBHkTo1ijJ/FEJKB81w4vVgsqyJPDxyVePlw48dwTzvmwVLtEQqfGAEj8H0EWAuEBdHxhMAjAjpLB3pugTyzWLqwOOw1JdhW46c26kIwJWFDeCDE9e1XMTAWKe6kSLnMQQSc8zsHI2AEjIARMALtIFC5F0wvGJ+uiZpj6DHxkOU0piP6w/B/ByNgBCaPQMryGD2wDf/qeYDMlSxOvtCvlsHKJzhQWbQx4dPUdKoJV7QH9e3JLnlkrQ+MPsTDMln8vCDCYujlV0OrAmwEydLyMRQ2fRjCdUuVlPUy1uu5VJXaEvtA+NwIGAEjcAkCqTBgHRAZP5b//BOGkKOyP5QJl7xwAs9GnkVfNQxmuVwtDptX2T/+lSGEroTiWTekkRDCXU1rCHec91gHWWVkCxsLqTsYASNgBIyAEWgbAfOyKD9parq1lDvwdqYJ0+heByNgBKaNANSPDVGftT9YCD1bft6bNgLO3fcRoKYoaLqnqEzlatJ7cozBI7w+eoNA0wsmPWXuAcJcNNv3wLb5bx6VO6q0nTbmPk+LZYxwHdpkdyNEYWjYI7HIVvJ0oy/5tUbACMwKAWnDjwuihwcEHWZtcwxp+IFvrNaitaK8j4yn0hFFAscGA6mGL8I7jjnQCTkiLka4VMbSDTTPqT7rYASMgBEwAkbg6wgU5laYGOeVj339hRP6JYYQeYJotdvQZx0Z/oSy6KwYASNQEEj5HrkeAwgbU2ERuGfSGFB49wkCqWOkvxgz70xwGuVjO6G/HzJDOeIFgiFkH/GKg39+gtVQt2wEGQrpBr+T1jka7Ha7LZ4iOice7xCmyeqHNJD048Z+TiOkUW7UOHfdYbEWUVrVxkn7dTACRsAIfAWBUIwnw+8fv/KyKf4GAfD5RxhEDq//ya+8LpZ+wldayHoKc3lM6S6cf6s1BH7CDLBaEo9ZwUJANI9poXSdRiNgBIzAjBCAkcGcGObM2l3M+QgfcygIJKMPBm4u7mphBKaMAM2dDXIo//VYBD0n8plyvp23KyOgSgS3CANIzAR90HhAdKnULg0HnAIrkf40llOQ3LDLOa7Ic2ZO9wllH6d33dkIclf42/g4yrw0cHCMNUKkqMI7BIMI7XYsFfqriG41L/1So3SXKxl4ms/NV1Hw74yAEbgKAhhSoZFMI6hjyDYpBFzlAw2/JHAQIghDD486yCLAXKEsunrIsVUN56+X9FLkRbgt8i31guvWOWYvkz41AkbACBiB6SHAel14afbnfJleLr+YI3F0MfjoGxfm/sX3+GdGwAiMGQGaNzbgnXpyG53hBUKwFB8weHchAvQLY7kBHTsZQKIPfOE7xvr4QYYPtq0GTmylI6alSBOijI6zzdgIMtaaNOJ0IfSVBvw2BQhTZWEcmYp3SHjBIOCOuBycNCNgBEaIABIOnnKPUvBrY02QpCcjTO39kyS+sXh8Kj0KvEG21SMEI8kEAjyEreSmLgBHHZEhhHgGAcE/T3PLPQcjYASMgBEwAsMiIG5UlRalE/TGwYZNRwNfg3GzmWE3UFhOohE4H4Fs1sX4oa6JDCCcmxqej6GffAcBVSDq0F6DDDTJThjSY3A5/UAqXUOhpLf0Zfcyfuy0PlZMfUUfl1D1qGPNlo0gpZi8PxOBUObpWdydMIbEKBhdMz0WrbdTXD6T98589Z0fq00U4hSczwaQOxeIP28E2kMAxg8NxCD840dsGESIi629HN02xeIjhO7xQfNry2NGFoHDv5IKtww9FWatSYSRmz93KQAqR1EPGFx75I/wTdmBkm/++WvHGAEjYASMgBEYCgHklfxWcq+89tEIGAEjMA8EIIP4p/+qHiBQQ2azdTACX0ZAlSiGvaly7ZkFQcf1uovty++89w9lAEEvzOLnTINFO4lt5H14G0HuXXEa/n7fCELlP1XicB0jXGsjOCp9RphnGithhwJTG0yO9Gd83PTOCBgBI/AZAqId0LmgG3g4aDosDCIH5tVWvMMHCMAjZCzq1g+Lw9Ozehkb9TwYIiNrQeUfH/yyuWhqQVYF6onkxRh0G/EnuWF8TXqJuPacgONLI2AEjIARuB4CMCQYDUyJ8QlsxLE5GAEjYARmhECSPobEFg8QiKP1QjOqAjfPauhFo0NY61bwWvQIN//0xR+IpGkXGg4lEL0va30QT3IxfuANUnS9aifxg4s/M+gPbAQZFO7pfSwNH1R6psjaMbK3NopYPJ058RsJ0YildKMRs0D6g9J9zF8jeXAyjYARGAECooEiJEELRynNjACi35IAXgQZQZbdanFYa/nBf/9dLDbVeIRBaULhd9lQvFPZx/ieIc/kQxTeMS0Ik5l2H42AETACRqBFBKo6A0fM5L0tZsNpNgJGwAh8A4G+jI7Zo1z3Y7/xcv/UCPQQeKtVMiios1fWjMxeYO/BUZyWtoDBYyMvFqa+iqBMZBeWgXuthHY01K0gOuN0Ygg5oPgj0Ah0zuLpK84baRSkvsMQIpZ3aCTNgbd3RsAI3B8BvBlEN1gLBA8QpIK3kR73T95oU5DSEzQX7xnmI3/canSJjmlMGm3iv5ewEHWpJ/U15VoXsE3+dG+vc+J1iLj6qA9GwAgYASNgBK6DgBQbwW9RbHAOX3Y/6DrY+i1GwAg0gwDyNvogPEC8DkgzxdZcQstA66InwLNirJOtoccgddER1flOelIGvTN7DnJCDhhvrQBsBGmtxBpIbzYGGvROU5ocpAwMr5CT0byhHBxlflA1ORgBI2AELkOgkwI/1gKREWTxgC+ZAkKCw2UIyBOve/oZU2QdXl80IW9dLP2Eh1z20vE/TU0J7lNZkGaLDaGzk/SZ9/CJWWrtlNBNldvjz5hTaASMgBEwAuNEAH6D9wfGj9jgNgo2gBQcPtvHIpI8ADMWkJV3f/YT3zMCRmCcCNB82VD4btSmf2mrw7HctMdZZM2nChXBblvWWdbSmIvVWv1fVcJ7qg6CjSkRHDF0YPDYpteH4sIoUsWEeIjz+FFbxWEjSFvlNfrUpgEkEkrD0RRZ0TZoTFWgbqGt0JYbbM+jrx9OoBGYJAKM4IDGyRMEI0j39FQkGKSYe0oyrYEdWAkzeAWLpUvZz4jUgwTExZ7lCacd3uM5zLkaTDSzroc6KVuACF7qYASMgBEwAkbgSwgk04HPMC/jtnKVjP/SSyf+ox7jpV8bdhAYsoMRMALNI4ABBM1VMYLEUCTrg5ov1XFnAKPCDt6rBdKXuP7T94Wl9HjNkDmIzypN0f2U18dW/fBiBOHOW9pI4vE6ztva2QjSVnm1lVqEw2hExYqYjSqUhbq30qjeNIyQsfF5htC870iF2iptp9YIzBcB6FzmXrStdIxFOzCOIEU4fA0BPD8eZFAi4A2yrR4hM1Q4ZC2iOuGKvN8V8RNo8AzBQ+Q05G9O431tBIyAETACRqAgIF7CFJRvUoyBOQcBZL2lcNPglwPumhiRHIyAEWgOgZSmMYBg/MD7Iz1AmsuME9wcAvTrqIMsKaAJdBZLuYQUj/+smbfPUnxfPG0vjw88P95UF5oKq3qBvMWV9N4+Vbf9go0gt8V39m8PZaBaDQ2K6bEwdBAX02MhQGojjM8AMvuiMwBGwAiciwB0LDfRuCM960sM577LzxUExC8IHR4hEggPUvQf/pV0uGXeDiTG4YTDSMidd5lbzG1Uq6xjGD/ESWPayXzmzkn1542AETACRqAFBNDb9xkH58Q5nIeA5JLwWNWghMNBsgmGkD6e573FTxkBI3BHBJLs4QHyqsmwMIQQ3JTvWCgz+nR2Z/fyuNjvd4sVutK11hhdDVwDw5avaeA0iw9dcBxSaAopEqTOdipFYyPIVEpy7PlQgw6VVlUKYhDhGkUOjYt2RuPKLbJT78X5QLtIh75FqrZKoUhQDJCaWsMfCE5/xgjMAwGt/7FiQW8WREeaqXRuHpm/cS7BUyMtF2uts/IkJcNyI0WDjCFIaCk53jgJY3o9/LJfvfCclvolRhB1WkslQ+GrZdBBxqYgm8/4aASMgBEwAjNEgM4OAaaQ64Akg8h78YB3nyIQMgh9Vw3yS9wK8/30Z75pBIzA/RHIJos+CsNHeoFwzb28f/+UOgVzQKD07RjoJiaiypdd3H6f75o49N+/Y+ppFjyXPIAxhjTooEBC4v+anx7Fu2wEGUUxzCcRyVDC5YtWLUUWDQ3F4VqKLjxE7h1o8ywEFAu7K12P2jRxVyQr6MG9E+jvGwEjcH8EoF9sLIauNUCWP38uliyGzhROxDtcB4GKJYvOd93PxWGtpQr/+1dEWgYR7k18sfT3QDzyUW4KAnxjiOskwGagBmL8iOooHpa/yfs+GgEjYASMwMwRwHNhI74R2g64hsPFCISMYuwuxs0/MAJ3RgC5OA0gLxKmcwqskKfvnDZ/fp4I9PtqcBV6b52mq7y2WqF8p34N44f0sZswgOxLfxL41XcsaZhmWdgIMs1yHWWuoqmpQRFoVLHgK6N5FTCC7LUtq0IrrKA1Pu5rN6SIGamKkcaahkVTsTgYASNgBD5CoJPxY/n8LPfV9eKQyvmPHnb8ZQik5AfveMDTRj/XlFgHlDYo/fP+ZW+dxNOFmyorQBF/JVvJKzW8oOAj0Mqz5U5eTQIEZ8IIGAEjYAQuQwBWQEeHfg6GkDCgi0scmcplr/PTRsAIGIHWEIAEYvgoXiBlhhI0PiaDrZXkNNIb/duofdKJqnJi/LhmZaRel15gGexd+s/6lvrRW31wh/5CIWa0KIm55ufj3WPa2QgyptKYWVr6jZGsx0I8rAikwD0aYa4dguYrmVIaSOLBG+5QIFUaUL9ymuIbftyvNgJGoB0EUMTPWBk/XEEJ56UmKXx6DheHw6+XsmA62M/QI6SPewq2/TjEXQTp4m2JmUQwsYmxBVyKeP93v7/FV0bACBgBIzABBOjGoPnD8ME0WOkBQmfHzGACBewsGAEj8BkCkMAkg/IrP06B9dlvfM8IDIkAM9HIOqexCdKDrpfShRbT3Hf0n7B4NKm8A31rTHsVegtag/qKsZ4V5/MJNoLMp6xHmdOwNtaURcOsVkhkcbxCuN8xRdbACsYgA9qRjjLC9s0IM0ognSgjYATuh4DoUwgnCC4Ot0EAHpB8AI+QEAqFOwulB9+AWs9LgOsD/VHOg4eFx0x5mnnLYw2R4wTm/bf43AgYASNgBCaNAEwhlCzIKz2++RETmTQYV8ocMDoYASPQBAI0VxZBxwOEhdCTCnrejyaKbxaJxEhxUD8NPSiD1jBifCdEF1ovKEYQeX6o38zU/2g3i4Yz5g74ziea+62NIM0V2fQTHMpEsomlUq0e5kRcGER0varGkZA5Uyl2A1igN3x3y0ip5T5Gz0IoYJLx7Rt80680AkagHQSCVtnwMXyBQZzlEbJYPy0WP0SNf+Vi6TKIfFdSHD43g3wRVgk0iLm4PsfsJ/XLIWTrHrASzN8KDt4bASNgBKaFAIReFD6JPMck/NPK6PC5CUwN6PDA+4tG4O8IJJnD9JsLoHPkOu/9/S1+wggMhwA6hv1+t9huDmVgeOg///790g1Wrdbvc43j0FeopsOh9qz9wYm2GOitR+fYBmwE+Xtd8hMDI4BChkD7ZH66cAuLmMVxeqwwiNRn6q2bHEjDVtqivVzSHrrl4mE5RzJxE2j9UiPQPAJBDVLpjpbZYRgEquGpe9RC9HgKLrWkIYulS1hE6LMh5M9iyGoaQrFuF2+QIviuxNcO4m/mbn/i5hgjYASMwOQQOBL748nksugMGQEjYAQSAShd6JW0f5Hpg7VACMSbCgYU3o0Igeyz7TRNFYYQurpr9dXQf56rbohBb+ovs+A5niXlncUQUrLK+0aU6YGTYiPIwID7c5cjEAuo1xZP42fZHiyazGtO6y0E4XYKSKykYTE9+klCMW73vcsR8i+MgBEYFAHoESMytCD6ccNf9VzJZNDETvhj0H8Wo99KOgyyrHKBLzj8FYHgaXoKTtZRbyUo/2YIgb1yr76J5xyMgBEwAkagQQQg5BBx5v1mEAHDnwlJ4MuV95cikIxRODJFZ1wmc730XX7eCBiBqyOQJA6Sh+GDdUCYCis9QPL+1T/sFxqBKyCAvhO+Qj+tsJtiuCieHW8foOtbunJMo0U8NZv1PzCiEKffR7x29J15YuaV30YQ6olDEwhg7MiGvKIlyywahhCl/taGEAAKgtEEUk6kETACN0MA2pP05+fPxfJZi3RLER/SRJEwbvZpv/gdBGK9i1om4B9C3cwlu3dgOo0CIaEVcKGzCeg6Cco1bqkRR6sqIRPnYASMgBEwAg0ikOwwtIAaRrZNC0iDeRlrkvGkXItTimceWKMMY5ODETACo0CA1sjUV/IZD0MI15DFJI2jSKQTYQQ+QIB6ykQ0n9dXPETk4SSDB94joY6oU1+ytgg/DkOKeNTn7/kgEROMthFkgoU6tSxFY63KGPJ2nB6LhozAqTgsnDzHNYH99UTQQjDwSNmJoBwdQuJL3hkBIzArBEQHoGC1ZnIAABioSURBVDcYYLvHx2IEgQ4xulLxDgMiAN5s0P2VxJk1ZWAFz7klULhleZoxRlRhAnAiO++p4yWqty91/L07vYd8agSMgBEwAmNAAJLNhrU7PEG4gMiPIXETSQNYJr/c4xHC1JwF5onk0NkwAk0iQDPEAwQjyEb+H4i56HFM/posztklOvta0d2li0vnrIb+APC9+r47NvF5Fj1P9tPXix55VL5g5kcbQWZeAVrOPsaQrahCkoOlpqNZ9b1DlLlTd7Gv5BdGGUxUhAUHSmZOXyPsoilyMAJGYF4IIIkQQiIp9MeUoEByrz1TYi2efy4OHF9fNORLC6VDn02jzy6SqNW1InO+h9+pjnc9gTtfttSoV2Z/I2RzKFfeGwEjYASMwCgQgJ5DzJlDGAs3BhCuM16nDldC4ChriG++wzOv9BW/xggYgTMQgMSxYfBg+qucAgvy52AEmkKAiqywEw8/bLeL9aHoOrtVmke0TICMHtyPqa9i7Q/9KDpn9cflFd6fIGAjyAkgvhw/Amn5REEDQzsytVDYdFLO1HlZr5wVJgpBMcQC6QcJvOkRcvz+lb/n1xkBIzBCBKr2N42g4QFCnLXBwxdWYi78uydNSyYjeJQH01HkveFT1eQXT0Xl4GsaVSSWdwycxnNLDQaQIH76m+ODPjECRsAIGIFxIIB35IYhpKLgQcRFuU28r1w2fUbZO7/yV/w6I2AEzkOAVsh4+GIEeZvq1aTvPPz81MgQUIXeMZUlFVs6yJV0kRzRhTJTTSx+LkNIqd8eqH1O6dkIcg5Kfma0CEAL0tsDItCJAKR3CIQARSVGkVRYkpF8nvNLQtAdUR+ODkbACMwUAXkbLDUNFlNh4YEQAgfKBYf7IVCFwU5GkMXjU6HRm1/ygd+WNIkPOFyOQL9W/3au+s6ooxDA9VoGBIRJRDAn0v3nL/+yf2EEjIARMALfQwBqLEoMMY6NXVLo773Zv/4MgYr7Z4/4nhEwAldHIKmbpNPjFFhMhcV13rv6R/1CI3BjBJKjcGQWnF8b8fJ9MYTgD5Ke+xqhHazeXd7zCsRGkPNw8lMjRyC9Q8IlrJfWNdNj1ZHbvehvnJqNfgM8/9QItIsAhg6Mqg8Pi+U//yyWT0/S/FYPEBtB7lyuCIQoeFRElAvrg6isYoHSqqy/cwKb/3yf8wF18cQsmOMZ2WnVPhbuQwIvsc1n2RkwAkbACLSPwJF4H0/az5NzYASMgBE4QaCKoOEB8p9MHxhACMSb+gUU3jWKQNRf7fBu2uy2mgJLXV0NAFwvV1G3qek2flxWuDaCXIaXnx4hAqdeHunpQXwsZi5K0X+G89zy2cuzlSzV6p7LsfMvjECDCEiZjrIXw0d4gMgY4sXQR1KOfSNUJ4FwLQOIPHUWe0mJG3mDcKxGrJGkuPlkMLIuA3yWRfkOGpnE3zHQXOqFOeURFZ8YASNgBG6PANbq2PSpHlm+/Yf9BSNgBIzAcAgkeUsPkFwDJD1A8v5wKfKXjMDXEcj6Sr+JDcMHcXEuXcRWGxO8MQlC3LH140tg2wjyJdj8o1YQwG0sFJWVQGD8wDskjSIcv2IISQLVCg5OpxEwAt9DAOEjAsp0bUE3OHcYFwLMf65y6R5kBJFBZLF6WRxe/iuLpeO5Y2HxKuWVAjkv45wF+Qq0pU3gFRLjk+CxV/miX2IEjIARMAJ/RQBCjPFDC6RqfuBybir8V9j8gBEwAm0igAyKwQPjx6s2PECQO4lnczAC7SFAzdXUw4ed2DgmjxI4aryZ6nUd0K3r8mR9wIezEbAR5Gyo/GArCKSBg/SiqIyRABhDdN0xilsdhHwmDSB5fW4escoSzFzPRczPGYG2EWC9iaAfrDsRSgYoi8PoEEjDFC7Cj1ooHVq9rZ4geW90iW4zQcn/4IbBESu+GU+uwhOE9nIS/ow5ecCXRsAIGAEjcDkC0GG2NIJAnd+hwZe/2L84G4FgiGc/7QeNgBH4BgL0xjB8sG2k9eEa2dNy5jdA9U/vggB9VtgHdRfN5U68fFONIMSlt33UbT2oZUAcvoiAjSBfBM4/awuBozwqYoJ3CIunZ6cA+rFmgePaSUjDyGkOk85gAMG7ZK/n1zKqhJLn9GFfGwEjMA0EKq1YPj+XdUD6a4FYsTDeMg6iL+8E1gd5/rE4rGW8en0pHiGUm8vuqmWX/BHYY9MOAb4WQ40tnwyeyRoitYsaz1w1NX6ZETACRmCGCKD9w/ihPoq0JzMEYARZfmN6SkxyxhGky0kwAhNCgJbFBsnDAySnwDLVm1AhzyQr1GPqbTF6SL+I3kG1O+OK4eMtDli42jHzgbw+Wft4qbmxzG1A5vxgI8j5WPnJRhEIotBTeGEEgWlmCOKhOI5pCMl77x0hTuFfclhqug8FfqcDBMnBCBiBCSGAIMJGG9caEyyIznogx6mwQlCZUH6nlBWEQwgzZff0rLmZ5BXC2iCsJudyu1lJpxAOPwyYy05Xb1ySkUsr7TyC6WbF4BcbASMwNwSCxIryHj1ABEAQ5NjNDY375Zf+JvNB9jua90uNv2wEJosAciYDU5kCCw8QrqF2pniTLfJJZiz6S8pZen1wPK3D6QHSBwBtJFNlrcRrlvAc8R7+6vCz/qM+fwcBG0HeAcVR00cAgpOKMBSaOynGOKYhpG8Mec8zJAkWCyUXQsU+3jp98JxDIzAXBEQTaP9HYUQK9fAgUJxDAwhQTBSeNqYzWzw+qzx1sf2lTQumE3oG8hLh/W0QeBPLaT57jV7qG0EoBvhuela6hd2mFPxWI2AEJogAfC6YnbQhIZ8k85tgXseYpR7DYiky9SZVHDC63o0xpttpMgKNIRCkTmnGxlimv5IORy2O67zXWJac3BkiUOpqMVikBwiz1BQvkFK/eeazOp3c5SBDyDYMIfYIuaQq2QhyCVp+djIIQFQwYNBZQMm5lRFkqeNacSvizwzFWe385898rR8zAkZgDAhUGnFMClNMYAhxaAsByk2he3xS+UnseRXlxiOkxtsQMkxxJqdEcA9BXzw3AwMQ1vWBt9i866MRMAJGwAich4AIKbTUhPQ8uK75lGTGbiUZETFRWqnwPr3m+/0uIzBzBJK0Yfh4kenDi6DPvEI0mP3a1YmUMzyMaa1Y94MZLLmX9/P4URbL/S4MgPSp1urTalYsdWmZocYeIR/hlvE2giQSPs4OgSAe1eCBIQQCwlRZhCPh0f0lQq22GBHO83oux4YzmnW31JWij7+ZHZLOsBGYIAJq5zTs5cNDTIXFNFhcQwegAQ6NINAvKxa3jzJ8lBZeRpDNphhCalk3kqNJJJMWlK0I3hk8WOy374VJRuGtDkbACBgBI/AJAnRd6L+ULswnD/rWTRGAX6GAkkwRA+24pkzMx24Ku18+DwSyOWH4YA0QjpLko3m5ic2jDrSYS+pm9ndIPwY8AtpE+j5Mf4UOMp/h+UvrM7/mPcFvwhCCGeTSt0SyZrOzEWQ2Re2M/g2BIERMi5Wjg/UDFDIoP+PY08YUgqY5KCFeMoSsJfSumHv+bx/xfSNgBMaPAIIEQW1/+ePHgkXRFzKGhEY275UnvG8JAWi7yq97kBGEOStWL4vDy3/FGJJTnbWUn8bTWvho6RyUDoDKps6RxT3muO2L8dlBaDzbTr4RMAJG4LoIMISUtUD6i6G7Q3JdjM95WzKpPJ7zGz9jBIzAXxHAuQp7IsYP1gBBkUwzg8yZ1AkEh1EjQF+mGCqK1wfn1Fv29H8I363LvAVDCB6I6CTLYuluHQHuOzsbQd4BxVHzQyBHn4YhRIqylF8hIkfvkBhBXAkV54IJhsxvWI+IxlQI2vzwc46NwKQQSIEEI+jTUxhCMICEgbTem1R+55KZLLulPEIetVA6VJxpsYjPe3PBYiT57IvnFEF2BuCpFI+anULht6dJ7v/29J6vjYARMAKTR6DSSQknMf1S4WOKNHG8T9EH7kWeCPniPqnwV43A5BBA35IeIF4EfXLFO7kMHVmzcpa8gCPGu520h9nXwTiS4e0sY84/5m9Dg0nfSQ2mP7ZPUQ4nCNgIcgKIL41An1Ckd0gSK9BhzRAW2cVwkoTNqBkBIzAhBKSNhQ6kUNE/n1Au55uVWqDdSiLQ04/FQUaRxa+X4hGC1r1o3ueLzx1zDvQUT2xqhwxu/j2U0VNMU5nlRDvleQcjYASMwCwRgAgSKm8rF94bASNgBNpFALLGxpRXGxE3vEDSA8Skrt1ynXrKCzsuOsKtBlZjmCAOR3f0iYfq8Q7Dvn49rm/Ut8oA75Ia95L+rHU2gvyJiWNmjkB6hQADpGTHFCpsGTCAYF7th6Qx/TifGwEj0CYCVQkezZrh6dUoYm+BNovzj1RTpgTR8e5JU52Jph8O6maFVwi03gQ98LnTLtHXTJPR9n5PhjoT8YDW69GN2lR/f8RXRsAIGIFZIAAxhFBy1Ba0cRYZdyaNgBGYAQJQNwwfTIGVHiBk+0QLMwMknMWWEMC8sZeH5pYFz2PemJr6MIAUo8gtGHbfsyRFg2JqaQm9YdJqI8gwOPsrjSOAR0gGrLhbKcsYiRo6Gt1gTRC0MWFAQWHaez5/56MRMAKNIKD1P1YsiK6psGJBdLfnRgru3GSKckO80aDzLyPI4vFZdFsX21/atrqpB6DrDiNAgMIqIZvi26SViqeoKEd4sC7ZCG+/KtfeGwEjYAQmhQBrgDBIa9ujdkkAJ5XRxjJDGVAkWSwcXS6NFaKTey8EsqkwJIkpsPACwRCSw1Etmd+rZPzdjxAoJL/sqaf4f6QBpLAB7X8zgHz0pu/H870DBhgd0VVqdZDvv3SCb7ARZIKF6ixdHwGUK2nYYF0AFh7aEafzpUYTPzCdikIhf/2TiPbOCBiBFhBAw4rAIAPI8n//WywftYB2en2l9rWFfDiN5yNQvfy6x6fwCFm8LBeH3f/hs6x3lPpw/sv85K0RUPOMEC7lOjtEOanotIgIYn5Mk1Ue8d4IGAEjME0EIITQPrwXN5VXkdNKH6eZ6QZzFZ1CyxENlpyTfEcEotno+xhAXlAm6wiVI94k7o4F40+/i0Cpk9IJ6gQDCDPIbLU4eQ7W4v7tfD/eTVLoKfFBWe2Zvh/VRhkkZq+QN7xsBHnDwmdG4FMEwstDT8CIZREJA0gwZZ0z599Go4f3KEyRd/VIFyu78rCDETACo0cAI4fa8YE2rK2TAYTtkAtnjz4DTuDFCPQNWyyWLiHx8CgRdq/xM5tN1AdofUiQF7/cP7g1AgxMgAcTdlII4rjD3NF9d3CEfwcjYASMwKQQCAOIqF94glQqaFp3/yJOhqQj/OiQ/cCMv38KnQIjMGoEIGMoktMDhGOR65DtHIzA+BAo69SoPyI6j+EjFj7vuC6Enz7J0HWXL/P9jum4NE4bbxBpNsYH3h1TZCPIHcH3p9tHAHICkdnsZADRnPIrkZi1ttVKR0nAeInAtpMQtp9j58AITBQBFOBkDaGFDYMIR7SoHB2mjYAERUInL6BF91OuBVqC8eW/YgyBjlubPsryDx5cUxaGkJDxS3tF/yTTVhi3eMSteJRF6EQZASNwCQKhIWQNK1G0wrYu+bWfHQIByQuxduSDmNBOsiTTlVmOHAJ5f6NRBBDd2CBpLIDOGiC5CHreazRrTvbEEKA+ltpaDB4MhMZQl30MhmcVcj+88SOSVlNHGjHKMGvNSkYZzf1sb/kESEcbQXpg+NQIXIJAeobwG9zetuLcGEA69vKJ2wfBSQe4S97sZ42AEbgHAqwNQcc11oggAUgx7rjeoyiG/2aWMx4hj1ooXbR8IeO268DwRXHpF0uHpHRAmCbrGKSIYhhCht6d6GxnvI9GwAgYgSYQgNhhsJdiPYwgJNoG+nEWnazwXcwBr+Spj3hggnZCMqxy5b0RMAJCAPmMDc8PjCC5CDrNxU1GIDiMBIG3tWlIEE6Z4a1UB9JRW8dWZ1mgXW6JGpiNTlKp03+/PzQSYAdPho0gg0PuD04RAYgJNo8jqxZV3G/KSPKlvELwCCn9FEab60FTnylWA+epVQRQnKqNsgZI9/wc02BxHQuOWsHQaql+Ld3UBZV5GMKefkhulJj066V4hFAXXB++hutAv6LzkeyV9UK2UWTEcIdQ7jJcIebI5f4xNh7wzggYASMwPgSChFWCNb7UOUV/IBAFptg8/vGAI4yAEagISE17NICkB0hfcjNQRuBeCJTBVMWrYot+79jLwHMJr4/sddwrhWd+V6wIu3wx0zSS5jOz9pXHbAT5Cmr+jRE4QQCC0skKEkfdw9CxF6HsNK08cTLARghDieXhE/R8aQTuiADCSyq+n54Wq5+aCmldWWPeu2Py/OmBEUhhFsO1jCCL1VrVg6lHtMml2EaQgcvjC59LFouIf+yccMGNY/kyVRYhn44L74yAETAC40UgiBo0i04FakOH8SJAYRHyWK68NwJG4A2BlMDQm7yKpm1Cg1LuV9XJ28M+MwJ3QABOSz3F4IGBbqs+4SlVR9c33nCSOiUVfeRpHsab/tukzEaQ2+Dqt84SAbw8doudiEuYQ0RdlrJ+7HBbV4hF8hQXo0+PniGzBMqZNgLjQUBKURSlS5SjeH/UKbGYQ9NhpghQF6rXR3iEPD6rjoiwb39pq3Na2COkncqh4gxxP44l2XiJ7NTcs9tCh6AUeeks9B5tJ59OqREwAtNFAJEkpsHSSfAoXZtQTbe8nTMjMBMEkMMgZWzZ80rZbCYQOJsjQiDrI0aP/hS7xQiyD2NIYb2lvzD2upr52UmvwaBspuxfqsOT8SOCftCk2AgyKNz+2FQRSALIwki5QPojI7V046BOCwu2okMLPetKq4Zo7d2l5p7PwAiI4P4Z4aMRMALDIIDmk4ZJ4JhbifF+zgjgAaLQPTyFcWzxshQ9/1dEvsTbK6TdykFHuxNfLkFHkQEtGajFA7kR/8GT84n6oA9GwAgYgWERgCZBiDCAaJrdIqPUJHDPwQgYASPQNAJJ5KrspbyYtDVdoI0nvtTHnfQBrPl77AcoGhVB36+ilXqKnpH8MAAsFkiPjg45CQ1k4+X1teTbCPI13PwrI/AuAhBKLMX0WPZSrmYDY2qsJDN4iey1YN7vZFRXEffuax1pBIzArRBQO10+yCrJeiDyAiHEFDpIOg7zRaBf/lrXqVs9SniUAmovT5CN5jnkPKThVkTg+RblRzkvLbxyZl0wpaXWDVSx1jLVdb+z89F7HG8EjIARuBkCEKqddigvqv0d/YWDETACRqBVBCBhkLYgb9onaWs1P073dBAoHiAawCyNHiaQotdTH0F9g2S9eWwp1/R2MISQi70ywPEtRy3l5DppTR3tdd7mtxgBIxAIQBzZYO6nhBK92U6juTCMRNBhqeGnq07jUJmORyHUMvV2RHhnBIzAdRFAiY0XiAwgyx8/yoLorAVCnIMR6CNQDSIdxrKF1oxZ/locXrVYOtNjhcef60wfrhbPKcHjQuqFAwcpwDMEt/EMZsuJhI9GwAjcHAEIDgaQLQZ4HT2R980h9weMgBG4PQJIVWxI0b+kZt6ioNX2Jm3dPg3+ghEAgVLnyh6Dx1b6gW2YQEp91DA4xbYfMHgUQ4hyKXlipXn62Zimf47BRpA5lrrzfDMEkpCWIySzEhYd+tZWiM/+wEjikpROBhDiDnRwCElt689LpPdGwAhcFQEptzE8diyILkMIIUb7V6X3Vb/ll7WLQNYHTWHYPYlWs8ATHiFBw5NYt5u9uac82SwliRdYliheIRQ1Ya6dhJJ7742AERgcAQiTugkxDRZGEAJxSbAiwjsjYASMQHsIIGdB1VgIXcOKwghi8tZeOU4hxcXTo3pIhEFORhD6dwqpu5sK2838FI8Q6UCUsdrNOfZ9plCm5+TBRpBzUPIzRuALCLwxc85SrdJ7US+qLJ4u97SYYkXPQJSknF1qGpbo8PSe7b3Bp0bACHwFAZTaVdkZU18xCiJHQnBMpfdX3u3fTBcB6oXqR0yb9vRDxhBNn7Z59WLp0y3xGHwN++3UIeLIiDAMIkkuJpx1Z80IGIG7IoBcgiIGykMISlROvW8DARVhFFsUYZYjkQ5GYH4IUPPZ0viB9wdGkCJdzQ8P5/g+CKTSn3rIMuexbi9JUeUsA6GKAeQ+qRvoq+hAqoqxtEq+mzxqoDTc+TM2gty5APz5aSIAGcntXXFXkWmNDQT08G6nGTGZFFPn8ZtHHWWiXWoo6tvY1Gni5VwZgUERQINZtZgxwhthIKfHsgFk0KJo6mNZN/AeenzWStrrQpuh3Vl/msqQE/seAsmzg4dHmeuMCwU6DUVwLoaQrBLlrvdGwAgYgWsiADVigwAlZbrm+/2umyJQi62yj6PcedNv+uVGYOQIoGLG+4NpsFB7QNlSMT3ypDt5E0CA+pdcdSshfnOoi5+LUCeX/U1HN4E8/5GFCgBLIKJjnHx+/wBgsfh/QYMveC7PQg0AAAAASUVORK5CYII=", 0);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray(decode, 0, decode.length));
        Shader.TileMode tileMode = Shader.TileMode.MIRROR;
        bitmapDrawable.setTileModeXY(tileMode, tileMode);
        return bitmapDrawable;
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT < 23 || NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043 A[Catch:{ all -> 0x005e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String e(android.content.Context r7) {
        /*
            java.lang.String r0 = "com.google.android.gms.common.GoogleApiAvailabilityLight"
            java.lang.String[] r1 = new java.lang.String[]{r0}     // Catch:{ all -> 0x005e }
            r2 = 0
            r3 = 0
        L_0x0008:
            r4 = 1
            if (r3 >= r4) goto L_0x001b
            r5 = r1[r3]     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x0019 }
            java.lang.Class<com.appodeal.ads.q4> r6 = com.appodeal.ads.q4.class
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x0019 }
            java.lang.Class.forName(r5, r2, r6)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x0019 }
            int r3 = r3 + 1
            goto L_0x0008
        L_0x0019:
            goto L_0x001c
        L_0x001b:
            r2 = 1
        L_0x001c:
            r1 = -1
            if (r2 == 0) goto L_0x0040
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x005e }
            java.lang.String r2 = "GOOGLE_PLAY_SERVICES_VERSION_CODE"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ all -> 0x005e }
            r0.setAccessible(r4)     // Catch:{ all -> 0x005e }
            boolean r2 = r0.isAccessible()     // Catch:{ all -> 0x005e }
            r3 = 0
            if (r2 == 0) goto L_0x0037
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x005e }
        L_0x0037:
            if (r3 == 0) goto L_0x0040
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x005e }
            int r0 = r3.intValue()     // Catch:{ all -> 0x005e }
            goto L_0x0041
        L_0x0040:
            r0 = -1
        L_0x0041:
            if (r0 != r1) goto L_0x0059
            android.content.pm.PackageManager r0 = r7.getPackageManager()     // Catch:{ all -> 0x005e }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ all -> 0x005e }
            r1 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r7 = r0.getApplicationInfo(r7, r1)     // Catch:{ all -> 0x005e }
            android.os.Bundle r7 = r7.metaData     // Catch:{ all -> 0x005e }
            java.lang.String r0 = "com.google.android.gms.version"
            int r0 = r7.getInt(r0)     // Catch:{ all -> 0x005e }
        L_0x0059:
            java.lang.String r7 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x005e }
            return r7
        L_0x005e:
            r7 = move-exception
            com.appodeal.ads.utils.Log.log(r7)
            java.lang.String r7 = "not-found"
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.n5.e(android.content.Context):java.lang.String");
    }

    public static String f(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.webview", 0);
            if (packageInfo != null) {
                return packageInfo.versionName;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            return instance.digest();
        } catch (NoSuchAlgorithmException e2) {
            Log.log(e2);
            return null;
        }
    }

    public static File c(Context context) {
        File externalFilesDir = context.getExternalFilesDir((String) null);
        if (externalFilesDir != null) {
            File file = new File(externalFilesDir.getPath() + "/" + "native_cache_image" + "/");
            if (file.exists() || file.mkdirs()) {
                return file;
            }
        }
        return null;
    }

    public static void a(String str, s sVar) {
        if (!TextUtils.isEmpty(str) && sVar != null) {
            sVar.f17569a.execute(new Runnable(str) {
                public final /* synthetic */ String f$0;

                {
                    this.f$0 = r1;
                }

                public final void run() {
                    n5.c(this.f$0);
                }
            });
        }
    }

    public static boolean b(Context context, String str, Runnable runnable) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            if (runnable != null) {
                h5.f16458a.post(runnable);
            }
            return false;
        } else if (f16839b || str != null) {
            try {
                new URL(str);
            } catch (MalformedURLException unused) {
                try {
                    str = URLDecoder.decode(str, "UTF-8");
                } catch (UnsupportedEncodingException | IllegalArgumentException unused2) {
                }
            }
            if (i0.f16477f) {
                if (str.startsWith("http://") || str.startsWith("https://")) {
                    z = true;
                }
                if (z) {
                    s sVar = s.f17568e;
                    sVar.f17569a.execute(new Runnable(context, str, runnable) {
                        public final /* synthetic */ Context f$0;
                        public final /* synthetic */ String f$1;
                        public final /* synthetic */ Runnable f$2;

                        {
                            this.f$0 = r1;
                            this.f$1 = r2;
                            this.f$2 = r3;
                        }

                        public final void run() {
                            n5.a(this.f$0, this.f$1, this.f$2);
                        }
                    });
                    return true;
                }
            }
            if (runnable != null) {
                h5.f16458a.post(runnable);
            }
            return b(context, str);
        } else {
            throw new AssertionError();
        }
    }

    public static void a(String str, s sVar, Runnable runnable) {
        if (!TextUtils.isEmpty(str) && sVar != null) {
            sVar.f17569a.execute(new Runnable(str, runnable) {
                public final /* synthetic */ String f$0;
                public final /* synthetic */ Runnable f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void run() {
                    n5.a(this.f$0, this.f$1);
                }
            });
        }
    }

    public static boolean a(Context context, String str) {
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    public static void a(Context context, String str, Runnable runnable) {
        b(context, b(str));
        if (runnable != null) {
            h5.f16458a.post(runnable);
        }
    }

    public static void a(AdType adType, a aVar) {
        String str;
        String displayName = adType.getDisplayName();
        ArrayList b2 = aVar.b();
        ArrayList c2 = aVar.c();
        q4 q4Var = q4.f17047a;
        if (r0.f17088d != Log.LogLevel.none) {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("%s waterfall:", new Object[]{a(displayName)}));
            int i = 3;
            if (b2 != null && !b2.isEmpty()) {
                ArrayList arrayList = new ArrayList(b2);
                sb.append("\n  Precache:\n    ");
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject = (JSONObject) it.next();
                    if (jSONObject.has("name")) {
                        Locale locale = Locale.ENGLISH;
                        Object[] objArr = new Object[i];
                        objArr[0] = a(jSONObject.optString("name"));
                        objArr[1] = a(jSONObject.optString("status"));
                        objArr[2] = Double.valueOf(jSONObject.optDouble("ecpm", 0.0d));
                        sb.append(String.format(locale, "%s (%s), eCPM: %.2f; ", objArr));
                    } else {
                        sb.append(String.format(Locale.ENGLISH, "%s, eCPM: %.2f; ", new Object[]{a(jSONObject.optString("status")), Double.valueOf(jSONObject.optDouble("ecpm", 0.0d))}));
                    }
                    i = 3;
                }
            }
            if (c2 == null || c2.isEmpty()) {
                sb.append("\n  Ads: Empty");
            } else {
                ArrayList arrayList2 = new ArrayList(c2);
                sb.append("\n  Ads:");
                Iterator it2 = arrayList2.iterator();
                int i2 = 100;
                int i3 = 100;
                while (it2.hasNext()) {
                    JSONObject jSONObject2 = (JSONObject) it2.next();
                    if (i3 >= i2) {
                        sb.append("\n    ");
                        i3 = 0;
                    }
                    if (jSONObject2.has("name")) {
                        str = String.format(Locale.ENGLISH, "%s (%s), eCPM: %.2f; ", new Object[]{a(jSONObject2.optString("name")), a(jSONObject2.optString("status")), Double.valueOf(jSONObject2.optDouble("ecpm", 0.0d))});
                    } else {
                        str = String.format(Locale.ENGLISH, "%s, eCPM: %.2f; ", new Object[]{a(jSONObject2.optString("status")), Double.valueOf(jSONObject2.optDouble("ecpm", 0.0d))});
                    }
                    sb.append(str);
                    i3 += str.length();
                    i2 = 100;
                }
            }
            Log.log(LogConstants.KEY_SDK, LogConstants.EVENT_DUMP, sb.toString());
        }
    }

    public static String a(Uri uri) {
        FileOutputStream fileOutputStream;
        Exception e2;
        File file;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        b bVar = b.f16327b;
        mediaMetadataRetriever.setDataSource(bVar.f16328a.getApplicationContext(), uri);
        Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(Long.parseLong(mediaMetadataRetriever.extractMetadata(9)), 2);
        FileOutputStream fileOutputStream2 = null;
        if (frameAtTime != null) {
            try {
                file = new File(c(bVar.f16328a.getApplicationContext()), new BigInteger(a(uri.toString().getBytes())).abs().toString(36));
                fileOutputStream = new FileOutputStream(file);
            } catch (Exception e3) {
                e2 = e3;
                fileOutputStream = null;
                try {
                    Log.log(e2);
                    a((OutputStream) fileOutputStream);
                    a((Closeable) fileOutputStream);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream2 = fileOutputStream;
                    a((OutputStream) fileOutputStream2);
                    a((Closeable) fileOutputStream2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                a((OutputStream) fileOutputStream2);
                a((Closeable) fileOutputStream2);
                throw th;
            }
            try {
                frameAtTime.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                String absolutePath = file.getAbsolutePath();
                a((OutputStream) fileOutputStream);
                a((Closeable) fileOutputStream);
                return absolutePath;
            } catch (Exception e4) {
                e2 = e4;
                Log.log(e2);
                a((OutputStream) fileOutputStream);
                a((Closeable) fileOutputStream);
                return null;
            }
        }
        return null;
    }
}
