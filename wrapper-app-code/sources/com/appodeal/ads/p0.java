package com.appodeal.ads;

import android.content.Context;
import android.os.Build;
import com.amazon.aps.shared.APSAnalytics;
import com.appodeal.ads.context.b;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.onesignal.outcomes.OSOutcomeConstants;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;

public final class p0 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a  reason: collision with root package name */
    public static final p0 f17025a = new p0();

    public p0() {
        super(1);
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        j4 j4Var = j4.f16495a;
        jsonObjectBuilder.hasValue("device_id", j4Var.getIfa());
        jsonObjectBuilder.hasValue("os", APSAnalytics.OS_NAME);
        jsonObjectBuilder.hasValue("sdk_version", Constants.SDK_VERSION);
        String str = Build.VERSION.RELEASE;
        jsonObjectBuilder.hasValue("os_version", str);
        jsonObjectBuilder.hasValue("osv", str);
        Context applicationContext = b.f16327b.getApplicationContext();
        jsonObjectBuilder.hasValue("package_name", applicationContext.getPackageName());
        jsonObjectBuilder.hasValue(OSOutcomeConstants.DEVICE_TYPE, f1.r(applicationContext) ? "tablet" : "phone");
        jsonObjectBuilder.hasValue("connection_type", j4Var.getConnectionData(applicationContext).getType());
        jsonObjectBuilder.hasValue("user_agent", j4Var.getHttpAgent(applicationContext));
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%s %s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        jsonObjectBuilder.hasValue("model", format);
        return Unit.INSTANCE;
    }
}
