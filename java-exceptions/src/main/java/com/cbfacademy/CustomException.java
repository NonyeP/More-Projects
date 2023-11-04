package com.cbfacademy;

public class CustomException extends Exception {
    
  private final String message;
    
        public CustomException(String message){
    
            this.message = message;
        }
    
        @Override
        public String toString() { 
    
            return getMessage();
        }
    
        @Override
        public String getMessage() {
    
            return this.message;
        }
    
    
}
