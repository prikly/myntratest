package com.adcolony.sdk;

import com.onesignal.OneSignalDbContract;

class m implements j0 {

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f10166a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f10167b;

        a(m mVar, String str, String str2) {
            this.f10166a = str;
            this.f10167b = str2;
        }

        public void run() {
            try {
                AdColonyCustomMessageListener adColonyCustomMessageListener = a.b().m().get(this.f10166a);
                if (adColonyCustomMessageListener != null) {
                    adColonyCustomMessageListener.onAdColonyCustomMessage(new AdColonyCustomMessage(this.f10166a, this.f10167b));
                }
            } catch (RuntimeException unused) {
            }
        }
    }

    m() {
        a.a("CustomMessage.controller_send", (j0) this);
    }

    public void a(h0 h0Var) {
        f1 a2 = h0Var.a();
        z0.b((Runnable) new a(this, c0.h(a2, "type"), c0.h(a2, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE)));
    }
}
