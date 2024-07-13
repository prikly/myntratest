package com.applovin.impl.sdk.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f15806a = true;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f15807b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static final Collection<CountDownLatch> f15808c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f15809d = false;

    /* renamed from: e  reason: collision with root package name */
    private static o.a f15810e = null;

    public static o.a a(Context context) {
        return b(context);
    }

    public static boolean a() {
        return Utils.checkClassExistence("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r1 == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r5 = c(r5);
        r0 = f15807b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        f15809d = true;
        f15810e = r5;
        r5 = new java.util.HashSet(f15808c);
        f15808c.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r5 = r5.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (r5.hasNext() == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        ((java.util.concurrent.CountDownLatch) r5.next()).countDown();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0056, code lost:
        if (r2.await(60, java.util.concurrent.TimeUnit.SECONDS) != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0058, code lost:
        com.applovin.impl.sdk.v.i("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }: collection timeout");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0060, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0061, code lost:
        com.applovin.impl.sdk.v.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.applovin.impl.sdk.o.a b(android.content.Context r5) {
        /*
            java.lang.Object r0 = f15807b
            monitor-enter(r0)
            boolean r1 = f15809d     // Catch:{ all -> 0x0072 }
            if (r1 == 0) goto L_0x000b
            com.applovin.impl.sdk.o$a r5 = f15810e     // Catch:{ all -> 0x0072 }
            monitor-exit(r0)     // Catch:{ all -> 0x0072 }
            return r5
        L_0x000b:
            java.util.Collection<java.util.concurrent.CountDownLatch> r1 = f15808c     // Catch:{ all -> 0x0072 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0072 }
            java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x0072 }
            r3 = 1
            r2.<init>(r3)     // Catch:{ all -> 0x0072 }
            java.util.Collection<java.util.concurrent.CountDownLatch> r4 = f15808c     // Catch:{ all -> 0x0072 }
            r4.add(r2)     // Catch:{ all -> 0x0072 }
            monitor-exit(r0)     // Catch:{ all -> 0x0072 }
            if (r1 == 0) goto L_0x004e
            com.applovin.impl.sdk.o$a r5 = c(r5)
            java.lang.Object r0 = f15807b
            monitor-enter(r0)
            f15809d = r3     // Catch:{ all -> 0x004b }
            f15810e = r5     // Catch:{ all -> 0x004b }
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ all -> 0x004b }
            java.util.Collection<java.util.concurrent.CountDownLatch> r1 = f15808c     // Catch:{ all -> 0x004b }
            r5.<init>(r1)     // Catch:{ all -> 0x004b }
            java.util.Collection<java.util.concurrent.CountDownLatch> r1 = f15808c     // Catch:{ all -> 0x004b }
            r1.clear()     // Catch:{ all -> 0x004b }
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            java.util.Iterator r5 = r5.iterator()
        L_0x003b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x004e
            java.lang.Object r0 = r5.next()
            java.util.concurrent.CountDownLatch r0 = (java.util.concurrent.CountDownLatch) r0
            r0.countDown()
            goto L_0x003b
        L_0x004b:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            throw r5
        L_0x004e:
            r0 = 60
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0060 }
            boolean r5 = r2.await(r0, r5)     // Catch:{ InterruptedException -> 0x0060 }
            if (r5 != 0) goto L_0x0068
            java.lang.String r5 = "DataCollector"
            java.lang.String r0 = "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }: collection timeout"
            com.applovin.impl.sdk.v.i(r5, r0)     // Catch:{ InterruptedException -> 0x0060 }
            goto L_0x0068
        L_0x0060:
            r5 = move-exception
            java.lang.String r0 = "DataCollector"
            java.lang.String r1 = "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }"
            com.applovin.impl.sdk.v.c(r0, r1, r5)
        L_0x0068:
            java.lang.Object r5 = f15807b
            monitor-enter(r5)
            com.applovin.impl.sdk.o$a r0 = f15810e     // Catch:{ all -> 0x006f }
            monitor-exit(r5)     // Catch:{ all -> 0x006f }
            return r0
        L_0x006f:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x006f }
            throw r0
        L_0x0072:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0072 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.utils.d.b(android.content.Context):com.applovin.impl.sdk.o$a");
    }

    private static o.a c(Context context) {
        o.a d2 = d(context);
        if (d2 == null) {
            d2 = e(context);
        }
        return d2 == null ? new o.a() : d2;
    }

    private static o.a d(Context context) {
        if (a()) {
            try {
                o.a aVar = new o.a();
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                boolean isLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
                aVar.f15749a = isLimitAdTrackingEnabled;
                aVar.f15751c = isLimitAdTrackingEnabled ? o.d.ON : o.d.OFF;
                aVar.f15750b = advertisingIdInfo.getId();
                return aVar;
            } catch (Throwable th) {
                if (AppLovinSdkUtils.isFireOS(context)) {
                    return null;
                }
                v.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", th);
                return null;
            }
        } else if (AppLovinSdkUtils.isFireOS(context)) {
            return null;
        } else {
            v.i("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }");
            return null;
        }
    }

    private static o.a e(Context context) {
        String str;
        if (f15806a) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                o.a aVar = new o.a();
                aVar.f15750b = StringUtils.emptyIfNull(Settings.Secure.getString(contentResolver, "advertising_id"));
                boolean z = Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0;
                aVar.f15749a = z;
                aVar.f15751c = z ? o.d.ON : o.d.OFF;
                return aVar;
            } catch (Settings.SettingNotFoundException e2) {
                th = e2;
                str = "Unable to determine if Fire OS limited ad tracking is turned on";
                v.c("DataCollector", str, th);
                f15806a = false;
                return null;
            } catch (Throwable th) {
                th = th;
                str = "Unable to collect Fire OS IDFA";
                v.c("DataCollector", str, th);
                f15806a = false;
                return null;
            }
        }
        f15806a = false;
        return null;
    }
}
