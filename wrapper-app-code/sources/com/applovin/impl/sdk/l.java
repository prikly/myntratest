package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.utils.i;
import com.applovin.impl.sdk.utils.p;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

class l implements AppLovinBroadcastManager.Receiver {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static AlertDialog f15568b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicBoolean f15569c = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final m f15570a;

    /* renamed from: d  reason: collision with root package name */
    private p f15571d;

    public interface a {
        void a();

        void b();
    }

    l(m mVar, n nVar) {
        this.f15570a = mVar;
        nVar.am().registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        nVar.am().registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public void a(long j, final n nVar, final a aVar) {
        if (j > 0) {
            AlertDialog alertDialog = f15568b;
            if (alertDialog == null || !alertDialog.isShowing()) {
                if (f15569c.getAndSet(true)) {
                    int i = (j > this.f15571d.a() ? 1 : (j == this.f15571d.a() ? 0 : -1));
                    nVar.D();
                    if (i < 0) {
                        if (v.a()) {
                            v D = nVar.D();
                            D.b("ConsentAlertManager", "Scheduling consent alert earlier (" + j + "ms) than remaining scheduled time (" + this.f15571d.a() + "ms)");
                        }
                        this.f15571d.d();
                    } else if (v.a()) {
                        v D2 = nVar.D();
                        D2.d("ConsentAlertManager", "Skip scheduling consent alert - one scheduled already with remaining time of " + this.f15571d.a() + " milliseconds");
                        return;
                    } else {
                        return;
                    }
                }
                nVar.D();
                if (v.a()) {
                    v D3 = nVar.D();
                    D3.b("ConsentAlertManager", "Scheduling consent alert for " + j + " milliseconds");
                }
                this.f15571d = p.a(j, nVar, new Runnable() {
                    public void run() {
                        String str;
                        v vVar;
                        if (l.this.f15570a.d()) {
                            nVar.D();
                            if (v.a()) {
                                nVar.D().e("ConsentAlertManager", "Consent dialog already showing, skip showing of consent alert");
                                return;
                            }
                            return;
                        }
                        Activity a2 = nVar.ai().a();
                        if (a2 == null || !i.a(nVar.P())) {
                            if (a2 == null) {
                                nVar.D();
                                if (v.a()) {
                                    vVar = nVar.D();
                                    str = "No parent Activity found - rescheduling consent alert...";
                                }
                                l.f15569c.set(false);
                                l.this.a(((Long) nVar.a(b.aO)).longValue(), nVar, aVar);
                                return;
                            }
                            nVar.D();
                            if (v.a()) {
                                vVar = nVar.D();
                                str = "No internet available - rescheduling consent alert...";
                            }
                            l.f15569c.set(false);
                            l.this.a(((Long) nVar.a(b.aO)).longValue(), nVar, aVar);
                            return;
                            vVar.e("ConsentAlertManager", str);
                            l.f15569c.set(false);
                            l.this.a(((Long) nVar.a(b.aO)).longValue(), nVar, aVar);
                            return;
                        }
                        AppLovinSdkUtils.runOnUiThread(new Runnable() {
                            public void run() {
                                AlertDialog unused = l.f15568b = new AlertDialog.Builder(nVar.ai().a()).setTitle((CharSequence) nVar.a(b.aP)).setMessage((CharSequence) nVar.a(b.aQ)).setCancelable(false).setPositiveButton((CharSequence) nVar.a(b.aR), new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        aVar.a();
                                        dialogInterface.dismiss();
                                        l.f15569c.set(false);
                                    }
                                }).setNegativeButton((CharSequence) nVar.a(b.aS), new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        aVar.b();
                                        dialogInterface.dismiss();
                                        l.f15569c.set(false);
                                        l.this.a(((Long) nVar.a(b.aN)).longValue(), nVar, aVar);
                                    }
                                }).create();
                                l.f15568b.show();
                            }
                        });
                    }
                });
            }
        }
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        if (this.f15571d != null) {
            String action = intent.getAction();
            if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
                this.f15571d.b();
            } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
                this.f15571d.c();
            }
        }
    }
}
