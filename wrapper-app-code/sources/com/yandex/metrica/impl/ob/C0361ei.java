package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.Mg;
import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.ei  reason: case insensitive filesystem */
public class C0361ei {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C0686rm<String, C0510ki> f5758a = new C0686rm<>();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<String, C0682ri> f5759b = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public C0635pi f5760c = null;

    /* renamed from: d  reason: collision with root package name */
    private final C0610oi f5761d = new a();

    /* renamed from: com.yandex.metrica.impl.ob.ei$a */
    class a implements C0610oi {
        a() {
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ei$b */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final C0361ei f5763a = new C0361ei();
    }

    public static final C0361ei a() {
        return b.f5763a;
    }

    public C0682ri a(Context context, I3 i3, Mg.b bVar) {
        C0682ri riVar = this.f5759b.get(i3.b());
        boolean z = true;
        if (riVar == null) {
            synchronized (this.f5759b) {
                riVar = this.f5759b.get(i3.b());
                if (riVar == null) {
                    C0682ri riVar2 = new C0682ri(context, i3.b(), bVar, this.f5761d);
                    this.f5759b.put(i3.b(), riVar2);
                    riVar = riVar2;
                    z = false;
                }
            }
        }
        if (z) {
            riVar.a(bVar);
        }
        return riVar;
    }

    public void a(I3 i3, C0510ki kiVar) {
        synchronized (this.f5759b) {
            this.f5758a.a(i3.b(), kiVar);
            C0635pi piVar = this.f5760c;
            if (piVar != null) {
                kiVar.a(piVar);
            }
        }
    }
}
