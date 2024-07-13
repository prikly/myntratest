package com.applovin.exoplayer2.g.b;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final ByteArrayOutputStream f12589a = new ByteArrayOutputStream(512);

    /* renamed from: b  reason: collision with root package name */
    private final DataOutputStream f12590b = new DataOutputStream(this.f12589a);

    private static void a(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(a aVar) {
        this.f12589a.reset();
        try {
            a(this.f12590b, aVar.f12583a);
            a(this.f12590b, aVar.f12584b != null ? aVar.f12584b : "");
            this.f12590b.writeLong(aVar.f12585c);
            this.f12590b.writeLong(aVar.f12586d);
            this.f12590b.write(aVar.f12587e);
            this.f12590b.flush();
            return this.f12589a.toByteArray();
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }
}
