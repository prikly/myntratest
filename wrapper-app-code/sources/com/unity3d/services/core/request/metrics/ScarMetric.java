package com.unity3d.services.core.request.metrics;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ScarMetric {
    private static final String HB_SIGNALS_FETCH_FAILURE = "native_hb_signals_fetch_failure";
    public static final String HB_SIGNALS_FETCH_START = "native_hb_signals_fetch_start";
    private static final String HB_SIGNALS_FETCH_SUCCESS = "native_hb_signals_fetch_success";
    private static final String HB_SIGNALS_UPLOAD_FAILURE = "native_hb_signals_upload_failure";
    private static final String HB_SIGNALS_UPLOAD_START = "native_hb_signals_upload_start";
    private static final String HB_SIGNALS_UPLOAD_SUCCESS = "native_hb_signals_upload_success";
    private static final String REASON = "reason";
    private static long _fetchStartTime;
    private static long _uploadStartTime;

    private static long getTotalFetchTime() {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - _fetchStartTime);
    }

    private static long getTotalUploadTime() {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - _uploadStartTime);
    }

    public static Metric hbSignalsFetchStart() {
        _fetchStartTime = System.nanoTime();
        return new Metric(HB_SIGNALS_FETCH_START, (Object) null, (Map<String, String>) null);
    }

    public static Metric hbSignalsFetchSuccess() {
        return new Metric(HB_SIGNALS_FETCH_SUCCESS, Long.valueOf(getTotalFetchTime()), (Map<String, String>) null);
    }

    public static Metric hbSignalsFetchFailure(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        return new Metric(HB_SIGNALS_FETCH_FAILURE, Long.valueOf(getTotalFetchTime()), hashMap);
    }

    public static Metric hbSignalsUploadStart() {
        _uploadStartTime = System.nanoTime();
        return new Metric(HB_SIGNALS_UPLOAD_START, (Object) null, (Map<String, String>) null);
    }

    public static Metric hbSignalsUploadSuccess() {
        return new Metric(HB_SIGNALS_UPLOAD_SUCCESS, Long.valueOf(getTotalUploadTime()), (Map<String, String>) null);
    }

    public static Metric hbSignalsUploadFailure(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        return new Metric(HB_SIGNALS_UPLOAD_FAILURE, Long.valueOf(getTotalUploadTime()), hashMap);
    }
}
