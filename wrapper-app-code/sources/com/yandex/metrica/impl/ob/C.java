package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.C0268b0;
import java.util.ArrayList;
import java.util.List;

public class C implements C0519l2 {

    /* renamed from: a  reason: collision with root package name */
    private final List<C0564mm<Intent>> f3787a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Intent f3788b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f3789c;

    /* renamed from: d  reason: collision with root package name */
    private final C0268b0 f3790d;

    class a implements C0514km<Context, Intent> {
        a() {
        }

        public void a(Object obj, Object obj2) {
            Context context = (Context) obj;
            Intent intent = (Intent) obj2;
            synchronized (C.this) {
                Intent unused = C.this.f3788b = intent;
                C.this.a(intent);
            }
        }
    }

    public C(Context context, ICommonExecutor iCommonExecutor) {
        this(context, iCommonExecutor, new C0268b0.a());
    }

    public synchronized Intent c(C0564mm<Intent> mmVar) {
        this.f3787a.add(mmVar);
        return this.f3788b;
    }

    C(Context context, ICommonExecutor iCommonExecutor, C0268b0.a aVar) {
        this.f3787a = new ArrayList();
        this.f3788b = null;
        this.f3789c = context;
        this.f3790d = aVar.a(new Kl(new a(), iCommonExecutor));
    }

    public synchronized void a() {
        Intent a2 = this.f3790d.a(this.f3789c, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        this.f3788b = a2;
        a(a2);
    }

    public synchronized void b() {
        this.f3788b = null;
        this.f3788b = null;
        this.f3790d.a(this.f3789c);
        a((Intent) null);
    }

    /* access modifiers changed from: private */
    public void a(Intent intent) {
        for (C0564mm<Intent> b2 : this.f3787a) {
            b2.b(intent);
        }
    }
}
