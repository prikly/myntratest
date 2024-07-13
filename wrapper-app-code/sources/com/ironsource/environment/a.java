package com.ironsource.environment;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.ironsource.mediationsdk.ag;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import org.json.JSONException;
import org.json.JSONObject;

public final class a extends Thread {

    /* renamed from: d  reason: collision with root package name */
    private static final b f8026d = new b() {
        public static String a(int i) {
            String str = "not defined message for " + i;
            if (i != 404) {
                switch (i) {
                    case 1004:
                        return "malformed url exception";
                    case 1005:
                        break;
                    case 1006:
                        return "http empty response";
                    default:
                        switch (i) {
                            case IronSourceError.AUCTION_ERROR_DECOMPRESSION /*1008*/:
                                return "socket timeout exception";
                            case 1009:
                                return "io exception";
                            case 1010:
                                return "uri syntax exception";
                            case IronSourceConstants.NOTIFICATIONS_ERROR_SHOWING_NOT_FOUND /*1011*/:
                                return "http error code";
                            default:
                                switch (i) {
                                    case 1018:
                                        return "file not found exception";
                                    case 1019:
                                        return "out of memory exception";
                                    case IronSourceError.ERROR_IS_EMPTY_DEFAULT_PLACEMENT /*1020*/:
                                        return "failed to create folder for file";
                                    default:
                                        return str;
                                }
                        }
                }
            }
            return "http not found";
        }

        public static String a(Context context) {
            ConnectivityManager connectivityManager;
            String str;
            StringBuilder sb = new StringBuilder();
            if (!(context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null)) {
                try {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                        String typeName = activeNetworkInfo.getTypeName();
                        int type = activeNetworkInfo.getType();
                        if (type == 0) {
                            str = "3g";
                        } else if (type == 1) {
                            str = "wifi";
                        } else {
                            sb.append(typeName);
                        }
                        sb.append(str);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            return sb.toString();
        }

        public static String a(String str) {
            try {
                return URLEncoder.encode(str, "UTF-8").replace("+", "%20");
            } catch (UnsupportedEncodingException unused) {
                return "";
            }
        }

        public static String a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            try {
                return Base64.encodeToString(a(str.getBytes("UTF-8"), (PublicKey) (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str2, 0)))), 0).replaceAll(System.getProperty("line.separator"), "");
            } catch (Exception e2) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception on string encryption error: " + e2.getMessage());
                e2.printStackTrace();
                return "";
            }
        }

        public static String a(byte[] bArr) {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream, "UTF-8"));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                    } else {
                        bufferedReader.close();
                        gZIPInputStream.close();
                        byteArrayInputStream.close();
                        return sb.toString();
                    }
                }
            } catch (Exception e2) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception while decompressing " + e2);
                return null;
            }
        }

        public static Map<String, Object> a(Object[][] objArr) {
            HashMap hashMap = new HashMap();
            try {
                for (Object[] objArr2 : objArr) {
                    hashMap.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception unused) {
            }
            return hashMap;
        }

        public static void a(Context context, String str, String str2) {
            if (!TextUtils.isEmpty(str)) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                if (!TextUtils.isEmpty(str2)) {
                    intent.setPackage(str2);
                }
                context.startActivity(intent);
                return;
            }
            throw new Exception("url is null");
        }

        public static byte[] a(InputStream inputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr, 0, 8192);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        }

        private static byte[] a(byte[] bArr, PublicKey publicKey) {
            try {
                Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                instance.init(1, publicKey);
                return instance.doFinal(bArr);
            } catch (Exception e2) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception on encryption error: " + e2.getMessage());
                throw new RuntimeException(e2);
            }
        }

        public static JSONObject b(String str, String str2) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errMsg", str);
                jSONObject.put("adViewId", str2);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            return jSONObject;
        }

        public static boolean b(Context context) {
            ConnectivityManager connectivityManager;
            if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
                return false;
            }
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            } catch (Exception e2) {
                e2.printStackTrace();
                return false;
            }
        }

        public static byte[] b(String str) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes());
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        }

        public static int c(Context context) {
            if (context == null) {
                return -1;
            }
            try {
                return context.getResources().getConfiguration().mcc;
            } catch (Exception e2) {
                e2.printStackTrace();
                return -1;
            }
        }

        public static String c() {
            try {
                new ag();
                return ",kiag";
            } catch (Throwable unused) {
                return ",kiang";
            }
        }

        public static String c(String str) {
            return Base64.encodeToString(str.getBytes(), 10);
        }

        public static int d(Context context) {
            if (context == null) {
                return -1;
            }
            try {
                return context.getResources().getConfiguration().mnc;
            } catch (Exception e2) {
                e2.printStackTrace();
                return -1;
            }
        }

        public static boolean d() {
            try {
                new ag();
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        public static String e(Context context) {
            if (context == null) {
                return "";
            }
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                return telephonyManager != null ? telephonyManager.getSimOperator() : "";
            } catch (Exception e2) {
                e2.printStackTrace();
                return "";
            }
        }

        public static int f(Context context) {
            if (context != null) {
                try {
                    return ((TelephonyManager) context.getSystemService("phone")).getPhoneType();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            return -1;
        }

        public final void a() {
        }

        public final void b() {
            throw new RuntimeException("ANRHandler has given up");
        }
    };

    /* renamed from: e  reason: collision with root package name */
    private static final i f8027e = new i() {
        public final void a(InterruptedException interruptedException) {
            Log.w("ANRHandler", "Interrupted: " + interruptedException.getMessage());
        }
    };

    /* renamed from: a  reason: collision with root package name */
    b f8028a = f8026d;

    /* renamed from: b  reason: collision with root package name */
    boolean f8029b = false;

    /* renamed from: c  reason: collision with root package name */
    boolean f8030c = false;

    /* renamed from: f  reason: collision with root package name */
    private i f8031f = f8027e;

    /* renamed from: g  reason: collision with root package name */
    private final Handler f8032g = new Handler(Looper.getMainLooper());

    /* renamed from: h  reason: collision with root package name */
    private final int f8033h;
    private String i = "";
    /* access modifiers changed from: private */
    public volatile int j = 0;
    private int k = 1;
    private int l = 0;
    private final Runnable m = new Runnable() {
        public final void run() {
            a aVar = a.this;
            int unused = aVar.j = (aVar.j + 1) % Integer.MAX_VALUE;
        }
    };

    public a(int i2) {
        this.f8033h = i2;
    }

    public final void run() {
        setName("|ANR-ANRHandler|");
        int i2 = -1;
        while (!isInterrupted() && this.l < this.k) {
            int i3 = this.j;
            this.f8032g.post(this.m);
            try {
                Thread.sleep((long) this.f8033h);
                if (this.j != i3) {
                    this.l = 0;
                } else if (this.f8030c || !Debug.isDebuggerConnected()) {
                    this.l++;
                    this.f8028a.a();
                    if (e.f8055c != null && !e.f8055c.trim().isEmpty()) {
                        new c(e.f8055c, String.valueOf(System.currentTimeMillis()), "ANR").d();
                    }
                } else {
                    if (this.j != i2) {
                        Log.w("ANRHandler", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
                    }
                    i2 = this.j;
                }
            } catch (InterruptedException e2) {
                this.f8031f.a(e2);
                return;
            }
        }
        if (this.l >= this.k) {
            this.f8028a.b();
        }
    }
}
