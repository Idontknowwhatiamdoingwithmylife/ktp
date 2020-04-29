public class Primes {
    //определяет простые числа в диапозоне от 2 до 100
    public static void main(String[] args) { 
        for (int i = 2; i < 100; i++){
            if (isPrime(i)) {
                System.out.println(i);
            }

        }

    }
    //функция IsPrime(Int n), которая определяет, является ли аргумент простым числом или нет
    public static boolean isPrime(int n){
        int chislo = 0;

        if (n == 1){
            return true;
        }

        for (int i = 2; i < n; i++) {
            if (n%i == 0) {
                chislo++;
            }

            if (chislo > 0) {
                break;
            }

        }

        return chislo == 0;
    }
}

