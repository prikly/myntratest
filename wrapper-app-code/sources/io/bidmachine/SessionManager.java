package io.bidmachine;

import java.util.EnumMap;
import java.util.UUID;

public class SessionManager {
    private static volatile SessionManager instance;
    private long pauseTime;
    private long resumeTime;
    private final EnumMap<AdsType, SessionAdParams> sessionAdParamsMap = new EnumMap<>(AdsType.class);
    private long sessionDuration;
    private String sessionId;
    private long sessionResetAfterSec;

    public static SessionManager get() {
        SessionManager sessionManager = instance;
        if (sessionManager == null) {
            synchronized (SessionManager.class) {
                sessionManager = instance;
                if (sessionManager == null) {
                    sessionManager = new SessionManager();
                    instance = sessionManager;
                }
            }
        }
        return sessionManager;
    }

    private SessionManager() {
        startNewSession();
    }

    /* access modifiers changed from: package-private */
    public void startNewSession() {
        this.sessionId = UUID.randomUUID().toString();
        this.sessionDuration = 0;
        this.pauseTime = 0;
        this.resumeTime = 0;
        for (AdsType sessionAdParams : AdsType.values()) {
            getSessionAdParams(sessionAdParams).clear();
        }
    }

    /* access modifiers changed from: package-private */
    public String getSessionId() {
        return this.sessionId;
    }

    public void setSessionResetAfter(long j) {
        this.sessionResetAfterSec = j;
    }

    public void resume() {
        long currentTimeMillis = System.currentTimeMillis();
        this.resumeTime = currentTimeMillis;
        long j = this.sessionResetAfterSec;
        if (j > 0) {
            long j2 = this.pauseTime;
            if (j2 > 0 && currentTimeMillis - j2 >= j * 1000) {
                startNewSession();
            }
        }
    }

    public void pause() {
        if (this.resumeTime != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.pauseTime = currentTimeMillis;
            this.sessionDuration += currentTimeMillis - this.resumeTime;
        }
    }

    public int getSessionDuration() {
        if (this.resumeTime == 0) {
            return 0;
        }
        return (int) ((this.sessionDuration + (System.currentTimeMillis() - this.resumeTime)) / 1000);
    }

    /* access modifiers changed from: package-private */
    public synchronized SessionAdParams getSessionAdParams(AdsType adsType) {
        SessionAdParams sessionAdParams;
        sessionAdParams = this.sessionAdParamsMap.get(adsType);
        if (sessionAdParams == null) {
            sessionAdParams = new SessionAdParams();
            this.sessionAdParamsMap.put(adsType, sessionAdParams);
        }
        return sessionAdParams;
    }
}
