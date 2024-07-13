package io.bidmachine.utils;

import android.location.Location;
import com.explorestack.protobuf.adcom.Context;
import com.explorestack.protobuf.adcom.LocationType;
import com.explorestack.protobuf.adcom.Placement;
import io.bidmachine.banner.BannerSize;
import io.bidmachine.core.Utils;

public class ProtoUtils {
    public static boolean isBannerPlacement(Placement placement, BannerSize bannerSize) {
        Placement.DisplayPlacement display = placement.getDisplay();
        return !display.getInstl() && bannerSize.width == display.getW() && bannerSize.height == display.getH();
    }

    public static boolean isInterstitialPlacement(Placement placement) {
        if (isRewardedPlacement(placement)) {
            return false;
        }
        Placement.DisplayPlacement display = placement.getDisplay();
        if (display == Placement.DisplayPlacement.getDefaultInstance() || !display.getInstl()) {
            return isVideoPlacement(placement);
        }
        return true;
    }

    public static boolean isVideoPlacement(Placement placement) {
        return placement.getVideo() != Placement.VideoPlacement.getDefaultInstance();
    }

    public static boolean isRewardedPlacement(Placement placement) {
        return placement.getReward();
    }

    public static boolean isNativePlacement(Placement placement) {
        return placement.getDisplay().getNativefmt().getAssetCount() > 0;
    }

    public static Context.Geo.Builder createGeoBuilderWithLocation(android.content.Context context, Location location, Location location2, boolean z) {
        Context.Geo.Builder newBuilder = Context.Geo.newBuilder();
        fillGeoBuilder(newBuilder, Utils.getBestLocation(context, location, location2), z);
        return newBuilder;
    }

    public static void fillGeoBuilder(Context.Geo.Builder builder, Location location, boolean z) {
        if (z) {
            builder.setUtcoffset(Utils.getUtcOffsetMinutes());
        }
        if (location != null) {
            builder.setType(getLocationType(location));
            builder.setLat((float) location.getLatitude());
            builder.setLon((float) location.getLongitude());
            builder.setAccur((int) location.getAccuracy());
            builder.setLastfix(location.getTime());
        }
    }

    public static LocationType getLocationType(Location location) {
        if (location != null) {
            if ("gps".equals(location.getProvider())) {
                return LocationType.LOCATION_TYPE_GPS;
            }
            if ("network".equals(location.getProvider()) || "passive".equals(location.getProvider())) {
                return LocationType.LOCATION_TYPE_IP;
            }
        }
        return LocationType.LOCATION_TYPE_INVALID;
    }
}
