package com.bykv.vk.openvk.component.video.a.e;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: VideoFilesUtils */
public class c {
    public static long a(String str, String str2) {
        File c2 = c(str, str2);
        if (c2.exists()) {
            return c2.length();
        }
        File b2 = b(str, str2);
        if (b2.exists()) {
            return b2.length();
        }
        return 0;
    }

    public static File b(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2 + ".temp");
    }

    public static File c(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2);
    }

    public static void a(RandomAccessFile randomAccessFile, byte[] bArr, int i, int i2, String str) throws IOException {
        try {
            randomAccessFile.seek((long) i);
            randomAccessFile.write(bArr, 0, i2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
