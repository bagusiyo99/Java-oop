package Programmer.bagus.iyo.util;

import Programmer.bagus.iyo.data.LoginRequest;
import Programmer.bagus.iyo.error.BlankException;
import Programmer.bagus.iyo.error.ValidationException;

public class ValadationUtil {

    public static void validate (LoginRequest loginRequest ) throws ValidationException, NullPointerException {
//       if (loginRequest.username() == null){
//           throw  new ValidationException("Usertname Is null");
//       } else if (loginRequest.username().isBlank()){
//           throw  new ValidationException("Usertname Is blank");
//       }else if (loginRequest.password() == null){
//           throw  new ValidationException("password Is null");
//       }else if (loginRequest.password().isBlank()){
//           throw  new ValidationException("password Is blank");
//       }

        if (loginRequest.username() == null){
            throw  new NullPointerException("Usertname Is null");
        } else if (loginRequest.username().isBlank()){
            throw  new ValidationException("Usertname Is blank");
        }else if (loginRequest.password() == null){
            throw  new NullPointerException("password Is null");
        }else if (loginRequest.password().isBlank()){
            throw  new ValidationException("password Is blank");
        }
    }


    public static void validateRuntime (LoginRequest loginRequest )  {


        if (loginRequest.username() == null){
            throw  new NullPointerException("Usertname Is null");
        } else if (loginRequest.username().isBlank()){
            throw  new BlankException("Usertname Is blank");
        }else if (loginRequest.password() == null){
            throw  new NullPointerException("password Is null");
        }else if (loginRequest.password().isBlank()){
            throw  new BlankException("password Is blank");
        }
    }
}
