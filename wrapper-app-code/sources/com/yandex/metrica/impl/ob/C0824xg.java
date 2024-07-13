package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.yandex.metrica.impl.ob.C0334dg;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.xg  reason: case insensitive filesystem */
public final class C0824xg {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Zl<C0334dg.a, Integer> f7114a;

    /* renamed from: b  reason: collision with root package name */
    private final long f7115b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7116c;

    /* renamed from: d  reason: collision with root package name */
    private final String f7117d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f7118e;

    /* renamed from: f  reason: collision with root package name */
    private final C0565mn f7119f;

    /* renamed from: g  reason: collision with root package name */
    private final M0 f7120g;

    /* renamed from: com.yandex.metrica.impl.ob.xg$a */
    public static final class a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues((Comparable) ((Pair) t).getSecond(), (Comparable) ((Pair) t2).getSecond());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.xg$b */
    static final class b<T> implements Comparator<C0334dg> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0824xg f7121a;

        b(C0824xg xgVar) {
            this.f7121a = xgVar;
        }

        /* renamed from: a */
        public final int compare(C0334dg dgVar, C0334dg dgVar2) {
            int sign = MathKt.getSign(dgVar.f5666c - dgVar2.f5666c);
            if (sign != 0) {
                return sign;
            }
            int intValue = ((Number) this.f7121a.f7114a.a(dgVar.f5667d)).intValue();
            Object a2 = this.f7121a.f7114a.a(dgVar2.f5667d);
            Intrinsics.checkNotNullExpressionValue(a2, "sourcePriorities[second.source]");
            return intValue - ((Number) a2).intValue();
        }
    }

    public C0824xg(Context context, C0565mn mnVar, M0 m0) {
        this.f7118e = context;
        this.f7119f = mnVar;
        this.f7120g = m0;
        Zl<C0334dg.a, Integer> zl = new Zl<>(0);
        zl.a(C0334dg.a.HMS, 1);
        zl.a(C0334dg.a.GP, 2);
        this.f7114a = zl;
        this.f7115b = TimeUnit.DAYS.toSeconds(1);
        this.f7116c = "com.android.vending";
        this.f7117d = "com.huawei.appmarket";
    }

    private final JSONObject c(C0334dg dgVar) {
        JSONObject put = new JSONObject().put("referrer", dgVar.f5664a).put("install_timestamp_seconds", dgVar.f5666c).put("click_timestamp_seconds", dgVar.f5665b).put("source", dgVar.f5667d.f5672a);
        Intrinsics.checkNotNullExpressionValue(put, "JSONObject()\n           …eferrerInfo.source.value)");
        return put;
    }

    public final boolean b(C0334dg dgVar) {
        String str = dgVar != null ? dgVar.f5664a : null;
        return !(str == null || str.length() == 0);
    }

    public final boolean a(C0334dg dgVar) {
        if (dgVar == null) {
            return false;
        }
        C0565mn mnVar = this.f7119f;
        Context context = this.f7118e;
        String packageName = context.getPackageName();
        mnVar.getClass();
        String str = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (A2.a(30)) {
                str = C0590nn.a(packageManager, packageName);
            } else {
                str = packageManager.getInstallerPackageName(packageName);
            }
        } catch (Throwable unused) {
        }
        int ordinal = dgVar.f5667d.ordinal();
        if (ordinal == 1) {
            return Intrinsics.areEqual((Object) this.f7116c, (Object) str);
        }
        if (ordinal != 2) {
            return false;
        }
        return Intrinsics.areEqual((Object) this.f7117d, (Object) str);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C0824xg(android.content.Context r1, com.yandex.metrica.impl.ob.C0565mn r2, com.yandex.metrica.impl.ob.M0 r3, int r4) {
        /*
            r0 = this;
            r2 = r4 & 2
            r3 = 0
            if (r2 == 0) goto L_0x000b
            com.yandex.metrica.impl.ob.mn r2 = new com.yandex.metrica.impl.ob.mn
            r2.<init>()
            goto L_0x000c
        L_0x000b:
            r2 = r3
        L_0x000c:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0019
            com.yandex.metrica.impl.ob.M0 r3 = com.yandex.metrica.impl.ob.C0609oh.a()
            java.lang.String r4 = "YandexMetricaSelfReportFacade.getReporter()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
        L_0x0019:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0824xg.<init>(android.content.Context, com.yandex.metrica.impl.ob.mn, com.yandex.metrica.impl.ob.M0, int):void");
    }

    public final C0334dg a(List<C0334dg> list) {
        C0334dg dgVar = null;
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        C0565mn mnVar = this.f7119f;
        Context context = this.f7118e;
        PackageInfo b2 = mnVar.b(context, context.getPackageName(), 0);
        if (b2 != null) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(b2.firstInstallTime);
            a aVar = new a();
            Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                C0334dg dgVar2 = (C0334dg) it.next();
                Pair pair = TuplesKt.to(dgVar2, Long.valueOf(Math.abs(dgVar2.f5666c - seconds)));
                while (it.hasNext()) {
                    C0334dg dgVar3 = (C0334dg) it.next();
                    Pair pair2 = TuplesKt.to(dgVar3, Long.valueOf(Math.abs(dgVar3.f5666c - seconds)));
                    if (aVar.compare(pair, pair2) > 0) {
                        pair = pair2;
                    }
                }
                C0334dg dgVar4 = (C0334dg) pair.component1();
                if (((Number) pair.component2()).longValue() < this.f7115b) {
                    dgVar = dgVar4;
                }
            } else {
                throw new NoSuchElementException();
            }
        }
        if (dgVar == null) {
            b bVar = new b(this);
            Iterator<T> it2 = list.iterator();
            if (it2.hasNext()) {
                C0334dg dgVar5 = (C0334dg) it2.next();
                while (it2.hasNext()) {
                    C0334dg dgVar6 = (C0334dg) it2.next();
                    if (bVar.compare(dgVar5, dgVar6) < 0) {
                        dgVar5 = dgVar6;
                    }
                }
                dgVar = dgVar5;
            } else {
                throw new NoSuchElementException();
            }
        }
        this.f7120g.reportEvent("several_filled_referrers", a(list, dgVar, b2).toString());
        return dgVar;
    }

    private final JSONObject a(List<C0334dg> list, C0334dg dgVar, PackageInfo packageInfo) {
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (C0334dg c2 : list) {
            arrayList.add(c(c2));
        }
        JSONObject putOpt = jSONObject.put("candidates", Tl.b((List<?>) arrayList)).put("chosen", c(dgVar)).putOpt("install_time", packageInfo != null ? Long.valueOf(packageInfo.firstInstallTime) : null);
        Intrinsics.checkNotNullExpressionValue(putOpt, "JSONObject()\n           …geInfo?.firstInstallTime)");
        return putOpt;
    }
}
