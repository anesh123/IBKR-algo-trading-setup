package algotrading;

import com.ib.client.TickAttrib;
import com.ib.controller.ApiController;
import com.ib.client.TickType;
import com.ib.client.Types;

import java.util.ArrayList;

public class DataHandler implements ApiController.ITopMktDataHandler {

    ArrayList<Double> prices = new ArrayList<>();


    @Override
    public void tickPrice(TickType tickType, double price, TickAttrib attribs) {
        if(tickType.equals(TickType.LAST)){
            //add to list
            prices.add(0,price);
            System.out.println("Current Price: "+price);

        }
    }

    @Override
    public void tickSize(TickType tickType,int size) {

        //Do something with the volume response
    }

    @Override
    public void tickString(TickType tickType, String value) {

        //Do something with a specific tick type
    }

    @Override
    public void tickSnapshotEnd() {
        //Do something on the end of the snapshot
    }

    @Override
    public void marketDataType(int marketDataType) {
        //Do something with type of market data
    }

    @Override
    public void tickReqParams(int tickerId, double minTick, String bboExchange, int snapshotPermissions) {
        //Do something with the tick required parameters
    }
}
