package com.onesignal;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\n\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\n\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/onesignal/GenerateNotificationOpenIntent;", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "startApp", "", "(Landroid/content/Context;Landroid/content/Intent;Z)V", "getIntentAppOpen", "getIntentVisible", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: GenerateNotificationOpenIntent.kt */
public final class GenerateNotificationOpenIntent {
    private final Context context;
    private final Intent intent;
    private final boolean startApp;

    public GenerateNotificationOpenIntent(Context context2, Intent intent2, boolean z) {
        Intrinsics.checkNotNullParameter(context2, "context");
        this.context = context2;
        this.intent = intent2;
        this.startApp = z;
    }

    public final Intent getIntentVisible() {
        Intent intent2 = this.intent;
        if (intent2 != null) {
            return intent2;
        }
        return getIntentAppOpen();
    }

    private final Intent getIntentAppOpen() {
        Intent launchIntentForPackage;
        if (!this.startApp || (launchIntentForPackage = this.context.getPackageManager().getLaunchIntentForPackage(this.context.getPackageName())) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(launchIntentForPackage, "context.packageManager.g…           ?: return null");
        launchIntentForPackage.setPackage((String) null);
        launchIntentForPackage.setFlags(270532608);
        return launchIntentForPackage;
    }
}
