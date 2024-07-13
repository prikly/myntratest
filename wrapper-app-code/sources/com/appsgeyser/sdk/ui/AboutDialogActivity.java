package com.appsgeyser.sdk.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.appsgeyser.sdk.AppsgeyserSDK;
import com.appsgeyser.sdk.R;
import com.appsgeyser.sdk.configuration.Configuration;
import com.appsgeyser.sdk.configuration.Constants;
import com.appsgeyser.sdk.configuration.models.ConfigPhp;
import com.appsgeyser.sdk.server.implementation.AppsgeyserServerClient;
import com.appsgeyser.sdk.utils.RateApp.MarketChecker;

public class AboutDialogActivity extends Activity {
    private TextView appName;
    private TextView appVersion;
    private ImageView appsgeyserDescriptionLogoImageView;
    private ImageView closeScreenImageView;
    private Configuration config;
    private ConfigPhp configPhp;
    private String description;
    private TextView descriptionTextView;
    private String descriptionType;
    private ImageView logoImageView;
    private Button privacy;
    private Button rate;
    private TextView templateVersion;
    private Button tos;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.appsgeysersdk_about_dialog);
        if (bundle != null) {
            this.configPhp = (ConfigPhp) bundle.getParcelable("config_php_key");
        } else {
            Intent intent = getIntent();
            if (intent != null) {
                this.configPhp = (ConfigPhp) intent.getParcelableExtra("config_php_key");
            }
        }
        ConfigPhp configPhp2 = this.configPhp;
        if (configPhp2 != null) {
            this.descriptionType = configPhp2.getAboutScreenDescriptionType();
            this.description = this.configPhp.getAboutScreenDescription();
        }
        init();
    }

    private void init() {
        try {
            Configuration instance = Configuration.getInstance(this);
            this.config = instance;
            String applicationId = instance.getApplicationId();
            this.logoImageView = (ImageView) findViewById(R.id.logo);
            this.appsgeyserDescriptionLogoImageView = (ImageView) findViewById(R.id.appsgeysersdk_about_appsgeyser_logo);
            this.closeScreenImageView = (ImageView) findViewById(R.id.close_about_screen);
            this.descriptionTextView = (TextView) findViewById(R.id.description);
            this.appName = (TextView) findViewById(R.id.about_app_name);
            this.appVersion = (TextView) findViewById(R.id.app_version);
            this.templateVersion = (TextView) findViewById(R.id.template_version);
            this.tos = (Button) findViewById(R.id.app_tos);
            this.rate = (Button) findViewById(R.id.app_rate);
            this.privacy = (Button) findViewById(R.id.app_privacy);
            try {
                PackageManager packageManager = getPackageManager();
                this.appVersion.setText("Version " + getPackageManager().getPackageInfo(getPackageName(), 0).versionName);
                this.appName.setText((String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(getPackageName(), 128)));
            } catch (PackageManager.NameNotFoundException e2) {
                e2.printStackTrace();
            }
            final String str = "https://www.appsgeyser.com?pn=" + getPackageName();
            this.logoImageView.setImageDrawable(getPackageManager().getApplicationIcon(getPackageName()));
            this.logoImageView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    intent.setFlags(268435456);
                    AboutDialogActivity.this.startActivity(intent);
                    AppsgeyserServerClient.getInstance().sendAboutDialogVisitSite(AboutDialogActivity.this.getApplicationContext());
                }
            });
            this.closeScreenImageView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    AboutDialogActivity.this.finish();
                }
            });
            this.templateVersion.setText(getString(R.string.appsgeysersdk_build, new Object[]{Constants.PLATFORM_VERSION}));
            String string = getResources().getString(R.string.appsgeysersdk_description_with_publish_name);
            if (this.config.getPublisherName().length() == 0) {
                string = getResources().getString(R.string.appsgeysersdk_description_without_publish_name);
            }
            if (this.descriptionType != null) {
                String str2 = this.descriptionType;
                char c2 = 65535;
                int hashCode = str2.hashCode();
                if (hashCode != -1349088399) {
                    if (hashCode != 1502878931) {
                        if (hashCode == 1503108181) {
                            if (str2.equals("appsgeyser_text")) {
                                c2 = 0;
                            }
                        }
                    } else if (str2.equals("appsgeyser_logo")) {
                        c2 = 1;
                    }
                } else if (str2.equals(OSNotificationFormatHelper.PAYLOAD_OS_ROOT_CUSTOM)) {
                    c2 = 2;
                }
                if (c2 == 0) {
                    this.appsgeyserDescriptionLogoImageView.setVisibility(8);
                    this.descriptionTextView.setVisibility(0);
                } else if (c2 == 1) {
                    this.appsgeyserDescriptionLogoImageView.setVisibility(0);
                    this.descriptionTextView.setVisibility(8);
                } else if (c2 != 2) {
                    this.appsgeyserDescriptionLogoImageView.setVisibility(8);
                    this.descriptionTextView.setVisibility(0);
                } else {
                    string = this.description;
                    this.appsgeyserDescriptionLogoImageView.setVisibility(8);
                    this.descriptionTextView.setVisibility(0);
                }
            }
            this.descriptionTextView.setText(Html.fromHtml(string.replace("PUB_NAME", this.config.getPublisherName()).replace("APPSGEYSER_URL", str).replace("APP_VERSION", "").replace("APP_ID", applicationId)));
            this.descriptionTextView.setLinksClickable(true);
            this.descriptionTextView.setMovementMethod(LinkMovementMethod.getInstance());
            this.tos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    Intent data = intent.setData(Uri.parse("https://www.appsgeyser.com/tos/?pn=" + AboutDialogActivity.this.getPackageName()));
                    data.setFlags(268435456);
                    AboutDialogActivity.this.startActivity(data);
                }
            });
            this.privacy.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    Intent data = intent.setData(Uri.parse("https://www.appsgeyser.com/privacy/app/?pn=" + AboutDialogActivity.this.getPackageName()));
                    data.setFlags(268435456);
                    AboutDialogActivity.this.startActivity(data);
                }
            });
            this.rate.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    AboutDialogActivity.this.lambda$init$0$AboutDialogActivity(view);
                }
            });
            AppsgeyserSDK.isAppOnMarket(this, new MarketChecker.OnReceiveListener() {
                public final void onReceive(boolean z) {
                    AboutDialogActivity.this.lambda$init$1$AboutDialogActivity(z);
                }
            });
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public /* synthetic */ void lambda$init$0$AboutDialogActivity(View view) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + getPackageName() + "&reviewId=0")));
    }

    public /* synthetic */ void lambda$init$1$AboutDialogActivity(boolean z) {
        if (z) {
            this.rate.setVisibility(0);
        } else {
            this.rate.setVisibility(8);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("config_php_key", this.configPhp);
        super.onSaveInstanceState(bundle);
    }
}
