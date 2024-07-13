package io.bidmachine.utils;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import android.text.TextUtils;
import io.bidmachine.core.Utils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BluetoothUtils {
    private static boolean isRegistered = false;
    private static final BluetoothProfile.ServiceListener listener = new BluetoothProfile.ServiceListener() {
        public void onServiceDisconnected(int i) {
        }

        public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
            BluetoothUtils.proxyMap.put(Integer.valueOf(i), bluetoothProfile);
        }
    };
    private static final int[] profileArray = {1};
    /* access modifiers changed from: private */
    public static final Map<Integer, BluetoothProfile> proxyMap = new HashMap(profileArray.length);

    public static void register(Context context) {
        if (context != null && context.getApplicationContext() != null && !isRegistered && Utils.isPermissionGranted(context, "android.permission.BLUETOOTH")) {
            try {
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                if (defaultAdapter != null) {
                    for (int profileProxy : profileArray) {
                        defaultAdapter.getProfileProxy(context.getApplicationContext(), listener, profileProxy);
                    }
                    isRegistered = true;
                }
            } catch (Exception unused) {
            }
        }
    }

    public static Boolean isHeadsetConnected(Context context) {
        if (!Utils.isPermissionGranted(context, "android.permission.BLUETOOTH")) {
            return null;
        }
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            boolean z = true;
            if ((defaultAdapter != null ? defaultAdapter.getProfileConnectionState(1) : -1) != 2) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Set<String> getConnectedHeadsets(Context context) {
        return getConnectedDevices(context, 1);
    }

    private static Set<String> getConnectedDevices(Context context, Integer num) {
        BluetoothProfile bluetoothProfile;
        HashSet hashSet = null;
        if (!Utils.isPermissionGranted(context, "android.permission.BLUETOOTH")) {
            return null;
        }
        try {
            if (BluetoothAdapter.getDefaultAdapter() == null) {
                return null;
            }
            HashSet hashSet2 = new HashSet();
            try {
                for (Map.Entry next : proxyMap.entrySet()) {
                    if ((num == null || ((Integer) next.getKey()).equals(num)) && (bluetoothProfile = (BluetoothProfile) next.getValue()) != null) {
                        for (BluetoothDevice name : bluetoothProfile.getConnectedDevices()) {
                            String name2 = name.getName();
                            if (!TextUtils.isEmpty(name2)) {
                                hashSet2.add(name2);
                            }
                        }
                    }
                }
                return hashSet2;
            } catch (Exception unused) {
                hashSet = hashSet2;
                return hashSet;
            }
        } catch (Exception unused2) {
            return hashSet;
        }
    }
}
