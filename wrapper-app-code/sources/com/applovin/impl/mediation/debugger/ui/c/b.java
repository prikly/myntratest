package com.applovin.impl.mediation.debugger.ui.c;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import com.applovin.impl.mediation.debugger.b.c.b;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.mediation.debugger.ui.d.e;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.g;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.R;
import com.appodeal.ads.modules.common.internal.LogConstants;
import java.util.ArrayList;
import java.util.List;

public class b extends d {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.mediation.debugger.b.c.b f14836a;

    /* renamed from: b  reason: collision with root package name */
    private List<c> f14837b;

    /* renamed from: d  reason: collision with root package name */
    private final List<c> f14838d;

    /* renamed from: e  reason: collision with root package name */
    private final List<c> f14839e;

    /* renamed from: f  reason: collision with root package name */
    private final List<c> f14840f;

    /* renamed from: g  reason: collision with root package name */
    private final List<c> f14841g;

    /* renamed from: h  reason: collision with root package name */
    private SpannedString f14842h;

    public enum a {
        INTEGRATIONS,
        PERMISSIONS,
        CONFIGURATION,
        DEPENDENCIES,
        TEST_ADS,
        f14848f
    }

    b(com.applovin.impl.mediation.debugger.b.c.b bVar, Context context) {
        super(context);
        this.f14836a = bVar;
        if (bVar.a() == b.a.INVALID_INTEGRATION) {
            SpannableString spannableString = new SpannableString("Tap for more information");
            spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, spannableString.length(), 33);
            this.f14842h = new SpannedString(spannableString);
        } else {
            this.f14842h = new SpannedString("");
        }
        this.f14837b = c();
        this.f14838d = a(bVar.r());
        this.f14839e = a(bVar.u());
        this.f14840f = b(bVar.s());
        this.f14841g = h();
        notifyDataSetChanged();
    }

    private int a(boolean z) {
        return z ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark;
    }

    private c a(b.C0146b bVar) {
        c.a p = c.p();
        if (bVar == b.C0146b.READY) {
            p.a(this.f14883c);
        }
        return p.a("Test Mode").b(bVar.a()).b(bVar.b()).c("Restart Required").d(bVar.c()).a(true).a();
    }

    private c a(String str, String str2, boolean z, boolean z2) {
        return c.a(z ? c.b.RIGHT_DETAIL : c.b.DETAIL).a(str).b(z ? null : this.f14842h).c("Instructions").d(str2).a(z ? R.drawable.applovin_ic_check_mark_bordered : b(z2)).c(z ? g.a(R.color.applovin_sdk_checkmarkColor, this.f14883c) : d(z2)).a(!z).a();
    }

    private List<c> a(com.applovin.impl.mediation.debugger.b.c.c cVar) {
        ArrayList arrayList = new ArrayList(1);
        if (cVar.a()) {
            arrayList.add(a("Cleartext Traffic", cVar.c(), cVar.b(), false));
        }
        if (this.f14836a.t()) {
            arrayList.add(a("Java 8", "For optimal performance, please enable Java 8 support. See: https://dash.applovin.com/documentation/mediation/android/getting-started/integration", n.B(), true));
        }
        return arrayList;
    }

    private List<c> a(List<com.applovin.impl.mediation.debugger.b.c.d> list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            for (com.applovin.impl.mediation.debugger.b.c.d next : list) {
                arrayList.add(a(next.a(), next.b(), next.c(), true));
            }
        }
        return arrayList;
    }

    private int b(boolean z) {
        return z ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_warning;
    }

    private List<c> b(List<com.applovin.impl.mediation.debugger.b.c.a> list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            for (com.applovin.impl.mediation.debugger.b.c.a next : list) {
                arrayList.add(a(next.a(), next.b(), next.c(), true));
            }
        }
        return arrayList;
    }

    private int c(boolean z) {
        return g.a(z ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f14883c);
    }

    private c c(List<String> list) {
        return c.p().a("Region/VPN Required").b(CollectionUtils.implode(list, ", ", list.size())).a();
    }

    private List<c> c() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(d());
        arrayList.add(f());
        arrayList.add(g());
        return arrayList;
    }

    private int d(boolean z) {
        return g.a(z ? R.color.applovin_sdk_xmarkColor : R.color.applovin_sdk_warningColor, this.f14883c);
    }

    private c d() {
        c.a b2 = c.p().a(LogConstants.KEY_SDK).b(this.f14836a.j());
        if (TextUtils.isEmpty(this.f14836a.j())) {
            b2.a(a(this.f14836a.d())).c(c(this.f14836a.d()));
        }
        return b2.a();
    }

    private String e(int i) {
        return (MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.getCode() == i || MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.getCode() == i || MaxAdapter.InitializationStatus.DOES_NOT_APPLY.getCode() == i) ? "Initialized" : MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() == i ? "Failure" : MaxAdapter.InitializationStatus.INITIALIZING.getCode() == i ? "Initializing..." : "Not Initialized";
    }

    private c f() {
        c.a b2 = c.p().a("Adapter").b(this.f14836a.k());
        if (TextUtils.isEmpty(this.f14836a.k())) {
            b2.a(a(this.f14836a.e())).c(c(this.f14836a.e()));
        }
        return b2.a();
    }

    private c g() {
        return c.p().a("Initialization Status").b(e(this.f14836a.b())).a(false).a();
    }

    private List<c> h() {
        ArrayList arrayList = new ArrayList(3);
        if (StringUtils.isValidString(this.f14836a.w())) {
            arrayList.add(c.a(c.b.DETAIL).a(this.f14836a.w()).a());
        }
        if (this.f14836a.c() == b.C0146b.NOT_SUPPORTED) {
            return arrayList;
        }
        if (this.f14836a.n() != null) {
            arrayList.add(c(this.f14836a.n()));
        }
        if (this.f14836a.x()) {
            arrayList.add(a("Not an Age Restricted User", "Test mode requires Age Restricted User (COPPA) to be set to false.", !AppLovinPrivacySettings.isAgeRestrictedUser(this.f14883c) && AppLovinPrivacySettings.isAgeRestrictedUserSet(this.f14883c), false));
        }
        arrayList.add(a(this.f14836a.c()));
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public int a(int i) {
        return (i == a.INTEGRATIONS.ordinal() ? this.f14837b : i == a.PERMISSIONS.ordinal() ? this.f14838d : i == a.CONFIGURATION.ordinal() ? this.f14839e : i == a.DEPENDENCIES.ordinal() ? this.f14840f : this.f14841g).size();
    }

    public com.applovin.impl.mediation.debugger.b.c.b a() {
        return this.f14836a;
    }

    public boolean a(com.applovin.impl.mediation.debugger.ui.d.a aVar) {
        return aVar.a() == a.TEST_ADS.ordinal() && aVar.b() == this.f14841g.size() - 1;
    }

    /* access modifiers changed from: protected */
    public c b(int i) {
        return i == a.INTEGRATIONS.ordinal() ? new e("INTEGRATIONS") : i == a.PERMISSIONS.ordinal() ? new e("PERMISSIONS") : i == a.CONFIGURATION.ordinal() ? new e("CONFIGURATION") : i == a.DEPENDENCIES.ordinal() ? new e("DEPENDENCIES") : new e("TEST ADS");
    }

    public void b() {
        this.f14837b = c();
    }

    /* access modifiers changed from: protected */
    public List<c> c(int i) {
        return i == a.INTEGRATIONS.ordinal() ? this.f14837b : i == a.PERMISSIONS.ordinal() ? this.f14838d : i == a.CONFIGURATION.ordinal() ? this.f14839e : i == a.DEPENDENCIES.ordinal() ? this.f14840f : this.f14841g;
    }

    /* access modifiers changed from: protected */
    public int e() {
        return a.f14848f.ordinal();
    }

    public String toString() {
        return "MediatedNetworkListAdapter{}";
    }
}
