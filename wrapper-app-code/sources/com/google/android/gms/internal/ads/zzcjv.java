package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcjv extends Thread implements SurfaceTexture.OnFrameAvailableListener, zzcjt {
    private static final float[] zza = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    private volatile boolean zzA;
    private volatile boolean zzB;
    private final zzcju zzb;
    private final float[] zzc = new float[9];
    private final float[] zzd = new float[9];
    private final float[] zze = new float[9];
    private final float[] zzf = new float[9];
    private final float[] zzg = new float[9];
    private final float[] zzh = new float[9];
    private final float[] zzi = new float[9];
    private float zzj = Float.NaN;
    private float zzk;
    private float zzl;
    private int zzm;
    private int zzn;
    private SurfaceTexture zzo;
    private SurfaceTexture zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private final FloatBuffer zzt;
    private final CountDownLatch zzu;
    private final Object zzv;
    private EGL10 zzw;
    private EGLDisplay zzx;
    private EGLContext zzy;
    private EGLSurface zzz;

    public zzcjv(Context context) {
        super("SphericalVideoProcessor");
        int length = zza.length;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.zzt = asFloatBuffer;
        asFloatBuffer.put(zza).position(0);
        zzcju zzcju = new zzcju(context);
        this.zzb = zzcju;
        zzcju.zza(this);
        this.zzu = new CountDownLatch(1);
        this.zzv = new Object();
    }

    private static final void zzh(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            Log.e("SphericalVideoRenderer", str + ": glError " + glGetError);
        }
    }

    private static final void zzi(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = (fArr2[0] * fArr3[0]) + (fArr2[1] * fArr3[3]) + (fArr2[2] * fArr3[6]);
        fArr[1] = (fArr2[0] * fArr3[1]) + (fArr2[1] * fArr3[4]) + (fArr2[2] * fArr3[7]);
        fArr[2] = (fArr2[0] * fArr3[2]) + (fArr2[1] * fArr3[5]) + (fArr2[2] * fArr3[8]);
        fArr[3] = (fArr2[3] * fArr3[0]) + (fArr2[4] * fArr3[3]) + (fArr2[5] * fArr3[6]);
        fArr[4] = (fArr2[3] * fArr3[1]) + (fArr2[4] * fArr3[4]) + (fArr2[5] * fArr3[7]);
        fArr[5] = (fArr2[3] * fArr3[2]) + (fArr2[4] * fArr3[5]) + (fArr2[5] * fArr3[8]);
        fArr[6] = (fArr2[6] * fArr3[0]) + (fArr2[7] * fArr3[3]) + (fArr2[8] * fArr3[6]);
        fArr[7] = (fArr2[6] * fArr3[1]) + (fArr2[7] * fArr3[4]) + (fArr2[8] * fArr3[7]);
        fArr[8] = (fArr2[6] * fArr3[2]) + (fArr2[7] * fArr3[5]) + (fArr2[8] * fArr3[8]);
    }

    private static final void zzj(float[] fArr, float f2) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d2 = (double) f2;
        fArr[4] = (float) Math.cos(d2);
        fArr[5] = (float) (-Math.sin(d2));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d2);
        fArr[8] = (float) Math.cos(d2);
    }

    private static final void zzk(float[] fArr, float f2) {
        double d2 = (double) f2;
        fArr[0] = (float) Math.cos(d2);
        fArr[1] = (float) (-Math.sin(d2));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d2);
        fArr[4] = (float) Math.cos(d2);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    private static final int zzl(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        zzh("createShader");
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            zzh("shaderSource");
            GLES20.glCompileShader(glCreateShader);
            zzh("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            zzh("getShaderiv");
            if (iArr[0] == 0) {
                Log.e("SphericalVideoRenderer", "Could not compile shader " + i + ":");
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
                GLES20.glDeleteShader(glCreateShader);
                zzh("deleteShader");
                return 0;
            }
        }
        return glCreateShader;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.zzs++;
        synchronized (this.zzv) {
            this.zzv.notifyAll();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01c3 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            android.graphics.SurfaceTexture r0 = r15.zzp
            if (r0 == 0) goto L_0x039f
            javax.microedition.khronos.egl.EGL r0 = javax.microedition.khronos.egl.EGLContext.getEGL()
            javax.microedition.khronos.egl.EGL10 r0 = (javax.microedition.khronos.egl.EGL10) r0
            r15.zzw = r0
            java.lang.Object r1 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY
            javax.microedition.khronos.egl.EGLDisplay r0 = r0.eglGetDisplay(r1)
            r15.zzx = r0
            javax.microedition.khronos.egl.EGLDisplay r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            r6 = 0
            if (r0 != r1) goto L_0x0020
        L_0x001d:
            r0 = 0
            goto L_0x008b
        L_0x0020:
            int[] r0 = new int[r3]
            javax.microedition.khronos.egl.EGL10 r1 = r15.zzw
            javax.microedition.khronos.egl.EGLDisplay r7 = r15.zzx
            boolean r0 = r1.eglInitialize(r7, r0)
            if (r0 != 0) goto L_0x002d
            goto L_0x001d
        L_0x002d:
            int[] r0 = new int[r5]
            javax.microedition.khronos.egl.EGLConfig[] r1 = new javax.microedition.khronos.egl.EGLConfig[r5]
            r7 = 11
            int[] r9 = new int[r7]
            r9 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344} // fill-array
            javax.microedition.khronos.egl.EGL10 r7 = r15.zzw
            javax.microedition.khronos.egl.EGLDisplay r8 = r15.zzx
            r11 = 1
            r10 = r1
            r12 = r0
            boolean r7 = r7.eglChooseConfig(r8, r9, r10, r11, r12)
            if (r7 != 0) goto L_0x0047
        L_0x0045:
            r0 = r4
            goto L_0x004d
        L_0x0047:
            r0 = r0[r6]
            if (r0 <= 0) goto L_0x0045
            r0 = r1[r6]
        L_0x004d:
            if (r0 != 0) goto L_0x0050
            goto L_0x001d
        L_0x0050:
            int[] r1 = new int[r2]
            r1 = {12440, 2, 12344} // fill-array
            javax.microedition.khronos.egl.EGL10 r7 = r15.zzw
            javax.microedition.khronos.egl.EGLDisplay r8 = r15.zzx
            javax.microedition.khronos.egl.EGLContext r9 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            javax.microedition.khronos.egl.EGLContext r1 = r7.eglCreateContext(r8, r0, r9, r1)
            r15.zzy = r1
            if (r1 == 0) goto L_0x001d
            javax.microedition.khronos.egl.EGLContext r7 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            if (r1 != r7) goto L_0x0068
            goto L_0x001d
        L_0x0068:
            javax.microedition.khronos.egl.EGL10 r1 = r15.zzw
            javax.microedition.khronos.egl.EGLDisplay r7 = r15.zzx
            android.graphics.SurfaceTexture r8 = r15.zzp
            javax.microedition.khronos.egl.EGLSurface r0 = r1.eglCreateWindowSurface(r7, r0, r8, r4)
            r15.zzz = r0
            if (r0 == 0) goto L_0x001d
            javax.microedition.khronos.egl.EGLSurface r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
            if (r0 != r1) goto L_0x007b
            goto L_0x001d
        L_0x007b:
            javax.microedition.khronos.egl.EGL10 r0 = r15.zzw
            javax.microedition.khronos.egl.EGLDisplay r1 = r15.zzx
            javax.microedition.khronos.egl.EGLSurface r7 = r15.zzz
            javax.microedition.khronos.egl.EGLContext r8 = r15.zzy
            boolean r0 = r0.eglMakeCurrent(r1, r7, r7, r8)
            if (r0 != 0) goto L_0x008a
            goto L_0x001d
        L_0x008a:
            r0 = 1
        L_0x008b:
            com.google.android.gms.internal.ads.zzbjb r1 = com.google.android.gms.internal.ads.zzbjj.zzbc
            com.google.android.gms.internal.ads.zzbjh r7 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r7 = r7.zzb(r1)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r1.zzm()
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x00ac
            com.google.android.gms.internal.ads.zzbjh r7 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r7.zzb(r1)
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x00ae
        L_0x00ac:
            java.lang.String r1 = "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}"
        L_0x00ae:
            r7 = 35633(0x8b31, float:4.9932E-41)
            int r1 = zzl(r7, r1)
            if (r1 != 0) goto L_0x00ba
        L_0x00b7:
            r8 = 0
            goto L_0x013c
        L_0x00ba:
            com.google.android.gms.internal.ads.zzbjb r7 = com.google.android.gms.internal.ads.zzbjj.zzbd
            com.google.android.gms.internal.ads.zzbjh r8 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r8 = r8.zzb(r7)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r7.zzm()
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x00db
            com.google.android.gms.internal.ads.zzbjh r8 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r7 = r8.zzb(r7)
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x00dd
        L_0x00db:
            java.lang.String r7 = "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}"
        L_0x00dd:
            r8 = 35632(0x8b30, float:4.9931E-41)
            int r7 = zzl(r8, r7)
            if (r7 != 0) goto L_0x00e7
            goto L_0x00b7
        L_0x00e7:
            int r8 = android.opengl.GLES20.glCreateProgram()
            java.lang.String r9 = "createProgram"
            zzh(r9)
            if (r8 == 0) goto L_0x013c
            android.opengl.GLES20.glAttachShader(r8, r1)
            java.lang.String r1 = "attachShader"
            zzh(r1)
            android.opengl.GLES20.glAttachShader(r8, r7)
            java.lang.String r1 = "attachShader"
            zzh(r1)
            android.opengl.GLES20.glLinkProgram(r8)
            java.lang.String r1 = "linkProgram"
            zzh(r1)
            int[] r1 = new int[r5]
            r7 = 35714(0x8b82, float:5.0046E-41)
            android.opengl.GLES20.glGetProgramiv(r8, r7, r1, r6)
            java.lang.String r7 = "getProgramiv"
            zzh(r7)
            r1 = r1[r6]
            if (r1 == r5) goto L_0x0134
            java.lang.String r1 = "SphericalVideoRenderer"
            java.lang.String r7 = "Could not link program: "
            android.util.Log.e(r1, r7)
            java.lang.String r1 = "SphericalVideoRenderer"
            java.lang.String r7 = android.opengl.GLES20.glGetProgramInfoLog(r8)
            android.util.Log.e(r1, r7)
            android.opengl.GLES20.glDeleteProgram(r8)
            java.lang.String r1 = "deleteProgram"
            zzh(r1)
            goto L_0x00b7
        L_0x0134:
            android.opengl.GLES20.glValidateProgram(r8)
            java.lang.String r1 = "validateProgram"
            zzh(r1)
        L_0x013c:
            r15.zzq = r8
            android.opengl.GLES20.glUseProgram(r8)
            java.lang.String r1 = "useProgram"
            zzh(r1)
            int r1 = r15.zzq
            java.lang.String r7 = "aPosition"
            int r1 = android.opengl.GLES20.glGetAttribLocation(r1, r7)
            r9 = 3
            r10 = 5126(0x1406, float:7.183E-42)
            r11 = 0
            r12 = 12
            java.nio.FloatBuffer r13 = r15.zzt
            r8 = r1
            android.opengl.GLES20.glVertexAttribPointer(r8, r9, r10, r11, r12, r13)
            java.lang.String r7 = "vertexAttribPointer"
            zzh(r7)
            android.opengl.GLES20.glEnableVertexAttribArray(r1)
            java.lang.String r1 = "enableVertexAttribArray"
            zzh(r1)
            int[] r1 = new int[r5]
            android.opengl.GLES20.glGenTextures(r5, r1, r6)
            java.lang.String r7 = "genTextures"
            zzh(r7)
            r1 = r1[r6]
            r7 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glBindTexture(r7, r1)
            java.lang.String r8 = "bindTextures"
            zzh(r8)
            r8 = 10240(0x2800, float:1.4349E-41)
            r9 = 9729(0x2601, float:1.3633E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            zzh(r8)
            r8 = 10241(0x2801, float:1.435E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            zzh(r8)
            r8 = 10242(0x2802, float:1.4352E-41)
            r9 = 33071(0x812f, float:4.6342E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            zzh(r8)
            r8 = 10243(0x2803, float:1.4354E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r7 = "texParameteri"
            zzh(r7)
            int r7 = r15.zzq
            java.lang.String r8 = "uVMat"
            int r7 = android.opengl.GLES20.glGetUniformLocation(r7, r8)
            r15.zzr = r7
            r8 = 9
            float[] r8 = new float[r8]
            r8 = {1065353216, 0, 0, 0, 1065353216, 0, 0, 0, 1065353216} // fill-array
            android.opengl.GLES20.glUniformMatrix3fv(r7, r5, r6, r8, r6)
            int r7 = r15.zzq
            if (r0 == 0) goto L_0x0371
            if (r7 != 0) goto L_0x01c7
            goto L_0x0371
        L_0x01c7:
            android.graphics.SurfaceTexture r0 = new android.graphics.SurfaceTexture
            r0.<init>(r1)
            r15.zzo = r0
            r0.setOnFrameAvailableListener(r15)
            java.util.concurrent.CountDownLatch r0 = r15.zzu
            r0.countDown()
            com.google.android.gms.internal.ads.zzcju r0 = r15.zzb
            r0.zzb()
            r15.zzA = r5     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
        L_0x01dd:
            boolean r0 = r15.zzB     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            if (r0 != 0) goto L_0x031c
        L_0x01e1:
            int r0 = r15.zzs     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            if (r0 <= 0) goto L_0x01f1
            android.graphics.SurfaceTexture r0 = r15.zzo     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            r0.updateTexImage()     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            int r0 = r15.zzs     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            int r0 = r0 + -1
            r15.zzs = r0     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            goto L_0x01e1
        L_0x01f1:
            com.google.android.gms.internal.ads.zzcju r0 = r15.zzb     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            float[] r1 = r15.zzc     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            boolean r0 = r0.zzd(r1)     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            r1 = 5
            r7 = 4
            r8 = -1077342245(0xffffffffbfc90fdb, float:-1.5707964)
            if (r0 == 0) goto L_0x026b
            float r0 = r15.zzj     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            boolean r0 = java.lang.Float.isNaN(r0)     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            if (r0 == 0) goto L_0x0260
            float[] r0 = r15.zzc     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            float[] r9 = new float[r2]     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            r10 = 0
            r9[r6] = r10     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            r11 = 1065353216(0x3f800000, float:1.0)
            r9[r5] = r11     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            r9[r3] = r10     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            float[] r10 = new float[r2]     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            r11 = r0[r6]     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            r12 = r9[r6]     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            float r11 = r11 * r12
            r13 = r0[r5]     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            r14 = r9[r5]     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            float r13 = r13 * r14
            float r11 = r11 + r13
            r13 = r0[r3]     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            r9 = r9[r3]     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            float r13 = r13 * r9
            float r11 = r11 + r13
            r10[r6] = r11     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            r11 = r0[r2]     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            float r11 = r11 * r12
            r13 = r0[r7]     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            float r13 = r13 * r14
            float r11 = r11 + r13
            r13 = r0[r1]     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            float r13 = r13 * r9
            float r11 = r11 + r13
            r10[r5] = r11     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            r11 = 6
            r11 = r0[r11]     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            float r11 = r11 * r12
            r12 = 7
            r12 = r0[r12]     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            float r12 = r12 * r14
            float r11 = r11 + r12
            r12 = 8
            r0 = r0[r12]     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            float r0 = r0 * r9
            float r11 = r11 + r0
            r10[r3] = r11     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            r0 = r10[r5]     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            double r11 = (double) r0     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            r0 = r10[r6]     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            double r9 = (double) r0     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            double r9 = java.lang.Math.atan2(r11, r9)     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            float r0 = (float) r9     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            float r0 = r0 + r8
            float r0 = -r0
            r15.zzj = r0     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
        L_0x0260:
            float[] r0 = r15.zzh     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            float r8 = r15.zzj     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            float r9 = r15.zzk     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            float r8 = r8 + r9
            zzk(r0, r8)     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            goto L_0x0277
        L_0x026b:
            float[] r0 = r15.zzc     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            zzj(r0, r8)     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            float[] r0 = r15.zzh     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            float r8 = r15.zzk     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            zzk(r0, r8)     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
        L_0x0277:
            float[] r0 = r15.zzd     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            r8 = 1070141403(0x3fc90fdb, float:1.5707964)
            zzj(r0, r8)     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            float[] r0 = r15.zze     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            float[] r8 = r15.zzh     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            float[] r9 = r15.zzd     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            zzi(r0, r8, r9)     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            float[] r0 = r15.zzf     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            float[] r8 = r15.zzc     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            float[] r9 = r15.zze     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            zzi(r0, r8, r9)     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            float[] r0 = r15.zzg     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            float r8 = r15.zzl     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            zzj(r0, r8)     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            float[] r0 = r15.zzi     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            float[] r8 = r15.zzg     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            float[] r9 = r15.zzf     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            zzi(r0, r8, r9)     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            int r0 = r15.zzr     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            float[] r8 = r15.zzi     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            android.opengl.GLES20.glUniformMatrix3fv(r0, r5, r6, r8, r6)     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            android.opengl.GLES20.glDrawArrays(r1, r6, r7)     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            java.lang.String r0 = "drawArrays"
            zzh(r0)     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            android.opengl.GLES20.glFinish()     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            javax.microedition.khronos.egl.EGL10 r0 = r15.zzw     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            javax.microedition.khronos.egl.EGLDisplay r1 = r15.zzx     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            javax.microedition.khronos.egl.EGLSurface r7 = r15.zzz     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            r0.eglSwapBuffers(r1, r7)     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            boolean r0 = r15.zzA     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            if (r0 == 0) goto L_0x0302
            int r0 = r15.zzn     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            int r1 = r15.zzm     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            android.opengl.GLES20.glViewport(r6, r6, r0, r1)     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            java.lang.String r0 = "viewport"
            zzh(r0)     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            int r0 = r15.zzq     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            java.lang.String r1 = "uFOVx"
            int r0 = android.opengl.GLES20.glGetUniformLocation(r0, r1)     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            int r1 = r15.zzq     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            java.lang.String r7 = "uFOVy"
            int r1 = android.opengl.GLES20.glGetUniformLocation(r1, r7)     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            int r7 = r15.zzn     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            int r8 = r15.zzm     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            r9 = 1063216883(0x3f5f66f3, float:0.87266463)
            if (r7 <= r8) goto L_0x02f5
            android.opengl.GLES20.glUniform1f(r0, r9)     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            int r0 = r15.zzm     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            float r0 = (float) r0     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            float r0 = r0 * r9
            int r7 = r15.zzn     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            float r7 = (float) r7     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            float r0 = r0 / r7
            android.opengl.GLES20.glUniform1f(r1, r0)     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            goto L_0x0300
        L_0x02f5:
            float r7 = (float) r7     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            float r7 = r7 * r9
            float r8 = (float) r8     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            float r7 = r7 / r8
            android.opengl.GLES20.glUniform1f(r0, r7)     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
            android.opengl.GLES20.glUniform1f(r1, r9)     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
        L_0x0300:
            r15.zzA = r6     // Catch:{ IllegalStateException -> 0x034b, all -> 0x032c }
        L_0x0302:
            java.lang.Object r0 = r15.zzv     // Catch:{ InterruptedException -> 0x01dd }
            monitor-enter(r0)     // Catch:{ InterruptedException -> 0x01dd }
            boolean r1 = r15.zzB     // Catch:{ all -> 0x0319 }
            if (r1 != 0) goto L_0x0316
            boolean r1 = r15.zzA     // Catch:{ all -> 0x0319 }
            if (r1 != 0) goto L_0x0316
            int r1 = r15.zzs     // Catch:{ all -> 0x0319 }
            if (r1 != 0) goto L_0x0316
            java.lang.Object r1 = r15.zzv     // Catch:{ all -> 0x0319 }
            r1.wait()     // Catch:{ all -> 0x0319 }
        L_0x0316:
            monitor-exit(r0)     // Catch:{ all -> 0x0319 }
            goto L_0x01dd
        L_0x0319:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0319 }
            throw r1     // Catch:{ InterruptedException -> 0x01dd }
        L_0x031c:
            com.google.android.gms.internal.ads.zzcju r0 = r15.zzb
            r0.zzc()
            android.graphics.SurfaceTexture r0 = r15.zzo
            r0.setOnFrameAvailableListener(r4)
            r15.zzo = r4
            r15.zzg()
            return
        L_0x032c:
            r0 = move-exception
            java.lang.String r1 = "SphericalVideoProcessor died."
            com.google.android.gms.ads.internal.util.zze.zzh(r1, r0)     // Catch:{ all -> 0x0360 }
            com.google.android.gms.internal.ads.zzcgx r1 = com.google.android.gms.ads.internal.zzt.zzo()     // Catch:{ all -> 0x0360 }
            java.lang.String r2 = "SphericalVideoProcessor.run.2"
            r1.zzu(r0, r2)     // Catch:{ all -> 0x0360 }
            com.google.android.gms.internal.ads.zzcju r0 = r15.zzb
            r0.zzc()
            android.graphics.SurfaceTexture r0 = r15.zzo
            r0.setOnFrameAvailableListener(r4)
            r15.zzo = r4
            r15.zzg()
            return
        L_0x034b:
            java.lang.String r0 = "SphericalVideoProcessor halted unexpectedly."
            com.google.android.gms.ads.internal.util.zze.zzj(r0)     // Catch:{ all -> 0x0360 }
            com.google.android.gms.internal.ads.zzcju r0 = r15.zzb
            r0.zzc()
            android.graphics.SurfaceTexture r0 = r15.zzo
            r0.setOnFrameAvailableListener(r4)
            r15.zzo = r4
            r15.zzg()
            return
        L_0x0360:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzcju r1 = r15.zzb
            r1.zzc()
            android.graphics.SurfaceTexture r1 = r15.zzo
            r1.setOnFrameAvailableListener(r4)
            r15.zzo = r4
            r15.zzg()
            throw r0
        L_0x0371:
            java.lang.String r0 = "EGL initialization failed: "
            javax.microedition.khronos.egl.EGL10 r1 = r15.zzw
            int r1 = r1.eglGetError()
            java.lang.String r1 = android.opengl.GLUtils.getEGLErrorString(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = r0.concat(r1)
            com.google.android.gms.ads.internal.util.zze.zzg(r0)
            com.google.android.gms.internal.ads.zzcgx r1 = com.google.android.gms.ads.internal.zzt.zzo()
            java.lang.Throwable r2 = new java.lang.Throwable
            r2.<init>(r0)
            java.lang.String r0 = "SphericalVideoProcessor.run.1"
            r1.zzu(r2, r0)
            r15.zzg()
            java.util.concurrent.CountDownLatch r0 = r15.zzu
            r0.countDown()
            return
        L_0x039f:
            java.lang.String r0 = "SphericalVideoProcessor started with no output texture."
            com.google.android.gms.ads.internal.util.zze.zzg(r0)
            java.util.concurrent.CountDownLatch r0 = r15.zzu
            r0.countDown()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcjv.run():void");
    }

    public final void zza() {
        synchronized (this.zzv) {
            this.zzv.notifyAll();
        }
    }

    public final SurfaceTexture zzb() {
        if (this.zzp == null) {
            return null;
        }
        try {
            this.zzu.await();
        } catch (InterruptedException unused) {
        }
        return this.zzo;
    }

    public final void zzc(int i, int i2) {
        synchronized (this.zzv) {
            this.zzn = i;
            this.zzm = i2;
            this.zzA = true;
            this.zzv.notifyAll();
        }
    }

    public final void zzd(SurfaceTexture surfaceTexture, int i, int i2) {
        this.zzn = i;
        this.zzm = i2;
        this.zzp = surfaceTexture;
    }

    public final void zze() {
        synchronized (this.zzv) {
            this.zzB = true;
            this.zzp = null;
            this.zzv.notifyAll();
        }
    }

    public final void zzf(float f2, float f3) {
        int i = this.zzn;
        int i2 = this.zzm;
        float f4 = i > i2 ? (float) i : (float) i2;
        this.zzk -= (f2 * 1.7453293f) / f4;
        float f5 = this.zzl - ((f3 * 1.7453293f) / f4);
        this.zzl = f5;
        if (f5 < -1.5707964f) {
            this.zzl = -1.5707964f;
            f5 = -1.5707964f;
        }
        if (f5 > 1.5707964f) {
            this.zzl = 1.5707964f;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zzg() {
        EGLSurface eGLSurface = this.zzz;
        boolean z = false;
        if (!(eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE)) {
            z = this.zzw.eglDestroySurface(this.zzx, this.zzz) | this.zzw.eglMakeCurrent(this.zzx, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
            this.zzz = null;
        }
        EGLContext eGLContext = this.zzy;
        if (eGLContext != null) {
            z |= this.zzw.eglDestroyContext(this.zzx, eGLContext);
            this.zzy = null;
        }
        EGLDisplay eGLDisplay = this.zzx;
        if (eGLDisplay == null) {
            return z;
        }
        boolean eglTerminate = this.zzw.eglTerminate(eGLDisplay);
        this.zzx = null;
        return eglTerminate | z;
    }
}
