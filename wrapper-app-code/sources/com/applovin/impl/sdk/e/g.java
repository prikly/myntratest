package com.applovin.impl.sdk.e;

import android.text.TextUtils;
import com.applovin.impl.adview.d;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.network.i;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinPostbackListener;
import org.json.JSONException;
import org.json.JSONObject;

public class g extends a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final i f15440a;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final AppLovinPostbackListener f15441e;

    /* renamed from: f  reason: collision with root package name */
    private final o.a f15442f;

    public g(i iVar, o.a aVar, n nVar, AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", nVar);
        if (iVar != null) {
            this.f15440a = iVar;
            this.f15441e = appLovinPostbackListener;
            this.f15442f = aVar;
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }

    /* access modifiers changed from: private */
    public void a() {
        AnonymousClass2 r0 = new u<Object>(this.f15440a, d()) {

            /* renamed from: a  reason: collision with root package name */
            final String f15444a = g.this.f15440a.a();

            public void a(int i, String str, Object obj) {
                v vVar = this.f15420d;
                if (v.a()) {
                    v vVar2 = this.f15420d;
                    String str2 = this.f15419c;
                    vVar2.e(str2, "Failed to dispatch postback. Error code: " + i + " URL: " + this.f15444a);
                }
                if (g.this.f15441e != null) {
                    g.this.f15441e.onPostbackFailure(this.f15444a, i);
                }
                if (g.this.f15440a.p()) {
                    this.f15418b.aj().a(g.this.f15440a.q(), this.f15444a, i, obj, str, false);
                }
            }

            public void a(Object obj, int i) {
                if (obj instanceof String) {
                    for (String next : this.f15418b.b(b.aX)) {
                        if (next.startsWith(next)) {
                            String str = (String) obj;
                            if (!TextUtils.isEmpty(str)) {
                                try {
                                    JSONObject jSONObject = new JSONObject(str);
                                    com.applovin.impl.sdk.utils.i.d(jSONObject, this.f15418b);
                                    com.applovin.impl.sdk.utils.i.c(jSONObject, this.f15418b);
                                    com.applovin.impl.sdk.utils.i.e(jSONObject, this.f15418b);
                                    break;
                                } catch (JSONException unused) {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                if (g.this.f15441e != null) {
                    g.this.f15441e.onPostbackSuccess(this.f15444a);
                }
                if (g.this.f15440a.p()) {
                    this.f15418b.aj().a(g.this.f15440a.q(), this.f15444a, i, obj, (String) null, true);
                }
            }
        };
        r0.a(this.f15442f);
        d().V().a((a) r0);
    }

    public void run() {
        if (!StringUtils.isValidString(this.f15440a.a())) {
            v vVar = this.f15420d;
            if (v.a()) {
                this.f15420d.c(this.f15419c, "Requested URL is not valid; nothing to do...");
            }
            AppLovinPostbackListener appLovinPostbackListener = this.f15441e;
            if (appLovinPostbackListener != null) {
                appLovinPostbackListener.onPostbackFailure(this.f15440a.a(), AppLovinErrorCodes.INVALID_URL);
            }
        } else if (this.f15440a.r()) {
            d.a(this.f15440a, d(), new AppLovinPostbackListener() {
                public void onPostbackFailure(String str, int i) {
                    g.this.a();
                }

                public void onPostbackSuccess(String str) {
                    if (g.this.f15441e != null) {
                        g.this.f15441e.onPostbackSuccess(g.this.f15440a.a());
                    }
                }
            });
        } else {
            a();
        }
    }
}
