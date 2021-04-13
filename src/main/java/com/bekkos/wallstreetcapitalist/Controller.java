package com.bekkos.wallstreetcapitalist;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.io.IOException;

@RestController
public class Controller {

    @GetMapping("/test")
    public void test() throws IOException {
        Stock stock = YahooFinance.get("TSLA");
        System.out.println(stock.getQuote().getPrice());
        System.out.println("High: " + stock.getQuote().getDayHigh());
        System.out.println("Low: " + stock.getQuote().getDayLow());
    }

}
