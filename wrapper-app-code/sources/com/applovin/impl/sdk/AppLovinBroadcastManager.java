package com.applovin.impl.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AppLovinBroadcastManager {

    /* renamed from: f  reason: collision with root package name */
    private static AppLovinBroadcastManager f15119f;

    /* renamed from: g  reason: collision with root package name */
    private static final Object f15120g = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final Context f15121a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Receiver, ArrayList<b>> f15122b = CollectionUtils.map();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, ArrayList<b>> f15123c = CollectionUtils.map();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<a> f15124d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private final Handler f15125e = new Handler(Looper.getMainLooper()) {
        public void handleMessage(Message message) {
            if (message.what == 1) {
                AppLovinBroadcastManager.this.a();
            } else {
                super.handleMessage(message);
            }
        }
    };

    public interface Receiver {
        void onReceive(Context context, Intent intent, Map<String, Object> map);
    }

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        final Intent f15127a;

        /* renamed from: b  reason: collision with root package name */
        final Map<String, Object> f15128b;

        /* renamed from: c  reason: collision with root package name */
        final List<b> f15129c;

        a(Intent intent, Map<String, Object> map, List<b> list) {
            this.f15127a = intent;
            this.f15128b = map;
            this.f15129c = list;
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        final IntentFilter f15130a;

        /* renamed from: b  reason: collision with root package name */
        final Receiver f15131b;

        /* renamed from: c  reason: collision with root package name */
        boolean f15132c;

        /* renamed from: d  reason: collision with root package name */
        boolean f15133d;

        b(IntentFilter intentFilter, Receiver receiver) {
            this.f15130a = intentFilter;
            this.f15131b = receiver;
        }
    }

    private AppLovinBroadcastManager(Context context) {
        this.f15121a = context;
    }

    private List<b> a(Intent intent) {
        synchronized (this.f15122b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f15121a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            List<b> list = this.f15123c.get(action);
            if (list == null) {
                return null;
            }
            ArrayList<b> arrayList = null;
            for (b bVar : list) {
                if (!bVar.f15132c) {
                    b bVar2 = bVar;
                    if (bVar.f15130a.match(action, resolveTypeIfNeeded, scheme, data, categories, "AppLovinBroadcastManager") >= 0) {
                        ArrayList arrayList2 = arrayList == null ? new ArrayList() : arrayList;
                        arrayList2.add(bVar2);
                        bVar2.f15132c = true;
                        arrayList = arrayList2;
                    }
                }
            }
            if (arrayList == null) {
                return null;
            }
            for (b bVar3 : arrayList) {
                bVar3.f15132c = false;
            }
            return arrayList;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        if (r0 >= r1) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        r3 = r2[r0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (r3 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        r4 = r3.f15129c.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r4.hasNext() == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        r5 = r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        if (r5 == null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        if (r5.f15133d != false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        r5.f15131b.onReceive(r9.f15121a, r3.f15127a, r3.f15128b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r0 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r9 = this;
        L_0x0000:
            java.util.Map<com.applovin.impl.sdk.AppLovinBroadcastManager$Receiver, java.util.ArrayList<com.applovin.impl.sdk.AppLovinBroadcastManager$b>> r0 = r9.f15122b
            monitor-enter(r0)
            java.util.ArrayList<com.applovin.impl.sdk.AppLovinBroadcastManager$a> r1 = r9.f15124d     // Catch:{ all -> 0x0049 }
            int r1 = r1.size()     // Catch:{ all -> 0x0049 }
            if (r1 > 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            return
        L_0x000d:
            com.applovin.impl.sdk.AppLovinBroadcastManager$a[] r2 = new com.applovin.impl.sdk.AppLovinBroadcastManager.a[r1]     // Catch:{ all -> 0x0049 }
            java.util.ArrayList<com.applovin.impl.sdk.AppLovinBroadcastManager$a> r3 = r9.f15124d     // Catch:{ all -> 0x0049 }
            r3.toArray(r2)     // Catch:{ all -> 0x0049 }
            java.util.ArrayList<com.applovin.impl.sdk.AppLovinBroadcastManager$a> r3 = r9.f15124d     // Catch:{ all -> 0x0049 }
            r3.clear()     // Catch:{ all -> 0x0049 }
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            r0 = 0
        L_0x001b:
            if (r0 >= r1) goto L_0x0000
            r3 = r2[r0]
            if (r3 != 0) goto L_0x0022
            goto L_0x0046
        L_0x0022:
            java.util.List<com.applovin.impl.sdk.AppLovinBroadcastManager$b> r4 = r3.f15129c
            java.util.Iterator r4 = r4.iterator()
        L_0x0028:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0046
            java.lang.Object r5 = r4.next()
            com.applovin.impl.sdk.AppLovinBroadcastManager$b r5 = (com.applovin.impl.sdk.AppLovinBroadcastManager.b) r5
            if (r5 == 0) goto L_0x0028
            boolean r6 = r5.f15133d
            if (r6 != 0) goto L_0x0028
            com.applovin.impl.sdk.AppLovinBroadcastManager$Receiver r5 = r5.f15131b
            android.content.Context r6 = r9.f15121a
            android.content.Intent r7 = r3.f15127a
            java.util.Map<java.lang.String, java.lang.Object> r8 = r3.f15128b
            r5.onReceive(r6, r7, r8)
            goto L_0x0028
        L_0x0046:
            int r0 = r0 + 1
            goto L_0x001b
        L_0x0049:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.AppLovinBroadcastManager.a():void");
    }

    public static AppLovinBroadcastManager getInstance(Context context) {
        AppLovinBroadcastManager appLovinBroadcastManager;
        synchronized (f15120g) {
            if (f15119f == null) {
                f15119f = new AppLovinBroadcastManager(context.getApplicationContext());
            }
            appLovinBroadcastManager = f15119f;
        }
        return appLovinBroadcastManager;
    }

    public void registerReceiver(Receiver receiver, IntentFilter intentFilter) {
        synchronized (this.f15122b) {
            b bVar = new b(intentFilter, receiver);
            ArrayList arrayList = this.f15122b.get(receiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.f15122b.put(receiver, arrayList);
            }
            arrayList.add(bVar);
            Iterator<String> actionsIterator = intentFilter.actionsIterator();
            while (actionsIterator.hasNext()) {
                String next = actionsIterator.next();
                ArrayList arrayList2 = this.f15123c.get(next);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.f15123c.put(next, arrayList2);
                }
                arrayList2.add(bVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean sendBroadcast(android.content.Intent r5, java.util.Map<java.lang.String, java.lang.Object> r6) {
        /*
            r4 = this;
            java.util.Map<com.applovin.impl.sdk.AppLovinBroadcastManager$Receiver, java.util.ArrayList<com.applovin.impl.sdk.AppLovinBroadcastManager$b>> r0 = r4.f15122b
            monitor-enter(r0)
            java.util.List r1 = r4.a((android.content.Intent) r5)     // Catch:{ all -> 0x0026 }
            if (r1 != 0) goto L_0x000c
            r5 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return r5
        L_0x000c:
            java.util.ArrayList<com.applovin.impl.sdk.AppLovinBroadcastManager$a> r2 = r4.f15124d     // Catch:{ all -> 0x0026 }
            com.applovin.impl.sdk.AppLovinBroadcastManager$a r3 = new com.applovin.impl.sdk.AppLovinBroadcastManager$a     // Catch:{ all -> 0x0026 }
            r3.<init>(r5, r6, r1)     // Catch:{ all -> 0x0026 }
            r2.add(r3)     // Catch:{ all -> 0x0026 }
            android.os.Handler r5 = r4.f15125e     // Catch:{ all -> 0x0026 }
            r6 = 1
            boolean r5 = r5.hasMessages(r6)     // Catch:{ all -> 0x0026 }
            if (r5 != 0) goto L_0x0024
            android.os.Handler r5 = r4.f15125e     // Catch:{ all -> 0x0026 }
            r5.sendEmptyMessage(r6)     // Catch:{ all -> 0x0026 }
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return r6
        L_0x0026:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.AppLovinBroadcastManager.sendBroadcast(android.content.Intent, java.util.Map):boolean");
    }

    public void sendBroadcastSync(Intent intent, Map<String, Object> map) {
        List<b> a2 = a(intent);
        if (a2 != null) {
            for (b next : a2) {
                if (!next.f15133d) {
                    next.f15131b.onReceive(this.f15121a, intent, map);
                }
            }
        }
    }

    public void sendBroadcastSyncWithPendingBroadcasts(Intent intent, Map<String, Object> map) {
        if (sendBroadcast(intent, map)) {
            a();
        }
    }

    public boolean sendBroadcastWithAdObject(String str, Object obj) {
        Map map = CollectionUtils.map(1);
        map.put("ad", obj);
        return sendBroadcast(new Intent(str), map);
    }

    public void unregisterReceiver(Receiver receiver) {
        synchronized (this.f15122b) {
            List<b> remove = this.f15122b.remove(receiver);
            if (remove != null) {
                for (b bVar : remove) {
                    bVar.f15133d = true;
                    Iterator<String> actionsIterator = bVar.f15130a.actionsIterator();
                    while (actionsIterator.hasNext()) {
                        String next = actionsIterator.next();
                        List list = this.f15123c.get(next);
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (((b) it.next()).f15131b == receiver) {
                                    bVar.f15133d = true;
                                    it.remove();
                                }
                            }
                            if (list.size() <= 0) {
                                this.f15123c.remove(next);
                            }
                        }
                    }
                }
            }
        }
    }
}
