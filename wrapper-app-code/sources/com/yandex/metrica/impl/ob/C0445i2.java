package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.ResultReceiver;
import com.yandex.metrica.CounterConfiguration;

/* renamed from: com.yandex.metrica.impl.ob.i2  reason: case insensitive filesystem */
public class C0445i2 {

    /* renamed from: a  reason: collision with root package name */
    private final String f5963a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f5964b;

    /* renamed from: c  reason: collision with root package name */
    private final CounterConfiguration.b f5965c;

    /* renamed from: d  reason: collision with root package name */
    private final C0494k2 f5966d;

    public C0445i2(String str, Context context, CounterConfiguration.b bVar, C0494k2 k2Var) {
        this.f5963a = str;
        this.f5964b = context;
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            this.f5965c = CounterConfiguration.b.SELF_DIAGNOSTIC_MAIN;
        } else if (ordinal != 1) {
            this.f5965c = null;
        } else {
            this.f5965c = CounterConfiguration.b.SELF_DIAGNOSTIC_MANUAL;
        }
        this.f5966d = k2Var;
    }

    public void a(C0293c0 c0Var) {
        if (this.f5965c != null) {
            try {
                String str = this.f5963a;
                CounterConfiguration counterConfiguration = new CounterConfiguration();
                synchronized (counterConfiguration) {
                    counterConfiguration.b(str);
                }
                counterConfiguration.a(this.f5965c);
                this.f5966d.a(c0Var.b(new Q1(new A3(this.f5964b, (ResultReceiver) null), counterConfiguration, (String) null).c()));
            } catch (Throwable unused) {
            }
        }
    }
}
