package io.bidmachine;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public interface NetworkConfigParams {
    EnumMap<AdsFormat, List<Map<String, String>>> obtainNetworkMediationConfigs(AdsFormat... adsFormatArr);

    Map<String, String> obtainNetworkParams();
}
