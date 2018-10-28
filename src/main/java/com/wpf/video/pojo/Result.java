package com.wpf.video.pojo;

public class Result {

    private Boolean success;

    private Object object;

    public Result(Boolean success,Object object){
        this.success = success;
        this.object = object;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
