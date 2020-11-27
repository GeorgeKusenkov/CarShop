public enum Color {

    БЕЛЫЙ, ЗЕЛЕНЫЙ, ЧЕРНЫЙ, СИНИЙ, ЖЕЛТЫЙ, КРАСНЫЙ, ОРАНЖЕВЫЙ;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
