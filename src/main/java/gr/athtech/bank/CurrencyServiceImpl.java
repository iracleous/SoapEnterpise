package gr.athtech.bank;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.List;

@WebService(endpointInterface = "gr.athtech.bank.CurrencyService")
public class CurrencyServiceImpl implements CurrencyService{
    private static CurrencyRepository currencyDao;
    static {
        currencyDao = new CurrencyRepository();
    }

    @WebMethod
    public Currency getCurrencyById(int id) {
        return currencyDao.findById(id);
    }

    @WebMethod
    public Currency findByCode(String code) {
        return currencyDao.findByCode(code);
    }

    @WebMethod
    public List<Currency> getAllCurrencies() {
        return currencyDao.findAll();
    }

    @WebMethod
    public Currency save(Currency currency) {
        return currencyDao.save(currency);
    }

    @WebMethod
    public Currency deleteById(int id) {
        return currencyDao.deleteById(id);
    }
}
