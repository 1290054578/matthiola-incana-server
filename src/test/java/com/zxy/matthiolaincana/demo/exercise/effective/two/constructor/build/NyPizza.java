package com.zxy.matthiolaincana.demo.exercise.effective.two.constructor.build;

import java.util.Objects;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2020/5/9 11:11
 * @Description: 构建者模式在类层次平行结构中的应用
 */
public class NyPizza extends Pizza {
    public enum Size {SMALL, MEDIUM, LARGE}

    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }
}
