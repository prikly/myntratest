package ms.bd.o.Pgl;

import android.content.res.AssetManager;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import ms.bd.o.Pgl.pblb;

final class pblg extends pblb.pgla {
    pblg() {
    }

    /* access modifiers changed from: protected */
    public Object a(int i, long j, String str, Object obj) throws Throwable {
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        IOException e2;
        AssetManager assets = pgla.a().b().getAssets();
        if (!str.startsWith((String) pblk.a(16777217, 0, 0, "df24d3", new byte[]{59}))) {
            str = ((String) pblk.a(16777217, 0, 0, "6af8e7", new byte[]{105})) + str;
        }
        String[] list = assets.list("");
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.length; i2++) {
            if (list[i2].endsWith(str)) {
                String str2 = list[i2];
                String absolutePath = File.createTempFile((String) pblk.a(16777217, 0, 0, "34dbd5", new byte[]{47, 37, Ascii.DC2, Ascii.SO, 79}), "").getAbsolutePath();
                FileOutputStream fileOutputStream2 = null;
                try {
                    inputStream = assets.open(str2);
                    try {
                        fileOutputStream = new FileOutputStream(absolutePath);
                    } catch (IOException e3) {
                        e2 = e3;
                        try {
                            e2.printStackTrace();
                            fileOutputStream = fileOutputStream2;
                            pblz.a((Closeable) inputStream);
                            pblz.a((Closeable) fileOutputStream);
                        } catch (Throwable th) {
                            th = th;
                            pblz.a((Closeable) inputStream);
                            pblz.a((Closeable) fileOutputStream2);
                            throw th;
                        }
                    }
                    try {
                        if (pblz.a(inputStream, fileOutputStream) > 0) {
                            arrayList.add(absolutePath);
                        }
                    } catch (IOException e4) {
                        e2 = e4;
                        fileOutputStream2 = fileOutputStream;
                        e2.printStackTrace();
                        fileOutputStream = fileOutputStream2;
                        pblz.a((Closeable) inputStream);
                        pblz.a((Closeable) fileOutputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream2 = fileOutputStream;
                        pblz.a((Closeable) inputStream);
                        pblz.a((Closeable) fileOutputStream2);
                        throw th;
                    }
                } catch (IOException e5) {
                    e2 = e5;
                    inputStream = null;
                    e2.printStackTrace();
                    fileOutputStream = fileOutputStream2;
                    pblz.a((Closeable) inputStream);
                    pblz.a((Closeable) fileOutputStream);
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = null;
                    pblz.a((Closeable) inputStream);
                    pblz.a((Closeable) fileOutputStream2);
                    throw th;
                }
                pblz.a((Closeable) inputStream);
                pblz.a((Closeable) fileOutputStream);
            }
        }
        return arrayList.toArray(new String[0]);
    }
}
