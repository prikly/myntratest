package androidx.sqlite.db;

public interface SupportSQLiteStatement extends SupportSQLiteProgram {
    long executeInsert();

    int executeUpdateDelete();
}
