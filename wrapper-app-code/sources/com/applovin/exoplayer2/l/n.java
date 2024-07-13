package com.applovin.exoplayer2.l;

import android.opengl.GLES20;
import android.opengl.GLU;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f13558a = false;

    public static final class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static int a(String str, String str2) {
        int glCreateProgram = GLES20.glCreateProgram();
        b();
        a(35633, str, glCreateProgram);
        a(35632, str2, glCreateProgram);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            a("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram));
        }
        b();
        return glCreateProgram;
    }

    public static FloatBuffer a(int i) {
        return ByteBuffer.allocateDirect(i * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static FloatBuffer a(float[] fArr) {
        return (FloatBuffer) a(fArr.length).put(fArr).flip();
    }

    private static void a(int i, String str, int i2) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            a(GLES20.glGetShaderInfoLog(glCreateShader) + ", source: " + str);
        }
        GLES20.glAttachShader(i2, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        b();
    }

    private static void a(String str) {
        q.d("GlUtil", str);
        if (f13558a) {
            throw new a(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r0 = android.opengl.EGL14.eglQueryString(android.opengl.EGL14.eglGetDisplay(0), 12373);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a() {
        /*
            int r0 = com.applovin.exoplayer2.l.ai.f13525a
            r1 = 0
            r2 = 17
            if (r0 >= r2) goto L_0x0008
            return r1
        L_0x0008:
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.eglGetDisplay(r1)
            r2 = 12373(0x3055, float:1.7338E-41)
            java.lang.String r0 = android.opengl.EGL14.eglQueryString(r0, r2)
            if (r0 == 0) goto L_0x001d
            java.lang.String r2 = "EGL_KHR_surfaceless_context"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x001d
            r1 = 1
        L_0x001d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.l.n.a():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        r4 = android.opengl.EGL14.eglQueryString(android.opengl.EGL14.eglGetDisplay(0), 12373);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r4) {
        /*
            int r0 = com.applovin.exoplayer2.l.ai.f13525a
            r1 = 0
            r2 = 24
            if (r0 >= r2) goto L_0x0008
            return r1
        L_0x0008:
            int r0 = com.applovin.exoplayer2.l.ai.f13525a
            r2 = 26
            if (r0 >= r2) goto L_0x0023
            java.lang.String r0 = com.applovin.exoplayer2.l.ai.f13527c
            java.lang.String r3 = "samsung"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = com.applovin.exoplayer2.l.ai.f13528d
            java.lang.String r3 = "XT1650"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0023
        L_0x0022:
            return r1
        L_0x0023:
            int r0 = com.applovin.exoplayer2.l.ai.f13525a
            if (r0 >= r2) goto L_0x0034
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            java.lang.String r0 = "android.hardware.vr.high_performance"
            boolean r4 = r4.hasSystemFeature(r0)
            if (r4 != 0) goto L_0x0034
            return r1
        L_0x0034:
            android.opengl.EGLDisplay r4 = android.opengl.EGL14.eglGetDisplay(r1)
            r0 = 12373(0x3055, float:1.7338E-41)
            java.lang.String r4 = android.opengl.EGL14.eglQueryString(r4, r0)
            if (r4 == 0) goto L_0x0049
            java.lang.String r0 = "EGL_EXT_protected_content"
            boolean r4 = r4.contains(r0)
            if (r4 == 0) goto L_0x0049
            r1 = 1
        L_0x0049:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.l.n.a(android.content.Context):boolean");
    }

    public static void b() {
        int i = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            q.d("GlUtil", "glError " + GLU.gluErrorString(glGetError));
            i = glGetError;
        }
        if (i != 0) {
            a("glError " + GLU.gluErrorString(i));
        }
    }
}
