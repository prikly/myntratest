package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
public final class BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1$visitArray$1 implements KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor {
    final /* synthetic */ ClassDescriptor $annotationClass;
    final /* synthetic */ ClassId $annotationClassId;
    final /* synthetic */ Name $name;
    final /* synthetic */ List<AnnotationDescriptor> $result;
    /* access modifiers changed from: private */
    public final ArrayList<ConstantValue<?>> elements = new ArrayList<>();
    final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1 this$0;
    final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl this$1;

    BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1$visitArray$1(BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1 binaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1, Name name, BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl, ClassDescriptor classDescriptor, ClassId classId, List<AnnotationDescriptor> list) {
        this.this$0 = binaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1;
        this.$name = name;
        this.this$1 = binaryClassAnnotationAndConstantLoaderImpl;
        this.$annotationClass = classDescriptor;
        this.$annotationClassId = classId;
        this.$result = list;
    }

    public void visit(Object obj) {
        this.elements.add(this.this$0.createConstant(this.$name, obj));
    }

    public void visitEnum(ClassId classId, Name name) {
        Intrinsics.checkNotNullParameter(classId, "enumClassId");
        Intrinsics.checkNotNullParameter(name, "enumEntryName");
        this.elements.add(new EnumValue(classId, name));
    }

    public void visitClassLiteral(ClassLiteralValue classLiteralValue) {
        Intrinsics.checkNotNullParameter(classLiteralValue, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.elements.add(new KClassValue(classLiteralValue));
    }

    public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(ClassId classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        ArrayList arrayList = new ArrayList();
        BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl = this.this$1;
        SourceElement sourceElement = SourceElement.NO_SOURCE;
        Intrinsics.checkNotNullExpressionValue(sourceElement, "NO_SOURCE");
        KotlinJvmBinaryClass.AnnotationArgumentVisitor loadAnnotation = binaryClassAnnotationAndConstantLoaderImpl.loadAnnotation(classId, sourceElement, arrayList);
        Intrinsics.checkNotNull(loadAnnotation);
        return new BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1$visitArray$1$visitAnnotation$1(loadAnnotation, this, arrayList);
    }

    public void visitEnd() {
        ValueParameterDescriptor annotationParameterByName = DescriptorResolverUtils.getAnnotationParameterByName(this.$name, this.$annotationClass);
        if (annotationParameterByName != null) {
            Name name = this.$name;
            ConstantValueFactory constantValueFactory = ConstantValueFactory.INSTANCE;
            List<T> compact = CollectionsKt.compact(this.elements);
            KotlinType type = annotationParameterByName.getType();
            Intrinsics.checkNotNullExpressionValue(type, "parameter.type");
            this.this$0.arguments.put(name, constantValueFactory.createArrayValue((List<? extends ConstantValue<?>>) compact, type));
        } else if (this.this$1.isImplicitRepeatableContainer(this.$annotationClassId) && Intrinsics.areEqual((Object) this.$name.asString(), (Object) AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
            Collection arrayList = new ArrayList();
            for (Object next : this.elements) {
                if (next instanceof AnnotationValue) {
                    arrayList.add(next);
                }
            }
            Collection collection = this.$result;
            for (AnnotationValue value : (List) arrayList) {
                collection.add((AnnotationDescriptor) value.getValue());
            }
        }
    }
}
