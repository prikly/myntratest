package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzccc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Bundle bundle = null;
        zzchu zzchu = null;
        ApplicationInfo applicationInfo = null;
        String str = null;
        ArrayList<String> arrayList = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        zzfkz zzfkz = null;
        String str4 = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    bundle = SafeParcelReader.createBundle(parcel2, readHeader);
                    break;
                case 2:
                    zzchu = (zzchu) SafeParcelReader.createParcelable(parcel2, readHeader, zzchu.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.createParcelable(parcel2, readHeader, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 5:
                    arrayList = SafeParcelReader.createStringList(parcel2, readHeader);
                    break;
                case 6:
                    packageInfo = (PackageInfo) SafeParcelReader.createParcelable(parcel2, readHeader, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 9:
                    str3 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 10:
                    zzfkz = (zzfkz) SafeParcelReader.createParcelable(parcel2, readHeader, zzfkz.CREATOR);
                    break;
                case 11:
                    str4 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 12:
                    z = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 13:
                    z2 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel2, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
        return new zzccb(bundle, zzchu, applicationInfo, str, arrayList, packageInfo, str2, str3, zzfkz, str4, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzccb[i];
    }
}
