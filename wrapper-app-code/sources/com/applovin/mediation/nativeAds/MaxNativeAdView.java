package com.applovin.mediation.nativeAds;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.applovin.impl.mediation.a.d;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.ads.b;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class MaxNativeAdView extends FrameLayout {
    public static final String MEDIUM_TEMPLATE_1 = "medium_template_1";

    /* renamed from: a  reason: collision with root package name */
    private final View f16027a;

    /* renamed from: b  reason: collision with root package name */
    private final TextView f16028b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f16029c;

    /* renamed from: d  reason: collision with root package name */
    private final TextView f16030d;

    /* renamed from: e  reason: collision with root package name */
    private final ImageView f16031e;

    /* renamed from: f  reason: collision with root package name */
    private final FrameLayout f16032f;

    /* renamed from: g  reason: collision with root package name */
    private final ViewGroup f16033g;

    /* renamed from: h  reason: collision with root package name */
    private final FrameLayout f16034h;
    private final ViewGroup i;
    private final FrameLayout j;
    private final Button k;
    private b l;

    public MaxNativeAdView(MaxNativeAd maxNativeAd, Activity activity) {
        this(maxNativeAd, (String) null, activity);
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        super(context);
        View inflate;
        boolean z = maxNativeAdViewBinder.templateType != null;
        MaxAdFormat format = maxNativeAd != null ? maxNativeAd.getFormat() : MaxAdFormat.NATIVE;
        if (maxNativeAdViewBinder.mainView != null) {
            inflate = maxNativeAdViewBinder.mainView;
        } else {
            inflate = LayoutInflater.from(context).inflate(z ? a(maxNativeAdViewBinder.templateType, format) : maxNativeAdViewBinder.layoutResourceId, this, false);
        }
        this.f16027a = inflate;
        addView(this.f16027a);
        this.f16028b = (TextView) findViewById(maxNativeAdViewBinder.titleTextViewId);
        this.f16029c = (TextView) findViewById(maxNativeAdViewBinder.advertiserTextViewId);
        this.f16030d = (TextView) findViewById(maxNativeAdViewBinder.bodyTextViewId);
        this.f16031e = (ImageView) findViewById(maxNativeAdViewBinder.iconImageViewId);
        this.f16032f = (FrameLayout) findViewById(maxNativeAdViewBinder.iconContentViewId);
        this.f16033g = (ViewGroup) findViewById(maxNativeAdViewBinder.optionsContentViewGroupId);
        this.f16034h = (FrameLayout) findViewById(maxNativeAdViewBinder.optionsContentFrameLayoutId);
        this.i = (ViewGroup) findViewById(maxNativeAdViewBinder.mediaContentViewGroupId);
        this.j = (FrameLayout) findViewById(maxNativeAdViewBinder.mediaContentFrameLayoutId);
        this.k = (Button) findViewById(maxNativeAdViewBinder.callToActionButtonId);
        if (maxNativeAd != null) {
            a(maxNativeAd);
        }
    }

    @Deprecated
    public MaxNativeAdView(MaxNativeAd maxNativeAd, String str, Activity activity) {
        this(maxNativeAd, str, activity.getApplicationContext());
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, String str, Context context) {
        this(maxNativeAd, new MaxNativeAdViewBinder.Builder(-1).setTemplateType(str).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setIconImageViewId(R.id.applovin_native_icon_image_view).setIconContentViewId(R.id.applovin_native_icon_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setOptionsContentFrameLayoutId(R.id.applovin_native_options_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).setMediaContentFrameLayoutId(R.id.applovin_native_media_content_view).setCallToActionButtonId(R.id.applovin_native_cta_button).build(), context);
    }

    public MaxNativeAdView(MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        this((MaxNativeAd) null, maxNativeAdViewBinder, context);
    }

    public MaxNativeAdView(String str, Context context) {
        this((MaxNativeAd) null, str, context);
    }

    private int a(String str, MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.NATIVE) {
            if ("small_template_1".equalsIgnoreCase(str)) {
                return R.layout.max_native_ad_small_template_1;
            }
            if (MEDIUM_TEMPLATE_1.equalsIgnoreCase(str)) {
                return R.layout.max_native_ad_medium_template_1;
            }
            throw new IllegalArgumentException("Attempting to render MAX native ad with invalid format: " + str);
        } else if (maxAdFormat == MaxAdFormat.BANNER) {
            return "vertical_banner_template".equals(str) ? R.layout.max_native_ad_vertical_banner_view : ("media_banner_template".equals(str) || "no_body_banner_template".equals(str)) ? R.layout.max_native_ad_media_banner_view : "vertical_media_banner_template".equals(str) ? R.layout.max_native_ad_vertical_media_banner_view : R.layout.max_native_ad_banner_view;
        } else {
            if (maxAdFormat == MaxAdFormat.LEADER) {
                return "vertical_leader_template".equals(str) ? R.layout.max_native_ad_vertical_leader_view : R.layout.max_native_ad_leader_view;
            }
            if (maxAdFormat == MaxAdFormat.MREC) {
                return R.layout.max_native_ad_mrec_view;
            }
            throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
        }
    }

    private void a() {
        final ViewGroup viewGroup = (ViewGroup) findViewById(R.id.applovin_native_inner_parent_layout);
        if (viewGroup != null) {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                final WeakReference weakReference = new WeakReference(viewTreeObserver);
                viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                    public boolean onPreDraw() {
                        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
                            n nVar = AppLovinSdk.getInstance(MaxNativeAdView.this.getContext()).coreSdk;
                            nVar.D();
                            if (v.a()) {
                                nVar.D().d("MaxNativeAdView", "Failed to remove onPreDrawListener since the view tree observer is not alive.");
                            }
                        } else {
                            viewTreeObserver.removeOnPreDrawListener(this);
                        }
                        weakReference.clear();
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewGroup.getLayoutParams();
                        layoutParams.height = ((View) viewGroup.getParent()).getWidth();
                        viewGroup.setLayoutParams(layoutParams);
                        return true;
                    }
                });
            }
        }
    }

    private void a(MaxNativeAd maxNativeAd) {
        this.f16028b.setText(maxNativeAd.getTitle());
        if (this.f16029c != null) {
            if (StringUtils.isValidString(maxNativeAd.getAdvertiser())) {
                this.f16029c.setText(maxNativeAd.getAdvertiser());
            } else {
                this.f16029c.setVisibility(8);
            }
        }
        if (this.f16030d != null) {
            if (StringUtils.isValidString(maxNativeAd.getBody())) {
                this.f16030d.setText(maxNativeAd.getBody());
            } else {
                this.f16030d.setVisibility(4);
            }
        }
        if (this.k != null) {
            if (StringUtils.isValidString(maxNativeAd.getCallToAction())) {
                this.k.setText(maxNativeAd.getCallToAction());
            } else {
                this.k.setVisibility(4);
            }
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        View iconView = maxNativeAd.getIconView();
        if (this.f16032f != null) {
            if (icon == null || this.f16031e == null) {
                if (iconView != null) {
                    iconView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    this.f16032f.removeAllViews();
                    this.f16032f.addView(iconView);
                }
            } else if (icon.getDrawable() != null) {
                this.f16031e.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() != null && StringUtils.isValidString(icon.getUri().toString())) {
                this.f16031e.setImageURI(icon.getUri());
            }
            this.f16032f.setVisibility(8);
        }
        View optionsView = maxNativeAd.getOptionsView();
        if (this.f16034h == null || optionsView == null) {
            FrameLayout frameLayout = this.f16034h;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        } else {
            optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f16034h.addView(optionsView);
            this.f16034h.bringToFront();
        }
        View mediaView = maxNativeAd.getMediaView();
        if (this.j != null) {
            if (mediaView != null) {
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.j.addView(mediaView);
            } else if (maxNativeAd.getFormat() == MaxAdFormat.LEADER) {
                this.j.setVisibility(8);
            }
        }
        a();
        postDelayed(new Runnable() {
            public void run() {
                MaxNativeAdView.this.setSelected(true);
            }
        }, 2000);
    }

    public b getAdViewTracker() {
        return this.l;
    }

    public TextView getAdvertiserTextView() {
        return this.f16029c;
    }

    public TextView getBodyTextView() {
        return this.f16030d;
    }

    public Button getCallToActionButton() {
        return this.k;
    }

    public List<View> getClickableViews() {
        ArrayList arrayList = new ArrayList(5);
        TextView textView = this.f16028b;
        if (textView != null) {
            arrayList.add(textView);
        }
        TextView textView2 = this.f16029c;
        if (textView2 != null) {
            arrayList.add(textView2);
        }
        TextView textView3 = this.f16030d;
        if (textView3 != null) {
            arrayList.add(textView3);
        }
        ImageView imageView = this.f16031e;
        if (imageView != null) {
            arrayList.add(imageView);
        }
        Button button = this.k;
        if (button != null) {
            arrayList.add(button);
        }
        return arrayList;
    }

    @Deprecated
    public FrameLayout getIconContentView() {
        return this.f16032f;
    }

    public ImageView getIconImageView() {
        return this.f16031e;
    }

    public View getMainView() {
        return this.f16027a;
    }

    @Deprecated
    public FrameLayout getMediaContentView() {
        return this.j;
    }

    public ViewGroup getMediaContentViewGroup() {
        ViewGroup viewGroup = this.i;
        return viewGroup != null ? viewGroup : this.j;
    }

    @Deprecated
    public FrameLayout getOptionsContentView() {
        return this.f16034h;
    }

    public ViewGroup getOptionsContentViewGroup() {
        ViewGroup viewGroup = this.f16033g;
        return viewGroup != null ? viewGroup : this.f16034h;
    }

    public TextView getTitleTextView() {
        return this.f16028b;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.l;
        if (bVar != null) {
            bVar.b();
        }
        if (!isHardwareAccelerated()) {
            v.h("MaxNativeAdView", "Attached to non-hardware accelerated window: some native ad views require hardware accelerated Activities to render properly.");
        }
    }

    public void recycle() {
        setOnClickListener((View.OnClickListener) null);
        b bVar = this.l;
        if (bVar != null) {
            bVar.a();
            this.l = null;
        }
        View view = this.f16027a;
        if (view != null && view.getParent() != this) {
            ViewGroup viewGroup = (ViewGroup) this.f16027a.getParent();
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                removeView(viewGroup);
            }
            addView(this.f16027a);
        }
    }

    public void render(d dVar, a.C0141a aVar, n nVar) {
        recycle();
        if (!dVar.F().get() || !dVar.E().get()) {
            this.l = new b(dVar, this, aVar, nVar);
        }
        final MaxNativeAd nativeAd = dVar.getNativeAd();
        if (dVar.B() && nativeAd.isContainerClickable()) {
            nVar.D();
            if (v.a()) {
                nVar.D().b("MaxNativeAdView", "Enabling container click");
            }
            setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    nativeAd.performClick();
                }
            });
        }
        boolean isValidString = StringUtils.isValidString(dVar.A());
        nVar.D();
        if (isValidString) {
            if (v.a()) {
                nVar.D().b("MaxNativeAdView", "Rendering template ad view");
            }
            a(nativeAd);
            return;
        }
        if (v.a()) {
            nVar.D().b("MaxNativeAdView", "Rendering custom ad view");
        }
        renderCustomNativeAdView(nativeAd);
    }

    public void renderCustomNativeAdView(MaxNativeAd maxNativeAd) {
        if (this.f16028b != null) {
            if (StringUtils.isValidString(maxNativeAd.getTitle())) {
                this.f16028b.setText(maxNativeAd.getTitle());
            } else {
                this.f16028b.setText((CharSequence) null);
            }
        }
        String body = maxNativeAd.getBody();
        if (this.f16030d != null) {
            if (StringUtils.isValidString(body)) {
                this.f16030d.setText(body);
            } else {
                this.f16030d.setText((CharSequence) null);
            }
        }
        String advertiser = maxNativeAd.getAdvertiser();
        if (this.f16029c != null) {
            if (StringUtils.isValidString(advertiser)) {
                this.f16029c.setText(advertiser);
            } else {
                this.f16029c.setText((CharSequence) null);
            }
        }
        String callToAction = maxNativeAd.getCallToAction();
        if (this.k != null) {
            if (StringUtils.isValidString(callToAction)) {
                this.k.setText(callToAction);
            } else {
                this.k.setText((CharSequence) null);
            }
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        ImageView imageView = this.f16031e;
        if (imageView != null) {
            if (icon == null) {
                imageView.setImageDrawable((Drawable) null);
            } else if (icon.getDrawable() != null) {
                this.f16031e.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() != null) {
                this.f16031e.setImageURI(icon.getUri());
            } else {
                this.f16031e.setImageDrawable((Drawable) null);
            }
        }
        View mediaView = maxNativeAd.getMediaView();
        ViewGroup viewGroup = this.i;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            if (mediaView != null) {
                ViewParent parent = mediaView.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeAllViews();
                }
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.i.addView(mediaView);
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        ViewGroup viewGroup2 = this.f16033g;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
            if (optionsView != null) {
                ViewParent parent2 = optionsView.getParent();
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeAllViews();
                }
                optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f16033g.addView(optionsView);
                this.f16033g.bringToFront();
            }
        }
    }
}
