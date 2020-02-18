public class CalculTaxes {

    public static long calculerTaxes(long sous,
                              boolean taxeProv, boolean taxeFed) throws IllegalArgumentException{

        long total = sous;
        if (sous <= 0) {
            throw new IllegalArgumentException();
        }else{
            if (taxeProv){
                total += Math.round(sous * 0.09975);
            }
            if (taxeFed){
                total += Math.round(sous * 0.05);
            }
        }

        return total;
    }


}
