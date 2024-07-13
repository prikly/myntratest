package com.bykv.vk.openvk.component.video.a.d;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bykv.vk.openvk.component.video.api.f.c;
import java.io.FileDescriptor;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* compiled from: AndroidMediaPlayer */
public class b extends a {

    /* renamed from: b  reason: collision with root package name */
    private final MediaPlayer f18114b;

    /* renamed from: c  reason: collision with root package name */
    private final a f18115c;

    /* renamed from: d  reason: collision with root package name */
    private com.bykv.vk.openvk.component.video.a.a.a f18116d;

    /* renamed from: e  reason: collision with root package name */
    private Surface f18117e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f18118f;

    /* renamed from: g  reason: collision with root package name */
    private volatile boolean f18119g;

    public b() {
        MediaPlayer mediaPlayer;
        Object obj = new Object();
        this.f18118f = obj;
        synchronized (obj) {
            mediaPlayer = new MediaPlayer();
            this.f18114b = mediaPlayer;
        }
        a(mediaPlayer);
        try {
            this.f18114b.setAudioStreamType(3);
        } catch (Throwable th) {
            c.c("CSJ_VIDEO", "setAudioStreamType error: ", th);
        }
        this.f18115c = new a(this);
        p();
    }

    private void a(MediaPlayer mediaPlayer) {
        Field declaredField;
        if (Build.VERSION.SDK_INT >= 19 && Build.VERSION.SDK_INT < 28) {
            try {
                Class<?> cls = Class.forName("android.media.MediaTimeProvider");
                Class<?> cls2 = Class.forName("android.media.SubtitleController");
                Class<?> cls3 = Class.forName("android.media.SubtitleController$Anchor");
                Object newInstance = cls2.getConstructor(new Class[]{Context.class, cls, Class.forName("android.media.SubtitleController$Listener")}).newInstance(new Object[]{com.bykv.vk.openvk.component.video.api.b.a(), null, null});
                declaredField = cls2.getDeclaredField("mHandler");
                declaredField.setAccessible(true);
                declaredField.set(newInstance, new Handler());
                declaredField.setAccessible(false);
                mediaPlayer.getClass().getMethod("setSubtitleAnchor", new Class[]{cls2, cls3}).invoke(mediaPlayer, new Object[]{newInstance, null});
            } catch (Throwable th) {
                c.c("CSJ_VIDEO", "setSubtitleController error: ", th);
            }
        }
    }

    public void a(SurfaceHolder surfaceHolder) throws Throwable {
        synchronized (this.f18118f) {
            try {
                if (!this.f18119g && surfaceHolder != null && surfaceHolder.getSurface() != null && this.f18106a) {
                    this.f18114b.setDisplay(surfaceHolder);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void a(Surface surface) {
        q();
        this.f18117e = surface;
        this.f18114b.setSurface(surface);
    }

    public void a(String str) throws Throwable {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.equalsIgnoreCase("file")) {
            this.f18114b.setDataSource(str);
        } else {
            this.f18114b.setDataSource(parse.getPath());
        }
    }

    public void a(FileDescriptor fileDescriptor) throws Throwable {
        this.f18114b.setDataSource(fileDescriptor);
    }

    public synchronized void a(com.bykv.vk.openvk.component.video.api.c.c cVar) {
        this.f18116d = com.bykv.vk.openvk.component.video.a.a.a.a(com.bykv.vk.openvk.component.video.api.b.a(), cVar);
        com.bykv.vk.openvk.component.video.a.a.b.c.a(cVar);
        this.f18114b.setDataSource(this.f18116d);
    }

    private void o() {
        com.bykv.vk.openvk.component.video.a.a.a aVar;
        if (Build.VERSION.SDK_INT >= 23 && (aVar = this.f18116d) != null) {
            try {
                aVar.close();
            } catch (Throwable th) {
                c.c("CSJ_VIDEO", "releaseMediaDataSource error: ", th);
            }
            this.f18116d = null;
        }
    }

    public void e() throws Throwable {
        this.f18114b.start();
    }

    public void f() throws Throwable {
        this.f18114b.stop();
    }

    public void g() throws Throwable {
        this.f18114b.pause();
    }

    public void h() {
        MediaPlayer mediaPlayer = this.f18114b;
        if (mediaPlayer != null) {
            mediaPlayer.prepareAsync();
        }
    }

    public void b(boolean z) throws Throwable {
        this.f18114b.setScreenOnWhilePlaying(z);
    }

    public void a(long j) throws Throwable {
        this.f18114b.seekTo((int) j);
    }

    public long i() {
        try {
            return (long) this.f18114b.getCurrentPosition();
        } catch (Throwable th) {
            c.c("CSJ_VIDEO", "getCurrentPosition error: ", th);
            return 0;
        }
    }

    public long j() {
        try {
            return (long) this.f18114b.getDuration();
        } catch (Throwable th) {
            c.c("CSJ_VIDEO", "getDuration error: ", th);
            return 0;
        }
    }

    public void k() throws Throwable {
        synchronized (this.f18118f) {
            if (!this.f18119g) {
                this.f18114b.release();
                this.f18119g = true;
                q();
                o();
                a();
                p();
            }
        }
    }

    public void l() throws Throwable {
        try {
            this.f18114b.reset();
        } catch (Throwable th) {
            c.c("CSJ_VIDEO", "reset error: ", th);
        }
        o();
        a();
        p();
    }

    public void c(boolean z) throws Throwable {
        this.f18114b.setLooping(z);
    }

    public void d(boolean z) throws Throwable {
        MediaPlayer mediaPlayer = this.f18114b;
        if (mediaPlayer != null) {
            if (z) {
                mediaPlayer.setVolume(0.0f, 0.0f);
            } else {
                mediaPlayer.setVolume(1.0f, 1.0f);
            }
        }
    }

    public int m() {
        MediaPlayer mediaPlayer = this.f18114b;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    public int n() {
        MediaPlayer mediaPlayer = this.f18114b;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    private void p() {
        this.f18114b.setOnPreparedListener(this.f18115c);
        this.f18114b.setOnBufferingUpdateListener(this.f18115c);
        this.f18114b.setOnCompletionListener(this.f18115c);
        this.f18114b.setOnSeekCompleteListener(this.f18115c);
        this.f18114b.setOnVideoSizeChangedListener(this.f18115c);
        this.f18114b.setOnErrorListener(this.f18115c);
        this.f18114b.setOnInfoListener(this.f18115c);
    }

    /* compiled from: AndroidMediaPlayer */
    private static class a implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<b> f18120a;

        public a(b bVar) {
            this.f18120a = new WeakReference<>(bVar);
        }

        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                c.b("CSJ_VIDEO", "onInfo: ");
                b bVar = (b) this.f18120a.get();
                if (bVar == null || !bVar.b(i, i2)) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                c.c("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onInfo error: ", th);
                return false;
            }
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                c.b("CSJ_VIDEO", "onError: ", Integer.valueOf(i), Integer.valueOf(i2));
                b bVar = (b) this.f18120a.get();
                if (bVar == null || !bVar.a(i, i2)) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                c.c("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onError error: ", th);
                return false;
            }
        }

        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                b bVar = (b) this.f18120a.get();
                if (bVar != null) {
                    bVar.a(i, i2, 1, 1);
                }
            } catch (Throwable th) {
                c.c("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onVideoSizeChanged error: ", th);
            }
        }

        public void onSeekComplete(MediaPlayer mediaPlayer) {
            try {
                b bVar = (b) this.f18120a.get();
                if (bVar != null) {
                    bVar.d();
                }
            } catch (Throwable th) {
                c.c("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onSeekComplete error: ", th);
            }
        }

        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            try {
                b bVar = (b) this.f18120a.get();
                if (bVar != null) {
                    bVar.a(i);
                }
            } catch (Throwable th) {
                c.c("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onBufferingUpdate error: ", th);
            }
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            try {
                b bVar = (b) this.f18120a.get();
                if (bVar != null) {
                    bVar.c();
                }
            } catch (Throwable th) {
                c.c("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onCompletion error: ", th);
            }
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            try {
                b bVar = (b) this.f18120a.get();
                if (bVar != null) {
                    bVar.b();
                }
            } catch (Throwable th) {
                c.c("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onPrepared error: ", th);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        q();
    }

    private void q() {
        try {
            if (this.f18117e != null) {
                this.f18117e.release();
                this.f18117e = null;
            }
        } catch (Throwable unused) {
        }
    }
}
