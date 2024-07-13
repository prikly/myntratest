package com.unity3d.services.core.webview;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.metrics.SDKMetrics;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class WebViewUrlBuilder {
    private final String _urlWithQueryString;

    public WebViewUrlBuilder(String str, Configuration configuration) {
        this._urlWithQueryString = str + ((("?platform=android" + buildQueryParam(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, configuration.getWebViewUrl())) + buildQueryParam(MediationMetaData.KEY_VERSION, configuration.getWebViewVersion())) + buildQueryParam("isNativeCollectingMetrics", String.valueOf(SDKMetrics.getInstance().areMetricsEnabledForCurrentSession())));
    }

    public String getUrlWithQueryString() {
        return this._urlWithQueryString;
    }

    private String buildQueryParam(String str, String str2) {
        if (str2 == null) {
            return "";
        }
        try {
            return "" + "&" + str + "=" + URLEncoder.encode(str2, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            DeviceLog.exception(String.format("Unsupported charset when encoding %s", new Object[]{str}), e2);
            return "";
        }
    }
}
