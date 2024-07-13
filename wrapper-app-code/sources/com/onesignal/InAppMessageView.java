package com.onesignal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.webkit.WebView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import com.onesignal.DraggableRelativeLayout;
import com.onesignal.OneSignal;
import com.onesignal.WebViewManager;

class InAppMessageView {
    private static final int ACTIVITY_BACKGROUND_COLOR_EMPTY = Color.parseColor("#00000000");
    private static final int ACTIVITY_BACKGROUND_COLOR_FULL = Color.parseColor("#BB000000");
    private static final int ACTIVITY_FINISH_AFTER_DISMISS_DELAY_MS = 600;
    private static final int ACTIVITY_INIT_DELAY = 200;
    private static final int DRAG_THRESHOLD_PX_SIZE = OSViewUtils.dpToPx(4);
    private static final int IN_APP_BACKGROUND_ANIMATION_DURATION_MS = 400;
    private static final int IN_APP_BANNER_ANIMATION_DURATION_MS = 1000;
    private static final int IN_APP_CENTER_ANIMATION_DURATION_MS = 1000;
    private static final String IN_APP_MESSAGE_CARD_VIEW_TAG = "IN_APP_MESSAGE_CARD_VIEW_TAG";
    /* access modifiers changed from: private */
    public Activity currentActivity;
    /* access modifiers changed from: private */
    public boolean disableDragDismiss = false;
    private double displayDuration;
    /* access modifiers changed from: private */
    public WebViewManager.Position displayLocation;
    /* access modifiers changed from: private */
    public DraggableRelativeLayout draggableRelativeLayout;
    private final Handler handler = new Handler();
    /* access modifiers changed from: private */
    public boolean hasBackground;
    /* access modifiers changed from: private */
    public boolean isDragging = false;
    private int marginPxSizeBottom = OSViewUtils.dpToPx(24);
    private int marginPxSizeLeft = OSViewUtils.dpToPx(24);
    private int marginPxSizeRight = OSViewUtils.dpToPx(24);
    private int marginPxSizeTop = OSViewUtils.dpToPx(24);
    private OSInAppMessageContent messageContent;
    /* access modifiers changed from: private */
    public InAppMessageViewListener messageController;
    private int pageHeight;
    private int pageWidth;
    /* access modifiers changed from: private */
    public RelativeLayout parentRelativeLayout;
    private PopupWindow popupWindow;
    /* access modifiers changed from: private */
    public Runnable scheduleDismissRunnable;
    /* access modifiers changed from: private */
    public boolean shouldDismissWhenActive = false;
    /* access modifiers changed from: private */
    public WebView webView;

    interface InAppMessageViewListener {
        void onMessageWasDismissed();

        void onMessageWasShown();

        void onMessageWillDismiss();
    }

    InAppMessageView(WebView webView2, OSInAppMessageContent oSInAppMessageContent, boolean z) {
        this.webView = webView2;
        this.displayLocation = oSInAppMessageContent.getDisplayLocation();
        this.pageHeight = oSInAppMessageContent.getPageHeight();
        this.pageWidth = -1;
        this.displayDuration = oSInAppMessageContent.getDisplayDuration() == null ? 0.0d : oSInAppMessageContent.getDisplayDuration().doubleValue();
        this.hasBackground = !this.displayLocation.isBanner();
        this.disableDragDismiss = z;
        this.messageContent = oSInAppMessageContent;
        setMarginsFromContent(oSInAppMessageContent);
    }

    private void setMarginsFromContent(OSInAppMessageContent oSInAppMessageContent) {
        int i = 0;
        this.marginPxSizeTop = oSInAppMessageContent.getUseHeightMargin() ? OSViewUtils.dpToPx(24) : 0;
        this.marginPxSizeBottom = oSInAppMessageContent.getUseHeightMargin() ? OSViewUtils.dpToPx(24) : 0;
        this.marginPxSizeLeft = oSInAppMessageContent.getUseWidthMargin() ? OSViewUtils.dpToPx(24) : 0;
        if (oSInAppMessageContent.getUseWidthMargin()) {
            i = OSViewUtils.dpToPx(24);
        }
        this.marginPxSizeRight = i;
    }

    /* access modifiers changed from: package-private */
    public void setWebView(WebView webView2) {
        this.webView = webView2;
        webView2.setBackgroundColor(0);
    }

    /* access modifiers changed from: package-private */
    public void setMessageController(InAppMessageViewListener inAppMessageViewListener) {
        this.messageController = inAppMessageViewListener;
    }

    /* access modifiers changed from: package-private */
    public WebViewManager.Position getDisplayPosition() {
        return this.displayLocation;
    }

    /* access modifiers changed from: package-private */
    public void showView(Activity activity) {
        delayShowUntilAvailable(activity);
    }

    /* access modifiers changed from: package-private */
    public void checkIfShouldDismiss() {
        if (this.shouldDismissWhenActive) {
            this.shouldDismissWhenActive = false;
            finishAfterDelay((WebViewManager.OneSignalGenericCallback) null);
        }
    }

    /* access modifiers changed from: package-private */
    public void updateHeight(final int i) {
        this.pageHeight = i;
        OSUtils.runOnMainUIThread(new Runnable() {
            public void run() {
                if (InAppMessageView.this.webView == null) {
                    OneSignal.onesignalLog(OneSignal.LOG_LEVEL.WARN, "WebView height update skipped, new height will be used once it is displayed.");
                    return;
                }
                ViewGroup.LayoutParams layoutParams = InAppMessageView.this.webView.getLayoutParams();
                if (layoutParams == null) {
                    OneSignal.onesignalLog(OneSignal.LOG_LEVEL.WARN, "WebView height update skipped because of null layoutParams, new height will be used once it is displayed.");
                    return;
                }
                layoutParams.height = i;
                InAppMessageView.this.webView.setLayoutParams(layoutParams);
                if (InAppMessageView.this.draggableRelativeLayout != null) {
                    DraggableRelativeLayout access$100 = InAppMessageView.this.draggableRelativeLayout;
                    InAppMessageView inAppMessageView = InAppMessageView.this;
                    access$100.setParams(inAppMessageView.createDraggableLayoutParams(i, inAppMessageView.displayLocation, InAppMessageView.this.disableDragDismiss));
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void showInAppMessageView(Activity activity) {
        this.currentActivity = activity;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.pageHeight);
        layoutParams.addRule(13);
        RelativeLayout.LayoutParams createParentRelativeLayoutParams = this.hasBackground ? createParentRelativeLayoutParams() : null;
        WebViewManager.Position position = this.displayLocation;
        showDraggableView(position, layoutParams, createParentRelativeLayoutParams, createDraggableLayoutParams(this.pageHeight, position, this.disableDragDismiss));
    }

    private int getDisplayYSize() {
        return OSViewUtils.getWindowHeight(this.currentActivity);
    }

    /* renamed from: com.onesignal.InAppMessageView$9  reason: invalid class name */
    static /* synthetic */ class AnonymousClass9 {
        static final /* synthetic */ int[] $SwitchMap$com$onesignal$WebViewManager$Position;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.onesignal.WebViewManager$Position[] r0 = com.onesignal.WebViewManager.Position.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$onesignal$WebViewManager$Position = r0
                com.onesignal.WebViewManager$Position r1 = com.onesignal.WebViewManager.Position.TOP_BANNER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$onesignal$WebViewManager$Position     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onesignal.WebViewManager$Position r1 = com.onesignal.WebViewManager.Position.BOTTOM_BANNER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$onesignal$WebViewManager$Position     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onesignal.WebViewManager$Position r1 = com.onesignal.WebViewManager.Position.CENTER_MODAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$onesignal$WebViewManager$Position     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onesignal.WebViewManager$Position r1 = com.onesignal.WebViewManager.Position.FULL_SCREEN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.InAppMessageView.AnonymousClass9.<clinit>():void");
        }
    }

    private RelativeLayout.LayoutParams createParentRelativeLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.pageWidth, -1);
        int i = AnonymousClass9.$SwitchMap$com$onesignal$WebViewManager$Position[this.displayLocation.ordinal()];
        if (i == 1) {
            layoutParams.addRule(10);
            layoutParams.addRule(14);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(14);
        } else if (i == 3 || i == 4) {
            layoutParams.addRule(13);
        }
        return layoutParams;
    }

    /* access modifiers changed from: private */
    public DraggableRelativeLayout.Params createDraggableLayoutParams(int i, WebViewManager.Position position, boolean z) {
        DraggableRelativeLayout.Params params = new DraggableRelativeLayout.Params();
        params.maxXPos = this.marginPxSizeRight;
        params.maxYPos = this.marginPxSizeTop;
        params.draggingDisabled = z;
        params.messageHeight = i;
        params.height = getDisplayYSize();
        int i2 = AnonymousClass9.$SwitchMap$com$onesignal$WebViewManager$Position[position.ordinal()];
        int i3 = 1;
        if (i2 == 1) {
            params.dragThresholdY = this.marginPxSizeTop - DRAG_THRESHOLD_PX_SIZE;
        } else if (i2 != 2) {
            if (i2 != 3) {
                if (i2 == 4) {
                    i = getDisplayYSize() - (this.marginPxSizeBottom + this.marginPxSizeTop);
                    params.messageHeight = i;
                }
            }
            int displayYSize = (getDisplayYSize() / 2) - (i / 2);
            params.dragThresholdY = DRAG_THRESHOLD_PX_SIZE + displayYSize;
            params.maxYPos = displayYSize;
            params.posY = displayYSize;
        } else {
            params.posY = getDisplayYSize() - i;
            params.dragThresholdY = this.marginPxSizeBottom + DRAG_THRESHOLD_PX_SIZE;
        }
        if (position == WebViewManager.Position.TOP_BANNER) {
            i3 = 0;
        }
        params.dragDirection = i3;
        return params;
    }

    private void showDraggableView(WebViewManager.Position position, RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2, DraggableRelativeLayout.Params params) {
        final RelativeLayout.LayoutParams layoutParams3 = layoutParams;
        final RelativeLayout.LayoutParams layoutParams4 = layoutParams2;
        final DraggableRelativeLayout.Params params2 = params;
        final WebViewManager.Position position2 = position;
        OSUtils.runOnMainUIThread(new Runnable() {
            public void run() {
                if (InAppMessageView.this.webView != null) {
                    InAppMessageView.this.webView.setLayoutParams(layoutParams3);
                    Context applicationContext = InAppMessageView.this.currentActivity.getApplicationContext();
                    InAppMessageView.this.setUpDraggableLayout(applicationContext, layoutParams4, params2);
                    InAppMessageView.this.setUpParentRelativeLayout(applicationContext);
                    InAppMessageView inAppMessageView = InAppMessageView.this;
                    inAppMessageView.createPopupWindow(inAppMessageView.parentRelativeLayout);
                    if (InAppMessageView.this.messageController != null) {
                        InAppMessageView inAppMessageView2 = InAppMessageView.this;
                        inAppMessageView2.animateInAppMessage(position2, inAppMessageView2.draggableRelativeLayout, InAppMessageView.this.parentRelativeLayout);
                    }
                    InAppMessageView.this.startDismissTimerIfNeeded();
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (r5 != 4) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void createPopupWindow(android.widget.RelativeLayout r5) {
        /*
            r4 = this;
            android.widget.PopupWindow r0 = new android.widget.PopupWindow
            boolean r1 = r4.hasBackground
            r2 = -1
            if (r1 == 0) goto L_0x0009
            r1 = -1
            goto L_0x000b
        L_0x0009:
            int r1 = r4.pageWidth
        L_0x000b:
            boolean r3 = r4.hasBackground
            if (r3 == 0) goto L_0x0010
            goto L_0x0011
        L_0x0010:
            r2 = -2
        L_0x0011:
            r3 = 1
            r0.<init>(r5, r1, r2, r3)
            r4.popupWindow = r0
            android.graphics.drawable.ColorDrawable r5 = new android.graphics.drawable.ColorDrawable
            r1 = 0
            r5.<init>(r1)
            r0.setBackgroundDrawable(r5)
            android.widget.PopupWindow r5 = r4.popupWindow
            r5.setTouchable(r3)
            android.widget.PopupWindow r5 = r4.popupWindow
            r5.setClippingEnabled(r1)
            boolean r5 = r4.hasBackground
            if (r5 != 0) goto L_0x004a
            int[] r5 = com.onesignal.InAppMessageView.AnonymousClass9.$SwitchMap$com$onesignal$WebViewManager$Position
            com.onesignal.WebViewManager$Position r0 = r4.displayLocation
            int r0 = r0.ordinal()
            r5 = r5[r0]
            if (r5 == r3) goto L_0x0047
            r0 = 2
            if (r5 == r0) goto L_0x0044
            r0 = 3
            if (r5 == r0) goto L_0x004b
            r0 = 4
            if (r5 == r0) goto L_0x004b
            goto L_0x004a
        L_0x0044:
            r3 = 81
            goto L_0x004b
        L_0x0047:
            r3 = 49
            goto L_0x004b
        L_0x004a:
            r3 = 0
        L_0x004b:
            com.onesignal.OSInAppMessageContent r5 = r4.messageContent
            boolean r5 = r5.isFullBleed()
            if (r5 == 0) goto L_0x0056
            r5 = 1000(0x3e8, float:1.401E-42)
            goto L_0x0058
        L_0x0056:
            r5 = 1003(0x3eb, float:1.406E-42)
        L_0x0058:
            android.widget.PopupWindow r0 = r4.popupWindow
            androidx.core.widget.PopupWindowCompat.setWindowLayoutType(r0, r5)
            android.widget.PopupWindow r5 = r4.popupWindow
            android.app.Activity r0 = r4.currentActivity
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            android.view.View r0 = r0.getRootView()
            r5.showAtLocation(r0, r3, r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.InAppMessageView.createPopupWindow(android.widget.RelativeLayout):void");
    }

    /* access modifiers changed from: private */
    public void setUpParentRelativeLayout(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.parentRelativeLayout = relativeLayout;
        relativeLayout.setBackgroundDrawable(new ColorDrawable(0));
        this.parentRelativeLayout.setClipChildren(false);
        this.parentRelativeLayout.setClipToPadding(false);
        this.parentRelativeLayout.addView(this.draggableRelativeLayout);
    }

    /* access modifiers changed from: private */
    public void setUpDraggableLayout(Context context, RelativeLayout.LayoutParams layoutParams, DraggableRelativeLayout.Params params) {
        DraggableRelativeLayout draggableRelativeLayout2 = new DraggableRelativeLayout(context);
        this.draggableRelativeLayout = draggableRelativeLayout2;
        if (layoutParams != null) {
            draggableRelativeLayout2.setLayoutParams(layoutParams);
        }
        this.draggableRelativeLayout.setParams(params);
        this.draggableRelativeLayout.setListener(new DraggableRelativeLayout.DraggableListener() {
            public void onDismiss() {
                if (InAppMessageView.this.messageController != null) {
                    InAppMessageView.this.messageController.onMessageWillDismiss();
                }
                InAppMessageView.this.finishAfterDelay((WebViewManager.OneSignalGenericCallback) null);
            }

            public void onDragStart() {
                boolean unused = InAppMessageView.this.isDragging = true;
            }

            public void onDragEnd() {
                boolean unused = InAppMessageView.this.isDragging = false;
            }
        });
        if (this.webView.getParent() != null) {
            ((ViewGroup) this.webView.getParent()).removeAllViews();
        }
        CardView createCardView = createCardView(context);
        createCardView.setTag(IN_APP_MESSAGE_CARD_VIEW_TAG);
        createCardView.addView(this.webView);
        this.draggableRelativeLayout.setPadding(this.marginPxSizeLeft, this.marginPxSizeTop, this.marginPxSizeRight, this.marginPxSizeBottom);
        this.draggableRelativeLayout.setClipChildren(false);
        this.draggableRelativeLayout.setClipToPadding(false);
        this.draggableRelativeLayout.addView(createCardView);
    }

    /* access modifiers changed from: package-private */
    public boolean isDragging() {
        return this.isDragging;
    }

    private CardView createCardView(Context context) {
        CardView cardView = new CardView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.displayLocation == WebViewManager.Position.FULL_SCREEN ? -1 : -2);
        layoutParams.addRule(13);
        cardView.setLayoutParams(layoutParams);
        if (Build.VERSION.SDK_INT == 23) {
            cardView.setCardElevation(0.0f);
        } else {
            cardView.setCardElevation((float) OSViewUtils.dpToPx(5));
        }
        cardView.setRadius((float) OSViewUtils.dpToPx(8));
        cardView.setClipChildren(false);
        cardView.setClipToPadding(false);
        cardView.setPreventCornerOverlap(false);
        cardView.setCardBackgroundColor(0);
        return cardView;
    }

    /* access modifiers changed from: private */
    public void startDismissTimerIfNeeded() {
        if (this.displayDuration > 0.0d && this.scheduleDismissRunnable == null) {
            AnonymousClass4 r0 = new Runnable() {
                public void run() {
                    if (InAppMessageView.this.messageController != null) {
                        InAppMessageView.this.messageController.onMessageWillDismiss();
                    }
                    if (InAppMessageView.this.currentActivity != null) {
                        InAppMessageView.this.dismissAndAwaitNextMessage((WebViewManager.OneSignalGenericCallback) null);
                        Runnable unused = InAppMessageView.this.scheduleDismissRunnable = null;
                        return;
                    }
                    boolean unused2 = InAppMessageView.this.shouldDismissWhenActive = true;
                }
            };
            this.scheduleDismissRunnable = r0;
            this.handler.postDelayed(r0, ((long) this.displayDuration) * 1000);
        }
    }

    /* access modifiers changed from: private */
    public void delayShowUntilAvailable(final Activity activity) {
        if (!OSViewUtils.isActivityFullyReady(activity) || this.parentRelativeLayout != null) {
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    InAppMessageView.this.delayShowUntilAvailable(activity);
                }
            }, 200);
        } else {
            showInAppMessageView(activity);
        }
    }

    /* access modifiers changed from: package-private */
    public void dismissAndAwaitNextMessage(WebViewManager.OneSignalGenericCallback oneSignalGenericCallback) {
        DraggableRelativeLayout draggableRelativeLayout2 = this.draggableRelativeLayout;
        if (draggableRelativeLayout2 == null) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "No host presenter to trigger dismiss animation, counting as dismissed already", new Throwable());
            dereferenceViews();
            if (oneSignalGenericCallback != null) {
                oneSignalGenericCallback.onComplete();
                return;
            }
            return;
        }
        draggableRelativeLayout2.dismiss();
        finishAfterDelay(oneSignalGenericCallback);
    }

    /* access modifiers changed from: private */
    public void finishAfterDelay(final WebViewManager.OneSignalGenericCallback oneSignalGenericCallback) {
        OSUtils.runOnMainThreadDelayed(new Runnable() {
            public void run() {
                if (!InAppMessageView.this.hasBackground || InAppMessageView.this.parentRelativeLayout == null) {
                    InAppMessageView.this.cleanupViewsAfterDismiss();
                    WebViewManager.OneSignalGenericCallback oneSignalGenericCallback = oneSignalGenericCallback;
                    if (oneSignalGenericCallback != null) {
                        oneSignalGenericCallback.onComplete();
                        return;
                    }
                    return;
                }
                InAppMessageView inAppMessageView = InAppMessageView.this;
                inAppMessageView.animateAndDismissLayout(inAppMessageView.parentRelativeLayout, oneSignalGenericCallback);
            }
        }, 600);
    }

    /* access modifiers changed from: private */
    public void cleanupViewsAfterDismiss() {
        removeAllViews();
        InAppMessageViewListener inAppMessageViewListener = this.messageController;
        if (inAppMessageViewListener != null) {
            inAppMessageViewListener.onMessageWasDismissed();
        }
    }

    /* access modifiers changed from: package-private */
    public void removeAllViews() {
        OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "InAppMessageView removing views");
        Runnable runnable = this.scheduleDismissRunnable;
        if (runnable != null) {
            this.handler.removeCallbacks(runnable);
            this.scheduleDismissRunnable = null;
        }
        DraggableRelativeLayout draggableRelativeLayout2 = this.draggableRelativeLayout;
        if (draggableRelativeLayout2 != null) {
            draggableRelativeLayout2.removeAllViews();
        }
        PopupWindow popupWindow2 = this.popupWindow;
        if (popupWindow2 != null) {
            popupWindow2.dismiss();
        }
        dereferenceViews();
    }

    private void dereferenceViews() {
        this.parentRelativeLayout = null;
        this.draggableRelativeLayout = null;
        this.webView = null;
    }

    /* access modifiers changed from: private */
    public void animateInAppMessage(WebViewManager.Position position, View view, View view2) {
        CardView cardView = (CardView) view.findViewWithTag(IN_APP_MESSAGE_CARD_VIEW_TAG);
        Animation.AnimationListener createAnimationListener = createAnimationListener(cardView);
        int i = AnonymousClass9.$SwitchMap$com$onesignal$WebViewManager$Position[position.ordinal()];
        if (i == 1) {
            animateTop(cardView, this.webView.getHeight(), createAnimationListener);
        } else if (i == 2) {
            animateBottom(cardView, this.webView.getHeight(), createAnimationListener);
        } else if (i == 3 || i == 4) {
            animateCenter(view, view2, createAnimationListener, (Animator.AnimatorListener) null);
        }
    }

    private Animation.AnimationListener createAnimationListener(final CardView cardView) {
        return new Animation.AnimationListener() {
            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }

            public void onAnimationEnd(Animation animation) {
                if (Build.VERSION.SDK_INT == 23) {
                    cardView.setCardElevation((float) OSViewUtils.dpToPx(5));
                }
                if (InAppMessageView.this.messageController != null) {
                    InAppMessageView.this.messageController.onMessageWasShown();
                }
            }
        };
    }

    private void animateTop(View view, int i, Animation.AnimationListener animationListener) {
        OneSignalAnimate.animateViewByTranslation(view, (float) ((-i) - this.marginPxSizeTop), 0.0f, 1000, new OneSignalBounceInterpolator(0.1d, 8.0d), animationListener).start();
    }

    private void animateBottom(View view, int i, Animation.AnimationListener animationListener) {
        OneSignalAnimate.animateViewByTranslation(view, (float) (i + this.marginPxSizeBottom), 0.0f, 1000, new OneSignalBounceInterpolator(0.1d, 8.0d), animationListener).start();
    }

    private void animateCenter(View view, View view2, Animation.AnimationListener animationListener, Animator.AnimatorListener animatorListener) {
        Animation animateViewSmallToLarge = OneSignalAnimate.animateViewSmallToLarge(view, 1000, new OneSignalBounceInterpolator(0.1d, 8.0d), animationListener);
        ValueAnimator animateBackgroundColor = animateBackgroundColor(view2, IN_APP_BACKGROUND_ANIMATION_DURATION_MS, ACTIVITY_BACKGROUND_COLOR_EMPTY, ACTIVITY_BACKGROUND_COLOR_FULL, animatorListener);
        animateViewSmallToLarge.start();
        animateBackgroundColor.start();
    }

    /* access modifiers changed from: private */
    public void animateAndDismissLayout(View view, final WebViewManager.OneSignalGenericCallback oneSignalGenericCallback) {
        View view2 = view;
        animateBackgroundColor(view2, IN_APP_BACKGROUND_ANIMATION_DURATION_MS, ACTIVITY_BACKGROUND_COLOR_FULL, ACTIVITY_BACKGROUND_COLOR_EMPTY, new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                InAppMessageView.this.cleanupViewsAfterDismiss();
                WebViewManager.OneSignalGenericCallback oneSignalGenericCallback = oneSignalGenericCallback;
                if (oneSignalGenericCallback != null) {
                    oneSignalGenericCallback.onComplete();
                }
            }
        }).start();
    }

    private ValueAnimator animateBackgroundColor(View view, int i, int i2, int i3, Animator.AnimatorListener animatorListener) {
        return OneSignalAnimate.animateViewColor(view, i, i2, i3, animatorListener);
    }

    public String toString() {
        return "InAppMessageView{currentActivity=" + this.currentActivity + ", pageWidth=" + this.pageWidth + ", pageHeight=" + this.pageHeight + ", displayDuration=" + this.displayDuration + ", hasBackground=" + this.hasBackground + ", shouldDismissWhenActive=" + this.shouldDismissWhenActive + ", isDragging=" + this.isDragging + ", disableDragDismiss=" + this.disableDragDismiss + ", displayLocation=" + this.displayLocation + ", webView=" + this.webView + '}';
    }
}
