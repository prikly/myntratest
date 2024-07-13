package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ac.CrashpadServiceHelper;

public class F7 implements Runnable {
    public void run() {
        CrashpadServiceHelper.deleteCompletedReports();
    }
}
