import java.util.ArrayList;
public class Cart {
    ArrayList<Cartitem> cartitemArrayList;
    public Cart(){
        cartitemArrayList = new ArrayList<>();
    }
    public void add(Cartitem cartitem){
        cartitemArrayList.add(cartitem);
    }
    public void print(){
        double total = 0;
        System.out.println("商品"+"\t"+"单价"+"\t"+"数量"+"\t"+"总价");
        System.out.println("----------------------");
        for(Cartitem cartitem : cartitemArrayList){
            Goods goods = cartitem.getGoods();
            String name = goods.getName();
            double price = goods.getPrice();
            int count = cartitem.getCount();
            total += price*count;
            System.out.println(name + "\t" + String.format("%.2f",price) + "\t" + count + "\t" );
        }
        System.out.println("----------------------");
        System.out.println("\t\t 合计：" + String.format("%.2f",total));

    }
}
