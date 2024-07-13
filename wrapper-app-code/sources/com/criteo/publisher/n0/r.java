package com.criteo.publisher.n0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: StreamUtil */
public final class r {
    public static String a(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    bufferedReader.close();
                    return sb.toString();
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        throw th;
    }
}
