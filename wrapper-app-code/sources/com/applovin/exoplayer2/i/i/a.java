package com.applovin.exoplayer2.i.i;

import com.applovin.exoplayer2.i.a;
import com.applovin.exoplayer2.i.d;
import com.applovin.exoplayer2.i.f;
import com.applovin.exoplayer2.i.h;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    private final y f13156a = new y();

    public a() {
        super("Mp4WebvttDecoder");
    }

    private static com.applovin.exoplayer2.i.a a(y yVar, int i) throws h {
        CharSequence charSequence = null;
        a.C0125a aVar = null;
        while (i > 0) {
            if (i >= 8) {
                int q = yVar.q();
                int q2 = yVar.q();
                int i2 = q - 8;
                String a2 = ai.a(yVar.d(), yVar.c(), i2);
                yVar.e(i2);
                i = (i - 8) - i2;
                if (q2 == 1937011815) {
                    aVar = f.a(a2);
                } else if (q2 == 1885436268) {
                    charSequence = f.a((String) null, a2.trim(), (List<d>) Collections.emptyList());
                }
            } else {
                throw new h("Incomplete vtt cue box header found.");
            }
        }
        if (charSequence == null) {
            charSequence = "";
        }
        return aVar != null ? aVar.a(charSequence).e() : f.a(charSequence);
    }

    /* access modifiers changed from: protected */
    public f a(byte[] bArr, int i, boolean z) throws h {
        this.f13156a.a(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (this.f13156a.a() > 0) {
            if (this.f13156a.a() >= 8) {
                int q = this.f13156a.q();
                if (this.f13156a.q() == 1987343459) {
                    arrayList.add(a(this.f13156a, q - 8));
                } else {
                    this.f13156a.e(q - 8);
                }
            } else {
                throw new h("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new b(arrayList);
    }
}
