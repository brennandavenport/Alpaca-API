package com.brennan;

import static com.brennan.orders.Orders.*; //Imports all static methods from this class
import com.brennan.positions.Positions;

import io.github.cdimascio.dotenv.Dotenv;

import com.brennan.account.Account;
import com.brennan.json.account.AccountJson;
import com.brennan.json.orders.create_order.CreateOrderJsonResponse;
import com.brennan.json.positions.get_all_positions.PositionsJson;


public class App {
    public static void main(String[] args) throws Exception {
        // AccountJson getAccountJson = Account.getAccount();
        
        // System.out.println(getAccountJson.toString());

        // System.out.println("**************************************************************");
        
        Dotenv dotenv = Dotenv.configure()
            .directory("/Users/brennandavenport/Downloads/Alpaca API 1/alpaca")
            .filename(".env")
            .load();

        String stringApi = dotenv.get("API_KEY");

        System.out.println(stringApi);

        // String api = System.getenv("API_KEY");
        // System.out.println(api);
        
        // Thread.sleep(10000);
        // PositionsJson position = Positions.getPositionById(orderJson.getAsset_id());
        // System.out.println(position.toString());

        // Thread.sleep(2000);
        // int status = Positions.closePositionById(position.getAsset_id());
        // System.out.println(status);
        // int status = Orders.deleteOrderById(orderJson.getId());
        // System.out.println(status);
        // Thread.sleep(2000);
        // PositionsJson[] positions = Positions.getAllPositions();

        // for (PositionsJson position : positions) {
        //     System.out.println(position);
        //     System.out.println("**************************************************************");
        // }

        // int positionStatus = Positions.closeAllPositions();
        // System.out.println(positionStatus);

        // Thread.sleep(1000);
        // for (PositionsJson position : positions) {
        //     System.out.println(position);
        //     System.out.println("**************************************************************");
        // }


        // GetAllOrdersJsonResponse[] getAllOrders = Orders.getAllOrders();
        // int i = 1;
        // for (GetAllOrdersJsonResponse order : getAllOrders) {
            
        //     GetOrderByIdResponseJson orderByIdJson = Orders.getOrderById(order.getId());
        //     System.out.println("-----------------Order " + i+"-------------------");
        //     System.out.println(orderByIdJson.getSymbol());
        //     System.out.println(orderByIdJson.getId());
        //     System.out.println(orderByIdJson.getCreated_at());
        //     i++;
        // }
        
        

       // HttpResponse<String> latestBitcoinPrice = httpClient.send(getBitcoinPrice, BodyHandlers.ofString());

        //BitcoinTradePrice bitcoinPrice = gson.fromJson(latestBitcoinPrice.body(), BitcoinTradePrice.class);

       // System.out.println(bitcoinPrice.getTrades().getBTC_USD().getP());
        // while (true) {
        //     HttpResponse<String> latestTradePrice = httpClient.send(getLatestTradePrice, BodyHandlers.ofString());

        //     LatestTradePrice tradePrice = gson.fromJson(latestTradePrice.body(), LatestTradePrice.class);
    
        //     System.out.println(tradePrice.getSymbol());
        //     System.out.println(tradePrice.getTrade().getP());
        //     System.out.println(tradePrice.getTrade().getT());
        //     System.out.flush();
        //     Thread.sleep(1000);
        //     System.out.print("\033[2J\033[1;1H");
        // }
    }
}
