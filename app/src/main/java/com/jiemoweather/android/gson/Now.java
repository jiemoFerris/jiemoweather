package com.jiemoweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ferris on 2018/6/3.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
