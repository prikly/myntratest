package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;

public class p {

    /* renamed from: a  reason: collision with root package name */
    private static volatile u f10889a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile Handler f10890b;

    public static HandlerThread a() {
        if (f10889a == null) {
            synchronized (p.class) {
                if (f10889a == null) {
                    f10889a = new u("default_npth_thread");
                    f10889a.b();
                }
            }
        }
        return f10889a.c();
    }

    public static u b() {
        if (f10889a == null) {
            a();
        }
        return f10889a;
    }
}
