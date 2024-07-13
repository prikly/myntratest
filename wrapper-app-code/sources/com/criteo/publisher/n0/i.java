package com.criteo.publisher.n0;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.criteo.publisher.m0.d;
import com.criteo.publisher.p;

/* compiled from: CriteoResultReceiver */
public class i extends ResultReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final d f2899a;

    public i(Handler handler, d dVar) {
        super(handler);
        this.f2899a = dVar;
    }

    /* access modifiers changed from: protected */
    public void onReceiveResult(int i, Bundle bundle) {
        if (i == 100) {
            int i2 = bundle.getInt("Action");
            if (i2 == 201) {
                this.f2899a.a(p.CLOSE);
            } else if (i2 == 202) {
                this.f2899a.a(p.CLICK);
            }
        }
    }
}
