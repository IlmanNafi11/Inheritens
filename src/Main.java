public class Main {
    public static void main(String[] args) throws Exception {
        Aksesoris aksesoris = new Aksesoris("AKS-001", "Casing", 15000, 5, "Aksesoris", "Redmi 9C");
        aksesoris.displayDetail();
        System.out.println();
        Elektronik elektronik = new Elektronik("ELK-001", "Samsung Tab 10", 1000000, 2, "Elektronik", "Tablet");
        elektronik.displayDetail();
        System.out.println();
        Pulsa pulsa = new Pulsa("PLS-001", "Paket Data 4GB", 35000, 5, "Paket Data", "Telkomsel");
        pulsa.displayDetail();
    }
}
