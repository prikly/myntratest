package com.yandex.metrica.impl.ob;

import com.yandex.metrica.IParamsCallback;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

public final class Wh {

    /* renamed from: a  reason: collision with root package name */
    private Xh f5265a = new Xh();

    public final synchronized Xh a() {
        return this.f5265a;
    }

    public final synchronized void a(Xh xh) {
        this.f5265a = xh;
    }

    public final W0 a(String str) {
        Boolean b2;
        String str2;
        Xh xh = this.f5265a;
        if (str.hashCode() != 949037879 || !str.equals(IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED) || (b2 = xh.b()) == null) {
            return null;
        }
        boolean booleanValue = b2.booleanValue();
        U0 c2 = xh.c();
        String a2 = xh.a();
        if (booleanValue) {
            str2 = "true";
        } else if (!booleanValue) {
            str2 = "false";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return new W0(str2, c2, a2);
    }

    public final synchronized void a(List<String> list, Map<String, W0> map) {
        Boolean b2;
        String str;
        for (String str2 : list) {
            if (str2.hashCode() == 949037879) {
                if (str2.equals(IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED) && (b2 = this.f5265a.b()) != null) {
                    boolean booleanValue = b2.booleanValue();
                    U0 c2 = this.f5265a.c();
                    String a2 = this.f5265a.a();
                    if (booleanValue) {
                        str = "true";
                    } else if (!booleanValue) {
                        str = "false";
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    map.put(IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED, new W0(str, c2, a2));
                }
            }
        }
    }
}
