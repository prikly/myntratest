package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import com.appodeal.ads.modules.common.internal.LogConstants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ClassMapperLite.kt */
public final class ClassMapperLite {
    public static final ClassMapperLite INSTANCE = new ClassMapperLite();

    /* renamed from: kotlin  reason: collision with root package name */
    private static final String f9680kotlin = CollectionsKt.joinToString$default(CollectionsKt.listOf('k', 'o', 't', 'l', 'i', 'n'), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    private static final Map<String, String> map;

    private ClassMapperLite() {
    }

    static {
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        List listOf = CollectionsKt.listOf("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, listOf.size() - 1, 2);
        if (progressionLastElement >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 2;
                int i3 = i + 1;
                linkedHashMap.put(f9680kotlin + '/' + ((String) listOf.get(i)), listOf.get(i3));
                linkedHashMap.put(f9680kotlin + '/' + ((String) listOf.get(i)) + "Array", Intrinsics.stringPlus("[", listOf.get(i3)));
                if (i == progressionLastElement) {
                    break;
                }
                i = i2;
            }
        }
        linkedHashMap.put(Intrinsics.stringPlus(f9680kotlin, "/Unit"), "V");
        m58map$lambda0$add(linkedHashMap, "Any", "java/lang/Object");
        m58map$lambda0$add(linkedHashMap, "Nothing", "java/lang/Void");
        m58map$lambda0$add(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str : CollectionsKt.listOf("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            m58map$lambda0$add(linkedHashMap, str, Intrinsics.stringPlus("java/lang/", str));
        }
        for (String str2 : CollectionsKt.listOf("Iterator", "Collection", "List", LogConstants.EVENT_SET, "Map", "ListIterator")) {
            m58map$lambda0$add(linkedHashMap, Intrinsics.stringPlus("collections/", str2), Intrinsics.stringPlus("java/util/", str2));
            m58map$lambda0$add(linkedHashMap, Intrinsics.stringPlus("collections/Mutable", str2), Intrinsics.stringPlus("java/util/", str2));
        }
        m58map$lambda0$add(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        m58map$lambda0$add(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        m58map$lambda0$add(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        m58map$lambda0$add(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i4 = 0; i4 < 23; i4++) {
            String stringPlus = Intrinsics.stringPlus("Function", Integer.valueOf(i4));
            m58map$lambda0$add(linkedHashMap, stringPlus, f9680kotlin + "/jvm/functions/Function" + i4);
            m58map$lambda0$add(linkedHashMap, Intrinsics.stringPlus("reflect/KFunction", Integer.valueOf(i4)), Intrinsics.stringPlus(f9680kotlin, "/reflect/KFunction"));
        }
        for (String str3 : CollectionsKt.listOf("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            String stringPlus2 = Intrinsics.stringPlus(str3, ".Companion");
            m58map$lambda0$add(linkedHashMap, stringPlus2, f9680kotlin + "/jvm/internal/" + str3 + "CompanionObject");
        }
        map = linkedHashMap;
    }

    /* renamed from: map$lambda-0$add  reason: not valid java name */
    private static final void m58map$lambda0$add(Map<String, String> map2, String str, String str2) {
        map2.put(f9680kotlin + '/' + str, 'L' + str2 + ';');
    }

    public static final String mapClass(String str) {
        Intrinsics.checkNotNullParameter(str, "classId");
        String str2 = map.get(str);
        if (str2 != null) {
            return str2;
        }
        return 'L' + StringsKt.replace$default(str, '.', '$', false, 4, (Object) null) + ';';
    }
}
