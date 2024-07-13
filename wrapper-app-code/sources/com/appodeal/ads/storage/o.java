package com.appodeal.ads.storage;

import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.r0;
import com.appodeal.ads.storage.b;
import com.appodeal.ads.w4;
import com.appodeal.ads.y4;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Triple;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class o implements a {

    /* renamed from: b  reason: collision with root package name */
    public static final o f17407b = new o();

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f17408a = m.a();

    public final Object a(r0.a aVar) {
        return this.f17408a.a(aVar);
    }

    public final Object a(w4 w4Var) {
        return this.f17408a.a(w4Var);
    }

    public final Object a(y4 y4Var) {
        return this.f17408a.a(y4Var);
    }

    public final Object a(String str, y4 y4Var) {
        return this.f17408a.a(str, y4Var);
    }

    public final Object a(LinkedHashSet linkedHashSet, r0.b bVar) {
        return this.f17408a.a(linkedHashSet, bVar);
    }

    public final Object a(ContinuationImpl continuationImpl) {
        return this.f17408a.a(continuationImpl);
    }

    public final String a() {
        return this.f17408a.a();
    }

    public final Triple<JSONObject, Long, Integer> a(String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        return this.f17408a.a(str);
    }

    public final void a(int i) {
        Intrinsics.checkNotNullParameter("part_of_audience", "key");
        this.f17408a.a(i);
    }

    public final void a(int i, long j, String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(str2, "jsonString");
        this.f17408a.a(i, j, str, str2);
    }

    public final void a(long j) {
        this.f17408a.c(j);
    }

    public final void a(String str, long j) {
        Intrinsics.checkNotNullParameter(str, "campaignId");
        this.f17408a.a(str, j);
    }

    public final void a(String str, long j, long j2, long j3, long j4, long j5) {
        Intrinsics.checkNotNullParameter(str, Constants.UUID);
        this.f17408a.a(str, j, j2, j3, j4, j5);
    }

    public final void a(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "campaignId");
        Intrinsics.checkNotNullParameter(str2, "campaignData");
        this.f17408a.a(str, str2);
    }

    public final void a(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "campaigns");
        this.f17408a.a(jSONObject);
    }

    public final int b() {
        Intrinsics.checkNotNullParameter("part_of_audience", "key");
        return this.f17408a.b();
    }

    public final void b(String str) {
        Intrinsics.checkNotNullParameter(str, "userToken");
        this.f17408a.b(str);
    }

    public final void b(String str, long j) {
        Intrinsics.checkNotNullParameter(str, Constants.SESSIONS);
        this.f17408a.b(str, j);
    }

    public final void b(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f17408a.b(str, str2);
    }

    public final String c() {
        return this.f17408a.c();
    }

    public final void c(String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        this.f17408a.c(str);
    }

    public final void c(String str, long j) {
        Intrinsics.checkNotNullParameter(str, "key");
        this.f17408a.c(str, j);
    }

    public final void c(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(str2, "string");
        this.f17408a.c(str, str2);
    }

    public final Long d() {
        b bVar = this.f17408a;
        b.a aVar = b.a.Default;
        if (!bVar.a(aVar).contains("first_ad_session_launch_time")) {
            return null;
        }
        return Long.valueOf(bVar.a(aVar).getLong("first_ad_session_launch_time", 0));
    }

    public final void d(String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        this.f17408a.d(str);
    }

    public final String e(String str) {
        Intrinsics.checkNotNullParameter(str, "campaignId");
        return this.f17408a.e(str);
    }

    public final Map<String, String> e() {
        return this.f17408a.f();
    }

    public final String f() {
        return this.f17408a.a(b.a.Default).getString(Constants.SESSIONS, (String) null);
    }

    public final String f(String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        return this.f17408a.f(str);
    }

    public final Long g(String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        return this.f17408a.g(str);
    }
}
