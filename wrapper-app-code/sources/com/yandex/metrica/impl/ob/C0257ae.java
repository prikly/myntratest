package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ae  reason: case insensitive filesystem */
public class C0257ae implements C0270b2<C0357ee> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5478a;

    public C0257ae(Context context) {
        this.f5478a = context;
    }

    /* renamed from: a */
    public C0357ee invoke() {
        Cursor cursor;
        JSONObject jSONObject;
        try {
            cursor = this.f5478a.getContentResolver().query(Uri.parse("content://com.yandex.preinstallsatellite.appmetrica.provider/preload_info"), (String[]) null, (String) null, (String[]) null, (String) null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(cursor.getColumnIndexOrThrow("tracking_id"));
                        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("additional_parameters"));
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            if (!TextUtils.isEmpty(string2)) {
                                jSONObject = new JSONObject(string2);
                                C0420h2.a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject);
                                C0357ee eeVar = new C0357ee(string, jSONObject, !TextUtils.isEmpty(string), false, C0736u0.SATELLITE);
                                A2.a(cursor);
                                return eeVar;
                            }
                        } catch (Throwable unused) {
                        }
                        jSONObject = jSONObject2;
                        C0420h2.a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject);
                        C0357ee eeVar2 = new C0357ee(string, jSONObject, !TextUtils.isEmpty(string), false, C0736u0.SATELLITE);
                        A2.a(cursor);
                        return eeVar2;
                    }
                    C0420h2.a("No Preload Info data in Satellite content provider", new Object[0]);
                    A2.a(cursor);
                    return null;
                } catch (Throwable unused2) {
                }
            } else {
                C0420h2.a("No Satellite content provider found", new Object[0]);
                A2.a(cursor);
                return null;
            }
        } catch (Throwable unused3) {
            cursor = null;
        }
    }
}
