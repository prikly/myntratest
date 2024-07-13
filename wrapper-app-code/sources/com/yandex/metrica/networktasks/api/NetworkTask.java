package com.yandex.metrica.networktasks.api;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLSocketFactory;

public class NetworkTask {

    /* renamed from: a  reason: collision with root package name */
    private d f7311a = d.EMPTY;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f7312b;

    /* renamed from: c  reason: collision with root package name */
    private final IExecutionPolicy f7313c;

    /* renamed from: d  reason: collision with root package name */
    private final ExponentialBackoffPolicy f7314d;

    /* renamed from: e  reason: collision with root package name */
    private final UnderlyingNetworkTask f7315e;

    /* renamed from: f  reason: collision with root package name */
    private final List f7316f;

    /* renamed from: g  reason: collision with root package name */
    private final String f7317g;

    public enum Method {
        GET,
        POST
    }

    public interface ShouldTryNextHostCondition {
        boolean shouldTryNextHost(int i);
    }

    public NetworkTask(Executor executor, IExecutionPolicy iExecutionPolicy, ExponentialBackoffPolicy exponentialBackoffPolicy, UnderlyingNetworkTask underlyingNetworkTask, List list, String str) {
        this.f7312b = executor;
        this.f7313c = iExecutionPolicy;
        this.f7314d = exponentialBackoffPolicy;
        this.f7315e = underlyingNetworkTask;
        this.f7316f = list;
        this.f7317g = str;
    }

    private synchronized boolean a(d dVar) {
        if (!a(dVar)) {
            return false;
        }
        this.f7311a = dVar;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        r5 = java.lang.Boolean.valueOf(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0065, code lost:
        r5 = java.lang.Boolean.TRUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0074, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0076, code lost:
        r5 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x007e, code lost:
        if (java.lang.Boolean.TRUE.equals(r5) != false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0080, code lost:
        r0 = r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean a(com.yandex.metrica.networktasks.api.d... r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0090 }
            com.yandex.metrica.networktasks.api.d r1 = r7.f7311a     // Catch:{ all -> 0x0090 }
            int r2 = r8.length     // Catch:{ all -> 0x0090 }
            r3 = 0
            r4 = 0
        L_0x0008:
            if (r4 >= r2) goto L_0x0085
            r5 = r8[r4]     // Catch:{ all -> 0x0090 }
            int r5 = r5.ordinal()     // Catch:{ all -> 0x0090 }
            r6 = 1
            switch(r5) {
                case 0: goto L_0x0074;
                case 1: goto L_0x006d;
                case 2: goto L_0x0061;
                case 3: goto L_0x004f;
                case 4: goto L_0x0045;
                case 5: goto L_0x0045;
                case 6: goto L_0x0061;
                case 7: goto L_0x0027;
                case 8: goto L_0x0016;
                default: goto L_0x0014;
            }     // Catch:{ all -> 0x0090 }
        L_0x0014:
            goto L_0x0076
        L_0x0016:
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.EMPTY     // Catch:{ all -> 0x0090 }
            if (r1 != r5) goto L_0x001c
            goto L_0x0074
        L_0x001c:
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.REMOVED     // Catch:{ all -> 0x0090 }
            if (r1 == r5) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r6 = 0
        L_0x0022:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x0090 }
            goto L_0x0078
        L_0x0027:
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.SUCCESS     // Catch:{ all -> 0x0090 }
            if (r1 == r5) goto L_0x0065
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.FAILED     // Catch:{ all -> 0x0090 }
            if (r1 == r5) goto L_0x0065
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.SHOULD_NOT_EXECUTE     // Catch:{ all -> 0x0090 }
            if (r1 == r5) goto L_0x0065
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.PENDING     // Catch:{ all -> 0x0090 }
            if (r1 == r5) goto L_0x0065
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.PREPARING     // Catch:{ all -> 0x0090 }
            if (r1 == r5) goto L_0x0065
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.EXECUTING     // Catch:{ all -> 0x0090 }
            if (r1 != r5) goto L_0x0040
            goto L_0x0065
        L_0x0040:
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.REMOVED     // Catch:{ all -> 0x0090 }
            if (r1 != r5) goto L_0x0074
            goto L_0x0076
        L_0x0045:
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.EXECUTING     // Catch:{ all -> 0x0090 }
            if (r1 != r5) goto L_0x004a
            goto L_0x0065
        L_0x004a:
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.REMOVED     // Catch:{ all -> 0x0090 }
            if (r1 != r5) goto L_0x0074
            goto L_0x0076
        L_0x004f:
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.PREPARING     // Catch:{ all -> 0x0090 }
            if (r1 == r5) goto L_0x0065
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.SUCCESS     // Catch:{ all -> 0x0090 }
            if (r1 == r5) goto L_0x0065
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.FAILED     // Catch:{ all -> 0x0090 }
            if (r1 != r5) goto L_0x005c
            goto L_0x0065
        L_0x005c:
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.REMOVED     // Catch:{ all -> 0x0090 }
            if (r1 != r5) goto L_0x0074
            goto L_0x0076
        L_0x0061:
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.PENDING     // Catch:{ all -> 0x0090 }
            if (r1 != r5) goto L_0x0068
        L_0x0065:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0090 }
            goto L_0x0078
        L_0x0068:
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.REMOVED     // Catch:{ all -> 0x0090 }
            if (r1 != r5) goto L_0x0074
            goto L_0x0076
        L_0x006d:
            com.yandex.metrica.networktasks.api.d r5 = com.yandex.metrica.networktasks.api.d.EMPTY     // Catch:{ all -> 0x0090 }
            if (r1 != r5) goto L_0x0072
            goto L_0x0022
        L_0x0072:
            r6 = 0
            goto L_0x0022
        L_0x0074:
            r5 = 0
            goto L_0x0078
        L_0x0076:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0090 }
        L_0x0078:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0090 }
            boolean r6 = r6.equals(r5)     // Catch:{ all -> 0x0090 }
            if (r6 != 0) goto L_0x0082
            r0 = r5
            goto L_0x0085
        L_0x0082:
            int r4 = r4 + 1
            goto L_0x0008
        L_0x0085:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0090 }
            r8.equals(r0)     // Catch:{ all -> 0x0090 }
            boolean r8 = r8.equals(r0)     // Catch:{ all -> 0x0090 }
            monitor-exit(r7)
            return r8
        L_0x0090:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.networktasks.api.NetworkTask.a(com.yandex.metrica.networktasks.api.d[]):boolean");
    }

    public String description() {
        return this.f7315e.description();
    }

    public IExecutionPolicy getConnectionExecutionPolicy() {
        return this.f7313c;
    }

    public Executor getExecutor() {
        return this.f7312b;
    }

    public ExponentialBackoffPolicy getExponentialBackoffPolicy() {
        return this.f7314d;
    }

    public RequestDataHolder getRequestDataHolder() {
        return this.f7315e.getRequestDataHolder();
    }

    public ResponseDataHolder getResponseDataHolder() {
        return this.f7315e.getResponseDataHolder();
    }

    public RetryPolicyConfig getRetryPolicyConfig() {
        return this.f7315e.getRetryPolicyConfig();
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.f7315e.getSslSocketFactory();
    }

    public UnderlyingNetworkTask getUnderlyingTask() {
        return this.f7315e;
    }

    public String getUrl() {
        return this.f7315e.getFullUrlFormer().getUrl();
    }

    public String getUserAgent() {
        return this.f7317g;
    }

    public boolean onCreateNetworkTask() {
        if (a(d.PREPARING)) {
            return this.f7315e.onCreateTask();
        }
        return false;
    }

    public boolean onPerformRequest() {
        boolean a2 = a(d.EXECUTING);
        if (a2) {
            this.f7315e.getFullUrlFormer().incrementAttemptNumber();
            this.f7315e.getFullUrlFormer().buildAndSetFullHostUrl();
            this.f7315e.onPerformRequest();
        }
        return a2;
    }

    public boolean onRequestComplete() {
        boolean z;
        boolean z2;
        synchronized (this) {
            d dVar = d.SUCCESS;
            z = false;
            d dVar2 = d.FAILED;
            if (a(dVar, dVar2)) {
                boolean onRequestComplete = this.f7315e.onRequestComplete();
                if (onRequestComplete) {
                    this.f7311a = dVar;
                } else {
                    this.f7311a = dVar2;
                }
                z2 = onRequestComplete;
                z = true;
            } else {
                z2 = false;
            }
        }
        if (z) {
            this.f7315e.onPostRequestComplete(z2);
        }
        return z2;
    }

    public void onRequestError(Throwable th) {
        if (a(d.FAILED)) {
            this.f7315e.onRequestError(th);
        }
    }

    public void onShouldNotExecute() {
        if (a(d.SHOULD_NOT_EXECUTE)) {
            this.f7315e.onShouldNotExecute();
        }
    }

    public boolean onTaskAdded() {
        boolean a2 = a(d.PENDING);
        if (a2) {
            this.f7315e.onTaskAdded();
        }
        return a2;
    }

    public void onTaskFinished() {
        d dVar;
        boolean a2;
        synchronized (this) {
            dVar = this.f7311a;
            a2 = a(d.FINISHED);
        }
        if (a2) {
            this.f7315e.onTaskFinished();
            if (dVar == d.SUCCESS) {
                this.f7315e.onSuccessfulTaskFinished();
            } else if (dVar == d.FAILED || dVar == d.SHOULD_NOT_EXECUTE) {
                this.f7315e.onUnsuccessfulTaskFinished();
            }
        }
    }

    public void onTaskRemoved() {
        if (a(d.REMOVED)) {
            this.f7315e.onTaskRemoved();
        }
    }

    public synchronized boolean shouldTryNextHost() {
        boolean z;
        boolean z2;
        boolean hasMoreHosts = this.f7315e.getFullUrlFormer().hasMoreHosts();
        int responseCode = this.f7315e.getResponseDataHolder().getResponseCode();
        Iterator it = this.f7316f.iterator();
        while (true) {
            z = false;
            if (it.hasNext()) {
                if (!((ShouldTryNextHostCondition) it.next()).shouldTryNextHost(responseCode)) {
                    z2 = false;
                    break;
                }
            } else {
                z2 = true;
                break;
            }
        }
        d dVar = this.f7311a;
        if (dVar != d.REMOVED && dVar != d.FINISHED && hasMoreHosts && z2) {
            z = true;
        }
        return z;
    }
}
