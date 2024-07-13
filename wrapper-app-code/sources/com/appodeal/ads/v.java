package com.appodeal.ads;

import android.text.TextUtils;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.networking.LoadingError;

public final class v extends o<r<Object>, l> {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ l f17603d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ r f17604e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ u f17605f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(u uVar, r rVar, l lVar, int i, l lVar2, r rVar2) {
        super(rVar, lVar, i);
        this.f17605f = uVar;
        this.f17603d = lVar2;
        this.f17604e = rVar2;
    }

    public final void a() {
        n0 k = q4.k();
        AdType adType = this.f17605f.f17435f;
        double ecpm = this.f17603d.f16570c.getEcpm();
        l lVar = this.f17603d;
        k.d(adType, ecpm, lVar.f16571d, lVar.f16570c.getAdUnitName());
        b0<AdObjectType, AdRequestType, ?> b0Var = this.f17605f.f17433d;
        r rVar = this.f17604e;
        l lVar2 = this.f17603d;
        b0Var.getClass();
        rVar.getClass();
        if (lVar2 != null && !TextUtils.isEmpty(lVar2.f16570c.getId())) {
            lVar2.f16570c.b(System.currentTimeMillis());
        }
        b0Var.f16300a.a(LogConstants.EVENT_LOAD_START, (AdUnit) lVar2, (LoadingError) null);
    }
}
