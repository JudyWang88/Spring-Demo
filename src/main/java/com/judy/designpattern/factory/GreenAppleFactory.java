package com.judy.designpattern.factory;

/**
 * @Author: judy
 * @Description: 专门制造绿色苹果工厂
 * @Date: Created in 9:37 2019/6/3
 */
public class GreenAppleFactory  implements AppleFactory {
    public Apple CreateFactory() {
        return new GreenApple();
    }
}
