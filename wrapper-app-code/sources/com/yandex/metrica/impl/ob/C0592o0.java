package com.yandex.metrica.impl.ob;

import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.o0  reason: case insensitive filesystem */
public class C0592o0 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f6360a;

    /* renamed from: b  reason: collision with root package name */
    private DeferredDeeplinkListener f6361b;

    /* renamed from: c  reason: collision with root package name */
    private DeferredDeeplinkParametersListener f6362c;

    /* renamed from: d  reason: collision with root package name */
    private C0567n0 f6363d;

    /* renamed from: com.yandex.metrica.impl.ob.o0$a */
    enum a {
        NOT_A_FIRST_LAUNCH,
        PARSE_ERROR,
        NO_REFERRER
    }

    public C0592o0(boolean z) {
        this.f6360a = z;
    }

    public void a(C0567n0 n0Var) {
        this.f6363d = n0Var;
        a();
    }

    private void a(a aVar) {
        DeferredDeeplinkListener.Error error;
        C0567n0 n0Var = this.f6363d;
        String str = n0Var == null ? null : n0Var.f6298c;
        DeferredDeeplinkListener deferredDeeplinkListener = this.f6361b;
        if (deferredDeeplinkListener != null) {
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                error = DeferredDeeplinkListener.Error.NOT_A_FIRST_LAUNCH;
            } else if (ordinal == 1) {
                error = DeferredDeeplinkListener.Error.PARSE_ERROR;
            } else if (ordinal != 2) {
                error = DeferredDeeplinkListener.Error.UNKNOWN;
            } else {
                error = DeferredDeeplinkListener.Error.NO_REFERRER;
            }
            deferredDeeplinkListener.onError(error, str == null ? "" : str);
            this.f6361b = null;
        }
        a(aVar, str);
    }

    public void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f6362c = deferredDeeplinkParametersListener;
        if (this.f6360a) {
            a(a.NOT_A_FIRST_LAUNCH);
        } else {
            a();
        }
    }

    public void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f6361b = deferredDeeplinkListener;
        if (this.f6360a) {
            a(a.NOT_A_FIRST_LAUNCH);
        } else {
            a();
        }
    }

    private void a() {
        C0567n0 n0Var = this.f6363d;
        if (n0Var != null) {
            String str = n0Var.f6297b;
            if (str != null) {
                DeferredDeeplinkListener deferredDeeplinkListener = this.f6361b;
                if (deferredDeeplinkListener != null) {
                    deferredDeeplinkListener.onDeeplinkLoaded(str);
                    this.f6361b = null;
                }
                if (!A2.b((Map) this.f6363d.f6296a)) {
                    Map<String, String> map = this.f6363d.f6296a;
                    DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f6362c;
                    if (deferredDeeplinkParametersListener != null) {
                        deferredDeeplinkParametersListener.onParametersLoaded(map);
                        this.f6362c = null;
                        return;
                    }
                    return;
                }
                a(a.PARSE_ERROR, this.f6363d.f6298c);
            } else if (n0Var.f6298c != null) {
                a(a.PARSE_ERROR);
            } else {
                a(a.NO_REFERRER);
            }
        }
    }

    private void a(a aVar, String str) {
        DeferredDeeplinkParametersListener.Error error;
        DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f6362c;
        if (deferredDeeplinkParametersListener != null) {
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                error = DeferredDeeplinkParametersListener.Error.NOT_A_FIRST_LAUNCH;
            } else if (ordinal == 1) {
                error = DeferredDeeplinkParametersListener.Error.PARSE_ERROR;
            } else if (ordinal != 2) {
                error = DeferredDeeplinkParametersListener.Error.UNKNOWN;
            } else {
                error = DeferredDeeplinkParametersListener.Error.NO_REFERRER;
            }
            if (str == null) {
                str = "";
            }
            deferredDeeplinkParametersListener.onError(error, str);
            this.f6362c = null;
        }
    }
}
