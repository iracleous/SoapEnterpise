package gr.athtech.bank.services;

import gr.athtech.bank.models.Currency;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public interface CurrencyService {
    @WebMethod
    public Currency getCurrencyById(int id);

    @WebMethod
    public Currency findByCode(String code);

    @WebMethod
    public List<Currency> getAllCurrencies();

    @WebMethod
    public Currency save(Currency currency);

    @WebMethod
    public Currency deleteById(int id);
}