package com.criteo.publisher.n0;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.nio.charset.Charset;

/* compiled from: JsonSerializer */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private final Gson f2901a;

    public l(Gson gson) {
        this.f2901a = gson;
    }

    public void a(Object obj, OutputStream outputStream) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, Charset.forName("UTF-8"));
        try {
            this.f2901a.toJson(obj, (Appendable) outputStreamWriter);
            outputStreamWriter.flush();
        } catch (JsonIOException e2) {
            throw new IOException(e2);
        }
    }

    public <T> T a(Class<T> cls, InputStream inputStream) throws IOException {
        try {
            T fromJson = this.f2901a.fromJson((Reader) new InputStreamReader(inputStream, Charset.forName("UTF-8")), cls);
            if (fromJson != null) {
                return fromJson;
            }
            throw new EOFException();
        } catch (JsonParseException e2) {
            throw new IOException(e2);
        }
    }
}
