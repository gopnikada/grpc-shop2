package grpcClient;

import com.kirill.org.Shop.APIResponse;
import com.kirill.org.Shop.Request;
import com.kirill.org.shopGrpc;
import com.kirill.org.shopGrpc.shopBlockingStub;
import com.kirill.org.shopGrpc;


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {

	public static void main(String[] args) {
		ManagedChannel channel = ManagedChannelBuilder
		.forAddress("localhost", 9090)
		.usePlaintext()
		.build();
		
		shopBlockingStub shopStub = shopGrpc.newBlockingStub(channel);
		
		 Request getOneReq = Request
				.newBuilder()
				.setId(15)
				.build();
		
		APIResponse response = shopStub.getOne(getOneReq);
		
		System.out.println(response.getResponsemessage());
	}

}
