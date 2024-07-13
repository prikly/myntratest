package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;

/* compiled from: AnnotationTypeQualifierResolver.kt */
final class AnnotationTypeQualifierResolver$mapJavaConstantToQualifierApplicabilityTypes$1 extends Lambda implements Function2<EnumValue, AnnotationQualifierApplicabilityType, Boolean> {
    public static final AnnotationTypeQualifierResolver$mapJavaConstantToQualifierApplicabilityTypes$1 INSTANCE = new AnnotationTypeQualifierResolver$mapJavaConstantToQualifierApplicabilityTypes$1();

    AnnotationTypeQualifierResolver$mapJavaConstantToQualifierApplicabilityTypes$1() {
        super(2);
    }

    public final Boolean invoke(EnumValue enumValue, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType) {
        Intrinsics.checkNotNullParameter(enumValue, "$this$mapConstantToQualifierApplicabilityTypes");
        Intrinsics.checkNotNullParameter(annotationQualifierApplicabilityType, "it");
        return Boolean.valueOf(Intrinsics.areEqual((Object) enumValue.getEnumEntryName().getIdentifier(), (Object) annotationQualifierApplicabilityType.getJavaTarget()));
    }
}
