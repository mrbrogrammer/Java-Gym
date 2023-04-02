package com.codegym.task.task19.task1905;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* 
Reinforce the adapter

*/

public class Solution {
    public static Map<String,String> countries = new HashMap<>();
    
    static {
        // Populate the countries list
        
        countries.put("UA", "Ukraine");
        countries.put("US", "United States");
        countries.put("FR", "France");
    }
    
    public static void main(String[] args) {
        DataAdapter da = new DataAdapter(
        new Customer() {
            @Override
            public String getCompanyName() {
                return "CodeGym Ltd.";
            }
    
            @Override
            public String getCountryName() {
                return "United States";
            }
        }, new Contact() {
            @Override
            public String getName() {
                return "Peterson, John";
            }
    
            @Override
            public String getPhoneNumber() {
                return "+1(111)222-3333";
            }
        });
    
    }

    public static class DataAdapter implements RowItem {
        private Customer customer;
        
        private Contact contact;
        
        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }
    
        @Override
        public String getCountryCode() {
            for (Map.Entry<String, String> pair : countries.entrySet()) {
                if (Objects.equals(pair.getValue(), customer.getCountryName())) {
                    return pair.getKey();
                }
            }
            return null;
        }
    
        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }
    
        @Override
        public String getContactFirstName() {
            return formatName()[1]; // John
        }
    
        @Override
        public String getContactLastName() {
            return formatName()[0];
        }
    

    
        @Override
        public String getDialString() {
            String number = contact.getPhoneNumber();
            
            number = number.replace("-", "");
            number = number.replace("(", "");
            number = number.replace(")", "");
    
    
            return "callto://" + number;
        }
    
    
        private String[] formatName() {
            String name = contact.getName(); // Peterson, John
            StringBuilder string = new StringBuilder();
        
            for (int index = 0; index < name.length(); index++) {
                if (name.charAt(index) < 91 && name.charAt(index) > 64){
                    string.append(name.charAt(index));
                } else if (name.charAt(index) < 123 && name.charAt(index) > 96) {
                    string.append(name.charAt(index));
                } else if (name.charAt(index) == 32) {
                    string.append(name.charAt(index));
                }
            }
            
            return string.toString().split(" "); // John
        }
    }

    public static interface RowItem {
        String getCountryCode();        // For example: US
        String getCompany();            // For example: CodeGym Ltd.
        String getContactFirstName();   // For example: John
        String getContactLastName();    // For example: Peterson
        String getDialString();         // For example: callto://+11112223333
    }

    public static interface Customer {
        String getCompanyName();        // For example: CodeGym Ltd.
        String getCountryName();        // For example: United States
    }

    public static interface Contact {
        String getName();               // For example: Peterson, John
        String getPhoneNumber();        // For example: +1(111)222-3333, +3(805)0123-4567, +380(50)123-4567, etc.
    }
}