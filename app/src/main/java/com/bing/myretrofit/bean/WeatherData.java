package com.bing.myretrofit.bean;

import java.util.List;

/**
 * Created by RF
 * on 2017/11/28.
 */

public class WeatherData {

    /**
     * city_id : CHSH000000
     * city_name : 上海
     * future : [{"code1":"13","code2":"13","cop":"","date":"2017-11-28","day":"周二","high":"19","low":"12","text":"小雨/小雨","wind":"风力2级"},{"code1":"13","code2":"13","cop":"","date":"2017-11-29","day":"周三","high":"15","low":"9","text":"小雨/小雨","wind":"风力3级"},{"code1":"9","code2":"4","cop":"","date":"2017-11-30","day":"周四","high":"11","low":"8","text":"阴/多云","wind":"风力3级"},{"code1":"0","code2":"9","cop":"","date":"2017-12-01","day":"周五","high":"11","low":"8","text":"晴/阴","wind":"风力2级"},{"code1":"0","code2":"1","cop":"","date":"2017-12-02","day":"周六","high":"13","low":"8","text":"晴/晴","wind":"风力2级"},{"code1":"0","code2":"13","cop":"","date":"2017-12-03","day":"周日","high":"13","low":"10","text":"晴/小雨","wind":"风力2级"},{"code1":"13","code2":"13","cop":"","date":"2017-12-04","day":"周一","high":"13","low":"7","text":"小雨/小雨","wind":"风力2级"},{"code1":"13","code2":"1","cop":"","date":"2017-12-05","day":"周二","high":"11","low":"2","text":"小雨/晴","wind":"风力3级"},{"code1":"0","code2":"9","cop":"","date":"2017-12-06","day":"周三","high":"11","low":"3","text":"晴/阴","wind":"风力2级"},{"code1":"9","code2":"4","cop":"","date":"2017-12-07","day":"周四","high":"12","low":"5","text":"阴/多云","wind":"风力3级"}]
     * last_update : 2017-11-28T15:53:00+08:00
     * now : {"air_quality":{"city":{"aqi":"85","co":"0.990","last_update":"2017-11-28T13:00:00+08:00","no2":"83","o3":"62","pm10":"102","pm25":"63","quality":"良","so2":"12"}},"alarms":[],"code":"13","feels_like":"13","humidity":"78","pressure":"1021","pressure_rising":"未知","temperature":"14","text":"小雨","visibility":"4.20","wind_direction":"西","wind_scale":"0","wind_speed":"0.00"}
     * today : {"suggestion":{"car_washing":{"brief":"不宜","details":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"},"dressing":{"brief":"较舒适","details":"建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。"},"flu":{"brief":"易发","details":"天冷空气湿度大，易发生感冒，请注意适当增加衣服，加强自我防护避免感冒。"},"sport":{"brief":"较不宜","details":"有降水，推荐您在室内进行健身休闲运动；若坚持户外运动，须注意保暖并携带雨具。"},"travel":{"brief":"适宜","details":"温度适宜，又有较弱降水和微风作伴，会给您的旅行带来意想不到的景象，适宜旅游，可不要错过机会呦！"},"uv":{"brief":"最弱","details":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"}},"sunrise":"06:33 AM","sunset":"04:53 PM"}
     */

    private String city_id;
    private String city_name;
    private String last_update;
    private NowBean now;
    private TodayBean today;
    private List<FutureBean> future;

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getLast_update() {
        return last_update;
    }

    public void setLast_update(String last_update) {
        this.last_update = last_update;
    }

    public NowBean getNow() {
        return now;
    }

    public void setNow(NowBean now) {
        this.now = now;
    }

    public TodayBean getToday() {
        return today;
    }

    public void setToday(TodayBean today) {
        this.today = today;
    }

    public List<FutureBean> getFuture() {
        return future;
    }

    public void setFuture(List<FutureBean> future) {
        this.future = future;
    }

    public static class NowBean {
        /**
         * air_quality : {"city":{"aqi":"85","co":"0.990","last_update":"2017-11-28T13:00:00+08:00","no2":"83","o3":"62","pm10":"102","pm25":"63","quality":"良","so2":"12"}}
         * alarms : []
         * code : 13
         * feels_like : 13
         * humidity : 78
         * pressure : 1021
         * pressure_rising : 未知
         * temperature : 14
         * text : 小雨
         * visibility : 4.20
         * wind_direction : 西
         * wind_scale : 0
         * wind_speed : 0.00
         */

        private AirQualityBean air_quality;
        private String code;
        private String feels_like;
        private String humidity;
        private String pressure;
        private String pressure_rising;
        private String temperature;
        private String text;
        private String visibility;
        private String wind_direction;
        private String wind_scale;
        private String wind_speed;
        private List<?> alarms;

        public AirQualityBean getAir_quality() {
            return air_quality;
        }

        public void setAir_quality(AirQualityBean air_quality) {
            this.air_quality = air_quality;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getFeels_like() {
            return feels_like;
        }

        public void setFeels_like(String feels_like) {
            this.feels_like = feels_like;
        }

        public String getHumidity() {
            return humidity;
        }

        public void setHumidity(String humidity) {
            this.humidity = humidity;
        }

        public String getPressure() {
            return pressure;
        }

        public void setPressure(String pressure) {
            this.pressure = pressure;
        }

        public String getPressure_rising() {
            return pressure_rising;
        }

        public void setPressure_rising(String pressure_rising) {
            this.pressure_rising = pressure_rising;
        }

        public String getTemperature() {
            return temperature;
        }

        public void setTemperature(String temperature) {
            this.temperature = temperature;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getVisibility() {
            return visibility;
        }

        public void setVisibility(String visibility) {
            this.visibility = visibility;
        }

        public String getWind_direction() {
            return wind_direction;
        }

        public void setWind_direction(String wind_direction) {
            this.wind_direction = wind_direction;
        }

        public String getWind_scale() {
            return wind_scale;
        }

        public void setWind_scale(String wind_scale) {
            this.wind_scale = wind_scale;
        }

        public String getWind_speed() {
            return wind_speed;
        }

        public void setWind_speed(String wind_speed) {
            this.wind_speed = wind_speed;
        }

        public List<?> getAlarms() {
            return alarms;
        }

        public void setAlarms(List<?> alarms) {
            this.alarms = alarms;
        }

        public static class AirQualityBean {
            /**
             * city : {"aqi":"85","co":"0.990","last_update":"2017-11-28T13:00:00+08:00","no2":"83","o3":"62","pm10":"102","pm25":"63","quality":"良","so2":"12"}
             */

            private CityBean city;

            public CityBean getCity() {
                return city;
            }

            public void setCity(CityBean city) {
                this.city = city;
            }

            public static class CityBean {
                /**
                 * aqi : 85
                 * co : 0.990
                 * last_update : 2017-11-28T13:00:00+08:00
                 * no2 : 83
                 * o3 : 62
                 * pm10 : 102
                 * pm25 : 63
                 * quality : 良
                 * so2 : 12
                 */

                private String aqi;
                private String co;
                private String last_update;
                private String no2;
                private String o3;
                private String pm10;
                private String pm25;
                private String quality;
                private String so2;

                public String getAqi() {
                    return aqi;
                }

                public void setAqi(String aqi) {
                    this.aqi = aqi;
                }

                public String getCo() {
                    return co;
                }

                public void setCo(String co) {
                    this.co = co;
                }

                public String getLast_update() {
                    return last_update;
                }

                public void setLast_update(String last_update) {
                    this.last_update = last_update;
                }

                public String getNo2() {
                    return no2;
                }

                public void setNo2(String no2) {
                    this.no2 = no2;
                }

                public String getO3() {
                    return o3;
                }

                public void setO3(String o3) {
                    this.o3 = o3;
                }

                public String getPm10() {
                    return pm10;
                }

                public void setPm10(String pm10) {
                    this.pm10 = pm10;
                }

                public String getPm25() {
                    return pm25;
                }

                public void setPm25(String pm25) {
                    this.pm25 = pm25;
                }

                public String getQuality() {
                    return quality;
                }

                public void setQuality(String quality) {
                    this.quality = quality;
                }

                public String getSo2() {
                    return so2;
                }

                public void setSo2(String so2) {
                    this.so2 = so2;
                }
            }
        }
    }

    public static class TodayBean {
        /**
         * suggestion : {"car_washing":{"brief":"不宜","details":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"},"dressing":{"brief":"较舒适","details":"建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。"},"flu":{"brief":"易发","details":"天冷空气湿度大，易发生感冒，请注意适当增加衣服，加强自我防护避免感冒。"},"sport":{"brief":"较不宜","details":"有降水，推荐您在室内进行健身休闲运动；若坚持户外运动，须注意保暖并携带雨具。"},"travel":{"brief":"适宜","details":"温度适宜，又有较弱降水和微风作伴，会给您的旅行带来意想不到的景象，适宜旅游，可不要错过机会呦！"},"uv":{"brief":"最弱","details":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"}}
         * sunrise : 06:33 AM
         * sunset : 04:53 PM
         */

        private SuggestionBean suggestion;
        private String sunrise;
        private String sunset;

        public SuggestionBean getSuggestion() {
            return suggestion;
        }

        public void setSuggestion(SuggestionBean suggestion) {
            this.suggestion = suggestion;
        }

        public String getSunrise() {
            return sunrise;
        }

        public void setSunrise(String sunrise) {
            this.sunrise = sunrise;
        }

        public String getSunset() {
            return sunset;
        }

        public void setSunset(String sunset) {
            this.sunset = sunset;
        }

        public static class SuggestionBean {
            /**
             * car_washing : {"brief":"不宜","details":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"}
             * dressing : {"brief":"较舒适","details":"建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。"}
             * flu : {"brief":"易发","details":"天冷空气湿度大，易发生感冒，请注意适当增加衣服，加强自我防护避免感冒。"}
             * sport : {"brief":"较不宜","details":"有降水，推荐您在室内进行健身休闲运动；若坚持户外运动，须注意保暖并携带雨具。"}
             * travel : {"brief":"适宜","details":"温度适宜，又有较弱降水和微风作伴，会给您的旅行带来意想不到的景象，适宜旅游，可不要错过机会呦！"}
             * uv : {"brief":"最弱","details":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"}
             */

            private CarWashingBean car_washing;
            private DressingBean dressing;
            private FluBean flu;
            private SportBean sport;
            private TravelBean travel;
            private UvBean uv;

            public CarWashingBean getCar_washing() {
                return car_washing;
            }

            public void setCar_washing(CarWashingBean car_washing) {
                this.car_washing = car_washing;
            }

            public DressingBean getDressing() {
                return dressing;
            }

            public void setDressing(DressingBean dressing) {
                this.dressing = dressing;
            }

            public FluBean getFlu() {
                return flu;
            }

            public void setFlu(FluBean flu) {
                this.flu = flu;
            }

            public SportBean getSport() {
                return sport;
            }

            public void setSport(SportBean sport) {
                this.sport = sport;
            }

            public TravelBean getTravel() {
                return travel;
            }

            public void setTravel(TravelBean travel) {
                this.travel = travel;
            }

            public UvBean getUv() {
                return uv;
            }

            public void setUv(UvBean uv) {
                this.uv = uv;
            }

            public static class CarWashingBean {
                /**
                 * brief : 不宜
                 * details : 不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。
                 */

                private String brief;
                private String details;

                public String getBrief() {
                    return brief;
                }

                public void setBrief(String brief) {
                    this.brief = brief;
                }

                public String getDetails() {
                    return details;
                }

                public void setDetails(String details) {
                    this.details = details;
                }
            }

            public static class DressingBean {
                /**
                 * brief : 较舒适
                 * details : 建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。
                 */

                private String brief;
                private String details;

                public String getBrief() {
                    return brief;
                }

                public void setBrief(String brief) {
                    this.brief = brief;
                }

                public String getDetails() {
                    return details;
                }

                public void setDetails(String details) {
                    this.details = details;
                }
            }

            public static class FluBean {
                /**
                 * brief : 易发
                 * details : 天冷空气湿度大，易发生感冒，请注意适当增加衣服，加强自我防护避免感冒。
                 */

                private String brief;
                private String details;

                public String getBrief() {
                    return brief;
                }

                public void setBrief(String brief) {
                    this.brief = brief;
                }

                public String getDetails() {
                    return details;
                }

                public void setDetails(String details) {
                    this.details = details;
                }
            }

            public static class SportBean {
                /**
                 * brief : 较不宜
                 * details : 有降水，推荐您在室内进行健身休闲运动；若坚持户外运动，须注意保暖并携带雨具。
                 */

                private String brief;
                private String details;

                public String getBrief() {
                    return brief;
                }

                public void setBrief(String brief) {
                    this.brief = brief;
                }

                public String getDetails() {
                    return details;
                }

                public void setDetails(String details) {
                    this.details = details;
                }
            }

            public static class TravelBean {
                /**
                 * brief : 适宜
                 * details : 温度适宜，又有较弱降水和微风作伴，会给您的旅行带来意想不到的景象，适宜旅游，可不要错过机会呦！
                 */

                private String brief;
                private String details;

                public String getBrief() {
                    return brief;
                }

                public void setBrief(String brief) {
                    this.brief = brief;
                }

                public String getDetails() {
                    return details;
                }

                public void setDetails(String details) {
                    this.details = details;
                }
            }

            public static class UvBean {
                /**
                 * brief : 最弱
                 * details : 属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。
                 */

                private String brief;
                private String details;

                public String getBrief() {
                    return brief;
                }

                public void setBrief(String brief) {
                    this.brief = brief;
                }

                public String getDetails() {
                    return details;
                }

                public void setDetails(String details) {
                    this.details = details;
                }
            }
        }
    }

    public static class FutureBean {
        /**
         * code1 : 13
         * code2 : 13
         * cop :
         * date : 2017-11-28
         * day : 周二
         * high : 19
         * low : 12
         * text : 小雨/小雨
         * wind : 风力2级
         */

        private String code1;
        private String code2;
        private String cop;
        private String date;
        private String day;
        private String high;
        private String low;
        private String text;
        private String wind;

        public String getCode1() {
            return code1;
        }

        public void setCode1(String code1) {
            this.code1 = code1;
        }

        public String getCode2() {
            return code2;
        }

        public void setCode2(String code2) {
            this.code2 = code2;
        }

        public String getCop() {
            return cop;
        }

        public void setCop(String cop) {
            this.cop = cop;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
        }

        public String getHigh() {
            return high;
        }

        public void setHigh(String high) {
            this.high = high;
        }

        public String getLow() {
            return low;
        }

        public void setLow(String low) {
            this.low = low;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getWind() {
            return wind;
        }

        public void setWind(String wind) {
            this.wind = wind;
        }
    }
}
