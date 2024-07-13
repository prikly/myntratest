package com.yandex.metrica.impl.ob;

import android.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.a8  reason: case insensitive filesystem */
public final class C0251a8 {

    /* renamed from: a  reason: collision with root package name */
    private final C0301c8 f5466a;

    /* renamed from: com.yandex.metrica.impl.ob.a8$a */
    static final class a implements C0326d8 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f5467a = new a();

        a() {
        }

        public final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("device_id", Tl.a(jSONObject, jSONObject2, "device_id"));
            jSONObject3.put("device_id_hash", Tl.a(jSONObject, jSONObject2, "device_id_hash"));
            jSONObject3.put("referrer", Tl.a(jSONObject, jSONObject2, "referrer"));
            jSONObject3.put("referrer_checked", Tl.a(jSONObject2, "referrer_checked", Tl.a(jSONObject, "referrer_checked", Boolean.FALSE)));
            jSONObject3.put("location_id", Tl.a(jSONObject2, "location_id", Tl.a(jSONObject, "location_id", (Long) -1L)));
            jSONObject3.put("lbs_id", Tl.a(jSONObject2, "lbs_id", Tl.a(jSONObject, "lbs_id", (Long) -1L)));
            jSONObject3.put("location_request_id", Tl.a(jSONObject2, "location_request_id", Tl.a(jSONObject, "location_request_id", (Long) -1L)));
            jSONObject3.put("last_migration_api_level", Tl.a(jSONObject2, "last_migration_api_level", Tl.a(jSONObject, "last_migration_api_level", (Integer) -1)));
            return jSONObject3;
        }
    }

    public C0251a8(C0376f8 f8Var, C0376f8 f8Var2) {
        this.f5466a = new C0301c8(f8Var, f8Var2, "[VitalCommonDataProvider]", a.f5467a);
    }

    public final synchronized String a() {
        return Tl.b(this.f5466a.a(), "device_id");
    }

    public final synchronized String b() {
        return Tl.b(this.f5466a.a(), "device_id_hash");
    }

    public final synchronized void c(long j) {
        C0301c8 c8Var = this.f5466a;
        JSONObject put = c8Var.a().put("location_request_id", j);
        Intrinsics.checkNotNullExpressionValue(put, "vitalDataProvider.getOrL…CATION_REQUEST_ID, value)");
        c8Var.a(put);
    }

    public final synchronized long d() {
        return this.f5466a.a().optLong("lbs_id", -1);
    }

    public final synchronized long e() {
        return this.f5466a.a().optLong("location_id", -1);
    }

    public final synchronized long f() {
        return this.f5466a.a().optLong("location_request_id", -1);
    }

    public final synchronized C0334dg g() {
        C0334dg dgVar;
        String b2 = Tl.b(this.f5466a.a(), "referrer");
        if (b2 != null) {
            try {
                byte[] bytes = b2.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                dgVar = C0334dg.a(Base64.decode(bytes, 0));
            } catch (Throwable unused) {
            }
        }
        dgVar = null;
        return dgVar;
    }

    public final synchronized boolean h() {
        return this.f5466a.a().optBoolean("referrer_checked", false);
    }

    public final synchronized void a(String str) {
        C0301c8 c8Var = this.f5466a;
        JSONObject put = c8Var.a().put("device_id", str);
        Intrinsics.checkNotNullExpressionValue(put, "vitalDataProvider.getOrL…put(KEY_DEVICE_ID, value)");
        c8Var.a(put);
    }

    public final synchronized void b(String str) {
        C0301c8 c8Var = this.f5466a;
        JSONObject put = c8Var.a().put("device_id_hash", str);
        Intrinsics.checkNotNullExpressionValue(put, "vitalDataProvider.getOrL…EY_DEVICE_ID_HASH, value)");
        c8Var.a(put);
    }

    public final synchronized int c() {
        return this.f5466a.a().optInt("last_migration_api_level", -1);
    }

    public final synchronized void a(C0334dg dgVar) {
        String str;
        C0301c8 c8Var = this.f5466a;
        JSONObject a2 = c8Var.a();
        if (dgVar != null) {
            byte[] encode = Base64.encode(dgVar.a(), 0);
            Intrinsics.checkNotNullExpressionValue(encode, "Base64.encode(toProto(), 0)");
            str = new String(encode, Charsets.UTF_8);
        } else {
            str = null;
        }
        JSONObject put = a2.put("referrer", str);
        Intrinsics.checkNotNullExpressionValue(put, "vitalDataProvider.getOrL…value?.toEncodedString())");
        c8Var.a(put);
    }

    public final synchronized void b(long j) {
        C0301c8 c8Var = this.f5466a;
        JSONObject put = c8Var.a().put("location_id", j);
        Intrinsics.checkNotNullExpressionValue(put, "vitalDataProvider.getOrL…t(KEY_LOCATION_ID, value)");
        c8Var.a(put);
    }

    public final synchronized void a(boolean z) {
        C0301c8 c8Var = this.f5466a;
        JSONObject put = c8Var.a().put("referrer_checked", z);
        Intrinsics.checkNotNullExpressionValue(put, "vitalDataProvider.getOrL…_REFERRER_CHECKED, value)");
        c8Var.a(put);
    }

    public final synchronized void a(long j) {
        C0301c8 c8Var = this.f5466a;
        JSONObject put = c8Var.a().put("lbs_id", j);
        Intrinsics.checkNotNullExpressionValue(put, "vitalDataProvider.getOrL…().put(KEY_LBS_ID, value)");
        c8Var.a(put);
    }

    public final synchronized void a(int i) {
        C0301c8 c8Var = this.f5466a;
        JSONObject put = c8Var.a().put("last_migration_api_level", i);
        Intrinsics.checkNotNullExpressionValue(put, "vitalDataProvider.getOrL…GRATION_API_LEVEL, value)");
        c8Var.a(put);
    }

    public final synchronized void a(String str, String str2, String str3, Boolean bool, Long l, Long l2, Long l3, Integer num) {
        JSONObject put = new JSONObject().put("device_id", str).put("device_id_hash", str2).put("referrer", str3).put("referrer_checked", bool).put("location_id", l).put("lbs_id", l2).put("location_request_id", l3).put("last_migration_api_level", num);
        C0301c8 c8Var = this.f5466a;
        Intrinsics.checkNotNullExpressionValue(put, "json");
        c8Var.a(put);
    }
}
