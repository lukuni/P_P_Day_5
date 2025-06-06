/**
 * Бараа бүтээгдэхүүнийг илэрхийлэх класс.
 */
public class Product {
    /** Барааны нэр */
    private String name;

    /** Барааны үнэ */
    private double price;

    /** Барааны тоо хэмжээ */
    private int quantity;

    /** Барааны ангилал */
    private String category;

    /** Барааны шошгын код (Barcode) */
    private String barcode;

    /**
     * Product объектыг үүсгэнэ.
     * 
     * @param name     Барааны нэр
     * @param price    Барааны үнэ
     * @param quantity Барааны тоо хэмжээ
     * @param category Барааны ангилал
     * @param barcode  Барааны шошгын код
     */
    public Product(String name, double price, int quantity, String category, String barcode) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.barcode = barcode;
    }

    /**
     * Барааны мэдээллийг текст хэлбэрээр буцаана.
     * 
     * @return Барааны нэр, үнэ, тоо хэмжээ, ангилал болон баркодыг агуулсан текст
     */
    @Override
    public String toString() {
        return name + " (" + price + "₮) x" + quantity + " [" + category + "] Barcode: " + barcode;
    }
}
