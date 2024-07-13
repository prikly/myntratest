package com.applovin.exoplayer2.common.base;

import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class MoreObjects {

    public static final class ToStringHelper {
        private final String className;
        private final a holderHead;
        private a holderTail;
        private boolean omitNullValues;

        private static final class a {
            @NullableDecl

            /* renamed from: a  reason: collision with root package name */
            String f11666a;
            @NullableDecl

            /* renamed from: b  reason: collision with root package name */
            Object f11667b;
            @NullableDecl

            /* renamed from: c  reason: collision with root package name */
            a f11668c;

            private a() {
            }
        }

        private ToStringHelper(String str) {
            a aVar = new a();
            this.holderHead = aVar;
            this.holderTail = aVar;
            this.omitNullValues = false;
            this.className = (String) Preconditions.checkNotNull(str);
        }

        private a addHolder() {
            a aVar = new a();
            this.holderTail.f11668c = aVar;
            this.holderTail = aVar;
            return aVar;
        }

        private ToStringHelper addHolder(@NullableDecl Object obj) {
            addHolder().f11667b = obj;
            return this;
        }

        private ToStringHelper addHolder(String str, @NullableDecl Object obj) {
            a addHolder = addHolder();
            addHolder.f11667b = obj;
            addHolder.f11666a = (String) Preconditions.checkNotNull(str);
            return this;
        }

        public ToStringHelper add(String str, char c2) {
            return addHolder(str, String.valueOf(c2));
        }

        public ToStringHelper add(String str, double d2) {
            return addHolder(str, String.valueOf(d2));
        }

        public ToStringHelper add(String str, float f2) {
            return addHolder(str, String.valueOf(f2));
        }

        public ToStringHelper add(String str, int i) {
            return addHolder(str, String.valueOf(i));
        }

        public ToStringHelper add(String str, long j) {
            return addHolder(str, String.valueOf(j));
        }

        public ToStringHelper add(String str, @NullableDecl Object obj) {
            return addHolder(str, obj);
        }

        public ToStringHelper add(String str, boolean z) {
            return addHolder(str, String.valueOf(z));
        }

        public ToStringHelper addValue(char c2) {
            return addHolder(String.valueOf(c2));
        }

        public ToStringHelper addValue(double d2) {
            return addHolder(String.valueOf(d2));
        }

        public ToStringHelper addValue(float f2) {
            return addHolder(String.valueOf(f2));
        }

        public ToStringHelper addValue(int i) {
            return addHolder(String.valueOf(i));
        }

        public ToStringHelper addValue(long j) {
            return addHolder(String.valueOf(j));
        }

        public ToStringHelper addValue(@NullableDecl Object obj) {
            return addHolder(obj);
        }

        public ToStringHelper addValue(boolean z) {
            return addHolder(String.valueOf(z));
        }

        public ToStringHelper omitNullValues() {
            this.omitNullValues = true;
            return this;
        }

        public String toString() {
            boolean z = this.omitNullValues;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.className);
            sb.append('{');
            String str = "";
            for (a aVar = this.holderHead.f11668c; aVar != null; aVar = aVar.f11668c) {
                Object obj = aVar.f11667b;
                if (!z || obj != null) {
                    sb.append(str);
                    if (aVar.f11666a != null) {
                        sb.append(aVar.f11666a);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append(deepToString, 1, deepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    private MoreObjects() {
    }

    public static <T> T firstNonNull(@NullableDecl T t, @NullableDecl T t2) {
        if (t != null) {
            return t;
        }
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static ToStringHelper toStringHelper(Class<?> cls) {
        return new ToStringHelper(cls.getSimpleName());
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj.getClass().getSimpleName());
    }

    public static ToStringHelper toStringHelper(String str) {
        return new ToStringHelper(str);
    }
}
