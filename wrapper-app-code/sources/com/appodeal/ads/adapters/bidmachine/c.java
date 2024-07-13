package com.appodeal.ads.adapters.bidmachine;

import android.text.TextUtils;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.log.InternalLogEvent;
import com.appodeal.ads.modules.common.internal.log.InternalLogKt;
import com.explorestack.iab.utils.LogListener;
import com.explorestack.iab.utils.Logger;
import io.bidmachine.CustomParams;
import io.bidmachine.PriceFloorParams;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: BidMachineUtils */
public final class c {

    /* compiled from: BidMachineUtils */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16232a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.explorestack.iab.utils.Logger$LogLevel[] r0 = com.explorestack.iab.utils.Logger.LogLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16232a = r0
                com.explorestack.iab.utils.Logger$LogLevel r1 = com.explorestack.iab.utils.Logger.LogLevel.info     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16232a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.explorestack.iab.utils.Logger$LogLevel r1 = com.explorestack.iab.utils.Logger.LogLevel.debug     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16232a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.explorestack.iab.utils.Logger$LogLevel r1 = com.explorestack.iab.utils.Logger.LogLevel.warning     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f16232a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.explorestack.iab.utils.Logger$LogLevel r1 = com.explorestack.iab.utils.Logger.LogLevel.error     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f16232a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.explorestack.iab.utils.Logger$LogLevel r1 = com.explorestack.iab.utils.Logger.LogLevel.none     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.adapters.bidmachine.c.a.<clinit>():void");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static io.bidmachine.TargetingParams a(android.content.Context r7, org.json.JSONObject r8, com.appodeal.ads.RestrictedData r9) {
        /*
            io.bidmachine.TargetingParams r0 = new io.bidmachine.TargetingParams
            r0.<init>()
            java.lang.String r1 = r9.getUserId()
            r0.setUserId((java.lang.String) r1)
            com.appodeal.ads.UserSettings$Gender r1 = r9.getGender()
            com.appodeal.ads.UserSettings$Gender r2 = com.appodeal.ads.UserSettings.Gender.MALE
            if (r1 != r2) goto L_0x001a
            io.bidmachine.utils.Gender r1 = io.bidmachine.utils.Gender.Male
            r0.setGender((io.bidmachine.utils.Gender) r1)
            goto L_0x002d
        L_0x001a:
            com.appodeal.ads.UserSettings$Gender r2 = com.appodeal.ads.UserSettings.Gender.FEMALE
            if (r1 != r2) goto L_0x0024
            io.bidmachine.utils.Gender r1 = io.bidmachine.utils.Gender.Female
            r0.setGender((io.bidmachine.utils.Gender) r1)
            goto L_0x002d
        L_0x0024:
            com.appodeal.ads.UserSettings$Gender r2 = com.appodeal.ads.UserSettings.Gender.OTHER
            if (r1 != r2) goto L_0x002d
            io.bidmachine.utils.Gender r1 = io.bidmachine.utils.Gender.Omitted
            r0.setGender((io.bidmachine.utils.Gender) r1)
        L_0x002d:
            java.lang.Integer r1 = r9.getAge()
            if (r1 == 0) goto L_0x0048
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            r3 = 1
            int r2 = r2.get(r3)
            int r1 = r1.intValue()
            int r2 = r2 - r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.setBirthdayYear((java.lang.Integer) r1)
        L_0x0048:
            com.appodeal.ads.LocationData r7 = r9.getLocation(r7)
            android.location.Location r7 = r7.getDeviceLocation()
            if (r7 == 0) goto L_0x0055
            r0.setDeviceLocation((android.location.Location) r7)
        L_0x0055:
            java.lang.String r7 = r9.getCountry()
            r0.setCountry((java.lang.String) r7)
            java.lang.String r7 = r9.getCity()
            r0.setCity((java.lang.String) r7)
            java.lang.String r7 = r9.getZip()
            r0.setZip((java.lang.String) r7)
            java.lang.String r7 = "sturl"
            java.lang.Object r7 = r8.opt(r7)
            boolean r1 = r7 instanceof java.lang.String
            r2 = 0
            if (r1 == 0) goto L_0x0078
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x0079
        L_0x0078:
            r7 = r2
        L_0x0079:
            if (r7 == 0) goto L_0x007e
            r0.setStoreUrl((java.lang.String) r7)
        L_0x007e:
            java.lang.String r7 = "paid"
            java.lang.Object r7 = r8.opt(r7)
            boolean r1 = r7 instanceof java.lang.Boolean
            if (r1 == 0) goto L_0x008b
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            goto L_0x009b
        L_0x008b:
            boolean r1 = r7 instanceof java.lang.String
            if (r1 == 0) goto L_0x009a
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = java.lang.Boolean.parseBoolean(r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L_0x009b
        L_0x009a:
            r7 = r2
        L_0x009b:
            if (r7 == 0) goto L_0x00a0
            r0.setPaid((java.lang.Boolean) r7)
        L_0x00a0:
            java.lang.String r7 = "keywords"
            java.lang.Object r7 = r8.opt(r7)
            boolean r1 = r7 instanceof java.lang.String
            if (r1 == 0) goto L_0x00ad
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x00ae
        L_0x00ad:
            r7 = r2
        L_0x00ae:
            java.lang.String r1 = ","
            r3 = 0
            if (r7 == 0) goto L_0x00c6
            boolean r4 = android.text.TextUtils.isEmpty(r7)
            if (r4 == 0) goto L_0x00bc
            java.lang.String[] r7 = new java.lang.String[r3]
            goto L_0x00c3
        L_0x00bc:
            java.lang.String[] r7 = r7.split(r1)     // Catch:{ Exception -> 0x00c1 }
            goto L_0x00c3
        L_0x00c1:
            java.lang.String[] r7 = new java.lang.String[r3]
        L_0x00c3:
            r0.setKeywords((java.lang.String[]) r7)
        L_0x00c6:
            java.lang.String r7 = "bcat"
            java.lang.Object r7 = r8.opt(r7)
            boolean r4 = r7 instanceof java.lang.String
            if (r4 == 0) goto L_0x00d3
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x00d4
        L_0x00d3:
            r7 = r2
        L_0x00d4:
            if (r7 == 0) goto L_0x00f2
            boolean r4 = android.text.TextUtils.isEmpty(r7)
            if (r4 == 0) goto L_0x00df
            java.lang.String[] r7 = new java.lang.String[r3]
            goto L_0x00e6
        L_0x00df:
            java.lang.String[] r7 = r7.split(r1)     // Catch:{ Exception -> 0x00e4 }
            goto L_0x00e6
        L_0x00e4:
            java.lang.String[] r7 = new java.lang.String[r3]
        L_0x00e6:
            int r4 = r7.length
            r5 = 0
        L_0x00e8:
            if (r5 >= r4) goto L_0x00f2
            r6 = r7[r5]
            r0.addBlockedAdvertiserIABCategory((java.lang.String) r6)
            int r5 = r5 + 1
            goto L_0x00e8
        L_0x00f2:
            java.lang.String r7 = "badv"
            java.lang.Object r7 = r8.opt(r7)
            boolean r4 = r7 instanceof java.lang.String
            if (r4 == 0) goto L_0x00ff
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x0100
        L_0x00ff:
            r7 = r2
        L_0x0100:
            if (r7 == 0) goto L_0x011e
            boolean r4 = android.text.TextUtils.isEmpty(r7)
            if (r4 == 0) goto L_0x010b
            java.lang.String[] r7 = new java.lang.String[r3]
            goto L_0x0112
        L_0x010b:
            java.lang.String[] r7 = r7.split(r1)     // Catch:{ Exception -> 0x0110 }
            goto L_0x0112
        L_0x0110:
            java.lang.String[] r7 = new java.lang.String[r3]
        L_0x0112:
            int r4 = r7.length
            r5 = 0
        L_0x0114:
            if (r5 >= r4) goto L_0x011e
            r6 = r7[r5]
            r0.addBlockedAdvertiserDomain((java.lang.String) r6)
            int r5 = r5 + 1
            goto L_0x0114
        L_0x011e:
            java.lang.String r7 = "bapps"
            java.lang.Object r7 = r8.opt(r7)
            boolean r8 = r7 instanceof java.lang.String
            if (r8 == 0) goto L_0x012b
            r2 = r7
            java.lang.String r2 = (java.lang.String) r2
        L_0x012b:
            if (r2 == 0) goto L_0x0148
            boolean r7 = android.text.TextUtils.isEmpty(r2)
            if (r7 == 0) goto L_0x0136
            java.lang.String[] r7 = new java.lang.String[r3]
            goto L_0x013d
        L_0x0136:
            java.lang.String[] r7 = r2.split(r1)     // Catch:{ Exception -> 0x013b }
            goto L_0x013d
        L_0x013b:
            java.lang.String[] r7 = new java.lang.String[r3]
        L_0x013d:
            int r8 = r7.length
        L_0x013e:
            if (r3 >= r8) goto L_0x0148
            r1 = r7[r3]
            r0.addBlockedApplication((java.lang.String) r1)
            int r3 = r3 + 1
            goto L_0x013e
        L_0x0148:
            java.lang.String r7 = r9.getCity()
            r0.setCity((java.lang.String) r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.adapters.bidmachine.c.a(android.content.Context, org.json.JSONObject, com.appodeal.ads.RestrictedData):io.bidmachine.TargetingParams");
    }

    public static CustomParams a(JSONObject jSONObject) {
        CustomParams customParams = new CustomParams();
        if (jSONObject != null) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    customParams.addParam(next, jSONObject.optString(next));
                }
            } catch (Throwable unused) {
            }
        }
        return customParams;
    }

    public static LogListener a() {
        return new LogListener("bm mraid event") {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final void onLog(Logger.LogLevel logLevel, String str, String str2) {
                c.a(this.f$0, logLevel, str, str2);
            }
        };
    }

    public static void a(String str, Logger.LogLevel logLevel, String str2, String str3) {
        Function1<? super InternalLogEvent, Unit> function1 = InternalLogKt.observer;
        int i = a.f16232a[logLevel.ordinal()];
        function1.invoke(new InternalLogEvent(str2, str, str3, i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "verbose" : "none" : "error" : "warning" : Constants.DEBUG_INTERSTITIAL : "info"));
    }

    public static PriceFloorParams a(String str) {
        PriceFloorParams priceFloorParams = new PriceFloorParams();
        if (TextUtils.isEmpty(str)) {
            return priceFloorParams;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                Object opt = jSONArray.opt(i);
                if (opt instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) opt;
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        double a2 = a(jSONObject.opt(next));
                        if (!TextUtils.isEmpty(next) && a2 > -1.0d) {
                            priceFloorParams.addPriceFloor(next, a2);
                        }
                    }
                } else {
                    double a3 = a(opt);
                    if (a3 > -1.0d) {
                        priceFloorParams.addPriceFloor(a3);
                    }
                }
            }
            return priceFloorParams;
        } catch (Exception unused) {
            return new PriceFloorParams();
        }
    }

    public static double a(Object obj) {
        double d2;
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).doubleValue();
        }
        if (!(obj instanceof String)) {
            return -1.0d;
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            return -1.0d;
        }
        try {
            if (str.lastIndexOf(46) > str.lastIndexOf(44)) {
                d2 = NumberFormat.getInstance(Locale.TAIWAN).parse(str).doubleValue();
            } else {
                d2 = NumberFormat.getInstance().parse(str).doubleValue();
            }
            return d2;
        } catch (Exception unused) {
            return -1.0d;
        }
    }
}
