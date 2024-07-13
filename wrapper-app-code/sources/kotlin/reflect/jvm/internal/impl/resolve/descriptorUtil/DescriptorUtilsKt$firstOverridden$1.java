package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* compiled from: DescriptorUtils.kt */
final class DescriptorUtilsKt$firstOverridden$1<N> implements DFS.Neighbors {
    final /* synthetic */ boolean $useOriginal;

    DescriptorUtilsKt$firstOverridden$1(boolean z) {
        this.$useOriginal = z;
    }

    public final Iterable<CallableMemberDescriptor> getNeighbors(CallableMemberDescriptor callableMemberDescriptor) {
        Iterable<CallableMemberDescriptor> iterable;
        if (this.$useOriginal) {
            callableMemberDescriptor = callableMemberDescriptor == null ? null : callableMemberDescriptor.getOriginal();
        }
        if (callableMemberDescriptor == null) {
            iterable = CollectionsKt.emptyList();
        } else {
            iterable = callableMemberDescriptor.getOverriddenDescriptors();
            Intrinsics.checkNotNullExpressionValue(iterable, "descriptor?.overriddenDescriptors ?: emptyList()");
        }
        return iterable;
    }
}
