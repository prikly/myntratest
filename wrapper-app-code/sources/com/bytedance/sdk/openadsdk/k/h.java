package com.bytedance.sdk.openadsdk.k;

import android.content.ContentValues;
import android.content.Context;
import com.bytedance.sdk.openadsdk.multipro.a.a;
import com.bytedance.sdk.openadsdk.multipro.aidl.c;
import com.onesignal.outcomes.OSOutcomeConstants;
import java.util.LinkedList;
import java.util.List;

/* compiled from: TrackRetryRepertoryImpl */
public class h implements g {

    /* renamed from: a  reason: collision with root package name */
    private Context f2093a;

    public h(Context context) {
        this.f2093a = context;
    }

    public synchronized List<f> a() {
        LinkedList linkedList;
        linkedList = new LinkedList();
        c cVar = new c(a.a(this.f2093a, "trackurl", (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null));
        while (cVar.moveToNext()) {
            try {
                linkedList.add(new f(cVar.getString(cVar.getColumnIndex(OSOutcomeConstants.OUTCOME_ID)), cVar.getString(cVar.getColumnIndex("url")), cVar.getInt(cVar.getColumnIndex("retry"))));
            } finally {
                cVar.close();
            }
        }
        return linkedList;
    }

    public synchronized void a(f fVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(OSOutcomeConstants.OUTCOME_ID, fVar.a());
        contentValues.put("url", fVar.b());
        contentValues.put("replaceholder", 1);
        contentValues.put("retry", Integer.valueOf(fVar.c()));
        a.a(this.f2093a, "trackurl", contentValues);
    }

    public synchronized void b(f fVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(OSOutcomeConstants.OUTCOME_ID, fVar.a());
        contentValues.put("url", fVar.b());
        contentValues.put("replaceholder", 1);
        contentValues.put("retry", Integer.valueOf(fVar.c()));
        a.a(this.f2093a, "trackurl", contentValues, "id=?", new String[]{fVar.a()});
    }

    public synchronized void c(f fVar) {
        a.a(this.f2093a, "trackurl", "id=?", new String[]{fVar.a()});
    }

    public static String b() {
        return "CREATE TABLE IF NOT EXISTS " + "trackurl" + " (_id INTEGER PRIMARY KEY AUTOINCREMENT," + OSOutcomeConstants.OUTCOME_ID + " TEXT UNIQUE," + "url" + " TEXT ," + "replaceholder" + " INTEGER default 0, " + "retry" + " INTEGER default 0" + ")";
    }
}
