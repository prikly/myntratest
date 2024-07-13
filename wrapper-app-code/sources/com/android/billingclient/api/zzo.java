package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzu;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@5.1.0 */
final class zzo extends BroadcastReceiver {
    final /* synthetic */ zzp zza;
    /* access modifiers changed from: private */
    public final PurchasesUpdatedListener zzb;
    /* access modifiers changed from: private */
    public final zzbf zzc;
    private final zzc zzd;
    private boolean zze;

    /* synthetic */ zzo(zzp zzp, zzbf zzbf, zzn zzn) {
        this.zza = zzp;
        this.zzb = null;
        this.zzd = null;
        this.zzc = null;
    }

    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            zzb.zzo("BillingBroadcastManager", "Bundle is null.");
            PurchasesUpdatedListener purchasesUpdatedListener = this.zzb;
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesUpdated(zzbc.zzj, (List<Purchase>) null);
                return;
            }
            return;
        }
        BillingResult zzi = zzb.zzi(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            if (!extras.getBoolean("IS_FIRST_PARTY_PURCHASE", false) && this.zzb != null) {
                this.zzb.onPurchasesUpdated(zzi, zzb.zzm(extras));
                return;
            }
            zzb.zzo("BillingBroadcastManager", "Received purchase and no valid listener registered.");
        } else if (!action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
        } else {
            if (zzi.getResponseCode() != 0) {
                this.zzb.onPurchasesUpdated(zzi, zzu.zzl());
            } else if (this.zzd == null) {
                zzb.zzo("BillingBroadcastManager", "AlternativeBillingListener is null.");
                this.zzb.onPurchasesUpdated(zzbc.zzj, zzu.zzl());
            } else {
                String string = extras.getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    try {
                        JSONArray optJSONArray = new JSONObject(string).optJSONArray("products");
                        ArrayList arrayList = new ArrayList();
                        if (optJSONArray != null) {
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                                if (optJSONObject != null) {
                                    arrayList.add(new zze(optJSONObject, (zzd) null));
                                }
                            }
                        }
                        this.zzd.zza();
                    } catch (JSONException unused) {
                        zzb.zzo("BillingBroadcastManager", String.format("Error when parsing invalid alternative choice data: [%s]", new Object[]{string}));
                        this.zzb.onPurchasesUpdated(zzbc.zzj, zzu.zzl());
                    }
                } else {
                    zzb.zzo("BillingBroadcastManager", "Couldn't find alternative billing user choice data in bundle.");
                    this.zzb.onPurchasesUpdated(zzbc.zzj, zzu.zzl());
                }
            }
        }
    }

    public final void zzc(Context context, IntentFilter intentFilter) {
        if (!this.zze) {
            context.registerReceiver(this.zza.zzb, intentFilter);
            this.zze = true;
        }
    }

    public final void zzd(Context context) {
        if (this.zze) {
            context.unregisterReceiver(this.zza.zzb);
            this.zze = false;
            return;
        }
        zzb.zzo("BillingBroadcastManager", "Receiver is not registered.");
    }

    /* synthetic */ zzo(zzp zzp, PurchasesUpdatedListener purchasesUpdatedListener, zzc zzc2, zzn zzn) {
        this.zza = zzp;
        this.zzb = purchasesUpdatedListener;
        this.zzd = zzc2;
        this.zzc = null;
    }
}
