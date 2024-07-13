package com.appsgeyser.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.appsgeyser.sdk.ads.FullScreenBanner;

public class AdActivity extends Activity implements FullScreenBanner.FullScreenEventListener {
    public void onBackPressed() {
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, AdActivity.class);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        FullScreenBanner fullScreenBanner = InternalEntryPoint.getInstance().getFullScreenBanner(this);
        fullScreenBanner.setEventListener(this);
        WebView webView = fullScreenBanner.getWebView();
        removeView(webView);
        View inflate = getLayoutInflater().inflate(R.layout.appsgeysersdk_adactivity, (ViewGroup) null);
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((FrameLayout) inflate.findViewById(R.id.appsgeysersdk_adactivity_view_layout)).addView(webView);
        setContentView(inflate);
    }

    private void removeView(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    public void bannerClosed() {
        finish();
    }
}
