package com.criteo.publisher;

import com.criteo.publisher.n0.j;
import com.criteo.publisher.s;
import com.google.gson.GsonBuilder;

/* renamed from: com.criteo.publisher.-$$Lambda$s$zQMrgJNlFRpL9E_PwssipD0kMEs  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$s$zQMrgJNlFRpL9E_PwssipD0kMEs implements s.a {
    public static final /* synthetic */ $$Lambda$s$zQMrgJNlFRpL9E_PwssipD0kMEs INSTANCE = new $$Lambda$s$zQMrgJNlFRpL9E_PwssipD0kMEs();

    private /* synthetic */ $$Lambda$s$zQMrgJNlFRpL9E_PwssipD0kMEs() {
    }

    public final Object a() {
        return new GsonBuilder().registerTypeAdapterFactory(j.a()).create();
    }
}
