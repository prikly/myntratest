package com.yandex.metrica.impl.ob;

import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.IParamsCallback;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class Qh implements Yh {

    /* renamed from: b  reason: collision with root package name */
    private static final IIdentifierCallback f4831b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<IIdentifierCallback> f4832a;

    class a implements IIdentifierCallback {
        a() {
        }

        public void onReceive(Map<String, String> map) {
        }

        public void onRequestError(IIdentifierCallback.Reason reason) {
        }
    }

    public Qh(IIdentifierCallback iIdentifierCallback) {
        this.f4832a = new AtomicReference<>(iIdentifierCallback);
    }

    public void a(IParamsCallback.Reason reason, Map<String, W0> map) {
        IIdentifierCallback.Reason reason2;
        IIdentifierCallback andSet = this.f4832a.getAndSet(f4831b);
        int ordinal = reason.ordinal();
        if (ordinal == 1) {
            reason2 = IIdentifierCallback.Reason.NETWORK;
        } else if (ordinal != 2) {
            reason2 = IIdentifierCallback.Reason.UNKNOWN;
        } else {
            reason2 = IIdentifierCallback.Reason.INVALID_RESPONSE;
        }
        andSet.onRequestError(reason2);
    }

    public void onReceive(Map<String, W0> map) {
        IIdentifierCallback andSet = this.f4832a.getAndSet(f4831b);
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            hashMap.put(next.getKey(), ((W0) next.getValue()).f5240a);
        }
        andSet.onReceive(hashMap);
    }
}
