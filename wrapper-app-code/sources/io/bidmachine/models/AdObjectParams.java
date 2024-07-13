package io.bidmachine.models;

import android.text.TextUtils;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.adcom.Ad;
import io.bidmachine.TrackEventType;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public abstract class AdObjectParams {
    private static final boolean DEF_VIEWABILITY_IGNORE_WINDOW_FOCUS = false;
    private static final float DEF_VIEWABILITY_PIXEL_THRESHOLD = 1.0f;
    private static final long DEF_VIEWABILITY_TIME_THRESHOLD = 1;
    private final Map<TrackEventType, List<String>> trackUrls;
    private boolean viewabilityIgnoreWindowFocus;
    private float viewabilityPixelThreshold = DEF_VIEWABILITY_PIXEL_THRESHOLD;
    private long viewabilityTimeThresholdSec = 1;

    public abstract boolean isValid();

    /* access modifiers changed from: protected */
    public void prepareExtensions(Map<String, Value> map) {
    }

    public abstract UnifiedMediationParams toMediationParams();

    public AdObjectParams(Ad ad) {
        this.viewabilityIgnoreWindowFocus = false;
        this.trackUrls = new EnumMap(TrackEventType.class);
        if (ad.getExtProtoCount() > 0) {
            for (int i = 0; i < ad.getExtProtoCount(); i++) {
                if (ad.getExtProto(i).is(AdExtension.class)) {
                    try {
                        prepareExtensions((AdExtension) ad.getExtProto(i).unpack(AdExtension.class));
                    } catch (InvalidProtocolBufferException e2) {
                        Logger.log((Throwable) e2);
                    }
                }
            }
        }
        prepareExtensions(ad.getExt().getFieldsMap());
    }

    /* access modifiers changed from: protected */
    public void prepareExtensions(AdExtension adExtension) {
        this.viewabilityTimeThresholdSec = Utils.getOrDefault((long) adExtension.getViewabilityTimeThreshold(), (long) AdExtension.getDefaultInstance().getViewabilityTimeThreshold(), 1);
        this.viewabilityPixelThreshold = Utils.getOrDefault(adExtension.getViewabilityPixelThreshold(), AdExtension.getDefaultInstance().getViewabilityPixelThreshold(), (float) DEF_VIEWABILITY_PIXEL_THRESHOLD);
        this.viewabilityIgnoreWindowFocus = adExtension.getViewabilityIgnoreWindowFocus();
        prepareEvents(adExtension.getEventList());
    }

    /* access modifiers changed from: protected */
    public void prepareEvents(List<Ad.Event> list) {
        if (list != null && list.size() != 0) {
            for (Ad.Event next : list) {
                TrackEventType fromNumber = TrackEventType.fromNumber(next.getTypeValue());
                if (fromNumber != null) {
                    addEvent(fromNumber, next.getUrl());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void addEvent(TrackEventType trackEventType, String str) {
        if (!TextUtils.isEmpty(str)) {
            List list = this.trackUrls.get(trackEventType);
            if (list == null) {
                list = new ArrayList(1);
                this.trackUrls.put(trackEventType, list);
            }
            list.add(str);
        }
    }

    public List<String> getTrackUrls(TrackEventType trackEventType) {
        return this.trackUrls.get(trackEventType);
    }

    public long getViewabilityTimeThresholdMs() {
        return TimeUnit.SECONDS.toMillis(this.viewabilityTimeThresholdSec);
    }

    public float getViewabilityPixelThreshold() {
        return this.viewabilityPixelThreshold;
    }

    public boolean isViewabilityIgnoreWindowFocus() {
        return this.viewabilityIgnoreWindowFocus;
    }
}
