package com.yandex.metrica.impl.ob;

import android.net.Uri;
import com.appodeal.ads.modules.common.internal.Constants;
import com.onesignal.outcomes.OSOutcomeConstants;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import com.yandex.metrica.networktasks.api.IParamsAppender;
import com.yandex.metrica.networktasks.api.NetworkTaskForSendingDataParamsAppender;
import com.yandex.metrica.networktasks.api.RequestBodyEncrypter;

public class Pg implements IParamsAppender<C0406gd> {

    /* renamed from: a  reason: collision with root package name */
    private final Ng f4780a;

    /* renamed from: b  reason: collision with root package name */
    private final NetworkTaskForSendingDataParamsAppender f4781b;

    /* renamed from: c  reason: collision with root package name */
    private long f4782c;

    public Pg(RequestBodyEncrypter requestBodyEncrypter) {
        this(new Ng(), new NetworkTaskForSendingDataParamsAppender(requestBodyEncrypter));
    }

    public void a(long j) {
        this.f4782c = j;
    }

    public void appendParams(Uri.Builder builder, Object obj) {
        C0406gd gdVar = (C0406gd) obj;
        this.f4781b.appendEncryptedData(builder);
        NetworkTaskForSendingDataParamsAppender networkTaskForSendingDataParamsAppender = this.f4781b;
        gdVar.getClass();
        networkTaskForSendingDataParamsAppender.appendCommitHash(builder, "a72bf6f57701ed3c2b8ed570054febbff4e58c12", gdVar.j());
        builder.appendPath("location");
        builder.appendQueryParameter("deviceid", gdVar.g());
        builder.appendQueryParameter(OSOutcomeConstants.DEVICE_TYPE, gdVar.i());
        builder.appendQueryParameter(Constants.UUID, gdVar.w());
        builder.appendQueryParameter("analytics_sdk_version_name", "5.3.0");
        builder.appendQueryParameter("analytics_sdk_build_number", "45003240");
        builder.appendQueryParameter("analytics_sdk_build_type", gdVar.j());
        builder.appendQueryParameter("app_version_name", gdVar.f());
        builder.appendQueryParameter("app_build_number", gdVar.b());
        builder.appendQueryParameter("os_version", gdVar.o());
        builder.appendQueryParameter("os_api_level", String.valueOf(gdVar.n()));
        builder.appendQueryParameter("is_rooted", gdVar.h());
        builder.appendQueryParameter("app_framework", gdVar.c());
        builder.appendQueryParameter(OSOutcomeConstants.APP_ID, gdVar.p());
        builder.appendQueryParameter("app_platform", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        builder.appendQueryParameter("request_id", String.valueOf(this.f4782c));
        builder.appendQueryParameter("app_set_id", gdVar.d());
        builder.appendQueryParameter("app_set_id_scope", gdVar.e());
        this.f4780a.appendParams(builder, gdVar.a());
    }

    Pg(Ng ng, NetworkTaskForSendingDataParamsAppender networkTaskForSendingDataParamsAppender) {
        this.f4780a = ng;
        this.f4781b = networkTaskForSendingDataParamsAppender;
    }
}
