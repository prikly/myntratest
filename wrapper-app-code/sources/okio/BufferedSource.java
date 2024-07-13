package okio;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;

public interface BufferedSource extends ReadableByteChannel, Source {
    Buffer buffer();

    boolean exhausted() throws IOException;

    long indexOf(byte b2) throws IOException;

    InputStream inputStream();

    boolean rangeEquals(long j, ByteString byteString) throws IOException;

    byte readByte() throws IOException;

    byte[] readByteArray() throws IOException;

    byte[] readByteArray(long j) throws IOException;

    ByteString readByteString(long j) throws IOException;

    long readDecimalLong() throws IOException;

    void readFully(byte[] bArr) throws IOException;

    long readHexadecimalUnsignedLong() throws IOException;

    int readInt() throws IOException;

    int readIntLe() throws IOException;

    short readShort() throws IOException;

    short readShortLe() throws IOException;

    String readUtf8LineStrict() throws IOException;

    String readUtf8LineStrict(long j) throws IOException;

    void require(long j) throws IOException;

    void skip(long j) throws IOException;
}
