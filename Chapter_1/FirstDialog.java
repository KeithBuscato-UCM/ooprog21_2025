import javax.swing.JOptionPane;

class FirstDialog{
   public static void main(String[] args){
      JOptionPane.showMessageDialog(
         null,
         "First Java Dialog",
         "Message",
         JOptionPane.INFORMATION_MESSAGE
      );
   }
}