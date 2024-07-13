package com.onesignal.outcomes.data;

import com.onesignal.OSLogger;
import com.onesignal.OneSignalApiResponseHandler;
import com.onesignal.outcomes.OSOutcomeConstants;
import com.onesignal.outcomes.domain.OSOutcomeEventParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¨\u0006\u0013"}, d2 = {"Lcom/onesignal/outcomes/data/OSOutcomeEventsV2Repository;", "Lcom/onesignal/outcomes/data/OSOutcomeEventsRepository;", "logger", "Lcom/onesignal/OSLogger;", "outcomeEventsCache", "Lcom/onesignal/outcomes/data/OSOutcomeEventsCache;", "outcomeEventsService", "Lcom/onesignal/outcomes/data/OutcomeEventsService;", "(Lcom/onesignal/OSLogger;Lcom/onesignal/outcomes/data/OSOutcomeEventsCache;Lcom/onesignal/outcomes/data/OutcomeEventsService;)V", "requestMeasureOutcomeEvent", "", "appId", "", "deviceType", "", "event", "Lcom/onesignal/outcomes/domain/OSOutcomeEventParams;", "responseHandler", "Lcom/onesignal/OneSignalApiResponseHandler;", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: OSOutcomeEventsV2Repository.kt */
public final class OSOutcomeEventsV2Repository extends OSOutcomeEventsRepository {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OSOutcomeEventsV2Repository(OSLogger oSLogger, OSOutcomeEventsCache oSOutcomeEventsCache, OutcomeEventsService outcomeEventsService) {
        super(oSLogger, oSOutcomeEventsCache, outcomeEventsService);
        Intrinsics.checkNotNullParameter(oSLogger, "logger");
        Intrinsics.checkNotNullParameter(oSOutcomeEventsCache, "outcomeEventsCache");
        Intrinsics.checkNotNullParameter(outcomeEventsService, "outcomeEventsService");
    }

    public void requestMeasureOutcomeEvent(String str, int i, OSOutcomeEventParams oSOutcomeEventParams, OneSignalApiResponseHandler oneSignalApiResponseHandler) {
        Intrinsics.checkNotNullParameter(str, "appId");
        Intrinsics.checkNotNullParameter(oSOutcomeEventParams, "event");
        Intrinsics.checkNotNullParameter(oneSignalApiResponseHandler, "responseHandler");
        try {
            JSONObject put = oSOutcomeEventParams.toJSONObject().put(OSOutcomeConstants.APP_ID, str).put(OSOutcomeConstants.DEVICE_TYPE, i);
            OutcomeEventsService outcomeEventsService = getOutcomeEventsService();
            Intrinsics.checkNotNullExpressionValue(put, "jsonObject");
            outcomeEventsService.sendOutcomeEvent(put, oneSignalApiResponseHandler);
        } catch (JSONException e2) {
            getLogger().error("Generating indirect outcome:JSON Failed.", e2);
        }
    }
}
