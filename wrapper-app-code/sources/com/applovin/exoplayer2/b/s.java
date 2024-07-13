package com.applovin.exoplayer2.b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

public class s {
    public static int a(byte[] bArr) {
        return bArr[9] & 255;
    }

    private static byte[] a(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }

    private static long b(long j) {
        return (j * 1000000000) / 48000;
    }

    public static List<byte[]> b(byte[] bArr) {
        long b2 = b((long) c(bArr));
        long b3 = b(3840);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(a(b2));
        arrayList.add(a(b3));
        return arrayList;
    }

    private static int c(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }
}
