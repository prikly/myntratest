package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* compiled from: constantValues.kt */
public final class ByteValue extends IntegerValueConstant<Byte> {
    public ByteValue(byte b2) {
        super(Byte.valueOf(b2));
    }

    public SimpleType getType(ModuleDescriptor moduleDescriptor) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "module");
        SimpleType byteType = moduleDescriptor.getBuiltIns().getByteType();
        Intrinsics.checkNotNullExpressionValue(byteType, "module.builtIns.byteType");
        return byteType;
    }

    public String toString() {
        return ((Number) getValue()).intValue() + ".toByte()";
    }
}
