package cn.com.git.message;

/**
 * Created by Administrator on 2018/10/18.
 */
public class ResponseMsg {

    private String code;
    private String desc;
    private Object data;

    public ResponseMsg() {
        this.code = "00";
        this.desc = "成功";
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseMsg{" +
                "code='" + code + '\'' +
                ", desc='" + desc + '\'' +
                ", data=" + data +
                '}';
    }
}
