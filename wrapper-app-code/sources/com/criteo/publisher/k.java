package com.criteo.publisher;

/* compiled from: CriteoAdListener */
public interface k {

    /* renamed from: com.criteo.publisher.k$-CC  reason: invalid class name */
    /* compiled from: CriteoAdListener */
    public final /* synthetic */ class CC {
        public static void $default$onAdClicked(k kVar) {
        }

        public static void $default$onAdFailedToReceive(k kVar, CriteoErrorCode criteoErrorCode) {
        }

        public static void $default$onAdLeftApplication(k kVar) {
        }
    }

    void onAdClicked();

    void onAdFailedToReceive(CriteoErrorCode criteoErrorCode);

    void onAdLeftApplication();
}
