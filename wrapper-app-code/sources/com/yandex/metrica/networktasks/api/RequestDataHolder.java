package com.yandex.metrica.networktasks.api;

import com.yandex.metrica.networktasks.api.NetworkTask;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class RequestDataHolder {

    /* renamed from: a  reason: collision with root package name */
    private NetworkTask.Method f7321a = NetworkTask.Method.GET;

    /* renamed from: b  reason: collision with root package name */
    private final Map f7322b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private byte[] f7323c = null;

    /* renamed from: d  reason: collision with root package name */
    private Long f7324d;

    /* renamed from: e  reason: collision with root package name */
    private Integer f7325e;

    public void applySendTime(long j) {
        this.f7324d = Long.valueOf(j);
        this.f7325e = Integer.valueOf(((GregorianCalendar) GregorianCalendar.getInstance()).getTimeZone().getOffset(TimeUnit.MILLISECONDS.toSeconds(j) * 1000) / 1000);
    }

    public Map getHeaders() {
        return this.f7322b;
    }

    public NetworkTask.Method getMethod() {
        return this.f7321a;
    }

    public byte[] getPostData() {
        return this.f7323c;
    }

    public Long getSendTimestamp() {
        return this.f7324d;
    }

    public Integer getSendTimezoneSec() {
        return this.f7325e;
    }

    public void setHeader(String str, String... strArr) {
        this.f7322b.put(str, Arrays.asList(strArr));
    }

    public void setPostData(byte[] bArr) {
        this.f7321a = NetworkTask.Method.POST;
        this.f7323c = bArr;
    }
}
