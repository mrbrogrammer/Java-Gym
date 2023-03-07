package en.codegym.task.pro.task09.task0912;

/* 
URL validation
*/

public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.us", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domainExtension = checkDomainExtension(url);

            System.out.println("URL address: " + url + ", network protocol - " + protocol + ", domain extension - " + domainExtension);
        }
    }

    public static String checkProtocol(String url) {
        //write your code here
        boolean isCorrectProtocol = url.startsWith("http") || url.startsWith("https");
        if (isCorrectProtocol){
            String[] values = url.split(":");
            return values[0];
        }
        return "unknown";
    }

    public static String checkDomainExtension(String url) {
        //write your code here
        boolean isCorrectDomain = url.endsWith("com") || url.endsWith("org" ) || url.endsWith("us") ||  url.endsWith("cc") ||  url.endsWith("net");
        if (isCorrectDomain){
            String[] values = url.split("\\.");
            return values[1];
        }
        return "unknown";
    }
}
