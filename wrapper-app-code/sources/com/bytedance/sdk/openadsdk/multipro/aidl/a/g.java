package com.bytedance.sdk.openadsdk.multipro.aidl.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.sdk.openadsdk.core.i.e;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.multipro.f;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: ProviderListenerManagerImpl */
public class g extends a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile g f2120a;

    public static g a() {
        if (f2120a == null) {
            synchronized (g.class) {
                if (f2120a == null) {
                    f2120a = new g();
                }
            }
        }
        return f2120a;
    }

    public Map query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (!e.a()) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            Cursor a2 = f.a(m.a()).a(uri, strArr, str, strArr2, str2);
            if (a2 != null) {
                String[] columnNames = a2.getColumnNames();
                while (a2.getCount() > 0 && a2.moveToNext()) {
                    for (String str3 : columnNames) {
                        if (!hashMap.containsKey(str3)) {
                            hashMap.put(str3, new LinkedList());
                        }
                        ((List) hashMap.get(str3)).add(a2.getString(a2.getColumnIndex(str3)));
                    }
                }
                a2.close();
            }
            return hashMap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getType(Uri uri) {
        if (!e.a()) {
            return null;
        }
        return f.a(m.a()).a(uri);
    }

    public String insert(Uri uri, ContentValues contentValues) {
        Uri a2;
        if (e.a() && (a2 = f.a(m.a()).a(uri, contentValues)) != null) {
            return a2.toString();
        }
        return null;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        if (!e.a()) {
            return 0;
        }
        return f.a(m.a()).a(uri, str, strArr);
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (!e.a()) {
            return 0;
        }
        return f.a(m.a()).a(uri, contentValues, str, strArr);
    }
}
