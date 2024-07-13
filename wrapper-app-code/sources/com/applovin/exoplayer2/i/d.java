package com.applovin.exoplayer2.i;

import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.c.i;
import com.applovin.exoplayer2.c.j;
import com.applovin.exoplayer2.l.a;
import java.nio.ByteBuffer;

public abstract class d extends j<j, k, h> implements g {

    /* renamed from: a  reason: collision with root package name */
    private final String f13046a;

    protected d(String str) {
        super(new j[2], new k[2]);
        this.f13046a = str;
        a(1024);
    }

    /* access modifiers changed from: protected */
    public abstract f a(byte[] bArr, int i, boolean z) throws h;

    /* access modifiers changed from: protected */
    public final h a(j jVar, k kVar, boolean z) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) a.b(jVar.f11419b);
            k kVar2 = kVar;
            kVar2.a(jVar.f11421d, a(byteBuffer.array(), byteBuffer.limit(), z), jVar.f13200f);
            kVar.c(RecyclerView.UNDEFINED_DURATION);
            return null;
        } catch (h e2) {
            return e2;
        }
    }

    public void a(long j) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final h a(Throwable th) {
        return new h("Unexpected decode error", th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final j g() {
        return new j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final k h() {
        return new e(new i.a() {
            public final void releaseOutputBuffer(i iVar) {
                d.this.a((k) iVar);
            }
        });
    }
}
