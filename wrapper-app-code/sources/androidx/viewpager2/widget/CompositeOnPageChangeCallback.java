package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ConcurrentModificationException;
import java.util.List;

final class CompositeOnPageChangeCallback extends ViewPager2.OnPageChangeCallback {
    private final List<ViewPager2.OnPageChangeCallback> mCallbacks;

    public void onPageScrolled(int i, float f2, int i2) {
        try {
            for (ViewPager2.OnPageChangeCallback onPageScrolled : this.mCallbacks) {
                onPageScrolled.onPageScrolled(i, f2, i2);
            }
        } catch (ConcurrentModificationException e2) {
            throwCallbackListModifiedWhileInUse(e2);
        }
    }

    public void onPageSelected(int i) {
        try {
            for (ViewPager2.OnPageChangeCallback onPageSelected : this.mCallbacks) {
                onPageSelected.onPageSelected(i);
            }
        } catch (ConcurrentModificationException e2) {
            throwCallbackListModifiedWhileInUse(e2);
        }
    }

    public void onPageScrollStateChanged(int i) {
        try {
            for (ViewPager2.OnPageChangeCallback onPageScrollStateChanged : this.mCallbacks) {
                onPageScrollStateChanged.onPageScrollStateChanged(i);
            }
        } catch (ConcurrentModificationException e2) {
            throwCallbackListModifiedWhileInUse(e2);
        }
    }

    private void throwCallbackListModifiedWhileInUse(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }
}
