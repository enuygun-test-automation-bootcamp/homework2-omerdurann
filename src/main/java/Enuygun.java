public class Enuygun {

    public String stringFor(int number) {

        // Koşullarımız
        if (number % 15 == 0) {
            return "Enuygun";
        }else if (number % 3 == 0){
            return "En" ;
        }else if (number % 5 ==0){
            return "En" ;
        }

        return String.valueOf(number);
    }
}
