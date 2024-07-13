package com.squareup.tape;

import com.squareup.tape.ObjectQueue;
import com.squareup.tape.QueueFile;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileObjectQueue<T> implements ObjectQueue<T> {
    private final DirectByteArrayOutputStream bytes = new DirectByteArrayOutputStream();
    /* access modifiers changed from: private */
    public final Converter<T> converter;
    private final File file;
    private ObjectQueue.Listener<T> listener;
    private final QueueFile queueFile;

    public interface Converter<T> {
        T from(byte[] bArr) throws IOException;

        void toStream(T t, OutputStream outputStream) throws IOException;
    }

    public FileObjectQueue(File file2, Converter<T> converter2) throws IOException {
        this.file = file2;
        this.converter = converter2;
        this.queueFile = new QueueFile(file2);
    }

    public int size() {
        return this.queueFile.size();
    }

    public final void add(T t) {
        try {
            this.bytes.reset();
            this.converter.toStream(t, this.bytes);
            this.queueFile.add(this.bytes.getArray(), 0, this.bytes.size());
            if (this.listener != null) {
                this.listener.onAdd(this, t);
            }
        } catch (IOException e2) {
            throw new FileException("Failed to add entry.", e2, this.file);
        }
    }

    public T peek() {
        try {
            byte[] peek = this.queueFile.peek();
            if (peek == null) {
                return null;
            }
            return this.converter.from(peek);
        } catch (IOException e2) {
            throw new FileException("Failed to peek.", e2, this.file);
        }
    }

    public final void remove() {
        try {
            this.queueFile.remove();
            if (this.listener != null) {
                this.listener.onRemove(this);
            }
        } catch (IOException e2) {
            throw new FileException("Failed to remove.", e2, this.file);
        }
    }

    public final void close() {
        try {
            this.queueFile.close();
        } catch (IOException e2) {
            throw new FileException("Failed to close.", e2, this.file);
        }
    }

    public void setListener(final ObjectQueue.Listener<T> listener2) {
        if (listener2 != null) {
            try {
                this.queueFile.forEach(new QueueFile.ElementReader() {
                    public void read(InputStream inputStream, int i) throws IOException {
                        byte[] bArr = new byte[i];
                        inputStream.read(bArr, 0, i);
                        ObjectQueue.Listener listener = listener2;
                        FileObjectQueue fileObjectQueue = FileObjectQueue.this;
                        listener.onAdd(fileObjectQueue, fileObjectQueue.converter.from(bArr));
                    }
                });
            } catch (IOException e2) {
                throw new FileException("Unable to iterate over QueueFile contents.", e2, this.file);
            }
        }
        this.listener = listener2;
    }

    private static class DirectByteArrayOutputStream extends ByteArrayOutputStream {
        public byte[] getArray() {
            return this.buf;
        }
    }
}
