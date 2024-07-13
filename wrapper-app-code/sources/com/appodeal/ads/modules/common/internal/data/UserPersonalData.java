package com.appodeal.ads.modules.common.internal.data;

import android.content.Context;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0002\u001a\u0004\u0018\u00010\u0003H'¢\u0006\u0002\u0010\u0004J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\n\u0010\t\u001a\u0004\u0018\u00010\bH&J\n\u0010\n\u001a\u0004\u0018\u00010\u0006H&J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\rH&J\n\u0010\u000e\u001a\u0004\u0018\u00010\bH&J\b\u0010\u000f\u001a\u00020\bH&J\n\u0010\u0010\u001a\u0004\u0018\u00010\bH&J\n\u0010\u0011\u001a\u0004\u0018\u00010\bH&J\n\u0010\u0012\u001a\u0004\u0018\u00010\bH&J\n\u0010\u0013\u001a\u0004\u0018\u00010\bH&J\b\u0010\u0014\u001a\u00020\u0015H&¨\u0006\u0016"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/data/UserPersonalData;", "", "getAge", "", "()Ljava/lang/Integer;", "getCachedToken", "Lorg/json/JSONObject;", "getCity", "", "getCountry", "getExtraData", "getHttpAgent", "context", "Landroid/content/Context;", "getIabConsentString", "getIfa", "getIp", "getUSPrivacyString", "getUserId", "getZip", "wasAdIdGenerated", "", "apd_internal"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface UserPersonalData {
    Integer getAge();

    JSONObject getCachedToken();

    String getCity();

    String getCountry();

    JSONObject getExtraData();

    String getHttpAgent(Context context);

    String getIabConsentString();

    String getIfa();

    String getIp();

    String getUSPrivacyString();

    String getUserId();

    String getZip();

    boolean wasAdIdGenerated();
}
