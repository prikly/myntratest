package com.applovin.exoplayer2.f;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.applovin.exoplayer2.f.m;
import com.applovin.exoplayer2.v;
import java.io.IOException;
import java.nio.ByteBuffer;

public interface g {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final i f12534a;

        /* renamed from: b  reason: collision with root package name */
        public final MediaFormat f12535b;

        /* renamed from: c  reason: collision with root package name */
        public final v f12536c;

        /* renamed from: d  reason: collision with root package name */
        public final Surface f12537d;

        /* renamed from: e  reason: collision with root package name */
        public final MediaCrypto f12538e;

        /* renamed from: f  reason: collision with root package name */
        public final int f12539f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f12540g;

        private a(i iVar, MediaFormat mediaFormat, v vVar, Surface surface, MediaCrypto mediaCrypto, int i, boolean z) {
            this.f12534a = iVar;
            this.f12535b = mediaFormat;
            this.f12536c = vVar;
            this.f12537d = surface;
            this.f12538e = mediaCrypto;
            this.f12539f = i;
            this.f12540g = z;
        }

        public static a a(i iVar, MediaFormat mediaFormat, v vVar, MediaCrypto mediaCrypto) {
            return new a(iVar, mediaFormat, vVar, (Surface) null, mediaCrypto, 0, false);
        }

        public static a a(i iVar, MediaFormat mediaFormat, v vVar, Surface surface, MediaCrypto mediaCrypto) {
            return new a(iVar, mediaFormat, vVar, surface, mediaCrypto, 0, false);
        }
    }

    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f12541a = new m.b();

        g b(a aVar) throws IOException;
    }

    public interface c {
        void a(g gVar, long j, long j2);
    }

    int a(MediaCodec.BufferInfo bufferInfo);

    ByteBuffer a(int i);

    void a(int i, int i2, int i3, long j, int i4);

    void a(int i, int i2, com.applovin.exoplayer2.c.c cVar, long j, int i3);

    void a(int i, long j);

    void a(int i, boolean z);

    void a(Bundle bundle);

    void a(Surface surface);

    void a(c cVar, Handler handler);

    boolean a();

    int b();

    ByteBuffer b(int i);

    MediaFormat c();

    void c(int i);

    void d();

    void e();
}
