package Programmer.bagus.iyo.data;

public interface Car extends HasBrand, IsMaintaince{

    void  drive();

    int getTier();

    default boolean isBig(){
        return false;
    }

}
