package com.yandex.metrica.impl.ob;

import com.onesignal.outcomes.OSOutcomeConstants;
import com.yandex.metrica.d;
import com.yandex.metrica.impl.ob.Jf;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.kh  reason: case insensitive filesystem */
public class C0509kh {

    /* renamed from: a  reason: collision with root package name */
    private final C0534lh f6099a;

    /* renamed from: b  reason: collision with root package name */
    private final d f6100b;

    public C0509kh() {
        this(new C0534lh(), C0609oh.a());
    }

    public void a(Jf.e.b bVar) {
        this.f6100b.b("provided_request_result", this.f6099a.a(bVar));
    }

    public void b(Jf.e.a aVar) {
        String str;
        d dVar = this.f6100b;
        this.f6099a.getClass();
        try {
            str = new JSONObject().put(OSOutcomeConstants.OUTCOME_ID, aVar.f4345a).toString();
        } catch (Throwable th) {
            str = th.toString();
        }
        dVar.b("provided_request_send", str);
    }

    C0509kh(C0534lh lhVar, d dVar) {
        this.f6099a = lhVar;
        this.f6100b = dVar;
    }

    public void a(Jf.e.a aVar) {
        String str;
        d dVar = this.f6100b;
        this.f6099a.getClass();
        try {
            str = new JSONObject().put(OSOutcomeConstants.OUTCOME_ID, aVar.f4345a).toString();
        } catch (Throwable th) {
            str = th.toString();
        }
        dVar.b("provided_request_schedule", str);
    }
}
