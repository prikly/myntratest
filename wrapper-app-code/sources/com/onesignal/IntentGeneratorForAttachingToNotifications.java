package com.onesignal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\rJ\b\u0010\u0012\u001a\u00020\u000fH\u0003J\b\u0010\u0013\u001a\u00020\u000fH\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bX\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/onesignal/IntentGeneratorForAttachingToNotifications;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "notificationOpenedClassAndroid22AndOlder", "Ljava/lang/Class;", "notificationOpenedClassAndroid23Plus", "getNewActionPendingIntent", "Landroid/app/PendingIntent;", "requestCode", "", "oneSignalIntent", "Landroid/content/Intent;", "getNewBaseIntent", "notificationId", "getNewBaseIntentAndroidAPI22AndOlder", "getNewBaseIntentAndroidAPI23Plus", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: IntentGeneratorForAttachingToNotifications.kt */
public final class IntentGeneratorForAttachingToNotifications {
    private final Context context;
    private final Class<?> notificationOpenedClassAndroid22AndOlder = NotificationOpenedReceiverAndroid22AndOlder.class;
    private final Class<?> notificationOpenedClassAndroid23Plus = NotificationOpenedReceiver.class;

    public IntentGeneratorForAttachingToNotifications(Context context2) {
        Intrinsics.checkNotNullParameter(context2, "context");
        this.context = context2;
    }

    public final Context getContext() {
        return this.context;
    }

    public final Intent getNewBaseIntent(int i) {
        Intent intent;
        if (Build.VERSION.SDK_INT >= 23) {
            intent = getNewBaseIntentAndroidAPI23Plus();
        } else {
            intent = getNewBaseIntentAndroidAPI22AndOlder();
        }
        Intent addFlags = intent.putExtra(GenerateNotification.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, i).addFlags(603979776);
        Intrinsics.checkNotNullExpressionValue(addFlags, "intent\n            .putE…Y_CLEAR_TOP\n            )");
        return addFlags;
    }

    private final Intent getNewBaseIntentAndroidAPI23Plus() {
        return new Intent(this.context, this.notificationOpenedClassAndroid23Plus);
    }

    private final Intent getNewBaseIntentAndroidAPI22AndOlder() {
        Intent intent = new Intent(this.context, this.notificationOpenedClassAndroid22AndOlder);
        intent.addFlags(403177472);
        return intent;
    }

    public final PendingIntent getNewActionPendingIntent(int i, Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "oneSignalIntent");
        return PendingIntent.getActivity(this.context, i, intent, 201326592);
    }
}
