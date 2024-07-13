package com.yandex.metrica.impl.ob;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Z7 implements Y7 {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, List<String>> f5408a;

    public Z7(String str, HashMap<String, List<String>> hashMap) {
        this.f5408a = hashMap;
    }

    public boolean a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor;
        try {
            boolean z = true;
            for (Map.Entry next : this.f5408a.entrySet()) {
                cursor = null;
                cursor = sQLiteDatabase.query((String) next.getKey(), (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null);
                if (cursor == null) {
                    A2.a(cursor);
                    return false;
                }
                String str = (String) next.getKey();
                List asList = Arrays.asList(cursor.getColumnNames());
                Collections.sort(asList);
                z &= ((List) next.getValue()).equals(asList);
                A2.a(cursor);
            }
            return z;
        } catch (Throwable unused) {
            return false;
        }
    }
}
