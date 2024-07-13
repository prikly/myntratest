package f;

import java.net.HttpURLConnection;
import java.net.URLConnection;

public enum d {
    Get("GET"),
    Post("POST");
    

    /* renamed from: a  reason: collision with root package name */
    public final String f7414a;

    private d(String str) {
        this.f7414a = str;
    }

    public void a(URLConnection uRLConnection) {
        if (uRLConnection instanceof HttpURLConnection) {
            ((HttpURLConnection) uRLConnection).setRequestMethod(this.f7414a);
        }
    }
}
