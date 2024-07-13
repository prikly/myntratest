package com.criteo.publisher;

import com.criteo.publisher.logging.e;
import com.criteo.publisher.model.AdUnit;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: SdkInitLogMessage.kt */
public final class y {
    static {
        new y();
    }

    private y() {
    }

    public static final e a() {
        return new e(0, "Unsupported Android version, Criteo SDK is deactivated and won't do anything", (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    public static final e a(String str, List<? extends AdUnit> list, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "cpId");
        Intrinsics.checkParameterIsNotNull(list, "adUnits");
        Intrinsics.checkParameterIsNotNull(str2, MediationMetaData.KEY_VERSION);
        return new e(0, "Criteo SDK version " + str2 + " is initialized with Publisher ID " + str + " and " + list.size() + " ad units:\n" + CollectionsKt.joinToString$default(list, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, a.f2927a, 30, (Object) null), (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    /* compiled from: SdkInitLogMessage.kt */
    static final class a extends Lambda implements Function1<AdUnit, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f2927a = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(AdUnit adUnit) {
            Intrinsics.checkParameterIsNotNull(adUnit, "it");
            return "- " + adUnit;
        }
    }

    public static final e b() {
        return new e(0, "Criteo SDK initialization method cannot be called more than once. Please ignore this if you are using a mediation adapter.", (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    public static final e a(CriteoInitException criteoInitException) {
        Intrinsics.checkParameterIsNotNull(criteoInitException, "criteoInitException");
        return new e(6, (String) null, criteoInitException, "onErrorDuringSdkInitialization");
    }
}
