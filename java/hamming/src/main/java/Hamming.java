public class Hamming {
    private final String rightStrand;
    private final String leftStrand;

    public Hamming(String leftStrand, String rightStrand) {
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;

        if (leftStrand.length() != rightStrand.length()){

            if(leftStrand.isEmpty()){
                throw new IllegalArgumentException("left strand must not be empty.");
            }

            if(rightStrand.isEmpty()){
                throw new IllegalArgumentException("right strand must not be empty.");
            }
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    public int getHammingDistance() {

        if (leftStrand.equals(rightStrand)) {
            return 0;
        } else {
            int distance = 0;
            for (int i=0; i<leftStrand.length();i++){
               if (leftStrand.charAt(i) != rightStrand.charAt(i)){
                   distance++;
               }
            }
            return distance;
        }
    }
}
