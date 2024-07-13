package com.squareup.tape;

import com.squareup.tape.ObjectQueue;
import java.util.LinkedList;
import java.util.Queue;

public class InMemoryObjectQueue<T> implements ObjectQueue<T> {
    private ObjectQueue.Listener<T> listener;
    private final Queue<T> tasks = new LinkedList();

    public void add(T t) {
        this.tasks.add(t);
        ObjectQueue.Listener<T> listener2 = this.listener;
        if (listener2 != null) {
            listener2.onAdd(this, t);
        }
    }

    public T peek() {
        return this.tasks.peek();
    }

    public int size() {
        return this.tasks.size();
    }

    public void remove() {
        this.tasks.remove();
        ObjectQueue.Listener<T> listener2 = this.listener;
        if (listener2 != null) {
            listener2.onRemove(this);
        }
    }

    public void setListener(ObjectQueue.Listener<T> listener2) {
        if (listener2 != null) {
            for (T onAdd : this.tasks) {
                listener2.onAdd(this, onAdd);
            }
        }
        this.listener = listener2;
    }
}
