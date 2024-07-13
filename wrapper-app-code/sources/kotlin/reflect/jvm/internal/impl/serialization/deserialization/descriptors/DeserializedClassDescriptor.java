package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DeserializedDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.CliSealedClassInheritorsProvider;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlagsUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* compiled from: DeserializedClassDescriptor.kt */
public final class DeserializedClassDescriptor extends AbstractClassDescriptor implements DeserializedDescriptor {
    private final Annotations annotations;

    /* renamed from: c  reason: collision with root package name */
    private final DeserializationContext f9684c;
    /* access modifiers changed from: private */
    public final ClassId classId;
    private final ProtoBuf.Class classProto;
    private final NullableLazyValue<ClassDescriptor> companionObjectDescriptor;
    private final NotNullLazyValue<Collection<ClassConstructorDescriptor>> constructors;
    private final DeclarationDescriptor containingDeclaration;
    /* access modifiers changed from: private */
    public final EnumEntryClassDescriptors enumEntries;
    private final NullableLazyValue<InlineClassRepresentation<SimpleType>> inlineClassRepresentation;
    private final ClassKind kind = ProtoEnumFlags.INSTANCE.classKind(Flags.CLASS_KIND.get(this.classProto.getFlags()));
    private final ScopesHolderForClass<DeserializedClassMemberScope> memberScopeHolder;
    private final BinaryVersion metadataVersion;
    private final Modality modality = ProtoEnumFlags.INSTANCE.modality(Flags.MODALITY.get(this.classProto.getFlags()));
    private final NullableLazyValue<ClassConstructorDescriptor> primaryConstructor;
    private final NotNullLazyValue<Collection<ClassDescriptor>> sealedSubclasses;
    private final SourceElement sourceElement;
    private final MemberScopeImpl staticScope;
    private final ProtoContainer.Class thisAsProtoContainer;
    /* access modifiers changed from: private */
    public final DeserializedClassTypeConstructor typeConstructor;
    private final DescriptorVisibility visibility = ProtoEnumFlagsUtilsKt.descriptorVisibility(ProtoEnumFlags.INSTANCE, Flags.VISIBILITY.get(this.classProto.getFlags()));

    public boolean isActual() {
        return false;
    }

    public final ProtoBuf.Class getClassProto() {
        return this.classProto;
    }

    public final BinaryVersion getMetadataVersion() {
        return this.metadataVersion;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor(DeserializationContext deserializationContext, ProtoBuf.Class classR, NameResolver nameResolver, BinaryVersion binaryVersion, SourceElement sourceElement2) {
        super(deserializationContext.getStorageManager(), NameResolverUtilKt.getClassId(nameResolver, classR.getFqName()).getShortClassName());
        Annotations annotations2;
        Intrinsics.checkNotNullParameter(deserializationContext, "outerContext");
        Intrinsics.checkNotNullParameter(classR, "classProto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(binaryVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(sourceElement2, "sourceElement");
        this.classProto = classR;
        this.metadataVersion = binaryVersion;
        this.sourceElement = sourceElement2;
        this.classId = NameResolverUtilKt.getClassId(nameResolver, classR.getFqName());
        List<ProtoBuf.TypeParameter> typeParameterList = this.classProto.getTypeParameterList();
        Intrinsics.checkNotNullExpressionValue(typeParameterList, "classProto.typeParameterList");
        ProtoBuf.TypeTable typeTable = this.classProto.getTypeTable();
        Intrinsics.checkNotNullExpressionValue(typeTable, "classProto.typeTable");
        TypeTable typeTable2 = new TypeTable(typeTable);
        VersionRequirementTable.Companion companion = VersionRequirementTable.Companion;
        ProtoBuf.VersionRequirementTable versionRequirementTable = this.classProto.getVersionRequirementTable();
        Intrinsics.checkNotNullExpressionValue(versionRequirementTable, "classProto.versionRequirementTable");
        this.f9684c = deserializationContext.childContext(this, typeParameterList, nameResolver, typeTable2, companion.create(versionRequirementTable), this.metadataVersion);
        this.staticScope = this.kind == ClassKind.ENUM_CLASS ? new StaticScopeForKotlinEnum(this.f9684c.getStorageManager(), this) : MemberScope.Empty.INSTANCE;
        this.typeConstructor = new DeserializedClassTypeConstructor(this);
        this.memberScopeHolder = ScopesHolderForClass.Companion.create(this, this.f9684c.getStorageManager(), this.f9684c.getComponents().getKotlinTypeChecker().getKotlinTypeRefiner(), new DeserializedClassDescriptor$memberScopeHolder$1(this));
        ProtoContainer.Class classR2 = null;
        this.enumEntries = this.kind == ClassKind.ENUM_CLASS ? new EnumEntryClassDescriptors(this) : null;
        this.containingDeclaration = deserializationContext.getContainingDeclaration();
        this.primaryConstructor = this.f9684c.getStorageManager().createNullableLazyValue(new DeserializedClassDescriptor$primaryConstructor$1(this));
        this.constructors = this.f9684c.getStorageManager().createLazyValue(new DeserializedClassDescriptor$constructors$1(this));
        this.companionObjectDescriptor = this.f9684c.getStorageManager().createNullableLazyValue(new DeserializedClassDescriptor$companionObjectDescriptor$1(this));
        this.sealedSubclasses = this.f9684c.getStorageManager().createLazyValue(new DeserializedClassDescriptor$sealedSubclasses$1(this));
        this.inlineClassRepresentation = this.f9684c.getStorageManager().createNullableLazyValue(new DeserializedClassDescriptor$inlineClassRepresentation$1(this));
        ProtoBuf.Class classR3 = this.classProto;
        NameResolver nameResolver2 = this.f9684c.getNameResolver();
        TypeTable typeTable3 = this.f9684c.getTypeTable();
        SourceElement sourceElement3 = this.sourceElement;
        DeclarationDescriptor declarationDescriptor = this.containingDeclaration;
        DeserializedClassDescriptor deserializedClassDescriptor = declarationDescriptor instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) declarationDescriptor : null;
        this.thisAsProtoContainer = new ProtoContainer.Class(classR3, nameResolver2, typeTable3, sourceElement3, deserializedClassDescriptor != null ? deserializedClassDescriptor.thisAsProtoContainer : classR2);
        if (!Flags.HAS_ANNOTATIONS.get(this.classProto.getFlags()).booleanValue()) {
            annotations2 = Annotations.Companion.getEMPTY();
        } else {
            annotations2 = new NonEmptyDeserializedAnnotations(this.f9684c.getStorageManager(), new DeserializedClassDescriptor$annotations$1(this));
        }
        this.annotations = annotations2;
    }

    public final DeserializationContext getC() {
        return this.f9684c;
    }

    private final DeserializedClassMemberScope getMemberScope() {
        return this.memberScopeHolder.getScope(this.f9684c.getComponents().getKotlinTypeChecker().getKotlinTypeRefiner());
    }

    public final ProtoContainer.Class getThisAsProtoContainer$deserialization() {
        return this.thisAsProtoContainer;
    }

    public Annotations getAnnotations() {
        return this.annotations;
    }

    public DeclarationDescriptor getContainingDeclaration() {
        return this.containingDeclaration;
    }

    public TypeConstructor getTypeConstructor() {
        return this.typeConstructor;
    }

    public ClassKind getKind() {
        return this.kind;
    }

    public Modality getModality() {
        return this.modality;
    }

    public DescriptorVisibility getVisibility() {
        return this.visibility;
    }

    public boolean isInner() {
        Boolean bool = Flags.IS_INNER.get(this.classProto.getFlags());
        Intrinsics.checkNotNullExpressionValue(bool, "IS_INNER.get(classProto.flags)");
        return bool.booleanValue();
    }

    public boolean isData() {
        Boolean bool = Flags.IS_DATA.get(this.classProto.getFlags());
        Intrinsics.checkNotNullExpressionValue(bool, "IS_DATA.get(classProto.flags)");
        return bool.booleanValue();
    }

    public boolean isInline() {
        Boolean bool = Flags.IS_INLINE_CLASS.get(this.classProto.getFlags());
        Intrinsics.checkNotNullExpressionValue(bool, "IS_INLINE_CLASS.get(classProto.flags)");
        return bool.booleanValue() && this.metadataVersion.isAtMost(1, 4, 1);
    }

    public boolean isExpect() {
        Boolean bool = Flags.IS_EXPECT_CLASS.get(this.classProto.getFlags());
        Intrinsics.checkNotNullExpressionValue(bool, "IS_EXPECT_CLASS.get(classProto.flags)");
        return bool.booleanValue();
    }

    public boolean isExternal() {
        Boolean bool = Flags.IS_EXTERNAL_CLASS.get(this.classProto.getFlags());
        Intrinsics.checkNotNullExpressionValue(bool, "IS_EXTERNAL_CLASS.get(classProto.flags)");
        return bool.booleanValue();
    }

    public boolean isFun() {
        Boolean bool = Flags.IS_FUN_INTERFACE.get(this.classProto.getFlags());
        Intrinsics.checkNotNullExpressionValue(bool, "IS_FUN_INTERFACE.get(classProto.flags)");
        return bool.booleanValue();
    }

    public boolean isValue() {
        Boolean bool = Flags.IS_INLINE_CLASS.get(this.classProto.getFlags());
        Intrinsics.checkNotNullExpressionValue(bool, "IS_INLINE_CLASS.get(classProto.flags)");
        return bool.booleanValue() && this.metadataVersion.isAtLeast(1, 4, 2);
    }

    /* access modifiers changed from: protected */
    public MemberScope getUnsubstitutedMemberScope(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.memberScopeHolder.getScope(kotlinTypeRefiner);
    }

    public MemberScopeImpl getStaticScope() {
        return this.staticScope;
    }

    public boolean isCompanionObject() {
        return Flags.CLASS_KIND.get(this.classProto.getFlags()) == ProtoBuf.Class.Kind.COMPANION_OBJECT;
    }

    /* access modifiers changed from: private */
    public final ClassConstructorDescriptor computePrimaryConstructor() {
        Object obj;
        if (this.kind.isSingleton()) {
            ClassConstructorDescriptorImpl createPrimaryConstructorForObject = DescriptorFactory.createPrimaryConstructorForObject(this, SourceElement.NO_SOURCE);
            createPrimaryConstructorForObject.setReturnType(getDefaultType());
            return createPrimaryConstructorForObject;
        }
        List<ProtoBuf.Constructor> constructorList = this.classProto.getConstructorList();
        Intrinsics.checkNotNullExpressionValue(constructorList, "classProto.constructorList");
        Iterator it = constructorList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!Flags.IS_SECONDARY.get(((ProtoBuf.Constructor) obj).getFlags()).booleanValue()) {
                break;
            }
        }
        ProtoBuf.Constructor constructor = (ProtoBuf.Constructor) obj;
        if (constructor == null) {
            return null;
        }
        return getC().getMemberDeserializer().loadConstructor(constructor, true);
    }

    public ClassConstructorDescriptor getUnsubstitutedPrimaryConstructor() {
        return (ClassConstructorDescriptor) this.primaryConstructor.invoke();
    }

    /* access modifiers changed from: private */
    public final Collection<ClassConstructorDescriptor> computeConstructors() {
        return CollectionsKt.plus(CollectionsKt.plus(computeSecondaryConstructors(), CollectionsKt.listOfNotNull(getUnsubstitutedPrimaryConstructor())), this.f9684c.getComponents().getAdditionalClassPartsProvider().getConstructors(this));
    }

    private final List<ClassConstructorDescriptor> computeSecondaryConstructors() {
        List<ProtoBuf.Constructor> constructorList = this.classProto.getConstructorList();
        Intrinsics.checkNotNullExpressionValue(constructorList, "classProto.constructorList");
        Collection arrayList = new ArrayList();
        for (Object next : constructorList) {
            Boolean bool = Flags.IS_SECONDARY.get(((ProtoBuf.Constructor) next).getFlags());
            Intrinsics.checkNotNullExpressionValue(bool, "IS_SECONDARY.get(it.flags)");
            if (bool.booleanValue()) {
                arrayList.add(next);
            }
        }
        Iterable<ProtoBuf.Constructor> iterable = (List) arrayList;
        Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (ProtoBuf.Constructor constructor : iterable) {
            MemberDeserializer memberDeserializer = getC().getMemberDeserializer();
            Intrinsics.checkNotNullExpressionValue(constructor, "it");
            arrayList2.add(memberDeserializer.loadConstructor(constructor, false));
        }
        return (List) arrayList2;
    }

    public Collection<ClassConstructorDescriptor> getConstructors() {
        return (Collection) this.constructors.invoke();
    }

    /* access modifiers changed from: private */
    public final ClassDescriptor computeCompanionObjectDescriptor() {
        if (!this.classProto.hasCompanionObjectName()) {
            return null;
        }
        ClassifierDescriptor contributedClassifier = getMemberScope().getContributedClassifier(NameResolverUtilKt.getName(this.f9684c.getNameResolver(), this.classProto.getCompanionObjectName()), NoLookupLocation.FROM_DESERIALIZATION);
        if (contributedClassifier instanceof ClassDescriptor) {
            return (ClassDescriptor) contributedClassifier;
        }
        return null;
    }

    public ClassDescriptor getCompanionObjectDescriptor() {
        return (ClassDescriptor) this.companionObjectDescriptor.invoke();
    }

    public final boolean hasNestedClass$deserialization(Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return getMemberScope().getClassNames$deserialization().contains(name);
    }

    /* access modifiers changed from: private */
    public final Collection<ClassDescriptor> computeSubclassesForSealedClass() {
        if (this.modality != Modality.SEALED) {
            return CollectionsKt.emptyList();
        }
        List<Integer> sealedSubclassFqNameList = this.classProto.getSealedSubclassFqNameList();
        Intrinsics.checkNotNullExpressionValue(sealedSubclassFqNameList, "fqNames");
        if (!(!sealedSubclassFqNameList.isEmpty())) {
            return CliSealedClassInheritorsProvider.INSTANCE.computeSealedSubclasses(this, false);
        }
        Collection arrayList = new ArrayList();
        for (Integer num : sealedSubclassFqNameList) {
            DeserializationComponents components = getC().getComponents();
            NameResolver nameResolver = getC().getNameResolver();
            Intrinsics.checkNotNullExpressionValue(num, "index");
            ClassDescriptor deserializeClass = components.deserializeClass(NameResolverUtilKt.getClassId(nameResolver, num.intValue()));
            if (deserializeClass != null) {
                arrayList.add(deserializeClass);
            }
        }
        return (List) arrayList;
    }

    public Collection<ClassDescriptor> getSealedSubclasses() {
        return (Collection) this.sealedSubclasses.invoke();
    }

    public InlineClassRepresentation<SimpleType> getInlineClassRepresentation() {
        return (InlineClassRepresentation) this.inlineClassRepresentation.invoke();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation<kotlin.reflect.jvm.internal.impl.types.SimpleType> computeInlineClassRepresentation() {
        /*
            r10 = this;
            r0 = r10
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor) r0
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isInlineClass(r0)
            r1 = 0
            if (r0 != 0) goto L_0x000b
            return r1
        L_0x000b:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r10.classProto
            boolean r0 = r0.hasInlineClassUnderlyingPropertyName()
            r2 = 1
            if (r0 == 0) goto L_0x0025
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r0 = r10.f9684c
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r0 = r0.getNameResolver()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r3 = r10.classProto
            int r3 = r3.getInlineClassUnderlyingPropertyName()
            kotlin.reflect.jvm.internal.impl.name.Name r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(r0, r3)
            goto L_0x004c
        L_0x0025:
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion r0 = r10.metadataVersion
            r3 = 5
            boolean r0 = r0.isAtLeast(r2, r3, r2)
            if (r0 != 0) goto L_0x00d2
            kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor r0 = r10.getUnsubstitutedPrimaryConstructor()
            if (r0 == 0) goto L_0x00c2
            java.util.List r0 = r0.getValueParameters()
            java.lang.String r3 = "constructor.valueParameters"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            java.lang.Object r0 = kotlin.collections.CollectionsKt.first(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) r0
            kotlin.reflect.jvm.internal.impl.name.Name r0 = r0.getName()
            java.lang.String r3 = "{\n                // Bef…irst().name\n            }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
        L_0x004c:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r3 = r10.classProto
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r4 = r10.f9684c
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable r4 = r4.getTypeTable()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.inlineClassUnderlyingType(r3, r4)
            r4 = 0
            if (r3 != 0) goto L_0x00af
            r3 = r10
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor r3 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor) r3
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope r5 = r3.getMemberScope()
            kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r6 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_DESERIALIZATION
            kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation r6 = (kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation) r6
            java.util.Collection r5 = r5.getContributedVariables(r0, r6)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
            r7 = r1
            r6 = 0
        L_0x0072:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x0090
            java.lang.Object r8 = r5.next()
            r9 = r8
            kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor r9 = (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) r9
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor r9 = r9.getExtensionReceiverParameter()
            if (r9 != 0) goto L_0x0087
            r9 = 1
            goto L_0x0088
        L_0x0087:
            r9 = 0
        L_0x0088:
            if (r9 == 0) goto L_0x0072
            if (r6 == 0) goto L_0x008d
            goto L_0x0094
        L_0x008d:
            r7 = r8
            r6 = 1
            goto L_0x0072
        L_0x0090:
            if (r6 != 0) goto L_0x0093
            goto L_0x0094
        L_0x0093:
            r1 = r7
        L_0x0094:
            kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) r1
            if (r1 == 0) goto L_0x009f
            kotlin.reflect.jvm.internal.impl.types.KotlinType r1 = r1.getType()
            kotlin.reflect.jvm.internal.impl.types.SimpleType r1 = (kotlin.reflect.jvm.internal.impl.types.SimpleType) r1
            goto L_0x00ba
        L_0x009f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Inline class has no underlying property: "
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00af:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r2 = r10.f9684c
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer r2 = r2.getTypeDeserializer()
            r5 = 2
            kotlin.reflect.jvm.internal.impl.types.SimpleType r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer.simpleType$default(r2, r3, r4, r5, r1)
        L_0x00ba:
            kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation r2 = new kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r1 = (kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r1
            r2.<init>(r0, r1)
            return r2
        L_0x00c2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Inline class has no primary constructor: "
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r10)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00d2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Inline class has no underlying property name in metadata: "
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r10)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.computeInlineClassRepresentation():kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("deserialized ");
        sb.append(isExpect() ? "expect " : "");
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    public SourceElement getSource() {
        return this.sourceElement;
    }

    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        return this.f9684c.getTypeDeserializer().getOwnTypeParameters();
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    private final class DeserializedClassTypeConstructor extends AbstractClassTypeConstructor {
        private final NotNullLazyValue<List<TypeParameterDescriptor>> parameters = this.this$0.getC().getStorageManager().createLazyValue(new DeserializedClassDescriptor$DeserializedClassTypeConstructor$parameters$1(this.this$0));
        final /* synthetic */ DeserializedClassDescriptor this$0;

        public boolean isDenotable() {
            return true;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DeserializedClassTypeConstructor(DeserializedClassDescriptor deserializedClassDescriptor) {
            super(deserializedClassDescriptor.getC().getStorageManager());
            Intrinsics.checkNotNullParameter(deserializedClassDescriptor, "this$0");
            this.this$0 = deserializedClassDescriptor;
        }

        /* access modifiers changed from: protected */
        public Collection<KotlinType> computeSupertypes() {
            Iterable<ProtoBuf.Type> supertypes = ProtoTypeTableUtilKt.supertypes(this.this$0.getClassProto(), this.this$0.getC().getTypeTable());
            DeserializedClassDescriptor deserializedClassDescriptor = this.this$0;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(supertypes, 10));
            for (ProtoBuf.Type type : supertypes) {
                arrayList.add(deserializedClassDescriptor.getC().getTypeDeserializer().type(type));
            }
            Iterable<KotlinType> plus = CollectionsKt.plus((List) arrayList, this.this$0.getC().getComponents().getAdditionalClassPartsProvider().getSupertypes(this.this$0));
            Collection arrayList2 = new ArrayList();
            for (KotlinType constructor : plus) {
                ClassifierDescriptor declarationDescriptor = constructor.getConstructor().getDeclarationDescriptor();
                NotFoundClasses.MockClassDescriptor mockClassDescriptor = declarationDescriptor instanceof NotFoundClasses.MockClassDescriptor ? (NotFoundClasses.MockClassDescriptor) declarationDescriptor : null;
                if (mockClassDescriptor != null) {
                    arrayList2.add(mockClassDescriptor);
                }
            }
            List list = (List) arrayList2;
            if (!list.isEmpty()) {
                ErrorReporter errorReporter = this.this$0.getC().getComponents().getErrorReporter();
                ClassDescriptor classDescriptor = this.this$0;
                Iterable<NotFoundClasses.MockClassDescriptor> iterable = list;
                Collection arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (NotFoundClasses.MockClassDescriptor mockClassDescriptor2 : iterable) {
                    ClassId classId = DescriptorUtilsKt.getClassId(mockClassDescriptor2);
                    arrayList3.add(classId == null ? mockClassDescriptor2.getName().asString() : classId.asSingleFqName().asString());
                }
                errorReporter.reportIncompleteHierarchy(classDescriptor, (List) arrayList3);
            }
            return CollectionsKt.toList(plus);
        }

        public List<TypeParameterDescriptor> getParameters() {
            return (List) this.parameters.invoke();
        }

        public DeserializedClassDescriptor getDeclarationDescriptor() {
            return this.this$0;
        }

        public String toString() {
            String name = this.this$0.getName().toString();
            Intrinsics.checkNotNullExpressionValue(name, "name.toString()");
            return name;
        }

        /* access modifiers changed from: protected */
        public SupertypeLoopChecker getSupertypeLoopChecker() {
            return SupertypeLoopChecker.EMPTY.INSTANCE;
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    private final class DeserializedClassMemberScope extends DeserializedMemberScope {
        private final NotNullLazyValue<Collection<DeclarationDescriptor>> allDescriptors;
        /* access modifiers changed from: private */
        public final KotlinTypeRefiner kotlinTypeRefiner;
        private final NotNullLazyValue<Collection<KotlinType>> refinedSupertypes;
        final /* synthetic */ DeserializedClassDescriptor this$0;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public DeserializedClassMemberScope(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor r8, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner r9) {
            /*
                r7 = this;
                java.lang.String r0 = "this$0"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                java.lang.String r0 = "kotlinTypeRefiner"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                r7.this$0 = r8
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r2 = r8.getC()
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r8.getClassProto()
                java.util.List r3 = r0.getFunctionList()
                java.lang.String r0 = "classProto.functionList"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r8.getClassProto()
                java.util.List r4 = r0.getPropertyList()
                java.lang.String r0 = "classProto.propertyList"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r8.getClassProto()
                java.util.List r5 = r0.getTypeAliasList()
                java.lang.String r0 = "classProto.typeAliasList"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r8.getClassProto()
                java.util.List r0 = r0.getNestedClassNameList()
                java.lang.String r1 = "classProto.nestedClassNameList"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r8 = r8.getC()
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r8 = r8.getNameResolver()
                java.util.ArrayList r1 = new java.util.ArrayList
                r6 = 10
                int r6 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r6)
                r1.<init>(r6)
                java.util.Collection r1 = (java.util.Collection) r1
                java.util.Iterator r0 = r0.iterator()
            L_0x005f:
                boolean r6 = r0.hasNext()
                if (r6 == 0) goto L_0x0077
                java.lang.Object r6 = r0.next()
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                kotlin.reflect.jvm.internal.impl.name.Name r6 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(r8, r6)
                r1.add(r6)
                goto L_0x005f
            L_0x0077:
                java.util.List r1 = (java.util.List) r1
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$2$1 r8 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$2$1
                r8.<init>(r1)
                r6 = r8
                kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
                r1 = r7
                r1.<init>(r2, r3, r4, r5, r6)
                r7.kotlinTypeRefiner = r9
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r8 = r7.getC()
                kotlin.reflect.jvm.internal.impl.storage.StorageManager r8 = r8.getStorageManager()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$allDescriptors$1 r9 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$allDescriptors$1
                r9.<init>(r7)
                kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
                kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue r8 = r8.createLazyValue(r9)
                r7.allDescriptors = r8
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r8 = r7.getC()
                kotlin.reflect.jvm.internal.impl.storage.StorageManager r8 = r8.getStorageManager()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$refinedSupertypes$1 r9 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$refinedSupertypes$1
                r9.<init>(r7)
                kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
                kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue r8 = r8.createLazyValue(r9)
                r7.refinedSupertypes = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.DeserializedClassMemberScope.<init>(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner):void");
        }

        /* access modifiers changed from: private */
        public final DeserializedClassDescriptor getClassDescriptor() {
            return this.this$0;
        }

        public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
            Intrinsics.checkNotNullParameter(descriptorKindFilter, "kindFilter");
            Intrinsics.checkNotNullParameter(function1, "nameFilter");
            return (Collection) this.allDescriptors.invoke();
        }

        public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(lookupLocation, "location");
            recordLookup(name, lookupLocation);
            return super.getContributedFunctions(name, lookupLocation);
        }

        public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation lookupLocation) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(lookupLocation, "location");
            recordLookup(name, lookupLocation);
            return super.getContributedVariables(name, lookupLocation);
        }

        /* access modifiers changed from: protected */
        public boolean isDeclaredFunctionAvailable(SimpleFunctionDescriptor simpleFunctionDescriptor) {
            Intrinsics.checkNotNullParameter(simpleFunctionDescriptor, "function");
            return getC().getComponents().getPlatformDependentDeclarationFilter().isFunctionAvailable(this.this$0, simpleFunctionDescriptor);
        }

        /* access modifiers changed from: protected */
        public void computeNonDeclaredFunctions(Name name, List<SimpleFunctionDescriptor> list) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(list, "functions");
            ArrayList arrayList = new ArrayList();
            for (KotlinType memberScope : (Collection) this.refinedSupertypes.invoke()) {
                arrayList.addAll(memberScope.getMemberScope().getContributedFunctions(name, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            list.addAll(getC().getComponents().getAdditionalClassPartsProvider().getFunctions(name, this.this$0));
            generateFakeOverrides(name, arrayList, list);
        }

        /* access modifiers changed from: protected */
        public void computeNonDeclaredProperties(Name name, List<PropertyDescriptor> list) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(list, "descriptors");
            ArrayList arrayList = new ArrayList();
            for (KotlinType memberScope : (Collection) this.refinedSupertypes.invoke()) {
                arrayList.addAll(memberScope.getMemberScope().getContributedVariables(name, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            generateFakeOverrides(name, arrayList, list);
        }

        private final <D extends CallableMemberDescriptor> void generateFakeOverrides(Name name, Collection<? extends D> collection, List<D> list) {
            Name name2 = name;
            Collection<? extends D> collection2 = collection;
            getC().getComponents().getKotlinTypeChecker().getOverridingUtil().generateOverridesInFunctionGroup(name2, collection2, new ArrayList(list), getClassDescriptor(), new DeserializedClassDescriptor$DeserializedClassMemberScope$generateFakeOverrides$1(list));
        }

        /* access modifiers changed from: protected */
        public Set<Name> getNonDeclaredFunctionNames() {
            Collection linkedHashSet = new LinkedHashSet();
            for (KotlinType memberScope : getClassDescriptor().typeConstructor.getSupertypes()) {
                CollectionsKt.addAll(linkedHashSet, memberScope.getMemberScope().getFunctionNames());
            }
            ((LinkedHashSet) linkedHashSet).addAll(getC().getComponents().getAdditionalClassPartsProvider().getFunctionsNames(this.this$0));
            return (Set) linkedHashSet;
        }

        /* access modifiers changed from: protected */
        public Set<Name> getNonDeclaredVariableNames() {
            Collection linkedHashSet = new LinkedHashSet();
            for (KotlinType memberScope : getClassDescriptor().typeConstructor.getSupertypes()) {
                CollectionsKt.addAll(linkedHashSet, memberScope.getMemberScope().getVariableNames());
            }
            return (Set) linkedHashSet;
        }

        /* access modifiers changed from: protected */
        public Set<Name> getNonDeclaredClassifierNames() {
            Collection linkedHashSet = new LinkedHashSet();
            Iterator it = getClassDescriptor().typeConstructor.getSupertypes().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Iterable classifierNames = ((KotlinType) it.next()).getMemberScope().getClassifierNames();
                if (classifierNames == null) {
                    linkedHashSet = null;
                    break;
                }
                CollectionsKt.addAll(linkedHashSet, classifierNames);
            }
            return (Set) linkedHashSet;
        }

        public ClassifierDescriptor getContributedClassifier(Name name, LookupLocation lookupLocation) {
            ClassDescriptor findEnumEntry;
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(lookupLocation, "location");
            recordLookup(name, lookupLocation);
            EnumEntryClassDescriptors access$getEnumEntries$p = getClassDescriptor().enumEntries;
            if (access$getEnumEntries$p == null || (findEnumEntry = access$getEnumEntries$p.findEnumEntry(name)) == null) {
                return super.getContributedClassifier(name, lookupLocation);
            }
            return findEnumEntry;
        }

        /* access modifiers changed from: protected */
        public ClassId createClassId(Name name) {
            Intrinsics.checkNotNullParameter(name, "name");
            ClassId createNestedClassId = this.this$0.classId.createNestedClassId(name);
            Intrinsics.checkNotNullExpressionValue(createNestedClassId, "classId.createNestedClassId(name)");
            return createNestedClassId;
        }

        /* access modifiers changed from: protected */
        public void addEnumEntryDescriptors(Collection<DeclarationDescriptor> collection, Function1<? super Name, Boolean> function1) {
            Intrinsics.checkNotNullParameter(collection, IronSourceConstants.EVENTS_RESULT);
            Intrinsics.checkNotNullParameter(function1, "nameFilter");
            EnumEntryClassDescriptors access$getEnumEntries$p = getClassDescriptor().enumEntries;
            Collection<ClassDescriptor> all = access$getEnumEntries$p == null ? null : access$getEnumEntries$p.all();
            if (all == null) {
                all = CollectionsKt.emptyList();
            }
            collection.addAll(all);
        }

        public void recordLookup(Name name, LookupLocation lookupLocation) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(lookupLocation, "location");
            UtilsKt.record(getC().getComponents().getLookupTracker(), lookupLocation, (ClassDescriptor) getClassDescriptor(), name);
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    private final class EnumEntryClassDescriptors {
        private final MemoizedFunctionToNullable<Name, ClassDescriptor> enumEntryByName;
        /* access modifiers changed from: private */
        public final Map<Name, ProtoBuf.EnumEntry> enumEntryProtos;
        /* access modifiers changed from: private */
        public final NotNullLazyValue<Set<Name>> enumMemberNames;
        final /* synthetic */ DeserializedClassDescriptor this$0;

        public EnumEntryClassDescriptors(DeserializedClassDescriptor deserializedClassDescriptor) {
            Intrinsics.checkNotNullParameter(deserializedClassDescriptor, "this$0");
            this.this$0 = deserializedClassDescriptor;
            List<ProtoBuf.EnumEntry> enumEntryList = this.this$0.getClassProto().getEnumEntryList();
            Intrinsics.checkNotNullExpressionValue(enumEntryList, "classProto.enumEntryList");
            Iterable iterable = enumEntryList;
            DeserializedClassDescriptor deserializedClassDescriptor2 = this.this$0;
            Map<Name, ProtoBuf.EnumEntry> linkedHashMap = new LinkedHashMap<>(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterable, 10)), 16));
            for (Object next : iterable) {
                linkedHashMap.put(NameResolverUtilKt.getName(deserializedClassDescriptor2.getC().getNameResolver(), ((ProtoBuf.EnumEntry) next).getName()), next);
            }
            this.enumEntryProtos = linkedHashMap;
            this.enumEntryByName = this.this$0.getC().getStorageManager().createMemoizedFunctionWithNullableValues(new DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1(this, this.this$0));
            this.enumMemberNames = this.this$0.getC().getStorageManager().createLazyValue(new DeserializedClassDescriptor$EnumEntryClassDescriptors$enumMemberNames$1(this));
        }

        public final ClassDescriptor findEnumEntry(Name name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return this.enumEntryByName.invoke(name);
        }

        /* access modifiers changed from: private */
        public final Set<Name> computeEnumMemberNames() {
            HashSet hashSet = new HashSet();
            for (KotlinType memberScope : this.this$0.getTypeConstructor().getSupertypes()) {
                for (DeclarationDescriptor declarationDescriptor : ResolutionScope.DefaultImpls.getContributedDescriptors$default(memberScope.getMemberScope(), (DescriptorKindFilter) null, (Function1) null, 3, (Object) null)) {
                    if ((declarationDescriptor instanceof SimpleFunctionDescriptor) || (declarationDescriptor instanceof PropertyDescriptor)) {
                        hashSet.add(declarationDescriptor.getName());
                    }
                }
            }
            List<ProtoBuf.Function> functionList = this.this$0.getClassProto().getFunctionList();
            Intrinsics.checkNotNullExpressionValue(functionList, "classProto.functionList");
            DeserializedClassDescriptor deserializedClassDescriptor = this.this$0;
            for (ProtoBuf.Function name : functionList) {
                hashSet.add(NameResolverUtilKt.getName(deserializedClassDescriptor.getC().getNameResolver(), name.getName()));
            }
            Collection collection = hashSet;
            Set set = (Set) collection;
            List<ProtoBuf.Property> propertyList = this.this$0.getClassProto().getPropertyList();
            Intrinsics.checkNotNullExpressionValue(propertyList, "classProto.propertyList");
            DeserializedClassDescriptor deserializedClassDescriptor2 = this.this$0;
            for (ProtoBuf.Property name2 : propertyList) {
                collection.add(NameResolverUtilKt.getName(deserializedClassDescriptor2.getC().getNameResolver(), name2.getName()));
            }
            return SetsKt.plus(set, collection);
        }

        public final Collection<ClassDescriptor> all() {
            Collection arrayList = new ArrayList();
            for (Name findEnumEntry : this.enumEntryProtos.keySet()) {
                ClassDescriptor findEnumEntry2 = findEnumEntry(findEnumEntry);
                if (findEnumEntry2 != null) {
                    arrayList.add(findEnumEntry2);
                }
            }
            return (List) arrayList;
        }
    }
}
