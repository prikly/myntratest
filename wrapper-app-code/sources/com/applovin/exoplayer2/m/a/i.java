package com.applovin.exoplayer2.m.a;

import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.view.Surface;
import com.applovin.exoplayer2.m.l;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class i extends GLSurfaceView {

    /* renamed from: a  reason: collision with root package name */
    private final CopyOnWriteArrayList<a> f13664a;

    /* renamed from: b  reason: collision with root package name */
    private final SensorManager f13665b;

    /* renamed from: c  reason: collision with root package name */
    private final Sensor f13666c;

    /* renamed from: d  reason: collision with root package name */
    private final d f13667d;

    /* renamed from: e  reason: collision with root package name */
    private final Handler f13668e;

    /* renamed from: f  reason: collision with root package name */
    private final h f13669f;

    /* renamed from: g  reason: collision with root package name */
    private SurfaceTexture f13670g;

    /* renamed from: h  reason: collision with root package name */
    private Surface f13671h;
    private boolean i;
    private boolean j;
    private boolean k;

    public interface a {
        void a(Surface surface);
    }

    private void a() {
        boolean z = this.i && this.j;
        Sensor sensor = this.f13666c;
        if (sensor != null && z != this.k) {
            if (z) {
                this.f13665b.registerListener(this.f13667d, sensor, 0);
            } else {
                this.f13665b.unregisterListener(this.f13667d);
            }
            this.k = z;
        }
    }

    private static void a(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        Surface surface = this.f13671h;
        if (surface != null) {
            Iterator<a> it = this.f13664a.iterator();
            while (it.hasNext()) {
                it.next().a(surface);
            }
        }
        a(this.f13670g, surface);
        this.f13670g = null;
        this.f13671h = null;
    }

    public void a(a aVar) {
        this.f13664a.add(aVar);
    }

    public void b(a aVar) {
        this.f13664a.remove(aVar);
    }

    public a getCameraMotionListener() {
        return this.f13669f;
    }

    public l getVideoFrameMetadataListener() {
        return this.f13669f;
    }

    public Surface getVideoSurface() {
        return this.f13671h;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f13668e.post(new Runnable() {
            public final void run() {
                i.this.b();
            }
        });
    }

    public void onPause() {
        this.j = false;
        a();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.j = true;
        a();
    }

    public void setDefaultStereoMode(int i2) {
        this.f13669f.a(i2);
    }

    public void setUseSensorRotation(boolean z) {
        this.i = z;
        a();
    }
}
