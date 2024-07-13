package io.bidmachine;

import android.text.TextUtils;
import io.bidmachine.core.Utils;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.utils.DeviceUtils;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class NetworkConfig {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final String CONFIG_ORIENTATION = "orientation";
    private Map<String, String> baseMediationConfig;
    private AdsType[] mergedAdsTypes;
    private final NetworkConfigParams networkConfigParams = new NetworkConfigParams() {
        public Map<String, String> obtainNetworkParams() {
            if (NetworkConfig.this.networkParams != null) {
                return new HashMap(NetworkConfig.this.networkParams);
            }
            return null;
        }

        public EnumMap<AdsFormat, List<Map<String, String>>> obtainNetworkMediationConfigs(AdsFormat... adsFormatArr) {
            ArrayList arrayList;
            List list;
            if (adsFormatArr == null || adsFormatArr.length <= 0) {
                return null;
            }
            EnumMap<AdsFormat, List<Map<String, String>>> enumMap = null;
            for (AdsFormat adsFormat : adsFormatArr) {
                if (NetworkConfig.this.typedMediationConfigs == null || (list = (List) NetworkConfig.this.typedMediationConfigs.get(adsFormat)) == null) {
                    arrayList = null;
                } else {
                    arrayList = null;
                    for (int i = 0; i < list.size(); i++) {
                        Map map = (Map) list.get(i);
                        Map access$200 = map != null ? NetworkConfig.this.prepareTypedMediationConfig(map) : null;
                        if (access$200 != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(access$200);
                        }
                    }
                }
                if (arrayList != null) {
                    if (enumMap == null) {
                        enumMap = new EnumMap<>(AdsFormat.class);
                    }
                    enumMap.put(adsFormat, arrayList);
                }
            }
            return enumMap;
        }
    };
    private final String networkKey;
    /* access modifiers changed from: private */
    public Map<String, String> networkParams;
    private AdsType[] supportedAdsTypes;
    /* access modifiers changed from: private */
    public EnumMap<AdsFormat, List<Map<String, String>>> typedMediationConfigs;

    /* access modifiers changed from: protected */
    public abstract NetworkAdapter createNetworkAdapter();

    /* access modifiers changed from: protected */
    public boolean useNetworkParamsAsMediationBase() {
        return true;
    }

    protected NetworkConfig(String str, Map<String, String> map) {
        this.networkKey = str;
        withNetworkParams(map);
    }

    public String getNetworkKey() {
        return this.networkKey;
    }

    public <T extends NetworkConfig> T withNetworkParams(Map<String, String> map) {
        this.networkParams = map;
        return this;
    }

    public <T extends NetworkConfig> T setNetworkParam(String str, String str2) {
        if (this.networkParams == null) {
            this.networkParams = new HashMap();
        }
        this.networkParams.put(str, str2);
        return this;
    }

    public <T extends NetworkConfig> T withBaseMediationConfig(Map<String, String> map) {
        this.baseMediationConfig = map;
        return this;
    }

    public <T extends NetworkConfig> T setBaseMediationParam(String str, String str2) {
        if (this.baseMediationConfig == null) {
            this.baseMediationConfig = new HashMap();
        }
        this.baseMediationConfig.put(str, str2);
        return this;
    }

    public <T extends NetworkConfig> T withMediationConfig(AdsFormat adsFormat, Map<String, String> map) {
        return withMediationConfig(adsFormat, map, (Orientation) null);
    }

    public <T extends NetworkConfig> T withMediationConfig(AdsFormat adsFormat, Map<String, String> map, Orientation orientation) {
        if (map == null) {
            EnumMap<AdsFormat, List<Map<String, String>>> enumMap = this.typedMediationConfigs;
            if (enumMap != null) {
                enumMap.remove(adsFormat);
            }
        } else {
            if (orientation != null) {
                map.put("orientation", orientation.toString().toLowerCase());
            }
            if (this.typedMediationConfigs == null) {
                this.typedMediationConfigs = new EnumMap<>(AdsFormat.class);
            }
            List list = this.typedMediationConfigs.get(adsFormat);
            if (list == null) {
                list = new ArrayList();
                this.typedMediationConfigs.put(adsFormat, list);
            }
            list.add(map);
        }
        return this;
    }

    public NetworkConfig forAdTypes(AdsType... adsTypeArr) {
        this.supportedAdsTypes = adsTypeArr;
        return this;
    }

    public <T extends UnifiedAdRequestParams> List<Map<String, String>> peekMediationConfig(AdsType adsType, T t, AdContentType adContentType) {
        List<Map> list;
        ArrayList arrayList = new ArrayList();
        EnumMap<AdsFormat, List<Map<String, String>>> enumMap = this.typedMediationConfigs;
        if (enumMap != null) {
            for (Map.Entry next : enumMap.entrySet()) {
                if (((AdsFormat) next.getKey()).isMatch(adsType, t, adContentType) && (list = (List) next.getValue()) != null) {
                    for (Map map : list) {
                        if (isOrientationMatched(map)) {
                            arrayList.add(map);
                        }
                    }
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, prepareTypedMediationConfig((Map) arrayList.get(i)));
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public boolean isOrientationMatched(Map<String, String> map) {
        if (map == null) {
            return true;
        }
        String str = map.get("orientation");
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            Orientation valueOf = Orientation.valueOf(Utils.capitalize(str));
            if (valueOf == Orientation.Undefined) {
                return true;
            }
            int orientation = DeviceUtils.getOrientation(BidMachineImpl.get().getAppContext());
            if (valueOf == Orientation.Portrait && orientation == 1) {
                return true;
            }
            if (valueOf == Orientation.Landscape && orientation == 2) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public AdsType[] getSupportedAdsTypes(NetworkAdapter networkAdapter) {
        if (this.mergedAdsTypes == null) {
            ArrayList arrayList = new ArrayList();
            for (AdsType adsType : networkAdapter.getSupportedTypes()) {
                AdsType[] adsTypeArr = this.supportedAdsTypes;
                if (adsTypeArr == null || contains(adsTypeArr, adsType)) {
                    arrayList.add(adsType);
                }
            }
            this.mergedAdsTypes = (AdsType[]) arrayList.toArray(new AdsType[0]);
        }
        return this.mergedAdsTypes;
    }

    /* access modifiers changed from: package-private */
    public NetworkConfigParams getNetworkConfigParams() {
        return this.networkConfigParams;
    }

    /* access modifiers changed from: private */
    public Map<String, String> prepareTypedMediationConfig(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        if (this.networkParams != null && useNetworkParamsAsMediationBase()) {
            hashMap.putAll(this.networkParams);
        }
        Map<String, String> map2 = this.baseMediationConfig;
        if (map2 != null) {
            hashMap.putAll(map2);
        }
        hashMap.putAll(map);
        return hashMap;
    }

    private boolean contains(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (obj2 == obj) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return getNetworkKey().equals(((NetworkConfig) obj).getNetworkKey());
    }

    public int hashCode() {
        return getNetworkKey().hashCode();
    }
}
