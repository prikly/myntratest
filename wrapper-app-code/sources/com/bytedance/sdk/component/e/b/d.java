package com.bytedance.sdk.component.e.b;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.bytedance.sdk.component.b.a.b;
import com.bytedance.sdk.component.b.a.c;
import com.bytedance.sdk.component.b.a.e;
import com.bytedance.sdk.component.b.a.h;
import com.bytedance.sdk.component.b.a.i;
import com.bytedance.sdk.component.b.a.k;
import com.bytedance.sdk.component.b.a.l;
import com.bytedance.sdk.component.b.a.m;
import com.bytedance.sdk.component.e.a.a;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: PostExecutor */
public class d extends c {

    /* renamed from: a  reason: collision with root package name */
    l f19143a = null;

    public d(i iVar) {
        super(iVar);
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            str = JsonUtils.EMPTY_JSON;
        }
        this.f19143a = l.a(h.a("application/json; charset=utf-8"), str);
    }

    public void a(JSONObject jSONObject) {
        this.f19143a = l.a(h.a("application/json; charset=utf-8"), jSONObject != null ? jSONObject.toString() : JsonUtils.EMPTY_JSON);
    }

    public void a(final a aVar) {
        try {
            k.a aVar2 = new k.a();
            if (TextUtils.isEmpty(this.f19142f)) {
                aVar.a((c) this, new IOException("Url is Empty"));
                return;
            }
            aVar2.a(this.f19142f);
            if (this.f19143a != null) {
                a(aVar2);
                aVar2.a((Object) b());
                this.f19139c.a(aVar2.a(this.f19143a).b()).a(new c() {
                    public void a(b bVar, IOException iOException) {
                        a aVar = aVar;
                        if (aVar != null) {
                            aVar.a((c) d.this, iOException);
                        }
                    }

                    public void a(b bVar, m mVar) throws IOException {
                        if (aVar != null) {
                            HashMap hashMap = new HashMap();
                            if (mVar != null) {
                                e g2 = mVar.g();
                                if (g2 != null) {
                                    for (int i = 0; i < g2.a(); i++) {
                                        hashMap.put(g2.a(i), g2.b(i));
                                    }
                                }
                                aVar.a((c) d.this, new com.bytedance.sdk.component.e.b(mVar.d(), mVar.c(), mVar.e(), hashMap, mVar.f().b(), mVar.b(), mVar.a()));
                            }
                        }
                    }
                });
            } else if (aVar != null) {
                aVar.a((c) this, new IOException("RequestBody is null, content type is not support!!"));
            }
        } catch (Throwable th) {
            th.printStackTrace();
            aVar.a((c) this, new IOException(th.getMessage()));
        }
    }

    public com.bytedance.sdk.component.e.b a() {
        try {
            k.a aVar = new k.a();
            if (TextUtils.isEmpty(this.f19142f)) {
                com.bytedance.sdk.component.e.d.d.b("PostExecutor", "execute: Url is Empty");
                return null;
            }
            aVar.a(this.f19142f);
            if (this.f19143a == null) {
                com.bytedance.sdk.component.e.d.d.b("PostExecutor", "RequestBody is null, content type is not support!!");
                return null;
            }
            a(aVar);
            aVar.a((Object) b());
            m a2 = this.f19139c.a(aVar.a(this.f19143a).b()).a();
            if (a2 != null) {
                HashMap hashMap = new HashMap();
                e g2 = a2.g();
                if (g2 != null) {
                    for (int i = 0; i < g2.a(); i++) {
                        hashMap.put(g2.a(i), g2.b(i));
                    }
                    return new com.bytedance.sdk.component.e.b(a2.d(), a2.c(), a2.e(), hashMap, a2.f().b(), a2.b(), a2.a());
                }
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
