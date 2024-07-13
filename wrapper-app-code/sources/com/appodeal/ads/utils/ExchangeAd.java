package com.appodeal.ads.utils;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.appodeal.ads.n5;
import java.util.List;
import java.util.Map;

public class ExchangeAd implements Parcelable {
    public static final int CLICK_REQUEST_ERROR = 1002;
    public static final String CREATIVE_HEIGHT = "X-Appodeal-Creative-Height";
    public static final String CREATIVE_WIDTH = "X-Appodeal-Creative-Width";
    public static final Parcelable.Creator<ExchangeAd> CREATOR = new a();
    public static final int FILL_REQUEST_ERROR = 1004;
    public static final int FINISH_REQUEST_ERROR = 1003;
    public static final int IMPRESSION_REQUEST_ERROR = 1001;
    public static final int LOADING_TIMEOUT_ERROR = 1005;

    /* renamed from: a  reason: collision with root package name */
    public final String f17474a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, List<String>> f17475b;

    /* renamed from: c  reason: collision with root package name */
    public int f17476c = -1;

    /* renamed from: d  reason: collision with root package name */
    public final long f17477d;

    public class a implements Parcelable.Creator<ExchangeAd> {
        public final Object createFromParcel(Parcel parcel) {
            return new ExchangeAd(parcel);
        }

        public final Object[] newArray(int i) {
            return new ExchangeAd[i];
        }
    }

    public ExchangeAd(Parcel parcel) {
        this.f17474a = parcel.readString();
        this.f17475b = parcel.readHashMap(List.class.getClassLoader());
        this.f17476c = parcel.readInt();
        this.f17477d = parcel.readLong();
    }

    public ExchangeAd(String str, Map<String, List<String>> map, long j) {
        this.f17474a = str;
        this.f17475b = map;
        this.f17477d = j;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a() {
        trackError(1002);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        trackError(1004);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        trackError(1003);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d() {
        trackError(1001);
    }

    public final int a(String str) {
        List list;
        try {
            Map<String, List<String>> map = this.f17475b;
            if (map != null && map.containsKey(str) && (list = this.f17475b.get(str)) != null && list.size() > 0) {
                return Integer.parseInt((String) list.get(0));
            }
        } catch (Exception e2) {
            Log.log(e2);
        }
        return 0;
    }

    public final void a(String str, String str2, Runnable runnable) {
        Map<String, List<String>> map = this.f17475b;
        if (map != null && map.containsKey(str)) {
            for (String str3 : this.f17475b.get(str)) {
                long j = this.f17477d;
                int i = this.f17476c;
                n5.a(TextUtils.isEmpty(str3) ? null : str3.replace("%%SEGMENT%%", String.valueOf(j)).replace("%25%25SEGMENT%25%25", String.valueOf(j)).replace("%%PLACEMENT%%", String.valueOf(i)).replace("%25%25PLACEMENT%25%25", String.valueOf(i)).replace("%%ERRORCODE%%", str2).replace("%25%25ERRORCODE%25%25", str2), s.f17568e, runnable);
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public String getAdm() {
        return this.f17474a;
    }

    public int getCloseTime() {
        return a("X-Appodeal-Close-Time");
    }

    public int getHeight() {
        return a(CREATIVE_HEIGHT);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        r0 = r2.f17475b.get("X-Appodeal-Creative-Type");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getType() {
        /*
            r2 = this;
            java.lang.String r0 = "X-Appodeal-Creative-Type"
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r1 = r2.f17475b     // Catch:{ Exception -> 0x0024 }
            if (r1 == 0) goto L_0x0028
            boolean r1 = r1.containsKey(r0)     // Catch:{ Exception -> 0x0024 }
            if (r1 == 0) goto L_0x0028
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r1 = r2.f17475b     // Catch:{ Exception -> 0x0024 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ Exception -> 0x0024 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x0024 }
            if (r0 == 0) goto L_0x0028
            int r1 = r0.size()     // Catch:{ Exception -> 0x0024 }
            if (r1 <= 0) goto L_0x0028
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x0024 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0024 }
            return r0
        L_0x0024:
            r0 = move-exception
            com.appodeal.ads.utils.Log.log(r0)
        L_0x0028:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.utils.ExchangeAd.getType():java.lang.String");
    }

    public int getWidth() {
        return a(CREATIVE_WIDTH);
    }

    public void trackClick() {
        a("X-Appodeal-Url-Click", "", new Runnable() {
            public final void run() {
                ExchangeAd.this.a();
            }
        });
    }

    public void trackError(int i) {
        a("X-Appodeal-Url-Error", String.valueOf(i), (Runnable) null);
    }

    public void trackFill() {
        a("X-Appodeal-Url-Fill", "", new Runnable() {
            public final void run() {
                ExchangeAd.this.b();
            }
        });
    }

    public void trackFinish() {
        a("X-Appodeal-Url-Finish", "", new Runnable() {
            public final void run() {
                ExchangeAd.this.c();
            }
        });
    }

    public void trackImpression(int i) {
        this.f17476c = i;
        a("X-Appodeal-Url-Impression", "", new Runnable() {
            public final void run() {
                ExchangeAd.this.d();
            }
        });
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17474a);
        parcel.writeMap(this.f17475b);
        parcel.writeInt(this.f17476c);
        parcel.writeLong(this.f17477d);
    }
}
