package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzekc extends SQLiteOpenHelper {
    private final Context zza;
    private final zzgfc zzb;

    public zzekc(Context context, zzgfc zzgfc) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) zzba.zzc().zzb(zzbjj.zzhB)).intValue());
        this.zza = context;
        this.zzb = zzgfc;
    }

    static /* synthetic */ void zzf(SQLiteDatabase sQLiteDatabase, String str, zzcht zzcht) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        zzj(sQLiteDatabase, zzcht);
    }

    static final void zzi(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    /* access modifiers changed from: private */
    public static void zzj(SQLiteDatabase sQLiteDatabase, zzcht zzcht) {
        sQLiteDatabase.beginTransaction();
        try {
            Cursor query = sQLiteDatabase.query("offline_buffered_pings", new String[]{"url"}, "event_state = " + 1, (String[]) null, (String) null, (String) null, "timestamp ASC", (String) null);
            int count = query.getCount();
            String[] strArr = new String[count];
            int i = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex("url");
                if (columnIndex != -1) {
                    strArr[i] = query.getString(columnIndex);
                }
                i++;
            }
            query.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            for (int i2 = 0; i2 < count; i2++) {
                zzcht.zza(strArr[i2]);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void zza(zzeke zzeke, SQLiteDatabase sQLiteDatabase) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(zzeke.zza));
        contentValues.put("gws_query_id", zzeke.zzb);
        contentValues.put("url", zzeke.zzc);
        contentValues.put("event_state", Integer.valueOf(zzeke.zzd - 1));
        sQLiteDatabase.insert("offline_buffered_pings", (String) null, contentValues);
        zzt.zzp();
        zzbr zzw = zzs.zzw(this.zza);
        if (zzw != null) {
            try {
                zzw.zze(ObjectWrapper.wrap(this.zza));
            } catch (RemoteException e2) {
                zze.zzb("Failed to schedule offline ping sender.", e2);
            }
        }
        return null;
    }

    public final void zzc(String str) {
        zze(new zzejz(this, str));
    }

    public final void zzd(zzeke zzeke) {
        zze(new zzejx(this, zzeke));
    }

    /* access modifiers changed from: package-private */
    public final void zze(zzfmm zzfmm) {
        zzger.zzr(this.zzb.zzb(new zzejv(this)), new zzekb(this, zzfmm), this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final void zzg(SQLiteDatabase sQLiteDatabase, zzcht zzcht, String str) {
        this.zzb.execute(new zzejw(sQLiteDatabase, str, zzcht));
    }

    public final void zzh(zzcht zzcht, String str) {
        zze(new zzeka(this, zzcht, str));
    }
}
