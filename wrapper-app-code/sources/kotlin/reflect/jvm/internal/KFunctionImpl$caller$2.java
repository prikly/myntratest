package kotlin.reflect.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.JvmFunctionSignature;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.CallerImpl;
import kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0012\u0012\u0002\b\u0003 \u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/calls/Caller;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* compiled from: KFunctionImpl.kt */
final class KFunctionImpl$caller$2 extends Lambda implements Function0<Caller<? extends Member>> {
    final /* synthetic */ KFunctionImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    KFunctionImpl$caller$2(KFunctionImpl kFunctionImpl) {
        super(0);
        this.this$0 = kFunctionImpl;
    }

    public final Caller<Member> invoke() {
        Member member;
        CallerImpl callerImpl;
        CallerImpl.Method method;
        JvmFunctionSignature mapSignature = RuntimeTypeMapper.INSTANCE.mapSignature(this.this$0.getDescriptor());
        if (mapSignature instanceof JvmFunctionSignature.KotlinConstructor) {
            if (this.this$0.isAnnotationConstructor()) {
                Class<?> jClass = this.this$0.getContainer().getJClass();
                Iterable<KParameter> parameters = this.this$0.getParameters();
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(parameters, 10));
                for (KParameter name : parameters) {
                    String name2 = name.getName();
                    Intrinsics.checkNotNull(name2);
                    arrayList.add(name2);
                }
                return new AnnotationConstructorCaller(jClass, (List) arrayList, AnnotationConstructorCaller.CallMode.POSITIONAL_CALL, AnnotationConstructorCaller.Origin.KOTLIN, (List) null, 16, (DefaultConstructorMarker) null);
            }
            member = this.this$0.getContainer().findConstructorBySignature(((JvmFunctionSignature.KotlinConstructor) mapSignature).getConstructorDesc());
        } else if (mapSignature instanceof JvmFunctionSignature.KotlinFunction) {
            JvmFunctionSignature.KotlinFunction kotlinFunction = (JvmFunctionSignature.KotlinFunction) mapSignature;
            member = this.this$0.getContainer().findMethodBySignature(kotlinFunction.getMethodName(), kotlinFunction.getMethodDesc());
        } else if (mapSignature instanceof JvmFunctionSignature.JavaMethod) {
            member = ((JvmFunctionSignature.JavaMethod) mapSignature).getMethod();
        } else if (mapSignature instanceof JvmFunctionSignature.JavaConstructor) {
            member = ((JvmFunctionSignature.JavaConstructor) mapSignature).getConstructor();
        } else if (mapSignature instanceof JvmFunctionSignature.FakeJavaAnnotationConstructor) {
            List<Method> methods = ((JvmFunctionSignature.FakeJavaAnnotationConstructor) mapSignature).getMethods();
            Class<?> jClass2 = this.this$0.getContainer().getJClass();
            Iterable<Method> iterable = methods;
            Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (Method name3 : iterable) {
                arrayList2.add(name3.getName());
            }
            return new AnnotationConstructorCaller(jClass2, (List) arrayList2, AnnotationConstructorCaller.CallMode.POSITIONAL_CALL, AnnotationConstructorCaller.Origin.JAVA, methods);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (member instanceof Constructor) {
            KFunctionImpl kFunctionImpl = this.this$0;
            callerImpl = kFunctionImpl.createConstructorCaller((Constructor) member, kFunctionImpl.getDescriptor());
        } else if (member instanceof Method) {
            Method method2 = (Method) member;
            if (!Modifier.isStatic(method2.getModifiers())) {
                method = this.this$0.createInstanceMethodCaller(method2);
            } else if (this.this$0.getDescriptor().getAnnotations().findAnnotation(UtilKt.getJVM_STATIC()) != null) {
                method = this.this$0.createJvmStaticInObjectCaller(method2);
            } else {
                method = this.this$0.createStaticMethodCaller(method2);
            }
            callerImpl = method;
        } else {
            throw new KotlinReflectionInternalError("Could not compute caller for function: " + this.this$0.getDescriptor() + " (member = " + member + ')');
        }
        return InlineClassAwareCallerKt.createInlineClassAwareCallerIfNeeded$default(callerImpl, this.this$0.getDescriptor(), false, 2, (Object) null);
    }
}
