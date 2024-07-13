package com.appodeal.ads;

import com.appodeal.ads.context.b;
import com.appodeal.ads.l;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.utils.Log;
import org.json.JSONException;

public final class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f16797a;

    public class a implements l.a {
        public a() {
        }

        public final void a(LoadingError loadingError) {
            v vVar = (v) n.this.f16797a;
            vVar.f17605f.f17433d.a(vVar.f17604e, vVar.f17603d, loadingError);
        }
    }

    public n(o oVar) {
        this.f16797a = oVar;
    }

    public final void run() {
        LoadingError loadingError;
        try {
            o oVar = this.f16797a;
            oVar.f17004b.a(b.f16327b, oVar.f17003a, oVar.f17005c, new a());
        } catch (Throwable th) {
            o oVar2 = this.f16797a;
            oVar2.getClass();
            Log.log(th);
            if (th instanceof JSONException) {
                loadingError = LoadingError.IncorrectAdunit;
            } else {
                loadingError = LoadingError.InternalError;
            }
            v vVar = (v) oVar2;
            vVar.f17605f.f17433d.a(vVar.f17604e, vVar.f17603d, loadingError);
        }
    }
}
