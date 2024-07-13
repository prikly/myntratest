package com.appodeal.ads.revenue;

import com.appodeal.ads.AppodealNetworks;
import com.google.android.gms.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b;\u0010<J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003JO\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0015\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001a\u001a\u0004\b,\u0010\u001cR\u001a\u0010/\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\b-\u0010\u001a\u001a\u0004\b.\u0010\u001cR\u0017\u00105\u001a\u0002008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u00108\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010\u001a\u001a\u0004\b7\u0010\u001cR\u0011\u0010:\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b9\u0010\u001c¨\u0006="}, d2 = {"Lcom/appodeal/ads/revenue/RevenueInfo;", "", "", "component1", "component2", "component3", "component4", "", "component5", "", "component6", "component7", "networkName", "demandSource", "adUnitName", "placement", "revenue", "adType", "adTypeString", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getNetworkName", "()Ljava/lang/String;", "b", "getDemandSource", "c", "getAdUnitName", "d", "getPlacement", "e", "D", "getRevenue", "()D", "f", "I", "getAdType", "()I", "g", "getAdTypeString", "h", "getPlatform", "platform", "Lcom/appodeal/ads/revenue/RevenueCurrency;", "i", "Lcom/appodeal/ads/revenue/RevenueCurrency;", "getRevenueCurrency", "()Lcom/appodeal/ads/revenue/RevenueCurrency;", "revenueCurrency", "j", "getCurrency", "currency", "getRevenuePrecision", "revenuePrecision", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DILjava/lang/String;)V", "apd_public"}, k = 1, mv = {1, 6, 0})
public final class RevenueInfo {

    /* renamed from: a  reason: collision with root package name */
    public final String f17179a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17180b;

    /* renamed from: c  reason: collision with root package name */
    public final String f17181c;

    /* renamed from: d  reason: collision with root package name */
    public final String f17182d;

    /* renamed from: e  reason: collision with root package name */
    public final double f17183e;

    /* renamed from: f  reason: collision with root package name */
    public final int f17184f;

    /* renamed from: g  reason: collision with root package name */
    public final String f17185g;

    /* renamed from: h  reason: collision with root package name */
    public final String f17186h = "Appodeal";
    public final RevenueCurrency i;
    public final String j;

    public RevenueInfo(String str, String str2, String str3, String str4, double d2, int i2, String str5) {
        Intrinsics.checkNotNullParameter(str, "networkName");
        Intrinsics.checkNotNullParameter(str2, "demandSource");
        Intrinsics.checkNotNullParameter(str3, "adUnitName");
        Intrinsics.checkNotNullParameter(str4, IronSourceConstants.EVENTS_PLACEMENT_NAME);
        Intrinsics.checkNotNullParameter(str5, "adTypeString");
        this.f17179a = str;
        this.f17180b = str2;
        this.f17181c = str3;
        this.f17182d = str4;
        this.f17183e = d2;
        this.f17184f = i2;
        this.f17185g = str5;
        RevenueCurrency revenueCurrency = RevenueCurrency.USD;
        this.i = revenueCurrency;
        this.j = revenueCurrency.getStringValue();
    }

    public static /* synthetic */ RevenueInfo copy$default(RevenueInfo revenueInfo, String str, String str2, String str3, String str4, double d2, int i2, String str5, int i3, Object obj) {
        RevenueInfo revenueInfo2 = revenueInfo;
        return revenueInfo.copy((i3 & 1) != 0 ? revenueInfo2.f17179a : str, (i3 & 2) != 0 ? revenueInfo2.f17180b : str2, (i3 & 4) != 0 ? revenueInfo2.f17181c : str3, (i3 & 8) != 0 ? revenueInfo2.f17182d : str4, (i3 & 16) != 0 ? revenueInfo2.f17183e : d2, (i3 & 32) != 0 ? revenueInfo2.f17184f : i2, (i3 & 64) != 0 ? revenueInfo2.f17185g : str5);
    }

    public final String component1() {
        return this.f17179a;
    }

    public final String component2() {
        return this.f17180b;
    }

    public final String component3() {
        return this.f17181c;
    }

    public final String component4() {
        return this.f17182d;
    }

    public final double component5() {
        return this.f17183e;
    }

    public final int component6() {
        return this.f17184f;
    }

    public final String component7() {
        return this.f17185g;
    }

    public final RevenueInfo copy(String str, String str2, String str3, String str4, double d2, int i2, String str5) {
        Intrinsics.checkNotNullParameter(str, "networkName");
        Intrinsics.checkNotNullParameter(str2, "demandSource");
        Intrinsics.checkNotNullParameter(str3, "adUnitName");
        Intrinsics.checkNotNullParameter(str4, IronSourceConstants.EVENTS_PLACEMENT_NAME);
        String str6 = str5;
        Intrinsics.checkNotNullParameter(str6, "adTypeString");
        return new RevenueInfo(str, str2, str3, str4, d2, i2, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RevenueInfo)) {
            return false;
        }
        RevenueInfo revenueInfo = (RevenueInfo) obj;
        return Intrinsics.areEqual((Object) this.f17179a, (Object) revenueInfo.f17179a) && Intrinsics.areEqual((Object) this.f17180b, (Object) revenueInfo.f17180b) && Intrinsics.areEqual((Object) this.f17181c, (Object) revenueInfo.f17181c) && Intrinsics.areEqual((Object) this.f17182d, (Object) revenueInfo.f17182d) && Intrinsics.areEqual((Object) Double.valueOf(this.f17183e), (Object) Double.valueOf(revenueInfo.f17183e)) && this.f17184f == revenueInfo.f17184f && Intrinsics.areEqual((Object) this.f17185g, (Object) revenueInfo.f17185g);
    }

    public final int getAdType() {
        return this.f17184f;
    }

    public final String getAdTypeString() {
        return this.f17185g;
    }

    public final String getAdUnitName() {
        return this.f17181c;
    }

    public final String getCurrency() {
        return this.j;
    }

    public final String getDemandSource() {
        return this.f17180b;
    }

    public final String getNetworkName() {
        return this.f17179a;
    }

    public final String getPlacement() {
        return this.f17182d;
    }

    public final String getPlatform() {
        return this.f17186h;
    }

    public final double getRevenue() {
        return this.f17183e;
    }

    public final RevenueCurrency getRevenueCurrency() {
        return this.i;
    }

    public final String getRevenuePrecision() {
        return Intrinsics.areEqual((Object) this.f17179a, (Object) AppodealNetworks.BIDMACHINE) ? "exact" : (Intrinsics.areEqual((Object) this.f17179a, (Object) "mraid") || Intrinsics.areEqual((Object) this.f17179a, (Object) "vast") || Intrinsics.areEqual((Object) this.f17179a, (Object) "nast") || Intrinsics.areEqual((Object) this.f17179a, (Object) "appodeal")) ? "publisher_defined" : this.f17183e > 0.0d ? "estimated" : AdError.UNDEFINED_DOMAIN;
    }

    public int hashCode() {
        int hashCode = this.f17180b.hashCode();
        int hashCode2 = this.f17181c.hashCode();
        int hashCode3 = this.f17182d.hashCode();
        int hashCode4 = Double.doubleToLongBits(this.f17183e);
        int i2 = this.f17184f;
        return this.f17185g.hashCode() + ((i2 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f17179a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "RevenueInfo(networkName=" + this.f17179a + ", demandSource=" + this.f17180b + ", adUnitName=" + this.f17181c + ", placement=" + this.f17182d + ", revenue=" + this.f17183e + ", adType=" + this.f17184f + ", adTypeString=" + this.f17185g + ')';
    }
}
