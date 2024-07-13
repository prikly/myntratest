package com.google.common.collect;

final class Hashing {
    static int smear(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }
}
