package com.criteo.publisher.n0;

import android.content.Context;
import com.criteo.publisher.model.AdSize;

/* compiled from: AndroidUtil */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2885a;

    /* renamed from: b  reason: collision with root package name */
    private final k f2886b;

    public c(Context context, k kVar) {
        this.f2885a = context;
        this.f2886b = kVar;
    }

    public int a() {
        AdSize a2 = this.f2886b.a();
        return a2.getWidth() < a2.getHeight() ? 1 : 2;
    }

    public int a(int i) {
        return (int) Math.ceil((double) (((float) i) * this.f2885a.getResources().getDisplayMetrics().density));
    }
}
