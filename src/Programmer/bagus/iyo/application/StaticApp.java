package Programmer.bagus.iyo.application;

import Programmer.bagus.iyo.data.Application;
import Programmer.bagus.iyo.data.Constant;
import Programmer.bagus.iyo.data.Country;
import Programmer.bagus.iyo.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(Constant.APPLICATION);
        System.out.println(Constant.VERSION);

        System.out.println(MathUtil.sum(1,2,2,2));

        Country.City city = new Country.City();
        city.setName("balam");
        System.out.println(city.getName());

        System.out.println(Application.PROCESSORS);
    }
}
