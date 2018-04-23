package level_19.lesson_3.task_5;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ivan Korol on 4/23/2018
 */
public class Solution {
    public static Map<String,String> countries = new HashMap<String,String>();
    static {
        countries.put("UA","Ukraine");
        countries.put("RU","Russia");
        countries.put("CA","Canada");
    }

    public static void main(String[] args) {

    }

    public static class DataAdapter implements RowItem{
        private Customer customer;
        private Contact contact;
        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }

        @Override
        public String getCountryCode() {
            String res = null;
            for(Map.Entry<String, String> pair: countries.entrySet()) {
                if(pair.getValue().equals(customer.getCountryName())) {
                    res = pair.getKey();
                    break;
                }
            }
            return  res;
        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            String[] firstName = contact.getName().split(", ");
            return firstName[1];
        }

        @Override
        public String getContactLastName() {
            String[] lastName = contact.getName().split(", ");
            return lastName[2];
        }

        @Override
        public String getDialString() {
            return "callto://" + contact.getPhoneNumber().replaceAll("[()-]","");
        }
    }

    public static interface RowItem {
        String getCountryCode();        //example UA
        String getCompany();            //example JavaRush Ltd.
        String getContactFirstName();   //example Ivan
        String getContactLastName();    //example Ivanov
        String getDialString();         //example callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.
        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan
        String getPhoneNumber();        //example +38(050)123-45-67
    }
}
