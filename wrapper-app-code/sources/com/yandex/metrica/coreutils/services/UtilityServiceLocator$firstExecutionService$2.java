package com.yandex.metrica.coreutils.services;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/yandex/metrica/coreutils/services/FirstExecutionConditionService;", "invoke"}, k = 3, mv = {1, 4, 2})
/* compiled from: UtilityServiceLocator.kt */
final class UtilityServiceLocator$firstExecutionService$2 extends Lambda implements Function0<FirstExecutionConditionService> {
    public static final UtilityServiceLocator$firstExecutionService$2 INSTANCE = new UtilityServiceLocator$firstExecutionService$2();

    UtilityServiceLocator$firstExecutionService$2() {
        super(0);
    }

    public final FirstExecutionConditionService invoke() {
        return new FirstExecutionConditionService();
    }
}
