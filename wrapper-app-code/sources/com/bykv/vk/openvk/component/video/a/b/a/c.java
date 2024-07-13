package com.bykv.vk.openvk.component.video.a.b.a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.a.b.d;
import com.bytedance.sdk.component.f.e;
import com.bytedance.sdk.component.f.g;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: DiskLruCache */
public class c extends a {

    /* renamed from: a  reason: collision with root package name */
    public final File f17950a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkedHashMap<String, File> f17951b = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: c  reason: collision with root package name */
    private final ReentrantReadWriteLock f17952c;

    /* renamed from: d  reason: collision with root package name */
    private final ReentrantReadWriteLock.ReadLock f17953d;

    /* renamed from: e  reason: collision with root package name */
    private final ReentrantReadWriteLock.WriteLock f17954e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<a> f17955f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public volatile long f17956g;

    /* renamed from: h  reason: collision with root package name */
    private volatile float f17957h;
    private final b i;
    private final Runnable j;
    private final Handler k;

    /* compiled from: DiskLruCache */
    public interface a {
        void a(String str);

        void a(Set<String> set);
    }

    public void a(a aVar) {
        if (aVar != null) {
            this.f17955f.add(aVar);
        }
    }

    public c(File file) throws IOException {
        String str;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f17952c = reentrantReadWriteLock;
        this.f17953d = reentrantReadWriteLock.readLock();
        this.f17954e = this.f17952c.writeLock();
        this.f17955f = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f17956g = 104857600;
        this.f17957h = 0.5f;
        this.i = new b();
        this.j = new Runnable() {
            public void run() {
                e.a((g) new g("cleanupCmd", 1) {
                    public void run() {
                        c.this.b(c.this.f17956g);
                    }
                });
            }
        };
        this.k = new Handler(Looper.getMainLooper());
        if (file == null || !file.exists() || !file.isDirectory() || !file.canRead() || !file.canWrite()) {
            if (file == null) {
                str = " dir null";
            } else {
                str = "exists: " + file.exists() + ", isDirectory: " + file.isDirectory() + ", canRead: " + file.canRead() + ", canWrite: " + file.canWrite();
            }
            throw new IOException("dir error!  " + str);
        }
        this.f17950a = file;
        e.a((g) new g("DiskLruCache", 5) {
            public void run() {
                c.this.b();
            }
        });
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    public void b() {
        this.f17954e.lock();
        try {
            File[] listFiles = this.f17950a.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                final HashMap hashMap = new HashMap(listFiles.length);
                ArrayList arrayList = new ArrayList(listFiles.length);
                for (File file : listFiles) {
                    if (file.isFile()) {
                        arrayList.add(file);
                        hashMap.put(file, Long.valueOf(file.lastModified()));
                    }
                }
                Collections.sort(arrayList, new Comparator<File>() {
                    /* renamed from: a */
                    public int compare(File file, File file2) {
                        int i = ((((Long) hashMap.get(file)).longValue() - ((Long) hashMap.get(file2)).longValue()) > 0 ? 1 : ((((Long) hashMap.get(file)).longValue() - ((Long) hashMap.get(file2)).longValue()) == 0 ? 0 : -1));
                        if (i < 0) {
                            return -1;
                        }
                        return i > 0 ? 1 : 0;
                    }
                });
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    File file2 = (File) it.next();
                    this.f17951b.put(a(file2), file2);
                }
            }
            this.f17954e.unlock();
            c();
        } catch (Throwable th) {
            this.f17954e.unlock();
            throw th;
        }
    }

    public void a(long j2) {
        this.f17956g = j2;
        c();
    }

    private void c() {
        this.k.removeCallbacks(this.j);
        this.k.postDelayed(this.j, 10000);
    }

    public void a() {
        d.c().d();
        Context a2 = com.bykv.vk.openvk.component.video.a.b.e.a();
        if (a2 != null) {
            com.bykv.vk.openvk.component.video.a.b.b.c.a(a2).a(0);
        }
        this.k.removeCallbacks(this.j);
        e.a((g) new g("clear", 1) {
            public void run() {
                c.this.b(0);
            }
        });
    }

    public void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.i.a(str);
        }
    }

    public void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.i.b(str);
        }
    }

    public File c(String str) {
        this.f17953d.lock();
        File file = this.f17951b.get(str);
        this.f17953d.unlock();
        if (file != null) {
            return file;
        }
        File file2 = new File(this.f17950a, str);
        this.f17954e.lock();
        this.f17951b.put(str, file2);
        this.f17954e.unlock();
        for (a a2 : this.f17955f) {
            a2.a(str);
        }
        c();
        return file2;
    }

    public File d(String str) {
        if (!this.f17953d.tryLock()) {
            return null;
        }
        File file = this.f17951b.get(str);
        this.f17953d.unlock();
        return file;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e4 A[LOOP:3: B:42:0x00de->B:44:0x00e4, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(long r13) {
        /*
            r12 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r12.f17954e
            r1.lock()
            r1 = 0
            r3 = 0
            java.util.LinkedHashMap<java.lang.String, java.io.File> r4 = r12.f17951b     // Catch:{ all -> 0x00ce }
            java.util.Set r4 = r4.entrySet()     // Catch:{ all -> 0x00ce }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00ce }
        L_0x0017:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x00ce }
            if (r5 == 0) goto L_0x002f
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x00ce }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ all -> 0x00ce }
            java.lang.Object r5 = r5.getValue()     // Catch:{ all -> 0x00ce }
            java.io.File r5 = (java.io.File) r5     // Catch:{ all -> 0x00ce }
            long r5 = r5.length()     // Catch:{ all -> 0x00ce }
            long r1 = r1 + r5
            goto L_0x0017
        L_0x002f:
            int r4 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r4 > 0) goto L_0x0039
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r13 = r12.f17954e
            r13.unlock()
            return
        L_0x0039:
            float r13 = (float) r13
            float r14 = r12.f17957h     // Catch:{ all -> 0x00ce }
            float r13 = r13 * r14
            long r13 = (long) r13     // Catch:{ all -> 0x00ce }
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ all -> 0x00ce }
            r4.<init>()     // Catch:{ all -> 0x00ce }
            java.util.LinkedHashMap<java.lang.String, java.io.File> r3 = r12.f17951b     // Catch:{ all -> 0x00cb }
            java.util.Set r3 = r3.entrySet()     // Catch:{ all -> 0x00cb }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00cb }
        L_0x004e:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x00cb }
            if (r5 == 0) goto L_0x00af
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x00cb }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ all -> 0x00cb }
            java.lang.Object r6 = r5.getValue()     // Catch:{ all -> 0x00cb }
            java.io.File r6 = (java.io.File) r6     // Catch:{ all -> 0x00cb }
            if (r6 == 0) goto L_0x00a4
            boolean r7 = r6.exists()     // Catch:{ all -> 0x00cb }
            if (r7 == 0) goto L_0x00a4
            com.bykv.vk.openvk.component.video.a.b.a.c$b r7 = r12.i     // Catch:{ all -> 0x00cb }
            java.lang.String r8 = r12.a((java.io.File) r6)     // Catch:{ all -> 0x00cb }
            boolean r7 = r7.c(r8)     // Catch:{ all -> 0x00cb }
            if (r7 != 0) goto L_0x00ab
            long r7 = r6.length()     // Catch:{ all -> 0x00cb }
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x00cb }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cb }
            r10.<init>()     // Catch:{ all -> 0x00cb }
            java.lang.String r11 = r6.getAbsolutePath()     // Catch:{ all -> 0x00cb }
            r10.append(r11)     // Catch:{ all -> 0x00cb }
            java.lang.String r11 = "-tmp"
            r10.append(r11)     // Catch:{ all -> 0x00cb }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00cb }
            r9.<init>(r10)     // Catch:{ all -> 0x00cb }
            boolean r6 = r6.renameTo(r9)     // Catch:{ all -> 0x00cb }
            if (r6 == 0) goto L_0x00ab
            r0.add(r9)     // Catch:{ all -> 0x00cb }
            long r1 = r1 - r7
            java.lang.Object r5 = r5.getKey()     // Catch:{ all -> 0x00cb }
            r4.add(r5)     // Catch:{ all -> 0x00cb }
            goto L_0x00ab
        L_0x00a4:
            java.lang.Object r5 = r5.getKey()     // Catch:{ all -> 0x00cb }
            r4.add(r5)     // Catch:{ all -> 0x00cb }
        L_0x00ab:
            int r5 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r5 > 0) goto L_0x004e
        L_0x00af:
            java.util.Iterator r13 = r4.iterator()     // Catch:{ all -> 0x00cb }
        L_0x00b3:
            boolean r14 = r13.hasNext()     // Catch:{ all -> 0x00cb }
            if (r14 == 0) goto L_0x00c5
            java.lang.Object r14 = r13.next()     // Catch:{ all -> 0x00cb }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x00cb }
            java.util.LinkedHashMap<java.lang.String, java.io.File> r1 = r12.f17951b     // Catch:{ all -> 0x00cb }
            r1.remove(r14)     // Catch:{ all -> 0x00cb }
            goto L_0x00b3
        L_0x00c5:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r13 = r12.f17954e
            r13.unlock()
            goto L_0x00d8
        L_0x00cb:
            r13 = move-exception
            r3 = r4
            goto L_0x00cf
        L_0x00ce:
            r13 = move-exception
        L_0x00cf:
            r13.printStackTrace()     // Catch:{ all -> 0x00fa }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r13 = r12.f17954e
            r13.unlock()
            r4 = r3
        L_0x00d8:
            java.util.Set<com.bykv.vk.openvk.component.video.a.b.a.c$a> r13 = r12.f17955f
            java.util.Iterator r13 = r13.iterator()
        L_0x00de:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x00ee
            java.lang.Object r14 = r13.next()
            com.bykv.vk.openvk.component.video.a.b.a.c$a r14 = (com.bykv.vk.openvk.component.video.a.b.a.c.a) r14
            r14.a((java.util.Set<java.lang.String>) r4)
            goto L_0x00de
        L_0x00ee:
            com.bykv.vk.openvk.component.video.a.b.a.c$5 r13 = new com.bykv.vk.openvk.component.video.a.b.a.c$5
            r14 = 1
            java.lang.String r1 = "trimSize"
            r13.<init>(r1, r14, r0)
            com.bytedance.sdk.component.f.e.a((com.bytedance.sdk.component.f.g) r13)
            return
        L_0x00fa:
            r13 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r14 = r12.f17954e
            r14.unlock()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.component.video.a.b.a.c.b(long):void");
    }

    private String a(File file) {
        return file.getName();
    }

    /* compiled from: DiskLruCache */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, Integer> f17966a;

        private b() {
            this.f17966a = new HashMap();
        }

        /* access modifiers changed from: package-private */
        public synchronized void a(String str) {
            if (!TextUtils.isEmpty(str)) {
                Integer num = this.f17966a.get(str);
                if (num == null) {
                    this.f17966a.put(str, 1);
                } else {
                    this.f17966a.put(str, Integer.valueOf(num.intValue() + 1));
                }
            }
        }

        /* access modifiers changed from: package-private */
        public synchronized void b(String str) {
            Integer num;
            if (!TextUtils.isEmpty(str) && (num = this.f17966a.get(str)) != null) {
                if (num.intValue() == 1) {
                    this.f17966a.remove(str);
                } else {
                    this.f17966a.put(str, Integer.valueOf(num.intValue() - 1));
                }
            }
        }

        /* access modifiers changed from: package-private */
        public synchronized boolean c(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return this.f17966a.containsKey(str);
        }
    }
}
