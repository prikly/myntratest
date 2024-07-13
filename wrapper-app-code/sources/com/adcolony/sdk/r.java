package com.adcolony.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import com.adcolony.sdk.e0;
import com.onesignal.OneSignalDbContract;

class r {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public h0 f10255a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public AlertDialog f10256b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f10257c;

    class a implements j0 {
        a() {
        }

        public void a(h0 h0Var) {
            if (!a.c() || !(a.a() instanceof Activity)) {
                new e0.a().a("Missing Activity reference, can't build AlertDialog.").a(e0.i);
            } else if (c0.b(h0Var.a(), "on_resume")) {
                h0 unused = r.this.f10255a = h0Var;
            } else {
                r.this.a(h0Var);
            }
        }
    }

    class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h0 f10259a;

        b(h0 h0Var) {
            this.f10259a = h0Var;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AlertDialog unused = r.this.f10256b = null;
            dialogInterface.dismiss();
            f1 b2 = c0.b();
            c0.b(b2, "positive", true);
            boolean unused2 = r.this.f10257c = false;
            this.f10259a.a(b2).c();
        }
    }

    class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h0 f10261a;

        c(h0 h0Var) {
            this.f10261a = h0Var;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AlertDialog unused = r.this.f10256b = null;
            dialogInterface.dismiss();
            f1 b2 = c0.b();
            c0.b(b2, "positive", false);
            boolean unused2 = r.this.f10257c = false;
            this.f10261a.a(b2).c();
        }
    }

    class d implements DialogInterface.OnCancelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h0 f10263a;

        d(h0 h0Var) {
            this.f10263a = h0Var;
        }

        public void onCancel(DialogInterface dialogInterface) {
            AlertDialog unused = r.this.f10256b = null;
            boolean unused2 = r.this.f10257c = false;
            f1 b2 = c0.b();
            c0.b(b2, "positive", false);
            this.f10263a.a(b2).c();
        }
    }

    class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AlertDialog.Builder f10265a;

        e(AlertDialog.Builder builder) {
            this.f10265a = builder;
        }

        public void run() {
            boolean unused = r.this.f10257c = true;
            AlertDialog unused2 = r.this.f10256b = this.f10265a.show();
        }
    }

    r() {
        a.a("Alert.show", (j0) new a());
    }

    /* access modifiers changed from: package-private */
    public void c() {
        h0 h0Var = this.f10255a;
        if (h0Var != null) {
            a(h0Var);
            this.f10255a = null;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        return this.f10257c;
    }

    /* access modifiers changed from: private */
    public void a(h0 h0Var) {
        AlertDialog.Builder builder;
        Context a2 = a.a();
        if (a2 != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                builder = new AlertDialog.Builder(a2, 16974374);
            } else {
                builder = new AlertDialog.Builder(a2, 16974126);
            }
            f1 a3 = h0Var.a();
            String h2 = c0.h(a3, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
            String h3 = c0.h(a3, "title");
            String h4 = c0.h(a3, "positive");
            String h5 = c0.h(a3, "negative");
            builder.setMessage(h2);
            builder.setTitle(h3);
            builder.setPositiveButton(h4, new b(h0Var));
            if (!h5.equals("")) {
                builder.setNegativeButton(h5, new c(h0Var));
            }
            builder.setOnCancelListener(new d(h0Var));
            z0.b((Runnable) new e(builder));
        }
    }

    /* access modifiers changed from: package-private */
    public AlertDialog a() {
        return this.f10256b;
    }

    /* access modifiers changed from: package-private */
    public void a(AlertDialog alertDialog) {
        this.f10256b = alertDialog;
    }
}
