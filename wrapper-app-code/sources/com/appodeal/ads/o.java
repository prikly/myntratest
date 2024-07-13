package com.appodeal.ads;

import com.appodeal.ads.l;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.r;
import com.appodeal.ads.utils.Log;
import org.json.JSONException;

public abstract class o<AdRequestType extends r, AdObjectType extends l> implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final AdRequestType f17003a;

    /* renamed from: b  reason: collision with root package name */
    public final AdObjectType f17004b;

    /* renamed from: c  reason: collision with root package name */
    public int f17005c;

    public o(AdRequestType adrequesttype, AdObjectType adobjecttype, int i) {
        this.f17003a = adrequesttype;
        this.f17004b = adobjecttype;
        this.f17005c = i;
    }

    public abstract void a();

    public final void run() {
        LoadingError loadingError;
        try {
            a();
            h5.f16458a.post(new n(this));
        } catch (Exception e2) {
            Log.log(e2);
            if (e2 instanceof JSONException) {
                loadingError = LoadingError.IncorrectAdunit;
            } else {
                loadingError = LoadingError.InternalError;
            }
            v vVar = (v) this;
            vVar.f17605f.f17433d.a(vVar.f17604e, vVar.f17603d, loadingError);
        }
    }
}
