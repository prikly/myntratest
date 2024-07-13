package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* compiled from: BuiltInsPackageFragmentImpl.kt */
public final class BuiltInsPackageFragmentImpl extends DeserializedPackageFragmentImpl implements BuiltInsPackageFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final boolean isFallback;

    public /* synthetic */ BuiltInsPackageFragmentImpl(FqName fqName, StorageManager storageManager, ModuleDescriptor moduleDescriptor, ProtoBuf.PackageFragment packageFragment, BuiltInsBinaryVersion builtInsBinaryVersion, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(fqName, storageManager, moduleDescriptor, packageFragment, builtInsBinaryVersion, z);
    }

    private BuiltInsPackageFragmentImpl(FqName fqName, StorageManager storageManager, ModuleDescriptor moduleDescriptor, ProtoBuf.PackageFragment packageFragment, BuiltInsBinaryVersion builtInsBinaryVersion, boolean z) {
        super(fqName, storageManager, moduleDescriptor, packageFragment, builtInsBinaryVersion, (DeserializedContainerSource) null);
        this.isFallback = z;
    }

    /* compiled from: BuiltInsPackageFragmentImpl.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0076, code lost:
            r12 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0077, code lost:
            kotlin.io.CloseableKt.closeFinally(r14, r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x007a, code lost:
            throw r12;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl create(kotlin.reflect.jvm.internal.impl.name.FqName r11, kotlin.reflect.jvm.internal.impl.storage.StorageManager r12, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor r13, java.io.InputStream r14, boolean r15) {
            /*
                r10 = this;
                java.lang.String r0 = "fqName"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                java.lang.String r0 = "storageManager"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
                java.lang.String r0 = "module"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
                java.lang.String r0 = "inputStream"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
                java.io.Closeable r14 = (java.io.Closeable) r14
                r0 = r14
                java.io.InputStream r0 = (java.io.InputStream) r0     // Catch:{ all -> 0x0074 }
                kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion$Companion r1 = kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion.Companion     // Catch:{ all -> 0x0074 }
                kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion r7 = r1.readFrom(r0)     // Catch:{ all -> 0x0074 }
                r1 = 0
                if (r7 != 0) goto L_0x0029
                java.lang.String r2 = "version"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)     // Catch:{ all -> 0x0074 }
                r2 = r1
                goto L_0x002a
            L_0x0029:
                r2 = r7
            L_0x002a:
                boolean r2 = r2.isCompatible()     // Catch:{ all -> 0x0074 }
                if (r2 == 0) goto L_0x004e
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol r2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol.INSTANCE     // Catch:{ all -> 0x0074 }
                kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r2 = r2.getExtensionRegistry()     // Catch:{ all -> 0x0074 }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment r6 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.parseFrom(r0, r2)     // Catch:{ all -> 0x0074 }
                kotlin.io.CloseableKt.closeFinally(r14, r1)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl r14 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl
                java.lang.String r0 = "proto"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
                r9 = 0
                r2 = r14
                r3 = r11
                r4 = r12
                r5 = r13
                r8 = r15
                r2.<init>(r3, r4, r5, r6, r7, r8, r9)
                return r14
            L_0x004e:
                java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x0074 }
                java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0074 }
                r12.<init>()     // Catch:{ all -> 0x0074 }
                java.lang.String r13 = "Kotlin built-in definition format version is not supported: expected "
                r12.append(r13)     // Catch:{ all -> 0x0074 }
                kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion r13 = kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion.INSTANCE     // Catch:{ all -> 0x0074 }
                r12.append(r13)     // Catch:{ all -> 0x0074 }
                java.lang.String r13 = ", actual "
                r12.append(r13)     // Catch:{ all -> 0x0074 }
                r12.append(r7)     // Catch:{ all -> 0x0074 }
                java.lang.String r13 = ". Please update Kotlin"
                r12.append(r13)     // Catch:{ all -> 0x0074 }
                java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0074 }
                r11.<init>(r12)     // Catch:{ all -> 0x0074 }
                throw r11     // Catch:{ all -> 0x0074 }
            L_0x0074:
                r11 = move-exception
                throw r11     // Catch:{ all -> 0x0076 }
            L_0x0076:
                r12 = move-exception
                kotlin.io.CloseableKt.closeFinally(r14, r11)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl.Companion.create(kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.storage.StorageManager, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor, java.io.InputStream, boolean):kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl");
        }
    }

    public String toString() {
        return "builtins package fragment for " + getFqName() + " from " + DescriptorUtilsKt.getModule(this);
    }
}
