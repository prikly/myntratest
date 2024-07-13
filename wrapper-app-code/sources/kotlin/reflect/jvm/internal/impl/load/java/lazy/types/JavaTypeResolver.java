package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* compiled from: JavaTypeResolver.kt */
public final class JavaTypeResolver {

    /* renamed from: c  reason: collision with root package name */
    private final LazyJavaResolverContext f9679c;
    private final RawSubstitution rawSubstitution = new RawSubstitution(this.typeParameterUpperBoundEraser);
    private final TypeParameterResolver typeParameterResolver;
    /* access modifiers changed from: private */
    public final TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = new TypeParameterUpperBoundEraser((RawSubstitution) null, 1, (DefaultConstructorMarker) null);

    public JavaTypeResolver(LazyJavaResolverContext lazyJavaResolverContext, TypeParameterResolver typeParameterResolver2) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "c");
        Intrinsics.checkNotNullParameter(typeParameterResolver2, "typeParameterResolver");
        this.f9679c = lazyJavaResolverContext;
        this.typeParameterResolver = typeParameterResolver2;
    }

    public final KotlinType transformJavaType(JavaType javaType, JavaTypeAttributes javaTypeAttributes) {
        SimpleType simpleType;
        Intrinsics.checkNotNullParameter(javaTypeAttributes, "attr");
        if (javaType instanceof JavaPrimitiveType) {
            PrimitiveType type = ((JavaPrimitiveType) javaType).getType();
            if (type != null) {
                simpleType = this.f9679c.getModule().getBuiltIns().getPrimitiveKotlinType(type);
            } else {
                simpleType = this.f9679c.getModule().getBuiltIns().getUnitType();
            }
            Intrinsics.checkNotNullExpressionValue(simpleType, "{\n                val pr…ns.unitType\n            }");
            return simpleType;
        } else if (javaType instanceof JavaClassifierType) {
            return transformJavaClassifierType((JavaClassifierType) javaType, javaTypeAttributes);
        } else {
            if (javaType instanceof JavaArrayType) {
                return transformArrayType$default(this, (JavaArrayType) javaType, javaTypeAttributes, false, 4, (Object) null);
            } else if (javaType instanceof JavaWildcardType) {
                JavaType bound = ((JavaWildcardType) javaType).getBound();
                if (bound != null) {
                    return transformJavaType(bound, javaTypeAttributes);
                }
                SimpleType defaultBound = this.f9679c.getModule().getBuiltIns().getDefaultBound();
                Intrinsics.checkNotNullExpressionValue(defaultBound, "c.module.builtIns.defaultBound");
                return defaultBound;
            } else if (javaType == null) {
                SimpleType defaultBound2 = this.f9679c.getModule().getBuiltIns().getDefaultBound();
                Intrinsics.checkNotNullExpressionValue(defaultBound2, "c.module.builtIns.defaultBound");
                return defaultBound2;
            } else {
                throw new UnsupportedOperationException(Intrinsics.stringPlus("Unsupported type: ", javaType));
            }
        }
    }

    public static /* synthetic */ KotlinType transformArrayType$default(JavaTypeResolver javaTypeResolver, JavaArrayType javaArrayType, JavaTypeAttributes javaTypeAttributes, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return javaTypeResolver.transformArrayType(javaArrayType, javaTypeAttributes, z);
    }

    public final KotlinType transformArrayType(JavaArrayType javaArrayType, JavaTypeAttributes javaTypeAttributes, boolean z) {
        Intrinsics.checkNotNullParameter(javaArrayType, "arrayType");
        Intrinsics.checkNotNullParameter(javaTypeAttributes, "attr");
        JavaType componentType = javaArrayType.getComponentType();
        JavaPrimitiveType javaPrimitiveType = componentType instanceof JavaPrimitiveType ? (JavaPrimitiveType) componentType : null;
        PrimitiveType type = javaPrimitiveType == null ? null : javaPrimitiveType.getType();
        LazyJavaAnnotations lazyJavaAnnotations = new LazyJavaAnnotations(this.f9679c, javaArrayType, true);
        if (type != null) {
            SimpleType primitiveArrayKotlinType = this.f9679c.getModule().getBuiltIns().getPrimitiveArrayKotlinType(type);
            Intrinsics.checkNotNullExpressionValue(primitiveArrayKotlinType, "c.module.builtIns.getPri…KotlinType(primitiveType)");
            primitiveArrayKotlinType.replaceAnnotations(Annotations.Companion.create(CollectionsKt.plus(lazyJavaAnnotations, (LazyJavaAnnotations) primitiveArrayKotlinType.getAnnotations())));
            if (javaTypeAttributes.isForAnnotationParameter()) {
                return primitiveArrayKotlinType;
            }
            return KotlinTypeFactory.flexibleType(primitiveArrayKotlinType, primitiveArrayKotlinType.makeNullableAsSpecified(true));
        }
        KotlinType transformJavaType = transformJavaType(componentType, JavaTypeResolverKt.toAttributes$default(TypeUsage.COMMON, javaTypeAttributes.isForAnnotationParameter(), (TypeParameterDescriptor) null, 2, (Object) null));
        if (javaTypeAttributes.isForAnnotationParameter()) {
            SimpleType arrayType = this.f9679c.getModule().getBuiltIns().getArrayType(z ? Variance.OUT_VARIANCE : Variance.INVARIANT, transformJavaType, lazyJavaAnnotations);
            Intrinsics.checkNotNullExpressionValue(arrayType, "c.module.builtIns.getArr…mponentType, annotations)");
            return arrayType;
        }
        Annotations annotations = lazyJavaAnnotations;
        SimpleType arrayType2 = this.f9679c.getModule().getBuiltIns().getArrayType(Variance.INVARIANT, transformJavaType, annotations);
        Intrinsics.checkNotNullExpressionValue(arrayType2, "c.module.builtIns.getArr…mponentType, annotations)");
        return KotlinTypeFactory.flexibleType(arrayType2, this.f9679c.getModule().getBuiltIns().getArrayType(Variance.OUT_VARIANCE, transformJavaType, annotations).makeNullableAsSpecified(true));
    }

    private static final SimpleType transformJavaClassifierType$errorType(JavaClassifierType javaClassifierType) {
        SimpleType createErrorType = ErrorUtils.createErrorType(Intrinsics.stringPlus("Unresolved java class ", javaClassifierType.getPresentableText()));
        Intrinsics.checkNotNullExpressionValue(createErrorType, "createErrorType(\"Unresol…vaType.presentableText}\")");
        return createErrorType;
    }

    private final KotlinType transformJavaClassifierType(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes) {
        boolean z = !javaTypeAttributes.isForAnnotationParameter() && javaTypeAttributes.getHowThisTypeIsUsed() != TypeUsage.SUPERTYPE;
        boolean isRaw = javaClassifierType.isRaw();
        if (isRaw || z) {
            SimpleType computeSimpleJavaClassifierType = computeSimpleJavaClassifierType(javaClassifierType, javaTypeAttributes.withFlexibility(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND), (SimpleType) null);
            if (computeSimpleJavaClassifierType == null) {
                return transformJavaClassifierType$errorType(javaClassifierType);
            }
            SimpleType computeSimpleJavaClassifierType2 = computeSimpleJavaClassifierType(javaClassifierType, javaTypeAttributes.withFlexibility(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND), computeSimpleJavaClassifierType);
            if (computeSimpleJavaClassifierType2 == null) {
                return transformJavaClassifierType$errorType(javaClassifierType);
            }
            if (isRaw) {
                return new RawTypeImpl(computeSimpleJavaClassifierType, computeSimpleJavaClassifierType2);
            }
            return KotlinTypeFactory.flexibleType(computeSimpleJavaClassifierType, computeSimpleJavaClassifierType2);
        }
        SimpleType computeSimpleJavaClassifierType3 = computeSimpleJavaClassifierType(javaClassifierType, javaTypeAttributes, (SimpleType) null);
        return computeSimpleJavaClassifierType3 == null ? transformJavaClassifierType$errorType(javaClassifierType) : computeSimpleJavaClassifierType3;
    }

    private final SimpleType computeSimpleJavaClassifierType(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes, SimpleType simpleType) {
        Annotations lazyJavaAnnotations = simpleType == null ? new LazyJavaAnnotations(this.f9679c, javaClassifierType, false, 4, (DefaultConstructorMarker) null) : simpleType.getAnnotations();
        TypeConstructor computeTypeConstructor = computeTypeConstructor(javaClassifierType, javaTypeAttributes);
        TypeConstructor typeConstructor = null;
        if (computeTypeConstructor == null) {
            return null;
        }
        boolean isNullable = isNullable(javaTypeAttributes);
        if (simpleType != null) {
            typeConstructor = simpleType.getConstructor();
        }
        if (Intrinsics.areEqual((Object) typeConstructor, (Object) computeTypeConstructor) && !javaClassifierType.isRaw() && isNullable) {
            return simpleType.makeNullableAsSpecified(true);
        }
        return KotlinTypeFactory.simpleType$default(lazyJavaAnnotations, computeTypeConstructor, computeArguments(javaClassifierType, javaTypeAttributes, computeTypeConstructor), isNullable, (KotlinTypeRefiner) null, 16, (Object) null);
    }

    private final TypeConstructor computeTypeConstructor(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes) {
        JavaClassifier classifier = javaClassifierType.getClassifier();
        if (classifier == null) {
            return createNotFoundClass(javaClassifierType);
        }
        if (classifier instanceof JavaClass) {
            JavaClass javaClass = (JavaClass) classifier;
            FqName fqName = javaClass.getFqName();
            if (fqName != null) {
                ClassDescriptor mapKotlinClass = mapKotlinClass(javaClassifierType, javaTypeAttributes, fqName);
                if (mapKotlinClass == null) {
                    mapKotlinClass = this.f9679c.getComponents().getModuleClassResolver().resolveClass(javaClass);
                }
                return mapKotlinClass == null ? createNotFoundClass(javaClassifierType) : mapKotlinClass.getTypeConstructor();
            }
            throw new AssertionError(Intrinsics.stringPlus("Class type should have a FQ name: ", classifier));
        } else if (classifier instanceof JavaTypeParameter) {
            TypeParameterDescriptor resolveTypeParameter = this.typeParameterResolver.resolveTypeParameter((JavaTypeParameter) classifier);
            if (resolveTypeParameter == null) {
                return null;
            }
            return resolveTypeParameter.getTypeConstructor();
        } else {
            throw new IllegalStateException(Intrinsics.stringPlus("Unknown classifier kind: ", classifier));
        }
    }

    private final TypeConstructor createNotFoundClass(JavaClassifierType javaClassifierType) {
        ClassId classId = ClassId.topLevel(new FqName(javaClassifierType.getClassifierQualifiedName()));
        Intrinsics.checkNotNullExpressionValue(classId, "topLevel(FqName(javaType.classifierQualifiedName))");
        TypeConstructor typeConstructor = this.f9679c.getComponents().getDeserializedDescriptorResolver().getComponents().getNotFoundClasses().getClass(classId, CollectionsKt.listOf(0)).getTypeConstructor();
        Intrinsics.checkNotNullExpressionValue(typeConstructor, "c.components.deserialize…istOf(0)).typeConstructor");
        return typeConstructor;
    }

    private final ClassDescriptor mapKotlinClass(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes, FqName fqName) {
        if (javaTypeAttributes.isForAnnotationParameter() && Intrinsics.areEqual((Object) fqName, (Object) JavaTypeResolverKt.JAVA_LANG_CLASS_FQ_NAME)) {
            return this.f9679c.getComponents().getReflectionTypes().getKClass();
        }
        JavaToKotlinClassMapper javaToKotlinClassMapper = JavaToKotlinClassMapper.INSTANCE;
        ClassDescriptor mapJavaToKotlin$default = JavaToKotlinClassMapper.mapJavaToKotlin$default(javaToKotlinClassMapper, fqName, this.f9679c.getModule().getBuiltIns(), (Integer) null, 4, (Object) null);
        if (mapJavaToKotlin$default == null) {
            return null;
        }
        return (!javaToKotlinClassMapper.isReadOnly(mapJavaToKotlin$default) || !(javaTypeAttributes.getFlexibility() == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND || javaTypeAttributes.getHowThisTypeIsUsed() == TypeUsage.SUPERTYPE || argumentsMakeSenseOnlyForMutableContainer(javaClassifierType, mapJavaToKotlin$default))) ? mapJavaToKotlin$default : javaToKotlinClassMapper.convertReadOnlyToMutable(mapJavaToKotlin$default);
    }

    private final boolean argumentsMakeSenseOnlyForMutableContainer(JavaClassifierType javaClassifierType, ClassDescriptor classDescriptor) {
        if (!JavaTypesKt.isSuperWildcard((JavaType) CollectionsKt.lastOrNull(javaClassifierType.getTypeArguments()))) {
            return false;
        }
        List<TypeParameterDescriptor> parameters = JavaToKotlinClassMapper.INSTANCE.convertReadOnlyToMutable(classDescriptor).getTypeConstructor().getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "JavaToKotlinClassMapper.…ypeConstructor.parameters");
        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) CollectionsKt.lastOrNull(parameters);
        if (typeParameterDescriptor == null) {
            return false;
        }
        Variance variance = typeParameterDescriptor.getVariance();
        Intrinsics.checkNotNullExpressionValue(variance, "JavaToKotlinClassMapper.….variance ?: return false");
        if (variance != Variance.OUT_VARIANCE) {
            return true;
        }
        return false;
    }

    private final List<TypeProjection> computeRawTypeArguments(JavaClassifierType javaClassifierType, List<? extends TypeParameterDescriptor> list, TypeConstructor typeConstructor, JavaTypeAttributes javaTypeAttributes) {
        TypeProjection typeProjection;
        Iterable<TypeParameterDescriptor> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (TypeParameterDescriptor typeParameterDescriptor : iterable) {
            if (TypeUtilsKt.hasTypeParameterRecursiveBounds(typeParameterDescriptor, (TypeConstructor) null, javaTypeAttributes.getVisitedTypeParameters())) {
                typeProjection = JavaTypeResolverKt.makeStarProjection(typeParameterDescriptor, javaTypeAttributes);
            } else {
                typeProjection = this.rawSubstitution.computeProjection(typeParameterDescriptor, javaClassifierType.isRaw() ? javaTypeAttributes : javaTypeAttributes.withFlexibility(JavaTypeFlexibility.INFLEXIBLE), new LazyWrappedType(this.f9679c.getStorageManager(), new JavaTypeResolver$computeRawTypeArguments$1$erasedUpperBound$1(this, typeParameterDescriptor, javaClassifierType, javaTypeAttributes, typeConstructor)));
            }
            arrayList.add(typeProjection);
        }
        return (List) arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        if ((!r0.isEmpty()) != false) goto L_0x0027;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> computeArguments(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType r8, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes r9, kotlin.reflect.jvm.internal.impl.types.TypeConstructor r10) {
        /*
            r7 = this;
            boolean r0 = r8.isRaw()
            java.lang.String r1 = "constructor.parameters"
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x0027
            java.util.List r0 = r8.getTypeArguments()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0025
            java.util.List r0 = r10.getParameters()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r0 = 0
            goto L_0x0028
        L_0x0027:
            r0 = 1
        L_0x0028:
            java.util.List r4 = r10.getParameters()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
            if (r0 == 0) goto L_0x0036
            java.util.List r8 = r7.computeRawTypeArguments(r8, r4, r10, r9)
            return r8
        L_0x0036:
            int r9 = r4.size()
            java.util.List r10 = r8.getTypeArguments()
            int r10 = r10.size()
            r0 = 10
            if (r9 == r10) goto L_0x0083
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r8 = new java.util.ArrayList
            int r9 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r4, r0)
            r8.<init>(r9)
            java.util.Collection r8 = (java.util.Collection) r8
            java.util.Iterator r9 = r4.iterator()
        L_0x0057:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x007a
            java.lang.Object r10 = r9.next()
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r10 = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) r10
            kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl r0 = new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl
            kotlin.reflect.jvm.internal.impl.name.Name r10 = r10.getName()
            java.lang.String r10 = r10.asString()
            kotlin.reflect.jvm.internal.impl.types.SimpleType r10 = kotlin.reflect.jvm.internal.impl.types.ErrorUtils.createErrorType(r10)
            kotlin.reflect.jvm.internal.impl.types.KotlinType r10 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r10
            r0.<init>(r10)
            r8.add(r0)
            goto L_0x0057
        L_0x007a:
            java.util.List r8 = (java.util.List) r8
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.List r8 = kotlin.collections.CollectionsKt.toList(r8)
            return r8
        L_0x0083:
            java.util.List r8 = r8.getTypeArguments()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.lang.Iterable r8 = kotlin.collections.CollectionsKt.withIndex(r8)
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r8, r0)
            r9.<init>(r10)
            java.util.Collection r9 = (java.util.Collection) r9
            java.util.Iterator r8 = r8.iterator()
        L_0x009c:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x0100
            java.lang.Object r10 = r8.next()
            kotlin.collections.IndexedValue r10 = (kotlin.collections.IndexedValue) r10
            int r0 = r10.component1()
            java.lang.Object r10 = r10.component2()
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType r10 = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType) r10
            int r1 = r4.size()
            if (r0 >= r1) goto L_0x00ba
            r1 = 1
            goto L_0x00bb
        L_0x00ba:
            r1 = 0
        L_0x00bb:
            boolean r5 = kotlin._Assertions.ENABLED
            if (r5 == 0) goto L_0x00e5
            if (r1 == 0) goto L_0x00c2
            goto L_0x00e5
        L_0x00c2:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Argument index should be less then type parameters count, but "
            r8.append(r9)
            r8.append(r0)
            java.lang.String r9 = " > "
            r8.append(r9)
            int r9 = r4.size()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>(r8)
            throw r9
        L_0x00e5:
            java.lang.Object r0 = r4.get(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) r0
            kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage r1 = kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage.COMMON
            r5 = 3
            r6 = 0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes r1 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt.toAttributes$default(r1, r2, r6, r5, r6)
            java.lang.String r5 = "parameter"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            kotlin.reflect.jvm.internal.impl.types.TypeProjection r10 = r7.transformToTypeProjection(r10, r1, r0)
            r9.add(r10)
            goto L_0x009c
        L_0x0100:
            java.util.List r9 = (java.util.List) r9
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.List r8 = kotlin.collections.CollectionsKt.toList(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver.computeArguments(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes, kotlin.reflect.jvm.internal.impl.types.TypeConstructor):java.util.List");
    }

    private final TypeProjection transformToTypeProjection(JavaType javaType, JavaTypeAttributes javaTypeAttributes, TypeParameterDescriptor typeParameterDescriptor) {
        if (!(javaType instanceof JavaWildcardType)) {
            return new TypeProjectionImpl(Variance.INVARIANT, transformJavaType(javaType, javaTypeAttributes));
        }
        JavaWildcardType javaWildcardType = (JavaWildcardType) javaType;
        JavaType bound = javaWildcardType.getBound();
        Variance variance = javaWildcardType.isExtends() ? Variance.OUT_VARIANCE : Variance.IN_VARIANCE;
        if (bound == null || isConflictingArgumentFor(variance, typeParameterDescriptor)) {
            return JavaTypeResolverKt.makeStarProjection(typeParameterDescriptor, javaTypeAttributes);
        }
        return TypeUtilsKt.createProjection(transformJavaType(bound, JavaTypeResolverKt.toAttributes$default(TypeUsage.COMMON, false, (TypeParameterDescriptor) null, 3, (Object) null)), variance, typeParameterDescriptor);
    }

    private final boolean isConflictingArgumentFor(Variance variance, TypeParameterDescriptor typeParameterDescriptor) {
        if (typeParameterDescriptor.getVariance() == Variance.INVARIANT || variance == typeParameterDescriptor.getVariance()) {
            return false;
        }
        return true;
    }

    private final boolean isNullable(JavaTypeAttributes javaTypeAttributes) {
        if (javaTypeAttributes.getFlexibility() == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND || javaTypeAttributes.isForAnnotationParameter() || javaTypeAttributes.getHowThisTypeIsUsed() == TypeUsage.SUPERTYPE) {
            return false;
        }
        return true;
    }
}
