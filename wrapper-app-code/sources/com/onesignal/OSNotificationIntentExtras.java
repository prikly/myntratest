package com.onesignal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/onesignal/OSNotificationIntentExtras;", "", "dataArray", "Lorg/json/JSONArray;", "jsonData", "Lorg/json/JSONObject;", "(Lorg/json/JSONArray;Lorg/json/JSONObject;)V", "getDataArray", "()Lorg/json/JSONArray;", "setDataArray", "(Lorg/json/JSONArray;)V", "getJsonData", "()Lorg/json/JSONObject;", "setJsonData", "(Lorg/json/JSONObject;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: OSNotificationIntentExtras.kt */
public final class OSNotificationIntentExtras {
    private JSONArray dataArray;
    private JSONObject jsonData;

    public static /* synthetic */ OSNotificationIntentExtras copy$default(OSNotificationIntentExtras oSNotificationIntentExtras, JSONArray jSONArray, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONArray = oSNotificationIntentExtras.dataArray;
        }
        if ((i & 2) != 0) {
            jSONObject = oSNotificationIntentExtras.jsonData;
        }
        return oSNotificationIntentExtras.copy(jSONArray, jSONObject);
    }

    public final JSONArray component1() {
        return this.dataArray;
    }

    public final JSONObject component2() {
        return this.jsonData;
    }

    public final OSNotificationIntentExtras copy(JSONArray jSONArray, JSONObject jSONObject) {
        return new OSNotificationIntentExtras(jSONArray, jSONObject);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OSNotificationIntentExtras)) {
            return false;
        }
        OSNotificationIntentExtras oSNotificationIntentExtras = (OSNotificationIntentExtras) obj;
        return Intrinsics.areEqual((Object) this.dataArray, (Object) oSNotificationIntentExtras.dataArray) && Intrinsics.areEqual((Object) this.jsonData, (Object) oSNotificationIntentExtras.jsonData);
    }

    public int hashCode() {
        JSONArray jSONArray = this.dataArray;
        int i = 0;
        int hashCode = (jSONArray != null ? jSONArray.hashCode() : 0) * 31;
        JSONObject jSONObject = this.jsonData;
        if (jSONObject != null) {
            i = jSONObject.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "OSNotificationIntentExtras(dataArray=" + this.dataArray + ", jsonData=" + this.jsonData + ")";
    }

    public OSNotificationIntentExtras(JSONArray jSONArray, JSONObject jSONObject) {
        this.dataArray = jSONArray;
        this.jsonData = jSONObject;
    }

    public final JSONArray getDataArray() {
        return this.dataArray;
    }

    public final JSONObject getJsonData() {
        return this.jsonData;
    }

    public final void setDataArray(JSONArray jSONArray) {
        this.dataArray = jSONArray;
    }

    public final void setJsonData(JSONObject jSONObject) {
        this.jsonData = jSONObject;
    }
}
