package com.applovin.exoplayer2.d;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import com.applovin.exoplayer2.d.c;
import com.applovin.exoplayer2.h;
import com.applovin.exoplayer2.l.ai;
import com.facebook.ads.AdError;

public final class j {

    private static final class a {
        public static boolean a(Throwable th) {
            return th instanceof NotProvisionedException;
        }

        public static boolean b(Throwable th) {
            return th instanceof DeniedByServerException;
        }
    }

    private static final class b {
        public static boolean a(Throwable th) {
            return th instanceof MediaDrm.MediaDrmStateException;
        }

        public static int b(Throwable th) {
            return h.b(ai.d(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
    }

    private static final class c {
        public static boolean a(Throwable th) {
            return th instanceof MediaDrmResetException;
        }
    }

    public static int a(Exception exc, int i) {
        if (ai.f13525a >= 21 && b.a(exc)) {
            return b.b(exc);
        }
        if (ai.f13525a >= 23 && c.a(exc)) {
            return 6006;
        }
        if (ai.f13525a >= 18 && a.a(exc)) {
            return AdError.ICONVIEW_MISSING_ERROR_CODE;
        }
        if (ai.f13525a >= 18 && a.b(exc)) {
            return 6007;
        }
        if (exc instanceof t) {
            return AdError.MEDIAVIEW_MISSING_ERROR_CODE;
        }
        if (exc instanceof c.d) {
            return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
        }
        if (exc instanceof q) {
            return 6008;
        }
        if (i == 1) {
            return 6006;
        }
        if (i == 2) {
            return 6004;
        }
        if (i == 3) {
            return AdError.ICONVIEW_MISSING_ERROR_CODE;
        }
        throw new IllegalArgumentException();
    }
}
