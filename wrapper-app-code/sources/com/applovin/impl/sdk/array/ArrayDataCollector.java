package com.applovin.impl.sdk.array;

import com.applovin.array.apphub.aidl.IAppHubService;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.v;

public class ArrayDataCollector {
    private static final String TAG = "ArrayService";
    private final v logger;
    private final n sdk;

    public ArrayDataCollector(n nVar) {
        this.sdk = nVar;
        this.logger = nVar.D();
    }

    public long maybeCollectAppHubVersionCode(IAppHubService iAppHubService) {
        if (!((Boolean) this.sdk.a(b.aw)).booleanValue()) {
            return -1;
        }
        try {
            return iAppHubService.getAppHubVersionCode();
        } catch (Throwable th) {
            if (v.a()) {
                this.logger.b(TAG, "Failed to collect App Hub version code", th);
            }
            return -1;
        }
    }

    public boolean maybeCollectDirectDownloadEnabled(IAppHubService iAppHubService) {
        if (!((Boolean) this.sdk.a(b.ax)).booleanValue()) {
            return false;
        }
        try {
            return iAppHubService.getEnabledFeatures().getBoolean("DIRECT_DOWNLOAD");
        } catch (Throwable th) {
            if (v.a()) {
                this.logger.b(TAG, "Failed to collect App Hub version code", th);
            }
            return false;
        }
    }

    public String maybeCollectRandomUserToken(IAppHubService iAppHubService) {
        if (!((Boolean) this.sdk.a(b.ay)).booleanValue()) {
            return null;
        }
        try {
            return iAppHubService.getRandomUserToken();
        } catch (Throwable th) {
            if (v.a()) {
                this.logger.b(TAG, "Failed to collect random user token", th);
            }
            return null;
        }
    }
}
