package lesson01;

public class Lesson01 {
    public static void main(String[] args) {

        boolean yes = true;
        char alpha = 'V';
        byte age = 27;
        short x = 0;
        int quantity = 18;
        const long MILLION = 1000000L;
        const float PI = 3.14f;
        double coins = 0.463;
        String myName = "Victoria";

        float func1(float a, float b, float c, float d) {
            return  a * (b + (c / d));
        }

        float zx = 45.0f;
        float nb = 34.5f;
        float bg = 3.5f;
        float jd = 2.0f;

        System.out.println("Tre result of a function func1: ");
        System.out.println(func1(zx, nb, bg, jd));

        boolean func2(int a, int b) {
            if ( a+b >= 10 && a+b <= 20) return true;
            else return false;
        }

        int a = 12;
        int b = 38;
        System.out.println("The sum of a and b is between 10 and 20? ");
        System.out.println(func2(a, b));

        void func3(int number) {
            if (number >= 0) System.out.println("This number is >= 0.");
            else System.out.println("This number is less than 0.");
        }

        boolean isLessThanZero(int number) {
            if (number<0) return true;
            else return false;
        }
        void func4(String myName) {
            String message = "Привет, ";
            System.out.println(message+myName);
        }

        void func5(int year) {
            if ( year%4 == 0) {
                if (year % 100  != 0) System.out.println("високосный");
                else {
                    if (year % 400 == 0) System.out.println("високосный");
                    else System.out.println("не високосный");
                }
            } else System.out.println("не високосный");
        }
    }
}
