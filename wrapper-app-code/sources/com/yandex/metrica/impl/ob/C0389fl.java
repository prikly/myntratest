package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.yandex.metrica.impl.ob.fl  reason: case insensitive filesystem */
public class C0389fl implements Parcelable {
    public static final Parcelable.Creator<C0389fl> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5821a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5822b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5823c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f5824d;

    /* renamed from: e  reason: collision with root package name */
    public final C0805wl f5825e;

    /* renamed from: f  reason: collision with root package name */
    public final C0439hl f5826f;

    /* renamed from: g  reason: collision with root package name */
    public final C0439hl f5827g;

    /* renamed from: h  reason: collision with root package name */
    public final C0439hl f5828h;

    /* renamed from: com.yandex.metrica.impl.ob.fl$a */
    class a implements Parcelable.Creator<C0389fl> {
        a() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new C0389fl(parcel);
        }

        public Object[] newArray(int i) {
            return new C0389fl[i];
        }
    }

    public C0389fl(C0635pi piVar) {
        this(piVar.f().j, piVar.f().l, piVar.f().k, piVar.f().m, piVar.T(), piVar.S(), piVar.R(), piVar.U());
    }

    public boolean a() {
        return (this.f5825e == null || this.f5826f == null || this.f5827g == null || this.f5828h == null) ? false : true;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0389fl.class != obj.getClass()) {
            return false;
        }
        C0389fl flVar = (C0389fl) obj;
        if (this.f5821a != flVar.f5821a || this.f5822b != flVar.f5822b || this.f5823c != flVar.f5823c || this.f5824d != flVar.f5824d) {
            return false;
        }
        C0805wl wlVar = this.f5825e;
        if (wlVar == null ? flVar.f5825e != null : !wlVar.equals(flVar.f5825e)) {
            return false;
        }
        C0439hl hlVar = this.f5826f;
        if (hlVar == null ? flVar.f5826f != null : !hlVar.equals(flVar.f5826f)) {
            return false;
        }
        C0439hl hlVar2 = this.f5827g;
        if (hlVar2 == null ? flVar.f5827g != null : !hlVar2.equals(flVar.f5827g)) {
            return false;
        }
        C0439hl hlVar3 = this.f5828h;
        if (hlVar3 != null) {
            return hlVar3.equals(flVar.f5828h);
        }
        if (flVar.f5828h == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = (((((((this.f5821a ? 1 : 0) * true) + (this.f5822b ? 1 : 0)) * 31) + (this.f5823c ? 1 : 0)) * 31) + (this.f5824d ? 1 : 0)) * 31;
        C0805wl wlVar = this.f5825e;
        int i2 = 0;
        int hashCode = (i + (wlVar != null ? wlVar.hashCode() : 0)) * 31;
        C0439hl hlVar = this.f5826f;
        int hashCode2 = (hashCode + (hlVar != null ? hlVar.hashCode() : 0)) * 31;
        C0439hl hlVar2 = this.f5827g;
        int hashCode3 = (hashCode2 + (hlVar2 != null ? hlVar2.hashCode() : 0)) * 31;
        C0439hl hlVar3 = this.f5828h;
        if (hlVar3 != null) {
            i2 = hlVar3.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        return "UiAccessConfig{uiParsingEnabled=" + this.f5821a + ", uiEventSendingEnabled=" + this.f5822b + ", uiCollectingForBridgeEnabled=" + this.f5823c + ", uiRawEventSendingEnabled=" + this.f5824d + ", uiParsingConfig=" + this.f5825e + ", uiEventSendingConfig=" + this.f5826f + ", uiCollectingForBridgeConfig=" + this.f5827g + ", uiRawEventSendingConfig=" + this.f5828h + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f5821a ? (byte) 1 : 0);
        parcel.writeByte(this.f5822b ? (byte) 1 : 0);
        parcel.writeByte(this.f5823c ? (byte) 1 : 0);
        parcel.writeByte(this.f5824d ? (byte) 1 : 0);
        parcel.writeParcelable(this.f5825e, i);
        parcel.writeParcelable(this.f5826f, i);
        parcel.writeParcelable(this.f5827g, i);
        parcel.writeParcelable(this.f5828h, i);
    }

    public C0389fl(boolean z, boolean z2, boolean z3, boolean z4, C0805wl wlVar, C0439hl hlVar, C0439hl hlVar2, C0439hl hlVar3) {
        this.f5821a = z;
        this.f5822b = z2;
        this.f5823c = z3;
        this.f5824d = z4;
        this.f5825e = wlVar;
        this.f5826f = hlVar;
        this.f5827g = hlVar2;
        this.f5828h = hlVar3;
    }

    protected C0389fl(Parcel parcel) {
        boolean z = true;
        this.f5821a = parcel.readByte() != 0;
        this.f5822b = parcel.readByte() != 0;
        this.f5823c = parcel.readByte() != 0;
        this.f5824d = parcel.readByte() == 0 ? false : z;
        this.f5825e = (C0805wl) parcel.readParcelable(C0805wl.class.getClassLoader());
        this.f5826f = (C0439hl) parcel.readParcelable(C0439hl.class.getClassLoader());
        this.f5827g = (C0439hl) parcel.readParcelable(C0439hl.class.getClassLoader());
        this.f5828h = (C0439hl) parcel.readParcelable(C0439hl.class.getClassLoader());
    }
}
