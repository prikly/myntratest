package com.iab.omid.library.adcolony.walking.a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

public abstract class b extends AsyncTask<Object, Void, String> {

    /* renamed from: a  reason: collision with root package name */
    private a f7514a;

    /* renamed from: d  reason: collision with root package name */
    protected final C0066b f7515d;

    public interface a {
        void a(b bVar);
    }

    /* renamed from: com.iab.omid.library.adcolony.walking.a.b$b  reason: collision with other inner class name */
    public interface C0066b {
        void a(JSONObject jSONObject);

        JSONObject b();
    }

    public b(C0066b bVar) {
        this.f7515d = bVar;
    }

    public void a(a aVar) {
        this.f7514a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        a aVar = this.f7514a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
