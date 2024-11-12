package com.mycompany.primitivetowrapper;
public class PrimitiveToWrapper {
    public static void main(String[] args) {
        double primitiveDouble = 10.5;
        Double wrapperDouble = Double.valueOf(primitiveDouble);
        
        System.out.println("Wrapper Double: " + wrapperDouble);
    }
}







