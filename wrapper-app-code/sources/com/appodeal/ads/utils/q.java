package com.appodeal.ads.utils;

import android.content.Context;
import android.text.TextUtils;
import com.appodeal.ads.h5;
import com.appodeal.ads.n5;
import com.appodeal.ads.storage.o;
import com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener;
import com.appodeal.ads.utils.q;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class q {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ boolean f17559b = (!q.class.desiredAssertionStatus());

    /* renamed from: a  reason: collision with root package name */
    public String f17560a;

    public class a implements UnifiedAdCallbackClickTrackListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f17561a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f17562b;

        public a(b bVar, Context context) {
            this.f17561a = bVar;
            this.f17562b = context;
        }

        public final void onTrackError() {
            this.f17561a.onHandleError();
        }

        public final void onTrackSuccess(JSONObject jSONObject) {
            String str = "";
            if (jSONObject != null) {
                try {
                    if (jSONObject.getString("status").equals("ok")) {
                        JSONArray jSONArray = null;
                        if (jSONObject.has("urls")) {
                            jSONArray = jSONObject.getJSONArray("urls");
                        }
                        if (jSONArray == null) {
                            jSONArray = new JSONArray();
                        }
                        if (jSONObject.has("url")) {
                            jSONArray.put(jSONObject.getString("url"));
                        }
                        if (jSONArray.length() > 0) {
                            q qVar = q.this;
                            Context context = this.f17562b;
                            b bVar = this.f17561a;
                            Objects.requireNonNull(bVar);
                            $$Lambda$4Nhbh_3WLQCcfhI7v2Mb11UQpNg r4 = new Runnable() {
                                public final void run() {
                                    q.b.this.onHandled();
                                }
                            };
                            try {
                                if (jSONArray.length() == 0) {
                                    h5.f16458a.post(r4);
                                } else {
                                    String str2 = str;
                                    boolean z = false;
                                    for (int i = 0; i < jSONArray.length() && !z; i++) {
                                        str2 = jSONArray.getString(i);
                                        z = n5.b(context, str2, r4);
                                    }
                                    str = str2;
                                }
                            } catch (Exception e2) {
                                Log.log(e2);
                                h5.f16458a.post(r4);
                            }
                            qVar.f17560a = str;
                            return;
                        }
                    }
                } catch (JSONException e3) {
                    Log.log(e3);
                    this.f17561a.onHandleError();
                    return;
                }
            }
            this.f17561a.onHandleError();
        }
    }

    public interface b {
        void onHandleError();

        void onHandled();

        void processClick(UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener);
    }

    public final void a(Context context, String str, String str2, long j, b bVar) {
        $$Lambda$4Nhbh_3WLQCcfhI7v2Mb11UQpNg r6;
        if (TextUtils.isEmpty(str)) {
            bVar.onHandleError();
        } else if (f17559b || str != null) {
            o oVar = r.f17564a;
            if (str2 != null && !TextUtils.isEmpty(str2)) {
                if (j == 0) {
                    j = 180;
                }
                o oVar2 = r.f17564a;
                oVar2.c(str2, System.currentTimeMillis() + (j * 60 * 1000));
                oVar2.f17408a.b(System.currentTimeMillis());
            }
            if (!str.equals("appodeal://")) {
                this.f17560a = str;
                bVar.processClick((UnifiedAdCallbackClickTrackListener) null);
                r6 = new Runnable() {
                    public final void run() {
                        q.b.this.onHandled();
                    }
                };
            } else if (!TextUtils.isEmpty(this.f17560a)) {
                str = this.f17560a;
                r6 = new Runnable() {
                    public final void run() {
                        q.b.this.onHandled();
                    }
                };
            } else {
                bVar.processClick(new a(bVar, context));
                return;
            }
            n5.b(context, str, r6);
        } else {
            throw new AssertionError();
        }
    }
}
