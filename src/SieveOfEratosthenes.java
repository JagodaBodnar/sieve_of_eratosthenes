public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Sieve sieve = new Sieve(13);
        System.out.printf("In range from 2 to 13 prime numbers are: %s%n",sieve.getPrimes());
        sieve = new Sieve(20);
        System.out.printf("In range from 2 to 20 prime numbers are: %s%n",sieve.getPrimes());
    }
}
