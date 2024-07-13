package io.bidmachine.models;

import io.bidmachine.CreativeFormat;
import java.util.Map;

public interface AuctionResult {
    String[] getAdDomains();

    String getCid();

    CreativeFormat getCreativeFormat();

    String getCreativeId();

    Map<String, String> getCustomParams();

    String getDeal();

    String getDemandSource();

    String getId();

    String getNetworkKey();

    Map<String, String> getNetworkParams();

    double getPrice();
}
