package com.bytedance.sdk.component.e.d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: WeakHandler */
public class g extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<a> f19195a;

    /* compiled from: WeakHandler */
    public interface a {
        void a(Message message);
    }

    public g(Looper looper, a aVar) {
        super(looper);
        this.f19195a = new WeakReference<>(aVar);
    }

    public void handleMessage(Message message) {
        a aVar = (a) this.f19195a.get();
        if (aVar != null && message != null) {
            aVar.a(message);
        }
    }
}
