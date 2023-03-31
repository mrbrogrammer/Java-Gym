package com.codegym.task.task19.task1903;

/* 
Adapting multiple interfaces

*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("US", "United States");
        countries.put("FR", "France");
    }
    
    public static void main(String[] args) {
        IncomeDataAdapter s = new IncomeDataAdapter(new IncomeData() {
            @Override
            public String getCountryCode() {
                return "US";
            }
    
            @Override
            public String getCompany() {
                return "Apple";
            }
    
            @Override
            public String getContactFirstName() {
                return "Simphiwe";
            }
    
            @Override
            public String getContactLastName() {
                return "Madi";
            }
    
            @Override
            public int getCountryPhoneCode() {
                return 27;
            }
    
            @Override
            public int getPhoneNumber() {
                return 991234567;
            }
        });
    
        System.out.println(s.getPhoneNumber());
    }

    public static class IncomeDataAdapter implements Customer, Contact {
        private IncomeData data;
    
//        Customer customer = new Customer() {
//            @Override
//            public String getCompanyName() {
//                return data.getCompany();
//
//            }
//
//            @Override
//            public String getCountryName() {
//                return countries.get(data.getCountryCode());
//            }
//        };
        
//        Contact contact = new Contact() {
//            @Override
//            public String getName() {
//                return data.getContactFirstName() +", " + data.getContactLastName();
//            }
//
//            @Override
//            public String getPhoneNumber() {
//                return data.getPhoneNumber();
//            }
//        };
        public IncomeDataAdapter(IncomeData incomeData) {
            this.data = incomeData;
        }
        
        
        
    
        @Override
        public String getCompanyName() {
    
            return data.getCompany();
        }
    
        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }
    
        @Override
        public String getName() {
//            For example: Smith, John
    
            return data.getContactLastName()+", "+data.getContactFirstName();
    
        }
    
        @Override
        public String getPhoneNumber() {
            String number = String.valueOf(data.getPhoneNumber());
    
            String count = "";
            int stringLen = number.length();
            for (int index = 0; index < 10; index++) {
                if (stringLen != 10) {
                    count += "0";
                    stringLen++;
                }
            }
       
            number = count+number;
    
    
            String number0 = number.substring(0,3);
            String number1 = number.substring(3, 3*2);
            String number2 = number.substring(3*2, 4*2);
            String number3 = number.substring(4*2, 5*2);
            // For example: +1(099)123-45-67
    
            return String.format( "+%d(%s)%s-%s-%s", data.getCountryPhoneCode(), number0, number1, number2, number3);
    
        }
    
    }


    public static interface IncomeData {
        String getCountryCode();        // For example: US

        String getCompany();            // For example: CodeGym Ltd.

        String getContactFirstName();   // For example: John

        String getContactLastName();    // For example: Smith

        int getCountryPhoneCode();      // For example: 1

        int getPhoneNumber();           // For example: 991234567
    }

    public static interface Customer {
        String getCompanyName();        // For example: CodeGym Ltd.

        String getCountryName();        // For example: United States
    }

    public static interface Contact {
        String getName();               // For example: Smith, John

        String getPhoneNumber();
    }
}