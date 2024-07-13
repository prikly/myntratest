package com.yandex.metrica.networktasks.impl;

import com.yandex.metrica.networktasks.api.ExponentialBackoffPolicy;
import com.yandex.metrica.networktasks.api.IExecutionPolicy;
import com.yandex.metrica.networktasks.api.NetworkTask;
import kotlin.jvm.internal.Intrinsics;

public final class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final NetworkTask f7349a;

    /* renamed from: b  reason: collision with root package name */
    private final c f7350b;

    /* renamed from: c  reason: collision with root package name */
    private final d f7351c;

    public f(NetworkTask networkTask, c cVar, d dVar) {
        Intrinsics.checkNotNullParameter(networkTask, "networkTask");
        Intrinsics.checkNotNullParameter(cVar, "rootThreadStateSource");
        Intrinsics.checkNotNullParameter(dVar, "taskPerformingStrategy");
        this.f7349a = networkTask;
        this.f7350b = cVar;
        this.f7351c = dVar;
    }

    public void run() {
        ExponentialBackoffPolicy exponentialBackoffPolicy = this.f7349a.getExponentialBackoffPolicy();
        Intrinsics.checkNotNullExpressionValue(exponentialBackoffPolicy, "networkTask.exponentialBackoffPolicy");
        IExecutionPolicy connectionExecutionPolicy = this.f7349a.getConnectionExecutionPolicy();
        Intrinsics.checkNotNullExpressionValue(connectionExecutionPolicy, "networkTask.connectionExecutionPolicy");
        boolean z = true;
        if (!this.f7350b.isRunning() || !connectionExecutionPolicy.canBeExecuted() || !exponentialBackoffPolicy.canBeExecuted(this.f7349a.getRetryPolicyConfig())) {
            z = false;
        } else {
            boolean onCreateNetworkTask = this.f7349a.onCreateNetworkTask();
            Boolean bool = null;
            while (this.f7350b.isRunning() && onCreateNetworkTask && exponentialBackoffPolicy.canBeExecuted(this.f7349a.getRetryPolicyConfig())) {
                bool = Boolean.valueOf(this.f7351c.a(this.f7349a));
                onCreateNetworkTask = !bool.booleanValue() && this.f7349a.shouldTryNextHost();
                exponentialBackoffPolicy.onHostAttemptFinished(bool.booleanValue());
            }
            if (bool != null) {
                exponentialBackoffPolicy.onAllHostsAttemptsFinished(bool.booleanValue());
            }
        }
        if (!z) {
            this.f7349a.onShouldNotExecute();
        }
    }
}
