package io.bidmachine;

/* renamed from: io.bidmachine.-$$Lambda$BidMachineActivityManager$LifecycleCallbacks$1sGPS43_ZgwhmcxfAB8tnnTeWHs  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$BidMachineActivityManager$LifecycleCallbacks$1sGPS43_ZgwhmcxfAB8tnnTeWHs implements Runnable {
    public static final /* synthetic */ $$Lambda$BidMachineActivityManager$LifecycleCallbacks$1sGPS43_ZgwhmcxfAB8tnnTeWHs INSTANCE = new $$Lambda$BidMachineActivityManager$LifecycleCallbacks$1sGPS43_ZgwhmcxfAB8tnnTeWHs();

    private /* synthetic */ $$Lambda$BidMachineActivityManager$LifecycleCallbacks$1sGPS43_ZgwhmcxfAB8tnnTeWHs() {
    }

    public final void run() {
        SessionManager.get().pause();
    }
}
