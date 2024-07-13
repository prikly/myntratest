package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.networking.binders.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g3 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f16429a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g3(b bVar) {
        super(1);
        this.f16429a = bVar;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        jsonObjectBuilder.hasValue(Constants.SHOW, Integer.valueOf(((b.C0192b) this.f16429a).a().g()));
        jsonObjectBuilder.hasValue(Intrinsics.stringPlus(((b.C0192b) this.f16429a).a().a(), "_show"), Integer.valueOf(((b.C0192b) this.f16429a).a().f()));
        jsonObjectBuilder.hasValue(Constants.CLICK, Integer.valueOf(((b.C0192b) this.f16429a).a().c()));
        jsonObjectBuilder.hasValue(Intrinsics.stringPlus(((b.C0192b) this.f16429a).a().a(), "_click"), Integer.valueOf(((b.C0192b) this.f16429a).a().b()));
        jsonObjectBuilder.hasValue(Constants.FINISH, Integer.valueOf(((b.C0192b) this.f16429a).a().e()));
        jsonObjectBuilder.hasValue(Intrinsics.stringPlus(((b.C0192b) this.f16429a).a().a(), "_finish"), ((b.C0192b) this.f16429a).a().d());
        return Unit.INSTANCE;
    }
}
