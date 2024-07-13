package com.bytedance.sdk.component.b.a.a.a;

import android.text.TextUtils;
import com.bytedance.sdk.component.b.a.e;
import com.bytedance.sdk.component.b.a.j;
import com.bytedance.sdk.component.b.a.k;
import com.bytedance.sdk.component.b.a.m;
import com.bytedance.sdk.component.b.a.n;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: NetResponse */
public class f extends m {

    /* renamed from: a  reason: collision with root package name */
    HttpURLConnection f18860a;

    /* renamed from: b  reason: collision with root package name */
    k f18861b;

    public long a() {
        return 0;
    }

    public long b() {
        return 0;
    }

    public String toString() {
        return "";
    }

    public f(HttpURLConnection httpURLConnection, k kVar) {
        this.f18860a = httpURLConnection;
        this.f18861b = kVar;
    }

    public int c() {
        try {
            return this.f18860a.getResponseCode();
        } catch (Exception unused) {
            return -1;
        }
    }

    public boolean d() {
        return c() >= 200 && c() < 300;
    }

    public String e() throws IOException {
        return this.f18860a.getResponseMessage();
    }

    public n f() {
        try {
            return new g(this.f18860a);
        } catch (Exception unused) {
            return null;
        }
    }

    public e g() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f18860a.getHeaderFields().entrySet()) {
            for (String str : (List) entry.getValue()) {
                if (!"Content-Range".equalsIgnoreCase((String) entry.getKey()) || c() != 206) {
                    arrayList.add(entry.getKey());
                    arrayList.add(str);
                }
            }
        }
        return new e((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public String a(String str) {
        return this.f18860a.getHeaderField(str);
    }

    public String a(String str, String str2) {
        return !TextUtils.isEmpty(a(str)) ? a(str) : str2;
    }

    public void close() {
        try {
            f().close();
        } catch (Exception unused) {
        }
    }

    public j h() {
        return j.HTTP_1_1;
    }
}
