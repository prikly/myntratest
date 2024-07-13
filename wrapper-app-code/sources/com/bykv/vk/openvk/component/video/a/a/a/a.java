package com.bykv.vk.openvk.component.video.a.a.a;

import android.os.Build;
import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.a.a.b.b;
import com.bykv.vk.openvk.component.video.api.c.c;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: MediaCacheDirImpl */
public class a implements com.bykv.vk.openvk.component.video.api.a.a {

    /* renamed from: a  reason: collision with root package name */
    private String f17912a = "video_feed";

    /* renamed from: b  reason: collision with root package name */
    private String f17913b = "video_reward_full";

    /* renamed from: c  reason: collision with root package name */
    private String f17914c = "video_brand";

    /* renamed from: d  reason: collision with root package name */
    private String f17915d = "video_splash";

    /* renamed from: e  reason: collision with root package name */
    private String f17916e = "video_default";

    /* renamed from: f  reason: collision with root package name */
    private String f17917f = null;

    /* renamed from: g  reason: collision with root package name */
    private String f17918g = null;

    /* renamed from: h  reason: collision with root package name */
    private String f17919h = null;
    private String i = null;
    private String j = null;
    private String k = null;

    public void a(String str) {
        this.f17917f = str;
    }

    public String a() {
        if (this.f17918g == null) {
            this.f17918g = this.f17917f + File.separator + this.f17912a;
            File file = new File(this.f17918g);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f17918g;
    }

    public String b() {
        if (this.f17919h == null) {
            this.f17919h = this.f17917f + File.separator + this.f17913b;
            File file = new File(this.f17919h);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f17919h;
    }

    public void c() {
        HashSet hashSet = new HashSet();
        if (Build.VERSION.SDK_INT >= 23) {
            for (com.bykv.vk.openvk.component.video.a.a.a next : com.bykv.vk.openvk.component.video.a.a.a.f17907a.values()) {
                if (!(next == null || next.a() == null)) {
                    c a2 = next.a();
                    hashSet.add(com.bykv.vk.openvk.component.video.a.e.c.b(a2.a(), a2.k()).getAbsolutePath());
                }
            }
            for (b next2 : com.bykv.vk.openvk.component.video.a.a.b.c.f17938a.values()) {
                if (!(next2 == null || next2.a() == null)) {
                    c a3 = next2.a();
                    hashSet.add(com.bykv.vk.openvk.component.video.a.e.c.b(a3.a(), a3.k()).getAbsolutePath());
                }
            }
        }
        a(new File(a()), 30, hashSet);
        a(new File(b()), 20, hashSet);
    }

    public boolean a(c cVar) {
        if (TextUtils.isEmpty(cVar.a()) || TextUtils.isEmpty(cVar.k())) {
            return false;
        }
        return new File(cVar.a(), cVar.k()).exists();
    }

    public long b(c cVar) {
        if (TextUtils.isEmpty(cVar.a()) || TextUtils.isEmpty(cVar.k())) {
            return 0;
        }
        return com.bykv.vk.openvk.component.video.a.e.c.a(cVar.a(), cVar.k());
    }

    private static void a(File file, int i2, Set<String> set) {
        if (i2 >= 0 && file.exists() && !file.isFile()) {
            try {
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length > i2) {
                    List asList = Arrays.asList(listFiles);
                    Collections.sort(asList, new Comparator<File>() {
                        /* renamed from: a */
                        public int compare(File file, File file2) {
                            int i = ((file2.lastModified() - file.lastModified()) > 0 ? 1 : ((file2.lastModified() - file.lastModified()) == 0 ? 0 : -1));
                            if (i == 0) {
                                return 0;
                            }
                            return i < 0 ? -1 : 1;
                        }
                    });
                    while (i2 < asList.size()) {
                        File file2 = (File) asList.get(i2);
                        if (set != null && !set.contains(file2.getAbsolutePath())) {
                            ((File) asList.get(i2)).delete();
                        }
                        i2++;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
