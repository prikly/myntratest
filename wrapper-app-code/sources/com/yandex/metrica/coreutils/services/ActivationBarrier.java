package com.yandex.metrica.coreutils.services;

import com.yandex.metrica.core.api.executors.ICommonExecutor;
import java.util.concurrent.TimeUnit;

public class ActivationBarrier {
    public static final long ACTIVATION_DELAY = TimeUnit.SECONDS.toMillis(10);
    private long mStartTime;
    private final SystemTimeProvider mTimeProvider;

    public interface IActivationBarrierCallback {
        void onWaitFinished();
    }

    public static class ActivationBarrierHelper {
        /* access modifiers changed from: private */
        public boolean mActivated;
        private final ActivationBarrier mActivationBarrier;
        /* access modifiers changed from: private */
        public final IActivationBarrierCallback mActivationCallback;

        public ActivationBarrierHelper(Runnable runnable) {
            this(runnable, UtilityServiceLocator.getInstance().getActivationBarrier());
        }

        ActivationBarrierHelper(final Runnable runnable, ActivationBarrier activationBarrier) {
            this.mActivated = false;
            this.mActivationCallback = new IActivationBarrierCallback() {
                public void onWaitFinished() {
                    boolean unused = ActivationBarrierHelper.this.mActivated = true;
                    runnable.run();
                }
            };
            this.mActivationBarrier = activationBarrier;
        }

        public void subscribeIfNeeded(long j, ICommonExecutor iCommonExecutor) {
            if (!this.mActivated) {
                this.mActivationBarrier.subscribe(j, iCommonExecutor, this.mActivationCallback);
            } else {
                iCommonExecutor.execute(new Runnable() {
                    public void run() {
                        ActivationBarrierHelper.this.mActivationCallback.onWaitFinished();
                    }
                });
            }
        }
    }

    public ActivationBarrier() {
        this(new SystemTimeProvider());
    }

    ActivationBarrier(SystemTimeProvider systemTimeProvider) {
        this.mTimeProvider = systemTimeProvider;
    }

    public void activate() {
        this.mStartTime = this.mTimeProvider.currentTimeMillis();
    }

    public void subscribe(long j, ICommonExecutor iCommonExecutor, final IActivationBarrierCallback iActivationBarrierCallback) {
        iCommonExecutor.executeDelayed(new Runnable() {
            public void run() {
                iActivationBarrierCallback.onWaitFinished();
            }
        }, Math.max(j - (this.mTimeProvider.currentTimeMillis() - this.mStartTime), 0));
    }
}
