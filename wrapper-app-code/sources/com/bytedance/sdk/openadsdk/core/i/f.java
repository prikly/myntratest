package com.bytedance.sdk.openadsdk.core.i;

import android.os.Build;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import com.bytedance.sdk.component.utils.i;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.o;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.core.h;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.multipro.b;
import com.bytedance.sdk.openadsdk.multipro.d.a;
import com.bytedance.sdk.openadsdk.utils.u;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.onesignal.outcomes.OSOutcomeConstants;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TTSdkSettings */
public class f implements b {

    /* renamed from: a  reason: collision with root package name */
    public static String f1252a = null;

    /* renamed from: b  reason: collision with root package name */
    public static String f1253b = "IABTCF_TCString";

    /* renamed from: c  reason: collision with root package name */
    public static String f1254c;

    /* renamed from: d  reason: collision with root package name */
    public static String f1255d;

    /* renamed from: e  reason: collision with root package name */
    public static String f1256e = (t.a(m.a(), "tt_feedback_thank_text") + "\n" + t.a(m.a(), "tt_feedback_experience_text"));

    /* renamed from: f  reason: collision with root package name */
    static ArrayList<String> f1257f;
    private static final String n = u.m();
    private static final String p = null;
    private static final String q = null;
    private static final String r = null;
    private int A = Integer.MAX_VALUE;
    private int B = Integer.MAX_VALUE;
    private long C = 0;
    private Set<String> D = Collections.synchronizedSet(new HashSet());
    private Set<String> E = Collections.synchronizedSet(new HashSet());
    private int F = Integer.MAX_VALUE;
    private int G = Integer.MAX_VALUE;
    private long H = 2147483647L;
    private int I = Integer.MAX_VALUE;
    private int J = Integer.MAX_VALUE;
    private int K = Integer.MAX_VALUE;
    private int L = Integer.MAX_VALUE;
    private String M;
    private String N;
    private String O;
    private int P = Integer.MAX_VALUE;
    private int Q;
    private String R;
    private int S = Integer.MAX_VALUE;
    private String T;
    private int U;
    private int V;
    private String W = null;
    private String X = null;
    private boolean Y = false;
    private String Z = "";
    private int aa = Integer.MAX_VALUE;
    private int ab = Integer.MAX_VALUE;
    private int ac = Integer.MAX_VALUE;
    private int ad = Integer.MAX_VALUE;
    private int ae = Integer.MAX_VALUE;
    private int af = Integer.MAX_VALUE;
    private int ag = Integer.MAX_VALUE;
    private int ah = Integer.MAX_VALUE;
    private final Set<String> ai = Collections.synchronizedSet(new HashSet());
    private volatile boolean aj = false;
    private final com.bytedance.sdk.component.utils.u ak = com.bytedance.sdk.component.utils.u.a("tt_sdk_settings", m.a());
    private int al = Integer.MAX_VALUE;
    private float am = 2.14748365E9f;
    private int an = Integer.MAX_VALUE;
    private int ao = Integer.MAX_VALUE;
    private int ap = 30;

    /* renamed from: g  reason: collision with root package name */
    private int f1258g = Integer.MAX_VALUE;

    /* renamed from: h  reason: collision with root package name */
    private Map<String, a> f1259h = new HashMap();
    private String i;
    private String j;
    private Set<String> k = new HashSet();
    private String l;
    private Set<String> m = Collections.synchronizedSet(new HashSet());
    private Set<String> o = Collections.synchronizedSet(new HashSet());
    private String s;
    private int t = Integer.MAX_VALUE;
    private int u = Integer.MAX_VALUE;
    private String v;
    private String w;
    private String x;
    private String y;
    private int z = Integer.MAX_VALUE;

    private int a(boolean z2) {
        return z2 ? 20 : 5;
    }

    private static boolean k(int i2) {
        return i2 == 1 || i2 == 2;
    }

    static {
        try {
            f1254c = t.a(m.a(), "tt_txt_skip");
            f1255d = t.a(m.a(), "tt_feedback_submit_text");
            f1257f = new ArrayList<>(Arrays.asList(new String[]{"ja", "en", "ko", "zh", "th", "vi", OSOutcomeConstants.OUTCOME_ID, "ru", "ar", "fr", "de", "it", "es", "hi", "pt", "zh-Hant"}));
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(15:53|54|(1:56)|57|(4:59|60|(2:62|63)|109)|68|(3:72|(2:75|73)|110)|76|(3:80|(2:83|81)|111)|84|(3:86|87|(2:89|(3:91|(2:93|112)(1:113)|94)))|95|96|97|98) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x0594 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a() {
        /*
            r16 = this;
            r1 = r16
            monitor-enter(r16)
            r2 = 1
            r1.aj = r2     // Catch:{ all -> 0x05b6 }
            boolean r3 = com.bytedance.sdk.openadsdk.multipro.b.c()     // Catch:{ all -> 0x05b6 }
            r10 = 3000(0xbb8, float:4.204E-42)
            r11 = 5
            r12 = 3600(0xe10, float:5.045E-42)
            r13 = 50
            r14 = 10000(0x2710, double:4.9407E-320)
            r5 = 30
            r4 = 0
            r6 = 2147483647(0x7fffffff, float:NaN)
            r7 = 0
            if (r3 == 0) goto L_0x02ec
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "xpath"
            java.lang.String r9 = ""
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.d.a.b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.s = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "duration"
            long r8 = com.bytedance.sdk.openadsdk.multipro.d.a.a((java.lang.String) r3, (java.lang.String) r8, (long) r14)     // Catch:{ all -> 0x05b6 }
            r1.H = r8     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "max"
            int r3 = com.bytedance.sdk.openadsdk.multipro.d.a.a((java.lang.String) r3, (java.lang.String) r8, (int) r13)     // Catch:{ all -> 0x05b6 }
            r1.I = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "download_config_dl_network"
            int r3 = com.bytedance.sdk.openadsdk.multipro.d.a.a((java.lang.String) r3, (java.lang.String) r8, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.t = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "download_config_dl_size"
            int r3 = com.bytedance.sdk.openadsdk.multipro.d.a.a((java.lang.String) r3, (java.lang.String) r8, (int) r5)     // Catch:{ all -> 0x05b6 }
            r1.u = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "vbtt"
            int r3 = com.bytedance.sdk.openadsdk.multipro.d.a.a((java.lang.String) r3, (java.lang.String) r8, (int) r11)     // Catch:{ all -> 0x05b6 }
            r1.J = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "fetch_template"
            int r3 = com.bytedance.sdk.openadsdk.multipro.d.a.a((java.lang.String) r3, (java.lang.String) r8, (int) r12)     // Catch:{ all -> 0x05b6 }
            r1.K = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "template_ids"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.d.a.b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.l = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "ab_test_version"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.d.a.b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.v = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "ab_test_param"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.d.a.b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.w = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "pyload_h5"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.d.a.b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.x = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "playableLoadH5Url"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.d.a.b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.y = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "splash_load_type"
            int r3 = com.bytedance.sdk.openadsdk.multipro.d.a.a((java.lang.String) r3, (java.lang.String) r8, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.z = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "splash_check_type"
            int r3 = com.bytedance.sdk.openadsdk.multipro.d.a.a((java.lang.String) r3, (java.lang.String) r8, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.A = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "if_both_open"
            int r3 = com.bytedance.sdk.openadsdk.multipro.d.a.a((java.lang.String) r3, (java.lang.String) r8, (int) r4)     // Catch:{ all -> 0x05b6 }
            r1.F = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "support_tnc"
            int r3 = com.bytedance.sdk.openadsdk.multipro.d.a.a((java.lang.String) r3, (java.lang.String) r8, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.G = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "force_language"
            java.lang.String r9 = ""
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.d.a.b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.Z = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "fetch_tpl_timeout_ctrl"
            int r3 = com.bytedance.sdk.openadsdk.multipro.d.a.a((java.lang.String) r3, (java.lang.String) r8, (int) r10)     // Catch:{ all -> 0x05b6 }
            r1.aa = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "disable_rotate_banner_on_dislike"
            int r3 = com.bytedance.sdk.openadsdk.multipro.d.a.a((java.lang.String) r3, (java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.an = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "max_tpl_cnts"
            r9 = 100
            int r3 = com.bytedance.sdk.openadsdk.multipro.d.a.a((java.lang.String) r3, (java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x05b6 }
            r1.ab = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "tpl_infos"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.d.a.b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.i = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "insert_js_config"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.d.a.b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.j = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "app_list_control"
            int r3 = com.bytedance.sdk.openadsdk.multipro.d.a.a((java.lang.String) r3, (java.lang.String) r8, (int) r4)     // Catch:{ all -> 0x05b6 }
            r1.B = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "hit_app_list_time"
            r9 = 0
            long r8 = com.bytedance.sdk.openadsdk.multipro.d.a.a((java.lang.String) r3, (java.lang.String) r8, (long) r9)     // Catch:{ all -> 0x05b6 }
            r1.C = r8     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "ads_url"
            java.lang.String r9 = q     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.d.a.b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.M = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "app_log_url"
            java.lang.String r9 = p     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.d.a.b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.N = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "apm_url"
            java.lang.String r9 = ""
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.d.a.b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.O = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "coppa"
            r9 = -99
            int r3 = com.bytedance.sdk.openadsdk.multipro.d.a.a((java.lang.String) r3, (java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x05b6 }
            r1.P = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "ccpa"
            r9 = -1
            int r3 = com.bytedance.sdk.openadsdk.multipro.d.a.a((java.lang.String) r3, (java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x05b6 }
            r1.Q = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.core.h r3 = com.bytedance.sdk.openadsdk.core.h.d()     // Catch:{ all -> 0x05b6 }
            int r8 = r1.P     // Catch:{ all -> 0x05b6 }
            r3.d((int) r8)     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "policy_url"
            java.lang.String r9 = r     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.d.a.b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.R = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "consent_url"
            java.lang.String r9 = "https://lf-hs-sg.ibytedtos.com/obj/union-platform-i18n/union_platform_gdpr_607_en.html"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.d.a.b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.T = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "ivrv_downward"
            int r3 = com.bytedance.sdk.openadsdk.multipro.d.a.a((java.lang.String) r3, (java.lang.String) r8, (int) r4)     // Catch:{ all -> 0x05b6 }
            r1.V = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "isGdprUser"
            r9 = -1
            int r3 = com.bytedance.sdk.openadsdk.multipro.d.a.a((java.lang.String) r3, (java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x05b6 }
            r1.S = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "dyn_draw_engine_url"
            java.lang.String r9 = n     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.d.a.b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.W = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "dc"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.d.a.b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.X = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "privacy_ad_enable"
            int r3 = com.bytedance.sdk.openadsdk.multipro.d.a.a((java.lang.String) r3, (java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.ac = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "privacy_personalized_ad"
            int r3 = com.bytedance.sdk.openadsdk.multipro.d.a.a((java.lang.String) r3, (java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.ad = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "privacy_sladar_enable"
            int r3 = com.bytedance.sdk.openadsdk.multipro.d.a.a((java.lang.String) r3, (java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.ae = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "privacy_app_log_enable"
            int r3 = com.bytedance.sdk.openadsdk.multipro.d.a.a((java.lang.String) r3, (java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.af = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "privacy_sec_enable"
            int r3 = com.bytedance.sdk.openadsdk.multipro.d.a.a((java.lang.String) r3, (java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.ag = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "privacy_debug_unlock"
            int r3 = com.bytedance.sdk.openadsdk.multipro.d.a.a((java.lang.String) r3, (java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.ah = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "privacy_fields_allowed"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.d.a.b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "tt_sdk_settings"
            java.lang.String r9 = "webview_cache_count"
            r10 = 20
            int r8 = com.bytedance.sdk.openadsdk.multipro.d.a.a((java.lang.String) r8, (java.lang.String) r9, (int) r10)     // Catch:{ all -> 0x05b6 }
            r1.L = r8     // Catch:{ all -> 0x05b6 }
            java.util.Set<java.lang.String> r8 = r1.o     // Catch:{ all -> 0x05b6 }
            if (r8 == 0) goto L_0x01f4
            java.util.Set<java.lang.String> r8 = r1.o     // Catch:{ all -> 0x05b6 }
            r8.clear()     // Catch:{ all -> 0x05b6 }
        L_0x01f4:
            java.lang.String r8 = "tt_sdk_settings"
            java.lang.String r9 = "gecko_hosts"
            java.util.Set r8 = com.bytedance.sdk.openadsdk.multipro.d.a.b((java.lang.String) r8, (java.lang.String) r9, (java.util.Set<java.lang.String>) r7)     // Catch:{ all -> 0x05b6 }
            r1.o = r8     // Catch:{ all -> 0x05b6 }
            java.util.Set r8 = r1.a((java.util.Set<java.lang.String>) r8)     // Catch:{ all -> 0x05b6 }
            r1.o = r8     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "tt_sdk_settings"
            java.lang.String r9 = "global_rate"
            r10 = 1065353216(0x3f800000, float:1.0)
            float r8 = com.bytedance.sdk.openadsdk.multipro.d.a.a((java.lang.String) r8, (java.lang.String) r9, (float) r10)     // Catch:{ all -> 0x05b6 }
            r1.am = r8     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "tt_sdk_settings"
            java.lang.String r9 = "sp_key_if_sp_cache"
            int r8 = com.bytedance.sdk.openadsdk.multipro.d.a.a((java.lang.String) r8, (java.lang.String) r9, (int) r4)     // Catch:{ all -> 0x05b6 }
            r1.f1258g = r8     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "tt_sdk_settings"
            java.lang.String r9 = "landingpage_new_style"
            int r6 = com.bytedance.sdk.openadsdk.multipro.d.a.a((java.lang.String) r8, (java.lang.String) r9, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.ao = r6     // Catch:{ all -> 0x05b6 }
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x05b6 }
            if (r6 != 0) goto L_0x024c
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0247 }
            r6.<init>(r3)     // Catch:{ JSONException -> 0x0247 }
            int r3 = r6.length()     // Catch:{ JSONException -> 0x0247 }
            java.util.Set<java.lang.String> r8 = r1.ai     // Catch:{ JSONException -> 0x0247 }
            r8.clear()     // Catch:{ JSONException -> 0x0247 }
            r8 = 0
        L_0x0239:
            if (r8 >= r3) goto L_0x024c
            java.util.Set<java.lang.String> r9 = r1.ai     // Catch:{ JSONException -> 0x0247 }
            java.lang.String r10 = r6.getString(r8)     // Catch:{ JSONException -> 0x0247 }
            r9.add(r10)     // Catch:{ JSONException -> 0x0247 }
            int r8 = r8 + 1
            goto L_0x0239
        L_0x0247:
            r0 = move-exception
            r3 = r0
            r3.printStackTrace()     // Catch:{ all -> 0x05b6 }
        L_0x024c:
            java.util.Set<java.lang.String> r3 = r1.D     // Catch:{ all -> 0x05b6 }
            r3.clear()     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r6 = "hit_app_list_data"
            java.util.Set r3 = com.bytedance.sdk.openadsdk.multipro.d.a.b((java.lang.String) r3, (java.lang.String) r6, (java.util.Set<java.lang.String>) r7)     // Catch:{ all -> 0x05b6 }
            if (r3 == 0) goto L_0x0277
            boolean r6 = r3.isEmpty()     // Catch:{ all -> 0x05b6 }
            if (r6 != 0) goto L_0x0277
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x05b6 }
        L_0x0265:
            boolean r6 = r3.hasNext()     // Catch:{ all -> 0x05b6 }
            if (r6 == 0) goto L_0x0277
            java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x05b6 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x05b6 }
            java.util.Set<java.lang.String> r8 = r1.D     // Catch:{ all -> 0x05b6 }
            r8.add(r6)     // Catch:{ all -> 0x05b6 }
            goto L_0x0265
        L_0x0277:
            java.util.Set<java.lang.String> r3 = r1.E     // Catch:{ all -> 0x05b6 }
            r3.clear()     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r6 = "scheme_list_data"
            java.util.Set r3 = com.bytedance.sdk.openadsdk.multipro.d.a.b((java.lang.String) r3, (java.lang.String) r6, (java.util.Set<java.lang.String>) r7)     // Catch:{ all -> 0x05b6 }
            if (r3 == 0) goto L_0x02a2
            boolean r6 = r3.isEmpty()     // Catch:{ all -> 0x05b6 }
            if (r6 != 0) goto L_0x02a2
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x05b6 }
        L_0x0290:
            boolean r6 = r3.hasNext()     // Catch:{ all -> 0x05b6 }
            if (r6 == 0) goto L_0x02a2
            java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x05b6 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x05b6 }
            java.util.Set<java.lang.String> r8 = r1.E     // Catch:{ all -> 0x05b6 }
            r8.add(r6)     // Catch:{ all -> 0x05b6 }
            goto L_0x0290
        L_0x02a2:
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r6 = "ad_slot_conf"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.d.a.b((java.lang.String) r3, (java.lang.String) r6, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x05b6 }
            if (r6 != 0) goto L_0x02d6
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ Exception -> 0x02d6 }
            r6.<init>(r3)     // Catch:{ Exception -> 0x02d6 }
            int r3 = r6.length()     // Catch:{ Exception -> 0x02d6 }
            if (r3 <= 0) goto L_0x02d6
            java.util.Map<java.lang.String, com.bytedance.sdk.openadsdk.core.i.a> r7 = r1.f1259h     // Catch:{ Exception -> 0x02d6 }
            r7.clear()     // Catch:{ Exception -> 0x02d6 }
        L_0x02c0:
            if (r4 >= r3) goto L_0x02d6
            org.json.JSONObject r7 = r6.optJSONObject(r4)     // Catch:{ Exception -> 0x02d6 }
            com.bytedance.sdk.openadsdk.core.i.a r7 = b((org.json.JSONObject) r7)     // Catch:{ Exception -> 0x02d6 }
            if (r7 == 0) goto L_0x02d3
            java.util.Map<java.lang.String, com.bytedance.sdk.openadsdk.core.i.a> r8 = r1.f1259h     // Catch:{ Exception -> 0x02d6 }
            java.lang.String r9 = r7.f1232a     // Catch:{ Exception -> 0x02d6 }
            r8.put(r9, r7)     // Catch:{ Exception -> 0x02d6 }
        L_0x02d3:
            int r4 = r4 + 1
            goto L_0x02c0
        L_0x02d6:
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r4 = "read_video_from_cache"
            int r2 = com.bytedance.sdk.openadsdk.multipro.d.a.a((java.lang.String) r3, (java.lang.String) r4, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.al = r2     // Catch:{ all -> 0x05b6 }
            java.lang.String r2 = "tt_sdk_settings"
            java.lang.String r3 = "blank_detect_rate"
            int r2 = com.bytedance.sdk.openadsdk.multipro.d.a.a((java.lang.String) r2, (java.lang.String) r3, (int) r5)     // Catch:{ all -> 0x05b6 }
            r1.ap = r2     // Catch:{ all -> 0x05b6 }
            monitor-exit(r16)
            return
        L_0x02ec:
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "xpath"
            java.lang.String r9 = ""
            java.lang.String r3 = r3.b((java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.s = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "duration"
            long r8 = r3.b((java.lang.String) r8, (long) r14)     // Catch:{ all -> 0x05b6 }
            r1.H = r8     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "max"
            int r3 = r3.b((java.lang.String) r8, (int) r13)     // Catch:{ all -> 0x05b6 }
            r1.I = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "download_config_dl_network"
            int r3 = r3.b((java.lang.String) r8, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.t = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "download_config_dl_size"
            int r3 = r3.b((java.lang.String) r8, (int) r5)     // Catch:{ all -> 0x05b6 }
            r1.u = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "fetch_template"
            int r3 = r3.b((java.lang.String) r8, (int) r12)     // Catch:{ all -> 0x05b6 }
            r1.K = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "ab_test_version"
            java.lang.String r3 = r3.a(r8)     // Catch:{ all -> 0x05b6 }
            r1.v = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "ab_test_param"
            java.lang.String r3 = r3.a(r8)     // Catch:{ all -> 0x05b6 }
            r1.w = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "vbtt"
            int r3 = r3.b((java.lang.String) r8, (int) r11)     // Catch:{ all -> 0x05b6 }
            r1.J = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "template_ids"
            java.lang.String r3 = r3.b((java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.l = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "pyload_h5"
            java.lang.String r3 = r3.b((java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.x = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "playableLoadH5Url"
            java.lang.String r3 = r3.b((java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.y = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "splash_load_type"
            int r3 = r3.b((java.lang.String) r8, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.z = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "splash_check_type"
            int r3 = r3.b((java.lang.String) r8, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.A = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "if_both_open"
            int r3 = r3.b((java.lang.String) r8, (int) r4)     // Catch:{ all -> 0x05b6 }
            r1.F = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "support_tnc"
            int r3 = r3.b((java.lang.String) r8, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.G = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "tpl_infos"
            java.lang.String r3 = r3.b((java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.i = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "insert_js_config"
            java.lang.String r3 = r3.b((java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.j = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "app_list_control"
            int r3 = r3.b((java.lang.String) r8, (int) r4)     // Catch:{ all -> 0x05b6 }
            r1.B = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "force_language"
            java.lang.String r9 = ""
            java.lang.String r3 = r3.b((java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.Z = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "fetch_tpl_timeout_ctrl"
            int r3 = r3.b((java.lang.String) r8, (int) r10)     // Catch:{ all -> 0x05b6 }
            r1.aa = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "disable_rotate_banner_on_dislike"
            int r3 = r3.b((java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.an = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "max_tpl_cnts"
            r9 = 100
            int r3 = r3.b((java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x05b6 }
            r1.ab = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "hit_app_list_time"
            r9 = 0
            long r8 = r3.b((java.lang.String) r8, (long) r9)     // Catch:{ all -> 0x05b6 }
            r1.C = r8     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "ads_url"
            java.lang.String r3 = r3.a(r8)     // Catch:{ all -> 0x05b6 }
            r1.M = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "app_log_url"
            java.lang.String r3 = r3.a(r8)     // Catch:{ all -> 0x05b6 }
            r1.N = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "apm_url"
            java.lang.String r3 = r3.a(r8)     // Catch:{ all -> 0x05b6 }
            r1.O = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "coppa"
            r9 = -99
            int r3 = r3.b((java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x05b6 }
            r1.P = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "ccpa"
            r9 = -1
            int r3 = r3.b((java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x05b6 }
            r1.Q = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.core.h r3 = com.bytedance.sdk.openadsdk.core.h.d()     // Catch:{ all -> 0x05b6 }
            int r8 = r1.P     // Catch:{ all -> 0x05b6 }
            r3.d((int) r8)     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "policy_url"
            java.lang.String r9 = r     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = r3.b((java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.R = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "consent_url"
            java.lang.String r9 = "https://lf-hs-sg.ibytedtos.com/obj/union-platform-i18n/union_platform_gdpr_607_en.html"
            java.lang.String r3 = r3.b((java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.T = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "ivrv_downward"
            int r3 = r3.b((java.lang.String) r8, (int) r4)     // Catch:{ all -> 0x05b6 }
            r1.V = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "dyn_draw_engine_url"
            java.lang.String r9 = n     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = r3.b((java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.W = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "dc"
            java.lang.String r3 = r3.a(r8)     // Catch:{ all -> 0x05b6 }
            r1.X = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "isGdprUser"
            r9 = -1
            int r3 = r3.b((java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x05b6 }
            r1.S = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "privacy_ad_enable"
            int r3 = r3.b((java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.ac = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "privacy_personalized_ad"
            int r3 = r3.b((java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.ad = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "privacy_sladar_enable"
            int r3 = r3.b((java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.ae = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "privacy_app_log_enable"
            int r3 = r3.b((java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.af = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "privacy_sec_enable"
            int r3 = r3.b((java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.ag = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "privacy_debug_unlock"
            int r3 = r3.b((java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.ah = r3     // Catch:{ all -> 0x05b6 }
            java.util.Set<java.lang.String> r3 = r1.o     // Catch:{ all -> 0x05b6 }
            if (r3 == 0) goto L_0x04aa
            java.util.Set<java.lang.String> r3 = r1.o     // Catch:{ all -> 0x05b6 }
            r3.clear()     // Catch:{ all -> 0x05b6 }
        L_0x04aa:
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "gecko_hosts"
            java.util.Set r3 = r3.b((java.lang.String) r8, (java.util.Set<java.lang.String>) r7)     // Catch:{ all -> 0x05b6 }
            r1.o = r3     // Catch:{ all -> 0x05b6 }
            java.util.Set r3 = r1.a((java.util.Set<java.lang.String>) r3)     // Catch:{ all -> 0x05b6 }
            r1.o = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "global_rate"
            r9 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3.b((java.lang.String) r8, (float) r9)     // Catch:{ all -> 0x05b6 }
            r1.am = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "sp_key_if_sp_cache"
            int r3 = r3.b((java.lang.String) r8, (int) r4)     // Catch:{ all -> 0x05b6 }
            r1.f1258g = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "landingpage_new_style"
            int r3 = r3.b((java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.ao = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r6 = "privacy_fields_allowed"
            java.lang.String r3 = r3.b((java.lang.String) r6, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x05b6 }
            if (r6 != 0) goto L_0x050a
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0505 }
            r6.<init>(r3)     // Catch:{ JSONException -> 0x0505 }
            int r3 = r6.length()     // Catch:{ JSONException -> 0x0505 }
            java.util.Set<java.lang.String> r8 = r1.ai     // Catch:{ JSONException -> 0x0505 }
            r8.clear()     // Catch:{ JSONException -> 0x0505 }
            r8 = 0
        L_0x04f7:
            if (r8 >= r3) goto L_0x050a
            java.util.Set<java.lang.String> r9 = r1.ai     // Catch:{ JSONException -> 0x0505 }
            java.lang.String r10 = r6.getString(r8)     // Catch:{ JSONException -> 0x0505 }
            r9.add(r10)     // Catch:{ JSONException -> 0x0505 }
            int r8 = r8 + 1
            goto L_0x04f7
        L_0x0505:
            r0 = move-exception
            r3 = r0
            r3.printStackTrace()     // Catch:{ all -> 0x05b6 }
        L_0x050a:
            java.util.Set<java.lang.String> r3 = r1.D     // Catch:{ all -> 0x05b6 }
            r3.clear()     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r6 = "hit_app_list_data"
            java.util.Set r3 = r3.b((java.lang.String) r6, (java.util.Set<java.lang.String>) r7)     // Catch:{ all -> 0x05b6 }
            if (r3 == 0) goto L_0x0535
            boolean r6 = r3.isEmpty()     // Catch:{ all -> 0x05b6 }
            if (r6 != 0) goto L_0x0535
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x05b6 }
        L_0x0523:
            boolean r6 = r3.hasNext()     // Catch:{ all -> 0x05b6 }
            if (r6 == 0) goto L_0x0535
            java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x05b6 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x05b6 }
            java.util.Set<java.lang.String> r8 = r1.D     // Catch:{ all -> 0x05b6 }
            r8.add(r6)     // Catch:{ all -> 0x05b6 }
            goto L_0x0523
        L_0x0535:
            java.util.Set<java.lang.String> r3 = r1.E     // Catch:{ all -> 0x05b6 }
            r3.clear()     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r6 = "scheme_list_data"
            java.util.Set r3 = r3.b((java.lang.String) r6, (java.util.Set<java.lang.String>) r7)     // Catch:{ all -> 0x05b6 }
            if (r3 == 0) goto L_0x0560
            boolean r6 = r3.isEmpty()     // Catch:{ all -> 0x05b6 }
            if (r6 != 0) goto L_0x0560
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x05b6 }
        L_0x054e:
            boolean r6 = r3.hasNext()     // Catch:{ all -> 0x05b6 }
            if (r6 == 0) goto L_0x0560
            java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x05b6 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x05b6 }
            java.util.Set<java.lang.String> r8 = r1.E     // Catch:{ all -> 0x05b6 }
            r8.add(r6)     // Catch:{ all -> 0x05b6 }
            goto L_0x054e
        L_0x0560:
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r6 = "ad_slot_conf"
            java.lang.String r3 = r3.b((java.lang.String) r6, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x05b6 }
            if (r6 != 0) goto L_0x0594
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ Exception -> 0x0594 }
            r6.<init>(r3)     // Catch:{ Exception -> 0x0594 }
            int r3 = r6.length()     // Catch:{ Exception -> 0x0594 }
            if (r3 <= 0) goto L_0x0594
            java.util.Map<java.lang.String, com.bytedance.sdk.openadsdk.core.i.a> r7 = r1.f1259h     // Catch:{ Exception -> 0x0594 }
            r7.clear()     // Catch:{ Exception -> 0x0594 }
        L_0x057e:
            if (r4 >= r3) goto L_0x0594
            org.json.JSONObject r7 = r6.optJSONObject(r4)     // Catch:{ Exception -> 0x0594 }
            com.bytedance.sdk.openadsdk.core.i.a r7 = b((org.json.JSONObject) r7)     // Catch:{ Exception -> 0x0594 }
            if (r7 == 0) goto L_0x0591
            java.util.Map<java.lang.String, com.bytedance.sdk.openadsdk.core.i.a> r8 = r1.f1259h     // Catch:{ Exception -> 0x0594 }
            java.lang.String r9 = r7.f1232a     // Catch:{ Exception -> 0x0594 }
            r8.put(r9, r7)     // Catch:{ Exception -> 0x0594 }
        L_0x0591:
            int r4 = r4 + 1
            goto L_0x057e
        L_0x0594:
            com.bytedance.sdk.component.utils.u r3 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r4 = "read_video_from_cache"
            int r2 = r3.b((java.lang.String) r4, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.al = r2     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r2 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "webview_cache_count"
            r4 = 20
            int r2 = r2.b((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x05b6 }
            r1.L = r2     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r2 = r1.ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "blank_detect_rate"
            int r2 = r2.b((java.lang.String) r3, (int) r5)     // Catch:{ all -> 0x05b6 }
            r1.ap = r2     // Catch:{ all -> 0x05b6 }
            monitor-exit(r16)
            return
        L_0x05b6:
            r0 = move-exception
            r2 = r0
            monitor-exit(r16)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.i.f.a():void");
    }

    private static a b(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2 == null) {
            return null;
        }
        String optString = jSONObject2.optString("code_id");
        int optInt = jSONObject2.optInt("auto_play", 1);
        int optInt2 = jSONObject2.optInt("voice_control", 1);
        int optInt3 = jSONObject2.optInt("rv_preload", 2);
        int optInt4 = jSONObject2.optInt("nv_preload", 1);
        int optInt5 = jSONObject2.optInt("proportion_watching", 100);
        int optInt6 = jSONObject2.optInt("skip_time_displayed", 0);
        int optInt7 = jSONObject2.optInt("video_skip_result", 2);
        int optInt8 = jSONObject2.optInt("reg_creative_control", 1);
        int optInt9 = jSONObject2.optInt("play_bar_show_time", 3);
        int optInt10 = jSONObject2.optInt("rv_skip_time", -1);
        int optInt11 = jSONObject2.optInt("voice_control", 2);
        int optInt12 = jSONObject2.optInt("if_show_win", 1);
        int optInt13 = jSONObject2.optInt("sp_preload", 2);
        int optInt14 = jSONObject2.optInt("stop_time", 1500);
        int optInt15 = jSONObject2.optInt("native_playable_delay", 2);
        int optInt16 = jSONObject2.optInt("time_out_control", -1);
        int optInt17 = jSONObject2.optInt("playable_close_time", -1);
        int optInt18 = jSONObject2.optInt("playable_reward_type", 0);
        int optInt19 = jSONObject2.optInt("reward_is_callback", 0);
        int optInt20 = jSONObject2.optInt("iv_skip_time", 5);
        JSONArray optJSONArray = jSONObject2.optJSONArray("parent_tpl_ids");
        int i2 = optInt20;
        int optInt21 = jSONObject2.optInt("slot_type", 2);
        boolean optBoolean = jSONObject2.optBoolean("close_on_click", false);
        int optInt22 = jSONObject2.optInt("allow_system_back", 0);
        int optInt23 = jSONObject2.optInt("splash_skip_time", 0);
        int optInt24 = jSONObject2.optInt("splash_image_count_down_time", 5);
        if (!k(optInt2)) {
            optInt2 = 1;
        }
        return a.a().a(optString).k(optInt).l(optInt2).m(optInt3).n(optInt4).o(optInt5).p(optInt6).q(optInt7).r(optInt8).j(optInt9).i(optInt10).h(!k(optInt11) ? 1 : optInt11).s(optInt12).e(optInt13).f(optInt14).g(optInt15).d(optInt16).b(optInt18).c(optInt19).a(optInt17).t(optInt21).u(i2).a(optJSONArray).a(optBoolean).v(optInt22).w(optInt23).x(optInt24);
    }

    public int b() {
        if (this.ab == Integer.MAX_VALUE) {
            if (b.c()) {
                this.ab = a.a("tt_sdk_settings", "max_tpl_cnts", 100);
            } else {
                this.ab = this.ak.b("max_tpl_cnts", 100);
            }
        }
        return this.ab;
    }

    public void a(JSONObject jSONObject) {
        String str;
        this.ao = jSONObject.optInt("lp_new_style", Integer.MAX_VALUE);
        int optInt = jSONObject.optInt("blank_detect_rate", 30);
        this.ap = optInt;
        if (optInt < 0 || optInt > 100) {
            this.ap = 30;
        }
        this.s = jSONObject.optString("xpath");
        JSONObject optJSONObject = jSONObject.optJSONObject("feq_policy");
        if (optJSONObject != null) {
            this.H = optJSONObject.optLong(IronSourceConstants.EVENTS_DURATION) * 1000;
            this.I = optJSONObject.optInt(AppLovinMediationProvider.MAX);
        }
        this.J = jSONObject.optInt("vbtt", 5);
        this.K = jSONObject.optInt("fetch_tpl_interval", 3600);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("abtest");
        if (optJSONObject2 != null) {
            this.v = optJSONObject2.optString(MediationMetaData.KEY_VERSION);
            this.w = optJSONObject2.optString("param");
        } else {
            J();
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("log_rate_conf");
        if (optJSONObject3 != null) {
            this.am = (float) optJSONObject3.optDouble("global_rate", 1.0d);
        }
        this.x = jSONObject.optString("pyload_h5");
        this.y = jSONObject.optString("pure_pyload_h5");
        this.M = jSONObject.optString("ads_url");
        this.N = jSONObject.optString("app_log_url");
        this.O = jSONObject.optString("apm_url");
        this.P = jSONObject.optInt("coppa", -99);
        this.Q = jSONObject.optInt("ccpa", -1);
        h.d().d(this.P);
        this.R = jSONObject.optString("privacy_url", r);
        this.T = jSONObject.optString("consent_url", "https://lf-hs-sg.ibytedtos.com/obj/union-platform-i18n/union_platform_gdpr_607_en.html");
        this.U = jSONObject.optInt("network_module", 1);
        this.V = jSONObject.optInt("ivrv_downward", 0);
        this.X = jSONObject.optString("dc");
        c(jSONObject);
        d(jSONObject);
        this.z = e(jSONObject);
        l.e("splashLoad", "setting-》mSplashLoadType=" + this.z);
        this.A = f(jSONObject);
        l.e("splashLoad", "setting-》mSplashCheckType=" + this.A);
        this.F = jSONObject.optInt("if_both_open", 0);
        this.G = jSONObject.optInt("support_tnc", 1);
        this.j = jSONObject.optString("insert_js_config", "");
        this.B = jSONObject.optInt("al", 0);
        this.ab = jSONObject.optInt("max_tpl_cnts", 100);
        JSONObject optJSONObject4 = jSONObject.optJSONObject("app_common_config");
        if (optJSONObject4 != null) {
            this.Z = optJSONObject4.optString("force_language");
            this.aa = optJSONObject4.optInt("fetch_tpl_timeout_ctrl", 3000);
            this.an = optJSONObject4.optInt("disable_rotate_banner_on_dislike", Integer.MAX_VALUE);
            this.f1258g = optJSONObject4.optInt("if_sp_cache", 0);
            this.L = optJSONObject4.optInt("webview_cache_count", 20);
            try {
                this.o.clear();
                JSONArray optJSONArray = optJSONObject4.optJSONArray("gecko_hosts");
                if (!(optJSONArray == null || optJSONArray.length() == 0)) {
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        this.o.add(optJSONArray.getString(i2));
                    }
                }
                this.o = a(this.o);
            } catch (Throwable th) {
                l.b("GeckoLog: settings json error " + th);
            }
        }
        this.C = System.currentTimeMillis();
        this.D.clear();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("spam_app_list");
        if (optJSONArray2 != null) {
            int length = optJSONArray2.length();
            for (int i3 = 0; i3 < length; i3++) {
                String optString = optJSONArray2.optString(i3);
                if (!TextUtils.isEmpty(optString)) {
                    this.D.add(optString);
                }
            }
        }
        this.E.clear();
        JSONArray optJSONArray3 = jSONObject.optJSONArray("scheme_check_list");
        if (optJSONArray3 != null) {
            int length2 = optJSONArray3.length();
            for (int i4 = 0; i4 < length2; i4++) {
                String optString2 = optJSONArray3.optString(i4);
                if (!TextUtils.isEmpty(optString2)) {
                    this.E.add(optString2);
                }
            }
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("download_config");
        if (optJSONObject5 != null) {
            this.t = optJSONObject5.optInt("dl_network", 1);
            this.u = optJSONObject5.optInt("dl_size", 30);
        }
        this.al = jSONObject.optInt("read_video_from_cache", 1);
        JSONArray optJSONArray4 = jSONObject.optJSONArray("ad_slot_conf_list");
        if (optJSONArray4 != null) {
            str = optJSONArray4.toString();
            int length3 = optJSONArray4.length();
            if (length3 > 0) {
                this.f1259h.clear();
                for (int i5 = 0; i5 < length3; i5++) {
                    a b2 = b(optJSONArray4.optJSONObject(i5));
                    if (b2 != null) {
                        this.f1259h.put(b2.f1232a, b2);
                    }
                }
            }
        } else {
            str = null;
        }
        JSONObject optJSONObject6 = jSONObject.optJSONObject("privacy");
        if (optJSONObject6 != null) {
            this.ac = optJSONObject6.optInt("ad_enable", Integer.MAX_VALUE);
            this.ad = optJSONObject6.optInt("personalized_ad", Integer.MAX_VALUE);
            this.ae = optJSONObject6.optInt("sladar_enable", Integer.MAX_VALUE);
            this.af = optJSONObject6.optInt("app_log_enable", Integer.MAX_VALUE);
            this.ag = optJSONObject6.optInt("sec_enable", Integer.MAX_VALUE);
            this.ah = optJSONObject6.optInt("debug_unlock", Integer.MAX_VALUE);
            String optString3 = optJSONObject6.optString("fields_allowed", "");
            if (!TextUtils.isEmpty(optString3)) {
                try {
                    JSONArray jSONArray = new JSONArray(optString3);
                    int length4 = jSONArray.length();
                    this.ai.clear();
                    for (int i6 = 0; i6 < length4; i6++) {
                        this.ai.add(jSONArray.getString(i6));
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            } else {
                this.ai.clear();
            }
        } else {
            this.ac = Integer.MAX_VALUE;
            this.ad = Integer.MAX_VALUE;
            this.ae = Integer.MAX_VALUE;
            this.af = Integer.MAX_VALUE;
            this.ag = Integer.MAX_VALUE;
            this.ah = Integer.MAX_VALUE;
            this.ai.clear();
        }
        a(str, (String) null);
        a((Boolean) true);
        this.Y = true;
    }

    private void J() {
        this.w = null;
        this.v = null;
        if (b.c()) {
            a.b("tt_sdk_settings", "ab_test_version");
            a.b("tt_sdk_settings", "ab_test_param");
            return;
        }
        this.ak.c("ab_test_version");
        this.ak.c("ab_test_param");
    }

    private void c(JSONObject jSONObject) {
        String str;
        if (jSONObject != null) {
            if (b.c()) {
                str = a.b("tt_sdk_settings", "dyn_draw_engine_url", n);
            } else {
                str = this.ak.b("dyn_draw_engine_url", n);
            }
            this.W = jSONObject.optString("dyn_draw_engine_url", n);
            l.e("TemplateManager", "settinng---TTDynamic.init().....oldDynDrawEngineUrl=" + str);
            l.e("TemplateManager", "settinng---TTDynamic.init().....newmDynDrawEngineUrl=" + this.W);
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.W) && !this.W.equals(str)) {
                l.b("TemplateManager", "Reinitialize the template TTDynamic.init().....");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
                com.bytedance.sdk.component.adexpress.a.b.b.a().g();
                com.bytedance.sdk.component.adexpress.a.b.b.a().b(false);
                com.bytedance.sdk.component.adexpress.a.b.a.b();
                com.bytedance.sdk.component.adexpress.a.b.b.a().b();
            }
        }
    }

    public int a(String str) {
        if (str == null) {
            return 0;
        }
        return m.h().n(String.valueOf(str)).r;
    }

    private void d(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("is_gdpr_user", -1);
        this.S = optInt;
        if (optInt != -1 && optInt != 1 && optInt != 0) {
            this.S = -1;
        }
    }

    private int e(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("splash_load_type", 1);
        this.z = optInt;
        if (optInt == 0 || optInt == 1 || optInt == 2 || optInt == 3) {
            return this.z;
        }
        return 1;
    }

    private int f(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("splash_check_type", 1);
        this.A = optInt;
        if (optInt == 0 || optInt == 1) {
            return this.A;
        }
        return 1;
    }

    private void a(String str, String str2) {
        String str3 = str;
        String str4 = "scheme_list_data";
        String str5 = "hit_app_list_data";
        String str6 = "hit_app_list_time";
        String str7 = "disable_rotate_banner_on_dislike";
        String str8 = "fetch_tpl_timeout_ctrl";
        String str9 = "max_tpl_cnts";
        String str10 = "app_list_control";
        if (b.c()) {
            String str11 = "privacy_fields_allowed";
            a.a("tt_sdk_settings", "xpath", this.s);
            a.a("tt_sdk_settings", IronSourceConstants.EVENTS_DURATION, Long.valueOf(this.H));
            a.a("tt_sdk_settings", AppLovinMediationProvider.MAX, Integer.valueOf(this.I));
            a.a("tt_sdk_settings", "download_config_dl_network", Integer.valueOf(this.t));
            a.a("tt_sdk_settings", "download_config_dl_size", Integer.valueOf(this.u));
            a.a("tt_sdk_settings", "vbtt", Integer.valueOf(this.J));
            a.a("tt_sdk_settings", "fetch_template", Integer.valueOf(this.K));
            a.a("tt_sdk_settings", "splash_load_type", Integer.valueOf(this.z));
            a.a("tt_sdk_settings", "splash_check_type", Integer.valueOf(this.A));
            a.a("tt_sdk_settings", "if_both_open", Integer.valueOf(this.F));
            a.a("tt_sdk_settings", "support_tnc", Integer.valueOf(this.G));
            a.a("tt_sdk_settings", "insert_js_config", this.j);
            a.a("tt_sdk_settings", "pyload_h5", this.x);
            a.a("tt_sdk_settings", "playableLoadH5Url", this.y);
            a.a("tt_sdk_settings", str10, Integer.valueOf(this.B));
            a.a("tt_sdk_settings", str9, Integer.valueOf(this.ab));
            a.a("tt_sdk_settings", str8, Integer.valueOf(this.aa));
            a.a("tt_sdk_settings", str7, Integer.valueOf(this.an));
            a.a("tt_sdk_settings", str6, Long.valueOf(this.C));
            a.a("tt_sdk_settings", str5, this.D);
            a.a("tt_sdk_settings", str4, this.E);
            a.a("tt_sdk_settings", "ads_url", this.M);
            a.a("tt_sdk_settings", "app_log_url", this.N);
            a.a("tt_sdk_settings", "apm_url", this.O);
            a.a("tt_sdk_settings", "coppa", Integer.valueOf(this.P));
            a.a("tt_sdk_settings", "ccpa", Integer.valueOf(this.Q));
            a.a("tt_sdk_settings", "policy_url", this.R);
            a.a("tt_sdk_settings", "consent_url", this.T);
            a.a("tt_sdk_settings", "ivrv_downward", Integer.valueOf(this.V));
            a.a("tt_sdk_settings", "dyn_draw_engine_url", this.W);
            a.a("tt_sdk_settings", "dc", this.X);
            a.a("tt_sdk_settings", "isGdprUser", Integer.valueOf(this.S));
            a.a("tt_sdk_settings", "sp_key_if_sp_cache", Integer.valueOf(this.f1258g));
            a.a("tt_sdk_settings", "landingpage_new_style", Integer.valueOf(this.ao));
            if (!TextUtils.isEmpty(this.Z) && f1257f.contains(this.Z)) {
                a.a("tt_sdk_settings", "force_language", this.Z);
            }
            String str12 = this.v;
            if (str12 != null) {
                a.a("tt_sdk_settings", "ab_test_version", str12);
            }
            String str13 = this.w;
            if (str13 != null) {
                a.a("tt_sdk_settings", "ab_test_param", str13);
            }
            if (!TextUtils.isEmpty(str)) {
                a.a("tt_sdk_settings", "ad_slot_conf", str);
            }
            if (!TextUtils.isEmpty(this.l)) {
                a.a("tt_sdk_settings", "template_ids", this.l);
            }
            if (!TextUtils.isEmpty(this.i)) {
                a.a("tt_sdk_settings", "tpl_infos", this.i);
            }
            a.a("tt_sdk_settings", "privacy_ad_enable", Integer.valueOf(this.ac));
            a.a("tt_sdk_settings", "privacy_personalized_ad", Integer.valueOf(this.ad));
            a.a("tt_sdk_settings", "privacy_sladar_enable", Integer.valueOf(this.ae));
            a.a("tt_sdk_settings", "privacy_app_log_enable", Integer.valueOf(this.af));
            a.a("tt_sdk_settings", "privacy_sec_enable", Integer.valueOf(this.ag));
            a.a("tt_sdk_settings", "privacy_debug_unlock", Integer.valueOf(this.ah));
            a.a("tt_sdk_settings", "gecko_hosts", this.o);
            if (this.ai.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (String put : this.ai) {
                    jSONArray.put(put);
                }
                a.a("tt_sdk_settings", str11, jSONArray.toString());
            } else {
                a.a("tt_sdk_settings", str11, "");
            }
            a.a("tt_sdk_settings", "read_video_from_cache", Integer.valueOf(this.al));
            a.a("tt_sdk_settings", "global_rate", Float.valueOf(this.am));
            a.a("tt_sdk_settings", "webview_cache_count", Integer.valueOf(this.L));
            a.a("tt_sdk_settings", "blank_detect_rate", Integer.valueOf(this.ap));
            return;
        }
        String str14 = "privacy_fields_allowed";
        String str15 = str10;
        this.ak.a("xpath", this.s);
        this.ak.a(IronSourceConstants.EVENTS_DURATION, this.H);
        this.ak.a(AppLovinMediationProvider.MAX, this.I);
        this.ak.a("download_config_dl_network", this.t);
        this.ak.a("download_config_dl_size", this.u);
        this.ak.a("fetch_template", this.K);
        this.ak.a("pyload_h5", this.x);
        this.ak.a("insert_js_config", this.j);
        this.ak.a("playableLoadH5Url", this.y);
        this.ak.a("splash_load_type", this.z);
        this.ak.a("splash_check_type", this.A);
        this.ak.a("if_both_open", this.F);
        this.ak.a("support_tnc", this.G);
        this.ak.a(str10, this.B);
        this.ak.a(str9, this.ab);
        this.ak.a(str8, this.aa);
        this.ak.a(str7, this.an);
        this.ak.a(str6, this.C);
        this.ak.a(str5, this.D);
        this.ak.a(str4, this.E);
        this.ak.a("ads_url", this.M);
        this.ak.a("app_log_url", this.N);
        this.ak.a("apm_url", this.O);
        this.ak.a("coppa", this.P);
        this.ak.a("ccpa", this.Q);
        this.ak.a("policy_url", this.R);
        this.ak.a("consent_url", this.T);
        this.ak.a("ivrv_downward", this.V);
        this.ak.a("dyn_draw_engine_url", this.W);
        this.ak.a("dc", this.X);
        this.ak.a("isGdprUser", this.S);
        this.ak.a("sp_key_if_sp_cache", this.f1258g);
        this.ak.a("landingpage_new_style", this.ao);
        if (!TextUtils.isEmpty(this.Z) && f1257f.contains(this.Z)) {
            this.ak.a("force_language", this.Z);
        }
        String str16 = this.v;
        if (str16 != null) {
            this.ak.a("ab_test_version", str16);
        }
        String str17 = this.w;
        if (str17 != null) {
            this.ak.a("ab_test_param", str17);
        }
        this.ak.a("vbtt", this.J);
        if (!TextUtils.isEmpty(str)) {
            this.ak.a("ad_slot_conf", str);
        }
        if (!TextUtils.isEmpty(this.l)) {
            this.ak.a("template_ids", this.l);
        }
        if (!TextUtils.isEmpty(this.i)) {
            this.ak.a("tpl_infos", this.i);
        }
        this.ak.a("privacy_ad_enable", this.ac);
        this.ak.a("privacy_personalized_ad", this.ad);
        this.ak.a("privacy_sladar_enable", this.ae);
        this.ak.a("privacy_app_log_enable", this.af);
        this.ak.a("privacy_sec_enable", this.ag);
        this.ak.a("privacy_debug_unlock", this.ah);
        this.ak.a("gecko_hosts", this.o);
        if (this.ai.size() > 0) {
            JSONArray jSONArray2 = new JSONArray();
            for (String put2 : this.ai) {
                jSONArray2.put(put2);
            }
            this.ak.a(str14, jSONArray2.toString());
        } else {
            this.ak.a(str14, "");
        }
        this.ak.a("read_video_from_cache", this.al);
        this.ak.a("global_rate", this.am);
        this.ak.a("webview_cache_count", this.L);
        this.ak.a("blank_detect_rate", this.ap);
    }

    public boolean c() {
        if (this.F == Integer.MAX_VALUE) {
            if (b.c()) {
                this.F = a.a("tt_sdk_settings", "if_both_open", 0);
            } else {
                this.F = this.ak.b("if_both_open", 0);
            }
        }
        if (this.F == 1) {
            return true;
        }
        return false;
    }

    public boolean d() {
        if (this.G == Integer.MAX_VALUE) {
            if (b.c()) {
                this.G = a.a("tt_sdk_settings", "support_tnc", 1);
            } else {
                this.G = this.ak.b("support_tnc", 1);
            }
        }
        if (this.G == 1) {
            return true;
        }
        return false;
    }

    public String e() {
        if (this.v == null) {
            if (b.c()) {
                this.v = a.b("tt_sdk_settings", "ab_test_version", (String) null);
            } else {
                this.v = this.ak.a("ab_test_version");
            }
        }
        return this.v;
    }

    public String f() {
        if (this.w == null) {
            if (b.c()) {
                this.w = a.b("tt_sdk_settings", "ab_test_param", (String) null);
            } else {
                this.w = this.ak.a("ab_test_param");
            }
        }
        return this.w;
    }

    public boolean g() {
        if (this.ao == Integer.MAX_VALUE) {
            if (b.c()) {
                this.ao = a.a("tt_sdk_settings", "landingpage_new_style", -1);
            } else {
                this.ao = this.ak.b("landingpage_new_style");
            }
        }
        return this.ao == 1;
    }

    public long h() {
        if (this.H == 2147483647L) {
            if (b.c()) {
                this.H = a.a("tt_sdk_settings", IronSourceConstants.EVENTS_DURATION, 10000);
            } else {
                this.H = this.ak.b(IronSourceConstants.EVENTS_DURATION, 10000);
            }
        }
        return this.H;
    }

    public int i() {
        if (this.I == Integer.MAX_VALUE) {
            if (b.c()) {
                this.I = a.a("tt_sdk_settings", AppLovinMediationProvider.MAX, 50);
            } else {
                this.I = this.ak.b(AppLovinMediationProvider.MAX, 50);
            }
        }
        return this.I;
    }

    public String j() {
        if (TextUtils.isEmpty(this.x)) {
            if (b.c()) {
                this.x = a.b("tt_sdk_settings", "pyload_h5", (String) null);
            } else {
                this.x = this.ak.b("pyload_h5", (String) null);
            }
        }
        return this.x;
    }

    public c k() {
        if (TextUtils.isEmpty(this.j)) {
            if (b.c()) {
                this.j = a.b("tt_sdk_settings", "insert_js_config", (String) null);
            } else {
                this.j = this.ak.b("insert_js_config", (String) null);
            }
        }
        return new c(this.j);
    }

    public String l() {
        if (TextUtils.isEmpty(this.y)) {
            if (b.c()) {
                this.y = a.b("tt_sdk_settings", "playableLoadH5Url", (String) null);
            } else {
                this.y = this.ak.b("playableLoadH5Url", (String) null);
            }
        }
        return this.y;
    }

    public int m() {
        if (this.aa == Integer.MAX_VALUE) {
            if (b.c()) {
                this.aa = a.a("tt_sdk_settings", "fetch_tpl_timeout_ctrl", 3000);
            } else {
                this.aa = this.ak.b("fetch_tpl_timeout_ctrl", 3000);
            }
        }
        if (this.aa <= 0) {
            this.aa = 3000;
        }
        return this.aa;
    }

    public void a(Boolean bool) {
        if (Build.VERSION.SDK_INT >= 17) {
            if (bool.booleanValue() && (TextUtils.isEmpty(this.Z) || !f1257f.contains(this.Z))) {
                if (b.c()) {
                    this.Z = a.b("tt_sdk_settings", "force_language", "");
                } else {
                    this.Z = this.ak.b("force_language", "");
                }
            }
            if (!TextUtils.isEmpty(this.Z)) {
                if (this.Z.equals("zh-Hant")) {
                    i.a(m.a(), "zh", "tw");
                } else {
                    i.a(m.a(), this.Z, (String) null);
                }
                try {
                    f1254c = t.a(m.a(), "tt_txt_skip");
                    f1255d = t.a(m.a(), "tt_feedback_submit_text");
                    f1256e = t.a(m.a(), "tt_feedback_thank_text") + "\n" + t.a(m.a(), "tt_feedback_experience_text");
                } catch (Throwable unused) {
                }
            }
        }
    }

    public int n() {
        if (this.an == Integer.MAX_VALUE) {
            if (b.c()) {
                this.an = a.a("tt_sdk_settings", "disable_rotate_banner_on_dislike", Integer.MAX_VALUE);
            } else {
                this.an = this.ak.b("disable_rotate_banner_on_dislike", Integer.MAX_VALUE);
            }
        }
        return this.an;
    }

    public boolean a(int i2) {
        return n(String.valueOf(i2)).f1234c == 1;
    }

    public boolean b(String str) {
        int i2 = m.h().n(String.valueOf(str)).f1236e;
        if (i2 == 1) {
            return o.d(m.a());
        }
        if (i2 == 2 && o.c(m.a()) != 0) {
            return true;
        }
        return false;
    }

    public boolean c(String str) {
        return n(String.valueOf(str)).f1238g == 1;
    }

    public boolean d(String str) {
        if (str == null || m.h().n(String.valueOf(str)).m == 1) {
            return true;
        }
        return false;
    }

    public int e(String str) {
        if (str == null) {
            return 1500;
        }
        return m.h().n(String.valueOf(str)).o;
    }

    public int f(String str) {
        return m.h().n(String.valueOf(str)).k;
    }

    public JSONArray g(String str) {
        try {
            Set<String> b2 = com.bytedance.sdk.component.adexpress.a.b.a.b(str);
            if (b2 != null) {
                if (b2.size() != 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (String a2 : b2) {
                        com.bytedance.sdk.component.adexpress.a.c.b a3 = com.bytedance.sdk.component.adexpress.a.b.a.a(a2);
                        if (a3 != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(OSOutcomeConstants.OUTCOME_ID, a3.b());
                            jSONObject.put("md5", a3.c());
                            jSONArray.put(jSONObject);
                        }
                    }
                    return jSONArray;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public boolean h(String str) {
        try {
            a n2 = m.h().n(String.valueOf(str));
            return (n2 == null || n2.v == null) ? false : true;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean i(String str) {
        try {
            a n2 = m.h().n(String.valueOf(str));
            return n2 != null && n2.w == 8;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean o() {
        return this.Y;
    }

    public int j(String str) {
        return n(String.valueOf(str)).f1239h;
    }

    public int k(String str) {
        return n(str).j;
    }

    public int a(String str, boolean z2) {
        if (str == null) {
            return a(z2);
        }
        a n2 = m.h().n(str);
        return n2.x != -1 ? n2.x : a(z2);
    }

    public boolean l(String str) {
        return n(String.valueOf(str)).u == 0;
    }

    public boolean b(int i2) {
        if (i2 == 0 || m.h().n(String.valueOf(i2)).l == 1) {
            return true;
        }
        return false;
    }

    public String p() {
        if (TextUtils.isEmpty(this.M)) {
            if (b.c()) {
                this.M = a.b("tt_sdk_settings", "ads_url", q);
            } else {
                this.M = this.ak.b("ads_url", q);
            }
            if (TextUtils.isEmpty(this.M)) {
                this.M = q;
            }
        }
        return this.M;
    }

    public String q() {
        if (TextUtils.isEmpty(this.N)) {
            if (b.c()) {
                this.N = a.b("tt_sdk_settings", "app_log_url", p);
            } else {
                this.N = this.ak.a("app_log_url");
            }
            if (TextUtils.isEmpty(this.N)) {
                this.N = p;
            }
        }
        return this.N;
    }

    public String r() {
        if (TextUtils.isEmpty(this.O)) {
            if (b.c()) {
                this.O = a.b("tt_sdk_settings", "apm_url", "");
            } else {
                this.O = this.ak.b("apm_url", "");
            }
        }
        return this.O;
    }

    public String s() {
        if (TextUtils.isEmpty(this.R)) {
            if (b.c()) {
                this.R = a.b("tt_sdk_settings", "policy_url", r);
            } else {
                this.R = this.ak.b("policy_url", r);
            }
        }
        return this.R;
    }

    public String t() {
        if (TextUtils.isEmpty(this.T)) {
            if (b.c()) {
                this.T = a.b("tt_sdk_settings", "consent_url", "https://lf-hs-sg.ibytedtos.com/obj/union-platform-i18n/union_platform_gdpr_607_en.html");
            } else {
                this.T = this.ak.b("consent_url", "https://lf-hs-sg.ibytedtos.com/obj/union-platform-i18n/union_platform_gdpr_607_en.html");
            }
        }
        return this.T;
    }

    public int u() {
        if (this.V == 0) {
            if (b.c()) {
                this.V = a.a("tt_sdk_settings", "ivrv_downward", 0);
            } else {
                this.V = this.ak.b("ivrv_downward", 0);
            }
        }
        return this.V;
    }

    public String v() {
        if (TextUtils.isEmpty(this.W)) {
            if (b.c()) {
                this.W = a.b("tt_sdk_settings", "dyn_draw_engine_url", n);
            } else {
                this.W = this.ak.b("dyn_draw_engine_url", n);
            }
        }
        return this.W;
    }

    public String w() {
        if (TextUtils.isEmpty(this.X)) {
            if (b.c()) {
                this.X = a.b("tt_sdk_settings", "dc", (String) null);
            } else {
                this.X = this.ak.a("dc");
            }
        }
        return this.X;
    }

    public int x() {
        if (this.S == Integer.MAX_VALUE) {
            if (b.c()) {
                this.S = a.a("tt_sdk_settings", "isGdprUser", -1);
            } else {
                this.S = this.ak.b("isGdprUser", -1);
            }
        }
        return this.S;
    }

    public int c(int i2) {
        return n(String.valueOf(i2)).f1233b;
    }

    public int d(int i2) {
        return n(String.valueOf(i2)).i;
    }

    public int y() {
        if (this.J == Integer.MAX_VALUE) {
            if (b.c()) {
                this.J = a.a("tt_sdk_settings", "vbtt", 5);
            } else {
                this.J = this.ak.b("vbtt", 5);
            }
        }
        return this.J;
    }

    public int e(int i2) {
        return n(String.valueOf(i2)).s;
    }

    public int f(int i2) {
        return n(String.valueOf(i2)).k;
    }

    public boolean g(int i2) {
        return n(String.valueOf(i2)).t;
    }

    public int h(int i2) {
        return n(String.valueOf(i2)).y;
    }

    public int i(int i2) {
        return n(String.valueOf(i2)).z;
    }

    public int j(int i2) {
        return n(String.valueOf(i2)).A;
    }

    public boolean m(String str) {
        if (str != null && m.h().n(str).n == 1) {
            return true;
        }
        return false;
    }

    public a n(String str) {
        a aVar = this.f1259h.get(str);
        return aVar == null ? q(str) : aVar;
    }

    private a q(String str) {
        return a.a().a(str).k(1).l(this.k.contains(str) ^ true ? 1 : 0).m(2).n(1).o(100).p(0).r(1).j(3).i(-1).h(1).s(1).d(-1).a(-1).t(2).u(5).a((JSONArray) null).a(false).v(0).w(0).x(5);
    }

    public void o(String str) {
        this.k.add(str);
    }

    public boolean z() {
        if (this.ac == Integer.MAX_VALUE) {
            if (b.c()) {
                this.ac = a.a("tt_sdk_settings", "privacy_ad_enable", Integer.MAX_VALUE);
            } else {
                this.ac = this.ak.b("privacy_ad_enable", Integer.MAX_VALUE);
            }
        }
        int i2 = this.ac;
        if (i2 == 1) {
            return true;
        }
        if (i2 == 0) {
            return false;
        }
        int o2 = u.o();
        return o2 == 1 || o2 == 2 || o2 == 3;
    }

    public int A() {
        if (this.ad == Integer.MAX_VALUE) {
            if (b.c()) {
                this.ad = a.a("tt_sdk_settings", "privacy_personalized_ad", Integer.MAX_VALUE);
            } else {
                this.ad = this.ak.b("privacy_personalized_ad", Integer.MAX_VALUE);
            }
        }
        int i2 = this.ad;
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        int o2 = u.o();
        if (o2 == 1 || o2 == 2) {
            return 2;
        }
        return o2 != 3 ? 0 : 1;
    }

    public boolean B() {
        if (this.ae == Integer.MAX_VALUE) {
            if (b.c()) {
                this.ae = a.a("tt_sdk_settings", "privacy_sladar_enable", Integer.MAX_VALUE);
            } else {
                this.ae = this.ak.b("privacy_sladar_enable", Integer.MAX_VALUE);
            }
        }
        return this.ae == 1;
    }

    public boolean C() {
        if (this.ag == Integer.MAX_VALUE) {
            if (b.c()) {
                this.ag = a.a("tt_sdk_settings", "privacy_sec_enable", Integer.MAX_VALUE);
            } else {
                this.ag = this.ak.b("privacy_sec_enable", Integer.MAX_VALUE);
            }
        }
        if ("VA".equalsIgnoreCase(w()) || u.o() == 3) {
            return false;
        }
        int i2 = this.ag;
        if (i2 == 1) {
            return true;
        }
        if (i2 == 0) {
            return false;
        }
        int o2 = u.o();
        if (o2 == 1 || o2 == 2 || o2 == 3) {
            return true;
        }
        return false;
    }

    public boolean D() {
        if (this.ah == Integer.MAX_VALUE) {
            if (b.c()) {
                this.ah = a.a("tt_sdk_settings", "privacy_debug_unlock", Integer.MAX_VALUE);
            } else {
                this.ah = this.ak.b("privacy_debug_unlock", Integer.MAX_VALUE);
            }
        }
        return this.ah != 0;
    }

    public boolean p(String str) {
        if (this.ai.size() != 0) {
            return this.ai.contains(str);
        }
        int o2 = u.o();
        if (o2 != 1) {
            if (o2 == 2) {
                return "mcc".equals(str) || "mnc".equals(str);
            }
            if (o2 != 3) {
                return false;
            }
            return "mcc".equals(str) || "mnc".equals(str);
        }
    }

    public Set<String> a(Set<String> set) {
        if (set == null) {
            try {
                return new HashSet();
            } catch (Throwable unused) {
                return new HashSet();
            }
        } else {
            HashSet hashSet = new HashSet();
            for (String next : set) {
                if (!TextUtils.isEmpty(next)) {
                    hashSet.add(next);
                }
            }
            return hashSet;
        }
    }

    public boolean E() {
        return this.aj;
    }

    public boolean F() {
        if (this.am == 2.14748365E9f) {
            if (b.c()) {
                this.am = a.a("tt_sdk_settings", "global_rate", 1.0f);
            } else {
                this.am = this.ak.b("global_rate", 1.0f);
            }
        }
        return this.am == 1.0f;
    }

    public boolean G() {
        if (this.al == Integer.MAX_VALUE) {
            if (b.c()) {
                this.al = a.a("tt_sdk_settings", "read_video_from_cache", 1);
            } else {
                this.al = this.ak.b("read_video_from_cache", 1);
            }
        }
        if (this.al == 1) {
            return true;
        }
        return false;
    }

    public int H() {
        if (this.L == Integer.MAX_VALUE) {
            if (b.c()) {
                this.L = a.a("tt_sdk_settings", "webview_cache_count", 20);
            } else {
                this.L = this.ak.b("webview_cache_count", 20);
            }
        }
        int i2 = this.L;
        if (i2 < 0) {
            return 20;
        }
        return i2;
    }

    public int I() {
        return this.ap;
    }
}
