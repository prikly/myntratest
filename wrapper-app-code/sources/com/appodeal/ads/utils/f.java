package com.appodeal.ads.utils;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final ArrayList f17514a = new ArrayList();

    public static void a(Context context) {
        ArrayList arrayList = f17514a;
        arrayList.clear();
        arrayList.add(new File(context.getExternalFilesDir((String) null), "/native_cache_image/"));
        arrayList.add(new File(context.getFilesDir(), "adc/media"));
        arrayList.add(new File(context.getFilesDir(), "adc3"));
        arrayList.add(new File(context.getExternalFilesDir((String) null), "al"));
        arrayList.add(new File(context.getCacheDir(), "al"));
        arrayList.add(new File(context.getExternalCacheDir(), "UnityAdsVideoCache"));
        arrayList.add(new File(context.getExternalCacheDir(), "UnityAdsCache"));
        arrayList.add(new File(Environment.getExternalStorageDirectory(), "UnityAdsVideoCache"));
        arrayList.add(new File(context.getFilesDir(), "UnityAdsVideoCache"));
        arrayList.add(new File(context.getFilesDir(), "UnityAdsCache"));
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                try {
                    if (!(b(file) < 5242880)) {
                        a(file);
                    }
                } catch (Exception e2) {
                    Log.log(e2);
                }
            }
        } catch (Exception unused) {
        }
    }

    public static void a(File file) {
        if (file.isDirectory()) {
            for (File a2 : file.listFiles()) {
                a(a2);
            }
        } else if (!file.exists()) {
            return;
        }
        file.delete();
    }

    public static long b(File file) {
        long j = 0;
        if (!file.exists()) {
            return 0;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return 0;
        }
        for (File b2 : listFiles) {
            j += b(b2);
        }
        return j;
    }
}
