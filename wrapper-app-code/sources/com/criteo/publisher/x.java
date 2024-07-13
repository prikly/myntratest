package com.criteo.publisher;

import com.criteo.publisher.logging.g;
import com.criteo.publisher.logging.h;
import com.criteo.publisher.n0.o;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutionException;
import javax.net.ssl.SSLException;

/* compiled from: SafeRunnable */
public abstract class x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final g f2925a = h.b(x.class);

    /* renamed from: b  reason: collision with root package name */
    private final StackTraceElement[] f2926b = Thread.currentThread().getStackTrace();

    public abstract void a() throws Throwable;

    public void run() {
        try {
            a();
        } catch (Throwable th) {
            ExecutionException executionException = new ExecutionException(th);
            executionException.setStackTrace(this.f2926b);
            if (th instanceof RuntimeException) {
                o.a((Throwable) executionException);
            } else if (a(th)) {
                this.f2925a.a(v.d(executionException));
            } else {
                this.f2925a.a(v.c(executionException));
            }
        }
    }

    private boolean a(Throwable th) {
        return (th instanceof SocketException) || (th instanceof UnknownHostException) || (th instanceof SSLException) || (th instanceof ProtocolException) || (th instanceof SocketTimeoutException);
    }
}
