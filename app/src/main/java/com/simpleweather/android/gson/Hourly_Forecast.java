package com.simpleweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/2/7.
 */

public class Hourly_Forecast {
        @SerializedName("date")
        public String hourlyForecastTime;
        @SerializedName("cond")
        public HourlyMore hourlyMore;
        @SerializedName("tmp")
        public String hourlyForecastTemp;
        public class HourlyMore{
                @SerializedName("txt")
                public String hourlyForecastInfo;
        }
}
