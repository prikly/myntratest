package com.applovin.impl.sdk.a;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final View f15201a;

    /* renamed from: b  reason: collision with root package name */
    private final FriendlyObstructionPurpose f15202b;

    /* renamed from: c  reason: collision with root package name */
    private final String f15203c;

    public d(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f15201a = view;
        this.f15202b = friendlyObstructionPurpose;
        this.f15203c = str;
    }

    public View a() {
        return this.f15201a;
    }

    public FriendlyObstructionPurpose b() {
        return this.f15202b;
    }

    public String c() {
        return this.f15203c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        View view = this.f15201a;
        if (view == null ? dVar.f15201a != null : !view.equals(dVar.f15201a)) {
            return false;
        }
        if (this.f15202b != dVar.f15202b) {
            return false;
        }
        String str = this.f15203c;
        String str2 = dVar.f15203c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        View view = this.f15201a;
        int i = 0;
        int hashCode = (view != null ? view.hashCode() : 0) * 31;
        FriendlyObstructionPurpose friendlyObstructionPurpose = this.f15202b;
        int hashCode2 = (hashCode + (friendlyObstructionPurpose != null ? friendlyObstructionPurpose.hashCode() : 0)) * 31;
        String str = this.f15203c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }
}
