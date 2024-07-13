package io.bidmachine;

import android.net.Uri;
import android.text.TextUtils;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class UrlProvider {
    private static final Queue<String> AUCTION_URL_QUEUE = new ConcurrentLinkedQueue();
    private static final String DEF_BASE_URL = "https://api.bidmachine.io";
    private static final String[] DEF_BASE_URLS = {DEF_BASE_URL, "https://x.everestop.io", "https://x.blueduckredapple.com", "https://x.thecatmachine.com"};
    private static final Queue<String> INIT_URL_QUEUE = new ConcurrentLinkedQueue();
    private static final String PATH_AUCTION = "auction";
    private static final String PATH_INIT = "init";
    private static final String PATH_RTB = "rtb";
    private static final String PATH_V3 = "v3";
    /* access modifiers changed from: private */
    public static String auctionUrlFromInit;
    /* access modifiers changed from: private */
    public static String auctionUrlFromSuccessRequest;

    static {
        setupUrls();
    }

    static void setEndpoint(String str) {
        if (!Utils.isUrlValid(str)) {
            Logger.logError(String.format("Endpoint has an invalid format - %s", new Object[]{str}));
        } else if (BidMachineImpl.get().isInitializationStarted()) {
            Logger.logError("Can't change endpoint url after initialization");
        } else {
            Uri parse = Uri.parse(str);
            setInitUrl(createInitUrl(parse));
            setAuctionUrl(createAuctionUrl(parse));
        }
    }

    static Queue<String> getInitUrlQueue() {
        return new ConcurrentLinkedQueue(INIT_URL_QUEUE);
    }

    static void setInitUrl(String str) {
        if (!TextUtils.isEmpty(str)) {
            INIT_URL_QUEUE.clear();
            INIT_URL_QUEUE.add(str);
        }
    }

    static Queue<String> getAuctionUrlQueue() {
        if (!TextUtils.isEmpty(auctionUrlFromInit)) {
            return new ConcurrentLinkedQueue<String>() {
                {
                    add(UrlProvider.auctionUrlFromInit);
                }
            };
        }
        if (!TextUtils.isEmpty(auctionUrlFromSuccessRequest)) {
            return new ConcurrentLinkedQueue<String>() {
                {
                    add(UrlProvider.auctionUrlFromSuccessRequest);
                }
            };
        }
        return new ConcurrentLinkedQueue(AUCTION_URL_QUEUE);
    }

    static synchronized void setAuctionUrlFromInit(String str) {
        synchronized (UrlProvider.class) {
            if (!TextUtils.isEmpty(str)) {
                auctionUrlFromInit = str;
            }
        }
    }

    static void setAuctionUrlFromSuccessRequest(String str) {
        if (auctionUrlFromSuccessRequest == null && !TextUtils.isEmpty(str)) {
            auctionUrlFromSuccessRequest = str;
        }
    }

    static void setAuctionUrl(String str) {
        if (!TextUtils.isEmpty(str)) {
            AUCTION_URL_QUEUE.clear();
            AUCTION_URL_QUEUE.add(str);
        }
    }

    static void setupUrls() {
        setupInitUrls(INIT_URL_QUEUE, DEF_BASE_URLS);
        setupAuctionUrls(AUCTION_URL_QUEUE, DEF_BASE_URLS);
    }

    static void reset() {
        setupUrls();
        auctionUrlFromInit = null;
        auctionUrlFromSuccessRequest = null;
    }

    private static String createInitUrl(Uri uri) {
        return uri.buildUpon().appendPath(PATH_AUCTION).appendPath("init").toString();
    }

    private static String createAuctionUrl(Uri uri) {
        return uri.buildUpon().appendPath(PATH_AUCTION).appendPath(PATH_RTB).appendPath(PATH_V3).toString();
    }

    private static void setupInitUrls(Collection<String> collection, String[] strArr) {
        collection.clear();
        for (String parse : strArr) {
            collection.add(createInitUrl(Uri.parse(parse)));
        }
    }

    private static void setupAuctionUrls(Collection<String> collection, String[] strArr) {
        collection.clear();
        for (String parse : strArr) {
            collection.add(createAuctionUrl(Uri.parse(parse)));
        }
    }
}
