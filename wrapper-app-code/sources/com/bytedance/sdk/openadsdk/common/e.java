package com.bytedance.sdk.openadsdk.common;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.a;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.utils.u;
import com.bytedance.sdk.openadsdk.utils.v;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TTPrivacyAdReportDialog */
public class e extends Dialog {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f460b = {"SDK version", "App", "App version", "OS", "Device", "Creative info"};

    /* renamed from: a  reason: collision with root package name */
    private Handler f461a = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public String f462c = "";
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public TextView f463d;

    public e(Context context) {
        super(context, t.g(context, "tt_privacy_dialog_theme_ad_report"));
    }

    public void a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.f462c = a.a(new JSONObject(str)).toString();
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(LayoutInflater.from(getContext()).inflate(t.f(getContext(), "tt_ad_report_info"), (ViewGroup) null), new ViewGroup.LayoutParams(v.c(getContext()), (int) (((double) v.d(getContext())) * 0.9d)));
        b();
        if (getWindow() != null) {
            getWindow().setGravity(80);
        }
    }

    private void b() {
        this.f463d = (TextView) findViewById(t.e(getContext(), "tt_ad_report_creative_info"));
        final String d2 = u.d();
        final String f2 = u.f();
        final String str = "Android " + Build.VERSION.RELEASE;
        final String str2 = Build.BRAND + " " + Build.MODEL;
        ((TextView) findViewById(t.e(getContext(), "tt_ad_report_sdk_version"))).setText("4.5.0.6");
        ((TextView) findViewById(t.e(getContext(), "tt_ad_report_app_package_name"))).setText(d2);
        ((TextView) findViewById(t.e(getContext(), "tt_ad_report_app_version"))).setText(f2);
        ((TextView) findViewById(t.e(getContext(), "tt_ad_report_os"))).setText(str);
        ((TextView) findViewById(t.e(getContext(), "tt_ad_report_device"))).setText(str2);
        this.f463d.setText("loading ...");
        ((Button) findViewById(t.e(getContext(), "tt_ad_report_copy_button"))).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) e.this.getContext().getSystemService("clipboard");
                if (clipboardManager != null) {
                    StringBuilder sb = new StringBuilder("");
                    String[] strArr = {"4.5.0.6", d2, f2, str, str2, e.this.f462c};
                    for (int i = 0; i < e.f460b.length; i++) {
                        sb.append(e.f460b[i]);
                        sb.append(": ");
                        sb.append(strArr[i]);
                        sb.append("\n");
                    }
                    clipboardManager.setPrimaryClip(ClipData.newPlainText("pangle sdk build info", sb));
                }
            }
        });
        ((ImageView) findViewById(t.e(getContext(), "tt_ad_report_close_button"))).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                e.this.f463d.setText("loading ...");
                e.this.cancel();
            }
        });
    }

    public void show() {
        super.show();
        this.f461a.postDelayed(new Runnable() {
            public void run() {
                e.this.f463d.setText(e.this.f462c);
            }
        }, 1000);
    }
}
