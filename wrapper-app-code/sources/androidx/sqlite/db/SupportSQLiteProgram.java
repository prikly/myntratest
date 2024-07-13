package androidx.sqlite.db;

import java.io.Closeable;

public interface SupportSQLiteProgram extends Closeable {
    void bindBlob(int i, byte[] bArr);

    void bindDouble(int i, double d2);

    void bindLong(int i, long j);

    void bindNull(int i);

    void bindString(int i, String str);
}
