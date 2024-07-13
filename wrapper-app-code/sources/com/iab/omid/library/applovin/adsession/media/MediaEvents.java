package com.iab.omid.library.applovin.adsession.media;

import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.a;
import com.iab.omid.library.applovin.internal.h;
import com.iab.omid.library.applovin.utils.c;
import com.iab.omid.library.applovin.utils.g;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import org.json.JSONObject;

public final class MediaEvents {
    private final a adSession;

    private MediaEvents(a aVar) {
        this.adSession = aVar;
    }

    private void confirmValidDuration(float f2) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Invalid Media duration");
        }
    }

    private void confirmValidVolume(float f2) {
        if (f2 < 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
    }

    public static MediaEvents createMediaEvents(AdSession adSession2) {
        a aVar = (a) adSession2;
        g.a((Object) adSession2, "AdSession is null");
        g.f(aVar);
        g.c(aVar);
        g.b(aVar);
        g.h(aVar);
        MediaEvents mediaEvents = new MediaEvents(aVar);
        aVar.getAdSessionStatePublisher().a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        g.a((Object) interactionType, "InteractionType is null");
        g.a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().a("adUserInteraction", jSONObject);
    }

    public void bufferFinish() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("bufferFinish");
    }

    public void bufferStart() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("bufferStart");
    }

    public void complete() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("complete");
    }

    public void firstQuartile() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("firstQuartile");
    }

    public void midpoint() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("midpoint");
    }

    public void pause() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("pause");
    }

    public void playerStateChange(PlayerState playerState) {
        g.a((Object) playerState, "PlayerState is null");
        g.a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, AdOperationMetric.INIT_STATE, playerState);
        this.adSession.getAdSessionStatePublisher().a("playerStateChange", jSONObject);
    }

    public void resume() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("resume");
    }

    public void skipped() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("skipped");
    }

    public void start(float f2, float f3) {
        confirmValidDuration(f2);
        confirmValidVolume(f3);
        g.a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, IronSourceConstants.EVENTS_DURATION, Float.valueOf(f2));
        c.a(jSONObject, "mediaPlayerVolume", Float.valueOf(f3));
        c.a(jSONObject, "deviceVolume", Float.valueOf(h.c().b()));
        this.adSession.getAdSessionStatePublisher().a("start", jSONObject);
    }

    public void thirdQuartile() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("thirdQuartile");
    }

    public void volumeChange(float f2) {
        confirmValidVolume(f2);
        g.a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        c.a(jSONObject, "deviceVolume", Float.valueOf(h.c().b()));
        this.adSession.getAdSessionStatePublisher().a("volumeChange", jSONObject);
    }
}
