package com.yandex.metrica.impl.ob;

import com.yandex.metrica.networktasks.api.Compressor;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

public class Ql implements Compressor {
    public byte[] compress(byte[] bArr) throws IOException {
        if (bArr == null) {
            return null;
        }
        return L0.b(bArr);
    }

    public byte[] uncompress(byte[] bArr) throws IOException {
        GZIPInputStream gZIPInputStream;
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        if (bArr == null) {
            return null;
        }
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                try {
                    byte[] a2 = L0.a((InputStream) gZIPInputStream);
                    A2.a((Closeable) gZIPInputStream);
                    A2.a((Closeable) byteArrayInputStream);
                    return a2;
                } catch (Throwable th2) {
                    th = th2;
                    A2.a((Closeable) gZIPInputStream);
                    A2.a((Closeable) byteArrayInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                gZIPInputStream = null;
                A2.a((Closeable) gZIPInputStream);
                A2.a((Closeable) byteArrayInputStream);
                throw th;
            }
        } catch (Throwable th4) {
            byteArrayInputStream = null;
            th = th4;
            gZIPInputStream = null;
            A2.a((Closeable) gZIPInputStream);
            A2.a((Closeable) byteArrayInputStream);
            throw th;
        }
    }
}
