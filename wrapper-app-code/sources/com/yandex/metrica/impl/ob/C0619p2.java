package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Ui;
import com.yandex.metrica.networktasks.api.NetworkResponseHandler;
import com.yandex.metrica.networktasks.api.ResponseDataHolder;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.p2  reason: case insensitive filesystem */
public class C0619p2 implements NetworkResponseHandler<Ui> {

    /* renamed from: a  reason: collision with root package name */
    private final Ti f6423a;

    /* renamed from: b  reason: collision with root package name */
    private final C0769v9 f6424b;

    public C0619p2() {
        this(new Ti(), new C0769v9());
    }

    public Object handle(ResponseDataHolder responseDataHolder) {
        if (200 != responseDataHolder.getResponseCode()) {
            return null;
        }
        byte[] responseData = responseDataHolder.getResponseData();
        Map responseHeaders = responseDataHolder.getResponseHeaders();
        List list = responseHeaders != null ? (List) responseHeaders.get("Content-Encoding") : null;
        if (!A2.b((Collection) list) && "encrypted".equals(list.get(0))) {
            responseData = this.f6424b.a(responseDataHolder.getResponseData(), "hBnBQbZrmjPXEWVJ");
        }
        if (responseData == null) {
            return null;
        }
        Ui a2 = this.f6423a.a(responseData);
        if (Ui.a.OK == a2.A()) {
            return a2;
        }
        return null;
    }

    C0619p2(Ti ti, C0769v9 v9Var) {
        this.f6423a = ti;
        this.f6424b = v9Var;
    }
}
