package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.billing_interface.c;
import com.yandex.metrica.billing_interface.d;
import com.yandex.metrica.billing_interface.e;
import com.yandex.metrica.impl.ob.C0751uf;
import java.util.Currency;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.h3  reason: case insensitive filesystem */
public class C0421h3 {

    /* renamed from: a  reason: collision with root package name */
    private final d f5895a;

    public C0421h3(d dVar) {
        this.f5895a = dVar;
    }

    public byte[] a() {
        String str;
        d dVar = this.f5895a;
        C0751uf ufVar = new C0751uf();
        ufVar.f6889a = dVar.f3564c;
        ufVar.f6895g = dVar.f3565d;
        try {
            str = Currency.getInstance(dVar.f3566e).getCurrencyCode();
        } catch (Throwable unused) {
            str = "";
        }
        ufVar.f6891c = str.getBytes();
        ufVar.f6892d = dVar.f3563b.getBytes();
        C0751uf.a aVar = new C0751uf.a();
        aVar.f6897a = dVar.n.getBytes();
        aVar.f6898b = dVar.j.getBytes();
        ufVar.f6894f = aVar;
        int i = 1;
        ufVar.f6896h = true;
        ufVar.i = 1;
        if (dVar.f3562a.ordinal() == 1) {
            i = 2;
        }
        ufVar.j = i;
        C0751uf.c cVar = new C0751uf.c();
        cVar.f6908a = dVar.k.getBytes();
        cVar.f6909b = TimeUnit.MILLISECONDS.toSeconds(dVar.l);
        ufVar.k = cVar;
        if (dVar.f3562a == e.SUBS) {
            C0751uf.b bVar = new C0751uf.b();
            bVar.f6899a = dVar.m;
            c cVar2 = dVar.i;
            if (cVar2 != null) {
                bVar.f6900b = a(cVar2);
            }
            C0751uf.b.a aVar2 = new C0751uf.b.a();
            aVar2.f6902a = dVar.f3567f;
            c cVar3 = dVar.f3568g;
            if (cVar3 != null) {
                aVar2.f6903b = a(cVar3);
            }
            aVar2.f6904c = dVar.f3569h;
            bVar.f6901c = aVar2;
            ufVar.l = bVar;
        }
        return MessageNano.toByteArray(ufVar);
    }

    private C0751uf.b.C0057b a(c cVar) {
        C0751uf.b.C0057b bVar = new C0751uf.b.C0057b();
        bVar.f6906a = cVar.f3554a;
        int ordinal = cVar.f3555b.ordinal();
        int i = 4;
        if (ordinal == 1) {
            i = 1;
        } else if (ordinal == 2) {
            i = 2;
        } else if (ordinal == 3) {
            i = 3;
        } else if (ordinal != 4) {
            i = 0;
        }
        bVar.f6907b = i;
        return bVar;
    }
}
