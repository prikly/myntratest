package okhttp3;

import java.io.Closeable;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSource;

public abstract class ResponseBody implements Closeable {
    public abstract long contentLength();

    public abstract BufferedSource source();

    public void close() {
        Util.closeQuietly((Closeable) source());
    }

    public static ResponseBody create(MediaType mediaType, byte[] bArr) {
        return create(mediaType, (long) bArr.length, new Buffer().write(bArr));
    }

    public static ResponseBody create(final MediaType mediaType, final long j, final BufferedSource bufferedSource) {
        if (bufferedSource != null) {
            return new ResponseBody() {
                public long contentLength() {
                    return j;
                }

                public BufferedSource source() {
                    return bufferedSource;
                }
            };
        }
        throw new NullPointerException("source == null");
    }
}
