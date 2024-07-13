package com.yandex.metrica.networktasks.api;

public interface ExponentialBackoffPolicy {
    boolean canBeExecuted(RetryPolicyConfig retryPolicyConfig);

    void onAllHostsAttemptsFinished(boolean z);

    void onHostAttemptFinished(boolean z);
}
