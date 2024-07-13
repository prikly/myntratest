package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Pair;
import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.coreutils.collection.CollectionUtils;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.impl.ob.C0855z;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.c0  reason: case insensitive filesystem */
public class C0293c0 implements Parcelable {
    public static final Parcelable.Creator<C0293c0> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    String f5574a;

    /* renamed from: b  reason: collision with root package name */
    String f5575b;

    /* renamed from: c  reason: collision with root package name */
    private String f5576c;

    /* renamed from: d  reason: collision with root package name */
    private String f5577d;

    /* renamed from: e  reason: collision with root package name */
    int f5578e;

    /* renamed from: f  reason: collision with root package name */
    int f5579f;

    /* renamed from: g  reason: collision with root package name */
    private Pair<String, String> f5580g;

    /* renamed from: h  reason: collision with root package name */
    int f5581h;
    private String i;
    private long j;
    private long k;
    private D0 l;
    private C0832y0 m;
    private Bundle n;
    private Boolean o;
    private Integer p;
    private Map<String, byte[]> q;

    /* renamed from: com.yandex.metrica.impl.ob.c0$a */
    class a implements Parcelable.Creator<C0293c0> {
        a() {
        }

        public Object createFromParcel(Parcel parcel) {
            Bundle readBundle = parcel.readBundle(C0368f0.class.getClassLoader());
            Integer num = null;
            C0832y0 a2 = readBundle.containsKey("CounterReport.Source") ? C0832y0.a(readBundle.getInt("CounterReport.Source")) : null;
            C0293c0 c0Var = new C0293c0();
            c0Var.f5578e = readBundle.getInt("CounterReport.Type", C0244a1.EVENT_TYPE_UNDEFINED.b());
            c0Var.f5579f = readBundle.getInt("CounterReport.CustomType");
            String string = readBundle.getString("CounterReport.Value");
            if (string == null) {
                string = "";
            }
            c0Var.f5575b = string;
            C0293c0 a3 = C0293c0.a(c0Var.e(readBundle.getString("CounterReport.UserInfo")).c(readBundle.getString("CounterReport.Environment")).b(readBundle.getString("CounterReport.Event")), (!readBundle.containsKey("CounterReport.AppEnvironmentDiffKey") || !readBundle.containsKey("CounterReport.AppEnvironmentDiffValue")) ? null : new Pair(readBundle.getString("CounterReport.AppEnvironmentDiffKey"), readBundle.getString("CounterReport.AppEnvironmentDiffValue")));
            a3.f5581h = readBundle.getInt("CounterReport.TRUNCATED");
            C0293c0 a4 = a3.d(readBundle.getString("CounterReport.ProfileID")).a(readBundle.getLong("CounterReport.CreationElapsedRealtime")).b(readBundle.getLong("CounterReport.CreationTimestamp")).a(D0.a(Integer.valueOf(readBundle.getInt("CounterReport.UniquenessStatus")))).a(a2).c(readBundle.getBundle("CounterReport.Payload")).a(readBundle.containsKey("CounterReport.AttributionIdChanged") ? Boolean.valueOf(readBundle.getBoolean("CounterReport.AttributionIdChanged")) : null);
            if (readBundle.containsKey("CounterReport.OpenId")) {
                num = Integer.valueOf(readBundle.getInt("CounterReport.OpenId"));
            }
            return a4.a(num).a(CollectionUtils.bundleToMap(readBundle.getBundle("CounterReport.Extras")));
        }

        public Object[] newArray(int i) {
            return new C0293c0[i];
        }
    }

    public C0293c0() {
        this("", 0);
    }

    public C0293c0 a(byte[] bArr) {
        this.f5575b = new String(Base64.encode(bArr, 0));
        return this;
    }

    public C0293c0 b(String str) {
        this.f5574a = str;
        return this;
    }

    public C0293c0 c(String str) {
        this.f5577d = str;
        return this;
    }

    public int d() {
        return this.f5581h;
    }

    public int describeContents() {
        return 0;
    }

    public C0293c0 e(String str) {
        this.f5576c = str;
        return this;
    }

    public C0293c0 f(String str) {
        this.f5575b = str;
        return this;
    }

    public String g() {
        return this.f5574a;
    }

    public String h() {
        return this.f5577d;
    }

    public Map<String, byte[]> i() {
        return this.q;
    }

    public D0 j() {
        return this.l;
    }

    public Integer k() {
        return this.p;
    }

    public Bundle l() {
        return this.n;
    }

    public String m() {
        return this.i;
    }

    public C0832y0 n() {
        return this.m;
    }

    public int o() {
        return this.f5578e;
    }

    public String p() {
        return this.f5576c;
    }

    public String q() {
        return this.f5575b;
    }

    public byte[] r() {
        return Base64.decode(this.f5575b, 0);
    }

    public String toString() {
        return String.format(Locale.US, "[event: %s, type: %s, value: %s]", new Object[]{this.f5574a, C0244a1.a(this.f5578e).a(), A2.a(this.f5575b, 500)});
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Bundle bundle = new Bundle();
        bundle.putString("CounterReport.Event", this.f5574a);
        bundle.putString("CounterReport.Value", this.f5575b);
        bundle.putInt("CounterReport.Type", this.f5578e);
        bundle.putInt("CounterReport.CustomType", this.f5579f);
        bundle.putInt("CounterReport.TRUNCATED", this.f5581h);
        bundle.putString("CounterReport.ProfileID", this.i);
        bundle.putInt("CounterReport.UniquenessStatus", this.l.f3843a);
        Bundle bundle2 = this.n;
        if (bundle2 != null) {
            bundle.putParcelable("CounterReport.Payload", bundle2);
        }
        String str = this.f5577d;
        if (str != null) {
            bundle.putString("CounterReport.Environment", str);
        }
        String str2 = this.f5576c;
        if (str2 != null) {
            bundle.putString("CounterReport.UserInfo", str2);
        }
        Pair<String, String> pair = this.f5580g;
        if (pair != null) {
            bundle.putString("CounterReport.AppEnvironmentDiffKey", (String) pair.first);
            bundle.putString("CounterReport.AppEnvironmentDiffValue", (String) pair.second);
        }
        bundle.putLong("CounterReport.CreationElapsedRealtime", this.j);
        bundle.putLong("CounterReport.CreationTimestamp", this.k);
        C0832y0 y0Var = this.m;
        if (y0Var != null) {
            bundle.putInt("CounterReport.Source", y0Var.f7134a);
        }
        Boolean bool = this.o;
        if (bool != null) {
            bundle.putBoolean("CounterReport.AttributionIdChanged", bool.booleanValue());
        }
        Integer num = this.p;
        if (num != null) {
            bundle.putInt("CounterReport.OpenId", num.intValue());
        }
        bundle.putBundle("CounterReport.Extras", CollectionUtils.mapToBundle(this.q));
        parcel.writeBundle(bundle);
    }

    public C0293c0(String str, int i2) {
        this("", str, i2);
    }

    public C0293c0 a(int i2) {
        this.f5578e = i2;
        return this;
    }

    public Pair<String, String> b() {
        return this.f5580g;
    }

    /* access modifiers changed from: protected */
    public C0293c0 c(Bundle bundle) {
        this.n = bundle;
        return this;
    }

    public C0293c0 d(String str) {
        this.i = str;
        return this;
    }

    public long e() {
        return this.j;
    }

    public long f() {
        return this.k;
    }

    public C0293c0(String str, String str2, int i2) {
        this(str, str2, i2, new SystemTimeProvider());
    }

    private static C0293c0 d(C0293c0 c0Var) {
        C0293c0 c0Var2 = new C0293c0();
        c0Var2.k = c0Var.k;
        c0Var2.j = c0Var.j;
        c0Var2.f5576c = c0Var.f5576c;
        c0Var2.f5580g = c0Var.f5580g;
        c0Var2.f5577d = c0Var.f5577d;
        c0Var2.n = c0Var.n;
        c0Var2.q = c0Var.q;
        c0Var2.i = c0Var.i;
        return c0Var2;
    }

    public static C0293c0 e(C0293c0 c0Var) {
        return a(c0Var, C0244a1.EVENT_TYPE_APP_UPDATE);
    }

    /* access modifiers changed from: package-private */
    public C0293c0 a(String str, String str2) {
        if (this.f5580g == null) {
            this.f5580g = new Pair<>(str, str2);
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public C0293c0 b(long j2) {
        this.k = j2;
        return this;
    }

    public Boolean c() {
        return this.o;
    }

    public C0293c0(String str, String str2, int i2, SystemTimeProvider systemTimeProvider) {
        this.l = D0.UNKNOWN;
        this.q = new HashMap();
        this.f5574a = str2;
        this.f5578e = i2;
        this.f5575b = str;
        this.j = systemTimeProvider.elapsedRealtime();
        this.k = systemTimeProvider.currentTimeMillis();
    }

    public static C0293c0 c(C0293c0 c0Var) {
        return a(c0Var, C0244a1.EVENT_TYPE_INIT);
    }

    /* access modifiers changed from: package-private */
    public Bundle b(Bundle bundle) {
        bundle.putParcelable("CounterReport.Object", this);
        return bundle;
    }

    static C0293c0 a(C0293c0 c0Var, Pair pair) {
        c0Var.f5580g = pair;
        return c0Var;
    }

    public static C0293c0 b(C0293c0 c0Var) {
        return a(c0Var, C0244a1.EVENT_TYPE_FIRST_ACTIVATION);
    }

    /* access modifiers changed from: protected */
    public C0293c0 a(long j2) {
        this.j = j2;
        return this;
    }

    public C0293c0 a(D0 d0) {
        this.l = d0;
        return this;
    }

    public C0293c0 a(C0832y0 y0Var) {
        this.m = y0Var;
        return this;
    }

    public C0293c0 a(Boolean bool) {
        this.o = bool;
        return this;
    }

    public C0293c0 a(Integer num) {
        this.p = num;
        return this;
    }

    public C0293c0 a(Map<String, byte[]> map) {
        this.q = map;
        return this;
    }

    public static C0293c0 a(Bundle bundle) {
        if (bundle != null) {
            try {
                C0293c0 c0Var = (C0293c0) bundle.getParcelable("CounterReport.Object");
                if (c0Var != null) {
                    return c0Var;
                }
            } catch (Throwable unused) {
                return new C0293c0();
            }
        }
        return new C0293c0();
    }

    private static C0293c0 a(C0293c0 c0Var, C0244a1 a1Var) {
        C0293c0 d2 = d(c0Var);
        d2.f5578e = a1Var.b();
        return d2;
    }

    public static C0293c0 a(C0293c0 c0Var) {
        return a(c0Var, C0244a1.EVENT_TYPE_ALIVE);
    }

    public static C0293c0 a(C0293c0 c0Var, A0 a0) {
        C0293c0 a2 = a(c0Var, C0244a1.EVENT_TYPE_START);
        String a3 = a0.a();
        C0582nf nfVar = new C0582nf();
        if (a3 != null) {
            nfVar.f6317a = a3.getBytes();
        }
        a2.a(MessageNano.toByteArray(nfVar));
        a2.k = c0Var.k;
        a2.j = c0Var.j;
        return a2;
    }

    public static C0293c0 a(C0293c0 c0Var, L3 l3) {
        Context g2 = l3.g();
        Y0 c2 = new Y0(g2, new C0641q0(g2)).c();
        try {
            c2.b();
        } catch (Throwable unused) {
        }
        C0293c0 d2 = d(c0Var);
        d2.f5578e = C0244a1.EVENT_TYPE_IDENTITY.b();
        d2.f5575b = c2.a();
        return d2;
    }

    public static C0293c0 a(C0293c0 c0Var, Collection<Bd> collection, C0855z zVar, C0759v vVar, List<String> list) {
        String str;
        String str2;
        C0293c0 d2 = d(c0Var);
        try {
            JSONArray jSONArray = new JSONArray();
            for (Bd next : collection) {
                jSONArray.put(new JSONObject().put("name", next.f3764a).put("granted", next.f3765b));
            }
            JSONObject jSONObject = new JSONObject();
            if (zVar != null) {
                jSONObject.put("background_restricted", zVar.f7190b);
                C0855z.a aVar = zVar.f7189a;
                vVar.getClass();
                if (aVar != null) {
                    int ordinal = aVar.ordinal();
                    if (ordinal == 0) {
                        str2 = "ACTIVE";
                    } else if (ordinal == 1) {
                        str2 = "WORKING_SET";
                    } else if (ordinal == 2) {
                        str2 = "FREQUENT";
                    } else if (ordinal == 3) {
                        str2 = "RARE";
                    } else if (ordinal == 4) {
                        str2 = "RESTRICTED";
                    }
                    jSONObject.put("app_standby_bucket", str2);
                }
                str2 = null;
                jSONObject.put("app_standby_bucket", str2);
            }
            str = new JSONObject().put("permissions", jSONArray).put("background_restrictions", jSONObject).put("available_providers", new JSONArray(list)).toString();
        } catch (Throwable unused) {
            str = "";
        }
        d2.f5578e = C0244a1.EVENT_TYPE_PERMISSIONS.b();
        d2.f5575b = str;
        return d2;
    }

    public static C0293c0 a(C0293c0 c0Var, String str) {
        C0293c0 d2 = d(c0Var);
        d2.f5578e = C0244a1.EVENT_TYPE_APP_FEATURES.b();
        d2.f5575b = str;
        return d2;
    }

    public static C0293c0 a() {
        C0293c0 c0Var = new C0293c0();
        c0Var.f5578e = C0244a1.EVENT_TYPE_SEND_REVENUE_EVENT.b();
        return c0Var;
    }

    public static C0293c0 a(String str) {
        C0293c0 c0Var = new C0293c0();
        c0Var.f5578e = C0244a1.EVENT_TYPE_WEBVIEW_SYNC.b();
        c0Var.f5575b = str;
        c0Var.m = C0832y0.JS;
        return c0Var;
    }
}
