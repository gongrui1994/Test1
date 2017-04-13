package test1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import java.awt.Color;

public class sensorSelection {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		JFrame sframe = new JFrame();
		sframe.setBackground(Color.LIGHT_GRAY);
		sframe.setForeground(Color.LIGHT_GRAY);
		JPanel spanel = new JPanel();
		sframe.getContentPane().add(spanel);
		spanel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		spanel.add(panel, BorderLayout.NORTH);
		
		JLabel label = new JLabel("\u9009\u62E9\u6CE2\u957F\u8865\u507F\u4F20\u611F\u5668");
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		spanel.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("\u4E0B\u4E00\u6B65");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//////////////////////////////////////
			}
		});
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u53D6\u6D88");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sframe.dispose();
			}
		});
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		spanel.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("(01,01)");
		panel_2.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("(01,02)");
		panel_2.add(chckbxNewCheckBox_1);
		
		JCheckBox checkBox = new JCheckBox("(01,03)");
		panel_2.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("(01,04)");
		panel_2.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("(01,05)");
		panel_2.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("(01,06)");
		panel_2.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("(01,07)");
		panel_2.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("(01,08)");
		panel_2.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("(01,09)");
		panel_2.add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("(01,10)");
		panel_2.add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox("(01,11)");
		panel_2.add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("(01,12)");
		panel_2.add(checkBox_9);
		
		JCheckBox checkBox_10 = new JCheckBox("(01,13)");
		panel_2.add(checkBox_10);
		
		JCheckBox checkBox_11 = new JCheckBox("(01,14)");
		panel_2.add(checkBox_11);
		
		JCheckBox checkBox_12 = new JCheckBox("(01,15)");
		panel_2.add(checkBox_12);
		
		JCheckBox checkBox_13 = new JCheckBox("(01,16)");
		panel_2.add(checkBox_13);
		
		JCheckBox checkBox_14 = new JCheckBox("(02,01)");
		panel_2.add(checkBox_14);
		
		JCheckBox checkBox_15 = new JCheckBox("(02,02)");
		panel_2.add(checkBox_15);
		
		JCheckBox checkBox_16 = new JCheckBox("(02,03)");
		panel_2.add(checkBox_16);
		
		JCheckBox checkBox_17 = new JCheckBox("(02,04)");
		panel_2.add(checkBox_17);
		
		JCheckBox checkBox_18 = new JCheckBox("(02,05)");
		panel_2.add(checkBox_18);
		
		JCheckBox checkBox_19 = new JCheckBox("(02,06)");
		panel_2.add(checkBox_19);
		
		JCheckBox checkBox_20 = new JCheckBox("(02,07)");
		panel_2.add(checkBox_20);
		
		JCheckBox checkBox_21 = new JCheckBox("(02,08)");
		panel_2.add(checkBox_21);
		
		JCheckBox checkBox_22 = new JCheckBox("(02,09)");
		panel_2.add(checkBox_22);
		
		JCheckBox checkBox_23 = new JCheckBox("(02,10)");
		panel_2.add(checkBox_23);
		
		JCheckBox checkBox_24 = new JCheckBox("(02,11)");
		panel_2.add(checkBox_24);
		
		JCheckBox checkBox_25 = new JCheckBox("(02,12)");
		panel_2.add(checkBox_25);
		
		JCheckBox checkBox_26 = new JCheckBox("(02,13)");
		panel_2.add(checkBox_26);
		
		JCheckBox checkBox_27 = new JCheckBox("(02,14)");
		panel_2.add(checkBox_27);
		
		JCheckBox checkBox_28 = new JCheckBox("(02,15)");
		panel_2.add(checkBox_28);
		
		JCheckBox checkBox_29 = new JCheckBox("(02,16)");
		panel_2.add(checkBox_29);
		
		JCheckBox checkBox_30 = new JCheckBox("(03,01)");
		panel_2.add(checkBox_30);
		
		JCheckBox checkBox_31 = new JCheckBox("(03,02)");
		panel_2.add(checkBox_31);
		
		JCheckBox checkBox_32 = new JCheckBox("(03,03)");
		panel_2.add(checkBox_32);
		
		JCheckBox checkBox_33 = new JCheckBox("(03,04)");
		panel_2.add(checkBox_33);
		
		JCheckBox checkBox_34 = new JCheckBox("(03,05)");
		panel_2.add(checkBox_34);
		
		JCheckBox checkBox_35 = new JCheckBox("(03,06)");
		panel_2.add(checkBox_35);
		
		JCheckBox checkBox_36 = new JCheckBox("(03,07)");
		panel_2.add(checkBox_36);
		
		JCheckBox checkBox_37 = new JCheckBox("(03,08)");
		panel_2.add(checkBox_37);
		
		JCheckBox checkBox_38 = new JCheckBox("(03,09)");
		panel_2.add(checkBox_38);
		
		JCheckBox checkBox_39 = new JCheckBox("(03,10)");
		panel_2.add(checkBox_39);
		
		JCheckBox checkBox_40 = new JCheckBox("(03,11)");
		panel_2.add(checkBox_40);
		
		JCheckBox checkBox_41 = new JCheckBox("(03,12)");
		panel_2.add(checkBox_41);
		
		JCheckBox checkBox_42 = new JCheckBox("(03,13)");
		panel_2.add(checkBox_42);
		
		JCheckBox checkBox_43 = new JCheckBox("(03,14)");
		panel_2.add(checkBox_43);
		
		JCheckBox checkBox_44 = new JCheckBox("(03,15)");
		panel_2.add(checkBox_44);
		
		JCheckBox checkBox_45 = new JCheckBox("(03,16)");
		panel_2.add(checkBox_45);
		
		JCheckBox checkBox_46 = new JCheckBox("(04,01)");
		panel_2.add(checkBox_46);
		
		JCheckBox checkBox_47 = new JCheckBox("(04,02)");
		panel_2.add(checkBox_47);
		
		JCheckBox checkBox_48 = new JCheckBox("(04,03)");
		panel_2.add(checkBox_48);
		
		JCheckBox checkBox_49 = new JCheckBox("(04,04)");
		panel_2.add(checkBox_49);
		
		JCheckBox checkBox_50 = new JCheckBox("(04,05)");
		panel_2.add(checkBox_50);
		
		JCheckBox checkBox_51 = new JCheckBox("(04,06)");
		panel_2.add(checkBox_51);
		
		JCheckBox checkBox_52 = new JCheckBox("(04,07)");
		panel_2.add(checkBox_52);
		
		JCheckBox checkBox_53 = new JCheckBox("(04,08)");
		panel_2.add(checkBox_53);
		
		JCheckBox checkBox_54 = new JCheckBox("(04,09)");
		panel_2.add(checkBox_54);
		
		JCheckBox checkBox_55 = new JCheckBox("(04,10)");
		panel_2.add(checkBox_55);
		
		JCheckBox checkBox_56 = new JCheckBox("(04,11)");
		panel_2.add(checkBox_56);
		
		JCheckBox checkBox_57 = new JCheckBox("(04,12)");
		panel_2.add(checkBox_57);
		
		JCheckBox checkBox_58 = new JCheckBox("(04,13)");
		panel_2.add(checkBox_58);
		
		JCheckBox checkBox_59 = new JCheckBox("(04,14)");
		panel_2.add(checkBox_59);
		
		JCheckBox checkBox_60 = new JCheckBox("(04,15)");
		panel_2.add(checkBox_60);
		
		JCheckBox checkBox_61 = new JCheckBox("(04,16)");
		panel_2.add(checkBox_61);
		
		JCheckBox checkBox_62 = new JCheckBox("(05,01)");
		panel_2.add(checkBox_62);
		
		JCheckBox checkBox_63 = new JCheckBox("(05,02)");
		panel_2.add(checkBox_63);
		
		JCheckBox checkBox_64 = new JCheckBox("(05,03)");
		panel_2.add(checkBox_64);
		
		JCheckBox checkBox_65 = new JCheckBox("(05,04)");
		panel_2.add(checkBox_65);
		
		JCheckBox checkBox_66 = new JCheckBox("(05,05)");
		panel_2.add(checkBox_66);
		
		JCheckBox checkBox_67 = new JCheckBox("(05,06)");
		panel_2.add(checkBox_67);
		
		JCheckBox checkBox_68 = new JCheckBox("(05,07)");
		panel_2.add(checkBox_68);
		
		JCheckBox checkBox_69 = new JCheckBox("(05,08)");
		panel_2.add(checkBox_69);
		
		JCheckBox checkBox_70 = new JCheckBox("(05,09)");
		panel_2.add(checkBox_70);
		
		JCheckBox checkBox_71 = new JCheckBox("(05,10)");
		panel_2.add(checkBox_71);
		
		JCheckBox checkBox_72 = new JCheckBox("(05,11)");
		panel_2.add(checkBox_72);
		
		JCheckBox checkBox_73 = new JCheckBox("(05,12)");
		panel_2.add(checkBox_73);
		
		JCheckBox checkBox_74 = new JCheckBox("(05,13)");
		panel_2.add(checkBox_74);
		
		JCheckBox checkBox_75 = new JCheckBox("(05,14)");
		panel_2.add(checkBox_75);
		
		JCheckBox checkBox_76 = new JCheckBox("(05,15)");
		panel_2.add(checkBox_76);
		
		JCheckBox checkBox_77 = new JCheckBox("(05,16)");
		panel_2.add(checkBox_77);
		
		JCheckBox checkBox_78 = new JCheckBox("(06,01)");
		panel_2.add(checkBox_78);
		
		JCheckBox checkBox_79 = new JCheckBox("(06,02)");
		panel_2.add(checkBox_79);
		
		JCheckBox checkBox_80 = new JCheckBox("(06,03)");
		panel_2.add(checkBox_80);
		
		JCheckBox checkBox_81 = new JCheckBox("(06,04)");
		panel_2.add(checkBox_81);
		
		JCheckBox checkBox_82 = new JCheckBox("(06,05)");
		panel_2.add(checkBox_82);
		
		JCheckBox checkBox_83 = new JCheckBox("(06,06)");
		panel_2.add(checkBox_83);
		
		JCheckBox checkBox_84 = new JCheckBox("(06,07)");
		panel_2.add(checkBox_84);
		
		JCheckBox checkBox_85 = new JCheckBox("(06,08)");
		panel_2.add(checkBox_85);
		
		JCheckBox checkBox_86 = new JCheckBox("(06,09)");
		panel_2.add(checkBox_86);
		
		JCheckBox checkBox_87 = new JCheckBox("(06,10)");
		panel_2.add(checkBox_87);
		
		JCheckBox checkBox_88 = new JCheckBox("(06,11)");
		panel_2.add(checkBox_88);
		
		JCheckBox checkBox_89 = new JCheckBox("(06,12)");
		panel_2.add(checkBox_89);
		
		JCheckBox checkBox_90 = new JCheckBox("(06,13)");
		panel_2.add(checkBox_90);
		
		JCheckBox checkBox_91 = new JCheckBox("(06,14)");
		panel_2.add(checkBox_91);
		
		JCheckBox checkBox_92 = new JCheckBox("(06,15)");
		panel_2.add(checkBox_92);
		
		JCheckBox checkBox_93 = new JCheckBox("(06,16)");
		panel_2.add(checkBox_93);
		
		JCheckBox checkBox_94 = new JCheckBox("(07,01)");
		panel_2.add(checkBox_94);
		
		JCheckBox checkBox_95 = new JCheckBox("(07,02)");
		panel_2.add(checkBox_95);
		
		JCheckBox checkBox_96 = new JCheckBox("(07,03)");
		panel_2.add(checkBox_96);
		
		JCheckBox checkBox_97 = new JCheckBox("(07,04)");
		panel_2.add(checkBox_97);
		
		JCheckBox checkBox_98 = new JCheckBox("(07,05)");
		panel_2.add(checkBox_98);
		
		JCheckBox checkBox_99 = new JCheckBox("(07,06)");
		panel_2.add(checkBox_99);
		
		JCheckBox checkBox_100 = new JCheckBox("(07,07)");
		panel_2.add(checkBox_100);
		
		JCheckBox checkBox_101 = new JCheckBox("(07,08)");
		panel_2.add(checkBox_101);
		
		JCheckBox checkBox_102 = new JCheckBox("(07,09)");
		panel_2.add(checkBox_102);
		
		JCheckBox checkBox_103 = new JCheckBox("(07,10)");
		panel_2.add(checkBox_103);
		
		JCheckBox checkBox_104 = new JCheckBox("(07,11)");
		panel_2.add(checkBox_104);
		
		JCheckBox checkBox_105 = new JCheckBox("(07,12)");
		panel_2.add(checkBox_105);
		
		JCheckBox checkBox_106 = new JCheckBox("(07,13)");
		panel_2.add(checkBox_106);
		
		JCheckBox checkBox_107 = new JCheckBox("(07,14)");
		panel_2.add(checkBox_107);
		
		JCheckBox checkBox_108 = new JCheckBox("(07,15)");
		panel_2.add(checkBox_108);
		
		JCheckBox checkBox_109 = new JCheckBox("(07,16)");
		panel_2.add(checkBox_109);
		
		JCheckBox checkBox_110 = new JCheckBox("(08,01)");
		panel_2.add(checkBox_110);
		
		JCheckBox checkBox_111 = new JCheckBox("(08,02)");
		panel_2.add(checkBox_111);
		
		JCheckBox checkBox_112 = new JCheckBox("(08,03)");
		panel_2.add(checkBox_112);
		
		JCheckBox checkBox_113 = new JCheckBox("(08,04)");
		panel_2.add(checkBox_113);
		
		JCheckBox checkBox_114 = new JCheckBox("(08,05)");
		panel_2.add(checkBox_114);
		
		JCheckBox checkBox_115 = new JCheckBox("(08,06)");
		panel_2.add(checkBox_115);
		
		JCheckBox checkBox_116 = new JCheckBox("(08,07)");
		panel_2.add(checkBox_116);
		
		JCheckBox checkBox_117 = new JCheckBox("(08,08)");
		panel_2.add(checkBox_117);
		
		JCheckBox checkBox_118 = new JCheckBox("(08,09)");
		panel_2.add(checkBox_118);
		
		JCheckBox checkBox_119 = new JCheckBox("(08,10)");
		panel_2.add(checkBox_119);
		
		JCheckBox checkBox_120 = new JCheckBox("(08,11)");
		panel_2.add(checkBox_120);
		
		JCheckBox checkBox_121 = new JCheckBox("(08,12)");
		panel_2.add(checkBox_121);
		
		JCheckBox checkBox_122 = new JCheckBox("(08,13)");
		panel_2.add(checkBox_122);
		
		JCheckBox checkBox_123 = new JCheckBox("(08,14)");
		panel_2.add(checkBox_123);
		
		JCheckBox checkBox_124 = new JCheckBox("(08,15)");
		panel_2.add(checkBox_124);
		
		JCheckBox checkBox_125 = new JCheckBox("(08,16)");
		panel_2.add(checkBox_125);
		
		JCheckBox checkBox_126 = new JCheckBox("(09,01)");
		panel_2.add(checkBox_126);
		
		JCheckBox checkBox_127 = new JCheckBox("(09,02)");
		panel_2.add(checkBox_127);
		
		JCheckBox checkBox_128 = new JCheckBox("(09,03)");
		panel_2.add(checkBox_128);
		
		JCheckBox checkBox_129 = new JCheckBox("(09,04)");
		panel_2.add(checkBox_129);
		
		JCheckBox checkBox_130 = new JCheckBox("(09,05)");
		panel_2.add(checkBox_130);
		
		JCheckBox checkBox_131 = new JCheckBox("(09,06)");
		panel_2.add(checkBox_131);
		
		JCheckBox checkBox_132 = new JCheckBox("(09,07)");
		panel_2.add(checkBox_132);
		
		JCheckBox checkBox_133 = new JCheckBox("(09,08)");
		panel_2.add(checkBox_133);
		
		JCheckBox checkBox_134 = new JCheckBox("(09,09)");
		panel_2.add(checkBox_134);
		
		JCheckBox checkBox_135 = new JCheckBox("(09,10)");
		panel_2.add(checkBox_135);
		
		JCheckBox checkBox_136 = new JCheckBox("(09,11)");
		panel_2.add(checkBox_136);
		
		JCheckBox checkBox_137 = new JCheckBox("(09,12)");
		panel_2.add(checkBox_137);
		
		JCheckBox checkBox_138 = new JCheckBox("(09,13)");
		panel_2.add(checkBox_138);
		
		JCheckBox checkBox_139 = new JCheckBox("(09,14)");
		panel_2.add(checkBox_139);
		
		JCheckBox checkBox_140 = new JCheckBox("(09,15)");
		panel_2.add(checkBox_140);
		
		JCheckBox checkBox_141 = new JCheckBox("(09,16)");
		panel_2.add(checkBox_141);
		
		JCheckBox checkBox_142 = new JCheckBox("(10,01)");
		panel_2.add(checkBox_142);
		
		JCheckBox checkBox_143 = new JCheckBox("(10,02)");
		panel_2.add(checkBox_143);
		
		JCheckBox checkBox_144 = new JCheckBox("(10,03)");
		panel_2.add(checkBox_144);
		
		JCheckBox checkBox_145 = new JCheckBox("(10,04)");
		panel_2.add(checkBox_145);
		
		JCheckBox checkBox_148 = new JCheckBox("(10,05)");
		panel_2.add(checkBox_148);
		
		JCheckBox checkBox_146 = new JCheckBox("(10,06)");
		panel_2.add(checkBox_146);
		
		JCheckBox checkBox_147 = new JCheckBox("(10,07)");
		panel_2.add(checkBox_147);
		
		JCheckBox checkBox_149 = new JCheckBox("(10,08)");
		panel_2.add(checkBox_149);
		
		JCheckBox checkBox_150 = new JCheckBox("(10,09)");
		panel_2.add(checkBox_150);
		
		JCheckBox checkBox_151 = new JCheckBox("(10,10)");
		panel_2.add(checkBox_151);
		
		JCheckBox checkBox_152 = new JCheckBox("(10,11)");
		panel_2.add(checkBox_152);
		
		JCheckBox checkBox_153 = new JCheckBox("(10,12)");
		panel_2.add(checkBox_153);
		
		JCheckBox checkBox_154 = new JCheckBox("(10,13)");
		panel_2.add(checkBox_154);
		
		JCheckBox checkBox_155 = new JCheckBox("(10,14)");
		panel_2.add(checkBox_155);
		
		JCheckBox checkBox_156 = new JCheckBox("(10,15)");
		panel_2.add(checkBox_156);
		
		JCheckBox checkBox_157 = new JCheckBox("(10,16)");
		panel_2.add(checkBox_157);
		
		JCheckBox checkBox_163 = new JCheckBox("(11,01)");
		panel_2.add(checkBox_163);
		
		JCheckBox checkBox_158 = new JCheckBox("(11,02)");
		panel_2.add(checkBox_158);
		
		JCheckBox checkBox_159 = new JCheckBox("(11,03)");
		panel_2.add(checkBox_159);
		
		JCheckBox checkBox_160 = new JCheckBox("(11,04)");
		panel_2.add(checkBox_160);
		
		JCheckBox checkBox_161 = new JCheckBox("(11,05)");
		panel_2.add(checkBox_161);
		
		JCheckBox checkBox_162 = new JCheckBox("(11,06)");
		panel_2.add(checkBox_162);
		
		JCheckBox checkBox_164 = new JCheckBox("(11,07)");
		panel_2.add(checkBox_164);
		
		JCheckBox checkBox_165 = new JCheckBox("(11,08)");
		panel_2.add(checkBox_165);
		
		JCheckBox checkBox_166 = new JCheckBox("(11,09)");
		panel_2.add(checkBox_166);
		
		JCheckBox checkBox_167 = new JCheckBox("(11,10)");
		panel_2.add(checkBox_167);
		
		JCheckBox checkBox_168 = new JCheckBox("(11,11)");
		panel_2.add(checkBox_168);
		
		JCheckBox checkBox_169 = new JCheckBox("(11,12)");
		panel_2.add(checkBox_169);
		
		JCheckBox checkBox_170 = new JCheckBox("(11,13)");
		panel_2.add(checkBox_170);
		
		JCheckBox checkBox_171 = new JCheckBox("(11,14)");
		panel_2.add(checkBox_171);
		
		JCheckBox checkBox_172 = new JCheckBox("(11,15)");
		panel_2.add(checkBox_172);
		
		JCheckBox checkBox_173 = new JCheckBox("(11,16)");
		panel_2.add(checkBox_173);
		
		JCheckBox checkBox_174 = new JCheckBox("(12,01)");
		panel_2.add(checkBox_174);
		
		JCheckBox checkBox_175 = new JCheckBox("(12,02)");
		panel_2.add(checkBox_175);
		
		JCheckBox checkBox_176 = new JCheckBox("(12,03)");
		panel_2.add(checkBox_176);
		
		JCheckBox checkBox_177 = new JCheckBox("(12,04)");
		panel_2.add(checkBox_177);
		
		JCheckBox checkBox_178 = new JCheckBox("(12,05)");
		panel_2.add(checkBox_178);
		
		JCheckBox checkBox_179 = new JCheckBox("(12,06)");
		panel_2.add(checkBox_179);
		
		JCheckBox checkBox_180 = new JCheckBox("(12,07)");
		panel_2.add(checkBox_180);
		
		JCheckBox checkBox_181 = new JCheckBox("(12,08)");
		panel_2.add(checkBox_181);
		
		JCheckBox checkBox_182 = new JCheckBox("(12,09)");
		panel_2.add(checkBox_182);
		
		JCheckBox checkBox_183 = new JCheckBox("(12,10)");
		panel_2.add(checkBox_183);
		
		JCheckBox checkBox_184 = new JCheckBox("(12,11)");
		panel_2.add(checkBox_184);
		
		JCheckBox checkBox_185 = new JCheckBox("(12,12)");
		panel_2.add(checkBox_185);
		
		JCheckBox checkBox_186 = new JCheckBox("(12,13)");
		panel_2.add(checkBox_186);
		
		JCheckBox checkBox_187 = new JCheckBox("(12,14)");
		panel_2.add(checkBox_187);
		
		JCheckBox checkBox_188 = new JCheckBox("(12,15)");
		panel_2.add(checkBox_188);
		
		JCheckBox checkBox_189 = new JCheckBox("(12,16)");
		panel_2.add(checkBox_189);
		
		JCheckBox checkBox_190 = new JCheckBox("(13,01)");
		panel_2.add(checkBox_190);
		
		JCheckBox checkBox_191 = new JCheckBox("(13,02)");
		panel_2.add(checkBox_191);
		
		JCheckBox checkBox_192 = new JCheckBox("(13,03)");
		panel_2.add(checkBox_192);
		
		JCheckBox checkBox_193 = new JCheckBox("(13,04)");
		panel_2.add(checkBox_193);
		
		JCheckBox checkBox_194 = new JCheckBox("(13,05)");
		panel_2.add(checkBox_194);
		
		JCheckBox checkBox_195 = new JCheckBox("(13,06)");
		panel_2.add(checkBox_195);
		
		JCheckBox checkBox_196 = new JCheckBox("(13,07)");
		panel_2.add(checkBox_196);
		
		JCheckBox checkBox_197 = new JCheckBox("(13,08)");
		panel_2.add(checkBox_197);
		
		JCheckBox checkBox_198 = new JCheckBox("(13,09)");
		panel_2.add(checkBox_198);
		
		JCheckBox checkBox_199 = new JCheckBox("(13,10)");
		panel_2.add(checkBox_199);
		
		JCheckBox checkBox_200 = new JCheckBox("(13,11)");
		panel_2.add(checkBox_200);
		
		JCheckBox checkBox_201 = new JCheckBox("(13,12)");
		panel_2.add(checkBox_201);
		
		JCheckBox checkBox_202 = new JCheckBox("(13,13)");
		panel_2.add(checkBox_202);
		
		JCheckBox checkBox_203 = new JCheckBox("(13,14)");
		panel_2.add(checkBox_203);
		
		JCheckBox checkBox_204 = new JCheckBox("(13,15)");
		panel_2.add(checkBox_204);
		
		JCheckBox checkBox_205 = new JCheckBox("(13,16)");
		panel_2.add(checkBox_205);
		
		JCheckBox checkBox_206 = new JCheckBox("(14,01)");
		panel_2.add(checkBox_206);
		
		JCheckBox checkBox_207 = new JCheckBox("(14,02)");
		panel_2.add(checkBox_207);
		
		JCheckBox checkBox_208 = new JCheckBox("(14,03)");
		panel_2.add(checkBox_208);
		
		JCheckBox checkBox_209 = new JCheckBox("(14,04)");
		panel_2.add(checkBox_209);
		
		JCheckBox checkBox_210 = new JCheckBox("(14,05)");
		panel_2.add(checkBox_210);
		
		JCheckBox checkBox_211 = new JCheckBox("(14,06)");
		panel_2.add(checkBox_211);
		
		JCheckBox checkBox_212 = new JCheckBox("(14,07)");
		panel_2.add(checkBox_212);
		
		JCheckBox checkBox_213 = new JCheckBox("(14,08)");
		panel_2.add(checkBox_213);
		
		JCheckBox checkBox_214 = new JCheckBox("(14,09)");
		panel_2.add(checkBox_214);
		
		JCheckBox checkBox_215 = new JCheckBox("(14,10)");
		panel_2.add(checkBox_215);
		
		JCheckBox checkBox_216 = new JCheckBox("(14,11)");
		panel_2.add(checkBox_216);
		
		JCheckBox checkBox_217 = new JCheckBox("(14,12)");
		panel_2.add(checkBox_217);
		
		JCheckBox checkBox_218 = new JCheckBox("(14,13)");
		panel_2.add(checkBox_218);
		
		JCheckBox checkBox_219 = new JCheckBox("(14,14)");
		panel_2.add(checkBox_219);
		
		JCheckBox checkBox_220 = new JCheckBox("(14,15)");
		panel_2.add(checkBox_220);
		
		JCheckBox checkBox_223 = new JCheckBox("(14,16)");
		panel_2.add(checkBox_223);
		
		JCheckBox checkBox_221 = new JCheckBox("(15,01)");
		panel_2.add(checkBox_221);
		
		JCheckBox checkBox_222 = new JCheckBox("(15,02)");
		panel_2.add(checkBox_222);
		
		JCheckBox checkBox_224 = new JCheckBox("(15,03)");
		panel_2.add(checkBox_224);
		
		JCheckBox checkBox_225 = new JCheckBox("(15,04)");
		panel_2.add(checkBox_225);
		
		JCheckBox checkBox_226 = new JCheckBox("(15,05)");
		panel_2.add(checkBox_226);
		
		JCheckBox checkBox_227 = new JCheckBox("(15,06)");
		panel_2.add(checkBox_227);
		
		JCheckBox checkBox_228 = new JCheckBox("(15,07)");
		panel_2.add(checkBox_228);
		
		JCheckBox checkBox_229 = new JCheckBox("(15,08)");
		panel_2.add(checkBox_229);
		
		JCheckBox checkBox_230 = new JCheckBox("(15,09)");
		panel_2.add(checkBox_230);
		
		JCheckBox checkBox_231 = new JCheckBox("(15,10)");
		panel_2.add(checkBox_231);
		
		JCheckBox checkBox_232 = new JCheckBox("(15,11)");
		panel_2.add(checkBox_232);
		
		JCheckBox checkBox_233 = new JCheckBox("(15,12)");
		panel_2.add(checkBox_233);
		
		JCheckBox checkBox_234 = new JCheckBox("(15,13)");
		panel_2.add(checkBox_234);
		
		JCheckBox checkBox_235 = new JCheckBox("(15,14)");
		panel_2.add(checkBox_235);
		
		JCheckBox checkBox_236 = new JCheckBox("(15,15)");
		panel_2.add(checkBox_236);
		
		JCheckBox checkBox_237 = new JCheckBox("(15,16)");
		panel_2.add(checkBox_237);
		
		JCheckBox checkBox_238 = new JCheckBox("(16,01)");
		panel_2.add(checkBox_238);
		
		JCheckBox checkBox_239 = new JCheckBox("(16,02)");
		panel_2.add(checkBox_239);
		
		JCheckBox checkBox_240 = new JCheckBox("(16,03)");
		panel_2.add(checkBox_240);
		
		JCheckBox checkBox_241 = new JCheckBox("(16,04)");
		panel_2.add(checkBox_241);
		
		JCheckBox checkBox_242 = new JCheckBox("(16,05)");
		panel_2.add(checkBox_242);
		
		JCheckBox checkBox_243 = new JCheckBox("(16,06)");
		panel_2.add(checkBox_243);
		
		JCheckBox checkBox_244 = new JCheckBox("(16,07)");
		panel_2.add(checkBox_244);
		
		JCheckBox checkBox_245 = new JCheckBox("(16,08)");
		panel_2.add(checkBox_245);
		
		JCheckBox checkBox_246 = new JCheckBox("(16,09)");
		panel_2.add(checkBox_246);
		
		JCheckBox checkBox_247 = new JCheckBox("(16,10)");
		panel_2.add(checkBox_247);
		
		JCheckBox checkBox_248 = new JCheckBox("(16,11)");
		panel_2.add(checkBox_248);
		
		JCheckBox checkBox_249 = new JCheckBox("(16,12)");
		panel_2.add(checkBox_249);
		
		JCheckBox checkBox_250 = new JCheckBox("(16,13)");
		panel_2.add(checkBox_250);
		
		JCheckBox checkBox_251 = new JCheckBox("(16,14)");
		panel_2.add(checkBox_251);
		
		JCheckBox checkBox_252 = new JCheckBox("(16,15)");
		panel_2.add(checkBox_252);
		
		JCheckBox checkBox_253 = new JCheckBox("(16,16)");
		panel_2.add(checkBox_253);
		sframe.setSize(1150, 618);
		sframe.setLocationRelativeTo(null);
		sframe.setVisible(true);
	}

}
