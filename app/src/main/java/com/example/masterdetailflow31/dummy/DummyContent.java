package com.example.masterdetailflow31.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 7;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i, "https://www.google.co.uk"));
        }
        DummyItem bingItem = createDummyItem(8, "https://www.bing.com");    // 1 more, with different url
        addItem(bingItem);
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position, String url) {
//        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
        return new DummyItem(String.valueOf(position), "Item " + position + url , url, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
//        public final String content;        // boilerplate
        public final String item_name;
        public final String url;
        public final String details;        // boilerplate

//        public DummyItem(String id, String content, String details) {   // constructor??
        public DummyItem(String id, String item_name, String url, String details) {   // constructor??
            this.id = id;
//            this.content = content;
            this.details = details; // boilerplate
            this.item_name = item_name;
            this.url = url;
        }

        @Override
        public String toString() {
//            return content;
            return item_name;
        }
    }
}
