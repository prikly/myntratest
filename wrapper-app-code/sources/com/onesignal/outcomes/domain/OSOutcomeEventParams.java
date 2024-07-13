package com.onesignal.outcomes.domain;

import com.onesignal.outcomes.OSOutcomeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/onesignal/outcomes/domain/OSOutcomeEventParams;", "", "outcomeId", "", "outcomeSource", "Lcom/onesignal/outcomes/domain/OSOutcomeSource;", "weight", "", "timestamp", "", "(Ljava/lang/String;Lcom/onesignal/outcomes/domain/OSOutcomeSource;FJ)V", "getOutcomeId", "()Ljava/lang/String;", "getOutcomeSource", "()Lcom/onesignal/outcomes/domain/OSOutcomeSource;", "getTimestamp", "()J", "setTimestamp", "(J)V", "getWeight", "()F", "setWeight", "(F)V", "isUnattributed", "", "toJSONObject", "Lorg/json/JSONObject;", "toString", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: OSOutcomeEventParams.kt */
public final class OSOutcomeEventParams {
    private final String outcomeId;
    private final OSOutcomeSource outcomeSource;
    private long timestamp;
    private float weight;

    public OSOutcomeEventParams(String str, OSOutcomeSource oSOutcomeSource, float f2, long j) {
        Intrinsics.checkNotNullParameter(str, "outcomeId");
        this.outcomeId = str;
        this.outcomeSource = oSOutcomeSource;
        this.weight = f2;
        this.timestamp = j;
    }

    public final String getOutcomeId() {
        return this.outcomeId;
    }

    public final OSOutcomeSource getOutcomeSource() {
        return this.outcomeSource;
    }

    public final float getWeight() {
        return this.weight;
    }

    public final void setWeight(float f2) {
        this.weight = f2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OSOutcomeEventParams(String str, OSOutcomeSource oSOutcomeSource, float f2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, oSOutcomeSource, f2, (i & 8) != 0 ? 0 : j);
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject put = new JSONObject().put(OSOutcomeConstants.OUTCOME_ID, this.outcomeId);
        OSOutcomeSource oSOutcomeSource = this.outcomeSource;
        if (oSOutcomeSource != null) {
            put.put(OSOutcomeConstants.OUTCOME_SOURCES, oSOutcomeSource.toJSONObject());
        }
        float f2 = this.weight;
        if (f2 > ((float) 0)) {
            put.put("weight", Float.valueOf(f2));
        }
        long j = this.timestamp;
        if (j > 0) {
            put.put("timestamp", j);
        }
        Intrinsics.checkNotNullExpressionValue(put, "json");
        return put;
    }

    public final boolean isUnattributed() {
        OSOutcomeSource oSOutcomeSource = this.outcomeSource;
        return oSOutcomeSource == null || (oSOutcomeSource.getDirectBody() == null && this.outcomeSource.getIndirectBody() == null);
    }

    public String toString() {
        return "OSOutcomeEventParams{outcomeId='" + this.outcomeId + '\'' + ", outcomeSource=" + this.outcomeSource + ", weight=" + this.weight + ", timestamp=" + this.timestamp + '}';
    }
}
