package com.unity3d.services.core.configuration;

import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetrics;
import com.unity3d.services.core.request.metrics.TSIMetric;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class InitializeEventsMetricSender implements IInitializationListener, IInitializeEventsMetricSender {
    private static InitializeEventsMetricSender _instance;
    private long _configEndTime = 0;
    /* access modifiers changed from: private */
    public int _configRetryCount = 0;
    private long _configStartTime = 0;
    private boolean _initMetricSent = false;
    private boolean _isNewInitFlow = false;
    private long _privacyConfigEndTime = 0;
    private long _privacyConfigStartTime = 0;
    private long _startTime = 0;
    private boolean _tokenMetricSent = false;
    /* access modifiers changed from: private */
    public int _webviewRetryCount = 0;

    public static IInitializeEventsMetricSender getInstance() {
        if (_instance == null) {
            _instance = new InitializeEventsMetricSender();
        }
        return _instance;
    }

    private InitializeEventsMetricSender() {
        InitializationNotificationCenter.getInstance().addListener(this);
    }

    public void didInitStart() {
        this._startTime = System.nanoTime();
        this._configRetryCount = 0;
        this._webviewRetryCount = 0;
        sendMetric(TSIMetric.newInitStarted());
    }

    public void didConfigRequestStart() {
        this._configStartTime = System.nanoTime();
    }

    public void didConfigRequestEnd(boolean z) {
        this._configEndTime = System.nanoTime();
        sendConfigResolutionRequestIfNeeded(z);
    }

    public void didPrivacyConfigRequestStart() {
        this._privacyConfigStartTime = System.nanoTime();
    }

    public void didPrivacyConfigRequestEnd(boolean z) {
        this._privacyConfigEndTime = System.nanoTime();
        sendPrivacyResolutionRequestIfNeeded(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void sdkDidInitialize() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.Long r0 = r5.initializationStartTimeStamp()     // Catch:{ all -> 0x0032 }
            long r0 = r0.longValue()     // Catch:{ all -> 0x0032 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0016
            java.lang.String r0 = "sdkDidInitialize called before didInitStart, skipping metric"
            com.unity3d.services.core.log.DeviceLog.debug(r0)     // Catch:{ all -> 0x0032 }
            monitor-exit(r5)
            return
        L_0x0016:
            boolean r0 = r5._initMetricSent     // Catch:{ all -> 0x0032 }
            if (r0 != 0) goto L_0x0030
            boolean r0 = r5._isNewInitFlow     // Catch:{ all -> 0x0032 }
            if (r0 != 0) goto L_0x0030
            java.lang.Long r0 = r5.duration()     // Catch:{ all -> 0x0032 }
            java.util.Map r1 = r5.getRetryTags()     // Catch:{ all -> 0x0032 }
            com.unity3d.services.core.request.metrics.Metric r0 = com.unity3d.services.core.request.metrics.TSIMetric.newInitTimeSuccess(r0, r1)     // Catch:{ all -> 0x0032 }
            r5.sendMetric(r0)     // Catch:{ all -> 0x0032 }
            r0 = 1
            r5._initMetricSent = r0     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r5)
            return
        L_0x0032:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.configuration.InitializeEventsMetricSender.sdkDidInitialize():void");
    }

    public Long initializationStartTimeStamp() {
        return Long.valueOf(this._startTime);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void sdkInitializeFailed(java.lang.String r5, com.unity3d.services.core.configuration.ErrorState r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            long r0 = r4._startTime     // Catch:{ all -> 0x002c }
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x0010
            java.lang.String r5 = "sdkInitializeFailed called before didInitStart, skipping metric"
            com.unity3d.services.core.log.DeviceLog.debug(r5)     // Catch:{ all -> 0x002c }
            monitor-exit(r4)
            return
        L_0x0010:
            boolean r5 = r4._initMetricSent     // Catch:{ all -> 0x002c }
            if (r5 != 0) goto L_0x002a
            boolean r5 = r4._isNewInitFlow     // Catch:{ all -> 0x002c }
            if (r5 != 0) goto L_0x002a
            java.lang.Long r5 = r4.duration()     // Catch:{ all -> 0x002c }
            java.util.Map r6 = r4.getErrorStateTags(r6)     // Catch:{ all -> 0x002c }
            com.unity3d.services.core.request.metrics.Metric r5 = com.unity3d.services.core.request.metrics.TSIMetric.newInitTimeFailure(r5, r6)     // Catch:{ all -> 0x002c }
            r4.sendMetric(r5)     // Catch:{ all -> 0x002c }
            r5 = 1
            r4._initMetricSent = r5     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r4)
            return
        L_0x002c:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.configuration.InitializeEventsMetricSender.sdkInitializeFailed(java.lang.String, com.unity3d.services.core.configuration.ErrorState):void");
    }

    public synchronized void sdkTokenDidBecomeAvailableWithConfig(boolean z) {
        if (!this._tokenMetricSent) {
            sendTokenAvailabilityMetricWithConfig(z);
            if (z) {
                sendTokenResolutionRequestMetricIfNeeded();
            }
            this._tokenMetricSent = true;
        }
    }

    private void sendTokenAvailabilityMetricWithConfig(boolean z) {
        Metric metric;
        if (this._startTime == 0) {
            DeviceLog.debug("sendTokenAvailabilityMetricWithConfig called before didInitStart, skipping metric");
            return;
        }
        Long valueOf = Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this._startTime));
        Map<String, String> retryTags = getRetryTags();
        if (z) {
            metric = TSIMetric.newTokenAvailabilityLatencyConfig(valueOf, retryTags);
        } else {
            metric = TSIMetric.newTokenAvailabilityLatencyWebview(valueOf, retryTags);
        }
        sendMetric(metric);
    }

    private void sendTokenResolutionRequestMetricIfNeeded() {
        if (this._configStartTime == 0) {
            DeviceLog.debug("sendTokenResolutionRequestMetricIfNeeded called before didInitStart, skipping metric");
        } else {
            sendMetric(TSIMetric.newTokenResolutionRequestLatency(tokenDuration(), getRetryTags()));
        }
    }

    private void sendPrivacyResolutionRequestIfNeeded(boolean z) {
        if (this._privacyConfigStartTime == 0 || this._privacyConfigEndTime == 0) {
            DeviceLog.debug("sendPrivacyResolutionRequestIfNeeded called with invalid timestamps, skipping metric");
        } else {
            sendMetric(getPrivacyRequestMetric(z));
        }
    }

    private Metric getPrivacyRequestMetric(boolean z) {
        if (this._isNewInitFlow) {
            if (z) {
                return TSIMetric.newPrivacyRequestLatencySuccess(privacyConfigDuration());
            }
            return TSIMetric.newPrivacyRequestLatencyFailure(privacyConfigDuration());
        } else if (z) {
            return TSIMetric.newPrivacyResolutionRequestLatencySuccess(privacyConfigDuration());
        } else {
            return TSIMetric.newPrivacyResolutionRequestLatencyFailure(privacyConfigDuration());
        }
    }

    private void sendConfigResolutionRequestIfNeeded(boolean z) {
        if (this._configStartTime == 0 || this._configEndTime == 0) {
            DeviceLog.debug("sendConfigResolutionRequestIfNeeded called with invalid timestamps, skipping metric");
        } else if (z) {
            sendMetric(TSIMetric.newConfigRequestLatencySuccess(configRequestDuration()));
        } else {
            sendMetric(TSIMetric.newConfigRequestLatencyFailure(configRequestDuration()));
        }
    }

    public void onRetryConfig() {
        this._configRetryCount++;
    }

    public void onRetryWebview() {
        this._webviewRetryCount++;
    }

    public Long duration() {
        return Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this._startTime));
    }

    public Long tokenDuration() {
        return Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this._configStartTime));
    }

    public Long privacyConfigDuration() {
        return Long.valueOf(TimeUnit.NANOSECONDS.toMillis(this._privacyConfigEndTime - this._privacyConfigStartTime));
    }

    public Long configRequestDuration() {
        return Long.valueOf(TimeUnit.NANOSECONDS.toMillis(this._configEndTime - this._configStartTime));
    }

    public Map<String, String> getErrorStateTags(ErrorState errorState) {
        Map<String, String> retryTags = getRetryTags();
        retryTags.put("stt", errorState.getMetricName());
        return retryTags;
    }

    public Map<String, String> getRetryTags() {
        return new HashMap<String, String>() {
            {
                put("c_retry", String.valueOf(InitializeEventsMetricSender.this._configRetryCount));
                put("wv_retry", String.valueOf(InitializeEventsMetricSender.this._webviewRetryCount));
            }
        };
    }

    public void sendMetric(Metric metric) {
        SDKMetrics.getInstance().sendMetric(metric);
    }

    public void setNewInitFlow(boolean z) {
        this._isNewInitFlow = z;
    }

    public void onSdkInitialized() {
        sdkDidInitialize();
    }

    public void onSdkInitializationFailed(String str, ErrorState errorState, int i) {
        sdkInitializeFailed(str, errorState);
    }
}
