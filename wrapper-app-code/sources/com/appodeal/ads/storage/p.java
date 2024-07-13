package com.appodeal.ads.storage;

import android.content.SharedPreferences;
import com.appodeal.ads.context.b;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function0<SharedPreferences> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ContextProvider f17409a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f17410b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(b bVar, String str) {
        super(0);
        this.f17409a = bVar;
        this.f17410b = str;
    }

    public final Object invoke() {
        return this.f17409a.getApplicationContext().getSharedPreferences(this.f17410b, 0);
    }
}
