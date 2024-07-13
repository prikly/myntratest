package com.yandex.metrica.coreutils.services;

import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.coreutils.services.ActivationBarrier;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FirstExecutionConditionService {
    private UtilityServiceConfiguration configuration;
    private final List<FirstExecutionHandler> mFirstExecutionHandlers = new ArrayList();

    public static class FirstExecutionDelayChecker {
        public boolean delaySinceFirstStartupWasPassed(long j, long j2, long j3) {
            return j2 - j >= j3;
        }
    }

    public static class FirstExecutionConditionChecker {
        private boolean firstExecutionAlreadyAllowed;
        private long initialUpdateConfigTime;
        private long lastUpdateConfigTime;
        private long mDelay;
        private final FirstExecutionDelayChecker mFirstExecutionDelayChecker;
        public final String tag;

        FirstExecutionConditionChecker(UtilityServiceConfiguration utilityServiceConfiguration, String str) {
            this(utilityServiceConfiguration, new FirstExecutionDelayChecker(), str);
        }

        public FirstExecutionConditionChecker(UtilityServiceConfiguration utilityServiceConfiguration, FirstExecutionDelayChecker firstExecutionDelayChecker, String str) {
            long j;
            this.mFirstExecutionDelayChecker = firstExecutionDelayChecker;
            this.firstExecutionAlreadyAllowed = false;
            long j2 = 0;
            if (utilityServiceConfiguration == null) {
                j = 0;
            } else {
                j = utilityServiceConfiguration.getInitialConfigTime();
            }
            this.initialUpdateConfigTime = j;
            this.lastUpdateConfigTime = utilityServiceConfiguration != null ? utilityServiceConfiguration.getLastUpdateConfigTime() : j2;
            this.mDelay = Long.MAX_VALUE;
            this.tag = str;
        }

        /* access modifiers changed from: package-private */
        public boolean shouldExecute() {
            if (this.firstExecutionAlreadyAllowed) {
                return true;
            }
            return this.mFirstExecutionDelayChecker.delaySinceFirstStartupWasPassed(this.initialUpdateConfigTime, this.lastUpdateConfigTime, this.mDelay);
        }

        /* access modifiers changed from: package-private */
        public void setDelay(long j, TimeUnit timeUnit) {
            this.mDelay = timeUnit.toMillis(j);
        }

        /* access modifiers changed from: package-private */
        public void setFirstExecutionAlreadyAllowed() {
            this.firstExecutionAlreadyAllowed = true;
        }

        /* access modifiers changed from: package-private */
        public void updateConfig(UtilityServiceConfiguration utilityServiceConfiguration) {
            this.initialUpdateConfigTime = utilityServiceConfiguration.getInitialConfigTime();
            this.lastUpdateConfigTime = utilityServiceConfiguration.getLastUpdateConfigTime();
        }
    }

    public static class FirstExecutionHandler {
        private final ActivationBarrier.ActivationBarrierHelper mActivationBarrierHelper;
        private final ICommonExecutor mExecutor;
        private FirstExecutionConditionChecker mFirstExecutionConditionChecker;

        private FirstExecutionHandler(ICommonExecutor iCommonExecutor, ActivationBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker) {
            this.mActivationBarrierHelper = activationBarrierHelper;
            this.mFirstExecutionConditionChecker = firstExecutionConditionChecker;
            this.mExecutor = iCommonExecutor;
        }

        public void updateConfig(UtilityServiceConfiguration utilityServiceConfiguration) {
            this.mFirstExecutionConditionChecker.updateConfig(utilityServiceConfiguration);
        }

        public void setDelaySeconds(long j) {
            this.mFirstExecutionConditionChecker.setDelay(j, TimeUnit.SECONDS);
        }

        public boolean tryExecute(int i) {
            if (!this.mFirstExecutionConditionChecker.shouldExecute()) {
                return false;
            }
            this.mActivationBarrierHelper.subscribeIfNeeded(TimeUnit.SECONDS.toMillis((long) i), this.mExecutor);
            this.mFirstExecutionConditionChecker.setFirstExecutionAlreadyAllowed();
            return true;
        }
    }

    public synchronized FirstExecutionHandler createFirstExecutionHandler(Runnable runnable, ICommonExecutor iCommonExecutor, String str) {
        return createFirstExecutionHandler(iCommonExecutor, new ActivationBarrier.ActivationBarrierHelper(runnable), new FirstExecutionConditionChecker(this.configuration, str));
    }

    /* access modifiers changed from: package-private */
    public synchronized FirstExecutionHandler createFirstExecutionHandler(ICommonExecutor iCommonExecutor, ActivationBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker) {
        FirstExecutionHandler firstExecutionHandler;
        firstExecutionHandler = new FirstExecutionHandler(iCommonExecutor, activationBarrierHelper, firstExecutionConditionChecker);
        this.mFirstExecutionHandlers.add(firstExecutionHandler);
        return firstExecutionHandler;
    }

    public void updateConfig(UtilityServiceConfiguration utilityServiceConfiguration) {
        ArrayList<FirstExecutionHandler> arrayList;
        synchronized (this) {
            this.configuration = utilityServiceConfiguration;
            arrayList = new ArrayList<>(this.mFirstExecutionHandlers);
        }
        for (FirstExecutionHandler updateConfig : arrayList) {
            updateConfig.updateConfig(utilityServiceConfiguration);
        }
    }
}
