package io.bidmachine;

import android.content.Context;
import io.bidmachine.AdRequest;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;

public class BidMachine {
    public static final String NAME = "BidMachine";
    private static final String TAG = "BidMachine";
    public static final String VERSION = "2.1.5";

    public static void initialize(Context context, String str) {
        initialize(context, str, (InitializationCallback) null);
    }

    public static void initialize(Context context, String str, InitializationCallback initializationCallback) {
        Logger.log("BidMachine", String.format("initialize - %s", new Object[]{str}));
        BidMachineImpl.get().initialize(context, str, initializationCallback);
    }

    public static boolean isInitialized() {
        return BidMachineImpl.get().isInitialized();
    }

    public static void setEndpoint(String str) {
        Logger.log("BidMachine", String.format("setEndpoint - %s", new Object[]{str}));
        UrlProvider.setEndpoint(str);
    }

    public static void setLoggingEnabled(boolean z) {
        if (z) {
            Logger.setLoggingEnabled(true);
            Logger.log("BidMachine", "setLoggingEnabled - true");
        } else {
            Logger.log("BidMachine", "setLoggingEnabled - false");
            Logger.setLoggingEnabled(false);
        }
        NetworkRegistry.setLoggingEnabled(z);
    }

    public static void setTestMode(boolean z) {
        Logger.log("BidMachine", String.format("setTestMode - %s", new Object[]{Boolean.valueOf(z)}));
        BidMachineImpl.get().setTestMode(z);
    }

    public static void setTargetingParams(TargetingParams targetingParams) {
        Logger.log("BidMachine", "setTargetingParams");
        BidMachineImpl.get().setTargetingParams(targetingParams);
    }

    public static void setConsentConfig(boolean z, String str) {
        Logger.log("BidMachine", String.format("setConsentConfig - %s, %s", new Object[]{Boolean.valueOf(z), str}));
        BidMachineImpl.get().getUserRestrictionParams().setConsentConfig(z, str);
    }

    public static void setSubjectToGDPR(Boolean bool) {
        Logger.log("BidMachine", String.format("setSubjectToGDPR - %s", new Object[]{bool}));
        BidMachineImpl.get().getUserRestrictionParams().setSubjectToGDPR(bool);
    }

    public static void setCoppa(Boolean bool) {
        Logger.log("BidMachine", String.format("setCoppa - %s", new Object[]{bool}));
        BidMachineImpl.get().getUserRestrictionParams().setCoppa(bool);
    }

    public static void setUSPrivacyString(String str) {
        Logger.log("BidMachine", String.format("setUSPrivacyString - %s", new Object[]{str}));
        BidMachineImpl.get().getUserRestrictionParams().setUSPrivacyString(str);
    }

    public static void setPublisher(Publisher publisher) {
        Logger.log("BidMachine", "setPublisher");
        BidMachineImpl.get().setPublisher(publisher);
    }

    public static void registerNetworks(NetworkConfig... networkConfigArr) {
        Logger.log("BidMachine", "registerNetworks with NetworkConfig array");
        NetworkRegistry.registerNetworks(networkConfigArr);
    }

    public static void registerNetworks(Context context, String str) {
        Logger.log("BidMachine", "registerNetworks with JSON string");
        NetworkRegistry.registerNetworks(context, str);
    }

    public static String getBidToken(Context context) {
        String createBidToken = BidTokenManager.createBidToken(context.getApplicationContext());
        Logger.log("BidMachine", String.format("getBidToken - %s", new Object[]{createBidToken}));
        return createBidToken;
    }

    public static void getBidToken(Context context, final BidTokenCallback bidTokenCallback) {
        final Context applicationContext = context.getApplicationContext();
        Utils.onBackgroundThread(new Runnable() {
            public void run() {
                BidTokenCallback.this.onCollected(BidMachine.getBidToken(applicationContext));
            }
        });
    }

    public static void registerAdRequestListener(AdRequest.AdRequestListener<?> adRequestListener) {
        Logger.log("BidMachine", "registerAdRequestListener");
        BidMachineImpl.get().registerAdRequestListener(adRequestListener);
    }

    public static void unregisterAdRequestListener(AdRequest.AdRequestListener<?> adRequestListener) {
        Logger.log("BidMachine", "unregisterAdRequestListener");
        BidMachineImpl.get().unregisterAdRequestListener(adRequestListener);
    }
}
