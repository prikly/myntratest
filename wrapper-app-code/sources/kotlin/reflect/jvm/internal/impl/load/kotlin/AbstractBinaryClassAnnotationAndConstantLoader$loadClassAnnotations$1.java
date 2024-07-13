package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
public final class AbstractBinaryClassAnnotationAndConstantLoader$loadClassAnnotations$1 implements KotlinJvmBinaryClass.AnnotationVisitor {
    final /* synthetic */ ArrayList<A> $result;
    final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader<A, C> this$0;

    public void visitEnd() {
    }

    AbstractBinaryClassAnnotationAndConstantLoader$loadClassAnnotations$1(AbstractBinaryClassAnnotationAndConstantLoader<A, C> abstractBinaryClassAnnotationAndConstantLoader, ArrayList<A> arrayList) {
        this.this$0 = abstractBinaryClassAnnotationAndConstantLoader;
        this.$result = arrayList;
    }

    public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(ClassId classId, SourceElement sourceElement) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(sourceElement, "source");
        return this.this$0.loadAnnotationIfNotSpecial(classId, sourceElement, this.$result);
    }
}
