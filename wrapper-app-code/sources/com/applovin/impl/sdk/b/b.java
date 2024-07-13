package com.applovin.impl.sdk.b;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.n;
import com.applovin.sdk.AppLovinSdkUtils;

public class b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final n f15316a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Activity f15317b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public AlertDialog f15318c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public a f15319d;

    public interface a {
        void a();

        void b();
    }

    public b(Activity activity, n nVar) {
        this.f15316a = nVar;
        this.f15317b = activity;
    }

    public void a() {
        this.f15317b.runOnUiThread(new Runnable() {
            public void run() {
                if (b.this.f15318c != null) {
                    b.this.f15318c.dismiss();
                }
            }
        });
    }

    public void a(final e eVar, final Runnable runnable) {
        this.f15317b.runOnUiThread(new Runnable() {
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(b.this.f15317b);
                builder.setTitle(eVar.an());
                String ao = eVar.ao();
                if (AppLovinSdkUtils.isValidString(ao)) {
                    builder.setMessage(ao);
                }
                builder.setPositiveButton(eVar.ap(), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                });
                builder.setCancelable(false);
                AlertDialog unused = b.this.f15318c = builder.show();
            }
        });
    }

    public void a(a aVar) {
        this.f15319d = aVar;
    }

    public void b() {
        this.f15317b.runOnUiThread(new Runnable() {
            public void run() {
                AlertDialog unused = b.this.f15318c = new AlertDialog.Builder(b.this.f15317b).setTitle((CharSequence) b.this.f15316a.a(com.applovin.impl.sdk.c.b.bE)).setMessage((CharSequence) b.this.f15316a.a(com.applovin.impl.sdk.c.b.bF)).setCancelable(false).setPositiveButton((CharSequence) b.this.f15316a.a(com.applovin.impl.sdk.c.b.bH), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        b.this.f15319d.a();
                    }
                }).setNegativeButton((CharSequence) b.this.f15316a.a(com.applovin.impl.sdk.c.b.bG), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        b.this.f15319d.b();
                    }
                }).show();
            }
        });
    }

    public boolean c() {
        AlertDialog alertDialog = this.f15318c;
        if (alertDialog != null) {
            return alertDialog.isShowing();
        }
        return false;
    }
}
