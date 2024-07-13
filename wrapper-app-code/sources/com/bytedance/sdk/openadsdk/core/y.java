package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.b;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.o;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity;
import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.b.p;
import com.bytedance.sdk.openadsdk.core.e.h;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.multipro.b.a;
import com.bytedance.sdk.openadsdk.utils.u;
import com.com.bytedance.overseas.sdk.a.c;
import java.util.Map;

/* compiled from: WebHelper */
public class y {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f1854a = false;

    public static void a(boolean z) {
        f1854a = z;
    }

    public static boolean a(Context context, n nVar, int i, TTNativeAd tTNativeAd, TTNativeExpressAd tTNativeExpressAd, String str, c cVar, boolean z) {
        String str2;
        String str3;
        Context context2 = context;
        n nVar2 = nVar;
        String str4 = str;
        if (context2 == null || nVar2 == null || i == -1) {
            return false;
        }
        h ab = nVar.ab();
        if (ab != null) {
            String a2 = ab.a();
            if (!TextUtils.isEmpty(a2)) {
                Uri parse = Uri.parse(ab.a());
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(parse);
                if (!u.l(context)) {
                    try {
                        if (m.h().c()) {
                            u.b(nVar, str4);
                        }
                        if (!(context2 instanceof Activity)) {
                            intent.addFlags(268435456);
                        }
                        e.d(context, nVar, str4, "open_url_app", (Map<String, Object>) null);
                        context.startActivity(intent);
                        p.a().a(nVar, str4);
                        return true;
                    } catch (Throwable unused) {
                        a2 = nVar.O();
                    }
                } else if (u.a(context, intent)) {
                    if (m.h().c()) {
                        u.b(nVar, str4);
                    }
                    if (!(context2 instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    final Context context3 = context;
                    final n nVar3 = nVar;
                    final int i2 = i;
                    final String str5 = str;
                    final boolean z2 = z;
                    b.a(context, intent, new b.a() {
                        public void a() {
                        }

                        public void a(Throwable th) {
                            if (!m.h().c()) {
                                y.a(context3, nVar3.O(), nVar3, i2, str5, z2);
                                l.c("WebHelper", "openDetailPage() -> context.startActivity(intent) fail :", th);
                            }
                        }
                    });
                    e.d(context, nVar, str4, "open_url_app", (Map<String, Object>) null);
                    p.a().a(nVar, str4);
                    return true;
                }
            }
            if (ab.c() != 2 || nVar.ad() == 5 || nVar.ad() == 15) {
                if (ab.c() == 1) {
                    a2 = ab.b();
                } else {
                    a2 = nVar.O();
                }
            } else if (cVar != null) {
                if (cVar.a()) {
                    e.d(context, nVar, str4, "open_fallback_url", (Map<String, Object>) null);
                    return true;
                } else if (cVar.e()) {
                    e.d(context, nVar, str4, "open_fallback_url", (Map<String, Object>) null);
                    return true;
                } else {
                    e.d(context, nVar, str4, "open_fallback_url", (Map<String, Object>) null);
                    return false;
                }
            }
            e.d(context, nVar, str4, "open_fallback_url", (Map<String, Object>) null);
            str2 = a2;
        } else {
            if (!nVar.aw() || nVar.ax() == null) {
                str3 = nVar.O();
            } else {
                str3 = nVar.ax().i();
            }
            str2 = str3;
        }
        return a(context, nVar, i, tTNativeAd, tTNativeExpressAd, str, z, str2);
    }

    public static boolean a(Context context, n nVar, int i, TTNativeAd tTNativeAd, TTNativeExpressAd tTNativeExpressAd, String str, boolean z, String str2) {
        Context context2 = context;
        if (TextUtils.isEmpty(str2) && !com.bytedance.sdk.openadsdk.core.e.p.a(nVar)) {
            return false;
        }
        if (nVar.L() != 2) {
            b.a(context, a(context, str2, nVar, i, tTNativeAd, tTNativeExpressAd, str, z), (b.a) null);
            f1854a = false;
            return true;
        } else if (!o.a(str2)) {
            return false;
        } else {
            Intent intent = new Intent("android.intent.action.VIEW");
            try {
                intent.setData(Uri.parse(str2));
                if (!(context2 instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                b.a(context, intent, (b.a) null);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public static boolean a(Context context, String str, n nVar, int i, String str2, boolean z) {
        try {
            context.startActivity(a(context, str, nVar, i, (TTNativeAd) null, (TTNativeExpressAd) null, str2, z));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Intent a(Context context, String str, n nVar, int i, TTNativeAd tTNativeAd, TTNativeExpressAd tTNativeExpressAd, String str2, boolean z) {
        Intent intent;
        if (!com.bytedance.sdk.openadsdk.core.e.p.a(nVar) || (tTNativeAd == null && tTNativeExpressAd == null)) {
            intent = (nVar.L() != 3 || (nVar.f() != 2 && (nVar.f() != 1 || !f1854a)) || nVar.f1126a) ? new Intent(context, TTLandingPageActivity.class) : new Intent(context, TTVideoLandingPageLink2Activity.class);
        } else {
            intent = new Intent(context, TTPlayableLandingPageActivity.class);
            intent.putExtra("ad_pending_download", a(nVar, z));
            String c2 = com.bytedance.sdk.openadsdk.core.e.p.c(nVar);
            if (!TextUtils.isEmpty(c2)) {
                if (c2.contains("?")) {
                    str = c2 + "&orientation=portrait";
                } else {
                    str = c2 + "?orientation=portrait";
                }
            }
        }
        intent.putExtra("url", str);
        intent.putExtra("gecko_id", nVar.af());
        intent.putExtra("web_title", nVar.U());
        intent.putExtra("sdk_version", BuildConfig.VERSION_CODE);
        intent.putExtra("adid", nVar.Y());
        intent.putExtra("log_extra", nVar.ac());
        a aVar = null;
        intent.putExtra("icon_url", nVar.M() == null ? null : nVar.M().a());
        intent.putExtra("event_tag", str2);
        intent.putExtra("source", i);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, nVar.ar().toString());
        } else {
            t.a().h();
            t.a().a(nVar);
        }
        if (nVar.ad() == 5 || nVar.ad() == 15 || nVar.ad() == 50) {
            if (tTNativeAd != null) {
                if (tTNativeAd instanceof a.C0014a) {
                    aVar = ((a.C0014a) tTNativeAd).f();
                }
                if (aVar != null) {
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, aVar.a().toString());
                }
            }
            if (!(tTNativeExpressAd == null || (aVar = tTNativeExpressAd.getVideoModel()) == null)) {
                intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, aVar.a().toString());
            }
            if (aVar != null) {
                intent.putExtra("video_is_auto_play", aVar.f2162d);
                if (l.c()) {
                    l.c("videoDataModel", "videoDataModel=" + aVar.a().toString());
                }
            }
        }
        return intent;
    }

    private static boolean a(n nVar, boolean z) {
        if (z && nVar != null && nVar.L() == 4 && com.bytedance.sdk.openadsdk.core.e.p.a(nVar)) {
            return true;
        }
        return false;
    }
}
