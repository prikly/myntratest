package io.bidmachine;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import io.bidmachine.protobuf.InitResponse;
import java.util.UUID;

class BidMachineSharedPreference {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String KEY_BM_IFV = "bid_machine_ifv";
    private static final String KEY_INIT_DATA = "initData";
    private static final String NAME = "BidMachinePref";

    BidMachineSharedPreference() {
    }

    static String obtainIFV(Context context) {
        SharedPreferences sharedPreferences = getSharedPreferences(context);
        String str = null;
        try {
            str = sharedPreferences.getString(KEY_BM_IFV, (String) null);
        } catch (Exception unused) {
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String uuid = UUID.randomUUID().toString();
        sharedPreferences.edit().putString(KEY_BM_IFV, uuid).apply();
        return uuid;
    }

    static void storeInitResponse(Context context, InitResponse initResponse) {
        SharedPreferences sharedPreferences = getSharedPreferences(context);
        try {
            sharedPreferences.edit().putString(KEY_INIT_DATA, Base64.encodeToString(initResponse.toByteArray(), 0)).apply();
        } catch (Exception unused) {
        }
    }

    static InitResponse getInitResponse(Context context) {
        SharedPreferences sharedPreferences = getSharedPreferences(context);
        if (!sharedPreferences.contains(KEY_INIT_DATA)) {
            return null;
        }
        try {
            return InitResponse.parseFrom(Base64.decode(sharedPreferences.getString(KEY_INIT_DATA, (String) null), 0));
        } catch (Exception unused) {
            sharedPreferences.edit().remove(KEY_INIT_DATA).apply();
            return null;
        }
    }

    private static SharedPreferences getSharedPreferences(Context context) {
        return context.getSharedPreferences(NAME, 0);
    }
}
