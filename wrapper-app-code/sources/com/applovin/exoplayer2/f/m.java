package com.applovin.exoplayer2.f;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.applovin.exoplayer2.c.c;
import com.applovin.exoplayer2.f.g;
import com.applovin.exoplayer2.l.ah;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;
import java.nio.ByteBuffer;

public class m implements g {

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec f12574a;

    /* renamed from: b  reason: collision with root package name */
    private final Surface f12575b;

    /* renamed from: c  reason: collision with root package name */
    private ByteBuffer[] f12576c;

    /* renamed from: d  reason: collision with root package name */
    private ByteBuffer[] f12577d;

    private static final class a {
        public static Surface a(MediaCodec mediaCodec) {
            return mediaCodec.createInputSurface();
        }
    }

    public static class b implements g.b {
        /* access modifiers changed from: protected */
        public MediaCodec a(g.a aVar) throws IOException {
            com.applovin.exoplayer2.l.a.b(aVar.f12534a);
            String str = aVar.f12534a.f12544a;
            ah.a("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            ah.a();
            return createByCodecName;
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0052  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0057  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.applovin.exoplayer2.f.g b(com.applovin.exoplayer2.f.g.a r8) throws java.io.IOException {
            /*
                r7 = this;
                r0 = 0
                android.media.MediaCodec r1 = r7.a(r8)     // Catch:{ IOException -> 0x004e, RuntimeException -> 0x004c }
                java.lang.String r2 = "configureCodec"
                com.applovin.exoplayer2.l.ah.a(r2)     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
                android.media.MediaFormat r2 = r8.f12535b     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
                android.view.Surface r3 = r8.f12537d     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
                android.media.MediaCrypto r4 = r8.f12538e     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
                int r5 = r8.f12539f     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
                r1.configure(r2, r3, r4, r5)     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
                com.applovin.exoplayer2.l.ah.a()     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
                boolean r8 = r8.f12540g     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
                if (r8 == 0) goto L_0x002f
                int r8 = com.applovin.exoplayer2.l.ai.f13525a     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
                r2 = 18
                if (r8 < r2) goto L_0x0027
                android.view.Surface r8 = com.applovin.exoplayer2.f.m.a.a(r1)     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
                goto L_0x0030
            L_0x0027:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
                java.lang.String r2 = "Encoding from a surface is only supported on API 18 and up."
                r8.<init>(r2)     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
                throw r8     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
            L_0x002f:
                r8 = r0
            L_0x0030:
                java.lang.String r2 = "startCodec"
                com.applovin.exoplayer2.l.ah.a(r2)     // Catch:{ IOException -> 0x0043, RuntimeException -> 0x0041 }
                r1.start()     // Catch:{ IOException -> 0x0043, RuntimeException -> 0x0041 }
                com.applovin.exoplayer2.l.ah.a()     // Catch:{ IOException -> 0x0043, RuntimeException -> 0x0041 }
                com.applovin.exoplayer2.f.m r2 = new com.applovin.exoplayer2.f.m     // Catch:{ IOException -> 0x0043, RuntimeException -> 0x0041 }
                r2.<init>(r1, r8)     // Catch:{ IOException -> 0x0043, RuntimeException -> 0x0041 }
                return r2
            L_0x0041:
                r0 = move-exception
                goto L_0x0044
            L_0x0043:
                r0 = move-exception
            L_0x0044:
                r6 = r0
                r0 = r8
                r8 = r6
                goto L_0x0050
            L_0x0048:
                r8 = move-exception
                goto L_0x0050
            L_0x004a:
                r8 = move-exception
                goto L_0x0050
            L_0x004c:
                r8 = move-exception
                goto L_0x004f
            L_0x004e:
                r8 = move-exception
            L_0x004f:
                r1 = r0
            L_0x0050:
                if (r0 == 0) goto L_0x0055
                r0.release()
            L_0x0055:
                if (r1 == 0) goto L_0x005a
                r1.release()
            L_0x005a:
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.f.m.b.b(com.applovin.exoplayer2.f.g$a):com.applovin.exoplayer2.f.g");
        }
    }

    private m(MediaCodec mediaCodec, Surface surface) {
        this.f12574a = mediaCodec;
        this.f12575b = surface;
        if (ai.f13525a < 21) {
            this.f12576c = this.f12574a.getInputBuffers();
            this.f12577d = this.f12574a.getOutputBuffers();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(g.c cVar, MediaCodec mediaCodec, long j, long j2) {
        cVar.a(this, j, j2);
    }

    public int a(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f12574a.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer == -3 && ai.f13525a < 21) {
                this.f12577d = this.f12574a.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    public ByteBuffer a(int i) {
        return ai.f13525a >= 21 ? this.f12574a.getInputBuffer(i) : ((ByteBuffer[]) ai.a(this.f12576c))[i];
    }

    public void a(int i, int i2, int i3, long j, int i4) {
        this.f12574a.queueInputBuffer(i, i2, i3, j, i4);
    }

    public void a(int i, int i2, c cVar, long j, int i3) {
        this.f12574a.queueSecureInputBuffer(i, i2, cVar.a(), j, i3);
    }

    public void a(int i, long j) {
        this.f12574a.releaseOutputBuffer(i, j);
    }

    public void a(int i, boolean z) {
        this.f12574a.releaseOutputBuffer(i, z);
    }

    public void a(Bundle bundle) {
        this.f12574a.setParameters(bundle);
    }

    public void a(Surface surface) {
        this.f12574a.setOutputSurface(surface);
    }

    public void a(g.c cVar, Handler handler) {
        this.f12574a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener(cVar) {
            public final /* synthetic */ g.c f$1;

            {
                this.f$1 = r2;
            }

            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                m.this.a(this.f$1, mediaCodec, j, j2);
            }
        }, handler);
    }

    public boolean a() {
        return false;
    }

    public int b() {
        return this.f12574a.dequeueInputBuffer(0);
    }

    public ByteBuffer b(int i) {
        return ai.f13525a >= 21 ? this.f12574a.getOutputBuffer(i) : ((ByteBuffer[]) ai.a(this.f12577d))[i];
    }

    public MediaFormat c() {
        return this.f12574a.getOutputFormat();
    }

    public void c(int i) {
        this.f12574a.setVideoScalingMode(i);
    }

    public void d() {
        this.f12574a.flush();
    }

    public void e() {
        this.f12576c = null;
        this.f12577d = null;
        Surface surface = this.f12575b;
        if (surface != null) {
            surface.release();
        }
        this.f12574a.release();
    }
}
