package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin._Assertions;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: utfEncoding.kt */
public final class UtfEncodingKt {
    public static final byte[] stringsToBytes(String[] strArr) {
        int i;
        Intrinsics.checkNotNullParameter(strArr, "strings");
        int length = strArr.length;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            String str = strArr[i2];
            i2++;
            i3 += str.length();
        }
        byte[] bArr = new byte[i3];
        int length2 = strArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length2) {
            String str2 = strArr[i4];
            i4++;
            int length3 = str2.length() - 1;
            if (length3 >= 0) {
                int i6 = 0;
                while (true) {
                    int i7 = i6 + 1;
                    i = i5 + 1;
                    bArr[i5] = (byte) str2.charAt(i6);
                    if (i6 == length3) {
                        break;
                    }
                    i6 = i7;
                    i5 = i;
                }
                i5 = i;
            }
        }
        if (i5 == i3) {
            z = true;
        }
        if (!_Assertions.ENABLED || z) {
            return bArr;
        }
        throw new AssertionError("Should have reached the end");
    }
}
