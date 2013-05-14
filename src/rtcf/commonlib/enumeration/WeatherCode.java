package rtcf.commonlib.enumeration;

public enum WeatherCode {

    WC_395(395, "Moderate or heavy snow in area with thunder"),
    WC_392(392, "Patchy light snow in area with thunder"),
    WC_389(389, "Moderate or heavy rain in area with thunder"),
    WC_386(386, "Patchy light rain in area with thunder"),
    WC_377(377, "Moderate or heavy showers of ice pellets"),
    WC_374(374, "Light showers of ice pellets"),
    WC_371(371, "Moderate or heavy snow showers"),
    WC_368(368, "Light snow showers"),
    WC_365(365, "Moderate or heavy sleet showers"),
    WC_362(362, "Light sleet showers"),
    WC_359(359, "Torrential rain shower"),
    WC_356(356, "Moderate or heavy rain shower"),
    WC_353(353, "Light rain shower"),
    WC_350(350, "Ice pellets"),
    WC_338(338, "Heavy snow"),
    WC_335(335, "Patchy heavy snow"),
    WC_332(332, "Moderate snow"),
    WC_329(329, "Patchy moderate snow"),
    WC_326(326, "Light snow"),
    WC_323(323, "Patchy light snow"),
    WC_320(320, "Moderate or heavy sleet"),
    WC_317(317, "Light sleet"),
    WC_314(314, "Moderate or Heavy freezing rain"),
    WC_311(311, "Light freezing rain"),
    WC_308(308, "Heavy rain"),
    WC_305(305, "Heavy rain at times"),
    WC_302(302, "Moderate rain"),
    WC_299(299, "Moderate rain at times"),
    WC_296(296, "Light rain"),
    WC_293(293, "Patchy light rain"),
    WC_284(284, "Heavy freezing drizzle"),
    WC_281(281, "Freezing drizzle"),
    WC_266(266, "Light drizzle"),
    WC_263(263, "Patchy light drizzle"),
    WC_260(260, "Freezing fog"),
    WC_248(248, "Fog"),
    WC_230(230, "Blizzard"),
    WC_227(227, "Blowing snow"),
    WC_200(200, "Thundery outbreaks in nearby"),
    WC_185(185, "Patchy freezing drizzle nearby"),
    WC_182(182, "Patchy sleet nearby"),
    WC_179(179, "Patchy snow nearby"),
    WC_176(176, "Patchy rain nearby"),
    WC_143(143, "Mist"),
    WC_122(122, "Overcast"),
    WC_119(119, "Cloudy"),
    WC_116(116, "Partly Cloudy"),
    WC_113(113, "Clear/Sunny");

    private WeatherCode(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getdescription() {
        return description;
    }

    public int getCode() {
        return code;
    }
    private int code = 0;
    private String description;
}
