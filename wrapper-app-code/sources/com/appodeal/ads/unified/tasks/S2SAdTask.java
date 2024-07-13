package com.appodeal.ads.unified.tasks;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.appodeal.ads.RestrictedData;
import com.appodeal.ads.n5;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.mraid.UnifiedMraidNetworkParams;
import com.appodeal.ads.unified.vast.UnifiedVastNetworkParams;
import com.appodeal.ads.utils.ExchangeAd;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.s;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class S2SAdTask<ResponseType, OutputType> implements Runnable {
    private static final int RESULT_FAIL = 0;
    private static final int RESULT_SUCCESS = 1;
    public final Callback<OutputType> callback;
    public final Context context;
    private final Handler handler;
    private final AdResponseProcessor<ResponseType> processor;
    private final AdParamsProcessorCallback<ResponseType> processorCallback = new AdParamsProcessorCallback<ResponseType>() {
        public void onProcessFail(LoadingError loadingError) {
            S2SAdTask.this.notifyFail(loadingError);
        }

        public void onProcessSuccess(ResponseType responsetype) {
            try {
                S2SAdTask.this.onParamsProcessSuccess(responsetype);
                S2SAdTask.this.resolver.processResponse(responsetype, S2SAdTask.this.resolverCallback);
            } catch (Throwable th) {
                Log.log(th);
                S2SAdTask.this.notifyFail(LoadingError.InternalError);
            }
        }
    };
    /* access modifiers changed from: private */
    public final AdParamsResolver<ResponseType, OutputType> resolver;
    /* access modifiers changed from: private */
    public final AdParamsResolverCallback<OutputType> resolverCallback = new AdParamsResolverCallback() {
        public final void onResolve(Object obj) {
            S2SAdTask.this.notifySuccess(obj);
        }
    };
    public final RestrictedData restrictedData;
    public final String url;

    public interface Callback<OutputType> {
        void onFail(LoadingError loadingError);

        void onSuccess(Context context, OutputType outputtype);
    }

    public S2SAdTask(final Context context2, String str, RestrictedData restrictedData2, AdResponseProcessor<ResponseType> adResponseProcessor, AdParamsResolver<ResponseType, OutputType> adParamsResolver, final Callback<OutputType> callback2) {
        this.context = context2;
        this.url = str;
        this.restrictedData = restrictedData2;
        this.processor = adResponseProcessor;
        this.resolver = adParamsResolver;
        this.callback = callback2;
        this.handler = new Handler(Looper.getMainLooper()) {
            public void handleMessage(Message message) {
                Callback callback = callback2;
                if (callback != null) {
                    int i = message.what;
                    if (i == 0) {
                        callback.onFail((LoadingError) message.obj);
                    } else if (i == 1) {
                        callback.onSuccess(context2, message.obj);
                    }
                }
            }
        };
    }

    public static void requestMraid(Context context2, String str, UnifiedMraidNetworkParams unifiedMraidNetworkParams, UnifiedAdCallback unifiedAdCallback, Callback<UnifiedMraidNetworkParams> callback2) {
        final UnifiedAdCallback unifiedAdCallback2 = unifiedAdCallback;
        new S2SAdTask<ExchangeAd, UnifiedMraidNetworkParams>(context2, str, unifiedMraidNetworkParams.restrictedData, new ExchangeAdResponseProcessor(), new MraidParamsResolver(unifiedMraidNetworkParams), callback2) {
            public void onParamsProcessSuccess(ExchangeAd exchangeAd) {
                S2SAdTask.super.onParamsProcessSuccess(exchangeAd);
                Bundle bundle = new Bundle();
                bundle.putParcelable("exchange_ad", exchangeAd);
                unifiedAdCallback2.onAdInfoRequested(bundle);
            }
        }.start();
    }

    public static void requestNast(Context context2, String str, RestrictedData restrictedData2, UnifiedAdCallback unifiedAdCallback, Callback<String> callback2) {
        final UnifiedAdCallback unifiedAdCallback2 = unifiedAdCallback;
        new S2SAdTask<ExchangeAd, String>(context2, str, restrictedData2, new ExchangeAdResponseProcessor(), new NastParamsResolver(), callback2) {
            public void onParamsProcessSuccess(ExchangeAd exchangeAd) {
                S2SAdTask.super.onParamsProcessSuccess(exchangeAd);
                Bundle bundle = new Bundle();
                bundle.putParcelable("exchange_ad", exchangeAd);
                unifiedAdCallback2.onAdInfoRequested(bundle);
            }
        }.start();
    }

    public static void requestVast(Context context2, String str, UnifiedVastNetworkParams unifiedVastNetworkParams, UnifiedAdCallback unifiedAdCallback, Callback<UnifiedVastNetworkParams> callback2) {
        final UnifiedAdCallback unifiedAdCallback2 = unifiedAdCallback;
        new S2SAdTask<ExchangeAd, UnifiedVastNetworkParams>(context2, str, unifiedVastNetworkParams.restrictedData, new ExchangeAdResponseProcessor(), new VastParamsResolver(unifiedVastNetworkParams), callback2) {
            public void onParamsProcessSuccess(ExchangeAd exchangeAd) {
                S2SAdTask.super.onParamsProcessSuccess(exchangeAd);
                Bundle bundle = new Bundle();
                bundle.putParcelable("exchange_ad", exchangeAd);
                unifiedAdCallback2.onAdInfoRequested(bundle);
            }
        }.start();
    }

    public final void notifyFail(LoadingError loadingError) {
        this.handler.obtainMessage(0, loadingError).sendToTarget();
    }

    public final void notifySuccess(OutputType outputtype) {
        this.handler.sendMessage(this.handler.obtainMessage(1, outputtype));
    }

    public URL obtainRequestUrl(String str) {
        return new URL(str);
    }

    public void onParamsProcessSuccess(ResponseType responsetype) {
    }

    public void prepareUrlConnection(Context context2, HttpURLConnection httpURLConnection) {
        String httpAgent = this.restrictedData.getHttpAgent(context2);
        if (!TextUtils.isEmpty(httpAgent)) {
            httpURLConnection.setRequestProperty("User-Agent", httpAgent);
        }
    }

    public void processServerResult(URLConnection uRLConnection) {
        String a2 = n5.a(uRLConnection.getInputStream());
        if (TextUtils.isEmpty(a2) || TextUtils.getTrimmedLength(a2) == 0) {
            notifyFail(LoadingError.NoFill);
        } else {
            processServerResult(uRLConnection, a2);
        }
    }

    public void processServerResult(URLConnection uRLConnection, String str) {
        this.processor.processResponse(uRLConnection, str, this.processorCallback);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
            java.lang.String r0 = r3.url
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x005b
            java.lang.String r0 = r3.url
            int r0 = android.text.TextUtils.getTrimmedLength(r0)
            if (r0 != 0) goto L_0x0011
            goto L_0x005b
        L_0x0011:
            r0 = 0
            java.lang.String r1 = r3.url     // Catch:{ Exception -> 0x0046 }
            java.net.URL r1 = r3.obtainRequestUrl(r1)     // Catch:{ Exception -> 0x0046 }
            if (r1 != 0) goto L_0x0020
            com.appodeal.ads.networking.LoadingError r1 = com.appodeal.ads.networking.LoadingError.IncorrectAdunit     // Catch:{ Exception -> 0x0046 }
            r3.notifyFail(r1)     // Catch:{ Exception -> 0x0046 }
            return
        L_0x0020:
            java.net.URLConnection r1 = r1.openConnection()     // Catch:{ Exception -> 0x0046 }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Exception -> 0x0046 }
            r0 = 20000(0x4e20, float:2.8026E-41)
            r1.setConnectTimeout(r0)     // Catch:{ Exception -> 0x003f, all -> 0x003a }
            r1.setReadTimeout(r0)     // Catch:{ Exception -> 0x003f, all -> 0x003a }
            android.content.Context r0 = r3.context     // Catch:{ Exception -> 0x003f, all -> 0x003a }
            r3.prepareUrlConnection(r0, r1)     // Catch:{ Exception -> 0x003f, all -> 0x003a }
            r3.processServerResult(r1)     // Catch:{ Exception -> 0x003f, all -> 0x003a }
            r1.disconnect()
            goto L_0x0054
        L_0x003a:
            r0 = move-exception
            r2 = r1
            r1 = r0
            r0 = r2
            goto L_0x0055
        L_0x003f:
            r0 = move-exception
            r2 = r1
            r1 = r0
            r0 = r2
            goto L_0x0047
        L_0x0044:
            r1 = move-exception
            goto L_0x0055
        L_0x0046:
            r1 = move-exception
        L_0x0047:
            com.appodeal.ads.utils.Log.log(r1)     // Catch:{ all -> 0x0044 }
            com.appodeal.ads.networking.LoadingError r1 = com.appodeal.ads.networking.LoadingError.InternalError     // Catch:{ all -> 0x0044 }
            r3.notifyFail(r1)     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0054
            r0.disconnect()
        L_0x0054:
            return
        L_0x0055:
            if (r0 == 0) goto L_0x005a
            r0.disconnect()
        L_0x005a:
            throw r1
        L_0x005b:
            com.appodeal.ads.networking.LoadingError r0 = com.appodeal.ads.networking.LoadingError.IncorrectAdunit
            r3.notifyFail(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.unified.tasks.S2SAdTask.run():void");
    }

    public void start() {
        s.f17568e.f17569a.execute(this);
    }
}
