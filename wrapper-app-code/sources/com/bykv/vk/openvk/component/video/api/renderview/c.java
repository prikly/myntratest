package com.bykv.vk.openvk.component.video.api.renderview;

import android.view.SurfaceHolder;
import java.lang.ref.WeakReference;

/* compiled from: WeakSurfaceCallback */
public class c implements SurfaceHolder.Callback {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<SurfaceHolder.Callback> f18198a;

    public c(SurfaceHolder.Callback callback) {
        this.f18198a = new WeakReference<>(callback);
    }

    public SurfaceHolder.Callback a() {
        return (SurfaceHolder.Callback) this.f18198a.get();
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = (SurfaceHolder.Callback) this.f18198a.get();
        if (callback != null) {
            callback.surfaceCreated(surfaceHolder);
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        SurfaceHolder.Callback callback = (SurfaceHolder.Callback) this.f18198a.get();
        if (callback != null) {
            callback.surfaceChanged(surfaceHolder, i, i2, i3);
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = (SurfaceHolder.Callback) this.f18198a.get();
        if (callback != null) {
            callback.surfaceDestroyed(surfaceHolder);
        }
    }
}
