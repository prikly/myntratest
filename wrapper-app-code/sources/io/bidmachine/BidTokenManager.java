package io.bidmachine;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.protobuf.RequestTokenPayload;
import io.bidmachine.utils.BMError;

class BidTokenManager {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    BidTokenManager() {
    }

    static String createBidToken(Context context) {
        RequestTokenPayload createRequestTokenPayload = createRequestTokenPayload(context);
        if (createRequestTokenPayload == null) {
            sendFailEvent();
            return "";
        }
        try {
            String encodeToString = Base64.encodeToString(createRequestTokenPayload.toByteArray(), 2);
            sendSuccessEvent();
            return encodeToString;
        } catch (Exception unused) {
            sendFailEvent();
            return "";
        }
    }

    private static RequestTokenPayload createRequestTokenPayload(Context context) {
        try {
            BidMachineImpl bidMachineImpl = BidMachineImpl.get();
            RequestTokenPayload.Builder newBuilder = RequestTokenPayload.newBuilder();
            RequestTokenPayload.AppData.Builder newBuilder2 = RequestTokenPayload.AppData.newBuilder();
            String appName = Utils.getAppName(context);
            if (!TextUtils.isEmpty(appName)) {
                newBuilder2.setAppName(appName);
            }
            String appVersion = Utils.getAppVersion(context);
            if (!TextUtils.isEmpty(appVersion)) {
                newBuilder2.setAppVer(appVersion);
            }
            newBuilder.setAppData(newBuilder2);
            RequestTokenPayload.UserData.Builder createUserDataBuilder = createUserDataBuilder(bidMachineImpl);
            if (createUserDataBuilder != null) {
                newBuilder.setUserData(createUserDataBuilder);
            }
            newBuilder.setPlacementData(RequestTokenPayload.PlacementData.newBuilder().setSdk(BidMachine.NAME).setSdkver("2.1.5"));
            RequestTokenPayload.DeviceData.Builder createDeviceDataBuilder = createDeviceDataBuilder(context, bidMachineImpl);
            if (createDeviceDataBuilder != null) {
                newBuilder.setDeviceData(createDeviceDataBuilder);
            }
            RequestTokenPayload.SessionData.Builder createSessionDataBuilder = createSessionDataBuilder();
            if (createSessionDataBuilder != null) {
                newBuilder.setSessionData(createSessionDataBuilder);
            }
            return newBuilder.build();
        } catch (Throwable th) {
            Logger.log(th);
            return null;
        }
    }

    private static RequestTokenPayload.UserData.Builder createUserDataBuilder(BidMachineImpl bidMachineImpl) {
        try {
            UserRestrictionParams userRestrictionParams = bidMachineImpl.getUserRestrictionParams();
            RequestTokenPayload.UserData.Builder newBuilder = RequestTokenPayload.UserData.newBuilder();
            userRestrictionParams.fill(newBuilder);
            return newBuilder;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static RequestTokenPayload.DeviceData.Builder createDeviceDataBuilder(Context context, BidMachineImpl bidMachineImpl) {
        try {
            DeviceParams deviceParams = bidMachineImpl.getDeviceParams();
            UserRestrictionParams userRestrictionParams = bidMachineImpl.getUserRestrictionParams();
            RequestTokenPayload.DeviceData.Builder newBuilder = RequestTokenPayload.DeviceData.newBuilder();
            deviceParams.fillDeviceData(context, userRestrictionParams, newBuilder);
            return newBuilder;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static RequestTokenPayload.SessionData.Builder createSessionDataBuilder() {
        try {
            SessionManager sessionManager = SessionManager.get();
            RequestTokenPayload.SessionData.Builder sessionduration = RequestTokenPayload.SessionData.newBuilder().setSessionId(sessionManager.getSessionId()).setSessionduration((long) sessionManager.getSessionDuration());
            for (AdsType adsType : AdsType.values()) {
                RequestTokenPayload.SessionData.SessionPlacementData.Builder newBuilder = RequestTokenPayload.SessionData.SessionPlacementData.newBuilder();
                sessionManager.getSessionAdParams(adsType).fillSessionPlacementData(newBuilder);
                sessionduration.putSessionPlacementData(adsType.getName(), newBuilder.build());
            }
            return sessionduration;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void sendSuccessEvent() {
        BidMachineEvents.eventFinish(new SimpleTrackingObject(), TrackEventType.GetBidToken, (AdsType) null, (BMError) null);
    }

    private static void sendFailEvent() {
        BidMachineEvents.eventFinish(new SimpleTrackingObject(), TrackEventType.GetBidToken, (AdsType) null, BMError.notFound("BidToken"));
    }
}
