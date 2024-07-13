package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ModuleClassResolver;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolver;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;

/* compiled from: DeserializationComponentsForJava.kt */
public final class DeserializationComponentsForJavaKt {
    public static /* synthetic */ LazyJavaPackageFragmentProvider makeLazyJavaPackageFragmentProvider$default(JavaClassFinder javaClassFinder, ModuleDescriptor moduleDescriptor, StorageManager storageManager, NotFoundClasses notFoundClasses, KotlinClassFinder kotlinClassFinder, DeserializedDescriptorResolver deserializedDescriptorResolver, ErrorReporter errorReporter, JavaSourceElementFactory javaSourceElementFactory, ModuleClassResolver moduleClassResolver, PackagePartProvider packagePartProvider, int i, Object obj) {
        PackagePartProvider packagePartProvider2;
        if ((i & 512) != 0) {
            packagePartProvider2 = PackagePartProvider.Empty.INSTANCE;
        } else {
            packagePartProvider2 = packagePartProvider;
        }
        return makeLazyJavaPackageFragmentProvider(javaClassFinder, moduleDescriptor, storageManager, notFoundClasses, kotlinClassFinder, deserializedDescriptorResolver, errorReporter, javaSourceElementFactory, moduleClassResolver, packagePartProvider2);
    }

    public static final LazyJavaPackageFragmentProvider makeLazyJavaPackageFragmentProvider(JavaClassFinder javaClassFinder, ModuleDescriptor moduleDescriptor, StorageManager storageManager, NotFoundClasses notFoundClasses, KotlinClassFinder kotlinClassFinder, DeserializedDescriptorResolver deserializedDescriptorResolver, ErrorReporter errorReporter, JavaSourceElementFactory javaSourceElementFactory, ModuleClassResolver moduleClassResolver, PackagePartProvider packagePartProvider) {
        StorageManager storageManager2 = storageManager;
        DeserializedDescriptorResolver deserializedDescriptorResolver2 = deserializedDescriptorResolver;
        Intrinsics.checkNotNullParameter(javaClassFinder, "javaClassFinder");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "module");
        Intrinsics.checkNotNullParameter(storageManager2, "storageManager");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "reflectKotlinClassFinder");
        Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(javaSourceElementFactory, "javaSourceElementFactory");
        Intrinsics.checkNotNullParameter(moduleClassResolver, "singleModuleClassResolver");
        Intrinsics.checkNotNullParameter(packagePartProvider, "packagePartProvider");
        AnnotationTypeQualifierResolver annotationTypeQualifierResolver = r8;
        AnnotationTypeQualifierResolver annotationTypeQualifierResolver2 = new AnnotationTypeQualifierResolver(storageManager2, JavaTypeEnhancementState.Companion.getDEFAULT());
        JavaTypeEnhancementState javaTypeEnhancementState = JavaTypeEnhancementState.Companion.getDEFAULT();
        SignaturePropagator signaturePropagator = SignaturePropagator.DO_NOTHING;
        AnnotationTypeQualifierResolver annotationTypeQualifierResolver3 = annotationTypeQualifierResolver2;
        Intrinsics.checkNotNullExpressionValue(signaturePropagator, "DO_NOTHING");
        JavaResolverCache javaResolverCache = JavaResolverCache.EMPTY;
        JavaResolverCache javaResolverCache2 = javaResolverCache;
        Intrinsics.checkNotNullExpressionValue(javaResolverCache, "EMPTY");
        JavaPropertyInitializerEvaluator javaPropertyInitializerEvaluator = JavaPropertyInitializerEvaluator.DoNothing.INSTANCE;
        AnnotationTypeQualifierResolver annotationTypeQualifierResolver4 = annotationTypeQualifierResolver3;
        SamConversionResolver samConversionResolverImpl = new SamConversionResolverImpl(storageManager2, CollectionsKt.emptyList());
        SupertypeLoopChecker supertypeLoopChecker = SupertypeLoopChecker.EMPTY.INSTANCE;
        JavaClassFinder javaClassFinder2 = javaClassFinder;
        LookupTracker lookupTracker = LookupTracker.DO_NOTHING.INSTANCE;
        KotlinClassFinder kotlinClassFinder2 = kotlinClassFinder;
        ReflectionTypes reflectionTypes = r3;
        ReflectionTypes reflectionTypes2 = new ReflectionTypes(moduleDescriptor, notFoundClasses);
        SignatureEnhancement signatureEnhancement = r1;
        SignatureEnhancement signatureEnhancement2 = new SignatureEnhancement(annotationTypeQualifierResolver3, JavaTypeEnhancementState.Companion.getDEFAULT(), new JavaTypeEnhancement(JavaResolverSettings.Default.INSTANCE));
        StorageManager storageManager3 = storageManager;
        JavaClassFinder javaClassFinder3 = javaClassFinder2;
        KotlinClassFinder kotlinClassFinder3 = kotlinClassFinder2;
        DeserializedDescriptorResolver deserializedDescriptorResolver3 = deserializedDescriptorResolver2;
        return new LazyJavaPackageFragmentProvider(new JavaResolverComponents(storageManager3, javaClassFinder3, kotlinClassFinder3, deserializedDescriptorResolver3, signaturePropagator, errorReporter, javaResolverCache2, javaPropertyInitializerEvaluator, samConversionResolverImpl, javaSourceElementFactory, moduleClassResolver, packagePartProvider, supertypeLoopChecker, lookupTracker, moduleDescriptor, reflectionTypes, annotationTypeQualifierResolver, signatureEnhancement, JavaClassesTracker.Default.INSTANCE, JavaResolverSettings.Default.INSTANCE, NewKotlinTypeChecker.Companion.getDefault(), javaTypeEnhancementState, new DeserializationComponentsForJavaKt$makeLazyJavaPackageFragmentProvider$javaResolverComponents$1(), (SyntheticJavaPartsProvider) null, 8388608, (DefaultConstructorMarker) null));
    }

    public static final DeserializationComponentsForJava makeDeserializationComponentsForJava(ModuleDescriptor moduleDescriptor, StorageManager storageManager, NotFoundClasses notFoundClasses, LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, KotlinClassFinder kotlinClassFinder, DeserializedDescriptorResolver deserializedDescriptorResolver, ErrorReporter errorReporter) {
        StorageManager storageManager2 = storageManager;
        KotlinClassFinder kotlinClassFinder2 = kotlinClassFinder;
        DeserializedDescriptorResolver deserializedDescriptorResolver2 = deserializedDescriptorResolver;
        Intrinsics.checkNotNullParameter(moduleDescriptor, "module");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider2 = lazyJavaPackageFragmentProvider;
        Intrinsics.checkNotNullParameter(lazyJavaPackageFragmentProvider2, "lazyJavaPackageFragmentProvider");
        Intrinsics.checkNotNullParameter(kotlinClassFinder2, "reflectKotlinClassFinder");
        Intrinsics.checkNotNullParameter(deserializedDescriptorResolver2, "deserializedDescriptorResolver");
        ErrorReporter errorReporter2 = errorReporter;
        Intrinsics.checkNotNullParameter(errorReporter2, "errorReporter");
        JavaClassDataFinder javaClassDataFinder = new JavaClassDataFinder(kotlinClassFinder2, deserializedDescriptorResolver2);
        BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl = new BinaryClassAnnotationAndConstantLoaderImpl(moduleDescriptor, notFoundClasses, storageManager, kotlinClassFinder2);
        return new DeserializationComponentsForJava(storageManager2, moduleDescriptor, DeserializationConfiguration.Default.INSTANCE, javaClassDataFinder, binaryClassAnnotationAndConstantLoaderImpl, lazyJavaPackageFragmentProvider2, notFoundClasses, errorReporter2, LookupTracker.DO_NOTHING.INSTANCE, ContractDeserializer.Companion.getDEFAULT(), NewKotlinTypeChecker.Companion.getDefault());
    }
}
