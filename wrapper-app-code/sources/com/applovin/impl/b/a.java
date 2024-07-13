package com.applovin.impl.b;

import android.net.Uri;
import com.applovin.impl.b.n;
import com.applovin.impl.sdk.a.g;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.v;
import io.bidmachine.utils.IabUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public class a extends e {

    /* renamed from: a  reason: collision with root package name */
    private final String f14243a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14244b;

    /* renamed from: c  reason: collision with root package name */
    private final j f14245c;

    /* renamed from: d  reason: collision with root package name */
    private final long f14246d;

    /* renamed from: e  reason: collision with root package name */
    private final n f14247e;

    /* renamed from: f  reason: collision with root package name */
    private final d f14248f;

    /* renamed from: g  reason: collision with root package name */
    private final String f14249g;

    /* renamed from: h  reason: collision with root package name */
    private final c f14250h;
    private final g i;
    private final Set<k> j;
    private final Set<k> k;

    /* renamed from: com.applovin.impl.b.a$a  reason: collision with other inner class name */
    public static class C0139a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public JSONObject f14251a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public JSONObject f14252b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public com.applovin.impl.sdk.ad.b f14253c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public n f14254d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public long f14255e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public String f14256f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public String f14257g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public j f14258h;
        /* access modifiers changed from: private */
        public n i;
        /* access modifiers changed from: private */
        public d j;
        /* access modifiers changed from: private */
        public c k;
        /* access modifiers changed from: private */
        public Set<k> l;
        /* access modifiers changed from: private */
        public Set<k> m;

        public C0139a a(long j2) {
            this.f14255e = j2;
            return this;
        }

        public C0139a a(c cVar) {
            this.k = cVar;
            return this;
        }

        public C0139a a(d dVar) {
            this.j = dVar;
            return this;
        }

        public C0139a a(j jVar) {
            this.f14258h = jVar;
            return this;
        }

        public C0139a a(n nVar) {
            this.i = nVar;
            return this;
        }

        public C0139a a(com.applovin.impl.sdk.ad.b bVar) {
            this.f14253c = bVar;
            return this;
        }

        public C0139a a(n nVar) {
            if (nVar != null) {
                this.f14254d = nVar;
                return this;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }

        public C0139a a(String str) {
            this.f14256f = str;
            return this;
        }

        public C0139a a(Set<k> set) {
            this.l = set;
            return this;
        }

        public C0139a a(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f14251a = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No ad object specified.");
        }

        public a a() {
            return new a(this);
        }

        public C0139a b(String str) {
            this.f14257g = str;
            return this;
        }

        public C0139a b(Set<k> set) {
            this.m = set;
            return this;
        }

        public C0139a b(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f14252b = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No full ad response specified.");
        }
    }

    public enum b {
        COMPANION_AD,
        VIDEO
    }

    public enum c {
        IMPRESSION,
        VIDEO_CLICK,
        COMPANION_CLICK,
        VIDEO,
        COMPANION,
        INDUSTRY_ICON_IMPRESSION,
        INDUSTRY_ICON_CLICK,
        ERROR
    }

    private a(C0139a aVar) {
        super(aVar.f14251a, aVar.f14252b, aVar.f14253c, aVar.f14254d);
        this.f14243a = aVar.f14256f;
        this.f14245c = aVar.f14258h;
        this.f14244b = aVar.f14257g;
        this.f14247e = aVar.i;
        this.f14248f = aVar.j;
        this.f14250h = aVar.k;
        this.j = aVar.l;
        this.k = aVar.m;
        this.i = new g(this);
        Uri h2 = h();
        this.f14249g = h2 != null ? h2.toString() : "";
        this.f14246d = aVar.f14255e;
    }

    private Set<k> a(b bVar, String[] strArr) {
        d dVar;
        n nVar;
        if (strArr == null || strArr.length <= 0) {
            return Collections.emptySet();
        }
        Map<String, Set<k>> map = null;
        if (bVar == b.VIDEO && (nVar = this.f14247e) != null) {
            map = nVar.e();
        } else if (bVar == b.COMPANION_AD && (dVar = this.f14248f) != null) {
            map = dVar.d();
        }
        HashSet hashSet = new HashSet();
        if (map != null && !map.isEmpty()) {
            for (String str : strArr) {
                if (map.containsKey(str)) {
                    hashSet.addAll(map.get(str));
                }
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private String aX() {
        String stringFromAdObject = getStringFromAdObject("vimp_url", (String) null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace(Utils.MACRO_CLCODE, getClCode());
        }
        return null;
    }

    private n.a aY() {
        n.a[] values = n.a.values();
        int intValue = ((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.ev)).intValue();
        return (intValue < 0 || intValue >= values.length) ? n.a.UNSPECIFIED : values[intValue];
    }

    private Set<k> aZ() {
        n nVar = this.f14247e;
        return nVar != null ? nVar.d() : Collections.emptySet();
    }

    private Set<k> ba() {
        d dVar = this.f14248f;
        return dVar != null ? dVar.c() : Collections.emptySet();
    }

    public boolean E() {
        return getBooleanFromAdObject("video_clickable", false) && j() != null;
    }

    public Set<k> a(c cVar, String str) {
        return a(cVar, new String[]{str});
    }

    public Set<k> a(c cVar, String[] strArr) {
        this.sdk.D();
        if (v.a()) {
            v D = this.sdk.D();
            D.b("VastAd", "Retrieving trackers of type '" + cVar + "' and events '" + strArr + "'...");
        }
        if (cVar == c.IMPRESSION) {
            return this.j;
        }
        if (cVar == c.VIDEO_CLICK) {
            return aZ();
        }
        if (cVar == c.COMPANION_CLICK) {
            return ba();
        }
        if (cVar == c.VIDEO) {
            return a(b.VIDEO, strArr);
        }
        if (cVar == c.COMPANION) {
            return a(b.COMPANION_AD, strArr);
        }
        if (cVar == c.INDUSTRY_ICON_CLICK) {
            return aP().e();
        }
        if (cVar == c.INDUSTRY_ICON_IMPRESSION) {
            return aP().f();
        }
        if (cVar == c.ERROR) {
            return this.k;
        }
        this.sdk.D();
        if (v.a()) {
            v D2 = this.sdk.D();
            D2.e("VastAd", "Failed to retrieve trackers of invalid type '" + cVar + "' and events '" + strArr + "'");
        }
        return Collections.emptySet();
    }

    public void a() {
    }

    public void a(String str) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html_template", str);
        }
    }

    public n aM() {
        return this.f14247e;
    }

    public o aN() {
        n nVar = this.f14247e;
        if (nVar != null) {
            return nVar.a(aY());
        }
        return null;
    }

    public d aO() {
        return this.f14248f;
    }

    public g aP() {
        n nVar = this.f14247e;
        if (nVar != null) {
            return nVar.f();
        }
        return null;
    }

    public boolean aQ() {
        return aP() != null;
    }

    public boolean aR() {
        return getBooleanFromAdObject("vast_fire_click_trackers_on_html_clicks", false);
    }

    public String aS() {
        return getStringFromAdObject("html_template", "");
    }

    public Uri aT() {
        String stringFromAdObject = getStringFromAdObject("html_template_url", (String) null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public boolean aU() {
        return getBooleanFromAdObject("cache_companion_ad", true);
    }

    public boolean aV() {
        return getBooleanFromAdObject("cache_video", true);
    }

    public c aW() {
        return this.f14250h;
    }

    public List<com.applovin.impl.sdk.d.a> at() {
        List<com.applovin.impl.sdk.d.a> postbacks;
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("vimp_urls", this.adObject, getClCode(), (Map<String, String>) null, aX(), au(), z(), this.sdk);
        }
        return postbacks;
    }

    public void b() {
        synchronized (this.adObjectLock) {
            this.adObject.remove("vast_is_streaming");
        }
    }

    public boolean c() {
        return getBooleanFromAdObject("iopms", false);
    }

    public String d() {
        return this.f14249g;
    }

    public boolean e() {
        return getBooleanFromAdObject("iopmsfsr", true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a) || !super.equals(obj)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f14243a;
        if (str == null ? aVar.f14243a != null : !str.equals(aVar.f14243a)) {
            return false;
        }
        String str2 = this.f14244b;
        if (str2 == null ? aVar.f14244b != null : !str2.equals(aVar.f14244b)) {
            return false;
        }
        j jVar = this.f14245c;
        if (jVar == null ? aVar.f14245c != null : !jVar.equals(aVar.f14245c)) {
            return false;
        }
        n nVar = this.f14247e;
        if (nVar == null ? aVar.f14247e != null : !nVar.equals(aVar.f14247e)) {
            return false;
        }
        d dVar = this.f14248f;
        if (dVar == null ? aVar.f14248f != null : !dVar.equals(aVar.f14248f)) {
            return false;
        }
        c cVar = this.f14250h;
        if (cVar == null ? aVar.f14250h != null : !cVar.equals(aVar.f14250h)) {
            return false;
        }
        Set<k> set = this.j;
        if (set == null ? aVar.j != null : !set.equals(aVar.j)) {
            return false;
        }
        Set<k> set2 = this.k;
        Set<k> set3 = aVar.k;
        return set2 != null ? set2.equals(set3) : set3 == null;
    }

    public boolean f() {
        return getBooleanFromAdObject("vast_is_streaming", false);
    }

    /* renamed from: g */
    public g o() {
        return this.i;
    }

    public long getCreatedAtMillis() {
        return this.f14246d;
    }

    public JSONObject getOriginalFullResponse() {
        return this.fullResponse;
    }

    public Uri h() {
        o aN = aN();
        if (aN != null) {
            return aN.b();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasVideoUrl() {
        /*
            r2 = this;
            com.applovin.impl.b.n r0 = r2.f14247e
            r1 = 0
            if (r0 == 0) goto L_0x0012
            java.util.List r0 = r0.a()
            if (r0 == 0) goto L_0x0012
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0012
            r1 = 1
        L_0x0012:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.b.a.hasVideoUrl():boolean");
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f14243a;
        int i2 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14244b;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        j jVar = this.f14245c;
        int hashCode4 = (hashCode3 + (jVar != null ? jVar.hashCode() : 0)) * 31;
        n nVar = this.f14247e;
        int hashCode5 = (hashCode4 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        d dVar = this.f14248f;
        int hashCode6 = (hashCode5 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        c cVar = this.f14250h;
        int hashCode7 = (hashCode6 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        Set<k> set = this.j;
        int hashCode8 = (hashCode7 + (set != null ? set.hashCode() : 0)) * 31;
        Set<k> set2 = this.k;
        if (set2 != null) {
            i2 = set2.hashCode();
        }
        return hashCode8 + i2;
    }

    public long i() {
        return getLongFromAdObject("real_close_delay", 0);
    }

    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject(IabUtils.KEY_OM_SDK_ENABLED, true) && this.f14250h != null;
    }

    public Uri j() {
        n nVar = this.f14247e;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    public Uri k() {
        return j();
    }

    public b l() {
        return "companion_ad".equalsIgnoreCase(getStringFromAdObject("vast_first_caching_operation", "companion_ad")) ? b.COMPANION_AD : b.VIDEO;
    }

    public boolean m() {
        return getBooleanFromAdObject("vast_immediate_ad_load", true);
    }

    public j n() {
        return this.f14245c;
    }

    public String toString() {
        return "VastAd{title='" + this.f14243a + '\'' + ", adDescription='" + this.f14244b + '\'' + ", systemInfo=" + this.f14245c + ", videoCreative=" + this.f14247e + ", companionAd=" + this.f14248f + ", adVerifications=" + this.f14250h + ", impressionTrackers=" + this.j + ", errorTrackers=" + this.k + '}';
    }
}
