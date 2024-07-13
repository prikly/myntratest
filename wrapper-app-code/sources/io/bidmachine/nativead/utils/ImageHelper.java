package io.bidmachine.nativead.utils;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import java.io.InputStream;
import java.lang.ref.WeakReference;

public class ImageHelper {
    private static final int MAX_IMAGE_HEIGHT = 700;
    private static final int MAX_IMAGE_WIDTH = 1200;

    public interface OnImageHelperListener {
        void onError(String str);

        void onImagePrepared(ImageView imageView, Drawable drawable);
    }

    public static int calculateReqHeight(int i, boolean z) {
        if (z) {
            i = (int) (((float) i) / 1.5f);
        }
        return i > MAX_IMAGE_HEIGHT ? MAX_IMAGE_HEIGHT : i;
    }

    private static void loadImageByPath(Context context, Uri uri, ImageView imageView, OnImageHelperListener onImageHelperListener) {
        if (onImageHelperListener != null) {
            if (uri == null || TextUtils.isEmpty(uri.getPath())) {
                onImageHelperListener.onError("ImagePath is invalid");
            } else if (imageView == null) {
                onImageHelperListener.onError("Target ImageView is null");
            } else {
                NativeNetworkExecutor.getInstance().execute(new ImagePreparation(context, uri, imageView, onImageHelperListener));
            }
        }
    }

    public static int calculateReqWidth(Context context) {
        Point screenSize = Utils.getScreenSize(context);
        return Math.min(1200, Math.min(screenSize.x, screenSize.y));
    }

    public static int calculateInSamplesSize(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        int i5 = 1;
        while (true) {
            if (i3 / i5 <= i && i4 / i5 <= i2) {
                return i5;
            }
            i5 *= 2;
        }
    }

    public static void fillImageView(Context context, ImageView imageView, Uri uri, Drawable drawable) {
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        } else {
            loadImageByPath(context, uri, imageView, new OnImageHelperListener() {
                public void onImagePrepared(ImageView imageView, Drawable drawable) {
                    imageView.setImageDrawable(drawable);
                }

                public void onError(String str) {
                    Logger.log(str);
                }
            });
        }
    }

    private static class ImagePreparation implements Runnable {
        private final Context context;
        /* access modifiers changed from: private */
        public Drawable image;
        private final Uri imageUri;
        /* access modifiers changed from: private */
        public final OnImageHelperListener onImageHelperListener;
        /* access modifiers changed from: private */
        public final WeakReference<ImageView> weakTargetImageView;

        ImagePreparation(Context context2, Uri uri, ImageView imageView, OnImageHelperListener onImageHelperListener2) {
            this.context = context2;
            this.imageUri = uri;
            this.weakTargetImageView = new WeakReference<>(imageView);
            this.onImageHelperListener = onImageHelperListener2;
        }

        public void run() {
            InputStream openInputStream;
            InputStream openInputStream2;
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                openInputStream = this.context.getContentResolver().openInputStream(this.imageUri);
                BitmapFactory.decodeStream(openInputStream, (Rect) null, options);
                Utils.close(openInputStream);
                if (options.outWidth != 0) {
                    if (options.outHeight != 0) {
                        int calculateReqWidth = ImageHelper.calculateReqWidth(this.context);
                        options.inSampleSize = ImageHelper.calculateInSamplesSize(options, calculateReqWidth, ImageHelper.calculateReqHeight(calculateReqWidth, false));
                        options.inJustDecodeBounds = false;
                        openInputStream2 = this.context.getContentResolver().openInputStream(this.imageUri);
                        this.image = new BitmapDrawable(this.context.getResources(), BitmapFactory.decodeStream(openInputStream2, (Rect) null, options));
                        Utils.close(openInputStream2);
                        Utils.onUiThread(new Runnable() {
                            public void run() {
                                ImageView imageView = (ImageView) ImagePreparation.this.weakTargetImageView.get();
                                if (imageView == null || ImagePreparation.this.image == null) {
                                    ImagePreparation.this.onImageHelperListener.onError("Target ImageView or Bitmap is invalid");
                                } else {
                                    ImagePreparation.this.onImageHelperListener.onImagePrepared(imageView, ImagePreparation.this.image);
                                }
                            }
                        });
                        return;
                    }
                }
                this.onImageHelperListener.onError("Image size is (0;0)");
            } catch (Throwable th) {
                if (th.getMessage() != null) {
                    this.onImageHelperListener.onError(th.getMessage());
                } else {
                    this.onImageHelperListener.onError("ImagePreparation error");
                }
            }
        }
    }
}
