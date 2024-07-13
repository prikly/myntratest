package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

public class V0 implements Parcelable {
    public static final Parcelable.Creator<V0> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    private ResultReceiver f5199a;

    /* renamed from: b  reason: collision with root package name */
    private List<String> f5200b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, String> f5201c;

    class a implements Function0<I> {
        a(V0 v0) {
        }

        public Object invoke() {
            return F0.g().d();
        }
    }

    class b implements Parcelable.Creator<V0> {
        b() {
        }

        public Object createFromParcel(Parcel parcel) {
            return new V0(parcel);
        }

        public Object[] newArray(int i) {
            return new V0[i];
        }
    }

    public V0(List<String> list, Map<String, String> map, ResultReceiver resultReceiver) {
        HashMap hashMap;
        this.f5200b = list;
        this.f5199a = resultReceiver;
        if (map == null) {
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap(map);
        }
        this.f5201c = hashMap;
    }

    public boolean a(C0635pi piVar) {
        return C0585ni.a(piVar, this.f5200b, this.f5201c, new a(this));
    }

    public List<String> b() {
        return this.f5200b;
    }

    public ResultReceiver c() {
        return this.f5199a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.yandex.metrica.CounterConfiguration.receiver", this.f5199a);
        if (this.f5200b != null) {
            bundle.putStringArrayList("com.yandex.metrica.CounterConfiguration.identifiersList", new ArrayList(this.f5200b));
        }
        Map<String, String> map = this.f5201c;
        if (map != null) {
            bundle.putString("com.yandex.metrica.CounterConfiguration.clidsForVerification", Tl.c(map));
        }
        parcel.writeBundle(bundle);
    }

    public Map<String, String> a() {
        return this.f5201c;
    }

    protected V0(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(C0368f0.class.getClassLoader());
        if (readBundle != null) {
            this.f5199a = (ResultReceiver) readBundle.getParcelable("com.yandex.metrica.CounterConfiguration.receiver");
            this.f5200b = readBundle.getStringArrayList("com.yandex.metrica.CounterConfiguration.identifiersList");
            this.f5201c = Tl.a(readBundle.getString("com.yandex.metrica.CounterConfiguration.clidsForVerification"));
            return;
        }
        this.f5201c = new HashMap();
    }
}
