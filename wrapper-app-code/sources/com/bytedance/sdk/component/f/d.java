package com.bytedance.sdk.component.f;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.utils.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PoolTaskStatistics */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f19215a = {"com.bytedance.sdk", "com.bykv.vk", "com.ss", "tt_pangle"};

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f19216b = {"tt_pangle", "bd_tracker"};

    /* renamed from: c  reason: collision with root package name */
    private static AtomicInteger f19217c = new AtomicInteger(0);

    /* renamed from: d  reason: collision with root package name */
    private static int f19218d = 0;

    /* renamed from: e  reason: collision with root package name */
    private static int f19219e = 0;

    public static void a() {
        String str;
        c g2 = e.g();
        if (g2 != null) {
            int i = 1;
            int addAndGet = f19217c.addAndGet(1);
            if (e.f19226c >= 0 && addAndGet % e.f19226c == 0 && Looper.getMainLooper() != Looper.myLooper()) {
                Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
                HashMap hashMap = new HashMap();
                if (allStackTraces != null) {
                    boolean a2 = l.a();
                    int size = allStackTraces.size();
                    if (size > f19219e) {
                        f19219e = size;
                    }
                    Iterator<Map.Entry<Thread, StackTraceElement[]>> it = allStackTraces.entrySet().iterator();
                    int i2 = 0;
                    int i3 = 0;
                    while (it.hasNext()) {
                        Map.Entry next = it.next();
                        i3 += i;
                        Thread thread = (Thread) next.getKey();
                        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) next.getValue();
                        StringBuilder sb = new StringBuilder("\n");
                        if (a2) {
                            sb.append("Thread Name is : " + thread.getName());
                            sb.append("\n");
                        }
                        String str2 = null;
                        int length = stackTraceElementArr.length;
                        int i4 = 0;
                        while (i4 < length) {
                            String stackTraceElement = stackTraceElementArr[i4].toString();
                            Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = it;
                            if (a2) {
                                sb.append(stackTraceElement + "\n");
                            }
                            if (TextUtils.isEmpty(str2)) {
                                if (!a(stackTraceElement, f19215a)) {
                                    str = stackTraceElement;
                                    if (!a(thread.getName(), f19216b)) {
                                    }
                                } else {
                                    str = stackTraceElement;
                                }
                                i2++;
                                str2 = str;
                            }
                            i4++;
                            it = it2;
                        }
                        Iterator<Map.Entry<Thread, StackTraceElement[]>> it3 = it;
                        if (a2) {
                            if (!TextUtils.isEmpty(str2)) {
                                String str3 = str2 + "&" + thread.getName();
                                a aVar = (a) hashMap.get(str3);
                                if (aVar != null) {
                                    aVar.a(aVar.a() + 1);
                                } else {
                                    aVar = new a(str3, 1, sb.toString(), thread.getName());
                                }
                                hashMap.put(str3, aVar);
                            }
                            if (!TextUtils.isEmpty(sb.toString())) {
                                Log.e("PoolTaskStatistics", "Thread index = " + i3 + "   &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                                Log.w("PoolTaskStatistics", sb.toString());
                            }
                        }
                        it = it3;
                        i = 1;
                    }
                    if (i2 > f19218d) {
                        f19218d = i2;
                    }
                    if (a2) {
                        Log.e("PoolTaskStatistics", "SDK current threads=" + i2 + ", SDK Max threads=" + f19218d + ", Application threads = " + size + ", Application max threads = " + f19219e);
                        for (Map.Entry value : hashMap.entrySet()) {
                            Log.i("PoolTaskStatistics", ((a) value.getValue()).toString());
                        }
                    }
                    g2.a(new com.bytedance.sdk.component.f.a.a(i2, f19218d, size, f19219e));
                }
            }
        }
    }

    private static boolean a(String str, String[] strArr) {
        if (!TextUtils.isEmpty(str) && strArr != null) {
            for (String contains : strArr) {
                if (str.contains(contains)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* compiled from: PoolTaskStatistics */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f19220a = 0;

        /* renamed from: b  reason: collision with root package name */
        public String f19221b = null;

        /* renamed from: c  reason: collision with root package name */
        public String f19222c = null;

        /* renamed from: d  reason: collision with root package name */
        public String f19223d = null;

        public a(String str, int i, String str2, String str3) {
            this.f19222c = str;
            this.f19220a = i;
            this.f19223d = str2;
            this.f19221b = str3;
        }

        public void a(int i) {
            this.f19220a = i;
        }

        public int a() {
            return this.f19220a;
        }

        public String toString() {
            return "ThreadModel{times=" + this.f19220a + ", name='" + this.f19221b + '\'' + ", lastStackStack='" + this.f19222c + '\'' + '}';
        }
    }
}
