package h;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.onesignal.outcomes.OSOutcomeConstants;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

public class a extends SQLiteOpenHelper {

    /* renamed from: h.a$a  reason: collision with other inner class name */
    public static final class C0062a {
        public static List<b.a> a(SQLiteOpenHelper sQLiteOpenHelper, Integer num) {
            return a(sQLiteOpenHelper, String.format("%s = ?", new Object[]{"is_reserved"}), new String[]{BuildConfig.ADAPTER_VERSION}, num != null ? String.valueOf(num) : null);
        }

        public static List<b.a> a(SQLiteOpenHelper sQLiteOpenHelper, String str, String[] strArr, String str2) {
            SQLiteDatabase sQLiteDatabase;
            Cursor cursor;
            Cursor cursor2;
            ArrayList arrayList = new ArrayList();
            SQLiteDatabase sQLiteDatabase2 = null;
            try {
                sQLiteDatabase = sQLiteOpenHelper.getReadableDatabase();
                try {
                    cursor = sQLiteDatabase.query("tracker_event", new String[]{OSOutcomeConstants.OUTCOME_ID, "timestamp", "context", "name", "dimensions", "metrics"}, str, strArr, (String) null, (String) null, String.format("%s DESC", new Object[]{"timestamp"}), str2);
                    while (cursor.moveToNext()) {
                        try {
                            arrayList.add(new b.a(cursor.getString(0), cursor.getLong(1), cursor.getString(2), cursor.getString(3), new JSONObject(cursor.getString(4)), new JSONObject(cursor.getString(5))));
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable unused2) {
                    cursor2 = null;
                    sQLiteDatabase2 = sQLiteDatabase;
                    sQLiteDatabase = sQLiteDatabase2;
                    cursor = cursor2;
                    a.a.a((Closeable) cursor);
                    a.a.a((Closeable) sQLiteDatabase);
                    return arrayList;
                }
            } catch (Throwable unused3) {
                cursor2 = null;
                sQLiteDatabase = sQLiteDatabase2;
                cursor = cursor2;
                a.a.a((Closeable) cursor);
                a.a.a((Closeable) sQLiteDatabase);
                return arrayList;
            }
            a.a.a((Closeable) cursor);
            a.a.a((Closeable) sQLiteDatabase);
            return arrayList;
        }

        public static void a(SQLiteOpenHelper sQLiteOpenHelper) {
            a(sQLiteOpenHelper, false, (List<b.a>) null);
        }

        public static void a(SQLiteOpenHelper sQLiteOpenHelper, List<b.a> list) {
            SQLiteDatabase sQLiteDatabase;
            try {
                sQLiteDatabase = sQLiteOpenHelper.getWritableDatabase();
                try {
                    sQLiteDatabase.execSQL(String.format(Locale.ENGLISH, "DELETE FROM %s WHERE %s IN (%s)", new Object[]{"tracker_event", OSOutcomeConstants.OUTCOME_ID, TextUtils.join(",", a(list))}));
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                sQLiteDatabase = null;
            }
            a.a.a((Closeable) sQLiteDatabase);
        }

        public static void a(SQLiteOpenHelper sQLiteOpenHelper, boolean z, List<b.a> list) {
            SQLiteDatabase sQLiteDatabase;
            try {
                sQLiteDatabase = sQLiteOpenHelper.getWritableDatabase();
                try {
                    String format = String.format(Locale.ENGLISH, "UPDATE %s SET %s=%d", new Object[]{"tracker_event", "is_reserved", Integer.valueOf(z ? 1 : 0)});
                    if (list != null && list.size() > 0) {
                        format = format + String.format(" WHERE %s IN (%s)", new Object[]{OSOutcomeConstants.OUTCOME_ID, TextUtils.join(",", a(list))});
                    }
                    sQLiteDatabase.execSQL(format);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                sQLiteDatabase = null;
            }
            a.a.a((Closeable) sQLiteDatabase);
        }

        public static boolean a(SQLiteOpenHelper sQLiteOpenHelper, b.a aVar) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                SQLiteDatabase writableDatabase = sQLiteOpenHelper.getWritableDatabase();
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(OSOutcomeConstants.OUTCOME_ID, aVar.c());
                    contentValues.put("timestamp", Long.valueOf(aVar.f()));
                    contentValues.put("context", aVar.a());
                    contentValues.put("name", aVar.e());
                    contentValues.put("dimensions", aVar.b().toString());
                    contentValues.put("metrics", aVar.d().toString());
                    writableDatabase.insert("tracker_event", (String) null, contentValues);
                    a.a.a((Closeable) writableDatabase);
                    return true;
                } catch (Throwable unused) {
                    sQLiteDatabase = writableDatabase;
                    a.a.a((Closeable) sQLiteDatabase);
                    return false;
                }
            } catch (Throwable unused2) {
                a.a.a((Closeable) sQLiteDatabase);
                return false;
            }
        }

        public static String[] a(List<b.a> list) {
            String[] strArr = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                strArr[i] = '\'' + list.get(i).c() + '\'';
            }
            return strArr;
        }

        public static void b(SQLiteOpenHelper sQLiteOpenHelper, List<b.a> list) {
            a(sQLiteOpenHelper, false, list);
        }

        public static void c(SQLiteOpenHelper sQLiteOpenHelper, List<b.a> list) {
            a(sQLiteOpenHelper, true, list);
        }
    }

    public a(Context context) {
        super(context, "BMAnalytics.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE tracker_event (id TEXT,timestamp INTEGER,context TEXT,name TEXT,dimensions TEXT,metrics TEXT,is_reserved INTEGER DEFAULT 0)");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(sQLiteDatabase, i, i2);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS tracker_event");
        onCreate(sQLiteDatabase);
    }
}
