package com.bytedance.sdk.component.d.c.c;

import java.io.Closeable;

/* compiled from: IOUtils */
public class b {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }
}
