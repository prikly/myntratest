package com.yandex.metrica.impl.ob;

import android.net.Uri;
import android.text.TextUtils;
import com.appodeal.ads.modules.common.internal.Constants;
import com.onesignal.outcomes.OSOutcomeConstants;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import com.yandex.metrica.networktasks.api.IParamsAppender;
import com.yandex.metrica.networktasks.api.NetworkTaskForSendingDataParamsAppender;
import com.yandex.metrica.networktasks.api.RequestBodyEncrypter;

public class Qg implements IParamsAppender<Lg> {

    /* renamed from: a  reason: collision with root package name */
    private final Ng f4827a;

    /* renamed from: b  reason: collision with root package name */
    private final NetworkTaskForSendingDataParamsAppender f4828b;

    /* renamed from: c  reason: collision with root package name */
    private Ig f4829c;

    /* renamed from: d  reason: collision with root package name */
    private long f4830d;

    public Qg(RequestBodyEncrypter requestBodyEncrypter) {
        this(new Ng(), new NetworkTaskForSendingDataParamsAppender(requestBodyEncrypter));
    }

    public void a(Ig ig) {
        this.f4829c = ig;
    }

    public void appendParams(Uri.Builder builder, Object obj) {
        Lg lg = (Lg) obj;
        builder.path("report");
        this.f4828b.appendEncryptedData(builder);
        Ig ig = this.f4829c;
        if (ig != null) {
            this.f4828b.appendCommitHash(builder, ig.p, ig.f4266f);
            builder.appendQueryParameter("deviceid", C0267b.a(this.f4829c.f4261a, lg.g()));
            builder.appendQueryParameter(Constants.UUID, C0267b.a(this.f4829c.f4262b, lg.w()));
            a(builder, "analytics_sdk_version", this.f4829c.f4263c);
            a(builder, "analytics_sdk_version_name", this.f4829c.f4264d);
            builder.appendQueryParameter("app_version_name", C0267b.a(this.f4829c.f4267g, lg.f()));
            builder.appendQueryParameter("app_build_number", C0267b.a(this.f4829c.i, lg.b()));
            builder.appendQueryParameter("os_version", C0267b.a(this.f4829c.j, lg.o()));
            a(builder, "os_api_level", this.f4829c.k);
            a(builder, "analytics_sdk_build_number", this.f4829c.f4265e);
            a(builder, "analytics_sdk_build_type", this.f4829c.f4266f);
            a(builder, "app_debuggable", this.f4829c.f4268h);
            builder.appendQueryParameter("locale", C0267b.a(this.f4829c.l, lg.k()));
            builder.appendQueryParameter("is_rooted", C0267b.a(this.f4829c.m, lg.h()));
            builder.appendQueryParameter("app_framework", C0267b.a(this.f4829c.n, lg.c()));
            a(builder, "attribution_id", this.f4829c.o);
        }
        builder.appendQueryParameter("api_key_128", lg.B());
        builder.appendQueryParameter(OSOutcomeConstants.APP_ID, lg.p());
        builder.appendQueryParameter("app_platform", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        builder.appendQueryParameter("model", lg.m());
        builder.appendQueryParameter("manufacturer", lg.l());
        builder.appendQueryParameter("screen_width", String.valueOf(lg.u()));
        builder.appendQueryParameter("screen_height", String.valueOf(lg.t()));
        builder.appendQueryParameter("screen_dpi", String.valueOf(lg.s()));
        builder.appendQueryParameter("scalefactor", String.valueOf(lg.r()));
        builder.appendQueryParameter(OSOutcomeConstants.DEVICE_TYPE, lg.i());
        a(builder, "clids_set", lg.E());
        builder.appendQueryParameter("app_set_id", lg.d());
        builder.appendQueryParameter("app_set_id_scope", lg.e());
        this.f4827a.appendParams(builder, lg.a());
        builder.appendQueryParameter("request_id", String.valueOf(this.f4830d));
    }

    Qg(Ng ng, NetworkTaskForSendingDataParamsAppender networkTaskForSendingDataParamsAppender) {
        this.f4827a = ng;
        this.f4828b = networkTaskForSendingDataParamsAppender;
    }

    public void a(long j) {
        this.f4830d = j;
    }

    private void a(Uri.Builder builder, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            builder.appendQueryParameter(str, str2);
        }
    }
}
