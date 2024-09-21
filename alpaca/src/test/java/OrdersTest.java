import static com.brennan.orders.Orders.*;
import static org.junit.jupiter.api.Assertions.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.time.Duration;

import org.junit.jupiter.api.Test;

import com.brennan.json.orders.create_order.CreateOrderJsonResponse;
import com.brennan.json.orders.get_all_orders.GetAllOrdersJsonResponse;
import com.google.gson.Gson;


public class OrdersTest {
    
    
    
    void createOrderTest() throws URISyntaxException {
        CreateOrderJsonResponse orderJson = createOrder();
        System.out.println(orderJson);
        assertEquals("accepted", orderJson.getStatus(), ()->"Order not accepted");
        // System.out.println(orderJson.getSide()); //Shows up on debug console
        // System.out.println(orderJson.getId());
        // System.out.println(orderJson.getAsset_id());
        assertTimeout(Duration.ofSeconds(10), ()-> orderJson.getStatus());
    
    }

    
    void getAllOrdersTest() throws URISyntaxException {
        GetAllOrdersJsonResponse[] orderJson = getAllOrders();
        //Add code to test
    }

    void getOrderByIdTest() throws URISyntaxException {
    }

    @Test
    void deleteAllOrdersTest(){

    }

    @Test
    void deleteOrderByIdTest() {

    }
}
