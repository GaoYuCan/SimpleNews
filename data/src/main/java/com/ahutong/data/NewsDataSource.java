package com.ahutong.data;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;

public class NewsDataSource {
    private static final String NEWS_JSON_FILE = "data.json";

    public static InputStream getNewsJson(Context context) throws IOException {
        return context.getAssets().open(NEWS_JSON_FILE);
    }

}
