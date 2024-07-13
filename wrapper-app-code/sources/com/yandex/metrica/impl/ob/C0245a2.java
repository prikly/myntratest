package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.yandex.metrica.impl.ob.C0763v3;
import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.a2  reason: case insensitive filesystem */
public class C0245a2 implements C0270b2<C0763v3.a> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5455a;

    public C0245a2(Context context) {
        this.f5455a = context;
    }

    public Object invoke() {
        Cursor cursor;
        try {
            cursor = this.f5455a.getContentResolver().query(Uri.parse("content://com.yandex.preinstallsatellite.appmetrica.provider/clids"), (String[]) null, (String) null, (String[]) null, (String) null);
            if (cursor != null) {
                try {
                    HashMap hashMap = new HashMap();
                    while (cursor.moveToNext()) {
                        try {
                            String string = cursor.getString(cursor.getColumnIndexOrThrow("clid_key"));
                            String string2 = cursor.getString(cursor.getColumnIndexOrThrow("clid_value"));
                            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                                C0420h2.a("Invalid clid {%s : %s}", string, string2);
                            } else {
                                hashMap.put(string, string2);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    C0420h2.a("Clids from satellite: %s", hashMap);
                    C0763v3.a aVar = new C0763v3.a(hashMap, C0736u0.SATELLITE);
                    A2.a(cursor);
                    return aVar;
                } catch (Throwable th) {
                    th = th;
                    try {
                        C0420h2.a(th, "Error while getting satellite clids", new Object[0]);
                        return null;
                    } finally {
                        A2.a(cursor);
                    }
                }
            } else {
                C0420h2.a("No Satellite content provider found", new Object[0]);
                A2.a(cursor);
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            C0420h2.a(th, "Error while getting satellite clids", new Object[0]);
            return null;
        }
    }
}
