package com.unity3d.services.core.webview.bridge;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\bæ\u0001\u0018\u00002\u00020\u0001J9\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001H&¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/unity3d/services/core/webview/bridge/IEventSender;", "", "sendEvent", "", "eventCategory", "", "eventId", "params", "", "(Ljava/lang/Enum;Ljava/lang/Enum;[Ljava/lang/Object;)Z", "unity-ads_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: IEventSender.kt */
public interface IEventSender {
    boolean sendEvent(Enum<?> enumR, Enum<?> enumR2, Object... objArr);
}
