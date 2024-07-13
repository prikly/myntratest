package com.criteo.publisher.j0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.criteo.publisher.CriteoInterstitialActivity;
import com.criteo.publisher.a0.b;
import com.criteo.publisher.m0.d;
import com.criteo.publisher.n0.i;

/* compiled from: InterstitialActivityHelper */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2555a;

    /* renamed from: b  reason: collision with root package name */
    private final b f2556b;

    public a(Context context, b bVar) {
        this.f2555a = context;
        this.f2556b = bVar;
    }

    public boolean b() {
        if (this.f2555a.getPackageManager().resolveActivity(a(), 65536) == null || this.f2555a.getResources().getIdentifier("activity_criteo_interstitial", "layout", this.f2555a.getPackageName()) == 0) {
            return false;
        }
        return true;
    }

    public void a(String str, d dVar) {
        if (b()) {
            i a2 = a(dVar);
            ComponentName a3 = this.f2556b.a();
            Intent a4 = a();
            a4.setFlags(268435456);
            a4.putExtra("webviewdata", str);
            a4.putExtra("resultreceiver", a2);
            a4.putExtra("callingactivity", a3);
            this.f2555a.startActivity(a4);
        }
    }

    private Intent a() {
        return new Intent(this.f2555a, CriteoInterstitialActivity.class);
    }

    /* access modifiers changed from: package-private */
    public i a(d dVar) {
        return new i(new Handler(Looper.getMainLooper()), dVar);
    }
}
