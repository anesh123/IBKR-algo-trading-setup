package algotrading;

import com.ib.controller.ApiController;

public class Connection {

    //create instances of logger implementation
    static Logger inLogger = new Logger();
    static Logger outLogger = new Logger();

    //instance of connection
    static ConnectionHandler connection = new ConnectionHandler();

    //instance of API Controller
    static ApiController api_controller = new ApiController(connection, inLogger, outLogger );

    public static void main(String _[]){
        api_controller.connect("localhost", 7497, 0);
    }
}
