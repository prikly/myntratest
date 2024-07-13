package com.onesignal;

import android.content.Context;
import com.onesignal.OneSignal;
import com.onesignal.PushRegistrator;
import java.io.IOException;

abstract class PushRegistratorAbstractGoogle implements PushRegistrator {
    /* access modifiers changed from: private */
    public static int REGISTRATION_RETRY_BACKOFF_MS = 10000;
    /* access modifiers changed from: private */
    public static int REGISTRATION_RETRY_COUNT = 5;
    private boolean firedCallback;
    private Thread registerThread;
    private PushRegistrator.RegisteredHandler registeredHandler;

    /* access modifiers changed from: package-private */
    public abstract String getProviderName();

    /* access modifiers changed from: package-private */
    public abstract String getToken(String str) throws Throwable;

    PushRegistratorAbstractGoogle() {
    }

    public void registerForPush(Context context, String str, PushRegistrator.RegisteredHandler registeredHandler2) {
        this.registeredHandler = registeredHandler2;
        if (isValidProjectNumber(str, registeredHandler2)) {
            internalRegisterForPush(str);
        }
    }

    private void internalRegisterForPush(String str) {
        try {
            if (OSUtils.isGMSInstalledAndEnabled()) {
                registerInBackground(str);
                return;
            }
            GooglePlayServicesUpgradePrompt.showUpdateGPSDialog();
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "'Google Play services' app not installed or disabled on the device.");
            this.registeredHandler.complete((String) null, -7);
        } catch (Throwable th) {
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
            OneSignal.Log(log_level, "Could not register with " + getProviderName() + " due to an issue with your AndroidManifest.xml or with 'Google Play services'.", th);
            this.registeredHandler.complete((String) null, -8);
        }
    }

    private synchronized void registerInBackground(final String str) {
        if (this.registerThread == null || !this.registerThread.isAlive()) {
            Thread thread = new Thread(new Runnable() {
                public void run() {
                    int i = 0;
                    while (i < PushRegistratorAbstractGoogle.REGISTRATION_RETRY_COUNT && !PushRegistratorAbstractGoogle.this.attemptRegistration(str, i)) {
                        i++;
                        OSUtils.sleep(PushRegistratorAbstractGoogle.REGISTRATION_RETRY_BACKOFF_MS * i);
                    }
                }
            });
            this.registerThread = thread;
            thread.start();
        }
    }

    /* access modifiers changed from: private */
    public boolean attemptRegistration(String str, int i) {
        try {
            String token = getToken(str);
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.INFO;
            OneSignal.Log(log_level, "Device registered, push token = " + token);
            this.registeredHandler.complete(token, 1);
            return true;
        } catch (IOException e2) {
            int pushStatusFromThrowable = pushStatusFromThrowable(e2);
            String rootCauseMessage = OSUtils.getRootCauseMessage(e2);
            if ("SERVICE_NOT_AVAILABLE".equals(rootCauseMessage) || "AUTHENTICATION_FAILED".equals(rootCauseMessage)) {
                Exception exc = new Exception(e2);
                if (i >= REGISTRATION_RETRY_COUNT - 1) {
                    OneSignal.LOG_LEVEL log_level2 = OneSignal.LOG_LEVEL.ERROR;
                    OneSignal.Log(log_level2, "Retry count of " + REGISTRATION_RETRY_COUNT + " exceed! Could not get a " + getProviderName() + " Token.", exc);
                } else {
                    OneSignal.LOG_LEVEL log_level3 = OneSignal.LOG_LEVEL.INFO;
                    OneSignal.Log(log_level3, "'Google Play services' returned " + rootCauseMessage + " error. Current retry count: " + i, exc);
                    if (i == 2) {
                        this.registeredHandler.complete((String) null, pushStatusFromThrowable);
                        this.firedCallback = true;
                        return true;
                    }
                }
                return false;
            }
            Exception exc2 = new Exception(e2);
            OneSignal.LOG_LEVEL log_level4 = OneSignal.LOG_LEVEL.ERROR;
            OneSignal.Log(log_level4, "Error Getting " + getProviderName() + " Token", exc2);
            if (!this.firedCallback) {
                this.registeredHandler.complete((String) null, pushStatusFromThrowable);
            }
            return true;
        } catch (Throwable th) {
            Exception exc3 = new Exception(th);
            int pushStatusFromThrowable2 = pushStatusFromThrowable(th);
            OneSignal.LOG_LEVEL log_level5 = OneSignal.LOG_LEVEL.ERROR;
            OneSignal.Log(log_level5, "Unknown error getting " + getProviderName() + " Token", exc3);
            this.registeredHandler.complete((String) null, pushStatusFromThrowable2);
            return true;
        }
    }

    private static int pushStatusFromThrowable(Throwable th) {
        String rootCauseMessage = OSUtils.getRootCauseMessage(th);
        if (!(th instanceof IOException)) {
            return -12;
        }
        if ("SERVICE_NOT_AVAILABLE".equals(rootCauseMessage)) {
            return -9;
        }
        return "AUTHENTICATION_FAILED".equals(rootCauseMessage) ? -29 : -11;
    }

    private boolean isValidProjectNumber(String str, PushRegistrator.RegisteredHandler registeredHandler2) {
        boolean z;
        try {
            Float.parseFloat(str);
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        if (z) {
            return true;
        }
        OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Missing Google Project number!\nPlease enter a Google Project number / Sender ID on under App Settings > Android > Configuration on the OneSignal dashboard.");
        registeredHandler2.complete((String) null, -6);
        return false;
    }
}
