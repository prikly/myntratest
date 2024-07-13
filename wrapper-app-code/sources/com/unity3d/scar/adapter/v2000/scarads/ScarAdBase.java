package com.unity3d.scar.adapter.v2000.scarads;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.query.QueryInfo;
import com.unity3d.scar.adapter.common.GMAAdsError;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.scarads.IScarAd;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;

public abstract class ScarAdBase<T> implements IScarAd {
    protected T _adObj;
    protected IAdsErrorHandler _adsErrorHandler;
    protected Context _context;
    protected QueryInfo _queryInfo;
    protected ScarAdListener _scarAdListener;
    protected ScarAdMetadata _scarAdMetadata;

    /* access modifiers changed from: protected */
    public abstract void loadAdInternal(AdRequest adRequest, IScarLoadListener iScarLoadListener);

    public ScarAdBase(Context context, ScarAdMetadata scarAdMetadata, QueryInfo queryInfo, IAdsErrorHandler iAdsErrorHandler) {
        this._context = context;
        this._scarAdMetadata = scarAdMetadata;
        this._queryInfo = queryInfo;
        this._adsErrorHandler = iAdsErrorHandler;
    }

    public void setGmaAd(T t) {
        this._adObj = t;
    }

    public void loadAd(IScarLoadListener iScarLoadListener) {
        QueryInfo queryInfo = this._queryInfo;
        if (queryInfo != null) {
            AdRequest build = new AdRequest.Builder().setAdInfo(new AdInfo(queryInfo, this._scarAdMetadata.getAdString())).build();
            this._scarAdListener.setLoadListener(iScarLoadListener);
            loadAdInternal(build, iScarLoadListener);
            return;
        }
        this._adsErrorHandler.handleError(GMAAdsError.QueryNotFoundError(this._scarAdMetadata));
    }
}
