package com.applovin.exoplayer2.common.a;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class p {
    static int a(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    static int a(int i, double d2) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max <= ((int) (d2 * ((double) highestOneBit)))) {
            return highestOneBit;
        }
        int i2 = highestOneBit << 1;
        if (i2 > 0) {
            return i2;
        }
        return 1073741824;
    }

    static int a(@NullableDecl Object obj) {
        return a(obj == null ? 0 : obj.hashCode());
    }
}
