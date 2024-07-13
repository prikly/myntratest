package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: com.yandex.metrica.impl.ob.d9  reason: case insensitive filesystem */
public abstract class C0327d9 {

    /* renamed from: a  reason: collision with root package name */
    private final S7 f5651a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5652b;

    public C0327d9(S7 s7) {
        this(s7, (String) null);
    }

    public long a(String str, long j) {
        return this.f5651a.a(str, j);
    }

    /* access modifiers changed from: protected */
    public <T extends C0327d9> T b(String str, String str2) {
        synchronized (this) {
            this.f5651a.a(str, str2);
        }
        return this;
    }

    public boolean c(String str) {
        return this.f5651a.a(str);
    }

    /* access modifiers changed from: protected */
    public Rd d(String str) {
        return new Rd(str, this.f5652b);
    }

    /* access modifiers changed from: package-private */
    public String e(String str) {
        return this.f5651a.b(str, (String) null);
    }

    public <T extends C0327d9> T f(String str) {
        synchronized (this) {
            this.f5651a.b(str);
        }
        return this;
    }

    public C0327d9(S7 s7, String str) {
        this.f5651a = s7;
        this.f5652b = str;
    }

    public int a(String str, int i) {
        return this.f5651a.a(str, i);
    }

    public Set<String> e() {
        return this.f5651a.a();
    }

    public String a(String str, String str2) {
        return this.f5651a.b(str, str2);
    }

    public boolean a(String str, boolean z) {
        return this.f5651a.b(str, z);
    }

    public void d() {
        synchronized (this) {
            this.f5651a.b();
        }
    }

    /* access modifiers changed from: package-private */
    public List<String> a(String str, List<String> list) {
        String[] strArr = list == null ? null : (String[]) list.toArray(new String[list.size()]);
        String b2 = this.f5651a.b(str, (String) null);
        if (!TextUtils.isEmpty(b2)) {
            try {
                JSONArray jSONArray = new JSONArray(b2);
                strArr = new String[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    strArr[i] = jSONArray.optString(i);
                }
            } catch (Throwable unused) {
            }
        }
        if (strArr == null) {
            return null;
        }
        return Arrays.asList(strArr);
    }

    public <T extends C0327d9> T b(String str, long j) {
        synchronized (this) {
            this.f5651a.b(str, j);
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public <T extends C0327d9> T b(String str, int i) {
        synchronized (this) {
            this.f5651a.b(str, i);
        }
        return this;
    }

    public <T extends C0327d9> T b(String str, boolean z) {
        synchronized (this) {
            this.f5651a.a(str, z);
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public <T extends C0327d9> T b(String str, List<String> list) {
        String str2;
        String[] strArr = (String[]) list.toArray(new String[list.size()]);
        try {
            JSONArray jSONArray = new JSONArray();
            for (String put : strArr) {
                jSONArray.put(put);
            }
            str2 = jSONArray.toString();
        } catch (Throwable unused) {
            str2 = null;
        }
        this.f5651a.a(str, str2);
        return this;
    }
}
