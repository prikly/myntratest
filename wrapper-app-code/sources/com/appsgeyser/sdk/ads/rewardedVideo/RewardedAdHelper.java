package com.appsgeyser.sdk.ads.rewardedVideo;

import android.content.Context;
import android.util.Log;
import com.appsgeyser.sdk.ads.rewardedVideo.rewardedFacades.AbstractRewardedFacade;
import com.appsgeyser.sdk.ads.rewardedVideo.rewardedFacades.AppnextRewardedFacade;
import com.appsgeyser.sdk.ads.rewardedVideo.rewardedFacades.RewardedVideoFacade;
import com.appsgeyser.sdk.configuration.models.AdNetworkSdkModel;
import com.appsgeyser.sdk.configuration.models.ConfigPhp;
import com.appsgeyser.sdk.ui.AppsgeyserProgressDialog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

public class RewardedAdHelper {
    private ConfigPhp configPhp;
    private Context context;
    /* access modifiers changed from: private */
    public int currentlyLoadingSdkIndex = 0;
    /* access modifiers changed from: private */
    public int indexOfLoadedSdk = -1;
    /* access modifiers changed from: private */
    public boolean loadingProcess = false;
    /* access modifiers changed from: private */
    public boolean noVideoAvailable = false;
    /* access modifiers changed from: private */
    public RewardedVideoFacade.RewardedVideoListener pendingListener;
    /* access modifiers changed from: private */
    public AppsgeyserProgressDialog progressDialog;
    /* access modifiers changed from: private */
    public ArrayList<RewardedVideoFacade> rewardedVideoFacades;

    static /* synthetic */ int access$108(RewardedAdHelper rewardedAdHelper) {
        int i = rewardedAdHelper.currentlyLoadingSdkIndex;
        rewardedAdHelper.currentlyLoadingSdkIndex = i + 1;
        return i;
    }

    public RewardedAdHelper(ConfigPhp configPhp2, Context context2) {
        this.configPhp = configPhp2;
        this.context = context2;
        this.rewardedVideoFacades = new ArrayList<>(5);
        init();
    }

    private void init() {
        for (Map.Entry next : this.configPhp.getRewardedVideoSdk().entrySet()) {
            if (((AdNetworkSdkModel) next.getValue()).isActive()) {
                String str = (String) next.getKey();
                char c2 = 65535;
                if (str.hashCode() == 1314914054 && str.equals("appnextSdk")) {
                    c2 = 0;
                }
                if (c2 == 0) {
                    this.rewardedVideoFacades.add(new AppnextRewardedFacade(this.context, this.configPhp));
                }
            }
        }
        if (this.rewardedVideoFacades.size() > 1) {
            Collections.sort(this.rewardedVideoFacades, new Comparator<RewardedVideoFacade>() {
                public int compare(RewardedVideoFacade rewardedVideoFacade, RewardedVideoFacade rewardedVideoFacade2) {
                    return ((AbstractRewardedFacade) rewardedVideoFacade2).getPriority() - ((AbstractRewardedFacade) rewardedVideoFacade).getPriority();
                }
            });
        }
        preloadVideo();
    }

    /* access modifiers changed from: private */
    public void preloadVideo() {
        if (this.rewardedVideoFacades.size() > 0) {
            this.loadingProcess = true;
            final RewardedVideoFacade rewardedVideoFacade = this.rewardedVideoFacades.get(this.currentlyLoadingSdkIndex);
            rewardedVideoFacade.setListener(new RewardedVideoFacade.RewardedVideoListener() {
                public void onVideoClicked() {
                }

                public void onVideoFinished() {
                }

                public void onVideoOpened() {
                }

                public void onVideoLoaded() {
                    RewardedAdHelper rewardedAdHelper = RewardedAdHelper.this;
                    int unused = rewardedAdHelper.indexOfLoadedSdk = rewardedAdHelper.currentlyLoadingSdkIndex;
                    boolean unused2 = RewardedAdHelper.this.loadingProcess = false;
                    if (RewardedAdHelper.this.pendingListener != null && RewardedAdHelper.this.progressDialog != null) {
                        RewardedAdHelper.this.progressDialog.dismiss();
                        AppsgeyserProgressDialog unused3 = RewardedAdHelper.this.progressDialog = null;
                        RewardedVideoFacade rewardedVideoFacade = rewardedVideoFacade;
                        RewardedAdHelper rewardedAdHelper2 = RewardedAdHelper.this;
                        rewardedVideoFacade.setListener(rewardedAdHelper2.createDefaultListener(rewardedAdHelper2.pendingListener));
                        RewardedAdHelper.this.pendingListener.onVideoLoaded();
                    }
                }

                public void onVideoClosed() {
                    int unused = RewardedAdHelper.this.currentlyLoadingSdkIndex = 0;
                    int unused2 = RewardedAdHelper.this.indexOfLoadedSdk = -1;
                    RewardedAdHelper.this.preloadVideo();
                }

                public void onVideoError(String str) {
                    if (RewardedAdHelper.this.currentlyLoadingSdkIndex == RewardedAdHelper.this.rewardedVideoFacades.size() - 1) {
                        boolean unused = RewardedAdHelper.this.noVideoAvailable = true;
                        if (RewardedAdHelper.this.pendingListener != null && RewardedAdHelper.this.progressDialog != null) {
                            RewardedAdHelper.this.progressDialog.dismiss();
                            AppsgeyserProgressDialog unused2 = RewardedAdHelper.this.progressDialog = null;
                            RewardedAdHelper.this.pendingListener.onVideoError("No video available");
                            return;
                        }
                        return;
                    }
                    RewardedAdHelper.access$108(RewardedAdHelper.this);
                    RewardedAdHelper.this.preloadVideo();
                }
            });
            rewardedVideoFacade.loadRewardedVideo();
        }
    }

    /* access modifiers changed from: private */
    public RewardedVideoFacade.RewardedVideoListener createDefaultListener(final RewardedVideoFacade.RewardedVideoListener rewardedVideoListener) {
        return new RewardedVideoFacade.RewardedVideoListener() {
            public void onVideoLoaded() {
            }

            public void onVideoOpened() {
                rewardedVideoListener.onVideoOpened();
            }

            public void onVideoClicked() {
                rewardedVideoListener.onVideoClicked();
            }

            public void onVideoClosed() {
                int unused = RewardedAdHelper.this.currentlyLoadingSdkIndex = 0;
                int unused2 = RewardedAdHelper.this.indexOfLoadedSdk = -1;
                RewardedAdHelper.this.preloadVideo();
                rewardedVideoListener.onVideoClosed();
            }

            public void onVideoError(String str) {
                rewardedVideoListener.onVideoError(str);
                RewardedAdHelper.this.preloadVideo();
            }

            public void onVideoFinished() {
                rewardedVideoListener.onVideoFinished();
                int unused = RewardedAdHelper.this.indexOfLoadedSdk = -1;
            }
        };
    }

    public void loadRewardedVideo(RewardedVideoFacade.RewardedVideoListener rewardedVideoListener) {
        if (this.noVideoAvailable || (this.indexOfLoadedSdk == -1 && !this.loadingProcess)) {
            rewardedVideoListener.onVideoError("No video available at the moment");
        } else if (this.loadingProcess) {
            this.pendingListener = rewardedVideoListener;
            AppsgeyserProgressDialog appsgeyserProgressDialog = new AppsgeyserProgressDialog(this.context);
            this.progressDialog = appsgeyserProgressDialog;
            appsgeyserProgressDialog.show();
        } else {
            RewardedVideoFacade rewardedVideoFacade = this.rewardedVideoFacades.get(this.indexOfLoadedSdk);
            if (rewardedVideoFacade.isVideoLoaded()) {
                rewardedVideoFacade.setListener(createDefaultListener(rewardedVideoListener));
                rewardedVideoListener.onVideoLoaded();
                return;
            }
            preloadVideo();
            loadRewardedVideo(rewardedVideoListener);
        }
    }

    public void showRewardedVideo() {
        Log.d("RewVideoCallback", "indexOfLoadedSdk = " + this.indexOfLoadedSdk + " rewardedVideoFacades.get(indexOfLoadedSdk).isVideoLoaded() = " + this.rewardedVideoFacades.get(this.indexOfLoadedSdk).isVideoLoaded());
        int i = this.indexOfLoadedSdk;
        if (i != -1 && this.rewardedVideoFacades.get(i).isVideoLoaded()) {
            this.rewardedVideoFacades.get(this.indexOfLoadedSdk).showRewardedVideo();
        }
    }

    public void setContext(Context context2) {
        this.context = context2;
    }

    public void onPause() {
        Iterator<RewardedVideoFacade> it = this.rewardedVideoFacades.iterator();
        while (it.hasNext()) {
            it.next().onPause();
        }
    }

    public void onResume() {
        Iterator<RewardedVideoFacade> it = this.rewardedVideoFacades.iterator();
        while (it.hasNext()) {
            it.next().onResume();
        }
    }
}
