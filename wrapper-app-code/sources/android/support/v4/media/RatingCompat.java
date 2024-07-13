package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new Parcelable.Creator<RatingCompat>() {
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    };
    private final int mRatingStyle;
    private final float mRatingValue;

    RatingCompat(int i, float f2) {
        this.mRatingStyle = i;
        this.mRatingValue = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.mRatingStyle);
        sb.append(" rating=");
        float f2 = this.mRatingValue;
        sb.append(f2 < 0.0f ? "unrated" : String.valueOf(f2));
        return sb.toString();
    }

    public int describeContents() {
        return this.mRatingStyle;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mRatingStyle);
        parcel.writeFloat(this.mRatingValue);
    }
}
