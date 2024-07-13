package com.bykv.vk.openvk.component.video.a.e;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.AsyncTask;
import com.bykv.vk.openvk.component.video.api.f.c;
import java.util.HashMap;

/* compiled from: MediaUtils */
public class b {

    /* renamed from: com.bykv.vk.openvk.component.video.a.e.b$b  reason: collision with other inner class name */
    /* compiled from: MediaUtils */
    public interface C0219b {
        void a(Bitmap bitmap);
    }

    public static void a(long j, String str, C0219b bVar) {
        new a(bVar, j).execute(new String[]{str});
    }

    /* compiled from: MediaUtils */
    public static class a extends AsyncTask<String, Integer, Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        private C0219b f18151a;

        /* renamed from: b  reason: collision with root package name */
        private long f18152b = 0;

        public a(C0219b bVar, long j) {
            this.f18151a = bVar;
            this.f18152b = j;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Bitmap doInBackground(String... strArr) {
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                String str = strArr[0];
                if (str.startsWith("http")) {
                    mediaMetadataRetriever.setDataSource(str, new HashMap());
                } else {
                    mediaMetadataRetriever.setDataSource(str);
                }
                Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(this.f18152b * 1000, 3);
                mediaMetadataRetriever.release();
                return frameAtTime;
            } catch (Throwable th) {
                c.c("MediaUtils", "MediaUtils doInBackground : ", th);
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            C0219b bVar = this.f18151a;
            if (bVar != null) {
                bVar.a(bitmap);
            }
        }
    }
}
