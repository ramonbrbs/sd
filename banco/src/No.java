/**
 * Created by ramon on 20/06/2018.
 */
public class No {
    private String ip;
    private int porta;

    public No(String ip, int porta){
        this.ip=ip;
        this.porta = porta;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }
}
