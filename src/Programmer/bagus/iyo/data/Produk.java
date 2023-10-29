package Programmer.bagus.iyo.data;

  public class Produk {

     public String name;
     public int price;

     public Produk (String name, int price){
         this.name = name;
         this.price = price;
     }

     public String toString (){
         return "Produk name:" + name + ", price: " + price;
     }


      @Override
      public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;

          Produk produk = (Produk) o;

          if (price != produk.price) return false;
          return name != null ? name.equals(produk.name) : produk.name == null;
      }

      @Override
      public int hashCode() {
          int result = name != null ? name.hashCode() : 0;
          result = 31 * result + price;
          return result;
      }
  }
