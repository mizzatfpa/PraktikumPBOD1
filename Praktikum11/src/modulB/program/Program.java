package modulB.program;

import javax.swing.SwingUtilities;

public class Program {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GuiMahasiswa().setVisible(true));
    }
}
