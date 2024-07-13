package com.applovin.exoplayer2.m;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import com.applovin.exoplayer2.l.n;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public final class i extends GLSurfaceView implements k {

    /* renamed from: a  reason: collision with root package name */
    private final a f13722a;

    private static final class a implements GLSurfaceView.Renderer {

        /* renamed from: a  reason: collision with root package name */
        private static final float[] f13723a = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

        /* renamed from: b  reason: collision with root package name */
        private static final float[] f13724b = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* renamed from: c  reason: collision with root package name */
        private static final float[] f13725c = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};

        /* renamed from: d  reason: collision with root package name */
        private static final String[] f13726d = {"y_tex", "u_tex", "v_tex"};

        /* renamed from: e  reason: collision with root package name */
        private static final FloatBuffer f13727e = n.a(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* renamed from: f  reason: collision with root package name */
        private final GLSurfaceView f13728f;

        /* renamed from: g  reason: collision with root package name */
        private final int[] f13729g;

        /* renamed from: h  reason: collision with root package name */
        private final int[] f13730h;
        private final int[] i;
        private final int[] j;
        private final AtomicReference<j> k;
        private final FloatBuffer[] l;
        private int m;
        private int n;
        private j o;

        private void a() {
            GLES20.glGenTextures(3, this.f13729g, 0);
            for (int i2 = 0; i2 < 3; i2++) {
                GLES20.glUniform1i(GLES20.glGetUniformLocation(this.m, f13726d[i2]), i2);
                GLES20.glActiveTexture(33984 + i2);
                GLES20.glBindTexture(3553, this.f13729g[i2]);
                GLES20.glTexParameterf(3553, 10241, 9729.0f);
                GLES20.glTexParameterf(3553, 10240, 9729.0f);
                GLES20.glTexParameterf(3553, 10242, 33071.0f);
                GLES20.glTexParameterf(3553, 10243, 33071.0f);
            }
            n.b();
        }

        public void a(j jVar) {
            j andSet = this.k.getAndSet(jVar);
            if (andSet != null) {
                andSet.f();
            }
            this.f13728f.requestRender();
        }

        public void onDrawFrame(GL10 gl10) {
            j andSet = this.k.getAndSet((Object) null);
            if (andSet != null || this.o != null) {
                if (andSet != null) {
                    j jVar = this.o;
                    if (jVar != null) {
                        jVar.f();
                    }
                    this.o = andSet;
                }
                j jVar2 = (j) com.applovin.exoplayer2.l.a.b(this.o);
                float[] fArr = f13724b;
                int i2 = jVar2.f13735g;
                if (i2 == 1) {
                    fArr = f13723a;
                } else if (i2 == 3) {
                    fArr = f13725c;
                }
                GLES20.glUniformMatrix3fv(this.n, 1, false, fArr, 0);
                int[] iArr = (int[]) com.applovin.exoplayer2.l.a.b(jVar2.f13734f);
                ByteBuffer[] byteBufferArr = (ByteBuffer[]) com.applovin.exoplayer2.l.a.b(jVar2.f13733e);
                int i3 = 0;
                while (i3 < 3) {
                    int i4 = i3 == 0 ? jVar2.f13732d : (jVar2.f13732d + 1) / 2;
                    GLES20.glActiveTexture(33984 + i3);
                    GLES20.glBindTexture(3553, this.f13729g[i3]);
                    GLES20.glPixelStorei(3317, 1);
                    GLES20.glTexImage2D(3553, 0, 6409, iArr[i3], i4, 0, 6409, 5121, byteBufferArr[i3]);
                    i3++;
                }
                int[] iArr2 = new int[3];
                iArr2[0] = jVar2.f13731c;
                int i5 = (iArr2[0] + 1) / 2;
                iArr2[2] = i5;
                iArr2[1] = i5;
                for (int i6 = 0; i6 < 3; i6++) {
                    if (this.i[i6] != iArr2[i6] || this.j[i6] != iArr[i6]) {
                        com.applovin.exoplayer2.l.a.b(iArr[i6] != 0);
                        float f2 = ((float) iArr2[i6]) / ((float) iArr[i6]);
                        this.l[i6] = n.a(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f2, 0.0f, f2, 1.0f});
                        GLES20.glVertexAttribPointer(this.f13730h[i6], 2, 5126, false, 0, this.l[i6]);
                        this.i[i6] = iArr2[i6];
                        this.j[i6] = iArr[i6];
                    }
                }
                GLES20.glClear(16384);
                GLES20.glDrawArrays(5, 0, 4);
                n.b();
            }
        }

        public void onSurfaceChanged(GL10 gl10, int i2, int i3) {
            GLES20.glViewport(0, 0, i2, i3);
        }

        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            int a2 = n.a("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.m = a2;
            GLES20.glUseProgram(a2);
            int glGetAttribLocation = GLES20.glGetAttribLocation(this.m, "in_pos");
            GLES20.glEnableVertexAttribArray(glGetAttribLocation);
            GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 0, f13727e);
            this.f13730h[0] = GLES20.glGetAttribLocation(this.m, "in_tc_y");
            GLES20.glEnableVertexAttribArray(this.f13730h[0]);
            this.f13730h[1] = GLES20.glGetAttribLocation(this.m, "in_tc_u");
            GLES20.glEnableVertexAttribArray(this.f13730h[1]);
            this.f13730h[2] = GLES20.glGetAttribLocation(this.m, "in_tc_v");
            GLES20.glEnableVertexAttribArray(this.f13730h[2]);
            n.b();
            this.n = GLES20.glGetUniformLocation(this.m, "mColorConversion");
            n.b();
            a();
            n.b();
        }
    }

    @Deprecated
    public k getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public void setOutputBuffer(j jVar) {
        this.f13722a.a(jVar);
    }
}
