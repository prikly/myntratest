package com.onesignal;

import com.onesignal.FocusTimeController;
import com.onesignal.influence.domain.OSInfluence;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

class OSFocusTimeProcessorFactory {
    private final HashMap<String, FocusTimeController.FocusTimeProcessorBase> focusTimeProcessors;

    public OSFocusTimeProcessorFactory() {
        HashMap<String, FocusTimeController.FocusTimeProcessorBase> hashMap = new HashMap<>();
        this.focusTimeProcessors = hashMap;
        hashMap.put(FocusTimeController.FocusTimeProcessorUnattributed.class.getName(), new FocusTimeController.FocusTimeProcessorUnattributed());
        this.focusTimeProcessors.put(FocusTimeController.FocusTimeProcessorAttributed.class.getName(), new FocusTimeController.FocusTimeProcessorAttributed());
    }

    /* access modifiers changed from: package-private */
    public FocusTimeController.FocusTimeProcessorBase getTimeProcessorSaved() {
        FocusTimeController.FocusTimeProcessorBase attributedProcessor = getAttributedProcessor();
        for (OSInfluence influenceType : attributedProcessor.getInfluences()) {
            if (influenceType.getInfluenceType().isAttributed()) {
                return attributedProcessor;
            }
        }
        return getUnattributedProcessor();
    }

    /* access modifiers changed from: package-private */
    public FocusTimeController.FocusTimeProcessorBase getTimeProcessorWithInfluences(List<OSInfluence> list) {
        boolean z;
        Iterator<OSInfluence> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().getInfluenceType().isAttributed()) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            return getAttributedProcessor();
        }
        return getUnattributedProcessor();
    }

    private FocusTimeController.FocusTimeProcessorBase getAttributedProcessor() {
        return this.focusTimeProcessors.get(FocusTimeController.FocusTimeProcessorAttributed.class.getName());
    }

    private FocusTimeController.FocusTimeProcessorBase getUnattributedProcessor() {
        return this.focusTimeProcessors.get(FocusTimeController.FocusTimeProcessorUnattributed.class.getName());
    }
}
