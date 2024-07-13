package com.yandex.metrica.impl.ob;

import android.webkit.WebView;
import java.util.concurrent.CountDownLatch;

class Gl implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Il f4057a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WebView f4058b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CountDownLatch f4059c;

    Gl(Hl hl, Il il, WebView webView, CountDownLatch countDownLatch) {
        this.f4057a = il;
        this.f4058b = webView;
        this.f4059c = countDownLatch;
    }

    public void run() {
        try {
            this.f4057a.f4286h = this.f4058b.getUrl();
            this.f4057a.i = this.f4058b.getOriginalUrl();
            this.f4059c.countDown();
        } catch (Throwable unused) {
        }
    }
}
