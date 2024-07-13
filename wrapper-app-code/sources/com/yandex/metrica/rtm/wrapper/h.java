package com.yandex.metrica.rtm.wrapper;

import android.content.Context;
import com.yandex.metrica.rtm.client.ExceptionProcessor;

public class h implements e {

    /* renamed from: a  reason: collision with root package name */
    private final ExceptionProcessor f7388a;

    public h(i iVar, Context context) throws Throwable {
        this(new ExceptionProcessor(context, new a(iVar)));
    }

    public void reportException(String str, Throwable th) {
        try {
            this.f7388a.onException(str, th);
        } catch (Throwable unused) {
        }
    }

    h(ExceptionProcessor exceptionProcessor) throws Throwable {
        this.f7388a = exceptionProcessor;
    }
}
