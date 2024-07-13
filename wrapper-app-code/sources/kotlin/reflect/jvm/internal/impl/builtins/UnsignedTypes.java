package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;

/* compiled from: UnsignedType.kt */
public final class UnsignedTypes {
    public static final UnsignedTypes INSTANCE = new UnsignedTypes();
    private static final HashMap<ClassId, ClassId> arrayClassIdToUnsignedClassId = new HashMap<>();
    private static final Set<Name> arrayClassesShortNames;
    private static final Set<Name> unsignedArrayTypeNames;
    private static final HashMap<UnsignedArrayType, Name> unsignedArrayTypeToArrayCall = MapsKt.hashMapOf(TuplesKt.to(UnsignedArrayType.UBYTEARRAY, Name.identifier("ubyteArrayOf")), TuplesKt.to(UnsignedArrayType.USHORTARRAY, Name.identifier("ushortArrayOf")), TuplesKt.to(UnsignedArrayType.UINTARRAY, Name.identifier("uintArrayOf")), TuplesKt.to(UnsignedArrayType.ULONGARRAY, Name.identifier("ulongArrayOf")));
    private static final HashMap<ClassId, ClassId> unsignedClassIdToArrayClassId = new HashMap<>();
    private static final Set<Name> unsignedTypeNames;

    private UnsignedTypes() {
    }

    static {
        UnsignedType[] values = UnsignedType.values();
        Collection arrayList = new ArrayList(values.length);
        int length = values.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            UnsignedType unsignedType = values[i2];
            i2++;
            arrayList.add(unsignedType.getTypeName());
        }
        unsignedTypeNames = CollectionsKt.toSet((List) arrayList);
        UnsignedArrayType[] values2 = UnsignedArrayType.values();
        Collection arrayList2 = new ArrayList(values2.length);
        int length2 = values2.length;
        int i3 = 0;
        while (i3 < length2) {
            UnsignedArrayType unsignedArrayType = values2[i3];
            i3++;
            arrayList2.add(unsignedArrayType.getTypeName());
        }
        unsignedArrayTypeNames = CollectionsKt.toSet((List) arrayList2);
        UnsignedType[] values3 = UnsignedType.values();
        Collection linkedHashSet = new LinkedHashSet();
        int length3 = values3.length;
        int i4 = 0;
        while (i4 < length3) {
            UnsignedType unsignedType2 = values3[i4];
            i4++;
            linkedHashSet.add(unsignedType2.getArrayClassId().getShortClassName());
        }
        arrayClassesShortNames = (Set) linkedHashSet;
        UnsignedType[] values4 = UnsignedType.values();
        int length4 = values4.length;
        while (i < length4) {
            UnsignedType unsignedType3 = values4[i];
            i++;
            arrayClassIdToUnsignedClassId.put(unsignedType3.getArrayClassId(), unsignedType3.getClassId());
            unsignedClassIdToArrayClassId.put(unsignedType3.getClassId(), unsignedType3.getArrayClassId());
        }
    }

    public final boolean isShortNameOfUnsignedArray(Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return arrayClassesShortNames.contains(name);
    }

    public final ClassId getUnsignedClassIdByArrayClassId(ClassId classId) {
        Intrinsics.checkNotNullParameter(classId, "arrayClassId");
        return arrayClassIdToUnsignedClassId.get(classId);
    }

    public static final boolean isUnsignedType(KotlinType kotlinType) {
        ClassifierDescriptor declarationDescriptor;
        Intrinsics.checkNotNullParameter(kotlinType, "type");
        if (!TypeUtils.noExpectedType(kotlinType) && (declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor()) != null) {
            return INSTANCE.isUnsignedClass(declarationDescriptor);
        }
        return false;
    }

    public final boolean isUnsignedClass(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkNotNullParameter(declarationDescriptor, "descriptor");
        DeclarationDescriptor containingDeclaration = declarationDescriptor.getContainingDeclaration();
        return (containingDeclaration instanceof PackageFragmentDescriptor) && Intrinsics.areEqual((Object) ((PackageFragmentDescriptor) containingDeclaration).getFqName(), (Object) StandardNames.BUILT_INS_PACKAGE_FQ_NAME) && unsignedTypeNames.contains(declarationDescriptor.getName());
    }
}
