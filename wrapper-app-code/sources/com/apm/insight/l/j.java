package com.apm.insight.l;

import java.net.BindException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.SSLException;
import org.apache.http.conn.ConnectTimeoutException;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f10746a;

    static {
        HashSet hashSet = new HashSet();
        f10746a = hashSet;
        hashSet.add("HeapTaskDaemon");
        f10746a.add("ThreadPlus");
        f10746a.add("ApiDispatcher");
        f10746a.add("ApiLocalDispatcher");
        f10746a.add("AsyncLoader");
        f10746a.add("AsyncTask");
        f10746a.add("Binder");
        f10746a.add("PackageProcessor");
        f10746a.add("SettingsObserver");
        f10746a.add("WifiManager");
        f10746a.add("JavaBridge");
        f10746a.add("Compiler");
        f10746a.add("Signal Catcher");
        f10746a.add("GC");
        f10746a.add("ReferenceQueueDaemon");
        f10746a.add("FinalizerDaemon");
        f10746a.add("FinalizerWatchdogDaemon");
        f10746a.add("CookieSyncManager");
        f10746a.add("RefQueueWorker");
        f10746a.add("CleanupReference");
        f10746a.add("VideoManager");
        f10746a.add("DBHelper-AsyncOp");
        f10746a.add("InstalledAppTracker2");
        f10746a.add("AppData-AsyncOp");
        f10746a.add("IdleConnectionMonitor");
        f10746a.add("LogReaper");
        f10746a.add("ActionReaper");
        f10746a.add("Okio Watchdog");
        f10746a.add("CheckWaitingQueue");
        f10746a.add("NPTH-CrashTimer");
        f10746a.add("NPTH-JavaCallback");
        f10746a.add("NPTH-LocalParser");
        f10746a.add("ANR_FILE_MODIFY");
    }

    public static Set<String> a() {
        return f10746a;
    }

    public static boolean a(Throwable th) {
        if (th == null) {
            return true;
        }
        try {
            return (th instanceof ConnectTimeoutException) || (th instanceof SocketTimeoutException) || (th instanceof BindException) || (th instanceof ConnectException) || (th instanceof NoRouteToHostException) || (th instanceof PortUnreachableException) || (th instanceof SocketException) || (th instanceof UnknownHostException) || (th instanceof ProtocolException) || (th instanceof SSLException);
        } catch (Throwable th2) {
            th2.printStackTrace();
            return false;
        }
    }
}
