package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* compiled from: HandlerUtils */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private static volatile HandlerThread f19248a = new HandlerThread("tt_pangle_thread_io_handler");

    /* renamed from: b  reason: collision with root package name */
    private static volatile Handler f19249b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile Handler f19250c = new Handler(f19248a.getLooper());

    static {
        f19248a.start();
    }

    public static Handler a() {
        if (f19248a == null || !f19248a.isAlive()) {
            synchronized (h.class) {
                if (f19248a == null || !f19248a.isAlive()) {
                    f19248a = new HandlerThread("tt_pangle_thread_io_handler");
                    f19248a.start();
                    f19250c = new Handler(f19248a.getLooper());
                }
            }
        }
        return f19250c;
    }

    public static Handler b() {
        if (f19249b == null) {
            synchronized (h.class) {
                if (f19249b == null) {
                    f19249b = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f19249b;
    }
}
