package androidx.core.content;

import android.content.LocusId;

public final class LocusIdCompat {
    private final String mId;
    private final LocusId mWrapped;

    public int hashCode() {
        String str = this.mId;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LocusIdCompat locusIdCompat = (LocusIdCompat) obj;
        String str = this.mId;
        if (str != null) {
            return str.equals(locusIdCompat.mId);
        }
        if (locusIdCompat.mId == null) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "LocusIdCompat[" + getSanitizedId() + "]";
    }

    public LocusId toLocusId() {
        return this.mWrapped;
    }

    private String getSanitizedId() {
        int length = this.mId.length();
        return length + "_chars";
    }
}
