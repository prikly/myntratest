package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzewa implements zzezm {
    private final Context zza;
    private final zzgfc zzb;

    zzewa(Context context, zzgfc zzgfc) {
        this.zza = context;
        this.zzb = zzgfc;
    }

    public final int zza() {
        return 18;
    }

    public final zzgfb zzb() {
        return this.zzb.zzb(new zzevx(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzevz zzc() throws Exception {
        String str;
        Bundle bundle;
        zzt.zzp();
        Context context = this.zza;
        String str2 = "";
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zzfx)).booleanValue()) {
            str = str2;
        } else {
            str = context.getSharedPreferences("mobileads_consent", 0).getString("consent_string", str2);
        }
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzfz)).booleanValue()) {
            str2 = this.zza.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", str2);
        }
        zzt.zzp();
        Context context2 = this.zza;
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zzfy)).booleanValue()) {
            bundle = null;
        } else {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context2);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i = 0; i < 4; i++) {
                String str3 = strArr[i];
                if (defaultSharedPreferences.contains(str3)) {
                    bundle.putString(str3, defaultSharedPreferences.getString(str3, (String) null));
                }
            }
        }
        return new zzevz(str, str2, bundle, (zzevy) null);
    }
}
