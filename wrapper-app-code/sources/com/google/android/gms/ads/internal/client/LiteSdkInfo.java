package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbvq;
import com.google.android.gms.internal.ads.zzbvt;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public class LiteSdkInfo extends zzck {
    public LiteSdkInfo(Context context) {
    }

    public zzbvt getAdapterCreator() {
        return new zzbvq();
    }

    public zzen getLiteSdkVersion() {
        return new zzen(ModuleDescriptor.MODULE_VERSION, 224400000, "21.5.0");
    }
}
