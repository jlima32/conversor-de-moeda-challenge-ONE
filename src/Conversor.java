import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class Conversor {
    @SerializedName("conversion_rates")
    private Map<String, Double> conversionRates;

    public Map<String, Double> getConversionRates() {
        return conversionRates;
    }

}
