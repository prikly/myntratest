package kotlin.reflect;

import kotlin.jvm.functions.Function3;
import kotlin.reflect.KMutableProperty;

public interface KMutableProperty2 extends KMutableProperty, KProperty2 {

    public interface Setter extends Function3, KMutableProperty.Setter {
    }
}
