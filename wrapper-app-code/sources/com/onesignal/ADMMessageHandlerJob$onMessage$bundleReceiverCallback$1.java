package com.onesignal;

import android.content.Context;
import android.os.Bundle;
import com.onesignal.NotificationBundleProcessor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/onesignal/ADMMessageHandlerJob$onMessage$bundleReceiverCallback$1", "Lcom/onesignal/NotificationBundleProcessor$ProcessBundleReceiverCallback;", "onBundleProcessed", "", "processedResult", "Lcom/onesignal/NotificationBundleProcessor$ProcessedBundleResult;", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ADMMessageHandlerJob.kt */
public final class ADMMessageHandlerJob$onMessage$bundleReceiverCallback$1 implements NotificationBundleProcessor.ProcessBundleReceiverCallback {
    final /* synthetic */ Bundle $bundle;
    final /* synthetic */ Context $context;

    ADMMessageHandlerJob$onMessage$bundleReceiverCallback$1(Bundle bundle, Context context) {
        this.$bundle = bundle;
        this.$context = context;
    }

    public void onBundleProcessed(NotificationBundleProcessor.ProcessedBundleResult processedBundleResult) {
        if (processedBundleResult == null || !processedBundleResult.processed()) {
            JSONObject bundleAsJSONObject = NotificationBundleProcessor.bundleAsJSONObject(this.$bundle);
            Intrinsics.checkNotNullExpressionValue(bundleAsJSONObject, "NotificationBundleProces…undleAsJSONObject(bundle)");
            OSNotification oSNotification = new OSNotification(bundleAsJSONObject);
            OSNotificationGenerationJob oSNotificationGenerationJob = new OSNotificationGenerationJob(this.$context);
            oSNotificationGenerationJob.setJsonPayload(bundleAsJSONObject);
            oSNotificationGenerationJob.setContext(this.$context);
            oSNotificationGenerationJob.setNotification(oSNotification);
            NotificationBundleProcessor.processJobForDisplay(oSNotificationGenerationJob, true);
        }
    }
}
