package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin._Assertions;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* compiled from: typeEnhancement.kt */
public final class JavaTypeEnhancement {
    private final JavaResolverSettings javaResolverSettings;

    /* compiled from: typeEnhancement.kt */
    private static final class Result {
        private final int subtreeSize;
        private final KotlinType type;

        public Result(KotlinType kotlinType, int i) {
            this.type = kotlinType;
            this.subtreeSize = i;
        }

        public final int getSubtreeSize() {
            return this.subtreeSize;
        }

        public final KotlinType getType() {
            return this.type;
        }
    }

    public JavaTypeEnhancement(JavaResolverSettings javaResolverSettings2) {
        Intrinsics.checkNotNullParameter(javaResolverSettings2, "javaResolverSettings");
        this.javaResolverSettings = javaResolverSettings2;
    }

    /* compiled from: typeEnhancement.kt */
    private static final class SimpleResult {
        private final boolean forWarnings;
        private final int subtreeSize;
        private final SimpleType type;

        public SimpleResult(SimpleType simpleType, int i, boolean z) {
            this.type = simpleType;
            this.subtreeSize = i;
            this.forWarnings = z;
        }

        public final boolean getForWarnings() {
            return this.forWarnings;
        }

        public final int getSubtreeSize() {
            return this.subtreeSize;
        }

        public final SimpleType getType() {
            return this.type;
        }
    }

    public final KotlinType enhance(KotlinType kotlinType, Function1<? super Integer, JavaTypeQualifiers> function1, boolean z) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        Intrinsics.checkNotNullParameter(function1, "qualifiers");
        return enhancePossiblyFlexible(kotlinType.unwrap(), function1, 0, z).getType();
    }

    private final Result enhancePossiblyFlexible(UnwrappedType unwrappedType, Function1<? super Integer, JavaTypeQualifiers> function1, int i, boolean z) {
        UnwrappedType unwrappedType2;
        UnwrappedType unwrappedType3 = unwrappedType;
        boolean z2 = true;
        UnwrappedType unwrappedType4 = null;
        if (KotlinTypeKt.isError(unwrappedType3)) {
            return new Result((KotlinType) null, 1);
        }
        if (unwrappedType3 instanceof FlexibleType) {
            boolean z3 = unwrappedType3 instanceof RawType;
            FlexibleType flexibleType = (FlexibleType) unwrappedType3;
            Function1<? super Integer, JavaTypeQualifiers> function12 = function1;
            int i2 = i;
            boolean z4 = z3;
            boolean z5 = z;
            SimpleResult enhanceInflexible = enhanceInflexible(flexibleType.getLowerBound(), function12, i2, TypeComponentPosition.FLEXIBLE_LOWER, z4, z5);
            SimpleResult enhanceInflexible2 = enhanceInflexible(flexibleType.getUpperBound(), function12, i2, TypeComponentPosition.FLEXIBLE_UPPER, z4, z5);
            if (enhanceInflexible.getSubtreeSize() != enhanceInflexible2.getSubtreeSize()) {
                z2 = false;
            }
            if (!_Assertions.ENABLED || z2) {
                if (!(enhanceInflexible.getType() == null && enhanceInflexible2.getType() == null)) {
                    if (enhanceInflexible.getForWarnings() || enhanceInflexible2.getForWarnings()) {
                        SimpleType type = enhanceInflexible2.getType();
                        if (type == null) {
                            SimpleType type2 = enhanceInflexible.getType();
                            Intrinsics.checkNotNull(type2);
                            unwrappedType2 = type2;
                        } else {
                            SimpleType type3 = enhanceInflexible.getType();
                            if (type3 == null) {
                                type3 = type;
                            }
                            unwrappedType2 = KotlinTypeFactory.flexibleType(type3, type);
                        }
                        unwrappedType4 = TypeWithEnhancementKt.wrapEnhancement(unwrappedType, unwrappedType2);
                    } else if (z3) {
                        SimpleType type4 = enhanceInflexible.getType();
                        if (type4 == null) {
                            type4 = flexibleType.getLowerBound();
                        }
                        SimpleType type5 = enhanceInflexible2.getType();
                        if (type5 == null) {
                            type5 = flexibleType.getUpperBound();
                        }
                        unwrappedType4 = new RawTypeImpl(type4, type5);
                    } else {
                        SimpleType type6 = enhanceInflexible.getType();
                        if (type6 == null) {
                            type6 = flexibleType.getLowerBound();
                        }
                        SimpleType type7 = enhanceInflexible2.getType();
                        if (type7 == null) {
                            type7 = flexibleType.getUpperBound();
                        }
                        unwrappedType4 = KotlinTypeFactory.flexibleType(type6, type7);
                    }
                }
                return new Result(unwrappedType4, enhanceInflexible.getSubtreeSize());
            }
            throw new AssertionError("Different tree sizes of bounds: lower = (" + flexibleType.getLowerBound() + ", " + enhanceInflexible.getSubtreeSize() + "), upper = (" + flexibleType.getUpperBound() + ", " + enhanceInflexible2.getSubtreeSize() + ')');
        } else if (unwrappedType3 instanceof SimpleType) {
            SimpleResult enhanceInflexible$default = enhanceInflexible$default(this, (SimpleType) unwrappedType3, function1, i, TypeComponentPosition.INFLEXIBLE, false, z, 8, (Object) null);
            return new Result(enhanceInflexible$default.getForWarnings() ? TypeWithEnhancementKt.wrapEnhancement(unwrappedType, enhanceInflexible$default.getType()) : enhanceInflexible$default.getType(), enhanceInflexible$default.getSubtreeSize());
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    static /* synthetic */ SimpleResult enhanceInflexible$default(JavaTypeEnhancement javaTypeEnhancement, SimpleType simpleType, Function1 function1, int i, TypeComponentPosition typeComponentPosition, boolean z, boolean z2, int i2, Object obj) {
        return javaTypeEnhancement.enhanceInflexible(simpleType, function1, i, typeComponentPosition, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2);
    }

    private final SimpleResult enhanceInflexible(SimpleType simpleType, Function1<? super Integer, JavaTypeQualifiers> function1, int i, TypeComponentPosition typeComponentPosition, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        Result result;
        TypeProjection typeProjection;
        Function1<? super Integer, JavaTypeQualifiers> function12 = function1;
        TypeComponentPosition typeComponentPosition2 = typeComponentPosition;
        boolean z6 = z2;
        boolean shouldEnhance = TypeComponentPositionKt.shouldEnhance(typeComponentPosition);
        boolean z7 = !z6 || !z;
        KotlinType kotlinType = null;
        if (!shouldEnhance && simpleType.getArguments().isEmpty()) {
            return new SimpleResult((SimpleType) null, 1, false);
        }
        ClassifierDescriptor declarationDescriptor = simpleType.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor == null) {
            return new SimpleResult((SimpleType) null, 1, false);
        }
        JavaTypeQualifiers invoke = function12.invoke(Integer.valueOf(i));
        ClassifierDescriptor access$enhanceMutability = TypeEnhancementKt.enhanceMutability(declarationDescriptor, invoke, typeComponentPosition2);
        Boolean access$getEnhancedNullability = TypeEnhancementKt.getEnhancedNullability(invoke, typeComponentPosition2);
        TypeConstructor constructor = access$enhanceMutability == null ? simpleType.getConstructor() : access$enhanceMutability.getTypeConstructor();
        Intrinsics.checkNotNullExpressionValue(constructor, "enhancedClassifier?.typeConstructor ?: constructor");
        int i2 = i + 1;
        Iterable arguments = simpleType.getArguments();
        List<TypeParameterDescriptor> parameters = constructor.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "typeConstructor.parameters");
        Iterable iterable = parameters;
        Iterator it = arguments.iterator();
        Iterator it2 = iterable.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(arguments, 10), CollectionsKt.collectionSizeOrDefault(iterable, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) it2.next();
            TypeProjection typeProjection2 = (TypeProjection) next;
            if (!z7) {
                z5 = z7;
                result = new Result(kotlinType, 0);
            } else {
                z5 = z7;
                if (!typeProjection2.isStarProjection()) {
                    result = enhancePossiblyFlexible(typeProjection2.getType().unwrap(), function12, i2, z6);
                } else if (function12.invoke(Integer.valueOf(i2)).getNullability() == NullabilityQualifier.FORCE_FLEXIBILITY) {
                    KotlinType unwrap = typeProjection2.getType().unwrap();
                    result = new Result(KotlinTypeFactory.flexibleType(FlexibleTypesKt.lowerIfFlexible(unwrap).makeNullableAsSpecified(false), FlexibleTypesKt.upperIfFlexible(unwrap).makeNullableAsSpecified(true)), 1);
                } else {
                    result = new Result((KotlinType) null, 1);
                }
            }
            i2 += result.getSubtreeSize();
            if (result.getType() != null) {
                KotlinType type = result.getType();
                Variance projectionKind = typeProjection2.getProjectionKind();
                Intrinsics.checkNotNullExpressionValue(projectionKind, "arg.projectionKind");
                typeProjection = TypeUtilsKt.createProjection(type, projectionKind, typeParameterDescriptor);
            } else if (access$enhanceMutability == null || typeProjection2.isStarProjection()) {
                typeProjection = access$enhanceMutability != null ? TypeUtils.makeStarProjection(typeParameterDescriptor) : null;
            } else {
                KotlinType type2 = typeProjection2.getType();
                Intrinsics.checkNotNullExpressionValue(type2, "arg.type");
                Variance projectionKind2 = typeProjection2.getProjectionKind();
                Intrinsics.checkNotNullExpressionValue(projectionKind2, "arg.projectionKind");
                typeProjection = TypeUtilsKt.createProjection(type2, projectionKind2, typeParameterDescriptor);
            }
            arrayList.add(typeProjection);
            function12 = function1;
            z7 = z5;
            kotlinType = null;
        }
        List list = arrayList;
        int i3 = i2 - i;
        if (access$enhanceMutability == null && access$getEnhancedNullability == null) {
            Iterable iterable2 = list;
            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                Iterator it3 = iterable2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (((TypeProjection) it3.next()) == null) {
                        z4 = true;
                        continue;
                    } else {
                        z4 = false;
                        continue;
                    }
                    if (!z4) {
                        z3 = false;
                        break;
                    }
                }
            }
            z3 = true;
            if (z3) {
                return new SimpleResult((SimpleType) null, i3, false);
            }
        }
        Annotations[] annotationsArr = new Annotations[3];
        annotationsArr[0] = simpleType.getAnnotations();
        EnhancedTypeAnnotations access$getENHANCED_MUTABILITY_ANNOTATIONS$p = TypeEnhancementKt.ENHANCED_MUTABILITY_ANNOTATIONS;
        if (!(access$enhanceMutability != null)) {
            access$getENHANCED_MUTABILITY_ANNOTATIONS$p = null;
        }
        annotationsArr[1] = access$getENHANCED_MUTABILITY_ANNOTATIONS$p;
        EnhancedTypeAnnotations access$getENHANCED_NULLABILITY_ANNOTATIONS$p = TypeEnhancementKt.ENHANCED_NULLABILITY_ANNOTATIONS;
        if (!(access$getEnhancedNullability != null)) {
            access$getENHANCED_NULLABILITY_ANNOTATIONS$p = null;
        }
        annotationsArr[2] = access$getENHANCED_NULLABILITY_ANNOTATIONS$p;
        Annotations access$compositeAnnotationsOrSingle = TypeEnhancementKt.compositeAnnotationsOrSingle(CollectionsKt.listOfNotNull((T[]) annotationsArr));
        Iterable iterable3 = list;
        Iterable arguments2 = simpleType.getArguments();
        Iterator it4 = iterable3.iterator();
        Iterator it5 = arguments2.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(iterable3, 10), CollectionsKt.collectionSizeOrDefault(arguments2, 10)));
        while (it4.hasNext() && it5.hasNext()) {
            Object next2 = it4.next();
            TypeProjection typeProjection3 = (TypeProjection) it5.next();
            TypeProjection typeProjection4 = (TypeProjection) next2;
            if (typeProjection4 != null) {
                typeProjection3 = typeProjection4;
            }
            arrayList2.add(typeProjection3);
        }
        SimpleType simpleType$default = KotlinTypeFactory.simpleType$default(access$compositeAnnotationsOrSingle, constructor, arrayList2, access$getEnhancedNullability == null ? simpleType.isMarkedNullable() : access$getEnhancedNullability.booleanValue(), (KotlinTypeRefiner) null, 16, (Object) null);
        if (invoke.getDefinitelyNotNull()) {
            simpleType$default = notNullTypeParameter(simpleType$default);
        }
        return new SimpleResult(simpleType$default, i3, access$getEnhancedNullability != null && invoke.isNullabilityQualifierForWarning());
    }

    private final SimpleType notNullTypeParameter(SimpleType simpleType) {
        if (this.javaResolverSettings.getCorrectNullabilityForNotNullTypeParameter()) {
            return SpecialTypesKt.makeSimpleTypeDefinitelyNotNullOrNotNull(simpleType, true);
        }
        return new NotNullTypeParameter(simpleType);
    }
}
