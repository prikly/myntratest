package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.billingclient.BuildConfig;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzu;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONException;

/* compiled from: com.android.billingclient:billing@@5.1.0 */
class BillingClientImpl extends BillingClient {
    /* access modifiers changed from: private */
    public volatile int zza;
    private final String zzb;
    private final Handler zzc;
    private volatile zzp zzd;
    /* access modifiers changed from: private */
    public Context zze;
    /* access modifiers changed from: private */
    public volatile zze zzf;
    private volatile zzaq zzg;
    /* access modifiers changed from: private */
    public boolean zzh;
    /* access modifiers changed from: private */
    public boolean zzi;
    /* access modifiers changed from: private */
    public int zzj;
    /* access modifiers changed from: private */
    public boolean zzk;
    /* access modifiers changed from: private */
    public boolean zzl;
    /* access modifiers changed from: private */
    public boolean zzm;
    /* access modifiers changed from: private */
    public boolean zzn;
    /* access modifiers changed from: private */
    public boolean zzo;
    /* access modifiers changed from: private */
    public boolean zzp;
    /* access modifiers changed from: private */
    public boolean zzq;
    /* access modifiers changed from: private */
    public boolean zzr;
    /* access modifiers changed from: private */
    public boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private ExecutorService zzv;

    private void initialize(Context context, PurchasesUpdatedListener purchasesUpdatedListener, boolean z, zzc zzc2) {
        this.zze = context.getApplicationContext();
        if (purchasesUpdatedListener == null) {
            zzb.zzo("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.zzd = new zzp(this.zze, purchasesUpdatedListener, zzc2);
        this.zzt = z;
        this.zzu = zzc2 != null;
    }

    /* access modifiers changed from: private */
    public final Handler zzF() {
        return Looper.myLooper() == null ? this.zzc : new Handler(Looper.myLooper());
    }

    private final BillingResult zzG(BillingResult billingResult) {
        if (Thread.interrupted()) {
            return billingResult;
        }
        this.zzc.post(new zzah(this, billingResult));
        return billingResult;
    }

    /* access modifiers changed from: private */
    public final BillingResult zzH() {
        if (this.zza == 0 || this.zza == 3) {
            return zzbc.zzm;
        }
        return zzbc.zzj;
    }

    private static String zzI() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get((Object) null);
        } catch (Exception unused) {
            return BuildConfig.VERSION_NAME;
        }
    }

    /* access modifiers changed from: private */
    public final Future zzJ(Callable callable, long j, Runnable runnable, Handler handler) {
        if (this.zzv == null) {
            this.zzv = Executors.newFixedThreadPool(zzb.zza, new zzam(this));
        }
        try {
            Future submit = this.zzv.submit(callable);
            handler.postDelayed(new zzag(submit, runnable), (long) (((double) j) * 0.95d));
            return submit;
        } catch (Exception e2) {
            zzb.zzp("BillingClient", "Async task throws exception!", e2);
            return null;
        }
    }

    private final void zzL(String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        if (!isReady()) {
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(zzbc.zzm, (List<PurchaseHistoryRecord>) null);
            return;
        }
        if (zzJ(new zzak(this, str, purchaseHistoryResponseListener), 30000, new zzx(purchaseHistoryResponseListener), zzF()) == null) {
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(zzH(), (List<PurchaseHistoryRecord>) null);
        }
    }

    private final void zzM(String str, PurchasesResponseListener purchasesResponseListener) {
        if (!isReady()) {
            purchasesResponseListener.onQueryPurchasesResponse(zzbc.zzm, zzu.zzl());
        } else if (TextUtils.isEmpty(str)) {
            zzb.zzo("BillingClient", "Please provide a valid product type.");
            purchasesResponseListener.onQueryPurchasesResponse(zzbc.zzg, zzu.zzl());
        } else {
            if (zzJ(new zzaj(this, str, purchasesResponseListener), 30000, new zzae(purchasesResponseListener), zzF()) == null) {
                purchasesResponseListener.onQueryPurchasesResponse(zzH(), zzu.zzl());
            }
        }
    }

    static /* bridge */ /* synthetic */ zzat zzg(BillingClientImpl billingClientImpl, String str) {
        zzb.zzn("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle zzh2 = zzb.zzh(billingClientImpl.zzm, billingClientImpl.zzt, billingClientImpl.zzb);
        String str2 = null;
        while (billingClientImpl.zzk) {
            try {
                Bundle zzh3 = billingClientImpl.zzf.zzh(6, billingClientImpl.zze.getPackageName(), str, str2, zzh2);
                BillingResult zza2 = zzbk.zza(zzh3, "BillingClient", "getPurchaseHistory()");
                if (zza2 != zzbc.zzl) {
                    return new zzat(zza2, (List) null);
                }
                ArrayList<String> stringArrayList = zzh3.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = zzh3.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = zzh3.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                int i = 0;
                while (i < stringArrayList2.size()) {
                    String str3 = stringArrayList2.get(i);
                    String str4 = stringArrayList3.get(i);
                    zzb.zzn("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i))));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str3, str4);
                        if (TextUtils.isEmpty(purchaseHistoryRecord.getPurchaseToken())) {
                            zzb.zzo("BillingClient", "BUG: empty/null token!");
                        }
                        arrayList.add(purchaseHistoryRecord);
                        i++;
                    } catch (JSONException e2) {
                        zzb.zzp("BillingClient", "Got an exception trying to decode the purchase!", e2);
                        return new zzat(zzbc.zzj, (List) null);
                    }
                }
                str2 = zzh3.getString("INAPP_CONTINUATION_TOKEN");
                zzb.zzn("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                if (TextUtils.isEmpty(str2)) {
                    return new zzat(zzbc.zzl, arrayList);
                }
            } catch (RemoteException e3) {
                zzb.zzp("BillingClient", "Got exception trying to get purchase history, try to reconnect", e3);
                return new zzat(zzbc.zzm, (List) null);
            }
        }
        zzb.zzo("BillingClient", "getPurchaseHistory is not supported on current device");
        return new zzat(zzbc.zzq, (List) null);
    }

    static /* bridge */ /* synthetic */ zzbj zzi(BillingClientImpl billingClientImpl, String str) {
        Bundle bundle;
        zzb.zzn("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle zzh2 = zzb.zzh(billingClientImpl.zzm, billingClientImpl.zzt, billingClientImpl.zzb);
        String str2 = null;
        do {
            try {
                if (billingClientImpl.zzm) {
                    bundle = billingClientImpl.zzf.zzj(9, billingClientImpl.zze.getPackageName(), str, str2, zzh2);
                } else {
                    bundle = billingClientImpl.zzf.zzi(3, billingClientImpl.zze.getPackageName(), str, str2);
                }
                BillingResult zza2 = zzbk.zza(bundle, "BillingClient", "getPurchase()");
                if (zza2 != zzbc.zzl) {
                    return new zzbj(zza2, (List) null);
                }
                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                int i = 0;
                while (i < stringArrayList2.size()) {
                    String str3 = stringArrayList2.get(i);
                    String str4 = stringArrayList3.get(i);
                    zzb.zzn("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i))));
                    try {
                        Purchase purchase = new Purchase(str3, str4);
                        if (TextUtils.isEmpty(purchase.getPurchaseToken())) {
                            zzb.zzo("BillingClient", "BUG: empty/null token!");
                        }
                        arrayList.add(purchase);
                        i++;
                    } catch (JSONException e2) {
                        zzb.zzp("BillingClient", "Got an exception trying to decode the purchase!", e2);
                        return new zzbj(zzbc.zzj, (List) null);
                    }
                }
                str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                zzb.zzn("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
            } catch (Exception e3) {
                zzb.zzp("BillingClient", "Got exception trying to get purchasesm try to reconnect", e3);
                return new zzbj(zzbc.zzm, (List) null);
            }
        } while (!TextUtils.isEmpty(str2));
        return new zzbj(zzbc.zzl, arrayList);
    }

    public final void acknowledgePurchase(AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        if (!isReady()) {
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzbc.zzm);
        } else if (TextUtils.isEmpty(acknowledgePurchaseParams.getPurchaseToken())) {
            zzb.zzo("BillingClient", "Please provide a valid purchase token.");
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzbc.zzi);
        } else if (!this.zzm) {
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzbc.zzb);
        } else {
            if (zzJ(new zzaa(this, acknowledgePurchaseParams, acknowledgePurchaseResponseListener), 30000, new zzab(acknowledgePurchaseResponseListener), zzF()) == null) {
                acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzH());
            }
        }
    }

    public final void endConnection() {
        try {
            this.zzd.zzd();
            if (this.zzg != null) {
                this.zzg.zzc();
            }
            if (!(this.zzg == null || this.zzf == null)) {
                zzb.zzn("BillingClient", "Unbinding from service.");
                this.zze.unbindService(this.zzg);
                this.zzg = null;
            }
            this.zzf = null;
            ExecutorService executorService = this.zzv;
            if (executorService != null) {
                executorService.shutdownNow();
                this.zzv = null;
            }
        } catch (Exception e2) {
            zzb.zzp("BillingClient", "There was an exception while ending connection!", e2);
        } finally {
            this.zza = 3;
        }
    }

    public final boolean isReady() {
        return (this.zza != 2 || this.zzf == null || this.zzg == null) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x037e A[Catch:{ CancellationException | TimeoutException -> 0x03ca, Exception -> 0x03be }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x03a4 A[Catch:{ CancellationException | TimeoutException -> 0x03ca, Exception -> 0x03be }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.android.billingclient.api.BillingResult launchBillingFlow(android.app.Activity r32, com.android.billingclient.api.BillingFlowParams r33) {
        /*
            r31 = this;
            r8 = r31
            r0 = r32
            java.lang.String r1 = "proxyPackageVersion"
            java.lang.String r9 = "BUY_INTENT"
            boolean r2 = r31.isReady()
            if (r2 != 0) goto L_0x0014
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzbc.zzm
            r8.zzG(r0)
            return r0
        L_0x0014:
            java.util.ArrayList r2 = r33.zze()
            java.util.List r3 = r33.zzf()
            r4 = 0
            java.lang.Object r5 = com.google.android.gms.internal.play_billing.zzz.zza(r2, r4)
            com.android.billingclient.api.SkuDetails r5 = (com.android.billingclient.api.SkuDetails) r5
            java.lang.Object r6 = com.google.android.gms.internal.play_billing.zzz.zza(r3, r4)
            com.android.billingclient.api.BillingFlowParams$ProductDetailsParams r6 = (com.android.billingclient.api.BillingFlowParams.ProductDetailsParams) r6
            if (r5 == 0) goto L_0x0034
            java.lang.String r7 = r5.getSku()
            java.lang.String r10 = r5.getType()
            goto L_0x0044
        L_0x0034:
            com.android.billingclient.api.ProductDetails r7 = r6.zza()
            java.lang.String r7 = r7.getProductId()
            com.android.billingclient.api.ProductDetails r10 = r6.zza()
            java.lang.String r10 = r10.getProductType()
        L_0x0044:
            java.lang.String r11 = "subs"
            boolean r11 = r10.equals(r11)
            java.lang.String r12 = "BillingClient"
            if (r11 == 0) goto L_0x005e
            boolean r11 = r8.zzh
            if (r11 == 0) goto L_0x0053
            goto L_0x005e
        L_0x0053:
            java.lang.String r0 = "Current client doesn't support subscriptions."
            com.google.android.gms.internal.play_billing.zzb.zzo(r12, r0)
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzbc.zzo
            r8.zzG(r0)
            return r0
        L_0x005e:
            boolean r11 = r33.zzo()
            if (r11 == 0) goto L_0x0074
            boolean r11 = r8.zzk
            if (r11 == 0) goto L_0x0069
            goto L_0x0074
        L_0x0069:
            java.lang.String r0 = "Current client doesn't support extra params for buy intent."
            com.google.android.gms.internal.play_billing.zzb.zzo(r12, r0)
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzbc.zzh
            r8.zzG(r0)
            return r0
        L_0x0074:
            int r11 = r2.size()
            r13 = 1
            if (r11 <= r13) goto L_0x008b
            boolean r11 = r8.zzr
            if (r11 == 0) goto L_0x0080
            goto L_0x008b
        L_0x0080:
            java.lang.String r0 = "Current client doesn't support multi-item purchases."
            com.google.android.gms.internal.play_billing.zzb.zzo(r12, r0)
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzbc.zzt
            r8.zzG(r0)
            return r0
        L_0x008b:
            boolean r11 = r3.isEmpty()
            if (r11 != 0) goto L_0x00a1
            boolean r11 = r8.zzs
            if (r11 == 0) goto L_0x0096
            goto L_0x00a1
        L_0x0096:
            java.lang.String r0 = "Current client doesn't support purchases with ProductDetails."
            com.google.android.gms.internal.play_billing.zzb.zzo(r12, r0)
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzbc.zzv
            r8.zzG(r0)
            return r0
        L_0x00a1:
            boolean r11 = r8.zzk
            if (r11 == 0) goto L_0x0353
            boolean r11 = r8.zzm
            boolean r14 = r8.zzt
            boolean r15 = r8.zzu
            java.lang.String r4 = r8.zzb
            r13 = r33
            android.os.Bundle r11 = com.google.android.gms.internal.play_billing.zzb.zzf(r13, r11, r14, r15, r4)
            boolean r4 = r2.isEmpty()
            java.lang.String r14 = "additionalSkuTypes"
            java.lang.String r15 = "additionalSkus"
            java.lang.String r13 = "SKU_SERIALIZED_DOCID_LIST"
            r17 = r9
            java.lang.String r9 = "skuDetailsTokens"
            java.lang.String r0 = "SKU_OFFER_ID_TOKEN_LIST"
            r18 = r10
            if (r4 != 0) goto L_0x01cc
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r19 = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r20 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r21 = r12
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r22 = r2.iterator()
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
        L_0x00f2:
            boolean r27 = r22.hasNext()
            if (r27 == 0) goto L_0x015e
            java.lang.Object r27 = r22.next()
            com.android.billingclient.api.SkuDetails r27 = (com.android.billingclient.api.SkuDetails) r27
            java.lang.String r28 = r27.zzf()
            boolean r28 = r28.isEmpty()
            if (r28 != 0) goto L_0x0112
            r28 = r6
            java.lang.String r6 = r27.zzf()
            r4.add(r6)
            goto L_0x0114
        L_0x0112:
            r28 = r6
        L_0x0114:
            java.lang.String r6 = r27.zzc()
            r29 = r5
            java.lang.String r5 = r27.zzb()
            int r30 = r27.zza()
            java.lang.String r8 = r27.zze()
            r10.add(r6)
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            r16 = 1
            r6 = r6 ^ 1
            r23 = r23 | r6
            r7.add(r5)
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            r5 = r5 ^ 1
            r24 = r24 | r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r30)
            r1.add(r5)
            if (r30 == 0) goto L_0x0149
            r5 = 1
            goto L_0x014a
        L_0x0149:
            r5 = 0
        L_0x014a:
            r25 = r25 | r5
            boolean r5 = android.text.TextUtils.isEmpty(r8)
            r5 = r5 ^ 1
            r26 = r26 | r5
            r12.add(r8)
            r8 = r31
            r6 = r28
            r5 = r29
            goto L_0x00f2
        L_0x015e:
            r29 = r5
            r28 = r6
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x016b
            r11.putStringArrayList(r9, r4)
        L_0x016b:
            if (r23 == 0) goto L_0x0170
            r11.putStringArrayList(r0, r10)
        L_0x0170:
            if (r24 == 0) goto L_0x0177
            java.lang.String r4 = "SKU_OFFER_ID_LIST"
            r11.putStringArrayList(r4, r7)
        L_0x0177:
            if (r25 == 0) goto L_0x017e
            java.lang.String r4 = "SKU_OFFER_TYPE_LIST"
            r11.putIntegerArrayList(r4, r1)
        L_0x017e:
            if (r26 == 0) goto L_0x0183
            r11.putStringArrayList(r13, r12)
        L_0x0183:
            int r1 = r2.size()
            r4 = 1
            if (r1 <= r4) goto L_0x027f
            java.util.ArrayList r1 = new java.util.ArrayList
            int r5 = r2.size()
            int r5 = r5 + -1
            r1.<init>(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r2.size()
            int r6 = r6 + -1
            r5.<init>(r6)
            r6 = 1
        L_0x01a1:
            int r7 = r2.size()
            if (r6 >= r7) goto L_0x01c4
            java.lang.Object r7 = r2.get(r6)
            com.android.billingclient.api.SkuDetails r7 = (com.android.billingclient.api.SkuDetails) r7
            java.lang.String r7 = r7.getSku()
            r1.add(r7)
            java.lang.Object r7 = r2.get(r6)
            com.android.billingclient.api.SkuDetails r7 = (com.android.billingclient.api.SkuDetails) r7
            java.lang.String r7 = r7.getType()
            r5.add(r7)
            int r6 = r6 + 1
            goto L_0x01a1
        L_0x01c4:
            r11.putStringArrayList(r15, r1)
            r11.putStringArrayList(r14, r5)
            goto L_0x027f
        L_0x01cc:
            r20 = r1
            r29 = r5
            r28 = r6
            r19 = r7
            r21 = r12
            r4 = 1
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r3.size()
            int r2 = r2 + -1
            r1.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = r3.size()
            int r5 = r5 + -1
            r2.<init>(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = 0
        L_0x01fd:
            int r10 = r3.size()
            if (r8 >= r10) goto L_0x025e
            java.lang.Object r10 = r3.get(r8)
            com.android.billingclient.api.BillingFlowParams$ProductDetailsParams r10 = (com.android.billingclient.api.BillingFlowParams.ProductDetailsParams) r10
            com.android.billingclient.api.ProductDetails r12 = r10.zza()
            java.lang.String r16 = r12.zzb()
            boolean r16 = r16.isEmpty()
            if (r16 != 0) goto L_0x021e
            java.lang.String r4 = r12.zzb()
            r5.add(r4)
        L_0x021e:
            java.lang.String r4 = r10.zzb()
            r6.add(r4)
            java.lang.String r4 = r12.zzc()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0236
            java.lang.String r4 = r12.zzc()
            r7.add(r4)
        L_0x0236:
            if (r8 <= 0) goto L_0x025a
            java.lang.Object r4 = r3.get(r8)
            com.android.billingclient.api.BillingFlowParams$ProductDetailsParams r4 = (com.android.billingclient.api.BillingFlowParams.ProductDetailsParams) r4
            com.android.billingclient.api.ProductDetails r4 = r4.zza()
            java.lang.String r4 = r4.getProductId()
            r1.add(r4)
            java.lang.Object r4 = r3.get(r8)
            com.android.billingclient.api.BillingFlowParams$ProductDetailsParams r4 = (com.android.billingclient.api.BillingFlowParams.ProductDetailsParams) r4
            com.android.billingclient.api.ProductDetails r4 = r4.zza()
            java.lang.String r4 = r4.getProductType()
            r2.add(r4)
        L_0x025a:
            int r8 = r8 + 1
            r4 = 1
            goto L_0x01fd
        L_0x025e:
            r11.putStringArrayList(r0, r6)
            boolean r4 = r5.isEmpty()
            if (r4 != 0) goto L_0x026a
            r11.putStringArrayList(r9, r5)
        L_0x026a:
            boolean r4 = r7.isEmpty()
            if (r4 != 0) goto L_0x0273
            r11.putStringArrayList(r13, r7)
        L_0x0273:
            boolean r4 = r1.isEmpty()
            if (r4 != 0) goto L_0x027f
            r11.putStringArrayList(r15, r1)
            r11.putStringArrayList(r14, r2)
        L_0x027f:
            boolean r0 = r11.containsKey(r0)
            r8 = r31
            if (r0 == 0) goto L_0x0292
            boolean r0 = r8.zzp
            if (r0 == 0) goto L_0x028c
            goto L_0x0292
        L_0x028c:
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzbc.zzu
            r8.zzG(r0)
            return r0
        L_0x0292:
            java.lang.String r0 = "skuPackageName"
            if (r29 == 0) goto L_0x02aa
            java.lang.String r1 = r29.zzd()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x02aa
            java.lang.String r1 = r29.zzd()
            r11.putString(r0, r1)
        L_0x02a7:
            r0 = 0
            r13 = 1
            goto L_0x02c8
        L_0x02aa:
            if (r28 == 0) goto L_0x02c6
            com.android.billingclient.api.ProductDetails r1 = r28.zza()
            java.lang.String r1 = r1.zza()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x02c6
            com.android.billingclient.api.ProductDetails r1 = r28.zza()
            java.lang.String r1 = r1.zza()
            r11.putString(r0, r1)
            goto L_0x02a7
        L_0x02c6:
            r0 = 0
            r13 = 0
        L_0x02c8:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x02d3
            java.lang.String r1 = "accountName"
            r11.putString(r1, r0)
        L_0x02d3:
            android.content.Intent r0 = r32.getIntent()
            if (r0 != 0) goto L_0x02e1
            java.lang.String r0 = "Activity's intent is null."
            r9 = r21
            com.google.android.gms.internal.play_billing.zzb.zzo(r9, r0)
            goto L_0x0312
        L_0x02e1:
            r9 = r21
            java.lang.String r1 = "PROXY_PACKAGE"
            java.lang.String r2 = r0.getStringExtra(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0312
            java.lang.String r0 = r0.getStringExtra(r1)
            java.lang.String r1 = "proxyPackage"
            r11.putString(r1, r0)
            android.content.Context r1 = r8.zze     // Catch:{ NameNotFoundException -> 0x030b }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x030b }
            r2 = 0
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x030b }
            java.lang.String r0 = r0.versionName     // Catch:{ NameNotFoundException -> 0x030b }
            r1 = r20
            r11.putString(r1, r0)     // Catch:{ NameNotFoundException -> 0x030d }
            goto L_0x0312
        L_0x030b:
            r1 = r20
        L_0x030d:
            java.lang.String r0 = "package not found"
            r11.putString(r1, r0)
        L_0x0312:
            boolean r0 = r8.zzs
            if (r0 == 0) goto L_0x0321
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0321
            r0 = 17
            r3 = 17
            goto L_0x0337
        L_0x0321:
            boolean r0 = r8.zzq
            if (r0 == 0) goto L_0x032c
            if (r13 == 0) goto L_0x032c
            r0 = 15
            r3 = 15
            goto L_0x0337
        L_0x032c:
            boolean r0 = r8.zzm
            if (r0 == 0) goto L_0x0335
            r0 = 9
            r3 = 9
            goto L_0x0337
        L_0x0335:
            r0 = 6
            r3 = 6
        L_0x0337:
            com.android.billingclient.api.zzac r0 = new com.android.billingclient.api.zzac
            r1 = r0
            r2 = r31
            r4 = r19
            r5 = r18
            r6 = r33
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r3 = 5000(0x1388, double:2.4703E-320)
            r5 = 0
            android.os.Handler r6 = r8.zzc
            r1 = r31
            r2 = r0
            java.util.concurrent.Future r0 = r1.zzJ(r2, r3, r5, r6)
            goto L_0x036a
        L_0x0353:
            r19 = r7
            r17 = r9
            r18 = r10
            r9 = r12
            com.android.billingclient.api.zzad r2 = new com.android.billingclient.api.zzad
            r2.<init>(r8, r7, r10)
            r3 = 5000(0x1388, double:2.4703E-320)
            r5 = 0
            android.os.Handler r6 = r8.zzc
            r1 = r31
            java.util.concurrent.Future r0 = r1.zzJ(r2, r3, r5, r6)
        L_0x036a:
            r1 = 5000(0x1388, double:2.4703E-320)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ TimeoutException -> 0x03cc, CancellationException -> 0x03ca, Exception -> 0x03be }
            java.lang.Object r0 = r0.get(r1, r3)     // Catch:{ TimeoutException -> 0x03cc, CancellationException -> 0x03ca, Exception -> 0x03be }
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch:{ TimeoutException -> 0x03cc, CancellationException -> 0x03ca, Exception -> 0x03be }
            int r1 = com.google.android.gms.internal.play_billing.zzb.zzb(r0, r9)     // Catch:{ TimeoutException -> 0x03cc, CancellationException -> 0x03ca, Exception -> 0x03be }
            java.lang.String r2 = com.google.android.gms.internal.play_billing.zzb.zzk(r0, r9)     // Catch:{ TimeoutException -> 0x03cc, CancellationException -> 0x03ca, Exception -> 0x03be }
            if (r1 == 0) goto L_0x03a4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ TimeoutException -> 0x03cc, CancellationException -> 0x03ca, Exception -> 0x03be }
            r0.<init>()     // Catch:{ TimeoutException -> 0x03cc, CancellationException -> 0x03ca, Exception -> 0x03be }
            java.lang.String r3 = "Unable to buy item, Error response code: "
            r0.append(r3)     // Catch:{ TimeoutException -> 0x03cc, CancellationException -> 0x03ca, Exception -> 0x03be }
            r0.append(r1)     // Catch:{ TimeoutException -> 0x03cc, CancellationException -> 0x03ca, Exception -> 0x03be }
            java.lang.String r0 = r0.toString()     // Catch:{ TimeoutException -> 0x03cc, CancellationException -> 0x03ca, Exception -> 0x03be }
            com.google.android.gms.internal.play_billing.zzb.zzo(r9, r0)     // Catch:{ TimeoutException -> 0x03cc, CancellationException -> 0x03ca, Exception -> 0x03be }
            com.android.billingclient.api.BillingResult$Builder r0 = com.android.billingclient.api.BillingResult.newBuilder()     // Catch:{ TimeoutException -> 0x03cc, CancellationException -> 0x03ca, Exception -> 0x03be }
            r0.setResponseCode(r1)     // Catch:{ TimeoutException -> 0x03cc, CancellationException -> 0x03ca, Exception -> 0x03be }
            r0.setDebugMessage(r2)     // Catch:{ TimeoutException -> 0x03cc, CancellationException -> 0x03ca, Exception -> 0x03be }
            com.android.billingclient.api.BillingResult r0 = r0.build()     // Catch:{ TimeoutException -> 0x03cc, CancellationException -> 0x03ca, Exception -> 0x03be }
            r8.zzG(r0)     // Catch:{ TimeoutException -> 0x03cc, CancellationException -> 0x03ca, Exception -> 0x03be }
            return r0
        L_0x03a4:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ TimeoutException -> 0x03cc, CancellationException -> 0x03ca, Exception -> 0x03be }
            java.lang.Class<com.android.billingclient.api.ProxyBillingActivity> r2 = com.android.billingclient.api.ProxyBillingActivity.class
            r3 = r32
            r1.<init>(r3, r2)     // Catch:{ TimeoutException -> 0x03cc, CancellationException -> 0x03ca, Exception -> 0x03be }
            r2 = r17
            android.os.Parcelable r0 = r0.getParcelable(r2)     // Catch:{ TimeoutException -> 0x03cc, CancellationException -> 0x03ca, Exception -> 0x03be }
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0     // Catch:{ TimeoutException -> 0x03cc, CancellationException -> 0x03ca, Exception -> 0x03be }
            r1.putExtra(r2, r0)     // Catch:{ TimeoutException -> 0x03cc, CancellationException -> 0x03ca, Exception -> 0x03be }
            r3.startActivity(r1)     // Catch:{ TimeoutException -> 0x03cc, CancellationException -> 0x03ca, Exception -> 0x03be }
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzbc.zzl
            return r0
        L_0x03be:
            r0 = move-exception
            java.lang.String r1 = "Exception while launching billing flow. Try to reconnect"
            com.google.android.gms.internal.play_billing.zzb.zzp(r9, r1, r0)
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzbc.zzm
            r8.zzG(r0)
            return r0
        L_0x03ca:
            r0 = move-exception
            goto L_0x03cd
        L_0x03cc:
            r0 = move-exception
        L_0x03cd:
            java.lang.String r1 = "Time out while launching billing flow. Try to reconnect"
            com.google.android.gms.internal.play_billing.zzb.zzp(r9, r1, r0)
            com.android.billingclient.api.BillingResult r0 = com.android.billingclient.api.zzbc.zzn
            r8.zzG(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.BillingClientImpl.launchBillingFlow(android.app.Activity, com.android.billingclient.api.BillingFlowParams):com.android.billingclient.api.BillingResult");
    }

    public void queryProductDetailsAsync(QueryProductDetailsParams queryProductDetailsParams, ProductDetailsResponseListener productDetailsResponseListener) {
        if (!isReady()) {
            productDetailsResponseListener.onProductDetailsResponse(zzbc.zzm, new ArrayList());
        } else if (!this.zzs) {
            zzb.zzo("BillingClient", "Querying product details is not supported.");
            productDetailsResponseListener.onProductDetailsResponse(zzbc.zzv, new ArrayList());
        } else {
            if (zzJ(new zzt(this, queryProductDetailsParams, productDetailsResponseListener), 30000, new zzu(productDetailsResponseListener), zzF()) == null) {
                productDetailsResponseListener.onProductDetailsResponse(zzH(), new ArrayList());
            }
        }
    }

    public void queryPurchasesAsync(QueryPurchasesParams queryPurchasesParams, PurchasesResponseListener purchasesResponseListener) {
        zzM(queryPurchasesParams.zza(), purchasesResponseListener);
    }

    public final void querySkuDetailsAsync(SkuDetailsParams skuDetailsParams, SkuDetailsResponseListener skuDetailsResponseListener) {
        if (!isReady()) {
            skuDetailsResponseListener.onSkuDetailsResponse(zzbc.zzm, (List<SkuDetails>) null);
            return;
        }
        String skuType = skuDetailsParams.getSkuType();
        List<String> skusList = skuDetailsParams.getSkusList();
        if (TextUtils.isEmpty(skuType)) {
            zzb.zzo("BillingClient", "Please fix the input params. SKU type can't be empty.");
            skuDetailsResponseListener.onSkuDetailsResponse(zzbc.zzf, (List<SkuDetails>) null);
        } else if (skusList != null) {
            ArrayList arrayList = new ArrayList();
            for (String zza2 : skusList) {
                zzbv zzbv = new zzbv((zzbu) null);
                zzbv.zza(zza2);
                arrayList.add(zzbv.zzb());
            }
            if (zzJ(new zzr(this, skuType, arrayList, (String) null, skuDetailsResponseListener), 30000, new zzz(skuDetailsResponseListener), zzF()) == null) {
                skuDetailsResponseListener.onSkuDetailsResponse(zzH(), (List<SkuDetails>) null);
            }
        } else {
            zzb.zzo("BillingClient", "Please fix the input params. The list of SKUs can't be empty - set SKU list or SkuWithOffer list.");
            skuDetailsResponseListener.onSkuDetailsResponse(zzbc.zze, (List<SkuDetails>) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzE(BillingResult billingResult) {
        if (this.zzd.zzc() != null) {
            this.zzd.zzc().onPurchasesUpdated(billingResult, (List<Purchase>) null);
            return;
        }
        this.zzd.zzb();
        zzb.zzo("BillingClient", "No valid listener is set in BroadcastManager");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Bundle zzc(int i, String str, String str2, BillingFlowParams billingFlowParams, Bundle bundle) throws Exception {
        return this.zzf.zzg(i, this.zze.getPackageName(), str, str2, (String) null, bundle);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Bundle zzd(String str, String str2) throws Exception {
        return this.zzf.zzf(3, this.zze.getPackageName(), str, str2, (String) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzk(AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) throws Exception {
        try {
            Bundle zzd2 = this.zzf.zzd(9, this.zze.getPackageName(), acknowledgePurchaseParams.getPurchaseToken(), zzb.zzc(acknowledgePurchaseParams, this.zzb));
            int zzb2 = zzb.zzb(zzd2, "BillingClient");
            String zzk2 = zzb.zzk(zzd2, "BillingClient");
            BillingResult.Builder newBuilder = BillingResult.newBuilder();
            newBuilder.setResponseCode(zzb2);
            newBuilder.setDebugMessage(zzk2);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(newBuilder.build());
            return null;
        } catch (Exception e2) {
            zzb.zzp("BillingClient", "Error acknowledge purchase!", e2);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzbc.zzm);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzm(QueryProductDetailsParams queryProductDetailsParams, ProductDetailsResponseListener productDetailsResponseListener) throws Exception {
        String str;
        ArrayList arrayList = new ArrayList();
        String zzb2 = queryProductDetailsParams.zzb();
        zzu zza2 = queryProductDetailsParams.zza();
        int size = zza2.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            str = "Item is unavailable for purchase.";
            if (i2 >= size) {
                str = "";
                break;
            }
            int i3 = i2 + 20;
            ArrayList arrayList2 = new ArrayList(zza2.subList(i2, i3 > size ? size : i3));
            ArrayList arrayList3 = new ArrayList();
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                arrayList3.add(((QueryProductDetailsParams.Product) arrayList2.get(i4)).zza());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
            bundle.putString("playBillingLibraryVersion", this.zzb);
            try {
                int i5 = i3;
                Bundle zzl2 = this.zzf.zzl(17, this.zze.getPackageName(), zzb2, bundle, zzb.zzg(this.zzb, arrayList2, (String) null));
                if (zzl2 == null) {
                    zzb.zzo("BillingClient", "queryProductDetailsAsync got empty product details response.");
                    break;
                } else if (!zzl2.containsKey("DETAILS_LIST")) {
                    i = zzb.zzb(zzl2, "BillingClient");
                    str = zzb.zzk(zzl2, "BillingClient");
                    if (i != 0) {
                        zzb.zzo("BillingClient", "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + i);
                    } else {
                        zzb.zzo("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.");
                    }
                } else {
                    ArrayList<String> stringArrayList = zzl2.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList == null) {
                        zzb.zzo("BillingClient", "queryProductDetailsAsync got null response list");
                        break;
                    }
                    int i6 = 0;
                    while (i6 < stringArrayList.size()) {
                        try {
                            ProductDetails productDetails = new ProductDetails(stringArrayList.get(i6));
                            zzb.zzn("BillingClient", "Got product details: ".concat(productDetails.toString()));
                            arrayList.add(productDetails);
                            i6++;
                        } catch (JSONException e2) {
                            zzb.zzp("BillingClient", "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e2);
                            str = "Error trying to decode SkuDetails.";
                            i = 6;
                            BillingResult.Builder newBuilder = BillingResult.newBuilder();
                            newBuilder.setResponseCode(i);
                            newBuilder.setDebugMessage(str);
                            productDetailsResponseListener.onProductDetailsResponse(newBuilder.build(), arrayList);
                            return null;
                        }
                    }
                    i2 = i5;
                }
            } catch (Exception e3) {
                zzb.zzp("BillingClient", "queryProductDetailsAsync got a remote exception (try to reconnect).", e3);
                str = "An internal error occurred.";
            }
        }
        i = 4;
        BillingResult.Builder newBuilder2 = BillingResult.newBuilder();
        newBuilder2.setResponseCode(i);
        newBuilder2.setDebugMessage(str);
        productDetailsResponseListener.onProductDetailsResponse(newBuilder2.build(), arrayList);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008d, code lost:
        r0 = null;
        r4 = 4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object zzn(java.lang.String r22, java.util.List r23, java.lang.String r24, com.android.billingclient.api.SkuDetailsResponseListener r25) throws java.lang.Exception {
        /*
            r21 = this;
            r1 = r21
            java.lang.String r2 = "BillingClient"
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r3 = r23.size()
            r5 = 0
        L_0x000e:
            r6 = 6
            r7 = 4
            java.lang.String r8 = "Item is unavailable for purchase."
            r9 = 0
            if (r5 >= r3) goto L_0x0109
            int r10 = r5 + 20
            if (r10 <= r3) goto L_0x001b
            r11 = r3
            goto L_0x001c
        L_0x001b:
            r11 = r10
        L_0x001c:
            java.util.ArrayList r12 = new java.util.ArrayList
            r13 = r23
            java.util.List r5 = r13.subList(r5, r11)
            r12.<init>(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r11 = r12.size()
            r14 = 0
        L_0x0031:
            if (r14 >= r11) goto L_0x0043
            java.lang.Object r15 = r12.get(r14)
            com.android.billingclient.api.zzbx r15 = (com.android.billingclient.api.zzbx) r15
            java.lang.String r15 = r15.zza()
            r5.add(r15)
            int r14 = r14 + 1
            goto L_0x0031
        L_0x0043:
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
            java.lang.String r14 = "ITEM_ID_LIST"
            r11.putStringArrayList(r14, r5)
            java.lang.String r5 = r1.zzb
            java.lang.String r14 = "playBillingLibraryVersion"
            r11.putString(r14, r5)
            boolean r5 = r1.zzn     // Catch:{ Exception -> 0x00fe }
            if (r5 == 0) goto L_0x0077
            com.google.android.gms.internal.play_billing.zze r15 = r1.zzf     // Catch:{ Exception -> 0x00fe }
            r16 = 10
            android.content.Context r5 = r1.zze     // Catch:{ Exception -> 0x00fe }
            java.lang.String r17 = r5.getPackageName()     // Catch:{ Exception -> 0x00fe }
            int r5 = r1.zzj     // Catch:{ Exception -> 0x00fe }
            boolean r14 = r1.zzt     // Catch:{ Exception -> 0x00fe }
            java.lang.String r4 = r1.zzb     // Catch:{ Exception -> 0x00fe }
            android.os.Bundle r20 = com.google.android.gms.internal.play_billing.zzb.zze(r5, r14, r4, r9, r12)     // Catch:{ Exception -> 0x00fe }
            r18 = r22
            r19 = r11
            android.os.Bundle r4 = r15.zzl(r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x00fe }
            r14 = r22
            goto L_0x0086
        L_0x0077:
            com.google.android.gms.internal.play_billing.zze r4 = r1.zzf     // Catch:{ Exception -> 0x00fe }
            r5 = 3
            android.content.Context r12 = r1.zze     // Catch:{ Exception -> 0x00fe }
            java.lang.String r12 = r12.getPackageName()     // Catch:{ Exception -> 0x00fe }
            r14 = r22
            android.os.Bundle r4 = r4.zzk(r5, r12, r14, r11)     // Catch:{ Exception -> 0x00fe }
        L_0x0086:
            if (r4 != 0) goto L_0x0091
            java.lang.String r0 = "querySkuDetailsAsync got null sku details list"
            com.google.android.gms.internal.play_billing.zzb.zzo(r2, r0)
        L_0x008d:
            r0 = r9
            r4 = 4
            goto L_0x010c
        L_0x0091:
            java.lang.String r5 = "DETAILS_LIST"
            boolean r11 = r4.containsKey(r5)
            if (r11 != 0) goto L_0x00c0
            int r3 = com.google.android.gms.internal.play_billing.zzb.zzb(r4, r2)
            java.lang.String r8 = com.google.android.gms.internal.play_billing.zzb.zzk(r4, r2)
            if (r3 == 0) goto L_0x00b9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "getSkuDetails() failed. Response code: "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            com.google.android.gms.internal.play_billing.zzb.zzo(r2, r4)
            r4 = r3
            goto L_0x010c
        L_0x00b9:
            java.lang.String r3 = "getSkuDetails() returned a bundle with neither an error nor a detail list."
            com.google.android.gms.internal.play_billing.zzb.zzo(r2, r3)
        L_0x00be:
            r4 = 6
            goto L_0x010c
        L_0x00c0:
            java.util.ArrayList r4 = r4.getStringArrayList(r5)
            if (r4 != 0) goto L_0x00cc
            java.lang.String r0 = "querySkuDetailsAsync got null response list"
            com.google.android.gms.internal.play_billing.zzb.zzo(r2, r0)
            goto L_0x008d
        L_0x00cc:
            r5 = 0
        L_0x00cd:
            int r7 = r4.size()
            if (r5 >= r7) goto L_0x00fb
            java.lang.Object r7 = r4.get(r5)
            java.lang.String r7 = (java.lang.String) r7
            com.android.billingclient.api.SkuDetails r8 = new com.android.billingclient.api.SkuDetails     // Catch:{ JSONException -> 0x00f1 }
            r8.<init>(r7)     // Catch:{ JSONException -> 0x00f1 }
            java.lang.String r7 = r8.toString()
            java.lang.String r11 = "Got sku details: "
            java.lang.String r7 = r11.concat(r7)
            com.google.android.gms.internal.play_billing.zzb.zzn(r2, r7)
            r0.add(r8)
            int r5 = r5 + 1
            goto L_0x00cd
        L_0x00f1:
            r0 = move-exception
            java.lang.String r3 = "Got a JSON exception trying to decode SkuDetails."
            com.google.android.gms.internal.play_billing.zzb.zzp(r2, r3, r0)
            java.lang.String r8 = "Error trying to decode SkuDetails."
            r0 = r9
            goto L_0x00be
        L_0x00fb:
            r5 = r10
            goto L_0x000e
        L_0x00fe:
            r0 = move-exception
            java.lang.String r3 = "querySkuDetailsAsync got a remote exception (try to reconnect)."
            com.google.android.gms.internal.play_billing.zzb.zzp(r2, r3, r0)
            r4 = -1
            java.lang.String r8 = "Service connection is disconnected."
            r0 = r9
            goto L_0x010c
        L_0x0109:
            java.lang.String r8 = ""
            r4 = 0
        L_0x010c:
            com.android.billingclient.api.BillingResult$Builder r2 = com.android.billingclient.api.BillingResult.newBuilder()
            r2.setResponseCode(r4)
            r2.setDebugMessage(r8)
            com.android.billingclient.api.BillingResult r2 = r2.build()
            r3 = r25
            r3.onSkuDetailsResponse(r2, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.BillingClientImpl.zzn(java.lang.String, java.util.List, java.lang.String, com.android.billingclient.api.SkuDetailsResponseListener):java.lang.Object");
    }

    public final void queryPurchaseHistoryAsync(String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        zzL(str, purchaseHistoryResponseListener);
    }

    public void queryPurchasesAsync(String str, PurchasesResponseListener purchasesResponseListener) {
        zzM(str, purchasesResponseListener);
    }

    private BillingClientImpl(Context context, boolean z, PurchasesUpdatedListener purchasesUpdatedListener, String str, String str2, zzc zzc2) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzj = 0;
        this.zzb = str;
        initialize(context, purchasesUpdatedListener, z, (zzc) null);
    }

    BillingClientImpl(String str, boolean z, Context context, zzbf zzbf) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzj = 0;
        this.zzb = zzI();
        this.zze = context.getApplicationContext();
        zzb.zzo("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.zzd = new zzp(this.zze, (zzbf) null);
        this.zzt = z;
    }

    BillingClientImpl(String str, boolean z, Context context, PurchasesUpdatedListener purchasesUpdatedListener, zzc zzc2) {
        this(context, z, purchasesUpdatedListener, zzI(), (String) null, (zzc) null);
    }

    public final void startConnection(BillingClientStateListener billingClientStateListener) {
        if (isReady()) {
            zzb.zzn("BillingClient", "Service connection is valid. No need to re-initialize.");
            billingClientStateListener.onBillingSetupFinished(zzbc.zzl);
        } else if (this.zza == 1) {
            zzb.zzo("BillingClient", "Client is already in the process of connecting to billing service.");
            billingClientStateListener.onBillingSetupFinished(zzbc.zzd);
        } else if (this.zza == 3) {
            zzb.zzo("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            billingClientStateListener.onBillingSetupFinished(zzbc.zzm);
        } else {
            this.zza = 1;
            this.zzd.zze();
            zzb.zzn("BillingClient", "Starting in-app billing setup.");
            this.zzg = new zzaq(this, billingClientStateListener, (zzap) null);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.zze.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                ResolveInfo resolveInfo = queryIntentServices.get(0);
                if (resolveInfo.serviceInfo != null) {
                    String str = resolveInfo.serviceInfo.packageName;
                    String str2 = resolveInfo.serviceInfo.name;
                    if (!"com.android.vending".equals(str) || str2 == null) {
                        zzb.zzo("BillingClient", "The device doesn't have valid Play Store.");
                    } else {
                        ComponentName componentName = new ComponentName(str, str2);
                        Intent intent2 = new Intent(intent);
                        intent2.setComponent(componentName);
                        intent2.putExtra("playBillingLibraryVersion", this.zzb);
                        if (this.zze.bindService(intent2, this.zzg, 1)) {
                            zzb.zzn("BillingClient", "Service was bonded successfully.");
                            return;
                        }
                        zzb.zzo("BillingClient", "Connection to Billing service is blocked.");
                    }
                }
            }
            this.zza = 0;
            zzb.zzn("BillingClient", "Billing service unavailable on device.");
            billingClientStateListener.onBillingSetupFinished(zzbc.zzc);
        }
    }
}
