package io.bidmachine;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.appnext.base.b.d;
import io.bidmachine.core.Utils;
import io.bidmachine.utils.DeviceUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DeviceInfo {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String OS_NAME = "android";
    private static volatile DeviceInfo instance;
    public final String deviceModel;
    private String hwv;
    private Boolean isRooted;
    public final boolean isTablet;
    public final String manufacturer = DeviceUtils.getManufacturer();
    public final String model;
    public final String osName = "android";
    public final String osVersion = String.valueOf(Build.VERSION.SDK_INT);
    public final String phoneCarrier;
    public final String phoneMCCMNC;
    public final float screenDensity;
    public final int screenDpi;
    private Long totalDiskSpaceInMB;
    private Long totalRAMInB;

    public static DeviceInfo obtain(Context context) {
        DeviceInfo deviceInfo = instance;
        if (deviceInfo == null) {
            synchronized (DeviceInfo.class) {
                deviceInfo = instance;
                if (deviceInfo == null) {
                    deviceInfo = new DeviceInfo(context);
                    instance = deviceInfo;
                }
            }
        }
        return deviceInfo;
    }

    private DeviceInfo(Context context) {
        String model2 = DeviceUtils.getModel();
        this.deviceModel = model2;
        this.model = String.format("%s %s", new Object[]{this.manufacturer, model2});
        this.screenDpi = DeviceUtils.getScreenDpi(context);
        this.screenDensity = Utils.getScreenDensity(context);
        this.isTablet = DeviceUtils.isTablet(context);
        this.phoneMCCMNC = DeviceUtils.getPhoneMCCMNC(context);
        this.phoneCarrier = DeviceUtils.getPhoneOperator(context);
    }

    /* access modifiers changed from: package-private */
    public boolean isDeviceRooted() {
        Boolean bool = this.isRooted;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = true;
        try {
            String[] strArr = {"/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su"};
            for (int i = 0; i < 8; i++) {
                if (new File(strArr[i]).exists()) {
                    Boolean bool2 = true;
                    this.isRooted = bool2;
                    return bool2.booleanValue();
                }
            }
        } catch (Exception unused) {
        }
        Process process = null;
        try {
            Process exec = Runtime.getRuntime().exec(new String[]{"/system/xbin/which", "su"});
            if (new BufferedReader(new InputStreamReader(exec.getInputStream())).readLine() == null) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            this.isRooted = valueOf;
            boolean booleanValue = valueOf.booleanValue();
            if (exec != null) {
                exec.destroy();
            }
            return booleanValue;
        } catch (Exception unused2) {
            if (process != null) {
                process.destroy();
            }
            Boolean bool3 = false;
            this.isRooted = bool3;
            return bool3.booleanValue();
        } catch (Throwable th) {
            if (process != null) {
                process.destroy();
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public String getHWV() {
        String str = this.hwv;
        if (str != null) {
            return str;
        }
        String kernelVersionThroughProcVersion = getKernelVersionThroughProcVersion();
        if (!TextUtils.isEmpty(kernelVersionThroughProcVersion)) {
            this.hwv = kernelVersionThroughProcVersion;
            return kernelVersionThroughProcVersion;
        }
        String kernelVersionThroughUName = getKernelVersionThroughUName();
        this.hwv = kernelVersionThroughUName;
        return kernelVersionThroughUName;
    }

    /* access modifiers changed from: package-private */
    public Long getTotalRAMInB() {
        RandomAccessFile randomAccessFile;
        Throwable th;
        Long l = this.totalRAMInB;
        if (l != null) {
            return l;
        }
        try {
            randomAccessFile = new RandomAccessFile("/proc/meminfo", "r");
            try {
                Matcher matcher = Pattern.compile("(\\d+)").matcher(randomAccessFile.readLine());
                String str = null;
                while (matcher.find()) {
                    str = matcher.group(1);
                }
                if (!TextUtils.isEmpty(str)) {
                    Long valueOf = Long.valueOf(Long.parseLong(str));
                    this.totalRAMInB = valueOf;
                    Utils.close(randomAccessFile);
                    return valueOf;
                }
            } catch (Exception unused) {
            } catch (Throwable th2) {
                th = th2;
                Utils.close(randomAccessFile);
                throw th;
            }
        } catch (Exception unused2) {
            randomAccessFile = null;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            randomAccessFile = null;
            th = th4;
            Utils.close(randomAccessFile);
            throw th;
        }
        Utils.close(randomAccessFile);
        return null;
    }

    /* access modifiers changed from: package-private */
    public Long getTotalDiskSpaceInMB() {
        long blockSize;
        long blockCount;
        Long l = this.totalDiskSpaceInMB;
        if (l != null) {
            return l;
        }
        try {
            if (!Utils.isExternalMemoryAvailable()) {
                return null;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            if (Build.VERSION.SDK_INT >= 18) {
                blockSize = statFs.getBlockSizeLong();
                blockCount = statFs.getBlockCountLong();
            } else {
                blockSize = (long) statFs.getBlockSize();
                blockCount = (long) statFs.getBlockCount();
            }
            Long valueOf = Long.valueOf((blockSize * blockCount) / d.fc);
            this.totalDiskSpaceInMB = valueOf;
            return valueOf;
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public Long getAvailableDiskSpaceInMB() {
        long blockSize;
        long availableBlocks;
        try {
            if (!Utils.isExternalMemoryAvailable()) {
                return null;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            if (Build.VERSION.SDK_INT >= 18) {
                blockSize = statFs.getBlockSizeLong();
                availableBlocks = statFs.getAvailableBlocksLong();
            } else {
                blockSize = (long) statFs.getBlockSize();
                availableBlocks = (long) statFs.getAvailableBlocks();
            }
            return Long.valueOf((blockSize * availableBlocks) / d.fc);
        } catch (Exception unused) {
            return null;
        }
    }

    private String getKernelVersionThroughProcVersion() {
        RandomAccessFile randomAccessFile;
        Throwable th;
        try {
            randomAccessFile = new RandomAccessFile("/proc/version", "r");
            try {
                String readLine = randomAccessFile.readLine();
                Utils.close(randomAccessFile);
                return readLine;
            } catch (Exception unused) {
                Utils.close(randomAccessFile);
                return null;
            } catch (Throwable th2) {
                th = th2;
                Utils.close(randomAccessFile);
                throw th;
            }
        } catch (Exception unused2) {
            randomAccessFile = null;
            Utils.close(randomAccessFile);
            return null;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            randomAccessFile = null;
            th = th4;
            Utils.close(randomAccessFile);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String getKernelVersionThroughUName() {
        /*
            r5 = this;
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x004c, all -> 0x003b }
            java.lang.String r2 = "uname -a"
            java.lang.Process r1 = r1.exec(r2)     // Catch:{ Exception -> 0x004c, all -> 0x003b }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0039, all -> 0x0034 }
            java.io.InputStream r3 = r1.getInputStream()     // Catch:{ Exception -> 0x0039, all -> 0x0034 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0039, all -> 0x0034 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0032, all -> 0x002d }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0032, all -> 0x002d }
            java.lang.String r0 = r3.readLine()     // Catch:{ Exception -> 0x002b, all -> 0x0029 }
            io.bidmachine.core.Utils.close(r3)
            io.bidmachine.core.Utils.close(r2)
            if (r1 == 0) goto L_0x0028
            r1.destroy()
        L_0x0028:
            return r0
        L_0x0029:
            r0 = move-exception
            goto L_0x0040
        L_0x002b:
            goto L_0x004f
        L_0x002d:
            r3 = move-exception
            r4 = r3
            r3 = r0
            r0 = r4
            goto L_0x0040
        L_0x0032:
            r3 = r0
            goto L_0x004f
        L_0x0034:
            r2 = move-exception
            r3 = r0
            r0 = r2
            r2 = r3
            goto L_0x0040
        L_0x0039:
            r2 = r0
            goto L_0x004e
        L_0x003b:
            r1 = move-exception
            r2 = r0
            r3 = r2
            r0 = r1
            r1 = r3
        L_0x0040:
            io.bidmachine.core.Utils.close(r3)
            io.bidmachine.core.Utils.close(r2)
            if (r1 == 0) goto L_0x004b
            r1.destroy()
        L_0x004b:
            throw r0
        L_0x004c:
            r1 = r0
            r2 = r1
        L_0x004e:
            r3 = r2
        L_0x004f:
            io.bidmachine.core.Utils.close(r3)
            io.bidmachine.core.Utils.close(r2)
            if (r1 == 0) goto L_0x005a
            r1.destroy()
        L_0x005a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.DeviceInfo.getKernelVersionThroughUName():java.lang.String");
    }
}
