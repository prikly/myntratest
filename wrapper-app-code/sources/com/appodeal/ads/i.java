package com.appodeal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.appodeal.ads.d1;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.unified.UnifiedAppStateChangeListener;
import com.appodeal.ads.utils.ActivityRule;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.app.AppState;
import com.appodeal.ads.utils.c0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

public final class i {

    /* renamed from: g  reason: collision with root package name */
    public static EnumMap<AdType, i> f16459g = new EnumMap<>(AdType.class);

    /* renamed from: h  reason: collision with root package name */
    public static final ArrayList f16460h = new ArrayList();
    public static final ArrayList i = new ArrayList();
    public static final ConcurrentHashMap j = new ConcurrentHashMap();
    public static final AtomicBoolean k = new AtomicBoolean(false);
    public static final /* synthetic */ boolean l = (!i.class.desiredAssertionStatus());

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f16461a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f16462b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final CopyOnWriteArraySet f16463c = new CopyOnWriteArraySet();

    /* renamed from: d  reason: collision with root package name */
    public final ConcurrentHashMap f16464d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f16465e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f16466f = new AtomicBoolean(false);

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f16467a;

        public b(CountDownLatch countDownLatch) {
            this.f16467a = countDownLatch;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f16468a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16469b;

        /* renamed from: c  reason: collision with root package name */
        public final String f16470c;

        /* renamed from: d  reason: collision with root package name */
        public final JSONArray f16471d;

        public c(String str, String str2, String str3, JSONArray jSONArray) {
            this.f16468a = str;
            this.f16469b = str2;
            this.f16470c = str3;
            this.f16471d = jSONArray;
        }
    }

    static {
        com.appodeal.ads.utils.app.b.All.a((com.appodeal.ads.utils.app.a) new a());
    }

    public static i a(AdType adType) {
        i iVar = f16459g.get(adType);
        if (iVar == null) {
            synchronized (i.class) {
                iVar = f16459g.get(adType);
                if (iVar == null) {
                    iVar = new i();
                    f16459g.put(adType, iVar);
                }
            }
        }
        return iVar;
    }

    public static String a(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append(10);
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
                throw th;
            }
            try {
                break;
            } catch (IOException e4) {
                e4.printStackTrace();
            }
        }
        inputStream.close();
        return sb.toString();
    }

    public static void a(AdNetwork adNetwork) {
        String version = adNetwork.getVersion();
        String recommendedVersion = adNetwork.getRecommendedVersion();
        if (!TextUtils.isEmpty(recommendedVersion) && !TextUtils.equals(version, recommendedVersion)) {
            String a2 = n5.a(adNetwork.getName());
            Log.e("Appodeal", String.format("%s [%s]: Your '%s' SDK version (%s) doesn't match recommended. Please use '%s' SDK version %s instead to be sure that everything will work correctly.", new Object[]{LogConstants.KEY_NETWORK, LogConstants.EVENT_ERROR, a2, version, a2, recommendedVersion}));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0084 A[Catch:{ all -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.util.ArrayList c(android.content.Context r9) {
        /*
            java.lang.Class<com.appodeal.ads.i> r0 = com.appodeal.ads.i.class
            monitor-enter(r0)
            java.util.ArrayList r1 = f16460h     // Catch:{ all -> 0x00a0 }
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x00a0 }
            if (r2 != 0) goto L_0x000d
            monitor-exit(r0)
            return r1
        L_0x000d:
            android.content.res.AssetManager r2 = r9.getAssets()     // Catch:{ all -> 0x00a0 }
            java.lang.String r3 = "apd_adapters"
            java.lang.String[] r2 = r2.list(r3)     // Catch:{ all -> 0x00a0 }
            if (r2 == 0) goto L_0x0095
            int r3 = r2.length     // Catch:{ all -> 0x00a0 }
            if (r3 != 0) goto L_0x001e
            goto L_0x0095
        L_0x001e:
            int r1 = r2.length     // Catch:{ all -> 0x00a0 }
            r3 = 0
        L_0x0020:
            if (r3 >= r1) goto L_0x0091
            r4 = r2[r3]     // Catch:{ all -> 0x00a0 }
            java.lang.String r5 = ".apdnetwork"
            boolean r5 = r4.endsWith(r5)     // Catch:{ all -> 0x00a0 }
            if (r5 == 0) goto L_0x008e
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x008a }
            android.content.res.AssetManager r6 = r9.getAssets()     // Catch:{ all -> 0x008a }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x008a }
            r7.<init>()     // Catch:{ all -> 0x008a }
            java.lang.String r8 = "apd_adapters/"
            r7.append(r8)     // Catch:{ all -> 0x008a }
            r7.append(r4)     // Catch:{ all -> 0x008a }
            java.lang.String r4 = r7.toString()     // Catch:{ all -> 0x008a }
            java.io.InputStream r4 = r6.open(r4)     // Catch:{ all -> 0x008a }
            java.lang.String r4 = a((java.io.InputStream) r4)     // Catch:{ all -> 0x008a }
            r5.<init>(r4)     // Catch:{ all -> 0x008a }
            java.lang.String r4 = "name"
            java.lang.String r4 = r5.optString(r4)     // Catch:{ all -> 0x008a }
            java.lang.String r6 = "builder"
            java.lang.String r6 = r5.optString(r6)     // Catch:{ all -> 0x008a }
            java.lang.String r7 = "adapter_version"
            java.lang.String r7 = r5.optString(r7)     // Catch:{ all -> 0x008a }
            java.lang.String r8 = "types"
            org.json.JSONArray r5 = r5.optJSONArray(r8)     // Catch:{ all -> 0x008a }
            boolean r8 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x008a }
            if (r8 != 0) goto L_0x0081
            boolean r8 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x008a }
            if (r8 != 0) goto L_0x0081
            if (r5 == 0) goto L_0x0081
            int r8 = r5.length()     // Catch:{ all -> 0x008a }
            if (r8 != 0) goto L_0x007b
            goto L_0x0081
        L_0x007b:
            com.appodeal.ads.i$c r8 = new com.appodeal.ads.i$c     // Catch:{ all -> 0x008a }
            r8.<init>(r4, r6, r7, r5)     // Catch:{ all -> 0x008a }
            goto L_0x0082
        L_0x0081:
            r8 = 0
        L_0x0082:
            if (r8 == 0) goto L_0x008e
            java.util.ArrayList r4 = f16460h     // Catch:{ all -> 0x008a }
            r4.add(r8)     // Catch:{ all -> 0x008a }
            goto L_0x008e
        L_0x008a:
            r4 = move-exception
            com.appodeal.ads.utils.Log.log(r4)     // Catch:{ all -> 0x00a0 }
        L_0x008e:
            int r3 = r3 + 1
            goto L_0x0020
        L_0x0091:
            java.util.ArrayList r9 = f16460h     // Catch:{ all -> 0x00a0 }
            monitor-exit(r0)
            return r9
        L_0x0095:
            java.lang.String r9 = "SDK"
            java.lang.String r2 = "Initialize"
            java.lang.String r3 = "No adapters found in app assets"
            com.appodeal.ads.utils.Log.log((java.lang.String) r9, (java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x00a0 }
            monitor-exit(r0)
            return r1
        L_0x00a0:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.i.c(android.content.Context):java.util.ArrayList");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x007e A[Catch:{ all -> 0x0098 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0095 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void d(android.content.Context r7) {
        /*
            java.lang.Class<com.appodeal.ads.i> r0 = com.appodeal.ads.i.class
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = k     // Catch:{ all -> 0x009e }
            boolean r2 = r1.get()     // Catch:{ all -> 0x009e }
            if (r2 == 0) goto L_0x000d
            monitor-exit(r0)
            return
        L_0x000d:
            r2 = 1
            r1.set(r2)     // Catch:{ all -> 0x009e }
            java.util.ArrayList r7 = c(r7)     // Catch:{ all -> 0x0098 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0098 }
        L_0x0019:
            boolean r1 = r7.hasNext()     // Catch:{ all -> 0x0098 }
            if (r1 == 0) goto L_0x009c
            java.lang.Object r1 = r7.next()     // Catch:{ all -> 0x0098 }
            com.appodeal.ads.i$c r1 = (com.appodeal.ads.i.c) r1     // Catch:{ all -> 0x0098 }
            r2 = 0
        L_0x0026:
            org.json.JSONArray r3 = r1.f16471d     // Catch:{ all -> 0x0098 }
            int r3 = r3.length()     // Catch:{ all -> 0x0098 }
            if (r2 >= r3) goto L_0x0019
            org.json.JSONArray r3 = r1.f16471d     // Catch:{ all -> 0x0098 }
            java.lang.String r3 = r3.optString(r2)     // Catch:{ all -> 0x0098 }
            r4 = 0
            java.lang.String r5 = "banner"
            boolean r5 = r5.equals(r3)     // Catch:{ all -> 0x0098 }
            if (r5 == 0) goto L_0x0045
            com.appodeal.ads.modules.common.internal.adtype.AdType r3 = com.appodeal.ads.modules.common.internal.adtype.AdType.Banner     // Catch:{ all -> 0x0098 }
        L_0x0043:
            r4 = r3
            goto L_0x007c
        L_0x0045:
            java.lang.String r5 = "mrec"
            boolean r5 = r5.equals(r3)     // Catch:{ all -> 0x0098 }
            if (r5 == 0) goto L_0x0050
            com.appodeal.ads.modules.common.internal.adtype.AdType r3 = com.appodeal.ads.modules.common.internal.adtype.AdType.Mrec     // Catch:{ all -> 0x0098 }
            goto L_0x0043
        L_0x0050:
            java.lang.String r5 = "rewarded_video"
            boolean r5 = r5.equals(r3)     // Catch:{ all -> 0x0098 }
            if (r5 == 0) goto L_0x005b
            com.appodeal.ads.modules.common.internal.adtype.AdType r3 = com.appodeal.ads.modules.common.internal.adtype.AdType.Rewarded     // Catch:{ all -> 0x0098 }
            goto L_0x0043
        L_0x005b:
            java.lang.String r5 = "interstitial"
            boolean r5 = r5.equals(r3)     // Catch:{ all -> 0x0098 }
            if (r5 == 0) goto L_0x0066
            com.appodeal.ads.modules.common.internal.adtype.AdType r3 = com.appodeal.ads.modules.common.internal.adtype.AdType.Interstitial     // Catch:{ all -> 0x0098 }
            goto L_0x0043
        L_0x0066:
            java.lang.String r5 = "video"
            boolean r5 = r5.equals(r3)     // Catch:{ all -> 0x0098 }
            if (r5 == 0) goto L_0x0071
            com.appodeal.ads.modules.common.internal.adtype.AdType r3 = com.appodeal.ads.modules.common.internal.adtype.AdType.Video     // Catch:{ all -> 0x0098 }
            goto L_0x0043
        L_0x0071:
            java.lang.String r5 = "native"
            boolean r3 = r5.equals(r3)     // Catch:{ all -> 0x0098 }
            if (r3 == 0) goto L_0x007c
            com.appodeal.ads.modules.common.internal.adtype.AdType r3 = com.appodeal.ads.modules.common.internal.adtype.AdType.Native     // Catch:{ all -> 0x0098 }
            goto L_0x0043
        L_0x007c:
            if (r4 == 0) goto L_0x0095
            com.appodeal.ads.i r3 = a((com.appodeal.ads.modules.common.internal.adtype.AdType) r4)     // Catch:{ all -> 0x0098 }
            java.lang.String r4 = r1.f16468a     // Catch:{ all -> 0x0098 }
            java.lang.String r5 = r1.f16469b     // Catch:{ all -> 0x0098 }
            java.lang.String r6 = r1.f16470c     // Catch:{ all -> 0x0098 }
            java.util.concurrent.ConcurrentHashMap r3 = r3.f16461a     // Catch:{ all -> 0x0098 }
            android.util.Pair r5 = android.util.Pair.create(r5, r6)     // Catch:{ all -> 0x0098 }
            r3.put(r4, r5)     // Catch:{ all -> 0x0098 }
        L_0x0095:
            int r2 = r2 + 1
            goto L_0x0026
        L_0x0098:
            r7 = move-exception
            com.appodeal.ads.utils.Log.log(r7)     // Catch:{ all -> 0x009e }
        L_0x009c:
            monitor-exit(r0)
            return
        L_0x009e:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.i.d(android.content.Context):void");
    }

    public final Set<String> a() {
        Set<String> keySet = this.f16461a.keySet();
        keySet.removeAll(this.f16463c);
        return keySet;
    }

    public final synchronized void a(Context context) {
        synchronized (this.f16465e) {
            if (!this.f16465e.get()) {
                this.f16465e.set(true);
                new j(this, context).start();
            }
        }
    }

    public final void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (l || str != null) {
                this.f16463c.add(str);
                this.f16462b.remove(str);
                return;
            }
            throw new AssertionError();
        }
    }

    public final void a(String str, AdNetworkBuilder adNetworkBuilder, b bVar) {
        if (this.f16463c.contains(str)) {
            if (adNetworkBuilder != null) {
                this.f16464d.put(str, adNetworkBuilder);
            }
            a(str);
            bVar.f16467a.countDown();
            return;
        }
        AdNetwork build = adNetworkBuilder.build();
        if (build != null) {
            this.f16462b.put(str, build);
            ArrayList arrayList = i;
            synchronized (arrayList) {
                if (!arrayList.contains(str)) {
                    com.appodeal.ads.utils.Log.log(LogConstants.KEY_NETWORK, LogConstants.EVENT_INFO, String.format("%s - ver. %s", new Object[]{n5.a(build.getName()), build.getVersion()}), Log.LogLevel.verbose);
                    a(build);
                    com.appodeal.ads.utils.c.f17486a.addAll(ActivityRule.f17463b.getActivityClassNameArray(build.getAdActivityRules()));
                    arrayList.add(str);
                    UnifiedAppStateChangeListener appStateChangeListener = build.getAppStateChangeListener();
                    if (appStateChangeListener != null) {
                        j.put(str, appStateChangeListener);
                    }
                }
            }
            bVar.f16467a.countDown();
            return;
        }
        this.f16464d.put(str, adNetworkBuilder);
        a(str);
        bVar.f16467a.countDown();
    }

    public final AdNetwork b(String str) {
        return (AdNetwork) this.f16462b.get(str);
    }

    public final synchronized i b(Context context) {
        synchronized (this.f16466f) {
            if (this.f16466f.get()) {
                return this;
            }
            d(context);
            CountDownLatch countDownLatch = new CountDownLatch(this.f16461a.size());
            b bVar = new b(countDownLatch);
            for (Map.Entry entry : this.f16461a.entrySet()) {
                a((String) entry.getKey(), (String) ((Pair) entry.getValue()).first, bVar);
            }
            try {
                countDownLatch.await();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
            a(Constants.DEBUG_INTERSTITIAL, (AdNetworkBuilder) new d1.c(), bVar);
            this.f16466f.set(true);
            return this;
        }
    }

    public final Collection<AdNetwork> b() {
        return this.f16462b.values();
    }

    public class a extends c0 {
        public final void a(Configuration configuration) {
            for (UnifiedAppStateChangeListener onAppStateChanged : i.j.values()) {
                Activity activity = com.appodeal.ads.context.b.f16327b.f16328a.getActivity();
                onAppStateChanged.onAppStateChanged(activity, AppState.ConfChanged, com.appodeal.ads.utils.c.a(activity));
            }
        }

        public final void a(Activity activity, AppState appState) {
            for (UnifiedAppStateChangeListener onAppStateChanged : i.j.values()) {
                onAppStateChanged.onAppStateChanged(activity, appState, com.appodeal.ads.utils.c.a(activity));
            }
        }
    }

    public final void a(String str, String str2, b bVar) {
        boolean z;
        if (this.f16463c.contains(str)) {
            a(str);
            bVar.f16467a.countDown();
            return;
        }
        try {
            String[] strArr = {str2};
            int i2 = 0;
            while (i2 < 1) {
                try {
                    Class.forName(strArr[i2], false, q4.class.getClassLoader());
                    i2++;
                } catch (ClassNotFoundException | NoClassDefFoundError unused) {
                    z = false;
                }
            }
            z = true;
            if (!z) {
                a(str);
                bVar.f16467a.countDown();
                com.appodeal.ads.utils.Log.log(new com.appodeal.ads.utils.exception_handler.a(String.format("Failed to load classes for network: %s", new Object[]{n5.a(str.split("\\.")[0])})));
                return;
            }
            a(str, (AdNetworkBuilder) Class.forName(str2).newInstance(), bVar);
        } catch (Exception e2) {
            com.appodeal.ads.utils.Log.log(e2);
            a(str);
            bVar.f16467a.countDown();
        }
    }
}
