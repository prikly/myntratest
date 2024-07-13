package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: KotlinTarget.kt */
public enum KotlinTarget {
    CLASS("class", false, 2, (boolean) null),
    ANNOTATION_CLASS("annotation class", false, 2, (boolean) null),
    TYPE_PARAMETER("type parameter", false),
    PROPERTY("property", false, 2, (boolean) null),
    FIELD("field", false, 2, (boolean) null),
    LOCAL_VARIABLE("local variable", false, 2, (boolean) null),
    VALUE_PARAMETER("value parameter", false, 2, (boolean) null),
    CONSTRUCTOR("constructor", false, 2, (boolean) null),
    FUNCTION("function", false, 2, (boolean) null),
    PROPERTY_GETTER("getter", false, 2, (boolean) null),
    PROPERTY_SETTER("setter", false, 2, (boolean) null),
    TYPE("type usage", false),
    EXPRESSION("expression", false),
    FILE("file", false),
    TYPEALIAS("typealias", false),
    TYPE_PROJECTION("type projection", false),
    STAR_PROJECTION("star projection", false),
    PROPERTY_PARAMETER("property constructor parameter", false),
    CLASS_ONLY("class", false),
    OBJECT("object", false),
    COMPANION_OBJECT("companion object", false),
    INTERFACE("interface", false),
    ENUM_CLASS("enum class", false),
    ENUM_ENTRY("enum entry", false),
    LOCAL_CLASS("local class", false),
    LOCAL_FUNCTION("local function", false),
    MEMBER_FUNCTION("member function", false),
    TOP_LEVEL_FUNCTION("top level function", false),
    MEMBER_PROPERTY("member property", false),
    MEMBER_PROPERTY_WITH_BACKING_FIELD("member property with backing field", false),
    MEMBER_PROPERTY_WITH_DELEGATE("member property with delegate", false),
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("member property without backing field or delegate", false),
    TOP_LEVEL_PROPERTY("top level property", false),
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD("top level property with backing field", false),
    TOP_LEVEL_PROPERTY_WITH_DELEGATE("top level property with delegate", false),
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("top level property without backing field or delegate", false),
    INITIALIZER("initializer", false),
    DESTRUCTURING_DECLARATION("destructuring declaration", false),
    LAMBDA_EXPRESSION("lambda expression", false),
    ANONYMOUS_FUNCTION("anonymous function", false),
    OBJECT_LITERAL("object literal", false);
    
    private static final Set<KotlinTarget> ALL_TARGET_SET = null;
    private static final List<KotlinTarget> ANNOTATION_CLASS_LIST = null;
    private static final List<KotlinTarget> CLASS_LIST = null;
    private static final List<KotlinTarget> COMPANION_OBJECT_LIST = null;
    public static final Companion Companion = null;
    private static final Set<KotlinTarget> DEFAULT_TARGET_SET = null;
    private static final List<KotlinTarget> ENUM_ENTRY_LIST = null;
    private static final List<KotlinTarget> ENUM_LIST = null;
    private static final List<KotlinTarget> FILE_LIST = null;
    private static final List<KotlinTarget> FUNCTION_LIST = null;
    private static final List<KotlinTarget> INTERFACE_LIST = null;
    private static final List<KotlinTarget> LOCAL_CLASS_LIST = null;
    private static final List<KotlinTarget> OBJECT_LIST = null;
    private static final List<KotlinTarget> PROPERTY_GETTER_LIST = null;
    private static final List<KotlinTarget> PROPERTY_SETTER_LIST = null;
    private static final Map<AnnotationUseSiteTarget, KotlinTarget> USE_SITE_MAPPING = null;
    private static final HashMap<String, KotlinTarget> map = null;
    private final String description;
    private final boolean isDefault;

    private KotlinTarget(String str, boolean z) {
        this.description = str;
        this.isDefault = z;
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
        map = new HashMap<>();
        KotlinTarget[] values = values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            KotlinTarget kotlinTarget = values[i];
            i++;
            map.put(kotlinTarget.name(), kotlinTarget);
        }
        KotlinTarget[] values2 = values();
        Collection arrayList = new ArrayList();
        int length2 = values2.length;
        int i2 = 0;
        while (i2 < length2) {
            KotlinTarget kotlinTarget2 = values2[i2];
            i2++;
            if (kotlinTarget2.isDefault()) {
                arrayList.add(kotlinTarget2);
            }
        }
        DEFAULT_TARGET_SET = CollectionsKt.toSet((List) arrayList);
        ALL_TARGET_SET = ArraysKt.toSet(values());
        ANNOTATION_CLASS_LIST = CollectionsKt.listOf(ANNOTATION_CLASS, CLASS);
        LOCAL_CLASS_LIST = CollectionsKt.listOf(LOCAL_CLASS, CLASS);
        CLASS_LIST = CollectionsKt.listOf(CLASS_ONLY, CLASS);
        COMPANION_OBJECT_LIST = CollectionsKt.listOf(COMPANION_OBJECT, OBJECT, CLASS);
        OBJECT_LIST = CollectionsKt.listOf(OBJECT, CLASS);
        INTERFACE_LIST = CollectionsKt.listOf(INTERFACE, CLASS);
        ENUM_LIST = CollectionsKt.listOf(ENUM_CLASS, CLASS);
        ENUM_ENTRY_LIST = CollectionsKt.listOf(ENUM_ENTRY, PROPERTY, FIELD);
        PROPERTY_SETTER_LIST = CollectionsKt.listOf(PROPERTY_SETTER);
        PROPERTY_GETTER_LIST = CollectionsKt.listOf(PROPERTY_GETTER);
        FUNCTION_LIST = CollectionsKt.listOf(FUNCTION);
        FILE_LIST = CollectionsKt.listOf(FILE);
        USE_SITE_MAPPING = MapsKt.mapOf(TuplesKt.to(AnnotationUseSiteTarget.CONSTRUCTOR_PARAMETER, VALUE_PARAMETER), TuplesKt.to(AnnotationUseSiteTarget.FIELD, FIELD), TuplesKt.to(AnnotationUseSiteTarget.PROPERTY, PROPERTY), TuplesKt.to(AnnotationUseSiteTarget.FILE, FILE), TuplesKt.to(AnnotationUseSiteTarget.PROPERTY_GETTER, PROPERTY_GETTER), TuplesKt.to(AnnotationUseSiteTarget.PROPERTY_SETTER, PROPERTY_SETTER), TuplesKt.to(AnnotationUseSiteTarget.RECEIVER, VALUE_PARAMETER), TuplesKt.to(AnnotationUseSiteTarget.SETTER_PARAMETER, VALUE_PARAMETER), TuplesKt.to(AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD, FIELD));
    }

    /* compiled from: KotlinTarget.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
