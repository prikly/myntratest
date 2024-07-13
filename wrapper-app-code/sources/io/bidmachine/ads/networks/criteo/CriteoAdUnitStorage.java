package io.bidmachine.ads.networks.criteo;

import android.text.TextUtils;
import com.criteo.publisher.model.AdSize;
import com.criteo.publisher.model.AdUnit;
import com.criteo.publisher.model.BannerAdUnit;
import com.criteo.publisher.model.InterstitialAdUnit;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkConfigParams;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ms.bd.o.Pgl.c;

class CriteoAdUnitStorage {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Map<String, AdUnit> adUnitMap = new HashMap();

    CriteoAdUnitStorage() {
    }

    static List<AdUnit> extractAdUnits(NetworkConfigParams networkConfigParams) {
        List<Map> list;
        Object obj;
        EnumMap<AdsFormat, List<Map<String, String>>> obtainNetworkMediationConfigs = networkConfigParams.obtainNetworkMediationConfigs(AdsFormat.values());
        if (obtainNetworkMediationConfigs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : obtainNetworkMediationConfigs.entrySet()) {
            AdsFormat adsFormat = (AdsFormat) next.getKey();
            if (!(adsFormat == null || (list = (List) next.getValue()) == null)) {
                for (Map map : list) {
                    String str = (String) map.get("ad_unit_id");
                    if (!TextUtils.isEmpty(str)) {
                        switch (AnonymousClass1.$SwitchMap$io$bidmachine$AdsFormat[adsFormat.ordinal()]) {
                            case 1:
                            case 2:
                                obj = new BannerAdUnit(str, new AdSize(320, 50));
                                break;
                            case 3:
                                obj = new BannerAdUnit(str, new AdSize(c.COLLECT_MODE_FINANCE, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED));
                                break;
                            case 4:
                                obj = new BannerAdUnit(str, new AdSize(728, 90));
                                break;
                            case 5:
                            case 6:
                            case 7:
                                obj = new InterstitialAdUnit(str);
                                break;
                            default:
                                obj = null;
                                break;
                        }
                        if (obj != null) {
                            adUnitMap.put(str, obj);
                            arrayList.add(obj);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: io.bidmachine.ads.networks.criteo.CriteoAdUnitStorage$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$AdsFormat;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                io.bidmachine.AdsFormat[] r0 = io.bidmachine.AdsFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$io$bidmachine$AdsFormat = r0
                io.bidmachine.AdsFormat r1 = io.bidmachine.AdsFormat.Banner     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$io$bidmachine$AdsFormat     // Catch:{ NoSuchFieldError -> 0x001d }
                io.bidmachine.AdsFormat r1 = io.bidmachine.AdsFormat.Banner_320x50     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$io$bidmachine$AdsFormat     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.bidmachine.AdsFormat r1 = io.bidmachine.AdsFormat.Banner_300x250     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$io$bidmachine$AdsFormat     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.bidmachine.AdsFormat r1 = io.bidmachine.AdsFormat.Banner_728x90     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$io$bidmachine$AdsFormat     // Catch:{ NoSuchFieldError -> 0x003e }
                io.bidmachine.AdsFormat r1 = io.bidmachine.AdsFormat.Interstitial     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$io$bidmachine$AdsFormat     // Catch:{ NoSuchFieldError -> 0x0049 }
                io.bidmachine.AdsFormat r1 = io.bidmachine.AdsFormat.InterstitialStatic     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$io$bidmachine$AdsFormat     // Catch:{ NoSuchFieldError -> 0x0054 }
                io.bidmachine.AdsFormat r1 = io.bidmachine.AdsFormat.InterstitialVideo     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.ads.networks.criteo.CriteoAdUnitStorage.AnonymousClass1.<clinit>():void");
        }
    }

    static AdUnit getAdUnit(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return adUnitMap.get(str);
    }

    static Map<String, AdUnit> getAdUnitMap() {
        return adUnitMap;
    }
}
