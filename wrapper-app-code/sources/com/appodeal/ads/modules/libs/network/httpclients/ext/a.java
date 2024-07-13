package com.appodeal.ads.modules.libs.network.httpclients.ext;

import com.appodeal.ads.modules.libs.network.HttpClient;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

public final class a {

    /* renamed from: com.appodeal.ads.modules.libs.network.httpclients.ext.a$a  reason: collision with other inner class name */
    public /* synthetic */ class C0186a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HttpClient.Method.values().length];
            iArr[HttpClient.Method.GET.ordinal()] = 1;
            iArr[HttpClient.Method.POST.ordinal()] = 2;
            iArr[HttpClient.Method.PUT.ordinal()] = 3;
            iArr[HttpClient.Method.DELETE.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String a(HttpClient.Method method) {
        Intrinsics.checkNotNullParameter(method, "<this>");
        int i = C0186a.$EnumSwitchMapping$0[method.ordinal()];
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "PUT";
        }
        if (i == 4) {
            return "DELETE";
        }
        throw new NoWhenBranchMatchedException();
    }
}
