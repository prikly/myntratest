package com.applovin.impl.sdk.d;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f15397a = a("ad_req");

    /* renamed from: b  reason: collision with root package name */
    public static final f f15398b = a("ad_imp");

    /* renamed from: c  reason: collision with root package name */
    public static final f f15399c = a("max_ad_imp");

    /* renamed from: d  reason: collision with root package name */
    public static final f f15400d = a("ad_session_start");

    /* renamed from: e  reason: collision with root package name */
    public static final f f15401e = a("ad_imp_session");

    /* renamed from: f  reason: collision with root package name */
    public static final f f15402f = a("max_ad_imp_session");

    /* renamed from: g  reason: collision with root package name */
    public static final f f15403g = a("cached_files_expired");

    /* renamed from: h  reason: collision with root package name */
    public static final f f15404h = a("cache_drop_count");
    public static final f i = a("sdk_reset_state_count", true);
    public static final f j = a("ad_response_process_failures", true);
    public static final f k = a("response_process_failures", true);
    public static final f l = a("incent_failed_to_display_count", true);
    public static final f m = a("app_paused_and_resumed");
    public static final f n = a("ad_rendered_with_mismatched_sdk_key", true);
    public static final f o = a("ad_shown_outside_app_count");
    public static final f p = a("med_ad_req");
    public static final f q = a("med_ad_response_process_failures", true);
    public static final f r = a("med_waterfall_ad_no_fill", true);
    public static final f s = a("med_waterfall_ad_adapter_load_failed", true);
    public static final f t = a("med_waterfall_ad_invalid_response", true);
    private static final Set<String> u = new HashSet(32);
    private static final Set<f> w = new HashSet(16);
    private final String v;

    static {
        a("fullscreen_ad_nil_vc_count");
        a("applovin_bundle_missing");
    }

    private f(String str) {
        this.v = str;
    }

    private static f a(String str) {
        return a(str, false);
    }

    private static f a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No key name specified");
        } else if (!u.contains(str)) {
            u.add(str);
            f fVar = new f(str);
            if (z) {
                w.add(fVar);
            }
            return fVar;
        } else {
            throw new IllegalArgumentException("Key has already been used: " + str);
        }
    }

    public static Set<f> b() {
        return w;
    }

    public String a() {
        return this.v;
    }
}
