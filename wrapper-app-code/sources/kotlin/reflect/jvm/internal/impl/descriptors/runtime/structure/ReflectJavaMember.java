package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaModifierListOwner;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;

/* compiled from: ReflectJavaMember.kt */
public abstract class ReflectJavaMember extends ReflectJavaElement implements ReflectJavaAnnotationOwner, ReflectJavaModifierListOwner, JavaMember {
    public abstract Member getMember();

    public ReflectJavaAnnotation findAnnotation(FqName fqName) {
        return ReflectJavaAnnotationOwner.DefaultImpls.findAnnotation(this, fqName);
    }

    public List<ReflectJavaAnnotation> getAnnotations() {
        return ReflectJavaAnnotationOwner.DefaultImpls.getAnnotations(this);
    }

    public Visibility getVisibility() {
        return ReflectJavaModifierListOwner.DefaultImpls.getVisibility(this);
    }

    public boolean isAbstract() {
        return ReflectJavaModifierListOwner.DefaultImpls.isAbstract(this);
    }

    public boolean isDeprecatedInJavaDoc() {
        return ReflectJavaAnnotationOwner.DefaultImpls.isDeprecatedInJavaDoc(this);
    }

    public boolean isFinal() {
        return ReflectJavaModifierListOwner.DefaultImpls.isFinal(this);
    }

    public boolean isStatic() {
        return ReflectJavaModifierListOwner.DefaultImpls.isStatic(this);
    }

    public AnnotatedElement getElement() {
        return (AnnotatedElement) getMember();
    }

    public int getModifiers() {
        return getMember().getModifiers();
    }

    public Name getName() {
        String name = getMember().getName();
        if (name == null) {
            return SpecialNames.NO_NAME_PROVIDED;
        }
        Name identifier = Name.identifier(name);
        Intrinsics.checkNotNullExpressionValue(identifier, "member.name?.let { Name.…ialNames.NO_NAME_PROVIDED");
        return identifier;
    }

    public ReflectJavaClass getContainingClass() {
        Class<?> declaringClass = getMember().getDeclaringClass();
        Intrinsics.checkNotNullExpressionValue(declaringClass, "member.declaringClass");
        return new ReflectJavaClass(declaringClass);
    }

    /* access modifiers changed from: protected */
    public final List<JavaValueParameter> getValueParameters(Type[] typeArr, Annotation[][] annotationArr, boolean z) {
        int i;
        String str;
        Intrinsics.checkNotNullParameter(typeArr, "parameterTypes");
        Intrinsics.checkNotNullParameter(annotationArr, "parameterAnnotations");
        ArrayList arrayList = new ArrayList(typeArr.length);
        List<String> loadParameterNames = Java8ParameterNamesLoader.INSTANCE.loadParameterNames(getMember());
        if (loadParameterNames == null) {
            i = 0;
        } else {
            i = loadParameterNames.size() - typeArr.length;
        }
        int length = typeArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            ReflectJavaType create = ReflectJavaType.Factory.create(typeArr[i2]);
            if (loadParameterNames == null) {
                str = null;
            } else {
                str = (String) CollectionsKt.getOrNull(loadParameterNames, i2 + i);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i2 + '+' + i + " (name=" + getName() + " type=" + create + ") in " + this).toString());
                }
            }
            arrayList.add(new ReflectJavaValueParameter(create, annotationArr[i2], str, z && i2 == ArraysKt.getLastIndex((T[]) typeArr)));
            i2 = i3;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ReflectJavaMember) && Intrinsics.areEqual((Object) getMember(), (Object) ((ReflectJavaMember) obj).getMember());
    }

    public int hashCode() {
        return getMember().hashCode();
    }

    public String toString() {
        return getClass().getName() + ": " + getMember();
    }
}
