package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.api.a.a;
import com.bytedance.sdk.component.utils.f;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.multipro.b;
import java.io.File;

public class CacheDirFactory {
    public static volatile a MEDIA_CACHE_DIR = null;
    public static String ROOT_DIR = null;
    public static final int SPLASH_USE_INTERNAL_STORAGE = 1;
    public static volatile a TTVIDEO_CACHE_DIR = null;

    /* renamed from: a  reason: collision with root package name */
    private static String f19310a = null;

    /* renamed from: b  reason: collision with root package name */
    private static int f19311b = 1;

    private static a a() {
        if (MEDIA_CACHE_DIR == null) {
            synchronized (CacheDirFactory.class) {
                if (MEDIA_CACHE_DIR == null) {
                    MEDIA_CACHE_DIR = new com.bykv.vk.openvk.component.video.a.a.a.a();
                    MEDIA_CACHE_DIR.a(getRootDir());
                    MEDIA_CACHE_DIR.c();
                }
            }
        }
        return MEDIA_CACHE_DIR;
    }

    public static String getRootDir() {
        if (!TextUtils.isEmpty(ROOT_DIR)) {
            return ROOT_DIR;
        }
        File a2 = f.a(m.a(), b.c(), "tt_ad");
        if (a2.isFile()) {
            a2.delete();
        }
        if (!a2.exists()) {
            a2.mkdirs();
        }
        String absolutePath = a2.getAbsolutePath();
        ROOT_DIR = absolutePath;
        return absolutePath;
    }

    public static a getICacheDir(int i) {
        return a();
    }

    public static String getBrandCacheDir() {
        return getRootDir() + File.separator + "video_brand";
    }

    public static int getCacheType() {
        return f19311b;
    }

    public static String getImageCacheDir() {
        if (f19310a == null) {
            f19310a = getDiskCacheDirPath("image");
        }
        return f19310a;
    }

    public static String getDiskCacheDirPath(String str) {
        return getRootDir() + File.separator + str;
    }
}
