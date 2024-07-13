package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* compiled from: constantValues.kt */
public final class UByteValue extends UnsignedValueConstant<Byte> {
    public UByteValue(byte b2) {
        super(Byte.valueOf(b2));
    }

    public KotlinType getType(ModuleDescriptor moduleDescriptor) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "module");
        ClassDescriptor findClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor, StandardNames.FqNames.uByte);
        if (findClassAcrossModuleDependencies == null) {
            SimpleType createErrorType = ErrorUtils.createErrorType("Unsigned type UByte not found");
            Intrinsics.checkNotNullExpressionValue(createErrorType, "createErrorType(\"Unsigned type UByte not found\")");
            return createErrorType;
        }
        SimpleType defaultType = findClassAcrossModuleDependencies.getDefaultType();
        Intrinsics.checkNotNullExpressionValue(defaultType, "module.findClassAcrossMo…ed type UByte not found\")");
        return defaultType;
    }

    public String toString() {
        return ((Number) getValue()).intValue() + ".toUByte()";
    }
}
