package okhttp3.internal.platform;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import okhttp3.internal.Util;

final class Jdk9Platform extends Platform {
    final Method getProtocolMethod;
    final Method setProtocolMethod;

    Jdk9Platform(Method method, Method method2) {
        this.setProtocolMethod = method;
        this.getProtocolMethod = method2;
    }

    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> alpnProtocolNames = alpnProtocolNames(list);
            this.setProtocolMethod.invoke(sSLParameters, new Object[]{alpnProtocolNames.toArray(new String[alpnProtocolNames.size()])});
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw Util.assertionError("unable to set ssl parameters", e2);
        }
    }

    public String getSelectedProtocol(SSLSocket sSLSocket) {
        try {
            String str = (String) this.getProtocolMethod.invoke(sSLSocket, new Object[0]);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw Util.assertionError("unable to get selected protocols", e2);
        }
    }

    public static Jdk9Platform buildIfSupported() {
        try {
            return new Jdk9Platform(SSLParameters.class.getMethod("setApplicationProtocols", new Class[]{String[].class}), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }
}
