public class Cartitem {
    private Goods goods;
    private int count;

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Cartitem(Goods goods, int count) {
        this.goods = goods;
        this.count = count;
    }
}
