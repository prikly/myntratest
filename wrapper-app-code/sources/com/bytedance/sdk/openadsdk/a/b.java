package com.bytedance.sdk.openadsdk.a;

import com.bytedance.sdk.component.utils.l;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: TotalCountLruDiskFile */
public class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private int f19378a = 15;

    /* renamed from: b  reason: collision with root package name */
    private int f19379b = 3;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f19380c;

    public b(int i, int i2) {
        if (i > 0) {
            this.f19378a = i;
            this.f19379b = i2;
            return;
        }
        throw new IllegalArgumentException("Max count must be positive number!");
    }

    public b(int i, int i2, boolean z) {
        if (i > 0) {
            this.f19378a = i;
            this.f19379b = i2;
            this.f19380c = z;
            return;
        }
        throw new IllegalArgumentException("Max count must be positive number!");
    }

    /* access modifiers changed from: protected */
    public boolean a(long j, int i) {
        return i <= this.f19378a;
    }

    /* access modifiers changed from: protected */
    public boolean a(File file, long j, int i) {
        return i <= this.f19379b;
    }

    /* access modifiers changed from: protected */
    public void a(List<File> list) {
        if (this.f19380c) {
            d(list);
            this.f19380c = false;
            return;
        }
        c(list);
    }

    private void c(List<File> list) {
        long b2 = b(list);
        int size = list.size();
        if (!a(b2, size)) {
            for (File next : list) {
                long length = next.length();
                if (next.delete()) {
                    size--;
                    b2 -= length;
                    l.c("TotalCountLruDiskFile", "Cache file " + next + " is deleted because it exceeds cache limit");
                } else {
                    l.c("TotalCountLruDiskFile", "Error deleting file " + next + " for trimming cache");
                }
                if (a(next, b2, size)) {
                    return;
                }
            }
        }
    }

    private void d(List<File> list) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    long b2 = b(list);
                    int size = list.size();
                    boolean a2 = a(b2, size);
                    if (a2) {
                        l.c("splashLoadAd", "Do not meet the delete condition, do not perform a delete operation(true)" + a2);
                        return;
                    }
                    TreeMap treeMap = new TreeMap();
                    for (File next : list) {
                        treeMap.put(Long.valueOf(next.lastModified()), next);
                    }
                    for (Map.Entry entry : treeMap.entrySet()) {
                        if (entry != null) {
                            if (!a2) {
                                l.e("splashLoadAd", "LRUDeleteFile deleting fileTime " + ((Long) entry.getKey()).longValue());
                                File file = (File) entry.getValue();
                                long length = file.length();
                                if (file.delete()) {
                                    size--;
                                    b2 -= length;
                                    l.c("splashLoadAd", "Delete, the current total number of a Cache file：" + size);
                                } else {
                                    l.e("splashLoadAd", "Error deleting file " + file + " for trimming cache");
                                }
                                if (a(file, b2, size)) {
                                    l.c("splashLoadAd", "Stop deleting, the current total number totalCount：" + size + " Maximum storage limit number maxCount " + this.f19378a + " Minimum number " + this.f19379b);
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
