package com.appodeal.ads.utils;

import android.content.Context;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.n5;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;

public final class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public b f17536a;

    /* renamed from: b  reason: collision with root package name */
    public String f17537b;

    /* renamed from: c  reason: collision with root package name */
    public File f17538c;

    /* renamed from: d  reason: collision with root package name */
    public final a f17539d = new a(Looper.getMainLooper());

    /* renamed from: e  reason: collision with root package name */
    public boolean f17540e;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            b bVar = m.this.f17536a;
            if (bVar != null) {
                int i = message.what;
                if (i == 0) {
                    bVar.a();
                } else if (i == 1) {
                    bVar.a((Uri) message.obj);
                }
            }
        }
    }

    public interface b {
        void a();

        void a(Uri uri);
    }

    public m(Context context, b bVar, String str) {
        if (context == null || str == null || !n5.a(context)) {
            bVar.a();
            return;
        }
        this.f17536a = bVar;
        this.f17537b = str;
        File externalFilesDir = context.getExternalFilesDir((String) null);
        if (externalFilesDir != null) {
            File file = new File(externalFilesDir.getPath() + "/native_video/");
            this.f17538c = file;
            if (!file.exists()) {
                this.f17538c.mkdirs();
            }
            this.f17540e = true;
            return;
        }
        bVar.a();
    }

    public final void run() {
        if (!this.f17540e) {
            this.f17539d.sendEmptyMessage(0);
            return;
        }
        InputStream inputStream = null;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f17537b).openConnection();
            httpURLConnection.setConnectTimeout(Constants.SERVER_TIMEOUT_MS);
            httpURLConnection.setReadTimeout(Constants.SERVER_TIMEOUT_MS);
            inputStream = httpURLConnection.getInputStream();
            File file = new File(this.f17538c, "temp" + System.currentTimeMillis());
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            long contentLength = (long) httpURLConnection.getContentLength();
            long j = 0;
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
                j += (long) read;
            }
            fileOutputStream.close();
            String bigInteger = new BigInteger(n5.a(this.f17537b.getBytes())).abs().toString(36);
            if (contentLength == j) {
                file.renameTo(new File(this.f17538c, bigInteger));
            }
            File file2 = new File(this.f17538c, bigInteger);
            if (ThumbnailUtils.createVideoThumbnail(file2.getPath(), 1) != null) {
                this.f17539d.sendMessage(this.f17539d.obtainMessage(1, Uri.fromFile(file2)));
                try {
                    inputStream.close();
                } catch (Exception e2) {
                    Log.log(e2);
                }
            } else {
                Log.log(LogConstants.EVENT_ASSETS, "Video", "video file not supported");
                try {
                    inputStream.close();
                } catch (Exception e3) {
                    Log.log(e3);
                }
                this.f17539d.sendEmptyMessage(0);
            }
        } catch (Exception e4) {
            Log.log(e4);
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e5) {
                    Log.log(e5);
                }
            }
            throw th;
        }
    }
}
