package com.applovin.impl.mediation.debugger.ui.b.a;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.mediation.debugger.b.c.b;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.g;
import com.applovin.sdk.R;
import kotlin.KotlinVersion;

public class a extends c {

    /* renamed from: a  reason: collision with root package name */
    private final b f14804a;
    private final Context o;

    public a(b bVar, Context context) {
        super(c.b.DETAIL);
        this.f14804a = bVar;
        this.o = context;
        this.f14860d = q();
        this.f14861e = r();
    }

    private SpannedString q() {
        return StringUtils.createSpannedString(this.f14804a.i(), c() ? -16777216 : -7829368, 18, 1);
    }

    private SpannedString r() {
        if (!c()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(s());
        spannableStringBuilder.append(new SpannableString("\n"));
        spannableStringBuilder.append(t());
        if (this.f14804a.a() == b.a.INVALID_INTEGRATION) {
            spannableStringBuilder.append(new SpannableString("\n"));
            spannableStringBuilder.append(StringUtils.createListItemDetailSpannedString("Invalid Integration", -65536));
        }
        return new SpannedString(spannableStringBuilder);
    }

    private SpannedString s() {
        if (!this.f14804a.d()) {
            return StringUtils.createListItemDetailSpannedString("SDK Missing", -65536);
        }
        if (!TextUtils.isEmpty(this.f14804a.j())) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("SDK\t\t\t\t\t  ", -7829368));
            spannableStringBuilder.append(StringUtils.createListItemDetailSpannedString(this.f14804a.j(), -16777216));
            return new SpannedString(spannableStringBuilder);
        }
        return StringUtils.createListItemDetailSpannedString(this.f14804a.e() ? "Retrieving SDK Version..." : "SDK Found", -16777216);
    }

    private SpannedString t() {
        if (!this.f14804a.e()) {
            return StringUtils.createListItemDetailSpannedString("Adapter Missing", -65536);
        }
        if (TextUtils.isEmpty(this.f14804a.k())) {
            return StringUtils.createListItemDetailSpannedString("Adapter Found", -16777216);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ADAPTER  ", -7829368));
        spannableStringBuilder.append(StringUtils.createListItemDetailSpannedString(this.f14804a.k(), -16777216));
        if (this.f14804a.f()) {
            spannableStringBuilder.append(StringUtils.createListItemDetailSubSpannedString("  LATEST  ", Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 127, 0)));
            spannableStringBuilder.append(StringUtils.createListItemDetailSpannedString(this.f14804a.l(), -16777216));
        }
        return new SpannedString(spannableStringBuilder);
    }

    public int a() {
        return c() ? R.drawable.applovin_ic_disclosure_arrow : super.g();
    }

    public int b() {
        return g.a(R.color.applovin_sdk_disclosureButtonColor, this.o);
    }

    public boolean c() {
        return this.f14804a.a() != b.a.MISSING;
    }

    public b f() {
        return this.f14804a;
    }

    public int g() {
        int o2 = this.f14804a.o();
        return o2 > 0 ? o2 : R.drawable.applovin_ic_mediation_placeholder;
    }

    public String toString() {
        return "MediatedNetworkListItemViewModel{text=" + this.f14860d + ", detailText=" + this.f14861e + ", network=" + this.f14804a + "}";
    }
}
