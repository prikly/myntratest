package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.NoWhenBranchMatchedException;
import kotlin._Assertions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.StringsKt;

/* compiled from: methodSignatureMapping.kt */
final class JvmTypeFactoryImpl implements JvmTypeFactory<JvmType> {
    public static final JvmTypeFactoryImpl INSTANCE = new JvmTypeFactoryImpl();

    /* compiled from: methodSignatureMapping.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PrimitiveType.values().length];
            iArr[PrimitiveType.BOOLEAN.ordinal()] = 1;
            iArr[PrimitiveType.CHAR.ordinal()] = 2;
            iArr[PrimitiveType.BYTE.ordinal()] = 3;
            iArr[PrimitiveType.SHORT.ordinal()] = 4;
            iArr[PrimitiveType.INT.ordinal()] = 5;
            iArr[PrimitiveType.FLOAT.ordinal()] = 6;
            iArr[PrimitiveType.LONG.ordinal()] = 7;
            iArr[PrimitiveType.DOUBLE.ordinal()] = 8;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private JvmTypeFactoryImpl() {
    }

    public JvmType boxType(JvmType jvmType) {
        Intrinsics.checkNotNullParameter(jvmType, "possiblyPrimitiveType");
        if (!(jvmType instanceof JvmType.Primitive)) {
            return jvmType;
        }
        JvmType.Primitive primitive = (JvmType.Primitive) jvmType;
        if (primitive.getJvmPrimitiveType() == null) {
            return jvmType;
        }
        String internalName = JvmClassName.byFqNameWithoutInnerClasses(primitive.getJvmPrimitiveType().getWrapperFqName()).getInternalName();
        Intrinsics.checkNotNullExpressionValue(internalName, "byFqNameWithoutInnerClas…apperFqName).internalName");
        return createObjectType(internalName);
    }

    public JvmType createFromString(String str) {
        JvmPrimitiveType jvmPrimitiveType;
        boolean z;
        Intrinsics.checkNotNullParameter(str, "representation");
        CharSequence charSequence = str;
        boolean z2 = false;
        boolean z3 = charSequence.length() > 0;
        if (!_Assertions.ENABLED || z3) {
            char charAt = str.charAt(0);
            JvmPrimitiveType[] values = JvmPrimitiveType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    jvmPrimitiveType = null;
                    break;
                }
                jvmPrimitiveType = values[i];
                i++;
                if (jvmPrimitiveType.getDesc().charAt(0) == charAt) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            if (jvmPrimitiveType != null) {
                return new JvmType.Primitive(jvmPrimitiveType);
            }
            if (charAt == 'V') {
                return new JvmType.Primitive((JvmPrimitiveType) null);
            }
            if (charAt == '[') {
                String substring = str.substring(1);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                return new JvmType.Array(createFromString(substring));
            }
            if (charAt == 'L' && StringsKt.endsWith$default(charSequence, ';', false, 2, (Object) null)) {
                z2 = true;
            }
            if (!_Assertions.ENABLED || z2) {
                String substring2 = str.substring(1, str.length() - 1);
                Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                return new JvmType.Object(substring2);
            }
            throw new AssertionError("Type that is not primitive nor array should be Object, but '" + str + "' was found");
        }
        throw new AssertionError("empty string as JvmType");
    }

    public JvmType createPrimitiveType(PrimitiveType primitiveType) {
        Intrinsics.checkNotNullParameter(primitiveType, "primitiveType");
        switch (WhenMappings.$EnumSwitchMapping$0[primitiveType.ordinal()]) {
            case 1:
                return JvmType.Companion.getBOOLEAN$descriptors_jvm();
            case 2:
                return JvmType.Companion.getCHAR$descriptors_jvm();
            case 3:
                return JvmType.Companion.getBYTE$descriptors_jvm();
            case 4:
                return JvmType.Companion.getSHORT$descriptors_jvm();
            case 5:
                return JvmType.Companion.getINT$descriptors_jvm();
            case 6:
                return JvmType.Companion.getFLOAT$descriptors_jvm();
            case 7:
                return JvmType.Companion.getLONG$descriptors_jvm();
            case 8:
                return JvmType.Companion.getDOUBLE$descriptors_jvm();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public JvmType.Object createObjectType(String str) {
        Intrinsics.checkNotNullParameter(str, "internalName");
        return new JvmType.Object(str);
    }

    public String toString(JvmType jvmType) {
        Intrinsics.checkNotNullParameter(jvmType, "type");
        if (jvmType instanceof JvmType.Array) {
            return Intrinsics.stringPlus("[", toString(((JvmType.Array) jvmType).getElementType()));
        }
        if (jvmType instanceof JvmType.Primitive) {
            JvmPrimitiveType jvmPrimitiveType = ((JvmType.Primitive) jvmType).getJvmPrimitiveType();
            String desc = jvmPrimitiveType == null ? "V" : jvmPrimitiveType.getDesc();
            Intrinsics.checkNotNullExpressionValue(desc, "type.jvmPrimitiveType?.desc ?: \"V\"");
            return desc;
        } else if (jvmType instanceof JvmType.Object) {
            return 'L' + ((JvmType.Object) jvmType).getInternalName() + ';';
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public JvmType getJavaLangClassType() {
        return createObjectType("java/lang/Class");
    }
}
