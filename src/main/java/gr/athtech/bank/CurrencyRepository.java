package gr.athtech.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CurrencyRepository {

    private static final  List<Currency> currencyList = new ArrayList<>();
    private static int currencyCount = 0;
    static {
        currencyList.add(new Currency(1,"Indian Rupee","Rs","INR"));
        currencyList.add(new Currency(2,"American Dollar","$","USD"));
        currencyList.add(new Currency(3,"Canadian Dollar","$","CAD"));
        currencyList.add(new Currency(4, "Australian Dollar","$","AUD"));
    }
    public Currency findByCode(String code) {

        Optional<Currency> currencyOptional = currencyList
                .stream()
                .filter(element -> code.equals(element.getCode()))
                .findAny();
        if(currencyOptional.isPresent())
            return currencyOptional.get();
        return null;
    }
    public Currency findById(int id) {
        Optional<Currency> currencyOptional = currencyList.stream()
                .filter(matchId->matchId.getId()==id).findAny();
        if(currencyOptional.isPresent())
            return currencyOptional.get();
        return null;
    }
    public List<Currency> findAll() {
        return currencyList;
    }

    public Currency save(Currency currency) {
        if(currency.getId() == null)
            currency.setId(++currencyCount);
        currencyList.add(currency);
        return currency;
    }
    public Currency deleteById(int id) {
        Optional<Currency> currencyOptional = currencyList.stream().filter(matchId->matchId.getId()==id).findAny();
        if(currencyOptional.isPresent()) {
            Currency removeCurrency = currencyOptional.get();
            currencyList.remove(removeCurrency);
            return removeCurrency;
        }
        return null;
    }


}
