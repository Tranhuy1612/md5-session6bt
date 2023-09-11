package ra.md5_session6.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Order {

    private Long id;
    private LocalDateTime localDateTime = LocalDateTime.now();
    private Map<Product,Integer> items = new HashMap<>();
    private double total;


    public void copyCart(Map<Product, Integer> cartItems) {
        this.items = new HashMap<>(cartItems);
    }
}
