package com.bytedance.sdk.openadsdk.h.c;

import android.text.TextUtils;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.openadsdk.b.k;
import com.bytedance.sdk.openadsdk.core.i.e;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.l;
import com.bytedance.sdk.openadsdk.utils.t;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* compiled from: LogUploaderImpl */
public class c implements a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final b f1983a = b.a();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final List<a> f1984b = Collections.synchronizedList(new LinkedList());

    /* renamed from: c  reason: collision with root package name */
    private final ExecutorService f1985c = Executors.newSingleThreadExecutor();

    public void a() {
        this.f1985c.execute(new Runnable() {
            public void run() {
                List<a> d2 = c.this.f1983a.d();
                if (d2 != null) {
                    c.this.f1984b.addAll(d2);
                }
                c.this.f1983a.c();
            }
        });
    }

    public void a(com.bytedance.sdk.openadsdk.h.a aVar) {
        a(aVar, false);
    }

    public void a(final com.bytedance.sdk.openadsdk.h.a aVar, final boolean z) {
        if (aVar != null && e.a()) {
            t.b(new g("uploadLogEvent") {
                public void run() {
                    try {
                        a aVar = new a(l.a(), aVar.a().a());
                        if (z) {
                            m.e().a(aVar);
                        } else {
                            m.d().a(aVar);
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    public void b() {
        ExecutorService executorService = this.f1985c;
        if (executorService != null) {
            executorService.shutdownNow();
        }
    }

    /* compiled from: LogUploaderImpl */
    public static class a implements k {

        /* renamed from: a  reason: collision with root package name */
        public final String f1990a;

        /* renamed from: b  reason: collision with root package name */
        public final JSONObject f1991b;

        public boolean e() {
            return false;
        }

        public a(String str, JSONObject jSONObject) {
            this.f1990a = str;
            this.f1991b = jSONObject;
        }

        public static a a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("localId", (String) null);
                JSONObject optJSONObject = jSONObject.optJSONObject("event");
                if (!TextUtils.isEmpty(optString) && optJSONObject != null) {
                    return new a(optString, optJSONObject);
                }
            } catch (Throwable unused) {
            }
            return null;
        }

        public String a() {
            if (TextUtils.isEmpty(this.f1990a) || this.f1991b == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("localId", this.f1990a);
                jSONObject.put("event", this.f1991b);
            } catch (Throwable unused) {
            }
            return jSONObject.toString();
        }

        public String d() {
            return this.f1990a;
        }
    }

    public static a c() {
        return e.c();
    }
}
