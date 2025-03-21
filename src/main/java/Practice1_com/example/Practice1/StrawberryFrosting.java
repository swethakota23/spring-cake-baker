package Practice1_com.example.Practice1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="deploy.frostingType",havingValue = "strawberry")
public class StrawberryFrosting implements Frosting{
    @Override
    public String getFrostingType() {
        return "Strawberry Frosting";
    }
}
