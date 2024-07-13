package io.bidmachine.nativead;

public interface NativeInteractor {
    void dispatchClick();

    void dispatchFillAd();

    void dispatchImpression();

    void dispatchShown();

    void dispatchVideoPlayFinished();
}
