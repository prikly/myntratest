package com.applovin.impl.mediation.debugger.a;

import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.applovin.mediation.MaxAdFormat;
import java.util.Arrays;
import java.util.List;

public class a implements DTBAdCallback {

    /* renamed from: a  reason: collision with root package name */
    private final MaxAdFormat f14653a;

    /* renamed from: b  reason: collision with root package name */
    private final C0145a f14654b;

    /* renamed from: c  reason: collision with root package name */
    private DTBAdRequest f14655c;

    /* renamed from: com.applovin.impl.mediation.debugger.a.a$a  reason: collision with other inner class name */
    public interface C0145a {
        void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat);

        void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat);
    }

    public a(b bVar, MaxAdFormat maxAdFormat, C0145a aVar) {
        this((List<?>) Arrays.asList(new DTBAdSize[]{bVar.a()}), maxAdFormat, aVar);
    }

    public a(List<?> list, MaxAdFormat maxAdFormat, C0145a aVar) {
        this.f14653a = maxAdFormat;
        this.f14654b = aVar;
        try {
            DTBAdSize[] dTBAdSizeArr = new DTBAdSize[list.size()];
            for (int i = 0; i < list.size(); i++) {
                Object obj = list.get(i);
                if (obj instanceof DTBAdSize) {
                    dTBAdSizeArr[i] = (DTBAdSize) obj;
                }
            }
            DTBAdRequest dTBAdRequest = new DTBAdRequest();
            this.f14655c = dTBAdRequest;
            dTBAdRequest.setSizes(dTBAdSizeArr);
        } catch (Throwable unused) {
        }
    }

    public void a() {
        DTBAdRequest dTBAdRequest = this.f14655c;
        if (dTBAdRequest == null) {
            this.f14654b.onAdLoadFailed((AdError) null, this.f14653a);
        } else {
            dTBAdRequest.loadAd(this);
        }
    }

    public void onFailure(AdError adError) {
        this.f14654b.onAdLoadFailed(adError, this.f14653a);
    }

    public void onSuccess(DTBAdResponse dTBAdResponse) {
        this.f14654b.onAdResponseLoaded(dTBAdResponse, this.f14653a);
    }
}
