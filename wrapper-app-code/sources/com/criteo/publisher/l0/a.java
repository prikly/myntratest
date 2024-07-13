package com.criteo.publisher.l0;

import android.content.SharedPreferences;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConsentData.kt */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f2598a;

    static {
        new C0025a((DefaultConstructorMarker) null);
    }

    /* renamed from: com.criteo.publisher.l0.a$a  reason: collision with other inner class name */
    /* compiled from: ConsentData.kt */
    public static final class C0025a {
        private C0025a() {
        }

        public /* synthetic */ C0025a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a(SharedPreferences sharedPreferences) {
        Intrinsics.checkParameterIsNotNull(sharedPreferences, "sharedPreferences");
        this.f2598a = sharedPreferences;
    }

    public SharedPreferences a() {
        return this.f2598a;
    }

    public boolean b() {
        return a().getBoolean("CRTO_ConsentGiven", false);
    }

    public void a(boolean z) {
        SharedPreferences.Editor edit = a().edit();
        edit.putBoolean("CRTO_ConsentGiven", z);
        edit.apply();
    }
}
