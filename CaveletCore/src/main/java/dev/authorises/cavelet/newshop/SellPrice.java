package dev.authorises.cavelet.newshop;

public enum SellPrice {
    GOLDEN_POTATO(15.5, "GOLDEN_POTATO"),
    WHEAT(8.9, "WHEAT"),
    COMPACTED_CROPS(23000.0, "COMPACTED_CROPS"),
    DUST(23000.0, "DUST"),
    BEJEWELLED_ROCK(23000.0, "BEJEWELLED_ROCK"),
    SHEEP_ESSENCE(7.0, "SHEEP_ESSENCE"),
    SKELETAL_ESSENCE(15.7, "SKELETAL_ESSENCE"),
    VINDICATOR_ESSENCE(23.6, "VINDICATOR_ESSENCE"),
    COAL(3.5, "COAL"),
    IRON(6.45, "IRON"),
    COPPER(8.0, "COPPER"),
    GOLD(13.4, "GOLD"),
    RUBY(18.2, "RUBY"),
    SAPPHIRE(28.6, "SAPPHIRE"),
    DIAMOND(100.0, "DIAMOND"),
    PROCESSED_COAL(20.0, "PROCESSED_COAL"),
    PROCESSED_IRON(25.0, "PROCESSED_IRON"),
    PROCESSED_COPPER(33.5, "PROCESSED_COPPER"),
    PROCESSED_GOLD(50.0, "PROCESSED_GOLD"),
    PROCESSED_RUBY(100.0, "PROCESSED_RUBY"),
    PROCESSED_SAPPHIRE(1000.0, "PROCESSED_SAPPHIRE"),
    PROCESSED_DIAMOND(2000.0, "PROCESSED_DIAMOND"),
    PURE_COAL(20.0, "PURE_COAL"),
    PURE_IRON(50.0, "PURE_IRON"),
    PURE_COPPER(100.0, "PURE_COPPER"),
    PURE_GOLD(200.0, "PURE_GOLD"),
    PURE_RUBY(400.0, "PURE_RUBY"),
    PURE_SAPPHIRE(4000.0, "PURE_SAPPHIRE"),
    PURE_DIAMOND(10000.0, "PURE_DIAMOND");
    public final Double priceEach;
    public final String itemId;

    SellPrice(Double priceEach, String itemId){
        this.priceEach = priceEach;
        this.itemId = itemId;
    }

}