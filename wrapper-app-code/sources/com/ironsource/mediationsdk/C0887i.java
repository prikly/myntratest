package com.ironsource.mediationsdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ironsource.mediationsdk.i  reason: case insensitive filesystem */
public final class C0887i {

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<String, ArrayList<a>> f8630a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private int f8631b;

    /* renamed from: com.ironsource.mediationsdk.i$a */
    public enum a {
        ISAuctionPerformanceDidntAttemptToLoad,
        ISAuctionPerformanceFailedToLoad,
        ISAuctionPerformanceLoadedSuccessfully,
        ISAuctionPerformanceFailedToShow,
        ISAuctionPerformanceShowedSuccessfully,
        ISAuctionPerformanceNotPartOfWaterfall
    }

    public C0887i(List<String> list, int i) {
        this.f8631b = i;
        for (String put : list) {
            ArrayList arrayList = new ArrayList();
            this.f8630a.put(put, arrayList);
        }
    }

    public final String a(String str) {
        ArrayList arrayList = this.f8630a.get(str);
        String str2 = "";
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            StringBuilder sb = new StringBuilder();
            while (true) {
                sb.append(str2);
                sb.append(((a) it.next()).ordinal());
                str2 = sb.toString();
                if (!it.hasNext()) {
                    break;
                }
                str2 = str2 + ",";
                sb = new StringBuilder();
            }
        }
        return str2;
    }

    public final void a(ConcurrentHashMap<String, a> concurrentHashMap) {
        if (this.f8631b != 0) {
            for (String next : this.f8630a.keySet()) {
                a aVar = a.ISAuctionPerformanceNotPartOfWaterfall;
                if (concurrentHashMap.containsKey(next)) {
                    aVar = concurrentHashMap.get(next);
                }
                ArrayList arrayList = this.f8630a.get(next);
                if (this.f8631b != -1 && arrayList.size() == this.f8631b) {
                    arrayList.remove(0);
                }
                arrayList.add(aVar);
            }
        }
    }
}
