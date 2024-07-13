package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.g.d;
import com.bytedance.sdk.openadsdk.core.g.e;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.widget.b;
import com.bytedance.sdk.openadsdk.utils.c;
import org.json.JSONException;
import org.json.JSONObject;

public class TTDelegateActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private Intent f63a;

    /* renamed from: b  reason: collision with root package name */
    private AlertDialog f64b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public b f65c;

    /* renamed from: d  reason: collision with root package name */
    private TTAdDislike f66d;

    public static void a() {
        Intent intent = new Intent(m.a(), TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 5);
        if (m.a() != null) {
            m.a().startActivity(intent);
        }
    }

    public static void a(n nVar, String str) {
        Intent intent = new Intent(m.a(), TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 6);
        intent.putExtra("materialmeta", nVar.ar().toString());
        intent.putExtra("closed_listener_key", str);
        if (m.a() != null) {
            m.a().startActivity(intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!TTAdSdk.isInitSuccess()) {
            finish();
        }
        b();
        this.f63a = getIntent();
        if (m.a() == null) {
            m.a(this);
        }
    }

    private void b() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.0f;
        window.setAttributes(attributes);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (m.a() == null) {
            m.a(this);
        }
        setIntent(intent);
        this.f63a = intent;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (getIntent() != null) {
            c();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        try {
            if (this.f64b != null && this.f64b.isShowing()) {
                this.f64b.dismiss();
            }
            if (this.f65c != null && this.f65c.isShowing()) {
                this.f65c.dismiss();
            }
        } catch (Throwable unused) {
        }
        super.onDestroy();
    }

    private void c() {
        int intExtra = this.f63a.getIntExtra("type", 0);
        String stringExtra = this.f63a.getStringExtra("app_download_url");
        this.f63a.getStringExtra("app_name");
        if (intExtra == 1) {
            return;
        }
        if (intExtra == 3) {
            a(stringExtra, this.f63a.getStringExtra("dialog_title_key"), this.f63a.getStringExtra("dialog_content_key"));
        } else if (intExtra == 4) {
            a(this.f63a.getStringExtra("permission_id_key"), this.f63a.getStringArrayExtra("permission_content_key"));
        } else if (intExtra == 5) {
            d();
        } else if (intExtra != 6) {
            finish();
        } else {
            a(this.f63a.getStringExtra("materialmeta"), this.f63a.getStringExtra("closed_listener_key"));
        }
    }

    private void a(String str, String str2) {
        if (str != null && this.f66d == null) {
            try {
                com.bytedance.sdk.openadsdk.dislike.b bVar = new com.bytedance.sdk.openadsdk.dislike.b(this, com.bytedance.sdk.openadsdk.core.b.a(new JSONObject(str)));
                this.f66d = bVar;
                bVar.a(str2);
                this.f66d.setDislikeInteractionCallback(new TTAdDislike.DislikeInteractionCallback() {
                    public void onSelected(int i, String str) {
                        l.c("showDislike", "onSelected->position=" + i + ",value=" + str);
                        TTDelegateActivity.this.finish();
                    }

                    public void onCancel() {
                        l.c("showDislike", "onCancel->onCancel....");
                        TTDelegateActivity.this.finish();
                    }

                    public void onRefuse() {
                        l.c("showDislike", "onRefuse->onRefuse....");
                    }
                });
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        TTAdDislike tTAdDislike = this.f66d;
        if (tTAdDislike != null) {
            tTAdDislike.showDislikeDialog();
        }
    }

    private void d() {
        if (this.f65c == null) {
            b bVar = new b(this);
            this.f65c = bVar;
            bVar.a(t.a(this, "no_thank_you"), (b.C0011b) new b.C0011b() {
                public void a() {
                    TTAdSdk.setGdpr(0);
                    if (TTDelegateActivity.this.f65c.isShowing()) {
                        TTDelegateActivity.this.f65c.dismiss();
                    }
                    TTDelegateActivity.this.finish();
                }
            }).a(t.a(this, "yes_i_agree"), (b.c) new b.c() {
                public void a() {
                    TTAdSdk.setGdpr(1);
                    if (TTDelegateActivity.this.f65c.isShowing()) {
                        TTDelegateActivity.this.f65c.dismiss();
                    }
                    TTDelegateActivity.this.finish();
                }
            });
        }
        if (!this.f65c.isShowing()) {
            this.f65c.show();
        }
    }

    private void a(final String str, String[] strArr) {
        if (TextUtils.isEmpty(str) || strArr == null || strArr.length <= 0) {
            finish();
        } else if (Build.VERSION.SDK_INT >= 23) {
            try {
                d.a().a((Activity) this, strArr, (e) new e() {
                    public void a() {
                        com.bytedance.sdk.openadsdk.utils.d.a(str);
                        TTDelegateActivity.this.finish();
                    }

                    public void a(String str) {
                        com.bytedance.sdk.openadsdk.utils.d.a(str, str);
                        TTDelegateActivity.this.finish();
                    }
                });
            } catch (Exception unused) {
                finish();
            }
        } else {
            l.b(TTAdConstant.TAG, "Already have permission");
            finish();
        }
    }

    private void a(final String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2)) {
            str2 = t.a(this, "tt_tip");
        }
        String str4 = str2;
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        a(str4, str3, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                c.a(str);
                TTDelegateActivity.this.finish();
            }
        }, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                c.b(str);
                TTDelegateActivity.this.finish();
            }
        }, new DialogInterface.OnCancelListener() {
            public void onCancel(DialogInterface dialogInterface) {
                c.c(str);
                TTDelegateActivity.this.finish();
            }
        });
    }

    private void a(String str, String str2, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnCancelListener onCancelListener) {
        String str3;
        try {
            if (this.f64b == null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    str3 = "Theme.Dialog.TTDownload";
                } else {
                    str3 = "Theme.Dialog.TTDownloadOld";
                }
                this.f64b = new AlertDialog.Builder(this, t.g(this, str3)).create();
            }
            this.f64b.setTitle(String.valueOf(str));
            this.f64b.setMessage(String.valueOf(str2));
            this.f64b.setButton(-1, t.a(this, "tt_label_ok"), onClickListener);
            this.f64b.setButton(-2, t.a(this, "tt_label_cancel"), onClickListener2);
            this.f64b.setOnCancelListener(onCancelListener);
            if (!this.f64b.isShowing()) {
                this.f64b.show();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        d.a().a((Activity) this, strArr, iArr);
        finish();
    }
}
