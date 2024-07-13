package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import android.util.Log;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.plugins.PluginErrorDetails;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.regex.Pattern;

/* renamed from: com.yandex.metrica.impl.ob.h2  reason: case insensitive filesystem */
public class C0420h2 {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f5892a = Pattern.compile(".*at com\\.yandex\\.metrica\\.push\\.*");

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f5893b = Pattern.compile(".*at com\\.yandex\\.metrica\\.(?!push)");

    /* renamed from: com.yandex.metrica.impl.ob.h2$a */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        static final String f5894a;

        static {
            String str;
            if (C0420h2.a(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME)) {
                str = "unity";
            } else if (C0420h2.a("mono.MonoPackageManager")) {
                str = PluginErrorDetails.Platform.XAMARIN;
            } else if (C0420h2.a("org.apache.cordova.CordovaPlugin")) {
                str = PluginErrorDetails.Platform.CORDOVA;
            } else if (C0420h2.a("com.facebook.react.ReactRootView")) {
                str = "react";
            } else {
                str = C0420h2.a("io.flutter.embedding.engine.FlutterEngine") ? PluginErrorDetails.Platform.FLUTTER : "native";
            }
            f5894a = str;
        }
    }

    public static void a(String str, Object... objArr) {
        Log.i("AppMetrica-Attribution", String.format(str, objArr));
    }

    static void b() {
        StringBuilder sb = new StringBuilder();
        sb.append("Initializing of Metrica, ");
        String str = "release";
        if (TextUtils.isEmpty(str)) {
            str = "";
        } else {
            char charAt = str.charAt(0);
            if (!Character.isUpperCase(charAt)) {
                str = Character.toUpperCase(charAt) + "elease";
            }
        }
        sb.append(str);
        sb.append(" type, Version ");
        sb.append("5.3.0");
        sb.append(", API Level ");
        sb.append(YandexMetrica.getLibraryApiLevel());
        sb.append(", Dated ");
        sb.append("03.03.2023");
        sb.append(".");
        Log.i("AppMetrica", sb.toString());
    }

    public static void a(Throwable th, String str, Object... objArr) {
        Log.e("AppMetrica-Attribution", String.format(str, objArr), th);
    }

    public static String a() {
        return a.f5894a;
    }

    static boolean a(Throwable th) {
        String str;
        if (th != null) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            str = stringWriter.toString();
            printWriter.close();
        } else {
            str = "";
        }
        return !TextUtils.isEmpty(str) && f5893b.matcher(str).find();
    }

    public static boolean a(String str) {
        return b(str) != null;
    }

    public static void b(String str, Object... objArr) {
        Log.w("AppMetrica-Attribution", String.format(str, objArr));
    }

    static boolean b(Throwable th) {
        String str;
        if (th != null) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            str = stringWriter.toString();
            printWriter.close();
        } else {
            str = "";
        }
        return !TextUtils.isEmpty(str) && f5892a.matcher(str).find();
    }

    public static Class b(String str) {
        try {
            return Class.forName(str, false, C0420h2.class.getClassLoader());
        } catch (Throwable unused) {
            return null;
        }
    }
}
