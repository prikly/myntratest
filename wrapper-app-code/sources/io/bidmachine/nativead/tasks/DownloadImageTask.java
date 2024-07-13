package io.bidmachine.nativead.tasks;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class DownloadImageTask implements Runnable {
    private static final String DIR_NAME = "native_cache_image";
    private static final int RESULT_FAIL = 0;
    private static final int RESULT_IMAGE_SUCCESS = 2;
    private static final int RESULT_PATH_SUCCESS = 1;
    private static final int SERVER_TIME_OUT = 20000;
    /* access modifiers changed from: private */
    public File cacheDir;
    /* access modifiers changed from: private */
    public boolean checkAspectRatio;
    /* access modifiers changed from: private */
    public Context context;
    private final Handler handler = new Handler(Looper.getMainLooper()) {
        public void handleMessage(Message message) {
            if (DownloadImageTask.this.listener != null) {
                int i = message.what;
                if (i == 0) {
                    DownloadImageTask.this.listener.onFail(DownloadImageTask.this);
                } else if (i == 1) {
                    DownloadImageTask.this.listener.onPathSuccess(DownloadImageTask.this, (Uri) message.obj);
                } else if (i == 2) {
                    DownloadImageTask.this.listener.onImageSuccess(DownloadImageTask.this, (Bitmap) message.obj);
                }
            }
        }
    };
    /* access modifiers changed from: private */
    public OnCacheImageListener listener;
    /* access modifiers changed from: private */
    public String url;

    public interface OnCacheImageListener {
        void onFail(DownloadImageTask downloadImageTask);

        void onImageSuccess(DownloadImageTask downloadImageTask, Bitmap bitmap);

        void onPathSuccess(DownloadImageTask downloadImageTask, Uri uri);
    }

    public static Builder newBuilder(Context context2, String str) {
        return new Builder(context2, str);
    }

    public class Builder {
        public Builder(Context context, String str) {
            Context unused = DownloadImageTask.this.context = context;
            String unused2 = DownloadImageTask.this.url = str;
        }

        public Builder setCheckAspectRatio(boolean z) {
            boolean unused = DownloadImageTask.this.checkAspectRatio = z;
            return this;
        }

        public Builder setOnCacheImageListener(OnCacheImageListener onCacheImageListener) {
            OnCacheImageListener unused = DownloadImageTask.this.listener = onCacheImageListener;
            return this;
        }

        public DownloadImageTask build() {
            Context access$000;
            try {
                DownloadImageTask downloadImageTask = DownloadImageTask.this;
                if (access$000 != null) {
                    if (Utils.canUseExternalFilesDir(DownloadImageTask.this.context)) {
                        DownloadImageTask downloadImageTask2 = DownloadImageTask.this;
                        File unused = downloadImageTask2.cacheDir = Utils.getCacheDir(downloadImageTask2.context, DownloadImageTask.DIR_NAME);
                    }
                }
                return downloadImageTask;
            } finally {
                if (DownloadImageTask.this.context == null) {
                    if (DownloadImageTask.this.listener != null) {
                        DownloadImageTask.this.listener.onFail(DownloadImageTask.this);
                    }
                } else if (Utils.canUseExternalFilesDir(DownloadImageTask.this.context)) {
                    DownloadImageTask downloadImageTask3 = DownloadImageTask.this;
                    File unused2 = downloadImageTask3.cacheDir = Utils.getCacheDir(downloadImageTask3.context, DownloadImageTask.DIR_NAME);
                }
            }
        }
    }

    private DownloadImageTask() {
    }

    public void run() {
        if (TextUtils.isEmpty(this.url) || !Utils.isHttpUrl(this.url)) {
            sendFail();
            return;
        }
        String replace = this.url.replace(" ", "%20");
        this.url = replace;
        downloadImage(this.context, replace);
    }

    private void sendPathSuccess(Uri uri) {
        Handler handler2 = this.handler;
        if (handler2 != null) {
            this.handler.sendMessage(handler2.obtainMessage(1, uri));
        }
    }

    private void sendImageSuccess(Bitmap bitmap) {
        Handler handler2 = this.handler;
        if (handler2 != null) {
            this.handler.sendMessage(handler2.obtainMessage(2, bitmap));
        }
    }

    private void sendFail() {
        Handler handler2 = this.handler;
        if (handler2 != null) {
            handler2.sendEmptyMessage(0);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.io.File} */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.io.File] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.Closeable, java.io.Flushable] */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void downloadImage(android.content.Context r9, java.lang.String r10) {
        /*
            r8 = this;
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565
            r0.inPreferredConfig = r1
            r1 = 1
            r0.inJustDecodeBounds = r1
            java.io.File r1 = r8.cacheDir
            r2 = 0
            if (r1 == 0) goto L_0x0045
            java.io.File r1 = new java.io.File
            java.io.File r3 = r8.cacheDir
            java.lang.String r4 = io.bidmachine.core.Utils.generateFileName(r10)
            r1.<init>(r3, r4)
            boolean r3 = r1.exists()
            if (r3 == 0) goto L_0x0046
            long r3 = r1.length()
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0046
            java.lang.String r9 = r1.getPath()
            android.graphics.BitmapFactory.decodeFile(r9, r0)
            boolean r9 = r8.isAspectRatioCorrect(r0)
            if (r9 == 0) goto L_0x0041
            android.net.Uri r9 = android.net.Uri.fromFile(r1)
            r8.sendPathSuccess(r9)
            goto L_0x0044
        L_0x0041:
            r8.sendFail()
        L_0x0044:
            return
        L_0x0045:
            r1 = r2
        L_0x0046:
            r3 = 20000(0x4e20, float:2.8026E-41)
            java.io.InputStream r10 = io.bidmachine.nativead.tasks.ConnectionUtils.getInputStream(r10, r3)     // Catch:{ all -> 0x00ba }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00b6 }
            int r4 = r10.available()     // Catch:{ all -> 0x00b6 }
            r3.<init>(r4)     // Catch:{ all -> 0x00b6 }
            r2 = 8192(0x2000, float:1.14794E-41)
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x00b4 }
        L_0x0059:
            int r4 = r10.read(r2)     // Catch:{ all -> 0x00b4 }
            r5 = -1
            r6 = 0
            if (r4 == r5) goto L_0x0065
            r3.write(r2, r6, r4)     // Catch:{ all -> 0x00b4 }
            goto L_0x0059
        L_0x0065:
            byte[] r2 = r3.toByteArray()     // Catch:{ all -> 0x00b4 }
            int r4 = r2.length     // Catch:{ all -> 0x00b4 }
            android.graphics.BitmapFactory.decodeByteArray(r2, r6, r4, r0)     // Catch:{ all -> 0x00b4 }
            boolean r4 = r8.isAspectRatioCorrect(r0)     // Catch:{ all -> 0x00b4 }
            if (r4 != 0) goto L_0x0080
            r8.sendFail()     // Catch:{ all -> 0x00b4 }
            io.bidmachine.core.Utils.flush(r3)
            io.bidmachine.core.Utils.close(r3)
            io.bidmachine.core.Utils.close(r10)
            return
        L_0x0080:
            if (r1 == 0) goto L_0x008d
            r8.saveImage(r1, r2, r0)     // Catch:{ all -> 0x00b4 }
            android.net.Uri r9 = android.net.Uri.fromFile(r1)     // Catch:{ all -> 0x00b4 }
            r8.sendPathSuccess(r9)     // Catch:{ all -> 0x00b4 }
            goto L_0x00aa
        L_0x008d:
            int r9 = io.bidmachine.nativead.utils.ImageHelper.calculateReqWidth(r9)     // Catch:{ all -> 0x00b4 }
            boolean r1 = r8.checkAspectRatio     // Catch:{ all -> 0x00b4 }
            int r1 = io.bidmachine.nativead.utils.ImageHelper.calculateReqHeight(r9, r1)     // Catch:{ all -> 0x00b4 }
            int r9 = io.bidmachine.nativead.utils.ImageHelper.calculateInSamplesSize(r0, r9, r1)     // Catch:{ all -> 0x00b4 }
            r0.inSampleSize = r9     // Catch:{ all -> 0x00b4 }
            android.graphics.Bitmap r9 = r8.convert(r2, r0)     // Catch:{ all -> 0x00b4 }
            if (r9 == 0) goto L_0x00a7
            r8.sendImageSuccess(r9)     // Catch:{ all -> 0x00b4 }
            goto L_0x00aa
        L_0x00a7:
            r8.sendFail()     // Catch:{ all -> 0x00b4 }
        L_0x00aa:
            io.bidmachine.core.Utils.flush(r3)
            io.bidmachine.core.Utils.close(r3)
            io.bidmachine.core.Utils.close(r10)
            goto L_0x00cb
        L_0x00b4:
            r9 = move-exception
            goto L_0x00b8
        L_0x00b6:
            r9 = move-exception
            r3 = r2
        L_0x00b8:
            r2 = r10
            goto L_0x00bc
        L_0x00ba:
            r9 = move-exception
            r3 = r2
        L_0x00bc:
            io.bidmachine.core.Logger.log((java.lang.Throwable) r9)     // Catch:{ all -> 0x00cc }
            r8.sendFail()     // Catch:{ all -> 0x00cc }
            io.bidmachine.core.Utils.flush(r3)
            io.bidmachine.core.Utils.close(r3)
            io.bidmachine.core.Utils.close(r2)
        L_0x00cb:
            return
        L_0x00cc:
            r9 = move-exception
            io.bidmachine.core.Utils.flush(r3)
            io.bidmachine.core.Utils.close(r3)
            io.bidmachine.core.Utils.close(r2)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.nativead.tasks.DownloadImageTask.downloadImage(android.content.Context, java.lang.String):void");
    }

    private boolean isAspectRatioCorrect(BitmapFactory.Options options) {
        if (!this.checkAspectRatio) {
            return true;
        }
        if (((float) options.outWidth) / ((float) options.outHeight) >= 1.5f) {
            return true;
        }
        return false;
    }

    private void saveImage(File file, byte[] bArr, BitmapFactory.Options options) {
        options.inJustDecodeBounds = false;
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                writeBitmap(bArr, options, fileOutputStream2);
                Utils.flush(fileOutputStream2);
                Utils.close(fileOutputStream2);
            } catch (Exception e2) {
                e = e2;
                fileOutputStream = fileOutputStream2;
                try {
                    Logger.log((Throwable) e);
                    Utils.flush(fileOutputStream);
                    Utils.close(fileOutputStream);
                } catch (Throwable th) {
                    th = th;
                    Utils.flush(fileOutputStream);
                    Utils.close(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                Utils.flush(fileOutputStream);
                Utils.close(fileOutputStream);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            Logger.log((Throwable) e);
            Utils.flush(fileOutputStream);
            Utils.close(fileOutputStream);
        }
    }

    private Bitmap convert(byte[] bArr, BitmapFactory.Options options) {
        ByteArrayOutputStream byteArrayOutputStream;
        options.inJustDecodeBounds = false;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
            try {
                writeBitmap(bArr, options, byteArrayOutputStream);
                Bitmap decodeStream = BitmapFactory.decodeStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                Utils.flush(byteArrayOutputStream);
                Utils.close(byteArrayOutputStream);
                return decodeStream;
            } catch (Exception e2) {
                e = e2;
                try {
                    Logger.log((Throwable) e);
                    Utils.flush(byteArrayOutputStream);
                    Utils.close(byteArrayOutputStream);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream2 = byteArrayOutputStream;
                    Utils.flush(byteArrayOutputStream2);
                    Utils.close(byteArrayOutputStream2);
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            byteArrayOutputStream = null;
            Logger.log((Throwable) e);
            Utils.flush(byteArrayOutputStream);
            Utils.close(byteArrayOutputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            Utils.flush(byteArrayOutputStream2);
            Utils.close(byteArrayOutputStream2);
            throw th;
        }
    }

    private void writeBitmap(byte[] bArr, BitmapFactory.Options options, OutputStream outputStream) {
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        decodeByteArray.compress(Bitmap.CompressFormat.PNG, 85, outputStream);
        decodeByteArray.recycle();
    }
}
