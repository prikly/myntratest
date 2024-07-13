package com.bytedance.mobsec.metasec.ov;

import java.util.Map;
import ms.bd.o.Pgl.l0;

public final class PglMSManager implements l0.pgla {

    /* renamed from: a  reason: collision with root package name */
    private final l0.pgla f18199a;

    PglMSManager(l0.pgla pgla) {
        this.f18199a = pgla;
    }

    public Map<String, String> frameSign(String str, int i) {
        return this.f18199a.frameSign(str, i);
    }

    public Map<String, String> getFeatureHash(String str, byte[] bArr) {
        return this.f18199a.getFeatureHash(str, bArr);
    }

    public Map<String, String> getReportRaw(String str, int i, Map<String, String> map) {
        return this.f18199a.getReportRaw(str, i, map);
    }

    public String getToken() {
        return this.f18199a.getToken();
    }

    public void report(String str) {
        this.f18199a.report(str);
    }

    public void setBDDeviceID(String str) {
        this.f18199a.setBDDeviceID(str);
    }

    public void setCollectMode(int i) {
        this.f18199a.setCollectMode(i);
    }

    public void setDeviceID(String str) {
        this.f18199a.setDeviceID(str);
    }

    public void setInstallID(String str) {
        this.f18199a.setInstallID(str);
    }

    public void setSessionID(String str) {
        this.f18199a.setSessionID(str);
    }
}
