package com.zxy.matthiolaincana.exercise.effective.three;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2020/5/20 11:56
 * @Description:
 */
public class CoverEquals {
    /**
     * 重写equals方法需要遵循的约定
     * 1、自反性，x.equals(x) 结果必须返回true
     * 2、对称性，x.equals(y) 与y.equals(x)返回结果一致
     * 3、传递性，z、x、y中zx,xy返回值都为true，那么zy对比也是true
     * 4、一致性，多次调用，只要对象信息未被修改，那么返回结果应该是一只的
     * 5、非null值比较null x.equals(null) 任何情况下都返回false
     */

    /**
     * [重写equals方法]
     *
     * @param o
     * @return boolean
     * @author xiangyong.zeng
     * @date 2020/5/20 11:58
     */
    @Override
    public boolean equals(Object o) {
        return false;
    }

    public int hashCode(Object o) {
        return 1;
    }

    public static void main(String[] args) {
        CoverEquals coverEquals = new CoverEquals();
        System.out.println(coverEquals.equals("s"));

    }
}
