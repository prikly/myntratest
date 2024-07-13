package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Handler;
import android.os.ResultReceiver;
import com.yandex.metrica.core.api.executors.ICommonExecutor;

class U2 {
    U2() {
    }

    /* access modifiers changed from: package-private */
    public C0368f0 a(Handler handler, T2 t2) {
        return new C0368f0(handler, t2);
    }

    /* access modifiers changed from: package-private */
    public A3 a(Context context, C0368f0 f0Var) {
        return new A3(context, (ResultReceiver) f0Var);
    }

    /* access modifiers changed from: package-private */
    public T1 a(A3 a3, Context context, ICommonExecutor iCommonExecutor) {
        return new T1(a3, context, new C0593o1(context, iCommonExecutor), new P6(), new C0766v6());
    }

    /* access modifiers changed from: package-private */
    public C0436hi a(Context context, T1 t1, C0277b9 b9Var, Handler handler) {
        return new C0436hi(context, t1, b9Var, handler);
    }

    /* access modifiers changed from: package-private */
    public C0284bg a(T1 t1, C0277b9 b9Var, Handler handler) {
        return new C0284bg(t1, b9Var, handler);
    }

    /* access modifiers changed from: package-private */
    public R1 a(Context context, A3 a3, T1 t1, Handler handler, C0436hi hiVar) {
        return new R1(context, a3, t1, handler, hiVar);
    }
}
