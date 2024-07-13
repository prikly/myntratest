package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0001 \u0001*\u0004\u0018\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u001cB#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u001aH\u0016¢\u0006\u0002\u0010\u001bR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;", "M", "Ljava/lang/reflect/Member;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "caller", "isDefault", "", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;Lkotlin/reflect/jvm/internal/calls/Caller;Z)V", "data", "Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$BoxUnboxData;", "member", "getMember", "()Ljava/lang/reflect/Member;", "parameterTypes", "", "Ljava/lang/reflect/Type;", "getParameterTypes", "()Ljava/util/List;", "returnType", "getReturnType", "()Ljava/lang/reflect/Type;", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "BoxUnboxData", "kotlin-reflection"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: InlineClassAwareCaller.kt */
public final class InlineClassAwareCaller<M extends Member> implements Caller<M> {
    private final Caller<M> caller;
    private final BoxUnboxData data;
    private final boolean isDefault;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0057, code lost:
        if ((r1 instanceof kotlin.reflect.jvm.internal.calls.BoundCaller) != false) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public InlineClassAwareCaller(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r11, kotlin.reflect.jvm.internal.calls.Caller<? extends M> r12, boolean r13) {
        /*
            r10 = this;
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "caller"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r10.<init>()
            r10.caller = r12
            r10.isDefault = r13
            r12 = r10
            kotlin.reflect.jvm.internal.calls.InlineClassAwareCaller r12 = (kotlin.reflect.jvm.internal.calls.InlineClassAwareCaller) r12
            kotlin.reflect.jvm.internal.impl.types.KotlinType r13 = r11.getReturnType()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r13)
            java.lang.String r0 = "descriptor.returnType!!"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r0)
            java.lang.Class r13 = kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt.toInlineClass((kotlin.reflect.jvm.internal.impl.types.KotlinType) r13)
            r0 = 0
            if (r13 != 0) goto L_0x0029
            r13 = r0
            goto L_0x002d
        L_0x0029:
            java.lang.reflect.Method r13 = kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt.getBoxMethod(r13, r11)
        L_0x002d:
            r1 = r11
            kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor) r1
            boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isGetterOfUnderlyingPropertyOfInlineClass(r1)
            r2 = 0
            if (r1 == 0) goto L_0x0046
            kotlin.reflect.jvm.internal.calls.InlineClassAwareCaller$BoxUnboxData r11 = new kotlin.reflect.jvm.internal.calls.InlineClassAwareCaller$BoxUnboxData
            kotlin.ranges.IntRange$Companion r12 = kotlin.ranges.IntRange.Companion
            kotlin.ranges.IntRange r12 = r12.getEMPTY()
            java.lang.reflect.Method[] r0 = new java.lang.reflect.Method[r2]
            r11.<init>(r12, r0, r13)
            goto L_0x0160
        L_0x0046:
            kotlin.reflect.jvm.internal.calls.Caller<M> r1 = r12.caller
            boolean r3 = r1 instanceof kotlin.reflect.jvm.internal.calls.CallerImpl.Method.BoundStatic
            java.lang.String r4 = "descriptor.containingDeclaration"
            r5 = -1
            r6 = 1
            if (r3 == 0) goto L_0x0051
            goto L_0x0077
        L_0x0051:
            boolean r3 = r11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
            if (r3 == 0) goto L_0x005a
            boolean r1 = r1 instanceof kotlin.reflect.jvm.internal.calls.BoundCaller
            if (r1 == 0) goto L_0x0076
            goto L_0x0077
        L_0x005a:
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor r1 = r11.getDispatchReceiverParameter()
            if (r1 == 0) goto L_0x0076
            kotlin.reflect.jvm.internal.calls.Caller<M> r1 = r12.caller
            boolean r1 = r1 instanceof kotlin.reflect.jvm.internal.calls.BoundCaller
            if (r1 != 0) goto L_0x0076
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r1 = r11.getContainingDeclaration()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isInlineClass(r1)
            if (r1 == 0) goto L_0x0074
            goto L_0x0076
        L_0x0074:
            r5 = 1
            goto L_0x0077
        L_0x0076:
            r5 = 0
        L_0x0077:
            boolean r1 = r12.isDefault
            if (r1 == 0) goto L_0x007d
            r1 = 2
            goto L_0x007e
        L_0x007d:
            r1 = 0
        L_0x007e:
            boolean r3 = r11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
            if (r3 == 0) goto L_0x008d
            r3 = r11
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) r3
            boolean r3 = r3.isSuspend()
            if (r3 == 0) goto L_0x008d
            r3 = 1
            goto L_0x008e
        L_0x008d:
            r3 = 0
        L_0x008e:
            int r1 = r1 + r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor r7 = r11.getExtensionReceiverParameter()
            if (r7 != 0) goto L_0x009c
            r7 = r0
            goto L_0x00a0
        L_0x009c:
            kotlin.reflect.jvm.internal.impl.types.KotlinType r7 = r7.getType()
        L_0x00a0:
            if (r7 == 0) goto L_0x00a6
            r3.add(r7)
            goto L_0x00e4
        L_0x00a6:
            boolean r7 = r11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
            if (r7 == 0) goto L_0x00ca
            r4 = r11
            kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor) r4
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r4 = r4.getConstructedClass()
            java.lang.String r7 = "descriptor.constructedClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r7)
            boolean r7 = r4.isInner()
            if (r7 == 0) goto L_0x00e4
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r4 = r4.getContainingDeclaration()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r4
            kotlin.reflect.jvm.internal.impl.types.SimpleType r4 = r4.getDefaultType()
            r3.add(r4)
            goto L_0x00e4
        L_0x00ca:
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r7 = r11.getContainingDeclaration()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r4)
            boolean r4 = r7 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
            if (r4 == 0) goto L_0x00e4
            boolean r4 = kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isInlineClass(r7)
            if (r4 == 0) goto L_0x00e4
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r7 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r7
            kotlin.reflect.jvm.internal.impl.types.SimpleType r4 = r7.getDefaultType()
            r3.add(r4)
        L_0x00e4:
            java.util.List r4 = r11.getValueParameters()
            java.lang.String r7 = "descriptor.valueParameters"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r7)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x00f3:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x010a
            java.lang.Object r7 = r4.next()
            r8 = r3
            java.util.Collection r8 = (java.util.Collection) r8
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r7 = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) r7
            kotlin.reflect.jvm.internal.impl.types.KotlinType r7 = r7.getType()
            r8.add(r7)
            goto L_0x00f3
        L_0x010a:
            r4 = r3
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.List r3 = (java.util.List) r3
            int r4 = r3.size()
            int r4 = r4 + r5
            int r4 = r4 + r1
            r1 = r12
            kotlin.reflect.jvm.internal.calls.Caller r1 = (kotlin.reflect.jvm.internal.calls.Caller) r1
            int r7 = kotlin.reflect.jvm.internal.calls.CallerKt.getArity(r1)
            if (r7 != r4) goto L_0x0163
            int r12 = java.lang.Math.max(r5, r2)
            int r1 = r3.size()
            int r1 = r1 + r5
            kotlin.ranges.IntRange r12 = kotlin.ranges.RangesKt.until(r12, r1)
            java.lang.reflect.Method[] r1 = new java.lang.reflect.Method[r4]
            r7 = 0
        L_0x012e:
            if (r7 >= r4) goto L_0x015b
            int r8 = r12.getFirst()
            int r9 = r12.getLast()
            if (r7 > r9) goto L_0x013e
            if (r8 > r7) goto L_0x013e
            r8 = 1
            goto L_0x013f
        L_0x013e:
            r8 = 0
        L_0x013f:
            if (r8 == 0) goto L_0x0155
            int r8 = r7 - r5
            java.lang.Object r8 = r3.get(r8)
            kotlin.reflect.jvm.internal.impl.types.KotlinType r8 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r8
            java.lang.Class r8 = kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt.toInlineClass((kotlin.reflect.jvm.internal.impl.types.KotlinType) r8)
            if (r8 != 0) goto L_0x0150
            goto L_0x0155
        L_0x0150:
            java.lang.reflect.Method r8 = kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt.getUnboxMethod(r8, r11)
            goto L_0x0156
        L_0x0155:
            r8 = r0
        L_0x0156:
            r1[r7] = r8
            int r7 = r7 + 1
            goto L_0x012e
        L_0x015b:
            kotlin.reflect.jvm.internal.calls.InlineClassAwareCaller$BoxUnboxData r11 = new kotlin.reflect.jvm.internal.calls.InlineClassAwareCaller$BoxUnboxData
            r11.<init>(r12, r1, r13)
        L_0x0160:
            r10.data = r11
            return
        L_0x0163:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r13 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Inconsistent number of parameters in the descriptor and Java reflection object: "
            r0.append(r2)
            int r1 = kotlin.reflect.jvm.internal.calls.CallerKt.getArity(r1)
            r0.append(r1)
            java.lang.String r1 = " != "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = "\nCalling: "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r11 = "\nParameter types: "
            r0.append(r11)
            java.util.List r11 = r12.getParameterTypes()
            r0.append(r11)
            java.lang.String r11 = ")\nDefault: "
            r0.append(r11)
            boolean r11 = r12.isDefault
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r13.<init>(r11)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.InlineClassAwareCaller.<init>(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.calls.Caller, boolean):void");
    }

    public M getMember() {
        return this.caller.getMember();
    }

    public Type getReturnType() {
        return this.caller.getReturnType();
    }

    public List<Type> getParameterTypes() {
        return this.caller.getParameterTypes();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003H\u0002J\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0002¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$BoxUnboxData;", "", "argumentRange", "Lkotlin/ranges/IntRange;", "unbox", "", "Ljava/lang/reflect/Method;", "box", "(Lkotlin/ranges/IntRange;[Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "getArgumentRange", "()Lkotlin/ranges/IntRange;", "getBox", "()Ljava/lang/reflect/Method;", "getUnbox", "()[Ljava/lang/reflect/Method;", "[Ljava/lang/reflect/Method;", "component1", "component2", "component3", "kotlin-reflection"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* compiled from: InlineClassAwareCaller.kt */
    private static final class BoxUnboxData {
        private final IntRange argumentRange;
        private final Method box;
        private final Method[] unbox;

        public BoxUnboxData(IntRange intRange, Method[] methodArr, Method method) {
            Intrinsics.checkNotNullParameter(intRange, "argumentRange");
            Intrinsics.checkNotNullParameter(methodArr, "unbox");
            this.argumentRange = intRange;
            this.unbox = methodArr;
            this.box = method;
        }

        public final IntRange component1() {
            return this.argumentRange;
        }

        public final Method[] component2() {
            return this.unbox;
        }

        public final Method component3() {
            return this.box;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0058, code lost:
        r0 = r0.invoke((java.lang.Object) null, new java.lang.Object[]{r11});
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object[] r11) {
        /*
            r10 = this;
            java.lang.String r0 = "args"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            kotlin.reflect.jvm.internal.calls.InlineClassAwareCaller$BoxUnboxData r0 = r10.data
            kotlin.ranges.IntRange r1 = r0.component1()
            java.lang.reflect.Method[] r2 = r0.component2()
            java.lang.reflect.Method r0 = r0.component3()
            int r3 = r11.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r11, r3)
            java.lang.String r4 = "copyOf(this, size)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            int r4 = r1.getFirst()
            int r1 = r1.getLast()
            r5 = 0
            if (r4 > r1) goto L_0x004f
        L_0x0028:
            int r6 = r4 + 1
            r7 = r2[r4]
            r8 = r11[r4]
            if (r7 == 0) goto L_0x0048
            if (r8 == 0) goto L_0x0039
            java.lang.Object[] r9 = new java.lang.Object[r5]
            java.lang.Object r8 = r7.invoke(r8, r9)
            goto L_0x0048
        L_0x0039:
            java.lang.Class r7 = r7.getReturnType()
            java.lang.String r8 = "method.returnType"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            java.lang.reflect.Type r7 = (java.lang.reflect.Type) r7
            java.lang.Object r8 = kotlin.reflect.jvm.internal.UtilKt.defaultPrimitiveValue(r7)
        L_0x0048:
            r3[r4] = r8
            if (r4 != r1) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r4 = r6
            goto L_0x0028
        L_0x004f:
            kotlin.reflect.jvm.internal.calls.Caller<M> r11 = r10.caller
            java.lang.Object r11 = r11.call(r3)
            if (r0 != 0) goto L_0x0058
            goto L_0x0066
        L_0x0058:
            r1 = 0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r5] = r11
            java.lang.Object r0 = r0.invoke(r1, r2)
            if (r0 != 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r11 = r0
        L_0x0066:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.InlineClassAwareCaller.call(java.lang.Object[]):java.lang.Object");
    }
}
