package io.bidmachine.nativead.tasks;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.explorestack.iab.CacheControl;
import com.explorestack.iab.vast.VastRequest;
import com.explorestack.iab.vast.VastRequestListener;
import com.explorestack.iab.vast.processor.VastAd;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import java.io.File;
import java.lang.ref.WeakReference;

public class DownloadVastVideoTask implements Runnable {
    private static final String DIR_NAME = "native_video";
    private static final int RESULT_FAIL = 0;
    private static final int RESULT_SUCCESS = 1;
    private static final int SERVER_TIME_OUT = 20000;
    private static final String SUPPORTED_VIDEO_TYPE_REGEX = "video/.*(?i)(mp4|3gpp|mp2t|webm|matroska)";
    private File cacheDir;
    private final Handler handler = new Handler(Looper.getMainLooper()) {
        public void handleMessage(Message message) {
            if (DownloadVastVideoTask.this.listener != null) {
                int i = message.what;
                if (i == 0) {
                    DownloadVastVideoTask.this.listener.onVideoLoadingError(DownloadVastVideoTask.this);
                } else if (i == 1) {
                    Pair pair = (Pair) message.obj;
                    DownloadVastVideoTask.this.listener.onVideoLoaded(DownloadVastVideoTask.this, (Uri) pair.first, (VastRequest) pair.second);
                }
            }
        }
    };
    private boolean initialized;
    /* access modifiers changed from: private */
    public OnLoadedListener listener;
    private String videoTag;
    private WeakReference<Context> weakContext;

    public interface OnLoadedListener {
        void onVideoLoaded(DownloadVastVideoTask downloadVastVideoTask, Uri uri, VastRequest vastRequest);

        void onVideoLoadingError(DownloadVastVideoTask downloadVastVideoTask);
    }

    public DownloadVastVideoTask(Context context, OnLoadedListener onLoadedListener, String str) {
        if (str == null || !Utils.canUseExternalFilesDir(context)) {
            onLoadedListener.onVideoLoadingError(this);
            return;
        }
        this.weakContext = new WeakReference<>(context);
        this.listener = onLoadedListener;
        this.videoTag = str;
        if (Utils.canUseExternalFilesDir(context)) {
            this.cacheDir = Utils.getCacheDir(context, DIR_NAME);
            this.initialized = true;
            return;
        }
        onLoadedListener.onVideoLoadingError(this);
    }

    public void run() {
        File cacheVideoFile;
        if (!this.initialized) {
            sendFail();
            return;
        }
        Context context = (Context) this.weakContext.get();
        if (context == null) {
            sendFail();
            return;
        }
        try {
            VastRequest build = VastRequest.newBuilder().setCacheControl(CacheControl.Stream).build();
            build.loadVideoWithDataSync(context, this.videoTag, (VastRequestListener) null);
            VastAd vastAd = build.getVastAd();
            if (!(vastAd == null || !vastAd.getPickedMediaFileTag().getType().matches(SUPPORTED_VIDEO_TYPE_REGEX) || (cacheVideoFile = CacheUtils.cacheVideoFile(vastAd.getPickedMediaFileTag().getText(), this.cacheDir, 20000)) == null)) {
                sendSuccess(cacheVideoFile, build);
                return;
            }
        } catch (Exception e2) {
            Logger.log((Throwable) e2);
        }
        sendFail();
    }

    private void sendSuccess(File file, VastRequest vastRequest) {
        Handler handler2 = this.handler;
        if (handler2 != null) {
            this.handler.sendMessage(handler2.obtainMessage(1, new Pair(Uri.fromFile(file), vastRequest)));
        }
    }

    private void sendFail() {
        Handler handler2 = this.handler;
        if (handler2 != null) {
            handler2.sendEmptyMessage(0);
        }
    }
}
