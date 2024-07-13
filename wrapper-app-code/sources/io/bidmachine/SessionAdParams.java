package io.bidmachine;

import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.models.ISessionAdParams;
import io.bidmachine.models.RequestParams;
import io.bidmachine.protobuf.RequestTokenPayload;

public final class SessionAdParams extends RequestParams<SessionAdParams> implements ISessionAdParams<SessionAdParams> {
    private int clickCount;
    private Float clickRate;
    private int completedVideosCount;
    private Float completionRate;
    private Integer impressionCount;
    private Boolean isUserClickedOnLastAd;
    private String lastAdDomain;
    private String lastBundle;
    private Integer sessionDuration;
    private int videoImpressionCount;

    public SessionAdParams setSessionDuration(Integer num) {
        if (num == null || num.intValue() >= 0) {
            this.sessionDuration = num;
        } else {
            Logger.logError("session duration shouldn't be negative");
        }
        return this;
    }

    public SessionAdParams setImpressionCount(Integer num) {
        if (num == null || num.intValue() >= 0) {
            this.impressionCount = num;
        } else {
            Logger.logError("impression count shouldn't be negative");
        }
        return this;
    }

    public SessionAdParams setClickRate(Float f2) {
        if (f2 == null || (f2.floatValue() >= 0.0f && f2.floatValue() <= 100.0f)) {
            this.clickRate = f2;
        } else {
            Logger.logError("click rate be between 0 and 100");
        }
        return this;
    }

    public SessionAdParams setIsUserClickedOnLastAd(Boolean bool) {
        this.isUserClickedOnLastAd = bool;
        return this;
    }

    public SessionAdParams setCompletionRate(Float f2) {
        if (f2 == null || (f2.floatValue() >= 0.0f && f2.floatValue() <= 100.0f)) {
            this.completionRate = f2;
        } else {
            Logger.logError("click rate be between 0 and 100");
        }
        return this;
    }

    public void merge(SessionAdParams sessionAdParams) {
        this.sessionDuration = (Integer) Utils.oneOf(this.sessionDuration, sessionAdParams.sessionDuration);
        this.impressionCount = (Integer) Utils.oneOf(this.impressionCount, sessionAdParams.impressionCount);
        this.clickRate = (Float) Utils.oneOf(this.clickRate, sessionAdParams.clickRate);
        this.isUserClickedOnLastAd = (Boolean) Utils.oneOf(this.isUserClickedOnLastAd, sessionAdParams.isUserClickedOnLastAd);
        this.completionRate = (Float) Utils.oneOf(this.completionRate, sessionAdParams.completionRate);
    }

    /* access modifiers changed from: package-private */
    public void fillUserExtension(Struct.Builder builder) {
        if (this.sessionDuration != null) {
            builder.putFields("sessionduration", Value.newBuilder().setNumberValue((double) this.sessionDuration.intValue()).build());
        }
        if (this.impressionCount != null) {
            builder.putFields("impdepth", Value.newBuilder().setNumberValue((double) this.impressionCount.intValue()).build());
        }
        if (this.clickRate != null) {
            builder.putFields("clickrate", Value.newBuilder().setNumberValue((double) this.clickRate.floatValue()).build());
        }
        if (this.isUserClickedOnLastAd != null) {
            builder.putFields("lastclick", Value.newBuilder().setNumberValue(this.isUserClickedOnLastAd.booleanValue() ? 1.0d : 0.0d).build());
        }
        if (this.completionRate != null) {
            builder.putFields("completionrate", Value.newBuilder().setNumberValue((double) this.completionRate.floatValue()).build());
        }
        if (this.lastBundle != null) {
            builder.putFields("lastbundle", Value.newBuilder().setStringValue(this.lastBundle).build());
        }
        if (this.lastAdDomain != null) {
            builder.putFields("lastadomain", Value.newBuilder().setStringValue(this.lastAdDomain).build());
        }
    }

    /* access modifiers changed from: package-private */
    public void fillSessionPlacementData(RequestTokenPayload.SessionData.SessionPlacementData.Builder builder) {
        Integer num = this.impressionCount;
        if (num != null) {
            builder.setImpdepth(num.intValue());
        }
        String str = this.lastBundle;
        if (str != null) {
            builder.setLastbundle(str);
        }
        String str2 = this.lastAdDomain;
        if (str2 != null) {
            builder.setLastadomain(str2);
        }
        Float f2 = this.clickRate;
        if (f2 != null) {
            builder.setClickrate(f2.floatValue());
        }
        Boolean bool = this.isUserClickedOnLastAd;
        if (bool != null) {
            builder.setLastclick(bool.booleanValue());
        }
        Float f3 = this.completionRate;
        if (f3 != null) {
            builder.setCompletionrate(f3.floatValue());
        }
    }

    /* access modifiers changed from: package-private */
    public Integer getSessionDuration() {
        return this.sessionDuration;
    }

    /* access modifiers changed from: package-private */
    public Integer getImpressionCount() {
        return this.impressionCount;
    }

    /* access modifiers changed from: package-private */
    public void addImpression() {
        Integer num = this.impressionCount;
        if (num == null) {
            this.impressionCount = 1;
        } else {
            this.impressionCount = Integer.valueOf(num.intValue() + 1);
        }
        updateClickRate();
    }

    /* access modifiers changed from: package-private */
    public Float getClickRate() {
        return this.clickRate;
    }

    /* access modifiers changed from: package-private */
    public Boolean getUserClickedOnLastAd() {
        return this.isUserClickedOnLastAd;
    }

    /* access modifiers changed from: package-private */
    public Float getCompletionRate() {
        return this.completionRate;
    }

    /* access modifiers changed from: package-private */
    public String getLastBundle() {
        return this.lastBundle;
    }

    /* access modifiers changed from: package-private */
    public void setLastBundle(String str) {
        this.lastBundle = str;
    }

    /* access modifiers changed from: package-private */
    public String getLastAdDomain() {
        return this.lastAdDomain;
    }

    /* access modifiers changed from: package-private */
    public void setLastAdDomain(String str) {
        this.lastAdDomain = str;
    }

    /* access modifiers changed from: package-private */
    public int getClickCount() {
        return this.clickCount;
    }

    /* access modifiers changed from: package-private */
    public void addClick() {
        this.clickCount++;
        updateClickRate();
        this.isUserClickedOnLastAd = true;
    }

    /* access modifiers changed from: package-private */
    public int getVideoImpressionCount() {
        return this.videoImpressionCount;
    }

    /* access modifiers changed from: package-private */
    public void addVideoImpression() {
        this.videoImpressionCount++;
        updateCompletionRate();
    }

    /* access modifiers changed from: package-private */
    public int getCompletedVideosCount() {
        return this.completedVideosCount;
    }

    /* access modifiers changed from: package-private */
    public void addCompletedVideo() {
        this.completedVideosCount++;
        updateCompletionRate();
    }

    /* access modifiers changed from: package-private */
    public void clear() {
        this.sessionDuration = null;
        this.impressionCount = null;
        this.clickRate = null;
        this.isUserClickedOnLastAd = null;
        this.completionRate = null;
        this.lastBundle = null;
        this.lastAdDomain = null;
        this.clickCount = 0;
        this.videoImpressionCount = 0;
        this.completedVideosCount = 0;
    }

    private void updateClickRate() {
        Integer num = this.impressionCount;
        if (num != null && num.intValue() != 0) {
            this.clickRate = Float.valueOf((((float) this.clickCount) / ((float) this.impressionCount.intValue())) * 100.0f);
        }
    }

    private void updateCompletionRate() {
        int i = this.videoImpressionCount;
        if (i != 0) {
            this.completionRate = Float.valueOf((((float) this.completedVideosCount) / ((float) i)) * 100.0f);
        }
    }
}
