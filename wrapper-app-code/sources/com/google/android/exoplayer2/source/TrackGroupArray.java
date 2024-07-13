package com.google.android.exoplayer2.source;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.common.collect.ImmutableList;

public final class TrackGroupArray implements Bundleable {
    public static final Bundleable.Creator<TrackGroupArray> CREATOR = $$Lambda$TrackGroupArray$xAe9VrwTWBRsn7FVhxSkPO2SbOM.INSTANCE;
    public static final TrackGroupArray EMPTY = new TrackGroupArray(new TrackGroup[0]);
    private int hashCode;
    public final int length;
    private final ImmutableList<TrackGroup> trackGroups;

    public TrackGroupArray(TrackGroup... trackGroupArr) {
        this.trackGroups = ImmutableList.copyOf(trackGroupArr);
        this.length = trackGroupArr.length;
        verifyCorrectness();
    }

    public TrackGroup get(int i) {
        return (TrackGroup) this.trackGroups.get(i);
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = this.trackGroups.hashCode();
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
        TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
        if (this.length != trackGroupArray.length || !this.trackGroups.equals(trackGroupArray.trackGroups)) {
            return false;
        }
        return true;
    }

    static /* synthetic */ TrackGroupArray lambda$static$0(Bundle bundle) {
        return new TrackGroupArray((TrackGroup[]) BundleableUtil.fromBundleNullableList(TrackGroup.CREATOR, bundle.getParcelableArrayList(keyForField(0)), ImmutableList.of()).toArray(new TrackGroup[0]));
    }

    private void verifyCorrectness() {
        int i = 0;
        while (i < this.trackGroups.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.trackGroups.size(); i3++) {
                if (((TrackGroup) this.trackGroups.get(i)).equals(this.trackGroups.get(i3))) {
                    Log.e("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    private static String keyForField(int i) {
        return Integer.toString(i, 36);
    }
}
