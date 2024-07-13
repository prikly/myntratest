package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.InAppMessageResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.zzbx;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;

/* compiled from: com.android.billingclient:billing@@5.1.0 */
public final class zzb {
    public static final int zza = Runtime.getRuntime().availableProcessors();

    public static int zza(Intent intent, String str) {
        if (intent != null) {
            return zzq(intent.getExtras(), "ProxyBillingActivity");
        }
        zzo("ProxyBillingActivity", "Got null intent!");
        return 0;
    }

    public static int zzb(Bundle bundle, String str) {
        if (bundle == null) {
            zzo(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            zzn(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            zzo(str, "Unexpected type for bundle response code: ".concat(String.valueOf(obj.getClass().getName())));
            return 6;
        }
    }

    public static Bundle zzc(AcknowledgePurchaseParams acknowledgePurchaseParams, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        return bundle;
    }

    public static Bundle zzd(ConsumeParams consumeParams, boolean z, String str) {
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        return bundle;
    }

    public static Bundle zze(int i, boolean z, String str, String str2, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        if (i >= 9) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        if (i >= 9 && z) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (i >= 14) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            boolean z2 = false;
            boolean z3 = false;
            for (int i2 = 0; i2 < size; i2++) {
                zzbx zzbx = (zzbx) arrayList.get(i2);
                arrayList2.add((Object) null);
                z2 |= !TextUtils.isEmpty((CharSequence) null);
                arrayList3.add((Object) null);
                z3 |= !TextUtils.isEmpty((CharSequence) null);
                arrayList4.add(0);
            }
            if (z2) {
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
            }
            if (z3) {
                bundle.putStringArrayList("SKU_OFFER_ID_LIST", arrayList3);
            }
        }
        return bundle;
    }

    public static Bundle zzf(BillingFlowParams billingFlowParams, boolean z, boolean z2, boolean z3, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (billingFlowParams.zza() != 0) {
            bundle.putInt("prorationMode", billingFlowParams.zza());
        }
        if (!TextUtils.isEmpty(billingFlowParams.zzb())) {
            bundle.putString("accountId", billingFlowParams.zzb());
        }
        if (!TextUtils.isEmpty(billingFlowParams.zzc())) {
            bundle.putString("obfuscatedProfileId", billingFlowParams.zzc());
        }
        if (billingFlowParams.zzn()) {
            bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            bundle.putStringArrayList("skusToReplace", new ArrayList(Arrays.asList(new String[]{null})));
        }
        if (!TextUtils.isEmpty(billingFlowParams.zzd())) {
            bundle.putString("oldSkuPurchaseToken", billingFlowParams.zzd());
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            bundle.putString("oldSkuPurchaseId", (String) null);
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            bundle.putString("originalExternalTransactionId", (String) null);
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            bundle.putString("paymentsPurchaseParams", (String) null);
        }
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z3) {
            bundle.putBoolean("enableAlternativeBilling", true);
        }
        return bundle;
    }

    public static Bundle zzg(String str, ArrayList arrayList, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        bundle.putBoolean("enablePendingPurchases", true);
        bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            arrayList2.add((Object) null);
            z |= !TextUtils.isEmpty((CharSequence) null);
            if (((QueryProductDetailsParams.Product) arrayList.get(i)).zzb().equals("first_party")) {
                zzm.zzc((Object) null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                arrayList3.add((Object) null);
            }
        }
        if (z) {
            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList3);
        }
        return bundle;
    }

    public static Bundle zzh(boolean z, boolean z2, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    public static BillingResult zzi(Intent intent, String str) {
        if (intent == null) {
            zzo("BillingHelper", "Got null intent!");
            BillingResult.Builder newBuilder = BillingResult.newBuilder();
            newBuilder.setResponseCode(6);
            newBuilder.setDebugMessage("An internal error occurred.");
            return newBuilder.build();
        }
        BillingResult.Builder newBuilder2 = BillingResult.newBuilder();
        newBuilder2.setResponseCode(zzb(intent.getExtras(), str));
        newBuilder2.setDebugMessage(zzk(intent.getExtras(), str));
        return newBuilder2.build();
    }

    public static InAppMessageResult zzj(Bundle bundle, String str) {
        if (bundle == null) {
            return new InAppMessageResult(0, (String) null);
        }
        return new InAppMessageResult(zzq(bundle, "BillingClient"), bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN"));
    }

    public static String zzk(Bundle bundle, String str) {
        if (bundle == null) {
            zzo(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            zzn(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        } else if (obj instanceof String) {
            return (String) obj;
        } else {
            zzo(str, "Unexpected type for debug message: ".concat(String.valueOf(obj.getClass().getName())));
            return "";
        }
    }

    public static String zzl(int i) {
        return zza.zza(i).toString();
    }

    public static List zzm(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase zzr = zzr(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (zzr == null) {
                zzn("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(zzr);
        } else {
            int size = stringArrayList.size();
            zzn("BillingHelper", "Found purchase list of " + size + " items");
            int i = 0;
            while (i < stringArrayList.size() && i < stringArrayList2.size()) {
                Purchase zzr2 = zzr(stringArrayList.get(i), stringArrayList2.get(i));
                if (zzr2 != null) {
                    arrayList.add(zzr2);
                }
                i++;
            }
        }
        return arrayList;
    }

    public static void zzn(String str, String str2) {
        if (!Log.isLoggable(str, 2)) {
            return;
        }
        if (!str2.isEmpty()) {
            int i = 40000;
            while (!str2.isEmpty() && i > 0) {
                int min = Math.min(str2.length(), Math.min(TTAdSdk.INIT_LOCAL_FAIL_CODE, i));
                Log.v(str, str2.substring(0, min));
                str2 = str2.substring(min);
                i -= min;
            }
            return;
        }
        Log.v(str, str2);
    }

    public static void zzo(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void zzp(String str, String str2, Throwable th) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2, th);
        }
    }

    private static int zzq(Bundle bundle, String str) {
        if (bundle != null) {
            return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        }
        zzo(str, "Unexpected null bundle received!");
        return 0;
    }

    private static Purchase zzr(String str, String str2) {
        if (str == null || str2 == null) {
            zzn("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e2) {
            zzo("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e2.toString()));
            return null;
        }
    }
}
