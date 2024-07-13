package com.explorestack.iab.vast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import java.util.WeakHashMap;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f3235a = false;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f3236b = false;

    /* renamed from: c  reason: collision with root package name */
    public static final WeakHashMap<View, C0036b> f3237c = new WeakHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public static final BroadcastReceiver f3238d = new a();

    /* renamed from: e  reason: collision with root package name */
    public static final IntentFilter f3239e;

    public class a extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            synchronized (b.class) {
                boolean unused = b.f3236b = "android.intent.action.SCREEN_ON".equals(intent.getAction());
            }
            WeakHashMap<View, C0036b> weakHashMap = b.f3237c;
            synchronized (weakHashMap) {
                for (C0036b a2 : weakHashMap.values()) {
                    a2.a(b.f3236b);
                }
            }
        }
    }

    /* renamed from: com.explorestack.iab.vast.b$b  reason: collision with other inner class name */
    public interface C0036b {
        void a(boolean z);
    }

    static {
        IntentFilter intentFilter = new IntentFilter();
        f3239e = intentFilter;
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static synchronized void a(android.content.Context r3) {
        /*
            java.lang.Class<com.explorestack.iab.vast.b> r0 = com.explorestack.iab.vast.b.class
            monitor-enter(r0)
            boolean r1 = f3235a     // Catch:{ all -> 0x002f }
            if (r1 != 0) goto L_0x002d
            monitor-enter(r0)     // Catch:{ all -> 0x002f }
            boolean r1 = f3235a     // Catch:{ all -> 0x002a }
            if (r1 != 0) goto L_0x0028
            java.lang.String r1 = "power"
            java.lang.Object r1 = r3.getSystemService(r1)     // Catch:{ all -> 0x002a }
            android.os.PowerManager r1 = (android.os.PowerManager) r1     // Catch:{ all -> 0x002a }
            boolean r1 = r1.isScreenOn()     // Catch:{ all -> 0x002a }
            f3236b = r1     // Catch:{ all -> 0x002a }
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x002a }
            android.content.BroadcastReceiver r1 = f3238d     // Catch:{ all -> 0x002a }
            android.content.IntentFilter r2 = f3239e     // Catch:{ all -> 0x002a }
            r3.registerReceiver(r1, r2)     // Catch:{ all -> 0x002a }
            r3 = 1
            f3235a = r3     // Catch:{ all -> 0x002a }
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            goto L_0x002d
        L_0x002a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r3     // Catch:{ all -> 0x002f }
        L_0x002d:
            monitor-exit(r0)
            return
        L_0x002f:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.iab.vast.b.a(android.content.Context):void");
    }

    public static void a(View view) {
        if (f3235a) {
            WeakHashMap<View, C0036b> weakHashMap = f3237c;
            synchronized (weakHashMap) {
                weakHashMap.remove(view);
            }
        }
    }

    public static void a(View view, C0036b bVar) {
        a(view.getContext());
        WeakHashMap<View, C0036b> weakHashMap = f3237c;
        synchronized (weakHashMap) {
            weakHashMap.put(view, bVar);
        }
    }

    public static boolean b(Context context) {
        a(context);
        return f3236b;
    }
}
