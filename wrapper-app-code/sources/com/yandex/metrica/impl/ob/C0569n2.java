package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import com.yandex.metrica.MetricaService;

/* renamed from: com.yandex.metrica.impl.ob.n2  reason: case insensitive filesystem */
public final class C0569n2 {

    /* renamed from: a  reason: collision with root package name */
    private static final C0565mn f6299a = new C0565mn();

    public static Intent a(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Intent addFlags = new Intent(context, MetricaService.class).setAction("com.yandex.metrica.IMetricaService").setData(new Uri.Builder().scheme("metrica").authority(context.getPackageName()).build()).addFlags(32);
        String str = null;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (Throwable unused) {
            applicationInfo = null;
        }
        try {
            bundle = applicationInfo.metaData;
            if (bundle == null) {
                bundle = new Bundle();
            }
        } catch (Throwable unused2) {
            bundle = new Bundle();
        }
        Intent putExtras = addFlags.putExtras(bundle);
        putExtras.setData(putExtras.getData().buildUpon().path("client").appendQueryParameter("pid", String.valueOf(Process.myPid())).appendQueryParameter("psid", A3.f3684c).build());
        C0295c2 a2 = C0370f2.a(context).a();
        if (a2 != null) {
            str = Tl.a(a2);
        }
        putExtras.putExtra("screen_size", str);
        return putExtras.setPackage(context.getApplicationContext().getPackageName());
    }
}
