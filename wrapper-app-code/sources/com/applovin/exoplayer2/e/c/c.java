package com.applovin.exoplayer2.e.c;

import com.applovin.exoplayer2.e.g;
import com.applovin.exoplayer2.l.y;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class c extends d {

    /* renamed from: b  reason: collision with root package name */
    private long f11863b = -9223372036854775807L;

    /* renamed from: c  reason: collision with root package name */
    private long[] f11864c = new long[0];

    /* renamed from: d  reason: collision with root package name */
    private long[] f11865d = new long[0];

    public c() {
        super(new g());
    }

    private static Object a(y yVar, int i) {
        if (i == 0) {
            return d(yVar);
        }
        if (i == 1) {
            return c(yVar);
        }
        if (i == 2) {
            return e(yVar);
        }
        if (i == 3) {
            return g(yVar);
        }
        if (i == 8) {
            return h(yVar);
        }
        if (i == 10) {
            return f(yVar);
        }
        if (i != 11) {
            return null;
        }
        return i(yVar);
    }

    private static int b(y yVar) {
        return yVar.h();
    }

    private static Boolean c(y yVar) {
        boolean z = true;
        if (yVar.h() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    private static Double d(y yVar) {
        return Double.valueOf(Double.longBitsToDouble(yVar.s()));
    }

    private static String e(y yVar) {
        int i = yVar.i();
        int c2 = yVar.c();
        yVar.e(i);
        return new String(yVar.d(), c2, i);
    }

    private static ArrayList<Object> f(y yVar) {
        int w = yVar.w();
        ArrayList<Object> arrayList = new ArrayList<>(w);
        for (int i = 0; i < w; i++) {
            Object a2 = a(yVar, b(yVar));
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    private static HashMap<String, Object> g(y yVar) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String e2 = e(yVar);
            int b2 = b(yVar);
            if (b2 == 9) {
                return hashMap;
            }
            Object a2 = a(yVar, b2);
            if (a2 != null) {
                hashMap.put(e2, a2);
            }
        }
    }

    private static HashMap<String, Object> h(y yVar) {
        int w = yVar.w();
        HashMap<String, Object> hashMap = new HashMap<>(w);
        for (int i = 0; i < w; i++) {
            String e2 = e(yVar);
            Object a2 = a(yVar, b(yVar));
            if (a2 != null) {
                hashMap.put(e2, a2);
            }
        }
        return hashMap;
    }

    private static Date i(y yVar) {
        Date date = new Date((long) d(yVar).doubleValue());
        yVar.e(2);
        return date;
    }

    public long a() {
        return this.f11863b;
    }

    /* access modifiers changed from: protected */
    public boolean a(y yVar) {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean a(y yVar, long j) {
        if (b(yVar) != 2 || !"onMetaData".equals(e(yVar)) || b(yVar) != 8) {
            return false;
        }
        HashMap<String, Object> h2 = h(yVar);
        Object obj = h2.get(IronSourceConstants.EVENTS_DURATION);
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f11863b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = h2.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f11864c = new long[size];
                this.f11865d = new long[size];
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f11864c = new long[0];
                        this.f11865d = new long[0];
                    } else {
                        this.f11864c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f11865d[i] = ((Double) obj5).longValue();
                        i++;
                    }
                }
                this.f11864c = new long[0];
                this.f11865d = new long[0];
            }
        }
        return false;
    }

    public long[] b() {
        return this.f11864c;
    }

    public long[] c() {
        return this.f11865d;
    }
}
