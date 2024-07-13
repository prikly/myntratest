package com.onesignal.outcomes.domain;

import com.onesignal.outcomes.OSOutcomeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/onesignal/outcomes/domain/OSOutcomeSourceBody;", "", "notificationIds", "Lorg/json/JSONArray;", "inAppMessagesIds", "(Lorg/json/JSONArray;Lorg/json/JSONArray;)V", "getInAppMessagesIds", "()Lorg/json/JSONArray;", "setInAppMessagesIds", "(Lorg/json/JSONArray;)V", "getNotificationIds", "setNotificationIds", "toJSONObject", "Lorg/json/JSONObject;", "toString", "", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: OSOutcomeSourceBody.kt */
public final class OSOutcomeSourceBody {
    private JSONArray inAppMessagesIds;
    private JSONArray notificationIds;

    public OSOutcomeSourceBody() {
        this((JSONArray) null, (JSONArray) null, 3, (DefaultConstructorMarker) null);
    }

    public OSOutcomeSourceBody(JSONArray jSONArray) {
        this(jSONArray, (JSONArray) null, 2, (DefaultConstructorMarker) null);
    }

    public OSOutcomeSourceBody(JSONArray jSONArray, JSONArray jSONArray2) {
        this.notificationIds = jSONArray;
        this.inAppMessagesIds = jSONArray2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OSOutcomeSourceBody(JSONArray jSONArray, JSONArray jSONArray2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new JSONArray() : jSONArray, (i & 2) != 0 ? new JSONArray() : jSONArray2);
    }

    public final JSONArray getInAppMessagesIds() {
        return this.inAppMessagesIds;
    }

    public final JSONArray getNotificationIds() {
        return this.notificationIds;
    }

    public final void setInAppMessagesIds(JSONArray jSONArray) {
        this.inAppMessagesIds = jSONArray;
    }

    public final void setNotificationIds(JSONArray jSONArray) {
        this.notificationIds = jSONArray;
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject put = new JSONObject().put("notification_ids", this.notificationIds).put(OSOutcomeConstants.IAM_IDS, this.inAppMessagesIds);
        Intrinsics.checkNotNullExpressionValue(put, "JSONObject()\n        .pu…AM_IDS, inAppMessagesIds)");
        return put;
    }

    public String toString() {
        return "OSOutcomeSourceBody{notificationIds=" + this.notificationIds + ", inAppMessagesIds=" + this.inAppMessagesIds + '}';
    }
}
