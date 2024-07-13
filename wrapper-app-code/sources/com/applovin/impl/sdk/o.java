package com.applovin.impl.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.LocaleList;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import com.applovin.impl.sdk.c.e;
import com.applovin.impl.sdk.d.f;
import com.applovin.impl.sdk.d.g;
import com.applovin.impl.sdk.e.f;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.utils.n;
import com.applovin.impl.sdk.utils.q;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.appodeal.ads.modules.common.internal.Constants;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.unity3d.services.core.device.MimeTypes;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

public class o {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicReference<a> f15736h = new AtomicReference<>();
    /* access modifiers changed from: private */
    public static final AtomicReference<b> j = new AtomicReference<>();

    /* renamed from: a  reason: collision with root package name */
    private final n f15737a;

    /* renamed from: b  reason: collision with root package name */
    private final v f15738b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f15739c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, Object> f15740d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f15741e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, Object> f15742f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f15743g;
    /* access modifiers changed from: private */
    public final AtomicReference<Integer> i = new AtomicReference<>();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f15749a;

        /* renamed from: b  reason: collision with root package name */
        public String f15750b = "";

        /* renamed from: c  reason: collision with root package name */
        public d f15751c = d.NOT_SET;
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f15752a;

        /* renamed from: b  reason: collision with root package name */
        public final int f15753b;

        public b(String str, int i) {
            this.f15752a = str;
            this.f15753b = i;
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f15754a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f15755b = -1;
    }

    public enum d {
        NOT_SET("dnt_not_set"),
        ON("dnt_on"),
        OFF("dnt_off");
        

        /* renamed from: d  reason: collision with root package name */
        private final String f15760d;

        private d(String str) {
            this.f15760d = str;
        }

        public String a() {
            return this.f15760d;
        }
    }

    protected o(n nVar) {
        if (nVar != null) {
            this.f15737a = nVar;
            this.f15738b = nVar.D();
            this.f15739c = nVar.P();
            this.f15740d = q();
            this.f15742f = s();
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    /* access modifiers changed from: private */
    public Integer A() {
        AudioManager audioManager = (AudioManager) this.f15739c.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return null;
        }
        return Integer.valueOf((int) (((float) audioManager.getStreamVolume(3)) * ((Float) this.f15737a.a(com.applovin.impl.sdk.c.b.dU)).floatValue()));
    }

    private double B() {
        return ((double) Math.round((((double) TimeZone.getDefault().getOffset(new Date().getTime())) * 10.0d) / 3600000.0d)) / 10.0d;
    }

    private boolean C() {
        SensorManager sensorManager = (SensorManager) this.f15739c.getSystemService("sensor");
        return (sensorManager == null || sensorManager.getDefaultSensor(4) == null) ? false : true;
    }

    private String D() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f15739c.getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getSimCountryIso().toUpperCase(Locale.ENGLISH) : "";
    }

    private String E() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f15739c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(0, Math.min(3, networkOperator.length()));
        } catch (Throwable th) {
            if (!v.a()) {
                return "";
            }
            this.f15738b.b("DataCollector", "Unable to collect mobile country code", th);
            return "";
        }
    }

    private String F() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f15739c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(Math.min(3, networkOperator.length()));
        } catch (Throwable th) {
            if (!v.a()) {
                return "";
            }
            this.f15738b.b("DataCollector", "Unable to collect mobile network code", th);
            return "";
        }
    }

    private String G() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f15739c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            return telephonyManager.getNetworkOperatorName();
        } catch (Throwable th) {
            if (!v.a()) {
                return "";
            }
            this.f15738b.b("DataCollector", "Unable to collect carrier", th);
            return "";
        }
    }

    private boolean H() {
        try {
            return I() || J();
        } catch (Throwable unused) {
            return false;
        }
    }

    private boolean I() {
        String str = Build.TAGS;
        return str != null && str.contains(b("lz}$blpz"));
    }

    private boolean J() {
        String[] strArr = {"&zpz}ld&hyy&Z|yl{|zl{'hyb", "&zk`g&z|", "&zpz}ld&k`g&z|", "&zpz}ld&qk`g&z|", "&mh}h&efjhe&qk`g&z|", "&mh}h&efjhe&k`g&z|", "&zpz}ld&zm&qk`g&z|", "&zpz}ld&k`g&oh`ezhol&z|", "&mh}h&efjhe&z|"};
        for (int i2 = 0; i2 < 9; i2++) {
            if (new File(b(strArr[i2])).exists()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x038a  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x039b  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01c8 A[SYNTHETIC, Splitter:B:54:0x01c8] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Map<java.lang.String, java.lang.Object> a(java.util.Map<java.lang.String, java.lang.Object> r10, boolean r11) {
        /*
            r9 = this;
            java.lang.String r0 = "lmt"
            java.lang.String r1 = "tm"
            java.lang.String r2 = "fm"
            java.lang.String r3 = "tds"
            java.lang.String r4 = "fs"
            java.lang.String r5 = "DataCollector"
            java.util.Map r10 = com.applovin.impl.sdk.utils.CollectionUtils.map(r10)
            android.content.Context r6 = r9.f15739c
            android.graphics.Point r6 = com.applovin.impl.sdk.utils.h.a(r6)
            int r7 = r6.x
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r8 = "dx"
            r10.put(r8, r7)
            int r6 = r6.y
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r7 = "dy"
            r10.put(r7, r6)
            if (r11 == 0) goto L_0x0052
            java.util.concurrent.atomic.AtomicReference<com.applovin.impl.sdk.o$a> r6 = f15736h
            java.lang.Object r6 = r6.get()
            com.applovin.impl.sdk.o$a r6 = (com.applovin.impl.sdk.o.a) r6
            if (r6 == 0) goto L_0x003c
            r9.m()
            goto L_0x005c
        L_0x003c:
            boolean r6 = com.applovin.impl.sdk.utils.Utils.isMainThread()
            if (r6 == 0) goto L_0x0052
            com.applovin.impl.sdk.o$a r6 = new com.applovin.impl.sdk.o$a
            r6.<init>()
            r7 = 1
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            java.lang.String r8 = "inc"
            r10.put(r8, r7)
            goto L_0x005c
        L_0x0052:
            com.applovin.impl.sdk.n r6 = r9.f15737a
            com.applovin.impl.sdk.o r6 = r6.Y()
            com.applovin.impl.sdk.o$a r6 = r6.k()
        L_0x005c:
            java.lang.String r7 = r6.f15750b
            boolean r8 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r7)
            if (r8 == 0) goto L_0x0069
            java.lang.String r8 = "idfa"
            r10.put(r8, r7)
        L_0x0069:
            boolean r7 = r6.f15749a
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            java.lang.String r8 = "dnt"
            r10.put(r8, r7)
            com.applovin.impl.sdk.o$d r6 = r6.f15751c
            java.lang.String r6 = r6.a()
            java.lang.String r7 = "dnt_code"
            r10.put(r7, r6)
            java.util.concurrent.atomic.AtomicReference<com.applovin.impl.sdk.o$b> r6 = j
            java.lang.Object r6 = r6.get()
            com.applovin.impl.sdk.o$b r6 = (com.applovin.impl.sdk.o.b) r6
            com.applovin.impl.sdk.n r7 = r9.f15737a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r8 = com.applovin.impl.sdk.c.b.dx
            java.lang.Object r7 = r7.a(r8)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x00ab
            if (r6 == 0) goto L_0x00ab
            java.lang.String r7 = r6.f15752a
            java.lang.String r8 = "idfv"
            r10.put(r8, r7)
            int r6 = r6.f15753b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r7 = "idfv_scope"
            r10.put(r7, r6)
        L_0x00ab:
            com.applovin.impl.sdk.k$a r6 = com.applovin.impl.sdk.k.b()
            android.content.Context r7 = r9.f15739c
            java.lang.Boolean r6 = r6.a((android.content.Context) r7)
            if (r6 == 0) goto L_0x00bc
            java.lang.String r7 = "huc"
            r10.put(r7, r6)
        L_0x00bc:
            com.applovin.impl.sdk.k$a r6 = com.applovin.impl.sdk.k.a()
            android.content.Context r7 = r9.f15739c
            java.lang.Boolean r6 = r6.a((android.content.Context) r7)
            if (r6 == 0) goto L_0x00cd
            java.lang.String r7 = "aru"
            r10.put(r7, r6)
        L_0x00cd:
            com.applovin.impl.sdk.k$a r6 = com.applovin.impl.sdk.k.c()
            android.content.Context r7 = r9.f15739c
            java.lang.Boolean r6 = r6.a((android.content.Context) r7)
            if (r6 == 0) goto L_0x00de
            java.lang.String r7 = "dns"
            r10.put(r7, r6)
        L_0x00de:
            com.applovin.impl.sdk.n r6 = r9.f15737a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r7 = com.applovin.impl.sdk.c.b.dJ
            java.lang.Object r6 = r6.a(r7)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0108
            com.applovin.impl.sdk.o$c r6 = r9.v()
            int r7 = r6.f15754a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r8 = "act"
            r10.put(r8, r7)
            int r6 = r6.f15755b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r7 = "acm"
            r10.put(r7, r6)
        L_0x0108:
            com.applovin.impl.sdk.n r6 = r9.f15737a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r7 = com.applovin.impl.sdk.c.b.dR
            java.lang.Object r6 = r6.a(r7)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x012b
            com.applovin.impl.sdk.n r6 = r9.f15737a
            com.applovin.impl.sdk.SessionTracker r6 = r6.ag()
            int r6 = r6.getLastTrimMemoryLevel()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r7 = "mtl"
            r10.put(r7, r6)
        L_0x012b:
            com.applovin.impl.sdk.n r6 = r9.f15737a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r7 = com.applovin.impl.sdk.c.b.dT
            java.lang.Object r6 = r6.a(r7)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0148
            boolean r6 = r9.H()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            java.lang.String r7 = "adr"
            r10.put(r7, r6)
        L_0x0148:
            if (r11 == 0) goto L_0x0153
            java.util.concurrent.atomic.AtomicReference<java.lang.Integer> r11 = r9.i
            java.lang.Object r11 = r11.get()
            java.lang.Integer r11 = (java.lang.Integer) r11
            goto L_0x0157
        L_0x0153:
            java.lang.Integer r11 = r9.A()
        L_0x0157:
            if (r11 == 0) goto L_0x015e
            java.lang.String r6 = "volume"
            r10.put(r6, r11)
        L_0x015e:
            android.content.Context r11 = r9.f15739c     // Catch:{ SettingNotFoundException -> 0x017d }
            android.content.ContentResolver r11 = r11.getContentResolver()     // Catch:{ SettingNotFoundException -> 0x017d }
            java.lang.String r6 = "screen_brightness"
            int r11 = android.provider.Settings.System.getInt(r11, r6)     // Catch:{ SettingNotFoundException -> 0x017d }
            float r11 = (float) r11     // Catch:{ SettingNotFoundException -> 0x017d }
            r6 = 1132396544(0x437f0000, float:255.0)
            float r11 = r11 / r6
            java.lang.String r6 = "sb"
            r7 = 1120403456(0x42c80000, float:100.0)
            float r11 = r11 * r7
            int r11 = (int) r11     // Catch:{ SettingNotFoundException -> 0x017d }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ SettingNotFoundException -> 0x017d }
            r10.put(r6, r11)     // Catch:{ SettingNotFoundException -> 0x017d }
            goto L_0x018b
        L_0x017d:
            r11 = move-exception
            boolean r6 = com.applovin.impl.sdk.v.a()
            if (r6 == 0) goto L_0x018b
            com.applovin.impl.sdk.v r6 = r9.f15738b
            java.lang.String r7 = "Unable to collect screen brightness"
            r6.b(r5, r7, r11)
        L_0x018b:
            com.applovin.impl.sdk.n r11 = r9.f15737a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r6 = com.applovin.impl.sdk.c.b.dW
            java.lang.Object r11 = r11.a(r6)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x01b7
            com.applovin.impl.sdk.n r11 = r9.f15737a
            boolean r11 = com.applovin.impl.sdk.utils.Utils.isUserAgentCollectionEnabled(r11)
            if (r11 == 0) goto L_0x01b7
            com.applovin.impl.sdk.n r11 = r9.f15737a
            com.applovin.impl.sdk.aa.b(r11)
            java.lang.String r11 = com.applovin.impl.sdk.aa.a()
            boolean r6 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r11)
            if (r6 == 0) goto L_0x01b7
            java.lang.String r6 = "ua"
            r10.put(r6, r11)
        L_0x01b7:
            com.applovin.impl.sdk.n r11 = r9.f15737a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r6 = com.applovin.impl.sdk.c.b.dL
            java.lang.Object r11 = r11.a(r6)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            r6 = -1
            if (r11 == 0) goto L_0x0203
            java.io.File r11 = android.os.Environment.getDataDirectory()     // Catch:{ all -> 0x01e7 }
            long r7 = r11.getFreeSpace()     // Catch:{ all -> 0x01e7 }
            java.lang.Long r11 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x01e7 }
            r10.put(r4, r11)     // Catch:{ all -> 0x01e7 }
            java.io.File r11 = android.os.Environment.getDataDirectory()     // Catch:{ all -> 0x01e7 }
            long r7 = r11.getTotalSpace()     // Catch:{ all -> 0x01e7 }
            java.lang.Long r11 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x01e7 }
            r10.put(r3, r11)     // Catch:{ all -> 0x01e7 }
            goto L_0x0203
        L_0x01e7:
            r11 = move-exception
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r10.put(r4, r7)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r10.put(r3, r4)
            boolean r3 = com.applovin.impl.sdk.v.a()
            if (r3 == 0) goto L_0x0203
            com.applovin.impl.sdk.v r3 = r9.f15738b
            java.lang.String r4 = "Unable to collect total & free space."
            r3.b(r5, r4, r11)
        L_0x0203:
            com.applovin.impl.sdk.n r11 = r9.f15737a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r3 = com.applovin.impl.sdk.c.b.dM
            java.lang.Object r11 = r11.a(r3)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x0271
            android.content.Context r11 = r9.f15739c
            java.lang.String r3 = "activity"
            java.lang.Object r11 = r11.getSystemService(r3)
            android.app.ActivityManager r11 = (android.app.ActivityManager) r11
            android.app.ActivityManager$MemoryInfo r3 = new android.app.ActivityManager$MemoryInfo
            r3.<init>()
            if (r11 == 0) goto L_0x0271
            r11.getMemoryInfo(r3)     // Catch:{ all -> 0x024e }
            long r7 = r3.availMem     // Catch:{ all -> 0x024e }
            java.lang.Long r11 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x024e }
            r10.put(r2, r11)     // Catch:{ all -> 0x024e }
            long r7 = r3.totalMem     // Catch:{ all -> 0x024e }
            java.lang.Long r11 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x024e }
            r10.put(r1, r11)     // Catch:{ all -> 0x024e }
            long r7 = r3.threshold     // Catch:{ all -> 0x024e }
            java.lang.Long r11 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x024e }
            r10.put(r0, r11)     // Catch:{ all -> 0x024e }
            java.lang.String r11 = "lm"
            boolean r3 = r3.lowMemory     // Catch:{ all -> 0x024e }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x024e }
            r10.put(r11, r3)     // Catch:{ all -> 0x024e }
            goto L_0x0271
        L_0x024e:
            r11 = move-exception
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r10.put(r2, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r10.put(r1, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r10.put(r0, r1)
            boolean r0 = com.applovin.impl.sdk.v.a()
            if (r0 == 0) goto L_0x0271
            com.applovin.impl.sdk.v r0 = r9.f15738b
            java.lang.String r1 = "Unable to collect memory info."
            r0.b(r5, r1, r11)
        L_0x0271:
            com.applovin.impl.sdk.n r11 = r9.f15737a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r0 = com.applovin.impl.sdk.c.b.dN
            java.lang.Object r11 = r11.a(r0)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x02a8
            android.content.Context r11 = r9.f15739c
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            boolean r11 = com.applovin.impl.sdk.utils.h.a(r0, r11)
            if (r11 == 0) goto L_0x02a8
            boolean r11 = com.applovin.impl.sdk.utils.h.f()
            if (r11 == 0) goto L_0x02a8
            android.content.Context r11 = r9.f15739c
            java.lang.String r0 = "phone"
            java.lang.Object r11 = r11.getSystemService(r0)
            android.telephony.TelephonyManager r11 = (android.telephony.TelephonyManager) r11
            int r11 = r11.getDataNetworkType()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r0 = "rat"
            r10.put(r0, r11)
        L_0x02a8:
            com.applovin.impl.sdk.n r11 = r9.f15737a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r0 = com.applovin.impl.sdk.c.b.dK
            java.lang.Object r11 = r11.a(r0)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x02c7
            java.lang.String r11 = r9.y()
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L_0x02c7
            java.lang.String r0 = "so"
            r10.put(r0, r11)
        L_0x02c7:
            java.lang.String r11 = r9.r()
            java.lang.String r0 = "orientation_lock"
            r10.put(r0, r11)
            com.applovin.impl.sdk.n r11 = r9.f15737a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r0 = com.applovin.impl.sdk.c.b.dO
            java.lang.Object r11 = r11.a(r0)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x02ed
            boolean r11 = com.applovin.impl.sdk.utils.Utils.isVPNConnected()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            java.lang.String r0 = "vs"
            r10.put(r0, r11)
        L_0x02ed:
            boolean r11 = com.applovin.impl.sdk.utils.h.d()
            if (r11 == 0) goto L_0x030c
            android.content.Context r11 = r9.f15739c
            java.lang.String r0 = "power"
            java.lang.Object r11 = r11.getSystemService(r0)
            android.os.PowerManager r11 = (android.os.PowerManager) r11
            if (r11 == 0) goto L_0x030c
            boolean r11 = r11.isPowerSaveMode()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r0 = "lpm"
            r10.put(r0, r11)
        L_0x030c:
            com.applovin.impl.sdk.n r11 = r9.f15737a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r0 = com.applovin.impl.sdk.c.b.dX
            java.lang.Object r11 = r11.a(r0)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x0337
            com.applovin.impl.sdk.n r11 = r9.f15737a
            com.applovin.impl.sdk.utils.o r11 = r11.ak()
            if (r11 == 0) goto L_0x0337
            com.applovin.impl.sdk.n r11 = r9.f15737a
            com.applovin.impl.sdk.utils.o r11 = r11.ak()
            float r11 = r11.c()
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            java.lang.String r0 = "da"
            r10.put(r0, r11)
        L_0x0337:
            com.applovin.impl.sdk.n r11 = r9.f15737a
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r0 = com.applovin.impl.sdk.c.b.dY
            java.lang.Object r11 = r11.a(r0)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x0362
            com.applovin.impl.sdk.n r11 = r9.f15737a
            com.applovin.impl.sdk.utils.o r11 = r11.ak()
            if (r11 == 0) goto L_0x0362
            com.applovin.impl.sdk.n r11 = r9.f15737a
            com.applovin.impl.sdk.utils.o r11 = r11.ak()
            float r11 = r11.b()
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            java.lang.String r0 = "dm"
            r10.put(r0, r11)
        L_0x0362:
            com.applovin.impl.sdk.n r11 = r9.f15737a
            com.applovin.impl.sdk.h r11 = r11.al()
            int r11 = r11.a()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r0 = "mute_switch"
            r10.put(r0, r11)
            com.applovin.impl.sdk.n r11 = r9.f15737a
            java.lang.String r11 = com.applovin.impl.sdk.utils.i.f(r11)
            java.lang.String r0 = "network"
            r10.put(r0, r11)
            java.lang.String r11 = r9.z()
            boolean r0 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r11)
            if (r0 == 0) goto L_0x038f
            java.lang.String r0 = "kb"
            r10.put(r0, r11)
        L_0x038f:
            com.applovin.impl.sdk.n r11 = r9.f15737a
            com.applovin.impl.sdk.array.ArrayService r11 = r11.aq()
            boolean r0 = r11.isAppHubInstalled()
            if (r0 == 0) goto L_0x03c2
            long r0 = r11.getAppHubVersionCode()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "ah_sdk_version_code"
            r10.put(r1, r0)
            boolean r0 = r11.isDirectDownloadEnabled()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = "ah_dd_enabled"
            r10.put(r1, r0)
            java.lang.String r11 = r11.getRandomUserToken()
            java.lang.String r11 = com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(r11)
            java.lang.String r0 = "ah_random_user_token"
            r10.put(r0, r11)
        L_0x03c2:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.o.a(java.util.Map, boolean):java.util.Map");
    }

    public static void a(final Context context) {
        new Thread(new Runnable() {
            public void run() {
                o.f15736h.set(com.applovin.impl.sdk.utils.d.a(context));
            }
        }).start();
    }

    private void a(Map<String, Object> map) {
        if (((Boolean) this.f15737a.a(com.applovin.impl.sdk.c.b.dP)).booleanValue() && !map.containsKey("af")) {
            map.put("af", Long.valueOf(w()));
        }
        if (((Boolean) this.f15737a.a(com.applovin.impl.sdk.c.b.dQ)).booleanValue() && !map.containsKey("font")) {
            map.put("font", Float.valueOf(x()));
        }
        if (((Boolean) this.f15737a.a(com.applovin.impl.sdk.c.b.dW)).booleanValue() && Utils.isUserAgentCollectionEnabled(this.f15737a)) {
            aa.b(this.f15737a);
        }
        if (((Boolean) this.f15737a.a(com.applovin.impl.sdk.c.b.dV)).booleanValue() && !map.containsKey("sua")) {
            map.put("sua", System.getProperty("http.agent"));
        }
        if (((Boolean) this.f15737a.a(com.applovin.impl.sdk.c.b.dS)).booleanValue() && !map.containsKey("network_restricted")) {
            map.put("network_restricted", Boolean.valueOf(u()));
        }
    }

    private boolean a(String str) {
        try {
            return Settings.Secure.getInt(this.f15739c.getContentResolver(), str) == 1;
        } catch (Throwable unused) {
            return false;
        }
    }

    private String b(String str) {
        int length = str.length();
        int[] iArr = {11, 12, 10, 3, 2, 1, 15, 10, 15, 14};
        char[] cArr = new char[length];
        for (int i2 = 0; i2 < length; i2++) {
            cArr[i2] = str.charAt(i2);
            for (int i3 = 9; i3 >= 0; i3--) {
                cArr[i2] = (char) (cArr[i2] ^ iArr[i3]);
            }
        }
        return new String(cArr);
    }

    public static void b(final Context context) {
        if (Utils.checkClassExistence("com.google.android.gms.appset.AppSet")) {
            new Thread(new Runnable() {
                public void run() {
                    try {
                        AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() {
                            /* renamed from: a */
                            public void onSuccess(AppSetIdInfo appSetIdInfo) {
                                o.j.set(new b(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                            }
                        });
                    } catch (Throwable unused) {
                        v.f("DataCollector", "Could not collect AppSet ID.");
                    }
                }
            }).start();
        } else {
            v.f("DataCollector", "Could not collect AppSet ID.");
        }
    }

    private Map<String, String> p() {
        return Utils.stringifyObjectMap(a((Map<String, String>) null, true, false));
    }

    private Map<String, Object> q() {
        Map<String, Object> map = CollectionUtils.map(32);
        map.put("api_level", Integer.valueOf(Build.VERSION.SDK_INT));
        map.put("brand", Build.MANUFACTURER);
        map.put("brand_name", Build.BRAND);
        map.put("hardware", Build.HARDWARE);
        map.put("sim", Boolean.valueOf(AppLovinSdkUtils.isEmulator()));
        map.put("aida", Boolean.valueOf(com.applovin.impl.sdk.utils.d.a()));
        map.put("locale", Locale.getDefault().toString());
        map.put("model", Build.MODEL);
        map.put("os", Build.VERSION.RELEASE);
        map.put("platform", f());
        map.put("revision", Build.DEVICE);
        map.put("tz_offset", Double.valueOf(B()));
        map.put("gy", Boolean.valueOf(C()));
        map.put("country_code", D());
        map.put("mcc", E());
        map.put("mnc", F());
        map.put("carrier", G());
        map.put("is_tablet", Boolean.valueOf(AppLovinSdkUtils.isTablet(this.f15739c)));
        map.put("tv", Boolean.valueOf(AppLovinSdkUtils.isTv(this.f15739c)));
        DisplayMetrics displayMetrics = this.f15739c.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            map.put("adns", Float.valueOf(displayMetrics.density));
            map.put("adnsd", Integer.valueOf(displayMetrics.densityDpi));
            map.put("xdpi", Float.valueOf(displayMetrics.xdpi));
            map.put("ydpi", Float.valueOf(displayMetrics.ydpi));
            Point a2 = h.a(this.f15739c);
            map.put("screen_size_in", Double.valueOf(Math.sqrt(Math.pow((double) a2.x, 2.0d) + Math.pow((double) a2.y, 2.0d)) / ((double) displayMetrics.xdpi)));
        }
        map.put("bt_ms", Long.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
        a(map);
        return map;
    }

    private String r() {
        int orientation = AppLovinSdkUtils.getOrientation(this.f15739c);
        return orientation == 1 ? "portrait" : orientation == 2 ? "landscape" : "none";
    }

    private Map<String, Object> s() {
        PackageInfo packageInfo;
        Map<String, Object> map = CollectionUtils.map();
        PackageManager packageManager = this.f15739c.getPackageManager();
        ApplicationInfo applicationInfo = this.f15739c.getApplicationInfo();
        long lastModified = new File(applicationInfo.sourceDir).lastModified();
        String str = null;
        try {
            packageInfo = packageManager.getPackageInfo(this.f15739c.getPackageName(), 0);
            try {
                str = packageManager.getInstallerPackageName(applicationInfo.packageName);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            packageInfo = null;
        }
        map.put("app_name", packageManager.getApplicationLabel(applicationInfo));
        Object obj = "";
        map.put("app_version", packageInfo != null ? packageInfo.versionName : obj);
        map.put("app_version_code", Integer.valueOf(packageInfo != null ? packageInfo.versionCode : -1));
        map.put("package_name", applicationInfo.packageName);
        map.put("vz", StringUtils.toShortSHA1Hash(applicationInfo.packageName));
        if (str == null) {
            str = obj;
        }
        map.put("installer_name", str);
        map.put("tg", q.a(this.f15737a));
        map.put(Constants.DEBUG_INTERSTITIAL, Boolean.valueOf(Utils.isPubInDebugMode(this.f15737a.P(), this.f15737a)));
        map.put("ia", Long.valueOf(lastModified));
        map.put("alts_ms", Long.valueOf(n.A()));
        map.put("j8", Boolean.valueOf(n.B()));
        Long l = (Long) this.f15737a.a(com.applovin.impl.sdk.c.d.f15355d);
        if (l != null) {
            map.put("ia_v2", l);
        } else {
            this.f15737a.a(com.applovin.impl.sdk.c.d.f15355d, Long.valueOf(lastModified));
        }
        map.put("sdk_version", AppLovinSdk.VERSION);
        map.put("omid_sdk_version", this.f15737a.ao().c());
        map.put("api_did", this.f15737a.a(com.applovin.impl.sdk.c.b.aa));
        if (packageInfo != null) {
            obj = Long.valueOf(packageInfo.firstInstallTime);
        }
        map.put("first_install_v3_ms", obj);
        map.put("target_sdk", Integer.valueOf(applicationInfo.targetSdkVersion));
        map.put("epv", Integer.valueOf(Utils.getExoPlayerVersionCode()));
        return map;
    }

    private Map<String, Object> t() {
        Map<String, Object> map = CollectionUtils.map();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f15739c);
        String str = (String) this.f15737a.b(com.applovin.impl.sdk.c.d.n, null, defaultSharedPreferences);
        if (StringUtils.isValidString(str)) {
            map.put("IABTCF_TCString", str);
        }
        String a2 = com.applovin.impl.sdk.c.d.o.a();
        if (defaultSharedPreferences.contains(a2)) {
            String str2 = (String) e.a(a2, "", String.class, defaultSharedPreferences);
            Integer num = (Integer) e.a(a2, Integer.MAX_VALUE, Integer.class, defaultSharedPreferences);
            Long l = (Long) e.a(a2, Long.MAX_VALUE, Long.class, defaultSharedPreferences);
            Boolean bool = (Boolean) e.a(a2, false, Boolean.class, defaultSharedPreferences);
            if (StringUtils.isValidString(str2)) {
                map.put("IABTCF_gdprApplies", str2);
            } else if (num != null && num.intValue() != Integer.MAX_VALUE) {
                map.put("IABTCF_gdprApplies", num);
            } else if (l == null || l.longValue() == Long.MAX_VALUE) {
                map.put("IABTCF_gdprApplies", bool);
            } else {
                map.put("IABTCF_gdprApplies", l);
            }
        }
        return map;
    }

    private boolean u() {
        ConnectivityManager connectivityManager;
        if (h.f() && (connectivityManager = (ConnectivityManager) this.f15739c.getSystemService("connectivity")) != null) {
            try {
                return connectivityManager.getRestrictBackgroundStatus() == 3;
            } catch (Throwable th) {
                this.f15737a.D();
                if (v.a()) {
                    this.f15737a.D().b("DataCollector", "Unable to collect constrained network info.", th);
                }
            }
        }
        return false;
    }

    private c v() {
        c cVar = new c();
        Intent registerReceiver = this.f15739c.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int i2 = -1;
        int intExtra = registerReceiver != null ? registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) : -1;
        int intExtra2 = registerReceiver != null ? registerReceiver.getIntExtra("scale", -1) : -1;
        if (intExtra <= 0 || intExtra2 <= 0) {
            cVar.f15755b = -1;
        } else {
            cVar.f15755b = (int) ((((float) intExtra) / ((float) intExtra2)) * 100.0f);
        }
        if (registerReceiver != null) {
            i2 = registerReceiver.getIntExtra("status", -1);
        }
        cVar.f15754a = i2;
        return cVar;
    }

    private long w() {
        List asList = Arrays.asList(StringUtils.emptyIfNull(Settings.Secure.getString(this.f15739c.getContentResolver(), "enabled_accessibility_services")).split(":"));
        long j2 = asList.contains("AccessibilityMenuService") ? 256 : 0;
        if (asList.contains("SelectToSpeakService")) {
            j2 |= 512;
        }
        if (asList.contains("SoundAmplifierService")) {
            j2 |= 2;
        }
        if (asList.contains("SpeechToTextAccessibilityService")) {
            j2 |= 128;
        }
        if (asList.contains("SwitchAccessService")) {
            j2 |= 4;
        }
        if ((this.f15739c.getResources().getConfiguration().uiMode & 48) == 32) {
            j2 |= 1024;
        }
        if (a("accessibility_enabled")) {
            j2 |= 8;
        }
        if (a("touch_exploration_enabled")) {
            j2 |= 16;
        }
        if (h.d()) {
            if (a("accessibility_display_inversion_enabled")) {
                j2 |= 32;
            }
            if (a("skip_first_use_hints")) {
                j2 |= 64;
            }
        }
        if (a("lock_screen_allow_remote_input")) {
            j2 |= 2048;
        }
        if (a("enabled_accessibility_audio_description_by_default")) {
            j2 |= 4096;
        }
        if (a("accessibility_shortcut_on_lock_screen")) {
            j2 |= 8192;
        }
        if (a("wear_talkback_enabled")) {
            j2 |= 16384;
        }
        if (a("hush_gesture_used")) {
            j2 |= 32768;
        }
        if (a("high_text_contrast_enabled")) {
            j2 |= 65536;
        }
        if (a("accessibility_display_magnification_enabled")) {
            j2 |= 131072;
        }
        if (a("accessibility_display_magnification_navbar_enabled")) {
            j2 |= 262144;
        }
        if (a("accessibility_captioning_enabled")) {
            j2 |= 524288;
        }
        if (a("accessibility_display_daltonizer_enabled")) {
            j2 |= com.appnext.base.b.d.fc;
        }
        if (a("accessibility_autoclick_enabled")) {
            j2 |= 2097152;
        }
        if (a("accessibility_large_pointer_icon")) {
            j2 |= 4194304;
        }
        if (a("reduce_bright_colors_activated")) {
            j2 |= 8388608;
        }
        if (a("reduce_bright_colors_persist_across_reboots")) {
            j2 |= 16777216;
        }
        if (a("tty_mode_enabled")) {
            j2 |= 33554432;
        }
        return a("rtt_calling_mode") ? j2 | 67108864 : j2;
    }

    private float x() {
        try {
            return Settings.System.getFloat(this.f15739c.getContentResolver(), "font_scale");
        } catch (Settings.SettingNotFoundException e2) {
            if (!v.a()) {
                return -1.0f;
            }
            this.f15738b.b("DataCollector", "Error collecting font scale", e2);
            return -1.0f;
        }
    }

    private String y() {
        AudioManager audioManager = (AudioManager) this.f15739c.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (h.e()) {
            for (AudioDeviceInfo type : audioManager.getDevices(2)) {
                sb.append(type.getType());
                sb.append(",");
            }
        } else {
            if (audioManager.isWiredHeadsetOn()) {
                sb.append(3);
                sb.append(",");
            }
            if (audioManager.isBluetoothScoOn()) {
                sb.append(7);
                sb.append(",");
            }
            if (audioManager.isBluetoothA2dpOn()) {
                sb.append(8);
            }
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1);
        }
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2) && v.a()) {
            this.f15738b.b("DataCollector", "No sound outputs detected");
        }
        return sb2;
    }

    private String z() {
        if (!h.f()) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            LocaleList locales = this.f15739c.getResources().getConfiguration().getLocales();
            for (int i2 = 0; i2 < locales.size(); i2++) {
                sb.append(locales.get(i2));
                sb.append(",");
            }
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
                sb.deleteCharAt(sb.length() - 1);
            }
            return sb.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public String a() {
        String encodeToString = Base64.encodeToString(new JSONObject(p()).toString().getBytes(Charset.defaultCharset()), 2);
        if (!((Boolean) this.f15737a.a(com.applovin.impl.sdk.c.b.eB)).booleanValue()) {
            return encodeToString;
        }
        return n.a(encodeToString, this.f15737a.C(), Utils.getServerAdjustedUnixTimestampMillis(this.f15737a));
    }

    public Map<String, Object> a(Map<String, String> map, boolean z, boolean z2) {
        Map<String, Object> map2 = CollectionUtils.map(64);
        Map<String, Object> a2 = a(z);
        Map<String, Object> h2 = h();
        Map<String, Object> j2 = j();
        Map<String, String> allData = this.f15737a.s().getAllData();
        if (z2) {
            map2.put("device_info", a2);
            map2.put("app_info", h2);
            if (map != null) {
                map2.put("ad_info", map);
            }
            if (j2 != null) {
                map2.put("location_info", j2);
            }
            if (!allData.isEmpty()) {
                map2.put("targeting_data", allData);
            }
        } else {
            map2.putAll(a2);
            map2.putAll(h2);
            if (map != null) {
                map2.putAll(map);
            }
            if (j2 != null) {
                map2.putAll(j2);
            }
            if (!allData.isEmpty()) {
                map2.putAll(allData);
            }
        }
        map2.put("accept", "custom_size,launch_app,video");
        map2.put("format", "json");
        Utils.putObjectForStringIfValid("mediation_provider", this.f15737a.u(), map2);
        Utils.putObjectForStringIfValid("plugin_version", (String) this.f15737a.a(com.applovin.impl.sdk.c.b.dI), map2);
        if (!((Boolean) this.f15737a.a(com.applovin.impl.sdk.c.b.eA)).booleanValue()) {
            map2.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f15737a.C());
        }
        map2.putAll(i());
        if (((Boolean) this.f15737a.a(com.applovin.impl.sdk.c.b.ei)).booleanValue()) {
            g W = this.f15737a.W();
            map2.put("li", Long.valueOf(W.b(f.f15398b)));
            map2.put("si", Long.valueOf(W.b(f.f15401e)));
            map2.put("mad", Long.valueOf(W.b(f.f15399c)));
            map2.put("msad", Long.valueOf(W.b(f.f15402f)));
            map2.put("pf", Long.valueOf(W.b(f.j)));
            map2.put("mpf", Long.valueOf(W.b(f.q)));
            map2.put("gpf", Long.valueOf(W.b(f.k)));
            map2.put("asoac", Long.valueOf(W.b(f.o)));
        }
        map2.put("rid", UUID.randomUUID().toString());
        return map2;
    }

    public Map<String, Object> a(boolean z) {
        Map<String, Object> map;
        synchronized (this.f15741e) {
            map = CollectionUtils.map(this.f15740d);
        }
        return a(map, z);
    }

    public Map<String, Object> b() {
        return CollectionUtils.map(this.f15740d);
    }

    public Map<String, Object> c() {
        return CollectionUtils.map(this.f15742f);
    }

    public Map<String, Object> d() {
        return a(false);
    }

    public void e() {
        synchronized (this.f15741e) {
            a(this.f15740d);
        }
    }

    public String f() {
        return AppLovinSdkUtils.isFireOS(this.f15739c) ? "fireos" : MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID;
    }

    public boolean g() {
        return this.f15743g;
    }

    public Map<String, Object> h() {
        Map<String, Object> map = CollectionUtils.map(this.f15742f);
        map.put("first_install", Boolean.valueOf(this.f15737a.S()));
        map.put("first_install_v2", Boolean.valueOf(!this.f15737a.T()));
        map.put("test_ads", Boolean.valueOf(this.f15743g));
        map.put("muted", Boolean.valueOf(this.f15737a.q().isMuted()));
        if (((Boolean) this.f15737a.a(com.applovin.impl.sdk.c.b.dy)).booleanValue()) {
            Utils.putObjectForStringIfValid("cuid", this.f15737a.n(), map);
        }
        if (((Boolean) this.f15737a.a(com.applovin.impl.sdk.c.b.dB)).booleanValue()) {
            map.put("compass_random_token", this.f15737a.o());
        }
        if (((Boolean) this.f15737a.a(com.applovin.impl.sdk.c.b.dD)).booleanValue()) {
            map.put("applovin_random_token", this.f15737a.p());
        }
        String name = this.f15737a.r().getName();
        if (StringUtils.isValidString(name)) {
            map.put("user_segment_name", name);
        }
        map.putAll(t());
        return map;
    }

    public Map<String, Object> i() {
        Map<String, Object> map = CollectionUtils.map();
        map.put("sc", this.f15737a.a(com.applovin.impl.sdk.c.b.af));
        map.put("sc2", this.f15737a.a(com.applovin.impl.sdk.c.b.ag));
        map.put("sc3", this.f15737a.a(com.applovin.impl.sdk.c.b.ah));
        map.put("server_installed_at", this.f15737a.a(com.applovin.impl.sdk.c.b.ai));
        Utils.putObjectForStringIfValid("persisted_data", (String) this.f15737a.a(com.applovin.impl.sdk.c.d.z), map);
        return map;
    }

    public Map<String, Object> j() {
        if (!this.f15737a.q().isLocationCollectionEnabled() || !((Boolean) this.f15737a.a(com.applovin.impl.sdk.c.b.ef)).booleanValue()) {
            return null;
        }
        Map<String, Object> map = CollectionUtils.map();
        u ap = this.f15737a.ap();
        boolean b2 = ap.b();
        map.put("loc_services_enabled", Boolean.valueOf(b2));
        if (!b2) {
            return map;
        }
        map.put("loc_auth", Boolean.valueOf(ap.a()));
        if (ap.c()) {
            map.put("loc_lat", Utils.formatDoubleValue(ap.d(), ((Integer) this.f15737a.a(com.applovin.impl.sdk.c.b.eh)).intValue()));
            map.put("loc_long", Utils.formatDoubleValue(ap.e(), ((Integer) this.f15737a.a(com.applovin.impl.sdk.c.b.eh)).intValue()));
        }
        return map;
    }

    public a k() {
        List<String> testDeviceAdvertisingIds;
        a a2 = com.applovin.impl.sdk.utils.d.a(this.f15739c);
        if (a2 == null) {
            return new a();
        }
        if (((Boolean) this.f15737a.a(com.applovin.impl.sdk.c.b.dw)).booleanValue()) {
            if (a2.f15749a && !((Boolean) this.f15737a.a(com.applovin.impl.sdk.c.b.dv)).booleanValue()) {
                a2.f15750b = "";
            }
            f15736h.set(a2);
        } else {
            a2 = new a();
        }
        boolean z = false;
        if (StringUtils.isValidString(a2.f15750b) && (testDeviceAdvertisingIds = this.f15737a.q().getTestDeviceAdvertisingIds()) != null && testDeviceAdvertisingIds.contains(a2.f15750b)) {
            z = true;
        }
        this.f15743g = z;
        return a2;
    }

    public b l() {
        return j.get();
    }

    public void m() {
        this.f15737a.V().a((com.applovin.impl.sdk.e.a) new com.applovin.impl.sdk.e.f(this.f15737a, new f.a() {
            public void a(a aVar) {
                o.f15736h.set(aVar);
            }
        }), o.a.ADVERTISING_INFO_COLLECTION);
        this.f15737a.V().a((com.applovin.impl.sdk.e.a) new z(this.f15737a, true, new Runnable() {
            public void run() {
                o.this.i.set(o.this.A());
            }
        }), o.a.CACHING_OTHER);
    }
}
