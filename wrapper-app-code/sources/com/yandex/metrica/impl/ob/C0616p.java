package com.yandex.metrica.impl.ob;

import android.app.Activity;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.C0640q;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.p  reason: case insensitive filesystem */
public class C0616p implements C0640q.b {

    /* renamed from: a  reason: collision with root package name */
    private final Set<b> f6417a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private final ICommonExecutor f6418b;

    /* renamed from: com.yandex.metrica.impl.ob.p$a */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f6419a;

        a(Activity activity) {
            this.f6419a = activity;
        }

        public void run() {
            C0616p.this.a(this.f6419a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.p$b */
    public interface b {
        void a(Activity activity);
    }

    public C0616p(C0640q qVar, ICommonExecutor iCommonExecutor) {
        this.f6418b = iCommonExecutor;
        qVar.a((C0640q.b) this, new C0640q.a[0]);
    }

    public synchronized void a(b bVar) {
        this.f6417a.add(bVar);
    }

    public void a(Activity activity) {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f6417a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(activity);
        }
    }

    public void a(Activity activity, C0640q.a aVar) {
        this.f6418b.execute(new a(activity));
    }
}
