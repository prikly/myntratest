package com.appodeal.ads.initializing;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f16486a = new ArrayList();

    public final ArrayList a() {
        return this.f16486a;
    }

    public final void a(ApdInitializationError apdInitializationError) {
        Intrinsics.checkNotNullParameter(apdInitializationError, "error");
        this.f16486a.add(apdInitializationError);
    }

    public final void clear() {
        this.f16486a.clear();
    }
}
