package com.ironsource.sdk.service.Connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.util.Log;
import org.json.JSONObject;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    final d f9590a;

    /* renamed from: b  reason: collision with root package name */
    private BroadcastReceiver f9591b = new BroadcastReceiverStrategy$1(this);

    public a(d dVar) {
        this.f9590a = dVar;
    }

    public final void a() {
        this.f9591b = null;
    }

    public final void a(Context context) {
        try {
            context.registerReceiver(this.f9591b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void b(Context context) {
        try {
            context.unregisterReceiver(this.f9591b);
        } catch (IllegalArgumentException unused) {
        } catch (Exception e2) {
            Log.e("ContentValues", "unregisterConnectionReceiver - " + e2);
        }
    }

    public final JSONObject c(Context context) {
        return new JSONObject();
    }
}
