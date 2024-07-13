package com.applovin.impl.mediation.debugger.c;

import android.text.TextUtils;
import com.applovin.impl.sdk.e.u;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.v;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class b extends com.applovin.impl.sdk.e.a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final a f14737a;

    public interface a {
        void a(String str);

        void b();
    }

    public b(n nVar, a aVar) {
        super("TaskFetchDeveloperUri", nVar);
        this.f14737a = aVar;
    }

    public void run() {
        String valueOf = String.valueOf(this.f15418b.Y().h().get("package_name"));
        c.a b2 = c.a(this.f15418b).b("GET");
        this.f15418b.V().a((com.applovin.impl.sdk.e.a) new u<String>(b2.a("https://play.google.com/store/apps/details?id=" + valueOf).a("").c(false).a(), this.f15418b) {
            public void a(int i, String str, String str2) {
                this.f15418b.D();
                if (v.a()) {
                    v D = this.f15418b.D();
                    D.e("TaskFetchDeveloperUri", "Unable to fetch developer url due to: " + str + ", and received error code: " + i);
                }
                b.this.f14737a.b();
            }

            public void a(String str, int i) {
                if (TextUtils.isEmpty(str)) {
                    b.this.f14737a.b();
                    return;
                }
                Matcher matcher = Pattern.compile("(?<=\"appstore:developer_url\" content=\").+?(?=\">)").matcher(str);
                if (matcher.find()) {
                    b.this.f14737a.a(matcher.group());
                    return;
                }
                b.this.f14737a.b();
            }
        });
    }
}
