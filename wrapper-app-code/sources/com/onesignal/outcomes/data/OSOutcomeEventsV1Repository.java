package com.onesignal.outcomes.data;

import com.onesignal.OSLogger;
import com.onesignal.OSOutcomeEvent;
import com.onesignal.OneSignalApiResponseHandler;
import com.onesignal.influence.domain.OSInfluenceType;
import com.onesignal.outcomes.OSOutcomeConstants;
import com.onesignal.outcomes.domain.OSOutcomeEventParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J(\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J(\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J(\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¨\u0006\u0018"}, d2 = {"Lcom/onesignal/outcomes/data/OSOutcomeEventsV1Repository;", "Lcom/onesignal/outcomes/data/OSOutcomeEventsRepository;", "logger", "Lcom/onesignal/OSLogger;", "outcomeEventsCache", "Lcom/onesignal/outcomes/data/OSOutcomeEventsCache;", "outcomeEventsService", "Lcom/onesignal/outcomes/data/OutcomeEventsService;", "(Lcom/onesignal/OSLogger;Lcom/onesignal/outcomes/data/OSOutcomeEventsCache;Lcom/onesignal/outcomes/data/OutcomeEventsService;)V", "requestMeasureDirectOutcomeEvent", "", "appId", "", "deviceType", "", "event", "Lcom/onesignal/OSOutcomeEvent;", "responseHandler", "Lcom/onesignal/OneSignalApiResponseHandler;", "requestMeasureIndirectOutcomeEvent", "requestMeasureOutcomeEvent", "eventParams", "Lcom/onesignal/outcomes/domain/OSOutcomeEventParams;", "requestMeasureUnattributedOutcomeEvent", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: OSOutcomeEventsV1Repository.kt */
public final class OSOutcomeEventsV1Repository extends OSOutcomeEventsRepository {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OSInfluenceType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[OSInfluenceType.DIRECT.ordinal()] = 1;
            $EnumSwitchMapping$0[OSInfluenceType.INDIRECT.ordinal()] = 2;
            $EnumSwitchMapping$0[OSInfluenceType.UNATTRIBUTED.ordinal()] = 3;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OSOutcomeEventsV1Repository(OSLogger oSLogger, OSOutcomeEventsCache oSOutcomeEventsCache, OutcomeEventsService outcomeEventsService) {
        super(oSLogger, oSOutcomeEventsCache, outcomeEventsService);
        Intrinsics.checkNotNullParameter(oSLogger, "logger");
        Intrinsics.checkNotNullParameter(oSOutcomeEventsCache, "outcomeEventsCache");
        Intrinsics.checkNotNullParameter(outcomeEventsService, "outcomeEventsService");
    }

    public void requestMeasureOutcomeEvent(String str, int i, OSOutcomeEventParams oSOutcomeEventParams, OneSignalApiResponseHandler oneSignalApiResponseHandler) {
        Intrinsics.checkNotNullParameter(str, "appId");
        Intrinsics.checkNotNullParameter(oSOutcomeEventParams, "eventParams");
        Intrinsics.checkNotNullParameter(oneSignalApiResponseHandler, "responseHandler");
        OSOutcomeEvent fromOutcomeEventParamsV2toOutcomeEventV1 = OSOutcomeEvent.fromOutcomeEventParamsV2toOutcomeEventV1(oSOutcomeEventParams);
        Intrinsics.checkNotNullExpressionValue(fromOutcomeEventParamsV2toOutcomeEventV1, "event");
        OSInfluenceType session = fromOutcomeEventParamsV2toOutcomeEventV1.getSession();
        if (session != null) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[session.ordinal()];
            if (i2 == 1) {
                requestMeasureDirectOutcomeEvent(str, i, fromOutcomeEventParamsV2toOutcomeEventV1, oneSignalApiResponseHandler);
            } else if (i2 == 2) {
                requestMeasureIndirectOutcomeEvent(str, i, fromOutcomeEventParamsV2toOutcomeEventV1, oneSignalApiResponseHandler);
            } else if (i2 == 3) {
                requestMeasureUnattributedOutcomeEvent(str, i, fromOutcomeEventParamsV2toOutcomeEventV1, oneSignalApiResponseHandler);
            }
        }
    }

    private final void requestMeasureDirectOutcomeEvent(String str, int i, OSOutcomeEvent oSOutcomeEvent, OneSignalApiResponseHandler oneSignalApiResponseHandler) {
        try {
            JSONObject put = oSOutcomeEvent.toJSONObjectForMeasure().put(OSOutcomeConstants.APP_ID, str).put(OSOutcomeConstants.DEVICE_TYPE, i).put("direct", true);
            OutcomeEventsService outcomeEventsService = getOutcomeEventsService();
            Intrinsics.checkNotNullExpressionValue(put, "jsonObject");
            outcomeEventsService.sendOutcomeEvent(put, oneSignalApiResponseHandler);
        } catch (JSONException e2) {
            getLogger().error("Generating direct outcome:JSON Failed.", e2);
        }
    }

    private final void requestMeasureIndirectOutcomeEvent(String str, int i, OSOutcomeEvent oSOutcomeEvent, OneSignalApiResponseHandler oneSignalApiResponseHandler) {
        try {
            JSONObject put = oSOutcomeEvent.toJSONObjectForMeasure().put(OSOutcomeConstants.APP_ID, str).put(OSOutcomeConstants.DEVICE_TYPE, i).put("direct", false);
            OutcomeEventsService outcomeEventsService = getOutcomeEventsService();
            Intrinsics.checkNotNullExpressionValue(put, "jsonObject");
            outcomeEventsService.sendOutcomeEvent(put, oneSignalApiResponseHandler);
        } catch (JSONException e2) {
            getLogger().error("Generating indirect outcome:JSON Failed.", e2);
        }
    }

    private final void requestMeasureUnattributedOutcomeEvent(String str, int i, OSOutcomeEvent oSOutcomeEvent, OneSignalApiResponseHandler oneSignalApiResponseHandler) {
        try {
            JSONObject put = oSOutcomeEvent.toJSONObjectForMeasure().put(OSOutcomeConstants.APP_ID, str).put(OSOutcomeConstants.DEVICE_TYPE, i);
            OutcomeEventsService outcomeEventsService = getOutcomeEventsService();
            Intrinsics.checkNotNullExpressionValue(put, "jsonObject");
            outcomeEventsService.sendOutcomeEvent(put, oneSignalApiResponseHandler);
        } catch (JSONException e2) {
            getLogger().error("Generating unattributed outcome:JSON Failed.", e2);
        }
    }
}
