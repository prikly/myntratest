package com.squareup.tape;

import com.squareup.tape.ObjectQueue;
import com.squareup.tape.Task;

public class TaskQueue<T extends Task> implements ObjectQueue<T> {
    private final ObjectQueue<T> delegate;
    private final TaskInjector<T> taskInjector;

    public TaskQueue(ObjectQueue<T> objectQueue) {
        this(objectQueue, (TaskInjector) null);
    }

    public TaskQueue(ObjectQueue<T> objectQueue, TaskInjector<T> taskInjector2) {
        this.delegate = objectQueue;
        this.taskInjector = taskInjector2;
    }

    public T peek() {
        TaskInjector<T> taskInjector2;
        T t = (Task) this.delegate.peek();
        if (!(t == null || (taskInjector2 = this.taskInjector) == null)) {
            taskInjector2.injectMembers(t);
        }
        return t;
    }

    public int size() {
        return this.delegate.size();
    }

    public void add(T t) {
        this.delegate.add(t);
    }

    public void remove() {
        this.delegate.remove();
    }

    public void setListener(final ObjectQueue.Listener<T> listener) {
        if (listener != null) {
            this.delegate.setListener(new ObjectQueue.Listener<T>() {
                public void onAdd(ObjectQueue<T> objectQueue, T t) {
                    listener.onAdd(TaskQueue.this, t);
                }

                public void onRemove(ObjectQueue<T> objectQueue) {
                    listener.onRemove(TaskQueue.this);
                }
            });
        } else {
            this.delegate.setListener((ObjectQueue.Listener) null);
        }
    }
}
