package Practice1_com.example.Practice1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="frostingType",havingValue = "chocolate")
public class ChocolateFrosting implements Frosting{

    @Override
    public String getFrostingType() {
        return "Chocolate Frosting";
    }
}
