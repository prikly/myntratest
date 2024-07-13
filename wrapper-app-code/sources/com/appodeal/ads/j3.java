package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.networking.binders.b;
import com.onesignal.outcomes.OSOutcomeConstants;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import io.bidmachine.utils.IabUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class j3 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f16494a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j3(b bVar) {
        super(1);
        this.f16494a = bVar;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        jsonObjectBuilder.hasValue("app_key", ((b.e) this.f16494a).c());
        jsonObjectBuilder.hasValue(ServiceProvider.NAMED_SDK, ((b.e) this.f16494a).E());
        jsonObjectBuilder.hasValue("os", ((b.e) this.f16494a).r());
        jsonObjectBuilder.hasValue("os_version", ((b.e) this.f16494a).s());
        jsonObjectBuilder.hasValue("osv", ((b.e) this.f16494a).t());
        jsonObjectBuilder.hasValue("platform", ((b.e) this.f16494a).w());
        jsonObjectBuilder.hasValue(MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID, ((b.e) this.f16494a).a());
        jsonObjectBuilder.hasValue("android_level", Integer.valueOf(((b.e) this.f16494a).b()));
        jsonObjectBuilder.hasValue("secure_android_id", ((b.e) this.f16494a).F());
        jsonObjectBuilder.hasValue("package", ((b.e) this.f16494a).u());
        jsonObjectBuilder.hasValue("package_version", ((b.e) this.f16494a).v());
        jsonObjectBuilder.hasValue("install_time", ((b.e) this.f16494a).o());
        jsonObjectBuilder.hasValue("installer", ((b.e) this.f16494a).p());
        jsonObjectBuilder.hasValue("framework", ((b.e) this.f16494a).d());
        jsonObjectBuilder.hasValue("framework_version", ((b.e) this.f16494a).e());
        jsonObjectBuilder.hasValue("plugins_version", ((b.e) this.f16494a).f());
        jsonObjectBuilder.hasValue("pxratio", Double.valueOf(((b.e) this.f16494a).C()));
        jsonObjectBuilder.hasValue(OSOutcomeConstants.DEVICE_TYPE, ((b.e) this.f16494a).l());
        jsonObjectBuilder.hasValue("http_allowed", Boolean.valueOf(((b.e) this.f16494a).n()));
        jsonObjectBuilder.hasValue("manufacturer", ((b.e) this.f16494a).q());
        jsonObjectBuilder.hasValue("model", ((b.e) this.f16494a).k());
        jsonObjectBuilder.hasValue("rooted", Boolean.valueOf(((b.e) this.f16494a).A()));
        jsonObjectBuilder.hasValue("webview_version", ((b.e) this.f16494a).K());
        jsonObjectBuilder.hasValue(IabUtils.KEY_WIDTH, Integer.valueOf(((b.e) this.f16494a).D()));
        jsonObjectBuilder.hasValue(IabUtils.KEY_HEIGHT, Integer.valueOf(((b.e) this.f16494a).B()));
        jsonObjectBuilder.hasValue("crr", ((b.e) this.f16494a).j());
        jsonObjectBuilder.hasValue("battery", Double.valueOf(((b.e) this.f16494a).g()));
        jsonObjectBuilder.hasValue("storage_size", Long.valueOf(((b.e) this.f16494a).H()));
        jsonObjectBuilder.hasValue("storage_free", Long.valueOf(((b.e) this.f16494a).G()));
        jsonObjectBuilder.hasValue("storage_used", Long.valueOf(((b.e) this.f16494a).I()));
        jsonObjectBuilder.hasValue("ram_size", Long.valueOf(((b.e) this.f16494a).y()));
        jsonObjectBuilder.hasValue("ram_free", Long.valueOf(((b.e) this.f16494a).x()));
        jsonObjectBuilder.hasValue("ram_used", Long.valueOf(((b.e) this.f16494a).z()));
        jsonObjectBuilder.hasValue("cpu_usage", Double.valueOf(((b.e) this.f16494a).i()));
        jsonObjectBuilder.hasValue("coppa", Boolean.valueOf(((b.e) this.f16494a).h()));
        jsonObjectBuilder.hasValue("test", ((b.e) this.f16494a).J());
        jsonObjectBuilder.hasObject("ext", ((b.e) this.f16494a).m());
        return Unit.INSTANCE;
    }
}
