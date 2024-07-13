package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* compiled from: constantValues.kt */
public final class CharValue extends IntegerValueConstant<Character> {
    public CharValue(char c2) {
        super(Character.valueOf(c2));
    }

    public SimpleType getType(ModuleDescriptor moduleDescriptor) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "module");
        SimpleType charType = moduleDescriptor.getBuiltIns().getCharType();
        Intrinsics.checkNotNullExpressionValue(charType, "module.builtIns.charType");
        return charType;
    }

    public String toString() {
        String format = String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{Integer.valueOf(((Character) getValue()).charValue()), getPrintablePart(((Character) getValue()).charValue())}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
        return format;
    }

    private final String getPrintablePart(char c2) {
        if (c2 == 8) {
            return "\\b";
        }
        if (c2 == 9) {
            return "\\t";
        }
        if (c2 == 10) {
            return "\\n";
        }
        if (c2 == 12) {
            return "\\f";
        }
        if (c2 == 13) {
            return "\\r";
        }
        return isPrintableUnicode(c2) ? String.valueOf(c2) : "?";
    }

    private final boolean isPrintableUnicode(char c2) {
        byte type = (byte) Character.getType(c2);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }
}
