public class Taxes {

    public static long calculTaxes(long sous,
                                   boolean taxeFed, boolean taxePro){
        long resultat = sous;
        if (taxeFed)resultat += Math.round(sous * .05);
        if (taxePro)resultat += Math.round(sous * .09975);

        return resultat;
    }
}