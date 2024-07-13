package com.google.android.gms.internal.auth;

import android.util.Log;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.io.UnsupportedEncodingException;

public abstract class zzaz extends FastSafeParcelableJsonResponse {
    private static String zzem = "AUTH";

    public byte[] toByteArray() {
        try {
            return toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e2) {
            Log.e(zzem, "Error serializing object.", e2);
            return null;
        }
    }
}