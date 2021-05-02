package LeetCode;

public class Defanging_an_IP_Address {
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }

    public static void main(String[] args) {
        Defanging_an_IP_Address ip = new Defanging_an_IP_Address();
        System.out.println(ip.defangIPaddr("1.1.1.1"));
    }
}
