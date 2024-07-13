package com.appodeal.ads;

import android.app.Activity;
import com.appodeal.ads.context.b;
import com.appodeal.ads.l;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.libs.network.NetworkStatus;
import com.appodeal.ads.q;
import com.appodeal.ads.r;

public abstract class p<AdRequestType extends r<AdObjectType>, AdObjectType extends l, RendererParams extends q> {

    public static class a {

        /* renamed from: b  reason: collision with root package name */
        public static final a f17019b = new a(LogConstants.MSG_NOT_INITIALIZED);

        /* renamed from: c  reason: collision with root package name */
        public static final a f17020c = new a(LogConstants.EVENT_NETWORK_CONNECTION);

        /* renamed from: d  reason: collision with root package name */
        public static final a f17021d = new a(LogConstants.EVENT_PAUSE);

        /* renamed from: e  reason: collision with root package name */
        public static final a f17022e = new a(LogConstants.MSG_AD_TYPE_DISABLED);

        /* renamed from: f  reason: collision with root package name */
        public static final a f17023f = new a(LogConstants.MSG_AD_TYPE_DISABLED_BY_SEGMENT);

        /* renamed from: a  reason: collision with root package name */
        public final String f17024a;

        public a(String str) {
            this.f17024a = str;
        }
    }

    public void a(Activity activity, RendererParams rendererparams, u<AdObjectType, AdRequestType, ?> uVar, a aVar) {
        uVar.a(LogConstants.EVENT_SHOW_FAILED, aVar.f17024a);
    }

    public abstract boolean a(Activity activity, RendererParams rendererparams, u<AdObjectType, AdRequestType, ?> uVar);

    public boolean b(Activity activity, RendererParams rendererparams, u<AdObjectType, AdRequestType, ?> uVar) {
        a aVar;
        if (!uVar.o()) {
            aVar = a.f17019b;
        } else {
            uVar.a(rendererparams.f17031a);
            if (uVar.m()) {
                aVar = a.f17022e;
            } else if (uVar.n()) {
                aVar = a.f17023f;
            } else if (b.f16327b.getTopActivityFlow().getValue() == null) {
                aVar = a.f17021d;
            } else if (NetworkStatus.INSTANCE.isConnected()) {
                return a(activity, rendererparams, uVar);
            } else {
                aVar = a.f17020c;
            }
        }
        a(activity, rendererparams, uVar, aVar);
        return false;
    }
}
