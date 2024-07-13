package com.google.android.exoplayer2.text;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.common.base.Objects;

public final class Cue implements Bundleable {
    public static final Bundleable.Creator<Cue> CREATOR = $$Lambda$Cue$UXXMt8Dn9aDHvS0NMWvjKdJLjrM.INSTANCE;
    public static final Cue EMPTY = new Builder().setText("").build();
    public final Bitmap bitmap;
    public final float bitmapHeight;
    public final float line;
    public final int lineAnchor;
    public final int lineType;
    public final Layout.Alignment multiRowAlignment;
    public final float position;
    public final int positionAnchor;
    public final float shearDegrees;
    public final float size;
    public final CharSequence text;
    public final Layout.Alignment textAlignment;
    public final float textSize;
    public final int textSizeType;
    public final int verticalType;
    public final int windowColor;
    public final boolean windowColorSet;

    private Cue(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap2, float f2, int i, int i2, float f3, int i3, int i4, float f4, float f5, float f6, boolean z, int i5, int i6, float f7) {
        CharSequence charSequence2 = charSequence;
        Bitmap bitmap3 = bitmap2;
        if (charSequence2 == null) {
            Assertions.checkNotNull(bitmap2);
        } else {
            Assertions.checkArgument(bitmap3 == null);
        }
        if (charSequence2 instanceof Spanned) {
            this.text = SpannedString.valueOf(charSequence);
        } else if (charSequence2 != null) {
            this.text = charSequence.toString();
        } else {
            this.text = null;
        }
        this.textAlignment = alignment;
        this.multiRowAlignment = alignment2;
        this.bitmap = bitmap3;
        this.line = f2;
        this.lineType = i;
        this.lineAnchor = i2;
        this.position = f3;
        this.positionAnchor = i3;
        this.size = f5;
        this.bitmapHeight = f6;
        this.windowColorSet = z;
        this.windowColor = i5;
        this.textSizeType = i4;
        this.textSize = f4;
        this.verticalType = i6;
        this.shearDegrees = f7;
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        Bitmap bitmap2;
        Bitmap bitmap3;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Cue cue = (Cue) obj;
        if (TextUtils.equals(this.text, cue.text) && this.textAlignment == cue.textAlignment && this.multiRowAlignment == cue.multiRowAlignment && ((bitmap2 = this.bitmap) != null ? !((bitmap3 = cue.bitmap) == null || !bitmap2.sameAs(bitmap3)) : cue.bitmap == null) && this.line == cue.line && this.lineType == cue.lineType && this.lineAnchor == cue.lineAnchor && this.position == cue.position && this.positionAnchor == cue.positionAnchor && this.size == cue.size && this.bitmapHeight == cue.bitmapHeight && this.windowColorSet == cue.windowColorSet && this.windowColor == cue.windowColor && this.textSizeType == cue.textSizeType && this.textSize == cue.textSize && this.verticalType == cue.verticalType && this.shearDegrees == cue.shearDegrees) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.text, this.textAlignment, this.multiRowAlignment, this.bitmap, Float.valueOf(this.line), Integer.valueOf(this.lineType), Integer.valueOf(this.lineAnchor), Float.valueOf(this.position), Integer.valueOf(this.positionAnchor), Float.valueOf(this.size), Float.valueOf(this.bitmapHeight), Boolean.valueOf(this.windowColorSet), Integer.valueOf(this.windowColor), Integer.valueOf(this.textSizeType), Float.valueOf(this.textSize), Integer.valueOf(this.verticalType), Float.valueOf(this.shearDegrees));
    }

    public static final class Builder {
        private Bitmap bitmap;
        private float bitmapHeight;
        private float line;
        private int lineAnchor;
        private int lineType;
        private Layout.Alignment multiRowAlignment;
        private float position;
        private int positionAnchor;
        private float shearDegrees;
        private float size;
        private CharSequence text;
        private Layout.Alignment textAlignment;
        private float textSize;
        private int textSizeType;
        private int verticalType;
        private int windowColor;
        private boolean windowColorSet;

        public Builder() {
            this.text = null;
            this.bitmap = null;
            this.textAlignment = null;
            this.multiRowAlignment = null;
            this.line = -3.4028235E38f;
            this.lineType = RecyclerView.UNDEFINED_DURATION;
            this.lineAnchor = RecyclerView.UNDEFINED_DURATION;
            this.position = -3.4028235E38f;
            this.positionAnchor = RecyclerView.UNDEFINED_DURATION;
            this.textSizeType = RecyclerView.UNDEFINED_DURATION;
            this.textSize = -3.4028235E38f;
            this.size = -3.4028235E38f;
            this.bitmapHeight = -3.4028235E38f;
            this.windowColorSet = false;
            this.windowColor = -16777216;
            this.verticalType = RecyclerView.UNDEFINED_DURATION;
        }

        private Builder(Cue cue) {
            this.text = cue.text;
            this.bitmap = cue.bitmap;
            this.textAlignment = cue.textAlignment;
            this.multiRowAlignment = cue.multiRowAlignment;
            this.line = cue.line;
            this.lineType = cue.lineType;
            this.lineAnchor = cue.lineAnchor;
            this.position = cue.position;
            this.positionAnchor = cue.positionAnchor;
            this.textSizeType = cue.textSizeType;
            this.textSize = cue.textSize;
            this.size = cue.size;
            this.bitmapHeight = cue.bitmapHeight;
            this.windowColorSet = cue.windowColorSet;
            this.windowColor = cue.windowColor;
            this.verticalType = cue.verticalType;
            this.shearDegrees = cue.shearDegrees;
        }

        public Builder setText(CharSequence charSequence) {
            this.text = charSequence;
            return this;
        }

        public CharSequence getText() {
            return this.text;
        }

        public Builder setBitmap(Bitmap bitmap2) {
            this.bitmap = bitmap2;
            return this;
        }

        public Builder setTextAlignment(Layout.Alignment alignment) {
            this.textAlignment = alignment;
            return this;
        }

        public Builder setMultiRowAlignment(Layout.Alignment alignment) {
            this.multiRowAlignment = alignment;
            return this;
        }

        public Builder setLine(float f2, int i) {
            this.line = f2;
            this.lineType = i;
            return this;
        }

        public Builder setLineAnchor(int i) {
            this.lineAnchor = i;
            return this;
        }

        public Builder setPosition(float f2) {
            this.position = f2;
            return this;
        }

        public Builder setPositionAnchor(int i) {
            this.positionAnchor = i;
            return this;
        }

        public Builder setTextSize(float f2, int i) {
            this.textSize = f2;
            this.textSizeType = i;
            return this;
        }

        public Builder setSize(float f2) {
            this.size = f2;
            return this;
        }

        public Builder setBitmapHeight(float f2) {
            this.bitmapHeight = f2;
            return this;
        }

        public Builder setWindowColor(int i) {
            this.windowColor = i;
            this.windowColorSet = true;
            return this;
        }

        public Builder clearWindowColor() {
            this.windowColorSet = false;
            return this;
        }

        public Builder setVerticalType(int i) {
            this.verticalType = i;
            return this;
        }

        public Builder setShearDegrees(float f2) {
            this.shearDegrees = f2;
            return this;
        }

        public Cue build() {
            return new Cue(this.text, this.textAlignment, this.multiRowAlignment, this.bitmap, this.line, this.lineType, this.lineAnchor, this.position, this.positionAnchor, this.textSizeType, this.textSize, this.size, this.bitmapHeight, this.windowColorSet, this.windowColor, this.verticalType, this.shearDegrees);
        }
    }

    /* access modifiers changed from: private */
    public static final Cue fromBundle(Bundle bundle) {
        Builder builder = new Builder();
        CharSequence charSequence = bundle.getCharSequence(keyForField(0));
        if (charSequence != null) {
            builder.setText(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(keyForField(1));
        if (alignment != null) {
            builder.setTextAlignment(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(keyForField(2));
        if (alignment2 != null) {
            builder.setMultiRowAlignment(alignment2);
        }
        Bitmap bitmap2 = (Bitmap) bundle.getParcelable(keyForField(3));
        if (bitmap2 != null) {
            builder.setBitmap(bitmap2);
        }
        if (bundle.containsKey(keyForField(4)) && bundle.containsKey(keyForField(5))) {
            builder.setLine(bundle.getFloat(keyForField(4)), bundle.getInt(keyForField(5)));
        }
        if (bundle.containsKey(keyForField(6))) {
            builder.setLineAnchor(bundle.getInt(keyForField(6)));
        }
        if (bundle.containsKey(keyForField(7))) {
            builder.setPosition(bundle.getFloat(keyForField(7)));
        }
        if (bundle.containsKey(keyForField(8))) {
            builder.setPositionAnchor(bundle.getInt(keyForField(8)));
        }
        if (bundle.containsKey(keyForField(10)) && bundle.containsKey(keyForField(9))) {
            builder.setTextSize(bundle.getFloat(keyForField(10)), bundle.getInt(keyForField(9)));
        }
        if (bundle.containsKey(keyForField(11))) {
            builder.setSize(bundle.getFloat(keyForField(11)));
        }
        if (bundle.containsKey(keyForField(12))) {
            builder.setBitmapHeight(bundle.getFloat(keyForField(12)));
        }
        if (bundle.containsKey(keyForField(13))) {
            builder.setWindowColor(bundle.getInt(keyForField(13)));
        }
        if (!bundle.getBoolean(keyForField(14), false)) {
            builder.clearWindowColor();
        }
        if (bundle.containsKey(keyForField(15))) {
            builder.setVerticalType(bundle.getInt(keyForField(15)));
        }
        if (bundle.containsKey(keyForField(16))) {
            builder.setShearDegrees(bundle.getFloat(keyForField(16)));
        }
        return builder.build();
    }

    private static String keyForField(int i) {
        return Integer.toString(i, 36);
    }
}
