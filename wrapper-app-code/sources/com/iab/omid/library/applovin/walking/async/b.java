package com.iab.omid.library.applovin.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

public abstract class b extends AsyncTask<Object, Void, String> {

    /* renamed from: a  reason: collision with root package name */
    private a f7735a;

    /* renamed from: b  reason: collision with root package name */
    protected final C0072b f7736b;

    public interface a {
        void a(b bVar);
    }

    /* renamed from: com.iab.omid.library.applovin.walking.async.b$b  reason: collision with other inner class name */
    public interface C0072b {
        JSONObject a();

        void a(JSONObject jSONObject);
    }

    public b(C0072b bVar) {
        this.f7736b = bVar;
    }

    public void a(a aVar) {
        this.f7735a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        a aVar = this.f7735a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}