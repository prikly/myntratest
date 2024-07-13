package io.bidmachine.displays;

import android.graphics.Color;
import android.text.TextUtils;
import com.explorestack.iab.utils.IabElementStyle;
import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.adcom.Ad;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.utils.IabUtils;
import java.util.HashMap;
import java.util.Map;

abstract class IabAdObjectParams extends AdObjectParams implements UnifiedMediationParams.MappedUnifiedMediationParams.DataProvider {
    private final UnifiedMediationParams mediationParams = new UnifiedMediationParams.MappedUnifiedMediationParams(this);
    private Map<String, Object> params;

    IabAdObjectParams(Ad ad) {
        super(ad);
        getData().put(IabUtils.KEY_CREATIVE_ID, ad.getId());
    }

    public Map<String, Object> getData() {
        if (this.params == null) {
            this.params = new HashMap();
        }
        return this.params;
    }

    /* access modifiers changed from: protected */
    public void prepareExtensions(AdExtension adExtension) {
        super.prepareExtensions(adExtension);
        getData().put(IabUtils.KEY_USE_NATIVE_CLOSE, Boolean.valueOf(adExtension.getUseNativeClose()));
        getData().put(IabUtils.KEY_CACHE_CONTROL, IabUtils.toCacheControl(adExtension.getCreativeLoadingMethod()));
        getData().put(IabUtils.KEY_PLACEHOLDER_TIMEOUT_SEC, Float.valueOf(adExtension.getPlaceholderTimeout()));
        getData().put(IabUtils.KEY_SKIP_OFFSET, Integer.valueOf(adExtension.getSkipoffset()));
        getData().put(IabUtils.KEY_COMPANION_SKIP_OFFSET, Integer.valueOf(adExtension.getCompanionSkipoffset()));
        getData().put(IabUtils.KEY_R1, Boolean.valueOf(adExtension.getR1()));
        getData().put(IabUtils.KEY_R2, Boolean.valueOf(adExtension.getR2()));
        getData().put(IabUtils.KEY_STORE_URL, adExtension.getStoreUrl());
        getData().put(IabUtils.KEY_PROGRESS_DURATION, Integer.valueOf(adExtension.getProgressDuration()));
        IabElementStyle transform = transform(adExtension.getCloseButton());
        if (transform != null) {
            getData().put(IabUtils.KEY_CLOSABLE_VIEW_STYLE, transform);
        }
        IabElementStyle transform2 = transform(adExtension.getCountdown());
        if (transform2 != null) {
            getData().put(IabUtils.KEY_COUNTDOWN_STYLE, transform2);
        }
        IabElementStyle transform3 = transform(adExtension.getProgress());
        if (transform3 != null) {
            getData().put(IabUtils.KEY_PROGRESS_STYLE, transform3);
        }
    }

    /* access modifiers changed from: protected */
    public void prepareExtensions(Map<String, Value> map) {
        super.prepareExtensions(map);
        Value value = map.get(IabUtils.KEY_OM_SDK_ENABLED);
        if (value != null) {
            getData().put(IabUtils.KEY_OM_SDK_ENABLED, Boolean.valueOf(value.getBoolValue()));
        }
    }

    public void setWidth(int i) {
        getData().put(IabUtils.KEY_WIDTH, Integer.valueOf(i));
    }

    public void setHeight(int i) {
        getData().put(IabUtils.KEY_HEIGHT, Integer.valueOf(i));
    }

    /* access modifiers changed from: package-private */
    public void setCreativeAdm(String str) {
        getData().put(IabUtils.KEY_CREATIVE_ADM, str);
    }

    public boolean isValid() {
        Object obj = this.params.get(IabUtils.KEY_CREATIVE_ADM);
        return (obj instanceof String) && !TextUtils.isEmpty((CharSequence) obj);
    }

    public UnifiedMediationParams toMediationParams() {
        return this.mediationParams;
    }

    /* access modifiers changed from: package-private */
    public IabElementStyle transform(AdExtension.ControlAsset controlAsset) {
        if (controlAsset == null) {
            return null;
        }
        try {
            IabElementStyle iabElementStyle = new IabElementStyle();
            iabElementStyle.setMargin(controlAsset.getMargin());
            iabElementStyle.setPadding(controlAsset.getPadding());
            iabElementStyle.setContent(controlAsset.getContent());
            iabElementStyle.setFillColor(parseColor(controlAsset.getFill()));
            iabElementStyle.setFontStyle(Integer.valueOf(controlAsset.getFontStyle()));
            iabElementStyle.setWidth(Integer.valueOf(controlAsset.getWidth()));
            iabElementStyle.setHeight(Integer.valueOf(controlAsset.getHeight()));
            iabElementStyle.setHideAfter(Float.valueOf((float) controlAsset.getHideafter()));
            iabElementStyle.setHorizontalPosition(parseHorizontalPosition(controlAsset.getX()));
            iabElementStyle.setVerticalPosition(parseVerticalPosition(controlAsset.getY()));
            iabElementStyle.setOpacity(Float.valueOf(controlAsset.getOpacity()));
            iabElementStyle.setOutlined(Boolean.valueOf(controlAsset.getOutlined()));
            iabElementStyle.setStrokeColor(parseColor(controlAsset.getStroke()));
            iabElementStyle.setStrokeWidth(Float.valueOf(controlAsset.getStrokeWidth()));
            iabElementStyle.setStyle(controlAsset.getStyle());
            iabElementStyle.setVisible(Boolean.valueOf(controlAsset.getVisible()));
            return iabElementStyle;
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public Integer parseColor(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public Integer parseHorizontalPosition(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1364013995) {
            if (hashCode != 3317767) {
                if (hashCode == 108511772 && str.equals("right")) {
                    c2 = 1;
                }
            } else if (str.equals("left")) {
                c2 = 0;
            }
        } else if (str.equals("center")) {
            c2 = 2;
        }
        if (c2 == 0) {
            return 3;
        }
        if (c2 == 1) {
            return 5;
        }
        if (c2 != 2) {
            return null;
        }
        return 1;
    }

    /* access modifiers changed from: package-private */
    public Integer parseVerticalPosition(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1383228885) {
            if (hashCode != -1364013995) {
                if (hashCode == 115029 && str.equals("top")) {
                    c2 = 0;
                }
            } else if (str.equals("center")) {
                c2 = 2;
            }
        } else if (str.equals("bottom")) {
            c2 = 1;
        }
        if (c2 == 0) {
            return 48;
        }
        if (c2 == 1) {
            return 80;
        }
        if (c2 != 2) {
            return null;
        }
        return 16;
    }
}
