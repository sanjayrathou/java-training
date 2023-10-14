package Exception;

//  THROW KEYWORD

public class YoungerAgeException extends RuntimeException {

    YoungerAgeException(String message){

        super(message);              //  this message GOES TO DEFAULT EXCEPTION HANDLER USING super keyword.
    }
    public static void main(String[] args) {
        int age = 5;
        try{

            if(age < 18){
                throw new YoungerAgeException("you are not eligible");
            }
        }
        catch (YoungerAgeException e){

            e.printStackTrace();

        }

    }
}
