package kotlin.reflect.jvm.internal.impl.types.checker;

import com.unity3d.services.core.request.metrics.AdOperationMetric;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;

/* compiled from: ClassicTypeSystemContext.kt */
public final class ClassicTypeSystemContext$substitutionSupertypePolicy$2 extends TypeCheckerState.SupertypesPolicy.DoCustomTransform {
    final /* synthetic */ TypeSubstitutor $substitutor;
    final /* synthetic */ ClassicTypeSystemContext this$0;

    ClassicTypeSystemContext$substitutionSupertypePolicy$2(ClassicTypeSystemContext classicTypeSystemContext, TypeSubstitutor typeSubstitutor) {
        this.this$0 = classicTypeSystemContext;
        this.$substitutor = typeSubstitutor;
    }

    public SimpleTypeMarker transformType(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(typeCheckerState, AdOperationMetric.INIT_STATE);
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "type");
        ClassicTypeSystemContext classicTypeSystemContext = this.this$0;
        KotlinType safeSubstitute = this.$substitutor.safeSubstitute((KotlinType) classicTypeSystemContext.lowerBoundIfFlexible(kotlinTypeMarker), Variance.INVARIANT);
        Intrinsics.checkNotNullExpressionValue(safeSubstitute, "substitutor.safeSubstitu…VARIANT\n                )");
        SimpleTypeMarker asSimpleType = classicTypeSystemContext.asSimpleType(safeSubstitute);
        Intrinsics.checkNotNull(asSimpleType);
        return asSimpleType;
    }
}
