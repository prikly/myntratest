package com.unity3d.services.core.request.metrics;

import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.Session;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MetricsContainer {
    private static final String METRICS_CONTAINER = "m";
    private static final String METRICS_CONTAINER_TAGS = "t";
    private static final String METRIC_CONTAINER_API_LEVEL = "apil";
    private static final String METRIC_CONTAINER_DEVICE_MAKE = "deviceMake";
    private static final String METRIC_CONTAINER_DEVICE_MODEL = "deviceModel";
    private static final String METRIC_CONTAINER_DEVICE_NAME = "deviceName";
    private static final String METRIC_CONTAINER_GAME_ID = "gameId";
    private static final String METRIC_CONTAINER_SAMPLE_RATE = "msr";
    private static final String METRIC_CONTAINER_SESSION_TOKEN = "sTkn";
    private static final String METRIC_CONTAINER_SHARED_SESSION_ID = "shSid";
    private final String _apiLevel;
    private final MetricCommonTags _commonTags;
    private final String _deviceManufacturer;
    private final String _deviceModel;
    private final String _deviceName;
    private final String _gameId;
    private final String _metricSampleRate;
    private final List<Metric> _metrics;
    private final String _sTkn;
    private final String _shSid = Session.Default.getId();

    public MetricsContainer(String str, MetricCommonTags metricCommonTags, List<Metric> list, String str2) {
        this._metricSampleRate = str;
        this._commonTags = metricCommonTags;
        this._metrics = list;
        this._sTkn = str2;
        this._apiLevel = String.valueOf(Device.getApiLevel());
        this._deviceModel = Device.getModel();
        this._deviceName = Device.getDevice();
        this._deviceManufacturer = Device.getManufacturer();
        this._gameId = ClientProperties.getGameId();
    }

    public Map<String, Object> asMap() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Metric asMap : this._metrics) {
            arrayList.add(asMap.asMap());
        }
        hashMap.put(METRIC_CONTAINER_SAMPLE_RATE, this._metricSampleRate);
        hashMap.put("m", arrayList);
        hashMap.put("t", this._commonTags.asMap());
        hashMap.put(METRIC_CONTAINER_SESSION_TOKEN, this._sTkn);
        hashMap.put(METRIC_CONTAINER_SHARED_SESSION_ID, this._shSid);
        String str = this._apiLevel;
        if (str != null) {
            hashMap.put(METRIC_CONTAINER_API_LEVEL, str);
        }
        String str2 = this._deviceModel;
        if (str2 != null) {
            hashMap.put(METRIC_CONTAINER_DEVICE_MODEL, str2);
        }
        String str3 = this._deviceName;
        if (str3 != null) {
            hashMap.put(METRIC_CONTAINER_DEVICE_NAME, str3);
        }
        String str4 = this._deviceManufacturer;
        if (str4 != null) {
            hashMap.put(METRIC_CONTAINER_DEVICE_MAKE, str4);
        }
        String str5 = this._gameId;
        if (str5 != null) {
            hashMap.put(METRIC_CONTAINER_GAME_ID, str5);
        }
        return hashMap;
    }
}
