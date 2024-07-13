package com.yandex.metrica.networktasks.api;

import com.yandex.metrica.networktasks.impl.c;
import com.yandex.metrica.networktasks.impl.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class NetworkCore extends c {

    /* renamed from: b  reason: collision with root package name */
    private final BlockingQueue f7304b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f7305c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f7306d;

    /* renamed from: e  reason: collision with root package name */
    private volatile c f7307e;

    /* renamed from: f  reason: collision with root package name */
    private final e f7308f;

    public NetworkCore() {
        this(new e());
    }

    NetworkCore(e eVar) {
        this.f7304b = new LinkedBlockingQueue();
        this.f7305c = new Object();
        this.f7306d = new Object();
        this.f7308f = eVar;
    }

    public void onDestroy() {
        synchronized (this.f7306d) {
            c cVar = this.f7307e;
            if (cVar != null) {
                cVar.f7336a.onTaskRemoved();
            }
            ArrayList arrayList = new ArrayList(this.f7304b.size());
            this.f7304b.drainTo(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((c) it.next()).f7336a.onTaskRemoved();
            }
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public void run() {
        /*
            r4 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            boolean r2 = r4.isRunning()
            if (r2 == 0) goto L_0x005f
            java.lang.Object r2 = r4.f7306d     // Catch:{ InterruptedException -> 0x004d, all -> 0x003a }
            monitor-enter(r2)     // Catch:{ InterruptedException -> 0x004d, all -> 0x003a }
            monitor-exit(r2)     // Catch:{ all -> 0x0037 }
            java.util.concurrent.BlockingQueue r2 = r4.f7304b     // Catch:{ InterruptedException -> 0x004d, all -> 0x003a }
            java.lang.Object r2 = r2.take()     // Catch:{ InterruptedException -> 0x004d, all -> 0x003a }
            com.yandex.metrica.networktasks.api.c r2 = (com.yandex.metrica.networktasks.api.c) r2     // Catch:{ InterruptedException -> 0x004d, all -> 0x003a }
            r4.f7307e = r2     // Catch:{ InterruptedException -> 0x004d, all -> 0x003a }
            com.yandex.metrica.networktasks.api.c r2 = r4.f7307e     // Catch:{ InterruptedException -> 0x004d, all -> 0x003a }
            com.yandex.metrica.networktasks.api.NetworkTask r1 = r2.f7336a     // Catch:{ InterruptedException -> 0x004d, all -> 0x003a }
            java.util.concurrent.Executor r2 = r1.getExecutor()     // Catch:{ InterruptedException -> 0x004d, all -> 0x003a }
            com.yandex.metrica.networktasks.impl.e r3 = r4.f7308f     // Catch:{ InterruptedException -> 0x004d, all -> 0x003a }
            com.yandex.metrica.networktasks.impl.f r3 = r3.a(r1, r4)     // Catch:{ InterruptedException -> 0x004d, all -> 0x003a }
            r2.execute(r3)     // Catch:{ InterruptedException -> 0x004d, all -> 0x003a }
            java.lang.Object r2 = r4.f7306d
            monitor-enter(r2)
            r4.f7307e = r0     // Catch:{ all -> 0x0034 }
            r1.onTaskFinished()     // Catch:{ all -> 0x0034 }
            r1.onTaskRemoved()     // Catch:{ all -> 0x0034 }
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            goto L_0x0002
        L_0x0034:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            throw r0
        L_0x0037:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0037 }
            throw r3     // Catch:{ InterruptedException -> 0x004d, all -> 0x003a }
        L_0x003a:
            r2 = move-exception
            java.lang.Object r3 = r4.f7306d
            monitor-enter(r3)
            r4.f7307e = r0     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x0048
            r1.onTaskFinished()     // Catch:{ all -> 0x004a }
            r1.onTaskRemoved()     // Catch:{ all -> 0x004a }
        L_0x0048:
            monitor-exit(r3)     // Catch:{ all -> 0x004a }
            throw r2
        L_0x004a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004a }
            throw r0
        L_0x004d:
            java.lang.Object r2 = r4.f7306d
            monitor-enter(r2)
            r4.f7307e = r0     // Catch:{ all -> 0x005c }
            if (r1 == 0) goto L_0x005a
            r1.onTaskFinished()     // Catch:{ all -> 0x005c }
            r1.onTaskRemoved()     // Catch:{ all -> 0x005c }
        L_0x005a:
            monitor-exit(r2)     // Catch:{ all -> 0x005c }
            goto L_0x0002
        L_0x005c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x005c }
            throw r0
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.networktasks.api.NetworkCore.run():void");
    }

    public void startTask(NetworkTask networkTask) {
        boolean z;
        synchronized (this.f7305c) {
            c cVar = new c(networkTask);
            if (isRunning()) {
                if (!this.f7304b.contains(cVar)) {
                    if (!cVar.equals(this.f7307e)) {
                        z = false;
                        if (!z && cVar.f7336a.onTaskAdded()) {
                            this.f7304b.offer(cVar);
                        }
                    }
                }
                z = true;
                this.f7304b.offer(cVar);
            }
        }
    }
}
