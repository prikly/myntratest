package com.google.common.base;

@FunctionalInterface
public interface Predicate<T> extends java.util.function.Predicate<T> {
    boolean apply(T t);

    boolean test(T t);

    /* renamed from: com.google.common.base.Predicate$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$test(Predicate _this, Object obj) {
            return _this.apply(obj);
        }
    }
}
