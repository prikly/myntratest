package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;

/* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
public final class BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1 implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {
    final /* synthetic */ ClassDescriptor $annotationClass;
    final /* synthetic */ ClassId $annotationClassId;
    final /* synthetic */ List<AnnotationDescriptor> $result;
    final /* synthetic */ SourceElement $source;
    /* access modifiers changed from: private */
    public final HashMap<Name, ConstantValue<?>> arguments = new HashMap<>();
    final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl this$0;

    BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1(BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl, ClassDescriptor classDescriptor, ClassId classId, List<AnnotationDescriptor> list, SourceElement sourceElement) {
        this.this$0 = binaryClassAnnotationAndConstantLoaderImpl;
        this.$annotationClass = classDescriptor;
        this.$annotationClassId = classId;
        this.$result = list;
        this.$source = sourceElement;
    }

    public void visit(Name name, Object obj) {
        if (name != null) {
            this.arguments.put(name, createConstant(name, obj));
        }
    }

    public void visitClassLiteral(Name name, ClassLiteralValue classLiteralValue) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(classLiteralValue, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.arguments.put(name, new KClassValue(classLiteralValue));
    }

    public void visitEnum(Name name, ClassId classId, Name name2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(classId, "enumClassId");
        Intrinsics.checkNotNullParameter(name2, "enumEntryName");
        this.arguments.put(name, new EnumValue(classId, name2));
    }

    public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1$visitArray$1(this, name, this.this$0, this.$annotationClass, this.$annotationClassId, this.$result);
    }

    public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(Name name, ClassId classId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(classId, "classId");
        ArrayList arrayList = new ArrayList();
        BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl = this.this$0;
        SourceElement sourceElement = SourceElement.NO_SOURCE;
        Intrinsics.checkNotNullExpressionValue(sourceElement, "NO_SOURCE");
        KotlinJvmBinaryClass.AnnotationArgumentVisitor loadAnnotation = binaryClassAnnotationAndConstantLoaderImpl.loadAnnotation(classId, sourceElement, arrayList);
        Intrinsics.checkNotNull(loadAnnotation);
        return new BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1$visitAnnotation$1(loadAnnotation, this, name, arrayList);
    }

    public void visitEnd() {
        if (!this.this$0.isRepeatableWithImplicitContainer(this.$annotationClassId, this.arguments) && !this.this$0.isImplicitRepeatableContainer(this.$annotationClassId)) {
            this.$result.add(new AnnotationDescriptorImpl(this.$annotationClass.getDefaultType(), this.arguments, this.$source));
        }
    }

    /* access modifiers changed from: private */
    public final ConstantValue<?> createConstant(Name name, Object obj) {
        ConstantValue<?> createConstantValue = ConstantValueFactory.INSTANCE.createConstantValue(obj);
        return createConstantValue == null ? ErrorValue.Companion.create(Intrinsics.stringPlus("Unsupported annotation argument: ", name)) : createConstantValue;
    }
}
