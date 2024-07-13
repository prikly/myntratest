package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.TypedValue;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Request;
import java.util.concurrent.atomic.AtomicInteger;

public class RequestCreator {
    private static final AtomicInteger nextId = new AtomicInteger();
    private final Request.Builder data;
    private boolean deferred;
    private Drawable errorDrawable;
    private int errorResId;
    private int memoryPolicy;
    private int networkPolicy;
    private boolean noFade;
    private final Picasso picasso;
    private Drawable placeholderDrawable;
    private int placeholderResId;
    private boolean setPlaceholder;
    private Object tag;

    RequestCreator(Picasso picasso2, Uri uri, int i) {
        this.setPlaceholder = true;
        if (!picasso2.shutdown) {
            this.picasso = picasso2;
            this.data = new Request.Builder(uri, i, picasso2.defaultBitmapConfig);
            return;
        }
        throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
    }

    RequestCreator() {
        this.setPlaceholder = true;
        this.picasso = null;
        this.data = new Request.Builder((Uri) null, 0, (Bitmap.Config) null);
    }

    public RequestCreator placeholder(Drawable drawable) {
        if (!this.setPlaceholder) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        } else if (this.placeholderResId == 0) {
            this.placeholderDrawable = drawable;
            return this;
        } else {
            throw new IllegalStateException("Placeholder image already set.");
        }
    }

    /* access modifiers changed from: package-private */
    public RequestCreator unfit() {
        this.deferred = false;
        return this;
    }

    /* access modifiers changed from: package-private */
    public RequestCreator clearTag() {
        this.tag = null;
        return this;
    }

    public RequestCreator resize(int i, int i2) {
        this.data.resize(i, i2);
        return this;
    }

    public void fetch() {
        fetch((Callback) null);
    }

    public void fetch(Callback callback) {
        long nanoTime = System.nanoTime();
        if (this.deferred) {
            throw new IllegalStateException("Fit cannot be used with fetch.");
        } else if (this.data.hasImage()) {
            if (!this.data.hasPriority()) {
                this.data.priority(Picasso.Priority.LOW);
            }
            Request createRequest = createRequest(nanoTime);
            String createKey = Utils.createKey(createRequest, new StringBuilder());
            if (!MemoryPolicy.shouldReadFromMemoryCache(this.memoryPolicy) || this.picasso.quickMemoryCacheCheck(createKey) == null) {
                this.picasso.submit(new FetchAction(this.picasso, createRequest, this.memoryPolicy, this.networkPolicy, this.tag, createKey, callback));
                return;
            }
            if (this.picasso.loggingEnabled) {
                String plainId = createRequest.plainId();
                Utils.log("Main", "completed", plainId, "from " + Picasso.LoadedFrom.MEMORY);
            }
            if (callback != null) {
                callback.onSuccess();
            }
        }
    }

    public void into(ImageView imageView, Callback callback) {
        Bitmap quickMemoryCacheCheck;
        ImageView imageView2 = imageView;
        Callback callback2 = callback;
        long nanoTime = System.nanoTime();
        Utils.checkMain();
        if (imageView2 == null) {
            throw new IllegalArgumentException("Target must not be null.");
        } else if (!this.data.hasImage()) {
            this.picasso.cancelRequest(imageView2);
            if (this.setPlaceholder) {
                PicassoDrawable.setPlaceholder(imageView2, getPlaceholderDrawable());
            }
        } else {
            if (this.deferred) {
                if (!this.data.hasSize()) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width == 0 || height == 0) {
                        if (this.setPlaceholder) {
                            PicassoDrawable.setPlaceholder(imageView2, getPlaceholderDrawable());
                        }
                        this.picasso.defer(imageView2, new DeferredRequestCreator(this, imageView2, callback2));
                        return;
                    }
                    this.data.resize(width, height);
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            Request createRequest = createRequest(nanoTime);
            String createKey = Utils.createKey(createRequest);
            if (!MemoryPolicy.shouldReadFromMemoryCache(this.memoryPolicy) || (quickMemoryCacheCheck = this.picasso.quickMemoryCacheCheck(createKey)) == null) {
                if (this.setPlaceholder) {
                    PicassoDrawable.setPlaceholder(imageView2, getPlaceholderDrawable());
                }
                this.picasso.enqueueAndSubmit(new ImageViewAction(this.picasso, imageView, createRequest, this.memoryPolicy, this.networkPolicy, this.errorResId, this.errorDrawable, createKey, this.tag, callback, this.noFade));
                return;
            }
            this.picasso.cancelRequest(imageView2);
            PicassoDrawable.setBitmap(imageView, this.picasso.context, quickMemoryCacheCheck, Picasso.LoadedFrom.MEMORY, this.noFade, this.picasso.indicatorsEnabled);
            if (this.picasso.loggingEnabled) {
                String plainId = createRequest.plainId();
                Utils.log("Main", "completed", plainId, "from " + Picasso.LoadedFrom.MEMORY);
            }
            if (callback2 != null) {
                callback.onSuccess();
            }
        }
    }

    private Drawable getPlaceholderDrawable() {
        if (this.placeholderResId == 0) {
            return this.placeholderDrawable;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return this.picasso.context.getDrawable(this.placeholderResId);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return this.picasso.context.getResources().getDrawable(this.placeholderResId);
        }
        TypedValue typedValue = new TypedValue();
        this.picasso.context.getResources().getValue(this.placeholderResId, typedValue, true);
        return this.picasso.context.getResources().getDrawable(typedValue.resourceId);
    }

    private Request createRequest(long j) {
        int andIncrement = nextId.getAndIncrement();
        Request build = this.data.build();
        build.id = andIncrement;
        build.started = j;
        boolean z = this.picasso.loggingEnabled;
        if (z) {
            Utils.log("Main", "created", build.plainId(), build.toString());
        }
        Request transformRequest = this.picasso.transformRequest(build);
        if (transformRequest != build) {
            transformRequest.id = andIncrement;
            transformRequest.started = j;
            if (z) {
                String logId = transformRequest.logId();
                Utils.log("Main", "changed", logId, "into " + transformRequest);
            }
        }
        return transformRequest;
    }
}
