package com.appodeal.ads.modules.common.internal.log;

import android.util.Log;
import com.onesignal.OneSignalDbContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a$\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\"\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n\"\"\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "tag", "message", "", "error", "", "logInternal", "Lkotlin/Function1;", "Lcom/appodeal/ads/modules/common/internal/log/InternalLogEvent;", "observer", "Lkotlin/jvm/functions/Function1;", "", "a", "Z", "isLogEnable", "()Z", "setLogEnable", "(Z)V", "apd_internal"}, k = 2, mv = {1, 6, 0})
public final class InternalLogKt {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f16634a;
    public static Function1<? super InternalLogEvent, Unit> observer = a.f16635a;

    public static final class a extends Lambda implements Function1<InternalLogEvent, Unit> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f16635a = new a();

        public a() {
            super(1);
        }

        public final Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter((InternalLogEvent) obj, "it");
            return Unit.INSTANCE;
        }
    }

    public static final boolean isLogEnable() {
        return f16634a;
    }

    public static final void logInternal(String str, String str2, Throwable th) {
        Intrinsics.checkNotNullParameter(str, "tag");
        Intrinsics.checkNotNullParameter(str2, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        if (f16634a) {
            if (!Intrinsics.areEqual((Object) str, (Object) "InternalLogs")) {
                str2 = str + ": " + str2;
            }
            if (th != null) {
                Log.e("InternalLogs", str2, th);
            } else {
                Log.d("InternalLogs", str2);
            }
        }
    }

    public static /* synthetic */ void logInternal$default(String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "InternalLogs";
        }
        if ((i & 4) != 0) {
            th = null;
        }
        logInternal(str, str2, th);
    }

    public static final void setLogEnable(boolean z) {
        f16634a = z;
    }
}
