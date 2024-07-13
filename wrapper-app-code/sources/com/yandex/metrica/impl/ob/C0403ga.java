package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.core.api.ProtobufStateStorage;

/* renamed from: com.yandex.metrica.impl.ob.ga  reason: case insensitive filesystem */
public abstract class C0403ga<T> implements C0378fa<T> {
    public ProtobufStateStorage<T> a(Context context) {
        return a(context, c(context));
    }

    /* access modifiers changed from: protected */
    public abstract ProtobufStateStorage<T> a(Context context, R7 r7);

    public ProtobufStateStorage<T> b(Context context) {
        return a(context, d(context));
    }

    /* access modifiers changed from: protected */
    public abstract R7 c(Context context);

    /* access modifiers changed from: protected */
    public abstract R7 d(Context context);
}
