package com.zxy.matthiolaincana.demo.exercise.effective.two.constructor.build;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2020/5/9 10:34
 * @Description: 构建者模式在类层次结构中使用
 */
public class Pizza {

    //配料枚举
    public enum Topping {
        HAM,
        MUSHROOM,
        ONION,
        PEPPER,
        SAUSAGE
    }

    //配料集合
    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        protected abstract T self();
    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }

    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(Topping.SAUSAGE)
                .addTopping(Topping.HAM)
                .addTopping(Topping.ONION).build();

        System.out.println(pizza.toppings);

        Pizza pizza1 = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(Topping.ONION)
                .build();
        System.out.println(pizza1.toppings);
    }
}
