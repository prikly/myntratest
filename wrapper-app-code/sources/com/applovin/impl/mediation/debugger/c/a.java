package com.applovin.impl.mediation.debugger.c;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.e.u;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.v;

public class a extends com.applovin.impl.sdk.e.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f14734a;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C0147a f14735e;

    /* renamed from: com.applovin.impl.mediation.debugger.c.a$a  reason: collision with other inner class name */
    public interface C0147a {
        void b(String str);

        void c();
    }

    public a(n nVar, String str, C0147a aVar) {
        super("TaskFetchAppAdsContent", nVar);
        this.f14734a = str;
        this.f14735e = aVar;
    }

    public void run() {
        this.f15418b.V().a((com.applovin.impl.sdk.e.a) new u<String>(c.a(this.f15418b).b("GET").a(Uri.parse(this.f14734a).buildUpon().scheme("https").appendPath("app-ads.txt").build().toString()).c(Uri.parse(this.f14734a).buildUpon().scheme("http").appendPath("app-ads.txt").build().toString()).a("").c(false).a(), this.f15418b) {
            public void a(int i, String str, String str2) {
                this.f15418b.D();
                if (v.a()) {
                    v D = this.f15418b.D();
                    D.e("TaskFetchAppAdsContent", "Unable to fetch app-ads.txt due to: " + str + ", and received error code: " + i);
                }
                a.this.f14735e.c();
            }

            public void a(String str, int i) {
                if (TextUtils.isEmpty(str)) {
                    a.this.f14735e.c();
                } else {
                    a.this.f14735e.b(str);
                }
            }
        });
    }
}
