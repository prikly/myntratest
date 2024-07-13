package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/lang/Class;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* compiled from: KPackageImpl.kt */
final class KPackageImpl$Data$multifileFacade$2 extends Lambda implements Function0<Class<?>> {
    final /* synthetic */ KPackageImpl.Data this$0;
    final /* synthetic */ KPackageImpl this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    KPackageImpl$Data$multifileFacade$2(KPackageImpl.Data data, KPackageImpl kPackageImpl) {
        super(0);
        this.this$0 = data;
        this.this$1 = kPackageImpl;
    }

    public final Class<?> invoke() {
        ReflectKotlinClass access$getKotlinClass = this.this$0.getKotlinClass();
        String multifileClassName = access$getKotlinClass == null ? null : access$getKotlinClass.getClassHeader().getMultifileClassName();
        if (multifileClassName == null) {
            return null;
        }
        if (multifileClassName.length() > 0) {
            return this.this$1.getJClass().getClassLoader().loadClass(StringsKt.replace$default(multifileClassName, '/', '.', false, 4, (Object) null));
        }
        return null;
    }
}
