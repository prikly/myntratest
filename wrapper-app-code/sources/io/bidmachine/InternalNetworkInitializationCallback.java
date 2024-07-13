package io.bidmachine;

public interface InternalNetworkInitializationCallback {
    void onFail(NetworkAdapter networkAdapter, String str);

    void onSuccess(NetworkAdapter networkAdapter);
}
