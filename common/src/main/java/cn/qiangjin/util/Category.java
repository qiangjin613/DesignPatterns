package cn.qiangjin.util;

/**
 * @author <a href="mailto:qiangjin613@163.com">qiangjin</a>
 */
public enum Category {

    CREATIONAL("创建型"),
    STRUCTURAL("结构型"),
    BEHAVIORAL("行为型");

    private final String value;

    Category(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
