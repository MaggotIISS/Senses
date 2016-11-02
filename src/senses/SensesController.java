/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package senses;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**

 @author Mark Ferguson
 */
public class SensesController implements Initializable {

  //<editor-fold defaultstate="collapsed" desc="FXVariables">
  @FXML
  private Label STRING;
  @FXML
  private ComboBox<String> cb;
  @FXML
  private Label con;
  @FXML
  private Label l4;
  @FXML
  private Label l4About;
  @FXML
  private Label la;
  @FXML
  private Label laba;
  @FXML
  private Label labb;
  @FXML
  private Label labc;
  @FXML
  private Label labd;
  @FXML
  private Label labe;
  @FXML
  private Label labf;
  @FXML
  private Label labg;
  @FXML
  private Label lb;
  @FXML
  private Label lc;
  @FXML
  private Label ld;
  @FXML
  private ComboBox<String> race;
  @FXML
  private Label a;
  @FXML
  private Label b;
  @FXML
  private Label c;
  @FXML
  private Label l1;
  @FXML
  private Label l2;
  @FXML
  private Label l3;
  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Variables">
  private String[] senses = {"Vision", "Hearing", "Smell", "Touch", "Awareness", "Perception"};
  private String[] races = {"Human", "Vargr", "Aslan", "Droyne", "K`kree", "Hiver"};
  private String CRLF = "\n";
  private ActionEvent ae;
  @FXML
  private TextArea ta;
  private String visionString = "";
  private String hearingString = "";
  private String smellString = "";
  private String touchString = "";
  private String awareString = "";
  private String percepString = "";
  private String[] HearingBenchmark;
  private String[] AwarenessMassBenchmark;
  private String[] AwarenessElectricBenchmark;
  private String[] AwarenessMagneticBenchmark;
  private String[] PerceptionLifeBenchmark;
  private String[] PerceptionThoughtBenchmark;
  //</editor-fold>

  String[] RangeBenchmark;
  String[] VisonBenchmark;

  //<editor-fold defaultstate="collapsed" desc="FXMethods">
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    String[] RangeBenchmark;
    String[] VisonBenchmark;

    RangeBenchmark = new String[]{
      "0	Contact 0m",
      "1	VShort 5m",
      "2	Short 50m",
      "3	Medium 150m",
      "4	Long 500m",
      "5	VLong 1000m",
      "6	Distant 5000m",
      "7	VDistant	50km",
      "8	Orbit 500km",
      "9	FarOrbit	5000km"
    };

    VisonBenchmark = new String[]{
      "0	Contact 0m",
      "R	Reading 0m",
      "T	Touch 0m",
      "1	VShort 5m",
      "2	Short 50m",
      "3	Medium 150m",
      "4	Long 500m",
      "5	VLong 1000m",
      "6	Distant 5km",
      "7	VDistant 50km"
    };

    HearingBenchmark = new String[]{
      "0 Earpiece 0m Contact",
      "R Reading 0m Whisper",
      "T Talking 0m Talking",
      "1 VShort 5m Lecture",
      "2 Short 50m Shout",
      "3 Medium 150m Distress",
      "4 Long 500m Distress!!",
      "5 VLong 1000m Pistol",
      "6 Distant 5km Storm",
      "7 Gunshot 50km Nuke"
    };

    AwarenessMassBenchmark = new String[]{
      "R Coin",
      "T Cards",
      "1 Book",
      "2 Suitcase",
      "3 Human",
      "4 Hvy m/c",
      "5 Buildings",
      "6 Hills",
      "7 Mountains"
    };

    AwarenessElectricBenchmark = new String[]{
      "1 SD Card",
      "2 Mobile",
      "3 Circuit Board",
      "4 Hvy m/c",
      "5 Town",
      "6 Grid",
      "7 Lightning"
    };

    AwarenessMagneticBenchmark = new String[]{
      "1 Coin",
      "2 Pistol",
      "3 Rifle",
      "4 Cooker",
      "5 Vehicle",
      "6 Town",
      "7 Country"
    };

    PerceptionLifeBenchmark = new String[]{
      "1 Flea",
      "2 Butterfly",
      "3 Mouse",
      "4 Dog",
      "5 Bull",
      "6 Elephant",
      "7 Whale"
    };

    PerceptionThoughtBenchmark = new String[]{
      "1 Calm life process",
      "2 Complex life process",
      "3 Simple thought",
      "4 Complex thought",
      "5 Strong emotion",
      "6 Death throes",
      "7 Many Death throes"
    };
    cb.getItems().addAll(senses);
    cb.getSelectionModel().selectFirst();
    race.getItems().addAll(races);
    race.getSelectionModel().selectFirst();
    raceChange(ae);

  }

  @FXML
  private void line1(MouseEvent event) {
    show(laba.getText());
  }

  @FXML
  private void line2(MouseEvent event) {
    show(labb.getText());
  }

  @FXML
  private void line3(MouseEvent event) {
    show(labc.getText());
  }

  @FXML
  private void line4(MouseEvent event) {
    show(labd.getText());
  }

  @FXML
  private void line5(MouseEvent event) {
    show(labe.getText());
  }

  @FXML
  private void line6(MouseEvent event) {
    show(labf.getText());
  }

  @FXML
  private void line7(MouseEvent event) {
    show(labg.getText());
  }

  @FXML
  private void raceChange(ActionEvent event) {
    //<editor-fold defaultstate="collapsed" desc="IFD">
    {
      String s = "";
      boolean DEBUG = true;  // true or false;
      if (DEBUG) { // true or false
        s += "//////////////////////////////////////////////" + CRLF;
        s += "\t" + Thread.currentThread().getStackTrace()[1].getMethodName() + CRLF;
        //s += "" + " = " + "";
        //s += "" + " = " + "";
        System.out.print(s);
      }
    }
    //</editor-fold>
    String s = "00";
    String raced = race.getValue();
    String sense = cb.getValue();
    if (raced != null & sense != null) {
      //Set String
      switch (raced) {
        //<editor-fold defaultstate="collapsed" desc="Human">
        case "Human": {
          visionString = "16-RGB";
          hearingString = "16-9392";
          smellString = "10-2";
          touchString = "6-2";
          awareString = "na";
          percepString = "na";
          switch (sense) {
            case "Vision": {
              s = "16";
              break;
            }
            case "Touch": {
              s = "6";
              break;
            }
            case "Hearing": {
              s = "16";
              break;
            }
            case "Awareness": {
              s = "00";
              break;
            }
            case "Smell": {
              s = "10";
              break;
            }
            case "Perception": {
              s = "00";
              break;
            }
          }

          break;
        }
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="Vargr">
        case "Vargr": {
          visionString = "20-RxB";
          hearingString = "18-9471";
          smellString = "20-4";
          touchString = "14-3";
          awareString = "na";
          percepString = "na";
          switch (sense) {
            case "Vision": {
              s = "0";
              break;
            }
            case "Touch": {
              s = "0";
              break;
            }
            case "Hearing": {
              s = "0";
              break;
            }
            case "Awareness": {
              s = "0";
              break;
            }
            case "Smell": {
              s = "0";
              break;
            }
            case "Perception": {
              s = "0";
              break;
            }
          }
          break;
        }
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="Aslan">
        case "Aslan": {
          visionString = "16-RGB";
          hearingString = "18-8474";
          smellString = "18-3";
          touchString = "12-3";
          awareString = "na";
          percepString = "na";
          switch (sense) {
            case "Vision": {
              s = "0";
              break;
            }
            case "Touch": {
              s = "0";
              break;
            }
            case "Hearing": {
              s = "0";
              break;
            }
            case "Awareness": {
              s = "0";
              break;
            }
            case "Smell": {
              s = "0";
              break;
            }
            case "Perception": {
              s = "0";
              break;
            }
          }
          break;
        }
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="Droyne">
        case "Droyne": {
          visionString = "16-BPS";
          hearingString = "16-0000";
          smellString = "16-0";
          touchString = "16-0";
          awareString = "na";
          percepString = "na";
          switch (sense) {
            case "Vision": {
              s = "0";
              break;
            }
            case "Touch": {
              s = "0";
              break;
            }
            case "Hearing": {
              s = "0";
              break;
            }
            case "Awareness": {
              s = "0";
              break;
            }
            case "Smell": {
              s = "0";
              break;
            }
            case "Perception": {
              s = "0";
              break;
            }
          }
          break;
        }
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="K`kree">
        case "K`kree": {
          visionString = "14-BPS";
          hearingString = "12-8191";
          smellString = "16-4";
          touchString = "8-3";
          awareString = "na";
          percepString = "na";
          switch (sense) {
            case "Vision": {
              s = "0";
              break;
            }
            case "Touch": {
              s = "0";
              break;
            }
            case "Hearing": {
              s = "0";
              break;
            }
            case "Awareness": {
              s = "0";
              break;
            }
            case "Smell": {
              s = "0";
              break;
            }
            case "Perception": {
              s = "0";
              break;
            }
          }
          break;
        }
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="Hiver">
        case "Hiver": {
          visionString = "16-CRG";
          hearingString = "16-9400";
          smellString = "12-2";
          touchString = "24-6";
          awareString = "20-5";
          percepString = "na";
          switch (sense) {
            case "Vision": {
              s = "0";
              break;
            }
            case "Touch": {
              s = "0";
              break;
            }
            case "Hearing": {
              s = "0";
              break;
            }
            case "Awareness": {
              s = "0";
              break;
            }
            case "Smell": {
              s = "0";
              break;
            }
            case "Perception": {
              s = "0";
              break;
            }
          }
          break;
        }
        //</editor-fold>
        }
      con.setText(s);
      c.setText(s);
      senseChange(ae);
    }
  }

  @FXML
  private void senseChange(ActionEvent event) {
    System.out.println("senseChange");
    String r = race.getValue();
    String rr = cb.getValue();
    String s = "";
    String string = "";
    switch (rr) {
      case "Vision": {
        string = visionString;
        s = "16";
        l1.setText("RGB");
        l2.setText("");
        l3.setText("");
        l4.setText("");
        la.setText("RGB");
        lb.setText("");
        lc.setText("");
        ld.setText("");
        break;
      }
      case "Touch": {
        string = touchString;
        s = "6";
        l1.setText("S");
        l2.setText("");
        l3.setText("");
        l4.setText("");
        la.setText("S");
        lb.setText("");
        lc.setText("");
        ld.setText("");
        break;
      }
      case "Hearing": {
        string = hearingString;
        s = "16";
        l1.setText("FSVR");
        l2.setText("");
        l3.setText("");
        l4.setText("");
        la.setText("FSVR");
        lb.setText("");
        lc.setText("");
        ld.setText("");
        break;
      }
      case "Awareness": {
        string = awareString;
        s = "0";
        l1.setText("A");
        l2.setText("");
        l3.setText("");
        l4.setText("");
        la.setText("A");
        lb.setText("");
        lc.setText("");
        ld.setText("");
        break;
      }
      case "Smell": {
        string = smellString;
        s = "10";
        l1.setText("SP");
        l2.setText("");
        l3.setText("");
        l4.setText("");
        la.setText("SP");
        lb.setText("");
        lc.setText("");
        ld.setText("");
        break;
      }
      case "Perception": {
        string = percepString;
        s = "0";
        l1.setText("TP");
        l2.setText("");
        l3.setText("");
        l4.setText("");
        la.setText("TP");
        lb.setText("");
        lc.setText("");
        ld.setText("");
        break;
      }
    }
    con.setText(s);
    a.setText(rr);
    b.setText(rr.substring(0, 1));
    System.out.println("string = " + string);
    STRING.setText(string);
    updateString(string);
  }

  @FXML
  private void showAbout(MouseEvent event) {
    JFrame jf = new JFrame();
    String txt = "ABOUT\n"
      + "\n"
      + "Programmed by Mark Ferguson	(maggot.iiss@sky.com)\n"
      + "\n"
      + "https://github.com/MaggotIISS\n"
      + "\n"
      + "The Traveller game in all forms is owned by Far Future Enterprises. \n"
      + "Copyright 1977 - 20016 Far Future Enterprises. \n"
      + "\n"
      + "Traveller is a registered trademark of Far Future Enterprises. \n"
      + "Far Future permits web sites and fanzines for this game, provided \n"
      + "it contains this notice, that Far Future is notified, and subject \n"
      + "to a withdrawal of permission on 90 days notice. \n"
      + "\n"
      + "The contents of this site are for personal, non-commercial use only. \n"
      + "\n"
      + "Any use of Far Future Enterprises's copyrighted material or \n"
      + "trademarks anywhere on this web site and its files should not \n"
      + "be viewed as a challenge to those copyrights or trademarks. \n"
      + "In addition, any program/articles/file on this site cannot be \n"
      + "republished or distributed without the consent of \n"
      + "the author who contributed it.\n";
    JTextArea jta = new JTextArea(txt, 50, 50);
    JScrollPane jsp = new JScrollPane(jta);
    jf.getContentPane().add(jsp);
    jf.setSize(500, 500);
    jf.setLocation(300, 300);
    jf.setVisible(true);
  }

  //</editor-fold>
  //<editor-fold defaultstate="collapsed" desc="Methods">
  private void updateString(String value) {
    System.out.println("value = " + value);
    try {
      c.setText(value.split("-")[0]);
      l1.setText(value.split("-")[1]);
    } catch (Exception e) {
      System.out.println("e = " + e);
      c.setText("0");
      l1.setText("0");
    }
    switch (cb.getValue()) {
      case "Vision": {
        clearLabs();
        laba.setText("Band 1");
        labb.setText("Band 2");
        labc.setText("Band 3");
        break;
      }
      case "Touch": {
        clearLabs();
        laba.setText("Sensitivity");
        break;
      }
      case "Hearing": {
        clearLabs();
        laba.setText("Frequency");
        labb.setText("Span");
        labc.setText("Voice");
        labd.setText("Range");
        break;
      }
      case "Awareness": {
        clearLabs();
        laba.setText("Acuity");
        break;
      }
      case "Smell": {
        clearLabs();
        laba.setText("Sharpness");
        labb.setText("Primary");
        labc.setText("Overtone");
        labd.setText("Nuance");
        labe.setText("Diff 1/Gender");
        labf.setText("Diff 2/Caste");
        labg.setText("Diff 3/Pheromone");
        break;
      }
      case "Perception": {
        clearLabs();
        laba.setText("Tone");
        labb.setText("PVoice");
        break;
      }
      default: {
        break;
      }
    }
  }

  private void clearLabs() {
    laba.setText("");
    labb.setText("");
    labc.setText("");
    labd.setText("");
    labe.setText("");
    labf.setText("");
    labg.setText("");
  }

  private void show(String text) {
    System.out.println(text);
    String string = "";
    ta.setText("\t" + text + CRLF);
    switch (text) {
      case "Band 1": {
        break;
      }
      case "Band 2": {
        break;
      }
      case "Band 3": {
        break;
      }
      case "Frequency": {
        break;
      }
      case "Span": {
        break;
      }
      case "Voice": {
        break;
      }
      case "Range": {
        break;
      }
      case "Sharpness": {
        break;
      }
      case "Primary": {
        break;
      }
      case "Overtone": {
        break;
      }
      case "Nuance": {
        break;
      }
      case "Gender": {
        break;
      }
      case "Caste": {
        break;
      }
      case "Pheromone": {
        break;
      }
      case "Sensitivity": {
        break;
      }
      case "Acuity": {
        break;
      }
      case "Tone": {
        break;
      }
      case "PVoice": {
        break;
      }
      default: {
        System.out.println(text + "\tOOOOOOOOOOOOOOOOOO");
      }
    }
  }

  //</editor-fold>
}
