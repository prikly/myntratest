package com.appsgeyser.sdk.inapp.ui;

import android.app.Dialog;
import android.content.pm.ApplicationInfo;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import com.appsgeyser.sdk.R;
import com.appsgeyser.sdk.inapp.PurchaseController;
import com.appsgeyser.sdk.inapp.models.BillingProduct;
import com.appsgeyser.sdk.inapp.models.statuses.ErrorStatus;
import com.appsgeyser.sdk.inapp.models.statuses.LoadingStatus;
import com.appsgeyser.sdk.inapp.models.statuses.Status;
import com.appsgeyser.sdk.inapp.models.statuses.SuccessStatus;
import rx.functions.Action1;

public class DisableAdsPurchaseDialogFragment extends DialogFragment {
    private RelativeLayout backgroundTop;
    private Button cancelButton;
    private Button confirmButton;
    private int mainColorId;
    private TextView priceText;
    private ProgressBar progressBar;
    private View shadowView;
    private TextView textError;
    private TextView textPurchaseNotAllow;
    private TextView textTitle;

    static /* synthetic */ void lambda$onViewCreated$1(View view) {
    }

    public DisableAdsPurchaseDialogFragment(int i) {
        this.mainColorId = i;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.appsgeyserdsk_disable_ads_dialog, viewGroup, false);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        return super.onCreateDialog(bundle);
    }

    public void onViewCreated(View view, Bundle bundle) {
        requireDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        super.onViewCreated(view, bundle);
        this.cancelButton = (Button) view.findViewById(R.id.button_cancel);
        this.confirmButton = (Button) view.findViewById(R.id.button_purchase);
        this.priceText = (TextView) view.findViewById(R.id.text_price);
        this.shadowView = view.findViewById(R.id.shadow_view);
        this.progressBar = (ProgressBar) view.findViewById(R.id.progress_bar);
        this.textError = (TextView) view.findViewById(R.id.text_error);
        this.textTitle = (TextView) view.findViewById(R.id.text_title);
        this.backgroundTop = (RelativeLayout) view.findViewById(R.id.background_top);
        this.textPurchaseNotAllow = (TextView) view.findViewById(R.id.text_purchase_not_allow);
        this.cancelButton.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                DisableAdsPurchaseDialogFragment.this.lambda$onViewCreated$0$DisableAdsPurchaseDialogFragment(view);
            }
        });
        this.shadowView.setOnClickListener($$Lambda$DisableAdsPurchaseDialogFragment$s2_6IHxdyGanABvg8IjKrcJRnj4.INSTANCE);
        this.textTitle.setText(getString(R.string.disable_ads_dialog_description, getApplicationName()));
        if (Build.VERSION.SDK_INT >= 21) {
            this.backgroundTop.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(requireContext(), this.mainColorId)));
            this.confirmButton.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(requireContext(), this.mainColorId)));
            this.cancelButton.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(requireContext(), R.color.white)));
        } else {
            this.backgroundTop.setBackgroundColor(ContextCompat.getColor(requireContext(), this.mainColorId));
            this.confirmButton.setBackgroundColor(ContextCompat.getColor(requireContext(), this.mainColorId));
            this.cancelButton.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.white));
        }
        this.confirmButton.setTextColor(ContextCompat.getColor(requireContext(), R.color.white));
        this.cancelButton.setTextColor(ContextCompat.getColor(requireContext(), this.mainColorId));
        PurchaseController.getInstance().subscribeDisableAdsStatus(new Action1() {
            public final void call(Object obj) {
                DisableAdsPurchaseDialogFragment.this.lambda$onViewCreated$3$DisableAdsPurchaseDialogFragment((Status) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onViewCreated$0$DisableAdsPurchaseDialogFragment(View view) {
        dismiss();
    }

    public /* synthetic */ void lambda$onViewCreated$3$DisableAdsPurchaseDialogFragment(Status status) {
        if (getActivity() != null) {
            requireActivity().runOnUiThread(new Runnable(status) {
                public final /* synthetic */ Status f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    DisableAdsPurchaseDialogFragment.this.lambda$onViewCreated$2$DisableAdsPurchaseDialogFragment(this.f$1);
                }
            });
        }
    }

    public /* synthetic */ void lambda$onViewCreated$2$DisableAdsPurchaseDialogFragment(Status status) {
        if (status instanceof LoadingStatus) {
            showProgress();
        } else if (status instanceof ErrorStatus) {
            hideProgress();
            showError();
        } else if (status instanceof SuccessStatus) {
            SuccessStatus successStatus = (SuccessStatus) status;
            if (!successStatus.isFeatureActive() || successStatus.isFeaturePurchased()) {
                dismiss();
            } else if (successStatus.getConfigData().isAllowPurchases()) {
                hideError();
                hideProgress();
                updateView(successStatus.getProduct());
            } else {
                showPurchaseNotAllowMessage();
            }
        }
    }

    private void updateView(BillingProduct billingProduct) {
        this.priceText.setText(getString(R.string.disable_ads_price, billingProduct.getPrice()));
        this.confirmButton.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                DisableAdsPurchaseDialogFragment.this.lambda$updateView$4$DisableAdsPurchaseDialogFragment(view);
            }
        });
    }

    public /* synthetic */ void lambda$updateView$4$DisableAdsPurchaseDialogFragment(View view) {
        purchase();
    }

    private void purchase() {
        PurchaseController.getInstance().purchaseDisableAds(requireActivity(), new PurchaseController.PurchaseListener() {
            public void onSuccessPurchase() {
                DisableAdsPurchaseDialogFragment.this.dismiss();
            }

            public void onErrorPurchase(String str) {
                DisableAdsPurchaseDialogFragment.this.showErrorPurchase();
            }
        });
    }

    /* access modifiers changed from: private */
    public void showErrorPurchase() {
        Toast.makeText(requireContext(), "Sorry, purchasing failed.", 0).show();
        hideProgress();
    }

    private String getApplicationName() {
        ApplicationInfo applicationInfo = requireContext().getApplicationInfo();
        int i = applicationInfo.labelRes;
        return i == 0 ? applicationInfo.nonLocalizedLabel.toString() : getString(i);
    }

    private void showProgress() {
        this.progressBar.setVisibility(0);
        this.shadowView.setVisibility(0);
    }

    private void hideProgress() {
        this.progressBar.setVisibility(8);
        this.shadowView.setVisibility(8);
    }

    private void showError() {
        this.progressBar.setVisibility(8);
        this.shadowView.setVisibility(8);
        this.textTitle.setVisibility(4);
        this.confirmButton.setVisibility(4);
        this.priceText.setVisibility(4);
        this.textPurchaseNotAllow.setVisibility(8);
        this.textError.setVisibility(0);
    }

    private void hideError() {
        this.progressBar.setVisibility(8);
        this.shadowView.setVisibility(8);
        this.textTitle.setVisibility(0);
        this.confirmButton.setVisibility(0);
        this.priceText.setVisibility(0);
        this.textPurchaseNotAllow.setVisibility(8);
        this.textError.setVisibility(8);
    }

    private void showPurchaseNotAllowMessage() {
        this.progressBar.setVisibility(8);
        this.shadowView.setVisibility(8);
        this.textTitle.setVisibility(4);
        this.confirmButton.setVisibility(4);
        this.priceText.setVisibility(4);
        this.textPurchaseNotAllow.setVisibility(0);
        this.textError.setVisibility(8);
    }
}
