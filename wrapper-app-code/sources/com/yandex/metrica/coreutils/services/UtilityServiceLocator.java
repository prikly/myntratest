package com.yandex.metrica.coreutils.services;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/yandex/metrica/coreutils/services/UtilityServiceLocator;", "", "()V", "activationBarrier", "Lcom/yandex/metrica/coreutils/services/ActivationBarrier;", "getActivationBarrier", "()Lcom/yandex/metrica/coreutils/services/ActivationBarrier;", "firstExecutionService", "Lcom/yandex/metrica/coreutils/services/FirstExecutionConditionService;", "getFirstExecutionService", "()Lcom/yandex/metrica/coreutils/services/FirstExecutionConditionService;", "firstExecutionService$delegate", "Lkotlin/Lazy;", "initAsync", "", "updateConfiguration", "configuration", "Lcom/yandex/metrica/coreutils/services/UtilityServiceConfiguration;", "Companion", "core-utils_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: UtilityServiceLocator.kt */
public final class UtilityServiceLocator {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static volatile UtilityServiceLocator instance = new UtilityServiceLocator();
    private final ActivationBarrier activationBarrier = new ActivationBarrier();
    private final Lazy firstExecutionService$delegate = LazyKt.lazy(UtilityServiceLocator$firstExecutionService$2.INSTANCE);

    public static final UtilityServiceLocator getInstance() {
        return instance;
    }

    public final FirstExecutionConditionService getFirstExecutionService() {
        return (FirstExecutionConditionService) this.firstExecutionService$delegate.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/metrica/coreutils/services/UtilityServiceLocator$Companion;", "", "()V", "TAG", "", "<set-?>", "Lcom/yandex/metrica/coreutils/services/UtilityServiceLocator;", "instance", "getInstance", "()Lcom/yandex/metrica/coreutils/services/UtilityServiceLocator;", "setInstance", "(Lcom/yandex/metrica/coreutils/services/UtilityServiceLocator;)V", "core-utils_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: UtilityServiceLocator.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final ActivationBarrier getActivationBarrier() {
        return this.activationBarrier;
    }

    public final void initAsync() {
        this.activationBarrier.activate();
    }

    public final void updateConfiguration(UtilityServiceConfiguration utilityServiceConfiguration) {
        Intrinsics.checkNotNullParameter(utilityServiceConfiguration, "configuration");
        getFirstExecutionService().updateConfig(utilityServiceConfiguration);
    }
}
