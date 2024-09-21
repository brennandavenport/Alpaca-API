import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;

import com.brennan.json.positions.get_all_positions.PositionsJson;
import com.brennan.positions.Positions;

public class PositionsTest {
    
    Positions test = new Positions();
    // @Test
    void getPositionByIdTest() throws URISyntaxException, IOException, InterruptedException {
        PositionsJson json = test.getPositionById("fc6a5dcd-4a70-4b8d-b64f-d83a6dae9ba4");
        System.out.println(json);
        assertEquals(200, json.getStatusCode());
    }

    @Test
    void closeAllPositionsTest() throws URISyntaxException, IOException, InterruptedException {
        int status = test.closeAllPositions();
        assertEquals(207, status);
    }

    void closePositionByIdTest() {

    }

    void getAllPositions() {

    }
}
