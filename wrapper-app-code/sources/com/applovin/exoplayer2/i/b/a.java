package com.applovin.exoplayer2.i.b;

import com.applovin.exoplayer2.i.d;
import com.applovin.exoplayer2.i.f;
import com.applovin.exoplayer2.l.y;
import java.util.List;

public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    private final b f12974a;

    public a(List<byte[]> list) {
        super("DvbDecoder");
        y yVar = new y(list.get(0));
        this.f12974a = new b(yVar.i(), yVar.i());
    }

    /* access modifiers changed from: protected */
    public f a(byte[] bArr, int i, boolean z) {
        if (z) {
            this.f12974a.a();
        }
        return new c(this.f12974a.a(bArr, i));
    }
}
