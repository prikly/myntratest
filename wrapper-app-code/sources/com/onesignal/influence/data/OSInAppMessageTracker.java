package com.onesignal.influence.data;

import com.onesignal.OSLogger;
import com.onesignal.OSTime;
import com.onesignal.influence.OSInfluenceConstants;
import com.onesignal.influence.domain.OSInfluence;
import com.onesignal.influence.domain.OSInfluenceChannel;
import com.onesignal.influence.domain.OSInfluenceType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u001cH\u0016J\u0012\u0010\"\u001a\u00020\u00182\b\u0010#\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010$\u001a\u00020\u001cH\u0016J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u0018H\u0016R\u0014\u0010\t\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\fR\u0014\u0010\u0017\u001a\u00020\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006'"}, d2 = {"Lcom/onesignal/influence/data/OSInAppMessageTracker;", "Lcom/onesignal/influence/data/OSChannelTracker;", "dataRepository", "Lcom/onesignal/influence/data/OSInfluenceDataRepository;", "logger", "Lcom/onesignal/OSLogger;", "timeProvider", "Lcom/onesignal/OSTime;", "(Lcom/onesignal/influence/data/OSInfluenceDataRepository;Lcom/onesignal/OSLogger;Lcom/onesignal/OSTime;)V", "channelLimit", "", "getChannelLimit", "()I", "channelType", "Lcom/onesignal/influence/domain/OSInfluenceChannel;", "getChannelType", "()Lcom/onesignal/influence/domain/OSInfluenceChannel;", "idTag", "", "getIdTag", "()Ljava/lang/String;", "indirectAttributionWindow", "getIndirectAttributionWindow", "lastChannelObjects", "Lorg/json/JSONArray;", "getLastChannelObjects", "()Lorg/json/JSONArray;", "addSessionData", "", "jsonObject", "Lorg/json/JSONObject;", "influence", "Lcom/onesignal/influence/domain/OSInfluence;", "cacheState", "getLastChannelObjectsReceivedByNewId", "id", "initInfluencedTypeFromCache", "saveChannelObjects", "channelObjects", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: OSInAppMessageTracker.kt */
public final class OSInAppMessageTracker extends OSChannelTracker {
    public void addSessionData(JSONObject jSONObject, OSInfluence oSInfluence) {
        Intrinsics.checkNotNullParameter(jSONObject, "jsonObject");
        Intrinsics.checkNotNullParameter(oSInfluence, "influence");
    }

    public String getIdTag() {
        return OSInfluenceConstants.IAM_ID_TAG;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OSInAppMessageTracker(OSInfluenceDataRepository oSInfluenceDataRepository, OSLogger oSLogger, OSTime oSTime) {
        super(oSInfluenceDataRepository, oSLogger, oSTime);
        Intrinsics.checkNotNullParameter(oSInfluenceDataRepository, "dataRepository");
        Intrinsics.checkNotNullParameter(oSLogger, "logger");
        Intrinsics.checkNotNullParameter(oSTime, "timeProvider");
    }

    public OSInfluenceChannel getChannelType() {
        return OSInfluenceChannel.IAM;
    }

    public JSONArray getLastChannelObjectsReceivedByNewId(String str) {
        try {
            JSONArray lastChannelObjects = getLastChannelObjects();
            try {
                JSONArray jSONArray = new JSONArray();
                int length = lastChannelObjects.length();
                for (int i = 0; i < length; i++) {
                    if (!Intrinsics.areEqual((Object) str, (Object) lastChannelObjects.getJSONObject(i).getString(getIdTag()))) {
                        jSONArray.put(lastChannelObjects.getJSONObject(i));
                    }
                }
                return jSONArray;
            } catch (JSONException e2) {
                getLogger().error("Generating tracker lastChannelObjectReceived get JSONObject ", e2);
                return lastChannelObjects;
            }
        } catch (JSONException e3) {
            getLogger().error("Generating IAM tracker getLastChannelObjects JSONObject ", e3);
            return new JSONArray();
        }
    }

    public JSONArray getLastChannelObjects() throws JSONException {
        return getDataRepository().getLastIAMsReceivedData();
    }

    public int getChannelLimit() {
        return getDataRepository().getIamLimit();
    }

    public int getIndirectAttributionWindow() {
        return getDataRepository().getIamIndirectAttributionWindow();
    }

    public void saveChannelObjects(JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "channelObjects");
        getDataRepository().saveIAMs(jSONArray);
    }

    public void initInfluencedTypeFromCache() {
        OSInfluenceType iamCachedInfluenceType = getDataRepository().getIamCachedInfluenceType();
        if (iamCachedInfluenceType.isIndirect()) {
            setIndirectIds(getLastReceivedIds());
        }
        Unit unit = Unit.INSTANCE;
        setInfluenceType(iamCachedInfluenceType);
        OSLogger logger = getLogger();
        logger.debug("OneSignal InAppMessageTracker initInfluencedTypeFromCache: " + this);
    }

    public void cacheState() {
        OSInfluenceType influenceType = getInfluenceType();
        if (influenceType == null) {
            influenceType = OSInfluenceType.UNATTRIBUTED;
        }
        OSInfluenceDataRepository dataRepository = getDataRepository();
        if (influenceType == OSInfluenceType.DIRECT) {
            influenceType = OSInfluenceType.INDIRECT;
        }
        dataRepository.cacheIAMInfluenceType(influenceType);
    }
}
