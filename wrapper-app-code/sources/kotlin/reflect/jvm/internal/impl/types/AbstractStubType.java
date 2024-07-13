package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* compiled from: StubTypes.kt */
public abstract class AbstractStubType extends SimpleType {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final boolean isMarkedNullable;
    private final MemberScope memberScope;
    private final TypeConstructor originalTypeVariable;

    public abstract AbstractStubType materialize(boolean z);

    public AbstractStubType refine(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    public AbstractStubType(TypeConstructor typeConstructor, boolean z) {
        Intrinsics.checkNotNullParameter(typeConstructor, "originalTypeVariable");
        this.originalTypeVariable = typeConstructor;
        this.isMarkedNullable = z;
        MemberScope createErrorScope = ErrorUtils.createErrorScope(Intrinsics.stringPlus("Scope for stub type: ", typeConstructor));
        Intrinsics.checkNotNullExpressionValue(createErrorScope, "createErrorScope(\"Scope …: $originalTypeVariable\")");
        this.memberScope = createErrorScope;
    }

    public final TypeConstructor getOriginalTypeVariable() {
        return this.originalTypeVariable;
    }

    public boolean isMarkedNullable() {
        return this.isMarkedNullable;
    }

    public MemberScope getMemberScope() {
        return this.memberScope;
    }

    public List<TypeProjection> getArguments() {
        return CollectionsKt.emptyList();
    }

    public Annotations getAnnotations() {
        return Annotations.Companion.getEMPTY();
    }

    public SimpleType replaceAnnotations(Annotations annotations) {
        Intrinsics.checkNotNullParameter(annotations, "newAnnotations");
        return this;
    }

    public SimpleType makeNullableAsSpecified(boolean z) {
        return z == isMarkedNullable() ? this : materialize(z);
    }

    /* compiled from: StubTypes.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
