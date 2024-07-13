package com.criteo.publisher.context;

public class ContextData extends AbstractContextData<ContextData> {
    public static final String CONTENT_URL = "content.url";

    public boolean equals(Object obj) {
        if (!(obj instanceof ContextData)) {
            return false;
        }
        return super.equals(obj);
    }
}
