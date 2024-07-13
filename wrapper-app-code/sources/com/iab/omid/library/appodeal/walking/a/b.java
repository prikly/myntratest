package com.iab.omid.library.appodeal.walking.a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

public abstract class b extends AsyncTask<Object, Void, String> {

    /* renamed from: a  reason: collision with root package name */
    private a f7842a;

    /* renamed from: d  reason: collision with root package name */
    protected final C0075b f7843d;

    public interface a {
        void a(b bVar);
    }

    /* renamed from: com.iab.omid.library.appodeal.walking.a.b$b  reason: collision with other inner class name */
    public interface C0075b {
        void a(JSONObject jSONObject);

        JSONObject b();
    }

    public b(C0075b bVar) {
        this.f7843d = bVar;
    }

    public void a(a aVar) {
        this.f7842a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        a aVar = this.f7842a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
