package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* renamed from: com.yandex.metrica.impl.ob.f0  reason: case insensitive filesystem */
public class C0368f0 extends ResultReceiver {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f5774b = 0;

    /* renamed from: a  reason: collision with root package name */
    private final a f5775a;

    /* renamed from: com.yandex.metrica.impl.ob.f0$a */
    public interface a {
        void a(int i, Bundle bundle);
    }

    public C0368f0(Handler handler, a aVar) {
        super(handler);
        this.f5775a = aVar;
    }

    /* access modifiers changed from: protected */
    public void onReceiveResult(int i, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.setClassLoader(C0389fl.class.getClassLoader());
        this.f5775a.a(i, bundle);
    }
}
