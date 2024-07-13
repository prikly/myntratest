package com.appodeal.ads.regulator;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.consent.Consent;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class i implements h {

    /* renamed from: a  reason: collision with root package name */
    public boolean f17162a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f17163b;

    /* renamed from: c  reason: collision with root package name */
    public Consent f17164c;

    /* renamed from: d  reason: collision with root package name */
    public UserConsent f17165d;

    /* renamed from: e  reason: collision with root package name */
    public Boolean f17166e;

    /* renamed from: f  reason: collision with root package name */
    public Consent f17167f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f17168g;

    @DebugMetadata(c = "com.appodeal.ads.regulator.RegulatorProvider", f = "RegulatorProvider.kt", l = {60}, m = "receiveRegulatorData")
    public static final class a extends ContinuationImpl {

        /* renamed from: a  reason: collision with root package name */
        public i f17169a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f17170b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ i f17171c;

        /* renamed from: d  reason: collision with root package name */
        public int f17172d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(i iVar, Continuation<? super a> continuation) {
            super(continuation);
            this.f17171c = iVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f17170b = obj;
            this.f17172d |= RecyclerView.UNDEFINED_DURATION;
            return this.f17171c.a((Context) null, (String) null, this);
        }
    }

    public final void a(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "jsonObject");
        this.f17162a = jSONObject.has("gdpr");
        this.f17163b = jSONObject.has("ccpa");
        this.f17168g = jSONObject.optBoolean("consent", true);
    }

    public final boolean a(Boolean bool) {
        if (Intrinsics.areEqual((Object) this.f17166e, (Object) bool)) {
            return false;
        }
        this.f17166e = bool;
        return true;
    }

    public final boolean b() {
        Boolean bool;
        Consent consent = this.f17164c;
        Boolean bool2 = null;
        if (consent == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(consent.getBooleanStatus());
        }
        if (bool == null) {
            Consent consent2 = this.f17167f;
            if (consent2 != null) {
                bool2 = Boolean.valueOf(consent2.getBooleanStatus());
            }
            if (bool2 == null) {
                bool = this.f17166e;
                if (bool == null) {
                    return false;
                }
            } else {
                bool = bool2;
            }
        }
        return bool.booleanValue();
    }

    public final Consent c() {
        return this.f17164c;
    }

    public final Boolean d() {
        return this.f17166e;
    }

    public final boolean e() {
        return this.f17168g && b();
    }

    public final String f() {
        String str;
        Consent consent = this.f17164c;
        if (consent == null) {
            str = null;
        } else {
            str = consent.getIABConsentString();
        }
        if (str != null) {
            return str;
        }
        Consent consent2 = this.f17167f;
        if (consent2 == null) {
            return null;
        }
        return consent2.getIABConsentString();
    }

    public final boolean g() {
        Boolean bool;
        Consent consent = this.f17164c;
        Boolean bool2 = null;
        if (consent == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(consent.isCCPAScope());
        }
        if (bool == null) {
            Consent consent2 = this.f17167f;
            if (consent2 != null) {
                bool2 = Boolean.valueOf(consent2.isCCPAScope());
            }
            if (bool2 == null) {
                return this.f17163b;
            }
            bool = bool2;
        }
        return bool.booleanValue();
    }

    public final String getUSPrivacyString() {
        String str;
        Consent consent = this.f17164c;
        if (consent == null) {
            str = null;
        } else {
            str = consent.getUSPrivacyString();
        }
        if (str != null) {
            return str;
        }
        Consent consent2 = this.f17167f;
        if (consent2 == null) {
            return null;
        }
        return consent2.getUSPrivacyString();
    }

    public final boolean a(Consent consent) {
        if (Intrinsics.areEqual((Object) this.f17167f, (Object) consent)) {
            return false;
        }
        this.f17167f = consent;
        return true;
    }

    public final boolean a(UserConsent userConsent) {
        Intrinsics.checkNotNullParameter(userConsent, "publisherZoneConsent");
        if (Intrinsics.areEqual((Object) this.f17165d, (Object) userConsent)) {
            return false;
        }
        this.f17165d = userConsent;
        return true;
    }

    public final boolean a(String str) {
        Boolean bool;
        if (this.f17168g) {
            Consent consent = this.f17167f;
            if (consent == null) {
                bool = null;
            } else {
                bool = Boolean.valueOf(consent.hasConsentForVendor(str));
            }
            if (bool == null ? e() : bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean a() {
        Boolean bool;
        Consent consent = this.f17164c;
        Boolean bool2 = null;
        if (consent == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(consent.isGDPRScope());
        }
        if (bool == null) {
            Consent consent2 = this.f17167f;
            if (consent2 != null) {
                bool2 = Boolean.valueOf(consent2.isGDPRScope());
            }
            if (bool2 == null) {
                return this.f17162a;
            }
            bool = bool2;
        }
        return bool.booleanValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(android.content.Context r8, java.lang.String r9, kotlin.coroutines.Continuation<? super com.appodeal.consent.Consent> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.appodeal.ads.regulator.i.a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.appodeal.ads.regulator.i$a r0 = (com.appodeal.ads.regulator.i.a) r0
            int r1 = r0.f17172d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f17172d = r1
            goto L_0x0018
        L_0x0013:
            com.appodeal.ads.regulator.i$a r0 = new com.appodeal.ads.regulator.i$a
            r0.<init>(r7, r10)
        L_0x0018:
            r6 = r0
            java.lang.Object r10 = r6.f17170b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f17172d
            r2 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 != r2) goto L_0x002c
            com.appodeal.ads.regulator.i r8 = r6.f17169a
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0084
        L_0x002c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r10)
            com.appodeal.ads.regulator.UserConsent r10 = r7.f17165d
            java.lang.Boolean r1 = r7.f17166e
            if (r10 == 0) goto L_0x004a
            com.appodeal.consent.Consent$Status r1 = r10.getStatus()
            com.appodeal.consent.Consent$Zone r10 = r10.getZone()
            kotlin.Pair r10 = kotlin.TuplesKt.to(r1, r10)
            goto L_0x0063
        L_0x004a:
            if (r1 == 0) goto L_0x005e
            boolean r10 = r1.booleanValue()
            if (r10 == 0) goto L_0x0055
            com.appodeal.consent.Consent$Status r10 = com.appodeal.consent.Consent.Status.PERSONALIZED
            goto L_0x0057
        L_0x0055:
            com.appodeal.consent.Consent$Status r10 = com.appodeal.consent.Consent.Status.NON_PERSONALIZED
        L_0x0057:
            com.appodeal.consent.Consent$Zone r1 = com.appodeal.consent.Consent.Zone.UNKNOWN
            kotlin.Pair r10 = kotlin.TuplesKt.to(r10, r1)
            goto L_0x0063
        L_0x005e:
            r10 = 0
            kotlin.Pair r10 = kotlin.TuplesKt.to(r10, r10)
        L_0x0063:
            java.lang.Object r1 = r10.component1()
            r4 = r1
            com.appodeal.consent.Consent$Status r4 = (com.appodeal.consent.Consent.Status) r4
            java.lang.Object r10 = r10.component2()
            r5 = r10
            com.appodeal.consent.Consent$Zone r5 = (com.appodeal.consent.Consent.Zone) r5
            com.appodeal.ads.regulator.d r1 = com.appodeal.ads.regulator.c.a(r8)
            com.appodeal.consent.Consent r3 = r7.f17167f
            r6.f17169a = r7
            r6.f17172d = r2
            r2 = r9
            java.lang.Object r10 = r1.a((java.lang.String) r2, (com.appodeal.consent.Consent) r3, (com.appodeal.consent.Consent.Status) r4, (com.appodeal.consent.Consent.Zone) r5, (kotlin.coroutines.Continuation<? super com.appodeal.consent.Consent>) r6)
            if (r10 != r0) goto L_0x0083
            return r0
        L_0x0083:
            r8 = r7
        L_0x0084:
            com.appodeal.consent.Consent r10 = (com.appodeal.consent.Consent) r10
            if (r10 != 0) goto L_0x008c
            com.appodeal.consent.Consent r10 = com.appodeal.consent.ConsentManager.getConsent()
        L_0x008c:
            r8.f17164c = r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.regulator.i.a(android.content.Context, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
