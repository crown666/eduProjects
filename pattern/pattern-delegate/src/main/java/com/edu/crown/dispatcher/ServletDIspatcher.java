package com.edu.crown.dispatcher;

import com.edu.crown.controllers.Action;
import com.edu.crown.controllers.MemberAction;
import com.edu.crown.controllers.SystemAction;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Crown on 2018/7/15.
 */
public class ServletDIspatcher {
    private List<Handler> handlerList;

    public ServletDIspatcher() {
        handlerList = new ArrayList<Handler>();
        handlerList.add(new Handler(new MemberAction(),"/member"));
        handlerList.add(new Handler(new SystemAction(),"/system"));
    }

    public void doService(String request, String response){
        doDispatch(request, response);
    }

    private void doDispatch(String request,String response){
        //获取
        for (Handler handler:handlerList) {
            if(handler.getUrl().equalsIgnoreCase(request)){
                Action action = (Action) handler.getController();
                action.doget();
            }


        }
    }

}
class Handler{
    private Object controller;

    private String url;

    public Handler(Object controller, String url) {
        this.controller = controller;
        this.url = url;
    }

    public Object getController() {
        return controller;
    }

    public void setController(Object controller) {
        this.controller = controller;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}