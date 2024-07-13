package com.yandex.metrica.impl.ob;

import android.net.Uri;
import android.text.TextUtils;
import com.appodeal.ads.modules.common.internal.Constants;
import com.onesignal.outcomes.OSOutcomeConstants;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import com.yandex.metrica.impl.ob.C0763v3;
import com.yandex.metrica.networktasks.api.IParamsAppender;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Rg implements IParamsAppender<Mg> {

    /* renamed from: a  reason: collision with root package name */
    private final Kg f4891a;

    /* renamed from: b  reason: collision with root package name */
    private final C0505kd f4892b;

    public Rg(Kg kg, C0505kd kdVar) {
        this.f4891a = kg;
        this.f4892b = kdVar;
    }

    private void a(Uri.Builder builder, C0747ub ubVar, String str) {
        if (!ubVar.a()) {
            builder.appendQueryParameter(this.f4891a.a(str), "");
        } else {
            builder.appendQueryParameter(this.f4891a.a(str), ubVar.f6881a.f6825b);
        }
    }

    public void appendParams(Uri.Builder builder, Object obj) {
        C0334dg a2;
        Uri.Builder builder2 = builder;
        Mg mg = (Mg) obj;
        builder2.path("analytics/startup");
        builder2.appendQueryParameter(this.f4891a.a("deviceid"), mg.g());
        C0690s2 u = F0.g().u();
        C0867zb a3 = mg.a();
        if (u.c()) {
            builder2.appendQueryParameter(this.f4891a.a("adv_id"), "");
            builder2.appendQueryParameter(this.f4891a.a("oaid"), "");
            builder2.appendQueryParameter(this.f4891a.a("yandex_adv_id"), "");
        } else {
            a(builder2, a3.a(), "adv_id");
            a(builder2, a3.b(), "oaid");
            a(builder2, a3.c(), "yandex_adv_id");
        }
        builder2.appendQueryParameter(this.f4891a.a("app_set_id"), mg.d());
        builder2.appendQueryParameter(this.f4891a.a("app_set_id_scope"), mg.e());
        builder2.appendQueryParameter(this.f4891a.a("app_platform"), MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        builder2.appendQueryParameter(this.f4891a.a("protocol_version"), "2");
        builder2.appendQueryParameter(this.f4891a.a("analytics_sdk_version_name"), "5.3.0");
        builder2.appendQueryParameter(this.f4891a.a("model"), mg.m());
        builder2.appendQueryParameter(this.f4891a.a("manufacturer"), mg.l());
        builder2.appendQueryParameter(this.f4891a.a("os_version"), mg.o());
        builder2.appendQueryParameter(this.f4891a.a("screen_width"), String.valueOf(mg.u()));
        builder2.appendQueryParameter(this.f4891a.a("screen_height"), String.valueOf(mg.t()));
        builder2.appendQueryParameter(this.f4891a.a("screen_dpi"), String.valueOf(mg.s()));
        builder2.appendQueryParameter(this.f4891a.a("scalefactor"), String.valueOf(mg.r()));
        builder2.appendQueryParameter(this.f4891a.a("locale"), mg.k());
        builder2.appendQueryParameter(this.f4891a.a(OSOutcomeConstants.DEVICE_TYPE), mg.i());
        builder2.appendQueryParameter(this.f4891a.a("queries"), String.valueOf(1));
        builder2.appendQueryParameter(this.f4891a.a("query_hosts"), String.valueOf(2));
        String a4 = this.f4891a.a("features");
        List<String> b2 = this.f4892b.b();
        String str = "";
        String str2 = "egress";
        String str3 = "easy_collecting";
        String str4 = "permissions_collecting";
        String str5 = "throttling";
        String[] strArr = {this.f4891a.a("easy_collecting"), this.f4891a.a("egress"), this.f4891a.a("package_info"), this.f4891a.a("socket"), this.f4891a.a("permissions_collecting"), this.f4891a.a("features_collecting"), this.f4891a.a("location_collecting"), this.f4891a.a("lbs_collecting"), this.f4891a.a("google_aid"), this.f4891a.a("huawei_oaid"), this.f4891a.a("throttling"), this.f4891a.a("wifi_around"), this.f4891a.a("wifi_connected"), this.f4891a.a("cells_around"), this.f4891a.a("sim_info"), this.f4891a.a("sdk_list"), this.f4891a.a("identity_light_collecting"), this.f4891a.a("gpl_collecting"), this.f4891a.a("ui_parsing"), this.f4891a.a("ui_collecting_for_bridge"), this.f4891a.a("ui_event_sending"), this.f4891a.a("ui_raw_event_sending"), this.f4891a.a("cell_additional_info"), this.f4891a.a("cell_additional_info_connected_only"), this.f4891a.a("ssl_pinning")};
        ArrayList arrayList = new ArrayList(b2);
        arrayList.addAll(Arrays.asList(strArr));
        builder2.appendQueryParameter(a4, TextUtils.join(",", (String[]) arrayList.toArray(new String[0])));
        builder2.appendQueryParameter(this.f4891a.a("socket"), String.valueOf(1));
        builder2.appendQueryParameter(this.f4891a.a(OSOutcomeConstants.APP_ID), mg.p());
        builder2.appendQueryParameter(this.f4891a.a("location_collecting"), String.valueOf(1));
        builder2.appendQueryParameter(this.f4891a.a("app_debuggable"), mg.z());
        builder2.appendQueryParameter(this.f4891a.a("sdk_list"), String.valueOf(1));
        if (mg.L()) {
            String D = mg.D();
            if (!TextUtils.isEmpty(D)) {
                builder2.appendQueryParameter(this.f4891a.a("country_init"), D);
            }
        } else {
            builder2.appendQueryParameter(this.f4891a.a("detect_locale"), String.valueOf(1));
        }
        C0763v3.a B = mg.B();
        if (!A2.b((Map) B.b())) {
            builder2.appendQueryParameter(this.f4891a.a("distribution_customization"), String.valueOf(1));
            builder2.appendQueryParameter(this.f4891a.a("clids_set"), Tl.c(B.b()));
            int ordinal = B.a().ordinal();
            builder2.appendQueryParameter(this.f4891a.a("clids_set_source"), ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? str : "retail" : "satellite" : "api");
            String E = mg.E();
            String F = mg.F();
            if (TextUtils.isEmpty(E) && (a2 = mg.H().a()) != null) {
                E = a2.f5664a;
                F = a2.f5667d.f5672a;
            }
            if (!TextUtils.isEmpty(E)) {
                builder2.appendQueryParameter(this.f4891a.a("install_referrer"), E);
                if (F == null) {
                    F = "null";
                }
                builder2.appendQueryParameter(this.f4891a.a("install_referrer_source"), F);
            }
        }
        String w = mg.w();
        if (!TextUtils.isEmpty(w)) {
            builder2.appendQueryParameter(this.f4891a.a(Constants.UUID), w);
        }
        builder2.appendQueryParameter(this.f4891a.a("time"), String.valueOf(1));
        builder2.appendQueryParameter(this.f4891a.a("requests"), String.valueOf(1));
        builder2.appendQueryParameter(this.f4891a.a("stat_sending"), String.valueOf(1));
        builder2.appendQueryParameter(this.f4891a.a("permissions"), String.valueOf(1));
        builder2.appendQueryParameter(this.f4891a.a("identity_light_collecting"), String.valueOf(1));
        builder2.appendQueryParameter(this.f4891a.a("ui_parsing"), String.valueOf(1));
        builder2.appendQueryParameter(this.f4891a.a("ui_collecting_for_bridge"), String.valueOf(1));
        builder2.appendQueryParameter(this.f4891a.a("ui_event_sending"), String.valueOf(1));
        builder2.appendQueryParameter(this.f4891a.a("ui_raw_event_sending"), String.valueOf(1));
        builder2.appendQueryParameter(this.f4891a.a("retry_policy"), String.valueOf(1));
        builder2.appendQueryParameter(this.f4891a.a(str5), String.valueOf(1));
        builder2.appendQueryParameter(this.f4891a.a("cache_control"), String.valueOf(1));
        builder2.appendQueryParameter(this.f4891a.a("mediascope_api_keys"), String.valueOf(1));
        builder2.appendQueryParameter(this.f4891a.a("diagnostics"), String.valueOf(1));
        builder2.appendQueryParameter(this.f4891a.a(str4), String.valueOf(1));
        builder2.appendQueryParameter(this.f4891a.a("app_system_flag"), mg.A());
        builder2.appendQueryParameter(this.f4891a.a("auto_inapp_collecting"), String.valueOf(1));
        builder2.appendQueryParameter(this.f4891a.a("attribution"), String.valueOf(1));
        builder2.appendQueryParameter(this.f4891a.a(str3), String.valueOf(1));
        builder2.appendQueryParameter(this.f4891a.a(str2), String.valueOf(1));
        builder2.appendQueryParameter(this.f4891a.a("startup_update"), String.valueOf(1));
        Map<String, Integer> a5 = this.f4892b.a();
        for (String next : a5.keySet()) {
            builder2.appendQueryParameter(next, String.valueOf(a5.get(next)));
        }
    }
}
