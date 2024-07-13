package androidx.room;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

class InvalidationLiveDataContainer {
    private final RoomDatabase mDatabase;
    final Set<LiveData> mLiveDataSet = Collections.newSetFromMap(new IdentityHashMap());

    InvalidationLiveDataContainer(RoomDatabase roomDatabase) {
        this.mDatabase = roomDatabase;
    }
}
