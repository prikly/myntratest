package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import com.squareup.picasso.Action;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

public class Picasso {
    static final Handler HANDLER = new Handler(Looper.getMainLooper()) {
        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 3) {
                int i2 = 0;
                if (i == 8) {
                    List list = (List) message.obj;
                    int size = list.size();
                    while (i2 < size) {
                        BitmapHunter bitmapHunter = (BitmapHunter) list.get(i2);
                        bitmapHunter.picasso.complete(bitmapHunter);
                        i2++;
                    }
                } else if (i == 13) {
                    List list2 = (List) message.obj;
                    int size2 = list2.size();
                    while (i2 < size2) {
                        Action action = (Action) list2.get(i2);
                        action.picasso.resumeAction(action);
                        i2++;
                    }
                } else {
                    throw new AssertionError("Unknown handler message received: " + message.what);
                }
            } else {
                Action action2 = (Action) message.obj;
                if (action2.getPicasso().loggingEnabled) {
                    Utils.log("Main", "canceled", action2.request.logId(), "target got garbage collected");
                }
                action2.picasso.cancelExistingRequest(action2.getTarget());
            }
        }
    };
    static volatile Picasso singleton = null;
    final Cache cache;
    private final CleanupThread cleanupThread;
    final Context context;
    final Bitmap.Config defaultBitmapConfig;
    final Dispatcher dispatcher;
    boolean indicatorsEnabled;
    private final Listener listener;
    volatile boolean loggingEnabled;
    final ReferenceQueue<Object> referenceQueue;
    private final List<RequestHandler> requestHandlers;
    private final RequestTransformer requestTransformer;
    boolean shutdown;
    final Stats stats;
    final Map<Object, Action> targetToAction;
    final Map<ImageView, DeferredRequestCreator> targetToDeferredRequestCreator;

    public interface Listener {
        void onImageLoadFailed(Picasso picasso, Uri uri, Exception exc);
    }

    public enum Priority {
        LOW,
        NORMAL,
        HIGH
    }

    public interface RequestTransformer {
        public static final RequestTransformer IDENTITY = new RequestTransformer() {
            public Request transformRequest(Request request) {
                return request;
            }
        };

        Request transformRequest(Request request);
    }

    Picasso(Context context2, Dispatcher dispatcher2, Cache cache2, Listener listener2, RequestTransformer requestTransformer2, List<RequestHandler> list, Stats stats2, Bitmap.Config config, boolean z, boolean z2) {
        this.context = context2;
        this.dispatcher = dispatcher2;
        this.cache = cache2;
        this.listener = listener2;
        this.requestTransformer = requestTransformer2;
        this.defaultBitmapConfig = config;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new ResourceRequestHandler(context2));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new ContactsPhotoRequestHandler(context2));
        arrayList.add(new MediaStoreRequestHandler(context2));
        arrayList.add(new ContentStreamRequestHandler(context2));
        arrayList.add(new AssetRequestHandler(context2));
        arrayList.add(new FileRequestHandler(context2));
        arrayList.add(new NetworkRequestHandler(dispatcher2.downloader, stats2));
        this.requestHandlers = Collections.unmodifiableList(arrayList);
        this.stats = stats2;
        this.targetToAction = new WeakHashMap();
        this.targetToDeferredRequestCreator = new WeakHashMap();
        this.indicatorsEnabled = z;
        this.loggingEnabled = z2;
        this.referenceQueue = new ReferenceQueue<>();
        CleanupThread cleanupThread2 = new CleanupThread(this.referenceQueue, HANDLER);
        this.cleanupThread = cleanupThread2;
        cleanupThread2.start();
    }

    public void cancelRequest(ImageView imageView) {
        if (imageView != null) {
            cancelExistingRequest(imageView);
            return;
        }
        throw new IllegalArgumentException("view cannot be null.");
    }

    public RequestCreator load(Uri uri) {
        return new RequestCreator(this, uri, 0);
    }

    public RequestCreator load(String str) {
        if (str == null) {
            return new RequestCreator(this, (Uri) null, 0);
        }
        if (str.trim().length() != 0) {
            return load(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    /* access modifiers changed from: package-private */
    public List<RequestHandler> getRequestHandlers() {
        return this.requestHandlers;
    }

    /* access modifiers changed from: package-private */
    public Request transformRequest(Request request) {
        Request transformRequest = this.requestTransformer.transformRequest(request);
        if (transformRequest != null) {
            return transformRequest;
        }
        throw new IllegalStateException("Request transformer " + this.requestTransformer.getClass().getCanonicalName() + " returned null for " + request);
    }

    /* access modifiers changed from: package-private */
    public void defer(ImageView imageView, DeferredRequestCreator deferredRequestCreator) {
        if (this.targetToDeferredRequestCreator.containsKey(imageView)) {
            cancelExistingRequest(imageView);
        }
        this.targetToDeferredRequestCreator.put(imageView, deferredRequestCreator);
    }

    /* access modifiers changed from: package-private */
    public void enqueueAndSubmit(Action action) {
        Object target = action.getTarget();
        if (!(target == null || this.targetToAction.get(target) == action)) {
            cancelExistingRequest(target);
            this.targetToAction.put(target, action);
        }
        submit(action);
    }

    /* access modifiers changed from: package-private */
    public void submit(Action action) {
        this.dispatcher.dispatchSubmit(action);
    }

    /* access modifiers changed from: package-private */
    public Bitmap quickMemoryCacheCheck(String str) {
        Bitmap bitmap = this.cache.get(str);
        if (bitmap != null) {
            this.stats.dispatchCacheHit();
        } else {
            this.stats.dispatchCacheMiss();
        }
        return bitmap;
    }

    /* access modifiers changed from: package-private */
    public void complete(BitmapHunter bitmapHunter) {
        Action action = bitmapHunter.getAction();
        List<Action> actions = bitmapHunter.getActions();
        boolean z = true;
        boolean z2 = actions != null && !actions.isEmpty();
        if (action == null && !z2) {
            z = false;
        }
        if (z) {
            Uri uri = bitmapHunter.getData().uri;
            Exception exception = bitmapHunter.getException();
            Bitmap result = bitmapHunter.getResult();
            LoadedFrom loadedFrom = bitmapHunter.getLoadedFrom();
            if (action != null) {
                deliverAction(result, loadedFrom, action, exception);
            }
            if (z2) {
                int size = actions.size();
                for (int i = 0; i < size; i++) {
                    deliverAction(result, loadedFrom, actions.get(i), exception);
                }
            }
            Listener listener2 = this.listener;
            if (listener2 != null && exception != null) {
                listener2.onImageLoadFailed(this, uri, exception);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void resumeAction(Action action) {
        Bitmap quickMemoryCacheCheck = MemoryPolicy.shouldReadFromMemoryCache(action.memoryPolicy) ? quickMemoryCacheCheck(action.getKey()) : null;
        if (quickMemoryCacheCheck != null) {
            deliverAction(quickMemoryCacheCheck, LoadedFrom.MEMORY, action, (Exception) null);
            if (this.loggingEnabled) {
                String logId = action.request.logId();
                Utils.log("Main", "completed", logId, "from " + LoadedFrom.MEMORY);
                return;
            }
            return;
        }
        enqueueAndSubmit(action);
        if (this.loggingEnabled) {
            Utils.log("Main", "resumed", action.request.logId());
        }
    }

    private void deliverAction(Bitmap bitmap, LoadedFrom loadedFrom, Action action, Exception exc) {
        if (!action.isCancelled()) {
            if (!action.willReplay()) {
                this.targetToAction.remove(action.getTarget());
            }
            if (bitmap == null) {
                action.error(exc);
                if (this.loggingEnabled) {
                    Utils.log("Main", "errored", action.request.logId(), exc.getMessage());
                }
            } else if (loadedFrom != null) {
                action.complete(bitmap, loadedFrom);
                if (this.loggingEnabled) {
                    String logId = action.request.logId();
                    Utils.log("Main", "completed", logId, "from " + loadedFrom);
                }
            } else {
                throw new AssertionError("LoadedFrom cannot be null.");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void cancelExistingRequest(Object obj) {
        DeferredRequestCreator remove;
        Utils.checkMain();
        Action remove2 = this.targetToAction.remove(obj);
        if (remove2 != null) {
            remove2.cancel();
            this.dispatcher.dispatchCancel(remove2);
        }
        if ((obj instanceof ImageView) && (remove = this.targetToDeferredRequestCreator.remove((ImageView) obj)) != null) {
            remove.cancel();
        }
    }

    private static class CleanupThread extends Thread {
        private final Handler handler;
        private final ReferenceQueue<Object> referenceQueue;

        CleanupThread(ReferenceQueue<Object> referenceQueue2, Handler handler2) {
            this.referenceQueue = referenceQueue2;
            this.handler = handler2;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    Action.RequestWeakReference requestWeakReference = (Action.RequestWeakReference) this.referenceQueue.remove(1000);
                    Message obtainMessage = this.handler.obtainMessage();
                    if (requestWeakReference != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = requestWeakReference.action;
                        this.handler.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e2) {
                    this.handler.post(new Runnable() {
                        public void run() {
                            throw new RuntimeException(e2);
                        }
                    });
                    return;
                }
            }
        }
    }

    public static class Builder {
        private Cache cache;
        private final Context context;
        private Bitmap.Config defaultBitmapConfig;
        private Downloader downloader;
        private boolean indicatorsEnabled;
        private Listener listener;
        private boolean loggingEnabled;
        private List<RequestHandler> requestHandlers;
        private ExecutorService service;
        private RequestTransformer transformer;

        public Builder(Context context2) {
            if (context2 != null) {
                this.context = context2.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        public Picasso build() {
            Context context2 = this.context;
            if (this.downloader == null) {
                this.downloader = new OkHttp3Downloader(context2);
            }
            if (this.cache == null) {
                this.cache = new LruCache(context2);
            }
            if (this.service == null) {
                this.service = new PicassoExecutorService();
            }
            if (this.transformer == null) {
                this.transformer = RequestTransformer.IDENTITY;
            }
            Stats stats = new Stats(this.cache);
            Context context3 = context2;
            return new Picasso(context3, new Dispatcher(context3, this.service, Picasso.HANDLER, this.downloader, this.cache, stats), this.cache, this.listener, this.transformer, this.requestHandlers, stats, this.defaultBitmapConfig, this.indicatorsEnabled, this.loggingEnabled);
        }
    }

    public enum LoadedFrom {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);
        
        final int debugColor;

        private LoadedFrom(int i) {
            this.debugColor = i;
        }
    }
}
