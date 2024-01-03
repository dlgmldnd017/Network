import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class clientLauncher {
	public static void main (String []args) {
		int serverPort = 10789; //연결할 local port
		String serverIP = "127.0.0.1"; //server의 IP 주소
		Socket server = null; //server socket
		try {
			server = new Socket(serverIP, serverPort); //server socket에 연결
			if (server != null) { //연결되면 접속 상태 출력.
				System.out.println(server.toString());
				}
			server.close(); //접속 종료.
			} catch (UnknownHostException e) { //접속중 예외 방샐 시 catch
				e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
					} finally { //접속 중 예외 방생시 연결을 종료.
						if (server != null) {
							try {
								server.close();
								} catch (IOException e) {
									e.printStackTrace();
									}
						}
					}
	}
}