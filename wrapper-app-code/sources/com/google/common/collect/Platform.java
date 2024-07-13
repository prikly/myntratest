package com.google.common.collect;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.logging.Logger;

final class Platform {
    private static final Logger logger = Logger.getLogger(Platform.class.getName());

    static <T> T[] newArray(T[] tArr, int i) {
        return (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i);
    }

    static <T> T[] copy(Object[] objArr, int i, int i2, T[] tArr) {
        return Arrays.copyOfRange(objArr, i, i2, tArr.getClass());
    }

    private Platform() {
    }
}
