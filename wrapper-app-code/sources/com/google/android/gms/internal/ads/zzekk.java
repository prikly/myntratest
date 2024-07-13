package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.onesignal.OneSignalDbContract;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzekk extends zzbzi {
    private final Context zza;
    private final zzdzh zzb;
    private final zzcht zzc;
    private final zzekc zzd;
    private final zzfnt zze;

    public zzekk(Context context, zzekc zzekc, zzcht zzcht, zzdzh zzdzh, zzfnt zzfnt) {
        this.zza = context;
        this.zzb = zzdzh;
        this.zzc = zzcht;
        this.zzd = zzekc;
        this.zze = zzfnt;
    }

    public static void zzc(Context context, zzdzh zzdzh, zzfnt zzfnt, zzekc zzekc, String str, String str2) {
        zzd(context, zzdzh, zzfnt, zzekc, str, str2, new HashMap());
    }

    public static void zzd(Context context, zzdzh zzdzh, zzfnt zzfnt, zzekc zzekc, String str, String str2, Map map) {
        String str3;
        String str4 = "offline";
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzhK)).booleanValue()) {
            zzfns zzb2 = zzfns.zzb(str2);
            zzb2.zza("gqi", str);
            if (true == zzt.zzo().zzx(context)) {
                str4 = "online";
            }
            zzb2.zza("device_connectivity", str4);
            zzb2.zza("event_timestamp", String.valueOf(zzt.zzB().currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zzb2.zza((String) entry.getKey(), (String) entry.getValue());
            }
            str3 = zzfnt.zza(zzb2);
        } else {
            zzdzg zza2 = zzdzh.zza();
            zza2.zzb("gqi", str);
            zza2.zzb("action", str2);
            if (true == zzt.zzo().zzx(context)) {
                str4 = "online";
            }
            zza2.zzb("device_connectivity", str4);
            zza2.zzb("event_timestamp", String.valueOf(zzt.zzB().currentTimeMillis()));
            for (Map.Entry entry2 : map.entrySet()) {
                zza2.zzb((String) entry2.getKey(), (String) entry2.getValue());
            }
            str3 = zza2.zzf();
        }
        zzekc.zzd(new zzeke(zzt.zzB().currentTimeMillis(), str, str3, 2));
    }

    public static void zzh(Activity activity, zzl zzl, zzbr zzbr, zzekc zzekc, zzdzh zzdzh, zzfnt zzfnt, String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        zzt.zzp();
        AlertDialog.Builder zzG = zzs.zzG(activity);
        Resources zzd2 = zzt.zzo().zzd();
        if (zzd2 == null) {
            str3 = "Open ad when you're back online.";
        } else {
            str3 = zzd2.getString(R.string.offline_opt_in_title);
        }
        AlertDialog.Builder title = zzG.setTitle(str3);
        if (zzd2 == null) {
            str4 = "We'll send you a notification with a link to the advertiser site.";
        } else {
            str4 = zzd2.getString(R.string.offline_opt_in_message);
        }
        AlertDialog.Builder message = title.setMessage(str4);
        if (zzd2 == null) {
            str5 = "OK";
        } else {
            str5 = zzd2.getString(R.string.offline_opt_in_confirm);
        }
        AlertDialog.Builder positiveButton = message.setPositiveButton(str5, new zzekg(zzdzh, activity, zzfnt, zzekc, str, zzbr, str2, zzd2, zzl));
        if (zzd2 == null) {
            str6 = "No thanks";
        } else {
            str6 = zzd2.getString(R.string.offline_opt_in_decline);
        }
        positiveButton.setNegativeButton(str6, new zzekh(zzekc, str, zzdzh, activity, zzfnt, zzl)).setOnCancelListener(new zzeki(zzekc, str, zzdzh, activity, zzfnt, zzl));
        zzG.create().show();
    }

    private final void zzi(String str, String str2, Map map) {
        zzd(this.zza, this.zzb, this.zze, this.zzd, str, str2, map);
    }

    private static final PendingIntent zzj(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setClassName(context, AdService.CLASS_NAME);
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        return zzfvk.zza(context, 0, intent, zzfvk.zza | 1073741824, 0);
    }

    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            boolean zzx = zzt.zzo().zzx(this.zza);
            HashMap hashMap = new HashMap();
            char c2 = 2;
            if (stringExtra.equals("offline_notification_clicked")) {
                hashMap.put("offline_notification_action", "offline_notification_clicked");
                if (true == zzx) {
                    c2 = 1;
                }
                hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Context context = this.zza;
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    context.startActivity(launchIntentForPackage);
                    hashMap.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    hashMap.put("olaa", "olaf");
                }
            } else {
                hashMap.put("offline_notification_action", "offline_notification_dismissed");
            }
            zzi(stringExtra2, "offline_notification_action", hashMap);
            try {
                SQLiteDatabase writableDatabase = this.zzd.getWritableDatabase();
                if (c2 == 1) {
                    this.zzd.zzg(writableDatabase, this.zzc, stringExtra2);
                } else {
                    zzekc.zzi(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e2) {
                zze.zzg("Failed to get writable offline buffering database: ".concat(e2.toString()));
            }
        }
    }

    public final void zzf() {
        this.zzd.zze(new zzejy(this.zzc));
    }

    public final void zzg(IObjectWrapper iObjectWrapper, String str, String str2) {
        String str3;
        String str4;
        String str5;
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzt.zzq().zzg(context, "offline_notification_channel", "AdMob Offline Notifications");
        PendingIntent zzj = zzj(context, "offline_notification_clicked", str2, str);
        PendingIntent zzj2 = zzj(context, "offline_notification_dismissed", str2, str);
        Resources zzd2 = zzt.zzo().zzd();
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "offline_notification_channel");
        if (zzd2 == null) {
            str3 = "View the ad you saved when you were offline";
        } else {
            str3 = zzd2.getString(R.string.offline_notification_title);
        }
        NotificationCompat.Builder contentTitle = builder.setContentTitle(str3);
        if (zzd2 == null) {
            str4 = "Tap to open ad";
        } else {
            str4 = zzd2.getString(R.string.offline_notification_text);
        }
        NotificationCompat.Builder smallIcon = contentTitle.setContentText(str4).setAutoCancel(true).setDeleteIntent(zzj2).setContentIntent(zzj).setSmallIcon(context.getApplicationInfo().icon);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME);
        HashMap hashMap = new HashMap();
        try {
            notificationManager.notify(str2, 54321, smallIcon.build());
            str5 = "offline_notification_impression";
        } catch (IllegalArgumentException e2) {
            hashMap.put("notification_not_shown_reason", e2.getMessage());
            str5 = "offline_notification_failed";
        }
        zzi(str2, str5, hashMap);
    }
}
