package com.yandex.metrica.impl.ob;

import android.net.Uri;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.yandex.metrica.networktasks.api.IParamsAppender;

public class Ng implements IParamsAppender<C0867zb> {
    /* renamed from: a */
    public void appendParams(Uri.Builder builder, C0867zb zbVar) {
        a(builder, "adv_id", "limit_ad_tracking", zbVar.a().f6881a);
        a(builder, "oaid", "limit_oaid_tracking", zbVar.b().f6881a);
        a(builder, "yandex_adv_id", "limit_yandex_adv_id_tracking", zbVar.c().f6881a);
    }

    private void a(Uri.Builder builder, String str, String str2, C0723tb tbVar) {
        String str3 = "";
        if (tbVar == null) {
            builder.appendQueryParameter(str, str3);
            builder.appendQueryParameter(str2, str3);
            return;
        }
        String str4 = tbVar.f6825b;
        if (str4 == null) {
            str4 = str3;
        }
        builder.appendQueryParameter(str, str4);
        Boolean bool = tbVar.f6826c;
        if (bool != null) {
            str3 = bool.booleanValue() ? "1" : BuildConfig.ADAPTER_VERSION;
        }
        builder.appendQueryParameter(str2, str3);
    }
}
