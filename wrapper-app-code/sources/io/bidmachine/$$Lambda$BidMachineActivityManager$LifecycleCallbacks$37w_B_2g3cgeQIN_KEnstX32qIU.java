package io.bidmachine;

/* renamed from: io.bidmachine.-$$Lambda$BidMachineActivityManager$LifecycleCallbacks$37w_B_2g3cgeQIN_KEnstX32qIU  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$BidMachineActivityManager$LifecycleCallbacks$37w_B_2g3cgeQIN_KEnstX32qIU implements Runnable {
    public static final /* synthetic */ $$Lambda$BidMachineActivityManager$LifecycleCallbacks$37w_B_2g3cgeQIN_KEnstX32qIU INSTANCE = new $$Lambda$BidMachineActivityManager$LifecycleCallbacks$37w_B_2g3cgeQIN_KEnstX32qIU();

    private /* synthetic */ $$Lambda$BidMachineActivityManager$LifecycleCallbacks$37w_B_2g3cgeQIN_KEnstX32qIU() {
    }

    public final void run() {
        SessionManager.get().resume();
    }
}
