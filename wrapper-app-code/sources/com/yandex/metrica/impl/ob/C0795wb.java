package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.appodeal.advertising.AdvertisingInfo;

/* renamed from: com.yandex.metrica.impl.ob.wb  reason: case insensitive filesystem */
public class C0795wb implements C0771vb {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C0771vb f7032a;

    /* renamed from: com.yandex.metrica.impl.ob.wb$a */
    class a implements C0663qm<C0747ub> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f7033a;

        a(Context context) {
            this.f7033a = context;
        }

        /* renamed from: b */
        public C0747ub a() {
            return C0795wb.this.f7032a.a(this.f7033a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.wb$b */
    class b implements C0663qm<C0747ub> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f7035a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Gb f7036b;

        b(Context context, Gb gb) {
            this.f7035a = context;
            this.f7036b = gb;
        }

        public Object a() {
            return C0795wb.this.f7032a.a(this.f7035a, this.f7036b);
        }
    }

    public C0795wb(C0771vb vbVar) {
        this.f7032a = vbVar;
    }

    public C0747ub a(Context context) {
        return a((C0663qm<C0747ub>) new a(context));
    }

    public C0747ub a(Context context, Gb gb) {
        return a((C0663qm<C0747ub>) new b(context, gb));
    }

    private C0747ub a(C0663qm<C0747ub> qmVar) {
        C0747ub a2 = qmVar.a();
        C0723tb tbVar = a2.f6881a;
        return (tbVar == null || !AdvertisingInfo.defaultAdvertisingId.equals(tbVar.f6825b)) ? a2 : new C0747ub((C0723tb) null, U0.INVALID_ADV_ID, "AdvId is invalid: 00000000-0000-0000-0000-000000000000");
    }
}
