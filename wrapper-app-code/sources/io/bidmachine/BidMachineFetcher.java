package io.bidmachine;

import android.text.TextUtils;
import io.bidmachine.AdRequest;
import io.bidmachine.core.Logger;
import io.bidmachine.models.AuctionResult;
import io.bidmachine.utils.BMError;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class BidMachineFetcher {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String AD_TYPE_DISPLAY = "display";
    public static final String AD_TYPE_NATIVE = "native";
    public static final String AD_TYPE_VIDEO = "video";
    public static final String KEY_AD_TYPE = "bm_ad_type";
    public static final String KEY_ID = "bm_id";
    public static final String KEY_NETWORK_KEY = "bm_network_key";
    public static final String KEY_PRICE = "bm_pf";
    private static final BigDecimal PRICE_ROUNDING = new BigDecimal("0.01");
    private static final RoundingMode PRICE_ROUNDING_MODE = RoundingMode.CEILING;
    private static final String TAG = "BidMachineFetcher";
    static EnumMap<AdsType, Map<String, AdRequest>> cachedRequests = new EnumMap<>(AdsType.class);

    public static Map<String, String> fetch(AdRequest adRequest) {
        Logger.log(TAG, String.format("fetch - %s", new Object[]{adRequest}));
        Map<String, String> map = toMap(adRequest);
        String str = map.get(KEY_ID);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        AdsType adsType = adRequest.getAdsType();
        adRequest.addListener(new AdRequest.AdRequestListener() {
            public void onRequestFailed(AdRequest adRequest, BMError bMError) {
            }

            public void onRequestSuccess(AdRequest adRequest, AuctionResult auctionResult) {
            }

            public void onRequestExpired(AdRequest adRequest) {
                BidMachineFetcher.release(adRequest);
            }
        });
        synchronized (BidMachineFetcher.class) {
            Map map2 = cachedRequests.get(adsType);
            if (map2 == null) {
                map2 = new HashMap();
                cachedRequests.put(adsType, map2);
            }
            map2.put(str, adRequest);
        }
        return map;
    }

    public static <T extends AdRequest> T release(T t) {
        AuctionResult auctionResult = t.getAuctionResult();
        if (auctionResult != null) {
            return release(t.getAdsType(), auctionResult.getId());
        }
        return null;
    }

    public static <T extends AdRequest> T release(AdsType adsType, Map<String, String> map) {
        return release(adsType, map.get(KEY_ID));
    }

    public static <T extends AdRequest> T release(AdsType adsType, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Logger.log(TAG, String.format("release - %s", new Object[]{str}));
        synchronized (BidMachineFetcher.class) {
            Map map = cachedRequests.get(adsType);
            if (map == null) {
                return null;
            }
            try {
                T t = (AdRequest) map.remove(str);
                return t;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static Map<String, String> toMap(AdRequest adRequest) {
        Logger.log(TAG, String.format("toMap - %s", new Object[]{adRequest}));
        HashMap hashMap = new HashMap();
        AuctionResult auctionResult = adRequest.getAuctionResult();
        if (auctionResult == null) {
            return hashMap;
        }
        hashMap.put(KEY_ID, auctionResult.getId());
        hashMap.put(KEY_PRICE, roundPrice(auctionResult.getPrice()));
        hashMap.put(KEY_NETWORK_KEY, auctionResult.getNetworkKey());
        String identifyAdType = identifyAdType(auctionResult.getCreativeFormat());
        if (identifyAdType != null) {
            hashMap.put(KEY_AD_TYPE, identifyAdType);
        }
        hashMap.putAll(auctionResult.getCustomParams());
        return hashMap;
    }

    /* renamed from: io.bidmachine.BidMachineFetcher$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$CreativeFormat;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                io.bidmachine.CreativeFormat[] r0 = io.bidmachine.CreativeFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$io$bidmachine$CreativeFormat = r0
                io.bidmachine.CreativeFormat r1 = io.bidmachine.CreativeFormat.Banner     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$io$bidmachine$CreativeFormat     // Catch:{ NoSuchFieldError -> 0x001d }
                io.bidmachine.CreativeFormat r1 = io.bidmachine.CreativeFormat.Video     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$io$bidmachine$CreativeFormat     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.bidmachine.CreativeFormat r1 = io.bidmachine.CreativeFormat.Native     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.BidMachineFetcher.AnonymousClass2.<clinit>():void");
        }
    }

    static String identifyAdType(CreativeFormat creativeFormat) {
        if (creativeFormat == null) {
            return null;
        }
        int i = AnonymousClass2.$SwitchMap$io$bidmachine$CreativeFormat[creativeFormat.ordinal()];
        if (i == 1) {
            return AD_TYPE_DISPLAY;
        }
        if (i == 2) {
            return "video";
        }
        if (i != 3) {
            return null;
        }
        return "native";
    }

    private static String roundPrice(double d2) {
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(d2));
        if (PRICE_ROUNDING.signum() != 0) {
            bigDecimal = bigDecimal.divide(PRICE_ROUNDING, 0, PRICE_ROUNDING_MODE).multiply(PRICE_ROUNDING);
        }
        return bigDecimal.setScale(PRICE_ROUNDING.scale(), RoundingMode.HALF_UP).toString();
    }
}
