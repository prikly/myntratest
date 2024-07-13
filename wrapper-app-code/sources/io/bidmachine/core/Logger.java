package io.bidmachine.core;

import android.util.Log;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.Map;

public class Logger {
    private static final int MAX_CHAR_COUNT = 1000;
    private static final String TAG = "BidMachineLog";
    private static boolean isLoggingEnabled = false;
    private static LoggerMessageBuilder messageBuilder = new RegularMessageBuilder();

    public interface LoggerMessageBuilder {
        String buildMessage(String str);
    }

    public static void setLoggingEnabled(boolean z) {
        isLoggingEnabled = z;
    }

    public static boolean isLoggingEnabled() {
        return isLoggingEnabled;
    }

    public static void setMessageBuilder(LoggerMessageBuilder loggerMessageBuilder) {
        messageBuilder = loggerMessageBuilder;
    }

    public static void log(Throwable th) {
        if (isLoggingEnabled) {
            sendWarning(th);
        }
    }

    public static void logError(String str, String str2) {
        logError(String.format("[%s] %s", new Object[]{str, str2}));
    }

    public static void logError(String str) {
        log(str, true);
    }

    public static void log(String str, String str2) {
        log(String.format("[%s] %s", new Object[]{str, str2}));
    }

    public static void log(String str) {
        log(str, false);
    }

    public static void log(String str, boolean z) {
        if (!isLoggingEnabled) {
            return;
        }
        if (str.length() > 1000) {
            int length = ((str.length() + 1000) - 1) / 1000;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1000;
                sendLog(str.substring(i2, Math.min(str.length(), i3)), z);
                i++;
                i2 = i3;
            }
            return;
        }
        sendLog(str, z);
    }

    public static void log(String str, Map<?, ?> map) {
        if (isLoggingEnabled) {
            StringBuilder sb = new StringBuilder();
            if (map == null || map.isEmpty()) {
                sb.append("Empty");
            } else {
                for (Map.Entry next : map.entrySet()) {
                    if (sb.length() > 0) {
                        sb.append("\n");
                    }
                    String str2 = null;
                    if (next.getValue() instanceof Collection) {
                        StringBuilder sb2 = new StringBuilder();
                        for (Object next2 : (Collection) next.getValue()) {
                            if (next2 != null) {
                                if (sb2.length() > 0) {
                                    sb2.append(",");
                                }
                                sb2.append(next2);
                            }
                        }
                        if (sb2.length() == 0) {
                            sb2.append("Empty");
                        }
                        str2 = sb2.toString();
                    } else if (next.getValue() != null) {
                        str2 = next.getValue().toString();
                    }
                    sb.append(next.getKey());
                    sb.append(": ");
                    sb.append(str2);
                }
            }
            sb.insert(0, "\n").insert(0, str);
            sendLog(sb.toString(), false);
        }
    }

    private static void sendLog(String str, boolean z) {
        String buildMessage = messageBuilder.buildMessage(str);
        if (z) {
            Log.e(TAG, buildMessage);
        } else {
            Log.d(TAG, buildMessage);
        }
    }

    private static void sendWarning(Throwable th) {
        if (th instanceof UnknownHostException) {
            th.printStackTrace();
        } else {
            Log.w(TAG, th);
        }
    }

    private static final class RegularMessageBuilder implements LoggerMessageBuilder {
        public String buildMessage(String str) {
            return str;
        }

        private RegularMessageBuilder() {
        }
    }
}
