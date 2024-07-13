package com.onesignal.influence.data;

import com.onesignal.OSLogger;
import com.onesignal.OSSharedPreferences;
import com.onesignal.OSTime;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalRemoteParams;
import com.onesignal.influence.OSInfluenceConstants;
import com.onesignal.influence.domain.OSInfluence;
import com.onesignal.influence.domain.OSInfluenceChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001c\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\nJ\u0010\u0010!\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\"\u001a\u00020#J\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\"\u001a\u00020#J\u0006\u0010%\u001a\u00020\u001eJ\u000e\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020(R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\n8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u0011\u0010\u0016\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\n8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\rR\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000b0\u001bX\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/onesignal/influence/data/OSTrackerFactory;", "", "preferences", "Lcom/onesignal/OSSharedPreferences;", "logger", "Lcom/onesignal/OSLogger;", "timeProvider", "Lcom/onesignal/OSTime;", "(Lcom/onesignal/OSSharedPreferences;Lcom/onesignal/OSLogger;Lcom/onesignal/OSTime;)V", "channels", "", "Lcom/onesignal/influence/data/OSChannelTracker;", "getChannels", "()Ljava/util/List;", "dataRepository", "Lcom/onesignal/influence/data/OSInfluenceDataRepository;", "iAMChannelTracker", "getIAMChannelTracker", "()Lcom/onesignal/influence/data/OSChannelTracker;", "influences", "Lcom/onesignal/influence/domain/OSInfluence;", "getInfluences", "notificationChannelTracker", "getNotificationChannelTracker", "sessionInfluences", "getSessionInfluences", "trackers", "Ljava/util/concurrent/ConcurrentHashMap;", "", "addSessionData", "", "jsonObject", "Lorg/json/JSONObject;", "getChannelByEntryAction", "entryAction", "Lcom/onesignal/OneSignal$AppEntryAction;", "getChannelsToResetByEntryAction", "initFromCache", "saveInfluenceParams", "influenceParams", "Lcom/onesignal/OneSignalRemoteParams$InfluenceParams;", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: OSTrackerFactory.kt */
public final class OSTrackerFactory {
    private final OSInfluenceDataRepository dataRepository;
    private final ConcurrentHashMap<String, OSChannelTracker> trackers = new ConcurrentHashMap<>();

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OSInfluenceChannel.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[OSInfluenceChannel.NOTIFICATION.ordinal()] = 1;
            $EnumSwitchMapping$0[OSInfluenceChannel.IAM.ordinal()] = 2;
        }
    }

    public OSTrackerFactory(OSSharedPreferences oSSharedPreferences, OSLogger oSLogger, OSTime oSTime) {
        Intrinsics.checkNotNullParameter(oSSharedPreferences, "preferences");
        Intrinsics.checkNotNullParameter(oSLogger, "logger");
        Intrinsics.checkNotNullParameter(oSTime, "timeProvider");
        this.dataRepository = new OSInfluenceDataRepository(oSSharedPreferences);
        this.trackers.put(OSInfluenceConstants.INSTANCE.getIAM_TAG(), new OSInAppMessageTracker(this.dataRepository, oSLogger, oSTime));
        this.trackers.put(OSInfluenceConstants.INSTANCE.getNOTIFICATION_TAG(), new OSNotificationTracker(this.dataRepository, oSLogger, oSTime));
    }

    public final List<OSInfluence> getInfluences() {
        Collection<OSChannelTracker> values = this.trackers.values();
        Intrinsics.checkNotNullExpressionValue(values, "trackers.values");
        Iterable<OSChannelTracker> iterable = values;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (OSChannelTracker currentSessionInfluence : iterable) {
            arrayList.add(currentSessionInfluence.getCurrentSessionInfluence());
        }
        return (List) arrayList;
    }

    public final List<OSInfluence> getSessionInfluences() {
        Collection<OSChannelTracker> values = this.trackers.values();
        Intrinsics.checkNotNullExpressionValue(values, "trackers.values");
        Collection arrayList = new ArrayList();
        for (Object next : values) {
            if (!Intrinsics.areEqual((Object) ((OSChannelTracker) next).getIdTag(), (Object) OSInfluenceConstants.INSTANCE.getIAM_TAG())) {
                arrayList.add(next);
            }
        }
        Iterable<OSChannelTracker> iterable = (List) arrayList;
        Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (OSChannelTracker currentSessionInfluence : iterable) {
            arrayList2.add(currentSessionInfluence.getCurrentSessionInfluence());
        }
        return (List) arrayList2;
    }

    public final OSChannelTracker getIAMChannelTracker() {
        OSChannelTracker oSChannelTracker = this.trackers.get(OSInfluenceConstants.INSTANCE.getIAM_TAG());
        Intrinsics.checkNotNull(oSChannelTracker);
        return oSChannelTracker;
    }

    public final OSChannelTracker getNotificationChannelTracker() {
        OSChannelTracker oSChannelTracker = this.trackers.get(OSInfluenceConstants.INSTANCE.getNOTIFICATION_TAG());
        Intrinsics.checkNotNull(oSChannelTracker);
        return oSChannelTracker;
    }

    public final List<OSChannelTracker> getChannels() {
        List<OSChannelTracker> arrayList = new ArrayList<>();
        arrayList.add(getNotificationChannelTracker());
        arrayList.add(getIAMChannelTracker());
        return arrayList;
    }

    public final void initFromCache() {
        Collection<OSChannelTracker> values = this.trackers.values();
        Intrinsics.checkNotNullExpressionValue(values, "trackers.values");
        for (OSChannelTracker initInfluencedTypeFromCache : values) {
            initInfluencedTypeFromCache.initInfluencedTypeFromCache();
        }
    }

    public final void saveInfluenceParams(OneSignalRemoteParams.InfluenceParams influenceParams) {
        Intrinsics.checkNotNullParameter(influenceParams, "influenceParams");
        this.dataRepository.saveInfluenceParams(influenceParams);
    }

    public final void addSessionData(JSONObject jSONObject, List<OSInfluence> list) {
        Intrinsics.checkNotNullParameter(jSONObject, "jsonObject");
        Intrinsics.checkNotNullParameter(list, "influences");
        for (OSInfluence oSInfluence : list) {
            if (WhenMappings.$EnumSwitchMapping$0[oSInfluence.getInfluenceChannel().ordinal()] == 1) {
                getNotificationChannelTracker().addSessionData(jSONObject, oSInfluence);
            }
        }
    }

    public final OSChannelTracker getChannelByEntryAction(OneSignal.AppEntryAction appEntryAction) {
        Intrinsics.checkNotNullParameter(appEntryAction, "entryAction");
        if (appEntryAction.isNotificationClick()) {
            return getNotificationChannelTracker();
        }
        return null;
    }

    public final List<OSChannelTracker> getChannelsToResetByEntryAction(OneSignal.AppEntryAction appEntryAction) {
        Intrinsics.checkNotNullParameter(appEntryAction, "entryAction");
        List<OSChannelTracker> arrayList = new ArrayList<>();
        if (appEntryAction.isAppClose()) {
            return arrayList;
        }
        OSChannelTracker notificationChannelTracker = appEntryAction.isAppOpen() ? getNotificationChannelTracker() : null;
        if (notificationChannelTracker != null) {
            arrayList.add(notificationChannelTracker);
        }
        arrayList.add(getIAMChannelTracker());
        return arrayList;
    }
}
