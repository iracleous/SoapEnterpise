package gr.athtech.bank.services;

import gr.athtech.bank.models.Currency;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public interface CurrencyService {
    @WebMethod
    Currency getCurrencyById(int id);

    @WebMethod
    Currency findByCode(String code);

    @WebMethod
    List<Currency> getAllCurrencies();

    @WebMethod
    Currency save(Currency currency);

    @WebMethod
    Currency deleteById(int id);
}