package com.applovin.impl.mediation.debugger.ui.b.a;

import android.content.Context;
import android.text.SpannedString;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.sdk.k;

public class b extends c {

    /* renamed from: a  reason: collision with root package name */
    private final k.a f14805a;
    private final Context o;
    private final boolean p;

    public b(k.a aVar, boolean z, Context context) {
        super(c.b.RIGHT_DETAIL);
        this.f14805a = aVar;
        this.o = context;
        this.f14860d = new SpannedString(aVar.a());
        this.p = z;
    }

    public boolean c() {
        return true;
    }

    public SpannedString i_() {
        return new SpannedString(this.f14805a.b(this.o));
    }

    public boolean j_() {
        Boolean a2 = this.f14805a.a(this.o);
        if (a2 != null) {
            return a2.equals(Boolean.valueOf(this.p));
        }
        return false;
    }
}
