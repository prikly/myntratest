package com.adcolony.sdk;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.onesignal.outcomes.OSOutcomeConstants;
import com.unity3d.services.core.device.MimeTypes;

class i extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    private AudioManager f10092a;

    /* renamed from: b  reason: collision with root package name */
    private AdColonyInterstitial f10093b;

    i(Handler handler, AdColonyInterstitial adColonyInterstitial) {
        super(handler);
        Context a2 = a.a();
        if (a2 != null) {
            this.f10092a = (AudioManager) a2.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            this.f10093b = adColonyInterstitial;
            a2.getApplicationContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Context a2 = a.a();
        if (a2 != null) {
            a2.getApplicationContext().getContentResolver().unregisterContentObserver(this);
        }
        this.f10093b = null;
        this.f10092a = null;
    }

    public boolean deliverSelfNotifications() {
        return false;
    }

    public void onChange(boolean z) {
        AdColonyInterstitial adColonyInterstitial;
        if (this.f10092a != null && (adColonyInterstitial = this.f10093b) != null && adColonyInterstitial.d() != null) {
            double streamVolume = (double) ((((float) this.f10092a.getStreamVolume(3)) / 15.0f) * 100.0f);
            f1 b2 = c0.b();
            c0.a(b2, "audio_percentage", streamVolume);
            c0.a(b2, "ad_session_id", this.f10093b.d().a());
            c0.b(b2, OSOutcomeConstants.OUTCOME_ID, this.f10093b.d().c());
            new h0("AdContainer.on_audio_change", this.f10093b.d().k(), b2).c();
        }
    }
}
