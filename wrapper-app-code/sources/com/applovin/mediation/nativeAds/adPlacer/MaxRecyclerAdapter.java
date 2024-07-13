package com.applovin.mediation.nativeAds.adPlacer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.applovin.impl.mediation.nativeAds.a.c;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.Collection;

public class MaxRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements MaxAdPlacer.Listener {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final MaxAdPlacer f16065a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView.Adapter f16066b;

    /* renamed from: c  reason: collision with root package name */
    private final a f16067c = new a();

    /* renamed from: d  reason: collision with root package name */
    private RecyclerView f16068d;

    /* renamed from: e  reason: collision with root package name */
    private c f16069e;

    /* renamed from: f  reason: collision with root package name */
    private MaxAdPlacer.Listener f16070f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public int f16071g = 8;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public AdPositionBehavior f16072h = AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND;

    public enum AdPositionBehavior {
        DYNAMIC_EXCEPT_ON_APPEND,
        DYNAMIC,
        FIXED
    }

    public static class MaxAdRecyclerViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private final ViewGroup f16075a;

        public MaxAdRecyclerViewHolder(View view) {
            super(view);
            this.f16075a = (ViewGroup) view.findViewById(R.id.applovin_native_ad_view_container);
        }

        public ViewGroup getContainerView() {
            return this.f16075a;
        }
    }

    private class a extends RecyclerView.AdapterDataObserver {
        private a() {
        }

        public void onChanged() {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        public void onItemRangeChanged(int i, int i2) {
            int adjustedPosition = MaxRecyclerAdapter.this.f16065a.getAdjustedPosition(i);
            MaxRecyclerAdapter.this.notifyItemRangeChanged(adjustedPosition, (MaxRecyclerAdapter.this.f16065a.getAdjustedPosition((i + i2) - 1) - adjustedPosition) + 1);
        }

        public void onItemRangeInserted(int i, int i2) {
            int i3 = 0;
            boolean z = i + i2 >= MaxRecyclerAdapter.this.f16066b.getItemCount();
            if (MaxRecyclerAdapter.this.f16072h == AdPositionBehavior.FIXED || (MaxRecyclerAdapter.this.f16072h == AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND && z)) {
                MaxRecyclerAdapter.this.notifyDataSetChanged();
                return;
            }
            int adjustedPosition = MaxRecyclerAdapter.this.f16065a.getAdjustedPosition(i);
            while (true) {
                MaxRecyclerAdapter maxRecyclerAdapter = MaxRecyclerAdapter.this;
                if (i3 < i2) {
                    maxRecyclerAdapter.f16065a.insertItem(adjustedPosition);
                    i3++;
                } else {
                    maxRecyclerAdapter.notifyItemRangeInserted(adjustedPosition, i2);
                    return;
                }
            }
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        public void onItemRangeRemoved(int i, int i2) {
            int itemCount = MaxRecyclerAdapter.this.f16066b.getItemCount();
            boolean z = i + i2 >= itemCount;
            if (MaxRecyclerAdapter.this.f16072h == AdPositionBehavior.FIXED || (MaxRecyclerAdapter.this.f16072h == AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND && z)) {
                MaxRecyclerAdapter.this.notifyDataSetChanged();
                return;
            }
            int adjustedPosition = MaxRecyclerAdapter.this.f16065a.getAdjustedPosition(i);
            int adjustedCount = MaxRecyclerAdapter.this.f16065a.getAdjustedCount(itemCount + i2);
            for (int i3 = 0; i3 < i2; i3++) {
                MaxRecyclerAdapter.this.f16065a.removeItem(adjustedPosition);
            }
            int adjustedCount2 = MaxRecyclerAdapter.this.f16065a.getAdjustedCount(itemCount);
            int i4 = adjustedCount - adjustedCount2;
            Collection<Integer> clearTrailingAds = MaxRecyclerAdapter.this.f16065a.clearTrailingAds(adjustedCount2 - 1);
            if (!clearTrailingAds.isEmpty()) {
                i4 += clearTrailingAds.size();
            }
            MaxRecyclerAdapter.this.notifyItemRangeRemoved(adjustedPosition - (i4 - i2), i4);
        }
    }

    public MaxRecyclerAdapter(MaxAdPlacerSettings maxAdPlacerSettings, RecyclerView.Adapter adapter, Activity activity) {
        MaxAdPlacer maxAdPlacer = new MaxAdPlacer(maxAdPlacerSettings, activity);
        this.f16065a = maxAdPlacer;
        maxAdPlacer.setListener(this);
        super.setHasStableIds(adapter.hasStableIds());
        this.f16066b = adapter;
        adapter.registerAdapterDataObserver(this.f16067c);
    }

    private int a(int i) {
        int pxToDp = AppLovinSdkUtils.pxToDp(this.f16068d.getContext(), this.f16068d.getWidth());
        RecyclerView.LayoutManager layoutManager = this.f16068d.getLayoutManager();
        if (!(layoutManager instanceof GridLayoutManager)) {
            return layoutManager instanceof StaggeredGridLayoutManager ? pxToDp / ((StaggeredGridLayoutManager) layoutManager).getSpanCount() : pxToDp;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        return (pxToDp / gridLayoutManager.getSpanCount()) * gridLayoutManager.getSpanSizeLookup().getSpanSize(i);
    }

    public void destroy() {
        try {
            this.f16066b.unregisterAdapterDataObserver(this.f16067c);
        } catch (Exception unused) {
        }
        this.f16065a.destroy();
        c cVar = this.f16069e;
        if (cVar != null) {
            cVar.a();
        }
    }

    public MaxAdPlacer getAdPlacer() {
        return this.f16065a;
    }

    public int getAdjustedPosition(int i) {
        return this.f16065a.getAdjustedPosition(i);
    }

    public int getItemCount() {
        return this.f16065a.getAdjustedCount(this.f16066b.getItemCount());
    }

    public long getItemId(int i) {
        if (!this.f16066b.hasStableIds()) {
            return -1;
        }
        return this.f16065a.isFilledPosition(i) ? this.f16065a.getAdItemId(i) : this.f16066b.getItemId(this.f16065a.getOriginalPosition(i));
    }

    public int getItemViewType(int i) {
        if (this.f16065a.isAdPosition(i)) {
            return -42;
        }
        return this.f16066b.getItemViewType(this.f16065a.getOriginalPosition(i));
    }

    public int getOriginalPosition(int i) {
        return this.f16065a.getOriginalPosition(i);
    }

    public void loadAds() {
        this.f16065a.loadAds();
    }

    public void onAdClicked(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f16070f;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    public void onAdLoaded(int i) {
        notifyItemChanged(i);
        MaxAdPlacer.Listener listener = this.f16070f;
        if (listener != null) {
            listener.onAdLoaded(i);
        }
    }

    public void onAdRemoved(int i) {
        MaxAdPlacer.Listener listener = this.f16070f;
        if (listener != null) {
            listener.onAdRemoved(i);
        }
    }

    public void onAdRevenuePaid(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f16070f;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f16068d = recyclerView;
        c cVar = new c(recyclerView);
        this.f16069e = cVar;
        cVar.a((c.a) new c.a() {
            public void a(int i, int i2) {
                MaxRecyclerAdapter.this.f16065a.updateFillablePositions(i, Math.min(i2 + MaxRecyclerAdapter.this.f16071g, MaxRecyclerAdapter.this.getItemCount() - 1));
            }
        });
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        this.f16069e.a(viewHolder.itemView, i);
        if (this.f16065a.isAdPosition(i)) {
            AppLovinSdkUtils.Size adSize = this.f16065a.getAdSize(i, a(i));
            ViewGroup containerView = ((MaxAdRecyclerViewHolder) viewHolder).getContainerView();
            ViewGroup.LayoutParams layoutParams = containerView.getLayoutParams();
            if (adSize != AppLovinSdkUtils.Size.ZERO) {
                layoutParams.width = adSize.getWidth() < 0 ? adSize.getWidth() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getWidth());
                layoutParams.height = adSize.getHeight() < 0 ? adSize.getHeight() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getHeight());
                containerView.setLayoutParams(layoutParams);
                this.f16065a.renderAd(i, containerView);
                return;
            }
            layoutParams.width = -2;
            layoutParams.height = -2;
            containerView.setLayoutParams(layoutParams);
            return;
        }
        this.f16066b.onBindViewHolder(viewHolder, this.f16065a.getOriginalPosition(i));
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != -42) {
            return this.f16066b.onCreateViewHolder(viewGroup, i);
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.max_native_ad_recycler_view_item, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        RecyclerView.LayoutManager layoutManager = this.f16068d.getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        } else {
            layoutParams.width = -2;
            layoutParams.height = -1;
        }
        inflate.setLayoutParams(layoutParams);
        return new MaxAdRecyclerViewHolder(inflate);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f16068d = null;
        c cVar = this.f16069e;
        if (cVar != null) {
            cVar.a();
            this.f16069e = null;
        }
    }

    public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        return viewHolder instanceof MaxAdRecyclerViewHolder ? super.onFailedToRecycleView(viewHolder) : this.f16066b.onFailedToRecycleView(viewHolder);
    }

    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof MaxAdRecyclerViewHolder) {
            super.onViewAttachedToWindow(viewHolder);
        } else {
            this.f16066b.onViewAttachedToWindow(viewHolder);
        }
    }

    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof MaxAdRecyclerViewHolder) {
            super.onViewDetachedFromWindow(viewHolder);
        } else {
            this.f16066b.onViewDetachedFromWindow(viewHolder);
        }
    }

    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        c cVar = this.f16069e;
        if (cVar != null) {
            cVar.a(viewHolder.itemView);
        }
        if (viewHolder instanceof MaxAdRecyclerViewHolder) {
            if (this.f16065a.isFilledPosition(viewHolder.getBindingAdapterPosition())) {
                ((MaxAdRecyclerViewHolder) viewHolder).getContainerView().removeAllViews();
            }
            super.onViewRecycled(viewHolder);
            return;
        }
        this.f16066b.onViewRecycled(viewHolder);
    }

    public void setAdPositionBehavior(AdPositionBehavior adPositionBehavior) {
        this.f16072h = adPositionBehavior;
    }

    public void setHasStableIds(boolean z) {
        super.setHasStableIds(z);
        this.f16066b.unregisterAdapterDataObserver(this.f16067c);
        this.f16066b.setHasStableIds(z);
        this.f16066b.registerAdapterDataObserver(this.f16067c);
    }

    public void setListener(MaxAdPlacer.Listener listener) {
        this.f16070f = listener;
    }

    public void setLookAhead(int i) {
        this.f16071g = i;
    }
}
