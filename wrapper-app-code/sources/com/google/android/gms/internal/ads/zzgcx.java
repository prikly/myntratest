package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgcx implements FilenameFilter {
    private final Pattern zza;

    public zzgcx(Pattern pattern) {
        if (pattern != null) {
            this.zza = pattern;
            return;
        }
        throw null;
    }

    public final boolean accept(File file, String str) {
        return this.zza.matcher(str).matches();
    }
}
