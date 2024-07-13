package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.Log;

public final class i2 extends g<k2, j2, Object> {

    /* renamed from: a  reason: collision with root package name */
    public MrecCallbacks f16482a;

    public final void a(r rVar, l lVar, Object obj) {
        k2 k2Var = (k2) rVar;
        j2 j2Var = (j2) lVar;
        Log.log(LogConstants.KEY_MREC, LogConstants.EVENT_NOTIFY_CLICKED, Log.LogLevel.verbose);
        MrecCallbacks mrecCallbacks = this.f16482a;
        if (mrecCallbacks != null) {
            mrecCallbacks.onMrecClicked();
        }
    }

    public final void b(r rVar, l lVar) {
        k2 k2Var = (k2) rVar;
        j2 j2Var = (j2) lVar;
        Log.log(LogConstants.KEY_MREC, LogConstants.EVENT_NOTIFY_EXPIRED, Log.LogLevel.verbose);
        MrecCallbacks mrecCallbacks = this.f16482a;
        if (mrecCallbacks != null) {
            mrecCallbacks.onMrecExpired();
        }
    }

    public final void c(r rVar, l lVar, Object obj) {
        k2 k2Var = (k2) rVar;
        j2 j2Var = (j2) lVar;
        Log.log(LogConstants.KEY_MREC, LogConstants.EVENT_NOTIFY_SHOWN, Log.LogLevel.verbose);
        MrecCallbacks mrecCallbacks = this.f16482a;
        if (mrecCallbacks != null) {
            mrecCallbacks.onMrecShown();
        }
    }

    public final void d(r rVar, l lVar) {
        k2 k2Var = (k2) rVar;
        j2 j2Var = (j2) lVar;
        Log.log(LogConstants.KEY_MREC, LogConstants.EVENT_NOTIFY_LOAD_FAILED, Log.LogLevel.verbose);
        MrecCallbacks mrecCallbacks = this.f16482a;
        if (mrecCallbacks != null) {
            mrecCallbacks.onMrecFailedToLoad();
        }
    }

    public final void e(r rVar, l lVar) {
        k2 k2Var = (k2) rVar;
        j2 j2Var = (j2) lVar;
        Log.log(LogConstants.KEY_MREC, LogConstants.EVENT_NOTIFY_LOADED, String.format("isPrecache: %s", new Object[]{Boolean.valueOf(j2Var.isPrecache())}), Log.LogLevel.verbose);
        MrecCallbacks mrecCallbacks = this.f16482a;
        if (mrecCallbacks != null) {
            mrecCallbacks.onMrecLoaded(j2Var.isPrecache());
        }
    }

    public final void b(r rVar, l lVar, Object obj) {
        k2 k2Var = (k2) rVar;
        j2 j2Var = (j2) lVar;
        Log.log(LogConstants.KEY_MREC, LogConstants.EVENT_NOTIFY_SHOW_FAILED, Log.LogLevel.verbose);
        MrecCallbacks mrecCallbacks = this.f16482a;
        if (mrecCallbacks != null) {
            mrecCallbacks.onMrecShowFailed();
        }
    }
}
