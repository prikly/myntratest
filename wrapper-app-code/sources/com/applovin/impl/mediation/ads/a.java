package com.applovin.impl.mediation.ads;

import android.app.Activity;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.l;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public abstract class a {
    protected final MaxAdFormat adFormat;
    protected MaxAdListener adListener;
    protected MaxAdReviewListener adReviewListener;
    protected final String adUnitId;
    protected final Map<String, Object> extraParameters = Collections.synchronizedMap(CollectionUtils.map());
    protected final Map<String, Object> localExtraParameters = Collections.synchronizedMap(CollectionUtils.map());
    protected final v logger;
    protected MaxAdRequestListener requestListener;
    protected MaxAdRevenueListener revenueListener;
    protected final n sdk;
    protected final String tag;

    /* renamed from: com.applovin.impl.mediation.ads.a$a  reason: collision with other inner class name */
    public interface C0141a extends MaxAdListener, MaxAdRequestListener, MaxAdRevenueListener {
    }

    protected a(String str, MaxAdFormat maxAdFormat, String str2, n nVar) {
        this.adUnitId = str;
        this.adFormat = maxAdFormat;
        this.sdk = nVar;
        this.tag = str2;
        this.logger = nVar.D();
    }

    public static void logApiCall(String str, String str2) {
        if (n.f15597a != null) {
            n.f15597a.D();
            if (v.a()) {
                n.f15597a.D().b(str, str2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(com.applovin.impl.mediation.a.a aVar) {
        l lVar = new l();
        lVar.a().a("MAX Ad").a(aVar).a();
        if (v.a()) {
            this.logger.b(this.tag, lVar.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void destroy() {
        this.localExtraParameters.clear();
        this.adListener = null;
        this.revenueListener = null;
        this.requestListener = null;
        this.adReviewListener = null;
    }

    public String getAdUnitId() {
        return this.adUnitId;
    }

    public void logApiCall(String str) {
        if (v.a()) {
            this.logger.b(this.tag, str);
        }
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        if (v.a()) {
            v vVar = this.logger;
            String str = this.tag;
            vVar.b(str, "Setting Ad Review creative id listener: " + maxAdReviewListener);
        }
        this.adReviewListener = maxAdReviewListener;
    }

    public void setExtraParameter(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        } else if (!Utils.isPubInDebugMode(this.sdk.P(), this.sdk) || (!"amazon_ad_response".equals(str) && !"amazon_ad_error".equals(str))) {
            if (this.adFormat.isAdViewAd() && "ad_refresh_seconds".equals(str) && StringUtils.isValidString(str2)) {
                int parseInt = Integer.parseInt(str2);
                if (((long) parseInt) > TimeUnit.MINUTES.toSeconds(2)) {
                    String str3 = this.tag;
                    v.i(str3, "Attempting to set extra parameter \"ad_refresh_seconds\" to over 2 minutes (" + parseInt + "s) - this will be ignored");
                }
            }
            this.extraParameters.put(str, str2);
        } else {
            throw new IllegalArgumentException("`setExtraParameter()` is an incorrect method for passing `amazon_ad_response` or `amazon_ad_error`. Please use the following method: `setLocalExtraParameter()`. Also note that this exception occurs in development builds only.");
        }
    }

    public void setListener(MaxAdListener maxAdListener) {
        if (v.a()) {
            v vVar = this.logger;
            String str = this.tag;
            vVar.b(str, "Setting listener: " + maxAdListener);
        }
        this.adListener = maxAdListener;
    }

    public void setLocalExtraParameter(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        } else if (!(obj instanceof Activity)) {
            if ("amazon_ad_response".equals(str) || "amazon_ad_error".equals(str)) {
                setExtraParameter("is_amazon_integration", Boolean.toString(true));
            }
            this.localExtraParameters.put(str, obj);
        } else if (v.a()) {
            this.logger.e(this.tag, "Ignoring setting local extra parameter to Activity instance - please pass a WeakReference of it instead!");
        }
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        if (v.a()) {
            v vVar = this.logger;
            String str = this.tag;
            vVar.b(str, "Setting request listener: " + maxAdRequestListener);
        }
        this.requestListener = maxAdRequestListener;
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        if (v.a()) {
            v vVar = this.logger;
            String str = this.tag;
            vVar.b(str, "Setting revenue listener: " + maxAdRevenueListener);
        }
        this.revenueListener = maxAdRevenueListener;
    }
}
