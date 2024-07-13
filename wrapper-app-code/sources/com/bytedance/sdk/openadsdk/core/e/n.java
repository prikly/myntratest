package com.bytedance.sdk.openadsdk.core.e;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.bykv.vk.openvk.component.video.api.c.b;
import com.bykv.vk.openvk.component.video.api.c.c;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.u;
import com.onesignal.outcomes.OSOutcomeConstants;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import io.bidmachine.utils.IabUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MaterialMeta */
public class n {
    private int A = 0;
    private long B;
    private int C;
    private int D;
    private b E;
    private b F;
    private boolean G;
    private int H;
    private Map<String, Object> I;
    private a J;
    private String K;
    private JSONObject L;
    private int M = 0;
    private int N = 1;
    private String O = "";
    private f P = new f();
    private int Q = AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES;
    private int R = 0;
    private AdSlot S;
    private int T;
    private int U = 1;
    private String V;
    private int W = 0;
    private int X = 0;
    private int Y = 0;
    private JSONObject Z;

    /* renamed from: a  reason: collision with root package name */
    public boolean f1126a = false;
    private int aa = 1;
    private int ab;
    private String ac;
    private String ad;
    private i ae;
    private int af = 1;
    private float ag = 100.0f;
    private String ah;
    private int ai;
    private int aj;
    private int ak;
    private int al;
    private int am = 2;
    private int an = 1;
    private int ao = 0;
    private int ap;
    private m aq;
    private p ar;
    private boolean as;
    private com.bytedance.sdk.openadsdk.core.j.a at;
    private boolean au;
    private String av;
    private JSONObject aw;
    private int ax = 0;
    private String ay;
    private d az;

    /* renamed from: b  reason: collision with root package name */
    private int f1127b;

    /* renamed from: c  reason: collision with root package name */
    private int f1128c;

    /* renamed from: d  reason: collision with root package name */
    private int f1129d;

    /* renamed from: e  reason: collision with root package name */
    private k f1130e;

    /* renamed from: f  reason: collision with root package name */
    private k f1131f;

    /* renamed from: g  reason: collision with root package name */
    private String f1132g;

    /* renamed from: h  reason: collision with root package name */
    private List<k> f1133h = new ArrayList();
    private String i;
    private List<String> j = new ArrayList();
    private List<String> k = new ArrayList();
    private List<String> l = new ArrayList();
    private String m;
    private String n;
    private String o;
    private String p = BuildConfig.ADAPTER_VERSION;
    private c q;
    private h r;
    private int s;
    private String t;
    private String u;
    private String v;
    private String w = "";
    private int x = 0;
    private int y = 2;
    private List<FilterWord> z = new ArrayList();

    public static c a(String str, n nVar) {
        u.a(nVar);
        nVar.A(0);
        nVar.B(0);
        return new c(str, nVar.J(), nVar.aF(), nVar.aD(), nVar.aE());
    }

    public static boolean a(n nVar) {
        return (nVar == null || nVar.J() == null || nVar.J().d() == 0) ? false : true;
    }

    public static boolean a(n nVar, boolean z2, boolean z3, boolean z4) {
        b bVar;
        b bVar2;
        if (a(nVar) || z4 || nVar == null || (bVar = nVar.E) == null || TextUtils.isEmpty(bVar.j())) {
            return false;
        }
        if (nVar == null || (bVar2 = nVar.E) == null || bVar2.a() != 1) {
            l.b("MaterialMeta", "can show end card follow js WebViewClient");
            return z2;
        }
        l.b("MaterialMeta", "can show end card follow js");
        return z3;
    }

    private JSONObject b(FilterWord filterWord) {
        if (filterWord == null) {
            return null;
        }
        try {
            if (filterWord.isValid()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(OSOutcomeConstants.OUTCOME_ID, filterWord.getId());
                jSONObject.put("name", filterWord.getName());
                jSONObject.put("is_selected", filterWord.getIsSelected());
                if (filterWord.hasSecondOptions()) {
                    JSONArray jSONArray = new JSONArray();
                    for (FilterWord b2 : filterWord.getOptions()) {
                        jSONArray.put(b(b2));
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put("options", jSONArray);
                    }
                }
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r2 = r2.E;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(com.bytedance.sdk.openadsdk.core.e.n r2) {
        /*
            r0 = 0
            if (r2 == 0) goto L_0x0010
            com.bykv.vk.openvk.component.video.api.c.b r2 = r2.E
            if (r2 != 0) goto L_0x0008
            goto L_0x0010
        L_0x0008:
            int r2 = r2.a()
            r1 = 1
            if (r2 != r1) goto L_0x0010
            r0 = 1
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.e.n.b(com.bytedance.sdk.openadsdk.core.e.n):boolean");
    }

    public static boolean c(n nVar) {
        if (nVar == null) {
            return false;
        }
        return nVar.aw() || nVar.ad() == 5 || nVar.ad() == 15 || nVar.ad() == 50;
    }

    public int A() {
        return this.aa;
    }

    public void A(int i2) {
        this.ao = i2;
    }

    public int B() {
        return this.ab;
    }

    public void B(int i2) {
        this.ap = i2;
    }

    public int C() {
        return this.D;
    }

    public void C(int i2) {
        this.ax = i2;
    }

    public String D() {
        return this.K;
    }

    public boolean E() {
        return C() == 100;
    }

    public int F() {
        return this.H;
    }

    public a G() {
        return this.J;
    }

    public com.bytedance.sdk.component.adexpress.a.c.c H() {
        if (G() == null) {
            return null;
        }
        String b2 = G().b();
        String d2 = G().d();
        String c2 = G().c();
        String e2 = G().e();
        String a2 = G().a();
        int f2 = u.f(this);
        com.bytedance.sdk.component.adexpress.a.c.c e3 = com.bytedance.sdk.component.adexpress.a.c.c.a().a(b2).b(c2).c(d2).d(e2).e(a2);
        return e3.f(f2 + "");
    }

    public int I() {
        i iVar = this.ae;
        if (iVar == null) {
            return 0;
        }
        return iVar.a();
    }

    public b J() {
        return this.E;
    }

    public String K() {
        return this.t;
    }

    public int L() {
        return this.f1127b;
    }

    public k M() {
        return this.f1130e;
    }

    public k N() {
        return this.f1131f;
    }

    public String O() {
        return this.f1132g;
    }

    public List<k> P() {
        return this.f1133h;
    }

    public String Q() {
        return this.i;
    }

    public List<String> R() {
        return this.j;
    }

    public List<String> S() {
        return this.k;
    }

    public List<String> T() {
        return this.l;
    }

    public String U() {
        return this.m;
    }

    public String V() {
        return this.n;
    }

    public String W() {
        String str;
        if (!TextUtils.isEmpty(this.o)) {
            return this.o;
        }
        Context a2 = m.a();
        int L2 = L();
        if (L2 == 2 || L2 == 3) {
            if (a2 == null) {
                return this.o;
            }
            str = "tt_video_mobile_go_detail";
        } else if (L2 != 4) {
            return this.o;
        } else {
            if (a2 == null) {
                return this.o;
            }
            str = "tt_video_download_apk";
        }
        return t.a(a2, str);
    }

    public String X() {
        return this.o;
    }

    public String Y() {
        return this.p;
    }

    public String Z() {
        return this.u;
    }

    public m a() {
        return this.aq;
    }

    public void a(double d2) {
        this.an = (d2 == 2.0d || d2 == 1.0d) ? (int) d2 : 1;
    }

    public void a(float f2) {
        this.ag = f2;
    }

    public void a(int i2) {
        a(i2, -1);
    }

    public void a(int i2, int i3) {
        int i4;
        this.f1129d = i2;
        this.f1128c = i2;
        if (this.S == null) {
            this.f1128c = 0;
            return;
        }
        if (i3 <= 0) {
            i3 = u.e(this);
        }
        if (this.S.getNativeAdType() == 3 || this.S.getDurationSlotType() == 3 || i3 == 3) {
            i4 = 14;
        } else if (this.S.getNativeAdType() == 7 || this.S.getNativeAdType() == 8 || this.S.getDurationSlotType() == 7 || this.S.getDurationSlotType() == 8 || i3 == 7 || i3 == 8) {
            if (p.i(this)) {
                i4 = 12;
            } else if (p.a(this)) {
                i4 = 9;
            } else {
                if (this.f1129d == 5 && !l.c(this)) {
                    this.f1128c = 7;
                }
                if (this.f1129d == 6 && !l.b(this)) {
                    this.f1128c = 7;
                }
                if (this.f1129d == 8 && C() != 100) {
                    this.f1128c = 7;
                }
                if (i2 < 5) {
                    this.f1128c = 7;
                    return;
                }
                return;
            }
        } else if (p.a(this)) {
            this.f1128c = 4;
            return;
        } else {
            if (this.f1129d == 4 && !p.a(this)) {
                this.f1128c = 0;
            }
            if (i2 >= 5) {
                this.f1128c = 0;
                return;
            } else if (this.f1129d == 2 && L() != 3) {
                this.f1128c = 0;
                return;
            } else if (i2 == 0 || (i2 == 1 && L() != 3)) {
                this.f1128c = 0;
                return;
            } else {
                return;
            }
        }
        this.f1128c = i4;
    }

    public void a(long j2) {
        this.B = j2;
    }

    public void a(b bVar) {
        this.E = bVar;
    }

    public void a(AdSlot adSlot) {
        this.S = adSlot;
    }

    public void a(FilterWord filterWord) {
        this.z.add(filterWord);
    }

    public void a(c cVar) {
        this.q = cVar;
    }

    public void a(d dVar) {
        this.az = dVar;
    }

    public void a(f fVar) {
        this.P = fVar;
    }

    public void a(h hVar) {
        this.r = hVar;
    }

    public void a(i iVar) {
        this.ae = iVar;
    }

    public void a(k kVar) {
        this.f1130e = kVar;
    }

    public void a(m mVar) {
        this.aq = mVar;
    }

    public void a(a aVar) {
        this.J = aVar;
        com.bytedance.sdk.component.adexpress.a.c.c H2 = H();
        if (H2 != null) {
            com.bytedance.sdk.component.adexpress.a.b.a.a(H2);
        }
    }

    public void a(p pVar) {
        this.ar = pVar;
    }

    public void a(com.bytedance.sdk.openadsdk.core.j.a aVar) {
        this.at = aVar;
    }

    public void a(String str) {
        this.w = str;
    }

    public void a(Map<String, Object> map) {
        this.I = map;
    }

    public void a(JSONObject jSONObject) {
        this.Z = jSONObject;
    }

    public void a(boolean z2) {
        this.f1126a = z2;
    }

    public int aA() {
        JSONObject jSONObject = this.aw;
        if (jSONObject != null) {
            return jSONObject.optInt("easy_playable_skip_duration", 0);
        }
        return 0;
    }

    public JSONObject aB() {
        return this.aw;
    }

    public com.bytedance.sdk.component.widget.b.a aC() {
        com.bytedance.sdk.component.widget.b.a aVar = new com.bytedance.sdk.component.widget.b.a();
        aVar.a(this.H);
        aVar.b(this.p);
        aVar.a(ac());
        return aVar;
    }

    public int aD() {
        return this.ao;
    }

    public int aE() {
        return this.ap;
    }

    public b aF() {
        return this.F;
    }

    public boolean aG() {
        b bVar = this.E;
        return bVar == null || bVar.q() != 1;
    }

    public JSONObject aH() {
        if (this.L == null) {
            try {
                if (!TextUtils.isEmpty(this.v)) {
                    this.L = new JSONObject(this.v);
                }
            } catch (JSONException unused) {
            }
        }
        return this.L;
    }

    public int aI() {
        return this.ax;
    }

    public String aJ() {
        return this.ay;
    }

    public c aa() {
        return this.q;
    }

    public h ab() {
        return this.r;
    }

    public String ac() {
        return this.v;
    }

    public int ad() {
        return this.s;
    }

    public List<FilterWord> ae() {
        return this.z;
    }

    public String af() {
        return this.ad;
    }

    public long ag() {
        return this.B;
    }

    public int ah() {
        return this.C;
    }

    public boolean ai() {
        return this.G;
    }

    public Map<String, Object> aj() {
        return this.I;
    }

    public JSONObject ak() {
        return this.Z;
    }

    public String al() {
        return this.V;
    }

    public int am() {
        if (this.af != 2) {
            this.af = 1;
        }
        return this.af;
    }

    public float an() {
        if (this.ag <= 0.0f) {
            this.ag = 100.0f;
        }
        return (this.ag * 1000.0f) / 1000.0f;
    }

    public boolean ao() {
        if (this.f1133h.isEmpty()) {
            return false;
        }
        if (this.s == 4 && this.f1133h.size() < 3) {
            return false;
        }
        for (k e2 : this.f1133h) {
            if (!e2.e()) {
                return false;
            }
        }
        return true;
    }

    public boolean ap() {
        return !this.as && aq() == 1;
    }

    public int aq() {
        return this.A;
    }

    public JSONObject ar() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("interaction_type", L());
            jSONObject.put("interaction_method", g());
            jSONObject.put("target_url", O());
            jSONObject.put("app_log_url", Z());
            jSONObject.put("gecko_id", af());
            jSONObject.put("extension", aB());
            jSONObject.put("ad_id", Y());
            jSONObject.put("source", K());
            jSONObject.put("screenshot", ai());
            jSONObject.put("dislike_control", aq());
            jSONObject.put("play_bar_show_time", z());
            jSONObject.put("play_bar_style", v());
            jSONObject.put("if_block_lp", m());
            jSONObject.put("cache_sort", A());
            jSONObject.put("if_sp_cache", B());
            jSONObject.put("render_control", l());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(IabUtils.KEY_CTA, i());
            jSONObject2.put("other", h());
            jSONObject.put("set_click_type", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("reward_name", j());
            jSONObject3.put("reward_amount", k());
            jSONObject.put("reward_data", jSONObject3);
            k M2 = M();
            if (M2 != null) {
                if (!TextUtils.isEmpty(M2.a())) {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("url", M2.a());
                    jSONObject4.put(IabUtils.KEY_HEIGHT, M2.c());
                    jSONObject4.put(IabUtils.KEY_WIDTH, M2.b());
                    jSONObject.put("icon", jSONObject4);
                }
            }
            k N2 = N();
            if (N2 != null && !TextUtils.isEmpty(N2.a())) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("url", N2.a());
                jSONObject5.put(IabUtils.KEY_HEIGHT, N2.c());
                jSONObject5.put(IabUtils.KEY_WIDTH, N2.b());
                jSONObject.put("cover_image", jSONObject5);
            }
            JSONObject ak2 = ak();
            if (ak2 != null) {
                jSONObject.put("session_params", ak2);
            }
            f w2 = w();
            if (w2 != null) {
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("click_upper_content_area", w2.f1056a);
                jSONObject6.put("click_upper_non_content_area", w2.f1057b);
                jSONObject6.put("click_lower_content_area", w2.f1058c);
                jSONObject6.put("click_lower_non_content_area", w2.f1059d);
                jSONObject6.put("click_button_area", w2.f1060e);
                jSONObject6.put("click_video_area", w2.f1061f);
                jSONObject.put("click_area", jSONObject6);
            }
            AdSlot x2 = x();
            if (x2 != null) {
                jSONObject.put("adslot", x2.toJsonObj());
            }
            List<k> P2 = P();
            if (P2 != null) {
                JSONArray jSONArray = new JSONArray();
                for (k next : P2) {
                    JSONObject jSONObject7 = new JSONObject();
                    jSONObject7.put("url", next.a());
                    jSONObject7.put(IabUtils.KEY_HEIGHT, next.c());
                    jSONObject7.put(IabUtils.KEY_WIDTH, next.b());
                    jSONObject7.put("image_preview", next.f());
                    jSONObject7.put("image_key", next.g());
                    jSONArray.put(jSONObject7);
                }
                jSONObject.put("image", jSONArray);
            }
            List<String> R2 = R();
            if (R2 != null) {
                JSONArray jSONArray2 = new JSONArray();
                for (String put : R2) {
                    jSONArray2.put(put);
                }
                jSONObject.put("show_url", jSONArray2);
            }
            List<String> S2 = S();
            if (S2 != null) {
                JSONArray jSONArray3 = new JSONArray();
                for (String put2 : S2) {
                    jSONArray3.put(put2);
                }
                jSONObject.put("click_url", jSONArray3);
            }
            List<String> T2 = T();
            if (T2 != null) {
                JSONArray jSONArray4 = new JSONArray();
                for (String put3 : T2) {
                    jSONArray4.put(put3);
                }
                jSONObject.put("play_start", jSONArray4);
            }
            jSONObject.put("phone_num", Q());
            jSONObject.put("title", U());
            jSONObject.put("description", V());
            jSONObject.put("ext", ac());
            jSONObject.put("image_mode", ad());
            jSONObject.put("cover_click_area", C());
            jSONObject.put("intercept_flag", y());
            jSONObject.put("button_text", W());
            jSONObject.put("ad_logo", u());
            jSONObject.put("video_adaptation", t());
            jSONObject.put("feed_video_opentype", p());
            jSONObject.put(AdUnitActivity.EXTRA_ORIENTATION, am());
            jSONObject.put("aspect_ratio", (double) an());
            c aa2 = aa();
            if (aa2 != null) {
                JSONObject jSONObject8 = new JSONObject();
                jSONObject8.put("app_name", aa2.b());
                jSONObject8.put("package_name", aa2.c());
                jSONObject8.put("download_url", aa2.a());
                jSONObject8.put("score", aa2.d());
                jSONObject8.put("comment_num", aa2.e());
                jSONObject8.put("app_size", aa2.f());
                jSONObject.put("app", jSONObject8);
            }
            h ab2 = ab();
            if (ab2 != null) {
                JSONObject jSONObject9 = new JSONObject();
                jSONObject9.put("deeplink_url", ab2.a());
                jSONObject9.put("fallback_url", ab2.b());
                jSONObject9.put("fallback_type", ab2.c());
                jSONObject.put("deep_link", jSONObject9);
            }
            List<FilterWord> ae2 = ae();
            if (ae2 != null) {
                JSONArray jSONArray5 = new JSONArray();
                for (FilterWord b2 : ae2) {
                    JSONObject b3 = b(b2);
                    if (b3 != null) {
                        jSONArray5.put(b3);
                    }
                }
                jSONObject.put("filter_words", jSONArray5);
            }
            e().a(jSONObject);
            jSONObject.put("count_down", ah());
            jSONObject.put("expiration_time", ag());
            b J2 = J();
            if (J2 != null) {
                jSONObject.put("video", J2.p());
            }
            b aF = aF();
            if (aF != null) {
                jSONObject.put("h265_video", aF.p());
            }
            JSONObject jSONObject10 = new JSONObject();
            jSONObject10.put("if_send_click", I());
            jSONObject.put("download_conf", jSONObject10);
            if (aj() != null) {
                JSONObject jSONObject11 = new JSONObject();
                Set<Map.Entry<String, Object>> entrySet = aj().entrySet();
                if (entrySet != null && !entrySet.isEmpty()) {
                    for (Map.Entry next2 : entrySet) {
                        jSONObject11.put((String) next2.getKey(), next2.getValue());
                    }
                }
                jSONObject.put("media_ext", jSONObject11);
            }
            a G2 = G();
            if (G2 != null) {
                JSONObject jSONObject12 = new JSONObject();
                jSONObject12.put(OSOutcomeConstants.OUTCOME_ID, G2.b());
                jSONObject12.put("md5", G2.c());
                jSONObject12.put("url", G2.d());
                jSONObject12.put("data", G2.e());
                jSONObject12.put("diff_data", G2.f());
                jSONObject12.put(MediationMetaData.KEY_VERSION, G2.a());
                jSONObject12.put("dynamic_creative", G2.g());
                jSONObject.put("tpl_info", jSONObject12);
            }
            jSONObject.put("creative_extra", D());
            jSONObject.put("market_url", al());
            jSONObject.put("auction_price", s());
            jSONObject.put("ad_info", n());
            jSONObject.put("is_package_open", as());
            jSONObject.put("playable_duration_time", at());
            jSONObject.put("playable_endcard_close_time", au());
            jSONObject.put("endcard_close_time", av());
            JSONObject jSONObject13 = new JSONObject();
            jSONObject13.put("render_sequence", q());
            jSONObject13.put("backup_render_control", r());
            jSONObject.put("render", jSONObject13);
            if (this.aq == null) {
                m mVar = new m();
                this.aq = mVar;
                mVar.a("");
                this.aq.a(10);
                this.aq.b(20);
            }
            JSONObject jSONObject14 = new JSONObject();
            jSONObject14.put("onlylp_loading_maxtime", this.aq.a());
            jSONObject14.put("straight_lp_showtime", this.aq.b());
            jSONObject14.put("loading_text", this.aq.c());
            jSONObject.put("interaction_method_params", jSONObject14);
            JSONObject jSONObject15 = new JSONObject();
            jSONObject15.put("splash_clickarea", c());
            jSONObject15.put("splash_layout_id", d());
            jSONObject.put("splash_control", jSONObject15);
            if (this.au) {
                jSONObject.put("is_html", true);
                jSONObject.put("dsp_html", this.av);
            }
            if (this.as) {
                jSONObject.put("is_vast", true);
                jSONObject.put("vast_json", this.at.j());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public int as() {
        return this.ai;
    }

    public int at() {
        int i2 = this.aj;
        if (i2 > 0) {
            return i2;
        }
        return 20;
    }

    public int au() {
        return this.ak;
    }

    public int av() {
        return this.al;
    }

    public boolean aw() {
        return this.as;
    }

    public com.bytedance.sdk.openadsdk.core.j.a ax() {
        if (this.as) {
            return this.at;
        }
        return null;
    }

    public boolean ay() {
        return this.au;
    }

    public String az() {
        return this.av;
    }

    public d b() {
        return this.az;
    }

    public void b(double d2) {
        this.am = (d2 == 2.0d || d2 == 1.0d) ? (int) d2 : 2;
    }

    public void b(int i2) {
        this.f1128c = i2;
    }

    public void b(b bVar) {
        this.F = bVar;
    }

    public void b(k kVar) {
        this.f1131f = kVar;
    }

    public void b(String str) {
        this.ah = str;
    }

    public void b(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f1127b = 4;
            this.p = jSONObject.optString(OSOutcomeConstants.OUTCOME_ID);
            this.t = jSONObject.optString("source");
            c cVar = new c();
            this.q = cVar;
            cVar.c(jSONObject.optString("pkg_name"));
            this.q.b(jSONObject.optString("name"));
            this.q.a(jSONObject.optString("download_url"));
        }
    }

    public void b(boolean z2) {
        this.G = z2;
    }

    public int c() {
        d dVar = this.az;
        if (dVar == null) {
            return 2;
        }
        return dVar.a();
    }

    public void c(int i2) {
        this.x = i2;
    }

    public void c(k kVar) {
        this.f1133h.add(kVar);
    }

    public void c(String str) {
        this.ac = str;
    }

    public void c(JSONObject jSONObject) {
        this.aw = jSONObject;
    }

    public void c(boolean z2) {
        this.as = z2;
    }

    public int d() {
        d dVar = this.az;
        if (dVar == null) {
            return 1;
        }
        return dVar.b();
    }

    public void d(int i2) {
        this.y = i2;
    }

    public void d(String str) {
        this.K = str;
    }

    public void d(boolean z2) {
        this.au = z2;
    }

    public p e() {
        return this.ar;
    }

    public void e(int i2) {
        this.W = i2;
    }

    public void e(String str) {
        this.t = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.p.equals(nVar.p) && this.v.equals(nVar.v);
    }

    public int f() {
        return this.f1128c;
    }

    public void f(int i2) {
        this.Y = i2;
    }

    public void f(String str) {
        this.f1132g = str;
    }

    public int g() {
        return this.f1129d;
    }

    public void g(int i2) {
        this.M = i2;
    }

    public void g(String str) {
        this.i = str;
    }

    public int h() {
        return this.an;
    }

    public void h(int i2) {
        this.N = i2;
    }

    public void h(String str) {
        this.m = str;
    }

    public int hashCode() {
        return (this.p.hashCode() * 31) + this.v.hashCode();
    }

    public int i() {
        return this.am;
    }

    public void i(int i2) {
        this.X = i2;
    }

    public void i(String str) {
        this.n = str;
    }

    public String j() {
        return this.w;
    }

    public void j(int i2) {
        this.U = i2;
    }

    public void j(String str) {
        this.o = str;
    }

    public int k() {
        return this.x;
    }

    public void k(int i2) {
        this.R = i2;
    }

    public void k(String str) {
        this.p = str;
    }

    public int l() {
        int i2 = this.f1128c;
        if (i2 == 5 || i2 == 6) {
            return 1;
        }
        return this.y;
    }

    public void l(int i2) {
        this.T = i2;
    }

    public void l(String str) {
        this.u = str;
    }

    public int m() {
        return this.W;
    }

    public void m(int i2) {
        this.Q = i2;
    }

    public void m(String str) {
        this.v = str;
    }

    public String n() {
        return this.ah;
    }

    public void n(int i2) {
        this.aa = i2;
    }

    public void n(String str) {
        this.ad = str;
    }

    public void o(int i2) {
        this.ab = i2;
    }

    public void o(String str) {
        this.V = str;
    }

    public boolean o() {
        return this.W == 1;
    }

    public int p() {
        return this.Y;
    }

    public void p(int i2) {
        this.D = i2;
    }

    public void p(String str) {
        this.av = str;
    }

    public int q() {
        return this.M;
    }

    public void q(int i2) {
        this.H = i2;
    }

    public void q(String str) {
        this.ay = str;
    }

    public int r() {
        return this.N;
    }

    public void r(int i2) {
        this.f1127b = i2;
    }

    public String s() {
        return this.ac;
    }

    public void s(int i2) {
        this.s = i2;
    }

    public int t() {
        return this.X;
    }

    public void t(int i2) {
        this.C = i2;
    }

    public int u() {
        return this.U;
    }

    public void u(int i2) {
        this.af = i2;
    }

    public int v() {
        if (aw()) {
            return 5;
        }
        if (an() != 100.0f || l() == 2) {
            return 0;
        }
        return this.R;
    }

    public void v(int i2) {
        this.A = i2;
    }

    public f w() {
        return this.P;
    }

    public void w(int i2) {
        this.ai = i2;
    }

    public AdSlot x() {
        return this.S;
    }

    public void x(int i2) {
        this.aj = i2;
    }

    public int y() {
        return this.T;
    }

    public void y(int i2) {
        this.ak = i2;
    }

    public int z() {
        return this.Q;
    }

    public void z(int i2) {
        this.al = i2;
    }

    /* compiled from: MaterialMeta */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f1134a;

        /* renamed from: b  reason: collision with root package name */
        private String f1135b;

        /* renamed from: c  reason: collision with root package name */
        private String f1136c;

        /* renamed from: d  reason: collision with root package name */
        private String f1137d;

        /* renamed from: e  reason: collision with root package name */
        private String f1138e;

        /* renamed from: f  reason: collision with root package name */
        private String f1139f;

        /* renamed from: g  reason: collision with root package name */
        private String f1140g;

        public String a() {
            return this.f1139f;
        }

        public void a(String str) {
            this.f1139f = str;
        }

        public String b() {
            return this.f1134a;
        }

        public void b(String str) {
            this.f1134a = str;
        }

        public String c() {
            return this.f1135b;
        }

        public void c(String str) {
            this.f1135b = str;
        }

        public String d() {
            return this.f1136c;
        }

        public void d(String str) {
            this.f1136c = str;
        }

        public String e() {
            return this.f1137d;
        }

        public void e(String str) {
            this.f1137d = str;
        }

        public String f() {
            return this.f1138e;
        }

        public void f(String str) {
            this.f1138e = str;
        }

        public String g() {
            return this.f1140g;
        }

        public void g(String str) {
            this.f1140g = str;
        }
    }
}
