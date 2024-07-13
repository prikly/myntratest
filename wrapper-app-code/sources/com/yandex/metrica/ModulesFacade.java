package com.yandex.metrica;

import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.Mf;
import com.yandex.metrica.impl.ob.P;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u0016JA\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJW\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00072\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000eJ!\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/yandex/metrica/ModulesFacade;", "", "", "type", "", "name", "value", "", "environment", "", "reportEvent", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "extras", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "key", "setSessionExtra", "(Ljava/lang/String;[B)V", "", "isActivatedForApp", "()Z", "sendEventsBuffer", "()V", "Lcom/yandex/metrica/impl/ob/Mf;", "proxy", "setProxy", "(Lcom/yandex/metrica/impl/ob/Mf;)V", "a", "Lcom/yandex/metrica/impl/ob/Mf;", "sProxy", "<init>", "mobmetricalib_publicBinaryProdRelease"}, k = 1, mv = {1, 1, 15})
public final class ModulesFacade {

    /* renamed from: a  reason: collision with root package name */
    private static Mf f3378a;

    static {
        P g2 = P.g();
        Intrinsics.checkNotNullExpressionValue(g2, "ClientServiceLocator.getInstance()");
        ICommonExecutor c2 = g2.c();
        Intrinsics.checkNotNullExpressionValue(c2, "ClientServiceLocator.get…stance().apiProxyExecutor");
        f3378a = new Mf(c2);
    }

    private ModulesFacade() {
    }

    public static final boolean isActivatedForApp() {
        return f3378a.a();
    }

    public static final void reportEvent(int i, String str, String str2, Map<String, String> map) {
        reportEvent(i, str, str2, map, (Map<String, byte[]>) null);
    }

    public static final void sendEventsBuffer() {
        f3378a.getClass();
        YandexMetrica.sendEventsBuffer();
    }

    public static final void setSessionExtra(String str, byte[] bArr) {
        f3378a.a(str, bArr);
    }

    public final void setProxy(Mf mf) {
        f3378a = mf;
    }

    public static final void reportEvent(int i, String str, String str2, Map<String, String> map, Map<String, byte[]> map2) {
        f3378a.a(i, str, str2, map, map2);
    }
}
