package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.billing_interface.a;
import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.impl.ob.C0378fa;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.c3  reason: case insensitive filesystem */
public class C0296c3 implements C0566n {

    /* renamed from: a  reason: collision with root package name */
    private final ProtobufStateStorage<X2> f5589a;

    /* renamed from: b  reason: collision with root package name */
    private X2 f5590b;

    public C0296c3(Context context) {
        this(C0378fa.b.a(X2.class).a(context));
    }

    public void a(List<a> list, boolean z) {
        for (a next : list) {
        }
        X2 x2 = new X2(list, z);
        this.f5590b = x2;
        this.f5589a.save(x2);
    }

    public boolean b() {
        return this.f5590b.f5286b;
    }

    C0296c3(ProtobufStateStorage<X2> protobufStateStorage) {
        this.f5589a = protobufStateStorage;
        this.f5590b = (X2) protobufStateStorage.read();
    }

    public List<a> a() {
        return this.f5590b.f5285a;
    }
}
