package com.criteo.publisher.context;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import androidx.core.os.ConfigurationCompat;
import androidx.core.os.LocaleListCompat;
import com.criteo.publisher.context.a;
import com.criteo.publisher.n0.c;
import com.criteo.publisher.n0.m;
import com.criteo.publisher.z;
import com.onesignal.outcomes.data.OutcomeEventsTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ContextProvider.kt */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2379a;

    /* renamed from: b  reason: collision with root package name */
    private final a f2380b;

    /* renamed from: c  reason: collision with root package name */
    private final c f2381c;

    /* renamed from: d  reason: collision with root package name */
    private final z f2382d;

    static {
        new a((DefaultConstructorMarker) null);
    }

    public b(Context context, a aVar, c cVar, z zVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "connectionTypeFetcher");
        Intrinsics.checkParameterIsNotNull(cVar, "androidUtil");
        Intrinsics.checkParameterIsNotNull(zVar, OutcomeEventsTable.COLUMN_NAME_SESSION);
        this.f2379a = context;
        this.f2380b = aVar;
        this.f2381c = cVar;
        this.f2382d = zVar;
    }

    public String c() {
        String str = Build.MANUFACTURER;
        if (!Intrinsics.areEqual((Object) str, (Object) DtbDeviceDataRetriever.ORIENTATION_UNKNOWN)) {
            return str;
        }
        return null;
    }

    public String d() {
        String str = Build.MODEL;
        if (!Intrinsics.areEqual((Object) str, (Object) DtbDeviceDataRetriever.ORIENTATION_UNKNOWN)) {
            return str;
        }
        return null;
    }

    public Integer a() {
        a.C0020a b2 = this.f2380b.b();
        if (b2 != null) {
            return Integer.valueOf(b2.a());
        }
        return null;
    }

    public String k() {
        List<Locale> h2 = h();
        ArrayList arrayList = new ArrayList();
        for (Locale country : h2) {
            String country2 = country.getCountry();
            Intrinsics.checkExpressionValueIsNotNull(country2, "it");
            if (!(!StringsKt.isBlank(country2))) {
                country2 = null;
            }
            if (country2 != null) {
                arrayList.add(country2);
            }
        }
        return (String) CollectionsKt.firstOrNull(arrayList);
    }

    public List<String> l() {
        List<Locale> h2 = h();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = h2.iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            String language = ((Locale) it.next()).getLanguage();
            Intrinsics.checkExpressionValueIsNotNull(language, "it");
            if (!StringsKt.isBlank(language)) {
                str = language;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        List<String> distinct = CollectionsKt.distinct(arrayList);
        if (!distinct.isEmpty()) {
            return distinct;
        }
        return null;
    }

    private List<Locale> h() {
        Resources system = Resources.getSystem();
        Intrinsics.checkExpressionValueIsNotNull(system, "Resources.getSystem()");
        LocaleListCompat locales = ConfigurationCompat.getLocales(system.getConfiguration());
        Intrinsics.checkExpressionValueIsNotNull(locales, "ConfigurationCompat.getL…etSystem().configuration)");
        int size = locales.size();
        Locale[] localeArr = new Locale[size];
        for (int i = 0; i < size; i++) {
            localeArr[i] = locales.get(i);
        }
        return ArraysKt.toList((T[]) localeArr);
    }

    public Integer g() {
        Point f2 = f();
        if (f2 != null) {
            return Integer.valueOf(f2.x);
        }
        return null;
    }

    public Integer b() {
        Point f2 = f();
        if (f2 != null) {
            return Integer.valueOf(f2.y);
        }
        return null;
    }

    private Point f() {
        if (Build.VERSION.SDK_INT < 17) {
            return null;
        }
        Point point = new Point();
        Object systemService = this.f2379a.getSystemService("window");
        if (systemService != null) {
            ((WindowManager) systemService).getDefaultDisplay().getRealSize(point);
            return point;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
    }

    public String e() {
        int a2 = this.f2381c.a();
        if (a2 == 1) {
            return "Portrait";
        }
        if (a2 != 2) {
            return null;
        }
        return "Landscape";
    }

    public Integer i() {
        return Integer.valueOf(this.f2382d.a());
    }

    public Map<String, Object> j() {
        return m.a(MapsKt.mapOf(TuplesKt.to("device.make", c()), TuplesKt.to("device.model", d()), TuplesKt.to("device.contype", a()), TuplesKt.to("device.w", g()), TuplesKt.to("device.h", b()), TuplesKt.to("data.orientation", e()), TuplesKt.to("user.geo.country", k()), TuplesKt.to("data.inputLanguage", l()), TuplesKt.to("data.sessionDuration", i())));
    }

    /* compiled from: ContextProvider.kt */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
