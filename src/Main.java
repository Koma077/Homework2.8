import java.util.*;

public class Main {
       public static Set<Product> produktList = new HashSet<>();

       public static void printProductList(){
           for(Product product: produktList){
               System.out.println(product.getName() + " " + product.getPrice() + "руб" + product.getCount() + "кг");
           }
       }

       public static void productListAdd(Product product){
           if(!produktList.contains(product)){
               produktList.add(product);
           }else{
               throw new RuntimeException("Такой продукт уже есть в списке");
           }
       }


    }

