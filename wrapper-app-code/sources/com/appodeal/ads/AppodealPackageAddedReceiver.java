package com.appodeal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.appodeal.ads.utils.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\n"}, d2 = {"Lcom/appodeal/ads/AppodealPackageAddedReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "register", "apd_core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AppodealPackageAddedReceiver extends BroadcastReceiver {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045 A[Catch:{ all -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r8, android.content.Intent r9) {
        /*
            r7 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "intent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            boolean r0 = com.appodeal.ads.q4.o()     // Catch:{ all -> 0x004b }
            if (r0 != 0) goto L_0x004f
            java.lang.String r0 = r9.getAction()     // Catch:{ all -> 0x004b }
            java.lang.String r1 = "android.intent.action.PACKAGE_ADDED"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x004f
            java.lang.String r1 = r9.getDataString()     // Catch:{ all -> 0x004b }
            if (r1 != 0) goto L_0x0023
            goto L_0x0033
        L_0x0023:
            java.lang.String r9 = ":"
            java.lang.String[] r2 = new java.lang.String[]{r9}     // Catch:{ all -> 0x004b }
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            java.util.List r9 = kotlin.text.StringsKt.split$default(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x004b }
            if (r9 != 0) goto L_0x0035
        L_0x0033:
            r9 = 0
            goto L_0x003c
        L_0x0035:
            r0 = 1
            java.lang.Object r9 = kotlin.collections.CollectionsKt.getOrNull(r9, r0)     // Catch:{ all -> 0x004b }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x004b }
        L_0x003c:
            if (r9 != 0) goto L_0x003f
            return
        L_0x003f:
            boolean r8 = com.appodeal.ads.utils.r.a(r8, r9)     // Catch:{ all -> 0x004b }
            if (r8 == 0) goto L_0x004f
            com.appodeal.ads.k0 r8 = com.appodeal.ads.k0.f16502a     // Catch:{ all -> 0x004b }
            com.appodeal.ads.k0.a((java.lang.String) r9)     // Catch:{ all -> 0x004b }
            goto L_0x004f
        L_0x004b:
            r8 = move-exception
            com.appodeal.ads.utils.Log.log(r8)
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.AppodealPackageAddedReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    public final void register(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                intentFilter.addDataScheme("package");
                context.registerReceiver(this, intentFilter);
            } catch (Throwable th) {
                Log.log(th);
            }
        }
    }
}
