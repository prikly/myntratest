package com.appodeal.ads.rewarded;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/appodeal/ads/rewarded/Reward;", "", "", "component1", "", "component2", "amount", "currency", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "D", "getAmount", "()D", "b", "Ljava/lang/String;", "getCurrency", "()Ljava/lang/String;", "<init>", "(DLjava/lang/String;)V", "apd_public"}, k = 1, mv = {1, 6, 0})
public final class Reward {

    /* renamed from: a  reason: collision with root package name */
    public final double f17187a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17188b;

    public Reward(double d2, String str) {
        this.f17187a = d2;
        this.f17188b = str;
    }

    public static /* synthetic */ Reward copy$default(Reward reward, double d2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d2 = reward.f17187a;
        }
        if ((i & 2) != 0) {
            str = reward.f17188b;
        }
        return reward.copy(d2, str);
    }

    public final double component1() {
        return this.f17187a;
    }

    public final String component2() {
        return this.f17188b;
    }

    public final Reward copy(double d2, String str) {
        return new Reward(d2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Reward)) {
            return false;
        }
        Reward reward = (Reward) obj;
        return Intrinsics.areEqual((Object) Double.valueOf(this.f17187a), (Object) Double.valueOf(reward.f17187a)) && Intrinsics.areEqual((Object) this.f17188b, (Object) reward.f17188b);
    }

    public final double getAmount() {
        return this.f17187a;
    }

    public final String getCurrency() {
        return this.f17188b;
    }

    public int hashCode() {
        int hashCode = Double.doubleToLongBits(this.f17187a) * 31;
        String str = this.f17188b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "Reward(amount=" + this.f17187a + ", currency=" + this.f17188b + ')';
    }
}
