import javax.swing.*;
import java.awt.*;

public class Smileyface implements Runnable{
    JFrame application;
    FaceComponent panel;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Smileyface());
    }

    @Override
    public void run() {
        panel = new FaceComponent();
        application = new JFrame();

//        setting the size of the components
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        setting the position of the smiley face
        panel.setPreferredSize(new Dimension(350,500));
        application.setLocationRelativeTo(null);
        GroupLayout panelLayout = new GroupLayout(panel);
        panel.setLayout(panelLayout);

//setting the horizontal position of the components
        panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 350, Short.MAX_VALUE)
        );

// setting the vertical position of the components

        panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 800, Short.MAX_VALUE));

        GroupLayout layout = new GroupLayout(application.getContentPane());
        application.getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(177, Short.MAX_VALUE)
                                .addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(167, 167, 167))
        );

        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(88,88,88)
                                .addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(100,Short.MAX_VALUE))
        );

        application.pack();
        application.addMouseMotionListener(panel);

        application.setResizable(false);
        application.setTitle("Smiley Face");
        application.setVisible(true);


    }
}
