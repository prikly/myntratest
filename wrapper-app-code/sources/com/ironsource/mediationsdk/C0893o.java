package com.ironsource.mediationsdk;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/ironsource/mediationsdk/CachedResponse;", "", "cachedAppKey", "", "cachedUserId", "cachedSettings", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCachedAppKey", "()Ljava/lang/String;", "setCachedAppKey", "(Ljava/lang/String;)V", "getCachedSettings", "setCachedSettings", "getCachedUserId", "setCachedUserId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "mediationsdk_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.ironsource.mediationsdk.o  reason: case insensitive filesystem */
public final class C0893o {

    /* renamed from: a  reason: collision with root package name */
    String f8803a;

    /* renamed from: b  reason: collision with root package name */
    String f8804b;

    /* renamed from: c  reason: collision with root package name */
    String f8805c;

    public C0893o(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "cachedAppKey");
        Intrinsics.checkNotNullParameter(str2, "cachedUserId");
        Intrinsics.checkNotNullParameter(str3, "cachedSettings");
        this.f8803a = str;
        this.f8804b = str2;
        this.f8805c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0893o)) {
            return false;
        }
        C0893o oVar = (C0893o) obj;
        return Intrinsics.areEqual((Object) this.f8803a, (Object) oVar.f8803a) && Intrinsics.areEqual((Object) this.f8804b, (Object) oVar.f8804b) && Intrinsics.areEqual((Object) this.f8805c, (Object) oVar.f8805c);
    }

    public final int hashCode() {
        String str = this.f8803a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f8804b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8805c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "CachedResponse(cachedAppKey=" + this.f8803a + ", cachedUserId=" + this.f8804b + ", cachedSettings=" + this.f8805c + ")";
    }
}
