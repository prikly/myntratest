package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.api.f.b;
import com.bytedance.sdk.component.utils.l;
import org.json.JSONObject;

public class AdSlot {
    public static final int TYPE_BANNER = 1;
    public static final int TYPE_BANNER_NATIVE = 10;
    public static final int TYPE_CACHED_SPLASH = 4;
    public static final int TYPE_DRAW_FEED = 9;
    public static final int TYPE_FEED = 5;
    public static final int TYPE_FULL_SCREEN_VIDEO = 8;
    public static final int TYPE_INTERACTION_AD = 2;
    public static final int TYPE_OPEN_AD = 3;
    public static final int TYPE_REWARD_VIDEO = 7;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public String f19291a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public int f19292b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public int f19293c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public float f19294d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public float f19295e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f19296f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f19297g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public String f19298h;
    /* access modifiers changed from: private */
    public int i;
    /* access modifiers changed from: private */
    public String j;
    /* access modifiers changed from: private */
    public String k;
    /* access modifiers changed from: private */
    public int l;
    /* access modifiers changed from: private */
    public boolean m;
    /* access modifiers changed from: private */
    public boolean n;
    /* access modifiers changed from: private */
    public String o;
    /* access modifiers changed from: private */
    public String p;
    /* access modifiers changed from: private */
    public String q;
    /* access modifiers changed from: private */
    public String r;
    /* access modifiers changed from: private */
    public String s;
    private int t;
    private int u;
    private int v;
    private int w;

    private AdSlot() {
        this.m = true;
        this.n = false;
        this.t = 0;
        this.u = 0;
        this.v = 0;
    }

    public static int getPosition(int i2) {
        if (i2 == 1) {
            return 2;
        }
        if (i2 != 2) {
            return (i2 == 3 || i2 == 4 || i2 == 7 || i2 == 8) ? 5 : 3;
        }
        return 4;
    }

    public static AdSlot getSlot(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Builder builder = new Builder();
        try {
            int optInt = jSONObject.optInt("mImgAcceptedWidth", 640);
            int optInt2 = jSONObject.optInt("mImgAcceptedHeight", 320);
            double optDouble = jSONObject.optDouble("mExpressViewAcceptedWidth", 0.0d);
            double optDouble2 = jSONObject.optDouble("mExpressViewAcceptedHeight", 0.0d);
            builder.setCodeId(jSONObject.optString("mCodeId", (String) null));
            builder.setAdCount(jSONObject.optInt("mAdCount", 1));
            builder.setIsAutoPlay(jSONObject.optBoolean("mIsAutoPlay"));
            builder.setImageAcceptedSize(optInt, optInt2);
            builder.setExpressViewAcceptedSize(Double.valueOf(optDouble).floatValue(), Double.valueOf(optDouble2).floatValue());
            builder.setSupportDeepLink(jSONObject.optBoolean("mSupportDeepLink", false));
            builder.setRewardName(jSONObject.optString("mRewardName", (String) null));
            builder.setRewardAmount(jSONObject.optInt("mRewardAmount"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra", (String) null));
            builder.setUserID(jSONObject.optString("mUserID", (String) null));
            builder.setNativeAdType(jSONObject.optInt("mNativeAdType"));
            builder.isExpressAd(jSONObject.optBoolean("mIsExpressAd"));
            builder.withBid(jSONObject.optString("mBidAdm"));
        } catch (Exception unused) {
        }
        return builder.build();
    }

    public int getAdCount() {
        return this.f19296f;
    }

    public String getAdId() {
        return this.p;
    }

    public String getBidAdm() {
        return this.o;
    }

    public String getCodeId() {
        return this.f19291a;
    }

    public String getCreativeId() {
        return this.q;
    }

    public int getDurationSlotType() {
        return this.w;
    }

    public float getExpressViewAcceptedHeight() {
        return this.f19295e;
    }

    public float getExpressViewAcceptedWidth() {
        return this.f19294d;
    }

    public String getExt() {
        return this.r;
    }

    public int getImgAcceptedHeight() {
        return this.f19293c;
    }

    public int getImgAcceptedWidth() {
        return this.f19292b;
    }

    public int getIsRotateBanner() {
        return this.t;
    }

    public String getMediaExtra() {
        return this.j;
    }

    public int getNativeAdType() {
        return this.l;
    }

    @Deprecated
    public int getRewardAmount() {
        return this.i;
    }

    @Deprecated
    public String getRewardName() {
        return this.f19298h;
    }

    public int getRotateOrder() {
        return this.v;
    }

    public int getRotateTime() {
        return this.u;
    }

    public String getUserData() {
        return this.s;
    }

    public String getUserID() {
        return this.k;
    }

    public boolean isAutoPlay() {
        return this.m;
    }

    public boolean isExpressAd() {
        return this.n;
    }

    public boolean isSupportDeepLink() {
        return this.f19297g;
    }

    public void setAdCount(int i2) {
        this.f19296f = i2;
    }

    public void setDurationSlotType(int i2) {
        this.w = i2;
    }

    public void setIsRotateBanner(int i2) {
        this.t = i2;
    }

    public void setNativeAdType(int i2) {
        this.l = i2;
    }

    public void setRotateOrder(int i2) {
        this.v = i2;
    }

    public void setRotateTime(int i2) {
        this.u = i2;
    }

    public void setUserData(String str) {
        this.s = str;
    }

    public JSONObject toJsonObj() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mCodeId", this.f19291a);
            jSONObject.put("mAdCount", this.f19296f);
            jSONObject.put("mIsAutoPlay", this.m);
            jSONObject.put("mImgAcceptedWidth", this.f19292b);
            jSONObject.put("mImgAcceptedHeight", this.f19293c);
            jSONObject.put("mExpressViewAcceptedWidth", (double) this.f19294d);
            jSONObject.put("mExpressViewAcceptedHeight", (double) this.f19295e);
            jSONObject.put("mSupportDeepLink", this.f19297g);
            jSONObject.put("mRewardName", this.f19298h);
            jSONObject.put("mRewardAmount", this.i);
            jSONObject.put("mMediaExtra", this.j);
            jSONObject.put("mUserID", this.k);
            jSONObject.put("mNativeAdType", this.l);
            jSONObject.put("mIsExpressAd", this.n);
            jSONObject.put("mAdId", this.p);
            jSONObject.put("mCreativeId", this.q);
            jSONObject.put("mExt", this.r);
            jSONObject.put("mBidAdm", this.o);
            jSONObject.put("mUserData", this.s);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String toString() {
        return "AdSlot{mCodeId='" + this.f19291a + '\'' + ", mImgAcceptedWidth=" + this.f19292b + ", mImgAcceptedHeight=" + this.f19293c + ", mExpressViewAcceptedWidth=" + this.f19294d + ", mExpressViewAcceptedHeight=" + this.f19295e + ", mAdCount=" + this.f19296f + ", mSupportDeepLink=" + this.f19297g + ", mRewardName='" + this.f19298h + '\'' + ", mRewardAmount=" + this.i + ", mMediaExtra='" + this.j + '\'' + ", mUserID='" + this.k + '\'' + ", mNativeAdType=" + this.l + ", mIsAutoPlay=" + this.m + ", mAdId" + this.p + ", mCreativeId" + this.q + ", mExt" + this.r + ", mUserData" + this.s + '}';
    }

    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        private String f19299a;

        /* renamed from: b  reason: collision with root package name */
        private int f19300b = 640;

        /* renamed from: c  reason: collision with root package name */
        private int f19301c = 320;

        /* renamed from: d  reason: collision with root package name */
        private boolean f19302d = true;

        /* renamed from: e  reason: collision with root package name */
        private int f19303e = 1;

        /* renamed from: f  reason: collision with root package name */
        private String f19304f = "";

        /* renamed from: g  reason: collision with root package name */
        private int f19305g = 0;

        /* renamed from: h  reason: collision with root package name */
        private String f19306h;
        private String i = "defaultUser";
        private int j;
        private float k;
        private float l;
        private boolean m;
        private String n;
        private String o;
        private String p;
        private String q;
        private String r;
        private boolean s = true;

        @Deprecated
        public Builder setRewardAmount(int i2) {
            return this;
        }

        @Deprecated
        public Builder setRewardName(String str) {
            return this;
        }

        @Deprecated
        public Builder setSupportDeepLink(boolean z) {
            return this;
        }

        public Builder setAdId(String str) {
            this.o = str;
            return this;
        }

        public Builder setCreativeId(String str) {
            this.p = str;
            return this;
        }

        public Builder setExt(String str) {
            this.q = str;
            return this;
        }

        public Builder setIsAutoPlay(boolean z) {
            this.s = z;
            return this;
        }

        public Builder setCodeId(String str) {
            this.f19299a = str;
            return this;
        }

        public Builder isExpressAd(boolean z) {
            this.m = z;
            return this;
        }

        public Builder setImageAcceptedSize(int i2, int i3) {
            this.f19300b = i2;
            this.f19301c = i3;
            return this;
        }

        public Builder setExpressViewAcceptedSize(float f2, float f3) {
            this.k = f2;
            this.l = f3;
            return this;
        }

        public Builder setAdCount(int i2) {
            if (i2 <= 0) {
                i2 = 1;
                l.c(TTAdConstant.TAG, "setAdCount: adCount must greater than 0 ");
            }
            if (i2 > 20) {
                l.c(TTAdConstant.TAG, "setAdCount: adCount must less than or equal to 20 ");
                i2 = 20;
            }
            this.f19303e = i2;
            return this;
        }

        public Builder setMediaExtra(String str) {
            this.f19306h = str;
            return this;
        }

        public Builder setUserID(String str) {
            this.i = str;
            return this;
        }

        public Builder setNativeAdType(int i2) {
            this.j = i2;
            return this;
        }

        public Builder withBid(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            l.c("bidding", "AdSlot -> bidAdm=" + b.a(str));
            this.n = str;
            return this;
        }

        public Builder setUserData(String str) {
            this.r = str;
            return this;
        }

        public AdSlot build() {
            AdSlot adSlot = new AdSlot();
            String unused = adSlot.f19291a = this.f19299a;
            int unused2 = adSlot.f19296f = this.f19303e;
            boolean unused3 = adSlot.f19297g = this.f19302d;
            int unused4 = adSlot.f19292b = this.f19300b;
            int unused5 = adSlot.f19293c = this.f19301c;
            float f2 = this.k;
            if (f2 <= 0.0f) {
                float unused6 = adSlot.f19294d = (float) this.f19300b;
                float unused7 = adSlot.f19295e = (float) this.f19301c;
            } else {
                float unused8 = adSlot.f19294d = f2;
                float unused9 = adSlot.f19295e = this.l;
            }
            String unused10 = adSlot.f19298h = this.f19304f;
            int unused11 = adSlot.i = this.f19305g;
            String unused12 = adSlot.j = this.f19306h;
            String unused13 = adSlot.k = this.i;
            int unused14 = adSlot.l = this.j;
            boolean unused15 = adSlot.m = this.s;
            boolean unused16 = adSlot.n = this.m;
            String unused17 = adSlot.o = this.n;
            String unused18 = adSlot.p = this.o;
            String unused19 = adSlot.q = this.p;
            String unused20 = adSlot.r = this.q;
            String unused21 = adSlot.s = this.r;
            return adSlot;
        }
    }
}
