package io.bidmachine.unified;

import io.bidmachine.nativead.NativeNetworkAdapter;

public interface UnifiedNativeAdCallback extends UnifiedAdCallback {
    void onAdLoaded(NativeNetworkAdapter nativeNetworkAdapter);
}
