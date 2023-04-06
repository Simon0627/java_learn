public class Main {
    public static void main(String[] args) {
        Goods g0 = new Goods("牙膏" ,21.10);
        Goods g1 = new Goods("牙刷",12.88);
        Goods g2 = new Goods("手机",2100.99);
        Goods g3 = new Goods("香皂",2.12);
        Goods g4 = new Goods("毛巾",2.4);
        Cart cart = new Cart();
        cart.add(new Cartitem(g0,1));
        cart.add(new Cartitem(g1,3));
        cart.add(new Cartitem(g2,1));
        cart.add(new Cartitem(g3,2));
        cart.add(new Cartitem(g4,5));
        cart.print();
    }
}
