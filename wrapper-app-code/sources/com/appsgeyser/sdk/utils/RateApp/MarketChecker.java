package com.appsgeyser.sdk.utils.RateApp;

import android.os.Handler;
import android.os.Looper;

public class MarketChecker {
    private static MarketChecker instance;
    private final String GP_URL = "https://play.google.com/store/apps/details?id=";
    private final String LOG_TAG = "MarketChecker";
    private final Runnable checkJob = new Runnable() {
        public final void run() {
            MarketChecker.this.lambda$new$0$MarketChecker();
        }
    };
    /* access modifiers changed from: private */
    public OnReceiveListener listener;
    private String packageId;

    public interface OnReceiveListener {
        void onReceive(boolean z);
    }

    private MarketChecker() {
    }

    public static MarketChecker getInstance() {
        MarketChecker marketChecker = instance;
        if (marketChecker != null) {
            return marketChecker;
        }
        return new MarketChecker();
    }

    public /* synthetic */ void lambda$new$0$MarketChecker() {
        final int resultCode = getResultCode();
        if (this.listener != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    MarketChecker.this.listener.onReceive(resultCode == 200);
                }
            });
        }
    }

    public void chekIsAppOnMarket(String str, OnReceiveListener onReceiveListener) {
        this.listener = onReceiveListener;
        this.packageId = str;
        new Thread(this.checkJob).start();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        if (r2 != null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (r2 != null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
        r2.disconnect();
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int getResultCode() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x0034, all -> 0x0032 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0034, all -> 0x0032 }
            r3.<init>()     // Catch:{ Exception -> 0x0034, all -> 0x0032 }
            java.lang.String r4 = "https://play.google.com/store/apps/details?id="
            r3.append(r4)     // Catch:{ Exception -> 0x0034, all -> 0x0032 }
            java.lang.String r4 = r6.packageId     // Catch:{ Exception -> 0x0034, all -> 0x0032 }
            r3.append(r4)     // Catch:{ Exception -> 0x0034, all -> 0x0032 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0034, all -> 0x0032 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0034, all -> 0x0032 }
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ Exception -> 0x0034, all -> 0x0032 }
            javax.net.ssl.HttpsURLConnection r2 = (javax.net.ssl.HttpsURLConnection) r2     // Catch:{ Exception -> 0x0034, all -> 0x0032 }
            r2.setUseCaches(r0)     // Catch:{ Exception -> 0x0030 }
            r2.connect()     // Catch:{ Exception -> 0x0030 }
            int r0 = r2.getResponseCode()     // Catch:{ Exception -> 0x0030 }
            if (r2 == 0) goto L_0x0045
        L_0x002c:
            r2.disconnect()
            goto L_0x0045
        L_0x0030:
            r1 = move-exception
            goto L_0x0038
        L_0x0032:
            r0 = move-exception
            goto L_0x0048
        L_0x0034:
            r2 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
        L_0x0038:
            r1.printStackTrace()     // Catch:{ all -> 0x0046 }
            java.lang.String r3 = "MarketChecker"
            java.lang.String r4 = "Error while connecting with Google Play"
            android.util.Log.e(r3, r4, r1)     // Catch:{ all -> 0x0046 }
            if (r2 == 0) goto L_0x0045
            goto L_0x002c
        L_0x0045:
            return r0
        L_0x0046:
            r0 = move-exception
            r1 = r2
        L_0x0048:
            if (r1 == 0) goto L_0x004d
            r1.disconnect()
        L_0x004d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsgeyser.sdk.utils.RateApp.MarketChecker.getResultCode():int");
    }
}
