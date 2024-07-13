package io.bidmachine.ads.networks.notsy;

import android.content.Context;
import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.utils.BMError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

class NotsyLoader {
    /* access modifiers changed from: private */
    public static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    private static final int DEFAULT_BOTTOM_BORDER_LOADED_AD = 2;
    private static final boolean DEFAULT_BREAK_AFTER_AD_LOADED = true;
    private static final int DEFAULT_REST_AD_LOAD_MS = 100;
    private static final int DEFAULT_REST_TASK_LOAD_MS = 5000;
    /* access modifiers changed from: private */
    public static Context applicationContext;
    private static final ScheduledExecutorService loadAdUnitListExecutor;
    private static final Map<AdsFormat, LoadAdUnitListTask> loadTaskMap = new HashMap();
    static final List<InternalNotsyAd> notsyAdList = new ArrayList();
    private static final Object notsyAdListLock = new Object();
    static final Map<NetworkAdUnit, InternalNotsyAd> reservedNotsyAdMap = Collections.synchronizedMap(new WeakHashMap());

    NotsyLoader() {
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = availableProcessors;
        int max = Math.max(2, Math.min(availableProcessors - 1, 4));
        CORE_POOL_SIZE = max;
        loadAdUnitListExecutor = Executors.newScheduledThreadPool(max);
    }

    static void setup(Context context, Map<AdsFormat, List<InternalNotsyAdUnit>> map) {
        applicationContext = context;
        for (AdsFormat adsFormat : AdsFormat.values()) {
            List list = map.get(adsFormat);
            if (list != null && !list.isEmpty()) {
                Collections.sort(list, $$Lambda$NotsyLoader$UDBd_VABTBMVtYpXVNMJeOdBadY.INSTANCE);
                loadTaskMap.put(adsFormat, new LoadAdUnitListTask(list, 2, 100, 5000, true));
            }
        }
    }

    static /* synthetic */ int lambda$setup$0(InternalNotsyAdUnit internalNotsyAdUnit, InternalNotsyAdUnit internalNotsyAdUnit2) {
        return -Float.compare(internalNotsyAdUnit.getInternalNotsyData().getScore(), internalNotsyAdUnit2.getInternalNotsyData().getScore());
    }

    static void startLoading() {
        for (LoadAdUnitListTask loadTask : loadTaskMap.values()) {
            loadTask(loadTask);
        }
    }

    static boolean reserveNotsyAd(NetworkAdUnit networkAdUnit, InternalNotsyData internalNotsyData) {
        synchronized (notsyAdListLock) {
            InternalNotsyAd findIdleNotsyAd = findIdleNotsyAd(internalNotsyData);
            if (findIdleNotsyAd == null) {
                return false;
            }
            reservedNotsyAdMap.put(networkAdUnit, findIdleNotsyAd);
            return true;
        }
    }

    static void unReserveNotsyAd(NetworkAdUnit networkAdUnit) {
        reservedNotsyAdMap.remove(networkAdUnit);
    }

    static InternalNotsyAd getNotsyAd(NetworkAdUnit networkAdUnit) {
        return reservedNotsyAdMap.get(networkAdUnit);
    }

    static void onNotsyAdShown(InternalNotsyAd internalNotsyAd) {
        synchronized (notsyAdListLock) {
            removeFromCaches(internalNotsyAd);
            loadTask(internalNotsyAd.getAdsFormat());
        }
    }

    static void onNotsyAdDestroy(InternalNotsyAd internalNotsyAd, boolean z) {
        if (z) {
            try {
                internalNotsyAd.destroyAd();
            } catch (Throwable unused) {
            }
            removeFromCaches(internalNotsyAd);
            return;
        }
        unReserveNotsyAd(internalNotsyAd);
    }

    private static InternalNotsyAd findIdleNotsyAd(InternalNotsyData internalNotsyData) {
        synchronized (notsyAdListLock) {
            for (InternalNotsyAd next : notsyAdList) {
                if (next.getInternalNotsyData().equals(internalNotsyData)) {
                    if (!isReserved(next)) {
                        return next;
                    }
                }
            }
            return null;
        }
    }

    static boolean isReserved(InternalNotsyAd internalNotsyAd) {
        return reservedNotsyAdMap.containsValue(internalNotsyAd);
    }

    private static void loadTask(AdsFormat adsFormat) {
        LoadAdUnitListTask loadAdUnitListTask = loadTaskMap.get(adsFormat);
        if (loadAdUnitListTask != null) {
            loadTask(loadAdUnitListTask);
        }
    }

    private static void loadTask(LoadAdUnitListTask loadAdUnitListTask) {
        if (!loadAdUnitListTask.isRunning()) {
            loadAdUnitListExecutor.submit(loadAdUnitListTask);
        }
    }

    /* access modifiers changed from: private */
    public static void scheduleLoadTasks(LoadAdUnitListTask loadAdUnitListTask, int i) {
        if (!loadAdUnitListTask.isRunning()) {
            loadAdUnitListExecutor.schedule(loadAdUnitListTask, (long) i, TimeUnit.MILLISECONDS);
        }
    }

    static void storeNotsyAd(InternalNotsyAd internalNotsyAd) {
        synchronized (notsyAdListLock) {
            if (!notsyAdList.contains(internalNotsyAd)) {
                notsyAdList.add(internalNotsyAd);
                Collections.sort(notsyAdList, $$Lambda$NotsyLoader$gyIujoO4l_ipMXUXZXs7e0Lt9qY.INSTANCE);
            }
        }
    }

    static /* synthetic */ int lambda$storeNotsyAd$1(InternalNotsyAd internalNotsyAd, InternalNotsyAd internalNotsyAd2) {
        return -Float.compare(internalNotsyAd.getScope(), internalNotsyAd2.getScope());
    }

    private static void removeFromCaches(InternalNotsyAd internalNotsyAd) {
        synchronized (notsyAdListLock) {
            notsyAdList.remove(internalNotsyAd);
            unReserveNotsyAd(internalNotsyAd);
        }
    }

    private static void unReserveNotsyAd(InternalNotsyAd internalNotsyAd) {
        for (Map.Entry next : reservedNotsyAdMap.entrySet()) {
            if (((InternalNotsyAd) next.getValue()).equals(internalNotsyAd)) {
                reservedNotsyAdMap.remove(next.getKey());
            }
        }
    }

    /* access modifiers changed from: private */
    public static void destroyNotsyAd(InternalNotsyAd internalNotsyAd) {
        try {
            internalNotsyAd.destroy();
        } catch (Throwable unused) {
        }
        removeFromCaches(internalNotsyAd);
    }

    /* access modifiers changed from: private */
    public static int loadedNotsyAdCount(List<InternalNotsyAdUnit> list) {
        int i;
        synchronized (notsyAdListLock) {
            i = 0;
            for (InternalNotsyAd next : notsyAdList) {
                for (InternalNotsyAdUnit equals : list) {
                    if (next.getAdUnit().equals(equals)) {
                        i++;
                    }
                }
            }
        }
        return i;
    }

    static void clear() {
        loadTaskMap.clear();
        notsyAdList.clear();
        reservedNotsyAdMap.clear();
    }

    private static class LoadAdUnitListTask implements Runnable {
        private static final Executor loadAdTaskExecutor = Executors.newFixedThreadPool(NotsyLoader.CORE_POOL_SIZE);
        private final List<InternalNotsyAdUnit> adUnitList;
        private final int bottomBorderLoadedAd;
        private final boolean breakAfterAdLoaded;
        private final AtomicBoolean isRunning;
        private final int restAdLoadMs;
        private final int restTaskLoadMs;

        private LoadAdUnitListTask(List<InternalNotsyAdUnit> list, int i, int i2, int i3, boolean z) {
            this.adUnitList = new ArrayList(list);
            this.bottomBorderLoadedAd = i;
            this.restAdLoadMs = i2;
            this.restTaskLoadMs = i3;
            this.breakAfterAdLoaded = z;
            this.isRunning = new AtomicBoolean(false);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(8:12|13|14|15|16|(2:18|(2:29|20))|21|31) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0049 A[Catch:{ all -> 0x0066 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r9 = this;
                r0 = 0
                java.util.concurrent.atomic.AtomicBoolean r1 = r9.isRunning     // Catch:{ all -> 0x0066 }
                r2 = 1
                r1.set(r2)     // Catch:{ all -> 0x0066 }
                java.util.List<io.bidmachine.ads.networks.notsy.InternalNotsyAdUnit> r1 = r9.adUnitList     // Catch:{ all -> 0x0066 }
                int r1 = io.bidmachine.ads.networks.notsy.NotsyLoader.loadedNotsyAdCount(r1)     // Catch:{ all -> 0x0066 }
                int r3 = r9.bottomBorderLoadedAd     // Catch:{ all -> 0x0066 }
                if (r1 < r3) goto L_0x0017
                java.util.concurrent.atomic.AtomicBoolean r1 = r9.isRunning     // Catch:{ all -> 0x0066 }
                r1.set(r0)     // Catch:{ all -> 0x0066 }
                return
            L_0x0017:
                java.util.List<io.bidmachine.ads.networks.notsy.InternalNotsyAdUnit> r3 = r9.adUnitList     // Catch:{ all -> 0x0066 }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0066 }
            L_0x001d:
                boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0066 }
                if (r4 == 0) goto L_0x0057
                java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0066 }
                io.bidmachine.ads.networks.notsy.InternalNotsyAdUnit r4 = (io.bidmachine.ads.networks.notsy.InternalNotsyAdUnit) r4     // Catch:{ all -> 0x0066 }
                io.bidmachine.ads.networks.notsy.InternalNotsyAd r4 = io.bidmachine.ads.networks.notsy.InternalNotsyAd.Factory.create(r4)     // Catch:{ all -> 0x0066 }
                if (r4 != 0) goto L_0x0030
                goto L_0x001d
            L_0x0030:
                java.util.concurrent.CountDownLatch r5 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x0066 }
                r5.<init>(r2)     // Catch:{ all -> 0x0066 }
                java.util.concurrent.Executor r6 = loadAdTaskExecutor     // Catch:{ all -> 0x0066 }
                io.bidmachine.ads.networks.notsy.NotsyLoader$LoadAdUnitListTask$NotsyAdLoadTask r7 = new io.bidmachine.ads.networks.notsy.NotsyLoader$LoadAdUnitListTask$NotsyAdLoadTask     // Catch:{ all -> 0x0066 }
                r8 = 0
                r7.<init>(r5, r4)     // Catch:{ all -> 0x0066 }
                r6.execute(r7)     // Catch:{ all -> 0x0066 }
                r5.await()     // Catch:{ InterruptedException -> 0x0043 }
            L_0x0043:
                boolean r4 = r4.isLoaded()     // Catch:{ all -> 0x0066 }
                if (r4 == 0) goto L_0x0050
                int r1 = r1 + 1
                boolean r4 = r9.breakAfterAdLoaded     // Catch:{ all -> 0x0066 }
                if (r4 == 0) goto L_0x0050
                goto L_0x0057
            L_0x0050:
                int r4 = r9.restAdLoadMs     // Catch:{ all -> 0x0066 }
                long r4 = (long) r4     // Catch:{ all -> 0x0066 }
                java.lang.Thread.sleep(r4)     // Catch:{ all -> 0x0066 }
                goto L_0x001d
            L_0x0057:
                java.util.concurrent.atomic.AtomicBoolean r2 = r9.isRunning     // Catch:{ all -> 0x0066 }
                r2.set(r0)     // Catch:{ all -> 0x0066 }
                int r2 = r9.bottomBorderLoadedAd     // Catch:{ all -> 0x0066 }
                if (r1 >= r2) goto L_0x0070
                int r1 = r9.restTaskLoadMs     // Catch:{ all -> 0x0066 }
                io.bidmachine.ads.networks.notsy.NotsyLoader.scheduleLoadTasks(r9, r1)     // Catch:{ all -> 0x0066 }
                goto L_0x0070
            L_0x0066:
                java.util.concurrent.atomic.AtomicBoolean r1 = r9.isRunning
                r1.set(r0)
                int r0 = r9.restTaskLoadMs
                io.bidmachine.ads.networks.notsy.NotsyLoader.scheduleLoadTasks(r9, r0)
            L_0x0070:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.ads.networks.notsy.NotsyLoader.LoadAdUnitListTask.run():void");
        }

        public boolean isRunning() {
            return this.isRunning.get();
        }

        private static class NotsyAdLoadTask implements Runnable {
            private final CountDownLatch countDownLatch;
            private final InternalNotsyAd notsyAd;

            private NotsyAdLoadTask(CountDownLatch countDownLatch2, InternalNotsyAd internalNotsyAd) {
                this.countDownLatch = countDownLatch2;
                this.notsyAd = internalNotsyAd;
            }

            public void run() {
                try {
                    this.notsyAd.load(NotsyLoader.applicationContext, new AwaitLoadListener(this.countDownLatch));
                } catch (Throwable unused) {
                    this.countDownLatch.countDown();
                }
            }
        }

        private static class AwaitLoadListener implements InternalLoadListener {
            private final CountDownLatch countDownLatch;

            private AwaitLoadListener(CountDownLatch countDownLatch2) {
                this.countDownLatch = countDownLatch2;
            }

            public void onAdLoaded(InternalNotsyAd internalNotsyAd) {
                NotsyLoader.storeNotsyAd(internalNotsyAd);
                this.countDownLatch.countDown();
            }

            public void onAdLoadFailed(InternalNotsyAd internalNotsyAd, BMError bMError) {
                NotsyLoader.destroyNotsyAd(internalNotsyAd);
                this.countDownLatch.countDown();
            }
        }
    }
}
