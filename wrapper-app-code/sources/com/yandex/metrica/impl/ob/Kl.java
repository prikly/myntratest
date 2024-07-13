package com.yandex.metrica.impl.ob;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.yandex.metrica.core.api.executors.ICommonExecutor;

public class Kl extends BroadcastReceiver {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C0514km<Context, Intent> f4439a;

    /* renamed from: b  reason: collision with root package name */
    private final ICommonExecutor f4440b;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f4441a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Intent f4442b;

        a(Context context, Intent intent) {
            this.f4441a = context;
            this.f4442b = intent;
        }

        public void run() {
            Kl.this.f4439a.a(this.f4441a, this.f4442b);
        }
    }

    public Kl(C0514km<Context, Intent> kmVar, ICommonExecutor iCommonExecutor) {
        this.f4439a = kmVar;
        this.f4440b = iCommonExecutor;
    }

    public void onReceive(Context context, Intent intent) {
        this.f4440b.execute(new a(context, intent));
    }
}
