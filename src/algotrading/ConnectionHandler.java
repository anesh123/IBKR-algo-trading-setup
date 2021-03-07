package algotrading;

import com.ib.controller.ApiController;
import java.util.ArrayList;
import java.util.List;


public class ConnectionHandler implements ApiController.IConnectionHandler{
    @Override
    public void connected(){
        System.out.println("Connected");

    }

    @Override
    public void disconnected(){

    }

    @Override
    public void accountList(List<String> list) {

    }

    @Override
    public void error(Exception e){

    }

    @Override
    public void message(int id, int errorCode, String errorMsg) {
        //Do something with server messages
    }
    @Override
    public void show(String string) {
        //Do something with parameter
    }






}
