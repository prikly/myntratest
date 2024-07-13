package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.U1;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/* renamed from: com.yandex.metrica.impl.ob.n6  reason: case insensitive filesystem */
public class C0573n6 {

    /* renamed from: a  reason: collision with root package name */
    private final B0 f6302a;

    /* renamed from: b  reason: collision with root package name */
    private final C0548m6 f6303b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f6304c;

    /* renamed from: d  reason: collision with root package name */
    private final C0758um f6305d;

    public C0573n6(Context context) {
        this(context, new B0(), new C0548m6(), C0758um.a(context));
    }

    public void a(U1.f fVar) {
        File a2 = this.f6302a.a(this.f6304c, "appmetrica_crashes");
        if (this.f6303b.a(a2)) {
            A3 a3 = fVar.a().a();
            String str = a3.g() + "-" + a3.h();
            C0710sm a4 = this.f6305d.a(str);
            PrintWriter printWriter = null;
            try {
                a4.a();
                this.f6302a.getClass();
                PrintWriter printWriter2 = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(a2, str))));
                try {
                    printWriter2.write(new Z6(fVar.b(), fVar.a(), fVar.c()).k());
                    A2.a((Closeable) printWriter2);
                    a4.c();
                } catch (IOException unused) {
                    printWriter = printWriter2;
                    A2.a((Closeable) printWriter);
                    a4.c();
                }
            } catch (IOException unused2) {
                A2.a((Closeable) printWriter);
                a4.c();
            }
        }
    }

    C0573n6(Context context, B0 b0, C0548m6 m6Var, C0758um umVar) {
        this.f6304c = context;
        this.f6302a = b0;
        this.f6303b = m6Var;
        this.f6305d = umVar;
    }
}
