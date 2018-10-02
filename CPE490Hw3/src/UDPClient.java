import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClient {
    private DatagramSocket udpSocket;
    private InetAddress serverAddress;
    private int port;
    private Scanner scanner;

    private UDPClient() throws IOException {
        this.serverAddress = InetAddress.getByName("155.246.66.150");
        this.port = 6666;
        udpSocket = new DatagramSocket(this.port);
        scanner = new Scanner(System.in);
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        UDPClient sender = new UDPClient();
        System.out.println("-- Running UDP Client at " + sender.serverAddress + " --");
        sender.start();
    }
    private int start() throws IOException {
        String in;
        String msg;
        while (true) {
            in = scanner.nextLine();

            DatagramPacket p = new DatagramPacket(
                    in.getBytes(), in.getBytes().length, serverAddress, port);

            this.udpSocket.send(p);

            byte[] buf = new byte[256];
            DatagramPacket packet = new DatagramPacket(buf, buf.length);

            // blocks until a packet is received
            udpSocket.receive(packet);
            msg = new String(packet.getData()).trim();

            System.out.println(
                    "Message from " + packet.getAddress().getHostAddress() + ": " + msg);
        }
    }

}