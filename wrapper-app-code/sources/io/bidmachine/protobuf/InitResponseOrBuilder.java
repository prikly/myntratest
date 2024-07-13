package io.bidmachine.protobuf;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.adcom.Ad;
import java.util.List;
import java.util.Map;

public interface InitResponseOrBuilder extends MessageOrBuilder {
    boolean containsAdCachePlacementControl(String str);

    AdCacheControl getAdCacheControl();

    int getAdCacheControlValue();

    int getAdCacheMaxAge();

    @Deprecated
    Map<String, AdCachePlacementControl> getAdCachePlacementControl();

    int getAdCachePlacementControlCount();

    Map<String, AdCachePlacementControl> getAdCachePlacementControlMap();

    AdCachePlacementControl getAdCachePlacementControlOrDefault(String str, AdCachePlacementControl adCachePlacementControl);

    AdCachePlacementControl getAdCachePlacementControlOrThrow(String str);

    AdNetwork getAdNetworks(int i);

    int getAdNetworksCount();

    List<AdNetwork> getAdNetworksList();

    int getAdNetworksLoadingTimeout();

    AdNetworkOrBuilder getAdNetworksOrBuilder(int i);

    List<? extends AdNetworkOrBuilder> getAdNetworksOrBuilderList();

    int getAdRequestTmax();

    String getEndpoint();

    ByteString getEndpointBytes();

    Ad.Event getEvent(int i);

    int getEventCount();

    List<Ad.Event> getEventList();

    Ad.EventOrBuilder getEventOrBuilder(int i);

    List<? extends Ad.EventOrBuilder> getEventOrBuilderList();

    SdkAnalyticConfig getSdkAnalyticConfig();

    SdkAnalyticConfigOrBuilder getSdkAnalyticConfigOrBuilder();

    int getSessionResetAfter();

    boolean hasSdkAnalyticConfig();
}
