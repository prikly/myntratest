package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* compiled from: KClassImpl.kt */
final class KClassImpl$Data$qualifiedName$2 extends Lambda implements Function0<String> {
    final /* synthetic */ KClassImpl<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    KClassImpl$Data$qualifiedName$2(KClassImpl<T> kClassImpl) {
        super(0);
        this.this$0 = kClassImpl;
    }

    public final String invoke() {
        if (this.this$0.getJClass().isAnonymousClass()) {
            return null;
        }
        ClassId access$getClassId = this.this$0.getClassId();
        if (access$getClassId.isLocal()) {
            return null;
        }
        return access$getClassId.asSingleFqName().asString();
    }
}