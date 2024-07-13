package kotlin.reflect.jvm.internal.impl.load.java;

import com.appodeal.ads.modules.common.internal.Constants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.StringsKt;

/* compiled from: JvmAbi.kt */
public final class JvmAbi {
    public static final JvmAbi INSTANCE = new JvmAbi();
    public static final FqName JVM_FIELD_ANNOTATION_FQ_NAME = new FqName("kotlin.jvm.JvmField");
    private static final ClassId REFLECTION_FACTORY_IMPL;
    private static final ClassId REPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION;

    private JvmAbi() {
    }

    static {
        ClassId classId = ClassId.topLevel(new FqName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        Intrinsics.checkNotNullExpressionValue(classId, "topLevel(FqName(\"kotlin.….ReflectionFactoryImpl\"))");
        REFLECTION_FACTORY_IMPL = classId;
        ClassId fromString = ClassId.fromString("kotlin/jvm/internal/RepeatableContainer");
        Intrinsics.checkNotNullExpressionValue(fromString, "fromString(\"kotlin/jvm/i…nal/RepeatableContainer\")");
        REPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION = fromString;
    }

    public final ClassId getREPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION() {
        return REPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION;
    }

    public static final boolean isGetterName(String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        return StringsKt.startsWith$default(str, Constants.GET, false, 2, (Object) null) || StringsKt.startsWith$default(str, "is", false, 2, (Object) null);
    }

    public static final boolean isSetterName(String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        return StringsKt.startsWith$default(str, "set", false, 2, (Object) null);
    }

    public static final String getterName(String str) {
        Intrinsics.checkNotNullParameter(str, "propertyName");
        return startsWithIsPrefix(str) ? str : Intrinsics.stringPlus(Constants.GET, CapitalizeDecapitalizeKt.capitalizeAsciiOnly(str));
    }

    public static final String setterName(String str) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "propertyName");
        if (startsWithIsPrefix(str)) {
            str2 = str.substring(2);
            Intrinsics.checkNotNullExpressionValue(str2, "this as java.lang.String).substring(startIndex)");
        } else {
            str2 = CapitalizeDecapitalizeKt.capitalizeAsciiOnly(str);
        }
        return Intrinsics.stringPlus("set", str2);
    }

    public static final boolean startsWithIsPrefix(String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        if (!StringsKt.startsWith$default(str, "is", false, 2, (Object) null) || str.length() == 2) {
            return false;
        }
        char charAt = str.charAt(2);
        if (Intrinsics.compare(97, charAt) > 0 || Intrinsics.compare(charAt, 122) > 0) {
            return true;
        }
        return false;
    }
}
