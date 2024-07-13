package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.List;
import kotlin._Assertions;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;

/* compiled from: functionTypes.kt */
public final class FunctionTypesKt {
    public static final boolean isFunctionType(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
        return (declarationDescriptor == null ? null : getFunctionalClassKind((DeclarationDescriptor) declarationDescriptor)) == FunctionClassKind.Function;
    }

    public static final boolean isSuspendFunctionType(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
        return (declarationDescriptor == null ? null : getFunctionalClassKind((DeclarationDescriptor) declarationDescriptor)) == FunctionClassKind.SuspendFunction;
    }

    public static final boolean isBuiltinFunctionalType(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
        return declarationDescriptor != null && isBuiltinFunctionalClassDescriptor(declarationDescriptor);
    }

    public static final boolean isBuiltinFunctionalClassDescriptor(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkNotNullParameter(declarationDescriptor, "<this>");
        FunctionClassKind functionalClassKind = getFunctionalClassKind(declarationDescriptor);
        return functionalClassKind == FunctionClassKind.Function || functionalClassKind == FunctionClassKind.SuspendFunction;
    }

    public static final boolean isBuiltinExtensionFunctionalType(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        return isBuiltinFunctionalType(kotlinType) && isTypeAnnotatedWithExtensionFunctionType(kotlinType);
    }

    private static final boolean isTypeAnnotatedWithExtensionFunctionType(KotlinType kotlinType) {
        return kotlinType.getAnnotations().findAnnotation(StandardNames.FqNames.extensionFunctionType) != null;
    }

    public static final FunctionClassKind getFunctionalClassKind(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkNotNullParameter(declarationDescriptor, "<this>");
        if ((declarationDescriptor instanceof ClassDescriptor) && KotlinBuiltIns.isUnderKotlinPackage(declarationDescriptor)) {
            return getFunctionalClassKind(DescriptorUtilsKt.getFqNameUnsafe(declarationDescriptor));
        }
        return null;
    }

    private static final FunctionClassKind getFunctionalClassKind(FqNameUnsafe fqNameUnsafe) {
        if (!fqNameUnsafe.isSafe() || fqNameUnsafe.isRoot()) {
            return null;
        }
        FunctionClassKind.Companion companion = FunctionClassKind.Companion;
        String asString = fqNameUnsafe.shortName().asString();
        Intrinsics.checkNotNullExpressionValue(asString, "shortName().asString()");
        FqName parent = fqNameUnsafe.toSafe().parent();
        Intrinsics.checkNotNullExpressionValue(parent, "toSafe().parent()");
        return companion.getFunctionalClassKind(asString, parent);
    }

    public static final KotlinType getReceiverTypeFromFunctionType(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        boolean isBuiltinFunctionalType = isBuiltinFunctionalType(kotlinType);
        if (_Assertions.ENABLED && !isBuiltinFunctionalType) {
            throw new AssertionError(Intrinsics.stringPlus("Not a function type: ", kotlinType));
        } else if (isTypeAnnotatedWithExtensionFunctionType(kotlinType)) {
            return ((TypeProjection) CollectionsKt.first(kotlinType.getArguments())).getType();
        } else {
            return null;
        }
    }

    public static final KotlinType getReturnTypeFromFunctionType(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        boolean isBuiltinFunctionalType = isBuiltinFunctionalType(kotlinType);
        if (!_Assertions.ENABLED || isBuiltinFunctionalType) {
            KotlinType type = ((TypeProjection) CollectionsKt.last(kotlinType.getArguments())).getType();
            Intrinsics.checkNotNullExpressionValue(type, "arguments.last().type");
            return type;
        }
        throw new AssertionError(Intrinsics.stringPlus("Not a function type: ", kotlinType));
    }

    public static final List<TypeProjection> getValueParameterTypesFromFunctionType(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        boolean isBuiltinFunctionalType = isBuiltinFunctionalType(kotlinType);
        if (!_Assertions.ENABLED || isBuiltinFunctionalType) {
            List<TypeProjection> arguments = kotlinType.getArguments();
            int isBuiltinExtensionFunctionalType = isBuiltinExtensionFunctionalType(kotlinType);
            boolean z = true;
            int size = arguments.size() - 1;
            if (isBuiltinExtensionFunctionalType > size) {
                z = false;
            }
            if (!_Assertions.ENABLED || z) {
                return arguments.subList(isBuiltinExtensionFunctionalType, size);
            }
            throw new AssertionError(Intrinsics.stringPlus("Not an exact function type: ", kotlinType));
        }
        throw new AssertionError(Intrinsics.stringPlus("Not a function type: ", kotlinType));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        if (kotlin.reflect.jvm.internal.impl.name.Name.isValidIdentifier(r2) != false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.reflect.jvm.internal.impl.name.Name extractParameterNameFromFunctionTypeArgument(kotlin.reflect.jvm.internal.impl.types.KotlinType r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r2 = r2.getAnnotations()
            kotlin.reflect.jvm.internal.impl.name.FqName r0 = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.parameterName
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor r2 = r2.findAnnotation(r0)
            r0 = 0
            if (r2 != 0) goto L_0x0013
            return r0
        L_0x0013:
            java.util.Map r2 = r2.getAllValueArguments()
            java.util.Collection r2 = r2.values()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.Object r2 = kotlin.collections.CollectionsKt.singleOrNull(r2)
            boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue
            if (r1 == 0) goto L_0x0028
            kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue r2 = (kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue) r2
            goto L_0x0029
        L_0x0028:
            r2 = r0
        L_0x0029:
            if (r2 != 0) goto L_0x002d
        L_0x002b:
            r2 = r0
            goto L_0x0039
        L_0x002d:
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            boolean r1 = kotlin.reflect.jvm.internal.impl.name.Name.isValidIdentifier(r2)
            if (r1 == 0) goto L_0x002b
        L_0x0039:
            if (r2 != 0) goto L_0x003c
            return r0
        L_0x003c:
            kotlin.reflect.jvm.internal.impl.name.Name r2 = kotlin.reflect.jvm.internal.impl.name.Name.identifier(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(kotlin.reflect.jvm.internal.impl.types.KotlinType):kotlin.reflect.jvm.internal.impl.name.Name");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        if (r2.isSpecial() == false) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> getFunctionTypeArgumentProjections(kotlin.reflect.jvm.internal.impl.types.KotlinType r10, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> r11, java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> r12, kotlin.reflect.jvm.internal.impl.types.KotlinType r13, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns r14) {
        /*
            java.lang.String r0 = "parameterTypes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "returnType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "builtIns"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.size()
            r2 = 0
            r3 = 1
            if (r10 == 0) goto L_0x001b
            r4 = 1
            goto L_0x001c
        L_0x001b:
            r4 = 0
        L_0x001c:
            int r1 = r1 + r4
            int r1 = r1 + r3
            r0.<init>(r1)
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            r3 = 0
            if (r10 != 0) goto L_0x0029
            r10 = r3
            goto L_0x002d
        L_0x0029:
            kotlin.reflect.jvm.internal.impl.types.TypeProjection r10 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.asTypeProjection(r10)
        L_0x002d:
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(r1, r10)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r10 = r11.iterator()
        L_0x0036:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x009b
            java.lang.Object r11 = r10.next()
            int r4 = r2 + 1
            if (r2 >= 0) goto L_0x0047
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L_0x0047:
            kotlin.reflect.jvm.internal.impl.types.KotlinType r11 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r11
            if (r12 != 0) goto L_0x004d
        L_0x004b:
            r2 = r3
            goto L_0x0059
        L_0x004d:
            java.lang.Object r2 = r12.get(r2)
            kotlin.reflect.jvm.internal.impl.name.Name r2 = (kotlin.reflect.jvm.internal.impl.name.Name) r2
            boolean r5 = r2.isSpecial()
            if (r5 != 0) goto L_0x004b
        L_0x0059:
            if (r2 == 0) goto L_0x0092
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor r5 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor
            kotlin.reflect.jvm.internal.impl.name.FqName r6 = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.parameterName
            java.lang.String r7 = "name"
            kotlin.reflect.jvm.internal.impl.name.Name r7 = kotlin.reflect.jvm.internal.impl.name.Name.identifier(r7)
            kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue r8 = new kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue
            java.lang.String r2 = r2.asString()
            java.lang.String r9 = "name.asString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r9)
            r8.<init>(r2)
            kotlin.Pair r2 = kotlin.TuplesKt.to(r7, r8)
            java.util.Map r2 = kotlin.collections.MapsKt.mapOf(r2)
            r5.<init>(r14, r6, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations$Companion r2 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r6 = r11.getAnnotations()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.List r5 = kotlin.collections.CollectionsKt.plus(r6, r5)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r2 = r2.create(r5)
            kotlin.reflect.jvm.internal.impl.types.KotlinType r11 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.replaceAnnotations(r11, r2)
        L_0x0092:
            kotlin.reflect.jvm.internal.impl.types.TypeProjection r11 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.asTypeProjection(r11)
            r1.add(r11)
            r2 = r4
            goto L_0x0036
        L_0x009b:
            kotlin.reflect.jvm.internal.impl.types.TypeProjection r10 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.asTypeProjection(r13)
            r0.add(r10)
            java.util.List r0 = (java.util.List) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.getFunctionTypeArgumentProjections(kotlin.reflect.jvm.internal.impl.types.KotlinType, java.util.List, java.util.List, kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns):java.util.List");
    }

    public static /* synthetic */ SimpleType createFunctionType$default(KotlinBuiltIns kotlinBuiltIns, Annotations annotations, KotlinType kotlinType, List list, List list2, KotlinType kotlinType2, boolean z, int i, Object obj) {
        return createFunctionType(kotlinBuiltIns, annotations, kotlinType, list, list2, kotlinType2, (i & 64) != 0 ? false : z);
    }

    public static final SimpleType createFunctionType(KotlinBuiltIns kotlinBuiltIns, Annotations annotations, KotlinType kotlinType, List<? extends KotlinType> list, List<Name> list2, KotlinType kotlinType2, boolean z) {
        Intrinsics.checkNotNullParameter(kotlinBuiltIns, "builtIns");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(list, "parameterTypes");
        Intrinsics.checkNotNullParameter(kotlinType2, "returnType");
        List<TypeProjection> functionTypeArgumentProjections = getFunctionTypeArgumentProjections(kotlinType, list, list2, kotlinType2, kotlinBuiltIns);
        int size = list.size();
        if (kotlinType != null) {
            size++;
        }
        ClassDescriptor functionDescriptor = getFunctionDescriptor(kotlinBuiltIns, size, z);
        if (kotlinType != null) {
            annotations = withExtensionFunctionAnnotation(annotations, kotlinBuiltIns);
        }
        return KotlinTypeFactory.simpleNotNullType(annotations, functionDescriptor, functionTypeArgumentProjections);
    }

    public static final Annotations withExtensionFunctionAnnotation(Annotations annotations, KotlinBuiltIns kotlinBuiltIns) {
        Intrinsics.checkNotNullParameter(annotations, "<this>");
        Intrinsics.checkNotNullParameter(kotlinBuiltIns, "builtIns");
        return annotations.hasAnnotation(StandardNames.FqNames.extensionFunctionType) ? annotations : Annotations.Companion.create(CollectionsKt.plus(annotations, new BuiltInAnnotationDescriptor(kotlinBuiltIns, StandardNames.FqNames.extensionFunctionType, MapsKt.emptyMap())));
    }

    public static final ClassDescriptor getFunctionDescriptor(KotlinBuiltIns kotlinBuiltIns, int i, boolean z) {
        Intrinsics.checkNotNullParameter(kotlinBuiltIns, "builtIns");
        ClassDescriptor suspendFunction = z ? kotlinBuiltIns.getSuspendFunction(i) : kotlinBuiltIns.getFunction(i);
        Intrinsics.checkNotNullExpressionValue(suspendFunction, "if (isSuspendFunction) b…tFunction(parameterCount)");
        return suspendFunction;
    }
}
