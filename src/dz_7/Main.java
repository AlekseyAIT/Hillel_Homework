package dz_7;

public class Main {
    public static void main(String[] args) {
        genericMethod(1);
        genericMethod("ad");
        genericMethod('c');
        genericMethod(false);
        genericMethod(0.28);

        enumMethod(Months.APRIL);
        enumMethod(Months.NOVEMBER);
        enumMethod(Months.JANUARY);
        enumMethod(Months.AUGUST);
    }

    public static <T> void genericMethod(T a) {
        System.out.println(a.toString());
    }

    public static void enumMethod(Months o) {
        switch (o) {
            case JANUARY:
            case DECEMBER:
            case FEBRUARY:
                System.out.println(o + " is a month of Winter!");
                break;

            case MARCH:
            case MAY:
            case APRIL:
                System.out.println(o + " is a month of Spring!");
                break;

            case JUNE:
            case JULY:
            case AUGUST:
                System.out.println(o + " is a month of Summer!");
                break;

            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                System.out.println(o + " is a month of Autumn!");
                break;

            default:
                System.out.println();

        }
    }
}
