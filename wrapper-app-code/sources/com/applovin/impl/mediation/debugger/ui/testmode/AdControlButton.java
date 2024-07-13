package com.applovin.impl.mediation.debugger.ui.testmode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.applovin.impl.sdk.utils.g;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.R;
import com.appodeal.ads.modules.common.internal.LogConstants;

public class AdControlButton extends RelativeLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final Button f14901a;

    /* renamed from: b  reason: collision with root package name */
    private final com.applovin.impl.adview.a f14902b;

    /* renamed from: c  reason: collision with root package name */
    private b f14903c;

    /* renamed from: d  reason: collision with root package name */
    private MaxAdFormat f14904d;

    /* renamed from: e  reason: collision with root package name */
    private a f14905e;

    public interface a {
        void onClick(AdControlButton adControlButton);
    }

    public enum b {
        LOAD,
        LOADING,
        SHOW
    }

    public AdControlButton(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public AdControlButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdControlButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14901a = new Button(getContext());
        this.f14902b = new com.applovin.impl.adview.a(getContext(), 20, 16842873);
        this.f14903c = b.LOAD;
        setBackgroundColor(0);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f14901a.setTextColor(-1);
        this.f14901a.setOnClickListener(this);
        frameLayout.addView(this.f14901a, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f14902b.setColor(-1);
        addView(this.f14902b, new FrameLayout.LayoutParams(-1, -1, 17));
        a(b.LOAD);
    }

    private void a(b bVar) {
        if (b.LOADING == bVar) {
            setEnabled(false);
            this.f14902b.a();
        } else {
            setEnabled(true);
            this.f14902b.b();
        }
        this.f14901a.setText(b(bVar));
        this.f14901a.setBackgroundColor(c(bVar));
    }

    private String b(b bVar) {
        return b.LOAD == bVar ? "Load" : b.LOADING == bVar ? "" : LogConstants.EVENT_SHOW;
    }

    private int c(b bVar) {
        return g.a((b.LOAD == bVar || b.LOADING == bVar) ? R.color.applovin_sdk_brand_color : R.color.applovin_sdk_adControlbutton_brightBlueColor, getContext());
    }

    public b getControlState() {
        return this.f14903c;
    }

    public MaxAdFormat getFormat() {
        return this.f14904d;
    }

    public void onClick(View view) {
        a aVar = this.f14905e;
        if (aVar != null) {
            aVar.onClick(this);
        }
    }

    public void setControlState(b bVar) {
        if (this.f14903c != bVar) {
            a(bVar);
        }
        this.f14903c = bVar;
    }

    public void setFormat(MaxAdFormat maxAdFormat) {
        this.f14904d = maxAdFormat;
    }

    public void setOnClickListener(a aVar) {
        this.f14905e = aVar;
    }
}
