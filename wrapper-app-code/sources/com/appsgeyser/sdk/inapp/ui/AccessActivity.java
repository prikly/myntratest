package com.appsgeyser.sdk.inapp.ui;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.appsgeyser.sdk.R;
import com.appsgeyser.sdk.inapp.PurchaseController;
import com.appsgeyser.sdk.inapp.models.BillingProduct;
import com.appsgeyser.sdk.inapp.models.configdata.AccessData;
import com.appsgeyser.sdk.inapp.models.statuses.ErrorStatus;
import com.appsgeyser.sdk.inapp.models.statuses.LoadingStatus;
import com.appsgeyser.sdk.inapp.models.statuses.Status;
import com.appsgeyser.sdk.inapp.models.statuses.SuccessStatus;
import com.appsgeyser.sdk.inapp.ui.AccessActivity;
import com.google.android.material.snackbar.Snackbar;
import rx.functions.Action1;

public class AccessActivity extends AppCompatActivity {
    private AccessData accessData;
    private TextView appNameText;
    private Button buyButton;
    private TextView descriptionText;
    private View mainBg;
    private TextView priceText;
    private ProgressBar progressBar;
    private ImageView screenIcon;
    private TextView titleText;

    public void onBackPressed() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.appsgeysersdk_activity_access);
        initView();
        hideUi();
        showProgress();
        PurchaseController.getInstance().subscribeAccessStatus(new Action1() {
            public final void call(Object obj) {
                AccessActivity.this.lambda$onCreate$1$AccessActivity((Status) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onCreate$1$AccessActivity(Status status) {
        runOnUiThread(new Runnable(status) {
            public final /* synthetic */ Status f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                AccessActivity.this.lambda$onCreate$0$AccessActivity(this.f$1);
            }
        });
    }

    public /* synthetic */ void lambda$onCreate$0$AccessActivity(Status status) {
        if (status instanceof LoadingStatus) {
            hideUi();
            showProgress();
        } else if (status instanceof ErrorStatus) {
            hideUi();
            hideProgress();
            showErrorMessage();
        } else if (status instanceof SuccessStatus) {
            SuccessStatus successStatus = (SuccessStatus) status;
            if (!successStatus.isFeatureActive() || successStatus.isFeaturePurchased()) {
                finish();
                return;
            }
            this.accessData = (AccessData) successStatus.getConfigData();
            hideProgress();
            showUi();
            updateView(successStatus.getProduct());
        }
    }

    /* access modifiers changed from: private */
    public void showErrorMessage() {
        Snackbar.make((View) this.buyButton, (CharSequence) "Sorry, connection failed.", 0).show();
        hideProgress();
    }

    private void initView() {
        this.buyButton = (Button) findViewById(R.id.buy_button);
        this.mainBg = findViewById(R.id.main_background);
        this.priceText = (TextView) findViewById(R.id.price_text);
        this.progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        this.appNameText = (TextView) findViewById(R.id.application_name_text);
        this.screenIcon = (ImageView) findViewById(R.id.screen_icon);
        this.descriptionText = (TextView) findViewById(R.id.description);
        this.titleText = (TextView) findViewById(R.id.title);
        int intExtra = getIntent().getIntExtra("iconId", 0);
        if (intExtra != 0) {
            this.screenIcon.setImageResource(intExtra);
        }
    }

    private void updateView(BillingProduct billingProduct) {
        this.buyButton.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                AccessActivity.this.lambda$updateView$2$AccessActivity(view);
            }
        });
        this.buyButton.setText(this.accessData.getButtonText());
        this.buyButton.setBackgroundColor(stringToColorInt(this.accessData.getButtonTintColor()));
        this.mainBg.setBackgroundColor(stringToColorInt(this.accessData.getBackgroundColor()));
        this.buyButton.setTextColor(stringToColorInt(this.accessData.getButtonTextColor()));
        this.priceText.setText(getString(R.string.price_sub_text, new Object[]{billingProduct.getPrice()}));
        this.descriptionText.setText(billingProduct.getDescription());
        this.titleText.setText(billingProduct.getTitle());
    }

    public /* synthetic */ void lambda$updateView$2$AccessActivity(View view) {
        AccessData accessData2 = this.accessData;
        if (accessData2 == null || accessData2.isAllowPurchases()) {
            purchase();
        } else {
            showPurchaseNotAllowDialog();
        }
    }

    private void purchase() {
        PurchaseController.getInstance().purchaseAccess(this, new PurchaseController.PurchaseListener() {
            public void onSuccessPurchase() {
                AccessActivity.this.runOnUiThread(new Runnable() {
                    public final void run() {
                        AccessActivity.AnonymousClass1.this.lambda$onSuccessPurchase$0$AccessActivity$1();
                    }
                });
            }

            public /* synthetic */ void lambda$onSuccessPurchase$0$AccessActivity$1() {
                AccessActivity.this.finish();
            }

            public void onErrorPurchase(String str) {
                AccessActivity.this.runOnUiThread(new Runnable() {
                    public final void run() {
                        AccessActivity.AnonymousClass1.this.lambda$onErrorPurchase$1$AccessActivity$1();
                    }
                });
            }

            public /* synthetic */ void lambda$onErrorPurchase$1$AccessActivity$1() {
                AccessActivity.this.showErrorMessage();
            }
        });
    }

    private int stringToColorInt(String str) {
        if (str == null || str.isEmpty()) {
            return -16776961;
        }
        if (str.contains("#")) {
            return Color.parseColor(str);
        }
        return Color.parseColor("#" + str);
    }

    private void hideProgress() {
        this.progressBar.setVisibility(8);
    }

    private void showProgress() {
        this.progressBar.setVisibility(0);
    }

    private void hideUi() {
        this.buyButton.setVisibility(8);
        this.priceText.setVisibility(8);
        this.screenIcon.setVisibility(8);
        this.appNameText.setVisibility(8);
        this.descriptionText.setVisibility(8);
        this.titleText.setVisibility(8);
    }

    private void showUi() {
        this.buyButton.setVisibility(0);
        this.priceText.setVisibility(0);
        this.screenIcon.setVisibility(0);
        this.appNameText.setVisibility(0);
        this.descriptionText.setVisibility(0);
        this.titleText.setVisibility(0);
    }

    private void showPurchaseNotAllowDialog() {
        new AlertDialog.Builder(this).setTitle(R.string.purchase_error).setMessage(R.string.purchase_not_allow_message).setCancelable(true).setPositiveButton(R.string.tt_label_ok, (DialogInterface.OnClickListener) null).create().show();
    }
}
