package cn.itsource.aigou.util;

/**
 * 公共的工具类
 */
public class AjaxResult {
    private Boolean seccess =true;
    private String msg;


    /**
     * 写一个静态方法   对外提供一个对象
     * @return
     */

    public static AjaxResult getResult(){
        return new AjaxResult();
    }

    public Boolean getSeccess() {
        return seccess;
    }

    public AjaxResult setSeccess(Boolean seccess) {
        this.seccess = seccess;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "seccess=" + seccess +
                ", msg='" + msg + '\'' +
                '}';
    }
}
