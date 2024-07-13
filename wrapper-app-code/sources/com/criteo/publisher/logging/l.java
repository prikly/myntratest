package com.criteo.publisher.logging;

import com.criteo.publisher.f0.k;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RemoteLogSendingQueue.kt */
public interface l extends k<RemoteLogRecords> {

    /* compiled from: RemoteLogSendingQueue.kt */
    public static class a implements l {

        /* renamed from: a  reason: collision with root package name */
        private final k<RemoteLogRecords> f2664a;

        public a(k<RemoteLogRecords> kVar) {
            Intrinsics.checkParameterIsNotNull(kVar, "delegate");
            this.f2664a = kVar;
        }

        public boolean a(RemoteLogRecords remoteLogRecords) {
            Intrinsics.checkParameterIsNotNull(remoteLogRecords, "element");
            return this.f2664a.a(remoteLogRecords);
        }

        public List<RemoteLogRecords> a(int i) {
            return this.f2664a.a(i);
        }

        public int a() {
            return this.f2664a.a();
        }
    }
}
