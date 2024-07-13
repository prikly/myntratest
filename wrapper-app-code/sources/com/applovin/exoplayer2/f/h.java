package com.applovin.exoplayer2.f;

import android.media.MediaCodec;
import com.applovin.exoplayer2.c.f;

public class h extends f {

    /* renamed from: a  reason: collision with root package name */
    public final i f12542a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12543b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(java.lang.Throwable r4, com.applovin.exoplayer2.f.i r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Decoder failed: "
            r0.append(r1)
            r1 = 0
            if (r5 != 0) goto L_0x000f
            r2 = r1
            goto L_0x0011
        L_0x000f:
            java.lang.String r2 = r5.f12544a
        L_0x0011:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r4)
            r3.f12542a = r5
            int r5 = com.applovin.exoplayer2.l.ai.f13525a
            r0 = 21
            if (r5 < r0) goto L_0x0027
            java.lang.String r1 = a(r4)
        L_0x0027:
            r3.f12543b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.f.h.<init>(java.lang.Throwable, com.applovin.exoplayer2.f.i):void");
    }

    private static String a(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
