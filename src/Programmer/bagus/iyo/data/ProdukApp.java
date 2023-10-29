package Programmer.bagus.iyo.data;

public class ProdukApp {
    public static void main(String[] args) {

        Produk produk = new Produk( "laptop", 223232);
        System.out.println(produk.name);
        System.out.println(produk.price);
        System.out.println(produk);

        Produk produk2 = new Produk( "laptop", 223232);
        System.out.println(produk.equals(produk2) );
        System.out.println(produk.hashCode() == produk2.hashCode());
    }
}
