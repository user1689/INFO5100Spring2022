import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("qq", 1000);
        Car c2 = new Car("zz", 2000);
        Car c3 = new Car("fll", 5000);
        Car c4 = new Car("bmm", 200);

        Car[] cars = new Car[]{c1, c2, c3, c4};

//        Comparator<Car> cmp = new Comparator<Car>(){
//                @Override
//                public int compare(Car c1, Car c2) {
//                    return c1.getPrice() - c2.getPrice();
//            }
//        };
//        Arrays.sort(cars, cmp);


//        Arrays.sort(cars, new Comparator<Car>() {
//            @Override
//            public int compare(Car o1, Car o2) {
//                return o2.getName().compareTo(o1.getName());
//            }
//        });

//        Arrays.sort(cars, new Comparator<Car>() {
//            @Override
//            public int compare(Car c1, Car c2) {
//                return Integer.compare(c1.getPrice(), c2.getPrice());
//            }
//        });

//        Comparator<Car> cmp = (a, b) -> (a.getName().compareTo(b.getName()));
//        Arrays.sort(cars, (Car car1, Car car2) -> (car1.getPrice() - car2.getPrice()));
//        Arrays.sort(cars, cmp);

        Comparator<Car> cmp = generateCmp(false);
        Arrays.sort(cars, cmp);
        printCar(cars);

    }

    public static void printCar(Car[] cars) {
        for (Car cc : cars) {
            System.out.println(cc.getName());
        }
    }

    public static Comparator<Car> generateCmp(boolean descend) {
        if (descend) {
            return (a, b) -> (b.getPrice() - a.getPrice());
        } else {
            return new Comparator<Car>() {
                @Override
                public int compare(Car o1, Car o2) {
                    return o1.getPrice() - o2.getPrice();
                }
            };
        }
    }
}
