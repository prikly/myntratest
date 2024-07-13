package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* renamed from: com.yandex.metrica.impl.ob.eg  reason: case insensitive filesystem */
public class C0359eg extends ResultReceiver {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f5751b = 0;

    /* renamed from: a  reason: collision with root package name */
    private final C0309cg f5752a;

    public C0359eg(Handler handler, C0309cg cgVar) {
        super(handler);
        this.f5752a = cgVar;
    }

    /* access modifiers changed from: protected */
    public void onReceiveResult(int i, Bundle bundle) {
        if (i == 1) {
            C0334dg dgVar = null;
            try {
                dgVar = C0334dg.a(bundle.getByteArray("referrer"));
            } catch (Throwable unused) {
            }
            this.f5752a.a(dgVar);
        }
    }
}
