package gr.athtech.bank;

import gr.athtech.bank.services.CurrencyServiceImpl;
import jakarta.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
            Endpoint.publish("http://localhost:7860/currencyservice", new CurrencyServiceImpl());
    }
}