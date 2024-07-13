package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.yandex.metrica.billing_interface.e;
import com.yandex.metrica.g;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.io.FilesKt;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.b  reason: case insensitive filesystem */
public class C0267b {
    public static boolean a(Boolean bool) {
        return Boolean.TRUE.equals(bool);
    }

    public static boolean b(String str, String str2) {
        return !((str == null && str2 == null) ? true : (str == null || str2 == null) ? false : str.equals(str2));
    }

    public static Integer c(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static e d(String str) {
        if ("inapp".equals(str)) {
            return e.INAPP;
        }
        if ("subs".equals(str)) {
            return e.SUBS;
        }
        return e.UNKNOWN;
    }

    public static byte[] e(String str) {
        return str == null ? new byte[0] : str.getBytes();
    }

    public static String a(Context context) {
        return context.getPackageName() + "-crashpad_new_crash_socket";
    }

    public static byte[] b(String str) {
        if (str != null) {
            try {
                return str.getBytes("UTF-8");
            } catch (Throwable unused) {
            }
        }
        return new byte[0];
    }

    public static SharedPreferences a(Context context, String str) {
        return context.getSharedPreferences(context.getPackageName() + str, 0);
    }

    public static boolean a(File file, File file2) {
        try {
            FilesKt.copyTo(file, file2, false, 8192);
            file.delete();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a(Collection<?> collection, Collection<?> collection2) {
        HashSet hashSet;
        if (collection == null && collection2 == null) {
            return true;
        }
        if (collection == null || collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        if (collection instanceof HashSet) {
            Collection<?> collection3 = collection2;
            hashSet = (HashSet) collection;
            collection = collection3;
        } else if (collection2 instanceof HashSet) {
            hashSet = (HashSet) collection2;
        } else {
            HashSet hashSet2 = new HashSet(collection);
            collection = collection2;
            hashSet = hashSet2;
        }
        for (Object contains : collection) {
            if (!hashSet.contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public static void a(Cursor cursor, ContentValues contentValues) {
        String[] columnNames = cursor.getColumnNames();
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            int type = cursor.getType(i);
            if (type == 0) {
                contentValues.put(columnNames[i], cursor.getString(i));
            } else if (type == 1) {
                contentValues.put(columnNames[i], Long.valueOf(cursor.getLong(i)));
            } else if (type == 2) {
                contentValues.put(columnNames[i], Double.valueOf(cursor.getDouble(i)));
            } else if (type == 3) {
                contentValues.put(columnNames[i], cursor.getString(i));
            } else if (type != 4) {
                contentValues.put(columnNames[i], cursor.getString(i));
            } else {
                contentValues.put(columnNames[i], cursor.getBlob(i));
            }
        }
    }

    public static long a() {
        return C0390fm.c().a();
    }

    public static String a(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    public static List<Integer> a(int[] iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        return arrayList;
    }

    public static void a(SharedPreferences sharedPreferences, String str, int i) {
        if (sharedPreferences != null && sharedPreferences.contains(str)) {
            try {
                sharedPreferences.edit().remove(str).putLong(str, (long) sharedPreferences.getInt(str, i)).apply();
            } catch (ClassCastException unused) {
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.String[], android.database.Cursor] */
    public static long a(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursor = 0;
        try {
            cursor = sQLiteDatabase.rawQuery("SELECT count() FROM " + str, cursor);
            return cursor.moveToFirst() ? cursor.getLong(0) : 0;
        } finally {
            A2.a((Cursor) cursor);
        }
    }

    public static int[] a(List<Integer> list) {
        int[] iArr = new int[list.size()];
        int i = 0;
        for (Integer intValue : list) {
            iArr[i] = intValue.intValue();
            i++;
        }
        return iArr;
    }

    public static g a(String str) {
        g gVar = new g();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                gVar.b(jSONObject.optString("UserInfo.UserId", (String) null));
                gVar.a(jSONObject.optString("UserInfo.Type", (String) null));
                gVar.a((Map<String, String>) Tl.b(jSONObject.optJSONObject("UserInfo.Options")));
            } catch (Throwable unused) {
            }
        }
        return gVar;
    }

    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            sb.append("0123456789abcdef".charAt((b2 & 240) >> 4));
            sb.append("0123456789abcdef".charAt(b2 & Ascii.SI));
        }
        return sb.toString();
    }
}
