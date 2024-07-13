package com.appodeal.consent.internal;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.amazon.aps.shared.APSAnalytics;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.advertising.AdvertisingInfo;
import com.appodeal.consent.Consent;
import com.appodeal.consent.ConsentManager;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f17816a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17817b;

    /* renamed from: c  reason: collision with root package name */
    public final Consent f17818c;

    /* renamed from: d  reason: collision with root package name */
    public final AdvertisingInfo.AdvertisingProfile f17819d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<?, ?> f17820e;

    /* renamed from: f  reason: collision with root package name */
    public final String f17821f;

    /* renamed from: g  reason: collision with root package name */
    public final String f17822g;

    /* renamed from: h  reason: collision with root package name */
    public final String f17823h;
    public final String i;
    public final Lazy j = LazyKt.lazy(new b(this));
    public final String k = ConsentManager.getVersion();
    public final String l;
    public final String m;
    public final String n;
    public final Lazy o;

    /* renamed from: com.appodeal.consent.internal.a$a  reason: collision with other inner class name */
    public static final class C0212a extends Lambda implements Function0<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0212a f17824a = new C0212a();

        public C0212a() {
            super(0);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invoke() {
            /*
                r4 = this;
                java.lang.String r0 = "com.appodeal.ads.Appodeal"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0025 }
                java.lang.String r1 = "getVersion"
                r2 = 0
                java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ all -> 0x0025 }
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch:{ all -> 0x0025 }
                java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x0025 }
                r2 = 0
                java.lang.Object r0 = r0.invoke(r2, r1)     // Catch:{ all -> 0x0025 }
                boolean r1 = r0 instanceof java.lang.String     // Catch:{ all -> 0x0025 }
                if (r1 == 0) goto L_0x001d
                r2 = r0
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0025 }
            L_0x001d:
                if (r2 != 0) goto L_0x002a
                java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x0025 }
                r2.<init>()     // Catch:{ all -> 0x0025 }
                goto L_0x002a
            L_0x0025:
                java.lang.String r2 = new java.lang.String
                r2.<init>()
            L_0x002a:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.consent.internal.a.C0212a.invoke():java.lang.Object");
        }
    }

    public static final class b extends Lambda implements Function0<Pair<? extends Integer, ? extends Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f17825a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(0);
            this.f17825a = aVar;
        }

        public final Object invoke() {
            DisplayMetrics displayMetrics = this.f17825a.f17816a.getResources().getDisplayMetrics();
            return TuplesKt.to(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
        }
    }

    public a(Context context, String str, Consent consent, AdvertisingInfo.AdvertisingProfile advertisingProfile, Map<?, ?> map, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, Constants.APP_KEY);
        Intrinsics.checkNotNullParameter(consent, "consent");
        Intrinsics.checkNotNullParameter(advertisingProfile, "advertisingProfile");
        Intrinsics.checkNotNullParameter(map, "extraData");
        Intrinsics.checkNotNullParameter(str2, "deviceModel");
        Intrinsics.checkNotNullParameter(str3, "deviceManufacturer");
        Intrinsics.checkNotNullParameter(str4, "osVersion");
        Intrinsics.checkNotNullParameter(str5, "locale");
        this.f17816a = context;
        this.f17817b = str;
        this.f17818c = consent;
        this.f17819d = advertisingProfile;
        this.f17820e = map;
        this.f17821f = str2;
        this.f17822g = str3;
        this.f17823h = str4;
        this.i = str5;
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        this.l = packageName;
        this.m = o() ? "tablet" : "phone";
        this.n = APSAnalytics.OS_NAME;
        this.o = LazyKt.lazy(C0212a.f17824a);
    }

    public final AdvertisingInfo.AdvertisingProfile a() {
        return this.f17819d;
    }

    public final String b() {
        return this.f17817b;
    }

    public final String c() {
        return (String) this.o.getValue();
    }

    public final Consent d() {
        return this.f17818c;
    }

    public final String e() {
        return this.k;
    }

    public final String f() {
        return this.f17822g;
    }

    public final String g() {
        return this.f17821f;
    }

    public final String h() {
        return this.m;
    }

    public final Map<?, ?> i() {
        return this.f17820e;
    }

    public final String j() {
        return this.i;
    }

    public final String k() {
        return this.n;
    }

    public final String l() {
        return this.f17823h;
    }

    public final String m() {
        return this.l;
    }

    public final Pair<Integer, Integer> n() {
        return (Pair) this.j.getValue();
    }

    public final boolean o() {
        Object systemService = this.f17816a.getSystemService("window");
        if (systemService != null) {
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            Intrinsics.checkNotNullExpressionValue(defaultDisplay, "windowManager.defaultDisplay");
            DisplayMetrics displayMetrics = this.f17816a.getResources().getDisplayMetrics();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            defaultDisplay.getMetrics(displayMetrics);
            return Math.sqrt(Math.pow((double) (((float) point.y) / displayMetrics.ydpi), 2.0d) + Math.pow((double) (((float) point.x) / displayMetrics.xdpi), 2.0d)) > 7.0d;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }
}
