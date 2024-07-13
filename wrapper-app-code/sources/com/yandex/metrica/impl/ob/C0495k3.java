package com.yandex.metrica.impl.ob;

import android.os.Looper;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.yandex.metrica.impl.ob.k3  reason: case insensitive filesystem */
public class C0495k3 {

    /* renamed from: a  reason: collision with root package name */
    private final c f6083a;

    /* renamed from: b  reason: collision with root package name */
    private final C0539lm<Thread, StackTraceElement[], E6> f6084b;

    /* renamed from: c  reason: collision with root package name */
    private final C0290bm f6085c;

    /* renamed from: com.yandex.metrica.impl.ob.k3$a */
    class a implements c {
        a() {
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.k3$b */
    class b implements Comparator<Thread> {
        b(C0495k3 k3Var) {
        }

        public int compare(Object obj, Object obj2) {
            Thread thread = (Thread) obj;
            Thread thread2 = (Thread) obj2;
            if (thread != thread2) {
                String name = thread.getName();
                String name2 = thread2.getName();
                if (name == null) {
                    return name2 == null ? 0 : -1;
                }
                if (name2 == null) {
                    return 1;
                }
                return name.compareTo(name2);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.k3$c */
    interface c {
    }

    public C0495k3() {
        this(new a(), new C0470j3(), P.g().j());
    }

    public C0790w6 a() {
        StackTraceElement[] stackTraceElementArr;
        ((a) this.f6083a).getClass();
        Thread thread = Looper.getMainLooper().getThread();
        try {
            stackTraceElementArr = thread.getStackTrace();
        } catch (SecurityException unused) {
            stackTraceElementArr = null;
        }
        return new C0790w6(this.f6084b.a(thread, stackTraceElementArr), a(thread, (Thread) null), ((Xl) this.f6085c).b());
    }

    C0495k3(c cVar, C0539lm<Thread, StackTraceElement[], E6> lmVar, C0290bm bmVar) {
        this.f6083a = cVar;
        this.f6084b = lmVar;
        this.f6085c = bmVar;
    }

    public List<E6> a(Thread thread) {
        ((a) this.f6083a).getClass();
        Thread thread2 = Looper.getMainLooper().getThread();
        List<E6> a2 = a(thread2, thread);
        if (thread != thread2) {
            StackTraceElement[] stackTraceElementArr = null;
            try {
                stackTraceElementArr = thread2.getStackTrace();
            } catch (SecurityException unused) {
            }
            ((ArrayList) a2).add(0, this.f6084b.a(thread2, stackTraceElementArr));
        }
        return a2;
    }

    private List<E6> a(Thread thread, Thread thread2) {
        Map<Thread, StackTraceElement[]> map;
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new b(this));
        try {
            ((a) this.f6083a).getClass();
            map = Thread.getAllStackTraces();
        } catch (SecurityException unused) {
            map = null;
        }
        if (map != null) {
            treeMap.putAll(map);
        }
        if (thread2 != null) {
            treeMap.remove(thread2);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread3 = (Thread) entry.getKey();
            if (!(thread3 == thread || thread3 == thread2)) {
                arrayList.add(this.f6084b.a(thread3, (StackTraceElement[]) entry.getValue()));
            }
        }
        return arrayList;
    }
}
