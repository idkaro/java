package Exercise2;

public class Check {
    public static void main(String[] args) {
        VipCustomer karo = new VipCustomer("Karo", 123, "asd");
        VipCustomer bab = new VipCustomer();
        VipCustomer sof = new VipCustomer("Sofa", 4444);

        System.out.println(bab.getCreditLimit());
        System.out.println(bab.getEmail());
        System.out.println(bab.getName());

        System.out.println(sof.getEmail());

    }
}
