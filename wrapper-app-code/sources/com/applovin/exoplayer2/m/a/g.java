package com.applovin.exoplayer2.m.a;

import com.applovin.exoplayer2.m.a.e;

final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f13650a = {"uniform mat4 uMvpMatrix;", "uniform mat3 uTexMatrix;", "attribute vec4 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * aPosition;", "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;", "}"};

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f13651b = {"#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", "}"};

    /* renamed from: c  reason: collision with root package name */
    private static final float[] f13652c = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: d  reason: collision with root package name */
    private static final float[] f13653d = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: e  reason: collision with root package name */
    private static final float[] f13654e = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: f  reason: collision with root package name */
    private static final float[] f13655f = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: g  reason: collision with root package name */
    private static final float[] f13656g = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    public static boolean a(e eVar) {
        e.a aVar = eVar.f13641a;
        e.a aVar2 = eVar.f13642b;
        return aVar.a() == 1 && aVar.a(0).f13646a == 0 && aVar2.a() == 1 && aVar2.a(0).f13646a == 0;
    }
}
