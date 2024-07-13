package com.appodeal.ads.regulator;

import com.appodeal.ads.h0;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.consent.Consent;
import com.appodeal.consent.ConsentForm;
import kotlin.jvm.internal.Intrinsics;

public interface a {

    /* renamed from: com.appodeal.ads.regulator.a$a  reason: collision with other inner class name */
    public static final class C0196a implements a {

        /* renamed from: a  reason: collision with root package name */
        public final Consent f17119a;

        public C0196a(Consent consent) {
            Intrinsics.checkNotNullParameter(consent, "consent");
            this.f17119a = consent;
        }

        public final Consent a() {
            return this.f17119a;
        }

        public final String toString() {
            return Intrinsics.stringPlus("Consent form closed. Current consent: ", this.f17119a.toJson());
        }
    }

    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public final Consent f17120a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f17121b;

        public b(Consent consent, boolean z) {
            Intrinsics.checkNotNullParameter(consent, "consent");
            this.f17120a = consent;
            this.f17121b = z;
        }

        public final Consent a() {
            return this.f17120a;
        }

        public final boolean b() {
            return this.f17121b;
        }

        public final String toString() {
            StringBuilder a2 = h0.a("Consent loaded [consent: ");
            a2.append(this.f17120a.toJson());
            a2.append(", shouldShowConsentView: ");
            a2.append(this.f17121b);
            a2.append(']');
            return a2.toString();
        }
    }

    public static final class c implements a {

        /* renamed from: a  reason: collision with root package name */
        public final Consent f17122a;

        public c(Consent consent) {
            Intrinsics.checkNotNullParameter(consent, "consent");
            this.f17122a = consent;
        }

        public final Consent a() {
            return this.f17122a;
        }

        public final String toString() {
            StringBuilder a2 = h0.a("Consent received successfully [consent: ");
            a2.append(this.f17122a.toJson());
            a2.append(']');
            return a2.toString();
        }
    }

    public static final class d implements a {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f17123a;

        public d(Throwable th) {
            Intrinsics.checkNotNullParameter(th, "cause");
            this.f17123a = th;
        }

        public final Throwable a() {
            return this.f17123a;
        }
    }

    public static final class e implements a {

        /* renamed from: a  reason: collision with root package name */
        public final ConsentForm f17124a;

        public e(ConsentForm consentForm) {
            Intrinsics.checkNotNullParameter(consentForm, "consentForm");
            this.f17124a = consentForm;
        }

        public final ConsentForm a() {
            return this.f17124a;
        }

        public final String toString() {
            StringBuilder a2 = h0.a("Form loaded [consentForm: ");
            a2.append(this.f17124a);
            a2.append(']');
            return a2.toString();
        }
    }

    public static final class f implements a {

        /* renamed from: a  reason: collision with root package name */
        public final String f17125a;

        /* renamed from: b  reason: collision with root package name */
        public final Consent f17126b;

        /* renamed from: c  reason: collision with root package name */
        public final Consent.Status f17127c;

        /* renamed from: d  reason: collision with root package name */
        public final Consent.Zone f17128d;

        public f(String str, Consent consent, Consent.Status status, Consent.Zone zone) {
            Intrinsics.checkNotNullParameter(str, Constants.APP_KEY);
            this.f17125a = str;
            this.f17126b = consent;
            this.f17127c = status;
            this.f17128d = zone;
        }

        public final String a() {
            return this.f17125a;
        }

        public final Consent b() {
            return this.f17126b;
        }

        public final Consent.Status c() {
            return this.f17127c;
        }

        public final Consent.Zone d() {
            return this.f17128d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Intrinsics.areEqual((Object) this.f17125a, (Object) fVar.f17125a) && Intrinsics.areEqual((Object) this.f17126b, (Object) fVar.f17126b) && this.f17127c == fVar.f17127c && this.f17128d == fVar.f17128d;
        }

        public final int hashCode() {
            int hashCode = this.f17125a.hashCode() * 31;
            Consent consent = this.f17126b;
            int i = 0;
            int hashCode2 = (hashCode + (consent == null ? 0 : consent.hashCode())) * 31;
            Consent.Status status = this.f17127c;
            int hashCode3 = (hashCode2 + (status == null ? 0 : status.hashCode())) * 31;
            Consent.Zone zone = this.f17128d;
            if (zone != null) {
                i = zone.hashCode();
            }
            return hashCode3 + i;
        }

        public final String toString() {
            StringBuilder a2 = h0.a("OnStarted(appKey=");
            a2.append(this.f17125a);
            a2.append(", publisherConsent=");
            a2.append(this.f17126b);
            a2.append(", status=");
            a2.append(this.f17127c);
            a2.append(", zone=");
            a2.append(this.f17128d);
            a2.append(')');
            return a2.toString();
        }
    }
}
