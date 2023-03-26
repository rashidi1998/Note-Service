package com.example.notesservice.exception;

public class CustomErrorModel extends RuntimeException{
   public CustomErrorModel(String message){
       super(message);
   }
}
