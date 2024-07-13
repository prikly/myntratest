package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypeWithEnhancement;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* compiled from: signatureEnhancement.kt */
public final class SignatureEnhancement {
    /* access modifiers changed from: private */
    public final AnnotationTypeQualifierResolver annotationTypeQualifierResolver;
    private final JavaTypeEnhancementState javaTypeEnhancementState;
    /* access modifiers changed from: private */
    public final JavaTypeEnhancement typeEnhancement;

    public SignatureEnhancement(AnnotationTypeQualifierResolver annotationTypeQualifierResolver2, JavaTypeEnhancementState javaTypeEnhancementState2, JavaTypeEnhancement javaTypeEnhancement) {
        Intrinsics.checkNotNullParameter(annotationTypeQualifierResolver2, "annotationTypeQualifierResolver");
        Intrinsics.checkNotNullParameter(javaTypeEnhancementState2, "javaTypeEnhancementState");
        Intrinsics.checkNotNullParameter(javaTypeEnhancement, "typeEnhancement");
        this.annotationTypeQualifierResolver = annotationTypeQualifierResolver2;
        this.javaTypeEnhancementState = javaTypeEnhancementState2;
        this.typeEnhancement = javaTypeEnhancement;
    }

    private final NullabilityQualifierWithMigrationStatus extractNullabilityTypeFromArgument(AnnotationDescriptor annotationDescriptor, boolean z) {
        ConstantValue<?> firstArgument = DescriptorUtilsKt.firstArgument(annotationDescriptor);
        EnumValue enumValue = firstArgument instanceof EnumValue ? (EnumValue) firstArgument : null;
        if (enumValue == null) {
            return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, z);
        }
        String asString = enumValue.getEnumEntryName().asString();
        switch (asString.hashCode()) {
            case 73135176:
                if (!asString.equals("MAYBE")) {
                    return null;
                }
                break;
            case 74175084:
                if (!asString.equals("NEVER")) {
                    return null;
                }
                break;
            case 433141802:
                if (!asString.equals("UNKNOWN")) {
                    return null;
                }
                return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.FORCE_FLEXIBILITY, z);
            case 1933739535:
                if (!asString.equals("ALWAYS")) {
                    return null;
                }
                return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, z);
            default:
                return null;
        }
        return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, z);
    }

    public final NullabilityQualifierWithMigrationStatus extractNullability(AnnotationDescriptor annotationDescriptor, boolean z, boolean z2) {
        NullabilityQualifierWithMigrationStatus extractNullabilityFromKnownAnnotations;
        Intrinsics.checkNotNullParameter(annotationDescriptor, "annotationDescriptor");
        NullabilityQualifierWithMigrationStatus extractNullabilityFromKnownAnnotations2 = extractNullabilityFromKnownAnnotations(annotationDescriptor, z, z2);
        if (extractNullabilityFromKnownAnnotations2 != null) {
            return extractNullabilityFromKnownAnnotations2;
        }
        AnnotationDescriptor resolveTypeQualifierAnnotation = this.annotationTypeQualifierResolver.resolveTypeQualifierAnnotation(annotationDescriptor);
        if (resolveTypeQualifierAnnotation == null) {
            return null;
        }
        ReportLevel resolveJsr305AnnotationState = this.annotationTypeQualifierResolver.resolveJsr305AnnotationState(annotationDescriptor);
        if (!resolveJsr305AnnotationState.isIgnore() && (extractNullabilityFromKnownAnnotations = extractNullabilityFromKnownAnnotations(resolveTypeQualifierAnnotation, z, z2)) != null) {
            return NullabilityQualifierWithMigrationStatus.copy$default(extractNullabilityFromKnownAnnotations, (NullabilityQualifier) null, resolveJsr305AnnotationState.isWarning(), 1, (Object) null);
        }
        return null;
    }

    private final NullabilityQualifierWithMigrationStatus extractNullabilityFromKnownAnnotations(AnnotationDescriptor annotationDescriptor, boolean z, boolean z2) {
        FqName fqName = annotationDescriptor.getFqName();
        if (fqName == null) {
            return null;
        }
        NullabilityQualifierWithMigrationStatus commonMigrationStatus = commonMigrationStatus(fqName, annotationDescriptor, (annotationDescriptor instanceof LazyJavaAnnotationDescriptor) && (((LazyJavaAnnotationDescriptor) annotationDescriptor).isFreshlySupportedTypeUseAnnotation() || z2) && !z);
        if (commonMigrationStatus == null) {
            return null;
        }
        return (commonMigrationStatus.isForWarningOnly() || !(annotationDescriptor instanceof PossiblyExternalAnnotationDescriptor) || !((PossiblyExternalAnnotationDescriptor) annotationDescriptor).isIdeExternalAnnotation()) ? commonMigrationStatus : NullabilityQualifierWithMigrationStatus.copy$default(commonMigrationStatus, (NullabilityQualifier) null, true, 1, (Object) null);
    }

    private final NullabilityQualifierWithMigrationStatus commonMigrationStatus(FqName fqName, AnnotationDescriptor annotationDescriptor, boolean z) {
        ReportLevel invoke = this.javaTypeEnhancementState.getGetReportLevelForAnnotation().invoke(fqName);
        if (invoke.isIgnore()) {
            return null;
        }
        boolean z2 = invoke.isWarning() || z;
        if (JvmAnnotationNamesKt.getNULLABLE_ANNOTATIONS().contains(fqName)) {
            return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, z2);
        }
        if (JvmAnnotationNamesKt.getNOT_NULL_ANNOTATIONS().contains(fqName)) {
            return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, z2);
        }
        if (Intrinsics.areEqual((Object) fqName, (Object) JvmAnnotationNamesKt.getJSPECIFY_NULLABLE())) {
            return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, z2);
        }
        if (Intrinsics.areEqual((Object) fqName, (Object) JvmAnnotationNamesKt.getJSPECIFY_NULLNESS_UNKNOWN())) {
            return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.FORCE_FLEXIBILITY, z2);
        }
        if (Intrinsics.areEqual((Object) fqName, (Object) JvmAnnotationNamesKt.getJAVAX_NONNULL_ANNOTATION())) {
            return extractNullabilityTypeFromArgument(annotationDescriptor, z2);
        }
        if (Intrinsics.areEqual((Object) fqName, (Object) JvmAnnotationNamesKt.getCOMPATQUAL_NULLABLE_ANNOTATION())) {
            return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, z2);
        }
        if (Intrinsics.areEqual((Object) fqName, (Object) JvmAnnotationNamesKt.getCOMPATQUAL_NONNULL_ANNOTATION())) {
            return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, z2);
        }
        if (Intrinsics.areEqual((Object) fqName, (Object) JvmAnnotationNamesKt.getANDROIDX_RECENTLY_NON_NULL_ANNOTATION())) {
            return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, z2);
        }
        if (Intrinsics.areEqual((Object) fqName, (Object) JvmAnnotationNamesKt.getANDROIDX_RECENTLY_NULLABLE_ANNOTATION())) {
            return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, z2);
        }
        return null;
    }

    public final <D extends CallableMemberDescriptor> Collection<D> enhanceSignatures(LazyJavaResolverContext lazyJavaResolverContext, Collection<? extends D> collection) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "c");
        Intrinsics.checkNotNullParameter(collection, "platformSignatures");
        Iterable<CallableMemberDescriptor> iterable = collection;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (CallableMemberDescriptor enhanceSignature : iterable) {
            arrayList.add(enhanceSignature(enhanceSignature, lazyJavaResolverContext));
        }
        return (List) arrayList;
    }

    private final <D extends CallableMemberDescriptor> Annotations getDefaultAnnotations(D d2, LazyJavaResolverContext lazyJavaResolverContext) {
        ClassifierDescriptor topLevelContainingClassifier = DescriptorUtilKt.getTopLevelContainingClassifier((DeclarationDescriptor) d2);
        if (topLevelContainingClassifier == null) {
            return d2.getAnnotations();
        }
        List<JavaAnnotation> list = null;
        LazyJavaClassDescriptor lazyJavaClassDescriptor = topLevelContainingClassifier instanceof LazyJavaClassDescriptor ? (LazyJavaClassDescriptor) topLevelContainingClassifier : null;
        if (lazyJavaClassDescriptor != null) {
            list = lazyJavaClassDescriptor.getModuleAnnotations();
        }
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            return d2.getAnnotations();
        }
        Iterable<JavaAnnotation> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (JavaAnnotation lazyJavaAnnotationDescriptor : iterable) {
            arrayList.add(new LazyJavaAnnotationDescriptor(lazyJavaResolverContext, lazyJavaAnnotationDescriptor, true));
        }
        return Annotations.Companion.create(CollectionsKt.plus(d2.getAnnotations(), (Annotations) (List) arrayList));
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01d9 A[EDGE_INSN: B:142:0x01d9->B:94:0x01d9 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x021c A[EDGE_INSN: B:145:0x021c->B:116:0x021c ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> D enhanceSignature(D r18, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r19) {
        /*
            r17 = this;
            r7 = r17
            r8 = r18
            boolean r0 = r8 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor
            if (r0 != 0) goto L_0x0009
            return r8
        L_0x0009:
            r9 = r8
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor r9 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor) r9
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r0 = r9.getKind()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r1 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE
            r10 = 1
            if (r0 != r1) goto L_0x0024
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = r9.getOriginal()
            java.util.Collection r0 = r0.getOverriddenDescriptors()
            int r0 = r0.size()
            if (r0 != r10) goto L_0x0024
            return r8
        L_0x0024:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r0 = r17.getDefaultAnnotations(r18, r19)
            r1 = r19
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r4 = kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.copyWithNewDefaultTypeQualifiers(r1, r0)
            boolean r0 = r8 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor
            r11 = 0
            if (r0 == 0) goto L_0x0057
            r0 = r8
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor r0 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor) r0
            kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl r1 = r0.getGetter()
            if (r1 != 0) goto L_0x003e
        L_0x003c:
            r1 = 0
            goto L_0x0045
        L_0x003e:
            boolean r1 = r1.isDefault()
            if (r1 != 0) goto L_0x003c
            r1 = 1
        L_0x0045:
            if (r1 == 0) goto L_0x0057
            kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl r0 = r0.getGetter()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.lang.String r1 = "getter!!"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r0
            r12 = r0
            goto L_0x0058
        L_0x0057:
            r12 = r8
        L_0x0058:
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor r0 = r9.getExtensionReceiverParameter()
            r1 = 3
            r13 = 0
            if (r0 == 0) goto L_0x0083
            boolean r0 = r12 instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
            if (r0 != 0) goto L_0x0066
            r0 = r13
            goto L_0x0067
        L_0x0066:
            r0 = r12
        L_0x0067:
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) r0
            if (r0 != 0) goto L_0x006d
            r0 = r13
            goto L_0x0075
        L_0x006d:
            kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor$UserDataKey<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> r2 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor.ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER
            java.lang.Object r0 = r0.getUserData(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) r0
        L_0x0075:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1 r2 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1.INSTANCE
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts r0 = r7.partsForValueParameter(r8, r0, r4, r2)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$PartEnhancementResult r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.enhance$default(r0, r13, r11, r1, r13)
            r14 = r0
            goto L_0x0084
        L_0x0083:
            r14 = r13
        L_0x0084:
            boolean r0 = r8 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor
            if (r0 == 0) goto L_0x008c
            r0 = r8
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor r0 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor) r0
            goto L_0x008d
        L_0x008c:
            r0 = r13
        L_0x008d:
            if (r0 != 0) goto L_0x0091
            r15 = r13
            goto L_0x00ae
        L_0x0091:
            kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents r2 = kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r3 = r0.getContainingDeclaration()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r3
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) r0
            java.lang.String r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default(r0, r11, r11, r1, r13)
            java.lang.String r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureBuildingUtilsKt.signature(r2, r3, r0)
            java.util.Map r1 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.getPREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE()
            java.lang.Object r0 = r1.get(r0)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedFunctionEnhancementInfo r0 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedFunctionEnhancementInfo) r0
            r15 = r0
        L_0x00ae:
            if (r15 != 0) goto L_0x00b1
            goto L_0x0109
        L_0x00b1:
            java.util.List r0 = r15.getParametersInfo()
            int r0 = r0.size()
            java.util.List r1 = r9.getValueParameters()
            int r1 = r1.size()
            if (r0 != r1) goto L_0x00c5
            r0 = 1
            goto L_0x00c6
        L_0x00c5:
            r0 = 0
        L_0x00c6:
            boolean r1 = kotlin._Assertions.ENABLED
            if (r1 == 0) goto L_0x0109
            if (r0 == 0) goto L_0x00cd
            goto L_0x0109
        L_0x00cd:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Predefined enhancement info for "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = " has "
            r0.append(r1)
            java.util.List r1 = r15.getParametersInfo()
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = ", but "
            r0.append(r1)
            java.util.List r1 = r9.getValueParameters()
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = " expected"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
        L_0x0109:
            kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState r0 = r7.javaTypeEnhancementState
            boolean r0 = kotlin.reflect.jvm.internal.impl.load.java.UtilsKt.isJspecifyEnabledInStrictMode(r0)
            if (r0 != 0) goto L_0x011f
            kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents r0 = r4.getComponents()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings r0 = r0.getSettings()
            boolean r0 = r0.getIgnoreNullabilityForErasedValueParameters()
            if (r0 == 0) goto L_0x0127
        L_0x011f:
            boolean r0 = kotlin.reflect.jvm.internal.impl.load.java.UtilsKt.hasErasedValueParameters(r18)
            if (r0 == 0) goto L_0x0127
            r0 = 1
            goto L_0x0128
        L_0x0127:
            r0 = 0
        L_0x0128:
            java.util.List r1 = r12.getValueParameters()
            java.lang.String r2 = "annotationOwnerForMember.valueParameters"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r6 = 10
            int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r6)
            r2.<init>(r3)
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r1 = r1.iterator()
        L_0x0144:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0177
            java.lang.Object r3 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) r3
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$1 r5 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$1
            r5.<init>(r3)
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts r5 = r7.partsForValueParameter(r8, r3, r4, r5)
            if (r15 != 0) goto L_0x015f
            r3 = r13
            goto L_0x016d
        L_0x015f:
            java.util.List r6 = r15.getParametersInfo()
            int r3 = r3.getIndex()
            java.lang.Object r3 = kotlin.collections.CollectionsKt.getOrNull(r6, r3)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo r3 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo) r3
        L_0x016d:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$PartEnhancementResult r3 = r5.enhance(r3, r0)
            r2.add(r3)
            r6 = 10
            goto L_0x0144
        L_0x0177:
            r16 = r2
            java.util.List r16 = (java.util.List) r16
            r2 = r12
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated r2 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated) r2
            r3 = 1
            boolean r0 = r8 instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
            if (r0 != 0) goto L_0x0185
            r0 = r13
            goto L_0x0186
        L_0x0185:
            r0 = r8
        L_0x0186:
            kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) r0
            if (r0 != 0) goto L_0x018c
        L_0x018a:
            r0 = 0
            goto L_0x0193
        L_0x018c:
            boolean r0 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JavaDescriptorUtilKt.isJavaField(r0)
            if (r0 != r10) goto L_0x018a
            r0 = 1
        L_0x0193:
            if (r0 == 0) goto L_0x0198
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r0 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.FIELD
            goto L_0x019a
        L_0x0198:
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r0 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE
        L_0x019a:
            r5 = r0
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1 r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1.INSTANCE
            r6 = r0
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r0 = r17
            r1 = r18
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts r0 = r0.parts(r1, r2, r3, r4, r5, r6)
            if (r15 != 0) goto L_0x01ac
            r1 = r13
            goto L_0x01b0
        L_0x01ac:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo r1 = r15.getReturnTypeInfo()
        L_0x01b0:
            r2 = 2
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$PartEnhancementResult r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.enhance$default(r0, r1, r11, r2, r13)
            if (r14 != 0) goto L_0x01b9
        L_0x01b7:
            r1 = 0
            goto L_0x01c0
        L_0x01b9:
            boolean r1 = r14.getContainsFunctionN()
            if (r1 != r10) goto L_0x01b7
            r1 = 1
        L_0x01c0:
            if (r1 != 0) goto L_0x01f7
            boolean r1 = r0.getContainsFunctionN()
            if (r1 != 0) goto L_0x01f7
            r1 = r16
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r2 = r1 instanceof java.util.Collection
            if (r2 == 0) goto L_0x01db
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x01db
        L_0x01d9:
            r1 = 0
            goto L_0x01f2
        L_0x01db:
            java.util.Iterator r1 = r1.iterator()
        L_0x01df:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01d9
            java.lang.Object r2 = r1.next()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$PartEnhancementResult r2 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.PartEnhancementResult) r2
            boolean r2 = r2.getContainsFunctionN()
            if (r2 == 0) goto L_0x01df
            r1 = 1
        L_0x01f2:
            if (r1 == 0) goto L_0x01f5
            goto L_0x01f7
        L_0x01f5:
            r1 = 0
            goto L_0x01f8
        L_0x01f7:
            r1 = 1
        L_0x01f8:
            if (r14 != 0) goto L_0x01fc
        L_0x01fa:
            r2 = 0
            goto L_0x0203
        L_0x01fc:
            boolean r2 = r14.getWereChanges()
            if (r2 != r10) goto L_0x01fa
            r2 = 1
        L_0x0203:
            if (r2 != 0) goto L_0x023a
            boolean r2 = r0.getWereChanges()
            if (r2 != 0) goto L_0x023a
            r2 = r16
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L_0x021e
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x021e
        L_0x021c:
            r10 = 0
            goto L_0x0234
        L_0x021e:
            java.util.Iterator r2 = r2.iterator()
        L_0x0222:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x021c
            java.lang.Object r3 = r2.next()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$PartEnhancementResult r3 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.PartEnhancementResult) r3
            boolean r3 = r3.getWereChanges()
            if (r3 == 0) goto L_0x0222
        L_0x0234:
            if (r10 != 0) goto L_0x023a
            if (r1 == 0) goto L_0x0239
            goto L_0x023a
        L_0x0239:
            return r8
        L_0x023a:
            if (r1 == 0) goto L_0x024d
            kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor$UserDataKey r1 = kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationKt.getDEPRECATED_FUNCTION_KEY()
            kotlin.reflect.jvm.internal.impl.load.java.DeprecationCausedByFunctionN r2 = new kotlin.reflect.jvm.internal.impl.load.java.DeprecationCausedByFunctionN
            r3 = r8
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor) r3
            r2.<init>(r3)
            kotlin.Pair r1 = kotlin.TuplesKt.to(r1, r2)
            goto L_0x024e
        L_0x024d:
            r1 = r13
        L_0x024e:
            if (r14 != 0) goto L_0x0251
            goto L_0x0255
        L_0x0251:
            kotlin.reflect.jvm.internal.impl.types.KotlinType r13 = r14.getType()
        L_0x0255:
            r2 = r16
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r4)
            r3.<init>(r4)
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r2 = r2.iterator()
        L_0x026a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0299
            java.lang.Object r4 = r2.next()
            int r5 = r11 + 1
            if (r11 >= 0) goto L_0x027b
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L_0x027b:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$PartEnhancementResult r4 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.PartEnhancementResult) r4
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.ValueParameterData r6 = new kotlin.reflect.jvm.internal.impl.load.java.descriptors.ValueParameterData
            kotlin.reflect.jvm.internal.impl.types.KotlinType r4 = r4.getType()
            java.util.List r8 = r12.getValueParameters()
            java.lang.Object r8 = r8.get(r11)
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r8 = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) r8
            boolean r8 = r8.declaresDefaultValue()
            r6.<init>(r4, r8)
            r3.add(r6)
            r11 = r5
            goto L_0x026a
        L_0x0299:
            java.util.List r3 = (java.util.List) r3
            kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r0.getType()
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor r0 = r9.enhance(r13, r3, r0, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext):kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor");
    }

    public final List<KotlinType> enhanceTypeParameterBounds(TypeParameterDescriptor typeParameterDescriptor, List<? extends KotlinType> list, LazyJavaResolverContext lazyJavaResolverContext) {
        TypeParameterDescriptor typeParameterDescriptor2 = typeParameterDescriptor;
        List<? extends KotlinType> list2 = list;
        Intrinsics.checkNotNullParameter(typeParameterDescriptor2, "typeParameter");
        Intrinsics.checkNotNullParameter(list2, "bounds");
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "context");
        Iterable<KotlinType> iterable = list2;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (KotlinType kotlinType : iterable) {
            if (!TypeUtilsKt.contains(kotlinType, SignatureEnhancement$enhanceTypeParameterBounds$1$1.INSTANCE)) {
                SignatureParts signatureParts = r3;
                SignatureParts signatureParts2 = new SignatureParts(this, typeParameterDescriptor2, kotlinType, CollectionsKt.emptyList(), false, lazyJavaResolverContext, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, true, false, 128, (DefaultConstructorMarker) null);
                kotlinType = SignatureParts.enhance$default(signatureParts, (TypeEnhancementInfo) null, false, 3, (Object) null).getType();
            }
            arrayList.add(kotlinType);
            typeParameterDescriptor2 = typeParameterDescriptor;
        }
        return (List) arrayList;
    }

    public final KotlinType enhanceSuperType(KotlinType kotlinType, LazyJavaResolverContext lazyJavaResolverContext) {
        Intrinsics.checkNotNullParameter(kotlinType, "type");
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "context");
        return SignatureParts.enhance$default(new SignatureParts(this, (Annotated) null, kotlinType, CollectionsKt.emptyList(), false, lazyJavaResolverContext, AnnotationQualifierApplicabilityType.TYPE_USE, false, true, 64, (DefaultConstructorMarker) null), (TypeEnhancementInfo) null, false, 3, (Object) null).getType();
    }

    /* compiled from: signatureEnhancement.kt */
    private final class SignatureParts {
        private final AnnotationQualifierApplicabilityType containerApplicabilityType;
        private final LazyJavaResolverContext containerContext;
        private final Collection<KotlinType> fromOverridden;
        private final KotlinType fromOverride;
        private final boolean isCovariant;
        private final boolean isSuperTypesEnhancement;
        final /* synthetic */ SignatureEnhancement this$0;
        private final Annotated typeContainer;
        private final boolean typeParameterBounds;

        public SignatureParts(SignatureEnhancement signatureEnhancement, Annotated annotated, KotlinType kotlinType, Collection<? extends KotlinType> collection, boolean z, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(signatureEnhancement, "this$0");
            Intrinsics.checkNotNullParameter(kotlinType, "fromOverride");
            Intrinsics.checkNotNullParameter(collection, "fromOverridden");
            Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "containerContext");
            Intrinsics.checkNotNullParameter(annotationQualifierApplicabilityType, "containerApplicabilityType");
            this.this$0 = signatureEnhancement;
            this.typeContainer = annotated;
            this.fromOverride = kotlinType;
            this.fromOverridden = collection;
            this.isCovariant = z;
            this.containerContext = lazyJavaResolverContext;
            this.containerApplicabilityType = annotationQualifierApplicabilityType;
            this.typeParameterBounds = z2;
            this.isSuperTypesEnhancement = z3;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ SignatureParts(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement r12, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated r13, kotlin.reflect.jvm.internal.impl.types.KotlinType r14, java.util.Collection r15, boolean r16, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r17, kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r18, boolean r19, boolean r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
            /*
                r11 = this;
                r0 = r21
                r10 = r11
                r1 = r12
                r10.this$0 = r1
                r2 = r0 & 64
                r3 = 0
                if (r2 == 0) goto L_0x000d
                r8 = 0
                goto L_0x000f
            L_0x000d:
                r8 = r19
            L_0x000f:
                r0 = r0 & 128(0x80, float:1.794E-43)
                if (r0 == 0) goto L_0x0015
                r9 = 0
                goto L_0x0017
            L_0x0015:
                r9 = r20
            L_0x0017:
                r0 = r11
                r1 = r12
                r2 = r13
                r3 = r14
                r4 = r15
                r5 = r16
                r6 = r17
                r7 = r18
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.<init>(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated, kotlin.reflect.jvm.internal.impl.types.KotlinType, java.util.Collection, boolean, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        private final boolean isForVarargParameter() {
            Annotated annotated = this.typeContainer;
            KotlinType kotlinType = null;
            if (!(annotated instanceof ValueParameterDescriptor)) {
                annotated = null;
            }
            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) annotated;
            if (valueParameterDescriptor != null) {
                kotlinType = valueParameterDescriptor.getVarargElementType();
            }
            return kotlinType != null;
        }

        public static /* synthetic */ PartEnhancementResult enhance$default(SignatureParts signatureParts, TypeEnhancementInfo typeEnhancementInfo, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                typeEnhancementInfo = null;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return signatureParts.enhance(typeEnhancementInfo, z);
        }

        public final PartEnhancementResult enhance(TypeEnhancementInfo typeEnhancementInfo, boolean z) {
            Function1<Integer, JavaTypeQualifiers> function1;
            boolean z2;
            Function1<Integer, JavaTypeQualifiers> computeIndexedQualifiersForOverride = computeIndexedQualifiersForOverride(z);
            if (typeEnhancementInfo == null) {
                function1 = null;
            } else {
                function1 = new SignatureEnhancement$SignatureParts$enhance$qualifiersWithPredefined$1$1(typeEnhancementInfo, computeIndexedQualifiersForOverride);
            }
            if (this.isSuperTypesEnhancement) {
                z2 = TypeUtils.containsStoppingAt(this.fromOverride, SignatureEnhancement$SignatureParts$enhance$containsFunctionN$1.INSTANCE, SignatureEnhancement$SignatureParts$enhance$containsFunctionN$2.INSTANCE);
            } else {
                z2 = TypeUtils.contains(this.fromOverride, SignatureEnhancement$SignatureParts$enhance$containsFunctionN$3.INSTANCE);
            }
            JavaTypeEnhancement access$getTypeEnhancement$p = this.this$0.typeEnhancement;
            KotlinType kotlinType = this.fromOverride;
            if (function1 != null) {
                computeIndexedQualifiersForOverride = function1;
            }
            KotlinType enhance = access$getTypeEnhancement$p.enhance(kotlinType, computeIndexedQualifiersForOverride, this.isSuperTypesEnhancement);
            if (enhance == null) {
                return new PartEnhancementResult(this.fromOverride, false, z2);
            }
            return new PartEnhancementResult(enhance, true, z2);
        }

        /* access modifiers changed from: private */
        public static final boolean enhance$containsFunctionN(UnwrappedType unwrappedType) {
            ClassifierDescriptor declarationDescriptor = unwrappedType.getConstructor().getDeclarationDescriptor();
            if (declarationDescriptor != null && Intrinsics.areEqual((Object) declarationDescriptor.getName(), (Object) JavaToKotlinClassMap.INSTANCE.getFUNCTION_N_FQ_NAME().shortName()) && Intrinsics.areEqual((Object) DescriptorUtilsKt.fqNameOrNull(declarationDescriptor), (Object) JavaToKotlinClassMap.INSTANCE.getFUNCTION_N_FQ_NAME())) {
                return true;
            }
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0069  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers extractQualifiers(kotlin.reflect.jvm.internal.impl.types.KotlinType r12) {
            /*
                r11 = this;
                boolean r0 = kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.isFlexible(r12)
                if (r0 == 0) goto L_0x0018
                kotlin.reflect.jvm.internal.impl.types.FlexibleType r0 = kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.asFlexibleType(r12)
                kotlin.Pair r1 = new kotlin.Pair
                kotlin.reflect.jvm.internal.impl.types.SimpleType r2 = r0.getLowerBound()
                kotlin.reflect.jvm.internal.impl.types.SimpleType r0 = r0.getUpperBound()
                r1.<init>(r2, r0)
                goto L_0x001d
            L_0x0018:
                kotlin.Pair r1 = new kotlin.Pair
                r1.<init>(r12, r12)
            L_0x001d:
                java.lang.Object r0 = r1.component1()
                kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r0
                java.lang.Object r1 = r1.component2()
                kotlin.reflect.jvm.internal.impl.types.KotlinType r1 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r1
                kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper r2 = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper.INSTANCE
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r10 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers
                boolean r3 = r0.isMarkedNullable()
                r4 = 0
                if (r3 == 0) goto L_0x0038
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            L_0x0036:
                r5 = r3
                goto L_0x0042
            L_0x0038:
                boolean r3 = r1.isMarkedNullable()
                if (r3 != 0) goto L_0x0041
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
                goto L_0x0036
            L_0x0041:
                r5 = r4
            L_0x0042:
                boolean r0 = r2.isReadOnly((kotlin.reflect.jvm.internal.impl.types.KotlinType) r0)
                if (r0 == 0) goto L_0x004b
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.READ_ONLY
                goto L_0x0055
            L_0x004b:
                boolean r0 = r2.isMutable((kotlin.reflect.jvm.internal.impl.types.KotlinType) r1)
                if (r0 == 0) goto L_0x0054
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.MUTABLE
                goto L_0x0055
            L_0x0054:
                r0 = r4
            L_0x0055:
                kotlin.reflect.jvm.internal.impl.types.UnwrappedType r1 = r12.unwrap()
                boolean r1 = r1 instanceof kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NotNullTypeParameter
                if (r1 != 0) goto L_0x0069
                kotlin.reflect.jvm.internal.impl.types.UnwrappedType r12 = r12.unwrap()
                boolean r12 = r12 instanceof kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType
                if (r12 == 0) goto L_0x0066
                goto L_0x0069
            L_0x0066:
                r12 = 0
                r6 = 0
                goto L_0x006b
            L_0x0069:
                r12 = 1
                r6 = 1
            L_0x006b:
                r7 = 0
                r8 = 8
                r9 = 0
                r3 = r10
                r4 = r5
                r5 = r0
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiers(kotlin.reflect.jvm.internal.impl.types.KotlinType):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00dc, code lost:
            if (r1.getQualifier() == kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL) goto L_0x00f0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ee, code lost:
            if (r12 != false) goto L_0x00f0;
         */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x00f6  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x011c  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x011e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers extractQualifiersFromAnnotations(kotlin.reflect.jvm.internal.impl.types.KotlinType r11, boolean r12, kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers r13, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r14, boolean r15) {
            /*
                r10 = this;
                r0 = 0
                if (r15 == 0) goto L_0x0016
                if (r14 != 0) goto L_0x0007
                r1 = r0
                goto L_0x000b
            L_0x0007:
                kotlin.reflect.jvm.internal.impl.types.Variance r1 = r14.getVariance()
            L_0x000b:
                kotlin.reflect.jvm.internal.impl.types.Variance r2 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
                if (r1 != r2) goto L_0x0016
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers$Companion r11 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers.Companion
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r11 = r11.getNONE()
                return r11
            L_0x0016:
                kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r1 = r10.containerContext
                kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents r1 = r1.getComponents()
                kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings r1 = r1.getSettings()
                boolean r1 = r1.getTypeEnhancementImprovementsInStrictMode()
                r2 = 0
                r3 = 1
                if (r12 == 0) goto L_0x0083
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated r4 = r10.typeContainer
                if (r4 == 0) goto L_0x0083
                boolean r5 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
                if (r5 != 0) goto L_0x0083
                if (r1 == 0) goto L_0x0083
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r4 = r4.getAnnotations()
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement r5 = r10.this$0
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.Collection r6 = (java.util.Collection) r6
                java.util.Iterator r4 = r4.iterator()
            L_0x0045:
                boolean r7 = r4.hasNext()
                if (r7 == 0) goto L_0x0072
                java.lang.Object r7 = r4.next()
                r8 = r7
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor r8 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor) r8
                kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver r9 = r5.annotationTypeQualifierResolver
                kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver$TypeQualifierWithApplicability r8 = r9.resolveAnnotation(r8)
                if (r8 != 0) goto L_0x005e
            L_0x005c:
                r8 = 1
                goto L_0x006c
            L_0x005e:
                java.util.List r8 = r8.component2()
                kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r9 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.TYPE_USE
                boolean r8 = r8.contains(r9)
                if (r8 != 0) goto L_0x006b
                goto L_0x005c
            L_0x006b:
                r8 = 0
            L_0x006c:
                if (r8 == 0) goto L_0x0045
                r6.add(r7)
                goto L_0x0045
            L_0x0072:
                java.util.List r6 = (java.util.List) r6
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations$Companion r4 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r4 = r4.create(r6)
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r5 = r11.getAnnotations()
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r4 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsKt.composeAnnotations(r4, r5)
                goto L_0x009a
            L_0x0083:
                if (r12 == 0) goto L_0x0096
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated r4 = r10.typeContainer
                if (r4 == 0) goto L_0x0096
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r4 = r4.getAnnotations()
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r5 = r11.getAnnotations()
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r4 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsKt.composeAnnotations(r4, r5)
                goto L_0x009a
            L_0x0096:
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r4 = r11.getAnnotations()
            L_0x009a:
                if (r12 == 0) goto L_0x00ac
                kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r12 = r10.containerContext
                kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType r12 = r12.getDefaultTypeQualifiers()
                if (r12 != 0) goto L_0x00a6
                r13 = r0
                goto L_0x00ac
            L_0x00a6:
                kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r13 = r10.containerApplicabilityType
                kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers r13 = r12.get(r13)
            L_0x00ac:
                kotlin.Pair r12 = r10.nullabilityInfoBoundsForTypeParameterUsage(r11)
                java.lang.Object r5 = r12.component1()
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus r5 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus) r5
                java.lang.Object r12 = r12.component2()
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                boolean r6 = r10.typeParameterBounds
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus r1 = r10.extractNullability(r4, r1, r6)
                if (r1 != 0) goto L_0x00ca
            L_0x00c8:
                r1 = r0
                goto L_0x00cc
            L_0x00ca:
                if (r15 != 0) goto L_0x00c8
            L_0x00cc:
                if (r1 != 0) goto L_0x00d3
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus r14 = r10.computeNullabilityInfoInTheAbsenceOfExplicitAnnotation(r5, r13, r14)
                goto L_0x00d4
            L_0x00d3:
                r14 = r1
            L_0x00d4:
                if (r1 == 0) goto L_0x00e1
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r12 = r1.getQualifier()
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r13 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
                if (r12 != r13) goto L_0x00df
                goto L_0x00f0
            L_0x00df:
                r12 = 0
                goto L_0x00f1
            L_0x00e1:
                if (r12 != 0) goto L_0x00f0
                if (r13 != 0) goto L_0x00e7
            L_0x00e5:
                r12 = 0
                goto L_0x00ee
            L_0x00e7:
                boolean r12 = r13.getDefinitelyNotNull()
                if (r12 != r3) goto L_0x00e5
                r12 = 1
            L_0x00ee:
                if (r12 == 0) goto L_0x00df
            L_0x00f0:
                r12 = 1
            L_0x00f1:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r13 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers
                if (r14 != 0) goto L_0x00f6
                goto L_0x00fa
            L_0x00f6:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r0 = r14.getQualifier()
            L_0x00fa:
                java.util.List r15 = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.getREAD_ONLY_ANNOTATIONS()
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r1 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.READ_ONLY
                java.lang.Object r15 = extractQualifiersFromAnnotations$ifPresent(r15, r4, r1)
                java.util.List r1 = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.getMUTABLE_ANNOTATIONS()
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r5 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.MUTABLE
                java.lang.Object r1 = extractQualifiersFromAnnotations$ifPresent(r1, r4, r5)
                java.lang.Object r15 = extractQualifiersFromAnnotations$uniqueNotNull(r15, r1)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r15 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier) r15
                if (r12 == 0) goto L_0x011e
                boolean r11 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.isTypeParameter(r11)
                if (r11 == 0) goto L_0x011e
                r11 = 1
                goto L_0x011f
            L_0x011e:
                r11 = 0
            L_0x011f:
                if (r14 != 0) goto L_0x0122
                goto L_0x0129
            L_0x0122:
                boolean r12 = r14.isForWarningOnly()
                if (r12 != r3) goto L_0x0129
                r2 = 1
            L_0x0129:
                r13.<init>(r0, r15, r11, r2)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiersFromAnnotations(kotlin.reflect.jvm.internal.impl.types.KotlinType, boolean, kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, boolean):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers");
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static final <T> T extractQualifiersFromAnnotations$ifPresent(java.util.List<kotlin.reflect.jvm.internal.impl.name.FqName> r3, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r4, T r5) {
            /*
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                boolean r0 = r3 instanceof java.util.Collection
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0013
                r0 = r3
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x0013
            L_0x0011:
                r1 = 0
                goto L_0x002e
            L_0x0013:
                java.util.Iterator r3 = r3.iterator()
            L_0x0017:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0011
                java.lang.Object r0 = r3.next()
                kotlin.reflect.jvm.internal.impl.name.FqName r0 = (kotlin.reflect.jvm.internal.impl.name.FqName) r0
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor r0 = r4.findAnnotation(r0)
                if (r0 == 0) goto L_0x002b
                r0 = 1
                goto L_0x002c
            L_0x002b:
                r0 = 0
            L_0x002c:
                if (r0 == 0) goto L_0x0017
            L_0x002e:
                if (r1 == 0) goto L_0x0031
                goto L_0x0032
            L_0x0031:
                r5 = 0
            L_0x0032:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiersFromAnnotations$ifPresent(java.util.List, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations, java.lang.Object):java.lang.Object");
        }

        private static final <T> T extractQualifiersFromAnnotations$uniqueNotNull(T t, T t2) {
            if (t == null || t2 == null || Intrinsics.areEqual((Object) t, (Object) t2)) {
                return t == null ? t2 : t;
            }
            return null;
        }

        private final NullabilityQualifierWithMigrationStatus computeNullabilityInfoInTheAbsenceOfExplicitAnnotation(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, JavaDefaultQualifiers javaDefaultQualifiers, TypeParameterDescriptor typeParameterDescriptor) {
            NullabilityQualifierWithMigrationStatus boundsNullability;
            NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus2 = null;
            if (nullabilityQualifierWithMigrationStatus == null) {
                nullabilityQualifierWithMigrationStatus = javaDefaultQualifiers == null ? null : javaDefaultQualifiers.getNullabilityQualifier();
            }
            if (!(typeParameterDescriptor == null || (boundsNullability = boundsNullability(typeParameterDescriptor)) == null)) {
                if (boundsNullability.getQualifier() == NullabilityQualifier.NULLABLE) {
                    boundsNullability = NullabilityQualifierWithMigrationStatus.copy$default(boundsNullability, NullabilityQualifier.FORCE_FLEXIBILITY, false, 2, (Object) null);
                }
                nullabilityQualifierWithMigrationStatus2 = boundsNullability;
            }
            return mostSpecific(nullabilityQualifierWithMigrationStatus2, nullabilityQualifierWithMigrationStatus);
        }

        private final NullabilityQualifierWithMigrationStatus mostSpecific(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus2) {
            if (nullabilityQualifierWithMigrationStatus == null) {
                return nullabilityQualifierWithMigrationStatus2;
            }
            if (nullabilityQualifierWithMigrationStatus2 == null) {
                return nullabilityQualifierWithMigrationStatus;
            }
            if (nullabilityQualifierWithMigrationStatus.isForWarningOnly() && !nullabilityQualifierWithMigrationStatus2.isForWarningOnly()) {
                return nullabilityQualifierWithMigrationStatus2;
            }
            if (nullabilityQualifierWithMigrationStatus.isForWarningOnly() || !nullabilityQualifierWithMigrationStatus2.isForWarningOnly()) {
                return (nullabilityQualifierWithMigrationStatus.getQualifier().compareTo(nullabilityQualifierWithMigrationStatus2.getQualifier()) >= 0 && nullabilityQualifierWithMigrationStatus.getQualifier().compareTo(nullabilityQualifierWithMigrationStatus2.getQualifier()) > 0) ? nullabilityQualifierWithMigrationStatus : nullabilityQualifierWithMigrationStatus2;
            }
            return nullabilityQualifierWithMigrationStatus;
        }

        private final Pair<NullabilityQualifierWithMigrationStatus, Boolean> nullabilityInfoBoundsForTypeParameterUsage(KotlinType kotlinType) {
            ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
            TypeParameterDescriptor typeParameterDescriptor = declarationDescriptor instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) declarationDescriptor : null;
            NullabilityQualifierWithMigrationStatus boundsNullability = typeParameterDescriptor == null ? null : boundsNullability(typeParameterDescriptor);
            boolean z = false;
            if (boundsNullability == null) {
                return new Pair<>(null, false);
            }
            NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, boundsNullability.isForWarningOnly());
            if (boundsNullability.getQualifier() == NullabilityQualifier.NOT_NULL) {
                z = true;
            }
            return new Pair<>(nullabilityQualifierWithMigrationStatus, Boolean.valueOf(z));
        }

        private final NullabilityQualifierWithMigrationStatus boundsNullability(TypeParameterDescriptor typeParameterDescriptor) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            if (typeParameterDescriptor instanceof LazyJavaTypeParameterDescriptor) {
                LazyJavaTypeParameterDescriptor lazyJavaTypeParameterDescriptor = (LazyJavaTypeParameterDescriptor) typeParameterDescriptor;
                List<KotlinType> upperBounds = lazyJavaTypeParameterDescriptor.getUpperBounds();
                Intrinsics.checkNotNullExpressionValue(upperBounds, "upperBounds");
                Iterable iterable = upperBounds;
                boolean z6 = false;
                boolean z7 = true;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!KotlinTypeKt.isError((KotlinType) it.next())) {
                                z = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z = true;
                if (!z) {
                    List<KotlinType> upperBounds2 = lazyJavaTypeParameterDescriptor.getUpperBounds();
                    Intrinsics.checkNotNullExpressionValue(upperBounds2, "upperBounds");
                    Iterable iterable2 = upperBounds2;
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (!SignatureEnhancementKt.isNullabilityFlexible((KotlinType) it2.next())) {
                                    z2 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    z2 = true;
                    if (z2) {
                        List<KotlinType> upperBounds3 = lazyJavaTypeParameterDescriptor.getUpperBounds();
                        Intrinsics.checkNotNullExpressionValue(upperBounds3, "upperBounds");
                        Iterable iterable3 = upperBounds3;
                        if (!(iterable3 instanceof Collection) || !((Collection) iterable3).isEmpty()) {
                            Iterator it3 = iterable3.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                KotlinType kotlinType = (KotlinType) it3.next();
                                if (!(kotlinType instanceof FlexibleTypeWithEnhancement) || KotlinTypeKt.isNullable(((FlexibleTypeWithEnhancement) kotlinType).getEnhancement())) {
                                    z5 = false;
                                    continue;
                                } else {
                                    z5 = true;
                                    continue;
                                }
                                if (z5) {
                                    z3 = true;
                                    break;
                                }
                            }
                        }
                        z3 = false;
                        if (z3) {
                            return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, true);
                        }
                        List<KotlinType> upperBounds4 = lazyJavaTypeParameterDescriptor.getUpperBounds();
                        Intrinsics.checkNotNullExpressionValue(upperBounds4, "upperBounds");
                        Iterable iterable4 = upperBounds4;
                        if (!(iterable4 instanceof Collection) || !((Collection) iterable4).isEmpty()) {
                            Iterator it4 = iterable4.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    break;
                                }
                                KotlinType kotlinType2 = (KotlinType) it4.next();
                                if (!(kotlinType2 instanceof FlexibleTypeWithEnhancement) || !KotlinTypeKt.isNullable(((FlexibleTypeWithEnhancement) kotlinType2).getEnhancement())) {
                                    z4 = false;
                                    continue;
                                } else {
                                    z4 = true;
                                    continue;
                                }
                                if (z4) {
                                    z6 = true;
                                    break;
                                }
                            }
                        }
                        if (z6) {
                            return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, true);
                        }
                        return null;
                    }
                    List<KotlinType> upperBounds5 = lazyJavaTypeParameterDescriptor.getUpperBounds();
                    Intrinsics.checkNotNullExpressionValue(upperBounds5, "upperBounds");
                    Iterable iterable5 = upperBounds5;
                    if (!(iterable5 instanceof Collection) || !((Collection) iterable5).isEmpty()) {
                        Iterator it5 = iterable5.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                break;
                            }
                            KotlinType kotlinType3 = (KotlinType) it5.next();
                            Intrinsics.checkNotNullExpressionValue(kotlinType3, "it");
                            if (!KotlinTypeKt.isNullable(kotlinType3)) {
                                break;
                            }
                        }
                    }
                    z7 = false;
                    return new NullabilityQualifierWithMigrationStatus(z7 ? NullabilityQualifier.NOT_NULL : NullabilityQualifier.NULLABLE, false, 2, (DefaultConstructorMarker) null);
                }
            }
            return null;
        }

        private final NullabilityQualifierWithMigrationStatus extractNullability(Annotations annotations, boolean z, boolean z2) {
            NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = null;
            SignatureEnhancement signatureEnhancement = this.this$0;
            Iterator it = annotations.iterator();
            while (it.hasNext()) {
                NullabilityQualifierWithMigrationStatus extractNullability = signatureEnhancement.extractNullability((AnnotationDescriptor) it.next(), z, z2);
                if (nullabilityQualifierWithMigrationStatus != null) {
                    if (extractNullability != null && !Intrinsics.areEqual((Object) extractNullability, (Object) nullabilityQualifierWithMigrationStatus)) {
                        if (!extractNullability.isForWarningOnly() || nullabilityQualifierWithMigrationStatus.isForWarningOnly()) {
                            if (extractNullability.isForWarningOnly() || !nullabilityQualifierWithMigrationStatus.isForWarningOnly()) {
                                return null;
                            }
                        }
                    }
                }
                nullabilityQualifierWithMigrationStatus = extractNullability;
            }
            return nullabilityQualifierWithMigrationStatus;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0071  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x007b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers> computeIndexedQualifiersForOverride(boolean r18) {
            /*
                r17 = this;
                r8 = r17
                java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> r0 = r8.fromOverridden
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = 10
                int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r2)
                r1.<init>(r2)
                java.util.Collection r1 = (java.util.Collection) r1
                java.util.Iterator r0 = r0.iterator()
            L_0x0017:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x002b
                java.lang.Object r2 = r0.next()
                kotlin.reflect.jvm.internal.impl.types.KotlinType r2 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r2
                java.util.List r2 = r8.toIndexed(r2)
                r1.add(r2)
                goto L_0x0017
            L_0x002b:
                r9 = r1
                java.util.List r9 = (java.util.List) r9
                kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r8.fromOverride
                java.util.List r10 = r8.toIndexed(r0)
                boolean r0 = r8.isCovariant
                r12 = 1
                if (r0 == 0) goto L_0x006c
                java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> r0 = r8.fromOverridden
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                boolean r1 = r0 instanceof java.util.Collection
                if (r1 == 0) goto L_0x004c
                r1 = r0
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L_0x004c
            L_0x004a:
                r0 = 0
                goto L_0x0068
            L_0x004c:
                java.util.Iterator r0 = r0.iterator()
            L_0x0050:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x004a
                java.lang.Object r1 = r0.next()
                kotlin.reflect.jvm.internal.impl.types.KotlinType r1 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r1
                kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker r2 = kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.DEFAULT
                kotlin.reflect.jvm.internal.impl.types.KotlinType r3 = r8.fromOverride
                boolean r1 = r2.equalTypes(r1, r3)
                r1 = r1 ^ r12
                if (r1 == 0) goto L_0x0050
                r0 = 1
            L_0x0068:
                if (r0 == 0) goto L_0x006c
                r13 = 1
                goto L_0x006d
            L_0x006c:
                r13 = 0
            L_0x006d:
                if (r13 == 0) goto L_0x0071
                r14 = 1
                goto L_0x0076
            L_0x0071:
                int r0 = r10.size()
                r14 = r0
            L_0x0076:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers[] r15 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers[r14]
                r7 = 0
            L_0x0079:
                if (r7 >= r14) goto L_0x00f0
                if (r7 != 0) goto L_0x007f
                r4 = 1
                goto L_0x0080
            L_0x007f:
                r4 = 0
            L_0x0080:
                if (r4 != 0) goto L_0x0087
                if (r13 != 0) goto L_0x0085
                goto L_0x0087
            L_0x0085:
                r0 = 0
                goto L_0x0088
            L_0x0087:
                r0 = 1
            L_0x0088:
                boolean r1 = kotlin._Assertions.ENABLED
                if (r1 == 0) goto L_0x0097
                if (r0 == 0) goto L_0x008f
                goto L_0x0097
            L_0x008f:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                java.lang.String r1 = "Only head type constructors should be computed"
                r0.<init>(r1)
                throw r0
            L_0x0097:
                java.lang.Object r0 = r10.get(r7)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeAndDefaultQualifiers r0 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeAndDefaultQualifiers) r0
                kotlin.reflect.jvm.internal.impl.types.KotlinType r1 = r0.component1()
                kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers r3 = r0.component2()
                kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r5 = r0.component3()
                boolean r6 = r0.component4()
                r0 = r9
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Collection r2 = (java.util.Collection) r2
                java.util.Iterator r0 = r0.iterator()
            L_0x00bb:
                boolean r16 = r0.hasNext()
                if (r16 == 0) goto L_0x00de
                java.lang.Object r16 = r0.next()
                r11 = r16
                java.util.List r11 = (java.util.List) r11
                java.lang.Object r11 = kotlin.collections.CollectionsKt.getOrNull(r11, r7)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeAndDefaultQualifiers r11 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeAndDefaultQualifiers) r11
                if (r11 != 0) goto L_0x00d3
                r11 = 0
                goto L_0x00d7
            L_0x00d3:
                kotlin.reflect.jvm.internal.impl.types.KotlinType r11 = r11.getType()
            L_0x00d7:
                if (r11 != 0) goto L_0x00da
                goto L_0x00bb
            L_0x00da:
                r2.add(r11)
                goto L_0x00bb
            L_0x00de:
                java.util.List r2 = (java.util.List) r2
                java.util.Collection r2 = (java.util.Collection) r2
                r0 = r17
                r11 = r7
                r7 = r18
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r0 = r0.computeQualifiersForOverride(r1, r2, r3, r4, r5, r6, r7)
                r15[r11] = r0
                int r7 = r11 + 1
                goto L_0x0079
            L_0x00f0:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$computeIndexedQualifiersForOverride$1 r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$computeIndexedQualifiersForOverride$1
                r0.<init>(r15)
                kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeIndexedQualifiersForOverride(boolean):kotlin.jvm.functions.Function1");
        }

        private final List<TypeAndDefaultQualifiers> toIndexed(KotlinType kotlinType) {
            ArrayList arrayList = new ArrayList(1);
            toIndexed$add(this, arrayList, kotlinType, this.containerContext, (TypeParameterDescriptor) null);
            return arrayList;
        }

        private static final void toIndexed$add(SignatureParts signatureParts, ArrayList<TypeAndDefaultQualifiers> arrayList, KotlinType kotlinType, LazyJavaResolverContext lazyJavaResolverContext, TypeParameterDescriptor typeParameterDescriptor) {
            JavaDefaultQualifiers javaDefaultQualifiers;
            AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType;
            LazyJavaResolverContext copyWithNewDefaultTypeQualifiers = ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, kotlinType.getAnnotations());
            JavaTypeQualifiersByElementType defaultTypeQualifiers = copyWithNewDefaultTypeQualifiers.getDefaultTypeQualifiers();
            if (defaultTypeQualifiers == null) {
                javaDefaultQualifiers = null;
            } else {
                if (signatureParts.typeParameterBounds) {
                    annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS;
                } else {
                    annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.TYPE_USE;
                }
                javaDefaultQualifiers = defaultTypeQualifiers.get(annotationQualifierApplicabilityType);
            }
            arrayList.add(new TypeAndDefaultQualifiers(kotlinType, javaDefaultQualifiers, typeParameterDescriptor, false));
            if (!signatureParts.isSuperTypesEnhancement || !(kotlinType instanceof RawType)) {
                List<TypeParameterDescriptor> parameters = kotlinType.getConstructor().getParameters();
                Intrinsics.checkNotNullExpressionValue(parameters, "type.constructor.parameters");
                for (Pair pair : CollectionsKt.zip(kotlinType.getArguments(), parameters)) {
                    TypeProjection typeProjection = (TypeProjection) pair.component1();
                    TypeParameterDescriptor typeParameterDescriptor2 = (TypeParameterDescriptor) pair.component2();
                    if (typeProjection.isStarProjection()) {
                        KotlinType type = typeProjection.getType();
                        Intrinsics.checkNotNullExpressionValue(type, "arg.type");
                        arrayList.add(new TypeAndDefaultQualifiers(type, javaDefaultQualifiers, typeParameterDescriptor2, true));
                    } else {
                        KotlinType type2 = typeProjection.getType();
                        Intrinsics.checkNotNullExpressionValue(type2, "arg.type");
                        toIndexed$add(signatureParts, arrayList, type2, copyWithNewDefaultTypeQualifiers, typeParameterDescriptor2);
                    }
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:73:0x015e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers computeQualifiersForOverride(kotlin.reflect.jvm.internal.impl.types.KotlinType r16, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> r17, kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers r18, boolean r19, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r20, boolean r21, boolean r22) {
            /*
                r15 = this;
                r6 = r15
                r0 = r17
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = 10
                int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r2)
                r1.<init>(r2)
                java.util.Collection r1 = (java.util.Collection) r1
                java.util.Iterator r2 = r0.iterator()
            L_0x0016:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x002a
                java.lang.Object r3 = r2.next()
                kotlin.reflect.jvm.internal.impl.types.KotlinType r3 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r3
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r3 = r15.extractQualifiers(r3)
                r1.add(r3)
                goto L_0x0016
            L_0x002a:
                java.util.List r1 = (java.util.List) r1
                r7 = r1
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Collection r1 = (java.util.Collection) r1
                java.util.Iterator r2 = r7.iterator()
            L_0x003a:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x0051
                java.lang.Object r3 = r2.next()
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r3 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers) r3
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r3 = r3.getMutability()
                if (r3 != 0) goto L_0x004d
                goto L_0x003a
            L_0x004d:
                r1.add(r3)
                goto L_0x003a
            L_0x0051:
                java.util.List r1 = (java.util.List) r1
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Set r8 = kotlin.collections.CollectionsKt.toSet(r1)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Collection r1 = (java.util.Collection) r1
                java.util.Iterator r2 = r7.iterator()
            L_0x0064:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x007b
                java.lang.Object r3 = r2.next()
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r3 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers) r3
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r3 = r3.getNullability()
                if (r3 != 0) goto L_0x0077
                goto L_0x0064
            L_0x0077:
                r1.add(r3)
                goto L_0x0064
            L_0x007b:
                java.util.List r1 = (java.util.List) r1
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Set r9 = kotlin.collections.CollectionsKt.toSet(r1)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Collection r1 = (java.util.Collection) r1
                java.util.Iterator r0 = r0.iterator()
            L_0x008e:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x00ad
                java.lang.Object r2 = r0.next()
                kotlin.reflect.jvm.internal.impl.types.KotlinType r2 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r2
                kotlin.reflect.jvm.internal.impl.types.KotlinType r2 = kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.unwrapEnhancement(r2)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r2 = r15.extractQualifiers(r2)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r2 = r2.getNullability()
                if (r2 != 0) goto L_0x00a9
                goto L_0x008e
            L_0x00a9:
                r1.add(r2)
                goto L_0x008e
            L_0x00ad:
                java.util.List r1 = (java.util.List) r1
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Set r10 = kotlin.collections.CollectionsKt.toSet(r1)
                r0 = r15
                r1 = r16
                r2 = r19
                r3 = r18
                r4 = r20
                r5 = r21
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r0 = r0.extractQualifiersFromAnnotations(r1, r2, r3, r4, r5)
                boolean r1 = r0.isNullabilityQualifierForWarning()
                r2 = 1
                r1 = r1 ^ r2
                r3 = 0
                if (r1 == 0) goto L_0x00cf
                r1 = r0
                goto L_0x00d0
            L_0x00cf:
                r1 = r3
            L_0x00d0:
                if (r1 != 0) goto L_0x00d4
                r1 = r3
                goto L_0x00d8
            L_0x00d4:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r1 = r1.getNullability()
            L_0x00d8:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r4 = r0.getNullability()
                boolean r5 = r6.isCovariant
                r11 = 0
                if (r5 == 0) goto L_0x00e5
                if (r19 == 0) goto L_0x00e5
                r5 = 1
                goto L_0x00e6
            L_0x00e5:
                r5 = 0
            L_0x00e6:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r12 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementUtilsKt.select(r9, r1, r5)
                if (r12 != 0) goto L_0x00ed
                goto L_0x0102
            L_0x00ed:
                if (r22 != 0) goto L_0x00fe
                boolean r13 = r15.isForVarargParameter()
                if (r13 == 0) goto L_0x00fc
                if (r19 == 0) goto L_0x00fc
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r13 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
                if (r12 != r13) goto L_0x00fc
                goto L_0x00fe
            L_0x00fc:
                r13 = 0
                goto L_0x00ff
            L_0x00fe:
                r13 = 1
            L_0x00ff:
                if (r13 != 0) goto L_0x0102
                r3 = r12
            L_0x0102:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r12 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.MUTABLE
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r13 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.READ_ONLY
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r14 = r0.getMutability()
                java.lang.Object r8 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementUtilsKt.select(r8, r12, r13, r14, r5)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r8 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier) r8
                if (r4 != r1) goto L_0x011b
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r9)
                if (r1 != 0) goto L_0x0119
                goto L_0x011b
            L_0x0119:
                r1 = 0
                goto L_0x011c
            L_0x011b:
                r1 = 1
            L_0x011c:
                boolean r0 = r0.getDefinitelyNotNull()
                if (r0 != 0) goto L_0x014d
                boolean r0 = r7 instanceof java.util.Collection
                if (r0 == 0) goto L_0x0131
                r0 = r7
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x0131
            L_0x012f:
                r0 = 0
                goto L_0x0148
            L_0x0131:
                java.util.Iterator r0 = r7.iterator()
            L_0x0135:
                boolean r7 = r0.hasNext()
                if (r7 == 0) goto L_0x012f
                java.lang.Object r7 = r0.next()
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r7 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers) r7
                boolean r7 = r7.getDefinitelyNotNull()
                if (r7 == 0) goto L_0x0135
                r0 = 1
            L_0x0148:
                if (r0 == 0) goto L_0x014b
                goto L_0x014d
            L_0x014b:
                r0 = 0
                goto L_0x014e
            L_0x014d:
                r0 = 1
            L_0x014e:
                if (r3 != 0) goto L_0x015b
                if (r1 == 0) goto L_0x015b
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r1 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementUtilsKt.select(r10, r4, r5)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementUtilsKt.createJavaTypeQualifiers(r1, r8, r2, r0)
                return r0
            L_0x015b:
                if (r3 != 0) goto L_0x015e
                goto L_0x015f
            L_0x015e:
                r2 = 0
            L_0x015f:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementUtilsKt.createJavaTypeQualifiers(r3, r8, r2, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride(kotlin.reflect.jvm.internal.impl.types.KotlinType, java.util.Collection, kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers, boolean, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, boolean, boolean):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers");
        }
    }

    /* compiled from: signatureEnhancement.kt */
    private static class PartEnhancementResult {
        private final boolean containsFunctionN;
        private final KotlinType type;
        private final boolean wereChanges;

        public PartEnhancementResult(KotlinType kotlinType, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(kotlinType, "type");
            this.type = kotlinType;
            this.wereChanges = z;
            this.containsFunctionN = z2;
        }

        public final KotlinType getType() {
            return this.type;
        }

        public final boolean getWereChanges() {
            return this.wereChanges;
        }

        public final boolean getContainsFunctionN() {
            return this.containsFunctionN;
        }
    }

    private final SignatureParts partsForValueParameter(CallableMemberDescriptor callableMemberDescriptor, ValueParameterDescriptor valueParameterDescriptor, LazyJavaResolverContext lazyJavaResolverContext, Function1<? super CallableMemberDescriptor, ? extends KotlinType> function1) {
        Annotated annotated = valueParameterDescriptor;
        if (valueParameterDescriptor != null) {
            lazyJavaResolverContext = ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, valueParameterDescriptor.getAnnotations());
        }
        return parts(callableMemberDescriptor, annotated, false, lazyJavaResolverContext, AnnotationQualifierApplicabilityType.VALUE_PARAMETER, function1);
    }

    private final SignatureParts parts(CallableMemberDescriptor callableMemberDescriptor, Annotated annotated, boolean z, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, Function1<? super CallableMemberDescriptor, ? extends KotlinType> function1) {
        CallableMemberDescriptor callableMemberDescriptor2 = callableMemberDescriptor;
        Function1<? super CallableMemberDescriptor, ? extends KotlinType> function12 = function1;
        KotlinType kotlinType = (KotlinType) function12.invoke(callableMemberDescriptor2);
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "this.overriddenDescriptors");
        Iterable<CallableMemberDescriptor> iterable = overriddenDescriptors;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (CallableMemberDescriptor callableMemberDescriptor3 : iterable) {
            Intrinsics.checkNotNullExpressionValue(callableMemberDescriptor3, "it");
            arrayList.add((KotlinType) function12.invoke(callableMemberDescriptor3));
        }
        return new SignatureParts(this, annotated, kotlinType, (List) arrayList, z, ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, ((KotlinType) function12.invoke(callableMemberDescriptor2)).getAnnotations()), annotationQualifierApplicabilityType, false, false, 192, (DefaultConstructorMarker) null);
    }
}
