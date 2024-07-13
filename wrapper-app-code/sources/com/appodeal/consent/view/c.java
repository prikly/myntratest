package com.appodeal.consent.view;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

public final class c extends Lambda implements Function0<Unit> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f17906a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(b bVar) {
        super(0);
        this.f17906a = bVar;
    }

    public final Object invoke() {
        b bVar = this.f17906a;
        b.a(bVar, bVar.getCloseJs());
        if (!this.f17906a.f17901g.getAndSet(true)) {
            this.f17906a.f17895a.a((JSONObject) null);
        }
        return Unit.INSTANCE;
    }
}
