package com.bykv.vk.openvk.component.video.a.b.b;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.sdk.component.f.h;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: VideoProxyDB */
public class c {

    /* renamed from: b  reason: collision with root package name */
    private static volatile c f17980b;

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<Map<String, a>> f17981a = new SparseArray<>(2);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final d f17982c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f17983d = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingDeque(), new h(5, "video_proxy_db"));
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public volatile SQLiteStatement f17984e;

    private c(Context context) {
        this.f17982c = new d(context.getApplicationContext());
        this.f17981a.put(0, new ConcurrentHashMap());
        this.f17981a.put(1, new ConcurrentHashMap());
    }

    public static c a(Context context) {
        if (f17980b == null) {
            synchronized (c.class) {
                if (f17980b == null) {
                    f17980b = new c(context);
                }
            }
        }
        return f17980b;
    }

    public a a(String str, int i) {
        a aVar;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Map map = this.f17981a.get(i);
        if (map == null) {
            aVar = null;
        } else {
            aVar = (a) map.get(str);
        }
        if (aVar != null) {
            return aVar;
        }
        try {
            Cursor query = this.f17982c.getReadableDatabase().query("video_http_header_t", (String[]) null, "key=? AND flag=?", new String[]{str, String.valueOf(i)}, (String) null, (String) null, (String) null, "1");
            if (query != null) {
                if (query.getCount() > 0 && query.moveToNext()) {
                    aVar = new a(query.getString(query.getColumnIndex("key")), query.getString(query.getColumnIndex("mime")), query.getInt(query.getColumnIndex("contentLength")), i, query.getString(query.getColumnIndex("extra")));
                }
                query.close();
            }
            if (!(aVar == null || map == null)) {
                map.put(str, aVar);
            }
            return aVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public void a(final a aVar) {
        if (aVar != null) {
            Map map = this.f17981a.get(aVar.f17978d);
            if (map != null) {
                map.put(aVar.f17975a, aVar);
            }
            this.f17983d.execute(new Runnable() {
                public void run() {
                    try {
                        if (c.this.f17984e == null) {
                            SQLiteStatement unused = c.this.f17984e = c.this.f17982c.getWritableDatabase().compileStatement("INSERT INTO video_http_header_t (key,mime,contentLength,flag,extra) VALUES(?,?,?,?,?)");
                        } else {
                            c.this.f17984e.clearBindings();
                        }
                        c.this.f17984e.bindString(1, aVar.f17975a);
                        c.this.f17984e.bindString(2, aVar.f17976b);
                        c.this.f17984e.bindLong(3, (long) aVar.f17977c);
                        c.this.f17984e.bindLong(4, (long) aVar.f17978d);
                        c.this.f17984e.bindString(5, aVar.f17979e);
                        c.this.f17984e.executeInsert();
                    } catch (Throwable unused2) {
                    }
                }
            });
        }
    }

    public void a(Collection<String> collection, int i) {
        if (collection != null && !collection.isEmpty()) {
            int size = collection.size() + 1;
            String[] strArr = new String[size];
            int i2 = -1;
            Map map = this.f17981a.get(i);
            for (String next : collection) {
                if (map != null) {
                    map.remove(next);
                }
                i2++;
                strArr[i2] = next;
            }
            strArr[i2 + 1] = String.valueOf(i);
            try {
                SQLiteDatabase writableDatabase = this.f17982c.getWritableDatabase();
                writableDatabase.delete("video_http_header_t", "key IN(" + b(size) + ") AND " + "flag" + "=?", strArr);
            } catch (Throwable unused) {
            }
        }
    }

    private String b(int i) {
        if (i <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(i << 1);
        sb.append("?");
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(",?");
        }
        return sb.toString();
    }

    public void a(final int i) {
        Map map = this.f17981a.get(i);
        if (map != null) {
            map.clear();
        }
        this.f17983d.execute(new Runnable() {
            public void run() {
                try {
                    c.this.f17982c.getWritableDatabase().delete("video_http_header_t", "flag=?", new String[]{String.valueOf(i)});
                } catch (Throwable unused) {
                }
            }
        });
    }
}
