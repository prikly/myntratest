package com.bykv.vk.openvk.component.video.a.a.b;

import android.content.Context;
import android.os.Build;
import com.bykv.vk.openvk.component.video.api.e.a;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: VideoFileManager */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, b> f17938a = new ConcurrentHashMap<>();

    public static synchronized void a(Context context, com.bykv.vk.openvk.component.video.api.c.c cVar, a.C0222a aVar) {
        synchronized (c.class) {
            if (cVar == null) {
                com.bykv.vk.openvk.component.video.api.f.c.a(" url、dir and hash is must property   in VideoInfoModel");
                return;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                b bVar = f17938a.get(cVar.k());
                if (bVar == null) {
                    bVar = new b(context, cVar);
                    f17938a.put(cVar.k(), bVar);
                    com.bykv.vk.openvk.component.video.api.f.c.b("VideoFileManager", "preloadVideo:  cache size = ", Integer.valueOf(cVar.b()), cVar.k());
                }
                bVar.a(aVar);
            }
            com.bykv.vk.openvk.component.video.api.f.c.b("VideoFileManager", "preloadVideo:  cache size = ", Integer.valueOf(cVar.b()), cVar.k());
        }
    }

    public static synchronized void a(com.bykv.vk.openvk.component.video.api.c.c cVar) {
        synchronized (c.class) {
            if (Build.VERSION.SDK_INT >= 23) {
                b remove = f17938a.remove(cVar.k());
                if (remove != null) {
                    remove.a(true);
                }
                com.bykv.vk.openvk.component.video.api.f.c.b("VideoFileManager", "removePreload:  cache size = ", Integer.valueOf(cVar.b()), cVar.k());
            }
        }
    }
}
