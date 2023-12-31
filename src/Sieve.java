import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Sieve {
    private int maxPrime;

    Sieve(int maxPrime) {
        this.maxPrime = maxPrime;
    }

    List<Integer> getPrimes() {
        int[] sieve = new int[maxPrime + 1];
        List<Integer> listOfPrimes = new ArrayList<>();
        Arrays.fill(sieve, 2, maxPrime+1, 1);
        int j;
        for(int i=2; (i*i) < maxPrime; i++){
            if(sieve[i]==1){
                j= 2 * i;
                while(j <= maxPrime){
                    sieve[j] = 0;
                    j += i;
                }
            }
        }
        for(int i=0; i < sieve.length; i++){
            if(sieve[i] == 1){
                listOfPrimes.add(i);
            }
        }
        return listOfPrimes;
    }
}