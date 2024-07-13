package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.google.protobuf.nano.ym.MessageNano;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.j6  reason: case insensitive filesystem */
public final class C0473j6 {

    /* renamed from: a  reason: collision with root package name */
    private final String f6026a = "session_extras";

    /* renamed from: b  reason: collision with root package name */
    private final C0399g6 f6027b = new C0399g6();

    /* renamed from: c  reason: collision with root package name */
    private final C0449i6 f6028c = new C0449i6();

    /* renamed from: d  reason: collision with root package name */
    private final R7 f6029d;

    public C0473j6(Context context, I3 i3) {
        i3.a();
        R7 a2 = C0477ja.a(context).a(i3);
        Intrinsics.checkNotNullExpressionValue(a2, "DatabaseStorageFactory.g…Id\") !no-logs*/\n        }");
        this.f6029d = a2;
    }

    public final Map<String, byte[]> a() {
        try {
            byte[] a2 = this.f6029d.a(this.f6026a);
            if (a2 != null) {
                if (!(a2.length == 0)) {
                    C0399g6 g6Var = this.f6027b;
                    this.f6028c.getClass();
                    Gf gf = (Gf) MessageNano.mergeFrom(new Gf(), a2);
                    Intrinsics.checkNotNullExpressionValue(gf, "SessionExtrasProtobuf.Se…ionExtras.parseFrom(data)");
                    return g6Var.toModel(gf);
                }
            }
        } catch (Throwable unused) {
        }
        C0399g6 g6Var2 = this.f6027b;
        this.f6028c.getClass();
        return g6Var2.toModel(new Gf());
    }

    public final void a(Map<String, byte[]> map) {
        R7 r7 = this.f6029d;
        String str = this.f6026a;
        C0449i6 i6Var = this.f6028c;
        Gf a2 = this.f6027b.fromModel(map);
        i6Var.getClass();
        r7.a(str, MessageNano.toByteArray(a2));
    }
}
