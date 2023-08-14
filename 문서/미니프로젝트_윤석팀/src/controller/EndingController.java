package controller;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// JFrame을 상속받는 EndingController 클래스
public class EndingController {

	public EndingController(String url) {
	      // 이미지 아이콘 로드
        ImageIcon imageIcon = new ImageIcon(url);

        // 레이블 생성 및 이미지 아이콘 설정
        JLabel imageLabel = new JLabel(imageIcon);

        // 패널 생성 및 선호되는 크기 설정
        JPanel imagePanel = new JPanel();
        imagePanel.setPreferredSize(new Dimension(imageIcon.getIconWidth(), imageIcon.getIconHeight()));

        // 패널에 레이블 추가
        imagePanel.add(imageLabel);

        // 프레임 생성 및 설정
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(imagePanel);
        frame.pack();
        frame.setVisible(true);
        
        frame.toFront();
        frame.requestFocus();

    }
}
