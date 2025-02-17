package grpcClient;
import java.io.*;

import com.kirill.org.Shop.APIResponse;
import com.kirill.org.Shop.OnePLReq;
import com.kirill.org.Shop.OnePLRes;
import com.kirill.org.Shop.OneResponse;
import com.kirill.org.Shop.PLReq;
import com.kirill.org.Shop.PLRes;
import com.kirill.org.Shop.PurchReq;
import com.kirill.org.Shop.PurchRes;
import com.kirill.org.Shop.Request;
import com.kirill.org.shopGrpc;
import com.kirill.org.shopGrpc.shopBlockingStub;



import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {

	public static void main(String[] args) throws IOException {
		for(;;) {
			active();
		}
       
	}
	public static void active() throws IOException {
		ManagedChannel channel = ManagedChannelBuilder
				.forAddress("localhost", 9090)
				.usePlaintext()
				.build();
				
				shopBlockingStub shopStub = shopGrpc.newBlockingStub(channel);
				
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        System.out.println("Enter RequestType: [Get all Items List] - 1, [Get One Item by Id] - 2, [Do an order] - 3,"+
				" [Get Order List] - 4 ,[Get Order Details by order Id] - 5");
		        
		        
		        
		        //String s = br.readLine();
		        int i = Integer.parseInt(br.readLine());
		        switch(i) {
		        case 1:
		        	APIResponse allResponse  = shopStub.getall(null);
		        	System.out.println(allResponse);
		        	break;
		        case 2:
		        	System.out.println("Enter id of item to view details: ");
		        	try {
		                int id = Integer.parseInt(br.readLine());
		                Request oneReq = Request.newBuilder().setId(id).build();
		            	OneResponse responseOne = shopStub.getOne(oneReq);
		            	System.out.println(responseOne);               
		            } catch(NumberFormatException nfe) {
		                System.err.println("Invalid Format!");
		            }     
		        	break;
		        case 3:
		        	System.out.println("Enter id of item to make an order: ");
		        	try {
		                int id = Integer.parseInt(br.readLine());
		                System.out.println("Enter count of item to make an order: ");
		                try {
		                    int count = Integer.parseInt(br.readLine());
		                    PurchReq purchReq = PurchReq.newBuilder().setId(id).setCount(count).build();
		                	PurchRes puchResp = shopStub.purchase(purchReq);
		                	System.out.println(puchResp);              
		                } catch(NumberFormatException nfe) {
		                    System.err.println("Invalid Format!");
		                }
		                                               
		            } catch(NumberFormatException nfe) {
		                System.err.println("Invalid Format!");
		            } 
		        	break;
		        case 4:
		        	System.out.println("To view purchase lists enter admin login: ");
		        	try {
		        		String login = br.readLine();
		                System.out.println("...and admin password: ");
		                try {
		                	String password = br.readLine();
		                	PLReq plReq = PLReq.newBuilder().setLogin(login).setPassword(password).build();
		                	PLRes plRes = shopStub.getPurchList(plReq);
		                	System.out.println(plRes);              
		                } catch(NumberFormatException nfe) {
		                    System.err.println("Invalid Format!");
		                }
		                                               
		            } catch(NumberFormatException nfe) {
		                System.err.println("Invalid Format!");
		            }         	
		        	break;
		        case 5:
		        	System.out.println("Enter purchase id to view details: ");
		        	try {
		                int id = Integer.parseInt(br.readLine());
		                OnePLReq onePlReq = OnePLReq.newBuilder().setOrderId(id).build();
		                OnePLRes responseOne = shopStub.getOnePurch(onePlReq);
		            	System.out.println(responseOne);               
		            } catch(NumberFormatException nfe) {
		                System.err.println("Invalid Format!");
		            }
		        	break;
		        }
	}

}
