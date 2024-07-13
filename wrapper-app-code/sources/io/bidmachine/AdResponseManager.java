package io.bidmachine;

import io.bidmachine.core.Logger;
import io.bidmachine.protobuf.AdCachePlacementControl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class AdResponseManager {
    static final int DEF_BUSY_LIMIT = 2;
    static final int DEF_MAX_CACHE_SIZE = 8;
    private static final String TAG = "AdResponseManager";
    private static final Map<String, AdCachePlacementControl> adCachePlacementControlMap = new ConcurrentHashMap();
    private static volatile AdResponseManager instance;
    private final List<AdResponse> adResponseList = new ArrayList();
    private final Object lock = new Object();

    AdResponseManager() {
    }

    public static AdResponseManager get() {
        AdResponseManager adResponseManager = instance;
        if (adResponseManager == null) {
            synchronized (AdResponseManager.class) {
                adResponseManager = instance;
                if (adResponseManager == null) {
                    adResponseManager = new AdResponseManager();
                    instance = adResponseManager;
                }
            }
        }
        return adResponseManager;
    }

    /* access modifiers changed from: package-private */
    public boolean contains(AdResponse adResponse) {
        boolean contains;
        synchronized (this.lock) {
            contains = this.adResponseList.contains(adResponse);
        }
        return contains;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00aa A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void store(io.bidmachine.AdResponse r15) {
        /*
            r14 = this;
            boolean r0 = r15.canCache()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.String r0 = "AdResponseManager"
            java.lang.String r1 = "store - %s"
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r15
            java.lang.String r1 = java.lang.String.format(r1, r3)
            io.bidmachine.core.Logger.log((java.lang.String) r0, (java.lang.String) r1)
            java.lang.Object r0 = r14.lock
            monitor-enter(r0)
            io.bidmachine.AdRequestParameters r1 = r15.getAdRequestParameters()     // Catch:{ all -> 0x00b3 }
            java.util.List<io.bidmachine.AdResponse> r3 = r14.adResponseList     // Catch:{ all -> 0x00b3 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00b3 }
            r5 = 0
            r6 = r5
            r7 = r6
            r5 = 0
        L_0x0029:
            boolean r8 = r3.hasNext()     // Catch:{ all -> 0x00b3 }
            if (r8 == 0) goto L_0x0068
            java.lang.Object r8 = r3.next()     // Catch:{ all -> 0x00b3 }
            io.bidmachine.AdResponse r8 = (io.bidmachine.AdResponse) r8     // Catch:{ all -> 0x00b3 }
            io.bidmachine.AdRequestParameters r9 = r8.getAdRequestParameters()     // Catch:{ all -> 0x00b3 }
            boolean r9 = r1.isParametersMatched(r9)     // Catch:{ all -> 0x00b3 }
            if (r9 != 0) goto L_0x0040
            goto L_0x0029
        L_0x0040:
            int r5 = r5 + 1
            io.bidmachine.AdResponseStatus r9 = r8.getStatus()     // Catch:{ all -> 0x00b3 }
            io.bidmachine.AdResponseStatus r10 = io.bidmachine.AdResponseStatus.Idle     // Catch:{ all -> 0x00b3 }
            if (r9 != r10) goto L_0x005a
            if (r7 == 0) goto L_0x0058
            double r9 = r7.getPrice()     // Catch:{ all -> 0x00b3 }
            double r11 = r8.getPrice()     // Catch:{ all -> 0x00b3 }
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x0029
        L_0x0058:
            r7 = r8
            goto L_0x0029
        L_0x005a:
            io.bidmachine.AdResponseStatus r9 = r8.getStatus()     // Catch:{ all -> 0x00b3 }
            io.bidmachine.AdResponseStatus r10 = io.bidmachine.AdResponseStatus.Busy     // Catch:{ all -> 0x00b3 }
            if (r9 != r10) goto L_0x0029
            int r4 = r4 + 1
            if (r6 != 0) goto L_0x0029
            r6 = r8
            goto L_0x0029
        L_0x0068:
            io.bidmachine.AdResponseStatus r3 = r15.getStatus()     // Catch:{ all -> 0x00b3 }
            io.bidmachine.AdResponseStatus r8 = io.bidmachine.AdResponseStatus.Busy     // Catch:{ all -> 0x00b3 }
            if (r3 != r8) goto L_0x008c
            if (r6 == 0) goto L_0x008c
            int r3 = r14.getBusyLimitForAdsType(r1)     // Catch:{ all -> 0x00b3 }
            if (r4 < r3) goto L_0x008c
            io.bidmachine.AdResponseStatus r3 = io.bidmachine.AdResponseStatus.Idle     // Catch:{ all -> 0x00b3 }
            r6.setStatus(r3)     // Catch:{ all -> 0x00b3 }
            if (r7 == 0) goto L_0x008d
            double r3 = r7.getPrice()     // Catch:{ all -> 0x00b3 }
            double r8 = r6.getPrice()     // Catch:{ all -> 0x00b3 }
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x008c
            goto L_0x008d
        L_0x008c:
            r6 = r7
        L_0x008d:
            int r1 = r14.getMaxCacheSizeForAdsType(r1)     // Catch:{ all -> 0x00b3 }
            if (r5 < r1) goto L_0x00ac
            if (r6 == 0) goto L_0x00ac
            double r3 = r15.getPrice()     // Catch:{ all -> 0x00b3 }
            double r7 = r6.getPrice()     // Catch:{ all -> 0x00b3 }
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 < 0) goto L_0x00aa
            r6.notifyExpired(r2)     // Catch:{ all -> 0x00b3 }
            java.util.List<io.bidmachine.AdResponse> r1 = r14.adResponseList     // Catch:{ all -> 0x00b3 }
            r1.remove(r6)     // Catch:{ all -> 0x00b3 }
            goto L_0x00ac
        L_0x00aa:
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            return
        L_0x00ac:
            java.util.List<io.bidmachine.AdResponse> r1 = r14.adResponseList     // Catch:{ all -> 0x00b3 }
            r1.add(r15)     // Catch:{ all -> 0x00b3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            return
        L_0x00b3:
            r15 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.AdResponseManager.store(io.bidmachine.AdResponse):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009f, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public io.bidmachine.AdResponse receive(io.bidmachine.AdRequestParameters r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.lock
            monitor-enter(r0)
            int r1 = r14.getBusyLimitForAdsType(r15)     // Catch:{ all -> 0x00a0 }
            java.util.List<io.bidmachine.AdResponse> r2 = r14.adResponseList     // Catch:{ all -> 0x00a0 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00a0 }
            r3 = 0
            r4 = 0
            r5 = r4
            r7 = r5
            r6 = 0
        L_0x0012:
            boolean r8 = r2.hasNext()     // Catch:{ all -> 0x00a0 }
            if (r8 == 0) goto L_0x0071
            java.lang.Object r8 = r2.next()     // Catch:{ all -> 0x00a0 }
            io.bidmachine.AdResponse r8 = (io.bidmachine.AdResponse) r8     // Catch:{ all -> 0x00a0 }
            boolean r9 = r8.wasShown()     // Catch:{ all -> 0x00a0 }
            if (r9 != 0) goto L_0x0012
            io.bidmachine.AdRequestParameters r9 = r8.getAdRequestParameters()     // Catch:{ all -> 0x00a0 }
            boolean r9 = r15.isParametersMatched(r9)     // Catch:{ all -> 0x00a0 }
            if (r9 != 0) goto L_0x002f
            goto L_0x0012
        L_0x002f:
            io.bidmachine.AdResponseStatus r9 = r8.getStatus()     // Catch:{ all -> 0x00a0 }
            io.bidmachine.AdResponseStatus r10 = io.bidmachine.AdResponseStatus.Idle     // Catch:{ all -> 0x00a0 }
            if (r9 != r10) goto L_0x0047
            if (r5 == 0) goto L_0x0045
            double r9 = r8.getPrice()     // Catch:{ all -> 0x00a0 }
            double r11 = r5.getPrice()     // Catch:{ all -> 0x00a0 }
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x0012
        L_0x0045:
            r5 = r8
            goto L_0x0012
        L_0x0047:
            io.bidmachine.AdResponseStatus r9 = r8.getStatus()     // Catch:{ all -> 0x00a0 }
            io.bidmachine.AdResponseStatus r10 = io.bidmachine.AdResponseStatus.Busy     // Catch:{ all -> 0x00a0 }
            if (r9 != r10) goto L_0x0012
            int r6 = r6 + 1
            if (r7 != 0) goto L_0x0054
            r7 = r8
        L_0x0054:
            if (r6 < r1) goto L_0x0012
            r7.expireAdRequests(r4)     // Catch:{ all -> 0x00a0 }
            r7.clearAdRequestList()     // Catch:{ all -> 0x00a0 }
            io.bidmachine.AdResponseStatus r8 = io.bidmachine.AdResponseStatus.Idle     // Catch:{ all -> 0x00a0 }
            r7.setStatus(r8)     // Catch:{ all -> 0x00a0 }
            if (r5 == 0) goto L_0x006f
            double r8 = r7.getPrice()     // Catch:{ all -> 0x00a0 }
            double r10 = r5.getPrice()     // Catch:{ all -> 0x00a0 }
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x0012
        L_0x006f:
            r5 = r7
            goto L_0x0012
        L_0x0071:
            if (r5 == 0) goto L_0x009e
            double r1 = r5.getPrice()     // Catch:{ all -> 0x00a0 }
            boolean r15 = r15.isPricePassedByPriceFloor(r1)     // Catch:{ all -> 0x00a0 }
            if (r15 == 0) goto L_0x009e
            io.bidmachine.AdResponseStatus r15 = io.bidmachine.AdResponseStatus.Busy     // Catch:{ all -> 0x00a0 }
            r5.setStatus(r15)     // Catch:{ all -> 0x00a0 }
            java.lang.String r15 = "AdResponseManager"
            java.lang.String r1 = "receive - %s"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00a0 }
            r2[r3] = r5     // Catch:{ all -> 0x00a0 }
            java.lang.String r1 = java.lang.String.format(r1, r2)     // Catch:{ all -> 0x00a0 }
            io.bidmachine.core.Logger.log((java.lang.String) r15, (java.lang.String) r1)     // Catch:{ all -> 0x00a0 }
            java.util.List<io.bidmachine.AdResponse> r15 = r14.adResponseList     // Catch:{ all -> 0x00a0 }
            r15.remove(r5)     // Catch:{ all -> 0x00a0 }
            java.util.List<io.bidmachine.AdResponse> r15 = r14.adResponseList     // Catch:{ all -> 0x00a0 }
            r15.add(r5)     // Catch:{ all -> 0x00a0 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a0 }
            return r5
        L_0x009e:
            monitor-exit(r0)     // Catch:{ all -> 0x00a0 }
            return r4
        L_0x00a0:
            r15 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a0 }
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.AdResponseManager.receive(io.bidmachine.AdRequestParameters):io.bidmachine.AdResponse");
    }

    /* access modifiers changed from: package-private */
    public List<AdResponse> peek(AdRequestParameters adRequestParameters) {
        synchronized (this.lock) {
            ArrayList arrayList = new ArrayList();
            for (AdResponse next : this.adResponseList) {
                if (next.getStatus() == AdResponseStatus.Idle) {
                    if (adRequestParameters.isParametersMatched(next.getAdRequestParameters())) {
                        arrayList.add(next);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return arrayList;
            }
            Collections.sort(arrayList, new Comparator<AdResponse>() {
                public int compare(AdResponse adResponse, AdResponse adResponse2) {
                    return -Double.compare(adResponse.getPrice(), adResponse2.getPrice());
                }
            });
            List<AdResponse> subList = arrayList.subList(0, Math.min(getBusyLimitForAdsType(adRequestParameters), arrayList.size()));
            return subList;
        }
    }

    /* access modifiers changed from: package-private */
    public void remove(AdResponse adResponse) {
        Logger.log(TAG, String.format("remove - %s", new Object[]{adResponse}));
        synchronized (this.lock) {
            this.adResponseList.remove(adResponse);
        }
    }

    /* access modifiers changed from: package-private */
    public int getMaxCacheSizeForAdsType(AdRequestParameters adRequestParameters) {
        AdCachePlacementControl adCachePlacementControl = getAdCachePlacementControl(adRequestParameters);
        int maxCacheSize = adCachePlacementControl != null ? adCachePlacementControl.getMaxCacheSize() : 0;
        if (maxCacheSize > 0) {
            return maxCacheSize;
        }
        return 8;
    }

    /* access modifiers changed from: package-private */
    public int getBusyLimitForAdsType(AdRequestParameters adRequestParameters) {
        AdCachePlacementControl adCachePlacementControl = getAdCachePlacementControl(adRequestParameters);
        int maxRetainCount = adCachePlacementControl != null ? adCachePlacementControl.getMaxRetainCount() : 0;
        if (maxRetainCount > 0) {
            return maxRetainCount;
        }
        return 2;
    }

    private AdCachePlacementControl getAdCachePlacementControl(AdRequestParameters adRequestParameters) {
        return adCachePlacementControlMap.get(adRequestParameters.getAdsType().getName());
    }

    /* access modifiers changed from: package-private */
    public int size() {
        return this.adResponseList.size();
    }

    /* access modifiers changed from: package-private */
    public void clear() {
        synchronized (this.lock) {
            this.adResponseList.clear();
        }
    }

    static void setAdCachePlacementControlMap(Map<String, AdCachePlacementControl> map) {
        adCachePlacementControlMap.clear();
        if (map != null) {
            adCachePlacementControlMap.putAll(map);
        }
    }
}
