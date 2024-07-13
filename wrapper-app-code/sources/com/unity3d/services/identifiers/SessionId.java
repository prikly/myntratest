package com.unity3d.services.identifiers;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/unity3d/services/identifiers/SessionId;", "", "", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "unity-services-identifiers_release"}, k = 1, mv = {1, 4, 3})
public final class SessionId {
    public static final SessionId INSTANCE = new SessionId();

    /* renamed from: a  reason: collision with root package name */
    public static final String f9640a;

    static {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "UUID.randomUUID().toString()");
        f9640a = uuid;
    }

    public final String getId() {
        return f9640a;
    }
}
