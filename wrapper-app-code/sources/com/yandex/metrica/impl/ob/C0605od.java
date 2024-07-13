package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.H1;
import com.yandex.metrica.networktasks.api.IExecutionPolicy;
import java.util.EnumSet;

/* renamed from: com.yandex.metrica.impl.ob.od  reason: case insensitive filesystem */
public class C0605od implements IExecutionPolicy {

    /* renamed from: c  reason: collision with root package name */
    private static final EnumSet<H1.d> f6403c = EnumSet.of(H1.d.OFFLINE);

    /* renamed from: a  reason: collision with root package name */
    private Rl f6404a = new Ml();

    /* renamed from: b  reason: collision with root package name */
    private final Context f6405b;

    public C0605od(Context context) {
        this.f6405b = context;
    }

    public boolean canBeExecuted() {
        Rl rl = this.f6404a;
        Context context = this.f6405b;
        ((Ml) rl).getClass();
        return !f6403c.contains(H1.a(context));
    }
}
