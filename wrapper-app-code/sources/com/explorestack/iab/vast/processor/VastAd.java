package com.explorestack.iab.vast.processor;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.explorestack.iab.utils.Utils;
import com.explorestack.iab.vast.TrackingEvent;
import com.explorestack.iab.vast.VastRequest;
import com.explorestack.iab.vast.tags.AdVerificationsExtensionTag;
import com.explorestack.iab.vast.tags.AppodealExtensionTag;
import com.explorestack.iab.vast.tags.CompanionTag;
import com.explorestack.iab.vast.tags.LinearCreativeTag;
import com.explorestack.iab.vast.tags.MediaFileTag;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class VastAd implements Parcelable {
    public static final Parcelable.Creator<VastAd> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public VastRequest f3241a;

    /* renamed from: b  reason: collision with root package name */
    public final LinearCreativeTag f3242b;

    /* renamed from: c  reason: collision with root package name */
    public final MediaFileTag f3243c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<CompanionTag> f3244d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<String> f3245e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<String> f3246f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<String> f3247g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<String> f3248h;
    public EnumMap<TrackingEvent, List<String>> i;
    public AppodealExtensionTag j;
    public List<AdVerificationsExtensionTag> k = new ArrayList();

    public class a implements Parcelable.Creator<VastAd> {
        /* renamed from: a */
        public VastAd createFromParcel(Parcel parcel) {
            return new VastAd(parcel);
        }

        /* renamed from: a */
        public VastAd[] newArray(int i) {
            return new VastAd[i];
        }
    }

    public VastAd(Parcel parcel) {
        this.f3242b = (LinearCreativeTag) parcel.readSerializable();
        this.f3243c = (MediaFileTag) parcel.readSerializable();
        this.f3244d = (ArrayList) parcel.readSerializable();
        this.f3245e = parcel.createStringArrayList();
        this.f3246f = parcel.createStringArrayList();
        this.f3247g = parcel.createStringArrayList();
        this.f3248h = parcel.createStringArrayList();
        this.i = (EnumMap) parcel.readSerializable();
        this.j = (AppodealExtensionTag) parcel.readSerializable();
        parcel.readList(this.k, AdVerificationsExtensionTag.class.getClassLoader());
    }

    public VastAd(LinearCreativeTag linearCreativeTag, MediaFileTag mediaFileTag) {
        this.f3242b = linearCreativeTag;
        this.f3243c = mediaFileTag;
    }

    public void a(int i2) {
        VastRequest vastRequest = this.f3241a;
        if (vastRequest != null) {
            vastRequest.sendError(i2);
        }
    }

    public void a(AppodealExtensionTag appodealExtensionTag) {
        this.j = appodealExtensionTag;
    }

    public void a(ArrayList<String> arrayList) {
        this.f3247g = arrayList;
    }

    public void a(EnumMap<TrackingEvent, List<String>> enumMap) {
        this.i = enumMap;
    }

    public void b(ArrayList<CompanionTag> arrayList) {
        this.f3244d = arrayList;
    }

    public void c(ArrayList<String> arrayList) {
        this.f3246f = arrayList;
    }

    public void d(ArrayList<String> arrayList) {
        this.f3245e = arrayList;
    }

    public int describeContents() {
        return 0;
    }

    public List<AdVerificationsExtensionTag> getAdVerificationsExtensionList() {
        return this.k;
    }

    public AppodealExtensionTag getAppodealExtension() {
        return this.j;
    }

    public CompanionTag getBanner(Context context) {
        ArrayList<CompanionTag> arrayList = this.f3244d;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<CompanionTag> it = this.f3244d.iterator();
            while (it.hasNext()) {
                CompanionTag next = it.next();
                int width = next.getWidth();
                int height = next.getHeight();
                if (width > -1 && height > -1) {
                    if (Utils.isTablet(context) && width == 728 && height == 90) {
                        return next;
                    }
                    if (!Utils.isTablet(context) && width == 320 && height == 50) {
                        return next;
                    }
                }
            }
        }
        return null;
    }

    public String getClickThroughUrl() {
        if (this.f3242b.getVideoClicksTag() != null) {
            return this.f3242b.getVideoClicksTag().getClickThroughUrl();
        }
        return null;
    }

    public List<String> getClickTrackingUrlList() {
        return this.f3247g;
    }

    public CompanionTag getCompanion(int i2, int i3) {
        ArrayList<CompanionTag> arrayList = this.f3244d;
        if (arrayList == null || arrayList.isEmpty()) {
            a(600);
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<CompanionTag> it = this.f3244d.iterator();
        while (it.hasNext()) {
            CompanionTag next = it.next();
            int width = next.getWidth();
            int height = next.getHeight();
            if (width > -1 && height > -1) {
                float max = ((float) Math.max(width, height)) / ((float) Math.min(width, height));
                if (Math.min(width, height) >= 250 && ((double) max) <= 2.5d && next.hasCreative()) {
                    hashMap.put(Float.valueOf(((float) width) / ((float) height)), next);
                }
            }
        }
        if (!hashMap.isEmpty()) {
            float f2 = ((float) i2) / ((float) i3);
            Set<Float> keySet = hashMap.keySet();
            float floatValue = ((Float) keySet.iterator().next()).floatValue();
            for (Float floatValue2 : keySet) {
                float floatValue3 = floatValue2.floatValue();
                if (Math.abs(floatValue - f2) > Math.abs(floatValue3 - f2)) {
                    floatValue = floatValue3;
                }
            }
            return (CompanionTag) hashMap.get(Float.valueOf(floatValue));
        }
        a(600);
        return null;
    }

    public List<String> getErrorUrlList() {
        return this.f3246f;
    }

    public List<String> getImpressionUrlList() {
        return this.f3245e;
    }

    public MediaFileTag getPickedMediaFileTag() {
        return this.f3243c;
    }

    public int getSkipOffsetSec() {
        return this.f3242b.getSkipOffsetSec();
    }

    public Map<TrackingEvent, List<String>> getTrackingEventListMap() {
        return this.i;
    }

    public ArrayList<String> getWrapperCompanionClickTrackingUrlList() {
        return this.f3248h;
    }

    public void setAdVerificationsExtensionList(List<AdVerificationsExtensionTag> list) {
        this.k = list;
    }

    public void setVastRequest(VastRequest vastRequest) {
        this.f3241a = vastRequest;
    }

    public void setWrapperCompanionClickTrackingUrlList(ArrayList<String> arrayList) {
        this.f3248h = arrayList;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeSerializable(this.f3242b);
        parcel.writeSerializable(this.f3243c);
        parcel.writeSerializable(this.f3244d);
        parcel.writeStringList(this.f3245e);
        parcel.writeStringList(this.f3246f);
        parcel.writeStringList(this.f3247g);
        parcel.writeStringList(this.f3248h);
        parcel.writeSerializable(this.i);
        parcel.writeSerializable(this.j);
        parcel.writeList(this.k);
    }
}
