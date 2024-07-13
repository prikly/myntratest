package io.bidmachine.nativead.tasks;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import io.bidmachine.core.Utils;
import java.io.File;

public class DownloadVideoTask implements Runnable {
    private static final String DIR_NAME = "native_video";
    private static final int RESULT_FAIL = 0;
    private static final int RESULT_SUCCESS = 1;
    private static final int SERVER_TIME_OUT = 20000;
    private File cacheDir;
    private final Handler handler = new Handler(Looper.getMainLooper()) {
        public void handleMessage(Message message) {
            if (DownloadVideoTask.this.listener != null) {
                int i = message.what;
                if (i == 0) {
                    DownloadVideoTask.this.listener.onVideoLoadingError(DownloadVideoTask.this);
                } else if (i == 1) {
                    DownloadVideoTask.this.listener.onVideoLoaded(DownloadVideoTask.this, (Uri) message.obj);
                }
            }
        }
    };
    private boolean initialized;
    /* access modifiers changed from: private */
    public OnLoadedListener listener;
    private String videoUrl;

    public interface OnLoadedListener {
        void onVideoLoaded(DownloadVideoTask downloadVideoTask, Uri uri);

        void onVideoLoadingError(DownloadVideoTask downloadVideoTask);
    }

    public DownloadVideoTask(Context context, OnLoadedListener onLoadedListener, String str) {
        if (str == null || !Utils.canUseExternalFilesDir(context)) {
            onLoadedListener.onVideoLoadingError(this);
            return;
        }
        this.listener = onLoadedListener;
        this.videoUrl = str;
        if (Utils.canUseExternalFilesDir(context)) {
            this.cacheDir = Utils.getCacheDir(context, DIR_NAME);
            this.initialized = true;
            return;
        }
        onLoadedListener.onVideoLoadingError(this);
    }

    public void run() {
        if (!this.initialized) {
            sendFail();
            return;
        }
        File cacheVideoFile = CacheUtils.cacheVideoFile(this.videoUrl, this.cacheDir, 20000);
        if (cacheVideoFile != null) {
            sendSuccess(cacheVideoFile);
        } else {
            sendFail();
        }
    }

    private void sendSuccess(File file) {
        Handler handler2 = this.handler;
        if (handler2 != null) {
            this.handler.sendMessage(handler2.obtainMessage(1, Uri.fromFile(file)));
        }
    }

    private void sendFail() {
        Handler handler2 = this.handler;
        if (handler2 != null) {
            handler2.sendEmptyMessage(0);
        }
    }
}
