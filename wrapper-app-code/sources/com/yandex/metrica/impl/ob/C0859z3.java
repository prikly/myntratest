package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.YandexMetrica;

/* renamed from: com.yandex.metrica.impl.ob.z3  reason: case insensitive filesystem */
public class C0859z3 {

    /* renamed from: a  reason: collision with root package name */
    private final A3 f7207a;

    /* renamed from: b  reason: collision with root package name */
    private final CounterConfiguration f7208b;

    public C0859z3(Bundle bundle) {
        this.f7207a = A3.a(bundle);
        this.f7208b = CounterConfiguration.a(bundle);
    }

    public A3 a() {
        return this.f7207a;
    }

    public CounterConfiguration b() {
        return this.f7208b;
    }

    public String toString() {
        return "ClientConfiguration{mProcessConfiguration=" + this.f7207a + ", mCounterConfiguration=" + this.f7208b + '}';
    }

    public static boolean a(C0859z3 z3Var, Context context) {
        return z3Var.f7207a == null || !context.getPackageName().equals(z3Var.f7207a.f()) || z3Var.f7207a.i() != YandexMetrica.getLibraryApiLevel();
    }

    public C0859z3(A3 a3, CounterConfiguration counterConfiguration) {
        this.f7207a = a3;
        this.f7208b = counterConfiguration;
    }
}
