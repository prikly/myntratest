package com.appodeal.ads;

import com.appodeal.ads.api.Stats;

public enum e0 {
    Successful(Stats.AdUnitRequestResult.SUCCESSFUL),
    NoFill(Stats.AdUnitRequestResult.NOFILL),
    TimeOutReached(Stats.AdUnitRequestResult.TIMEOUTREACHED),
    Exception(Stats.AdUnitRequestResult.EXCEPTION),
    UndefinedAdapter(Stats.AdUnitRequestResult.UNDEFINEDADAPTER),
    IncorrectAdunit(Stats.AdUnitRequestResult.INCORRECTADUNIT),
    InvalidAssets(Stats.AdUnitRequestResult.INVALIDASSETS),
    Canceled(Stats.AdUnitRequestResult.CANCELED),
    IncorrectCreative(Stats.AdUnitRequestResult.EXCEPTION);
    

    /* renamed from: a  reason: collision with root package name */
    public final Stats.AdUnitRequestResult f16384a;

    /* access modifiers changed from: public */
    e0(Stats.AdUnitRequestResult adUnitRequestResult) {
        this.f16384a = adUnitRequestResult;
    }

    public final Stats.AdUnitRequestResult a() {
        return this.f16384a;
    }
}
