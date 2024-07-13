package com.ironsource.b;

import android.util.Pair;
import com.ironsource.mediationsdk.a.c;
import java.util.ArrayList;

public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private c f7985a;

    /* renamed from: b  reason: collision with root package name */
    private String f7986b;

    /* renamed from: c  reason: collision with root package name */
    private String f7987c;

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<c> f7988d;

    public b(c cVar, String str, String str2, ArrayList<c> arrayList) {
        this.f7985a = cVar;
        this.f7986b = str;
        this.f7987c = str2;
        this.f7988d = arrayList;
    }

    public final void run() {
        boolean z = false;
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair("Content-Type", "application/json"));
            com.ironsource.d.c a2 = com.ironsource.d.b.a(this.f7987c, this.f7986b, arrayList);
            if (a2.f8007a == 200 || a2.f8007a == 204) {
                z = true;
            }
        } catch (Exception unused) {
        }
        c cVar = this.f7985a;
        if (cVar != null) {
            cVar.a((ArrayList<c>) null, z);
        }
    }
}
