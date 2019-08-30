package com.wjh.springlearn.domain;

/**
 * @author wjh
 * @date 2019/8/29 22:33
 */
public class StarterExample {

    private String prefix;
    private String suffix;

    public StarterExample() {
    }

    public StarterExample(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }

    public String adapter(String string) {
        return "prefix = " + prefix + ", string = " + string + ", suffix = " + suffix;
    }
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    @Override
    public String toString() {
        return "StarterExample{" +
                "prefix='" + prefix + '\'' +
                ", suffix='" + suffix + '\'' +
                '}';
    }
}
