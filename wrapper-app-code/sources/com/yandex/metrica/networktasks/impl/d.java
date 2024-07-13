package com.yandex.metrica.networktasks.impl;

import android.text.TextUtils;
import com.yandex.metrica.network.NetworkClient;
import com.yandex.metrica.network.Request;
import com.yandex.metrica.network.Response;
import com.yandex.metrica.networktasks.api.FullUrlFormer;
import com.yandex.metrica.networktasks.api.NetworkTask;
import com.yandex.metrica.networktasks.api.RequestDataHolder;
import com.yandex.metrica.networktasks.api.ResponseDataHolder;
import com.yandex.metrica.networktasks.api.UnderlyingNetworkTask;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class d {
    private final void a(Request.Builder builder, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            builder.addHeader((String) entry.getKey(), CollectionsKt.joinToString$default((Iterable) entry.getValue(), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        }
    }

    public final boolean a(NetworkTask networkTask) {
        byte[] postData;
        Intrinsics.checkNotNullParameter(networkTask, "task");
        String str = null;
        if (networkTask.onPerformRequest()) {
            String url = networkTask.getUrl();
            if (url == null || TextUtils.isEmpty(StringsKt.trim(url).toString())) {
                StringBuilder sb = new StringBuilder();
                sb.append("Task ");
                sb.append(networkTask.description());
                sb.append(" url is `");
                sb.append(url);
                sb.append("`. ");
                sb.append("All hosts = ");
                UnderlyingNetworkTask underlyingTask = networkTask.getUnderlyingTask();
                Intrinsics.checkNotNullExpressionValue(underlyingTask, "task.underlyingTask");
                FullUrlFormer fullUrlFormer = underlyingTask.getFullUrlFormer();
                Intrinsics.checkNotNullExpressionValue(fullUrlFormer, "task.underlyingTask.fullUrlFormer");
                List allHosts = fullUrlFormer.getAllHosts();
                if (allHosts != null) {
                    str = allHosts.toString();
                }
                sb.append(str);
                networkTask.onRequestError(new IllegalArgumentException(sb.toString()));
                return false;
            }
            Request.Builder addHeader = new Request.Builder(url).addHeader("Accept", "application/json").addHeader("User-Agent", networkTask.getUserAgent());
            Intrinsics.checkNotNullExpressionValue(addHeader, "Request.Builder(url)\n   …erAgent\n                )");
            RequestDataHolder requestDataHolder = networkTask.getRequestDataHolder();
            Intrinsics.checkNotNullExpressionValue(requestDataHolder, "task.requestDataHolder");
            Map headers = requestDataHolder.getHeaders();
            Intrinsics.checkNotNullExpressionValue(headers, "requestDataHolder.headers");
            a(addHeader, headers);
            if (NetworkTask.Method.POST == requestDataHolder.getMethod() && (postData = requestDataHolder.getPostData()) != null) {
                if (!(postData.length == 0)) {
                    addHeader.post(postData);
                    Long sendTimestamp = requestDataHolder.getSendTimestamp();
                    if (sendTimestamp != null) {
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        Intrinsics.checkNotNullExpressionValue(sendTimestamp, "it");
                        addHeader.addHeader("Send-Timestamp", String.valueOf(timeUnit.toSeconds(sendTimestamp.longValue())));
                    }
                    Integer sendTimezoneSec = requestDataHolder.getSendTimezoneSec();
                    if (sendTimezoneSec != null) {
                        addHeader.addHeader("Send-Timezone", String.valueOf(sendTimezoneSec.intValue()));
                    }
                }
            }
            NetworkClient.Builder builder = new NetworkClient.Builder();
            int i = a.f7346a;
            NetworkClient build = builder.withConnectTimeout(i).withReadTimeout(i).withSslSocketFactory(networkTask.getSslSocketFactory()).build();
            Intrinsics.checkNotNullExpressionValue(build, "NetworkClient.Builder()\n…\n                .build()");
            Response execute = build.newCall(addHeader.build()).execute();
            Intrinsics.checkNotNullExpressionValue(execute, "client.newCall(requestBuilder.build()).execute()");
            int code = execute.getCode();
            ResponseDataHolder responseDataHolder = networkTask.getResponseDataHolder();
            Intrinsics.checkNotNullExpressionValue(responseDataHolder, "task.responseDataHolder");
            responseDataHolder.setResponseCode(code);
            responseDataHolder.setResponseHeaders(execute.getHeaders());
            if (responseDataHolder.isValidResponse()) {
                responseDataHolder.setResponseData(execute.getResponseData());
            }
            if (execute.isCompleted()) {
                return networkTask.onRequestComplete();
            }
            networkTask.onRequestError(execute.getException());
        } else {
            networkTask.onRequestError((Throwable) null);
        }
        return false;
    }
}
