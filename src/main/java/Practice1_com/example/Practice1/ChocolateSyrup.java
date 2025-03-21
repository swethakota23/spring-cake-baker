package Practice1_com.example.Practice1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="syrupType",havingValue = "chocolate")
public class ChocolateSyrup implements  Syrup{
    @Override
    public String getSyrupType() {
        return "Chocolate Syrup";
    }
}
