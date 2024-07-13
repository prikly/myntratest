package com.ryanharter.auto.value.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

@Inherited
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface GenerateTypeAdapter {
    public static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() {
        private final Map<Class<?>, Constructor<? extends TypeAdapter>> adapters = Collections.synchronizedMap(new LinkedHashMap());
        private final Class<?> typeArrayClass = Array.newInstance(Type.class, 0).getClass();

        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            Class<? super T> rawType = typeToken.getRawType();
            if (!rawType.isAnnotationPresent(GenerateTypeAdapter.class)) {
                return null;
            }
            Class<? super Object> superclass = rawType.getSuperclass();
            if (superclass.isAnnotationPresent(GenerateTypeAdapter.class)) {
                return gson.getAdapter(superclass);
            }
            Constructor<? extends TypeAdapter> findConstructorForClass = findConstructorForClass(rawType);
            if (findConstructorForClass == null) {
                return null;
            }
            try {
                if (findConstructorForClass.getParameterTypes().length == 1) {
                    return (TypeAdapter) findConstructorForClass.newInstance(new Object[]{gson});
                }
                return (TypeAdapter) findConstructorForClass.newInstance(new Object[]{gson, ((ParameterizedType) typeToken.getType()).getActualTypeArguments()});
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Unable to invoke " + findConstructorForClass, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Unable to invoke " + findConstructorForClass, e3);
            } catch (InvocationTargetException e4) {
                Throwable cause = e4.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                } else if (cause instanceof Error) {
                    throw ((Error) cause);
                } else {
                    throw new RuntimeException("Could not create generated TypeAdapter instance for type " + rawType, cause);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            r4 = r2.getDeclaredConstructor(new java.lang.Class[]{com.google.gson.Gson.class, r6.typeArrayClass});
            r4.setAccessible(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0088, code lost:
            r4 = findConstructorForClass(r7.getSuperclass());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0091, code lost:
            if (r4 != null) goto L_0x0093;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
            r4.setAccessible(true);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:23:? A[ExcHandler: ClassNotFoundException (unused java.lang.ClassNotFoundException), SYNTHETIC, Splitter:B:10:0x0029] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.lang.reflect.Constructor<? extends com.google.gson.TypeAdapter> findConstructorForClass(java.lang.Class<?> r7) {
            /*
                r6 = this;
                java.util.Map<java.lang.Class<?>, java.lang.reflect.Constructor<? extends com.google.gson.TypeAdapter>> r0 = r6.adapters
                java.lang.Object r0 = r0.get(r7)
                java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
                if (r0 == 0) goto L_0x000b
                return r0
            L_0x000b:
                java.lang.String r0 = r7.getName()
                java.lang.String r1 = "android."
                boolean r1 = r0.startsWith(r1)
                if (r1 != 0) goto L_0x009c
                java.lang.String r1 = "java."
                boolean r1 = r0.startsWith(r1)
                if (r1 != 0) goto L_0x009c
                java.lang.String r1 = "kotlin."
                boolean r1 = r0.startsWith(r1)
                if (r1 == 0) goto L_0x0028
                goto L_0x009c
            L_0x0028:
                r1 = 1
                java.lang.String r2 = r7.getName()     // Catch:{ ClassNotFoundException -> 0x0088, NoSuchMethodException -> 0x0070 }
                java.lang.String r3 = "$"
                java.lang.String r4 = "_"
                java.lang.String r2 = r2.replace(r3, r4)     // Catch:{ ClassNotFoundException -> 0x0088, NoSuchMethodException -> 0x0070 }
                java.lang.ClassLoader r3 = r7.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0088, NoSuchMethodException -> 0x0070 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0088, NoSuchMethodException -> 0x0070 }
                r4.<init>()     // Catch:{ ClassNotFoundException -> 0x0088, NoSuchMethodException -> 0x0070 }
                r4.append(r2)     // Catch:{ ClassNotFoundException -> 0x0088, NoSuchMethodException -> 0x0070 }
                java.lang.String r2 = "_GsonTypeAdapter"
                r4.append(r2)     // Catch:{ ClassNotFoundException -> 0x0088, NoSuchMethodException -> 0x0070 }
                java.lang.String r2 = r4.toString()     // Catch:{ ClassNotFoundException -> 0x0088, NoSuchMethodException -> 0x0070 }
                java.lang.Class r2 = r3.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x0088, NoSuchMethodException -> 0x0070 }
                r3 = 0
                java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x005d, ClassNotFoundException -> 0x0088 }
                java.lang.Class<com.google.gson.Gson> r5 = com.google.gson.Gson.class
                r4[r3] = r5     // Catch:{ NoSuchMethodException -> 0x005d, ClassNotFoundException -> 0x0088 }
                java.lang.reflect.Constructor r4 = r2.getDeclaredConstructor(r4)     // Catch:{ NoSuchMethodException -> 0x005d, ClassNotFoundException -> 0x0088 }
                r4.setAccessible(r1)     // Catch:{ NoSuchMethodException -> 0x005d, ClassNotFoundException -> 0x0088 }
                goto L_0x0096
            L_0x005d:
                r4 = 2
                java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x0088, NoSuchMethodException -> 0x0070 }
                java.lang.Class<com.google.gson.Gson> r5 = com.google.gson.Gson.class
                r4[r3] = r5     // Catch:{ ClassNotFoundException -> 0x0088, NoSuchMethodException -> 0x0070 }
                java.lang.Class<?> r3 = r6.typeArrayClass     // Catch:{ ClassNotFoundException -> 0x0088, NoSuchMethodException -> 0x0070 }
                r4[r1] = r3     // Catch:{ ClassNotFoundException -> 0x0088, NoSuchMethodException -> 0x0070 }
                java.lang.reflect.Constructor r4 = r2.getDeclaredConstructor(r4)     // Catch:{ ClassNotFoundException -> 0x0088, NoSuchMethodException -> 0x0070 }
                r4.setAccessible(r1)     // Catch:{ ClassNotFoundException -> 0x0088, NoSuchMethodException -> 0x0070 }
                goto L_0x0096
            L_0x0070:
                r7 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Unable to find binding constructor for "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0, r7)
                throw r1
            L_0x0088:
                java.lang.Class r0 = r7.getSuperclass()
                java.lang.reflect.Constructor r4 = r6.findConstructorForClass(r0)
                if (r4 == 0) goto L_0x0096
                r4.setAccessible(r1)
            L_0x0096:
                java.util.Map<java.lang.Class<?>, java.lang.reflect.Constructor<? extends com.google.gson.TypeAdapter>> r0 = r6.adapters
                r0.put(r7, r4)
                return r4
            L_0x009c:
                r7 = 0
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ryanharter.auto.value.gson.GenerateTypeAdapter.AnonymousClass1.findConstructorForClass(java.lang.Class):java.lang.reflect.Constructor");
        }
    };
}
