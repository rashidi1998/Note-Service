package com.example.notesservice.exception;

public class CustomErrorModel extends Exception{
   public CustomErrorModel(String message){
       super(message);
   }
}
