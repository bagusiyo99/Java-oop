package Programmer.bagus.iyo.data;


import Programmer.bagus.iyo.annotion.Fancy;

@Fancy(name = "Car", tags =  {"application", "java"})
public interface Car extends HasBrand, IsMaintaince{

    void  drive();

    int getTier();

    default boolean isBig(){
        return false;
    }

}
