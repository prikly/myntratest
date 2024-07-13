package com.appsgeyser.sdk.ads.behavior;

import com.appsgeyser.sdk.ads.behavior.bannerBehaviors.BannerHeightBehavior;
import com.appsgeyser.sdk.ads.behavior.bannerBehaviors.BannerWidthBehavior;
import com.appsgeyser.sdk.ads.behavior.loaderBehaviors.LoaderClickBehavior;
import com.appsgeyser.sdk.ads.behavior.loaderBehaviors.LoaderHideTimeoutBehavior;
import com.appsgeyser.sdk.ads.behavior.loaderBehaviors.LoaderRefreshTimeoutBehavior;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BehaviorFactory {
    private final String[] POSTLOAD_BEHAVIORS = {"APPAD-HideTimeout", "APPAD-BannerWidth", "APPAD-BannerHeight", "APPAD-ClickBehaviour", "APPAD-RefreshTimeout"};

    public enum ClickBehavior {
        HIDE,
        REMAIN_ON_SCREEN
    }

    public List<BehaviorVisitor> createPostloadBehaviors(Map<String, List<String>> map) {
        return createBehaviors(this.POSTLOAD_BEHAVIORS, map);
    }

    private List<BehaviorVisitor> createBehaviors(String[] strArr, Map<String, List<String>> map) {
        BehaviorVisitor createVisitor;
        ArrayList arrayList = new ArrayList();
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                if (!(str == null || !isInArray(strArr, str) || (createVisitor = createVisitor(next)) == null)) {
                    arrayList.add(createVisitor);
                }
            }
        }
        return arrayList;
    }

    private boolean isInArray(String[] strArr, String str) {
        for (String lowerCase : strArr) {
            if (lowerCase.toLowerCase().equals(str.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    private BehaviorVisitor createVisitor(Map.Entry<String, List<String>> entry) {
        BehaviorVisitor loaderRefreshTimeoutBehavior;
        try {
            String lowerCase = entry.getKey().toLowerCase();
            String lowerCase2 = ((String) entry.getValue().get(0)).toLowerCase();
            if (lowerCase.equalsIgnoreCase("APPAD-HideTimeout")) {
                loaderRefreshTimeoutBehavior = new LoaderHideTimeoutBehavior(Float.parseFloat(lowerCase2));
            } else if (lowerCase.equalsIgnoreCase("APPAD-BannerWidth")) {
                loaderRefreshTimeoutBehavior = new BannerWidthBehavior(Integer.parseInt(lowerCase2));
            } else if (lowerCase.equalsIgnoreCase("APPAD-BannerHeight")) {
                loaderRefreshTimeoutBehavior = new BannerHeightBehavior(Integer.parseInt(lowerCase2));
            } else if (lowerCase.equalsIgnoreCase("APPAD-ClickBehaviour")) {
                ClickBehavior clickBehavior = ClickBehavior.HIDE;
                if (lowerCase2.equalsIgnoreCase("remainOnScreen")) {
                    clickBehavior = ClickBehavior.REMAIN_ON_SCREEN;
                }
                return new LoaderClickBehavior(clickBehavior);
            } else if (!lowerCase.equalsIgnoreCase("APPAD-RefreshTimeout")) {
                return null;
            } else {
                loaderRefreshTimeoutBehavior = new LoaderRefreshTimeoutBehavior(Float.parseFloat(lowerCase2));
            }
            return loaderRefreshTimeoutBehavior;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
