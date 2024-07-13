package com.unity3d.services.core.request;

import android.os.ConditionVariable;
import com.appnext.core.AppnextError;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.WebRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class WebRequestThread {
    private static int _corePoolSize = 1;
    private static long _keepAliveTime = 1000;
    private static int _maximumPoolSize = 1;
    private static CancelableThreadPoolExecutor _pool = null;
    private static LinkedBlockingQueue<Runnable> _queue = null;
    /* access modifiers changed from: private */
    public static boolean _ready = false;
    /* access modifiers changed from: private */
    public static final Object _readyLock = new Object();

    private static synchronized void init() {
        synchronized (WebRequestThread.class) {
            _queue = new LinkedBlockingQueue<>();
            CancelableThreadPoolExecutor cancelableThreadPoolExecutor = new CancelableThreadPoolExecutor(_corePoolSize, _maximumPoolSize, _keepAliveTime, TimeUnit.MILLISECONDS, _queue);
            _pool = cancelableThreadPoolExecutor;
            cancelableThreadPoolExecutor.prestartAllCoreThreads();
            _queue.add(new Runnable() {
                public void run() {
                    boolean unused = WebRequestThread._ready = true;
                    synchronized (WebRequestThread._readyLock) {
                        WebRequestThread._readyLock.notifyAll();
                    }
                }
            });
            while (!_ready) {
                try {
                    synchronized (_readyLock) {
                        _readyLock.wait();
                    }
                } catch (InterruptedException unused) {
                    DeviceLog.debug("Couldn't synchronize thread");
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:5|6|7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void reset() {
        /*
            java.lang.Class<com.unity3d.services.core.request.WebRequestThread> r0 = com.unity3d.services.core.request.WebRequestThread.class
            monitor-enter(r0)
            cancel()     // Catch:{ all -> 0x0032 }
            com.unity3d.services.core.request.CancelableThreadPoolExecutor r1 = _pool     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0030
            com.unity3d.services.core.request.CancelableThreadPoolExecutor r1 = _pool     // Catch:{ all -> 0x0032 }
            r1.shutdown()     // Catch:{ all -> 0x0032 }
            com.unity3d.services.core.request.CancelableThreadPoolExecutor r1 = _pool     // Catch:{ InterruptedException -> 0x001c }
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ InterruptedException -> 0x001c }
            r1.awaitTermination(r2, r4)     // Catch:{ InterruptedException -> 0x001c }
            goto L_0x0023
        L_0x001c:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0032 }
            r1.interrupt()     // Catch:{ all -> 0x0032 }
        L_0x0023:
            java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> r1 = _queue     // Catch:{ all -> 0x0032 }
            r1.clear()     // Catch:{ all -> 0x0032 }
            r1 = 0
            _pool = r1     // Catch:{ all -> 0x0032 }
            _queue = r1     // Catch:{ all -> 0x0032 }
            r1 = 0
            _ready = r1     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r0)
            return
        L_0x0032:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.request.WebRequestThread.reset():void");
    }

    public static synchronized void cancel() {
        synchronized (WebRequestThread.class) {
            if (_pool != null) {
                _pool.cancel();
                Iterator<Runnable> it = _queue.iterator();
                while (it.hasNext()) {
                    Runnable next = it.next();
                    if (next instanceof WebRequestRunnable) {
                        ((WebRequestRunnable) next).setCancelStatus(true);
                    }
                }
                _queue.clear();
                _pool.purge();
            }
        }
    }

    public static synchronized void request(String str, WebRequest.RequestType requestType, Map<String, List<String>> map, Integer num, Integer num2, IWebRequestListener iWebRequestListener) {
        synchronized (WebRequestThread.class) {
            request(str, requestType, map, (String) null, num, num2, iWebRequestListener);
        }
    }

    public static synchronized void request(String str, WebRequest.RequestType requestType, Map<String, List<String>> map, String str2, Integer num, Integer num2, IWebRequestListener iWebRequestListener) {
        String str3 = str;
        synchronized (WebRequestThread.class) {
            if (!_ready) {
                init();
            }
            if (str3 != null) {
                if (str.length() >= 3) {
                    _queue.add(new WebRequestRunnable(str, requestType.name(), str2, num.intValue(), num2.intValue(), map, iWebRequestListener));
                    return;
                }
            }
            iWebRequestListener.onFailed(str, "Request is NULL or too short");
        }
    }

    public static synchronized void setConcurrentRequestCount(int i) {
        synchronized (WebRequestThread.class) {
            _corePoolSize = i;
            _maximumPoolSize = i;
            if (_pool != null) {
                _pool.setCorePoolSize(i);
                _pool.setMaximumPoolSize(_maximumPoolSize);
            }
        }
    }

    public static synchronized void setMaximumPoolSize(int i) {
        synchronized (WebRequestThread.class) {
            _maximumPoolSize = i;
            if (_pool != null) {
                _pool.setMaximumPoolSize(i);
            }
        }
    }

    public static synchronized void setKeepAliveTime(long j) {
        synchronized (WebRequestThread.class) {
            _keepAliveTime = j;
            if (_pool != null) {
                _pool.setKeepAliveTime(j, TimeUnit.MILLISECONDS);
            }
        }
    }

    public static synchronized boolean resolve(final String str, final IResolveHostListener iResolveHostListener) {
        synchronized (WebRequestThread.class) {
            if (str != null) {
                if (str.length() >= 3) {
                    new Thread(new Runnable() {
                        public void run() {
                            Thread thread;
                            Exception e2;
                            final ConditionVariable conditionVariable = new ConditionVariable();
                            try {
                                thread = new Thread(new Runnable() {
                                    public void run() {
                                        try {
                                            iResolveHostListener.onResolve(str, InetAddress.getByName(str).getHostAddress());
                                        } catch (UnknownHostException e2) {
                                            DeviceLog.exception("Unknown host", e2);
                                            iResolveHostListener.onFailed(str, ResolveHostError.UNKNOWN_HOST, e2.getMessage());
                                        }
                                        conditionVariable.open();
                                    }
                                });
                                try {
                                    thread.start();
                                } catch (Exception e3) {
                                    e2 = e3;
                                }
                            } catch (Exception e4) {
                                Exception exc = e4;
                                thread = null;
                                e2 = exc;
                                DeviceLog.exception("Exception while resolving host", e2);
                                iResolveHostListener.onFailed(str, ResolveHostError.UNEXPECTED_EXCEPTION, e2.getMessage());
                                if (!conditionVariable.block(20000)) {
                                    return;
                                }
                            }
                            if (!conditionVariable.block(20000) && thread != null) {
                                thread.interrupt();
                                iResolveHostListener.onFailed(str, ResolveHostError.TIMEOUT, AppnextError.TIMEOUT);
                            }
                        }
                    }).start();
                    return true;
                }
            }
            iResolveHostListener.onFailed(str, ResolveHostError.INVALID_HOST, "Host is NULL");
            return false;
        }
    }
}
