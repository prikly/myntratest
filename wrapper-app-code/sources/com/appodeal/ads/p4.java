package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.Log;

public final class p4 extends g<n4, m4, Object> {

    /* renamed from: a  reason: collision with root package name */
    public RewardedVideoCallbacks f17030a;

    public final void a(r rVar, l lVar, Object obj) {
        n4 n4Var = (n4) rVar;
        m4 m4Var = (m4) lVar;
        Log.log(LogConstants.KEY_REWARDED_VIDEO, LogConstants.EVENT_NOTIFY_CLICKED, Log.LogLevel.verbose);
        RewardedVideoCallbacks rewardedVideoCallbacks = this.f17030a;
        if (rewardedVideoCallbacks != null) {
            rewardedVideoCallbacks.onRewardedVideoClicked();
        }
    }

    public final void b(r rVar, l lVar) {
        n4 n4Var = (n4) rVar;
        m4 m4Var = (m4) lVar;
        Log.log(LogConstants.KEY_REWARDED_VIDEO, LogConstants.EVENT_NOTIFY_EXPIRED, Log.LogLevel.verbose);
        RewardedVideoCallbacks rewardedVideoCallbacks = this.f17030a;
        if (rewardedVideoCallbacks != null) {
            rewardedVideoCallbacks.onRewardedVideoExpired();
        }
    }

    public final void c(r rVar, l lVar) {
        n4 n4Var = (n4) rVar;
        m4 m4Var = (m4) lVar;
        Log.log(LogConstants.KEY_REWARDED_VIDEO, LogConstants.EVENT_NOTIFY_FINISHED, Log.LogLevel.verbose);
        RewardedVideoCallbacks rewardedVideoCallbacks = this.f17030a;
        if (rewardedVideoCallbacks != null) {
            rewardedVideoCallbacks.onRewardedVideoFinished(o4.c(), o4.d());
        }
    }

    public final void d(r rVar, l lVar) {
        n4 n4Var = (n4) rVar;
        m4 m4Var = (m4) lVar;
        Log.log(LogConstants.KEY_REWARDED_VIDEO, LogConstants.EVENT_NOTIFY_LOAD_FAILED, Log.LogLevel.verbose);
        RewardedVideoCallbacks rewardedVideoCallbacks = this.f17030a;
        if (rewardedVideoCallbacks != null) {
            rewardedVideoCallbacks.onRewardedVideoFailedToLoad();
        }
    }

    public final void e(r rVar, l lVar) {
        n4 n4Var = (n4) rVar;
        m4 m4Var = (m4) lVar;
        Log.log(LogConstants.KEY_REWARDED_VIDEO, LogConstants.EVENT_NOTIFY_LOADED, String.format("isPrecache: %s", new Object[]{Boolean.valueOf(m4Var.isPrecache())}), Log.LogLevel.verbose);
        RewardedVideoCallbacks rewardedVideoCallbacks = this.f17030a;
        if (rewardedVideoCallbacks != null) {
            rewardedVideoCallbacks.onRewardedVideoLoaded(m4Var.isPrecache());
        }
    }

    public final void a(r rVar, l lVar) {
        n4 n4Var = (n4) rVar;
        m4 m4Var = (m4) lVar;
        Log.log(LogConstants.KEY_REWARDED_VIDEO, LogConstants.EVENT_NOTIFY_CLOSED, String.format("finished: %s", new Object[]{Boolean.valueOf(n4Var.s())}), Log.LogLevel.verbose);
        RewardedVideoCallbacks rewardedVideoCallbacks = this.f17030a;
        if (rewardedVideoCallbacks != null) {
            rewardedVideoCallbacks.onRewardedVideoClosed(n4Var.s());
        }
    }

    public final void b(r rVar, l lVar, Object obj) {
        n4 n4Var = (n4) rVar;
        m4 m4Var = (m4) lVar;
        Log.log(LogConstants.KEY_REWARDED_VIDEO, LogConstants.EVENT_NOTIFY_SHOW_FAILED, Log.LogLevel.verbose);
        RewardedVideoCallbacks rewardedVideoCallbacks = this.f17030a;
        if (rewardedVideoCallbacks != null) {
            rewardedVideoCallbacks.onRewardedVideoShowFailed();
        }
    }

    public final void c(r rVar, l lVar, Object obj) {
        n4 n4Var = (n4) rVar;
        m4 m4Var = (m4) lVar;
        Log.log(LogConstants.KEY_REWARDED_VIDEO, LogConstants.EVENT_NOTIFY_SHOWN, Log.LogLevel.verbose);
        RewardedVideoCallbacks rewardedVideoCallbacks = this.f17030a;
        if (rewardedVideoCallbacks != null) {
            rewardedVideoCallbacks.onRewardedVideoShown();
        }
    }
}
