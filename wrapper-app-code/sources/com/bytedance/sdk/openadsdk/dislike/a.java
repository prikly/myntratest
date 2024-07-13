package com.bytedance.sdk.openadsdk.dislike;

import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.n;
import java.util.List;

/* compiled from: DislikeDispatcher */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f1887a;

    /* renamed from: b  reason: collision with root package name */
    private final n<com.bytedance.sdk.openadsdk.b.a> f1888b = m.f();

    private a() {
    }

    public static a a() {
        if (f1887a == null) {
            synchronized (a.class) {
                if (f1887a == null) {
                    f1887a = new a();
                }
            }
        }
        return f1887a;
    }

    public void a(com.bytedance.sdk.openadsdk.core.e.n nVar, List<FilterWord> list) {
        this.f1888b.a(nVar, list);
    }
}
