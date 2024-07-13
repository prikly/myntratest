package com.ironsource.sdk.g;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new b(parcel, (byte) 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new b[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public String f9507a;

    /* renamed from: b  reason: collision with root package name */
    public String f9508b;

    /* renamed from: c  reason: collision with root package name */
    public String f9509c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f9510d;

    /* renamed from: e  reason: collision with root package name */
    public int f9511e;

    /* renamed from: f  reason: collision with root package name */
    public String f9512f;

    /* renamed from: g  reason: collision with root package name */
    public String f9513g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f9514h;
    public boolean i;
    public Map<String, String> j;
    private ArrayList<String> k;
    private ArrayList<String> l;
    private ArrayList<String> m;
    private ArrayList<String> n;
    private Map<String, String> o;

    public b() {
        a();
    }

    private b(Parcel parcel) {
        a();
        try {
            boolean z = true;
            this.f9510d = parcel.readByte() != 0;
            this.f9511e = parcel.readInt();
            this.f9507a = parcel.readString();
            this.f9508b = parcel.readString();
            this.f9509c = parcel.readString();
            this.f9512f = parcel.readString();
            this.f9513g = parcel.readString();
            this.o = a(parcel.readString());
            this.i = parcel.readByte() != 0;
            if (parcel.readByte() == 0) {
                z = false;
            }
            this.f9514h = z;
            this.j = a(parcel.readString());
        } catch (Throwable unused) {
            a();
        }
    }

    /* synthetic */ b(Parcel parcel, byte b2) {
        this(parcel);
    }

    private static Map<String, String> a(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return hashMap;
    }

    private void a() {
        this.f9510d = false;
        this.f9511e = -1;
        this.k = new ArrayList<>();
        this.l = new ArrayList<>();
        this.m = new ArrayList<>();
        this.n = new ArrayList<>();
        this.f9514h = true;
        this.i = false;
        this.f9513g = "";
        this.f9512f = "";
        this.o = new HashMap();
        this.j = new HashMap();
    }

    public final void a(String str, boolean z) {
        if (!TextUtils.isEmpty(str) && this.m.indexOf(str) == -1) {
            this.m.add(str);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("shouldRestore:");
            sb.append(this.f9510d);
            sb.append(", ");
            sb.append("displayedProduct:");
            sb.append(this.f9511e);
            sb.append(", ");
            sb.append("ISReportInit:");
            sb.append(this.k);
            sb.append(", ");
            sb.append("ISInitSuccess:");
            sb.append(this.l);
            sb.append(", ");
            sb.append("ISAppKey");
            sb.append(this.f9512f);
            sb.append(", ");
            sb.append("ISUserId");
            sb.append(this.f9513g);
            sb.append(", ");
            sb.append("ISExtraParams");
            sb.append(this.o);
            sb.append(", ");
            sb.append("OWReportInit");
            sb.append(this.f9514h);
            sb.append(", ");
            sb.append("OWInitSuccess");
            sb.append(this.i);
            sb.append(", ");
            sb.append("OWExtraParams");
            sb.append(this.j);
            sb.append(", ");
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        try {
            int i3 = 1;
            parcel.writeByte((byte) (this.f9510d ? 1 : 0));
            parcel.writeInt(this.f9511e);
            parcel.writeString(this.f9507a);
            parcel.writeString(this.f9508b);
            parcel.writeString(this.f9509c);
            parcel.writeString(this.f9512f);
            parcel.writeString(this.f9513g);
            parcel.writeString(new JSONObject(this.o).toString());
            parcel.writeByte((byte) (this.i ? 1 : 0));
            if (!this.f9514h) {
                i3 = 0;
            }
            parcel.writeByte((byte) i3);
            parcel.writeString(new JSONObject(this.j).toString());
        } catch (Throwable unused) {
        }
    }
}
