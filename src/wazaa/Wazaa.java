package wazaa;

public class Wazaa {
    
    private static final Jframe ventana = new Jframe();
    
    public static void start(){
        
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
    
    private static void start2(){
        
        mframe.setLocationRelativeTo(null);
        mframe.setVisible(true);
    }

    static MainFrame mframe = new MainFrame();
    
    public static void main(String[] args) {
    
        start2();
    }
}
