package io.bidmachine;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.text.TextUtils;
import com.explorestack.protobuf.ListValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.adcom.Context;
import com.explorestack.protobuf.adcom.DeviceType;
import com.explorestack.protobuf.adcom.OS;
import io.bidmachine.core.Utils;
import io.bidmachine.models.DataRestrictions;
import io.bidmachine.protobuf.RequestTokenPayload;
import io.bidmachine.utils.BluetoothUtils;
import io.bidmachine.utils.DeviceUtils;
import io.bidmachine.utils.ProtoUtils;
import java.util.Locale;
import java.util.Set;

final class DeviceParams {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    DeviceParams() {
    }

    /* access modifiers changed from: package-private */
    public void build(Context context, Context.Device.Builder builder, TargetingParams targetingParams, TargetingParams targetingParams2, DataRestrictions dataRestrictions) {
        DeviceType deviceType;
        DeviceInfo obtain = DeviceInfo.obtain(context);
        if (obtain.isTablet) {
            deviceType = DeviceType.DEVICE_TYPE_TABLET;
        } else {
            deviceType = DeviceType.DEVICE_TYPE_PHONE_DEVICE;
        }
        builder.setType(deviceType);
        builder.setOs(OS.OS_ANDROID);
        builder.setOsv(DeviceUtils.getOsVersion());
        builder.setPxratio(obtain.screenDensity);
        builder.setPpi(obtain.screenDpi);
        Point screenSize = Utils.getScreenSize(context);
        builder.setW(screenSize.x);
        builder.setH(screenSize.y);
        builder.setIfa(AdvertisingPersonalData.getAdvertisingId(context, !dataRestrictions.canSendIfa()));
        builder.setLmt(AdvertisingPersonalData.isLimitAdTrackingEnabled());
        if (dataRestrictions.canSendDeviceInfo()) {
            builder.setContype(DeviceUtils.getConnectionType(context));
            builder.setMake(DeviceUtils.getManufacturer());
            String userAgent = UserAgentProvider.getUserAgent(context);
            if (!TextUtils.isEmpty(userAgent)) {
                builder.setUa(userAgent);
            }
            if (obtain.model != null) {
                builder.setModel(obtain.model);
            }
            String hwv = obtain.getHWV();
            if (hwv != null) {
                builder.setHwv(hwv);
            }
            String language = Locale.getDefault().getLanguage();
            if (!TextUtils.isEmpty(language)) {
                builder.setLang(language);
            }
            if (obtain.phoneMCCMNC != null) {
                builder.setMccmnc(obtain.phoneMCCMNC);
            }
            if (obtain.phoneCarrier != null) {
                builder.setCarrier(obtain.phoneCarrier);
            }
        }
        if (dataRestrictions.canSendGeoPosition()) {
            builder.setGeo(ProtoUtils.createGeoBuilderWithLocation(context, targetingParams.getDeviceLocation(), targetingParams2.getDeviceLocation(), true));
        }
    }

    /* access modifiers changed from: package-private */
    public void fillDeviceExtension(android.content.Context context, Struct.Builder builder, DataRestrictions dataRestrictions) {
        String next;
        String deviceName;
        Set<String> inputLanguageSet = DeviceUtils.getInputLanguageSet(context);
        if (inputLanguageSet.size() > 0) {
            ListValue.Builder newBuilder = ListValue.newBuilder();
            for (String next2 : inputLanguageSet) {
                if (next2 != null) {
                    newBuilder.addValues(Value.newBuilder().setStringValue(next2).build());
                }
            }
            builder.putFields("inputlanguage", Value.newBuilder().setListValue(newBuilder.build()).build());
        }
        DeviceInfo obtain = DeviceInfo.obtain(context);
        Long availableDiskSpaceInMB = obtain.getAvailableDiskSpaceInMB();
        if (availableDiskSpaceInMB != null) {
            builder.putFields("diskspace", Value.newBuilder().setNumberValue((double) availableDiskSpaceInMB.longValue()).build());
        }
        Long totalDiskSpaceInMB = obtain.getTotalDiskSpaceInMB();
        if (totalDiskSpaceInMB != null) {
            builder.putFields("totaldisk", Value.newBuilder().setNumberValue((double) totalDiskSpaceInMB.longValue()).build());
        }
        Boolean isRingMuted = DeviceUtils.isRingMuted(context);
        double d2 = 0.0d;
        if (isRingMuted != null) {
            builder.putFields("ringmute", Value.newBuilder().setNumberValue(isRingMuted.booleanValue() ? 0.0d : 1.0d).build());
        }
        Boolean isCharging = DeviceUtils.isCharging(context);
        if (isCharging != null) {
            builder.putFields("charging", Value.newBuilder().setNumberValue(isCharging.booleanValue() ? 1.0d : 0.0d).build());
        }
        Boolean isHeadsetConnected = BluetoothUtils.isHeadsetConnected(context);
        if (isHeadsetConnected != null) {
            builder.putFields("headset", Value.newBuilder().setNumberValue(isHeadsetConnected.booleanValue() ? 1.0d : 0.0d).build());
        }
        Double batteryLevel = DeviceUtils.getBatteryLevel(context);
        if (batteryLevel != null) {
            builder.putFields("batterylevel", Value.newBuilder().setNumberValue(batteryLevel.doubleValue()).build());
        }
        Boolean isBatterySaverEnabled = DeviceUtils.isBatterySaverEnabled(context);
        if (isBatterySaverEnabled != null) {
            builder.putFields("batterysaver", Value.newBuilder().setNumberValue(isBatterySaverEnabled.booleanValue() ? 1.0d : 0.0d).build());
        }
        builder.putFields("darkmode", Value.newBuilder().setNumberValue(DeviceUtils.isDarkModeEnabled(context) ? 1.0d : 0.0d).build());
        Boolean isAirplaneModeOn = DeviceUtils.isAirplaneModeOn(context);
        if (isAirplaneModeOn != null) {
            builder.putFields("airplane", Value.newBuilder().setNumberValue(isAirplaneModeOn.booleanValue() ? 1.0d : 0.0d).build());
        }
        Boolean isDoNotDisturbOn = DeviceUtils.isDoNotDisturbOn(context);
        if (isDoNotDisturbOn != null) {
            builder.putFields("dnd", Value.newBuilder().setNumberValue(isDoNotDisturbOn.booleanValue() ? 1.0d : 0.0d).build());
        }
        if (dataRestrictions.canSendDeviceInfo() && (deviceName = DeviceUtils.getDeviceName(context)) != null) {
            builder.putFields("devicename", Value.newBuilder().setStringValue(deviceName).build());
        }
        builder.putFields("time", Value.newBuilder().setNumberValue((double) System.currentTimeMillis()).build());
        Double screenBrightnessRatio = DeviceUtils.getScreenBrightnessRatio(context);
        if (screenBrightnessRatio != null) {
            builder.putFields("screenbright", Value.newBuilder().setNumberValue(screenBrightnessRatio.doubleValue()).build());
        }
        Value.Builder newBuilder2 = Value.newBuilder();
        if (obtain.isDeviceRooted()) {
            d2 = 1.0d;
        }
        builder.putFields("jailbreak", newBuilder2.setNumberValue(d2).build());
        builder.putFields("lastbootup", Value.newBuilder().setNumberValue((double) SystemClock.elapsedRealtime()).build());
        Set<String> connectedHeadsets = BluetoothUtils.getConnectedHeadsets(context);
        if (!(connectedHeadsets == null || connectedHeadsets.size() <= 0 || (next = connectedHeadsets.iterator().next()) == null)) {
            builder.putFields("headsetname", Value.newBuilder().setStringValue(next).build());
        }
        Long totalRAMInB = obtain.getTotalRAMInB();
        if (totalRAMInB != null) {
            builder.putFields("totalmem", Value.newBuilder().setNumberValue((double) totalRAMInB.longValue()).build());
        }
    }

    /* access modifiers changed from: package-private */
    public void fillDeviceData(android.content.Context context, DataRestrictions dataRestrictions, RequestTokenPayload.DeviceData.Builder builder) {
        String next;
        String deviceName;
        DeviceInfo obtain = DeviceInfo.obtain(context);
        builder.setBmIfv(BidMachineImpl.get().obtainIFV(context));
        Set<String> inputLanguageSet = DeviceUtils.getInputLanguageSet(context);
        if (inputLanguageSet.size() > 0) {
            builder.addAllInputlanguage(inputLanguageSet);
        }
        Long availableDiskSpaceInMB = obtain.getAvailableDiskSpaceInMB();
        if (availableDiskSpaceInMB != null) {
            builder.setDiskspace((long) availableDiskSpaceInMB.intValue());
        }
        Long totalDiskSpaceInMB = obtain.getTotalDiskSpaceInMB();
        if (totalDiskSpaceInMB != null) {
            builder.setTotaldisk((long) totalDiskSpaceInMB.intValue());
        }
        Boolean isRingMuted = DeviceUtils.isRingMuted(context);
        if (isRingMuted != null) {
            builder.setRingmute(isRingMuted.booleanValue());
        }
        Boolean isCharging = DeviceUtils.isCharging(context);
        if (isCharging != null) {
            builder.setCharging(isCharging.booleanValue());
        }
        Boolean isHeadsetConnected = BluetoothUtils.isHeadsetConnected(context);
        if (isHeadsetConnected != null) {
            builder.setHeadset(isHeadsetConnected.booleanValue());
        }
        Double batteryLevel = DeviceUtils.getBatteryLevel(context);
        if (batteryLevel != null) {
            builder.setBatterylevel(batteryLevel.floatValue());
        }
        Boolean isBatterySaverEnabled = DeviceUtils.isBatterySaverEnabled(context);
        if (isBatterySaverEnabled != null) {
            builder.setBatterysaver(isBatterySaverEnabled.booleanValue());
        }
        builder.setDarkmode(DeviceUtils.isDarkModeEnabled(context));
        Boolean isAirplaneModeOn = DeviceUtils.isAirplaneModeOn(context);
        if (isAirplaneModeOn != null) {
            builder.setAirplane(isAirplaneModeOn.booleanValue());
        }
        Boolean isDoNotDisturbOn = DeviceUtils.isDoNotDisturbOn(context);
        if (isDoNotDisturbOn != null) {
            builder.setDnd(isDoNotDisturbOn.booleanValue());
        }
        if (dataRestrictions.canSendDeviceInfo() && (deviceName = DeviceUtils.getDeviceName(context)) != null) {
            builder.setDevicename(deviceName);
        }
        builder.setTime(System.currentTimeMillis());
        Double screenBrightnessRatio = DeviceUtils.getScreenBrightnessRatio(context);
        if (screenBrightnessRatio != null) {
            builder.setScreenbright(screenBrightnessRatio.floatValue());
        }
        builder.setJailbreak(obtain.isDeviceRooted());
        builder.setLastbootup(SystemClock.elapsedRealtime());
        Set<String> connectedHeadsets = BluetoothUtils.getConnectedHeadsets(context);
        if (!(connectedHeadsets == null || connectedHeadsets.size() <= 0 || (next = connectedHeadsets.iterator().next()) == null)) {
            builder.setHeadsetname(next);
        }
        Long totalRAMInB = obtain.getTotalRAMInB();
        if (totalRAMInB != null) {
            builder.setTotalmem(totalRAMInB.longValue());
        }
    }
}
