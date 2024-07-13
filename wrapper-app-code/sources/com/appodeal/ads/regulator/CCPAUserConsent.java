package com.appodeal.ads.regulator;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.consent.Consent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/appodeal/ads/regulator/CCPAUserConsent;", "", "Lcom/appodeal/ads/regulator/UserConsent;", "Lcom/appodeal/consent/Consent$Zone;", "a", "Lcom/appodeal/consent/Consent$Zone;", "getZone", "()Lcom/appodeal/consent/Consent$Zone;", "zone", "Unknown", "OptIn", "OptOut", "apd_core"}, k = 1, mv = {1, 6, 0})
public enum CCPAUserConsent implements UserConsent {
    ;
    

    /* renamed from: a  reason: collision with root package name */
    public final Consent.Zone f17111a;

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/appodeal/ads/regulator/CCPAUserConsent$OptIn;", "Lcom/appodeal/ads/regulator/CCPAUserConsent;", "apd_core"}, k = 1, mv = {1, 6, 0})
    public static final class OptIn extends CCPAUserConsent {

        /* renamed from: b  reason: collision with root package name */
        public final Consent.Status f17112b;

        public OptIn() {
            super("OptIn", 1, (DefaultConstructorMarker) null);
            this.f17112b = Consent.Status.PERSONALIZED;
        }

        public final Consent.Status getStatus() {
            return this.f17112b;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/appodeal/ads/regulator/CCPAUserConsent$OptOut;", "Lcom/appodeal/ads/regulator/CCPAUserConsent;", "apd_core"}, k = 1, mv = {1, 6, 0})
    public static final class OptOut extends CCPAUserConsent {

        /* renamed from: b  reason: collision with root package name */
        public final Consent.Status f17113b;

        public OptOut() {
            super("OptOut", 2, (DefaultConstructorMarker) null);
            this.f17113b = Consent.Status.NON_PERSONALIZED;
        }

        public final Consent.Status getStatus() {
            return this.f17113b;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/appodeal/ads/regulator/CCPAUserConsent$Unknown;", "Lcom/appodeal/ads/regulator/CCPAUserConsent;", "apd_core"}, k = 1, mv = {1, 6, 0})
    public static final class Unknown extends CCPAUserConsent {

        /* renamed from: b  reason: collision with root package name */
        public final Consent.Status f17114b;

        public Unknown() {
            super(LogConstants.KEY_UNKNOWN, 0, (DefaultConstructorMarker) null);
            this.f17114b = Consent.Status.UNKNOWN;
        }

        public final Consent.Status getStatus() {
            return this.f17114b;
        }
    }

    public Consent.Zone getZone() {
        return this.f17111a;
    }
}
