package com.appodeal.ads.modules.libs.network;

import com.appodeal.ads.modules.libs.network.HttpClient;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001Jq\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2%\u0010\u000b\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0006\u0012\u0004\u0018\u0001H\u00040\f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Lcom/appodeal/ads/modules/libs/network/Networking;", "", "enqueue", "Lkotlin/Result;", "Response", "method", "Lcom/appodeal/ads/modules/libs/network/HttpClient$Method;", "url", "", "body", "", "parser", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "response", "useUniqueRequestId", "", "enqueue-yxL6bBk", "(Lcom/appodeal/ads/modules/libs/network/HttpClient$Method;Ljava/lang/String;[BLkotlin/jvm/functions/Function1;Z)Ljava/lang/Object;", "apd_network"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface Networking {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        /* renamed from: enqueue-yxL6bBk$default  reason: not valid java name */
        public static /* synthetic */ Object m150enqueueyxL6bBk$default(Networking networking, HttpClient.Method method, String str, byte[] bArr, Function1 function1, boolean z, int i, Object obj) {
            if (obj == null) {
                return networking.m149enqueueyxL6bBk(method, str, bArr, function1, (i & 16) != 0 ? false : z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueue-yxL6bBk");
        }
    }

    /* renamed from: enqueue-yxL6bBk  reason: not valid java name */
    <Response> Object m149enqueueyxL6bBk(HttpClient.Method method, String str, byte[] bArr, Function1<? super byte[], ? extends Response> function1, boolean z);
}
