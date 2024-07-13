package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvalidModuleException.kt */
public final class InvalidModuleExceptionKt {
    private static final ModuleCapability<InvalidModuleNotifier> INVALID_MODULE_NOTIFIER_CAPABILITY = new ModuleCapability<>("InvalidModuleNotifier");

    public static final void moduleInvalidated(ModuleDescriptor moduleDescriptor) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        InvalidModuleNotifier invalidModuleNotifier = (InvalidModuleNotifier) moduleDescriptor.getCapability(INVALID_MODULE_NOTIFIER_CAPABILITY);
        if (invalidModuleNotifier != null) {
            invalidModuleNotifier.notifyModuleInvalidated(moduleDescriptor);
            return;
        }
        throw new InvalidModuleException(Intrinsics.stringPlus("Accessing invalid module descriptor ", moduleDescriptor));
    }
}
