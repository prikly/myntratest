package com.applovin.exoplayer2.m.a;

import com.applovin.exoplayer2.as;
import com.applovin.exoplayer2.c.g;
import com.applovin.exoplayer2.e;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.p;
import com.applovin.exoplayer2.v;
import java.nio.ByteBuffer;

public final class b extends e {

    /* renamed from: a  reason: collision with root package name */
    private final g f13627a = new g(1);

    /* renamed from: b  reason: collision with root package name */
    private final y f13628b = new y();

    /* renamed from: c  reason: collision with root package name */
    private long f13629c;

    /* renamed from: d  reason: collision with root package name */
    private a f13630d;

    /* renamed from: e  reason: collision with root package name */
    private long f13631e;

    public b() {
        super(6);
    }

    private void B() {
        a aVar = this.f13630d;
        if (aVar != null) {
            aVar.a();
        }
    }

    private float[] a(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f13628b.a(byteBuffer.array(), byteBuffer.limit());
        this.f13628b.d(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = Float.intBitsToFloat(this.f13628b.r());
        }
        return fArr;
    }

    public boolean A() {
        return g();
    }

    public int a(v vVar) {
        return as.CC.b("application/x-camera-motion".equals(vVar.l) ? 4 : 0);
    }

    public void a(int i, Object obj) throws p {
        if (i == 8) {
            this.f13630d = (a) obj;
        } else {
            super.a(i, obj);
        }
    }

    public void a(long j, long j2) {
        while (!g() && this.f13631e < 100000 + j) {
            this.f13627a.a();
            if (a(t(), this.f13627a, 0) == -4 && !this.f13627a.c()) {
                this.f13631e = this.f13627a.f11421d;
                if (this.f13630d != null && !this.f13627a.b()) {
                    this.f13627a.h();
                    float[] a2 = a((ByteBuffer) ai.a(this.f13627a.f11419b));
                    if (a2 != null) {
                        ((a) ai.a(this.f13630d)).a(this.f13631e - this.f13629c, a2);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(long j, boolean z) {
        this.f13631e = Long.MIN_VALUE;
        B();
    }

    /* access modifiers changed from: protected */
    public void a(v[] vVarArr, long j, long j2) {
        this.f13629c = j2;
    }

    /* access modifiers changed from: protected */
    public void r() {
        B();
    }

    public String y() {
        return "CameraMotionRenderer";
    }

    public boolean z() {
        return true;
    }
}
