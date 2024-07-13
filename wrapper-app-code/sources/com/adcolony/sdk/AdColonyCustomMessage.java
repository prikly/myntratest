package com.adcolony.sdk;

import com.onesignal.OneSignalDbContract;

public class AdColonyCustomMessage {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public String f9828a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public String f9829b;

    class a implements Runnable {
        a() {
        }

        public void run() {
            AdColony.b();
            f1 b2 = c0.b();
            c0.a(b2, "type", AdColonyCustomMessage.this.f9828a);
            c0.a(b2, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, AdColonyCustomMessage.this.f9829b);
            new h0("CustomMessage.native_send", 1, b2).c();
        }
    }

    public AdColonyCustomMessage(String str, String str2) {
        if (z0.e(str) || z0.e(str2)) {
            this.f9828a = str;
            this.f9829b = str2;
        }
    }

    public String getMessage() {
        return this.f9829b;
    }

    public String getType() {
        return this.f9828a;
    }

    public void send() {
        AdColony.a((Runnable) new a());
    }

    public AdColonyCustomMessage set(String str, String str2) {
        this.f9828a = str;
        this.f9829b = str2;
        return this;
    }
}
