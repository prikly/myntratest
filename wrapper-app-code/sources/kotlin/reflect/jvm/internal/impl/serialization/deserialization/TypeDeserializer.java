package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionForAbsentTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.sequences.SequencesKt;

/* compiled from: TypeDeserializer.kt */
public final class TypeDeserializer {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final DeserializationContext f9683c;
    private final Function1<Integer, ClassifierDescriptor> classifierDescriptors;
    private final String containerPresentableName;
    private final String debugName;
    private final TypeDeserializer parent;
    private final Function1<Integer, ClassifierDescriptor> typeAliasDescriptors = this.f9683c.getStorageManager().createMemoizedFunctionWithNullableValues(new TypeDeserializer$typeAliasDescriptors$1(this));
    private final Map<Integer, TypeParameterDescriptor> typeParameterDescriptors;

    public TypeDeserializer(DeserializationContext deserializationContext, TypeDeserializer typeDeserializer, List<ProtoBuf.TypeParameter> list, String str, String str2) {
        Map<Integer, TypeParameterDescriptor> map;
        Intrinsics.checkNotNullParameter(deserializationContext, "c");
        Intrinsics.checkNotNullParameter(list, "typeParameterProtos");
        Intrinsics.checkNotNullParameter(str, "debugName");
        Intrinsics.checkNotNullParameter(str2, "containerPresentableName");
        this.f9683c = deserializationContext;
        this.parent = typeDeserializer;
        this.debugName = str;
        this.containerPresentableName = str2;
        this.classifierDescriptors = deserializationContext.getStorageManager().createMemoizedFunctionWithNullableValues(new TypeDeserializer$classifierDescriptors$1(this));
        if (list.isEmpty()) {
            map = MapsKt.emptyMap();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i = 0;
            for (ProtoBuf.TypeParameter next : list) {
                linkedHashMap.put(Integer.valueOf(next.getId()), new DeserializedTypeParameterDescriptor(this.f9683c, next, i));
                i++;
            }
            map = linkedHashMap;
        }
        this.typeParameterDescriptors = map;
    }

    public final List<TypeParameterDescriptor> getOwnTypeParameters() {
        return CollectionsKt.toList(this.typeParameterDescriptors.values());
    }

    public final KotlinType type(ProtoBuf.Type type) {
        Intrinsics.checkNotNullParameter(type, "proto");
        if (!type.hasFlexibleTypeCapabilitiesId()) {
            return simpleType(type, true);
        }
        String string = this.f9683c.getNameResolver().getString(type.getFlexibleTypeCapabilitiesId());
        SimpleType simpleType$default = simpleType$default(this, type, false, 2, (Object) null);
        ProtoBuf.Type flexibleUpperBound = ProtoTypeTableUtilKt.flexibleUpperBound(type, this.f9683c.getTypeTable());
        Intrinsics.checkNotNull(flexibleUpperBound);
        return this.f9683c.getComponents().getFlexibleTypeDeserializer().create(type, string, simpleType$default, simpleType$default(this, flexibleUpperBound, false, 2, (Object) null));
    }

    public static /* synthetic */ SimpleType simpleType$default(TypeDeserializer typeDeserializer, ProtoBuf.Type type, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return typeDeserializer.simpleType(type, z);
    }

    public final SimpleType simpleType(ProtoBuf.Type type, boolean z) {
        SimpleType simpleType;
        SimpleType simpleType2;
        Intrinsics.checkNotNullParameter(type, "proto");
        if (type.hasClassName()) {
            simpleType = computeLocalClassifierReplacementType(type.getClassName());
        } else {
            simpleType = type.hasTypeAliasName() ? computeLocalClassifierReplacementType(type.getTypeAliasName()) : null;
        }
        if (simpleType != null) {
            return simpleType;
        }
        TypeConstructor typeConstructor = typeConstructor(type);
        if (ErrorUtils.isError(typeConstructor.getDeclarationDescriptor())) {
            SimpleType createErrorTypeWithCustomConstructor = ErrorUtils.createErrorTypeWithCustomConstructor(typeConstructor.toString(), typeConstructor);
            Intrinsics.checkNotNullExpressionValue(createErrorTypeWithCustomConstructor, "createErrorTypeWithCusto….toString(), constructor)");
            return createErrorTypeWithCustomConstructor;
        }
        DeserializedAnnotations deserializedAnnotations = new DeserializedAnnotations(this.f9683c.getStorageManager(), new TypeDeserializer$simpleType$annotations$1(this, type));
        Iterable simpleType$collectAllArguments = simpleType$collectAllArguments(type, this);
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(simpleType$collectAllArguments, 10));
        int i = 0;
        for (Object next : simpleType$collectAllArguments) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "constructor.parameters");
            arrayList.add(typeArgument((TypeParameterDescriptor) CollectionsKt.getOrNull(parameters, i), (ProtoBuf.Type.Argument) next));
            i = i2;
        }
        List list = CollectionsKt.toList((List) arrayList);
        ClassifierDescriptor declarationDescriptor = typeConstructor.getDeclarationDescriptor();
        if (!z || !(declarationDescriptor instanceof TypeAliasDescriptor)) {
            Boolean bool = Flags.SUSPEND_TYPE.get(type.getFlags());
            Intrinsics.checkNotNullExpressionValue(bool, "SUSPEND_TYPE.get(proto.flags)");
            if (bool.booleanValue()) {
                simpleType2 = createSuspendFunctionType(deserializedAnnotations, typeConstructor, list, type.getNullable());
            } else {
                simpleType2 = KotlinTypeFactory.simpleType$default(deserializedAnnotations, typeConstructor, list, type.getNullable(), (KotlinTypeRefiner) null, 16, (Object) null);
                Boolean bool2 = Flags.DEFINITELY_NOT_NULL_TYPE.get(type.getFlags());
                Intrinsics.checkNotNullExpressionValue(bool2, "DEFINITELY_NOT_NULL_TYPE.get(proto.flags)");
                if (bool2.booleanValue()) {
                    DefinitelyNotNullType makeDefinitelyNotNull$default = DefinitelyNotNullType.Companion.makeDefinitelyNotNull$default(DefinitelyNotNullType.Companion, simpleType2, false, 2, (Object) null);
                    if (makeDefinitelyNotNull$default != null) {
                        simpleType2 = makeDefinitelyNotNull$default;
                    } else {
                        throw new IllegalStateException(("null DefinitelyNotNullType for '" + simpleType2 + '\'').toString());
                    }
                }
            }
        } else {
            KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.INSTANCE;
            SimpleType computeExpandedType = KotlinTypeFactory.computeExpandedType((TypeAliasDescriptor) declarationDescriptor, list);
            simpleType2 = computeExpandedType.makeNullableAsSpecified(KotlinTypeKt.isNullable(computeExpandedType) || type.getNullable()).replaceAnnotations(Annotations.Companion.create(CollectionsKt.plus(deserializedAnnotations, (DeserializedAnnotations) computeExpandedType.getAnnotations())));
        }
        ProtoBuf.Type abbreviatedType = ProtoTypeTableUtilKt.abbreviatedType(type, this.f9683c.getTypeTable());
        if (abbreviatedType != null) {
            simpleType2 = SpecialTypesKt.withAbbreviation(simpleType2, simpleType(abbreviatedType, false));
        }
        if (!type.hasClassName()) {
            return simpleType2;
        }
        return this.f9683c.getComponents().getPlatformDependentTypeTransformer().transformPlatformType(NameResolverUtilKt.getClassId(this.f9683c.getNameResolver(), type.getClassName()), simpleType2);
    }

    private static final List<ProtoBuf.Type.Argument> simpleType$collectAllArguments(ProtoBuf.Type type, TypeDeserializer typeDeserializer) {
        List<ProtoBuf.Type.Argument> argumentList = type.getArgumentList();
        Intrinsics.checkNotNullExpressionValue(argumentList, "argumentList");
        Collection collection = argumentList;
        ProtoBuf.Type outerType = ProtoTypeTableUtilKt.outerType(type, typeDeserializer.f9683c.getTypeTable());
        List<ProtoBuf.Type.Argument> simpleType$collectAllArguments = outerType == null ? null : simpleType$collectAllArguments(outerType, typeDeserializer);
        if (simpleType$collectAllArguments == null) {
            simpleType$collectAllArguments = CollectionsKt.emptyList();
        }
        return CollectionsKt.plus(collection, simpleType$collectAllArguments);
    }

    private static final ClassDescriptor typeConstructor$notFoundClass(TypeDeserializer typeDeserializer, ProtoBuf.Type type, int i) {
        ClassId classId = NameResolverUtilKt.getClassId(typeDeserializer.f9683c.getNameResolver(), i);
        List mutableList = SequencesKt.toMutableList(SequencesKt.map(SequencesKt.generateSequence(type, new TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$1(typeDeserializer)), TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$2.INSTANCE));
        int count = SequencesKt.count(SequencesKt.generateSequence(classId, TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1.INSTANCE));
        while (mutableList.size() < count) {
            mutableList.add(0);
        }
        return typeDeserializer.f9683c.getComponents().getNotFoundClasses().getClass(classId, mutableList);
    }

    private final TypeConstructor typeConstructor(ProtoBuf.Type type) {
        ClassifierDescriptor classifierDescriptor;
        Object obj;
        if (type.hasClassName()) {
            classifierDescriptor = this.classifierDescriptors.invoke(Integer.valueOf(type.getClassName()));
            if (classifierDescriptor == null) {
                classifierDescriptor = typeConstructor$notFoundClass(this, type, type.getClassName());
            }
        } else if (type.hasTypeParameter()) {
            TypeParameterDescriptor loadTypeParameter = loadTypeParameter(type.getTypeParameter());
            if (loadTypeParameter == null) {
                TypeConstructor createErrorTypeConstructor = ErrorUtils.createErrorTypeConstructor("Unknown type parameter " + type.getTypeParameter() + ". Please try recompiling module containing \"" + this.containerPresentableName + '\"');
                Intrinsics.checkNotNullExpressionValue(createErrorTypeConstructor, "createErrorTypeConstruct…\\\"\"\n                    )");
                return createErrorTypeConstructor;
            }
            classifierDescriptor = loadTypeParameter;
        } else if (type.hasTypeParameterName()) {
            String string = this.f9683c.getNameResolver().getString(type.getTypeParameterName());
            Iterator it = getOwnTypeParameters().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual((Object) ((TypeParameterDescriptor) obj).getName().asString(), (Object) string)) {
                    break;
                }
            }
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) obj;
            if (typeParameterDescriptor == null) {
                TypeConstructor createErrorTypeConstructor2 = ErrorUtils.createErrorTypeConstructor("Deserialized type parameter " + string + " in " + this.f9683c.getContainingDeclaration());
                Intrinsics.checkNotNullExpressionValue(createErrorTypeConstructor2, "createErrorTypeConstruct….containingDeclaration}\")");
                return createErrorTypeConstructor2;
            }
            classifierDescriptor = typeParameterDescriptor;
        } else if (type.hasTypeAliasName()) {
            classifierDescriptor = this.typeAliasDescriptors.invoke(Integer.valueOf(type.getTypeAliasName()));
            if (classifierDescriptor == null) {
                classifierDescriptor = typeConstructor$notFoundClass(this, type, type.getTypeAliasName());
            }
        } else {
            TypeConstructor createErrorTypeConstructor3 = ErrorUtils.createErrorTypeConstructor("Unknown type");
            Intrinsics.checkNotNullExpressionValue(createErrorTypeConstructor3, "createErrorTypeConstructor(\"Unknown type\")");
            return createErrorTypeConstructor3;
        }
        TypeConstructor typeConstructor = classifierDescriptor.getTypeConstructor();
        Intrinsics.checkNotNullExpressionValue(typeConstructor, "classifier.typeConstructor");
        return typeConstructor;
    }

    private final SimpleType createSuspendFunctionType(Annotations annotations, TypeConstructor typeConstructor, List<? extends TypeProjection> list, boolean z) {
        int size = typeConstructor.getParameters().size() - list.size();
        SimpleType simpleType = null;
        if (size == 0) {
            simpleType = createSuspendFunctionTypeForBasicCase(annotations, typeConstructor, list, z);
        } else if (size == 1) {
            int size2 = list.size() - 1;
            if (size2 >= 0) {
                TypeConstructor typeConstructor2 = typeConstructor.getBuiltIns().getSuspendFunction(size2).getTypeConstructor();
                Intrinsics.checkNotNullExpressionValue(typeConstructor2, "functionTypeConstructor.…on(arity).typeConstructor");
                simpleType = KotlinTypeFactory.simpleType$default(annotations, typeConstructor2, list, z, (KotlinTypeRefiner) null, 16, (Object) null);
            } else {
                simpleType = null;
            }
        }
        if (simpleType != null) {
            return simpleType;
        }
        SimpleType createErrorTypeWithArguments = ErrorUtils.createErrorTypeWithArguments(Intrinsics.stringPlus("Bad suspend function in metadata with constructor: ", typeConstructor), list);
        Intrinsics.checkNotNullExpressionValue(createErrorTypeWithArguments, "createErrorTypeWithArgum…      arguments\n        )");
        return createErrorTypeWithArguments;
    }

    private final SimpleType createSuspendFunctionTypeForBasicCase(Annotations annotations, TypeConstructor typeConstructor, List<? extends TypeProjection> list, boolean z) {
        KotlinType simpleType$default = KotlinTypeFactory.simpleType$default(annotations, typeConstructor, list, z, (KotlinTypeRefiner) null, 16, (Object) null);
        if (!FunctionTypesKt.isFunctionType(simpleType$default)) {
            return null;
        }
        return transformRuntimeFunctionTypeToSuspendFunction(simpleType$default);
    }

    private final SimpleType transformRuntimeFunctionTypeToSuspendFunction(KotlinType kotlinType) {
        TypeProjection typeProjection = (TypeProjection) CollectionsKt.lastOrNull(FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType));
        FqName fqName = null;
        if (typeProjection == null) {
            return null;
        }
        KotlinType type = typeProjection.getType();
        Intrinsics.checkNotNullExpressionValue(type, "funType.getValueParamete…ll()?.type ?: return null");
        ClassifierDescriptor declarationDescriptor = type.getConstructor().getDeclarationDescriptor();
        FqName fqNameSafe = declarationDescriptor == null ? null : DescriptorUtilsKt.getFqNameSafe(declarationDescriptor);
        if (type.getArguments().size() != 1 || (!Intrinsics.areEqual((Object) fqNameSafe, (Object) StandardNames.CONTINUATION_INTERFACE_FQ_NAME) && !Intrinsics.areEqual((Object) fqNameSafe, (Object) TypeDeserializerKt.EXPERIMENTAL_CONTINUATION_FQ_NAME))) {
            return (SimpleType) kotlinType;
        }
        KotlinType type2 = ((TypeProjection) CollectionsKt.single(type.getArguments())).getType();
        Intrinsics.checkNotNullExpressionValue(type2, "continuationArgumentType.arguments.single().type");
        DeclarationDescriptor containingDeclaration = this.f9683c.getContainingDeclaration();
        if (!(containingDeclaration instanceof CallableDescriptor)) {
            containingDeclaration = null;
        }
        CallableDescriptor callableDescriptor = (CallableDescriptor) containingDeclaration;
        if (callableDescriptor != null) {
            fqName = DescriptorUtilsKt.fqNameOrNull(callableDescriptor);
        }
        if (Intrinsics.areEqual((Object) fqName, (Object) SuspendFunctionTypeUtilKt.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME)) {
            return createSimpleSuspendFunctionType(kotlinType, type2);
        }
        return createSimpleSuspendFunctionType(kotlinType, type2);
    }

    private final SimpleType createSimpleSuspendFunctionType(KotlinType kotlinType, KotlinType kotlinType2) {
        KotlinBuiltIns builtIns = TypeUtilsKt.getBuiltIns(kotlinType);
        Annotations annotations = kotlinType.getAnnotations();
        KotlinType receiverTypeFromFunctionType = FunctionTypesKt.getReceiverTypeFromFunctionType(kotlinType);
        Iterable<TypeProjection> dropLast = CollectionsKt.dropLast(FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType), 1);
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(dropLast, 10));
        for (TypeProjection type : dropLast) {
            arrayList.add(type.getType());
        }
        return FunctionTypesKt.createFunctionType(builtIns, annotations, receiverTypeFromFunctionType, (List) arrayList, (List<Name>) null, kotlinType2, true).makeNullableAsSpecified(kotlinType.isMarkedNullable());
    }

    private final TypeParameterDescriptor loadTypeParameter(int i) {
        TypeParameterDescriptor typeParameterDescriptor = this.typeParameterDescriptors.get(Integer.valueOf(i));
        if (typeParameterDescriptor != null) {
            return typeParameterDescriptor;
        }
        TypeDeserializer typeDeserializer = this.parent;
        if (typeDeserializer == null) {
            return null;
        }
        return typeDeserializer.loadTypeParameter(i);
    }

    /* access modifiers changed from: private */
    public final ClassifierDescriptor computeClassifierDescriptor(int i) {
        ClassId classId = NameResolverUtilKt.getClassId(this.f9683c.getNameResolver(), i);
        if (classId.isLocal()) {
            return this.f9683c.getComponents().deserializeClass(classId);
        }
        return FindClassInModuleKt.findClassifierAcrossModuleDependencies(this.f9683c.getComponents().getModuleDescriptor(), classId);
    }

    private final SimpleType computeLocalClassifierReplacementType(int i) {
        if (NameResolverUtilKt.getClassId(this.f9683c.getNameResolver(), i).isLocal()) {
            return this.f9683c.getComponents().getLocalClassifierTypeSettings().getReplacementTypeForLocalClassifiers();
        }
        return null;
    }

    /* access modifiers changed from: private */
    public final ClassifierDescriptor computeTypeAliasDescriptor(int i) {
        ClassId classId = NameResolverUtilKt.getClassId(this.f9683c.getNameResolver(), i);
        if (classId.isLocal()) {
            return null;
        }
        return FindClassInModuleKt.findTypeAliasAcrossModuleDependencies(this.f9683c.getComponents().getModuleDescriptor(), classId);
    }

    private final TypeProjection typeArgument(TypeParameterDescriptor typeParameterDescriptor, ProtoBuf.Type.Argument argument) {
        if (argument.getProjection() != ProtoBuf.Type.Argument.Projection.STAR) {
            ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
            ProtoBuf.Type.Argument.Projection projection = argument.getProjection();
            Intrinsics.checkNotNullExpressionValue(projection, "typeArgumentProto.projection");
            Variance variance = protoEnumFlags.variance(projection);
            ProtoBuf.Type type = ProtoTypeTableUtilKt.type(argument, this.f9683c.getTypeTable());
            if (type == null) {
                return new TypeProjectionImpl(ErrorUtils.createErrorType("No type recorded"));
            }
            return new TypeProjectionImpl(variance, type(type));
        } else if (typeParameterDescriptor == null) {
            return new StarProjectionForAbsentTypeParameter(this.f9683c.getComponents().getModuleDescriptor().getBuiltIns());
        } else {
            return new StarProjectionImpl(typeParameterDescriptor);
        }
    }

    public String toString() {
        String str = this.debugName;
        TypeDeserializer typeDeserializer = this.parent;
        return Intrinsics.stringPlus(str, typeDeserializer == null ? "" : Intrinsics.stringPlus(". Child of ", typeDeserializer.debugName));
    }
}
