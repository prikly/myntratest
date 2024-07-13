package kotlin.reflect;

import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

public interface KProperty2 extends Function2, KProperty {

    public interface Getter extends Function2, KProperty.Getter {
    }
}
