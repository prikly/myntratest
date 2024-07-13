package com.applovin.impl.a.a.b.a.a;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.g;
import com.applovin.sdk.R;

public class a extends c {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.a.a.a.a f13977a;
    private final Context o;

    public a(com.applovin.impl.a.a.a.a aVar, Context context) {
        super(c.b.DETAIL);
        this.f13977a = aVar;
        this.o = context;
        this.f14860d = q();
        this.f14861e = r();
    }

    private SpannedString q() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(this.f13977a.a());
        spannableStringBuilder.append(" - ");
        spannableStringBuilder.append(this.f13977a.b());
        return new SpannedString(spannableStringBuilder);
    }

    private SpannedString r() {
        return new SpannedString("Displayed " + Utils.getPrettyDate(this.f13977a.d(), true));
    }

    public int a() {
        return c() ? R.drawable.applovin_ic_disclosure_arrow : super.g();
    }

    public int b() {
        return g.a(R.color.applovin_sdk_disclosureButtonColor, this.o);
    }

    public boolean c() {
        return true;
    }
}
