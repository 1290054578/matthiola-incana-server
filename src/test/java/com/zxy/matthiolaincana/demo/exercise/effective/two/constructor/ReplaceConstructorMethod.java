package com.zxy.matthiolaincana.demo.exercise.effective.two.constructor;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2020/5/8 15:29
 * @Description: 静态工厂方法替代构造器
 */
public class ReplaceConstructorMethod {

    /**
     * 1、静态工厂方法是指在类中提供一个公有的静态方法，返回类的实例 (设计思路)
     * 2、重叠构造器模式：第一个构造器只有必要参数，第二个构造器有一个可选参数，以此类推，最后一个可选所有的参数。
     * 3、建造者模式：构造器参数较多时考虑使用，可读性强，也能保证重叠构造器模式的安全性
     */


    /**
     * -- 静态工厂方法
     * 父类声明有参构造器后，如果没有实现声明无参构造器，那么子类必须声明有参构造器
     * 父类声明有参构造器，并且同时声明了无参构造器，那么子类无需声明有参构造器
     */
    private String factory_param_one;
    private String factory_param_two;

    ReplaceConstructorMethod() {
        //父类的无参构造器
    }

    ReplaceConstructorMethod(String factory_param_one, String factory_param_two) {
        this.factory_param_two = factory_param_two;
        this.factory_param_one = factory_param_one;
    }

    public static class Subclass extends ReplaceConstructorMethod {
        //没有实际意义的子类，展示静态工厂方法
      /*  Subclass(String factory_param_one, String factory_param_two) {
            super(factory_param_one, factory_param_two);
        }*/
    }

    //返回父类实例
    public static ReplaceConstructorMethod getInstance(String factory_param_one, String factory_param_two) {
        return new ReplaceConstructorMethod(factory_param_one, factory_param_two);
    }

    //返回子类实例
    public static ReplaceConstructorMethod getInstanceSub() {
        return new Subclass();
    }


    /**
     * -- 重叠构造器模式
     */
    public class NutritionFacts {
        private int fat;
        private int high;
        private int age;
        private int length;

        public NutritionFacts(int fat, int high) {
            this.fat = fat;
            this.high = high;
        }

        public NutritionFacts(int fat, int high, int age) {
            this.fat = fat;
            this.high = high;
            this.age = age;
        }

        public NutritionFacts(int fat, int high, int age, int length) {
            this.fat = fat;
            this.high = high;
            this.age = age;
            this.length = length;
        }
    }

    /**
     * builder建造者模式
     */

    public static class NutritionFactsBuilder {
        private final int fat;
        private final int high;
        private final int age;
        private final int length;

        private NutritionFactsBuilder(Builder builder) {
            fat = builder.fat;
            high = builder.high;
            age = builder.age;
            length = builder.length;
        }

        public static class Builder {
            private final int fat;
            //默认值参数
            private int high = 0;
            private int age = 0;
            private int length = 0;

            public Builder(int fat) {
                this.fat = fat;
            }

            public Builder high(int val) {
                high = val;
                return this;
            }

            public Builder age(int val) {
                age = val;
                return this;
            }

            public Builder length(int val) {
                length = val;
                return this;
            }

            public NutritionFactsBuilder build() {
                return new NutritionFactsBuilder(this);
            }
        }

    }

    public static void main(String[] args) {
        NutritionFactsBuilder nutritionFactsBuilder = new NutritionFactsBuilder(
                new NutritionFactsBuilder.Builder(1).age(1).high(2));
        System.out.println(nutritionFactsBuilder.fat + "|||" + nutritionFactsBuilder.age);

        NutritionFactsBuilder nutritionFactsBuilder1 = new NutritionFactsBuilder.Builder(1).age(2).build();
        System.out.println(nutritionFactsBuilder1.fat + "|||" + nutritionFactsBuilder1.age);
    }
}
