package com.onesignal;

import org.json.JSONObject;

public class OSNotificationAction {
    private final String actionId;
    private final ActionType type;

    public enum ActionType {
        Opened,
        ActionTaken
    }

    public OSNotificationAction(ActionType actionType, String str) {
        this.type = actionType;
        this.actionId = str;
    }

    public ActionType getType() {
        return this.type;
    }

    public String getActionId() {
        return this.actionId;
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", this.type.ordinal());
            jSONObject.put(GenerateNotification.BUNDLE_KEY_ACTION_ID, this.actionId);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }
}
