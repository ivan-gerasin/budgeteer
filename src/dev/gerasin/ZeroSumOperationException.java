package dev.gerasin;

public class ZeroSumOperationException extends Exception{
    ZeroSumOperationException() {
        super("Operation sum can not be equal to zero");
    }
}
