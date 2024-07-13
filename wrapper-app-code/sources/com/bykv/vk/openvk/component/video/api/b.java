package com.bykv.vk.openvk.component.video.api;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.bytedance.sdk.component.b.a.i;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: VideoConfig */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f18153a = false;

    /* renamed from: b  reason: collision with root package name */
    private static Executor f18154b = null;

    /* renamed from: c  reason: collision with root package name */
    private static Context f18155c = null;

    /* renamed from: d  reason: collision with root package name */
    private static String f18156d = null;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f18157e = false;

    /* renamed from: f  reason: collision with root package name */
    private static i f18158f;

    /* renamed from: g  reason: collision with root package name */
    private static volatile Handler f18159g;

    public static Context a() {
        return f18155c;
    }

    public static String b() {
        if (TextUtils.isEmpty(f18156d)) {
            try {
                File file = new File(a().getFilesDir(), "ttad_dir");
                if (!file.exists()) {
                    file.mkdirs();
                }
                f18156d = file.getAbsolutePath();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return f18156d;
    }

    public static void a(Context context, String str, Executor executor, Handler handler) {
        f18155c = context;
        f18154b = executor;
        f18156d = str;
        f18159g = handler;
    }

    public static Handler c() {
        if (f18159g == null) {
            synchronized (b.class) {
                if (f18159g == null) {
                    HandlerThread handlerThread = new HandlerThread("tt_pangle_thread_video_handler_thread");
                    handlerThread.start();
                    f18159g = new Handler(handlerThread.getLooper());
                }
            }
        }
        return f18159g;
    }

    public static boolean d() {
        return f18157e;
    }

    public static void a(boolean z) {
        f18157e = z;
    }

    public static i e() {
        if (f18158f == null) {
            f18158f = new i.a().a(10000, TimeUnit.MILLISECONDS).b(10000, TimeUnit.MILLISECONDS).c(10000, TimeUnit.MILLISECONDS).a();
        }
        return f18158f;
    }

    public static void a(i iVar) {
        f18158f = iVar;
    }

    public static boolean f() {
        return f18153a;
    }
}
