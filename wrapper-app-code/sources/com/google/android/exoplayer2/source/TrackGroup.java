package com.google.android.exoplayer2.source;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.common.collect.ImmutableList;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

public final class TrackGroup implements Bundleable {
    public static final Bundleable.Creator<TrackGroup> CREATOR = $$Lambda$TrackGroup$X6bRjVOUC4rLwZcvsNhasPlvJM.INSTANCE;
    private final Format[] formats;
    private int hashCode;
    public final String id;
    public final int length;

    private static int normalizeRoleFlags(int i) {
        return i | 16384;
    }

    public TrackGroup(String str, Format... formatArr) {
        Assertions.checkArgument(formatArr.length > 0);
        this.id = str;
        this.formats = formatArr;
        this.length = formatArr.length;
        verifyCorrectness();
    }

    public Format getFormat(int i) {
        return this.formats[i];
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.id.hashCode()) * 31) + Arrays.hashCode(this.formats);
        }
        return this.hashCode;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrackGroup trackGroup = (TrackGroup) obj;
        if (this.length != trackGroup.length || !this.id.equals(trackGroup.id) || !Arrays.equals(this.formats, trackGroup.formats)) {
            return false;
        }
        return true;
    }

    static /* synthetic */ TrackGroup lambda$static$0(Bundle bundle) {
        return new TrackGroup(bundle.getString(keyForField(1), ""), (Format[]) BundleableUtil.fromBundleNullableList(Format.CREATOR, bundle.getParcelableArrayList(keyForField(0)), ImmutableList.of()).toArray(new Format[0]));
    }

    private static String keyForField(int i) {
        return Integer.toString(i, 36);
    }

    private void verifyCorrectness() {
        String normalizeLanguage = normalizeLanguage(this.formats[0].language);
        int normalizeRoleFlags = normalizeRoleFlags(this.formats[0].roleFlags);
        int i = 1;
        while (true) {
            Format[] formatArr = this.formats;
            if (i >= formatArr.length) {
                return;
            }
            if (!normalizeLanguage.equals(normalizeLanguage(formatArr[i].language))) {
                logErrorMessage("languages", this.formats[0].language, this.formats[i].language, i);
                return;
            } else if (normalizeRoleFlags != normalizeRoleFlags(this.formats[i].roleFlags)) {
                logErrorMessage("role flags", Integer.toBinaryString(this.formats[0].roleFlags), Integer.toBinaryString(this.formats[i].roleFlags), i);
                return;
            } else {
                i++;
            }
        }
    }

    private static String normalizeLanguage(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static void logErrorMessage(String str, String str2, String str3, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("Different ");
        sb.append(str);
        sb.append(" combined in one TrackGroup: '");
        sb.append(str2);
        sb.append("' (track 0) and '");
        sb.append(str3);
        sb.append("' (track ");
        sb.append(i);
        sb.append(")");
        Log.e("TrackGroup", "", new IllegalStateException(sb.toString()));
    }
}
