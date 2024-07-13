package com.yandex.metrica.impl.ob;

public final class D6 {

    /* renamed from: a  reason: collision with root package name */
    private final String f3860a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3861b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f3862c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f3863d;

    /* renamed from: e  reason: collision with root package name */
    private final String f3864e;

    /* renamed from: f  reason: collision with root package name */
    private final Boolean f3865f;

    public D6(String str, String str2, Integer num, Integer num2, String str3, Boolean bool) {
        this.f3860a = str;
        this.f3861b = str2;
        this.f3862c = num;
        this.f3863d = num2;
        this.f3864e = str3;
        this.f3865f = bool;
    }

    public final String a() {
        return this.f3860a;
    }

    public final Integer b() {
        return this.f3863d;
    }

    public final String c() {
        return this.f3861b;
    }

    public final Integer d() {
        return this.f3862c;
    }

    public final String e() {
        return this.f3864e;
    }

    public final Boolean f() {
        return this.f3865f;
    }

    public D6(StackTraceElement stackTraceElement) {
        this(stackTraceElement.getClassName(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber()), (Integer) null, stackTraceElement.getMethodName(), Boolean.valueOf(stackTraceElement.isNativeMethod()));
    }
}
