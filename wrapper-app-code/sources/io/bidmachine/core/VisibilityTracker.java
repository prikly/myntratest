package io.bidmachine.core;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class VisibilityTracker {
    private static final int NO_TRACK = -1;
    /* access modifiers changed from: private */
    public static final ArrayList<TrackingHolder> holders = new ArrayList<>();

    public interface VisibilityChangeCallback {
        boolean onViewShown();

        void onViewTrackingFinished();
    }

    private static class TrackingHolder {
        private static final int AFD_MAX_COUNT_OVERLAPPED_VIEWS = 3;
        private static final int CHECK_DELAY = 100;
        private final VisibilityChangeCallback callback;
        private final Runnable checkRunnable = new Runnable() {
            public void run() {
                if (!TrackingHolder.this.check()) {
                    boolean unused = TrackingHolder.this.isCheckerScheduled = false;
                    TrackingHolder.this.scheduleChecker();
                }
            }
        };
        private final Runnable finishRunnable = new Runnable() {
            public void run() {
                TrackingHolder.this.release();
            }
        };
        private final boolean ignoreCheckWindowFocus;
        /* access modifiers changed from: private */
        public boolean isCheckerScheduled;
        private boolean isFinishedRequested;
        private boolean isFinishedTracked;
        private boolean isShownTracked;
        private long lastShownTimeMs;
        private ViewTreeObserver.OnPreDrawListener preDrawListener;
        private final long requiredOnScreenTime;
        /* access modifiers changed from: private */
        public final WeakReference<View> viewReference;
        private final float visibilityPercent;

        TrackingHolder(View view, long j, float f2, boolean z, VisibilityChangeCallback visibilityChangeCallback) {
            this.viewReference = new WeakReference<>(view);
            this.requiredOnScreenTime = j;
            this.visibilityPercent = f2;
            this.ignoreCheckWindowFocus = z;
            this.callback = visibilityChangeCallback;
        }

        public void start() {
            View view = (View) this.viewReference.get();
            if (view == null) {
                release();
                return;
            }
            Logger.log(String.format("Start tracking - %s", new Object[]{view}));
            if (this.preDrawListener == null) {
                this.preDrawListener = new ViewTreeObserver.OnPreDrawListener() {
                    public boolean onPreDraw() {
                        TrackingHolder.this.scheduleChecker();
                        return true;
                    }
                };
            }
            view.getViewTreeObserver().addOnPreDrawListener(this.preDrawListener);
        }

        /* access modifiers changed from: private */
        public void scheduleChecker() {
            if (!this.isCheckerScheduled) {
                this.isCheckerScheduled = true;
                Utils.onUiThread(this.checkRunnable, 100);
            }
        }

        /* access modifiers changed from: private */
        public boolean check() {
            View view = (View) this.viewReference.get();
            if (view == null) {
                release();
                return true;
            } else if (!this.isShownTracked || !this.isFinishedTracked) {
                if (isOnTop(view, this.visibilityPercent, this.ignoreCheckWindowFocus) && this.callback.onViewShown()) {
                    if (!this.isShownTracked) {
                        this.isShownTracked = true;
                    }
                    if (!this.isFinishedRequested && !this.isFinishedTracked) {
                        Utils.onUiThread(this.finishRunnable, this.requiredOnScreenTime);
                        this.lastShownTimeMs = System.currentTimeMillis();
                        this.isFinishedRequested = true;
                    }
                } else if (!this.isFinishedTracked) {
                    Utils.cancelUiThreadTask(this.finishRunnable);
                    this.isFinishedRequested = false;
                    this.lastShownTimeMs = 0;
                }
                return false;
            } else {
                release();
                return true;
            }
        }

        /* access modifiers changed from: private */
        public void release() {
            View view = (View) this.viewReference.get();
            if (view != null) {
                Logger.log(String.format("Stop tracking - %s", new Object[]{view}));
                if (this.isShownTracked && !this.isFinishedTracked && this.requiredOnScreenTime > -1 && this.lastShownTimeMs > 0 && System.currentTimeMillis() - this.lastShownTimeMs >= this.requiredOnScreenTime) {
                    this.isFinishedTracked = true;
                    this.callback.onViewTrackingFinished();
                }
                view.getViewTreeObserver().removeOnPreDrawListener(this.preDrawListener);
            }
            Utils.cancelUiThreadTask(this.checkRunnable);
            Utils.cancelUiThreadTask(this.finishRunnable);
            synchronized (VisibilityTracker.holders) {
                VisibilityTracker.holders.remove(this);
            }
        }

        public boolean isOnTop(View view, float f2, boolean z) {
            ViewGroup viewGroup = view;
            try {
                Rect rect = new Rect();
                if (!viewGroup.getGlobalVisibleRect(rect)) {
                    Logger.log(String.format("Show wasn't tracked: global visibility verification failed - %s", new Object[]{viewGroup}));
                    return false;
                } else if (!view.isShown()) {
                    Logger.log(String.format("Show wasn't tracked: view visibility verification failed - %s", new Object[]{viewGroup}));
                    return false;
                } else if (Utils.isViewTransparent(view)) {
                    Logger.log(String.format("Show wasn't tracked: view transparent verification failed - %s", new Object[]{viewGroup}));
                    return false;
                } else if (z || view.hasWindowFocus()) {
                    float width = (float) (view.getWidth() * view.getHeight());
                    if (width == 0.0f) {
                        Logger.log(String.format("Show wasn't tracked: view size verification failed - %s", new Object[]{viewGroup}));
                        return false;
                    }
                    float width2 = ((float) (rect.width() * rect.height())) / width;
                    if (width2 < f2) {
                        Logger.log(String.format("Show wasn't tracked: ad view not completely visible (%s / %s) - %s", new Object[]{Float.valueOf(width2), Float.valueOf(f2), viewGroup}));
                        return false;
                    }
                    View view2 = (View) view.getParent();
                    while (view2 != null && view2.getId() != 16908290) {
                        view2 = (View) view2.getParent();
                    }
                    if (view2 == null) {
                        Logger.log(String.format("Show wasn't tracked: activity content layout not found - %s", new Object[]{viewGroup}));
                        return false;
                    }
                    Rect rect2 = new Rect();
                    view2.getGlobalVisibleRect(rect2);
                    if (!Rect.intersects(rect, rect2)) {
                        Logger.log(String.format("Show wasn't tracked: ad view is out of current window - %s", new Object[]{viewGroup}));
                        return false;
                    }
                    ViewGroup viewGroup2 = (ViewGroup) view.getRootView();
                    ViewGroup viewGroup3 = (ViewGroup) view.getParent();
                    int i = 0;
                    while (viewGroup3 != null) {
                        for (int indexOfChild = viewGroup3.indexOfChild(viewGroup) + 1; indexOfChild < viewGroup3.getChildCount(); indexOfChild++) {
                            View childAt = viewGroup3.getChildAt(indexOfChild);
                            if (childAt.getVisibility() == 0) {
                                childAt.getLocationInWindow(new int[2]);
                                Rect viewRectangle = Utils.getViewRectangle(childAt);
                                if (Rect.intersects(rect, viewRectangle)) {
                                    float viewNotOverlappedAreaPercent = viewNotOverlappedAreaPercent(rect, viewRectangle);
                                    Logger.log(String.format("Show wasn't tracked: ad view is overlapped by another visible view (%s), visible percent: %s / %s", new Object[]{childAt, Float.valueOf(viewNotOverlappedAreaPercent), Float.valueOf(f2)}));
                                    if (viewNotOverlappedAreaPercent < f2) {
                                        Logger.log(String.format("Show wasn't tracked: ad view is covered by another view - %s", new Object[]{viewGroup}));
                                        return false;
                                    }
                                    i++;
                                    if (i >= 3) {
                                        Logger.log(String.format("Show wasn't tracked: ad view is covered by too many views - %s", new Object[]{viewGroup}));
                                        return false;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        if (viewGroup3 != viewGroup2) {
                            ViewGroup viewGroup4 = viewGroup3;
                            viewGroup3 = (ViewGroup) viewGroup3.getParent();
                            viewGroup = viewGroup4;
                        } else {
                            viewGroup3 = null;
                        }
                    }
                    return true;
                } else {
                    Logger.log(String.format("Show wasn't tracked: window focus verification failed - %s", new Object[]{viewGroup}));
                    return false;
                }
            } catch (Exception e2) {
                Logger.log((Throwable) e2);
            }
        }

        private static float viewNotOverlappedAreaPercent(Rect rect, Rect rect2) {
            int width = rect.width() * rect.height();
            if (width == 0) {
                return 0.0f;
            }
            return ((float) (width - (Math.max(0, Math.min(rect.right, rect2.right) - Math.max(rect.left, rect2.left)) * Math.max(0, Math.min(rect.bottom, rect2.bottom) - Math.max(rect.top, rect2.top))))) / ((float) width);
        }
    }

    public static void startTracking(View view, long j, float f2, boolean z, VisibilityChangeCallback visibilityChangeCallback) {
        synchronized (holders) {
            stopTracking(view);
            TrackingHolder trackingHolder = new TrackingHolder(view, j, f2, z, visibilityChangeCallback);
            holders.add(trackingHolder);
            trackingHolder.start();
        }
    }

    public static void stopTracking(View view) {
        synchronized (holders) {
            Iterator<TrackingHolder> it = holders.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                TrackingHolder next = it.next();
                if (next.viewReference.get() == view) {
                    next.release();
                    break;
                }
            }
        }
    }
}
