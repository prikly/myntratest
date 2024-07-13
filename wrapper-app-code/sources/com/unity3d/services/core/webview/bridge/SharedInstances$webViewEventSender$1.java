package com.unity3d.services.core.webview.bridge;

import com.onesignal.outcomes.data.OutcomeEventsTable;
import com.unity3d.services.core.webview.WebViewApp;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "eventCategory", "", "eventId", "params", "", "", "sendEvent", "(Ljava/lang/Enum;Ljava/lang/Enum;[Ljava/lang/Object;)Z"}, k = 3, mv = {1, 4, 2})
/* compiled from: SharedInstances.kt */
final class SharedInstances$webViewEventSender$1 implements IEventSender {
    public static final SharedInstances$webViewEventSender$1 INSTANCE = new SharedInstances$webViewEventSender$1();

    SharedInstances$webViewEventSender$1() {
    }

    public final boolean sendEvent(Enum<?> enumR, Enum<?> enumR2, Object[] objArr) {
        Intrinsics.checkNotNullParameter(enumR, "eventCategory");
        Intrinsics.checkNotNullParameter(enumR2, "eventId");
        Intrinsics.checkNotNullParameter(objArr, OutcomeEventsTable.COLUMN_NAME_PARAMS);
        return WebViewApp.getCurrentApp().sendEvent(enumR, enumR2, Arrays.copyOf(objArr, objArr.length));
    }
}
