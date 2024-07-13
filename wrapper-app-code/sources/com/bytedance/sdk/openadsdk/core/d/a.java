package com.bytedance.sdk.openadsdk.core.d;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.openadsdk.core.i.f;
import com.bytedance.sdk.openadsdk.core.m;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* compiled from: FrequentCallController */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f1022a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f1023b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile long f1024c;

    /* renamed from: d  reason: collision with root package name */
    private final Queue<C0005a> f1025d = new LinkedList();

    /* renamed from: e  reason: collision with root package name */
    private Handler f1026e;

    /* renamed from: f  reason: collision with root package name */
    private final f f1027f = m.h();

    private a() {
    }

    public static a a() {
        if (f1022a == null) {
            synchronized (a.class) {
                if (f1022a == null) {
                    f1022a = new a();
                }
            }
        }
        return f1022a;
    }

    private synchronized boolean b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        int i = this.f1027f.i();
        long h2 = this.f1027f.h();
        if (this.f1025d.size() <= 0 || this.f1025d.size() < i) {
            this.f1025d.offer(new C0005a(currentTimeMillis, str));
        } else {
            long abs = Math.abs(currentTimeMillis - this.f1025d.peek().f1029a);
            if (abs <= h2) {
                b(h2 - abs);
                return true;
            }
            this.f1025d.poll();
            this.f1025d.offer(new C0005a(currentTimeMillis, str));
        }
        return false;
    }

    public synchronized boolean a(String str) {
        if (b(str)) {
            a(true);
            a(f1024c);
        } else {
            a(false);
        }
        return f1023b;
    }

    private synchronized void a(long j) {
        if (this.f1026e == null) {
            this.f1026e = new Handler(Looper.getMainLooper());
        }
        this.f1026e.postDelayed(new Runnable() {
            public void run() {
                a.this.a(false);
            }
        }, j);
    }

    /* access modifiers changed from: private */
    public synchronized void a(boolean z) {
        f1023b = z;
    }

    public synchronized boolean b() {
        return f1023b;
    }

    private synchronized void b(long j) {
        f1024c = j;
    }

    public synchronized String c() {
        String str;
        HashMap hashMap = new HashMap();
        for (C0005a aVar : this.f1025d) {
            if (hashMap.containsKey(aVar.f1030b)) {
                hashMap.put(aVar.f1030b, Integer.valueOf(((Integer) hashMap.get(aVar.f1030b)).intValue() + 1));
            } else {
                hashMap.put(aVar.f1030b, 1);
            }
        }
        int i = RecyclerView.UNDEFINED_DURATION;
        str = "";
        for (String str2 : hashMap.keySet()) {
            int intValue = ((Integer) hashMap.get(str2)).intValue();
            if (i < intValue) {
                str = str2;
                i = intValue;
            }
        }
        return str;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.d.a$a  reason: collision with other inner class name */
    /* compiled from: FrequentCallController */
    private static class C0005a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final long f1029a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final String f1030b;

        private C0005a(long j, String str) {
            this.f1029a = j;
            this.f1030b = str;
        }
    }
}
