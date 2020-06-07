package feelPaint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class feelPaint extends JFrame {
    public feelPaint(){
        //Настройки окна;
        setSize(new Dimension(600, 600));
        setTitle ( "Malevich" );
        setLocation(700,300);
        setLayout(new GridBagLayout());
        setDefaultCloseOperation (WindowConstants.EXIT_ON_CLOSE);

        //Кнопка генерации;
        JButton btn1 = new JButton("Добавить фигуру");
        GridBagConstraints a = new GridBagConstraints();
        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                //Здесь идёт наложение, нужно поправлять и желательно добавлять рандомно по одной фигуре
                GraphicsPanel graphicsPanel = new GraphicsPanel();

                add(graphicsPanel,
                        new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.NORTH, GridBagConstraints.BOTH,
                                new Insets(1, 1, 1, 1), 0, 0));

                setVisible(true);//метод по отображению окошка;
            }
        });

        btn1.setBackground(Color.green);
        btn1.setForeground(Color.white);
        btn1.setPreferredSize(new Dimension(300,30));

        a.fill = GridBagConstraints.HORIZONTAL;
        a.ipady = 0;       //приводим к значениям по умолчанию;
        a.weighty = 1.0;   //запросить дополнительное вертикальное пространство;
        a.anchor = GridBagConstraints.SOUTH; //низ окна;

        add(btn1,a);

        //Инструменты, которые будут рисовать;
        GraphicsPanel graphicsPanel = new GraphicsPanel();

        add(graphicsPanel,
                new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.NORTH, GridBagConstraints.BOTH,
                        new Insets(1, 1, 1, 1), 0, 0));

        setVisible(true);//метод по отображению окошка;
        }
}

