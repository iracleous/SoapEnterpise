package gr.athtech.bank.services;

import gr.athtech.bank.models.Currency;
import gr.athtech.bank.repositories.CurrencyRepository;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.List;

@WebService(endpointInterface = "gr.athtech.bank.services.CurrencyService")
public class CurrencyServiceImpl implements CurrencyService{
    private static final CurrencyRepository currencyDao;
    static {
        currencyDao = new CurrencyRepository();
    }

    @WebMethod
    @Override
    public Currency getCurrencyById(int id) {
        return currencyDao.findById(id);
    }

    @WebMethod
    @Override
    public Currency findByCode(String code) {
        return currencyDao.findByCode(code);
    }

    @WebMethod
    @Override
    public List<Currency> getAllCurrencies() {
        return currencyDao.findAll();
    }

    @WebMethod
    @Override
    public Currency save(Currency currency) {
        return currencyDao.save(currency);
    }

    @WebMethod
    @Override
    public Currency deleteById(int id) {
        return currencyDao.deleteById(id);
    }
}
