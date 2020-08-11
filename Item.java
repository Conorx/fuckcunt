public class Item {
    public static void main(String[] args) {
        /*
         * Base class for items on sale in our supermarket.
         * Each item has a description, a price and some weight.
         */
        class Items {
            private String description;
            private int price;
            private int weight;

            /**
             * Constructor
             *
             * @param d description
             * @param p price (in pence)
             * @param w weight (in grams)
             */
            private Items(String d, int p, int w) {
                description = d;
                price = p;
                weight = w;
            }

            /** gets price */
            public int getPrice() {
                return price;
            }

            /** gets weight */
            public int getWeight() {
                return weight;
            }

            /** gets description*/
            public String getDescription() {
                return description;
            }

            /** compute and return the price per 100g (in pence) */
            public int pricePerUnitWeight() {
                return (int) Math.round((price / weight) * 100.0);
            }
        }
    }
}