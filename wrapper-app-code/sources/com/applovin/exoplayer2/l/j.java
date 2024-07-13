package com.applovin.exoplayer2.l;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

public final class j implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f13547a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: b  reason: collision with root package name */
    private final Handler f13548b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f13549c;

    /* renamed from: d  reason: collision with root package name */
    private final b f13550d;

    /* renamed from: e  reason: collision with root package name */
    private EGLDisplay f13551e;

    /* renamed from: f  reason: collision with root package name */
    private EGLContext f13552f;

    /* renamed from: g  reason: collision with root package name */
    private EGLSurface f13553g;

    /* renamed from: h  reason: collision with root package name */
    private SurfaceTexture f13554h;

    public static final class a extends RuntimeException {
        private a(String str) {
            super(str);
        }
    }

    public interface b {
        void a();
    }

    public j(Handler handler) {
        this(handler, (b) null);
    }

    public j(Handler handler, b bVar) {
        this.f13548b = handler;
        this.f13550d = bVar;
        this.f13549c = new int[1];
    }

    private static EGLConfig a(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f13547a, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (eglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null) {
            return eGLConfigArr[0];
        }
        throw new a(ai.a("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
    }

    private static EGLContext a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new a("eglCreateContext failed");
    }

    private static EGLSurface a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) {
        EGLSurface eGLSurface;
        if (i == 1) {
            eGLSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eGLSurface == null) {
                throw new a("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
            return eGLSurface;
        }
        throw new a("eglMakeCurrent failed");
    }

    private static void a(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        n.b();
    }

    private void c() {
        b bVar = this.f13550d;
        if (bVar != null) {
            bVar.a();
        }
    }

    private static EGLDisplay d() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                return eglGetDisplay;
            }
            throw new a("eglInitialize failed");
        }
        throw new a("eglGetDisplay failed");
    }

    public void a() {
        this.f13548b.removeCallbacks(this);
        try {
            if (this.f13554h != null) {
                this.f13554h.release();
                GLES20.glDeleteTextures(1, this.f13549c, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f13551e;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglMakeCurrent(this.f13551e, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface = this.f13553g;
            if (eGLSurface != null && !eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f13551e, this.f13553g);
            }
            EGLContext eGLContext = this.f13552f;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f13551e, eGLContext);
            }
            if (ai.f13525a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay2 = this.f13551e;
            if (eGLDisplay2 != null && !eGLDisplay2.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f13551e);
            }
            this.f13551e = null;
            this.f13552f = null;
            this.f13553g = null;
            this.f13554h = null;
        }
    }

    public void a(int i) {
        EGLDisplay d2 = d();
        this.f13551e = d2;
        EGLConfig a2 = a(d2);
        EGLContext a3 = a(this.f13551e, a2, i);
        this.f13552f = a3;
        this.f13553g = a(this.f13551e, a2, a3, i);
        a(this.f13549c);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f13549c[0]);
        this.f13554h = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public SurfaceTexture b() {
        return (SurfaceTexture) a.b(this.f13554h);
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f13548b.post(this);
    }

    public void run() {
        c();
        SurfaceTexture surfaceTexture = this.f13554h;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
