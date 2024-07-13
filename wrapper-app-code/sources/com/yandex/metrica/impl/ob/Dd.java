package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.ArrayList;
import java.util.List;

class Dd implements Ad {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3873a;

    /* renamed from: b  reason: collision with root package name */
    private final C0565mn f3874b;

    public Dd(Context context, C0565mn mnVar) {
        this.f3873a = context;
        this.f3874b = mnVar;
    }

    public List<Bd> a() {
        ArrayList arrayList = new ArrayList();
        C0565mn mnVar = this.f3874b;
        Context context = this.f3873a;
        PackageInfo b2 = mnVar.b(context, context.getPackageName(), 4096);
        if (b2 == null) {
            return arrayList;
        }
        String[] strArr = b2.requestedPermissions;
        int[] iArr = b2.requestedPermissionsFlags;
        if (strArr == null) {
            return arrayList;
        }
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (iArr == null || iArr.length <= i || (iArr[i] & 2) == 0) {
                arrayList.add(new Bd(str, false));
            } else {
                arrayList.add(new Bd(str, true));
            }
        }
        return arrayList;
    }
}
