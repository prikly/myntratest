package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;

/* compiled from: AnnotationTypeQualifierResolver.kt */
final class AnnotationTypeQualifierResolver$mapKotlinConstantToQualifierApplicabilityTypes$1 extends Lambda implements Function2<EnumValue, AnnotationQualifierApplicabilityType, Boolean> {
    final /* synthetic */ AnnotationTypeQualifierResolver this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnnotationTypeQualifierResolver$mapKotlinConstantToQualifierApplicabilityTypes$1(AnnotationTypeQualifierResolver annotationTypeQualifierResolver) {
        super(2);
        this.this$0 = annotationTypeQualifierResolver;
    }

    public final Boolean invoke(EnumValue enumValue, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType) {
        Intrinsics.checkNotNullParameter(enumValue, "$this$mapConstantToQualifierApplicabilityTypes");
        Intrinsics.checkNotNullParameter(annotationQualifierApplicabilityType, "it");
        return Boolean.valueOf(this.this$0.toKotlinTargetNames(annotationQualifierApplicabilityType.getJavaTarget()).contains(enumValue.getEnumEntryName().getIdentifier()));
    }
}
