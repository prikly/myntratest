package com.onesignal;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.messaging.FirebaseMessaging;
import com.onesignal.OneSignal;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;

class PushRegistratorFCM extends PushRegistratorAbstractGoogle {
    private static final String FCM_APP_NAME = "ONESIGNAL_SDK_FCM_APP_NAME";
    private final Context context;
    private FirebaseApp firebaseApp;
    private final Params params;

    /* access modifiers changed from: package-private */
    public String getProviderName() {
        return "FCM";
    }

    static class Params {
        private static final String FCM_DEFAULT_API_KEY_BASE64 = "QUl6YVN5QW5UTG41LV80TWMyYTJQLWRLVWVFLWFCdGd5Q3JqbFlV";
        private static final String FCM_DEFAULT_APP_ID = "1:754795614042:android:c682b8144a8dd52bc1ad63";
        private static final String FCM_DEFAULT_PROJECT_ID = "onesignal-shared-public";
        /* access modifiers changed from: private */
        public final String apiKey;
        /* access modifiers changed from: private */
        public final String appId;
        /* access modifiers changed from: private */
        public final String projectId;

        Params() {
            this((String) null, (String) null, (String) null);
        }

        Params(String str, String str2, String str3) {
            this.projectId = str == null ? FCM_DEFAULT_PROJECT_ID : str;
            this.appId = str2 == null ? FCM_DEFAULT_APP_ID : str2;
            this.apiKey = str3 == null ? new String(Base64.decode(FCM_DEFAULT_API_KEY_BASE64, 0)) : str3;
        }
    }

    PushRegistratorFCM(Context context2, Params params2) {
        this.context = context2;
        if (params2 == null) {
            this.params = new Params();
        } else {
            this.params = params2;
        }
    }

    /* access modifiers changed from: package-private */
    public String getToken(String str) throws Exception {
        initFirebaseApp(str);
        try {
            return getTokenWithClassFirebaseMessaging();
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
            OneSignal.Log(OneSignal.LOG_LEVEL.INFO, "FirebaseMessaging.getToken not found, attempting to use FirebaseInstanceId.getToken");
            return getTokenWithClassFirebaseInstanceId(str);
        }
    }

    @Deprecated
    private String getTokenWithClassFirebaseInstanceId(String str) throws IOException {
        try {
            Object invoke = Class.forName("com.google.firebase.iid.FirebaseInstanceId").getMethod("getInstance", new Class[]{FirebaseApp.class}).invoke((Object) null, new Object[]{this.firebaseApp});
            return (String) invoke.getClass().getMethod("getToken", new Class[]{String.class, String.class}).invoke(invoke, new Object[]{str, "FCM"});
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            throw new Error("Reflection error on FirebaseInstanceId.getInstance(firebaseApp).getToken(senderId, FirebaseMessaging.INSTANCE_ID_SCOPE)", e2);
        }
    }

    private String getTokenWithClassFirebaseMessaging() throws Exception {
        Task token = ((FirebaseMessaging) this.firebaseApp.get(FirebaseMessaging.class)).getToken();
        try {
            return (String) Tasks.await(token);
        } catch (ExecutionException unused) {
            throw token.getException();
        }
    }

    private void initFirebaseApp(String str) {
        if (this.firebaseApp == null) {
            this.firebaseApp = FirebaseApp.initializeApp(this.context, new FirebaseOptions.Builder().setGcmSenderId(str).setApplicationId(this.params.appId).setApiKey(this.params.apiKey).setProjectId(this.params.projectId).build(), FCM_APP_NAME);
        }
    }
}
