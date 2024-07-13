package io.bidmachine;

public interface NetworkInitializationCallback {
    void onFail(String str);

    void onSuccess();
}
