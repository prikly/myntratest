package com.bytedance.sdk.component.d.a;

import com.appnext.ads.fullscreen.RewardedVideo;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: ThreadPoolFactory */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final TimeUnit f18943a = TimeUnit.SECONDS;

    public static ExecutorService a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 30, f18943a, new LinkedBlockingQueue(), new a(RewardedVideo.VIDEO_MODE_DEFAULT));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
