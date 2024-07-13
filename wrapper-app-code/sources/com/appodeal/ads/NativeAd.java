package com.appodeal.ads;

import android.content.Context;
import android.view.View;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003H&J\b\u0010\u001d\u001a\u00020\rH&J\b\u0010\u001e\u001a\u00020\u001fH&J\u0014\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0005¨\u0006\""}, d2 = {"Lcom/appodeal/ads/NativeAd;", "", "adProvider", "", "getAdProvider", "()Ljava/lang/String;", "ageRestrictions", "getAgeRestrictions", "callToAction", "getCallToAction", "description", "getDescription", "isPrecache", "", "()Z", "predictedEcpm", "", "getPredictedEcpm", "()D", "rating", "", "getRating", "()F", "title", "getTitle", "canShow", "context", "Landroid/content/Context;", "placementName", "containsVideo", "destroy", "", "getProviderView", "Landroid/view/View;", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface NativeAd {
    boolean canShow(Context context, String str);

    boolean containsVideo();

    void destroy();

    String getAdProvider();

    String getAgeRestrictions();

    String getCallToAction();

    String getDescription();

    double getPredictedEcpm();

    View getProviderView(Context context);

    float getRating();

    String getTitle();

    boolean isPrecache();
}
