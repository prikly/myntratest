package kotlin.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0001\u001a\"\u0010\b\u001a\u0002H\t\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\b¢\u0006\u0002\u0010\f\u001a\b\u0010\r\u001a\u00020\u0005H\u0002\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"IMPLEMENTATIONS", "Lkotlin/internal/PlatformImplementations;", "apiVersionIsAtLeast", "", "major", "", "minor", "patch", "castToBaseType", "T", "", "instance", "(Ljava/lang/Object;)Ljava/lang/Object;", "getJavaVersion", "kotlin-stdlib"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* compiled from: PlatformImplementations.kt */
public final class PlatformImplementationsKt {
    public static final PlatformImplementations IMPLEMENTATIONS;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: kotlin.internal.PlatformImplementations} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: kotlin.internal.PlatformImplementations} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            int r0 = getJavaVersion()
            java.lang.String r1 = "ClassCastException(\"Inst…baseTypeCL\").initCause(e)"
            java.lang.String r2 = ", base type classloader: "
            java.lang.String r3 = "Instance classloader: "
            java.lang.String r4 = "forName(\"kotlin.internal…entations\").newInstance()"
            r5 = 65544(0x10008, float:9.1847E-41)
            if (r0 < r5) goto L_0x009a
            java.lang.String r5 = "kotlin.internal.jdk8.JDK8PlatformImplementations"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException -> 0x0055 }
            java.lang.Object r5 = r5.newInstance()     // Catch:{ ClassNotFoundException -> 0x0055 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)     // Catch:{ ClassNotFoundException -> 0x0055 }
            kotlin.internal.PlatformImplementations r5 = (kotlin.internal.PlatformImplementations) r5     // Catch:{ ClassCastException -> 0x0022 }
            goto L_0x012d
        L_0x0022:
            r6 = move-exception
            java.lang.Class r5 = r5.getClass()     // Catch:{ ClassNotFoundException -> 0x0055 }
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0055 }
            java.lang.Class<kotlin.internal.PlatformImplementations> r7 = kotlin.internal.PlatformImplementations.class
            java.lang.ClassLoader r7 = r7.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0055 }
            java.lang.ClassCastException r8 = new java.lang.ClassCastException     // Catch:{ ClassNotFoundException -> 0x0055 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0055 }
            r9.<init>()     // Catch:{ ClassNotFoundException -> 0x0055 }
            r9.append(r3)     // Catch:{ ClassNotFoundException -> 0x0055 }
            r9.append(r5)     // Catch:{ ClassNotFoundException -> 0x0055 }
            r9.append(r2)     // Catch:{ ClassNotFoundException -> 0x0055 }
            r9.append(r7)     // Catch:{ ClassNotFoundException -> 0x0055 }
            java.lang.String r5 = r9.toString()     // Catch:{ ClassNotFoundException -> 0x0055 }
            r8.<init>(r5)     // Catch:{ ClassNotFoundException -> 0x0055 }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ ClassNotFoundException -> 0x0055 }
            java.lang.Throwable r5 = r8.initCause(r6)     // Catch:{ ClassNotFoundException -> 0x0055 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)     // Catch:{ ClassNotFoundException -> 0x0055 }
            throw r5     // Catch:{ ClassNotFoundException -> 0x0055 }
        L_0x0055:
            java.lang.String r5 = "kotlin.internal.JRE8PlatformImplementations"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException -> 0x0099 }
            java.lang.Object r5 = r5.newInstance()     // Catch:{ ClassNotFoundException -> 0x0099 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)     // Catch:{ ClassNotFoundException -> 0x0099 }
            kotlin.internal.PlatformImplementations r5 = (kotlin.internal.PlatformImplementations) r5     // Catch:{ ClassCastException -> 0x0066 }
            goto L_0x012d
        L_0x0066:
            r6 = move-exception
            java.lang.Class r5 = r5.getClass()     // Catch:{ ClassNotFoundException -> 0x0099 }
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0099 }
            java.lang.Class<kotlin.internal.PlatformImplementations> r7 = kotlin.internal.PlatformImplementations.class
            java.lang.ClassLoader r7 = r7.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0099 }
            java.lang.ClassCastException r8 = new java.lang.ClassCastException     // Catch:{ ClassNotFoundException -> 0x0099 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0099 }
            r9.<init>()     // Catch:{ ClassNotFoundException -> 0x0099 }
            r9.append(r3)     // Catch:{ ClassNotFoundException -> 0x0099 }
            r9.append(r5)     // Catch:{ ClassNotFoundException -> 0x0099 }
            r9.append(r2)     // Catch:{ ClassNotFoundException -> 0x0099 }
            r9.append(r7)     // Catch:{ ClassNotFoundException -> 0x0099 }
            java.lang.String r5 = r9.toString()     // Catch:{ ClassNotFoundException -> 0x0099 }
            r8.<init>(r5)     // Catch:{ ClassNotFoundException -> 0x0099 }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ ClassNotFoundException -> 0x0099 }
            java.lang.Throwable r5 = r8.initCause(r6)     // Catch:{ ClassNotFoundException -> 0x0099 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)     // Catch:{ ClassNotFoundException -> 0x0099 }
            throw r5     // Catch:{ ClassNotFoundException -> 0x0099 }
        L_0x0099:
        L_0x009a:
            r5 = 65543(0x10007, float:9.1845E-41)
            if (r0 < r5) goto L_0x0128
            java.lang.String r0 = "kotlin.internal.jdk7.JDK7PlatformImplementations"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x00e4 }
            java.lang.Object r0 = r0.newInstance()     // Catch:{ ClassNotFoundException -> 0x00e4 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)     // Catch:{ ClassNotFoundException -> 0x00e4 }
            r5 = r0
            kotlin.internal.PlatformImplementations r5 = (kotlin.internal.PlatformImplementations) r5     // Catch:{ ClassCastException -> 0x00b1 }
            goto L_0x012d
        L_0x00b1:
            r5 = move-exception
            java.lang.Class r0 = r0.getClass()     // Catch:{ ClassNotFoundException -> 0x00e4 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00e4 }
            java.lang.Class<kotlin.internal.PlatformImplementations> r6 = kotlin.internal.PlatformImplementations.class
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00e4 }
            java.lang.ClassCastException r7 = new java.lang.ClassCastException     // Catch:{ ClassNotFoundException -> 0x00e4 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x00e4 }
            r8.<init>()     // Catch:{ ClassNotFoundException -> 0x00e4 }
            r8.append(r3)     // Catch:{ ClassNotFoundException -> 0x00e4 }
            r8.append(r0)     // Catch:{ ClassNotFoundException -> 0x00e4 }
            r8.append(r2)     // Catch:{ ClassNotFoundException -> 0x00e4 }
            r8.append(r6)     // Catch:{ ClassNotFoundException -> 0x00e4 }
            java.lang.String r0 = r8.toString()     // Catch:{ ClassNotFoundException -> 0x00e4 }
            r7.<init>(r0)     // Catch:{ ClassNotFoundException -> 0x00e4 }
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch:{ ClassNotFoundException -> 0x00e4 }
            java.lang.Throwable r0 = r7.initCause(r5)     // Catch:{ ClassNotFoundException -> 0x00e4 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch:{ ClassNotFoundException -> 0x00e4 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x00e4 }
        L_0x00e4:
            java.lang.String r0 = "kotlin.internal.JRE7PlatformImplementations"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0128 }
            java.lang.Object r0 = r0.newInstance()     // Catch:{ ClassNotFoundException -> 0x0128 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)     // Catch:{ ClassNotFoundException -> 0x0128 }
            r5 = r0
            kotlin.internal.PlatformImplementations r5 = (kotlin.internal.PlatformImplementations) r5     // Catch:{ ClassCastException -> 0x00f5 }
            goto L_0x012d
        L_0x00f5:
            r4 = move-exception
            java.lang.Class r0 = r0.getClass()     // Catch:{ ClassNotFoundException -> 0x0128 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0128 }
            java.lang.Class<kotlin.internal.PlatformImplementations> r5 = kotlin.internal.PlatformImplementations.class
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0128 }
            java.lang.ClassCastException r6 = new java.lang.ClassCastException     // Catch:{ ClassNotFoundException -> 0x0128 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0128 }
            r7.<init>()     // Catch:{ ClassNotFoundException -> 0x0128 }
            r7.append(r3)     // Catch:{ ClassNotFoundException -> 0x0128 }
            r7.append(r0)     // Catch:{ ClassNotFoundException -> 0x0128 }
            r7.append(r2)     // Catch:{ ClassNotFoundException -> 0x0128 }
            r7.append(r5)     // Catch:{ ClassNotFoundException -> 0x0128 }
            java.lang.String r0 = r7.toString()     // Catch:{ ClassNotFoundException -> 0x0128 }
            r6.<init>(r0)     // Catch:{ ClassNotFoundException -> 0x0128 }
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ ClassNotFoundException -> 0x0128 }
            java.lang.Throwable r0 = r6.initCause(r4)     // Catch:{ ClassNotFoundException -> 0x0128 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch:{ ClassNotFoundException -> 0x0128 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x0128 }
        L_0x0128:
            kotlin.internal.PlatformImplementations r5 = new kotlin.internal.PlatformImplementations
            r5.<init>()
        L_0x012d:
            IMPLEMENTATIONS = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.internal.PlatformImplementationsKt.<clinit>():void");
    }

    private static final int getJavaVersion() {
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return 65542;
        }
        CharSequence charSequence = property;
        int indexOf$default = StringsKt.indexOf$default(charSequence, '.', 0, false, 6, (Object) null);
        if (indexOf$default < 0) {
            try {
                return Integer.parseInt(property) * 65536;
            } catch (NumberFormatException unused) {
                return 65542;
            }
        } else {
            int i = indexOf$default + 1;
            int indexOf$default2 = StringsKt.indexOf$default(charSequence, '.', i, false, 4, (Object) null);
            if (indexOf$default2 < 0) {
                indexOf$default2 = property.length();
            }
            String substring = property.substring(0, indexOf$default);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring2 = property.substring(i, indexOf$default2);
            Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            try {
                return (Integer.parseInt(substring) * 65536) + Integer.parseInt(substring2);
            } catch (NumberFormatException unused2) {
                return 65542;
            }
        }
    }
}
