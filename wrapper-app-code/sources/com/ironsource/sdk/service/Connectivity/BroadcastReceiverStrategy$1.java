package com.ironsource.sdk.service.Connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.ironsource.d.a;
import org.json.JSONObject;

class BroadcastReceiverStrategy$1 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ a f9589a;

    BroadcastReceiverStrategy$1(a aVar) {
        this.f9589a = aVar;
    }

    public void onReceive(Context context, Intent intent) {
        String a2 = a.a(context);
        if (a2.equals("none")) {
            this.f9589a.f9590a.a();
            return;
        }
        d dVar = this.f9589a.f9590a;
        new JSONObject();
        dVar.a(a2);
    }
}
