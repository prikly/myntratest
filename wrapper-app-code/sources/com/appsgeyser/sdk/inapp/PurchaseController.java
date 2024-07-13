package com.appsgeyser.sdk.inapp;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.appsgeyser.sdk.AppsgeyserSDK;
import com.appsgeyser.sdk.configuration.PreferencesCoder;
import com.appsgeyser.sdk.configuration.models.ConfigPhp;
import com.appsgeyser.sdk.inapp.PurchaseController;
import com.appsgeyser.sdk.inapp.billing.BillingAdapter;
import com.appsgeyser.sdk.inapp.models.BillingProduct;
import com.appsgeyser.sdk.inapp.models.configdata.AccessData;
import com.appsgeyser.sdk.inapp.models.configdata.ConfigInappData;
import com.appsgeyser.sdk.inapp.models.configdata.DisableAdsData;
import com.appsgeyser.sdk.inapp.models.statuses.ErrorStatus;
import com.appsgeyser.sdk.inapp.models.statuses.LoadingStatus;
import com.appsgeyser.sdk.inapp.models.statuses.Status;
import com.appsgeyser.sdk.inapp.models.statuses.SuccessStatus;
import com.appsgeyser.sdk.inapp.utils.Decoder;
import com.appsgeyser.sdk.inapp.utils.DisableAdsSharedPrefs;
import com.appsgeyser.sdk.server.StatController;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import rx.functions.Action1;
import rx.subjects.BehaviorSubject;

public class PurchaseController {
    private static PurchaseController instance;
    private final String KEY_PRICE_CURRENCY = "currency";
    private final String KEY_PRICE_VALUE = AppMeasurementSdk.ConditionalUserProperty.VALUE;
    private final String LOG_TAG = "PurchaseController";
    /* access modifiers changed from: private */
    public AccessData accessData = null;
    /* access modifiers changed from: private */
    public final BehaviorSubject<Status> accessStatusSubject = BehaviorSubject.create(new LoadingStatus());
    private BillingAdapter billingAdapter;
    /* access modifiers changed from: private */
    public Context context;
    /* access modifiers changed from: private */
    public DisableAdsData disableAdsData = null;
    /* access modifiers changed from: private */
    public final BehaviorSubject<Status> disableAdsStatusSubject = BehaviorSubject.create(new LoadingStatus());
    private boolean isAccessDataReceivingComplete = false;
    private boolean isDisableAdsDataReceivingComplete = false;
    /* access modifiers changed from: private */
    public PurchaseListener purchaseListener = null;
    private String wid;

    public interface PurchaseListener {
        void onErrorPurchase(String str);

        void onSuccessPurchase();
    }

    private PurchaseController() {
    }

    public void init(Context context2, String str) {
        this.context = context2;
        this.wid = str;
        registerAccessDataListener();
        registerDisableAdsDataListener();
    }

    public static PurchaseController getInstance() {
        if (instance == null) {
            instance = new PurchaseController();
        }
        return instance;
    }

    public void subscribeAccessStatus(Action1<? super Status> action1) {
        this.accessStatusSubject.subscribe(action1);
    }

    public void subscribeDisableAdsStatus(Action1<? super Status> action1) {
        this.disableAdsStatusSubject.subscribe(action1);
    }

    public void purchaseAccess(Activity activity, PurchaseListener purchaseListener2) {
        if (isInappKeyValid(this.accessData)) {
            purchase(activity, purchaseListener2, this.accessData);
            return;
        }
        Log.e("PurchaseController", "Invalid access data");
        purchaseListener2.onErrorPurchase("Invalid access data");
    }

    public void purchaseDisableAds(Activity activity, PurchaseListener purchaseListener2) {
        if (isInappKeyValid(this.disableAdsData)) {
            purchase(activity, purchaseListener2, this.disableAdsData);
            return;
        }
        Log.e("PurchaseController", "Invalid disable ads data");
        purchaseListener2.onErrorPurchase("Invalid disable ads data");
    }

    private void purchase(Activity activity, PurchaseListener purchaseListener2, ConfigInappData configInappData) {
        this.purchaseListener = purchaseListener2;
        this.billingAdapter.purchase(activity, configInappData.getInappKey());
    }

    private void registerAccessDataListener() {
        AppsgeyserSDK.isAccessDataEnable(this.context, new AppsgeyserSDK.OnAccessDataEnableListener() {
            public final void onAccessDataEnable(String str) {
                PurchaseController.this.lambda$registerAccessDataListener$0$PurchaseController(str);
            }
        });
    }

    public /* synthetic */ void lambda$registerAccessDataListener$0$PurchaseController(String str) {
        if (str != null) {
            this.accessData = AccessData.parseFromJson(Decoder.encrypt(str, this.wid, "InAppAccess"));
        } else {
            Log.e("PurchaseController", "Error to catch access data from config: no data");
        }
        Log.d("PurchaseController", "accessData = " + this.accessData);
        this.isAccessDataReceivingComplete = true;
        initBilling();
    }

    private void registerDisableAdsDataListener() {
        AppsgeyserSDK.isDisableAdsDataEnable(this.context, new AppsgeyserSDK.OnDisableAdsDataEnableListener() {
            public final void onDisableAdsDataEnable(String str) {
                PurchaseController.this.lambda$registerDisableAdsDataListener$1$PurchaseController(str);
            }
        });
    }

    public /* synthetic */ void lambda$registerDisableAdsDataListener$1$PurchaseController(String str) {
        if (str != null) {
            this.disableAdsData = DisableAdsData.parseFromJson(Decoder.encrypt(str, this.wid, "DisableAds"));
        } else {
            Log.e("PurchaseController", "Error to catch disable ads data from config: no data");
        }
        Log.d("PurchaseController", "disableAdsData = " + this.disableAdsData);
        this.isDisableAdsDataReceivingComplete = true;
        initBilling();
    }

    private void initBilling() {
        if (this.isDisableAdsDataReceivingComplete && this.isAccessDataReceivingComplete) {
            ArrayList arrayList = new ArrayList();
            AccessData accessData2 = this.accessData;
            if (accessData2 == null) {
                Log.e("PurchaseController", "Invalid config access data");
                this.accessStatusSubject.onNext(new ErrorStatus.ConfigErrorStatus("Invalid config access data"));
            } else if (!accessData2.isActive()) {
                this.accessStatusSubject.onNext(new SuccessStatus((BillingProduct) null, (ConfigInappData) null, false, false));
            } else if (isInappKeyValid(this.accessData)) {
                arrayList.add(this.accessData.getInappKey());
            } else {
                this.accessStatusSubject.onNext(new ErrorStatus.ConfigErrorStatus("Invalid access inapp key data"));
                Log.e("PurchaseController", "Invalid access inapp key data");
            }
            DisableAdsData disableAdsData2 = this.disableAdsData;
            if (disableAdsData2 == null) {
                Log.e("PurchaseController", "Invalid config disableAds data");
                this.disableAdsStatusSubject.onNext(new ErrorStatus.ConfigErrorStatus("Invalid config disableAds data"));
            } else if (!disableAdsData2.isActive()) {
                this.disableAdsStatusSubject.onNext(new SuccessStatus((BillingProduct) null, (ConfigInappData) null, false, false));
            } else if (isInappKeyValid(this.disableAdsData)) {
                arrayList.add(this.disableAdsData.getInappKey());
            } else {
                this.disableAdsStatusSubject.onNext(new ErrorStatus.ConfigErrorStatus("Invalid disable ads inapp key data"));
                Log.e("PurchaseController", "Invalid disable ads inapp key data");
            }
            if (!arrayList.isEmpty()) {
                this.billingAdapter = new BillingAdapter(this.context, arrayList, "inapp", new BillingListener());
            }
        }
    }

    /* access modifiers changed from: private */
    public boolean isInappKeyValid(ConfigInappData configInappData) {
        return (configInappData == null || configInappData.getInappKey() == null || configInappData.getInappKey().equals("")) ? false : true;
    }

    /* access modifiers changed from: private */
    public boolean isComplete(BehaviorSubject<Status> behaviorSubject) {
        return behaviorSubject.getValue() instanceof SuccessStatus;
    }

    private class BillingListener implements BillingAdapter.BillingEventListener {
        private BillingListener() {
        }

        public void onProductReceiveSuccess(List<BillingProduct> list) {
            for (BillingProduct next : list) {
                if (next.getId().equals(PurchaseController.this.accessData.getInappKey())) {
                    if (next.isPurchased()) {
                        PurchaseController.this.accessStatusSubject.onNext(new SuccessStatus(next, PurchaseController.this.accessData, true, true));
                    } else {
                        PurchaseController.this.accessStatusSubject.onNext(new SuccessStatus(next, PurchaseController.this.accessData, true, false));
                    }
                    PurchaseController.this.sendSuccessProductLoadedStatRequest("inapp_access_products_loaded");
                }
                if (next.getId().equals(PurchaseController.this.disableAdsData.getInappKey())) {
                    if (next.isPurchased()) {
                        PurchaseController.this.disableAdsStatusSubject.onNext(new SuccessStatus(next, PurchaseController.this.disableAdsData, true, true));
                        DisableAdsSharedPrefs.getInstance().saveDisableAdsPurchaseFlag(true);
                    } else {
                        PurchaseController.this.disableAdsStatusSubject.onNext(new SuccessStatus(next, PurchaseController.this.disableAdsData, true, false));
                        DisableAdsSharedPrefs.getInstance().saveDisableAdsPurchaseFlag(false);
                    }
                    PurchaseController.this.sendSuccessProductLoadedStatRequest("inapp_disable_ads_products_loaded");
                }
            }
        }

        public void onProductReceiveError(String str) {
            Log.e("PurchaseController", "Receiving products error, message: \"" + str + "\"");
            PurchaseController purchaseController = PurchaseController.this;
            if (!purchaseController.isComplete(purchaseController.accessStatusSubject)) {
                BehaviorSubject access$200 = PurchaseController.this.accessStatusSubject;
                access$200.onNext(new ErrorStatus.BillingErrorStatus("Receiving products error, message: \"" + str + "\""));
            }
            PurchaseController purchaseController2 = PurchaseController.this;
            if (!purchaseController2.isComplete(purchaseController2.disableAdsStatusSubject)) {
                BehaviorSubject access$500 = PurchaseController.this.disableAdsStatusSubject;
                access$500.onNext(new ErrorStatus.BillingErrorStatus("Receiving products error, message: \"" + str + "\""));
            }
        }

        public void onPurchaseSuccess(String str, String str2, String str3) {
            Log.d("PurchaseController", "PurchaseController onPurchaseSuccess inappKey = " + str3);
            new Handler(PurchaseController.this.context.getMainLooper()).post(new Runnable(str3, str, str2) {
                public final /* synthetic */ String f$1;
                public final /* synthetic */ String f$2;
                public final /* synthetic */ String f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final void run() {
                    PurchaseController.BillingListener.this.lambda$onPurchaseSuccess$0$PurchaseController$BillingListener(this.f$1, this.f$2, this.f$3);
                }
            });
        }

        public /* synthetic */ void lambda$onPurchaseSuccess$0$PurchaseController$BillingListener(String str, String str2, String str3) {
            PurchaseController purchaseController = PurchaseController.this;
            if (purchaseController.isInappKeyValid(purchaseController.disableAdsData) && str.equals(PurchaseController.this.disableAdsData.getInappKey())) {
                DisableAdsSharedPrefs.getInstance().saveDisableAdsPurchaseFlag(true);
                PurchaseController.this.disableAdsStatusSubject.onNext(new SuccessStatus((BillingProduct) null, PurchaseController.this.disableAdsData, true, true));
            }
            PurchaseController purchaseController2 = PurchaseController.this;
            if (purchaseController2.isInappKeyValid(purchaseController2.accessData) && str.equals(PurchaseController.this.accessData.getInappKey())) {
                PurchaseController.this.accessStatusSubject.onNext(new SuccessStatus((BillingProduct) null, PurchaseController.this.accessData, true, true));
            }
            PurchaseController.this.purchaseListener.onSuccessPurchase();
            PurchaseController.this.sendSuccessPurchaseStatRequest(str2, str3, str);
        }

        public void onPurchaseError(int i, String str) {
            if (i != 1) {
                Log.e("PurchaseController", "Purchase error, code: " + i + ", message: " + str);
                PurchaseListener access$800 = PurchaseController.this.purchaseListener;
                access$800.onErrorPurchase("Purchase error, code: " + i + ", message: " + str);
            }
        }

        public void onConnectionError() {
            Log.e("PurchaseController", "Connection to Google Billing failed");
            PurchaseController purchaseController = PurchaseController.this;
            if (!purchaseController.isComplete(purchaseController.accessStatusSubject)) {
                PurchaseController.this.accessStatusSubject.onNext(new ErrorStatus.BillingErrorStatus("Connection to Google Billing failed"));
            }
            PurchaseController purchaseController2 = PurchaseController.this;
            if (!purchaseController2.isComplete(purchaseController2.disableAdsStatusSubject)) {
                PurchaseController.this.disableAdsStatusSubject.onNext(new ErrorStatus.BillingErrorStatus("Connection to Google Billing failed"));
            }
        }
    }

    /* access modifiers changed from: private */
    public void sendSuccessPurchaseStatRequest(String str, String str2, String str3) {
        String str4;
        if (isInappKeyValid(this.accessData) && str3.equals(this.accessData.getInappKey())) {
            Log.d("PurchaseController", "PurchaseController send Access events");
            str4 = "inapp_access_new_purchase";
        } else if (!isInappKeyValid(this.disableAdsData) || !str3.equals(this.disableAdsData.getInappKey())) {
            Log.d("PurchaseController", "PurchaseController events not sended");
            return;
        } else {
            Log.d("PurchaseController", "PurchaseController send Disable Ads events");
            str4 = "inapp_disable_ads_new_purchase";
        }
        HashMap hashMap = new HashMap();
        hashMap.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, str);
        hashMap.put("currency", str2);
        StatController.getInstance().sendRequestAsyncByKey(str4, hashMap, this.context, false);
    }

    /* access modifiers changed from: private */
    public void sendSuccessProductLoadedStatRequest(String str) {
        String prefString = new PreferencesCoder(this.context).getPrefString("ServerResponse", (String) null);
        if (prefString != null) {
            StatController.getInstance().init(new HashMap(ConfigPhp.parseFromJson(prefString).getStatUrls()));
            StatController.getInstance().sendRequestAsyncByKey(str);
        }
    }
}
