package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: WeakHandler */
public class x extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<a> f19277a;

    /* compiled from: WeakHandler */
    public interface a {
        void a(Message message);
    }

    public x(a aVar) {
        this.f19277a = new WeakReference<>(aVar);
    }

    public x(Looper looper, a aVar) {
        super(looper);
        this.f19277a = new WeakReference<>(aVar);
    }

    public void handleMessage(Message message) {
        a aVar = (a) this.f19277a.get();
        if (aVar != null && message != null) {
            aVar.a(message);
        }
    }
}
